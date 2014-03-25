package at.ac.uibk.greatAdventure.serializer;

import at.ac.uibk.greatAdventure.greatAdventure.Adventure;
import at.ac.uibk.greatAdventure.greatAdventure.AdventureTitle;
import at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage;
import at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.ItemPositionDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.StartDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.UseDefinition;
import at.ac.uibk.greatAdventure.services.GreatAdventureGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GreatAdventureSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GreatAdventureGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GreatAdventurePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GreatAdventurePackage.ADVENTURE:
				if(context == grammarAccess.getAdventureRule()) {
					sequence_Adventure(context, (Adventure) semanticObject); 
					return; 
				}
				else break;
			case GreatAdventurePackage.ADVENTURE_TITLE:
				if(context == grammarAccess.getAdventureTitleRule()) {
					sequence_AdventureTitle(context, (AdventureTitle) semanticObject); 
					return; 
				}
				else break;
			case GreatAdventurePackage.ITEM_DEFINITION:
				if(context == grammarAccess.getItemDefinitionRule()) {
					sequence_ItemDefinition(context, (ItemDefinition) semanticObject); 
					return; 
				}
				else break;
			case GreatAdventurePackage.ITEM_POSITION_DEFINITION:
				if(context == grammarAccess.getItemPositionDefinitionRule()) {
					sequence_ItemPositionDefinition(context, (ItemPositionDefinition) semanticObject); 
					return; 
				}
				else break;
			case GreatAdventurePackage.SCENE_DEFINITION:
				if(context == grammarAccess.getSceneDefinitionRule()) {
					sequence_SceneDefinition(context, (SceneDefinition) semanticObject); 
					return; 
				}
				else break;
			case GreatAdventurePackage.START_DEFINITION:
				if(context == grammarAccess.getStartDefinitionRule()) {
					sequence_StartDefinition(context, (StartDefinition) semanticObject); 
					return; 
				}
				else break;
			case GreatAdventurePackage.USE_DEFINITION:
				if(context == grammarAccess.getUseDefinitionRule()) {
					sequence_UseDefinition(context, (UseDefinition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_AdventureTitle(EObject context, AdventureTitle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GreatAdventurePackage.Literals.ADVENTURE_TITLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreatAdventurePackage.Literals.ADVENTURE_TITLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdventureTitleAccess().getNameSTRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=AdventureTitle 
	 *         (itemDef+=ItemDefinition+ sceneDef+=SceneDefinition+)* 
	 *         startDef=StartDefinition 
	 *         (itemDef+=ItemDefinition+ sceneDef+=SceneDefinition+)*
	 *     )
	 */
	protected void sequence_Adventure(EObject context, Adventure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING pickup?='- can be picked up'? img=STRING uses+=UseDefinition*)
	 */
	protected void sequence_ItemDefinition(EObject context, ItemDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (item=[ItemDefinition|ID] (xpos=INT ypos=INT)?)
	 */
	protected void sequence_ItemPositionDefinition(EObject context, ItemPositionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING img=STRING items+=ItemPositionDefinition*)
	 */
	protected void sequence_SceneDefinition(EObject context, SceneDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (startLoc=[SceneDefinition|ID] (startItems+=[ItemDefinition|ID] startItems+=[ItemDefinition|ID]*)?)
	 */
	protected void sequence_StartDefinition(EObject context, StartDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name+=STRING 
	 *         (reqs+=[ItemDefinition|ID] altText+=STRING?)? 
	 *         (adds+=[ItemDefinition|ID] adds+=[ItemDefinition|ID]*)? 
	 *         (dels+=[ItemDefinition|ID] dels+=[ItemDefinition|ID]*)? 
	 *         text+=STRING? 
	 *         followScene=[SceneDefinition|ID]?
	 *     )
	 */
	protected void sequence_UseDefinition(EObject context, UseDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
