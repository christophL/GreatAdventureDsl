/*
 * generated by Xtext
 */
package at.ac.uibk.greatAdventure.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.uibk.greatAdventure.greatAdventure.StartDefinition
import at.ac.uibk.greatAdventure.greatAdventure.Adventure
import at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class GreatAdventureGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		//fsa.generateFile('adventure.js', (resource.contents.get(0) as Adventure).contents)
	}
	
	/*
	def dispatch CharSequence getContents(Adventure adventure) '''
		var adventureName = "«adventure.title.name»";
		«adventure.startDef.contents»
		
		var scene = {
			«FOR scdef : adventure.sceneDef»
				«scdef.contents»«IF scdef.name!=adventure.sceneDef.last.name»,«ENDIF»
			«ENDFOR»
		}
	'''
	
	def dispatch CharSequence getContents(StartDefinition s)'''
		var startSceneId = "«s.startLoc.name»";
		var initialInventory = [«FOR i : s.startItems»"«i.name»"«IF i.name!=s.startItems.last.name», «ENDIF»«ENDFOR»];
	'''
	
	
	def dispatch CharSequence getContents(SceneDefinition s)'''
		"«s.name»":{
			image: "«s.img»",
			items: [«FOR i : s.items»"«i.name»"«IF i.name!=s.items.last.name», «ENDIF»«ENDFOR»],
		}
	'''
	*/
	
}
