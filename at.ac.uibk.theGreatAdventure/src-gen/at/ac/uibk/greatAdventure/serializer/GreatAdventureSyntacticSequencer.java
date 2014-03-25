package at.ac.uibk.greatAdventure.serializer;

import at.ac.uibk.greatAdventure.services.GreatAdventureGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class GreatAdventureSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GreatAdventureGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ItemDefinition_AKeyword_0_0_or_AnKeyword_0_1;
	protected AbstractElementAlias match_UseDefinition_WithKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GreatAdventureGrammarAccess) access;
		match_ItemDefinition_AKeyword_0_0_or_AnKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getItemDefinitionAccess().getAKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getItemDefinitionAccess().getAnKeyword_0_1()));
		match_UseDefinition_WithKeyword_2_q = new TokenAlias(false, true, grammarAccess.getUseDefinitionAccess().getWithKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ItemDefinition_AKeyword_0_0_or_AnKeyword_0_1.equals(syntax))
				emit_ItemDefinition_AKeyword_0_0_or_AnKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UseDefinition_WithKeyword_2_q.equals(syntax))
				emit_UseDefinition_WithKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'A' | 'An'
	 */
	protected void emit_ItemDefinition_AKeyword_0_0_or_AnKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'with'?
	 */
	protected void emit_UseDefinition_WithKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
