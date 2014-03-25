/*
* generated by Xtext
*/
grammar InternalGreatAdventure;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package at.ac.uibk.greatAdventure.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleAdventure
entryRuleAdventure returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAdventureRule()); }
	 iv_ruleAdventure=ruleAdventure 
	 { $current=$iv_ruleAdventure.current; } 
	 EOF 
;

// Rule Adventure
ruleAdventure returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getAdventureAccess().getTitleAdventureTitleParserRuleCall_0_0()); 
	    }
		lv_title_0_0=ruleAdventureTitle		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAdventureRule());
	        }
       		set(
       			$current, 
       			"title",
        		lv_title_0_0, 
        		"AdventureTitle");
	        afterParserOrEnumRuleCall();
	    }

)
)(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getAdventureAccess().getUnorderedGroup_1());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 0);
	 				}
					({true}?=>(
(
		{ 
	        newCompositeNode(grammarAccess.getAdventureAccess().getItemDefItemDefinitionParserRuleCall_1_0_0()); 
	    }
		lv_itemDef_2_0=ruleItemDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAdventureRule());
	        }
       		add(
       			$current, 
       			"itemDef",
        		lv_itemDef_2_0, 
        		"ItemDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
))+
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup_1(), 1);
	 				}
					({true}?=>(
(
		{ 
	        newCompositeNode(grammarAccess.getAdventureAccess().getSceneDefSceneDefinitionParserRuleCall_1_1_0()); 
	    }
		lv_sceneDef_3_0=ruleSceneDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAdventureRule());
	        }
       		add(
       			$current, 
       			"sceneDef",
        		lv_sceneDef_3_0, 
        		"SceneDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
))+
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup_1());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_1())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getAdventureAccess().getUnorderedGroup_1());
	}

)*(
(
		{ 
	        newCompositeNode(grammarAccess.getAdventureAccess().getStartDefStartDefinitionParserRuleCall_2_0()); 
	    }
		lv_startDef_4_0=ruleStartDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAdventureRule());
	        }
       		set(
       			$current, 
       			"startDef",
        		lv_startDef_4_0, 
        		"StartDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
)(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getAdventureAccess().getUnorderedGroup_3());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 0);
	 				}
					({true}?=>(
(
		{ 
	        newCompositeNode(grammarAccess.getAdventureAccess().getItemDefItemDefinitionParserRuleCall_3_0_0()); 
	    }
		lv_itemDef_6_0=ruleItemDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAdventureRule());
	        }
       		add(
       			$current, 
       			"itemDef",
        		lv_itemDef_6_0, 
        		"ItemDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
))+
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAdventureAccess().getUnorderedGroup_3(), 1);
	 				}
					({true}?=>(
(
		{ 
	        newCompositeNode(grammarAccess.getAdventureAccess().getSceneDefSceneDefinitionParserRuleCall_3_1_0()); 
	    }
		lv_sceneDef_7_0=ruleSceneDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAdventureRule());
	        }
       		add(
       			$current, 
       			"sceneDef",
        		lv_sceneDef_7_0, 
        		"SceneDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
))+
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAdventureAccess().getUnorderedGroup_3());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getAdventureAccess().getUnorderedGroup_3())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getAdventureAccess().getUnorderedGroup_3());
	}

)*)
;





// Entry rule entryRuleAdventureTitle
entryRuleAdventureTitle returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAdventureTitleRule()); }
	 iv_ruleAdventureTitle=ruleAdventureTitle 
	 { $current=$iv_ruleAdventureTitle.current; } 
	 EOF 
;

// Rule AdventureTitle
ruleAdventureTitle returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_STRING
		{
			newLeafNode(lv_name_0_0, grammarAccess.getAdventureTitleAccess().getNameSTRINGTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAdventureTitleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"STRING");
	    }

)
)
;





// Entry rule entryRuleItemDefinition
entryRuleItemDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getItemDefinitionRule()); }
	 iv_ruleItemDefinition=ruleItemDefinition 
	 { $current=$iv_ruleItemDefinition.current; } 
	 EOF 
;

