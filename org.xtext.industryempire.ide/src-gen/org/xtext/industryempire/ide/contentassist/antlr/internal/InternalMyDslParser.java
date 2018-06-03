package org.xtext.industryempire.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.industryempire.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cities:'", "'['", "'x->'", "':'", "'y->'", "']'", "','", "'Vehicles:'", "'Factories:'", "'Resources:'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleClazzModel"
    // InternalMyDsl.g:53:1: entryRuleClazzModel : ruleClazzModel EOF ;
    public final void entryRuleClazzModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleClazzModel EOF )
            // InternalMyDsl.g:55:1: ruleClazzModel EOF
            {
             before(grammarAccess.getClazzModelRule()); 
            pushFollow(FOLLOW_1);
            ruleClazzModel();

            state._fsp--;

             after(grammarAccess.getClazzModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClazzModel"


    // $ANTLR start "ruleClazzModel"
    // InternalMyDsl.g:62:1: ruleClazzModel : ( ( rule__ClazzModel__ElementAssignment )* ) ;
    public final void ruleClazzModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__ClazzModel__ElementAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__ClazzModel__ElementAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__ClazzModel__ElementAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__ClazzModel__ElementAssignment )*
            {
             before(grammarAccess.getClazzModelAccess().getElementAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__ClazzModel__ElementAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=18 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__ClazzModel__ElementAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ClazzModel__ElementAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getClazzModelAccess().getElementAssignment()); 

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
    // $ANTLR end "ruleClazzModel"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleElement EOF )
            // InternalMyDsl.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Element__Alternatives )
            // InternalMyDsl.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleCities"
    // InternalMyDsl.g:103:1: entryRuleCities : ruleCities EOF ;
    public final void entryRuleCities() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleCities EOF )
            // InternalMyDsl.g:105:1: ruleCities EOF
            {
             before(grammarAccess.getCitiesRule()); 
            pushFollow(FOLLOW_1);
            ruleCities();

            state._fsp--;

             after(grammarAccess.getCitiesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCities"


    // $ANTLR start "ruleCities"
    // InternalMyDsl.g:112:1: ruleCities : ( ( rule__Cities__Group__0 ) ) ;
    public final void ruleCities() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Cities__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Cities__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Cities__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Cities__Group__0 )
            {
             before(grammarAccess.getCitiesAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Cities__Group__0 )
            // InternalMyDsl.g:119:4: rule__Cities__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cities__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCitiesAccess().getGroup()); 

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
    // $ANTLR end "ruleCities"


    // $ANTLR start "entryRuleVehicles"
    // InternalMyDsl.g:128:1: entryRuleVehicles : ruleVehicles EOF ;
    public final void entryRuleVehicles() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleVehicles EOF )
            // InternalMyDsl.g:130:1: ruleVehicles EOF
            {
             before(grammarAccess.getVehiclesRule()); 
            pushFollow(FOLLOW_1);
            ruleVehicles();

            state._fsp--;

             after(grammarAccess.getVehiclesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVehicles"


    // $ANTLR start "ruleVehicles"
    // InternalMyDsl.g:137:1: ruleVehicles : ( ( rule__Vehicles__Group__0 ) ) ;
    public final void ruleVehicles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Vehicles__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Vehicles__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Vehicles__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Vehicles__Group__0 )
            {
             before(grammarAccess.getVehiclesAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Vehicles__Group__0 )
            // InternalMyDsl.g:144:4: rule__Vehicles__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vehicles__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVehiclesAccess().getGroup()); 

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
    // $ANTLR end "ruleVehicles"


    // $ANTLR start "entryRuleFactories"
    // InternalMyDsl.g:153:1: entryRuleFactories : ruleFactories EOF ;
    public final void entryRuleFactories() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleFactories EOF )
            // InternalMyDsl.g:155:1: ruleFactories EOF
            {
             before(grammarAccess.getFactoriesRule()); 
            pushFollow(FOLLOW_1);
            ruleFactories();

            state._fsp--;

             after(grammarAccess.getFactoriesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFactories"


    // $ANTLR start "ruleFactories"
    // InternalMyDsl.g:162:1: ruleFactories : ( ( rule__Factories__Group__0 ) ) ;
    public final void ruleFactories() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Factories__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Factories__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Factories__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Factories__Group__0 )
            {
             before(grammarAccess.getFactoriesAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Factories__Group__0 )
            // InternalMyDsl.g:169:4: rule__Factories__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factories__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactoriesAccess().getGroup()); 

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
    // $ANTLR end "ruleFactories"


    // $ANTLR start "entryRuleSingleFactory"
    // InternalMyDsl.g:178:1: entryRuleSingleFactory : ruleSingleFactory EOF ;
    public final void entryRuleSingleFactory() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleSingleFactory EOF )
            // InternalMyDsl.g:180:1: ruleSingleFactory EOF
            {
             before(grammarAccess.getSingleFactoryRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleFactory();

            state._fsp--;

             after(grammarAccess.getSingleFactoryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleFactory"


    // $ANTLR start "ruleSingleFactory"
    // InternalMyDsl.g:187:1: ruleSingleFactory : ( ( rule__SingleFactory__Group__0 ) ) ;
    public final void ruleSingleFactory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__SingleFactory__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__SingleFactory__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__SingleFactory__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__SingleFactory__Group__0 )
            {
             before(grammarAccess.getSingleFactoryAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__SingleFactory__Group__0 )
            // InternalMyDsl.g:194:4: rule__SingleFactory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleFactory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleFactoryAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleFactory"


    // $ANTLR start "entryRuleResources"
    // InternalMyDsl.g:203:1: entryRuleResources : ruleResources EOF ;
    public final void entryRuleResources() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleResources EOF )
            // InternalMyDsl.g:205:1: ruleResources EOF
            {
             before(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_1);
            ruleResources();

            state._fsp--;

             after(grammarAccess.getResourcesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // InternalMyDsl.g:212:1: ruleResources : ( ( rule__Resources__Group__0 ) ) ;
    public final void ruleResources() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Resources__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Resources__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Resources__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Resources__Group__0 )
            {
             before(grammarAccess.getResourcesAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Resources__Group__0 )
            // InternalMyDsl.g:219:4: rule__Resources__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resources__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getGroup()); 

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
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleSingleResource"
    // InternalMyDsl.g:228:1: entryRuleSingleResource : ruleSingleResource EOF ;
    public final void entryRuleSingleResource() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleSingleResource EOF )
            // InternalMyDsl.g:230:1: ruleSingleResource EOF
            {
             before(grammarAccess.getSingleResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleResource();

            state._fsp--;

             after(grammarAccess.getSingleResourceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleResource"


    // $ANTLR start "ruleSingleResource"
    // InternalMyDsl.g:237:1: ruleSingleResource : ( ( rule__SingleResource__NameAssignment ) ) ;
    public final void ruleSingleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__SingleResource__NameAssignment ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__SingleResource__NameAssignment ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__SingleResource__NameAssignment ) )
            // InternalMyDsl.g:243:3: ( rule__SingleResource__NameAssignment )
            {
             before(grammarAccess.getSingleResourceAccess().getNameAssignment()); 
            // InternalMyDsl.g:244:3: ( rule__SingleResource__NameAssignment )
            // InternalMyDsl.g:244:4: rule__SingleResource__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SingleResource__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSingleResourceAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleSingleResource"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalMyDsl.g:252:1: rule__Element__Alternatives : ( ( ruleResources ) | ( ruleFactories ) | ( ruleVehicles ) | ( ruleCities ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:256:1: ( ( ruleResources ) | ( ruleFactories ) | ( ruleVehicles ) | ( ruleCities ) )
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
                    // InternalMyDsl.g:257:2: ( ruleResources )
                    {
                    // InternalMyDsl.g:257:2: ( ruleResources )
                    // InternalMyDsl.g:258:3: ruleResources
                    {
                     before(grammarAccess.getElementAccess().getResourcesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleResources();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getResourcesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:263:2: ( ruleFactories )
                    {
                    // InternalMyDsl.g:263:2: ( ruleFactories )
                    // InternalMyDsl.g:264:3: ruleFactories
                    {
                     before(grammarAccess.getElementAccess().getFactoriesParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFactories();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFactoriesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:269:2: ( ruleVehicles )
                    {
                    // InternalMyDsl.g:269:2: ( ruleVehicles )
                    // InternalMyDsl.g:270:3: ruleVehicles
                    {
                     before(grammarAccess.getElementAccess().getVehiclesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVehicles();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getVehiclesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:275:2: ( ruleCities )
                    {
                    // InternalMyDsl.g:275:2: ( ruleCities )
                    // InternalMyDsl.g:276:3: ruleCities
                    {
                     before(grammarAccess.getElementAccess().getCitiesParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCities();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCitiesParserRuleCall_3()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Cities__Group__0"
    // InternalMyDsl.g:285:1: rule__Cities__Group__0 : rule__Cities__Group__0__Impl rule__Cities__Group__1 ;
    public final void rule__Cities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:289:1: ( rule__Cities__Group__0__Impl rule__Cities__Group__1 )
            // InternalMyDsl.g:290:2: rule__Cities__Group__0__Impl rule__Cities__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Cities__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cities__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Cities__Group__0"


    // $ANTLR start "rule__Cities__Group__0__Impl"
    // InternalMyDsl.g:297:1: rule__Cities__Group__0__Impl : ( 'Cities:' ) ;
    public final void rule__Cities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:301:1: ( ( 'Cities:' ) )
            // InternalMyDsl.g:302:1: ( 'Cities:' )
            {
            // InternalMyDsl.g:302:1: ( 'Cities:' )
            // InternalMyDsl.g:303:2: 'Cities:'
            {
             before(grammarAccess.getCitiesAccess().getCitiesKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getCitiesKeyword_0()); 

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
    // $ANTLR end "rule__Cities__Group__0__Impl"


    // $ANTLR start "rule__Cities__Group__1"
    // InternalMyDsl.g:312:1: rule__Cities__Group__1 : rule__Cities__Group__1__Impl rule__Cities__Group__2 ;
    public final void rule__Cities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:1: ( rule__Cities__Group__1__Impl rule__Cities__Group__2 )
            // InternalMyDsl.g:317:2: rule__Cities__Group__1__Impl rule__Cities__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Cities__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cities__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Cities__Group__1"


    // $ANTLR start "rule__Cities__Group__1__Impl"
    // InternalMyDsl.g:324:1: rule__Cities__Group__1__Impl : ( ( rule__Cities__NameAssignment_1 ) ) ;
    public final void rule__Cities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:328:1: ( ( ( rule__Cities__NameAssignment_1 ) ) )
            // InternalMyDsl.g:329:1: ( ( rule__Cities__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:329:1: ( ( rule__Cities__NameAssignment_1 ) )
            // InternalMyDsl.g:330:2: ( rule__Cities__NameAssignment_1 )
            {
             before(grammarAccess.getCitiesAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:331:2: ( rule__Cities__NameAssignment_1 )
            // InternalMyDsl.g:331:3: rule__Cities__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cities__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCitiesAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Cities__Group__1__Impl"


    // $ANTLR start "rule__Cities__Group__2"
    // InternalMyDsl.g:339:1: rule__Cities__Group__2 : rule__Cities__Group__2__Impl rule__Cities__Group__3 ;
    public final void rule__Cities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:343:1: ( rule__Cities__Group__2__Impl rule__Cities__Group__3 )
            // InternalMyDsl.g:344:2: rule__Cities__Group__2__Impl rule__Cities__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Cities__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cities__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Cities__Group__2"


    // $ANTLR start "rule__Cities__Group__2__Impl"
    // InternalMyDsl.g:351:1: rule__Cities__Group__2__Impl : ( '[' ) ;
    public final void rule__Cities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:355:1: ( ( '[' ) )
            // InternalMyDsl.g:356:1: ( '[' )
            {
            // InternalMyDsl.g:356:1: ( '[' )
            // InternalMyDsl.g:357:2: '['
            {
             before(grammarAccess.getCitiesAccess().getLeftSquareBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Cities__Group__2__Impl"


    // $ANTLR start "rule__Cities__Group__3"
    // InternalMyDsl.g:366:1: rule__Cities__Group__3 : rule__Cities__Group__3__Impl rule__Cities__Group__4 ;
    public final void rule__Cities__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:370:1: ( rule__Cities__Group__3__Impl rule__Cities__Group__4 )
            // InternalMyDsl.g:371:2: rule__Cities__Group__3__Impl rule__Cities__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Cities__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cities__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Cities__Group__3"


    // $ANTLR start "rule__Cities__Group__3__Impl"
    // InternalMyDsl.g:378:1: rule__Cities__Group__3__Impl : ( 'x->' ) ;
    public final void rule__Cities__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:382:1: ( ( 'x->' ) )
            // InternalMyDsl.g:383:1: ( 'x->' )
            {
            // InternalMyDsl.g:383:1: ( 'x->' )
            // InternalMyDsl.g:384:2: 'x->'
            {
             before(grammarAccess.getCitiesAccess().getXKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getXKeyword_3()); 

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
    // $ANTLR end "rule__Cities__Group__3__Impl"


    // $ANTLR start "rule__Cities__Group__4"
    // InternalMyDsl.g:393:1: rule__Cities__Group__4 : rule__Cities__Group__4__Impl rule__Cities__Group__5 ;
    public final void rule__Cities__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:397:1: ( rule__Cities__Group__4__Impl rule__Cities__Group__5 )
            // InternalMyDsl.g:398:2: rule__Cities__Group__4__Impl rule__Cities__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Cities__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cities__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Cities__Group__4"


    // $ANTLR start "rule__Cities__Group__4__Impl"
    // InternalMyDsl.g:405:1: rule__Cities__Group__4__Impl : ( ( rule__Cities__XAssignment_4 ) ) ;
    public final void rule__Cities__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:409:1: ( ( ( rule__Cities__XAssignment_4 ) ) )
            // InternalMyDsl.g:410:1: ( ( rule__Cities__XAssignment_4 ) )
            {
            // InternalMyDsl.g:410:1: ( ( rule__Cities__XAssignment_4 ) )
            // InternalMyDsl.g:411:2: ( rule__Cities__XAssignment_4 )
            {
             before(grammarAccess.getCitiesAccess().getXAssignment_4()); 
            // InternalMyDsl.g:412:2: ( rule__Cities__XAssignment_4 )
            // InternalMyDsl.g:412:3: rule__Cities__XAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Cities__XAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCitiesAccess().getXAssignment_4()); 

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
    // $ANTLR end "rule__Cities__Group__4__Impl"


    // $ANTLR start "rule__Cities__Group__5"
    // InternalMyDsl.g:420:1: rule__Cities__Group__5 : rule__Cities__Group__5__Impl rule__Cities__Group__6 ;
    public final void rule__Cities__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:424:1: ( rule__Cities__Group__5__Impl rule__Cities__Group__6 )
            // InternalMyDsl.g:425:2: rule__Cities__Group__5__Impl rule__Cities__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Cities__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cities__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__Cities__Group__5"


    // $ANTLR start "rule__Cities__Group__5__Impl"
    // InternalMyDsl.g:432:1: rule__Cities__Group__5__Impl : ( ':' ) ;
    public final void rule__Cities__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:436:1: ( ( ':' ) )
            // InternalMyDsl.g:437:1: ( ':' )
            {
            // InternalMyDsl.g:437:1: ( ':' )
            // InternalMyDsl.g:438:2: ':'
            {
             before(grammarAccess.getCitiesAccess().getColonKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__Cities__Group__5__Impl"


    // $ANTLR start "rule__Cities__Group__6"
    // InternalMyDsl.g:447:1: rule__Cities__Group__6 : rule__Cities__Group__6__Impl rule__Cities__Group__7 ;
    public final void rule__Cities__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:451:1: ( rule__Cities__Group__6__Impl rule__Cities__Group__7 )
            // InternalMyDsl.g:452:2: rule__Cities__Group__6__Impl rule__Cities__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Cities__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cities__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__Cities__Group__6"


    // $ANTLR start "rule__Cities__Group__6__Impl"
    // InternalMyDsl.g:459:1: rule__Cities__Group__6__Impl : ( 'y->' ) ;
    public final void rule__Cities__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:463:1: ( ( 'y->' ) )
            // InternalMyDsl.g:464:1: ( 'y->' )
            {
            // InternalMyDsl.g:464:1: ( 'y->' )
            // InternalMyDsl.g:465:2: 'y->'
            {
             before(grammarAccess.getCitiesAccess().getYKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getYKeyword_6()); 

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
    // $ANTLR end "rule__Cities__Group__6__Impl"


    // $ANTLR start "rule__Cities__Group__7"
    // InternalMyDsl.g:474:1: rule__Cities__Group__7 : rule__Cities__Group__7__Impl rule__Cities__Group__8 ;
    public final void rule__Cities__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:478:1: ( rule__Cities__Group__7__Impl rule__Cities__Group__8 )
            // InternalMyDsl.g:479:2: rule__Cities__Group__7__Impl rule__Cities__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Cities__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cities__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__Cities__Group__7"


    // $ANTLR start "rule__Cities__Group__7__Impl"
    // InternalMyDsl.g:486:1: rule__Cities__Group__7__Impl : ( ( rule__Cities__YAssignment_7 ) ) ;
    public final void rule__Cities__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:490:1: ( ( ( rule__Cities__YAssignment_7 ) ) )
            // InternalMyDsl.g:491:1: ( ( rule__Cities__YAssignment_7 ) )
            {
            // InternalMyDsl.g:491:1: ( ( rule__Cities__YAssignment_7 ) )
            // InternalMyDsl.g:492:2: ( rule__Cities__YAssignment_7 )
            {
             before(grammarAccess.getCitiesAccess().getYAssignment_7()); 
            // InternalMyDsl.g:493:2: ( rule__Cities__YAssignment_7 )
            // InternalMyDsl.g:493:3: rule__Cities__YAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Cities__YAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCitiesAccess().getYAssignment_7()); 

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
    // $ANTLR end "rule__Cities__Group__7__Impl"


    // $ANTLR start "rule__Cities__Group__8"
    // InternalMyDsl.g:501:1: rule__Cities__Group__8 : rule__Cities__Group__8__Impl rule__Cities__Group__9 ;
    public final void rule__Cities__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:505:1: ( rule__Cities__Group__8__Impl rule__Cities__Group__9 )
            // InternalMyDsl.g:506:2: rule__Cities__Group__8__Impl rule__Cities__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Cities__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cities__Group__9();

            state._fsp--;


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
    // $ANTLR end "rule__Cities__Group__8"


    // $ANTLR start "rule__Cities__Group__8__Impl"
    // InternalMyDsl.g:513:1: rule__Cities__Group__8__Impl : ( ':' ) ;
    public final void rule__Cities__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:517:1: ( ( ':' ) )
            // InternalMyDsl.g:518:1: ( ':' )
            {
            // InternalMyDsl.g:518:1: ( ':' )
            // InternalMyDsl.g:519:2: ':'
            {
             before(grammarAccess.getCitiesAccess().getColonKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getColonKeyword_8()); 

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
    // $ANTLR end "rule__Cities__Group__8__Impl"


    // $ANTLR start "rule__Cities__Group__9"
    // InternalMyDsl.g:528:1: rule__Cities__Group__9 : rule__Cities__Group__9__Impl rule__Cities__Group__10 ;
    public final void rule__Cities__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:532:1: ( rule__Cities__Group__9__Impl rule__Cities__Group__10 )
            // InternalMyDsl.g:533:2: rule__Cities__Group__9__Impl rule__Cities__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Cities__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cities__Group__10();

            state._fsp--;


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
    // $ANTLR end "rule__Cities__Group__9"


    // $ANTLR start "rule__Cities__Group__9__Impl"
    // InternalMyDsl.g:540:1: rule__Cities__Group__9__Impl : ( ( rule__Cities__FactoryAssignment_9 )* ) ;
    public final void rule__Cities__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:544:1: ( ( ( rule__Cities__FactoryAssignment_9 )* ) )
            // InternalMyDsl.g:545:1: ( ( rule__Cities__FactoryAssignment_9 )* )
            {
            // InternalMyDsl.g:545:1: ( ( rule__Cities__FactoryAssignment_9 )* )
            // InternalMyDsl.g:546:2: ( rule__Cities__FactoryAssignment_9 )*
            {
             before(grammarAccess.getCitiesAccess().getFactoryAssignment_9()); 
            // InternalMyDsl.g:547:2: ( rule__Cities__FactoryAssignment_9 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:547:3: rule__Cities__FactoryAssignment_9
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Cities__FactoryAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCitiesAccess().getFactoryAssignment_9()); 

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
    // $ANTLR end "rule__Cities__Group__9__Impl"


    // $ANTLR start "rule__Cities__Group__10"
    // InternalMyDsl.g:555:1: rule__Cities__Group__10 : rule__Cities__Group__10__Impl rule__Cities__Group__11 ;
    public final void rule__Cities__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:559:1: ( rule__Cities__Group__10__Impl rule__Cities__Group__11 )
            // InternalMyDsl.g:560:2: rule__Cities__Group__10__Impl rule__Cities__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Cities__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cities__Group__11();

            state._fsp--;


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
    // $ANTLR end "rule__Cities__Group__10"


    // $ANTLR start "rule__Cities__Group__10__Impl"
    // InternalMyDsl.g:567:1: rule__Cities__Group__10__Impl : ( ( rule__Cities__Group_10__0 )* ) ;
    public final void rule__Cities__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( ( ( rule__Cities__Group_10__0 )* ) )
            // InternalMyDsl.g:572:1: ( ( rule__Cities__Group_10__0 )* )
            {
            // InternalMyDsl.g:572:1: ( ( rule__Cities__Group_10__0 )* )
            // InternalMyDsl.g:573:2: ( rule__Cities__Group_10__0 )*
            {
             before(grammarAccess.getCitiesAccess().getGroup_10()); 
            // InternalMyDsl.g:574:2: ( rule__Cities__Group_10__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:574:3: rule__Cities__Group_10__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Cities__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCitiesAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Cities__Group__10__Impl"


    // $ANTLR start "rule__Cities__Group__11"
    // InternalMyDsl.g:582:1: rule__Cities__Group__11 : rule__Cities__Group__11__Impl ;
    public final void rule__Cities__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:586:1: ( rule__Cities__Group__11__Impl )
            // InternalMyDsl.g:587:2: rule__Cities__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cities__Group__11__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Cities__Group__11"


    // $ANTLR start "rule__Cities__Group__11__Impl"
    // InternalMyDsl.g:593:1: rule__Cities__Group__11__Impl : ( ']' ) ;
    public final void rule__Cities__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:597:1: ( ( ']' ) )
            // InternalMyDsl.g:598:1: ( ']' )
            {
            // InternalMyDsl.g:598:1: ( ']' )
            // InternalMyDsl.g:599:2: ']'
            {
             before(grammarAccess.getCitiesAccess().getRightSquareBracketKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getRightSquareBracketKeyword_11()); 

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
    // $ANTLR end "rule__Cities__Group__11__Impl"


    // $ANTLR start "rule__Cities__Group_10__0"
    // InternalMyDsl.g:609:1: rule__Cities__Group_10__0 : rule__Cities__Group_10__0__Impl rule__Cities__Group_10__1 ;
    public final void rule__Cities__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:613:1: ( rule__Cities__Group_10__0__Impl rule__Cities__Group_10__1 )
            // InternalMyDsl.g:614:2: rule__Cities__Group_10__0__Impl rule__Cities__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Cities__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cities__Group_10__1();

            state._fsp--;


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
    // $ANTLR end "rule__Cities__Group_10__0"


    // $ANTLR start "rule__Cities__Group_10__0__Impl"
    // InternalMyDsl.g:621:1: rule__Cities__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Cities__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:625:1: ( ( ',' ) )
            // InternalMyDsl.g:626:1: ( ',' )
            {
            // InternalMyDsl.g:626:1: ( ',' )
            // InternalMyDsl.g:627:2: ','
            {
             before(grammarAccess.getCitiesAccess().getCommaKeyword_10_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getCommaKeyword_10_0()); 

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
    // $ANTLR end "rule__Cities__Group_10__0__Impl"


    // $ANTLR start "rule__Cities__Group_10__1"
    // InternalMyDsl.g:636:1: rule__Cities__Group_10__1 : rule__Cities__Group_10__1__Impl ;
    public final void rule__Cities__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:640:1: ( rule__Cities__Group_10__1__Impl )
            // InternalMyDsl.g:641:2: rule__Cities__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cities__Group_10__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Cities__Group_10__1"


    // $ANTLR start "rule__Cities__Group_10__1__Impl"
    // InternalMyDsl.g:647:1: rule__Cities__Group_10__1__Impl : ( ( rule__Cities__FactoryAssignment_10_1 ) ) ;
    public final void rule__Cities__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:651:1: ( ( ( rule__Cities__FactoryAssignment_10_1 ) ) )
            // InternalMyDsl.g:652:1: ( ( rule__Cities__FactoryAssignment_10_1 ) )
            {
            // InternalMyDsl.g:652:1: ( ( rule__Cities__FactoryAssignment_10_1 ) )
            // InternalMyDsl.g:653:2: ( rule__Cities__FactoryAssignment_10_1 )
            {
             before(grammarAccess.getCitiesAccess().getFactoryAssignment_10_1()); 
            // InternalMyDsl.g:654:2: ( rule__Cities__FactoryAssignment_10_1 )
            // InternalMyDsl.g:654:3: rule__Cities__FactoryAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Cities__FactoryAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getCitiesAccess().getFactoryAssignment_10_1()); 

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
    // $ANTLR end "rule__Cities__Group_10__1__Impl"


    // $ANTLR start "rule__Vehicles__Group__0"
    // InternalMyDsl.g:663:1: rule__Vehicles__Group__0 : rule__Vehicles__Group__0__Impl rule__Vehicles__Group__1 ;
    public final void rule__Vehicles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:667:1: ( rule__Vehicles__Group__0__Impl rule__Vehicles__Group__1 )
            // InternalMyDsl.g:668:2: rule__Vehicles__Group__0__Impl rule__Vehicles__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Vehicles__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicles__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Vehicles__Group__0"


    // $ANTLR start "rule__Vehicles__Group__0__Impl"
    // InternalMyDsl.g:675:1: rule__Vehicles__Group__0__Impl : ( 'Vehicles:' ) ;
    public final void rule__Vehicles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:679:1: ( ( 'Vehicles:' ) )
            // InternalMyDsl.g:680:1: ( 'Vehicles:' )
            {
            // InternalMyDsl.g:680:1: ( 'Vehicles:' )
            // InternalMyDsl.g:681:2: 'Vehicles:'
            {
             before(grammarAccess.getVehiclesAccess().getVehiclesKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVehiclesAccess().getVehiclesKeyword_0()); 

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
    // $ANTLR end "rule__Vehicles__Group__0__Impl"


    // $ANTLR start "rule__Vehicles__Group__1"
    // InternalMyDsl.g:690:1: rule__Vehicles__Group__1 : rule__Vehicles__Group__1__Impl rule__Vehicles__Group__2 ;
    public final void rule__Vehicles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:694:1: ( rule__Vehicles__Group__1__Impl rule__Vehicles__Group__2 )
            // InternalMyDsl.g:695:2: rule__Vehicles__Group__1__Impl rule__Vehicles__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Vehicles__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicles__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Vehicles__Group__1"


    // $ANTLR start "rule__Vehicles__Group__1__Impl"
    // InternalMyDsl.g:702:1: rule__Vehicles__Group__1__Impl : ( () ) ;
    public final void rule__Vehicles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( ( () ) )
            // InternalMyDsl.g:707:1: ( () )
            {
            // InternalMyDsl.g:707:1: ( () )
            // InternalMyDsl.g:708:2: ()
            {
             before(grammarAccess.getVehiclesAccess().getVehiclesAction_1()); 
            // InternalMyDsl.g:709:2: ()
            // InternalMyDsl.g:709:3: 
            {
            }

             after(grammarAccess.getVehiclesAccess().getVehiclesAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicles__Group__1__Impl"


    // $ANTLR start "rule__Vehicles__Group__2"
    // InternalMyDsl.g:717:1: rule__Vehicles__Group__2 : rule__Vehicles__Group__2__Impl ;
    public final void rule__Vehicles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:721:1: ( rule__Vehicles__Group__2__Impl )
            // InternalMyDsl.g:722:2: rule__Vehicles__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vehicles__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Vehicles__Group__2"


    // $ANTLR start "rule__Vehicles__Group__2__Impl"
    // InternalMyDsl.g:728:1: rule__Vehicles__Group__2__Impl : ( ( rule__Vehicles__VehiclesAssignment_2 )* ) ;
    public final void rule__Vehicles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:732:1: ( ( ( rule__Vehicles__VehiclesAssignment_2 )* ) )
            // InternalMyDsl.g:733:1: ( ( rule__Vehicles__VehiclesAssignment_2 )* )
            {
            // InternalMyDsl.g:733:1: ( ( rule__Vehicles__VehiclesAssignment_2 )* )
            // InternalMyDsl.g:734:2: ( rule__Vehicles__VehiclesAssignment_2 )*
            {
             before(grammarAccess.getVehiclesAccess().getVehiclesAssignment_2()); 
            // InternalMyDsl.g:735:2: ( rule__Vehicles__VehiclesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:735:3: rule__Vehicles__VehiclesAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Vehicles__VehiclesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getVehiclesAccess().getVehiclesAssignment_2()); 

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
    // $ANTLR end "rule__Vehicles__Group__2__Impl"


    // $ANTLR start "rule__Factories__Group__0"
    // InternalMyDsl.g:744:1: rule__Factories__Group__0 : rule__Factories__Group__0__Impl rule__Factories__Group__1 ;
    public final void rule__Factories__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:1: ( rule__Factories__Group__0__Impl rule__Factories__Group__1 )
            // InternalMyDsl.g:749:2: rule__Factories__Group__0__Impl rule__Factories__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Factories__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factories__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Factories__Group__0"


    // $ANTLR start "rule__Factories__Group__0__Impl"
    // InternalMyDsl.g:756:1: rule__Factories__Group__0__Impl : ( 'Factories:' ) ;
    public final void rule__Factories__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:760:1: ( ( 'Factories:' ) )
            // InternalMyDsl.g:761:1: ( 'Factories:' )
            {
            // InternalMyDsl.g:761:1: ( 'Factories:' )
            // InternalMyDsl.g:762:2: 'Factories:'
            {
             before(grammarAccess.getFactoriesAccess().getFactoriesKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFactoriesAccess().getFactoriesKeyword_0()); 

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
    // $ANTLR end "rule__Factories__Group__0__Impl"


    // $ANTLR start "rule__Factories__Group__1"
    // InternalMyDsl.g:771:1: rule__Factories__Group__1 : rule__Factories__Group__1__Impl rule__Factories__Group__2 ;
    public final void rule__Factories__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:775:1: ( rule__Factories__Group__1__Impl rule__Factories__Group__2 )
            // InternalMyDsl.g:776:2: rule__Factories__Group__1__Impl rule__Factories__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Factories__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factories__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Factories__Group__1"


    // $ANTLR start "rule__Factories__Group__1__Impl"
    // InternalMyDsl.g:783:1: rule__Factories__Group__1__Impl : ( () ) ;
    public final void rule__Factories__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:787:1: ( ( () ) )
            // InternalMyDsl.g:788:1: ( () )
            {
            // InternalMyDsl.g:788:1: ( () )
            // InternalMyDsl.g:789:2: ()
            {
             before(grammarAccess.getFactoriesAccess().getFactoriesAction_1()); 
            // InternalMyDsl.g:790:2: ()
            // InternalMyDsl.g:790:3: 
            {
            }

             after(grammarAccess.getFactoriesAccess().getFactoriesAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factories__Group__1__Impl"


    // $ANTLR start "rule__Factories__Group__2"
    // InternalMyDsl.g:798:1: rule__Factories__Group__2 : rule__Factories__Group__2__Impl ;
    public final void rule__Factories__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:802:1: ( rule__Factories__Group__2__Impl )
            // InternalMyDsl.g:803:2: rule__Factories__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factories__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Factories__Group__2"


    // $ANTLR start "rule__Factories__Group__2__Impl"
    // InternalMyDsl.g:809:1: rule__Factories__Group__2__Impl : ( ( rule__Factories__FactoriesAssignment_2 )* ) ;
    public final void rule__Factories__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:813:1: ( ( ( rule__Factories__FactoriesAssignment_2 )* ) )
            // InternalMyDsl.g:814:1: ( ( rule__Factories__FactoriesAssignment_2 )* )
            {
            // InternalMyDsl.g:814:1: ( ( rule__Factories__FactoriesAssignment_2 )* )
            // InternalMyDsl.g:815:2: ( rule__Factories__FactoriesAssignment_2 )*
            {
             before(grammarAccess.getFactoriesAccess().getFactoriesAssignment_2()); 
            // InternalMyDsl.g:816:2: ( rule__Factories__FactoriesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:816:3: rule__Factories__FactoriesAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Factories__FactoriesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFactoriesAccess().getFactoriesAssignment_2()); 

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
    // $ANTLR end "rule__Factories__Group__2__Impl"


    // $ANTLR start "rule__SingleFactory__Group__0"
    // InternalMyDsl.g:825:1: rule__SingleFactory__Group__0 : rule__SingleFactory__Group__0__Impl rule__SingleFactory__Group__1 ;
    public final void rule__SingleFactory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:829:1: ( rule__SingleFactory__Group__0__Impl rule__SingleFactory__Group__1 )
            // InternalMyDsl.g:830:2: rule__SingleFactory__Group__0__Impl rule__SingleFactory__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SingleFactory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleFactory__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__SingleFactory__Group__0"


    // $ANTLR start "rule__SingleFactory__Group__0__Impl"
    // InternalMyDsl.g:837:1: rule__SingleFactory__Group__0__Impl : ( ( rule__SingleFactory__NameAssignment_0 ) ) ;
    public final void rule__SingleFactory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( ( ( rule__SingleFactory__NameAssignment_0 ) ) )
            // InternalMyDsl.g:842:1: ( ( rule__SingleFactory__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:842:1: ( ( rule__SingleFactory__NameAssignment_0 ) )
            // InternalMyDsl.g:843:2: ( rule__SingleFactory__NameAssignment_0 )
            {
             before(grammarAccess.getSingleFactoryAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:844:2: ( rule__SingleFactory__NameAssignment_0 )
            // InternalMyDsl.g:844:3: rule__SingleFactory__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SingleFactory__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleFactoryAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__SingleFactory__Group__0__Impl"


    // $ANTLR start "rule__SingleFactory__Group__1"
    // InternalMyDsl.g:852:1: rule__SingleFactory__Group__1 : rule__SingleFactory__Group__1__Impl rule__SingleFactory__Group__2 ;
    public final void rule__SingleFactory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:856:1: ( rule__SingleFactory__Group__1__Impl rule__SingleFactory__Group__2 )
            // InternalMyDsl.g:857:2: rule__SingleFactory__Group__1__Impl rule__SingleFactory__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__SingleFactory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleFactory__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__SingleFactory__Group__1"


    // $ANTLR start "rule__SingleFactory__Group__1__Impl"
    // InternalMyDsl.g:864:1: rule__SingleFactory__Group__1__Impl : ( '[' ) ;
    public final void rule__SingleFactory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( ( '[' ) )
            // InternalMyDsl.g:869:1: ( '[' )
            {
            // InternalMyDsl.g:869:1: ( '[' )
            // InternalMyDsl.g:870:2: '['
            {
             before(grammarAccess.getSingleFactoryAccess().getLeftSquareBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSingleFactoryAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__SingleFactory__Group__1__Impl"


    // $ANTLR start "rule__SingleFactory__Group__2"
    // InternalMyDsl.g:879:1: rule__SingleFactory__Group__2 : rule__SingleFactory__Group__2__Impl rule__SingleFactory__Group__3 ;
    public final void rule__SingleFactory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( rule__SingleFactory__Group__2__Impl rule__SingleFactory__Group__3 )
            // InternalMyDsl.g:884:2: rule__SingleFactory__Group__2__Impl rule__SingleFactory__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__SingleFactory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleFactory__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__SingleFactory__Group__2"


    // $ANTLR start "rule__SingleFactory__Group__2__Impl"
    // InternalMyDsl.g:891:1: rule__SingleFactory__Group__2__Impl : ( ( rule__SingleFactory__InputAssignment_2 )? ) ;
    public final void rule__SingleFactory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:895:1: ( ( ( rule__SingleFactory__InputAssignment_2 )? ) )
            // InternalMyDsl.g:896:1: ( ( rule__SingleFactory__InputAssignment_2 )? )
            {
            // InternalMyDsl.g:896:1: ( ( rule__SingleFactory__InputAssignment_2 )? )
            // InternalMyDsl.g:897:2: ( rule__SingleFactory__InputAssignment_2 )?
            {
             before(grammarAccess.getSingleFactoryAccess().getInputAssignment_2()); 
            // InternalMyDsl.g:898:2: ( rule__SingleFactory__InputAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:898:3: rule__SingleFactory__InputAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleFactory__InputAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleFactoryAccess().getInputAssignment_2()); 

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
    // $ANTLR end "rule__SingleFactory__Group__2__Impl"


    // $ANTLR start "rule__SingleFactory__Group__3"
    // InternalMyDsl.g:906:1: rule__SingleFactory__Group__3 : rule__SingleFactory__Group__3__Impl rule__SingleFactory__Group__4 ;
    public final void rule__SingleFactory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:910:1: ( rule__SingleFactory__Group__3__Impl rule__SingleFactory__Group__4 )
            // InternalMyDsl.g:911:2: rule__SingleFactory__Group__3__Impl rule__SingleFactory__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__SingleFactory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleFactory__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__SingleFactory__Group__3"


    // $ANTLR start "rule__SingleFactory__Group__3__Impl"
    // InternalMyDsl.g:918:1: rule__SingleFactory__Group__3__Impl : ( ':' ) ;
    public final void rule__SingleFactory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:922:1: ( ( ':' ) )
            // InternalMyDsl.g:923:1: ( ':' )
            {
            // InternalMyDsl.g:923:1: ( ':' )
            // InternalMyDsl.g:924:2: ':'
            {
             before(grammarAccess.getSingleFactoryAccess().getColonKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSingleFactoryAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__SingleFactory__Group__3__Impl"


    // $ANTLR start "rule__SingleFactory__Group__4"
    // InternalMyDsl.g:933:1: rule__SingleFactory__Group__4 : rule__SingleFactory__Group__4__Impl rule__SingleFactory__Group__5 ;
    public final void rule__SingleFactory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:937:1: ( rule__SingleFactory__Group__4__Impl rule__SingleFactory__Group__5 )
            // InternalMyDsl.g:938:2: rule__SingleFactory__Group__4__Impl rule__SingleFactory__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__SingleFactory__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleFactory__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__SingleFactory__Group__4"


    // $ANTLR start "rule__SingleFactory__Group__4__Impl"
    // InternalMyDsl.g:945:1: rule__SingleFactory__Group__4__Impl : ( ( rule__SingleFactory__OutputAssignment_4 )? ) ;
    public final void rule__SingleFactory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:949:1: ( ( ( rule__SingleFactory__OutputAssignment_4 )? ) )
            // InternalMyDsl.g:950:1: ( ( rule__SingleFactory__OutputAssignment_4 )? )
            {
            // InternalMyDsl.g:950:1: ( ( rule__SingleFactory__OutputAssignment_4 )? )
            // InternalMyDsl.g:951:2: ( rule__SingleFactory__OutputAssignment_4 )?
            {
             before(grammarAccess.getSingleFactoryAccess().getOutputAssignment_4()); 
            // InternalMyDsl.g:952:2: ( rule__SingleFactory__OutputAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:952:3: rule__SingleFactory__OutputAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleFactory__OutputAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleFactoryAccess().getOutputAssignment_4()); 

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
    // $ANTLR end "rule__SingleFactory__Group__4__Impl"


    // $ANTLR start "rule__SingleFactory__Group__5"
    // InternalMyDsl.g:960:1: rule__SingleFactory__Group__5 : rule__SingleFactory__Group__5__Impl ;
    public final void rule__SingleFactory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:964:1: ( rule__SingleFactory__Group__5__Impl )
            // InternalMyDsl.g:965:2: rule__SingleFactory__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleFactory__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__SingleFactory__Group__5"


    // $ANTLR start "rule__SingleFactory__Group__5__Impl"
    // InternalMyDsl.g:971:1: rule__SingleFactory__Group__5__Impl : ( ']' ) ;
    public final void rule__SingleFactory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:975:1: ( ( ']' ) )
            // InternalMyDsl.g:976:1: ( ']' )
            {
            // InternalMyDsl.g:976:1: ( ']' )
            // InternalMyDsl.g:977:2: ']'
            {
             before(grammarAccess.getSingleFactoryAccess().getRightSquareBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSingleFactoryAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__SingleFactory__Group__5__Impl"


    // $ANTLR start "rule__Resources__Group__0"
    // InternalMyDsl.g:987:1: rule__Resources__Group__0 : rule__Resources__Group__0__Impl rule__Resources__Group__1 ;
    public final void rule__Resources__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:1: ( rule__Resources__Group__0__Impl rule__Resources__Group__1 )
            // InternalMyDsl.g:992:2: rule__Resources__Group__0__Impl rule__Resources__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Resources__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Resources__Group__0"


    // $ANTLR start "rule__Resources__Group__0__Impl"
    // InternalMyDsl.g:999:1: rule__Resources__Group__0__Impl : ( 'Resources:' ) ;
    public final void rule__Resources__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1003:1: ( ( 'Resources:' ) )
            // InternalMyDsl.g:1004:1: ( 'Resources:' )
            {
            // InternalMyDsl.g:1004:1: ( 'Resources:' )
            // InternalMyDsl.g:1005:2: 'Resources:'
            {
             before(grammarAccess.getResourcesAccess().getResourcesKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getResourcesKeyword_0()); 

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
    // $ANTLR end "rule__Resources__Group__0__Impl"


    // $ANTLR start "rule__Resources__Group__1"
    // InternalMyDsl.g:1014:1: rule__Resources__Group__1 : rule__Resources__Group__1__Impl rule__Resources__Group__2 ;
    public final void rule__Resources__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1018:1: ( rule__Resources__Group__1__Impl rule__Resources__Group__2 )
            // InternalMyDsl.g:1019:2: rule__Resources__Group__1__Impl rule__Resources__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Resources__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Resources__Group__1"


    // $ANTLR start "rule__Resources__Group__1__Impl"
    // InternalMyDsl.g:1026:1: rule__Resources__Group__1__Impl : ( () ) ;
    public final void rule__Resources__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( ( () ) )
            // InternalMyDsl.g:1031:1: ( () )
            {
            // InternalMyDsl.g:1031:1: ( () )
            // InternalMyDsl.g:1032:2: ()
            {
             before(grammarAccess.getResourcesAccess().getResourcesAction_1()); 
            // InternalMyDsl.g:1033:2: ()
            // InternalMyDsl.g:1033:3: 
            {
            }

             after(grammarAccess.getResourcesAccess().getResourcesAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__1__Impl"


    // $ANTLR start "rule__Resources__Group__2"
    // InternalMyDsl.g:1041:1: rule__Resources__Group__2 : rule__Resources__Group__2__Impl ;
    public final void rule__Resources__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1045:1: ( rule__Resources__Group__2__Impl )
            // InternalMyDsl.g:1046:2: rule__Resources__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resources__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Resources__Group__2"


    // $ANTLR start "rule__Resources__Group__2__Impl"
    // InternalMyDsl.g:1052:1: rule__Resources__Group__2__Impl : ( ( rule__Resources__ResourcesAssignment_2 )* ) ;
    public final void rule__Resources__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1056:1: ( ( ( rule__Resources__ResourcesAssignment_2 )* ) )
            // InternalMyDsl.g:1057:1: ( ( rule__Resources__ResourcesAssignment_2 )* )
            {
            // InternalMyDsl.g:1057:1: ( ( rule__Resources__ResourcesAssignment_2 )* )
            // InternalMyDsl.g:1058:2: ( rule__Resources__ResourcesAssignment_2 )*
            {
             before(grammarAccess.getResourcesAccess().getResourcesAssignment_2()); 
            // InternalMyDsl.g:1059:2: ( rule__Resources__ResourcesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1059:3: rule__Resources__ResourcesAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Resources__ResourcesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getResourcesAccess().getResourcesAssignment_2()); 

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
    // $ANTLR end "rule__Resources__Group__2__Impl"


    // $ANTLR start "rule__ClazzModel__ElementAssignment"
    // InternalMyDsl.g:1068:1: rule__ClazzModel__ElementAssignment : ( ruleElement ) ;
    public final void rule__ClazzModel__ElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1072:1: ( ( ruleElement ) )
            // InternalMyDsl.g:1073:2: ( ruleElement )
            {
            // InternalMyDsl.g:1073:2: ( ruleElement )
            // InternalMyDsl.g:1074:3: ruleElement
            {
             before(grammarAccess.getClazzModelAccess().getElementElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getClazzModelAccess().getElementElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__ClazzModel__ElementAssignment"


    // $ANTLR start "rule__Cities__NameAssignment_1"
    // InternalMyDsl.g:1083:1: rule__Cities__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cities__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1087:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1088:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1088:2: ( RULE_ID )
            // InternalMyDsl.g:1089:3: RULE_ID
            {
             before(grammarAccess.getCitiesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Cities__NameAssignment_1"


    // $ANTLR start "rule__Cities__XAssignment_4"
    // InternalMyDsl.g:1098:1: rule__Cities__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__Cities__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1103:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1103:2: ( RULE_INT )
            // InternalMyDsl.g:1104:3: RULE_INT
            {
             before(grammarAccess.getCitiesAccess().getXINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getXINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Cities__XAssignment_4"


    // $ANTLR start "rule__Cities__YAssignment_7"
    // InternalMyDsl.g:1113:1: rule__Cities__YAssignment_7 : ( RULE_INT ) ;
    public final void rule__Cities__YAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1118:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1118:2: ( RULE_INT )
            // InternalMyDsl.g:1119:3: RULE_INT
            {
             before(grammarAccess.getCitiesAccess().getYINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getYINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Cities__YAssignment_7"


    // $ANTLR start "rule__Cities__FactoryAssignment_9"
    // InternalMyDsl.g:1128:1: rule__Cities__FactoryAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Cities__FactoryAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1133:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1133:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1134:3: ( RULE_ID )
            {
             before(grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_9_0()); 
            // InternalMyDsl.g:1135:3: ( RULE_ID )
            // InternalMyDsl.g:1136:4: RULE_ID
            {
             before(grammarAccess.getCitiesAccess().getFactorySingleFactoryIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getFactorySingleFactoryIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_9_0()); 

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
    // $ANTLR end "rule__Cities__FactoryAssignment_9"


    // $ANTLR start "rule__Cities__FactoryAssignment_10_1"
    // InternalMyDsl.g:1147:1: rule__Cities__FactoryAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Cities__FactoryAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1152:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1152:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1153:3: ( RULE_ID )
            {
             before(grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_10_1_0()); 
            // InternalMyDsl.g:1154:3: ( RULE_ID )
            // InternalMyDsl.g:1155:4: RULE_ID
            {
             before(grammarAccess.getCitiesAccess().getFactorySingleFactoryIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getFactorySingleFactoryIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_10_1_0()); 

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
    // $ANTLR end "rule__Cities__FactoryAssignment_10_1"


    // $ANTLR start "rule__Vehicles__VehiclesAssignment_2"
    // InternalMyDsl.g:1166:1: rule__Vehicles__VehiclesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Vehicles__VehiclesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1171:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1171:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1172:3: ( RULE_ID )
            {
             before(grammarAccess.getVehiclesAccess().getVehiclesSingleVehicleCrossReference_2_0()); 
            // InternalMyDsl.g:1173:3: ( RULE_ID )
            // InternalMyDsl.g:1174:4: RULE_ID
            {
             before(grammarAccess.getVehiclesAccess().getVehiclesSingleVehicleIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVehiclesAccess().getVehiclesSingleVehicleIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getVehiclesAccess().getVehiclesSingleVehicleCrossReference_2_0()); 

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
    // $ANTLR end "rule__Vehicles__VehiclesAssignment_2"


    // $ANTLR start "rule__Factories__FactoriesAssignment_2"
    // InternalMyDsl.g:1185:1: rule__Factories__FactoriesAssignment_2 : ( ruleSingleFactory ) ;
    public final void rule__Factories__FactoriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1189:1: ( ( ruleSingleFactory ) )
            // InternalMyDsl.g:1190:2: ( ruleSingleFactory )
            {
            // InternalMyDsl.g:1190:2: ( ruleSingleFactory )
            // InternalMyDsl.g:1191:3: ruleSingleFactory
            {
             before(grammarAccess.getFactoriesAccess().getFactoriesSingleFactoryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleFactory();

            state._fsp--;

             after(grammarAccess.getFactoriesAccess().getFactoriesSingleFactoryParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Factories__FactoriesAssignment_2"


    // $ANTLR start "rule__SingleFactory__NameAssignment_0"
    // InternalMyDsl.g:1200:1: rule__SingleFactory__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SingleFactory__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1205:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1205:2: ( RULE_ID )
            // InternalMyDsl.g:1206:3: RULE_ID
            {
             before(grammarAccess.getSingleFactoryAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleFactoryAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__SingleFactory__NameAssignment_0"


    // $ANTLR start "rule__SingleFactory__InputAssignment_2"
    // InternalMyDsl.g:1215:1: rule__SingleFactory__InputAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SingleFactory__InputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1220:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1220:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1221:3: ( RULE_ID )
            {
             before(grammarAccess.getSingleFactoryAccess().getInputSingleResourceCrossReference_2_0()); 
            // InternalMyDsl.g:1222:3: ( RULE_ID )
            // InternalMyDsl.g:1223:4: RULE_ID
            {
             before(grammarAccess.getSingleFactoryAccess().getInputSingleResourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleFactoryAccess().getInputSingleResourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSingleFactoryAccess().getInputSingleResourceCrossReference_2_0()); 

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
    // $ANTLR end "rule__SingleFactory__InputAssignment_2"


    // $ANTLR start "rule__SingleFactory__OutputAssignment_4"
    // InternalMyDsl.g:1234:1: rule__SingleFactory__OutputAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SingleFactory__OutputAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1239:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1239:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1240:3: ( RULE_ID )
            {
             before(grammarAccess.getSingleFactoryAccess().getOutputSingleResourceCrossReference_4_0()); 
            // InternalMyDsl.g:1241:3: ( RULE_ID )
            // InternalMyDsl.g:1242:4: RULE_ID
            {
             before(grammarAccess.getSingleFactoryAccess().getOutputSingleResourceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleFactoryAccess().getOutputSingleResourceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSingleFactoryAccess().getOutputSingleResourceCrossReference_4_0()); 

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
    // $ANTLR end "rule__SingleFactory__OutputAssignment_4"


    // $ANTLR start "rule__Resources__ResourcesAssignment_2"
    // InternalMyDsl.g:1253:1: rule__Resources__ResourcesAssignment_2 : ( ruleSingleResource ) ;
    public final void rule__Resources__ResourcesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1257:1: ( ( ruleSingleResource ) )
            // InternalMyDsl.g:1258:2: ( ruleSingleResource )
            {
            // InternalMyDsl.g:1258:2: ( ruleSingleResource )
            // InternalMyDsl.g:1259:3: ruleSingleResource
            {
             before(grammarAccess.getResourcesAccess().getResourcesSingleResourceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleResource();

            state._fsp--;

             after(grammarAccess.getResourcesAccess().getResourcesSingleResourceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Resources__ResourcesAssignment_2"


    // $ANTLR start "rule__SingleResource__NameAssignment"
    // InternalMyDsl.g:1268:1: rule__SingleResource__NameAssignment : ( RULE_ID ) ;
    public final void rule__SingleResource__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1272:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1273:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1273:2: ( RULE_ID )
            // InternalMyDsl.g:1274:3: RULE_ID
            {
             before(grammarAccess.getSingleResourceAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleResourceAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__SingleResource__NameAssignment"

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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010010L});

}