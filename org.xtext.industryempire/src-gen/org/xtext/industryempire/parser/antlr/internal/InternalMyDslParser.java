package org.xtext.industryempire.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.industryempire.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cities:'", "'['", "'x->'", "':'", "'y->'", "','", "']'", "'Vehicles:'", "'Factories:'", "'Resources:'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ClazzModel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleClazzModel"
    // InternalMyDsl.g:64:1: entryRuleClazzModel returns [EObject current=null] : iv_ruleClazzModel= ruleClazzModel EOF ;
    public final EObject entryRuleClazzModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClazzModel = null;


        try {
            // InternalMyDsl.g:64:51: (iv_ruleClazzModel= ruleClazzModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleClazzModel= ruleClazzModel EOF
            {
             newCompositeNode(grammarAccess.getClazzModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClazzModel=ruleClazzModel();

            state._fsp--;

             current =iv_ruleClazzModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClazzModel"


    // $ANTLR start "ruleClazzModel"
    // InternalMyDsl.g:71:1: ruleClazzModel returns [EObject current=null] : ( (lv_element_0_0= ruleElement ) )* ;
    public final EObject ruleClazzModel() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_element_0_0= ruleElement ) )* )
            // InternalMyDsl.g:78:2: ( (lv_element_0_0= ruleElement ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_element_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=18 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_element_0_0= ruleElement )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_element_0_0= ruleElement )
            	    // InternalMyDsl.g:80:4: lv_element_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getClazzModelAccess().getElementElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_element_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getClazzModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"element",
            	    					lv_element_0_0,
            	    					"org.xtext.industryempire.MyDsl.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleClazzModel"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:100:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:101:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:107:1: ruleElement returns [EObject current=null] : (this_Resources_0= ruleResources | this_Factories_1= ruleFactories | this_Vehicles_2= ruleVehicles | this_Cities_3= ruleCities ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Resources_0 = null;

        EObject this_Factories_1 = null;

        EObject this_Vehicles_2 = null;

        EObject this_Cities_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_Resources_0= ruleResources | this_Factories_1= ruleFactories | this_Vehicles_2= ruleVehicles | this_Cities_3= ruleCities ) )
            // InternalMyDsl.g:114:2: (this_Resources_0= ruleResources | this_Factories_1= ruleFactories | this_Vehicles_2= ruleVehicles | this_Cities_3= ruleCities )
            {
            // InternalMyDsl.g:114:2: (this_Resources_0= ruleResources | this_Factories_1= ruleFactories | this_Vehicles_2= ruleVehicles | this_Cities_3= ruleCities )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 11:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_Resources_0= ruleResources
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getResourcesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Resources_0=ruleResources();

                    state._fsp--;


                    			current = this_Resources_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_Factories_1= ruleFactories
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFactoriesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Factories_1=ruleFactories();

                    state._fsp--;


                    			current = this_Factories_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:133:3: this_Vehicles_2= ruleVehicles
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getVehiclesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Vehicles_2=ruleVehicles();

                    state._fsp--;


                    			current = this_Vehicles_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:142:3: this_Cities_3= ruleCities
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCitiesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cities_3=ruleCities();

                    state._fsp--;


                    			current = this_Cities_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleCities"
    // InternalMyDsl.g:154:1: entryRuleCities returns [EObject current=null] : iv_ruleCities= ruleCities EOF ;
    public final EObject entryRuleCities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCities = null;


        try {
            // InternalMyDsl.g:154:47: (iv_ruleCities= ruleCities EOF )
            // InternalMyDsl.g:155:2: iv_ruleCities= ruleCities EOF
            {
             newCompositeNode(grammarAccess.getCitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCities=ruleCities();

            state._fsp--;

             current =iv_ruleCities; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCities"


    // $ANTLR start "ruleCities"
    // InternalMyDsl.g:161:1: ruleCities returns [EObject current=null] : (otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x->' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'y->' ( (lv_y_7_0= RULE_INT ) ) otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ']' ) ;
    public final EObject ruleCities() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_y_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMyDsl.g:167:2: ( (otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x->' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'y->' ( (lv_y_7_0= RULE_INT ) ) otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ']' ) )
            // InternalMyDsl.g:168:2: (otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x->' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'y->' ( (lv_y_7_0= RULE_INT ) ) otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ']' )
            {
            // InternalMyDsl.g:168:2: (otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x->' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'y->' ( (lv_y_7_0= RULE_INT ) ) otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ']' )
            // InternalMyDsl.g:169:3: otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x->' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'y->' ( (lv_y_7_0= RULE_INT ) ) otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCitiesAccess().getCitiesKeyword_0());
            		
            // InternalMyDsl.g:173:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:174:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:174:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:175:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCitiesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCitiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCitiesAccess().getLeftSquareBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCitiesAccess().getXKeyword_3());
            		
            // InternalMyDsl.g:199:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalMyDsl.g:200:4: (lv_x_4_0= RULE_INT )
            {
            // InternalMyDsl.g:200:4: (lv_x_4_0= RULE_INT )
            // InternalMyDsl.g:201:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_x_4_0, grammarAccess.getCitiesAccess().getXINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCitiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getCitiesAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getCitiesAccess().getYKeyword_6());
            		
            // InternalMyDsl.g:225:3: ( (lv_y_7_0= RULE_INT ) )
            // InternalMyDsl.g:226:4: (lv_y_7_0= RULE_INT )
            {
            // InternalMyDsl.g:226:4: (lv_y_7_0= RULE_INT )
            // InternalMyDsl.g:227:5: lv_y_7_0= RULE_INT
            {
            lv_y_7_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_y_7_0, grammarAccess.getCitiesAccess().getYINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCitiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getCitiesAccess().getColonKeyword_8());
            		
            // InternalMyDsl.g:247:3: ( (otherlv_9= RULE_ID ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:248:4: (otherlv_9= RULE_ID )
            	    {
            	    // InternalMyDsl.g:248:4: (otherlv_9= RULE_ID )
            	    // InternalMyDsl.g:249:5: otherlv_9= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCitiesRule());
            	    					}
            	    				
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_9, grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_9_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:260:3: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:261:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_10, grammarAccess.getCitiesAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalMyDsl.g:265:4: ( (otherlv_11= RULE_ID ) )
            	    // InternalMyDsl.g:266:5: (otherlv_11= RULE_ID )
            	    {
            	    // InternalMyDsl.g:266:5: (otherlv_11= RULE_ID )
            	    // InternalMyDsl.g:267:6: otherlv_11= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCitiesRule());
            	    						}
            	    					
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(otherlv_11, grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCitiesAccess().getRightSquareBracketKeyword_11());
            		

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
    // $ANTLR end "ruleCities"


    // $ANTLR start "entryRuleVehicles"
    // InternalMyDsl.g:287:1: entryRuleVehicles returns [EObject current=null] : iv_ruleVehicles= ruleVehicles EOF ;
    public final EObject entryRuleVehicles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVehicles = null;


        try {
            // InternalMyDsl.g:287:49: (iv_ruleVehicles= ruleVehicles EOF )
            // InternalMyDsl.g:288:2: iv_ruleVehicles= ruleVehicles EOF
            {
             newCompositeNode(grammarAccess.getVehiclesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVehicles=ruleVehicles();

            state._fsp--;

             current =iv_ruleVehicles; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVehicles"


    // $ANTLR start "ruleVehicles"
    // InternalMyDsl.g:294:1: ruleVehicles returns [EObject current=null] : (otherlv_0= 'Vehicles:' () ( (otherlv_2= RULE_ID ) )* ) ;
    public final EObject ruleVehicles() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:300:2: ( (otherlv_0= 'Vehicles:' () ( (otherlv_2= RULE_ID ) )* ) )
            // InternalMyDsl.g:301:2: (otherlv_0= 'Vehicles:' () ( (otherlv_2= RULE_ID ) )* )
            {
            // InternalMyDsl.g:301:2: (otherlv_0= 'Vehicles:' () ( (otherlv_2= RULE_ID ) )* )
            // InternalMyDsl.g:302:3: otherlv_0= 'Vehicles:' () ( (otherlv_2= RULE_ID ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getVehiclesAccess().getVehiclesKeyword_0());
            		
            // InternalMyDsl.g:306:3: ()
            // InternalMyDsl.g:307:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVehiclesAccess().getVehiclesAction_1(),
            					current);
            			

            }

            // InternalMyDsl.g:313:3: ( (otherlv_2= RULE_ID ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:314:4: (otherlv_2= RULE_ID )
            	    {
            	    // InternalMyDsl.g:314:4: (otherlv_2= RULE_ID )
            	    // InternalMyDsl.g:315:5: otherlv_2= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getVehiclesRule());
            	    					}
            	    				
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    					newLeafNode(otherlv_2, grammarAccess.getVehiclesAccess().getVehiclesSingleVehicleCrossReference_2_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleVehicles"


    // $ANTLR start "entryRuleFactories"
    // InternalMyDsl.g:330:1: entryRuleFactories returns [EObject current=null] : iv_ruleFactories= ruleFactories EOF ;
    public final EObject entryRuleFactories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactories = null;


        try {
            // InternalMyDsl.g:330:50: (iv_ruleFactories= ruleFactories EOF )
            // InternalMyDsl.g:331:2: iv_ruleFactories= ruleFactories EOF
            {
             newCompositeNode(grammarAccess.getFactoriesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactories=ruleFactories();

            state._fsp--;

             current =iv_ruleFactories; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFactories"


    // $ANTLR start "ruleFactories"
    // InternalMyDsl.g:337:1: ruleFactories returns [EObject current=null] : (otherlv_0= 'Factories:' () ( (lv_factories_2_0= ruleSingleFactory ) )* ) ;
    public final EObject ruleFactories() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_factories_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:343:2: ( (otherlv_0= 'Factories:' () ( (lv_factories_2_0= ruleSingleFactory ) )* ) )
            // InternalMyDsl.g:344:2: (otherlv_0= 'Factories:' () ( (lv_factories_2_0= ruleSingleFactory ) )* )
            {
            // InternalMyDsl.g:344:2: (otherlv_0= 'Factories:' () ( (lv_factories_2_0= ruleSingleFactory ) )* )
            // InternalMyDsl.g:345:3: otherlv_0= 'Factories:' () ( (lv_factories_2_0= ruleSingleFactory ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFactoriesAccess().getFactoriesKeyword_0());
            		
            // InternalMyDsl.g:349:3: ()
            // InternalMyDsl.g:350:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFactoriesAccess().getFactoriesAction_1(),
            					current);
            			

            }

            // InternalMyDsl.g:356:3: ( (lv_factories_2_0= ruleSingleFactory ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:357:4: (lv_factories_2_0= ruleSingleFactory )
            	    {
            	    // InternalMyDsl.g:357:4: (lv_factories_2_0= ruleSingleFactory )
            	    // InternalMyDsl.g:358:5: lv_factories_2_0= ruleSingleFactory
            	    {

            	    					newCompositeNode(grammarAccess.getFactoriesAccess().getFactoriesSingleFactoryParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_factories_2_0=ruleSingleFactory();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFactoriesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"factories",
            	    						lv_factories_2_0,
            	    						"org.xtext.industryempire.MyDsl.SingleFactory");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleFactories"


    // $ANTLR start "entryRuleSingleFactory"
    // InternalMyDsl.g:379:1: entryRuleSingleFactory returns [EObject current=null] : iv_ruleSingleFactory= ruleSingleFactory EOF ;
    public final EObject entryRuleSingleFactory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleFactory = null;


        try {
            // InternalMyDsl.g:379:54: (iv_ruleSingleFactory= ruleSingleFactory EOF )
            // InternalMyDsl.g:380:2: iv_ruleSingleFactory= ruleSingleFactory EOF
            {
             newCompositeNode(grammarAccess.getSingleFactoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleFactory=ruleSingleFactory();

            state._fsp--;

             current =iv_ruleSingleFactory; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleFactory"


    // $ANTLR start "ruleSingleFactory"
    // InternalMyDsl.g:386:1: ruleSingleFactory returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) )? otherlv_5= ']' ) ;
    public final EObject ruleSingleFactory() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:392:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) )? otherlv_5= ']' ) )
            // InternalMyDsl.g:393:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) )? otherlv_5= ']' )
            {
            // InternalMyDsl.g:393:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) )? otherlv_5= ']' )
            // InternalMyDsl.g:394:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) )? otherlv_5= ']'
            {
            // InternalMyDsl.g:394:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:395:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:395:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:396:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSingleFactoryAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleFactoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleFactoryAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:416:3: ( (otherlv_2= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:417:4: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:417:4: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:418:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleFactoryRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); 

                    					newLeafNode(otherlv_2, grammarAccess.getSingleFactoryAccess().getInputSingleResourceCrossReference_2_0());
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getSingleFactoryAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:433:3: ( (otherlv_4= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:434:4: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:434:4: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:435:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleFactoryRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

                    					newLeafNode(otherlv_4, grammarAccess.getSingleFactoryAccess().getOutputSingleResourceCrossReference_4_0());
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSingleFactoryAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSingleFactory"


    // $ANTLR start "entryRuleResources"
    // InternalMyDsl.g:454:1: entryRuleResources returns [EObject current=null] : iv_ruleResources= ruleResources EOF ;
    public final EObject entryRuleResources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResources = null;


        try {
            // InternalMyDsl.g:454:50: (iv_ruleResources= ruleResources EOF )
            // InternalMyDsl.g:455:2: iv_ruleResources= ruleResources EOF
            {
             newCompositeNode(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResources=ruleResources();

            state._fsp--;

             current =iv_ruleResources; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // InternalMyDsl.g:461:1: ruleResources returns [EObject current=null] : (otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )* ) ;
    public final EObject ruleResources() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_resources_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:467:2: ( (otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )* ) )
            // InternalMyDsl.g:468:2: (otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )* )
            {
            // InternalMyDsl.g:468:2: (otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )* )
            // InternalMyDsl.g:469:3: otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getResourcesAccess().getResourcesKeyword_0());
            		
            // InternalMyDsl.g:473:3: ()
            // InternalMyDsl.g:474:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResourcesAccess().getResourcesAction_1(),
            					current);
            			

            }

            // InternalMyDsl.g:480:3: ( (lv_resources_2_0= ruleSingleResource ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:481:4: (lv_resources_2_0= ruleSingleResource )
            	    {
            	    // InternalMyDsl.g:481:4: (lv_resources_2_0= ruleSingleResource )
            	    // InternalMyDsl.g:482:5: lv_resources_2_0= ruleSingleResource
            	    {

            	    					newCompositeNode(grammarAccess.getResourcesAccess().getResourcesSingleResourceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_resources_2_0=ruleSingleResource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResourcesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"resources",
            	    						lv_resources_2_0,
            	    						"org.xtext.industryempire.MyDsl.SingleResource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleSingleResource"
    // InternalMyDsl.g:503:1: entryRuleSingleResource returns [EObject current=null] : iv_ruleSingleResource= ruleSingleResource EOF ;
    public final EObject entryRuleSingleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleResource = null;


        try {
            // InternalMyDsl.g:503:55: (iv_ruleSingleResource= ruleSingleResource EOF )
            // InternalMyDsl.g:504:2: iv_ruleSingleResource= ruleSingleResource EOF
            {
             newCompositeNode(grammarAccess.getSingleResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleResource=ruleSingleResource();

            state._fsp--;

             current =iv_ruleSingleResource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleResource"


    // $ANTLR start "ruleSingleResource"
    // InternalMyDsl.g:510:1: ruleSingleResource returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSingleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:516:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:517:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:517:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:518:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:518:3: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:519:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSingleResourceAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSingleResourceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleSingleResource"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000001C0802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});

}