/*
 * generated by Xtext
 */
package at.ac.uibk.greatAdventure.generator

import at.ac.uibk.greatAdventure.greatAdventure.Adventure
import at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition
import at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition
import at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition
import at.ac.uibk.greatAdventure.greatAdventure.StartDefinition
import at.ac.uibk.greatAdventure.greatAdventure.UseDefinition
import java.util.Random
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class GreatAdventureGenerator implements IGenerator {
	private EList<ItemPositionDefinition> positions;
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile('adventure.js', (resource.contents.get(0) as Adventure).contents)
	}
	
	def dispatch CharSequence getContents(Adventure adventure) '''
		var adventureName = "«adventure.title.name»";
		«adventure.startDef.contents»
		
		var scene = {
			«var isfirst = true»
			«FOR scdef : adventure.sceneDef»
				«IF !isfirst», «ENDIF»«scdef.contents»«isfirst=false»
			«ENDFOR»
		}
		
		var item = {
			«isfirst = true»
			«FOR idef : adventure.itemDef»
				«IF !isfirst», «ENDIF»«idef.contents»«isfirst=false»
			«ENDFOR»
		}
	'''
	
	def dispatch CharSequence getContents(StartDefinition s)'''
		var startSceneId = "«s.startLoc.name»";
		var initialInventory = «s.startItems.nameArray»;
	'''
	
	def dispatch CharSequence getContents(SceneDefinition s)'''
		«positions = s.items»
		"«s.name»":{
			image: "«s.img»",
			«var isfirst = true»
			items: [«FOR i : positions»«IF !isfirst», «ENDIF»"«i.item.name»"«isfirst=false»«ENDFOR»],
		}
	'''
	
	def dispatch CharSequence getContents(ItemDefinition idef)'''
		"«idef.name»":{
			image: "«idef.img»",
			canPickUp: «idef.pickup»,
			«idef.pos»
			«IF !idef.uses.empty»actions: {
				«FOR udef : idef.uses»«udef.contents»,
				«ENDFOR»
			}
			«ENDIF»
		}
	'''
	
	def dispatch CharSequence getContents(UseDefinition udef)'''
		"«udef.name»": { «udef.useString» }
	'''
	
	def String getPos(ItemDefinition idef){
		val pos = positions.findFirst[item.name == idef.name];
		val returnString = new StringBuilder;
		val rand = new Random;
		if(pos != null){
			returnString.append("posx: ").append(pos.xpos).append(",\n");
			returnString.append("posy: ").append(pos.ypos).append(",\n");
		} else { //no position specified for this item
			returnString.append("posx: ").append(rand.nextInt(750)).append(",\n");
			returnString.append("posy: ").append(rand.nextInt(450)).append(",\n");
		}
		return returnString.toString;
	}
	
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
			returnString.append("remove: ").append(udef.dels.nameArray);
			isfirst = false;
		}	
		if(udef.adds!=null && !udef.adds.empty){
			if(!isfirst){
				returnString.append(", ");
			}
			returnString.append("add: ").append(udef.adds.nameArray);
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
	
	def String getNameArray(EList<ItemDefinition> l){
		val builder = new StringBuilder;
		var isfirst = true;
		builder.append("[\"");
		for(idef : l){
			if(!isfirst){
				builder.append(", ");
				isfirst = false;
			}
			builder.append("\"").append(idef.name).append("\"");
		}
		builder.append("]\"");
		return builder.toString;
	}
}