// Rule ItemDefinition
ruleItemDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='A' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getItemDefinitionAccess().getAKeyword_0_0());
    }

    |	otherlv_1='An' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getItemDefinitionAccess().getAnKeyword_0_1());
    }
)(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getItemDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getItemDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getItemDefinitionAccess().getColonKeyword_2());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 0);
	 				}
					({true}?=>(
(
		lv_pickup_5_0=	'- can be picked up' 
    {
        newLeafNode(lv_pickup_5_0, grammarAccess.getItemDefinitionAccess().getPickupCanBePickedUpKeyword_3_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getItemDefinitionRule());
	        }
       		setWithLastConsumed($current, "pickup", true, "- can be picked up");
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 1);
	 				}
					({true}?=>(	otherlv_6='- looks like' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getItemDefinitionAccess().getLooksLikeKeyword_3_1_0());
    }
(
(
		lv_img_7_0=RULE_STRING
		{
			newLeafNode(lv_img_7_0, grammarAccess.getItemDefinitionAccess().getImgSTRINGTerminalRuleCall_3_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getItemDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"img",
        		lv_img_7_0, 
        		"STRING");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3(), 2);
	 				}
					({true}?=>(
(
		{ 
	        newCompositeNode(grammarAccess.getItemDefinitionAccess().getUsesUseDefinitionParserRuleCall_3_2_0()); 
	    }
		lv_uses_8_0=ruleUseDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getItemDefinitionRule());
	        }
       		add(
       			$current, 
       			"uses",
        		lv_uses_8_0, 
        		"UseDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
))+
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getItemDefinitionAccess().getUnorderedGroup_3());
	}

))
;





// Entry rule entryRuleUseDefinition
entryRuleUseDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUseDefinitionRule()); }
	 iv_ruleUseDefinition=ruleUseDefinition 
	 { $current=$iv_ruleUseDefinition.current; } 
	 EOF 
;

// Rule UseDefinition
ruleUseDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='- you can' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getUseDefinitionAccess().getYouCanKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getUseDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUseDefinitionRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)(	otherlv_2='with' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getUseDefinitionAccess().getWithKeyword_2());
    }
)?	otherlv_3='it, which:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getUseDefinitionAccess().getItWhichKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_5='+ requires' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getUseDefinitionAccess().getRequiresKeyword_4_0_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getUseDefinitionRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getUseDefinitionAccess().getReqsItemDefinitionCrossReference_4_0_1_0()); 
	}

)
)(	otherlv_7='or says' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getUseDefinitionAccess().getOrSaysKeyword_4_0_2_0());
    }
(
(
		lv_altText_8_0=RULE_STRING
		{
			newLeafNode(lv_altText_8_0, grammarAccess.getUseDefinitionAccess().getAltTextSTRINGTerminalRuleCall_4_0_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUseDefinitionRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"altText",
        		lv_altText_8_0, 
        		"STRING");
	    }

)
))?))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_9='+ adds' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getUseDefinitionAccess().getAddsKeyword_4_1_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getUseDefinitionRule());
	        }
        }
	otherlv_10=RULE_ID
	{
		newLeafNode(otherlv_10, grammarAccess.getUseDefinitionAccess().getAddsItemDefinitionCrossReference_4_1_1_0()); 
	}

)
)(	otherlv_11=',' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getUseDefinitionAccess().getCommaKeyword_4_1_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getUseDefinitionRule());
	        }
        }
	otherlv_12=RULE_ID
	{
		newLeafNode(otherlv_12, grammarAccess.getUseDefinitionAccess().getAddsItemDefinitionCrossReference_4_1_2_1_0()); 
	}

)
))*))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 2);
	 				}
					({true}?=>(	otherlv_13='+ removes' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getUseDefinitionAccess().getRemovesKeyword_4_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getUseDefinitionRule());
	        }
        }
	otherlv_14=RULE_ID
	{
		newLeafNode(otherlv_14, grammarAccess.getUseDefinitionAccess().getDelsItemDefinitionCrossReference_4_2_1_0()); 
	}

)
)(	otherlv_15=',' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getUseDefinitionAccess().getCommaKeyword_4_2_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getUseDefinitionRule());
	        }
        }
	otherlv_16=RULE_ID
	{
		newLeafNode(otherlv_16, grammarAccess.getUseDefinitionAccess().getDelsItemDefinitionCrossReference_4_2_2_1_0()); 
	}

)
))*))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 3);
	 				}
					({true}?=>(	otherlv_17='+ says' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getUseDefinitionAccess().getSaysKeyword_4_3_0());
    }
(
(
		lv_text_18_0=RULE_STRING
		{
			newLeafNode(lv_text_18_0, grammarAccess.getUseDefinitionAccess().getTextSTRINGTerminalRuleCall_4_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUseDefinitionRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_18_0, 
        		"STRING");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4(), 4);
	 				}
					({true}?=>(	otherlv_19='+ takes you to the' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getUseDefinitionAccess().getTakesYouToTheKeyword_4_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getUseDefinitionRule());
	        }
        }
	otherlv_20=RULE_ID
	{
		newLeafNode(otherlv_20, grammarAccess.getUseDefinitionAccess().getFollowSceneSceneDefinitionCrossReference_4_4_1_0()); 
	}

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getUseDefinitionAccess().getUnorderedGroup_4());
	}

))
;





