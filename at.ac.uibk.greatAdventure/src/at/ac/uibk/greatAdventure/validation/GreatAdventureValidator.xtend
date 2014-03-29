package at.ac.uibk.greatAdventure.validation

import at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage
import at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition
import at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition
import at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition
import org.eclipse.xtext.validation.Check

/**
 * Used to make sure, that the user can't input invalid information, that can't be
 * displayed by the adventure runtime
 */
class GreatAdventureValidator extends AbstractGreatAdventureValidator {
	val imgTypes = #{".jpg", ".jpeg", ".png", ".gif"}
	
	@Check
	def checkItemPositionWithinBounds(ItemPositionDefinition pdef){
		if(pdef.xpos > 750){
			error("Item can't be placed outside of scene boundaries (i.e x < 750)", 
				GreatAdventurePackage.Literals.ITEM_POSITION_DEFINITION__XPOS)
		}
		if(pdef.ypos > 450){
			error("Item can't be placed outside of scene boundaries (i.e y < 450)", 
				GreatAdventurePackage.Literals.ITEM_POSITION_DEFINITION__YPOS)
		}
	}
	
	@Check
	def checkSceneImageFileTypeValid(SceneDefinition sdef){
		if(!isValidImageType(sdef.img)){
			error("Invalid image type: allowed are .jpg, .jpeg, .png and .gif",
				GreatAdventurePackage.Literals.SCENE_DEFINITION__IMG)
		}
	}
	
	@Check
	def checkItemImageFileTypeValid(ItemDefinition idef){
		if(!isValidImageType(idef.img)){
			error("Invalid image type: allowed are .jpg, .jpeg, .png and .gif",
				GreatAdventurePackage.Literals.ITEM_DEFINITION__IMG)
		}		
	}
	
	def boolean isValidImageType(String imgStr){
		if(imgTypes.forall[!imgStr.endsWith(it)]){
			return false;
		}
		return true;
	}
}
