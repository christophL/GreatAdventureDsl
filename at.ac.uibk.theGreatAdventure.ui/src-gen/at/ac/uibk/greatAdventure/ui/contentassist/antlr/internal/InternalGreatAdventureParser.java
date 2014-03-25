package at.ac.uibk.greatAdventure.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.ac.uibk.greatAdventure.services.GreatAdventureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGreatAdventureParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'A'", "'An'", "'.'", "':'", "'- looks like'", "'- you can'", "'with'", "'it, which:'", "'+ requires'", "'or says'", "'+ adds'", "','", "'+ removes'", "'+ says'", "'+ takes you to the'", "'The'", "'looks like'", "'and in it are:'", "'- a'", "'at'", "'('", "')'", "'In the beginning you:'", "'- are at the'", "'- have'", "'- can be picked up'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalGreatAdventureParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGreatAdventureParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGreatAdventureParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g"; }


     
     	private GreatAdventureGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GreatAdventureGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleAdventure"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:60:1: entryRuleAdventure : ruleAdventure EOF ;
    public final void entryRuleAdventure() throws RecognitionException {
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:61:1: ( ruleAdventure EOF )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:62:1: ruleAdventure EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureRule()); 
            }
            pushFollow(FOLLOW_ruleAdventure_in_entryRuleAdventure61);
            ruleAdventure();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdventure68); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdventure"


    // $ANTLR start "ruleAdventure"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:69:1: ruleAdventure : ( ( rule__Adventure__Group__0 ) ) ;
    public final void ruleAdventure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:73:2: ( ( ( rule__Adventure__Group__0 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:74:1: ( ( rule__Adventure__Group__0 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:74:1: ( ( rule__Adventure__Group__0 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:75:1: ( rule__Adventure__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getGroup()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:76:1: ( rule__Adventure__Group__0 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:76:2: rule__Adventure__Group__0
            {
            pushFollow(FOLLOW_rule__Adventure__Group__0_in_ruleAdventure94);
            rule__Adventure__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdventure"


    // $ANTLR start "entryRuleAdventureTitle"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:88:1: entryRuleAdventureTitle : ruleAdventureTitle EOF ;
    public final void entryRuleAdventureTitle() throws RecognitionException {
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:89:1: ( ruleAdventureTitle EOF )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:90:1: ruleAdventureTitle EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureTitleRule()); 
            }
            pushFollow(FOLLOW_ruleAdventureTitle_in_entryRuleAdventureTitle121);
            ruleAdventureTitle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureTitleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdventureTitle128); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdventureTitle"


    // $ANTLR start "ruleAdventureTitle"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:97:1: ruleAdventureTitle : ( ( rule__AdventureTitle__NameAssignment ) ) ;
    public final void ruleAdventureTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:101:2: ( ( ( rule__AdventureTitle__NameAssignment ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:102:1: ( ( rule__AdventureTitle__NameAssignment ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:102:1: ( ( rule__AdventureTitle__NameAssignment ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:103:1: ( rule__AdventureTitle__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureTitleAccess().getNameAssignment()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:104:1: ( rule__AdventureTitle__NameAssignment )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:104:2: rule__AdventureTitle__NameAssignment
            {
            pushFollow(FOLLOW_rule__AdventureTitle__NameAssignment_in_ruleAdventureTitle154);
            rule__AdventureTitle__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureTitleAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdventureTitle"


    // $ANTLR start "entryRuleItemDefinition"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:116:1: entryRuleItemDefinition : ruleItemDefinition EOF ;
    public final void entryRuleItemDefinition() throws RecognitionException {
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:117:1: ( ruleItemDefinition EOF )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:118:1: ruleItemDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleItemDefinition_in_entryRuleItemDefinition181);
            ruleItemDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemDefinition188); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemDefinition"


    // $ANTLR start "ruleItemDefinition"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:125:1: ruleItemDefinition : ( ( rule__ItemDefinition__Group__0 ) ) ;
    public final void ruleItemDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:129:2: ( ( ( rule__ItemDefinition__Group__0 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:130:1: ( ( rule__ItemDefinition__Group__0 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:130:1: ( ( rule__ItemDefinition__Group__0 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:131:1: ( rule__ItemDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemDefinitionAccess().getGroup()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:132:1: ( rule__ItemDefinition__Group__0 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:132:2: rule__ItemDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ItemDefinition__Group__0_in_ruleItemDefinition214);
            rule__ItemDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemDefinition"


    // $ANTLR start "entryRuleUseDefinition"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:144:1: entryRuleUseDefinition : ruleUseDefinition EOF ;
    public final void entryRuleUseDefinition() throws RecognitionException {
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:145:1: ( ruleUseDefinition EOF )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:146:1: ruleUseDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleUseDefinition_in_entryRuleUseDefinition241);
            ruleUseDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseDefinition248); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUseDefinition"


    // $ANTLR start "ruleUseDefinition"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:153:1: ruleUseDefinition : ( ( rule__UseDefinition__Group__0 ) ) ;
    public final void ruleUseDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:157:2: ( ( ( rule__UseDefinition__Group__0 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:158:1: ( ( rule__UseDefinition__Group__0 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:158:1: ( ( rule__UseDefinition__Group__0 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:159:1: ( rule__UseDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getGroup()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:160:1: ( rule__UseDefinition__Group__0 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:160:2: rule__UseDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group__0_in_ruleUseDefinition274);
            rule__UseDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseDefinition"


    // $ANTLR start "entryRuleSceneDefinition"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:172:1: entryRuleSceneDefinition : ruleSceneDefinition EOF ;
    public final void entryRuleSceneDefinition() throws RecognitionException {
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:173:1: ( ruleSceneDefinition EOF )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:174:1: ruleSceneDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSceneDefinition_in_entryRuleSceneDefinition301);
            ruleSceneDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSceneDefinition308); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSceneDefinition"


    // $ANTLR start "ruleSceneDefinition"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:181:1: ruleSceneDefinition : ( ( rule__SceneDefinition__Group__0 ) ) ;
    public final void ruleSceneDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:185:2: ( ( ( rule__SceneDefinition__Group__0 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:186:1: ( ( rule__SceneDefinition__Group__0 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:186:1: ( ( rule__SceneDefinition__Group__0 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:187:1: ( rule__SceneDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneDefinitionAccess().getGroup()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:188:1: ( rule__SceneDefinition__Group__0 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:188:2: rule__SceneDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__SceneDefinition__Group__0_in_ruleSceneDefinition334);
            rule__SceneDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSceneDefinition"


    // $ANTLR start "entryRuleItemPositionDefinition"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:200:1: entryRuleItemPositionDefinition : ruleItemPositionDefinition EOF ;
    public final void entryRuleItemPositionDefinition() throws RecognitionException {
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:201:1: ( ruleItemPositionDefinition EOF )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:202:1: ruleItemPositionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleItemPositionDefinition_in_entryRuleItemPositionDefinition361);
            ruleItemPositionDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemPositionDefinition368); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemPositionDefinition"


    // $ANTLR start "ruleItemPositionDefinition"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:209:1: ruleItemPositionDefinition : ( ( rule__ItemPositionDefinition__Group__0 ) ) ;
    public final void ruleItemPositionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:213:2: ( ( ( rule__ItemPositionDefinition__Group__0 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:214:1: ( ( rule__ItemPositionDefinition__Group__0 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:214:1: ( ( rule__ItemPositionDefinition__Group__0 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:215:1: ( rule__ItemPositionDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionAccess().getGroup()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:216:1: ( rule__ItemPositionDefinition__Group__0 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:216:2: rule__ItemPositionDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group__0_in_ruleItemPositionDefinition394);
            rule__ItemPositionDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemPositionDefinition"


    // $ANTLR start "entryRuleStartDefinition"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:228:1: entryRuleStartDefinition : ruleStartDefinition EOF ;
    public final void entryRuleStartDefinition() throws RecognitionException {
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:229:1: ( ruleStartDefinition EOF )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:230:1: ruleStartDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleStartDefinition_in_entryRuleStartDefinition421);
            ruleStartDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartDefinition428); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStartDefinition"


    // $ANTLR start "ruleStartDefinition"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:237:1: ruleStartDefinition : ( ( rule__StartDefinition__Group__0 ) ) ;
    public final void ruleStartDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:241:2: ( ( ( rule__StartDefinition__Group__0 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:242:1: ( ( rule__StartDefinition__Group__0 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:242:1: ( ( rule__StartDefinition__Group__0 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:243:1: ( rule__StartDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getGroup()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:244:1: ( rule__StartDefinition__Group__0 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:244:2: rule__StartDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__StartDefinition__Group__0_in_ruleStartDefinition454);
            rule__StartDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartDefinition"


    // $ANTLR start "rule__ItemDefinition__Alternatives_0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:256:1: rule__ItemDefinition__Alternatives_0 : ( ( 'A' ) | ( 'An' ) );
    public final void rule__ItemDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:260:1: ( ( 'A' ) | ( 'An' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:261:1: ( 'A' )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:261:1: ( 'A' )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:262:1: 'A'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemDefinitionAccess().getAKeyword_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__ItemDefinition__Alternatives_0491); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getItemDefinitionAccess().getAKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:269:6: ( 'An' )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:269:6: ( 'An' )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:270:1: 'An'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemDefinitionAccess().getAnKeyword_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__ItemDefinition__Alternatives_0511); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getItemDefinitionAccess().getAnKeyword_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__Alternatives_0"


    // $ANTLR start "rule__SceneDefinition__Alternatives_4"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:282:1: rule__SceneDefinition__Alternatives_4 : ( ( ( rule__SceneDefinition__Group_4_0__0 ) ) | ( '.' ) );
    public final void rule__SceneDefinition__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:286:1: ( ( ( rule__SceneDefinition__Group_4_0__0 ) ) | ( '.' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:287:1: ( ( rule__SceneDefinition__Group_4_0__0 ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:287:1: ( ( rule__SceneDefinition__Group_4_0__0 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:288:1: ( rule__SceneDefinition__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSceneDefinitionAccess().getGroup_4_0()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:289:1: ( rule__SceneDefinition__Group_4_0__0 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:289:2: rule__SceneDefinition__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__SceneDefinition__Group_4_0__0_in_rule__SceneDefinition__Alternatives_4545);
                    rule__SceneDefinition__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSceneDefinitionAccess().getGroup_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:293:6: ( '.' )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:293:6: ( '.' )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:294:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSceneDefinitionAccess().getFullStopKeyword_4_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__SceneDefinition__Alternatives_4564); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSceneDefinitionAccess().getFullStopKeyword_4_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Alternatives_4"


    // $ANTLR start "rule__Adventure__Group__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:308:1: rule__Adventure__Group__0 : rule__Adventure__Group__0__Impl rule__Adventure__Group__1 ;
    public final void rule__Adventure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:312:1: ( rule__Adventure__Group__0__Impl rule__Adventure__Group__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:313:2: rule__Adventure__Group__0__Impl rule__Adventure__Group__1
            {
            pushFollow(FOLLOW_rule__Adventure__Group__0__Impl_in_rule__Adventure__Group__0596);
            rule__Adventure__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Adventure__Group__1_in_rule__Adventure__Group__0599);
            rule__Adventure__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group__0"


    // $ANTLR start "rule__Adventure__Group__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:320:1: rule__Adventure__Group__0__Impl : ( ( rule__Adventure__TitleAssignment_0 ) ) ;
    public final void rule__Adventure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:324:1: ( ( ( rule__Adventure__TitleAssignment_0 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:325:1: ( ( rule__Adventure__TitleAssignment_0 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:325:1: ( ( rule__Adventure__TitleAssignment_0 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:326:1: ( rule__Adventure__TitleAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getTitleAssignment_0()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:327:1: ( rule__Adventure__TitleAssignment_0 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:327:2: rule__Adventure__TitleAssignment_0
            {
            pushFollow(FOLLOW_rule__Adventure__TitleAssignment_0_in_rule__Adventure__Group__0__Impl626);
            rule__Adventure__TitleAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getTitleAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group__0__Impl"


    // $ANTLR start "rule__Adventure__Group__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:337:1: rule__Adventure__Group__1 : rule__Adventure__Group__1__Impl rule__Adventure__Group__2 ;
    public final void rule__Adventure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:341:1: ( rule__Adventure__Group__1__Impl rule__Adventure__Group__2 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:342:2: rule__Adventure__Group__1__Impl rule__Adventure__Group__2
            {
            pushFollow(FOLLOW_rule__Adventure__Group__1__Impl_in_rule__Adventure__Group__1656);
            rule__Adventure__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Adventure__Group__2_in_rule__Adventure__Group__1659);
            rule__Adventure__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group__1"


    // $ANTLR start "rule__Adventure__Group__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:349:1: rule__Adventure__Group__1__Impl : ( ( rule__Adventure__UnorderedGroup_1 )* ) ;
    public final void rule__Adventure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:353:1: ( ( ( rule__Adventure__UnorderedGroup_1 )* ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:354:1: ( ( rule__Adventure__UnorderedGroup_1 )* )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:354:1: ( ( rule__Adventure__UnorderedGroup_1 )* )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:355:1: ( rule__Adventure__UnorderedGroup_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getUnorderedGroup_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:356:1: ( rule__Adventure__UnorderedGroup_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( LA3_0 >=11 && LA3_0<=12 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:356:2: rule__Adventure__UnorderedGroup_1
            	    {
            	    pushFollow(FOLLOW_rule__Adventure__UnorderedGroup_1_in_rule__Adventure__Group__1__Impl686);
            	    rule__Adventure__UnorderedGroup_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getUnorderedGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group__1__Impl"


    // $ANTLR start "rule__Adventure__Group__2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:366:1: rule__Adventure__Group__2 : rule__Adventure__Group__2__Impl rule__Adventure__Group__3 ;
    public final void rule__Adventure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:370:1: ( rule__Adventure__Group__2__Impl rule__Adventure__Group__3 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:371:2: rule__Adventure__Group__2__Impl rule__Adventure__Group__3
            {
            pushFollow(FOLLOW_rule__Adventure__Group__2__Impl_in_rule__Adventure__Group__2717);
            rule__Adventure__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Adventure__Group__3_in_rule__Adventure__Group__2720);
            rule__Adventure__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group__2"


    // $ANTLR start "rule__Adventure__Group__2__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:378:1: rule__Adventure__Group__2__Impl : ( ( rule__Adventure__StartDefAssignment_2 ) ) ;
    public final void rule__Adventure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:382:1: ( ( ( rule__Adventure__StartDefAssignment_2 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:383:1: ( ( rule__Adventure__StartDefAssignment_2 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:383:1: ( ( rule__Adventure__StartDefAssignment_2 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:384:1: ( rule__Adventure__StartDefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getStartDefAssignment_2()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:385:1: ( rule__Adventure__StartDefAssignment_2 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:385:2: rule__Adventure__StartDefAssignment_2
            {
            pushFollow(FOLLOW_rule__Adventure__StartDefAssignment_2_in_rule__Adventure__Group__2__Impl747);
            rule__Adventure__StartDefAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getStartDefAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group__2__Impl"


    // $ANTLR start "rule__Adventure__Group__3"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:395:1: rule__Adventure__Group__3 : rule__Adventure__Group__3__Impl ;
    public final void rule__Adventure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:399:1: ( rule__Adventure__Group__3__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:400:2: rule__Adventure__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Adventure__Group__3__Impl_in_rule__Adventure__Group__3777);
            rule__Adventure__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group__3"


    // $ANTLR start "rule__Adventure__Group__3__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:406:1: rule__Adventure__Group__3__Impl : ( ( rule__Adventure__UnorderedGroup_3 )* ) ;
    public final void rule__Adventure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:410:1: ( ( ( rule__Adventure__UnorderedGroup_3 )* ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:411:1: ( ( rule__Adventure__UnorderedGroup_3 )* )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:411:1: ( ( rule__Adventure__UnorderedGroup_3 )* )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:412:1: ( rule__Adventure__UnorderedGroup_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getUnorderedGroup_3()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:413:1: ( rule__Adventure__UnorderedGroup_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( LA4_0 >=11 && LA4_0<=12 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:413:2: rule__Adventure__UnorderedGroup_3
            	    {
            	    pushFollow(FOLLOW_rule__Adventure__UnorderedGroup_3_in_rule__Adventure__Group__3__Impl804);
            	    rule__Adventure__UnorderedGroup_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getUnorderedGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__Group__3__Impl"


    // $ANTLR start "rule__ItemDefinition__Group__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:431:1: rule__ItemDefinition__Group__0 : rule__ItemDefinition__Group__0__Impl rule__ItemDefinition__Group__1 ;
    public final void rule__ItemDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:435:1: ( rule__ItemDefinition__Group__0__Impl rule__ItemDefinition__Group__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:436:2: rule__ItemDefinition__Group__0__Impl rule__ItemDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ItemDefinition__Group__0__Impl_in_rule__ItemDefinition__Group__0843);
            rule__ItemDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemDefinition__Group__1_in_rule__ItemDefinition__Group__0846);
            rule__ItemDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__Group__0"


    // $ANTLR start "rule__ItemDefinition__Group__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:443:1: rule__ItemDefinition__Group__0__Impl : ( ( rule__ItemDefinition__Alternatives_0 ) ) ;
    public final void rule__ItemDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:447:1: ( ( ( rule__ItemDefinition__Alternatives_0 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:448:1: ( ( rule__ItemDefinition__Alternatives_0 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:448:1: ( ( rule__ItemDefinition__Alternatives_0 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:449:1: ( rule__ItemDefinition__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemDefinitionAccess().getAlternatives_0()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:450:1: ( rule__ItemDefinition__Alternatives_0 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:450:2: rule__ItemDefinition__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ItemDefinition__Alternatives_0_in_rule__ItemDefinition__Group__0__Impl873);
            rule__ItemDefinition__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemDefinitionAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__Group__0__Impl"


    // $ANTLR start "rule__ItemDefinition__Group__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:460:1: rule__ItemDefinition__Group__1 : rule__ItemDefinition__Group__1__Impl rule__ItemDefinition__Group__2 ;
    public final void rule__ItemDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:464:1: ( rule__ItemDefinition__Group__1__Impl rule__ItemDefinition__Group__2 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:465:2: rule__ItemDefinition__Group__1__Impl rule__ItemDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ItemDefinition__Group__1__Impl_in_rule__ItemDefinition__Group__1903);
            rule__ItemDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemDefinition__Group__2_in_rule__ItemDefinition__Group__1906);
            rule__ItemDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__Group__1"


    // $ANTLR start "rule__ItemDefinition__Group__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:472:1: rule__ItemDefinition__Group__1__Impl : ( ( rule__ItemDefinition__NameAssignment_1 ) ) ;
    public final void rule__ItemDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:476:1: ( ( ( rule__ItemDefinition__NameAssignment_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:477:1: ( ( rule__ItemDefinition__NameAssignment_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:477:1: ( ( rule__ItemDefinition__NameAssignment_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:478:1: ( rule__ItemDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:479:1: ( rule__ItemDefinition__NameAssignment_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:479:2: rule__ItemDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemDefinition__NameAssignment_1_in_rule__ItemDefinition__Group__1__Impl933);
            rule__ItemDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemDefinitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__Group__1__Impl"


    // $ANTLR start "rule__ItemDefinition__Group__2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:489:1: rule__ItemDefinition__Group__2 : rule__ItemDefinition__Group__2__Impl rule__ItemDefinition__Group__3 ;
    public final void rule__ItemDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:493:1: ( rule__ItemDefinition__Group__2__Impl rule__ItemDefinition__Group__3 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:494:2: rule__ItemDefinition__Group__2__Impl rule__ItemDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ItemDefinition__Group__2__Impl_in_rule__ItemDefinition__Group__2963);
            rule__ItemDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemDefinition__Group__3_in_rule__ItemDefinition__Group__2966);
            rule__ItemDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__Group__2"


    // $ANTLR start "rule__ItemDefinition__Group__2__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:501:1: rule__ItemDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__ItemDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:505:1: ( ( ':' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:506:1: ( ':' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:506:1: ( ':' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:507:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemDefinitionAccess().getColonKeyword_2()); 
            }
            match(input,14,FOLLOW_14_in_rule__ItemDefinition__Group__2__Impl994); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemDefinitionAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__Group__2__Impl"


    // $ANTLR start "rule__ItemDefinition__Group__3"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:520:1: rule__ItemDefinition__Group__3 : rule__ItemDefinition__Group__3__Impl ;
    public final void rule__ItemDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:524:1: ( rule__ItemDefinition__Group__3__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:525:2: rule__ItemDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ItemDefinition__Group__3__Impl_in_rule__ItemDefinition__Group__31025);
            rule__ItemDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__Group__3"


    // $ANTLR start "rule__ItemDefinition__Group__3__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:531:1: rule__ItemDefinition__Group__3__Impl : ( ( rule__ItemDefinition__UnorderedGroup_3 ) ) ;
    public final void rule__ItemDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:535:1: ( ( ( rule__ItemDefinition__UnorderedGroup_3 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:536:1: ( ( rule__ItemDefinition__UnorderedGroup_3 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:536:1: ( ( rule__ItemDefinition__UnorderedGroup_3 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:537:1: ( rule__ItemDefinition__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:538:1: ( rule__ItemDefinition__UnorderedGroup_3 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:538:2: rule__ItemDefinition__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__ItemDefinition__UnorderedGroup_3_in_rule__ItemDefinition__Group__3__Impl1052);
            rule__ItemDefinition__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__Group__3__Impl"


    // $ANTLR start "rule__ItemDefinition__Group_3_1__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:556:1: rule__ItemDefinition__Group_3_1__0 : rule__ItemDefinition__Group_3_1__0__Impl rule__ItemDefinition__Group_3_1__1 ;
    public final void rule__ItemDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:560:1: ( rule__ItemDefinition__Group_3_1__0__Impl rule__ItemDefinition__Group_3_1__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:561:2: rule__ItemDefinition__Group_3_1__0__Impl rule__ItemDefinition__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__ItemDefinition__Group_3_1__0__Impl_in_rule__ItemDefinition__Group_3_1__01090);
            rule__ItemDefinition__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemDefinition__Group_3_1__1_in_rule__ItemDefinition__Group_3_1__01093);
            rule__ItemDefinition__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__Group_3_1__0"


    // $ANTLR start "rule__ItemDefinition__Group_3_1__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:568:1: rule__ItemDefinition__Group_3_1__0__Impl : ( '- looks like' ) ;
    public final void rule__ItemDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:572:1: ( ( '- looks like' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:573:1: ( '- looks like' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:573:1: ( '- looks like' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:574:1: '- looks like'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemDefinitionAccess().getLooksLikeKeyword_3_1_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__ItemDefinition__Group_3_1__0__Impl1121); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemDefinitionAccess().getLooksLikeKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__Group_3_1__0__Impl"


    // $ANTLR start "rule__ItemDefinition__Group_3_1__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:587:1: rule__ItemDefinition__Group_3_1__1 : rule__ItemDefinition__Group_3_1__1__Impl ;
    public final void rule__ItemDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:591:1: ( rule__ItemDefinition__Group_3_1__1__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:592:2: rule__ItemDefinition__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ItemDefinition__Group_3_1__1__Impl_in_rule__ItemDefinition__Group_3_1__11152);
            rule__ItemDefinition__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__Group_3_1__1"


    // $ANTLR start "rule__ItemDefinition__Group_3_1__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:598:1: rule__ItemDefinition__Group_3_1__1__Impl : ( ( rule__ItemDefinition__ImgAssignment_3_1_1 ) ) ;
    public final void rule__ItemDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:602:1: ( ( ( rule__ItemDefinition__ImgAssignment_3_1_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:603:1: ( ( rule__ItemDefinition__ImgAssignment_3_1_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:603:1: ( ( rule__ItemDefinition__ImgAssignment_3_1_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:604:1: ( rule__ItemDefinition__ImgAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemDefinitionAccess().getImgAssignment_3_1_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:605:1: ( rule__ItemDefinition__ImgAssignment_3_1_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:605:2: rule__ItemDefinition__ImgAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__ItemDefinition__ImgAssignment_3_1_1_in_rule__ItemDefinition__Group_3_1__1__Impl1179);
            rule__ItemDefinition__ImgAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemDefinitionAccess().getImgAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__Group_3_1__1__Impl"


    // $ANTLR start "rule__UseDefinition__Group__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:619:1: rule__UseDefinition__Group__0 : rule__UseDefinition__Group__0__Impl rule__UseDefinition__Group__1 ;
    public final void rule__UseDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:623:1: ( rule__UseDefinition__Group__0__Impl rule__UseDefinition__Group__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:624:2: rule__UseDefinition__Group__0__Impl rule__UseDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group__0__Impl_in_rule__UseDefinition__Group__01213);
            rule__UseDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group__1_in_rule__UseDefinition__Group__01216);
            rule__UseDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group__0"


    // $ANTLR start "rule__UseDefinition__Group__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:631:1: rule__UseDefinition__Group__0__Impl : ( '- you can' ) ;
    public final void rule__UseDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:635:1: ( ( '- you can' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:636:1: ( '- you can' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:636:1: ( '- you can' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:637:1: '- you can'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getYouCanKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__UseDefinition__Group__0__Impl1244); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getYouCanKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group__0__Impl"


    // $ANTLR start "rule__UseDefinition__Group__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:650:1: rule__UseDefinition__Group__1 : rule__UseDefinition__Group__1__Impl rule__UseDefinition__Group__2 ;
    public final void rule__UseDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:654:1: ( rule__UseDefinition__Group__1__Impl rule__UseDefinition__Group__2 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:655:2: rule__UseDefinition__Group__1__Impl rule__UseDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group__1__Impl_in_rule__UseDefinition__Group__11275);
            rule__UseDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group__2_in_rule__UseDefinition__Group__11278);
            rule__UseDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group__1"


    // $ANTLR start "rule__UseDefinition__Group__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:662:1: rule__UseDefinition__Group__1__Impl : ( ( rule__UseDefinition__NameAssignment_1 ) ) ;
    public final void rule__UseDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:666:1: ( ( ( rule__UseDefinition__NameAssignment_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:667:1: ( ( rule__UseDefinition__NameAssignment_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:667:1: ( ( rule__UseDefinition__NameAssignment_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:668:1: ( rule__UseDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:669:1: ( rule__UseDefinition__NameAssignment_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:669:2: rule__UseDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UseDefinition__NameAssignment_1_in_rule__UseDefinition__Group__1__Impl1305);
            rule__UseDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group__1__Impl"


    // $ANTLR start "rule__UseDefinition__Group__2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:679:1: rule__UseDefinition__Group__2 : rule__UseDefinition__Group__2__Impl rule__UseDefinition__Group__3 ;
    public final void rule__UseDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:683:1: ( rule__UseDefinition__Group__2__Impl rule__UseDefinition__Group__3 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:684:2: rule__UseDefinition__Group__2__Impl rule__UseDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group__2__Impl_in_rule__UseDefinition__Group__21335);
            rule__UseDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group__3_in_rule__UseDefinition__Group__21338);
            rule__UseDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group__2"


    // $ANTLR start "rule__UseDefinition__Group__2__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:691:1: rule__UseDefinition__Group__2__Impl : ( ( 'with' )? ) ;
    public final void rule__UseDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:695:1: ( ( ( 'with' )? ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:696:1: ( ( 'with' )? )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:696:1: ( ( 'with' )? )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:697:1: ( 'with' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getWithKeyword_2()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:698:1: ( 'with' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:699:2: 'with'
                    {
                    match(input,17,FOLLOW_17_in_rule__UseDefinition__Group__2__Impl1367); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getWithKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group__2__Impl"


    // $ANTLR start "rule__UseDefinition__Group__3"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:710:1: rule__UseDefinition__Group__3 : rule__UseDefinition__Group__3__Impl rule__UseDefinition__Group__4 ;
    public final void rule__UseDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:714:1: ( rule__UseDefinition__Group__3__Impl rule__UseDefinition__Group__4 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:715:2: rule__UseDefinition__Group__3__Impl rule__UseDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group__3__Impl_in_rule__UseDefinition__Group__31400);
            rule__UseDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group__4_in_rule__UseDefinition__Group__31403);
            rule__UseDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group__3"


    // $ANTLR start "rule__UseDefinition__Group__3__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:722:1: rule__UseDefinition__Group__3__Impl : ( 'it, which:' ) ;
    public final void rule__UseDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:726:1: ( ( 'it, which:' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:727:1: ( 'it, which:' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:727:1: ( 'it, which:' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:728:1: 'it, which:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getItWhichKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__UseDefinition__Group__3__Impl1431); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getItWhichKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group__3__Impl"


    // $ANTLR start "rule__UseDefinition__Group__4"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:741:1: rule__UseDefinition__Group__4 : rule__UseDefinition__Group__4__Impl ;
    public final void rule__UseDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:745:1: ( rule__UseDefinition__Group__4__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:746:2: rule__UseDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group__4__Impl_in_rule__UseDefinition__Group__41462);
            rule__UseDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group__4"


    // $ANTLR start "rule__UseDefinition__Group__4__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:752:1: rule__UseDefinition__Group__4__Impl : ( ( rule__UseDefinition__UnorderedGroup_4 ) ) ;
    public final void rule__UseDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:756:1: ( ( ( rule__UseDefinition__UnorderedGroup_4 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:757:1: ( ( rule__UseDefinition__UnorderedGroup_4 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:757:1: ( ( rule__UseDefinition__UnorderedGroup_4 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:758:1: ( rule__UseDefinition__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:759:1: ( rule__UseDefinition__UnorderedGroup_4 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:759:2: rule__UseDefinition__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__UseDefinition__UnorderedGroup_4_in_rule__UseDefinition__Group__4__Impl1489);
            rule__UseDefinition__UnorderedGroup_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group__4__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_0__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:779:1: rule__UseDefinition__Group_4_0__0 : rule__UseDefinition__Group_4_0__0__Impl rule__UseDefinition__Group_4_0__1 ;
    public final void rule__UseDefinition__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:783:1: ( rule__UseDefinition__Group_4_0__0__Impl rule__UseDefinition__Group_4_0__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:784:2: rule__UseDefinition__Group_4_0__0__Impl rule__UseDefinition__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_0__0__Impl_in_rule__UseDefinition__Group_4_0__01529);
            rule__UseDefinition__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_0__1_in_rule__UseDefinition__Group_4_0__01532);
            rule__UseDefinition__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_0__0"


    // $ANTLR start "rule__UseDefinition__Group_4_0__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:791:1: rule__UseDefinition__Group_4_0__0__Impl : ( '+ requires' ) ;
    public final void rule__UseDefinition__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:795:1: ( ( '+ requires' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:796:1: ( '+ requires' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:796:1: ( '+ requires' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:797:1: '+ requires'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getRequiresKeyword_4_0_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__UseDefinition__Group_4_0__0__Impl1560); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getRequiresKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_0__0__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_0__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:810:1: rule__UseDefinition__Group_4_0__1 : rule__UseDefinition__Group_4_0__1__Impl rule__UseDefinition__Group_4_0__2 ;
    public final void rule__UseDefinition__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:814:1: ( rule__UseDefinition__Group_4_0__1__Impl rule__UseDefinition__Group_4_0__2 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:815:2: rule__UseDefinition__Group_4_0__1__Impl rule__UseDefinition__Group_4_0__2
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_0__1__Impl_in_rule__UseDefinition__Group_4_0__11591);
            rule__UseDefinition__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_0__2_in_rule__UseDefinition__Group_4_0__11594);
            rule__UseDefinition__Group_4_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_0__1"


    // $ANTLR start "rule__UseDefinition__Group_4_0__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:822:1: rule__UseDefinition__Group_4_0__1__Impl : ( ( rule__UseDefinition__ReqsAssignment_4_0_1 ) ) ;
    public final void rule__UseDefinition__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:826:1: ( ( ( rule__UseDefinition__ReqsAssignment_4_0_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:827:1: ( ( rule__UseDefinition__ReqsAssignment_4_0_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:827:1: ( ( rule__UseDefinition__ReqsAssignment_4_0_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:828:1: ( rule__UseDefinition__ReqsAssignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getReqsAssignment_4_0_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:829:1: ( rule__UseDefinition__ReqsAssignment_4_0_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:829:2: rule__UseDefinition__ReqsAssignment_4_0_1
            {
            pushFollow(FOLLOW_rule__UseDefinition__ReqsAssignment_4_0_1_in_rule__UseDefinition__Group_4_0__1__Impl1621);
            rule__UseDefinition__ReqsAssignment_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getReqsAssignment_4_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_0__1__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_0__2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:839:1: rule__UseDefinition__Group_4_0__2 : rule__UseDefinition__Group_4_0__2__Impl ;
    public final void rule__UseDefinition__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:843:1: ( rule__UseDefinition__Group_4_0__2__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:844:2: rule__UseDefinition__Group_4_0__2__Impl
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_0__2__Impl_in_rule__UseDefinition__Group_4_0__21651);
            rule__UseDefinition__Group_4_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_0__2"


    // $ANTLR start "rule__UseDefinition__Group_4_0__2__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:850:1: rule__UseDefinition__Group_4_0__2__Impl : ( ( rule__UseDefinition__Group_4_0_2__0 )? ) ;
    public final void rule__UseDefinition__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:854:1: ( ( ( rule__UseDefinition__Group_4_0_2__0 )? ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:855:1: ( ( rule__UseDefinition__Group_4_0_2__0 )? )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:855:1: ( ( rule__UseDefinition__Group_4_0_2__0 )? )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:856:1: ( rule__UseDefinition__Group_4_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getGroup_4_0_2()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:857:1: ( rule__UseDefinition__Group_4_0_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:857:2: rule__UseDefinition__Group_4_0_2__0
                    {
                    pushFollow(FOLLOW_rule__UseDefinition__Group_4_0_2__0_in_rule__UseDefinition__Group_4_0__2__Impl1678);
                    rule__UseDefinition__Group_4_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getGroup_4_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_0__2__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_0_2__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:873:1: rule__UseDefinition__Group_4_0_2__0 : rule__UseDefinition__Group_4_0_2__0__Impl rule__UseDefinition__Group_4_0_2__1 ;
    public final void rule__UseDefinition__Group_4_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:877:1: ( rule__UseDefinition__Group_4_0_2__0__Impl rule__UseDefinition__Group_4_0_2__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:878:2: rule__UseDefinition__Group_4_0_2__0__Impl rule__UseDefinition__Group_4_0_2__1
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_0_2__0__Impl_in_rule__UseDefinition__Group_4_0_2__01715);
            rule__UseDefinition__Group_4_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_0_2__1_in_rule__UseDefinition__Group_4_0_2__01718);
            rule__UseDefinition__Group_4_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_0_2__0"


    // $ANTLR start "rule__UseDefinition__Group_4_0_2__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:885:1: rule__UseDefinition__Group_4_0_2__0__Impl : ( 'or says' ) ;
    public final void rule__UseDefinition__Group_4_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:889:1: ( ( 'or says' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:890:1: ( 'or says' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:890:1: ( 'or says' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:891:1: 'or says'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getOrSaysKeyword_4_0_2_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__UseDefinition__Group_4_0_2__0__Impl1746); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getOrSaysKeyword_4_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_0_2__0__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_0_2__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:904:1: rule__UseDefinition__Group_4_0_2__1 : rule__UseDefinition__Group_4_0_2__1__Impl ;
    public final void rule__UseDefinition__Group_4_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:908:1: ( rule__UseDefinition__Group_4_0_2__1__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:909:2: rule__UseDefinition__Group_4_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_0_2__1__Impl_in_rule__UseDefinition__Group_4_0_2__11777);
            rule__UseDefinition__Group_4_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_0_2__1"


    // $ANTLR start "rule__UseDefinition__Group_4_0_2__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:915:1: rule__UseDefinition__Group_4_0_2__1__Impl : ( ( rule__UseDefinition__AltTextAssignment_4_0_2_1 ) ) ;
    public final void rule__UseDefinition__Group_4_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:919:1: ( ( ( rule__UseDefinition__AltTextAssignment_4_0_2_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:920:1: ( ( rule__UseDefinition__AltTextAssignment_4_0_2_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:920:1: ( ( rule__UseDefinition__AltTextAssignment_4_0_2_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:921:1: ( rule__UseDefinition__AltTextAssignment_4_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getAltTextAssignment_4_0_2_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:922:1: ( rule__UseDefinition__AltTextAssignment_4_0_2_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:922:2: rule__UseDefinition__AltTextAssignment_4_0_2_1
            {
            pushFollow(FOLLOW_rule__UseDefinition__AltTextAssignment_4_0_2_1_in_rule__UseDefinition__Group_4_0_2__1__Impl1804);
            rule__UseDefinition__AltTextAssignment_4_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getAltTextAssignment_4_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_0_2__1__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_1__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:936:1: rule__UseDefinition__Group_4_1__0 : rule__UseDefinition__Group_4_1__0__Impl rule__UseDefinition__Group_4_1__1 ;
    public final void rule__UseDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:940:1: ( rule__UseDefinition__Group_4_1__0__Impl rule__UseDefinition__Group_4_1__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:941:2: rule__UseDefinition__Group_4_1__0__Impl rule__UseDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_1__0__Impl_in_rule__UseDefinition__Group_4_1__01838);
            rule__UseDefinition__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_1__1_in_rule__UseDefinition__Group_4_1__01841);
            rule__UseDefinition__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_1__0"


    // $ANTLR start "rule__UseDefinition__Group_4_1__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:948:1: rule__UseDefinition__Group_4_1__0__Impl : ( '+ adds' ) ;
    public final void rule__UseDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:952:1: ( ( '+ adds' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:953:1: ( '+ adds' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:953:1: ( '+ adds' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:954:1: '+ adds'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getAddsKeyword_4_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__UseDefinition__Group_4_1__0__Impl1869); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getAddsKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_1__0__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_1__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:967:1: rule__UseDefinition__Group_4_1__1 : rule__UseDefinition__Group_4_1__1__Impl rule__UseDefinition__Group_4_1__2 ;
    public final void rule__UseDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:971:1: ( rule__UseDefinition__Group_4_1__1__Impl rule__UseDefinition__Group_4_1__2 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:972:2: rule__UseDefinition__Group_4_1__1__Impl rule__UseDefinition__Group_4_1__2
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_1__1__Impl_in_rule__UseDefinition__Group_4_1__11900);
            rule__UseDefinition__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_1__2_in_rule__UseDefinition__Group_4_1__11903);
            rule__UseDefinition__Group_4_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_1__1"


    // $ANTLR start "rule__UseDefinition__Group_4_1__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:979:1: rule__UseDefinition__Group_4_1__1__Impl : ( ( rule__UseDefinition__AddsAssignment_4_1_1 ) ) ;
    public final void rule__UseDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:983:1: ( ( ( rule__UseDefinition__AddsAssignment_4_1_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:984:1: ( ( rule__UseDefinition__AddsAssignment_4_1_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:984:1: ( ( rule__UseDefinition__AddsAssignment_4_1_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:985:1: ( rule__UseDefinition__AddsAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getAddsAssignment_4_1_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:986:1: ( rule__UseDefinition__AddsAssignment_4_1_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:986:2: rule__UseDefinition__AddsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__UseDefinition__AddsAssignment_4_1_1_in_rule__UseDefinition__Group_4_1__1__Impl1930);
            rule__UseDefinition__AddsAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getAddsAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_1__1__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_1__2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:996:1: rule__UseDefinition__Group_4_1__2 : rule__UseDefinition__Group_4_1__2__Impl ;
    public final void rule__UseDefinition__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1000:1: ( rule__UseDefinition__Group_4_1__2__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1001:2: rule__UseDefinition__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_1__2__Impl_in_rule__UseDefinition__Group_4_1__21960);
            rule__UseDefinition__Group_4_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_1__2"


    // $ANTLR start "rule__UseDefinition__Group_4_1__2__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1007:1: rule__UseDefinition__Group_4_1__2__Impl : ( ( rule__UseDefinition__Group_4_1_2__0 )* ) ;
    public final void rule__UseDefinition__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1011:1: ( ( ( rule__UseDefinition__Group_4_1_2__0 )* ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1012:1: ( ( rule__UseDefinition__Group_4_1_2__0 )* )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1012:1: ( ( rule__UseDefinition__Group_4_1_2__0 )* )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1013:1: ( rule__UseDefinition__Group_4_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getGroup_4_1_2()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1014:1: ( rule__UseDefinition__Group_4_1_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1014:2: rule__UseDefinition__Group_4_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__UseDefinition__Group_4_1_2__0_in_rule__UseDefinition__Group_4_1__2__Impl1987);
            	    rule__UseDefinition__Group_4_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getGroup_4_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_1__2__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_1_2__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1030:1: rule__UseDefinition__Group_4_1_2__0 : rule__UseDefinition__Group_4_1_2__0__Impl rule__UseDefinition__Group_4_1_2__1 ;
    public final void rule__UseDefinition__Group_4_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1034:1: ( rule__UseDefinition__Group_4_1_2__0__Impl rule__UseDefinition__Group_4_1_2__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1035:2: rule__UseDefinition__Group_4_1_2__0__Impl rule__UseDefinition__Group_4_1_2__1
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_1_2__0__Impl_in_rule__UseDefinition__Group_4_1_2__02024);
            rule__UseDefinition__Group_4_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_1_2__1_in_rule__UseDefinition__Group_4_1_2__02027);
            rule__UseDefinition__Group_4_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_1_2__0"


    // $ANTLR start "rule__UseDefinition__Group_4_1_2__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1042:1: rule__UseDefinition__Group_4_1_2__0__Impl : ( ',' ) ;
    public final void rule__UseDefinition__Group_4_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1046:1: ( ( ',' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1047:1: ( ',' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1047:1: ( ',' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1048:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getCommaKeyword_4_1_2_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__UseDefinition__Group_4_1_2__0__Impl2055); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getCommaKeyword_4_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_1_2__0__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_1_2__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1061:1: rule__UseDefinition__Group_4_1_2__1 : rule__UseDefinition__Group_4_1_2__1__Impl ;
    public final void rule__UseDefinition__Group_4_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1065:1: ( rule__UseDefinition__Group_4_1_2__1__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1066:2: rule__UseDefinition__Group_4_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_1_2__1__Impl_in_rule__UseDefinition__Group_4_1_2__12086);
            rule__UseDefinition__Group_4_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_1_2__1"


    // $ANTLR start "rule__UseDefinition__Group_4_1_2__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1072:1: rule__UseDefinition__Group_4_1_2__1__Impl : ( ( rule__UseDefinition__AddsAssignment_4_1_2_1 ) ) ;
    public final void rule__UseDefinition__Group_4_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1076:1: ( ( ( rule__UseDefinition__AddsAssignment_4_1_2_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1077:1: ( ( rule__UseDefinition__AddsAssignment_4_1_2_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1077:1: ( ( rule__UseDefinition__AddsAssignment_4_1_2_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1078:1: ( rule__UseDefinition__AddsAssignment_4_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getAddsAssignment_4_1_2_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1079:1: ( rule__UseDefinition__AddsAssignment_4_1_2_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1079:2: rule__UseDefinition__AddsAssignment_4_1_2_1
            {
            pushFollow(FOLLOW_rule__UseDefinition__AddsAssignment_4_1_2_1_in_rule__UseDefinition__Group_4_1_2__1__Impl2113);
            rule__UseDefinition__AddsAssignment_4_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getAddsAssignment_4_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_1_2__1__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_2__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1093:1: rule__UseDefinition__Group_4_2__0 : rule__UseDefinition__Group_4_2__0__Impl rule__UseDefinition__Group_4_2__1 ;
    public final void rule__UseDefinition__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1097:1: ( rule__UseDefinition__Group_4_2__0__Impl rule__UseDefinition__Group_4_2__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1098:2: rule__UseDefinition__Group_4_2__0__Impl rule__UseDefinition__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_2__0__Impl_in_rule__UseDefinition__Group_4_2__02147);
            rule__UseDefinition__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_2__1_in_rule__UseDefinition__Group_4_2__02150);
            rule__UseDefinition__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_2__0"


    // $ANTLR start "rule__UseDefinition__Group_4_2__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1105:1: rule__UseDefinition__Group_4_2__0__Impl : ( '+ removes' ) ;
    public final void rule__UseDefinition__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1109:1: ( ( '+ removes' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1110:1: ( '+ removes' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1110:1: ( '+ removes' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1111:1: '+ removes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getRemovesKeyword_4_2_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__UseDefinition__Group_4_2__0__Impl2178); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getRemovesKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_2__0__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_2__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1124:1: rule__UseDefinition__Group_4_2__1 : rule__UseDefinition__Group_4_2__1__Impl rule__UseDefinition__Group_4_2__2 ;
    public final void rule__UseDefinition__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1128:1: ( rule__UseDefinition__Group_4_2__1__Impl rule__UseDefinition__Group_4_2__2 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1129:2: rule__UseDefinition__Group_4_2__1__Impl rule__UseDefinition__Group_4_2__2
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_2__1__Impl_in_rule__UseDefinition__Group_4_2__12209);
            rule__UseDefinition__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_2__2_in_rule__UseDefinition__Group_4_2__12212);
            rule__UseDefinition__Group_4_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_2__1"


    // $ANTLR start "rule__UseDefinition__Group_4_2__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1136:1: rule__UseDefinition__Group_4_2__1__Impl : ( ( rule__UseDefinition__DelsAssignment_4_2_1 ) ) ;
    public final void rule__UseDefinition__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1140:1: ( ( ( rule__UseDefinition__DelsAssignment_4_2_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1141:1: ( ( rule__UseDefinition__DelsAssignment_4_2_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1141:1: ( ( rule__UseDefinition__DelsAssignment_4_2_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1142:1: ( rule__UseDefinition__DelsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getDelsAssignment_4_2_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1143:1: ( rule__UseDefinition__DelsAssignment_4_2_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1143:2: rule__UseDefinition__DelsAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__UseDefinition__DelsAssignment_4_2_1_in_rule__UseDefinition__Group_4_2__1__Impl2239);
            rule__UseDefinition__DelsAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getDelsAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_2__1__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_2__2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1153:1: rule__UseDefinition__Group_4_2__2 : rule__UseDefinition__Group_4_2__2__Impl ;
    public final void rule__UseDefinition__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1157:1: ( rule__UseDefinition__Group_4_2__2__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1158:2: rule__UseDefinition__Group_4_2__2__Impl
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_2__2__Impl_in_rule__UseDefinition__Group_4_2__22269);
            rule__UseDefinition__Group_4_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_2__2"


    // $ANTLR start "rule__UseDefinition__Group_4_2__2__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1164:1: rule__UseDefinition__Group_4_2__2__Impl : ( ( rule__UseDefinition__Group_4_2_2__0 )* ) ;
    public final void rule__UseDefinition__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1168:1: ( ( ( rule__UseDefinition__Group_4_2_2__0 )* ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1169:1: ( ( rule__UseDefinition__Group_4_2_2__0 )* )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1169:1: ( ( rule__UseDefinition__Group_4_2_2__0 )* )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1170:1: ( rule__UseDefinition__Group_4_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getGroup_4_2_2()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1171:1: ( rule__UseDefinition__Group_4_2_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1171:2: rule__UseDefinition__Group_4_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__UseDefinition__Group_4_2_2__0_in_rule__UseDefinition__Group_4_2__2__Impl2296);
            	    rule__UseDefinition__Group_4_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getGroup_4_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_2__2__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_2_2__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1187:1: rule__UseDefinition__Group_4_2_2__0 : rule__UseDefinition__Group_4_2_2__0__Impl rule__UseDefinition__Group_4_2_2__1 ;
    public final void rule__UseDefinition__Group_4_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1191:1: ( rule__UseDefinition__Group_4_2_2__0__Impl rule__UseDefinition__Group_4_2_2__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1192:2: rule__UseDefinition__Group_4_2_2__0__Impl rule__UseDefinition__Group_4_2_2__1
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_2_2__0__Impl_in_rule__UseDefinition__Group_4_2_2__02333);
            rule__UseDefinition__Group_4_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_2_2__1_in_rule__UseDefinition__Group_4_2_2__02336);
            rule__UseDefinition__Group_4_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_2_2__0"


    // $ANTLR start "rule__UseDefinition__Group_4_2_2__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1199:1: rule__UseDefinition__Group_4_2_2__0__Impl : ( ',' ) ;
    public final void rule__UseDefinition__Group_4_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1203:1: ( ( ',' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1204:1: ( ',' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1204:1: ( ',' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1205:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getCommaKeyword_4_2_2_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__UseDefinition__Group_4_2_2__0__Impl2364); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getCommaKeyword_4_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_2_2__0__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_2_2__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1218:1: rule__UseDefinition__Group_4_2_2__1 : rule__UseDefinition__Group_4_2_2__1__Impl ;
    public final void rule__UseDefinition__Group_4_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1222:1: ( rule__UseDefinition__Group_4_2_2__1__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1223:2: rule__UseDefinition__Group_4_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_2_2__1__Impl_in_rule__UseDefinition__Group_4_2_2__12395);
            rule__UseDefinition__Group_4_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_2_2__1"


    // $ANTLR start "rule__UseDefinition__Group_4_2_2__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1229:1: rule__UseDefinition__Group_4_2_2__1__Impl : ( ( rule__UseDefinition__DelsAssignment_4_2_2_1 ) ) ;
    public final void rule__UseDefinition__Group_4_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1233:1: ( ( ( rule__UseDefinition__DelsAssignment_4_2_2_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1234:1: ( ( rule__UseDefinition__DelsAssignment_4_2_2_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1234:1: ( ( rule__UseDefinition__DelsAssignment_4_2_2_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1235:1: ( rule__UseDefinition__DelsAssignment_4_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getDelsAssignment_4_2_2_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1236:1: ( rule__UseDefinition__DelsAssignment_4_2_2_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1236:2: rule__UseDefinition__DelsAssignment_4_2_2_1
            {
            pushFollow(FOLLOW_rule__UseDefinition__DelsAssignment_4_2_2_1_in_rule__UseDefinition__Group_4_2_2__1__Impl2422);
            rule__UseDefinition__DelsAssignment_4_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getDelsAssignment_4_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_2_2__1__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_3__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1250:1: rule__UseDefinition__Group_4_3__0 : rule__UseDefinition__Group_4_3__0__Impl rule__UseDefinition__Group_4_3__1 ;
    public final void rule__UseDefinition__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1254:1: ( rule__UseDefinition__Group_4_3__0__Impl rule__UseDefinition__Group_4_3__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1255:2: rule__UseDefinition__Group_4_3__0__Impl rule__UseDefinition__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_3__0__Impl_in_rule__UseDefinition__Group_4_3__02456);
            rule__UseDefinition__Group_4_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_3__1_in_rule__UseDefinition__Group_4_3__02459);
            rule__UseDefinition__Group_4_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_3__0"


    // $ANTLR start "rule__UseDefinition__Group_4_3__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1262:1: rule__UseDefinition__Group_4_3__0__Impl : ( '+ says' ) ;
    public final void rule__UseDefinition__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1266:1: ( ( '+ says' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1267:1: ( '+ says' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1267:1: ( '+ says' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1268:1: '+ says'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getSaysKeyword_4_3_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__UseDefinition__Group_4_3__0__Impl2487); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getSaysKeyword_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_3__0__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_3__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1281:1: rule__UseDefinition__Group_4_3__1 : rule__UseDefinition__Group_4_3__1__Impl ;
    public final void rule__UseDefinition__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1285:1: ( rule__UseDefinition__Group_4_3__1__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1286:2: rule__UseDefinition__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_3__1__Impl_in_rule__UseDefinition__Group_4_3__12518);
            rule__UseDefinition__Group_4_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_3__1"


    // $ANTLR start "rule__UseDefinition__Group_4_3__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1292:1: rule__UseDefinition__Group_4_3__1__Impl : ( ( rule__UseDefinition__TextAssignment_4_3_1 ) ) ;
    public final void rule__UseDefinition__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1296:1: ( ( ( rule__UseDefinition__TextAssignment_4_3_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1297:1: ( ( rule__UseDefinition__TextAssignment_4_3_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1297:1: ( ( rule__UseDefinition__TextAssignment_4_3_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1298:1: ( rule__UseDefinition__TextAssignment_4_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getTextAssignment_4_3_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1299:1: ( rule__UseDefinition__TextAssignment_4_3_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1299:2: rule__UseDefinition__TextAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__UseDefinition__TextAssignment_4_3_1_in_rule__UseDefinition__Group_4_3__1__Impl2545);
            rule__UseDefinition__TextAssignment_4_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getTextAssignment_4_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_3__1__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_4__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1313:1: rule__UseDefinition__Group_4_4__0 : rule__UseDefinition__Group_4_4__0__Impl rule__UseDefinition__Group_4_4__1 ;
    public final void rule__UseDefinition__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1317:1: ( rule__UseDefinition__Group_4_4__0__Impl rule__UseDefinition__Group_4_4__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1318:2: rule__UseDefinition__Group_4_4__0__Impl rule__UseDefinition__Group_4_4__1
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_4__0__Impl_in_rule__UseDefinition__Group_4_4__02579);
            rule__UseDefinition__Group_4_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_4__1_in_rule__UseDefinition__Group_4_4__02582);
            rule__UseDefinition__Group_4_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_4__0"


    // $ANTLR start "rule__UseDefinition__Group_4_4__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1325:1: rule__UseDefinition__Group_4_4__0__Impl : ( '+ takes you to the' ) ;
    public final void rule__UseDefinition__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1329:1: ( ( '+ takes you to the' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1330:1: ( '+ takes you to the' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1330:1: ( '+ takes you to the' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1331:1: '+ takes you to the'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getTakesYouToTheKeyword_4_4_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__UseDefinition__Group_4_4__0__Impl2610); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getTakesYouToTheKeyword_4_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_4__0__Impl"


    // $ANTLR start "rule__UseDefinition__Group_4_4__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1344:1: rule__UseDefinition__Group_4_4__1 : rule__UseDefinition__Group_4_4__1__Impl ;
    public final void rule__UseDefinition__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1348:1: ( rule__UseDefinition__Group_4_4__1__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1349:2: rule__UseDefinition__Group_4_4__1__Impl
            {
            pushFollow(FOLLOW_rule__UseDefinition__Group_4_4__1__Impl_in_rule__UseDefinition__Group_4_4__12641);
            rule__UseDefinition__Group_4_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_4__1"


    // $ANTLR start "rule__UseDefinition__Group_4_4__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1355:1: rule__UseDefinition__Group_4_4__1__Impl : ( ( rule__UseDefinition__FollowSceneAssignment_4_4_1 ) ) ;
    public final void rule__UseDefinition__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1359:1: ( ( ( rule__UseDefinition__FollowSceneAssignment_4_4_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1360:1: ( ( rule__UseDefinition__FollowSceneAssignment_4_4_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1360:1: ( ( rule__UseDefinition__FollowSceneAssignment_4_4_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1361:1: ( rule__UseDefinition__FollowSceneAssignment_4_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getFollowSceneAssignment_4_4_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1362:1: ( rule__UseDefinition__FollowSceneAssignment_4_4_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1362:2: rule__UseDefinition__FollowSceneAssignment_4_4_1
            {
            pushFollow(FOLLOW_rule__UseDefinition__FollowSceneAssignment_4_4_1_in_rule__UseDefinition__Group_4_4__1__Impl2668);
            rule__UseDefinition__FollowSceneAssignment_4_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getFollowSceneAssignment_4_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__Group_4_4__1__Impl"


    // $ANTLR start "rule__SceneDefinition__Group__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1376:1: rule__SceneDefinition__Group__0 : rule__SceneDefinition__Group__0__Impl rule__SceneDefinition__Group__1 ;
    public final void rule__SceneDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1380:1: ( rule__SceneDefinition__Group__0__Impl rule__SceneDefinition__Group__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1381:2: rule__SceneDefinition__Group__0__Impl rule__SceneDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__SceneDefinition__Group__0__Impl_in_rule__SceneDefinition__Group__02702);
            rule__SceneDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SceneDefinition__Group__1_in_rule__SceneDefinition__Group__02705);
            rule__SceneDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Group__0"


    // $ANTLR start "rule__SceneDefinition__Group__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1388:1: rule__SceneDefinition__Group__0__Impl : ( 'The' ) ;
    public final void rule__SceneDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1392:1: ( ( 'The' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1393:1: ( 'The' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1393:1: ( 'The' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1394:1: 'The'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneDefinitionAccess().getTheKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__SceneDefinition__Group__0__Impl2733); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneDefinitionAccess().getTheKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Group__0__Impl"


    // $ANTLR start "rule__SceneDefinition__Group__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1407:1: rule__SceneDefinition__Group__1 : rule__SceneDefinition__Group__1__Impl rule__SceneDefinition__Group__2 ;
    public final void rule__SceneDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1411:1: ( rule__SceneDefinition__Group__1__Impl rule__SceneDefinition__Group__2 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1412:2: rule__SceneDefinition__Group__1__Impl rule__SceneDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__SceneDefinition__Group__1__Impl_in_rule__SceneDefinition__Group__12764);
            rule__SceneDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SceneDefinition__Group__2_in_rule__SceneDefinition__Group__12767);
            rule__SceneDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Group__1"


    // $ANTLR start "rule__SceneDefinition__Group__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1419:1: rule__SceneDefinition__Group__1__Impl : ( ( rule__SceneDefinition__NameAssignment_1 ) ) ;
    public final void rule__SceneDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1423:1: ( ( ( rule__SceneDefinition__NameAssignment_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1424:1: ( ( rule__SceneDefinition__NameAssignment_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1424:1: ( ( rule__SceneDefinition__NameAssignment_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1425:1: ( rule__SceneDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1426:1: ( rule__SceneDefinition__NameAssignment_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1426:2: rule__SceneDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SceneDefinition__NameAssignment_1_in_rule__SceneDefinition__Group__1__Impl2794);
            rule__SceneDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneDefinitionAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Group__1__Impl"


    // $ANTLR start "rule__SceneDefinition__Group__2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1436:1: rule__SceneDefinition__Group__2 : rule__SceneDefinition__Group__2__Impl rule__SceneDefinition__Group__3 ;
    public final void rule__SceneDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1440:1: ( rule__SceneDefinition__Group__2__Impl rule__SceneDefinition__Group__3 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1441:2: rule__SceneDefinition__Group__2__Impl rule__SceneDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__SceneDefinition__Group__2__Impl_in_rule__SceneDefinition__Group__22824);
            rule__SceneDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SceneDefinition__Group__3_in_rule__SceneDefinition__Group__22827);
            rule__SceneDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Group__2"


    // $ANTLR start "rule__SceneDefinition__Group__2__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1448:1: rule__SceneDefinition__Group__2__Impl : ( 'looks like' ) ;
    public final void rule__SceneDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1452:1: ( ( 'looks like' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1453:1: ( 'looks like' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1453:1: ( 'looks like' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1454:1: 'looks like'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneDefinitionAccess().getLooksLikeKeyword_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__SceneDefinition__Group__2__Impl2855); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneDefinitionAccess().getLooksLikeKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Group__2__Impl"


    // $ANTLR start "rule__SceneDefinition__Group__3"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1467:1: rule__SceneDefinition__Group__3 : rule__SceneDefinition__Group__3__Impl rule__SceneDefinition__Group__4 ;
    public final void rule__SceneDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1471:1: ( rule__SceneDefinition__Group__3__Impl rule__SceneDefinition__Group__4 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1472:2: rule__SceneDefinition__Group__3__Impl rule__SceneDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__SceneDefinition__Group__3__Impl_in_rule__SceneDefinition__Group__32886);
            rule__SceneDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SceneDefinition__Group__4_in_rule__SceneDefinition__Group__32889);
            rule__SceneDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Group__3"


    // $ANTLR start "rule__SceneDefinition__Group__3__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1479:1: rule__SceneDefinition__Group__3__Impl : ( ( rule__SceneDefinition__ImgAssignment_3 ) ) ;
    public final void rule__SceneDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1483:1: ( ( ( rule__SceneDefinition__ImgAssignment_3 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1484:1: ( ( rule__SceneDefinition__ImgAssignment_3 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1484:1: ( ( rule__SceneDefinition__ImgAssignment_3 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1485:1: ( rule__SceneDefinition__ImgAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneDefinitionAccess().getImgAssignment_3()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1486:1: ( rule__SceneDefinition__ImgAssignment_3 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1486:2: rule__SceneDefinition__ImgAssignment_3
            {
            pushFollow(FOLLOW_rule__SceneDefinition__ImgAssignment_3_in_rule__SceneDefinition__Group__3__Impl2916);
            rule__SceneDefinition__ImgAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneDefinitionAccess().getImgAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Group__3__Impl"


    // $ANTLR start "rule__SceneDefinition__Group__4"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1496:1: rule__SceneDefinition__Group__4 : rule__SceneDefinition__Group__4__Impl ;
    public final void rule__SceneDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1500:1: ( rule__SceneDefinition__Group__4__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1501:2: rule__SceneDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SceneDefinition__Group__4__Impl_in_rule__SceneDefinition__Group__42946);
            rule__SceneDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Group__4"


    // $ANTLR start "rule__SceneDefinition__Group__4__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1507:1: rule__SceneDefinition__Group__4__Impl : ( ( rule__SceneDefinition__Alternatives_4 ) ) ;
    public final void rule__SceneDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1511:1: ( ( ( rule__SceneDefinition__Alternatives_4 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1512:1: ( ( rule__SceneDefinition__Alternatives_4 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1512:1: ( ( rule__SceneDefinition__Alternatives_4 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1513:1: ( rule__SceneDefinition__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneDefinitionAccess().getAlternatives_4()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1514:1: ( rule__SceneDefinition__Alternatives_4 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1514:2: rule__SceneDefinition__Alternatives_4
            {
            pushFollow(FOLLOW_rule__SceneDefinition__Alternatives_4_in_rule__SceneDefinition__Group__4__Impl2973);
            rule__SceneDefinition__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneDefinitionAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Group__4__Impl"


    // $ANTLR start "rule__SceneDefinition__Group_4_0__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1534:1: rule__SceneDefinition__Group_4_0__0 : rule__SceneDefinition__Group_4_0__0__Impl rule__SceneDefinition__Group_4_0__1 ;
    public final void rule__SceneDefinition__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1538:1: ( rule__SceneDefinition__Group_4_0__0__Impl rule__SceneDefinition__Group_4_0__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1539:2: rule__SceneDefinition__Group_4_0__0__Impl rule__SceneDefinition__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__SceneDefinition__Group_4_0__0__Impl_in_rule__SceneDefinition__Group_4_0__03013);
            rule__SceneDefinition__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SceneDefinition__Group_4_0__1_in_rule__SceneDefinition__Group_4_0__03016);
            rule__SceneDefinition__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Group_4_0__0"


    // $ANTLR start "rule__SceneDefinition__Group_4_0__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1546:1: rule__SceneDefinition__Group_4_0__0__Impl : ( 'and in it are:' ) ;
    public final void rule__SceneDefinition__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1550:1: ( ( 'and in it are:' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1551:1: ( 'and in it are:' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1551:1: ( 'and in it are:' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1552:1: 'and in it are:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneDefinitionAccess().getAndInItAreKeyword_4_0_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__SceneDefinition__Group_4_0__0__Impl3044); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneDefinitionAccess().getAndInItAreKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Group_4_0__0__Impl"


    // $ANTLR start "rule__SceneDefinition__Group_4_0__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1565:1: rule__SceneDefinition__Group_4_0__1 : rule__SceneDefinition__Group_4_0__1__Impl ;
    public final void rule__SceneDefinition__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1569:1: ( rule__SceneDefinition__Group_4_0__1__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1570:2: rule__SceneDefinition__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SceneDefinition__Group_4_0__1__Impl_in_rule__SceneDefinition__Group_4_0__13075);
            rule__SceneDefinition__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Group_4_0__1"


    // $ANTLR start "rule__SceneDefinition__Group_4_0__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1576:1: rule__SceneDefinition__Group_4_0__1__Impl : ( ( ( rule__SceneDefinition__ItemsAssignment_4_0_1 ) ) ( ( rule__SceneDefinition__ItemsAssignment_4_0_1 )* ) ) ;
    public final void rule__SceneDefinition__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1580:1: ( ( ( ( rule__SceneDefinition__ItemsAssignment_4_0_1 ) ) ( ( rule__SceneDefinition__ItemsAssignment_4_0_1 )* ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1581:1: ( ( ( rule__SceneDefinition__ItemsAssignment_4_0_1 ) ) ( ( rule__SceneDefinition__ItemsAssignment_4_0_1 )* ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1581:1: ( ( ( rule__SceneDefinition__ItemsAssignment_4_0_1 ) ) ( ( rule__SceneDefinition__ItemsAssignment_4_0_1 )* ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1582:1: ( ( rule__SceneDefinition__ItemsAssignment_4_0_1 ) ) ( ( rule__SceneDefinition__ItemsAssignment_4_0_1 )* )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1582:1: ( ( rule__SceneDefinition__ItemsAssignment_4_0_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1583:1: ( rule__SceneDefinition__ItemsAssignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneDefinitionAccess().getItemsAssignment_4_0_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1584:1: ( rule__SceneDefinition__ItemsAssignment_4_0_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1584:2: rule__SceneDefinition__ItemsAssignment_4_0_1
            {
            pushFollow(FOLLOW_rule__SceneDefinition__ItemsAssignment_4_0_1_in_rule__SceneDefinition__Group_4_0__1__Impl3104);
            rule__SceneDefinition__ItemsAssignment_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneDefinitionAccess().getItemsAssignment_4_0_1()); 
            }

            }

            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1587:1: ( ( rule__SceneDefinition__ItemsAssignment_4_0_1 )* )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1588:1: ( rule__SceneDefinition__ItemsAssignment_4_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneDefinitionAccess().getItemsAssignment_4_0_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1589:1: ( rule__SceneDefinition__ItemsAssignment_4_0_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1589:2: rule__SceneDefinition__ItemsAssignment_4_0_1
            	    {
            	    pushFollow(FOLLOW_rule__SceneDefinition__ItemsAssignment_4_0_1_in_rule__SceneDefinition__Group_4_0__1__Impl3116);
            	    rule__SceneDefinition__ItemsAssignment_4_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneDefinitionAccess().getItemsAssignment_4_0_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__Group_4_0__1__Impl"


    // $ANTLR start "rule__ItemPositionDefinition__Group__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1604:1: rule__ItemPositionDefinition__Group__0 : rule__ItemPositionDefinition__Group__0__Impl rule__ItemPositionDefinition__Group__1 ;
    public final void rule__ItemPositionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1608:1: ( rule__ItemPositionDefinition__Group__0__Impl rule__ItemPositionDefinition__Group__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1609:2: rule__ItemPositionDefinition__Group__0__Impl rule__ItemPositionDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group__0__Impl_in_rule__ItemPositionDefinition__Group__03153);
            rule__ItemPositionDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group__1_in_rule__ItemPositionDefinition__Group__03156);
            rule__ItemPositionDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group__0"


    // $ANTLR start "rule__ItemPositionDefinition__Group__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1616:1: rule__ItemPositionDefinition__Group__0__Impl : ( '- a' ) ;
    public final void rule__ItemPositionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1620:1: ( ( '- a' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1621:1: ( '- a' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1621:1: ( '- a' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1622:1: '- a'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionAccess().getAKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__ItemPositionDefinition__Group__0__Impl3184); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionAccess().getAKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group__0__Impl"


    // $ANTLR start "rule__ItemPositionDefinition__Group__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1635:1: rule__ItemPositionDefinition__Group__1 : rule__ItemPositionDefinition__Group__1__Impl rule__ItemPositionDefinition__Group__2 ;
    public final void rule__ItemPositionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1639:1: ( rule__ItemPositionDefinition__Group__1__Impl rule__ItemPositionDefinition__Group__2 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1640:2: rule__ItemPositionDefinition__Group__1__Impl rule__ItemPositionDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group__1__Impl_in_rule__ItemPositionDefinition__Group__13215);
            rule__ItemPositionDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group__2_in_rule__ItemPositionDefinition__Group__13218);
            rule__ItemPositionDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group__1"


    // $ANTLR start "rule__ItemPositionDefinition__Group__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1647:1: rule__ItemPositionDefinition__Group__1__Impl : ( ( rule__ItemPositionDefinition__ItemAssignment_1 ) ) ;
    public final void rule__ItemPositionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1651:1: ( ( ( rule__ItemPositionDefinition__ItemAssignment_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1652:1: ( ( rule__ItemPositionDefinition__ItemAssignment_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1652:1: ( ( rule__ItemPositionDefinition__ItemAssignment_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1653:1: ( rule__ItemPositionDefinition__ItemAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionAccess().getItemAssignment_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1654:1: ( rule__ItemPositionDefinition__ItemAssignment_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1654:2: rule__ItemPositionDefinition__ItemAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemPositionDefinition__ItemAssignment_1_in_rule__ItemPositionDefinition__Group__1__Impl3245);
            rule__ItemPositionDefinition__ItemAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionAccess().getItemAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group__1__Impl"


    // $ANTLR start "rule__ItemPositionDefinition__Group__2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1664:1: rule__ItemPositionDefinition__Group__2 : rule__ItemPositionDefinition__Group__2__Impl ;
    public final void rule__ItemPositionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1668:1: ( rule__ItemPositionDefinition__Group__2__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1669:2: rule__ItemPositionDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group__2__Impl_in_rule__ItemPositionDefinition__Group__23275);
            rule__ItemPositionDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group__2"


    // $ANTLR start "rule__ItemPositionDefinition__Group__2__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1675:1: rule__ItemPositionDefinition__Group__2__Impl : ( ( rule__ItemPositionDefinition__Group_2__0 )? ) ;
    public final void rule__ItemPositionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1679:1: ( ( ( rule__ItemPositionDefinition__Group_2__0 )? ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1680:1: ( ( rule__ItemPositionDefinition__Group_2__0 )? )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1680:1: ( ( rule__ItemPositionDefinition__Group_2__0 )? )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1681:1: ( rule__ItemPositionDefinition__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionAccess().getGroup_2()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1682:1: ( rule__ItemPositionDefinition__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1682:2: rule__ItemPositionDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ItemPositionDefinition__Group_2__0_in_rule__ItemPositionDefinition__Group__2__Impl3302);
                    rule__ItemPositionDefinition__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group__2__Impl"


    // $ANTLR start "rule__ItemPositionDefinition__Group_2__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1698:1: rule__ItemPositionDefinition__Group_2__0 : rule__ItemPositionDefinition__Group_2__0__Impl rule__ItemPositionDefinition__Group_2__1 ;
    public final void rule__ItemPositionDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1702:1: ( rule__ItemPositionDefinition__Group_2__0__Impl rule__ItemPositionDefinition__Group_2__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1703:2: rule__ItemPositionDefinition__Group_2__0__Impl rule__ItemPositionDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group_2__0__Impl_in_rule__ItemPositionDefinition__Group_2__03339);
            rule__ItemPositionDefinition__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group_2__1_in_rule__ItemPositionDefinition__Group_2__03342);
            rule__ItemPositionDefinition__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group_2__0"


    // $ANTLR start "rule__ItemPositionDefinition__Group_2__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1710:1: rule__ItemPositionDefinition__Group_2__0__Impl : ( 'at' ) ;
    public final void rule__ItemPositionDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1714:1: ( ( 'at' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1715:1: ( 'at' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1715:1: ( 'at' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1716:1: 'at'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionAccess().getAtKeyword_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ItemPositionDefinition__Group_2__0__Impl3370); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionAccess().getAtKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__ItemPositionDefinition__Group_2__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1729:1: rule__ItemPositionDefinition__Group_2__1 : rule__ItemPositionDefinition__Group_2__1__Impl rule__ItemPositionDefinition__Group_2__2 ;
    public final void rule__ItemPositionDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1733:1: ( rule__ItemPositionDefinition__Group_2__1__Impl rule__ItemPositionDefinition__Group_2__2 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1734:2: rule__ItemPositionDefinition__Group_2__1__Impl rule__ItemPositionDefinition__Group_2__2
            {
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group_2__1__Impl_in_rule__ItemPositionDefinition__Group_2__13401);
            rule__ItemPositionDefinition__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group_2__2_in_rule__ItemPositionDefinition__Group_2__13404);
            rule__ItemPositionDefinition__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group_2__1"


    // $ANTLR start "rule__ItemPositionDefinition__Group_2__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1741:1: rule__ItemPositionDefinition__Group_2__1__Impl : ( '(' ) ;
    public final void rule__ItemPositionDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1745:1: ( ( '(' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1746:1: ( '(' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1746:1: ( '(' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1747:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionAccess().getLeftParenthesisKeyword_2_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__ItemPositionDefinition__Group_2__1__Impl3432); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionAccess().getLeftParenthesisKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__ItemPositionDefinition__Group_2__2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1760:1: rule__ItemPositionDefinition__Group_2__2 : rule__ItemPositionDefinition__Group_2__2__Impl rule__ItemPositionDefinition__Group_2__3 ;
    public final void rule__ItemPositionDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1764:1: ( rule__ItemPositionDefinition__Group_2__2__Impl rule__ItemPositionDefinition__Group_2__3 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1765:2: rule__ItemPositionDefinition__Group_2__2__Impl rule__ItemPositionDefinition__Group_2__3
            {
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group_2__2__Impl_in_rule__ItemPositionDefinition__Group_2__23463);
            rule__ItemPositionDefinition__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group_2__3_in_rule__ItemPositionDefinition__Group_2__23466);
            rule__ItemPositionDefinition__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group_2__2"


    // $ANTLR start "rule__ItemPositionDefinition__Group_2__2__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1772:1: rule__ItemPositionDefinition__Group_2__2__Impl : ( ( rule__ItemPositionDefinition__XposAssignment_2_2 ) ) ;
    public final void rule__ItemPositionDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1776:1: ( ( ( rule__ItemPositionDefinition__XposAssignment_2_2 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1777:1: ( ( rule__ItemPositionDefinition__XposAssignment_2_2 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1777:1: ( ( rule__ItemPositionDefinition__XposAssignment_2_2 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1778:1: ( rule__ItemPositionDefinition__XposAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionAccess().getXposAssignment_2_2()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1779:1: ( rule__ItemPositionDefinition__XposAssignment_2_2 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1779:2: rule__ItemPositionDefinition__XposAssignment_2_2
            {
            pushFollow(FOLLOW_rule__ItemPositionDefinition__XposAssignment_2_2_in_rule__ItemPositionDefinition__Group_2__2__Impl3493);
            rule__ItemPositionDefinition__XposAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionAccess().getXposAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__ItemPositionDefinition__Group_2__3"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1789:1: rule__ItemPositionDefinition__Group_2__3 : rule__ItemPositionDefinition__Group_2__3__Impl rule__ItemPositionDefinition__Group_2__4 ;
    public final void rule__ItemPositionDefinition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1793:1: ( rule__ItemPositionDefinition__Group_2__3__Impl rule__ItemPositionDefinition__Group_2__4 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1794:2: rule__ItemPositionDefinition__Group_2__3__Impl rule__ItemPositionDefinition__Group_2__4
            {
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group_2__3__Impl_in_rule__ItemPositionDefinition__Group_2__33523);
            rule__ItemPositionDefinition__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group_2__4_in_rule__ItemPositionDefinition__Group_2__33526);
            rule__ItemPositionDefinition__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group_2__3"


    // $ANTLR start "rule__ItemPositionDefinition__Group_2__3__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1801:1: rule__ItemPositionDefinition__Group_2__3__Impl : ( ',' ) ;
    public final void rule__ItemPositionDefinition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1805:1: ( ( ',' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1806:1: ( ',' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1806:1: ( ',' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1807:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionAccess().getCommaKeyword_2_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__ItemPositionDefinition__Group_2__3__Impl3554); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionAccess().getCommaKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group_2__3__Impl"


    // $ANTLR start "rule__ItemPositionDefinition__Group_2__4"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1820:1: rule__ItemPositionDefinition__Group_2__4 : rule__ItemPositionDefinition__Group_2__4__Impl rule__ItemPositionDefinition__Group_2__5 ;
    public final void rule__ItemPositionDefinition__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1824:1: ( rule__ItemPositionDefinition__Group_2__4__Impl rule__ItemPositionDefinition__Group_2__5 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1825:2: rule__ItemPositionDefinition__Group_2__4__Impl rule__ItemPositionDefinition__Group_2__5
            {
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group_2__4__Impl_in_rule__ItemPositionDefinition__Group_2__43585);
            rule__ItemPositionDefinition__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group_2__5_in_rule__ItemPositionDefinition__Group_2__43588);
            rule__ItemPositionDefinition__Group_2__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group_2__4"


    // $ANTLR start "rule__ItemPositionDefinition__Group_2__4__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1832:1: rule__ItemPositionDefinition__Group_2__4__Impl : ( ( rule__ItemPositionDefinition__YposAssignment_2_4 ) ) ;
    public final void rule__ItemPositionDefinition__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1836:1: ( ( ( rule__ItemPositionDefinition__YposAssignment_2_4 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1837:1: ( ( rule__ItemPositionDefinition__YposAssignment_2_4 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1837:1: ( ( rule__ItemPositionDefinition__YposAssignment_2_4 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1838:1: ( rule__ItemPositionDefinition__YposAssignment_2_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionAccess().getYposAssignment_2_4()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1839:1: ( rule__ItemPositionDefinition__YposAssignment_2_4 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1839:2: rule__ItemPositionDefinition__YposAssignment_2_4
            {
            pushFollow(FOLLOW_rule__ItemPositionDefinition__YposAssignment_2_4_in_rule__ItemPositionDefinition__Group_2__4__Impl3615);
            rule__ItemPositionDefinition__YposAssignment_2_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionAccess().getYposAssignment_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group_2__4__Impl"


    // $ANTLR start "rule__ItemPositionDefinition__Group_2__5"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1849:1: rule__ItemPositionDefinition__Group_2__5 : rule__ItemPositionDefinition__Group_2__5__Impl ;
    public final void rule__ItemPositionDefinition__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1853:1: ( rule__ItemPositionDefinition__Group_2__5__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1854:2: rule__ItemPositionDefinition__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__ItemPositionDefinition__Group_2__5__Impl_in_rule__ItemPositionDefinition__Group_2__53645);
            rule__ItemPositionDefinition__Group_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group_2__5"


    // $ANTLR start "rule__ItemPositionDefinition__Group_2__5__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1860:1: rule__ItemPositionDefinition__Group_2__5__Impl : ( ')' ) ;
    public final void rule__ItemPositionDefinition__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1864:1: ( ( ')' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1865:1: ( ')' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1865:1: ( ')' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1866:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionAccess().getRightParenthesisKeyword_2_5()); 
            }
            match(input,32,FOLLOW_32_in_rule__ItemPositionDefinition__Group_2__5__Impl3673); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionAccess().getRightParenthesisKeyword_2_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__Group_2__5__Impl"


    // $ANTLR start "rule__StartDefinition__Group__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1891:1: rule__StartDefinition__Group__0 : rule__StartDefinition__Group__0__Impl rule__StartDefinition__Group__1 ;
    public final void rule__StartDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1895:1: ( rule__StartDefinition__Group__0__Impl rule__StartDefinition__Group__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1896:2: rule__StartDefinition__Group__0__Impl rule__StartDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__StartDefinition__Group__0__Impl_in_rule__StartDefinition__Group__03716);
            rule__StartDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StartDefinition__Group__1_in_rule__StartDefinition__Group__03719);
            rule__StartDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group__0"


    // $ANTLR start "rule__StartDefinition__Group__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1903:1: rule__StartDefinition__Group__0__Impl : ( 'In the beginning you:' ) ;
    public final void rule__StartDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1907:1: ( ( 'In the beginning you:' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1908:1: ( 'In the beginning you:' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1908:1: ( 'In the beginning you:' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1909:1: 'In the beginning you:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getInTheBeginningYouKeyword_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__StartDefinition__Group__0__Impl3747); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getInTheBeginningYouKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group__0__Impl"


    // $ANTLR start "rule__StartDefinition__Group__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1922:1: rule__StartDefinition__Group__1 : rule__StartDefinition__Group__1__Impl ;
    public final void rule__StartDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1926:1: ( rule__StartDefinition__Group__1__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1927:2: rule__StartDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StartDefinition__Group__1__Impl_in_rule__StartDefinition__Group__13778);
            rule__StartDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group__1"


    // $ANTLR start "rule__StartDefinition__Group__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1933:1: rule__StartDefinition__Group__1__Impl : ( ( rule__StartDefinition__UnorderedGroup_1 ) ) ;
    public final void rule__StartDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1937:1: ( ( ( rule__StartDefinition__UnorderedGroup_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1938:1: ( ( rule__StartDefinition__UnorderedGroup_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1938:1: ( ( rule__StartDefinition__UnorderedGroup_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1939:1: ( rule__StartDefinition__UnorderedGroup_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1940:1: ( rule__StartDefinition__UnorderedGroup_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1940:2: rule__StartDefinition__UnorderedGroup_1
            {
            pushFollow(FOLLOW_rule__StartDefinition__UnorderedGroup_1_in_rule__StartDefinition__Group__1__Impl3805);
            rule__StartDefinition__UnorderedGroup_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group__1__Impl"


    // $ANTLR start "rule__StartDefinition__Group_1_0__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1954:1: rule__StartDefinition__Group_1_0__0 : rule__StartDefinition__Group_1_0__0__Impl rule__StartDefinition__Group_1_0__1 ;
    public final void rule__StartDefinition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1958:1: ( rule__StartDefinition__Group_1_0__0__Impl rule__StartDefinition__Group_1_0__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1959:2: rule__StartDefinition__Group_1_0__0__Impl rule__StartDefinition__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__StartDefinition__Group_1_0__0__Impl_in_rule__StartDefinition__Group_1_0__03839);
            rule__StartDefinition__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StartDefinition__Group_1_0__1_in_rule__StartDefinition__Group_1_0__03842);
            rule__StartDefinition__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group_1_0__0"


    // $ANTLR start "rule__StartDefinition__Group_1_0__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1966:1: rule__StartDefinition__Group_1_0__0__Impl : ( '- are at the' ) ;
    public final void rule__StartDefinition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1970:1: ( ( '- are at the' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1971:1: ( '- are at the' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1971:1: ( '- are at the' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1972:1: '- are at the'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getAreAtTheKeyword_1_0_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__StartDefinition__Group_1_0__0__Impl3870); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getAreAtTheKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group_1_0__0__Impl"


    // $ANTLR start "rule__StartDefinition__Group_1_0__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1985:1: rule__StartDefinition__Group_1_0__1 : rule__StartDefinition__Group_1_0__1__Impl ;
    public final void rule__StartDefinition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1989:1: ( rule__StartDefinition__Group_1_0__1__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1990:2: rule__StartDefinition__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__StartDefinition__Group_1_0__1__Impl_in_rule__StartDefinition__Group_1_0__13901);
            rule__StartDefinition__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group_1_0__1"


    // $ANTLR start "rule__StartDefinition__Group_1_0__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:1996:1: rule__StartDefinition__Group_1_0__1__Impl : ( ( rule__StartDefinition__StartLocAssignment_1_0_1 ) ) ;
    public final void rule__StartDefinition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2000:1: ( ( ( rule__StartDefinition__StartLocAssignment_1_0_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2001:1: ( ( rule__StartDefinition__StartLocAssignment_1_0_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2001:1: ( ( rule__StartDefinition__StartLocAssignment_1_0_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2002:1: ( rule__StartDefinition__StartLocAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getStartLocAssignment_1_0_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2003:1: ( rule__StartDefinition__StartLocAssignment_1_0_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2003:2: rule__StartDefinition__StartLocAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__StartDefinition__StartLocAssignment_1_0_1_in_rule__StartDefinition__Group_1_0__1__Impl3928);
            rule__StartDefinition__StartLocAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getStartLocAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group_1_0__1__Impl"


    // $ANTLR start "rule__StartDefinition__Group_1_1__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2017:1: rule__StartDefinition__Group_1_1__0 : rule__StartDefinition__Group_1_1__0__Impl rule__StartDefinition__Group_1_1__1 ;
    public final void rule__StartDefinition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2021:1: ( rule__StartDefinition__Group_1_1__0__Impl rule__StartDefinition__Group_1_1__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2022:2: rule__StartDefinition__Group_1_1__0__Impl rule__StartDefinition__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__StartDefinition__Group_1_1__0__Impl_in_rule__StartDefinition__Group_1_1__03962);
            rule__StartDefinition__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StartDefinition__Group_1_1__1_in_rule__StartDefinition__Group_1_1__03965);
            rule__StartDefinition__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group_1_1__0"


    // $ANTLR start "rule__StartDefinition__Group_1_1__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2029:1: rule__StartDefinition__Group_1_1__0__Impl : ( '- have' ) ;
    public final void rule__StartDefinition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2033:1: ( ( '- have' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2034:1: ( '- have' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2034:1: ( '- have' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2035:1: '- have'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getHaveKeyword_1_1_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__StartDefinition__Group_1_1__0__Impl3993); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getHaveKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group_1_1__0__Impl"


    // $ANTLR start "rule__StartDefinition__Group_1_1__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2048:1: rule__StartDefinition__Group_1_1__1 : rule__StartDefinition__Group_1_1__1__Impl rule__StartDefinition__Group_1_1__2 ;
    public final void rule__StartDefinition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2052:1: ( rule__StartDefinition__Group_1_1__1__Impl rule__StartDefinition__Group_1_1__2 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2053:2: rule__StartDefinition__Group_1_1__1__Impl rule__StartDefinition__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__StartDefinition__Group_1_1__1__Impl_in_rule__StartDefinition__Group_1_1__14024);
            rule__StartDefinition__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StartDefinition__Group_1_1__2_in_rule__StartDefinition__Group_1_1__14027);
            rule__StartDefinition__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group_1_1__1"


    // $ANTLR start "rule__StartDefinition__Group_1_1__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2060:1: rule__StartDefinition__Group_1_1__1__Impl : ( ( rule__StartDefinition__StartItemsAssignment_1_1_1 ) ) ;
    public final void rule__StartDefinition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2064:1: ( ( ( rule__StartDefinition__StartItemsAssignment_1_1_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2065:1: ( ( rule__StartDefinition__StartItemsAssignment_1_1_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2065:1: ( ( rule__StartDefinition__StartItemsAssignment_1_1_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2066:1: ( rule__StartDefinition__StartItemsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getStartItemsAssignment_1_1_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2067:1: ( rule__StartDefinition__StartItemsAssignment_1_1_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2067:2: rule__StartDefinition__StartItemsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__StartDefinition__StartItemsAssignment_1_1_1_in_rule__StartDefinition__Group_1_1__1__Impl4054);
            rule__StartDefinition__StartItemsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getStartItemsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group_1_1__1__Impl"


    // $ANTLR start "rule__StartDefinition__Group_1_1__2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2077:1: rule__StartDefinition__Group_1_1__2 : rule__StartDefinition__Group_1_1__2__Impl ;
    public final void rule__StartDefinition__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2081:1: ( rule__StartDefinition__Group_1_1__2__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2082:2: rule__StartDefinition__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__StartDefinition__Group_1_1__2__Impl_in_rule__StartDefinition__Group_1_1__24084);
            rule__StartDefinition__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group_1_1__2"


    // $ANTLR start "rule__StartDefinition__Group_1_1__2__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2088:1: rule__StartDefinition__Group_1_1__2__Impl : ( ( rule__StartDefinition__Group_1_1_2__0 )* ) ;
    public final void rule__StartDefinition__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2092:1: ( ( ( rule__StartDefinition__Group_1_1_2__0 )* ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2093:1: ( ( rule__StartDefinition__Group_1_1_2__0 )* )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2093:1: ( ( rule__StartDefinition__Group_1_1_2__0 )* )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2094:1: ( rule__StartDefinition__Group_1_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getGroup_1_1_2()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2095:1: ( rule__StartDefinition__Group_1_1_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2095:2: rule__StartDefinition__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StartDefinition__Group_1_1_2__0_in_rule__StartDefinition__Group_1_1__2__Impl4111);
            	    rule__StartDefinition__Group_1_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getGroup_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group_1_1__2__Impl"


    // $ANTLR start "rule__StartDefinition__Group_1_1_2__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2111:1: rule__StartDefinition__Group_1_1_2__0 : rule__StartDefinition__Group_1_1_2__0__Impl rule__StartDefinition__Group_1_1_2__1 ;
    public final void rule__StartDefinition__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2115:1: ( rule__StartDefinition__Group_1_1_2__0__Impl rule__StartDefinition__Group_1_1_2__1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2116:2: rule__StartDefinition__Group_1_1_2__0__Impl rule__StartDefinition__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__StartDefinition__Group_1_1_2__0__Impl_in_rule__StartDefinition__Group_1_1_2__04148);
            rule__StartDefinition__Group_1_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__StartDefinition__Group_1_1_2__1_in_rule__StartDefinition__Group_1_1_2__04151);
            rule__StartDefinition__Group_1_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group_1_1_2__0"


    // $ANTLR start "rule__StartDefinition__Group_1_1_2__0__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2123:1: rule__StartDefinition__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__StartDefinition__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2127:1: ( ( ',' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2128:1: ( ',' )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2128:1: ( ',' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2129:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getCommaKeyword_1_1_2_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__StartDefinition__Group_1_1_2__0__Impl4179); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getCommaKeyword_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__StartDefinition__Group_1_1_2__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2142:1: rule__StartDefinition__Group_1_1_2__1 : rule__StartDefinition__Group_1_1_2__1__Impl ;
    public final void rule__StartDefinition__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2146:1: ( rule__StartDefinition__Group_1_1_2__1__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2147:2: rule__StartDefinition__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StartDefinition__Group_1_1_2__1__Impl_in_rule__StartDefinition__Group_1_1_2__14210);
            rule__StartDefinition__Group_1_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group_1_1_2__1"


    // $ANTLR start "rule__StartDefinition__Group_1_1_2__1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2153:1: rule__StartDefinition__Group_1_1_2__1__Impl : ( ( rule__StartDefinition__StartItemsAssignment_1_1_2_1 ) ) ;
    public final void rule__StartDefinition__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2157:1: ( ( ( rule__StartDefinition__StartItemsAssignment_1_1_2_1 ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2158:1: ( ( rule__StartDefinition__StartItemsAssignment_1_1_2_1 ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2158:1: ( ( rule__StartDefinition__StartItemsAssignment_1_1_2_1 ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2159:1: ( rule__StartDefinition__StartItemsAssignment_1_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getStartItemsAssignment_1_1_2_1()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2160:1: ( rule__StartDefinition__StartItemsAssignment_1_1_2_1 )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2160:2: rule__StartDefinition__StartItemsAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_rule__StartDefinition__StartItemsAssignment_1_1_2_1_in_rule__StartDefinition__Group_1_1_2__1__Impl4237);
            rule__StartDefinition__StartItemsAssignment_1_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getStartItemsAssignment_1_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__Adventure__UnorderedGroup_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2175:1: rule__Adventure__UnorderedGroup_1 : rule__Adventure__UnorderedGroup_1__0 {...}?;
    public final void rule__Adventure__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAdventureAccess().getUnorderedGroup_1());
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2180:1: ( rule__Adventure__UnorderedGroup_1__0 {...}?)
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2181:2: rule__Adventure__UnorderedGroup_1__0 {...}?
            {
            pushFollow(FOLLOW_rule__Adventure__UnorderedGroup_1__0_in_rule__Adventure__UnorderedGroup_14272);
            rule__Adventure__UnorderedGroup_1__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_1()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getAdventureAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__UnorderedGroup_1"


    // $ANTLR start "rule__Adventure__UnorderedGroup_1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2192:1: rule__Adventure__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( ( rule__Adventure__ItemDefAssignment_1_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__SceneDefAssignment_1_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )* ) ) ) ) ) ;
    public final void rule__Adventure__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2197:1: ( ( ({...}? => ( ( ( ( rule__Adventure__ItemDefAssignment_1_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__SceneDefAssignment_1_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )* ) ) ) ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2198:3: ( ({...}? => ( ( ( ( rule__Adventure__ItemDefAssignment_1_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__SceneDefAssignment_1_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )* ) ) ) ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2198:3: ( ({...}? => ( ( ( ( rule__Adventure__ItemDefAssignment_1_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__SceneDefAssignment_1_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )* ) ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 >=11 && LA14_0<=12 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2200:4: ({...}? => ( ( ( ( rule__Adventure__ItemDefAssignment_1_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )* ) ) ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2200:4: ({...}? => ( ( ( ( rule__Adventure__ItemDefAssignment_1_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )* ) ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2201:5: {...}? => ( ( ( ( rule__Adventure__ItemDefAssignment_1_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2201:106: ( ( ( ( rule__Adventure__ItemDefAssignment_1_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )* ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2202:6: ( ( ( rule__Adventure__ItemDefAssignment_1_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0);
                    selected = true;
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2208:6: ( ( ( rule__Adventure__ItemDefAssignment_1_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )* ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2209:6: ( ( rule__Adventure__ItemDefAssignment_1_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )* )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2209:6: ( ( rule__Adventure__ItemDefAssignment_1_0 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2210:7: ( rule__Adventure__ItemDefAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getItemDefAssignment_1_0()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2211:7: ( rule__Adventure__ItemDefAssignment_1_0 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2211:8: rule__Adventure__ItemDefAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Adventure__ItemDefAssignment_1_0_in_rule__Adventure__UnorderedGroup_1__Impl4362);
                    rule__Adventure__ItemDefAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdventureAccess().getItemDefAssignment_1_0()); 
                    }

                    }

                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2214:6: ( ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )* )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2215:7: ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getItemDefAssignment_1_0()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2216:7: ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )*
                    loop12:
                    do {
                        int alt12=2;
                        alt12 = dfa12.predict(input);
                        switch (alt12) {
                    	case 1 :
                    	    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2216:8: ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0
                    	    {
                    	    pushFollow(FOLLOW_rule__Adventure__ItemDefAssignment_1_0_in_rule__Adventure__UnorderedGroup_1__Impl4406);
                    	    rule__Adventure__ItemDefAssignment_1_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdventureAccess().getItemDefAssignment_1_0()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2222:4: ({...}? => ( ( ( ( rule__Adventure__SceneDefAssignment_1_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )* ) ) ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2222:4: ({...}? => ( ( ( ( rule__Adventure__SceneDefAssignment_1_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )* ) ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2223:5: {...}? => ( ( ( ( rule__Adventure__SceneDefAssignment_1_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2223:106: ( ( ( ( rule__Adventure__SceneDefAssignment_1_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )* ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2224:6: ( ( ( rule__Adventure__SceneDefAssignment_1_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1);
                    selected = true;
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2230:6: ( ( ( rule__Adventure__SceneDefAssignment_1_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )* ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2231:6: ( ( rule__Adventure__SceneDefAssignment_1_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )* )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2231:6: ( ( rule__Adventure__SceneDefAssignment_1_1 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2232:7: ( rule__Adventure__SceneDefAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getSceneDefAssignment_1_1()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2233:7: ( rule__Adventure__SceneDefAssignment_1_1 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2233:8: rule__Adventure__SceneDefAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Adventure__SceneDefAssignment_1_1_in_rule__Adventure__UnorderedGroup_1__Impl4505);
                    rule__Adventure__SceneDefAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdventureAccess().getSceneDefAssignment_1_1()); 
                    }

                    }

                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2236:6: ( ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )* )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2237:7: ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getSceneDefAssignment_1_1()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2238:7: ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )*
                    loop13:
                    do {
                        int alt13=2;
                        alt13 = dfa13.predict(input);
                        switch (alt13) {
                    	case 1 :
                    	    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2238:8: ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1
                    	    {
                    	    pushFollow(FOLLOW_rule__Adventure__SceneDefAssignment_1_1_in_rule__Adventure__UnorderedGroup_1__Impl4549);
                    	    rule__Adventure__SceneDefAssignment_1_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdventureAccess().getSceneDefAssignment_1_1()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__Adventure__UnorderedGroup_1__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2253:1: rule__Adventure__UnorderedGroup_1__0 : rule__Adventure__UnorderedGroup_1__Impl ( rule__Adventure__UnorderedGroup_1__1 )? ;
    public final void rule__Adventure__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2257:1: ( rule__Adventure__UnorderedGroup_1__Impl ( rule__Adventure__UnorderedGroup_1__1 )? )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2258:2: rule__Adventure__UnorderedGroup_1__Impl ( rule__Adventure__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_rule__Adventure__UnorderedGroup_1__Impl_in_rule__Adventure__UnorderedGroup_1__04615);
            rule__Adventure__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2259:2: ( rule__Adventure__UnorderedGroup_1__1 )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2259:2: rule__Adventure__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_rule__Adventure__UnorderedGroup_1__1_in_rule__Adventure__UnorderedGroup_1__04618);
                    rule__Adventure__UnorderedGroup_1__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__UnorderedGroup_1__0"


    // $ANTLR start "rule__Adventure__UnorderedGroup_1__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2266:1: rule__Adventure__UnorderedGroup_1__1 : rule__Adventure__UnorderedGroup_1__Impl ;
    public final void rule__Adventure__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2270:1: ( rule__Adventure__UnorderedGroup_1__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2271:2: rule__Adventure__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_rule__Adventure__UnorderedGroup_1__Impl_in_rule__Adventure__UnorderedGroup_1__14643);
            rule__Adventure__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__UnorderedGroup_1__1"


    // $ANTLR start "rule__Adventure__UnorderedGroup_3"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2282:1: rule__Adventure__UnorderedGroup_3 : rule__Adventure__UnorderedGroup_3__0 {...}?;
    public final void rule__Adventure__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAdventureAccess().getUnorderedGroup_3());
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2287:1: ( rule__Adventure__UnorderedGroup_3__0 {...}?)
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2288:2: rule__Adventure__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__Adventure__UnorderedGroup_3__0_in_rule__Adventure__UnorderedGroup_34671);
            rule__Adventure__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getAdventureAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__UnorderedGroup_3"


    // $ANTLR start "rule__Adventure__UnorderedGroup_3__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2299:1: rule__Adventure__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( ( rule__Adventure__ItemDefAssignment_3_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__SceneDefAssignment_3_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )* ) ) ) ) ) ;
    public final void rule__Adventure__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2304:1: ( ( ({...}? => ( ( ( ( rule__Adventure__ItemDefAssignment_3_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__SceneDefAssignment_3_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )* ) ) ) ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2305:3: ( ({...}? => ( ( ( ( rule__Adventure__ItemDefAssignment_3_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__SceneDefAssignment_3_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )* ) ) ) ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2305:3: ( ({...}? => ( ( ( ( rule__Adventure__ItemDefAssignment_3_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Adventure__SceneDefAssignment_3_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )* ) ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 >=11 && LA18_0<=12 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2307:4: ({...}? => ( ( ( ( rule__Adventure__ItemDefAssignment_3_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )* ) ) ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2307:4: ({...}? => ( ( ( ( rule__Adventure__ItemDefAssignment_3_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )* ) ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2308:5: {...}? => ( ( ( ( rule__Adventure__ItemDefAssignment_3_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2308:106: ( ( ( ( rule__Adventure__ItemDefAssignment_3_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )* ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2309:6: ( ( ( rule__Adventure__ItemDefAssignment_3_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2315:6: ( ( ( rule__Adventure__ItemDefAssignment_3_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )* ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2316:6: ( ( rule__Adventure__ItemDefAssignment_3_0 ) ) ( ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )* )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2316:6: ( ( rule__Adventure__ItemDefAssignment_3_0 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2317:7: ( rule__Adventure__ItemDefAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getItemDefAssignment_3_0()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2318:7: ( rule__Adventure__ItemDefAssignment_3_0 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2318:8: rule__Adventure__ItemDefAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Adventure__ItemDefAssignment_3_0_in_rule__Adventure__UnorderedGroup_3__Impl4761);
                    rule__Adventure__ItemDefAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdventureAccess().getItemDefAssignment_3_0()); 
                    }

                    }

                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2321:6: ( ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )* )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2322:7: ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getItemDefAssignment_3_0()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2323:7: ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )*
                    loop16:
                    do {
                        int alt16=2;
                        alt16 = dfa16.predict(input);
                        switch (alt16) {
                    	case 1 :
                    	    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2323:8: ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0
                    	    {
                    	    pushFollow(FOLLOW_rule__Adventure__ItemDefAssignment_3_0_in_rule__Adventure__UnorderedGroup_3__Impl4805);
                    	    rule__Adventure__ItemDefAssignment_3_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdventureAccess().getItemDefAssignment_3_0()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2329:4: ({...}? => ( ( ( ( rule__Adventure__SceneDefAssignment_3_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )* ) ) ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2329:4: ({...}? => ( ( ( ( rule__Adventure__SceneDefAssignment_3_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )* ) ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2330:5: {...}? => ( ( ( ( rule__Adventure__SceneDefAssignment_3_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Adventure__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2330:106: ( ( ( ( rule__Adventure__SceneDefAssignment_3_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )* ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2331:6: ( ( ( rule__Adventure__SceneDefAssignment_3_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2337:6: ( ( ( rule__Adventure__SceneDefAssignment_3_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )* ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2338:6: ( ( rule__Adventure__SceneDefAssignment_3_1 ) ) ( ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )* )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2338:6: ( ( rule__Adventure__SceneDefAssignment_3_1 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2339:7: ( rule__Adventure__SceneDefAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getSceneDefAssignment_3_1()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2340:7: ( rule__Adventure__SceneDefAssignment_3_1 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2340:8: rule__Adventure__SceneDefAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Adventure__SceneDefAssignment_3_1_in_rule__Adventure__UnorderedGroup_3__Impl4904);
                    rule__Adventure__SceneDefAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdventureAccess().getSceneDefAssignment_3_1()); 
                    }

                    }

                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2343:6: ( ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )* )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2344:7: ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdventureAccess().getSceneDefAssignment_3_1()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2345:7: ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )*
                    loop17:
                    do {
                        int alt17=2;
                        alt17 = dfa17.predict(input);
                        switch (alt17) {
                    	case 1 :
                    	    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2345:8: ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1
                    	    {
                    	    pushFollow(FOLLOW_rule__Adventure__SceneDefAssignment_3_1_in_rule__Adventure__UnorderedGroup_3__Impl4948);
                    	    rule__Adventure__SceneDefAssignment_3_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdventureAccess().getSceneDefAssignment_3_1()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Adventure__UnorderedGroup_3__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2360:1: rule__Adventure__UnorderedGroup_3__0 : rule__Adventure__UnorderedGroup_3__Impl ( rule__Adventure__UnorderedGroup_3__1 )? ;
    public final void rule__Adventure__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2364:1: ( rule__Adventure__UnorderedGroup_3__Impl ( rule__Adventure__UnorderedGroup_3__1 )? )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2365:2: rule__Adventure__UnorderedGroup_3__Impl ( rule__Adventure__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__Adventure__UnorderedGroup_3__Impl_in_rule__Adventure__UnorderedGroup_3__05014);
            rule__Adventure__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2366:2: ( rule__Adventure__UnorderedGroup_3__1 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2366:2: rule__Adventure__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__Adventure__UnorderedGroup_3__1_in_rule__Adventure__UnorderedGroup_3__05017);
                    rule__Adventure__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__UnorderedGroup_3__0"


    // $ANTLR start "rule__Adventure__UnorderedGroup_3__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2373:1: rule__Adventure__UnorderedGroup_3__1 : rule__Adventure__UnorderedGroup_3__Impl ;
    public final void rule__Adventure__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2377:1: ( rule__Adventure__UnorderedGroup_3__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2378:2: rule__Adventure__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__Adventure__UnorderedGroup_3__Impl_in_rule__Adventure__UnorderedGroup_3__15042);
            rule__Adventure__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__UnorderedGroup_3__1"


    // $ANTLR start "rule__ItemDefinition__UnorderedGroup_3"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2389:1: rule__ItemDefinition__UnorderedGroup_3 : rule__ItemDefinition__UnorderedGroup_3__0 {...}?;
    public final void rule__ItemDefinition__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3());
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2394:1: ( rule__ItemDefinition__UnorderedGroup_3__0 {...}?)
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2395:2: rule__ItemDefinition__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__ItemDefinition__UnorderedGroup_3__0_in_rule__ItemDefinition__UnorderedGroup_35070);
            rule__ItemDefinition__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__ItemDefinition__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__UnorderedGroup_3"


    // $ANTLR start "rule__ItemDefinition__UnorderedGroup_3__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2406:1: rule__ItemDefinition__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ItemDefinition__PickupAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ItemDefinition__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__ItemDefinition__UsesAssignment_3_2 ) ) ( ( ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2 )* ) ) ) ) ) ;
    public final void rule__ItemDefinition__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2411:1: ( ( ({...}? => ( ( ( rule__ItemDefinition__PickupAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ItemDefinition__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__ItemDefinition__UsesAssignment_3_2 ) ) ( ( ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2 )* ) ) ) ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2412:3: ( ({...}? => ( ( ( rule__ItemDefinition__PickupAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ItemDefinition__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__ItemDefinition__UsesAssignment_3_2 ) ) ( ( ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2 )* ) ) ) ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2412:3: ( ({...}? => ( ( ( rule__ItemDefinition__PickupAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ItemDefinition__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__ItemDefinition__UsesAssignment_3_2 ) ) ( ( ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2 )* ) ) ) ) )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( LA21_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt21=2;
            }
            else if ( LA21_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                alt21=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2414:4: ({...}? => ( ( ( rule__ItemDefinition__PickupAssignment_3_0 ) ) ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2414:4: ({...}? => ( ( ( rule__ItemDefinition__PickupAssignment_3_0 ) ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2415:5: {...}? => ( ( ( rule__ItemDefinition__PickupAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ItemDefinition__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2415:111: ( ( ( rule__ItemDefinition__PickupAssignment_3_0 ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2416:6: ( ( rule__ItemDefinition__PickupAssignment_3_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2422:6: ( ( rule__ItemDefinition__PickupAssignment_3_0 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2424:7: ( rule__ItemDefinition__PickupAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemDefinitionAccess().getPickupAssignment_3_0()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2425:7: ( rule__ItemDefinition__PickupAssignment_3_0 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2425:8: rule__ItemDefinition__PickupAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__ItemDefinition__PickupAssignment_3_0_in_rule__ItemDefinition__UnorderedGroup_3__Impl5159);
                    rule__ItemDefinition__PickupAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getItemDefinitionAccess().getPickupAssignment_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2431:4: ({...}? => ( ( ( rule__ItemDefinition__Group_3_1__0 ) ) ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2431:4: ({...}? => ( ( ( rule__ItemDefinition__Group_3_1__0 ) ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2432:5: {...}? => ( ( ( rule__ItemDefinition__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ItemDefinition__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2432:111: ( ( ( rule__ItemDefinition__Group_3_1__0 ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2433:6: ( ( rule__ItemDefinition__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2439:6: ( ( rule__ItemDefinition__Group_3_1__0 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2441:7: ( rule__ItemDefinition__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemDefinitionAccess().getGroup_3_1()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2442:7: ( rule__ItemDefinition__Group_3_1__0 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2442:8: rule__ItemDefinition__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__ItemDefinition__Group_3_1__0_in_rule__ItemDefinition__UnorderedGroup_3__Impl5250);
                    rule__ItemDefinition__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getItemDefinitionAccess().getGroup_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2448:4: ({...}? => ( ( ( ( rule__ItemDefinition__UsesAssignment_3_2 ) ) ( ( ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2 )* ) ) ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2448:4: ({...}? => ( ( ( ( rule__ItemDefinition__UsesAssignment_3_2 ) ) ( ( ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2 )* ) ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2449:5: {...}? => ( ( ( ( rule__ItemDefinition__UsesAssignment_3_2 ) ) ( ( ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ItemDefinition__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2449:111: ( ( ( ( rule__ItemDefinition__UsesAssignment_3_2 ) ) ( ( ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2 )* ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2450:6: ( ( ( rule__ItemDefinition__UsesAssignment_3_2 ) ) ( ( ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2456:6: ( ( ( rule__ItemDefinition__UsesAssignment_3_2 ) ) ( ( ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2 )* ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2457:6: ( ( rule__ItemDefinition__UsesAssignment_3_2 ) ) ( ( ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2 )* )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2457:6: ( ( rule__ItemDefinition__UsesAssignment_3_2 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2458:7: ( rule__ItemDefinition__UsesAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemDefinitionAccess().getUsesAssignment_3_2()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2459:7: ( rule__ItemDefinition__UsesAssignment_3_2 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2459:8: rule__ItemDefinition__UsesAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__ItemDefinition__UsesAssignment_3_2_in_rule__ItemDefinition__UnorderedGroup_3__Impl5342);
                    rule__ItemDefinition__UsesAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getItemDefinitionAccess().getUsesAssignment_3_2()); 
                    }

                    }

                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2462:6: ( ( ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2 )* )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2463:7: ( ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getItemDefinitionAccess().getUsesAssignment_3_2()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2464:7: ( ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2 )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==16) ) {
                            int LA20_2 = input.LA(2);

                            if ( (LA20_2==RULE_STRING) ) {
                                int LA20_3 = input.LA(3);

                                if ( (LA20_3==17) ) {
                                    int LA20_4 = input.LA(4);

                                    if ( (LA20_4==18) ) {
                                        int LA20_5 = input.LA(5);

                                        if ( (synpred5_InternalGreatAdventure()) ) {
                                            alt20=1;
                                        }


                                    }


                                }
                                else if ( (LA20_3==18) ) {
                                    int LA20_5 = input.LA(4);

                                    if ( (synpred5_InternalGreatAdventure()) ) {
                                        alt20=1;
                                    }


                                }


                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2464:8: ( rule__ItemDefinition__UsesAssignment_3_2 )=> rule__ItemDefinition__UsesAssignment_3_2
                    	    {
                    	    pushFollow(FOLLOW_rule__ItemDefinition__UsesAssignment_3_2_in_rule__ItemDefinition__UnorderedGroup_3__Impl5386);
                    	    rule__ItemDefinition__UsesAssignment_3_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getItemDefinitionAccess().getUsesAssignment_3_2()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__ItemDefinition__UnorderedGroup_3__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2479:1: rule__ItemDefinition__UnorderedGroup_3__0 : rule__ItemDefinition__UnorderedGroup_3__Impl ( rule__ItemDefinition__UnorderedGroup_3__1 )? ;
    public final void rule__ItemDefinition__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2483:1: ( rule__ItemDefinition__UnorderedGroup_3__Impl ( rule__ItemDefinition__UnorderedGroup_3__1 )? )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2484:2: rule__ItemDefinition__UnorderedGroup_3__Impl ( rule__ItemDefinition__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__ItemDefinition__UnorderedGroup_3__Impl_in_rule__ItemDefinition__UnorderedGroup_3__05452);
            rule__ItemDefinition__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2485:2: ( rule__ItemDefinition__UnorderedGroup_3__1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2485:2: rule__ItemDefinition__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__ItemDefinition__UnorderedGroup_3__1_in_rule__ItemDefinition__UnorderedGroup_3__05455);
                    rule__ItemDefinition__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__UnorderedGroup_3__0"


    // $ANTLR start "rule__ItemDefinition__UnorderedGroup_3__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2492:1: rule__ItemDefinition__UnorderedGroup_3__1 : rule__ItemDefinition__UnorderedGroup_3__Impl ( rule__ItemDefinition__UnorderedGroup_3__2 )? ;
    public final void rule__ItemDefinition__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2496:1: ( rule__ItemDefinition__UnorderedGroup_3__Impl ( rule__ItemDefinition__UnorderedGroup_3__2 )? )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2497:2: rule__ItemDefinition__UnorderedGroup_3__Impl ( rule__ItemDefinition__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__ItemDefinition__UnorderedGroup_3__Impl_in_rule__ItemDefinition__UnorderedGroup_3__15480);
            rule__ItemDefinition__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2498:2: ( rule__ItemDefinition__UnorderedGroup_3__2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2498:2: rule__ItemDefinition__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__ItemDefinition__UnorderedGroup_3__2_in_rule__ItemDefinition__UnorderedGroup_3__15483);
                    rule__ItemDefinition__UnorderedGroup_3__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__UnorderedGroup_3__1"


    // $ANTLR start "rule__ItemDefinition__UnorderedGroup_3__2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2505:1: rule__ItemDefinition__UnorderedGroup_3__2 : rule__ItemDefinition__UnorderedGroup_3__Impl ;
    public final void rule__ItemDefinition__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2509:1: ( rule__ItemDefinition__UnorderedGroup_3__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2510:2: rule__ItemDefinition__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__ItemDefinition__UnorderedGroup_3__Impl_in_rule__ItemDefinition__UnorderedGroup_3__25508);
            rule__ItemDefinition__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__UnorderedGroup_3__2"


    // $ANTLR start "rule__UseDefinition__UnorderedGroup_4"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2523:1: rule__UseDefinition__UnorderedGroup_4 : ( rule__UseDefinition__UnorderedGroup_4__0 )? ;
    public final void rule__UseDefinition__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2528:1: ( ( rule__UseDefinition__UnorderedGroup_4__0 )? )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2529:2: ( rule__UseDefinition__UnorderedGroup_4__0 )?
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2529:2: ( rule__UseDefinition__UnorderedGroup_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt24=1;
            }
            else if ( LA24_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt24=1;
            }
            else if ( LA24_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2529:2: rule__UseDefinition__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__UseDefinition__UnorderedGroup_4__0_in_rule__UseDefinition__UnorderedGroup_45538);
                    rule__UseDefinition__UnorderedGroup_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__UnorderedGroup_4"


    // $ANTLR start "rule__UseDefinition__UnorderedGroup_4__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2539:1: rule__UseDefinition__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__UseDefinition__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_4__0 ) ) ) ) ) ;
    public final void rule__UseDefinition__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2544:1: ( ( ({...}? => ( ( ( rule__UseDefinition__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_4__0 ) ) ) ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2545:3: ( ({...}? => ( ( ( rule__UseDefinition__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_4__0 ) ) ) ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2545:3: ( ({...}? => ( ( ( rule__UseDefinition__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__UseDefinition__Group_4_4__0 ) ) ) ) )
            int alt25=5;
            int LA25_0 = input.LA(1);

            if ( LA25_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt25=2;
            }
            else if ( LA25_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt25=3;
            }
            else if ( LA25_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt25=4;
            }
            else if ( LA25_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt25=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2547:4: ({...}? => ( ( ( rule__UseDefinition__Group_4_0__0 ) ) ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2547:4: ({...}? => ( ( ( rule__UseDefinition__Group_4_0__0 ) ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2548:5: {...}? => ( ( ( rule__UseDefinition__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__UseDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2548:110: ( ( ( rule__UseDefinition__Group_4_0__0 ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2549:6: ( ( rule__UseDefinition__Group_4_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2555:6: ( ( rule__UseDefinition__Group_4_0__0 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2557:7: ( rule__UseDefinition__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUseDefinitionAccess().getGroup_4_0()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2558:7: ( rule__UseDefinition__Group_4_0__0 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2558:8: rule__UseDefinition__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__UseDefinition__Group_4_0__0_in_rule__UseDefinition__UnorderedGroup_4__Impl5625);
                    rule__UseDefinition__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUseDefinitionAccess().getGroup_4_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2564:4: ({...}? => ( ( ( rule__UseDefinition__Group_4_1__0 ) ) ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2564:4: ({...}? => ( ( ( rule__UseDefinition__Group_4_1__0 ) ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2565:5: {...}? => ( ( ( rule__UseDefinition__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__UseDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2565:110: ( ( ( rule__UseDefinition__Group_4_1__0 ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2566:6: ( ( rule__UseDefinition__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2572:6: ( ( rule__UseDefinition__Group_4_1__0 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2574:7: ( rule__UseDefinition__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUseDefinitionAccess().getGroup_4_1()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2575:7: ( rule__UseDefinition__Group_4_1__0 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2575:8: rule__UseDefinition__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__UseDefinition__Group_4_1__0_in_rule__UseDefinition__UnorderedGroup_4__Impl5716);
                    rule__UseDefinition__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUseDefinitionAccess().getGroup_4_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2581:4: ({...}? => ( ( ( rule__UseDefinition__Group_4_2__0 ) ) ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2581:4: ({...}? => ( ( ( rule__UseDefinition__Group_4_2__0 ) ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2582:5: {...}? => ( ( ( rule__UseDefinition__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__UseDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2)");
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2582:110: ( ( ( rule__UseDefinition__Group_4_2__0 ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2583:6: ( ( rule__UseDefinition__Group_4_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2589:6: ( ( rule__UseDefinition__Group_4_2__0 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2591:7: ( rule__UseDefinition__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUseDefinitionAccess().getGroup_4_2()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2592:7: ( rule__UseDefinition__Group_4_2__0 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2592:8: rule__UseDefinition__Group_4_2__0
                    {
                    pushFollow(FOLLOW_rule__UseDefinition__Group_4_2__0_in_rule__UseDefinition__UnorderedGroup_4__Impl5807);
                    rule__UseDefinition__Group_4_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUseDefinitionAccess().getGroup_4_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2598:4: ({...}? => ( ( ( rule__UseDefinition__Group_4_3__0 ) ) ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2598:4: ({...}? => ( ( ( rule__UseDefinition__Group_4_3__0 ) ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2599:5: {...}? => ( ( ( rule__UseDefinition__Group_4_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__UseDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3)");
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2599:110: ( ( ( rule__UseDefinition__Group_4_3__0 ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2600:6: ( ( rule__UseDefinition__Group_4_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3);
                    selected = true;
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2606:6: ( ( rule__UseDefinition__Group_4_3__0 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2608:7: ( rule__UseDefinition__Group_4_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUseDefinitionAccess().getGroup_4_3()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2609:7: ( rule__UseDefinition__Group_4_3__0 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2609:8: rule__UseDefinition__Group_4_3__0
                    {
                    pushFollow(FOLLOW_rule__UseDefinition__Group_4_3__0_in_rule__UseDefinition__UnorderedGroup_4__Impl5898);
                    rule__UseDefinition__Group_4_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUseDefinitionAccess().getGroup_4_3()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2615:4: ({...}? => ( ( ( rule__UseDefinition__Group_4_4__0 ) ) ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2615:4: ({...}? => ( ( ( rule__UseDefinition__Group_4_4__0 ) ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2616:5: {...}? => ( ( ( rule__UseDefinition__Group_4_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__UseDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4)");
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2616:110: ( ( ( rule__UseDefinition__Group_4_4__0 ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2617:6: ( ( rule__UseDefinition__Group_4_4__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4);
                    selected = true;
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2623:6: ( ( rule__UseDefinition__Group_4_4__0 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2625:7: ( rule__UseDefinition__Group_4_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUseDefinitionAccess().getGroup_4_4()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2626:7: ( rule__UseDefinition__Group_4_4__0 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2626:8: rule__UseDefinition__Group_4_4__0
                    {
                    pushFollow(FOLLOW_rule__UseDefinition__Group_4_4__0_in_rule__UseDefinition__UnorderedGroup_4__Impl5989);
                    rule__UseDefinition__Group_4_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUseDefinitionAccess().getGroup_4_4()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__UseDefinition__UnorderedGroup_4__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2641:1: rule__UseDefinition__UnorderedGroup_4__0 : rule__UseDefinition__UnorderedGroup_4__Impl ( rule__UseDefinition__UnorderedGroup_4__1 )? ;
    public final void rule__UseDefinition__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2645:1: ( rule__UseDefinition__UnorderedGroup_4__Impl ( rule__UseDefinition__UnorderedGroup_4__1 )? )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2646:2: rule__UseDefinition__UnorderedGroup_4__Impl ( rule__UseDefinition__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__UseDefinition__UnorderedGroup_4__Impl_in_rule__UseDefinition__UnorderedGroup_4__06048);
            rule__UseDefinition__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2647:2: ( rule__UseDefinition__UnorderedGroup_4__1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt26=1;
            }
            else if ( LA26_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt26=1;
            }
            else if ( LA26_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt26=1;
            }
            else if ( LA26_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2647:2: rule__UseDefinition__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__UseDefinition__UnorderedGroup_4__1_in_rule__UseDefinition__UnorderedGroup_4__06051);
                    rule__UseDefinition__UnorderedGroup_4__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__UnorderedGroup_4__0"


    // $ANTLR start "rule__UseDefinition__UnorderedGroup_4__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2654:1: rule__UseDefinition__UnorderedGroup_4__1 : rule__UseDefinition__UnorderedGroup_4__Impl ( rule__UseDefinition__UnorderedGroup_4__2 )? ;
    public final void rule__UseDefinition__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2658:1: ( rule__UseDefinition__UnorderedGroup_4__Impl ( rule__UseDefinition__UnorderedGroup_4__2 )? )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2659:2: rule__UseDefinition__UnorderedGroup_4__Impl ( rule__UseDefinition__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_rule__UseDefinition__UnorderedGroup_4__Impl_in_rule__UseDefinition__UnorderedGroup_4__16076);
            rule__UseDefinition__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2660:2: ( rule__UseDefinition__UnorderedGroup_4__2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt27=1;
            }
            else if ( LA27_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt27=1;
            }
            else if ( LA27_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt27=1;
            }
            else if ( LA27_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2660:2: rule__UseDefinition__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_rule__UseDefinition__UnorderedGroup_4__2_in_rule__UseDefinition__UnorderedGroup_4__16079);
                    rule__UseDefinition__UnorderedGroup_4__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__UnorderedGroup_4__1"


    // $ANTLR start "rule__UseDefinition__UnorderedGroup_4__2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2667:1: rule__UseDefinition__UnorderedGroup_4__2 : rule__UseDefinition__UnorderedGroup_4__Impl ( rule__UseDefinition__UnorderedGroup_4__3 )? ;
    public final void rule__UseDefinition__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2671:1: ( rule__UseDefinition__UnorderedGroup_4__Impl ( rule__UseDefinition__UnorderedGroup_4__3 )? )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2672:2: rule__UseDefinition__UnorderedGroup_4__Impl ( rule__UseDefinition__UnorderedGroup_4__3 )?
            {
            pushFollow(FOLLOW_rule__UseDefinition__UnorderedGroup_4__Impl_in_rule__UseDefinition__UnorderedGroup_4__26104);
            rule__UseDefinition__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2673:2: ( rule__UseDefinition__UnorderedGroup_4__3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt28=1;
            }
            else if ( LA28_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt28=1;
            }
            else if ( LA28_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt28=1;
            }
            else if ( LA28_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2673:2: rule__UseDefinition__UnorderedGroup_4__3
                    {
                    pushFollow(FOLLOW_rule__UseDefinition__UnorderedGroup_4__3_in_rule__UseDefinition__UnorderedGroup_4__26107);
                    rule__UseDefinition__UnorderedGroup_4__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__UnorderedGroup_4__2"


    // $ANTLR start "rule__UseDefinition__UnorderedGroup_4__3"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2680:1: rule__UseDefinition__UnorderedGroup_4__3 : rule__UseDefinition__UnorderedGroup_4__Impl ( rule__UseDefinition__UnorderedGroup_4__4 )? ;
    public final void rule__UseDefinition__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2684:1: ( rule__UseDefinition__UnorderedGroup_4__Impl ( rule__UseDefinition__UnorderedGroup_4__4 )? )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2685:2: rule__UseDefinition__UnorderedGroup_4__Impl ( rule__UseDefinition__UnorderedGroup_4__4 )?
            {
            pushFollow(FOLLOW_rule__UseDefinition__UnorderedGroup_4__Impl_in_rule__UseDefinition__UnorderedGroup_4__36132);
            rule__UseDefinition__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2686:2: ( rule__UseDefinition__UnorderedGroup_4__4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt29=1;
            }
            else if ( LA29_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt29=1;
            }
            else if ( LA29_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt29=1;
            }
            else if ( LA29_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2686:2: rule__UseDefinition__UnorderedGroup_4__4
                    {
                    pushFollow(FOLLOW_rule__UseDefinition__UnorderedGroup_4__4_in_rule__UseDefinition__UnorderedGroup_4__36135);
                    rule__UseDefinition__UnorderedGroup_4__4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__UnorderedGroup_4__3"


    // $ANTLR start "rule__UseDefinition__UnorderedGroup_4__4"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2693:1: rule__UseDefinition__UnorderedGroup_4__4 : rule__UseDefinition__UnorderedGroup_4__Impl ;
    public final void rule__UseDefinition__UnorderedGroup_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2697:1: ( rule__UseDefinition__UnorderedGroup_4__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2698:2: rule__UseDefinition__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__UseDefinition__UnorderedGroup_4__Impl_in_rule__UseDefinition__UnorderedGroup_4__46160);
            rule__UseDefinition__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__UnorderedGroup_4__4"


    // $ANTLR start "rule__StartDefinition__UnorderedGroup_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2715:1: rule__StartDefinition__UnorderedGroup_1 : rule__StartDefinition__UnorderedGroup_1__0 {...}?;
    public final void rule__StartDefinition__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1());
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2720:1: ( rule__StartDefinition__UnorderedGroup_1__0 {...}?)
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2721:2: rule__StartDefinition__UnorderedGroup_1__0 {...}?
            {
            pushFollow(FOLLOW_rule__StartDefinition__UnorderedGroup_1__0_in_rule__StartDefinition__UnorderedGroup_16194);
            rule__StartDefinition__UnorderedGroup_1__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__StartDefinition__UnorderedGroup_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__UnorderedGroup_1"


    // $ANTLR start "rule__StartDefinition__UnorderedGroup_1__Impl"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2732:1: rule__StartDefinition__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__StartDefinition__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__StartDefinition__Group_1_1__0 ) ) ) ) ) ;
    public final void rule__StartDefinition__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2737:1: ( ( ({...}? => ( ( ( rule__StartDefinition__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__StartDefinition__Group_1_1__0 ) ) ) ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2738:3: ( ({...}? => ( ( ( rule__StartDefinition__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__StartDefinition__Group_1_1__0 ) ) ) ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2738:3: ( ({...}? => ( ( ( rule__StartDefinition__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__StartDefinition__Group_1_1__0 ) ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 1) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2740:4: ({...}? => ( ( ( rule__StartDefinition__Group_1_0__0 ) ) ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2740:4: ({...}? => ( ( ( rule__StartDefinition__Group_1_0__0 ) ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2741:5: {...}? => ( ( ( rule__StartDefinition__Group_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__StartDefinition__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2741:112: ( ( ( rule__StartDefinition__Group_1_0__0 ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2742:6: ( ( rule__StartDefinition__Group_1_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 0);
                    selected = true;
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2748:6: ( ( rule__StartDefinition__Group_1_0__0 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2750:7: ( rule__StartDefinition__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStartDefinitionAccess().getGroup_1_0()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2751:7: ( rule__StartDefinition__Group_1_0__0 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2751:8: rule__StartDefinition__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__StartDefinition__Group_1_0__0_in_rule__StartDefinition__UnorderedGroup_1__Impl6283);
                    rule__StartDefinition__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStartDefinitionAccess().getGroup_1_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2757:4: ({...}? => ( ( ( rule__StartDefinition__Group_1_1__0 ) ) ) )
                    {
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2757:4: ({...}? => ( ( ( rule__StartDefinition__Group_1_1__0 ) ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2758:5: {...}? => ( ( ( rule__StartDefinition__Group_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__StartDefinition__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2758:112: ( ( ( rule__StartDefinition__Group_1_1__0 ) ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2759:6: ( ( rule__StartDefinition__Group_1_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 1);
                    selected = true;
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2765:6: ( ( rule__StartDefinition__Group_1_1__0 ) )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2767:7: ( rule__StartDefinition__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStartDefinitionAccess().getGroup_1_1()); 
                    }
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2768:7: ( rule__StartDefinition__Group_1_1__0 )
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2768:8: rule__StartDefinition__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__StartDefinition__Group_1_1__0_in_rule__StartDefinition__UnorderedGroup_1__Impl6374);
                    rule__StartDefinition__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStartDefinitionAccess().getGroup_1_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__StartDefinition__UnorderedGroup_1__0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2783:1: rule__StartDefinition__UnorderedGroup_1__0 : rule__StartDefinition__UnorderedGroup_1__Impl ( rule__StartDefinition__UnorderedGroup_1__1 )? ;
    public final void rule__StartDefinition__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2787:1: ( rule__StartDefinition__UnorderedGroup_1__Impl ( rule__StartDefinition__UnorderedGroup_1__1 )? )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2788:2: rule__StartDefinition__UnorderedGroup_1__Impl ( rule__StartDefinition__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_rule__StartDefinition__UnorderedGroup_1__Impl_in_rule__StartDefinition__UnorderedGroup_1__06433);
            rule__StartDefinition__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2789:2: ( rule__StartDefinition__UnorderedGroup_1__1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 1) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2789:2: rule__StartDefinition__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_rule__StartDefinition__UnorderedGroup_1__1_in_rule__StartDefinition__UnorderedGroup_1__06436);
                    rule__StartDefinition__UnorderedGroup_1__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__UnorderedGroup_1__0"


    // $ANTLR start "rule__StartDefinition__UnorderedGroup_1__1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2796:1: rule__StartDefinition__UnorderedGroup_1__1 : rule__StartDefinition__UnorderedGroup_1__Impl ;
    public final void rule__StartDefinition__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2800:1: ( rule__StartDefinition__UnorderedGroup_1__Impl )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2801:2: rule__StartDefinition__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_rule__StartDefinition__UnorderedGroup_1__Impl_in_rule__StartDefinition__UnorderedGroup_1__16461);
            rule__StartDefinition__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__UnorderedGroup_1__1"


    // $ANTLR start "rule__Adventure__TitleAssignment_0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2812:1: rule__Adventure__TitleAssignment_0 : ( ruleAdventureTitle ) ;
    public final void rule__Adventure__TitleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2816:1: ( ( ruleAdventureTitle ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2817:1: ( ruleAdventureTitle )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2817:1: ( ruleAdventureTitle )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2818:1: ruleAdventureTitle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getTitleAdventureTitleParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAdventureTitle_in_rule__Adventure__TitleAssignment_06493);
            ruleAdventureTitle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getTitleAdventureTitleParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__TitleAssignment_0"


    // $ANTLR start "rule__Adventure__ItemDefAssignment_1_0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2827:1: rule__Adventure__ItemDefAssignment_1_0 : ( ruleItemDefinition ) ;
    public final void rule__Adventure__ItemDefAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2831:1: ( ( ruleItemDefinition ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2832:1: ( ruleItemDefinition )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2832:1: ( ruleItemDefinition )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2833:1: ruleItemDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getItemDefItemDefinitionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleItemDefinition_in_rule__Adventure__ItemDefAssignment_1_06524);
            ruleItemDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getItemDefItemDefinitionParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__ItemDefAssignment_1_0"


    // $ANTLR start "rule__Adventure__SceneDefAssignment_1_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2842:1: rule__Adventure__SceneDefAssignment_1_1 : ( ruleSceneDefinition ) ;
    public final void rule__Adventure__SceneDefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2846:1: ( ( ruleSceneDefinition ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2847:1: ( ruleSceneDefinition )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2847:1: ( ruleSceneDefinition )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2848:1: ruleSceneDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getSceneDefSceneDefinitionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSceneDefinition_in_rule__Adventure__SceneDefAssignment_1_16555);
            ruleSceneDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getSceneDefSceneDefinitionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__SceneDefAssignment_1_1"


    // $ANTLR start "rule__Adventure__StartDefAssignment_2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2857:1: rule__Adventure__StartDefAssignment_2 : ( ruleStartDefinition ) ;
    public final void rule__Adventure__StartDefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2861:1: ( ( ruleStartDefinition ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2862:1: ( ruleStartDefinition )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2862:1: ( ruleStartDefinition )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2863:1: ruleStartDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getStartDefStartDefinitionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleStartDefinition_in_rule__Adventure__StartDefAssignment_26586);
            ruleStartDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getStartDefStartDefinitionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__StartDefAssignment_2"


    // $ANTLR start "rule__Adventure__ItemDefAssignment_3_0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2872:1: rule__Adventure__ItemDefAssignment_3_0 : ( ruleItemDefinition ) ;
    public final void rule__Adventure__ItemDefAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2876:1: ( ( ruleItemDefinition ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2877:1: ( ruleItemDefinition )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2877:1: ( ruleItemDefinition )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2878:1: ruleItemDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getItemDefItemDefinitionParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleItemDefinition_in_rule__Adventure__ItemDefAssignment_3_06617);
            ruleItemDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getItemDefItemDefinitionParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__ItemDefAssignment_3_0"


    // $ANTLR start "rule__Adventure__SceneDefAssignment_3_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2887:1: rule__Adventure__SceneDefAssignment_3_1 : ( ruleSceneDefinition ) ;
    public final void rule__Adventure__SceneDefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2891:1: ( ( ruleSceneDefinition ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2892:1: ( ruleSceneDefinition )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2892:1: ( ruleSceneDefinition )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2893:1: ruleSceneDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureAccess().getSceneDefSceneDefinitionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleSceneDefinition_in_rule__Adventure__SceneDefAssignment_3_16648);
            ruleSceneDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureAccess().getSceneDefSceneDefinitionParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adventure__SceneDefAssignment_3_1"


    // $ANTLR start "rule__AdventureTitle__NameAssignment"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2902:1: rule__AdventureTitle__NameAssignment : ( RULE_STRING ) ;
    public final void rule__AdventureTitle__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2906:1: ( ( RULE_STRING ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2907:1: ( RULE_STRING )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2907:1: ( RULE_STRING )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2908:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdventureTitleAccess().getNameSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AdventureTitle__NameAssignment6679); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdventureTitleAccess().getNameSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdventureTitle__NameAssignment"


    // $ANTLR start "rule__ItemDefinition__NameAssignment_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2917:1: rule__ItemDefinition__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ItemDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2921:1: ( ( RULE_STRING ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2922:1: ( RULE_STRING )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2922:1: ( RULE_STRING )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2923:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ItemDefinition__NameAssignment_16710); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__NameAssignment_1"


    // $ANTLR start "rule__ItemDefinition__PickupAssignment_3_0"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2932:1: rule__ItemDefinition__PickupAssignment_3_0 : ( ( '- can be picked up' ) ) ;
    public final void rule__ItemDefinition__PickupAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2936:1: ( ( ( '- can be picked up' ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2937:1: ( ( '- can be picked up' ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2937:1: ( ( '- can be picked up' ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2938:1: ( '- can be picked up' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemDefinitionAccess().getPickupCanBePickedUpKeyword_3_0_0()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2939:1: ( '- can be picked up' )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2940:1: '- can be picked up'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemDefinitionAccess().getPickupCanBePickedUpKeyword_3_0_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__ItemDefinition__PickupAssignment_3_06746); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemDefinitionAccess().getPickupCanBePickedUpKeyword_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemDefinitionAccess().getPickupCanBePickedUpKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__PickupAssignment_3_0"


    // $ANTLR start "rule__ItemDefinition__ImgAssignment_3_1_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2955:1: rule__ItemDefinition__ImgAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__ItemDefinition__ImgAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2959:1: ( ( RULE_STRING ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2960:1: ( RULE_STRING )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2960:1: ( RULE_STRING )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2961:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemDefinitionAccess().getImgSTRINGTerminalRuleCall_3_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ItemDefinition__ImgAssignment_3_1_16785); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemDefinitionAccess().getImgSTRINGTerminalRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__ImgAssignment_3_1_1"


    // $ANTLR start "rule__ItemDefinition__UsesAssignment_3_2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2970:1: rule__ItemDefinition__UsesAssignment_3_2 : ( ruleUseDefinition ) ;
    public final void rule__ItemDefinition__UsesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2974:1: ( ( ruleUseDefinition ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2975:1: ( ruleUseDefinition )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2975:1: ( ruleUseDefinition )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2976:1: ruleUseDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemDefinitionAccess().getUsesUseDefinitionParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleUseDefinition_in_rule__ItemDefinition__UsesAssignment_3_26816);
            ruleUseDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemDefinitionAccess().getUsesUseDefinitionParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDefinition__UsesAssignment_3_2"


    // $ANTLR start "rule__UseDefinition__NameAssignment_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2985:1: rule__UseDefinition__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UseDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2989:1: ( ( RULE_STRING ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2990:1: ( RULE_STRING )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2990:1: ( RULE_STRING )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2991:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UseDefinition__NameAssignment_16847); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__NameAssignment_1"


    // $ANTLR start "rule__UseDefinition__ReqsAssignment_4_0_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3000:1: rule__UseDefinition__ReqsAssignment_4_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseDefinition__ReqsAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3004:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3005:1: ( ( RULE_ID ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3005:1: ( ( RULE_ID ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3006:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getReqsItemDefinitionCrossReference_4_0_1_0()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3007:1: ( RULE_ID )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3008:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getReqsItemDefinitionIDTerminalRuleCall_4_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseDefinition__ReqsAssignment_4_0_16882); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getReqsItemDefinitionIDTerminalRuleCall_4_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getReqsItemDefinitionCrossReference_4_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__ReqsAssignment_4_0_1"


    // $ANTLR start "rule__UseDefinition__AltTextAssignment_4_0_2_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3019:1: rule__UseDefinition__AltTextAssignment_4_0_2_1 : ( RULE_STRING ) ;
    public final void rule__UseDefinition__AltTextAssignment_4_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3023:1: ( ( RULE_STRING ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3024:1: ( RULE_STRING )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3024:1: ( RULE_STRING )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3025:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getAltTextSTRINGTerminalRuleCall_4_0_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UseDefinition__AltTextAssignment_4_0_2_16917); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getAltTextSTRINGTerminalRuleCall_4_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__AltTextAssignment_4_0_2_1"


    // $ANTLR start "rule__UseDefinition__AddsAssignment_4_1_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3034:1: rule__UseDefinition__AddsAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseDefinition__AddsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3038:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3039:1: ( ( RULE_ID ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3039:1: ( ( RULE_ID ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3040:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getAddsItemDefinitionCrossReference_4_1_1_0()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3041:1: ( RULE_ID )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3042:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getAddsItemDefinitionIDTerminalRuleCall_4_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseDefinition__AddsAssignment_4_1_16952); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getAddsItemDefinitionIDTerminalRuleCall_4_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getAddsItemDefinitionCrossReference_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__AddsAssignment_4_1_1"


    // $ANTLR start "rule__UseDefinition__AddsAssignment_4_1_2_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3053:1: rule__UseDefinition__AddsAssignment_4_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseDefinition__AddsAssignment_4_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3057:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3058:1: ( ( RULE_ID ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3058:1: ( ( RULE_ID ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3059:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getAddsItemDefinitionCrossReference_4_1_2_1_0()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3060:1: ( RULE_ID )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3061:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getAddsItemDefinitionIDTerminalRuleCall_4_1_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseDefinition__AddsAssignment_4_1_2_16991); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getAddsItemDefinitionIDTerminalRuleCall_4_1_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getAddsItemDefinitionCrossReference_4_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__AddsAssignment_4_1_2_1"


    // $ANTLR start "rule__UseDefinition__DelsAssignment_4_2_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3072:1: rule__UseDefinition__DelsAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseDefinition__DelsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3076:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3077:1: ( ( RULE_ID ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3077:1: ( ( RULE_ID ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3078:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getDelsItemDefinitionCrossReference_4_2_1_0()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3079:1: ( RULE_ID )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3080:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getDelsItemDefinitionIDTerminalRuleCall_4_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseDefinition__DelsAssignment_4_2_17030); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getDelsItemDefinitionIDTerminalRuleCall_4_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getDelsItemDefinitionCrossReference_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__DelsAssignment_4_2_1"


    // $ANTLR start "rule__UseDefinition__DelsAssignment_4_2_2_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3091:1: rule__UseDefinition__DelsAssignment_4_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseDefinition__DelsAssignment_4_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3095:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3096:1: ( ( RULE_ID ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3096:1: ( ( RULE_ID ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3097:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getDelsItemDefinitionCrossReference_4_2_2_1_0()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3098:1: ( RULE_ID )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3099:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getDelsItemDefinitionIDTerminalRuleCall_4_2_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseDefinition__DelsAssignment_4_2_2_17069); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getDelsItemDefinitionIDTerminalRuleCall_4_2_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getDelsItemDefinitionCrossReference_4_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__DelsAssignment_4_2_2_1"


    // $ANTLR start "rule__UseDefinition__TextAssignment_4_3_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3110:1: rule__UseDefinition__TextAssignment_4_3_1 : ( RULE_STRING ) ;
    public final void rule__UseDefinition__TextAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3114:1: ( ( RULE_STRING ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3115:1: ( RULE_STRING )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3115:1: ( RULE_STRING )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3116:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getTextSTRINGTerminalRuleCall_4_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UseDefinition__TextAssignment_4_3_17104); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getTextSTRINGTerminalRuleCall_4_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__TextAssignment_4_3_1"


    // $ANTLR start "rule__UseDefinition__FollowSceneAssignment_4_4_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3125:1: rule__UseDefinition__FollowSceneAssignment_4_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseDefinition__FollowSceneAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3129:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3130:1: ( ( RULE_ID ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3130:1: ( ( RULE_ID ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3131:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getFollowSceneSceneDefinitionCrossReference_4_4_1_0()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3132:1: ( RULE_ID )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3133:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUseDefinitionAccess().getFollowSceneSceneDefinitionIDTerminalRuleCall_4_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseDefinition__FollowSceneAssignment_4_4_17139); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getFollowSceneSceneDefinitionIDTerminalRuleCall_4_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUseDefinitionAccess().getFollowSceneSceneDefinitionCrossReference_4_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseDefinition__FollowSceneAssignment_4_4_1"


    // $ANTLR start "rule__SceneDefinition__NameAssignment_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3144:1: rule__SceneDefinition__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SceneDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3148:1: ( ( RULE_STRING ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3149:1: ( RULE_STRING )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3149:1: ( RULE_STRING )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3150:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SceneDefinition__NameAssignment_17174); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__NameAssignment_1"


    // $ANTLR start "rule__SceneDefinition__ImgAssignment_3"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3159:1: rule__SceneDefinition__ImgAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SceneDefinition__ImgAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3163:1: ( ( RULE_STRING ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3164:1: ( RULE_STRING )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3164:1: ( RULE_STRING )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3165:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneDefinitionAccess().getImgSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SceneDefinition__ImgAssignment_37205); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneDefinitionAccess().getImgSTRINGTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__ImgAssignment_3"


    // $ANTLR start "rule__SceneDefinition__ItemsAssignment_4_0_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3174:1: rule__SceneDefinition__ItemsAssignment_4_0_1 : ( ruleItemPositionDefinition ) ;
    public final void rule__SceneDefinition__ItemsAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3178:1: ( ( ruleItemPositionDefinition ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3179:1: ( ruleItemPositionDefinition )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3179:1: ( ruleItemPositionDefinition )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3180:1: ruleItemPositionDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSceneDefinitionAccess().getItemsItemPositionDefinitionParserRuleCall_4_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleItemPositionDefinition_in_rule__SceneDefinition__ItemsAssignment_4_0_17236);
            ruleItemPositionDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSceneDefinitionAccess().getItemsItemPositionDefinitionParserRuleCall_4_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneDefinition__ItemsAssignment_4_0_1"


    // $ANTLR start "rule__ItemPositionDefinition__ItemAssignment_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3189:1: rule__ItemPositionDefinition__ItemAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ItemPositionDefinition__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3193:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3194:1: ( ( RULE_ID ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3194:1: ( ( RULE_ID ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3195:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionAccess().getItemItemDefinitionCrossReference_1_0()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3196:1: ( RULE_ID )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3197:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionAccess().getItemItemDefinitionIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ItemPositionDefinition__ItemAssignment_17271); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionAccess().getItemItemDefinitionIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionAccess().getItemItemDefinitionCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__ItemAssignment_1"


    // $ANTLR start "rule__ItemPositionDefinition__XposAssignment_2_2"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3208:1: rule__ItemPositionDefinition__XposAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__ItemPositionDefinition__XposAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3212:1: ( ( RULE_INT ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3213:1: ( RULE_INT )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3213:1: ( RULE_INT )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3214:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionAccess().getXposINTTerminalRuleCall_2_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ItemPositionDefinition__XposAssignment_2_27306); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionAccess().getXposINTTerminalRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__XposAssignment_2_2"


    // $ANTLR start "rule__ItemPositionDefinition__YposAssignment_2_4"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3223:1: rule__ItemPositionDefinition__YposAssignment_2_4 : ( RULE_INT ) ;
    public final void rule__ItemPositionDefinition__YposAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3227:1: ( ( RULE_INT ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3228:1: ( RULE_INT )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3228:1: ( RULE_INT )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3229:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItemPositionDefinitionAccess().getYposINTTerminalRuleCall_2_4_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ItemPositionDefinition__YposAssignment_2_47337); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItemPositionDefinitionAccess().getYposINTTerminalRuleCall_2_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionDefinition__YposAssignment_2_4"


    // $ANTLR start "rule__StartDefinition__StartLocAssignment_1_0_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3238:1: rule__StartDefinition__StartLocAssignment_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__StartDefinition__StartLocAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3242:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3243:1: ( ( RULE_ID ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3243:1: ( ( RULE_ID ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3244:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getStartLocSceneDefinitionCrossReference_1_0_1_0()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3245:1: ( RULE_ID )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3246:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getStartLocSceneDefinitionIDTerminalRuleCall_1_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartDefinition__StartLocAssignment_1_0_17372); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getStartLocSceneDefinitionIDTerminalRuleCall_1_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getStartLocSceneDefinitionCrossReference_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__StartLocAssignment_1_0_1"


    // $ANTLR start "rule__StartDefinition__StartItemsAssignment_1_1_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3257:1: rule__StartDefinition__StartItemsAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__StartDefinition__StartItemsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3261:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3262:1: ( ( RULE_ID ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3262:1: ( ( RULE_ID ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3263:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getStartItemsItemDefinitionCrossReference_1_1_1_0()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3264:1: ( RULE_ID )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3265:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getStartItemsItemDefinitionIDTerminalRuleCall_1_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartDefinition__StartItemsAssignment_1_1_17411); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getStartItemsItemDefinitionIDTerminalRuleCall_1_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getStartItemsItemDefinitionCrossReference_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__StartItemsAssignment_1_1_1"


    // $ANTLR start "rule__StartDefinition__StartItemsAssignment_1_1_2_1"
    // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3276:1: rule__StartDefinition__StartItemsAssignment_1_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__StartDefinition__StartItemsAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3280:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3281:1: ( ( RULE_ID ) )
            {
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3281:1: ( ( RULE_ID ) )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3282:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getStartItemsItemDefinitionCrossReference_1_1_2_1_0()); 
            }
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3283:1: ( RULE_ID )
            // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:3284:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartDefinitionAccess().getStartItemsItemDefinitionIDTerminalRuleCall_1_1_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StartDefinition__StartItemsAssignment_1_1_2_17450); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getStartItemsItemDefinitionIDTerminalRuleCall_1_1_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartDefinitionAccess().getStartItemsItemDefinitionCrossReference_1_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartDefinition__StartItemsAssignment_1_1_2_1"

    // $ANTLR start synpred1_InternalGreatAdventure
    public final void synpred1_InternalGreatAdventure_fragment() throws RecognitionException {   
        // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2216:8: ( rule__Adventure__ItemDefAssignment_1_0 )
        // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2216:9: rule__Adventure__ItemDefAssignment_1_0
        {
        pushFollow(FOLLOW_rule__Adventure__ItemDefAssignment_1_0_in_synpred1_InternalGreatAdventure4403);
        rule__Adventure__ItemDefAssignment_1_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGreatAdventure

    // $ANTLR start synpred2_InternalGreatAdventure
    public final void synpred2_InternalGreatAdventure_fragment() throws RecognitionException {   
        // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2238:8: ( rule__Adventure__SceneDefAssignment_1_1 )
        // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2238:9: rule__Adventure__SceneDefAssignment_1_1
        {
        pushFollow(FOLLOW_rule__Adventure__SceneDefAssignment_1_1_in_synpred2_InternalGreatAdventure4546);
        rule__Adventure__SceneDefAssignment_1_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalGreatAdventure

    // $ANTLR start synpred3_InternalGreatAdventure
    public final void synpred3_InternalGreatAdventure_fragment() throws RecognitionException {   
        // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2323:8: ( rule__Adventure__ItemDefAssignment_3_0 )
        // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2323:9: rule__Adventure__ItemDefAssignment_3_0
        {
        pushFollow(FOLLOW_rule__Adventure__ItemDefAssignment_3_0_in_synpred3_InternalGreatAdventure4802);
        rule__Adventure__ItemDefAssignment_3_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalGreatAdventure

    // $ANTLR start synpred4_InternalGreatAdventure
    public final void synpred4_InternalGreatAdventure_fragment() throws RecognitionException {   
        // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2345:8: ( rule__Adventure__SceneDefAssignment_3_1 )
        // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2345:9: rule__Adventure__SceneDefAssignment_3_1
        {
        pushFollow(FOLLOW_rule__Adventure__SceneDefAssignment_3_1_in_synpred4_InternalGreatAdventure4945);
        rule__Adventure__SceneDefAssignment_3_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalGreatAdventure

    // $ANTLR start synpred5_InternalGreatAdventure
    public final void synpred5_InternalGreatAdventure_fragment() throws RecognitionException {   
        // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2464:8: ( rule__ItemDefinition__UsesAssignment_3_2 )
        // ../at.ac.uibk.theGreatAdventure.ui/src-gen/at/ac/uibk/greatAdventure/ui/contentassist/antlr/internal/InternalGreatAdventure.g:2464:9: rule__ItemDefinition__UsesAssignment_3_2
        {
        pushFollow(FOLLOW_rule__ItemDefinition__UsesAssignment_3_2_in_synpred5_InternalGreatAdventure5383);
        rule__ItemDefinition__UsesAssignment_3_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalGreatAdventure

    // Delegated rules

    public final boolean synpred1_InternalGreatAdventure() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGreatAdventure_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalGreatAdventure() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGreatAdventure_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalGreatAdventure() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalGreatAdventure_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalGreatAdventure() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalGreatAdventure_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalGreatAdventure() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalGreatAdventure_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA12_eotS =
        "\16\uffff";
    static final String DFA12_eofS =
        "\16\uffff";
    static final String DFA12_minS =
        "\1\13\2\4\1\uffff\1\16\1\17\1\0\2\4\1\uffff\1\0\1\21\1\22\1\0";
    static final String DFA12_maxS =
        "\1\41\2\4\1\uffff\1\16\1\44\1\0\2\4\1\uffff\1\0\2\22\1\0";
    static final String DFA12_acceptS =
        "\3\uffff\1\2\5\uffff\1\1\4\uffff";
    static final String DFA12_specialS =
        "\6\uffff\1\0\3\uffff\1\2\2\uffff\1\1}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\2\15\uffff\1\3\6\uffff\1\3",
            "\1\4",
            "\1\4",
            "",
            "\1\5",
            "\1\7\1\10\23\uffff\1\6",
            "\1\uffff",
            "\1\12",
            "\1\13",
            "",
            "\1\uffff",
            "\1\14\1\15",
            "\1\15",
            "\1\uffff"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()* loopback of 2216:7: ( ( rule__Adventure__ItemDefAssignment_1_0 )=> rule__Adventure__ItemDefAssignment_1_0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGreatAdventure()) ) {s = 9;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_13 = input.LA(1);

                         
                        int index12_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGreatAdventure()) ) {s = 9;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_10 = input.LA(1);

                         
                        int index12_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGreatAdventure()) ) {s = 9;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index12_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA13_eotS =
        "\13\uffff";
    static final String DFA13_eofS =
        "\13\uffff";
    static final String DFA13_minS =
        "\1\13\1\uffff\1\4\1\33\1\4\1\15\1\35\1\0\1\5\1\uffff\1\0";
    static final String DFA13_maxS =
        "\1\41\1\uffff\1\4\1\33\1\4\1\34\1\35\1\0\1\5\1\uffff\1\0";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\7\uffff\1\1\1\uffff";
    static final String DFA13_specialS =
        "\7\uffff\1\0\2\uffff\1\1}>";
    static final String[] DFA13_transitionS = {
            "\2\1\15\uffff\1\2\6\uffff\1\1",
            "",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\7\16\uffff\1\6",
            "\1\10",
            "\1\uffff",
            "\1\12",
            "",
            "\1\uffff"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()* loopback of 2238:7: ( ( rule__Adventure__SceneDefAssignment_1_1 )=> rule__Adventure__SceneDefAssignment_1_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGreatAdventure()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_10 = input.LA(1);

                         
                        int index13_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGreatAdventure()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\26\uffff";
    static final String DFA15_eofS =
        "\26\uffff";
    static final String DFA15_minS =
        "\1\13\3\4\1\uffff\1\16\1\33\1\17\1\4\1\0\2\4\1\15\1\uffff\1\0\1"+
        "\21\1\35\1\0\1\22\1\0\1\5\1\0";
    static final String DFA15_maxS =
        "\1\41\3\4\1\uffff\1\16\1\33\1\44\1\4\1\0\2\4\1\34\1\uffff\1\0\1"+
        "\22\1\35\1\0\1\22\1\0\1\5\1\0";
    static final String DFA15_acceptS =
        "\4\uffff\1\2\10\uffff\1\1\10\uffff";
    static final String DFA15_specialS =
        "\1\11\1\20\1\17\1\7\1\uffff\1\15\1\10\1\14\1\16\1\4\1\22\1\21\1"+
        "\1\1\uffff\1\5\1\2\1\12\1\23\1\13\1\3\1\6\1\0}>";
    static final String[] DFA15_transitionS = {
            "\1\1\1\2\15\uffff\1\3\6\uffff\1\4",
            "\1\5",
            "\1\5",
            "\1\6",
            "",
            "\1\7",
            "\1\10",
            "\1\12\1\13\23\uffff\1\11",
            "\1\14",
            "\1\uffff",
            "\1\16",
            "\1\17",
            "\1\21\16\uffff\1\20",
            "",
            "\1\uffff",
            "\1\22\1\23",
            "\1\24",
            "\1\uffff",
            "\1\23",
            "\1\uffff",
            "\1\25",
            "\1\uffff"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "2259:2: ( rule__Adventure__UnorderedGroup_1__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_21 = input.LA(1);

                         
                        int index15_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_1()) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {s = 4;}

                         
                        input.seek(index15_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_12 = input.LA(1);

                         
                        int index15_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_12 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {s = 16;}

                        else if ( LA15_12 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {s = 17;}

                         
                        input.seek(index15_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_15 = input.LA(1);

                         
                        int index15_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_15 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 18;}

                        else if ( LA15_15 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 19;}

                         
                        input.seek(index15_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_19 = input.LA(1);

                         
                        int index15_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_1()) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 4;}

                         
                        input.seek(index15_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_1()) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 4;}

                         
                        input.seek(index15_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_14 = input.LA(1);

                         
                        int index15_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_1()) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 4;}

                         
                        input.seek(index15_14);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_20 = input.LA(1);

                         
                        int index15_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_20 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {s = 21;}

                         
                        input.seek(index15_20);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_3 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {s = 6;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_6 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {s = 8;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_0 = input.LA(1);

                         
                        int index15_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA15_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA15_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( (LA15_0==33) ) {s = 4;}

                         
                        input.seek(index15_0);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA15_16 = input.LA(1);

                         
                        int index15_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_16 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {s = 20;}

                         
                        input.seek(index15_16);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA15_18 = input.LA(1);

                         
                        int index15_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_18 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 19;}

                         
                        input.seek(index15_18);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_7 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 9;}

                        else if ( LA15_7 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 10;}

                        else if ( LA15_7 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 11;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_5 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 7;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_8 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {s = 12;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_2 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 5;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_1 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 5;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA15_11 = input.LA(1);

                         
                        int index15_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_11 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 15;}

                         
                        input.seek(index15_11);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA15_10 = input.LA(1);

                         
                        int index15_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_10 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {s = 14;}

                         
                        input.seek(index15_10);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA15_17 = input.LA(1);

                         
                        int index15_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_1()) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {s = 4;}

                         
                        input.seek(index15_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\16\uffff";
    static final String DFA16_eofS =
        "\1\3\15\uffff";
    static final String DFA16_minS =
        "\1\13\2\4\1\uffff\1\16\1\17\1\0\2\4\1\uffff\1\0\1\21\1\22\1\0";
    static final String DFA16_maxS =
        "\1\32\2\4\1\uffff\1\16\1\44\1\0\2\4\1\uffff\1\0\2\22\1\0";
    static final String DFA16_acceptS =
        "\3\uffff\1\2\5\uffff\1\1\4\uffff";
    static final String DFA16_specialS =
        "\6\uffff\1\2\3\uffff\1\0\2\uffff\1\1}>";
    static final String[] DFA16_transitionS = {
            "\1\1\1\2\15\uffff\1\3",
            "\1\4",
            "\1\4",
            "",
            "\1\5",
            "\1\7\1\10\23\uffff\1\6",
            "\1\uffff",
            "\1\12",
            "\1\13",
            "",
            "\1\uffff",
            "\1\14\1\15",
            "\1\15",
            "\1\uffff"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 2323:7: ( ( rule__Adventure__ItemDefAssignment_3_0 )=> rule__Adventure__ItemDefAssignment_3_0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_10 = input.LA(1);

                         
                        int index16_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalGreatAdventure()) ) {s = 9;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index16_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_13 = input.LA(1);

                         
                        int index16_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalGreatAdventure()) ) {s = 9;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index16_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalGreatAdventure()) ) {s = 9;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\13\uffff";
    static final String DFA17_eofS =
        "\1\1\12\uffff";
    static final String DFA17_minS =
        "\1\13\1\uffff\1\4\1\33\1\4\1\15\1\35\1\0\1\5\1\uffff\1\0";
    static final String DFA17_maxS =
        "\1\32\1\uffff\1\4\1\33\1\4\1\34\1\35\1\0\1\5\1\uffff\1\0";
    static final String DFA17_acceptS =
        "\1\uffff\1\2\7\uffff\1\1\1\uffff";
    static final String DFA17_specialS =
        "\7\uffff\1\1\2\uffff\1\0}>";
    static final String[] DFA17_transitionS = {
            "\2\1\15\uffff\1\2",
            "",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\7\16\uffff\1\6",
            "\1\10",
            "\1\uffff",
            "\1\12",
            "",
            "\1\uffff"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 2345:7: ( ( rule__Adventure__SceneDefAssignment_3_1 )=> rule__Adventure__SceneDefAssignment_3_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_10 = input.LA(1);

                         
                        int index17_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalGreatAdventure()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalGreatAdventure()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\26\uffff";
    static final String DFA19_eofS =
        "\1\4\25\uffff";
    static final String DFA19_minS =
        "\1\13\3\4\1\uffff\1\16\1\33\1\17\1\4\1\0\2\4\1\15\1\uffff\1\0\1"+
        "\21\1\35\1\0\1\22\1\0\1\5\1\0";
    static final String DFA19_maxS =
        "\1\32\3\4\1\uffff\1\16\1\33\1\44\1\4\1\0\2\4\1\34\1\uffff\1\0\1"+
        "\22\1\35\1\0\1\22\1\0\1\5\1\0";
    static final String DFA19_acceptS =
        "\4\uffff\1\2\10\uffff\1\1\10\uffff";
    static final String DFA19_specialS =
        "\1\23\1\20\1\17\1\7\1\uffff\1\15\1\10\1\14\1\16\1\11\1\22\1\21\1"+
        "\1\1\uffff\1\4\1\3\1\12\1\6\1\13\1\0\1\5\1\2}>";
    static final String[] DFA19_transitionS = {
            "\1\1\1\2\15\uffff\1\3",
            "\1\5",
            "\1\5",
            "\1\6",
            "",
            "\1\7",
            "\1\10",
            "\1\12\1\13\23\uffff\1\11",
            "\1\14",
            "\1\uffff",
            "\1\16",
            "\1\17",
            "\1\21\16\uffff\1\20",
            "",
            "\1\uffff",
            "\1\22\1\23",
            "\1\24",
            "\1\uffff",
            "\1\23",
            "\1\uffff",
            "\1\25",
            "\1\uffff"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "2366:2: ( rule__Adventure__UnorderedGroup_3__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_19 = input.LA(1);

                         
                        int index19_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_3()) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 4;}

                         
                        input.seek(index19_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_12 = input.LA(1);

                         
                        int index19_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_12 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {s = 16;}

                        else if ( LA19_12 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {s = 17;}

                         
                        input.seek(index19_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_21 = input.LA(1);

                         
                        int index19_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_3()) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {s = 4;}

                         
                        input.seek(index19_21);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_15 = input.LA(1);

                         
                        int index19_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_15 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 18;}

                        else if ( LA19_15 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 19;}

                         
                        input.seek(index19_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_14 = input.LA(1);

                         
                        int index19_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_3()) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 4;}

                         
                        input.seek(index19_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_20 = input.LA(1);

                         
                        int index19_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_20 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {s = 21;}

                         
                        input.seek(index19_20);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_17 = input.LA(1);

                         
                        int index19_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_3()) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {s = 4;}

                         
                        input.seek(index19_17);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_3 = input.LA(1);

                         
                        int index19_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_3 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {s = 6;}

                         
                        input.seek(index19_3);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA19_6 = input.LA(1);

                         
                        int index19_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_6 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {s = 8;}

                         
                        input.seek(index19_6);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA19_9 = input.LA(1);

                         
                        int index19_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_3()) && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 4;}

                         
                        input.seek(index19_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA19_16 = input.LA(1);

                         
                        int index19_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_16 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {s = 20;}

                         
                        input.seek(index19_16);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA19_18 = input.LA(1);

                         
                        int index19_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_18 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 19;}

                         
                        input.seek(index19_18);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA19_7 = input.LA(1);

                         
                        int index19_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_7 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 9;}

                        else if ( LA19_7 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 10;}

                        else if ( LA19_7 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 11;}

                         
                        input.seek(index19_7);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA19_5 = input.LA(1);

                         
                        int index19_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_5 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 7;}

                         
                        input.seek(index19_5);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA19_8 = input.LA(1);

                         
                        int index19_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_8 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {s = 12;}

                         
                        input.seek(index19_8);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_2 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 5;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA19_1 = input.LA(1);

                         
                        int index19_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_1 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 5;}

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA19_11 = input.LA(1);

                         
                        int index19_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_11 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 15;}

                         
                        input.seek(index19_11);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA19_10 = input.LA(1);

                         
                        int index19_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_10 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 14;}

                         
                        input.seek(index19_10);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA19_0 = input.LA(1);

                         
                        int index19_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 1;}

                        else if ( LA19_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA19_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( (LA19_0==EOF) ) {s = 4;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleAdventure_in_entryRuleAdventure61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdventure68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__Group__0_in_ruleAdventure94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdventureTitle_in_entryRuleAdventureTitle121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdventureTitle128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdventureTitle__NameAssignment_in_ruleAdventureTitle154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemDefinition_in_entryRuleItemDefinition181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemDefinition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__Group__0_in_ruleItemDefinition214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseDefinition_in_entryRuleUseDefinition241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseDefinition248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group__0_in_ruleUseDefinition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSceneDefinition_in_entryRuleSceneDefinition301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSceneDefinition308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Group__0_in_ruleSceneDefinition334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemPositionDefinition_in_entryRuleItemPositionDefinition361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemPositionDefinition368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group__0_in_ruleItemPositionDefinition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartDefinition_in_entryRuleStartDefinition421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartDefinition428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group__0_in_ruleStartDefinition454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ItemDefinition__Alternatives_0491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ItemDefinition__Alternatives_0511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Group_4_0__0_in_rule__SceneDefinition__Alternatives_4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SceneDefinition__Alternatives_4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__Group__0__Impl_in_rule__Adventure__Group__0596 = new BitSet(new long[]{0x0000000204001800L});
    public static final BitSet FOLLOW_rule__Adventure__Group__1_in_rule__Adventure__Group__0599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__TitleAssignment_0_in_rule__Adventure__Group__0__Impl626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__Group__1__Impl_in_rule__Adventure__Group__1656 = new BitSet(new long[]{0x0000000204001800L});
    public static final BitSet FOLLOW_rule__Adventure__Group__2_in_rule__Adventure__Group__1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__UnorderedGroup_1_in_rule__Adventure__Group__1__Impl686 = new BitSet(new long[]{0x0000000004001802L});
    public static final BitSet FOLLOW_rule__Adventure__Group__2__Impl_in_rule__Adventure__Group__2717 = new BitSet(new long[]{0x0000000004001800L});
    public static final BitSet FOLLOW_rule__Adventure__Group__3_in_rule__Adventure__Group__2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__StartDefAssignment_2_in_rule__Adventure__Group__2__Impl747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__Group__3__Impl_in_rule__Adventure__Group__3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__UnorderedGroup_3_in_rule__Adventure__Group__3__Impl804 = new BitSet(new long[]{0x0000000004001802L});
    public static final BitSet FOLLOW_rule__ItemDefinition__Group__0__Impl_in_rule__ItemDefinition__Group__0843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ItemDefinition__Group__1_in_rule__ItemDefinition__Group__0846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__Alternatives_0_in_rule__ItemDefinition__Group__0__Impl873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__Group__1__Impl_in_rule__ItemDefinition__Group__1903 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ItemDefinition__Group__2_in_rule__ItemDefinition__Group__1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__NameAssignment_1_in_rule__ItemDefinition__Group__1__Impl933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__Group__2__Impl_in_rule__ItemDefinition__Group__2963 = new BitSet(new long[]{0x0000001000018000L});
    public static final BitSet FOLLOW_rule__ItemDefinition__Group__3_in_rule__ItemDefinition__Group__2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ItemDefinition__Group__2__Impl994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__Group__3__Impl_in_rule__ItemDefinition__Group__31025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__UnorderedGroup_3_in_rule__ItemDefinition__Group__3__Impl1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__Group_3_1__0__Impl_in_rule__ItemDefinition__Group_3_1__01090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ItemDefinition__Group_3_1__1_in_rule__ItemDefinition__Group_3_1__01093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ItemDefinition__Group_3_1__0__Impl1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__Group_3_1__1__Impl_in_rule__ItemDefinition__Group_3_1__11152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__ImgAssignment_3_1_1_in_rule__ItemDefinition__Group_3_1__1__Impl1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group__0__Impl_in_rule__UseDefinition__Group__01213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group__1_in_rule__UseDefinition__Group__01216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UseDefinition__Group__0__Impl1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group__1__Impl_in_rule__UseDefinition__Group__11275 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group__2_in_rule__UseDefinition__Group__11278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__NameAssignment_1_in_rule__UseDefinition__Group__1__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group__2__Impl_in_rule__UseDefinition__Group__21335 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group__3_in_rule__UseDefinition__Group__21338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__UseDefinition__Group__2__Impl1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group__3__Impl_in_rule__UseDefinition__Group__31400 = new BitSet(new long[]{0x0000000003A80000L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group__4_in_rule__UseDefinition__Group__31403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__UseDefinition__Group__3__Impl1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group__4__Impl_in_rule__UseDefinition__Group__41462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__UnorderedGroup_4_in_rule__UseDefinition__Group__4__Impl1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_0__0__Impl_in_rule__UseDefinition__Group_4_0__01529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_0__1_in_rule__UseDefinition__Group_4_0__01532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UseDefinition__Group_4_0__0__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_0__1__Impl_in_rule__UseDefinition__Group_4_0__11591 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_0__2_in_rule__UseDefinition__Group_4_0__11594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__ReqsAssignment_4_0_1_in_rule__UseDefinition__Group_4_0__1__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_0__2__Impl_in_rule__UseDefinition__Group_4_0__21651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_0_2__0_in_rule__UseDefinition__Group_4_0__2__Impl1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_0_2__0__Impl_in_rule__UseDefinition__Group_4_0_2__01715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_0_2__1_in_rule__UseDefinition__Group_4_0_2__01718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UseDefinition__Group_4_0_2__0__Impl1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_0_2__1__Impl_in_rule__UseDefinition__Group_4_0_2__11777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__AltTextAssignment_4_0_2_1_in_rule__UseDefinition__Group_4_0_2__1__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_1__0__Impl_in_rule__UseDefinition__Group_4_1__01838 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_1__1_in_rule__UseDefinition__Group_4_1__01841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UseDefinition__Group_4_1__0__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_1__1__Impl_in_rule__UseDefinition__Group_4_1__11900 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_1__2_in_rule__UseDefinition__Group_4_1__11903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__AddsAssignment_4_1_1_in_rule__UseDefinition__Group_4_1__1__Impl1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_1__2__Impl_in_rule__UseDefinition__Group_4_1__21960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_1_2__0_in_rule__UseDefinition__Group_4_1__2__Impl1987 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_1_2__0__Impl_in_rule__UseDefinition__Group_4_1_2__02024 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_1_2__1_in_rule__UseDefinition__Group_4_1_2__02027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UseDefinition__Group_4_1_2__0__Impl2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_1_2__1__Impl_in_rule__UseDefinition__Group_4_1_2__12086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__AddsAssignment_4_1_2_1_in_rule__UseDefinition__Group_4_1_2__1__Impl2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_2__0__Impl_in_rule__UseDefinition__Group_4_2__02147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_2__1_in_rule__UseDefinition__Group_4_2__02150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UseDefinition__Group_4_2__0__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_2__1__Impl_in_rule__UseDefinition__Group_4_2__12209 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_2__2_in_rule__UseDefinition__Group_4_2__12212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__DelsAssignment_4_2_1_in_rule__UseDefinition__Group_4_2__1__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_2__2__Impl_in_rule__UseDefinition__Group_4_2__22269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_2_2__0_in_rule__UseDefinition__Group_4_2__2__Impl2296 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_2_2__0__Impl_in_rule__UseDefinition__Group_4_2_2__02333 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_2_2__1_in_rule__UseDefinition__Group_4_2_2__02336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UseDefinition__Group_4_2_2__0__Impl2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_2_2__1__Impl_in_rule__UseDefinition__Group_4_2_2__12395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__DelsAssignment_4_2_2_1_in_rule__UseDefinition__Group_4_2_2__1__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_3__0__Impl_in_rule__UseDefinition__Group_4_3__02456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_3__1_in_rule__UseDefinition__Group_4_3__02459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UseDefinition__Group_4_3__0__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_3__1__Impl_in_rule__UseDefinition__Group_4_3__12518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__TextAssignment_4_3_1_in_rule__UseDefinition__Group_4_3__1__Impl2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_4__0__Impl_in_rule__UseDefinition__Group_4_4__02579 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_4__1_in_rule__UseDefinition__Group_4_4__02582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UseDefinition__Group_4_4__0__Impl2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_4__1__Impl_in_rule__UseDefinition__Group_4_4__12641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__FollowSceneAssignment_4_4_1_in_rule__UseDefinition__Group_4_4__1__Impl2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Group__0__Impl_in_rule__SceneDefinition__Group__02702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Group__1_in_rule__SceneDefinition__Group__02705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SceneDefinition__Group__0__Impl2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Group__1__Impl_in_rule__SceneDefinition__Group__12764 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Group__2_in_rule__SceneDefinition__Group__12767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SceneDefinition__NameAssignment_1_in_rule__SceneDefinition__Group__1__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Group__2__Impl_in_rule__SceneDefinition__Group__22824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Group__3_in_rule__SceneDefinition__Group__22827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SceneDefinition__Group__2__Impl2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Group__3__Impl_in_rule__SceneDefinition__Group__32886 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Group__4_in_rule__SceneDefinition__Group__32889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SceneDefinition__ImgAssignment_3_in_rule__SceneDefinition__Group__3__Impl2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Group__4__Impl_in_rule__SceneDefinition__Group__42946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Alternatives_4_in_rule__SceneDefinition__Group__4__Impl2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Group_4_0__0__Impl_in_rule__SceneDefinition__Group_4_0__03013 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Group_4_0__1_in_rule__SceneDefinition__Group_4_0__03016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SceneDefinition__Group_4_0__0__Impl3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SceneDefinition__Group_4_0__1__Impl_in_rule__SceneDefinition__Group_4_0__13075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SceneDefinition__ItemsAssignment_4_0_1_in_rule__SceneDefinition__Group_4_0__1__Impl3104 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__SceneDefinition__ItemsAssignment_4_0_1_in_rule__SceneDefinition__Group_4_0__1__Impl3116 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group__0__Impl_in_rule__ItemPositionDefinition__Group__03153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group__1_in_rule__ItemPositionDefinition__Group__03156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ItemPositionDefinition__Group__0__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group__1__Impl_in_rule__ItemPositionDefinition__Group__13215 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group__2_in_rule__ItemPositionDefinition__Group__13218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__ItemAssignment_1_in_rule__ItemPositionDefinition__Group__1__Impl3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group__2__Impl_in_rule__ItemPositionDefinition__Group__23275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group_2__0_in_rule__ItemPositionDefinition__Group__2__Impl3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group_2__0__Impl_in_rule__ItemPositionDefinition__Group_2__03339 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group_2__1_in_rule__ItemPositionDefinition__Group_2__03342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ItemPositionDefinition__Group_2__0__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group_2__1__Impl_in_rule__ItemPositionDefinition__Group_2__13401 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group_2__2_in_rule__ItemPositionDefinition__Group_2__13404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ItemPositionDefinition__Group_2__1__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group_2__2__Impl_in_rule__ItemPositionDefinition__Group_2__23463 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group_2__3_in_rule__ItemPositionDefinition__Group_2__23466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__XposAssignment_2_2_in_rule__ItemPositionDefinition__Group_2__2__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group_2__3__Impl_in_rule__ItemPositionDefinition__Group_2__33523 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group_2__4_in_rule__ItemPositionDefinition__Group_2__33526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ItemPositionDefinition__Group_2__3__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group_2__4__Impl_in_rule__ItemPositionDefinition__Group_2__43585 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group_2__5_in_rule__ItemPositionDefinition__Group_2__43588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__YposAssignment_2_4_in_rule__ItemPositionDefinition__Group_2__4__Impl3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemPositionDefinition__Group_2__5__Impl_in_rule__ItemPositionDefinition__Group_2__53645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ItemPositionDefinition__Group_2__5__Impl3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group__0__Impl_in_rule__StartDefinition__Group__03716 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group__1_in_rule__StartDefinition__Group__03719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__StartDefinition__Group__0__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group__1__Impl_in_rule__StartDefinition__Group__13778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__UnorderedGroup_1_in_rule__StartDefinition__Group__1__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group_1_0__0__Impl_in_rule__StartDefinition__Group_1_0__03839 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group_1_0__1_in_rule__StartDefinition__Group_1_0__03842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__StartDefinition__Group_1_0__0__Impl3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group_1_0__1__Impl_in_rule__StartDefinition__Group_1_0__13901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__StartLocAssignment_1_0_1_in_rule__StartDefinition__Group_1_0__1__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group_1_1__0__Impl_in_rule__StartDefinition__Group_1_1__03962 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group_1_1__1_in_rule__StartDefinition__Group_1_1__03965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__StartDefinition__Group_1_1__0__Impl3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group_1_1__1__Impl_in_rule__StartDefinition__Group_1_1__14024 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group_1_1__2_in_rule__StartDefinition__Group_1_1__14027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__StartItemsAssignment_1_1_1_in_rule__StartDefinition__Group_1_1__1__Impl4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group_1_1__2__Impl_in_rule__StartDefinition__Group_1_1__24084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group_1_1_2__0_in_rule__StartDefinition__Group_1_1__2__Impl4111 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group_1_1_2__0__Impl_in_rule__StartDefinition__Group_1_1_2__04148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group_1_1_2__1_in_rule__StartDefinition__Group_1_1_2__04151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StartDefinition__Group_1_1_2__0__Impl4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group_1_1_2__1__Impl_in_rule__StartDefinition__Group_1_1_2__14210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__StartItemsAssignment_1_1_2_1_in_rule__StartDefinition__Group_1_1_2__1__Impl4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__UnorderedGroup_1__0_in_rule__Adventure__UnorderedGroup_14272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__ItemDefAssignment_1_0_in_rule__Adventure__UnorderedGroup_1__Impl4362 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Adventure__ItemDefAssignment_1_0_in_rule__Adventure__UnorderedGroup_1__Impl4406 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Adventure__SceneDefAssignment_1_1_in_rule__Adventure__UnorderedGroup_1__Impl4505 = new BitSet(new long[]{0x0000000004001802L});
    public static final BitSet FOLLOW_rule__Adventure__SceneDefAssignment_1_1_in_rule__Adventure__UnorderedGroup_1__Impl4549 = new BitSet(new long[]{0x0000000004001802L});
    public static final BitSet FOLLOW_rule__Adventure__UnorderedGroup_1__Impl_in_rule__Adventure__UnorderedGroup_1__04615 = new BitSet(new long[]{0x0000000004001802L});
    public static final BitSet FOLLOW_rule__Adventure__UnorderedGroup_1__1_in_rule__Adventure__UnorderedGroup_1__04618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__UnorderedGroup_1__Impl_in_rule__Adventure__UnorderedGroup_1__14643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__UnorderedGroup_3__0_in_rule__Adventure__UnorderedGroup_34671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__ItemDefAssignment_3_0_in_rule__Adventure__UnorderedGroup_3__Impl4761 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Adventure__ItemDefAssignment_3_0_in_rule__Adventure__UnorderedGroup_3__Impl4805 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Adventure__SceneDefAssignment_3_1_in_rule__Adventure__UnorderedGroup_3__Impl4904 = new BitSet(new long[]{0x0000000004001802L});
    public static final BitSet FOLLOW_rule__Adventure__SceneDefAssignment_3_1_in_rule__Adventure__UnorderedGroup_3__Impl4948 = new BitSet(new long[]{0x0000000004001802L});
    public static final BitSet FOLLOW_rule__Adventure__UnorderedGroup_3__Impl_in_rule__Adventure__UnorderedGroup_3__05014 = new BitSet(new long[]{0x0000000004001802L});
    public static final BitSet FOLLOW_rule__Adventure__UnorderedGroup_3__1_in_rule__Adventure__UnorderedGroup_3__05017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__UnorderedGroup_3__Impl_in_rule__Adventure__UnorderedGroup_3__15042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__UnorderedGroup_3__0_in_rule__ItemDefinition__UnorderedGroup_35070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__PickupAssignment_3_0_in_rule__ItemDefinition__UnorderedGroup_3__Impl5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__Group_3_1__0_in_rule__ItemDefinition__UnorderedGroup_3__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__UsesAssignment_3_2_in_rule__ItemDefinition__UnorderedGroup_3__Impl5342 = new BitSet(new long[]{0x0000001000018002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__UsesAssignment_3_2_in_rule__ItemDefinition__UnorderedGroup_3__Impl5386 = new BitSet(new long[]{0x0000001000018002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__UnorderedGroup_3__Impl_in_rule__ItemDefinition__UnorderedGroup_3__05452 = new BitSet(new long[]{0x0000001000018002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__UnorderedGroup_3__1_in_rule__ItemDefinition__UnorderedGroup_3__05455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__UnorderedGroup_3__Impl_in_rule__ItemDefinition__UnorderedGroup_3__15480 = new BitSet(new long[]{0x0000001000018002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__UnorderedGroup_3__2_in_rule__ItemDefinition__UnorderedGroup_3__15483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__UnorderedGroup_3__Impl_in_rule__ItemDefinition__UnorderedGroup_3__25508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__UnorderedGroup_4__0_in_rule__UseDefinition__UnorderedGroup_45538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_0__0_in_rule__UseDefinition__UnorderedGroup_4__Impl5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_1__0_in_rule__UseDefinition__UnorderedGroup_4__Impl5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_2__0_in_rule__UseDefinition__UnorderedGroup_4__Impl5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_3__0_in_rule__UseDefinition__UnorderedGroup_4__Impl5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__Group_4_4__0_in_rule__UseDefinition__UnorderedGroup_4__Impl5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__UnorderedGroup_4__Impl_in_rule__UseDefinition__UnorderedGroup_4__06048 = new BitSet(new long[]{0x0000000003A80002L});
    public static final BitSet FOLLOW_rule__UseDefinition__UnorderedGroup_4__1_in_rule__UseDefinition__UnorderedGroup_4__06051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__UnorderedGroup_4__Impl_in_rule__UseDefinition__UnorderedGroup_4__16076 = new BitSet(new long[]{0x0000000003A80002L});
    public static final BitSet FOLLOW_rule__UseDefinition__UnorderedGroup_4__2_in_rule__UseDefinition__UnorderedGroup_4__16079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__UnorderedGroup_4__Impl_in_rule__UseDefinition__UnorderedGroup_4__26104 = new BitSet(new long[]{0x0000000003A80002L});
    public static final BitSet FOLLOW_rule__UseDefinition__UnorderedGroup_4__3_in_rule__UseDefinition__UnorderedGroup_4__26107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__UnorderedGroup_4__Impl_in_rule__UseDefinition__UnorderedGroup_4__36132 = new BitSet(new long[]{0x0000000003A80002L});
    public static final BitSet FOLLOW_rule__UseDefinition__UnorderedGroup_4__4_in_rule__UseDefinition__UnorderedGroup_4__36135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseDefinition__UnorderedGroup_4__Impl_in_rule__UseDefinition__UnorderedGroup_4__46160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__UnorderedGroup_1__0_in_rule__StartDefinition__UnorderedGroup_16194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group_1_0__0_in_rule__StartDefinition__UnorderedGroup_1__Impl6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__Group_1_1__0_in_rule__StartDefinition__UnorderedGroup_1__Impl6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__UnorderedGroup_1__Impl_in_rule__StartDefinition__UnorderedGroup_1__06433 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__UnorderedGroup_1__1_in_rule__StartDefinition__UnorderedGroup_1__06436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartDefinition__UnorderedGroup_1__Impl_in_rule__StartDefinition__UnorderedGroup_1__16461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdventureTitle_in_rule__Adventure__TitleAssignment_06493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemDefinition_in_rule__Adventure__ItemDefAssignment_1_06524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSceneDefinition_in_rule__Adventure__SceneDefAssignment_1_16555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartDefinition_in_rule__Adventure__StartDefAssignment_26586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemDefinition_in_rule__Adventure__ItemDefAssignment_3_06617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSceneDefinition_in_rule__Adventure__SceneDefAssignment_3_16648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AdventureTitle__NameAssignment6679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ItemDefinition__NameAssignment_16710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ItemDefinition__PickupAssignment_3_06746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ItemDefinition__ImgAssignment_3_1_16785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseDefinition_in_rule__ItemDefinition__UsesAssignment_3_26816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UseDefinition__NameAssignment_16847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UseDefinition__ReqsAssignment_4_0_16882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UseDefinition__AltTextAssignment_4_0_2_16917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UseDefinition__AddsAssignment_4_1_16952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UseDefinition__AddsAssignment_4_1_2_16991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UseDefinition__DelsAssignment_4_2_17030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UseDefinition__DelsAssignment_4_2_2_17069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UseDefinition__TextAssignment_4_3_17104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UseDefinition__FollowSceneAssignment_4_4_17139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SceneDefinition__NameAssignment_17174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SceneDefinition__ImgAssignment_37205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemPositionDefinition_in_rule__SceneDefinition__ItemsAssignment_4_0_17236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ItemPositionDefinition__ItemAssignment_17271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ItemPositionDefinition__XposAssignment_2_27306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ItemPositionDefinition__YposAssignment_2_47337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartDefinition__StartLocAssignment_1_0_17372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartDefinition__StartItemsAssignment_1_1_17411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StartDefinition__StartItemsAssignment_1_1_2_17450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__ItemDefAssignment_1_0_in_synpred1_InternalGreatAdventure4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__SceneDefAssignment_1_1_in_synpred2_InternalGreatAdventure4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__ItemDefAssignment_3_0_in_synpred3_InternalGreatAdventure4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Adventure__SceneDefAssignment_3_1_in_synpred4_InternalGreatAdventure4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemDefinition__UsesAssignment_3_2_in_synpred5_InternalGreatAdventure5383 = new BitSet(new long[]{0x0000000000000002L});

}