// Entry rule entryRuleSceneDefinition
entryRuleSceneDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSceneDefinitionRule()); }
	 iv_ruleSceneDefinition=ruleSceneDefinition 
	 { $current=$iv_ruleSceneDefinition.current; } 
	 EOF 
;

// Rule SceneDefinition
ruleSceneDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='The' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSceneDefinitionAccess().getTheKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSceneDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSceneDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='looks like' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSceneDefinitionAccess().getLooksLikeKeyword_2());
    }
(
(
		lv_img_3_0=RULE_STRING
		{
			newLeafNode(lv_img_3_0, grammarAccess.getSceneDefinitionAccess().getImgSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSceneDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"img",
        		lv_img_3_0, 
        		"STRING");
	    }

)
)((	otherlv_4='and in it are:' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getSceneDefinitionAccess().getAndInItAreKeyword_4_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSceneDefinitionAccess().getItemsItemPositionDefinitionParserRuleCall_4_0_1_0()); 
	    }
		lv_items_5_0=ruleItemPositionDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSceneDefinitionRule());
	        }
       		add(
       			$current, 
       			"items",
        		lv_items_5_0, 
        		"ItemPositionDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
    |	otherlv_6='.' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getSceneDefinitionAccess().getFullStopKeyword_4_1());
    }
))
;





// Entry rule entryRuleItemPositionDefinition
entryRuleItemPositionDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getItemPositionDefinitionRule()); }
	 iv_ruleItemPositionDefinition=ruleItemPositionDefinition 
	 { $current=$iv_ruleItemPositionDefinition.current; } 
	 EOF 
;

// Rule ItemPositionDefinition
ruleItemPositionDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='- a' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getItemPositionDefinitionAccess().getAKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getItemPositionDefinitionRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getItemPositionDefinitionAccess().getItemItemDefinitionCrossReference_1_0()); 
	}

)
)(	otherlv_2='at' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getItemPositionDefinitionAccess().getAtKeyword_2_0());
    }
	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getItemPositionDefinitionAccess().getLeftParenthesisKeyword_2_1());
    }
(
(
		lv_xpos_4_0=RULE_INT
		{
			newLeafNode(lv_xpos_4_0, grammarAccess.getItemPositionDefinitionAccess().getXposINTTerminalRuleCall_2_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getItemPositionDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"xpos",
        		lv_xpos_4_0, 
        		"INT");
	    }

)
)	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getItemPositionDefinitionAccess().getCommaKeyword_2_3());
    }
(
(
		lv_ypos_6_0=RULE_INT
		{
			newLeafNode(lv_ypos_6_0, grammarAccess.getItemPositionDefinitionAccess().getYposINTTerminalRuleCall_2_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getItemPositionDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"ypos",
        		lv_ypos_6_0, 
        		"INT");
	    }

)
)	otherlv_7=')' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getItemPositionDefinitionAccess().getRightParenthesisKeyword_2_5());
    }
)?)
;





// Entry rule entryRuleStartDefinition
entryRuleStartDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStartDefinitionRule()); }
	 iv_ruleStartDefinition=ruleStartDefinition 
	 { $current=$iv_ruleStartDefinition.current; } 
	 EOF 
;

// Rule StartDefinition
ruleStartDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='In the beginning you:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStartDefinitionAccess().getInTheBeginningYouKeyword_0());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 0);
	 				}
					({true}?=>(	otherlv_2='- are at the' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getStartDefinitionAccess().getAreAtTheKeyword_1_0_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getStartDefinitionRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getStartDefinitionAccess().getStartLocSceneDefinitionCrossReference_1_0_1_0()); 
	}

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1(), 1);
	 				}
					({true}?=>(	otherlv_4='- have' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getStartDefinitionAccess().getHaveKeyword_1_1_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getStartDefinitionRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getStartDefinitionAccess().getStartItemsItemDefinitionCrossReference_1_1_1_0()); 
	}

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getStartDefinitionAccess().getCommaKeyword_1_1_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getStartDefinitionRule());
	        }
        }
	otherlv_7=RULE_ID
	{
		newLeafNode(otherlv_7, grammarAccess.getStartDefinitionAccess().getStartItemsItemDefinitionCrossReference_1_1_2_1_0()); 
	}

)
))*))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getStartDefinitionAccess().getUnorderedGroup_1());
	}

))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

