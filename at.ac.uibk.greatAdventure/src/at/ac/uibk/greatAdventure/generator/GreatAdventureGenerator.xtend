package at.ac.uibk.greatAdventure.generator

import at.ac.uibk.greatAdventure.greatAdventure.Adventure
import at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition
import at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition
import at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition
import at.ac.uibk.greatAdventure.greatAdventure.StartDefinition
import at.ac.uibk.greatAdventure.greatAdventure.TalkDefinition
import at.ac.uibk.greatAdventure.greatAdventure.TalkDefinitionMinus
import at.ac.uibk.greatAdventure.greatAdventure.UseDefinition
import java.util.ArrayList
import java.util.List
import java.util.Random
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates JavaScript code from a *.ga file.
 * The generated code can then be used within our "adventure-runtime"
 */
class GreatAdventureGenerator implements IGenerator {
	val List<ItemPositionDefinition> positions = new ArrayList<ItemPositionDefinition>;
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile('adventure.js', (resource.contents.get(0) as Adventure).contents)
	}
	
	/**
	 * Generates the structure of the adventure.
	 * To generate the data, the getContent methods of the main components are called.
	 * Note that the SEPARATOR keyword within the FOR loops helps to generate a comma separated list
	 */
	def dispatch CharSequence getContents(Adventure adventure) '''
		var adventureName = "«adventure.title.name»";
		«adventure.startDef.contents»
		
		var scene = {
			«FOR scdef : adventure.sceneDef SEPARATOR ","»
				«scdef.contents»
			«ENDFOR»
		};
		
		var item = {
			«FOR idef : adventure.itemDef SEPARATOR ","»
				«idef.contents»
			«ENDFOR»
		};
	'''
	
	/**
	 * Generates the start definition, which defines the initial scene that is
	 * displayed, as well as the initial inventory 
	 */
	def dispatch CharSequence getContents(StartDefinition s)'''
		var startSceneId = "«s.startLoc.name»";
		var initialInventory = [«FOR i : s.startItems SEPARATOR ", "»"«i.name»"«ENDFOR»];
	'''
	
	/**
	 * Generates the code for a scene definition.
	 * A scene has a background image and some items in it.
	 * In our DSL, the position of an item is defined in this scene definition.
	 * (e.g " - a cup at (100,200)). However, the adventure runtime expects the position
	 * of an item to be defined within the item's definition. Because of that, we used
	 * a separate list to store all positions at this point.
	 */
	def dispatch CharSequence getContents(SceneDefinition s){
		positions.addAll(s.items)'''
		"«s.name»": {
			image: "«s.img»",
			items: [«FOR i : s.items SEPARATOR ", "»"«i.item.name»"«ENDFOR»],
		}
	'''}
	
	/**
	 * Generates the definition of an item.
	 */
	def dispatch CharSequence getContents(ItemDefinition idef)'''
	"«idef.name»": {
		image: "«idef.img»",
		canPickUp: «idef.pickup»,
		«idef.pos»«IF !idef.uses.empty»,
		actions: { 
			«FOR udef : idef.uses SEPARATOR ","»
			«udef.contents»
			«ENDFOR»
		}«ENDIF»«IF idef.dialog!=null»,
		dialog: {
			«idef.dialog.talk.contents»
		}«ENDIF»
	}
	'''
	
	/**
	 * Generates the definition of the uses of an item 
	 * (i.e. requirements to use the item, a message that is displayed when the item is used,...) 
	 */
	def dispatch CharSequence getContents(UseDefinition udef)'''
		"«udef.name»": { «udef.useString» }
	'''
	
	/**
	 * uses the list that was filled in the scene definition to determine the position of an item
	 * if no position is specified, the item is placed at a random position
	 */
	def String getPos(ItemDefinition idef){
		val pos = positions.findFirst[item.name == idef.name];
		val returnString = new StringBuilder;
		val rand = new Random;
		if(pos != null){
			returnString.append("posx: ").append(pos.xpos).append(",\n");
			returnString.append("posy: ").append(pos.ypos);
		} else { //no position specified for this item
			returnString.append("posx: ").append(rand.nextInt(750)).append(",\n");
			returnString.append("posy: ").append(rand.nextInt(450));
		}
		return returnString.toString;
	}
	
	/**
	 * generates the code for a dialog.
	 * Like in the grammar definition, we use two methods that alternate between each
	 * other to generate arbitrarily nested dialogs.
	 * Even though TalkDefinition and TalkDefinitionMinus contain the same members, a 
	 * cast between these classes is not possible. Because of that, two methods are needed here.
	 */
	def dispatch CharSequence getContents(TalkDefinition tdef)'''
		say: "«tdef.say»",
		«IF !tdef.dels.empty»remove: [«FOR i : tdef.dels SEPARATOR ", "»"«i.name»"«ENDFOR»],«ENDIF»
		«IF !tdef.adds.empty»add: [«FOR i : tdef.adds SEPARATOR ", "»"«i.name»"«ENDFOR»],«ENDIF»
		«IF tdef.followScene!=null» scene: "«tdef.followScene.name»",«ENDIF»
		«IF !tdef.answers.empty»answers: {
			«FOR a : tdef.answers SEPARATOR ","»"«a.answer»": {
				«a.talk.contents»
			}«ENDFOR»
		},«ENDIF»
		reset: «tdef.reset»
	'''
	
	/**
	 * generates the code for a dialog. (same as previous method)
	 */
		def dispatch CharSequence getContents(TalkDefinitionMinus tdef)'''
		say: "«tdef.say»",
		«IF !tdef.dels.empty»remove: [«FOR i : tdef.dels SEPARATOR ", "»"«i.name»"«ENDFOR»],«ENDIF»
		«IF !tdef.adds.empty»add: [«FOR i : tdef.adds SEPARATOR ", "»"«i.name»"«ENDFOR»],«ENDIF»
		«IF tdef.followScene!=null» scene: "«tdef.followScene.name»",«ENDIF»
		«IF !tdef.answers.empty»answers: {
			«FOR a : tdef.answers SEPARATOR ","»"«a.answer»": {
				«a.talk.contents»
			}«ENDFOR»
		},«ENDIF»
		reset: «tdef.reset»
	'''
	
	/**
	 * this method prints a comma separated list of all parameters of the use definition.
	 * None of the accepted parameters is mandatory for the use definition.
	 * Because of that, I need some kind of "state" to know when to add commas between
	 * definitions.
	 * @param udef
	 * 		- the usedefinition to print 
	 * @return
	 * 		- the comma separated list of all parameters
	 */
	def String getUseString(UseDefinition udef){
		var isfirst = true;
		val returnString = new StringBuilder;
		if(udef.reqs!=null){
			if(!isfirst){
				returnString.append(", ");
			}
			returnString.append("requires: \"").append(udef.reqs.name).append("\"");
			isfirst = false;
		}
		if(udef.followScene!=null){
			if(!isfirst){
				returnString.append(", ");
			}
			returnString.append("scene: \"").append(udef.followScene.name).append("\"");
			isfirst = false;
		}
		if(udef.dels!=null && !udef.dels.empty){
			if(!isfirst){
				returnString.append(", ");
			}
			returnString.append("remove: ").append('''[«FOR i : udef.dels SEPARATOR ", "»"«i.name»"«ENDFOR»]''');
			isfirst = false;
		}	
		if(udef.adds!=null && !udef.adds.empty){
			if(!isfirst){
				returnString.append(", ");
			}
			returnString.append("add: ").append('''[«FOR i : udef.adds SEPARATOR ", "»"«i.name»"«ENDFOR»]''');
			isfirst = false;
		}
		if(udef.text!=null && !udef.text.empty){
			if(!isfirst){
				returnString.append(", ");
			}
			returnString.append("message: \"").append(udef.text).append("\"");
			isfirst = false;
		}
		if(udef.altText!=null && !udef.altText.empty){
			if(!isfirst){
				returnString.append(", ");
			}
			returnString.append("alt_message: \"").append(udef.altText).append("\"");
			isfirst = false;
		}
		
		return returnString.toString;
	}
}
