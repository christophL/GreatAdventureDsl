/*
* generated by Xtext
*/
package at.ac.uibk.greatAdventure.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import at.ac.uibk.greatAdventure.services.GreatAdventureGrammarAccess;

public class GreatAdventureParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private GreatAdventureGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected at.ac.uibk.greatAdventure.parser.antlr.internal.InternalGreatAdventureParser createParser(XtextTokenStream stream) {
		return new at.ac.uibk.greatAdventure.parser.antlr.internal.InternalGreatAdventureParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Adventure";
	}
	
	public GreatAdventureGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GreatAdventureGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}