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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cities:'", "'['", "'x'", "'->'", "':'", "'y->'", "','", "']'", "'Vehicles:'", "'speed'", "'load'", "'tankSize'", "'fuelConsumption'", "'Factories:'", "'in'", "'out'", "'Resources:'", "'cost'", "'.'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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

                if ( (LA1_0==11||LA1_0==19||LA1_0==24||LA1_0==27) ) {
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
            case 27:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 19:
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
    // InternalMyDsl.g:161:1: ruleCities returns [EObject current=null] : (otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x' otherlv_4= '->' ( (lv_x_5_0= RULE_INT ) ) otherlv_6= ':' otherlv_7= 'y->' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ':' ( (otherlv_10= RULE_ID ) )* (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' ) ;
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
            // InternalMyDsl.g:167:2: ( (otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x' otherlv_4= '->' ( (lv_x_5_0= RULE_INT ) ) otherlv_6= ':' otherlv_7= 'y->' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ':' ( (otherlv_10= RULE_ID ) )* (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' ) )
            // InternalMyDsl.g:168:2: (otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x' otherlv_4= '->' ( (lv_x_5_0= RULE_INT ) ) otherlv_6= ':' otherlv_7= 'y->' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ':' ( (otherlv_10= RULE_ID ) )* (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )
            {
            // InternalMyDsl.g:168:2: (otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x' otherlv_4= '->' ( (lv_x_5_0= RULE_INT ) ) otherlv_6= ':' otherlv_7= 'y->' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ':' ( (otherlv_10= RULE_ID ) )* (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )
            // InternalMyDsl.g:169:3: otherlv_0= 'Cities:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' otherlv_3= 'x' otherlv_4= '->' ( (lv_x_5_0= RULE_INT ) ) otherlv_6= ':' otherlv_7= 'y->' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= ':' ( (otherlv_10= RULE_ID ) )* (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']'
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
            					addWithLastConsumed(
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
            		
            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getCitiesAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalMyDsl.g:203:3: ( (lv_x_5_0= RULE_INT ) )
            // InternalMyDsl.g:204:4: (lv_x_5_0= RULE_INT )
            {
            // InternalMyDsl.g:204:4: (lv_x_5_0= RULE_INT )
            // InternalMyDsl.g:205:5: lv_x_5_0= RULE_INT
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

            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getCitiesAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getCitiesAccess().getYKeyword_7());
            		
            // InternalMyDsl.g:229:3: ( (lv_y_8_0= RULE_INT ) )
            // InternalMyDsl.g:230:4: (lv_y_8_0= RULE_INT )
            {
            // InternalMyDsl.g:230:4: (lv_y_8_0= RULE_INT )
            // InternalMyDsl.g:231:5: lv_y_8_0= RULE_INT
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

            otherlv_9=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getCitiesAccess().getColonKeyword_9());
            		
            // InternalMyDsl.g:251:3: ( (otherlv_10= RULE_ID ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:252:4: (otherlv_10= RULE_ID )
            	    {
            	    // InternalMyDsl.g:252:4: (otherlv_10= RULE_ID )
            	    // InternalMyDsl.g:253:5: otherlv_10= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCitiesRule());
            	    					}
            	    				
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    					newLeafNode(otherlv_10, grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_10_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:264:3: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:265:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,17,FOLLOW_4); 

            	    				newLeafNode(otherlv_11, grammarAccess.getCitiesAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalMyDsl.g:269:4: ( (otherlv_12= RULE_ID ) )
            	    // InternalMyDsl.g:270:5: (otherlv_12= RULE_ID )
            	    {
            	    // InternalMyDsl.g:270:5: (otherlv_12= RULE_ID )
            	    // InternalMyDsl.g:271:6: otherlv_12= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCitiesRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    						newLeafNode(otherlv_12, grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_11_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

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
    // InternalMyDsl.g:291:1: entryRuleVehicles returns [EObject current=null] : iv_ruleVehicles= ruleVehicles EOF ;
    public final EObject entryRuleVehicles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVehicles = null;


        try {
            // InternalMyDsl.g:291:49: (iv_ruleVehicles= ruleVehicles EOF )
            // InternalMyDsl.g:292:2: iv_ruleVehicles= ruleVehicles EOF
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
    // InternalMyDsl.g:298:1: ruleVehicles returns [EObject current=null] : (otherlv_0= 'Vehicles:' () ( (lv_vehicles_2_0= ruleSingleVehicle ) )* ) ;
    public final EObject ruleVehicles() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_vehicles_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:304:2: ( (otherlv_0= 'Vehicles:' () ( (lv_vehicles_2_0= ruleSingleVehicle ) )* ) )
            // InternalMyDsl.g:305:2: (otherlv_0= 'Vehicles:' () ( (lv_vehicles_2_0= ruleSingleVehicle ) )* )
            {
            // InternalMyDsl.g:305:2: (otherlv_0= 'Vehicles:' () ( (lv_vehicles_2_0= ruleSingleVehicle ) )* )
            // InternalMyDsl.g:306:3: otherlv_0= 'Vehicles:' () ( (lv_vehicles_2_0= ruleSingleVehicle ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getVehiclesAccess().getVehiclesKeyword_0());
            		
            // InternalMyDsl.g:310:3: ()
            // InternalMyDsl.g:311:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVehiclesAccess().getVehiclesAction_1(),
            					current);
            			

            }

            // InternalMyDsl.g:317:3: ( (lv_vehicles_2_0= ruleSingleVehicle ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:318:4: (lv_vehicles_2_0= ruleSingleVehicle )
            	    {
            	    // InternalMyDsl.g:318:4: (lv_vehicles_2_0= ruleSingleVehicle )
            	    // InternalMyDsl.g:319:5: lv_vehicles_2_0= ruleSingleVehicle
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
    // InternalMyDsl.g:340:1: entryRuleSingleVehicle returns [EObject current=null] : iv_ruleSingleVehicle= ruleSingleVehicle EOF ;
    public final EObject entryRuleSingleVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleVehicle = null;


        try {
            // InternalMyDsl.g:340:54: (iv_ruleSingleVehicle= ruleSingleVehicle EOF )
            // InternalMyDsl.g:341:2: iv_ruleSingleVehicle= ruleSingleVehicle EOF
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
    // InternalMyDsl.g:347:1: ruleSingleVehicle returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'speed' otherlv_3= '->' ( (lv_speed_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'load' otherlv_7= '->' ( (lv_load_8_0= RULE_INT ) ) otherlv_9= ':' otherlv_10= 'tankSize' otherlv_11= '->' ( (lv_tankSize_12_0= RULE_INT ) ) otherlv_13= ':' otherlv_14= 'fuelConsumption' otherlv_15= '->' ( (lv_fuelConsumption_16_0= ruleDOUBLE ) ) otherlv_17= ']' ) ;
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
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_fuelConsumption_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:353:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'speed' otherlv_3= '->' ( (lv_speed_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'load' otherlv_7= '->' ( (lv_load_8_0= RULE_INT ) ) otherlv_9= ':' otherlv_10= 'tankSize' otherlv_11= '->' ( (lv_tankSize_12_0= RULE_INT ) ) otherlv_13= ':' otherlv_14= 'fuelConsumption' otherlv_15= '->' ( (lv_fuelConsumption_16_0= ruleDOUBLE ) ) otherlv_17= ']' ) )
            // InternalMyDsl.g:354:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'speed' otherlv_3= '->' ( (lv_speed_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'load' otherlv_7= '->' ( (lv_load_8_0= RULE_INT ) ) otherlv_9= ':' otherlv_10= 'tankSize' otherlv_11= '->' ( (lv_tankSize_12_0= RULE_INT ) ) otherlv_13= ':' otherlv_14= 'fuelConsumption' otherlv_15= '->' ( (lv_fuelConsumption_16_0= ruleDOUBLE ) ) otherlv_17= ']' )
            {
            // InternalMyDsl.g:354:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'speed' otherlv_3= '->' ( (lv_speed_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'load' otherlv_7= '->' ( (lv_load_8_0= RULE_INT ) ) otherlv_9= ':' otherlv_10= 'tankSize' otherlv_11= '->' ( (lv_tankSize_12_0= RULE_INT ) ) otherlv_13= ':' otherlv_14= 'fuelConsumption' otherlv_15= '->' ( (lv_fuelConsumption_16_0= ruleDOUBLE ) ) otherlv_17= ']' )
            // InternalMyDsl.g:355:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'speed' otherlv_3= '->' ( (lv_speed_4_0= RULE_INT ) ) otherlv_5= ':' otherlv_6= 'load' otherlv_7= '->' ( (lv_load_8_0= RULE_INT ) ) otherlv_9= ':' otherlv_10= 'tankSize' otherlv_11= '->' ( (lv_tankSize_12_0= RULE_INT ) ) otherlv_13= ':' otherlv_14= 'fuelConsumption' otherlv_15= '->' ( (lv_fuelConsumption_16_0= ruleDOUBLE ) ) otherlv_17= ']'
            {
            // InternalMyDsl.g:355:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:356:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:356:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:357:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleVehicleAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleVehicleAccess().getSpeedKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalMyDsl.g:385:3: ( (lv_speed_4_0= RULE_INT ) )
            // InternalMyDsl.g:386:4: (lv_speed_4_0= RULE_INT )
            {
            // InternalMyDsl.g:386:4: (lv_speed_4_0= RULE_INT )
            // InternalMyDsl.g:387:5: lv_speed_4_0= RULE_INT
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

            otherlv_5=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getSingleVehicleAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getSingleVehicleAccess().getLoadKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_7());
            		
            // InternalMyDsl.g:415:3: ( (lv_load_8_0= RULE_INT ) )
            // InternalMyDsl.g:416:4: (lv_load_8_0= RULE_INT )
            {
            // InternalMyDsl.g:416:4: (lv_load_8_0= RULE_INT )
            // InternalMyDsl.g:417:5: lv_load_8_0= RULE_INT
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

            otherlv_9=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getSingleVehicleAccess().getColonKeyword_9());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getSingleVehicleAccess().getTankSizeKeyword_10());
            		
            otherlv_11=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_11());
            		
            // InternalMyDsl.g:445:3: ( (lv_tankSize_12_0= RULE_INT ) )
            // InternalMyDsl.g:446:4: (lv_tankSize_12_0= RULE_INT )
            {
            // InternalMyDsl.g:446:4: (lv_tankSize_12_0= RULE_INT )
            // InternalMyDsl.g:447:5: lv_tankSize_12_0= RULE_INT
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

            otherlv_13=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_13, grammarAccess.getSingleVehicleAccess().getColonKeyword_13());
            		
            otherlv_14=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getSingleVehicleAccess().getFuelConsumptionKeyword_14());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_15());
            		
            // InternalMyDsl.g:475:3: ( (lv_fuelConsumption_16_0= ruleDOUBLE ) )
            // InternalMyDsl.g:476:4: (lv_fuelConsumption_16_0= ruleDOUBLE )
            {
            // InternalMyDsl.g:476:4: (lv_fuelConsumption_16_0= ruleDOUBLE )
            // InternalMyDsl.g:477:5: lv_fuelConsumption_16_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getSingleVehicleAccess().getFuelConsumptionDOUBLEParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_18);
            lv_fuelConsumption_16_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleVehicleRule());
            					}
            					set(
            						current,
            						"fuelConsumption",
            						lv_fuelConsumption_16_0,
            						"org.xtext.industryempire.MyDsl.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFactories"
    // InternalMyDsl.g:502:1: entryRuleFactories returns [EObject current=null] : iv_ruleFactories= ruleFactories EOF ;
    public final EObject entryRuleFactories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactories = null;


        try {
            // InternalMyDsl.g:502:50: (iv_ruleFactories= ruleFactories EOF )
            // InternalMyDsl.g:503:2: iv_ruleFactories= ruleFactories EOF
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
    // InternalMyDsl.g:509:1: ruleFactories returns [EObject current=null] : (otherlv_0= 'Factories:' () ( (lv_factories_2_0= ruleSingleFactory ) )* ) ;
    public final EObject ruleFactories() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_factories_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:515:2: ( (otherlv_0= 'Factories:' () ( (lv_factories_2_0= ruleSingleFactory ) )* ) )
            // InternalMyDsl.g:516:2: (otherlv_0= 'Factories:' () ( (lv_factories_2_0= ruleSingleFactory ) )* )
            {
            // InternalMyDsl.g:516:2: (otherlv_0= 'Factories:' () ( (lv_factories_2_0= ruleSingleFactory ) )* )
            // InternalMyDsl.g:517:3: otherlv_0= 'Factories:' () ( (lv_factories_2_0= ruleSingleFactory ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFactoriesAccess().getFactoriesKeyword_0());
            		
            // InternalMyDsl.g:521:3: ()
            // InternalMyDsl.g:522:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFactoriesAccess().getFactoriesAction_1(),
            					current);
            			

            }

            // InternalMyDsl.g:528:3: ( (lv_factories_2_0= ruleSingleFactory ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:529:4: (lv_factories_2_0= ruleSingleFactory )
            	    {
            	    // InternalMyDsl.g:529:4: (lv_factories_2_0= ruleSingleFactory )
            	    // InternalMyDsl.g:530:5: lv_factories_2_0= ruleSingleFactory
            	    {

            	    					newCompositeNode(grammarAccess.getFactoriesAccess().getFactoriesSingleFactoryParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:551:1: entryRuleSingleFactory returns [EObject current=null] : iv_ruleSingleFactory= ruleSingleFactory EOF ;
    public final EObject entryRuleSingleFactory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleFactory = null;


        try {
            // InternalMyDsl.g:551:54: (iv_ruleSingleFactory= ruleSingleFactory EOF )
            // InternalMyDsl.g:552:2: iv_ruleSingleFactory= ruleSingleFactory EOF
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
    // InternalMyDsl.g:558:1: ruleSingleFactory returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' (otherlv_2= 'in' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' (otherlv_6= 'out' otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= ']' ) ;
    public final EObject ruleSingleFactory() throws RecognitionException {
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
            // InternalMyDsl.g:564:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' (otherlv_2= 'in' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' (otherlv_6= 'out' otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= ']' ) )
            // InternalMyDsl.g:565:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' (otherlv_2= 'in' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' (otherlv_6= 'out' otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= ']' )
            {
            // InternalMyDsl.g:565:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' (otherlv_2= 'in' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' (otherlv_6= 'out' otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= ']' )
            // InternalMyDsl.g:566:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' (otherlv_2= 'in' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ':' (otherlv_6= 'out' otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= ']'
            {
            // InternalMyDsl.g:566:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:567:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:567:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:568:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleFactoryAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:588:3: (otherlv_2= 'in' otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:589:4: otherlv_2= 'in' otherlv_3= '->' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getSingleFactoryAccess().getInKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSingleFactoryAccess().getHyphenMinusGreaterThanSignKeyword_2_1());
                    			
                    // InternalMyDsl.g:597:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:598:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:598:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:599:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleFactoryRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_4, grammarAccess.getSingleFactoryAccess().getInputSingleResourceCrossReference_2_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getSingleFactoryAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:615:3: (otherlv_6= 'out' otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:616:4: otherlv_6= 'out' otherlv_7= '->' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getSingleFactoryAccess().getOutKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getSingleFactoryAccess().getHyphenMinusGreaterThanSignKeyword_4_1());
                    			
                    // InternalMyDsl.g:624:4: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:625:5: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:625:5: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:626:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleFactoryRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_8, grammarAccess.getSingleFactoryAccess().getOutputSingleResourceCrossReference_4_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSingleFactoryAccess().getRightSquareBracketKeyword_5());
            		

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
    // InternalMyDsl.g:646:1: entryRuleResources returns [EObject current=null] : iv_ruleResources= ruleResources EOF ;
    public final EObject entryRuleResources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResources = null;


        try {
            // InternalMyDsl.g:646:50: (iv_ruleResources= ruleResources EOF )
            // InternalMyDsl.g:647:2: iv_ruleResources= ruleResources EOF
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
    // InternalMyDsl.g:653:1: ruleResources returns [EObject current=null] : (otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )* ) ;
    public final EObject ruleResources() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_resources_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:659:2: ( (otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )* ) )
            // InternalMyDsl.g:660:2: (otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )* )
            {
            // InternalMyDsl.g:660:2: (otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )* )
            // InternalMyDsl.g:661:3: otherlv_0= 'Resources:' () ( (lv_resources_2_0= ruleSingleResource ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getResourcesAccess().getResourcesKeyword_0());
            		
            // InternalMyDsl.g:665:3: ()
            // InternalMyDsl.g:666:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResourcesAccess().getResourcesAction_1(),
            					current);
            			

            }

            // InternalMyDsl.g:672:3: ( (lv_resources_2_0= ruleSingleResource ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:673:4: (lv_resources_2_0= ruleSingleResource )
            	    {
            	    // InternalMyDsl.g:673:4: (lv_resources_2_0= ruleSingleResource )
            	    // InternalMyDsl.g:674:5: lv_resources_2_0= ruleSingleResource
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
    // InternalMyDsl.g:695:1: entryRuleSingleResource returns [EObject current=null] : iv_ruleSingleResource= ruleSingleResource EOF ;
    public final EObject entryRuleSingleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleResource = null;


        try {
            // InternalMyDsl.g:695:55: (iv_ruleSingleResource= ruleSingleResource EOF )
            // InternalMyDsl.g:696:2: iv_ruleSingleResource= ruleSingleResource EOF
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
    // InternalMyDsl.g:702:1: ruleSingleResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'cost' otherlv_3= '->' ( (lv_cost_4_0= RULE_INT ) ) otherlv_5= ']' ) ;
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
            // InternalMyDsl.g:708:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'cost' otherlv_3= '->' ( (lv_cost_4_0= RULE_INT ) ) otherlv_5= ']' ) )
            // InternalMyDsl.g:709:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'cost' otherlv_3= '->' ( (lv_cost_4_0= RULE_INT ) ) otherlv_5= ']' )
            {
            // InternalMyDsl.g:709:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'cost' otherlv_3= '->' ( (lv_cost_4_0= RULE_INT ) ) otherlv_5= ']' )
            // InternalMyDsl.g:710:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'cost' otherlv_3= '->' ( (lv_cost_4_0= RULE_INT ) ) otherlv_5= ']'
            {
            // InternalMyDsl.g:710:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:711:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:711:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:712:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleResourceAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleResourceAccess().getCostKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSingleResourceAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalMyDsl.g:740:3: ( (lv_cost_4_0= RULE_INT ) )
            // InternalMyDsl.g:741:4: (lv_cost_4_0= RULE_INT )
            {
            // InternalMyDsl.g:741:4: (lv_cost_4_0= RULE_INT )
            // InternalMyDsl.g:742:5: lv_cost_4_0= RULE_INT
            {
            lv_cost_4_0=(Token)match(input,RULE_INT,FOLLOW_18); 

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

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDOUBLE"
    // InternalMyDsl.g:766:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalMyDsl.g:766:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalMyDsl.g:767:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalMyDsl.g:773:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )+ ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:779:2: ( ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )+ ) )
            // InternalMyDsl.g:780:2: ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )+ )
            {
            // InternalMyDsl.g:780:2: ( (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )+ )
            // InternalMyDsl.g:781:3: (this_INT_0= RULE_INT )+ kw= '.' (this_INT_2= RULE_INT )+
            {
            // InternalMyDsl.g:781:3: (this_INT_0= RULE_INT )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:782:4: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            	    				current.merge(this_INT_0);
            	    			

            	    				newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
            	    			

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

            kw=(Token)match(input,29,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1());
            		
            // InternalMyDsl.g:795:3: (this_INT_2= RULE_INT )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:796:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_23); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2());
            	    			

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
    // $ANTLR end "ruleDOUBLE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000009080802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000022L});

}