package at.ac.uibk.greatAdventure.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.uibk.greatAdventure.services.GreatAdventureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGreatAdventureParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'A'", "'An'", "':'", "'- can be picked up'", "'- looks like'", "'- you can'", "'with'", "'it, which:'", "'+ requires'", "'or says'", "'+ adds'", "','", "'+ removes'", "'+ says'", "'+ takes you to the'", "'The'", "'looks like'", "'and in it are:'", "'.'", "'- a'", "'at'", "'('", "')'", "'In the beginning you:'", "'- are at the'", "'- have'"
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
    public String getGrammarFileName() { return "../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g"; }



     	private GreatAdventureGrammarAccess grammarAccess;
     	
        public InternalGreatAdventureParser(TokenStream input, GreatAdventureGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Adventure";	
       	}
       	
       	@Override
       	protected GreatAdventureGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAdventure"
    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:67:1: entryRuleAdventure returns [EObject current=null] : iv_ruleAdventure= ruleAdventure EOF ;
    public final EObject entryRuleAdventure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdventure = null;


        try {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:68:2: (iv_ruleAdventure= ruleAdventure EOF )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:69:2: iv_ruleAdventure= ruleAdventure EOF
            {
             newCompositeNode(grammarAccess.getAdventureRule()); 
            pushFollow(FOLLOW_ruleAdventure_in_entryRuleAdventure75);
            iv_ruleAdventure=ruleAdventure();

            state._fsp--;

             current =iv_ruleAdventure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdventure85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdventure"


    // $ANTLR start "ruleAdventure"
    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:76:1: ruleAdventure returns [EObject current=null] : ( ( (lv_title_0_0= ruleAdventureTitle ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) ) )* ( (lv_startDef_4_0= ruleStartDefinition ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) ) )* ) ;
    public final EObject ruleAdventure() throws RecognitionException {
        EObject current = null;

        EObject lv_title_0_0 = null;

        EObject lv_itemDef_2_0 = null;

        EObject lv_sceneDef_3_0 = null;

        EObject lv_startDef_4_0 = null;

        EObject lv_itemDef_6_0 = null;

        EObject lv_sceneDef_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:79:28: ( ( ( (lv_title_0_0= ruleAdventureTitle ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) ) )* ( (lv_startDef_4_0= ruleStartDefinition ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) ) )* ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:80:1: ( ( (lv_title_0_0= ruleAdventureTitle ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) ) )* ( (lv_startDef_4_0= ruleStartDefinition ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) ) )* )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:80:1: ( ( (lv_title_0_0= ruleAdventureTitle ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) ) )* ( (lv_startDef_4_0= ruleStartDefinition ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) ) )* )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:80:2: ( (lv_title_0_0= ruleAdventureTitle ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) ) )* ( (lv_startDef_4_0= ruleStartDefinition ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) ) )*
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:80:2: ( (lv_title_0_0= ruleAdventureTitle ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:81:1: (lv_title_0_0= ruleAdventureTitle )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:81:1: (lv_title_0_0= ruleAdventureTitle )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:82:3: lv_title_0_0= ruleAdventureTitle
            {
             
            	        newCompositeNode(grammarAccess.getAdventureAccess().getTitleAdventureTitleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAdventureTitle_in_ruleAdventure131);
            lv_title_0_0=ruleAdventureTitle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdventureRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_0_0, 
                    		"AdventureTitle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:98:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=12)||LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:100:1: ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:100:1: ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:101:2: ( ( ({...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?)
            	    {
            	     
            	    	  getUnorderedGroupHelper().enter(grammarAccess.getAdventureAccess().getUnorderedGroup_1());
            	    	
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:104:2: ( ( ({...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?)
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:105:3: ( ({...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:105:3: ( ({...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=3;
            	        switch ( input.LA(1) ) {
            	        case 11:
            	            {
            	            int LA3_2 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;
            	        case 12:
            	            {
            	            int LA3_3 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;
            	        case 26:
            	            {
            	            int LA3_4 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {
            	                alt3=2;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:107:4: ({...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ ) )
            	    	    {
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:107:4: ({...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ ) )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:108:5: {...}? => ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleAdventure", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0)");
            	    	    }
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:108:106: ( ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+ )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:109:6: ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0);
            	    	    	 				
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:112:6: ({...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) ) )+
            	    	    int cnt1=0;
            	    	    loop1:
            	    	    do {
            	    	        int alt1=2;
            	    	        int LA1_0 = input.LA(1);

            	    	        if ( (LA1_0==11) ) {
            	    	            int LA1_2 = input.LA(2);

            	    	            if ( ((true)) ) {
            	    	                alt1=1;
            	    	            }


            	    	        }
            	    	        else if ( (LA1_0==12) ) {
            	    	            int LA1_3 = input.LA(2);

            	    	            if ( ((true)) ) {
            	    	                alt1=1;
            	    	            }


            	    	        }


            	    	        switch (alt1) {
            	    	    	case 1 :
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:112:7: {...}? => ( (lv_itemDef_2_0= ruleItemDefinition ) )
            	    	    	    {
            	    	    	    if ( !((true)) ) {
            	    	    	        throw new FailedPredicateException(input, "ruleAdventure", "true");
            	    	    	    }
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:112:16: ( (lv_itemDef_2_0= ruleItemDefinition ) )
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:113:1: (lv_itemDef_2_0= ruleItemDefinition )
            	    	    	    {
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:113:1: (lv_itemDef_2_0= ruleItemDefinition )
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:114:3: lv_itemDef_2_0= ruleItemDefinition
            	    	    	    {
            	    	    	     
            	    	    	    	        newCompositeNode(grammarAccess.getAdventureAccess().getItemDefItemDefinitionParserRuleCall_1_0_0()); 
            	    	    	    	    
            	    	    	    pushFollow(FOLLOW_ruleItemDefinition_in_ruleAdventure197);
            	    	    	    lv_itemDef_2_0=ruleItemDefinition();

            	    	    	    state._fsp--;


            	    	    	    	        if (current==null) {
            	    	    	    	            current = createModelElementForParent(grammarAccess.getAdventureRule());
            	    	    	    	        }
            	    	    	           		add(
            	    	    	           			current, 
            	    	    	           			"itemDef",
            	    	    	            		lv_itemDef_2_0, 
            	    	    	            		"ItemDefinition");
            	    	    	    	        afterParserOrEnumRuleCall();
            	    	    	    	    

            	    	    	    }


            	    	    	    }


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    if ( cnt1 >= 1 ) break loop1;
            	    	                EarlyExitException eee =
            	    	                    new EarlyExitException(1, input);
            	    	                throw eee;
            	    	        }
            	    	        cnt1++;
            	    	    } while (true);

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup_1());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:137:4: ({...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ ) )
            	    	    {
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:137:4: ({...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ ) )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:138:5: {...}? => ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleAdventure", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1)");
            	    	    }
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:138:106: ( ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+ )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:139:6: ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1);
            	    	    	 				
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:142:6: ({...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) ) )+
            	    	    int cnt2=0;
            	    	    loop2:
            	    	    do {
            	    	        int alt2=2;
            	    	        int LA2_0 = input.LA(1);

            	    	        if ( (LA2_0==26) ) {
            	    	            int LA2_2 = input.LA(2);

            	    	            if ( ((true)) ) {
            	    	                alt2=1;
            	    	            }


            	    	        }


            	    	        switch (alt2) {
            	    	    	case 1 :
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:142:7: {...}? => ( (lv_sceneDef_3_0= ruleSceneDefinition ) )
            	    	    	    {
            	    	    	    if ( !((true)) ) {
            	    	    	        throw new FailedPredicateException(input, "ruleAdventure", "true");
            	    	    	    }
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:142:16: ( (lv_sceneDef_3_0= ruleSceneDefinition ) )
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:143:1: (lv_sceneDef_3_0= ruleSceneDefinition )
            	    	    	    {
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:143:1: (lv_sceneDef_3_0= ruleSceneDefinition )
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:144:3: lv_sceneDef_3_0= ruleSceneDefinition
            	    	    	    {
            	    	    	     
            	    	    	    	        newCompositeNode(grammarAccess.getAdventureAccess().getSceneDefSceneDefinitionParserRuleCall_1_1_0()); 
            	    	    	    	    
            	    	    	    pushFollow(FOLLOW_ruleSceneDefinition_in_ruleAdventure273);
            	    	    	    lv_sceneDef_3_0=ruleSceneDefinition();

            	    	    	    state._fsp--;


            	    	    	    	        if (current==null) {
            	    	    	    	            current = createModelElementForParent(grammarAccess.getAdventureRule());
            	    	    	    	        }
            	    	    	           		add(
            	    	    	           			current, 
            	    	    	           			"sceneDef",
            	    	    	            		lv_sceneDef_3_0, 
            	    	    	            		"SceneDefinition");
            	    	    	    	        afterParserOrEnumRuleCall();
            	    	    	    	    

            	    	    	    }


            	    	    	    }


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    if ( cnt2 >= 1 ) break loop2;
            	    	                EarlyExitException eee =
            	    	                    new EarlyExitException(2, input);
            	    	                throw eee;
            	    	        }
            	    	        cnt2++;
            	    	    } while (true);

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup_1());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_1()) ) {
            	        throw new FailedPredicateException(input, "ruleAdventure", "getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_1())");
            	    }

            	    }


            	    }

            	     
            	    	  getUnorderedGroupHelper().leave(grammarAccess.getAdventureAccess().getUnorderedGroup_1());
            	    	

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:175:3: ( (lv_startDef_4_0= ruleStartDefinition ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:176:1: (lv_startDef_4_0= ruleStartDefinition )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:176:1: (lv_startDef_4_0= ruleStartDefinition )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:177:3: lv_startDef_4_0= ruleStartDefinition
            {
             
            	        newCompositeNode(grammarAccess.getAdventureAccess().getStartDefStartDefinitionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStartDefinition_in_ruleAdventure342);
            lv_startDef_4_0=ruleStartDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdventureRule());
            	        }
                   		set(
                   			current, 
                   			"startDef",
                    		lv_startDef_4_0, 
                    		"StartDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:193:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=11 && LA8_0<=12)||LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:195:1: ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:195:1: ( ( ( ({...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:196:2: ( ( ({...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?)
            	    {
            	     
            	    	  getUnorderedGroupHelper().enter(grammarAccess.getAdventureAccess().getUnorderedGroup_3());
            	    	
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:199:2: ( ( ({...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?)
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:200:3: ( ({...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ ) ) )+ {...}?
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:200:3: ( ({...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ ) ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=3;
            	        switch ( input.LA(1) ) {
            	        case 11:
            	            {
            	            int LA7_2 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {
            	                alt7=1;
            	            }


            	            }
            	            break;
            	        case 12:
            	            {
            	            int LA7_3 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {
            	                alt7=1;
            	            }


            	            }
            	            break;
            	        case 26:
            	            {
            	            int LA7_4 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {
            	                alt7=2;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt7) {
            	    	case 1 :
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:202:4: ({...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ ) )
            	    	    {
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:202:4: ({...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ ) )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:203:5: {...}? => ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleAdventure", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0)");
            	    	    }
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:203:106: ( ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+ )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:204:6: ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0);
            	    	    	 				
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:207:6: ({...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) ) )+
            	    	    int cnt5=0;
            	    	    loop5:
            	    	    do {
            	    	        int alt5=2;
            	    	        int LA5_0 = input.LA(1);

            	    	        if ( (LA5_0==11) ) {
            	    	            int LA5_2 = input.LA(2);

            	    	            if ( ((true)) ) {
            	    	                alt5=1;
            	    	            }


            	    	        }
            	    	        else if ( (LA5_0==12) ) {
            	    	            int LA5_3 = input.LA(2);

            	    	            if ( ((true)) ) {
            	    	                alt5=1;
            	    	            }


            	    	        }


            	    	        switch (alt5) {
            	    	    	case 1 :
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:207:7: {...}? => ( (lv_itemDef_6_0= ruleItemDefinition ) )
            	    	    	    {
            	    	    	    if ( !((true)) ) {
            	    	    	        throw new FailedPredicateException(input, "ruleAdventure", "true");
            	    	    	    }
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:207:16: ( (lv_itemDef_6_0= ruleItemDefinition ) )
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:208:1: (lv_itemDef_6_0= ruleItemDefinition )
            	    	    	    {
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:208:1: (lv_itemDef_6_0= ruleItemDefinition )
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:209:3: lv_itemDef_6_0= ruleItemDefinition
            	    	    	    {
            	    	    	     
            	    	    	    	        newCompositeNode(grammarAccess.getAdventureAccess().getItemDefItemDefinitionParserRuleCall_3_0_0()); 
            	    	    	    	    
            	    	    	    pushFollow(FOLLOW_ruleItemDefinition_in_ruleAdventure408);
            	    	    	    lv_itemDef_6_0=ruleItemDefinition();

            	    	    	    state._fsp--;


            	    	    	    	        if (current==null) {
            	    	    	    	            current = createModelElementForParent(grammarAccess.getAdventureRule());
            	    	    	    	        }
            	    	    	           		add(
            	    	    	           			current, 
            	    	    	           			"itemDef",
            	    	    	            		lv_itemDef_6_0, 
            	    	    	            		"ItemDefinition");
            	    	    	    	        afterParserOrEnumRuleCall();
            	    	    	    	    

            	    	    	    }


            	    	    	    }


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    if ( cnt5 >= 1 ) break loop5;
            	    	                EarlyExitException eee =
            	    	                    new EarlyExitException(5, input);
            	    	                throw eee;
            	    	        }
            	    	        cnt5++;
            	    	    } while (true);

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup_3());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:232:4: ({...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ ) )
            	    	    {
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:232:4: ({...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ ) )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:233:5: {...}? => ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleAdventure", "getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1)");
            	    	    }
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:233:106: ( ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+ )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:234:6: ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1);
            	    	    	 				
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:237:6: ({...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) ) )+
            	    	    int cnt6=0;
            	    	    loop6:
            	    	    do {
            	    	        int alt6=2;
            	    	        int LA6_0 = input.LA(1);

            	    	        if ( (LA6_0==26) ) {
            	    	            int LA6_2 = input.LA(2);

            	    	            if ( ((true)) ) {
            	    	                alt6=1;
            	    	            }


            	    	        }


            	    	        switch (alt6) {
            	    	    	case 1 :
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:237:7: {...}? => ( (lv_sceneDef_7_0= ruleSceneDefinition ) )
            	    	    	    {
            	    	    	    if ( !((true)) ) {
            	    	    	        throw new FailedPredicateException(input, "ruleAdventure", "true");
            	    	    	    }
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:237:16: ( (lv_sceneDef_7_0= ruleSceneDefinition ) )
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:238:1: (lv_sceneDef_7_0= ruleSceneDefinition )
            	    	    	    {
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:238:1: (lv_sceneDef_7_0= ruleSceneDefinition )
            	    	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:239:3: lv_sceneDef_7_0= ruleSceneDefinition
            	    	    	    {
            	    	    	     
            	    	    	    	        newCompositeNode(grammarAccess.getAdventureAccess().getSceneDefSceneDefinitionParserRuleCall_3_1_0()); 
            	    	    	    	    
            	    	    	    pushFollow(FOLLOW_ruleSceneDefinition_in_ruleAdventure484);
            	    	    	    lv_sceneDef_7_0=ruleSceneDefinition();

            	    	    	    state._fsp--;


            	    	    	    	        if (current==null) {
            	    	    	    	            current = createModelElementForParent(grammarAccess.getAdventureRule());
            	    	    	    	        }
            	    	    	           		add(
            	    	    	           			current, 
            	    	    	           			"sceneDef",
            	    	    	            		lv_sceneDef_7_0, 
            	    	    	            		"SceneDefinition");
            	    	    	    	        afterParserOrEnumRuleCall();
            	    	    	    	    

            	    	    	    }


            	    	    	    }


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    if ( cnt6 >= 1 ) break loop6;
            	    	                EarlyExitException eee =
            	    	                    new EarlyExitException(6, input);
            	    	                throw eee;
            	    	        }
            	    	        cnt6++;
            	    	    } while (true);

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup_3());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_3()) ) {
            	        throw new FailedPredicateException(input, "ruleAdventure", "getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_3())");
            	    }

            	    }


            	    }

            	     
            	    	  getUnorderedGroupHelper().leave(grammarAccess.getAdventureAccess().getUnorderedGroup_3());
            	    	

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdventure"


    // $ANTLR start "entryRuleAdventureTitle"
    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:278:1: entryRuleAdventureTitle returns [EObject current=null] : iv_ruleAdventureTitle= ruleAdventureTitle EOF ;
    public final EObject entryRuleAdventureTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdventureTitle = null;


        try {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:279:2: (iv_ruleAdventureTitle= ruleAdventureTitle EOF )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:280:2: iv_ruleAdventureTitle= ruleAdventureTitle EOF
            {
             newCompositeNode(grammarAccess.getAdventureTitleRule()); 
            pushFollow(FOLLOW_ruleAdventureTitle_in_entryRuleAdventureTitle568);
            iv_ruleAdventureTitle=ruleAdventureTitle();

            state._fsp--;

             current =iv_ruleAdventureTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdventureTitle578); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdventureTitle"


    // $ANTLR start "ruleAdventureTitle"
    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:287:1: ruleAdventureTitle returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleAdventureTitle() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:290:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:291:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:291:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:292:1: (lv_name_0_0= RULE_STRING )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:292:1: (lv_name_0_0= RULE_STRING )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:293:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAdventureTitle619); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAdventureTitleAccess().getNameSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAdventureTitleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdventureTitle"


    // $ANTLR start "entryRuleItemDefinition"
    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:317:1: entryRuleItemDefinition returns [EObject current=null] : iv_ruleItemDefinition= ruleItemDefinition EOF ;
    public final EObject entryRuleItemDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDefinition = null;


        try {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:318:2: (iv_ruleItemDefinition= ruleItemDefinition EOF )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:319:2: iv_ruleItemDefinition= ruleItemDefinition EOF
            {
             newCompositeNode(grammarAccess.getItemDefinitionRule()); 
            pushFollow(FOLLOW_ruleItemDefinition_in_entryRuleItemDefinition659);
            iv_ruleItemDefinition=ruleItemDefinition();

            state._fsp--;

             current =iv_ruleItemDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemDefinition669); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemDefinition"


    // $ANTLR start "ruleItemDefinition"
    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:326:1: ruleItemDefinition returns [EObject current=null] : ( (otherlv_0= 'A' | otherlv_1= 'An' ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( ( ( ( ({...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleItemDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_pickup_5_0=null;
        Token otherlv_6=null;
        Token lv_img_7_0=null;
        EObject lv_uses_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:329:28: ( ( (otherlv_0= 'A' | otherlv_1= 'An' ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( ( ( ( ({...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ ) ) )+ {...}?) ) ) ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:330:1: ( (otherlv_0= 'A' | otherlv_1= 'An' ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( ( ( ( ({...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ ) ) )+ {...}?) ) ) )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:330:1: ( (otherlv_0= 'A' | otherlv_1= 'An' ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( ( ( ( ({...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ ) ) )+ {...}?) ) ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:330:2: (otherlv_0= 'A' | otherlv_1= 'An' ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ':' ( ( ( ( ({...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ ) ) )+ {...}?) ) )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:330:2: (otherlv_0= 'A' | otherlv_1= 'An' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            else if ( (LA9_0==12) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:330:4: otherlv_0= 'A'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleItemDefinition707); 

                        	newLeafNode(otherlv_0, grammarAccess.getItemDefinitionAccess().getAKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:335:7: otherlv_1= 'An'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleItemDefinition725); 

                        	newLeafNode(otherlv_1, grammarAccess.getItemDefinitionAccess().getAnKeyword_0_1());
                        

                    }
                    break;

            }

            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:339:2: ( (lv_name_2_0= RULE_STRING ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:340:1: (lv_name_2_0= RULE_STRING )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:340:1: (lv_name_2_0= RULE_STRING )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:341:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleItemDefinition743); 

            			newLeafNode(lv_name_2_0, grammarAccess.getItemDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getItemDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleItemDefinition760); 

                	newLeafNode(otherlv_3, grammarAccess.getItemDefinitionAccess().getColonKeyword_2());
                
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:361:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ ) ) )+ {...}?) ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:363:1: ( ( ( ({...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ ) ) )+ {...}?) )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:363:1: ( ( ( ({...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ ) ) )+ {...}?) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:364:2: ( ( ({...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3());
            	
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:367:2: ( ( ({...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ ) ) )+ {...}?)
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:368:3: ( ({...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ ) ) )+ {...}?
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:368:3: ( ({...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=4;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                    alt11=3;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:370:4: ({...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) ) )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:370:4: ({...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:371:5: {...}? => ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleItemDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:371:111: ( ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:372:6: ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:375:6: ({...}? => ( (lv_pickup_5_0= '- can be picked up' ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:375:7: {...}? => ( (lv_pickup_5_0= '- can be picked up' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItemDefinition", "true");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:375:16: ( (lv_pickup_5_0= '- can be picked up' ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:376:1: (lv_pickup_5_0= '- can be picked up' )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:376:1: (lv_pickup_5_0= '- can be picked up' )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:377:3: lv_pickup_5_0= '- can be picked up'
            	    {
            	    lv_pickup_5_0=(Token)match(input,14,FOLLOW_14_in_ruleItemDefinition823); 

            	            newLeafNode(lv_pickup_5_0, grammarAccess.getItemDefinitionAccess().getPickupCanBePickedUpKeyword_3_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getItemDefinitionRule());
            	    	        }
            	           		setWithLastConsumed(current, "pickup", true, "- can be picked up");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:397:4: ({...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:397:4: ({...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:398:5: {...}? => ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleItemDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:398:111: ( ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:399:6: ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:402:6: ({...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:402:7: {...}? => (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleItemDefinition", "true");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:402:16: (otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:402:18: otherlv_6= '- looks like' ( (lv_img_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleItemDefinition903); 

            	        	newLeafNode(otherlv_6, grammarAccess.getItemDefinitionAccess().getLooksLikeKeyword_3_1_0());
            	        
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:406:1: ( (lv_img_7_0= RULE_STRING ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:407:1: (lv_img_7_0= RULE_STRING )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:407:1: (lv_img_7_0= RULE_STRING )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:408:3: lv_img_7_0= RULE_STRING
            	    {
            	    lv_img_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleItemDefinition920); 

            	    			newLeafNode(lv_img_7_0, grammarAccess.getItemDefinitionAccess().getImgSTRINGTerminalRuleCall_3_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getItemDefinitionRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"img",
            	            		lv_img_7_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:431:4: ({...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ ) )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:431:4: ({...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:432:5: {...}? => ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleItemDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:432:111: ( ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+ )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:433:6: ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:436:6: ({...}? => ( (lv_uses_8_0= ruleUseDefinition ) ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==16) ) {
            	            int LA10_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt10=1;
            	            }


            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:436:7: {...}? => ( (lv_uses_8_0= ruleUseDefinition ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleItemDefinition", "true");
            	    	    }
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:436:16: ( (lv_uses_8_0= ruleUseDefinition ) )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:437:1: (lv_uses_8_0= ruleUseDefinition )
            	    	    {
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:437:1: (lv_uses_8_0= ruleUseDefinition )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:438:3: lv_uses_8_0= ruleUseDefinition
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getItemDefinitionAccess().getUsesUseDefinitionParserRuleCall_3_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleUseDefinition_in_ruleItemDefinition1001);
            	    	    lv_uses_8_0=ruleUseDefinition();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getItemDefinitionRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"uses",
            	    	            		lv_uses_8_0, 
            	    	            		"UseDefinition");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt10 >= 1 ) break loop10;
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleItemDefinition", "getUnorderedGroupHelper().canLeave(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3());
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemDefinition"


    // $ANTLR start "entryRuleUseDefinition"
    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:477:1: entryRuleUseDefinition returns [EObject current=null] : iv_ruleUseDefinition= ruleUseDefinition EOF ;
    public final EObject entryRuleUseDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseDefinition = null;


        try {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:478:2: (iv_ruleUseDefinition= ruleUseDefinition EOF )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:479:2: iv_ruleUseDefinition= ruleUseDefinition EOF
            {
             newCompositeNode(grammarAccess.getUseDefinitionRule()); 
            pushFollow(FOLLOW_ruleUseDefinition_in_entryRuleUseDefinition1084);
            iv_ruleUseDefinition=ruleUseDefinition();

            state._fsp--;

             current =iv_ruleUseDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseDefinition1094); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseDefinition"


    // $ANTLR start "ruleUseDefinition"
    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:486:1: ruleUseDefinition returns [EObject current=null] : (otherlv_0= '- you can' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'with' )? otherlv_3= 'it, which:' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleUseDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_altText_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_text_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;

         enterRule(); 
            
        try {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:489:28: ( (otherlv_0= '- you can' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'with' )? otherlv_3= 'it, which:' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) ) ) )* ) ) ) ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:490:1: (otherlv_0= '- you can' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'with' )? otherlv_3= 'it, which:' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) ) ) )* ) ) ) )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:490:1: (otherlv_0= '- you can' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'with' )? otherlv_3= 'it, which:' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) ) ) )* ) ) ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:490:3: otherlv_0= '- you can' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'with' )? otherlv_3= 'it, which:' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleUseDefinition1131); 

                	newLeafNode(otherlv_0, grammarAccess.getUseDefinitionAccess().getYouCanKeyword_0());
                
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:494:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:495:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:495:1: (lv_name_1_0= RULE_STRING )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:496:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseDefinition1148); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUseDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUseDefinitionRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:512:2: (otherlv_2= 'with' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:512:4: otherlv_2= 'with'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleUseDefinition1166); 

                        	newLeafNode(otherlv_2, grammarAccess.getUseDefinitionAccess().getWithKeyword_2());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleUseDefinition1180); 

                	newLeafNode(otherlv_3, grammarAccess.getUseDefinitionAccess().getItWhichKeyword_3());
                
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:520:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) ) ) )* ) ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:522:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) ) ) )* ) )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:522:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) ) ) )* ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:523:2: ( ( ({...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
            	
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:526:2: ( ( ({...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) ) ) )* )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:527:3: ( ({...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) ) ) )*
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:527:3: ( ({...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) ) ) )*
            loop16:
            do {
                int alt16=6;
                int LA16_0 = input.LA(1);

                if ( LA16_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                    alt16=2;
                }
                else if ( LA16_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                    alt16=3;
                }
                else if ( LA16_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                    alt16=4;
                }
                else if ( LA16_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                    alt16=5;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:529:4: ({...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:529:4: ({...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:530:5: {...}? => ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleUseDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:530:110: ( ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:531:6: ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:534:6: ({...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:534:7: {...}? => (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUseDefinition", "true");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:534:16: (otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )? )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:534:18: otherlv_5= '+ requires' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )?
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleUseDefinition1238); 

            	        	newLeafNode(otherlv_5, grammarAccess.getUseDefinitionAccess().getRequiresKeyword_4_0_0());
            	        
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:538:1: ( (otherlv_6= RULE_ID ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:539:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:539:1: (otherlv_6= RULE_ID )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:540:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUseDefinitionRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseDefinition1258); 

            	    		newLeafNode(otherlv_6, grammarAccess.getUseDefinitionAccess().getReqsItemDefinitionCrossReference_4_0_1_0()); 
            	    	

            	    }


            	    }

            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:551:2: (otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) ) )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==20) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:551:4: otherlv_7= 'or says' ( (lv_altText_8_0= RULE_STRING ) )
            	            {
            	            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleUseDefinition1271); 

            	                	newLeafNode(otherlv_7, grammarAccess.getUseDefinitionAccess().getOrSaysKeyword_4_0_2_0());
            	                
            	            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:555:1: ( (lv_altText_8_0= RULE_STRING ) )
            	            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:556:1: (lv_altText_8_0= RULE_STRING )
            	            {
            	            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:556:1: (lv_altText_8_0= RULE_STRING )
            	            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:557:3: lv_altText_8_0= RULE_STRING
            	            {
            	            lv_altText_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseDefinition1288); 

            	            			newLeafNode(lv_altText_8_0, grammarAccess.getUseDefinitionAccess().getAltTextSTRINGTerminalRuleCall_4_0_2_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getUseDefinitionRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"altText",
            	                    		lv_altText_8_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:580:4: ({...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) ) )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:580:4: ({...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:581:5: {...}? => ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleUseDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:581:110: ( ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:582:6: ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:585:6: ({...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:585:7: {...}? => (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUseDefinition", "true");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:585:16: (otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:585:18: otherlv_9= '+ adds' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            	    {
            	    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleUseDefinition1363); 

            	        	newLeafNode(otherlv_9, grammarAccess.getUseDefinitionAccess().getAddsKeyword_4_1_0());
            	        
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:589:1: ( (otherlv_10= RULE_ID ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:590:1: (otherlv_10= RULE_ID )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:590:1: (otherlv_10= RULE_ID )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:591:3: otherlv_10= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUseDefinitionRule());
            	    	        }
            	            
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseDefinition1383); 

            	    		newLeafNode(otherlv_10, grammarAccess.getUseDefinitionAccess().getAddsItemDefinitionCrossReference_4_1_1_0()); 
            	    	

            	    }


            	    }

            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:602:2: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==22) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:602:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    	    {
            	    	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleUseDefinition1396); 

            	    	        	newLeafNode(otherlv_11, grammarAccess.getUseDefinitionAccess().getCommaKeyword_4_1_2_0());
            	    	        
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:606:1: ( (otherlv_12= RULE_ID ) )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:607:1: (otherlv_12= RULE_ID )
            	    	    {
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:607:1: (otherlv_12= RULE_ID )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:608:3: otherlv_12= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getUseDefinitionRule());
            	    	    	        }
            	    	            
            	    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseDefinition1416); 

            	    	    		newLeafNode(otherlv_12, grammarAccess.getUseDefinitionAccess().getAddsItemDefinitionCrossReference_4_1_2_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:626:4: ({...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) ) )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:626:4: ({...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:627:5: {...}? => ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleUseDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:627:110: ( ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:628:6: ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:631:6: ({...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:631:7: {...}? => (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUseDefinition", "true");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:631:16: (otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:631:18: otherlv_13= '+ removes' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
            	    {
            	    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleUseDefinition1486); 

            	        	newLeafNode(otherlv_13, grammarAccess.getUseDefinitionAccess().getRemovesKeyword_4_2_0());
            	        
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:635:1: ( (otherlv_14= RULE_ID ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:636:1: (otherlv_14= RULE_ID )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:636:1: (otherlv_14= RULE_ID )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:637:3: otherlv_14= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUseDefinitionRule());
            	    	        }
            	            
            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseDefinition1506); 

            	    		newLeafNode(otherlv_14, grammarAccess.getUseDefinitionAccess().getDelsItemDefinitionCrossReference_4_2_1_0()); 
            	    	

            	    }


            	    }

            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:648:2: (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==22) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:648:4: otherlv_15= ',' ( (otherlv_16= RULE_ID ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleUseDefinition1519); 

            	    	        	newLeafNode(otherlv_15, grammarAccess.getUseDefinitionAccess().getCommaKeyword_4_2_2_0());
            	    	        
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:652:1: ( (otherlv_16= RULE_ID ) )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:653:1: (otherlv_16= RULE_ID )
            	    	    {
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:653:1: (otherlv_16= RULE_ID )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:654:3: otherlv_16= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getUseDefinitionRule());
            	    	    	        }
            	    	            
            	    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseDefinition1539); 

            	    	    		newLeafNode(otherlv_16, grammarAccess.getUseDefinitionAccess().getDelsItemDefinitionCrossReference_4_2_2_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:672:4: ({...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:672:4: ({...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:673:5: {...}? => ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleUseDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:673:110: ( ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:674:6: ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:677:6: ({...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:677:7: {...}? => (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUseDefinition", "true");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:677:16: (otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:677:18: otherlv_17= '+ says' ( (lv_text_18_0= RULE_STRING ) )
            	    {
            	    otherlv_17=(Token)match(input,24,FOLLOW_24_in_ruleUseDefinition1609); 

            	        	newLeafNode(otherlv_17, grammarAccess.getUseDefinitionAccess().getSaysKeyword_4_3_0());
            	        
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:681:1: ( (lv_text_18_0= RULE_STRING ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:682:1: (lv_text_18_0= RULE_STRING )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:682:1: (lv_text_18_0= RULE_STRING )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:683:3: lv_text_18_0= RULE_STRING
            	    {
            	    lv_text_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseDefinition1626); 

            	    			newLeafNode(lv_text_18_0, grammarAccess.getUseDefinitionAccess().getTextSTRINGTerminalRuleCall_4_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUseDefinitionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"text",
            	            		lv_text_18_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:706:4: ({...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:706:4: ({...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:707:5: {...}? => ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleUseDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:707:110: ( ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:708:6: ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:711:6: ({...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:711:7: {...}? => (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUseDefinition", "true");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:711:16: (otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:711:18: otherlv_19= '+ takes you to the' ( (otherlv_20= RULE_ID ) )
            	    {
            	    otherlv_19=(Token)match(input,25,FOLLOW_25_in_ruleUseDefinition1699); 

            	        	newLeafNode(otherlv_19, grammarAccess.getUseDefinitionAccess().getTakesYouToTheKeyword_4_4_0());
            	        
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:715:1: ( (otherlv_20= RULE_ID ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:716:1: (otherlv_20= RULE_ID )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:716:1: (otherlv_20= RULE_ID )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:717:3: otherlv_20= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUseDefinitionRule());
            	    	        }
            	            
            	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseDefinition1719); 

            	    		newLeafNode(otherlv_20, grammarAccess.getUseDefinitionAccess().getFollowSceneSceneDefinitionCrossReference_4_4_1_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseDefinition"


    // $ANTLR start "entryRuleSceneDefinition"
    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:750:1: entryRuleSceneDefinition returns [EObject current=null] : iv_ruleSceneDefinition= ruleSceneDefinition EOF ;
    public final EObject entryRuleSceneDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSceneDefinition = null;


        try {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:751:2: (iv_ruleSceneDefinition= ruleSceneDefinition EOF )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:752:2: iv_ruleSceneDefinition= ruleSceneDefinition EOF
            {
             newCompositeNode(grammarAccess.getSceneDefinitionRule()); 
            pushFollow(FOLLOW_ruleSceneDefinition_in_entryRuleSceneDefinition1796);
            iv_ruleSceneDefinition=ruleSceneDefinition();

            state._fsp--;

             current =iv_ruleSceneDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSceneDefinition1806); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSceneDefinition"


    // $ANTLR start "ruleSceneDefinition"
    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:759:1: ruleSceneDefinition returns [EObject current=null] : (otherlv_0= 'The' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'looks like' ( (lv_img_3_0= RULE_STRING ) ) ( (otherlv_4= 'and in it are:' ( (lv_items_5_0= ruleItemPositionDefinition ) )+ ) | otherlv_6= '.' ) ) ;
    public final EObject ruleSceneDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_img_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_items_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:762:28: ( (otherlv_0= 'The' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'looks like' ( (lv_img_3_0= RULE_STRING ) ) ( (otherlv_4= 'and in it are:' ( (lv_items_5_0= ruleItemPositionDefinition ) )+ ) | otherlv_6= '.' ) ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:763:1: (otherlv_0= 'The' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'looks like' ( (lv_img_3_0= RULE_STRING ) ) ( (otherlv_4= 'and in it are:' ( (lv_items_5_0= ruleItemPositionDefinition ) )+ ) | otherlv_6= '.' ) )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:763:1: (otherlv_0= 'The' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'looks like' ( (lv_img_3_0= RULE_STRING ) ) ( (otherlv_4= 'and in it are:' ( (lv_items_5_0= ruleItemPositionDefinition ) )+ ) | otherlv_6= '.' ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:763:3: otherlv_0= 'The' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'looks like' ( (lv_img_3_0= RULE_STRING ) ) ( (otherlv_4= 'and in it are:' ( (lv_items_5_0= ruleItemPositionDefinition ) )+ ) | otherlv_6= '.' )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleSceneDefinition1843); 

                	newLeafNode(otherlv_0, grammarAccess.getSceneDefinitionAccess().getTheKeyword_0());
                
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:767:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:768:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:768:1: (lv_name_1_0= RULE_STRING )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:769:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSceneDefinition1860); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSceneDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSceneDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleSceneDefinition1877); 

                	newLeafNode(otherlv_2, grammarAccess.getSceneDefinitionAccess().getLooksLikeKeyword_2());
                
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:789:1: ( (lv_img_3_0= RULE_STRING ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:790:1: (lv_img_3_0= RULE_STRING )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:790:1: (lv_img_3_0= RULE_STRING )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:791:3: lv_img_3_0= RULE_STRING
            {
            lv_img_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSceneDefinition1894); 

            			newLeafNode(lv_img_3_0, grammarAccess.getSceneDefinitionAccess().getImgSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSceneDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"img",
                    		lv_img_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:807:2: ( (otherlv_4= 'and in it are:' ( (lv_items_5_0= ruleItemPositionDefinition ) )+ ) | otherlv_6= '.' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            else if ( (LA18_0==29) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:807:3: (otherlv_4= 'and in it are:' ( (lv_items_5_0= ruleItemPositionDefinition ) )+ )
                    {
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:807:3: (otherlv_4= 'and in it are:' ( (lv_items_5_0= ruleItemPositionDefinition ) )+ )
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:807:5: otherlv_4= 'and in it are:' ( (lv_items_5_0= ruleItemPositionDefinition ) )+
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSceneDefinition1913); 

                        	newLeafNode(otherlv_4, grammarAccess.getSceneDefinitionAccess().getAndInItAreKeyword_4_0_0());
                        
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:811:1: ( (lv_items_5_0= ruleItemPositionDefinition ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==30) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:812:1: (lv_items_5_0= ruleItemPositionDefinition )
                    	    {
                    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:812:1: (lv_items_5_0= ruleItemPositionDefinition )
                    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:813:3: lv_items_5_0= ruleItemPositionDefinition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSceneDefinitionAccess().getItemsItemPositionDefinitionParserRuleCall_4_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleItemPositionDefinition_in_ruleSceneDefinition1934);
                    	    lv_items_5_0=ruleItemPositionDefinition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSceneDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"items",
                    	            		lv_items_5_0, 
                    	            		"ItemPositionDefinition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:830:7: otherlv_6= '.'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleSceneDefinition1954); 

                        	newLeafNode(otherlv_6, grammarAccess.getSceneDefinitionAccess().getFullStopKeyword_4_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSceneDefinition"


    // $ANTLR start "entryRuleItemPositionDefinition"
    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:842:1: entryRuleItemPositionDefinition returns [EObject current=null] : iv_ruleItemPositionDefinition= ruleItemPositionDefinition EOF ;
    public final EObject entryRuleItemPositionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemPositionDefinition = null;


        try {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:843:2: (iv_ruleItemPositionDefinition= ruleItemPositionDefinition EOF )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:844:2: iv_ruleItemPositionDefinition= ruleItemPositionDefinition EOF
            {
             newCompositeNode(grammarAccess.getItemPositionDefinitionRule()); 
            pushFollow(FOLLOW_ruleItemPositionDefinition_in_entryRuleItemPositionDefinition1991);
            iv_ruleItemPositionDefinition=ruleItemPositionDefinition();

            state._fsp--;

             current =iv_ruleItemPositionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemPositionDefinition2001); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemPositionDefinition"


    // $ANTLR start "ruleItemPositionDefinition"
    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:851:1: ruleItemPositionDefinition returns [EObject current=null] : (otherlv_0= '- a' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'at' otherlv_3= '(' ( (lv_xpos_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_ypos_6_0= RULE_INT ) ) otherlv_7= ')' )? ) ;
    public final EObject ruleItemPositionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_xpos_4_0=null;
        Token otherlv_5=null;
        Token lv_ypos_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:854:28: ( (otherlv_0= '- a' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'at' otherlv_3= '(' ( (lv_xpos_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_ypos_6_0= RULE_INT ) ) otherlv_7= ')' )? ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:855:1: (otherlv_0= '- a' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'at' otherlv_3= '(' ( (lv_xpos_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_ypos_6_0= RULE_INT ) ) otherlv_7= ')' )? )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:855:1: (otherlv_0= '- a' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'at' otherlv_3= '(' ( (lv_xpos_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_ypos_6_0= RULE_INT ) ) otherlv_7= ')' )? )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:855:3: otherlv_0= '- a' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'at' otherlv_3= '(' ( (lv_xpos_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_ypos_6_0= RULE_INT ) ) otherlv_7= ')' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleItemPositionDefinition2038); 

                	newLeafNode(otherlv_0, grammarAccess.getItemPositionDefinitionAccess().getAKeyword_0());
                
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:859:1: ( (otherlv_1= RULE_ID ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:860:1: (otherlv_1= RULE_ID )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:860:1: (otherlv_1= RULE_ID )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:861:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getItemPositionDefinitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleItemPositionDefinition2058); 

            		newLeafNode(otherlv_1, grammarAccess.getItemPositionDefinitionAccess().getItemItemDefinitionCrossReference_1_0()); 
            	

            }


            }

            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:872:2: (otherlv_2= 'at' otherlv_3= '(' ( (lv_xpos_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_ypos_6_0= RULE_INT ) ) otherlv_7= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:872:4: otherlv_2= 'at' otherlv_3= '(' ( (lv_xpos_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_ypos_6_0= RULE_INT ) ) otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleItemPositionDefinition2071); 

                        	newLeafNode(otherlv_2, grammarAccess.getItemPositionDefinitionAccess().getAtKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleItemPositionDefinition2083); 

                        	newLeafNode(otherlv_3, grammarAccess.getItemPositionDefinitionAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:880:1: ( (lv_xpos_4_0= RULE_INT ) )
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:881:1: (lv_xpos_4_0= RULE_INT )
                    {
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:881:1: (lv_xpos_4_0= RULE_INT )
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:882:3: lv_xpos_4_0= RULE_INT
                    {
                    lv_xpos_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleItemPositionDefinition2100); 

                    			newLeafNode(lv_xpos_4_0, grammarAccess.getItemPositionDefinitionAccess().getXposINTTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemPositionDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"xpos",
                            		lv_xpos_4_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleItemPositionDefinition2117); 

                        	newLeafNode(otherlv_5, grammarAccess.getItemPositionDefinitionAccess().getCommaKeyword_2_3());
                        
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:902:1: ( (lv_ypos_6_0= RULE_INT ) )
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:903:1: (lv_ypos_6_0= RULE_INT )
                    {
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:903:1: (lv_ypos_6_0= RULE_INT )
                    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:904:3: lv_ypos_6_0= RULE_INT
                    {
                    lv_ypos_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleItemPositionDefinition2134); 

                    			newLeafNode(lv_ypos_6_0, grammarAccess.getItemPositionDefinitionAccess().getYposINTTerminalRuleCall_2_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemPositionDefinitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ypos",
                            		lv_ypos_6_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleItemPositionDefinition2151); 

                        	newLeafNode(otherlv_7, grammarAccess.getItemPositionDefinitionAccess().getRightParenthesisKeyword_2_5());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemPositionDefinition"


    // $ANTLR start "entryRuleStartDefinition"
    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:932:1: entryRuleStartDefinition returns [EObject current=null] : iv_ruleStartDefinition= ruleStartDefinition EOF ;
    public final EObject entryRuleStartDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartDefinition = null;


        try {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:933:2: (iv_ruleStartDefinition= ruleStartDefinition EOF )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:934:2: iv_ruleStartDefinition= ruleStartDefinition EOF
            {
             newCompositeNode(grammarAccess.getStartDefinitionRule()); 
            pushFollow(FOLLOW_ruleStartDefinition_in_entryRuleStartDefinition2189);
            iv_ruleStartDefinition=ruleStartDefinition();

            state._fsp--;

             current =iv_ruleStartDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStartDefinition2199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartDefinition"


    // $ANTLR start "ruleStartDefinition"
    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:941:1: ruleStartDefinition returns [EObject current=null] : (otherlv_0= 'In the beginning you:' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleStartDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:944:28: ( (otherlv_0= 'In the beginning you:' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) ) ) )+ {...}?) ) ) ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:945:1: (otherlv_0= 'In the beginning you:' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) ) ) )+ {...}?) ) ) )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:945:1: (otherlv_0= 'In the beginning you:' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) ) ) )+ {...}?) ) ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:945:3: otherlv_0= 'In the beginning you:' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleStartDefinition2236); 

                	newLeafNode(otherlv_0, grammarAccess.getStartDefinitionAccess().getInTheBeginningYouKeyword_0());
                
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:949:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) ) ) )+ {...}?) ) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:951:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) ) ) )+ {...}?) )
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:951:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) ) ) )+ {...}?) )
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:952:2: ( ( ({...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1());
            	
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:955:2: ( ( ({...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) ) ) )+ {...}?)
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:956:3: ( ({...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) ) ) )+ {...}?
            {
            // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:956:3: ( ({...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( LA21_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 1) ) {
                    alt21=2;
                }


                switch (alt21) {
            	case 1 :
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:958:4: ({...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:958:4: ({...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:959:5: {...}? => ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStartDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:959:112: ( ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:960:6: ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:963:6: ({...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:963:7: {...}? => (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStartDefinition", "true");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:963:16: (otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:963:18: otherlv_2= '- are at the' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleStartDefinition2294); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStartDefinitionAccess().getAreAtTheKeyword_1_0_0());
            	        
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:967:1: ( (otherlv_3= RULE_ID ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:968:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:968:1: (otherlv_3= RULE_ID )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:969:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStartDefinitionRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartDefinition2314); 

            	    		newLeafNode(otherlv_3, grammarAccess.getStartDefinitionAccess().getStartLocSceneDefinitionCrossReference_1_0_1_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:987:4: ({...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) ) )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:987:4: ({...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:988:5: {...}? => ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStartDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:988:112: ( ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:989:6: ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:992:6: ({...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:992:7: {...}? => (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStartDefinition", "true");
            	    }
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:992:16: (otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:992:18: otherlv_4= '- have' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            	    {
            	    otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleStartDefinition2382); 

            	        	newLeafNode(otherlv_4, grammarAccess.getStartDefinitionAccess().getHaveKeyword_1_1_0());
            	        
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:996:1: ( (otherlv_5= RULE_ID ) )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:997:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:997:1: (otherlv_5= RULE_ID )
            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:998:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStartDefinitionRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartDefinition2402); 

            	    		newLeafNode(otherlv_5, grammarAccess.getStartDefinitionAccess().getStartItemsItemDefinitionCrossReference_1_1_1_0()); 
            	    	

            	    }


            	    }

            	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:1009:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==22) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:1009:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleStartDefinition2415); 

            	    	        	newLeafNode(otherlv_6, grammarAccess.getStartDefinitionAccess().getCommaKeyword_1_1_2_0());
            	    	        
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:1013:1: ( (otherlv_7= RULE_ID ) )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:1014:1: (otherlv_7= RULE_ID )
            	    	    {
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:1014:1: (otherlv_7= RULE_ID )
            	    	    // ../at.ac.uibk.theGreatAdventure/src-gen/at/ac/uibk/greatAdventure/parser/antlr/internal/InternalGreatAdventure.g:1015:3: otherlv_7= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getStartDefinitionRule());
            	    	    	        }
            	    	            
            	    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStartDefinition2435); 

            	    	    		newLeafNode(otherlv_7, grammarAccess.getStartDefinitionAccess().getStartItemsItemDefinitionCrossReference_1_1_2_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleStartDefinition", "getUnorderedGroupHelper().canLeave(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1());
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStartDefinition"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAdventure_in_entryRuleAdventure75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdventure85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdventureTitle_in_ruleAdventure131 = new BitSet(new long[]{0x0000000404001800L});
    public static final BitSet FOLLOW_ruleItemDefinition_in_ruleAdventure197 = new BitSet(new long[]{0x0000000404001800L});
    public static final BitSet FOLLOW_ruleSceneDefinition_in_ruleAdventure273 = new BitSet(new long[]{0x0000000404001800L});
    public static final BitSet FOLLOW_ruleStartDefinition_in_ruleAdventure342 = new BitSet(new long[]{0x0000000004001802L});
    public static final BitSet FOLLOW_ruleItemDefinition_in_ruleAdventure408 = new BitSet(new long[]{0x0000000004001802L});
    public static final BitSet FOLLOW_ruleSceneDefinition_in_ruleAdventure484 = new BitSet(new long[]{0x0000000004001802L});
    public static final BitSet FOLLOW_ruleAdventureTitle_in_entryRuleAdventureTitle568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdventureTitle578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAdventureTitle619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemDefinition_in_entryRuleItemDefinition659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemDefinition669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleItemDefinition707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12_in_ruleItemDefinition725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleItemDefinition743 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleItemDefinition760 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_14_in_ruleItemDefinition823 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_15_in_ruleItemDefinition903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleItemDefinition920 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_ruleUseDefinition_in_ruleItemDefinition1001 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_ruleUseDefinition_in_entryRuleUseDefinition1084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseDefinition1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleUseDefinition1131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseDefinition1148 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleUseDefinition1166 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUseDefinition1180 = new BitSet(new long[]{0x0000000003A80002L});
    public static final BitSet FOLLOW_19_in_ruleUseDefinition1238 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseDefinition1258 = new BitSet(new long[]{0x0000000003B80002L});
    public static final BitSet FOLLOW_20_in_ruleUseDefinition1271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseDefinition1288 = new BitSet(new long[]{0x0000000003A80002L});
    public static final BitSet FOLLOW_21_in_ruleUseDefinition1363 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseDefinition1383 = new BitSet(new long[]{0x0000000003E80002L});
    public static final BitSet FOLLOW_22_in_ruleUseDefinition1396 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseDefinition1416 = new BitSet(new long[]{0x0000000003E80002L});
    public static final BitSet FOLLOW_23_in_ruleUseDefinition1486 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseDefinition1506 = new BitSet(new long[]{0x0000000003E80002L});
    public static final BitSet FOLLOW_22_in_ruleUseDefinition1519 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseDefinition1539 = new BitSet(new long[]{0x0000000003E80002L});
    public static final BitSet FOLLOW_24_in_ruleUseDefinition1609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseDefinition1626 = new BitSet(new long[]{0x0000000003A80002L});
    public static final BitSet FOLLOW_25_in_ruleUseDefinition1699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseDefinition1719 = new BitSet(new long[]{0x0000000003A80002L});
    public static final BitSet FOLLOW_ruleSceneDefinition_in_entryRuleSceneDefinition1796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSceneDefinition1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSceneDefinition1843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSceneDefinition1860 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSceneDefinition1877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSceneDefinition1894 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleSceneDefinition1913 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleItemPositionDefinition_in_ruleSceneDefinition1934 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_29_in_ruleSceneDefinition1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemPositionDefinition_in_entryRuleItemPositionDefinition1991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemPositionDefinition2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleItemPositionDefinition2038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleItemPositionDefinition2058 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleItemPositionDefinition2071 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleItemPositionDefinition2083 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleItemPositionDefinition2100 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleItemPositionDefinition2117 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleItemPositionDefinition2134 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleItemPositionDefinition2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStartDefinition_in_entryRuleStartDefinition2189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStartDefinition2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStartDefinition2236 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleStartDefinition2294 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartDefinition2314 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_36_in_ruleStartDefinition2382 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartDefinition2402 = new BitSet(new long[]{0x0000001800400002L});
    public static final BitSet FOLLOW_22_in_ruleStartDefinition2415 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStartDefinition2435 = new BitSet(new long[]{0x0000001800400002L});

}
