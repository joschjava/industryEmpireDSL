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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'Cities:'", "'['", "'x'", "'->'", "':'", "'y->'", "','", "']'", "'Vehicles:'", "'speed'", "'load'", "'tankSize'", "'fuelConsumption'", "'Buildings:'", "'in'", "'out'", "'Resources:'", "'cost'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=6;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalMyDsl.g:71:1: ruleClazzModel returns [EObject current=null] : (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_element_2_0= ruleElement ) )* ) ;
    public final EObject ruleClazzModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_element_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_element_2_0= ruleElement ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_element_2_0= ruleElement ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_element_2_0= ruleElement ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_element_2_0= ruleElement ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClazzModelAccess().getProjectKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClazzModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClazzModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:101:3: ( (lv_element_2_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==21||LA1_0==26||LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:102:4: (lv_element_2_0= ruleElement )
            	    {
            	    // InternalMyDsl.g:102:4: (lv_element_2_0= ruleElement )
            	    // InternalMyDsl.g:103:5: lv_element_2_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getClazzModelAccess().getElementElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_element_2_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClazzModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"element",
            	    						lv_element_2_0,
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
    // InternalMyDsl.g:124:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyDsl.g:124:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:125:2: iv_ruleElement= ruleElement EOF
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
    // InternalMyDsl.g:131:1: ruleElement returns [EObject current=null] : (this_Resources_0= ruleResources | this_Buildings_1= ruleBuildings | this_Vehicles_2= ruleVehicles | this_Cities_3= ruleCities ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Resources_0 = null;

        EObject this_Buildings_1 = null;

        EObject this_Vehicles_2 = null;

        EObject this_Cities_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:137:2: ( (this_Resources_0= ruleResources | this_Buildings_1= ruleBuildings | this_Vehicles_2= ruleVehicles | this_Cities_3= ruleCities ) )
            // InternalMyDsl.g:138:2: (this_Resources_0= ruleResources | this_Buildings_1= ruleBuildings | this_Vehicles_2= ruleVehicles | this_Cities_3= ruleCities )
            {
            // InternalMyDsl.g:138:2: (this_Resources_0= ruleResources | this_Buildings_1= ruleBuildings | this_Vehicles_2= ruleVehicles | this_Cities_3= ruleCities )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 13:
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
                    // InternalMyDsl.g:139:3: this_Resources_0= ruleResources
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
                    // InternalMyDsl.g:148:3: this_Buildings_1= ruleBuildings
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getBuildingsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Buildings_1=ruleBuildings();

                    state._fsp--;


                    			current = this_Buildings_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:157:3: this_Vehicles_2= ruleVehicles
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
                    // InternalMyDsl.g:166:3: this_Cities_3= ruleCities
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
    // InternalMyDsl.g:178:1: entryRuleCities returns [EObject current=null] : iv_ruleCities= ruleCities EOF ;
    public final EObject entryRuleCities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCities = null;


        try {
            // InternalMyDsl.g:178:47: (iv_ruleCities= ruleCities EOF )
            // InternalMyDsl.g:179:2: iv_ruleCities= ruleCities EOF
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
    // InternalMyDsl.g:185:1: ruleCities returns [EObject current=null] : (otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x' otherlv_4= '->' ( (lv_x_5_0= RULE_INT ) ) otherlv_6= ':' otherlv_7= 'y->' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ':' ( (otherlv_10= RULE_ID ) )* (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' ) ;
    public final EObject ruleCities() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_x_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_y_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalMyDsl.g:191:2: ( (otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x' otherlv_4= '->' ( (lv_x_5_0= RULE_INT ) ) otherlv_6= ':' otherlv_7= 'y->' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ':' ( (otherlv_10= RULE_ID ) )* (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' ) )
            // InternalMyDsl.g:192:2: (otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x' otherlv_4= '->' ( (lv_x_5_0= RULE_INT ) ) otherlv_6= ':' otherlv_7= 'y->' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ':' ( (otherlv_10= RULE_ID ) )* (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )
            {
            // InternalMyDsl.g:192:2: (otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x' otherlv_4= '->' ( (lv_x_5_0= RULE_INT ) ) otherlv_6= ':' otherlv_7= 'y->' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ':' ( (otherlv_10= RULE_ID ) )* (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )
            // InternalMyDsl.g:193:3: otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x' otherlv_4= '->' ( (lv_x_5_0= RULE_INT ) ) otherlv_6= ':' otherlv_7= 'y->' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ':' ( (otherlv_10= RULE_ID ) )* (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCitiesAccess().getCitiesKeyword_0());
            		
            // InternalMyDsl.g:197:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:198:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:198:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:199:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCitiesAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCitiesRule());
            					}
            					addWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCitiesAccess().getLeftSquareBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCitiesAccess().getXKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getCitiesAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalMyDsl.g:227:3: ( (lv_x_5_0= RULE_INT ) )
            // InternalMyDsl.g:228:4: (lv_x_5_0= RULE_INT )
            {
            // InternalMyDsl.g:228:4: (lv_x_5_0= RULE_INT )
            // InternalMyDsl.g:229:5: lv_x_5_0= RULE_INT
            {
            lv_x_5_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_x_5_0, grammarAccess.getCitiesAccess().getXINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCitiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getCitiesAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getCitiesAccess().getYKeyword_7());
            		
            // InternalMyDsl.g:253:3: ( (lv_y_8_0= RULE_INT ) )
            // InternalMyDsl.g:254:4: (lv_y_8_0= RULE_INT )
            {
            // InternalMyDsl.g:254:4: (lv_y_8_0= RULE_INT )
            // InternalMyDsl.g:255:5: lv_y_8_0= RULE_INT
            {
            lv_y_8_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_y_8_0, grammarAccess.getCitiesAccess().getYINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCitiesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getCitiesAccess().getColonKeyword_9());
            		
            // InternalMyDsl.g:275:3: ( (otherlv_10= RULE_ID ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:276:4: (otherlv_10= RULE_ID )
            	    {
            	    // InternalMyDsl.g:276:4: (otherlv_10= RULE_ID )
            	    // InternalMyDsl.g:277:5: otherlv_10= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCitiesRule());
            	    					}
            	    				
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    					newLeafNode(otherlv_10, grammarAccess.getCitiesAccess().getFactorySingleBuildingCrossReference_10_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:288:3: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:289:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_11, grammarAccess.getCitiesAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalMyDsl.g:293:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalMyDsl.g:294:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalMyDsl.g:294:5: (otherlv_12= RULE_ID )
            	    // InternalMyDsl.g:295:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCitiesRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    						newLeafNode(otherlv_12, grammarAccess.getCitiesAccess().getFactorySingleBuildingCrossReference_11_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_13=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getCitiesAccess().getRightSquareBracketKeyword_12());
            		

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
    // InternalMyDsl.g:315:1: entryRuleVehicles returns [EObject current=null] : iv_ruleVehicles= ruleVehicles EOF ;
    public final EObject entryRuleVehicles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVehicles = null;


        try {
            // InternalMyDsl.g:315:49: (iv_ruleVehicles= ruleVehicles EOF )
            // InternalMyDsl.g:316:2: iv_ruleVehicles= ruleVehicles EOF
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
    // InternalMyDsl.g:322:1: ruleVehicles returns [EObject current=null] : (otherlv_0= 'Vehicles:' () ( (lv_vehicles_2_0= ruleSingleVehicle ) )* ) ;
    public final EObject ruleVehicles() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_vehicles_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:328:2: ( (otherlv_0= 'Vehicles:' () ( (lv_vehicles_2_0= ruleSingleVehicle ) )* ) )
            // InternalMyDsl.g:329:2: (otherlv_0= 'Vehicles:' () ( (lv_vehicles_2_0= ruleSingleVehicle ) )* )
            {
            // InternalMyDsl.g:329:2: (otherlv_0= 'Vehicles:' () ( (lv_vehicles_2_0= ruleSingleVehicle ) )* )
            // InternalMyDsl.g:330:3: otherlv_0= 'Vehicles:' () ( (lv_vehicles_2_0= ruleSingleVehicle ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getVehiclesAccess().getVehiclesKeyword_0());
            		
            // InternalMyDsl.g:334:3: ()
            // InternalMyDsl.g:335:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVehiclesAccess().getVehiclesAction_1(),
            					current);
            			

            }

            // InternalMyDsl.g:341:3: ( (lv_vehicles_2_0= ruleSingleVehicle ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:342:4: (lv_vehicles_2_0= ruleSingleVehicle )
            	    {
            	    // InternalMyDsl.g:342:4: (lv_vehicles_2_0= ruleSingleVehicle )
            	    // InternalMyDsl.g:343:5: lv_vehicles_2_0= ruleSingleVehicle
            	    {

            	    					newCompositeNode(grammarAccess.getVehiclesAccess().getVehiclesSingleVehicleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_vehicles_2_0=ruleSingleVehicle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVehiclesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vehicles",
            	    						lv_vehicles_2_0,
            	    						"org.xtext.industryempire.MyDsl.SingleVehicle");
            	    					afterParserOrEnumRuleCall();
            	    				

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


    // $ANTLR start "entryRuleSingleVehicle"
    // InternalMyDsl.g:364:1: entryRuleSingleVehicle returns [EObject current=null] : iv_ruleSingleVehicle= ruleSingleVehicle EOF ;
    public final EObject entryRuleSingleVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleVehicle = null;


        try {
            // InternalMyDsl.g:364:54: (iv_ruleSingleVehicle= ruleSingleVehicle EOF )
            // InternalMyDsl.g:365:2: iv_ruleSingleVehicle= ruleSingleVehicle EOF
            {
             newCompositeNode(grammarAccess.getSingleVehicleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleVehicle=ruleSingleVehicle();

            state._fsp--;

             current =iv_ruleSingleVehicle; 
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
    // $ANTLR end "entryRuleSingleVehicle"


    // $ANTLR start "ruleSingleVehicle"
    // InternalMyDsl.g:371:1: ruleSingleVehicle returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'speed' otherlv_3= '->' ( (lv_speed_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'load' otherlv_7= '->' ( (lv_load_8_0= RULE_INT ) ) otherlv_9= ':' otherlv_10= 'tankSize' otherlv_11= '->' ( (lv_tankSize_12_0= RULE_INT ) ) otherlv_13= ':' otherlv_14= 'fuelConsumption' otherlv_15= '->' ( (lv_fuelConsumption_16_0= RULE_DOUBLE ) ) otherlv_17= ']' ) ;
    public final EObject ruleSingleVehicle() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_speed_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_load_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_tankSize_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_fuelConsumption_16_0=null;
        Token otherlv_17=null;


        	enterRule();

        try {
            // InternalMyDsl.g:377:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'speed' otherlv_3= '->' ( (lv_speed_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'load' otherlv_7= '->' ( (lv_load_8_0= RULE_INT ) ) otherlv_9= ':' otherlv_10= 'tankSize' otherlv_11= '->' ( (lv_tankSize_12_0= RULE_INT ) ) otherlv_13= ':' otherlv_14= 'fuelConsumption' otherlv_15= '->' ( (lv_fuelConsumption_16_0= RULE_DOUBLE ) ) otherlv_17= ']' ) )
            // InternalMyDsl.g:378:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'speed' otherlv_3= '->' ( (lv_speed_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'load' otherlv_7= '->' ( (lv_load_8_0= RULE_INT ) ) otherlv_9= ':' otherlv_10= 'tankSize' otherlv_11= '->' ( (lv_tankSize_12_0= RULE_INT ) ) otherlv_13= ':' otherlv_14= 'fuelConsumption' otherlv_15= '->' ( (lv_fuelConsumption_16_0= RULE_DOUBLE ) ) otherlv_17= ']' )
            {
            // InternalMyDsl.g:378:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'speed' otherlv_3= '->' ( (lv_speed_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'load' otherlv_7= '->' ( (lv_load_8_0= RULE_INT ) ) otherlv_9= ':' otherlv_10= 'tankSize' otherlv_11= '->' ( (lv_tankSize_12_0= RULE_INT ) ) otherlv_13= ':' otherlv_14= 'fuelConsumption' otherlv_15= '->' ( (lv_fuelConsumption_16_0= RULE_DOUBLE ) ) otherlv_17= ']' )
            // InternalMyDsl.g:379:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'speed' otherlv_3= '->' ( (lv_speed_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'load' otherlv_7= '->' ( (lv_load_8_0= RULE_INT ) ) otherlv_9= ':' otherlv_10= 'tankSize' otherlv_11= '->' ( (lv_tankSize_12_0= RULE_INT ) ) otherlv_13= ':' otherlv_14= 'fuelConsumption' otherlv_15= '->' ( (lv_fuelConsumption_16_0= RULE_DOUBLE ) ) otherlv_17= ']'
            {
            // InternalMyDsl.g:379:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:380:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:380:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:381:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSingleVehicleAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleVehicleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleVehicleAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleVehicleAccess().getSpeedKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalMyDsl.g:409:3: ( (lv_speed_4_0= RULE_INT ) )
            // InternalMyDsl.g:410:4: (lv_speed_4_0= RULE_INT )
            {
            // InternalMyDsl.g:410:4: (lv_speed_4_0= RULE_INT )
            // InternalMyDsl.g:411:5: lv_speed_4_0= RULE_INT
            {
            lv_speed_4_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_speed_4_0, grammarAccess.getSingleVehicleAccess().getSpeedINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleVehicleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"speed",
            						lv_speed_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getSingleVehicleAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getSingleVehicleAccess().getLoadKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_7());
            		
            // InternalMyDsl.g:439:3: ( (lv_load_8_0= RULE_INT ) )
            // InternalMyDsl.g:440:4: (lv_load_8_0= RULE_INT )
            {
            // InternalMyDsl.g:440:4: (lv_load_8_0= RULE_INT )
            // InternalMyDsl.g:441:5: lv_load_8_0= RULE_INT
            {
            lv_load_8_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_load_8_0, grammarAccess.getSingleVehicleAccess().getLoadINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleVehicleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"load",
            						lv_load_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getSingleVehicleAccess().getColonKeyword_9());
            		
            otherlv_10=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getSingleVehicleAccess().getTankSizeKeyword_10());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_11());
            		
            // InternalMyDsl.g:469:3: ( (lv_tankSize_12_0= RULE_INT ) )
            // InternalMyDsl.g:470:4: (lv_tankSize_12_0= RULE_INT )
            {
            // InternalMyDsl.g:470:4: (lv_tankSize_12_0= RULE_INT )
            // InternalMyDsl.g:471:5: lv_tankSize_12_0= RULE_INT
            {
            lv_tankSize_12_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_tankSize_12_0, grammarAccess.getSingleVehicleAccess().getTankSizeINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleVehicleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tankSize",
            						lv_tankSize_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_13, grammarAccess.getSingleVehicleAccess().getColonKeyword_13());
            		
            otherlv_14=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getSingleVehicleAccess().getFuelConsumptionKeyword_14());
            		
            otherlv_15=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_15, grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_15());
            		
            // InternalMyDsl.g:499:3: ( (lv_fuelConsumption_16_0= RULE_DOUBLE ) )
            // InternalMyDsl.g:500:4: (lv_fuelConsumption_16_0= RULE_DOUBLE )
            {
            // InternalMyDsl.g:500:4: (lv_fuelConsumption_16_0= RULE_DOUBLE )
            // InternalMyDsl.g:501:5: lv_fuelConsumption_16_0= RULE_DOUBLE
            {
            lv_fuelConsumption_16_0=(Token)match(input,RULE_DOUBLE,FOLLOW_19); 

            					newLeafNode(lv_fuelConsumption_16_0, grammarAccess.getSingleVehicleAccess().getFuelConsumptionDOUBLETerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleVehicleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fuelConsumption",
            						lv_fuelConsumption_16_0,
            						"org.xtext.industryempire.MyDsl.DOUBLE");
            				

            }


            }

            otherlv_17=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getSingleVehicleAccess().getRightSquareBracketKeyword_17());
            		

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
    // $ANTLR end "ruleSingleVehicle"


    // $ANTLR start "entryRuleBuildings"
    // InternalMyDsl.g:525:1: entryRuleBuildings returns [EObject current=null] : iv_ruleBuildings= ruleBuildings EOF ;
    public final EObject entryRuleBuildings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildings = null;


        try {
            // InternalMyDsl.g:525:50: (iv_ruleBuildings= ruleBuildings EOF )
            // InternalMyDsl.g:526:2: iv_ruleBuildings= ruleBuildings EOF
            {
             newCompositeNode(grammarAccess.getBuildingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildings=ruleBuildings();

            state._fsp--;

             current =iv_ruleBuildings; 
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
    // $ANTLR end "entryRuleBuildings"


    // $ANTLR start "ruleBuildings"
    // InternalMyDsl.g:532:1: ruleBuildings returns [EObject current=null] : (otherlv_0= 'Buildings:' () ( (lv_factories_2_0= ruleSingleBuilding ) )* ) ;
    public final EObject ruleBuildings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_factories_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:538:2: ( (otherlv_0= 'Buildings:' () ( (lv_factories_2_0= ruleSingleBuilding ) )* ) )
            // InternalMyDsl.g:539:2: (otherlv_0= 'Buildings:' () ( (lv_factories_2_0= ruleSingleBuilding ) )* )
            {
            // InternalMyDsl.g:539:2: (otherlv_0= 'Buildings:' () ( (lv_factories_2_0= ruleSingleBuilding ) )* )
            // InternalMyDsl.g:540:3: otherlv_0= 'Buildings:' () ( (lv_factories_2_0= ruleSingleBuilding ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getBuildingsAccess().getBuildingsKeyword_0());
            		
            // InternalMyDsl.g:544:3: ()
            // InternalMyDsl.g:545:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBuildingsAccess().getFactoriesAction_1(),
            					current);
            			

            }

            // InternalMyDsl.g:551:3: ( (lv_factories_2_0= ruleSingleBuilding ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:552:4: (lv_factories_2_0= ruleSingleBuilding )
            	    {
            	    // InternalMyDsl.g:552:4: (lv_factories_2_0= ruleSingleBuilding )
            	    // InternalMyDsl.g:553:5: lv_factories_2_0= ruleSingleBuilding
            	    {

            	    					newCompositeNode(grammarAccess.getBuildingsAccess().getFactoriesSingleBuildingParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_factories_2_0=ruleSingleBuilding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBuildingsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"factories",
            	    						lv_factories_2_0,
            	    						"org.xtext.industryempire.MyDsl.SingleBuilding");
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
    // $ANTLR end "ruleBuildings"


    // $ANTLR start "entryRuleSingleBuilding"
    // InternalMyDsl.g:574:1: entryRuleSingleBuilding returns [EObject current=null] : iv_ruleSingleBuilding= ruleSingleBuilding EOF ;
    public final EObject entryRuleSingleBuilding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleBuilding = null;


        try {
            // InternalMyDsl.g:574:55: (iv_ruleSingleBuilding= ruleSingleBuilding EOF )
            // InternalMyDsl.g:575:2: iv_ruleSingleBuilding= ruleSingleBuilding EOF
            {
             newCompositeNode(grammarAccess.getSingleBuildingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleBuilding=ruleSingleBuilding();

            state._fsp--;

             current =iv_ruleSingleBuilding; 
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
    // $ANTLR end "entryRuleSingleBuilding"


    // $ANTLR start "ruleSingleBuilding"
    // InternalMyDsl.g:581:1: ruleSingleBuilding returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' (otherlv_2= 'in' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' (otherlv_6= 'out' otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= ']' ) ;
    public final EObject ruleSingleBuilding() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:587:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' (otherlv_2= 'in' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' (otherlv_6= 'out' otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= ']' ) )
            // InternalMyDsl.g:588:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' (otherlv_2= 'in' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' (otherlv_6= 'out' otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= ']' )
            {
            // InternalMyDsl.g:588:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' (otherlv_2= 'in' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' (otherlv_6= 'out' otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= ']' )
            // InternalMyDsl.g:589:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' (otherlv_2= 'in' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' (otherlv_6= 'out' otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= ']'
            {
            // InternalMyDsl.g:589:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:590:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:590:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:591:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSingleBuildingAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleBuildingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleBuildingAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:611:3: (otherlv_2= 'in' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:612:4: otherlv_2= 'in' otherlv_3= '->' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getSingleBuildingAccess().getInKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSingleBuildingAccess().getHyphenMinusGreaterThanSignKeyword_2_1());
                    			
                    // InternalMyDsl.g:620:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:621:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:621:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:622:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleBuildingRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_4, grammarAccess.getSingleBuildingAccess().getInputSingleResourceCrossReference_2_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getSingleBuildingAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:638:3: (otherlv_6= 'out' otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:639:4: otherlv_6= 'out' otherlv_7= '->' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getSingleBuildingAccess().getOutKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getSingleBuildingAccess().getHyphenMinusGreaterThanSignKeyword_4_1());
                    			
                    // InternalMyDsl.g:647:4: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:648:5: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:648:5: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:649:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleBuildingRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_8, grammarAccess.getSingleBuildingAccess().getOutputSingleResourceCrossReference_4_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSingleBuildingAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSingleBuilding"


    // $ANTLR start "entryRuleResources"
    // InternalMyDsl.g:669:1: entryRuleResources returns [EObject current=null] : iv_ruleResources= ruleResources EOF ;
    public final EObject entryRuleResources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResources = null;


        try {
            // InternalMyDsl.g:669:50: (iv_ruleResources= ruleResources EOF )
            // InternalMyDsl.g:670:2: iv_ruleResources= ruleResources EOF
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
    // InternalMyDsl.g:676:1: ruleResources returns [EObject current=null] : (otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )* ) ;
    public final EObject ruleResources() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_resources_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:682:2: ( (otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )* ) )
            // InternalMyDsl.g:683:2: (otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )* )
            {
            // InternalMyDsl.g:683:2: (otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )* )
            // InternalMyDsl.g:684:3: otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getResourcesAccess().getResourcesKeyword_0());
            		
            // InternalMyDsl.g:688:3: ()
            // InternalMyDsl.g:689:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResourcesAccess().getResourcesAction_1(),
            					current);
            			

            }

            // InternalMyDsl.g:695:3: ( (lv_resources_2_0= ruleSingleResource ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:696:4: (lv_resources_2_0= ruleSingleResource )
            	    {
            	    // InternalMyDsl.g:696:4: (lv_resources_2_0= ruleSingleResource )
            	    // InternalMyDsl.g:697:5: lv_resources_2_0= ruleSingleResource
            	    {

            	    					newCompositeNode(grammarAccess.getResourcesAccess().getResourcesSingleResourceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:718:1: entryRuleSingleResource returns [EObject current=null] : iv_ruleSingleResource= ruleSingleResource EOF ;
    public final EObject entryRuleSingleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleResource = null;


        try {
            // InternalMyDsl.g:718:55: (iv_ruleSingleResource= ruleSingleResource EOF )
            // InternalMyDsl.g:719:2: iv_ruleSingleResource= ruleSingleResource EOF
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
    // InternalMyDsl.g:725:1: ruleSingleResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'cost' otherlv_3= '->' ( (lv_cost_4_0= RULE_INT ) ) otherlv_5= ']' ) ;
    public final EObject ruleSingleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_cost_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:731:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'cost' otherlv_3= '->' ( (lv_cost_4_0= RULE_INT ) ) otherlv_5= ']' ) )
            // InternalMyDsl.g:732:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'cost' otherlv_3= '->' ( (lv_cost_4_0= RULE_INT ) ) otherlv_5= ']' )
            {
            // InternalMyDsl.g:732:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'cost' otherlv_3= '->' ( (lv_cost_4_0= RULE_INT ) ) otherlv_5= ']' )
            // InternalMyDsl.g:733:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'cost' otherlv_3= '->' ( (lv_cost_4_0= RULE_INT ) ) otherlv_5= ']'
            {
            // InternalMyDsl.g:733:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:734:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:734:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:735:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSingleResourceAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,14,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleResourceAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleResourceAccess().getCostKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSingleResourceAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalMyDsl.g:763:3: ( (lv_cost_4_0= RULE_INT ) )
            // InternalMyDsl.g:764:4: (lv_cost_4_0= RULE_INT )
            {
            // InternalMyDsl.g:764:4: (lv_cost_4_0= RULE_INT )
            // InternalMyDsl.g:765:5: lv_cost_4_0= RULE_INT
            {
            lv_cost_4_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_cost_4_0, grammarAccess.getSingleResourceAccess().getCostINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cost",
            						lv_cost_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSingleResourceAccess().getRightSquareBracketKeyword_5());
            		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000024202002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});

}