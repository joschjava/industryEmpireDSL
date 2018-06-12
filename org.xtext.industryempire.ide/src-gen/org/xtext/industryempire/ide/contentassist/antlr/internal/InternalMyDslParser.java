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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cities:'", "'['", "'x'", "'->'", "':'", "'y->'", "']'", "','", "'Vehicles:'", "'speed'", "'load'", "'tankSize'", "'fuelConsumption'", "'Factories:'", "'in'", "'out'", "'Resources:'", "'cost'", "'.'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

                if ( (LA1_0==11||LA1_0==19||LA1_0==24||LA1_0==27) ) {
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


    // $ANTLR start "entryRuleSingleVehicle"
    // InternalMyDsl.g:153:1: entryRuleSingleVehicle : ruleSingleVehicle EOF ;
    public final void entryRuleSingleVehicle() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleSingleVehicle EOF )
            // InternalMyDsl.g:155:1: ruleSingleVehicle EOF
            {
             before(grammarAccess.getSingleVehicleRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleVehicle();

            state._fsp--;

             after(grammarAccess.getSingleVehicleRule()); 
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
    // $ANTLR end "entryRuleSingleVehicle"


    // $ANTLR start "ruleSingleVehicle"
    // InternalMyDsl.g:162:1: ruleSingleVehicle : ( ( rule__SingleVehicle__Group__0 ) ) ;
    public final void ruleSingleVehicle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__SingleVehicle__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__SingleVehicle__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__SingleVehicle__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__SingleVehicle__Group__0 )
            {
             before(grammarAccess.getSingleVehicleAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__SingleVehicle__Group__0 )
            // InternalMyDsl.g:169:4: rule__SingleVehicle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleVehicleAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleVehicle"


    // $ANTLR start "entryRuleFactories"
    // InternalMyDsl.g:178:1: entryRuleFactories : ruleFactories EOF ;
    public final void entryRuleFactories() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleFactories EOF )
            // InternalMyDsl.g:180:1: ruleFactories EOF
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
    // InternalMyDsl.g:187:1: ruleFactories : ( ( rule__Factories__Group__0 ) ) ;
    public final void ruleFactories() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Factories__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Factories__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Factories__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Factories__Group__0 )
            {
             before(grammarAccess.getFactoriesAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Factories__Group__0 )
            // InternalMyDsl.g:194:4: rule__Factories__Group__0
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
    // InternalMyDsl.g:203:1: entryRuleSingleFactory : ruleSingleFactory EOF ;
    public final void entryRuleSingleFactory() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleSingleFactory EOF )
            // InternalMyDsl.g:205:1: ruleSingleFactory EOF
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
    // InternalMyDsl.g:212:1: ruleSingleFactory : ( ( rule__SingleFactory__Group__0 ) ) ;
    public final void ruleSingleFactory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__SingleFactory__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__SingleFactory__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__SingleFactory__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__SingleFactory__Group__0 )
            {
             before(grammarAccess.getSingleFactoryAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__SingleFactory__Group__0 )
            // InternalMyDsl.g:219:4: rule__SingleFactory__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleResources : ruleResources EOF ;
    public final void entryRuleResources() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleResources EOF )
            // InternalMyDsl.g:230:1: ruleResources EOF
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
    // InternalMyDsl.g:237:1: ruleResources : ( ( rule__Resources__Group__0 ) ) ;
    public final void ruleResources() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Resources__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Resources__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Resources__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Resources__Group__0 )
            {
             before(grammarAccess.getResourcesAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Resources__Group__0 )
            // InternalMyDsl.g:244:4: rule__Resources__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleSingleResource : ruleSingleResource EOF ;
    public final void entryRuleSingleResource() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleSingleResource EOF )
            // InternalMyDsl.g:255:1: ruleSingleResource EOF
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
    // InternalMyDsl.g:262:1: ruleSingleResource : ( ( rule__SingleResource__Group__0 ) ) ;
    public final void ruleSingleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__SingleResource__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__SingleResource__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__SingleResource__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__SingleResource__Group__0 )
            {
             before(grammarAccess.getSingleResourceAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__SingleResource__Group__0 )
            // InternalMyDsl.g:269:4: rule__SingleResource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleResource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleResourceAccess().getGroup()); 

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


    // $ANTLR start "entryRuleDOUBLE"
    // InternalMyDsl.g:278:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleDOUBLE EOF )
            // InternalMyDsl.g:280:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalMyDsl.g:287:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__DOUBLE__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__DOUBLE__Group__0 )
            // InternalMyDsl.g:294:4: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEAccess().getGroup()); 

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalMyDsl.g:302:1: rule__Element__Alternatives : ( ( ruleResources ) | ( ruleFactories ) | ( ruleVehicles ) | ( ruleCities ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( ( ruleResources ) | ( ruleFactories ) | ( ruleVehicles ) | ( ruleCities ) )
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
                    // InternalMyDsl.g:307:2: ( ruleResources )
                    {
                    // InternalMyDsl.g:307:2: ( ruleResources )
                    // InternalMyDsl.g:308:3: ruleResources
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
                    // InternalMyDsl.g:313:2: ( ruleFactories )
                    {
                    // InternalMyDsl.g:313:2: ( ruleFactories )
                    // InternalMyDsl.g:314:3: ruleFactories
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
                    // InternalMyDsl.g:319:2: ( ruleVehicles )
                    {
                    // InternalMyDsl.g:319:2: ( ruleVehicles )
                    // InternalMyDsl.g:320:3: ruleVehicles
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
                    // InternalMyDsl.g:325:2: ( ruleCities )
                    {
                    // InternalMyDsl.g:325:2: ( ruleCities )
                    // InternalMyDsl.g:326:3: ruleCities
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
    // InternalMyDsl.g:335:1: rule__Cities__Group__0 : rule__Cities__Group__0__Impl rule__Cities__Group__1 ;
    public final void rule__Cities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:339:1: ( rule__Cities__Group__0__Impl rule__Cities__Group__1 )
            // InternalMyDsl.g:340:2: rule__Cities__Group__0__Impl rule__Cities__Group__1
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
    // InternalMyDsl.g:347:1: rule__Cities__Group__0__Impl : ( 'Cities:' ) ;
    public final void rule__Cities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:351:1: ( ( 'Cities:' ) )
            // InternalMyDsl.g:352:1: ( 'Cities:' )
            {
            // InternalMyDsl.g:352:1: ( 'Cities:' )
            // InternalMyDsl.g:353:2: 'Cities:'
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
    // InternalMyDsl.g:362:1: rule__Cities__Group__1 : rule__Cities__Group__1__Impl rule__Cities__Group__2 ;
    public final void rule__Cities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:1: ( rule__Cities__Group__1__Impl rule__Cities__Group__2 )
            // InternalMyDsl.g:367:2: rule__Cities__Group__1__Impl rule__Cities__Group__2
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
    // InternalMyDsl.g:374:1: rule__Cities__Group__1__Impl : ( ( rule__Cities__NameAssignment_1 ) ) ;
    public final void rule__Cities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:378:1: ( ( ( rule__Cities__NameAssignment_1 ) ) )
            // InternalMyDsl.g:379:1: ( ( rule__Cities__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:379:1: ( ( rule__Cities__NameAssignment_1 ) )
            // InternalMyDsl.g:380:2: ( rule__Cities__NameAssignment_1 )
            {
             before(grammarAccess.getCitiesAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:381:2: ( rule__Cities__NameAssignment_1 )
            // InternalMyDsl.g:381:3: rule__Cities__NameAssignment_1
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
    // InternalMyDsl.g:389:1: rule__Cities__Group__2 : rule__Cities__Group__2__Impl rule__Cities__Group__3 ;
    public final void rule__Cities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:393:1: ( rule__Cities__Group__2__Impl rule__Cities__Group__3 )
            // InternalMyDsl.g:394:2: rule__Cities__Group__2__Impl rule__Cities__Group__3
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
    // InternalMyDsl.g:401:1: rule__Cities__Group__2__Impl : ( '[' ) ;
    public final void rule__Cities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:405:1: ( ( '[' ) )
            // InternalMyDsl.g:406:1: ( '[' )
            {
            // InternalMyDsl.g:406:1: ( '[' )
            // InternalMyDsl.g:407:2: '['
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
    // InternalMyDsl.g:416:1: rule__Cities__Group__3 : rule__Cities__Group__3__Impl rule__Cities__Group__4 ;
    public final void rule__Cities__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:420:1: ( rule__Cities__Group__3__Impl rule__Cities__Group__4 )
            // InternalMyDsl.g:421:2: rule__Cities__Group__3__Impl rule__Cities__Group__4
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
    // InternalMyDsl.g:428:1: rule__Cities__Group__3__Impl : ( 'x' ) ;
    public final void rule__Cities__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( ( 'x' ) )
            // InternalMyDsl.g:433:1: ( 'x' )
            {
            // InternalMyDsl.g:433:1: ( 'x' )
            // InternalMyDsl.g:434:2: 'x'
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
    // InternalMyDsl.g:443:1: rule__Cities__Group__4 : rule__Cities__Group__4__Impl rule__Cities__Group__5 ;
    public final void rule__Cities__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:447:1: ( rule__Cities__Group__4__Impl rule__Cities__Group__5 )
            // InternalMyDsl.g:448:2: rule__Cities__Group__4__Impl rule__Cities__Group__5
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
    // InternalMyDsl.g:455:1: rule__Cities__Group__4__Impl : ( '->' ) ;
    public final void rule__Cities__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:459:1: ( ( '->' ) )
            // InternalMyDsl.g:460:1: ( '->' )
            {
            // InternalMyDsl.g:460:1: ( '->' )
            // InternalMyDsl.g:461:2: '->'
            {
             before(grammarAccess.getCitiesAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

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
    // InternalMyDsl.g:470:1: rule__Cities__Group__5 : rule__Cities__Group__5__Impl rule__Cities__Group__6 ;
    public final void rule__Cities__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:474:1: ( rule__Cities__Group__5__Impl rule__Cities__Group__6 )
            // InternalMyDsl.g:475:2: rule__Cities__Group__5__Impl rule__Cities__Group__6
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
    // InternalMyDsl.g:482:1: rule__Cities__Group__5__Impl : ( ( rule__Cities__XAssignment_5 ) ) ;
    public final void rule__Cities__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:486:1: ( ( ( rule__Cities__XAssignment_5 ) ) )
            // InternalMyDsl.g:487:1: ( ( rule__Cities__XAssignment_5 ) )
            {
            // InternalMyDsl.g:487:1: ( ( rule__Cities__XAssignment_5 ) )
            // InternalMyDsl.g:488:2: ( rule__Cities__XAssignment_5 )
            {
             before(grammarAccess.getCitiesAccess().getXAssignment_5()); 
            // InternalMyDsl.g:489:2: ( rule__Cities__XAssignment_5 )
            // InternalMyDsl.g:489:3: rule__Cities__XAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Cities__XAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCitiesAccess().getXAssignment_5()); 

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
    // InternalMyDsl.g:497:1: rule__Cities__Group__6 : rule__Cities__Group__6__Impl rule__Cities__Group__7 ;
    public final void rule__Cities__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:501:1: ( rule__Cities__Group__6__Impl rule__Cities__Group__7 )
            // InternalMyDsl.g:502:2: rule__Cities__Group__6__Impl rule__Cities__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:509:1: rule__Cities__Group__6__Impl : ( ':' ) ;
    public final void rule__Cities__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:513:1: ( ( ':' ) )
            // InternalMyDsl.g:514:1: ( ':' )
            {
            // InternalMyDsl.g:514:1: ( ':' )
            // InternalMyDsl.g:515:2: ':'
            {
             before(grammarAccess.getCitiesAccess().getColonKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getColonKeyword_6()); 

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
    // InternalMyDsl.g:524:1: rule__Cities__Group__7 : rule__Cities__Group__7__Impl rule__Cities__Group__8 ;
    public final void rule__Cities__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:528:1: ( rule__Cities__Group__7__Impl rule__Cities__Group__8 )
            // InternalMyDsl.g:529:2: rule__Cities__Group__7__Impl rule__Cities__Group__8
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
    // InternalMyDsl.g:536:1: rule__Cities__Group__7__Impl : ( 'y->' ) ;
    public final void rule__Cities__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( ( 'y->' ) )
            // InternalMyDsl.g:541:1: ( 'y->' )
            {
            // InternalMyDsl.g:541:1: ( 'y->' )
            // InternalMyDsl.g:542:2: 'y->'
            {
             before(grammarAccess.getCitiesAccess().getYKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getYKeyword_7()); 

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
    // InternalMyDsl.g:551:1: rule__Cities__Group__8 : rule__Cities__Group__8__Impl rule__Cities__Group__9 ;
    public final void rule__Cities__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:555:1: ( rule__Cities__Group__8__Impl rule__Cities__Group__9 )
            // InternalMyDsl.g:556:2: rule__Cities__Group__8__Impl rule__Cities__Group__9
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:563:1: rule__Cities__Group__8__Impl : ( ( rule__Cities__YAssignment_8 ) ) ;
    public final void rule__Cities__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( ( ( rule__Cities__YAssignment_8 ) ) )
            // InternalMyDsl.g:568:1: ( ( rule__Cities__YAssignment_8 ) )
            {
            // InternalMyDsl.g:568:1: ( ( rule__Cities__YAssignment_8 ) )
            // InternalMyDsl.g:569:2: ( rule__Cities__YAssignment_8 )
            {
             before(grammarAccess.getCitiesAccess().getYAssignment_8()); 
            // InternalMyDsl.g:570:2: ( rule__Cities__YAssignment_8 )
            // InternalMyDsl.g:570:3: rule__Cities__YAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Cities__YAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCitiesAccess().getYAssignment_8()); 

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
    // InternalMyDsl.g:578:1: rule__Cities__Group__9 : rule__Cities__Group__9__Impl rule__Cities__Group__10 ;
    public final void rule__Cities__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( rule__Cities__Group__9__Impl rule__Cities__Group__10 )
            // InternalMyDsl.g:583:2: rule__Cities__Group__9__Impl rule__Cities__Group__10
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:590:1: rule__Cities__Group__9__Impl : ( ':' ) ;
    public final void rule__Cities__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:594:1: ( ( ':' ) )
            // InternalMyDsl.g:595:1: ( ':' )
            {
            // InternalMyDsl.g:595:1: ( ':' )
            // InternalMyDsl.g:596:2: ':'
            {
             before(grammarAccess.getCitiesAccess().getColonKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getColonKeyword_9()); 

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
    // InternalMyDsl.g:605:1: rule__Cities__Group__10 : rule__Cities__Group__10__Impl rule__Cities__Group__11 ;
    public final void rule__Cities__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:609:1: ( rule__Cities__Group__10__Impl rule__Cities__Group__11 )
            // InternalMyDsl.g:610:2: rule__Cities__Group__10__Impl rule__Cities__Group__11
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:617:1: rule__Cities__Group__10__Impl : ( ( rule__Cities__FactoryAssignment_10 )* ) ;
    public final void rule__Cities__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( ( rule__Cities__FactoryAssignment_10 )* ) )
            // InternalMyDsl.g:622:1: ( ( rule__Cities__FactoryAssignment_10 )* )
            {
            // InternalMyDsl.g:622:1: ( ( rule__Cities__FactoryAssignment_10 )* )
            // InternalMyDsl.g:623:2: ( rule__Cities__FactoryAssignment_10 )*
            {
             before(grammarAccess.getCitiesAccess().getFactoryAssignment_10()); 
            // InternalMyDsl.g:624:2: ( rule__Cities__FactoryAssignment_10 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:624:3: rule__Cities__FactoryAssignment_10
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Cities__FactoryAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCitiesAccess().getFactoryAssignment_10()); 

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
    // InternalMyDsl.g:632:1: rule__Cities__Group__11 : rule__Cities__Group__11__Impl rule__Cities__Group__12 ;
    public final void rule__Cities__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( rule__Cities__Group__11__Impl rule__Cities__Group__12 )
            // InternalMyDsl.g:637:2: rule__Cities__Group__11__Impl rule__Cities__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Cities__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cities__Group__12();

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
    // InternalMyDsl.g:644:1: rule__Cities__Group__11__Impl : ( ( rule__Cities__Group_11__0 )* ) ;
    public final void rule__Cities__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:1: ( ( ( rule__Cities__Group_11__0 )* ) )
            // InternalMyDsl.g:649:1: ( ( rule__Cities__Group_11__0 )* )
            {
            // InternalMyDsl.g:649:1: ( ( rule__Cities__Group_11__0 )* )
            // InternalMyDsl.g:650:2: ( rule__Cities__Group_11__0 )*
            {
             before(grammarAccess.getCitiesAccess().getGroup_11()); 
            // InternalMyDsl.g:651:2: ( rule__Cities__Group_11__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:651:3: rule__Cities__Group_11__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Cities__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCitiesAccess().getGroup_11()); 

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


    // $ANTLR start "rule__Cities__Group__12"
    // InternalMyDsl.g:659:1: rule__Cities__Group__12 : rule__Cities__Group__12__Impl ;
    public final void rule__Cities__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:663:1: ( rule__Cities__Group__12__Impl )
            // InternalMyDsl.g:664:2: rule__Cities__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cities__Group__12__Impl();

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
    // $ANTLR end "rule__Cities__Group__12"


    // $ANTLR start "rule__Cities__Group__12__Impl"
    // InternalMyDsl.g:670:1: rule__Cities__Group__12__Impl : ( ']' ) ;
    public final void rule__Cities__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( ( ']' ) )
            // InternalMyDsl.g:675:1: ( ']' )
            {
            // InternalMyDsl.g:675:1: ( ']' )
            // InternalMyDsl.g:676:2: ']'
            {
             before(grammarAccess.getCitiesAccess().getRightSquareBracketKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getRightSquareBracketKeyword_12()); 

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
    // $ANTLR end "rule__Cities__Group__12__Impl"


    // $ANTLR start "rule__Cities__Group_11__0"
    // InternalMyDsl.g:686:1: rule__Cities__Group_11__0 : rule__Cities__Group_11__0__Impl rule__Cities__Group_11__1 ;
    public final void rule__Cities__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:690:1: ( rule__Cities__Group_11__0__Impl rule__Cities__Group_11__1 )
            // InternalMyDsl.g:691:2: rule__Cities__Group_11__0__Impl rule__Cities__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__Cities__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cities__Group_11__1();

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
    // $ANTLR end "rule__Cities__Group_11__0"


    // $ANTLR start "rule__Cities__Group_11__0__Impl"
    // InternalMyDsl.g:698:1: rule__Cities__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Cities__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( ',' ) )
            // InternalMyDsl.g:703:1: ( ',' )
            {
            // InternalMyDsl.g:703:1: ( ',' )
            // InternalMyDsl.g:704:2: ','
            {
             before(grammarAccess.getCitiesAccess().getCommaKeyword_11_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getCommaKeyword_11_0()); 

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
    // $ANTLR end "rule__Cities__Group_11__0__Impl"


    // $ANTLR start "rule__Cities__Group_11__1"
    // InternalMyDsl.g:713:1: rule__Cities__Group_11__1 : rule__Cities__Group_11__1__Impl ;
    public final void rule__Cities__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( rule__Cities__Group_11__1__Impl )
            // InternalMyDsl.g:718:2: rule__Cities__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cities__Group_11__1__Impl();

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
    // $ANTLR end "rule__Cities__Group_11__1"


    // $ANTLR start "rule__Cities__Group_11__1__Impl"
    // InternalMyDsl.g:724:1: rule__Cities__Group_11__1__Impl : ( ( rule__Cities__FactoryAssignment_11_1 ) ) ;
    public final void rule__Cities__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( ( ( rule__Cities__FactoryAssignment_11_1 ) ) )
            // InternalMyDsl.g:729:1: ( ( rule__Cities__FactoryAssignment_11_1 ) )
            {
            // InternalMyDsl.g:729:1: ( ( rule__Cities__FactoryAssignment_11_1 ) )
            // InternalMyDsl.g:730:2: ( rule__Cities__FactoryAssignment_11_1 )
            {
             before(grammarAccess.getCitiesAccess().getFactoryAssignment_11_1()); 
            // InternalMyDsl.g:731:2: ( rule__Cities__FactoryAssignment_11_1 )
            // InternalMyDsl.g:731:3: rule__Cities__FactoryAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Cities__FactoryAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getCitiesAccess().getFactoryAssignment_11_1()); 

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
    // $ANTLR end "rule__Cities__Group_11__1__Impl"


    // $ANTLR start "rule__Vehicles__Group__0"
    // InternalMyDsl.g:740:1: rule__Vehicles__Group__0 : rule__Vehicles__Group__0__Impl rule__Vehicles__Group__1 ;
    public final void rule__Vehicles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( rule__Vehicles__Group__0__Impl rule__Vehicles__Group__1 )
            // InternalMyDsl.g:745:2: rule__Vehicles__Group__0__Impl rule__Vehicles__Group__1
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
    // InternalMyDsl.g:752:1: rule__Vehicles__Group__0__Impl : ( 'Vehicles:' ) ;
    public final void rule__Vehicles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( ( 'Vehicles:' ) )
            // InternalMyDsl.g:757:1: ( 'Vehicles:' )
            {
            // InternalMyDsl.g:757:1: ( 'Vehicles:' )
            // InternalMyDsl.g:758:2: 'Vehicles:'
            {
             before(grammarAccess.getVehiclesAccess().getVehiclesKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:767:1: rule__Vehicles__Group__1 : rule__Vehicles__Group__1__Impl rule__Vehicles__Group__2 ;
    public final void rule__Vehicles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:771:1: ( rule__Vehicles__Group__1__Impl rule__Vehicles__Group__2 )
            // InternalMyDsl.g:772:2: rule__Vehicles__Group__1__Impl rule__Vehicles__Group__2
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
    // InternalMyDsl.g:779:1: rule__Vehicles__Group__1__Impl : ( () ) ;
    public final void rule__Vehicles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( ( () ) )
            // InternalMyDsl.g:784:1: ( () )
            {
            // InternalMyDsl.g:784:1: ( () )
            // InternalMyDsl.g:785:2: ()
            {
             before(grammarAccess.getVehiclesAccess().getVehiclesAction_1()); 
            // InternalMyDsl.g:786:2: ()
            // InternalMyDsl.g:786:3: 
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
    // InternalMyDsl.g:794:1: rule__Vehicles__Group__2 : rule__Vehicles__Group__2__Impl ;
    public final void rule__Vehicles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( rule__Vehicles__Group__2__Impl )
            // InternalMyDsl.g:799:2: rule__Vehicles__Group__2__Impl
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
    // InternalMyDsl.g:805:1: rule__Vehicles__Group__2__Impl : ( ( rule__Vehicles__VehiclesAssignment_2 )* ) ;
    public final void rule__Vehicles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( ( ( rule__Vehicles__VehiclesAssignment_2 )* ) )
            // InternalMyDsl.g:810:1: ( ( rule__Vehicles__VehiclesAssignment_2 )* )
            {
            // InternalMyDsl.g:810:1: ( ( rule__Vehicles__VehiclesAssignment_2 )* )
            // InternalMyDsl.g:811:2: ( rule__Vehicles__VehiclesAssignment_2 )*
            {
             before(grammarAccess.getVehiclesAccess().getVehiclesAssignment_2()); 
            // InternalMyDsl.g:812:2: ( rule__Vehicles__VehiclesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:812:3: rule__Vehicles__VehiclesAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
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


    // $ANTLR start "rule__SingleVehicle__Group__0"
    // InternalMyDsl.g:821:1: rule__SingleVehicle__Group__0 : rule__SingleVehicle__Group__0__Impl rule__SingleVehicle__Group__1 ;
    public final void rule__SingleVehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( rule__SingleVehicle__Group__0__Impl rule__SingleVehicle__Group__1 )
            // InternalMyDsl.g:826:2: rule__SingleVehicle__Group__0__Impl rule__SingleVehicle__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SingleVehicle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__1();

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
    // $ANTLR end "rule__SingleVehicle__Group__0"


    // $ANTLR start "rule__SingleVehicle__Group__0__Impl"
    // InternalMyDsl.g:833:1: rule__SingleVehicle__Group__0__Impl : ( ( rule__SingleVehicle__NameAssignment_0 ) ) ;
    public final void rule__SingleVehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( ( rule__SingleVehicle__NameAssignment_0 ) ) )
            // InternalMyDsl.g:838:1: ( ( rule__SingleVehicle__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:838:1: ( ( rule__SingleVehicle__NameAssignment_0 ) )
            // InternalMyDsl.g:839:2: ( rule__SingleVehicle__NameAssignment_0 )
            {
             before(grammarAccess.getSingleVehicleAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:840:2: ( rule__SingleVehicle__NameAssignment_0 )
            // InternalMyDsl.g:840:3: rule__SingleVehicle__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SingleVehicle__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleVehicleAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__0__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__1"
    // InternalMyDsl.g:848:1: rule__SingleVehicle__Group__1 : rule__SingleVehicle__Group__1__Impl rule__SingleVehicle__Group__2 ;
    public final void rule__SingleVehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( rule__SingleVehicle__Group__1__Impl rule__SingleVehicle__Group__2 )
            // InternalMyDsl.g:853:2: rule__SingleVehicle__Group__1__Impl rule__SingleVehicle__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SingleVehicle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__2();

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
    // $ANTLR end "rule__SingleVehicle__Group__1"


    // $ANTLR start "rule__SingleVehicle__Group__1__Impl"
    // InternalMyDsl.g:860:1: rule__SingleVehicle__Group__1__Impl : ( '[' ) ;
    public final void rule__SingleVehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( ( '[' ) )
            // InternalMyDsl.g:865:1: ( '[' )
            {
            // InternalMyDsl.g:865:1: ( '[' )
            // InternalMyDsl.g:866:2: '['
            {
             before(grammarAccess.getSingleVehicleAccess().getLeftSquareBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__1__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__2"
    // InternalMyDsl.g:875:1: rule__SingleVehicle__Group__2 : rule__SingleVehicle__Group__2__Impl rule__SingleVehicle__Group__3 ;
    public final void rule__SingleVehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( rule__SingleVehicle__Group__2__Impl rule__SingleVehicle__Group__3 )
            // InternalMyDsl.g:880:2: rule__SingleVehicle__Group__2__Impl rule__SingleVehicle__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SingleVehicle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__3();

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
    // $ANTLR end "rule__SingleVehicle__Group__2"


    // $ANTLR start "rule__SingleVehicle__Group__2__Impl"
    // InternalMyDsl.g:887:1: rule__SingleVehicle__Group__2__Impl : ( 'speed' ) ;
    public final void rule__SingleVehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( ( 'speed' ) )
            // InternalMyDsl.g:892:1: ( 'speed' )
            {
            // InternalMyDsl.g:892:1: ( 'speed' )
            // InternalMyDsl.g:893:2: 'speed'
            {
             before(grammarAccess.getSingleVehicleAccess().getSpeedKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getSpeedKeyword_2()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__2__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__3"
    // InternalMyDsl.g:902:1: rule__SingleVehicle__Group__3 : rule__SingleVehicle__Group__3__Impl rule__SingleVehicle__Group__4 ;
    public final void rule__SingleVehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:906:1: ( rule__SingleVehicle__Group__3__Impl rule__SingleVehicle__Group__4 )
            // InternalMyDsl.g:907:2: rule__SingleVehicle__Group__3__Impl rule__SingleVehicle__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__SingleVehicle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__4();

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
    // $ANTLR end "rule__SingleVehicle__Group__3"


    // $ANTLR start "rule__SingleVehicle__Group__3__Impl"
    // InternalMyDsl.g:914:1: rule__SingleVehicle__Group__3__Impl : ( '->' ) ;
    public final void rule__SingleVehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( ( '->' ) )
            // InternalMyDsl.g:919:1: ( '->' )
            {
            // InternalMyDsl.g:919:1: ( '->' )
            // InternalMyDsl.g:920:2: '->'
            {
             before(grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__3__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__4"
    // InternalMyDsl.g:929:1: rule__SingleVehicle__Group__4 : rule__SingleVehicle__Group__4__Impl rule__SingleVehicle__Group__5 ;
    public final void rule__SingleVehicle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:933:1: ( rule__SingleVehicle__Group__4__Impl rule__SingleVehicle__Group__5 )
            // InternalMyDsl.g:934:2: rule__SingleVehicle__Group__4__Impl rule__SingleVehicle__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__SingleVehicle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__5();

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
    // $ANTLR end "rule__SingleVehicle__Group__4"


    // $ANTLR start "rule__SingleVehicle__Group__4__Impl"
    // InternalMyDsl.g:941:1: rule__SingleVehicle__Group__4__Impl : ( ( rule__SingleVehicle__SpeedAssignment_4 ) ) ;
    public final void rule__SingleVehicle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( ( ( rule__SingleVehicle__SpeedAssignment_4 ) ) )
            // InternalMyDsl.g:946:1: ( ( rule__SingleVehicle__SpeedAssignment_4 ) )
            {
            // InternalMyDsl.g:946:1: ( ( rule__SingleVehicle__SpeedAssignment_4 ) )
            // InternalMyDsl.g:947:2: ( rule__SingleVehicle__SpeedAssignment_4 )
            {
             before(grammarAccess.getSingleVehicleAccess().getSpeedAssignment_4()); 
            // InternalMyDsl.g:948:2: ( rule__SingleVehicle__SpeedAssignment_4 )
            // InternalMyDsl.g:948:3: rule__SingleVehicle__SpeedAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SingleVehicle__SpeedAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSingleVehicleAccess().getSpeedAssignment_4()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__4__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__5"
    // InternalMyDsl.g:956:1: rule__SingleVehicle__Group__5 : rule__SingleVehicle__Group__5__Impl rule__SingleVehicle__Group__6 ;
    public final void rule__SingleVehicle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( rule__SingleVehicle__Group__5__Impl rule__SingleVehicle__Group__6 )
            // InternalMyDsl.g:961:2: rule__SingleVehicle__Group__5__Impl rule__SingleVehicle__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__SingleVehicle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__6();

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
    // $ANTLR end "rule__SingleVehicle__Group__5"


    // $ANTLR start "rule__SingleVehicle__Group__5__Impl"
    // InternalMyDsl.g:968:1: rule__SingleVehicle__Group__5__Impl : ( ':' ) ;
    public final void rule__SingleVehicle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( ( ':' ) )
            // InternalMyDsl.g:973:1: ( ':' )
            {
            // InternalMyDsl.g:973:1: ( ':' )
            // InternalMyDsl.g:974:2: ':'
            {
             before(grammarAccess.getSingleVehicleAccess().getColonKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__5__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__6"
    // InternalMyDsl.g:983:1: rule__SingleVehicle__Group__6 : rule__SingleVehicle__Group__6__Impl rule__SingleVehicle__Group__7 ;
    public final void rule__SingleVehicle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( rule__SingleVehicle__Group__6__Impl rule__SingleVehicle__Group__7 )
            // InternalMyDsl.g:988:2: rule__SingleVehicle__Group__6__Impl rule__SingleVehicle__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__SingleVehicle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__7();

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
    // $ANTLR end "rule__SingleVehicle__Group__6"


    // $ANTLR start "rule__SingleVehicle__Group__6__Impl"
    // InternalMyDsl.g:995:1: rule__SingleVehicle__Group__6__Impl : ( 'load' ) ;
    public final void rule__SingleVehicle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( ( 'load' ) )
            // InternalMyDsl.g:1000:1: ( 'load' )
            {
            // InternalMyDsl.g:1000:1: ( 'load' )
            // InternalMyDsl.g:1001:2: 'load'
            {
             before(grammarAccess.getSingleVehicleAccess().getLoadKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getLoadKeyword_6()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__6__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__7"
    // InternalMyDsl.g:1010:1: rule__SingleVehicle__Group__7 : rule__SingleVehicle__Group__7__Impl rule__SingleVehicle__Group__8 ;
    public final void rule__SingleVehicle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( rule__SingleVehicle__Group__7__Impl rule__SingleVehicle__Group__8 )
            // InternalMyDsl.g:1015:2: rule__SingleVehicle__Group__7__Impl rule__SingleVehicle__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__SingleVehicle__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__8();

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
    // $ANTLR end "rule__SingleVehicle__Group__7"


    // $ANTLR start "rule__SingleVehicle__Group__7__Impl"
    // InternalMyDsl.g:1022:1: rule__SingleVehicle__Group__7__Impl : ( '->' ) ;
    public final void rule__SingleVehicle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( ( '->' ) )
            // InternalMyDsl.g:1027:1: ( '->' )
            {
            // InternalMyDsl.g:1027:1: ( '->' )
            // InternalMyDsl.g:1028:2: '->'
            {
             before(grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_7()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__7__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__8"
    // InternalMyDsl.g:1037:1: rule__SingleVehicle__Group__8 : rule__SingleVehicle__Group__8__Impl rule__SingleVehicle__Group__9 ;
    public final void rule__SingleVehicle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( rule__SingleVehicle__Group__8__Impl rule__SingleVehicle__Group__9 )
            // InternalMyDsl.g:1042:2: rule__SingleVehicle__Group__8__Impl rule__SingleVehicle__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__SingleVehicle__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__9();

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
    // $ANTLR end "rule__SingleVehicle__Group__8"


    // $ANTLR start "rule__SingleVehicle__Group__8__Impl"
    // InternalMyDsl.g:1049:1: rule__SingleVehicle__Group__8__Impl : ( ( rule__SingleVehicle__LoadAssignment_8 ) ) ;
    public final void rule__SingleVehicle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( ( ( rule__SingleVehicle__LoadAssignment_8 ) ) )
            // InternalMyDsl.g:1054:1: ( ( rule__SingleVehicle__LoadAssignment_8 ) )
            {
            // InternalMyDsl.g:1054:1: ( ( rule__SingleVehicle__LoadAssignment_8 ) )
            // InternalMyDsl.g:1055:2: ( rule__SingleVehicle__LoadAssignment_8 )
            {
             before(grammarAccess.getSingleVehicleAccess().getLoadAssignment_8()); 
            // InternalMyDsl.g:1056:2: ( rule__SingleVehicle__LoadAssignment_8 )
            // InternalMyDsl.g:1056:3: rule__SingleVehicle__LoadAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__SingleVehicle__LoadAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSingleVehicleAccess().getLoadAssignment_8()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__8__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__9"
    // InternalMyDsl.g:1064:1: rule__SingleVehicle__Group__9 : rule__SingleVehicle__Group__9__Impl rule__SingleVehicle__Group__10 ;
    public final void rule__SingleVehicle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( rule__SingleVehicle__Group__9__Impl rule__SingleVehicle__Group__10 )
            // InternalMyDsl.g:1069:2: rule__SingleVehicle__Group__9__Impl rule__SingleVehicle__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__SingleVehicle__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__10();

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
    // $ANTLR end "rule__SingleVehicle__Group__9"


    // $ANTLR start "rule__SingleVehicle__Group__9__Impl"
    // InternalMyDsl.g:1076:1: rule__SingleVehicle__Group__9__Impl : ( ':' ) ;
    public final void rule__SingleVehicle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( ( ':' ) )
            // InternalMyDsl.g:1081:1: ( ':' )
            {
            // InternalMyDsl.g:1081:1: ( ':' )
            // InternalMyDsl.g:1082:2: ':'
            {
             before(grammarAccess.getSingleVehicleAccess().getColonKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getColonKeyword_9()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__9__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__10"
    // InternalMyDsl.g:1091:1: rule__SingleVehicle__Group__10 : rule__SingleVehicle__Group__10__Impl rule__SingleVehicle__Group__11 ;
    public final void rule__SingleVehicle__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( rule__SingleVehicle__Group__10__Impl rule__SingleVehicle__Group__11 )
            // InternalMyDsl.g:1096:2: rule__SingleVehicle__Group__10__Impl rule__SingleVehicle__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__SingleVehicle__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__11();

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
    // $ANTLR end "rule__SingleVehicle__Group__10"


    // $ANTLR start "rule__SingleVehicle__Group__10__Impl"
    // InternalMyDsl.g:1103:1: rule__SingleVehicle__Group__10__Impl : ( 'tankSize' ) ;
    public final void rule__SingleVehicle__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( ( 'tankSize' ) )
            // InternalMyDsl.g:1108:1: ( 'tankSize' )
            {
            // InternalMyDsl.g:1108:1: ( 'tankSize' )
            // InternalMyDsl.g:1109:2: 'tankSize'
            {
             before(grammarAccess.getSingleVehicleAccess().getTankSizeKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getTankSizeKeyword_10()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__10__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__11"
    // InternalMyDsl.g:1118:1: rule__SingleVehicle__Group__11 : rule__SingleVehicle__Group__11__Impl rule__SingleVehicle__Group__12 ;
    public final void rule__SingleVehicle__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1122:1: ( rule__SingleVehicle__Group__11__Impl rule__SingleVehicle__Group__12 )
            // InternalMyDsl.g:1123:2: rule__SingleVehicle__Group__11__Impl rule__SingleVehicle__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__SingleVehicle__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__12();

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
    // $ANTLR end "rule__SingleVehicle__Group__11"


    // $ANTLR start "rule__SingleVehicle__Group__11__Impl"
    // InternalMyDsl.g:1130:1: rule__SingleVehicle__Group__11__Impl : ( '->' ) ;
    public final void rule__SingleVehicle__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1134:1: ( ( '->' ) )
            // InternalMyDsl.g:1135:1: ( '->' )
            {
            // InternalMyDsl.g:1135:1: ( '->' )
            // InternalMyDsl.g:1136:2: '->'
            {
             before(grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_11()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__11__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__12"
    // InternalMyDsl.g:1145:1: rule__SingleVehicle__Group__12 : rule__SingleVehicle__Group__12__Impl rule__SingleVehicle__Group__13 ;
    public final void rule__SingleVehicle__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1149:1: ( rule__SingleVehicle__Group__12__Impl rule__SingleVehicle__Group__13 )
            // InternalMyDsl.g:1150:2: rule__SingleVehicle__Group__12__Impl rule__SingleVehicle__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__SingleVehicle__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__13();

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
    // $ANTLR end "rule__SingleVehicle__Group__12"


    // $ANTLR start "rule__SingleVehicle__Group__12__Impl"
    // InternalMyDsl.g:1157:1: rule__SingleVehicle__Group__12__Impl : ( ( rule__SingleVehicle__TankSizeAssignment_12 ) ) ;
    public final void rule__SingleVehicle__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1161:1: ( ( ( rule__SingleVehicle__TankSizeAssignment_12 ) ) )
            // InternalMyDsl.g:1162:1: ( ( rule__SingleVehicle__TankSizeAssignment_12 ) )
            {
            // InternalMyDsl.g:1162:1: ( ( rule__SingleVehicle__TankSizeAssignment_12 ) )
            // InternalMyDsl.g:1163:2: ( rule__SingleVehicle__TankSizeAssignment_12 )
            {
             before(grammarAccess.getSingleVehicleAccess().getTankSizeAssignment_12()); 
            // InternalMyDsl.g:1164:2: ( rule__SingleVehicle__TankSizeAssignment_12 )
            // InternalMyDsl.g:1164:3: rule__SingleVehicle__TankSizeAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__SingleVehicle__TankSizeAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getSingleVehicleAccess().getTankSizeAssignment_12()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__12__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__13"
    // InternalMyDsl.g:1172:1: rule__SingleVehicle__Group__13 : rule__SingleVehicle__Group__13__Impl rule__SingleVehicle__Group__14 ;
    public final void rule__SingleVehicle__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( rule__SingleVehicle__Group__13__Impl rule__SingleVehicle__Group__14 )
            // InternalMyDsl.g:1177:2: rule__SingleVehicle__Group__13__Impl rule__SingleVehicle__Group__14
            {
            pushFollow(FOLLOW_17);
            rule__SingleVehicle__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__14();

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
    // $ANTLR end "rule__SingleVehicle__Group__13"


    // $ANTLR start "rule__SingleVehicle__Group__13__Impl"
    // InternalMyDsl.g:1184:1: rule__SingleVehicle__Group__13__Impl : ( ':' ) ;
    public final void rule__SingleVehicle__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1188:1: ( ( ':' ) )
            // InternalMyDsl.g:1189:1: ( ':' )
            {
            // InternalMyDsl.g:1189:1: ( ':' )
            // InternalMyDsl.g:1190:2: ':'
            {
             before(grammarAccess.getSingleVehicleAccess().getColonKeyword_13()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getColonKeyword_13()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__13__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__14"
    // InternalMyDsl.g:1199:1: rule__SingleVehicle__Group__14 : rule__SingleVehicle__Group__14__Impl rule__SingleVehicle__Group__15 ;
    public final void rule__SingleVehicle__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1203:1: ( rule__SingleVehicle__Group__14__Impl rule__SingleVehicle__Group__15 )
            // InternalMyDsl.g:1204:2: rule__SingleVehicle__Group__14__Impl rule__SingleVehicle__Group__15
            {
            pushFollow(FOLLOW_7);
            rule__SingleVehicle__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__15();

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
    // $ANTLR end "rule__SingleVehicle__Group__14"


    // $ANTLR start "rule__SingleVehicle__Group__14__Impl"
    // InternalMyDsl.g:1211:1: rule__SingleVehicle__Group__14__Impl : ( 'fuelConsumption' ) ;
    public final void rule__SingleVehicle__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1215:1: ( ( 'fuelConsumption' ) )
            // InternalMyDsl.g:1216:1: ( 'fuelConsumption' )
            {
            // InternalMyDsl.g:1216:1: ( 'fuelConsumption' )
            // InternalMyDsl.g:1217:2: 'fuelConsumption'
            {
             before(grammarAccess.getSingleVehicleAccess().getFuelConsumptionKeyword_14()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getFuelConsumptionKeyword_14()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__14__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__15"
    // InternalMyDsl.g:1226:1: rule__SingleVehicle__Group__15 : rule__SingleVehicle__Group__15__Impl rule__SingleVehicle__Group__16 ;
    public final void rule__SingleVehicle__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1230:1: ( rule__SingleVehicle__Group__15__Impl rule__SingleVehicle__Group__16 )
            // InternalMyDsl.g:1231:2: rule__SingleVehicle__Group__15__Impl rule__SingleVehicle__Group__16
            {
            pushFollow(FOLLOW_8);
            rule__SingleVehicle__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__16();

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
    // $ANTLR end "rule__SingleVehicle__Group__15"


    // $ANTLR start "rule__SingleVehicle__Group__15__Impl"
    // InternalMyDsl.g:1238:1: rule__SingleVehicle__Group__15__Impl : ( '->' ) ;
    public final void rule__SingleVehicle__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( ( '->' ) )
            // InternalMyDsl.g:1243:1: ( '->' )
            {
            // InternalMyDsl.g:1243:1: ( '->' )
            // InternalMyDsl.g:1244:2: '->'
            {
             before(grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_15()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_15()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__15__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__16"
    // InternalMyDsl.g:1253:1: rule__SingleVehicle__Group__16 : rule__SingleVehicle__Group__16__Impl rule__SingleVehicle__Group__17 ;
    public final void rule__SingleVehicle__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1257:1: ( rule__SingleVehicle__Group__16__Impl rule__SingleVehicle__Group__17 )
            // InternalMyDsl.g:1258:2: rule__SingleVehicle__Group__16__Impl rule__SingleVehicle__Group__17
            {
            pushFollow(FOLLOW_18);
            rule__SingleVehicle__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__17();

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
    // $ANTLR end "rule__SingleVehicle__Group__16"


    // $ANTLR start "rule__SingleVehicle__Group__16__Impl"
    // InternalMyDsl.g:1265:1: rule__SingleVehicle__Group__16__Impl : ( ( rule__SingleVehicle__FuelConsumptionAssignment_16 ) ) ;
    public final void rule__SingleVehicle__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1269:1: ( ( ( rule__SingleVehicle__FuelConsumptionAssignment_16 ) ) )
            // InternalMyDsl.g:1270:1: ( ( rule__SingleVehicle__FuelConsumptionAssignment_16 ) )
            {
            // InternalMyDsl.g:1270:1: ( ( rule__SingleVehicle__FuelConsumptionAssignment_16 ) )
            // InternalMyDsl.g:1271:2: ( rule__SingleVehicle__FuelConsumptionAssignment_16 )
            {
             before(grammarAccess.getSingleVehicleAccess().getFuelConsumptionAssignment_16()); 
            // InternalMyDsl.g:1272:2: ( rule__SingleVehicle__FuelConsumptionAssignment_16 )
            // InternalMyDsl.g:1272:3: rule__SingleVehicle__FuelConsumptionAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__SingleVehicle__FuelConsumptionAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getSingleVehicleAccess().getFuelConsumptionAssignment_16()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__16__Impl"


    // $ANTLR start "rule__SingleVehicle__Group__17"
    // InternalMyDsl.g:1280:1: rule__SingleVehicle__Group__17 : rule__SingleVehicle__Group__17__Impl ;
    public final void rule__SingleVehicle__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( rule__SingleVehicle__Group__17__Impl )
            // InternalMyDsl.g:1285:2: rule__SingleVehicle__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleVehicle__Group__17__Impl();

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
    // $ANTLR end "rule__SingleVehicle__Group__17"


    // $ANTLR start "rule__SingleVehicle__Group__17__Impl"
    // InternalMyDsl.g:1291:1: rule__SingleVehicle__Group__17__Impl : ( ']' ) ;
    public final void rule__SingleVehicle__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1295:1: ( ( ']' ) )
            // InternalMyDsl.g:1296:1: ( ']' )
            {
            // InternalMyDsl.g:1296:1: ( ']' )
            // InternalMyDsl.g:1297:2: ']'
            {
             before(grammarAccess.getSingleVehicleAccess().getRightSquareBracketKeyword_17()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getRightSquareBracketKeyword_17()); 

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
    // $ANTLR end "rule__SingleVehicle__Group__17__Impl"


    // $ANTLR start "rule__Factories__Group__0"
    // InternalMyDsl.g:1307:1: rule__Factories__Group__0 : rule__Factories__Group__0__Impl rule__Factories__Group__1 ;
    public final void rule__Factories__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1311:1: ( rule__Factories__Group__0__Impl rule__Factories__Group__1 )
            // InternalMyDsl.g:1312:2: rule__Factories__Group__0__Impl rule__Factories__Group__1
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
    // InternalMyDsl.g:1319:1: rule__Factories__Group__0__Impl : ( 'Factories:' ) ;
    public final void rule__Factories__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1323:1: ( ( 'Factories:' ) )
            // InternalMyDsl.g:1324:1: ( 'Factories:' )
            {
            // InternalMyDsl.g:1324:1: ( 'Factories:' )
            // InternalMyDsl.g:1325:2: 'Factories:'
            {
             before(grammarAccess.getFactoriesAccess().getFactoriesKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1334:1: rule__Factories__Group__1 : rule__Factories__Group__1__Impl rule__Factories__Group__2 ;
    public final void rule__Factories__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( rule__Factories__Group__1__Impl rule__Factories__Group__2 )
            // InternalMyDsl.g:1339:2: rule__Factories__Group__1__Impl rule__Factories__Group__2
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
    // InternalMyDsl.g:1346:1: rule__Factories__Group__1__Impl : ( () ) ;
    public final void rule__Factories__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1350:1: ( ( () ) )
            // InternalMyDsl.g:1351:1: ( () )
            {
            // InternalMyDsl.g:1351:1: ( () )
            // InternalMyDsl.g:1352:2: ()
            {
             before(grammarAccess.getFactoriesAccess().getFactoriesAction_1()); 
            // InternalMyDsl.g:1353:2: ()
            // InternalMyDsl.g:1353:3: 
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
    // InternalMyDsl.g:1361:1: rule__Factories__Group__2 : rule__Factories__Group__2__Impl ;
    public final void rule__Factories__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1365:1: ( rule__Factories__Group__2__Impl )
            // InternalMyDsl.g:1366:2: rule__Factories__Group__2__Impl
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
    // InternalMyDsl.g:1372:1: rule__Factories__Group__2__Impl : ( ( rule__Factories__FactoriesAssignment_2 )* ) ;
    public final void rule__Factories__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1376:1: ( ( ( rule__Factories__FactoriesAssignment_2 )* ) )
            // InternalMyDsl.g:1377:1: ( ( rule__Factories__FactoriesAssignment_2 )* )
            {
            // InternalMyDsl.g:1377:1: ( ( rule__Factories__FactoriesAssignment_2 )* )
            // InternalMyDsl.g:1378:2: ( rule__Factories__FactoriesAssignment_2 )*
            {
             before(grammarAccess.getFactoriesAccess().getFactoriesAssignment_2()); 
            // InternalMyDsl.g:1379:2: ( rule__Factories__FactoriesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1379:3: rule__Factories__FactoriesAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1388:1: rule__SingleFactory__Group__0 : rule__SingleFactory__Group__0__Impl rule__SingleFactory__Group__1 ;
    public final void rule__SingleFactory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1392:1: ( rule__SingleFactory__Group__0__Impl rule__SingleFactory__Group__1 )
            // InternalMyDsl.g:1393:2: rule__SingleFactory__Group__0__Impl rule__SingleFactory__Group__1
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
    // InternalMyDsl.g:1400:1: rule__SingleFactory__Group__0__Impl : ( ( rule__SingleFactory__NameAssignment_0 ) ) ;
    public final void rule__SingleFactory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1404:1: ( ( ( rule__SingleFactory__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1405:1: ( ( rule__SingleFactory__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1405:1: ( ( rule__SingleFactory__NameAssignment_0 ) )
            // InternalMyDsl.g:1406:2: ( rule__SingleFactory__NameAssignment_0 )
            {
             before(grammarAccess.getSingleFactoryAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1407:2: ( rule__SingleFactory__NameAssignment_0 )
            // InternalMyDsl.g:1407:3: rule__SingleFactory__NameAssignment_0
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
    // InternalMyDsl.g:1415:1: rule__SingleFactory__Group__1 : rule__SingleFactory__Group__1__Impl rule__SingleFactory__Group__2 ;
    public final void rule__SingleFactory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1419:1: ( rule__SingleFactory__Group__1__Impl rule__SingleFactory__Group__2 )
            // InternalMyDsl.g:1420:2: rule__SingleFactory__Group__1__Impl rule__SingleFactory__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1427:1: rule__SingleFactory__Group__1__Impl : ( '[' ) ;
    public final void rule__SingleFactory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1431:1: ( ( '[' ) )
            // InternalMyDsl.g:1432:1: ( '[' )
            {
            // InternalMyDsl.g:1432:1: ( '[' )
            // InternalMyDsl.g:1433:2: '['
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
    // InternalMyDsl.g:1442:1: rule__SingleFactory__Group__2 : rule__SingleFactory__Group__2__Impl rule__SingleFactory__Group__3 ;
    public final void rule__SingleFactory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1446:1: ( rule__SingleFactory__Group__2__Impl rule__SingleFactory__Group__3 )
            // InternalMyDsl.g:1447:2: rule__SingleFactory__Group__2__Impl rule__SingleFactory__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1454:1: rule__SingleFactory__Group__2__Impl : ( ( rule__SingleFactory__Group_2__0 )? ) ;
    public final void rule__SingleFactory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1458:1: ( ( ( rule__SingleFactory__Group_2__0 )? ) )
            // InternalMyDsl.g:1459:1: ( ( rule__SingleFactory__Group_2__0 )? )
            {
            // InternalMyDsl.g:1459:1: ( ( rule__SingleFactory__Group_2__0 )? )
            // InternalMyDsl.g:1460:2: ( rule__SingleFactory__Group_2__0 )?
            {
             before(grammarAccess.getSingleFactoryAccess().getGroup_2()); 
            // InternalMyDsl.g:1461:2: ( rule__SingleFactory__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1461:3: rule__SingleFactory__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleFactory__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleFactoryAccess().getGroup_2()); 

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
    // InternalMyDsl.g:1469:1: rule__SingleFactory__Group__3 : rule__SingleFactory__Group__3__Impl rule__SingleFactory__Group__4 ;
    public final void rule__SingleFactory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( rule__SingleFactory__Group__3__Impl rule__SingleFactory__Group__4 )
            // InternalMyDsl.g:1474:2: rule__SingleFactory__Group__3__Impl rule__SingleFactory__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1481:1: rule__SingleFactory__Group__3__Impl : ( ':' ) ;
    public final void rule__SingleFactory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1485:1: ( ( ':' ) )
            // InternalMyDsl.g:1486:1: ( ':' )
            {
            // InternalMyDsl.g:1486:1: ( ':' )
            // InternalMyDsl.g:1487:2: ':'
            {
             before(grammarAccess.getSingleFactoryAccess().getColonKeyword_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:1496:1: rule__SingleFactory__Group__4 : rule__SingleFactory__Group__4__Impl rule__SingleFactory__Group__5 ;
    public final void rule__SingleFactory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1500:1: ( rule__SingleFactory__Group__4__Impl rule__SingleFactory__Group__5 )
            // InternalMyDsl.g:1501:2: rule__SingleFactory__Group__4__Impl rule__SingleFactory__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1508:1: rule__SingleFactory__Group__4__Impl : ( ( rule__SingleFactory__Group_4__0 )? ) ;
    public final void rule__SingleFactory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1512:1: ( ( ( rule__SingleFactory__Group_4__0 )? ) )
            // InternalMyDsl.g:1513:1: ( ( rule__SingleFactory__Group_4__0 )? )
            {
            // InternalMyDsl.g:1513:1: ( ( rule__SingleFactory__Group_4__0 )? )
            // InternalMyDsl.g:1514:2: ( rule__SingleFactory__Group_4__0 )?
            {
             before(grammarAccess.getSingleFactoryAccess().getGroup_4()); 
            // InternalMyDsl.g:1515:2: ( rule__SingleFactory__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1515:3: rule__SingleFactory__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleFactory__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleFactoryAccess().getGroup_4()); 

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
    // InternalMyDsl.g:1523:1: rule__SingleFactory__Group__5 : rule__SingleFactory__Group__5__Impl ;
    public final void rule__SingleFactory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( rule__SingleFactory__Group__5__Impl )
            // InternalMyDsl.g:1528:2: rule__SingleFactory__Group__5__Impl
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
    // InternalMyDsl.g:1534:1: rule__SingleFactory__Group__5__Impl : ( ']' ) ;
    public final void rule__SingleFactory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1538:1: ( ( ']' ) )
            // InternalMyDsl.g:1539:1: ( ']' )
            {
            // InternalMyDsl.g:1539:1: ( ']' )
            // InternalMyDsl.g:1540:2: ']'
            {
             before(grammarAccess.getSingleFactoryAccess().getRightSquareBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__SingleFactory__Group_2__0"
    // InternalMyDsl.g:1550:1: rule__SingleFactory__Group_2__0 : rule__SingleFactory__Group_2__0__Impl rule__SingleFactory__Group_2__1 ;
    public final void rule__SingleFactory__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1554:1: ( rule__SingleFactory__Group_2__0__Impl rule__SingleFactory__Group_2__1 )
            // InternalMyDsl.g:1555:2: rule__SingleFactory__Group_2__0__Impl rule__SingleFactory__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__SingleFactory__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleFactory__Group_2__1();

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
    // $ANTLR end "rule__SingleFactory__Group_2__0"


    // $ANTLR start "rule__SingleFactory__Group_2__0__Impl"
    // InternalMyDsl.g:1562:1: rule__SingleFactory__Group_2__0__Impl : ( 'in' ) ;
    public final void rule__SingleFactory__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1566:1: ( ( 'in' ) )
            // InternalMyDsl.g:1567:1: ( 'in' )
            {
            // InternalMyDsl.g:1567:1: ( 'in' )
            // InternalMyDsl.g:1568:2: 'in'
            {
             before(grammarAccess.getSingleFactoryAccess().getInKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSingleFactoryAccess().getInKeyword_2_0()); 

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
    // $ANTLR end "rule__SingleFactory__Group_2__0__Impl"


    // $ANTLR start "rule__SingleFactory__Group_2__1"
    // InternalMyDsl.g:1577:1: rule__SingleFactory__Group_2__1 : rule__SingleFactory__Group_2__1__Impl rule__SingleFactory__Group_2__2 ;
    public final void rule__SingleFactory__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( rule__SingleFactory__Group_2__1__Impl rule__SingleFactory__Group_2__2 )
            // InternalMyDsl.g:1582:2: rule__SingleFactory__Group_2__1__Impl rule__SingleFactory__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__SingleFactory__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleFactory__Group_2__2();

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
    // $ANTLR end "rule__SingleFactory__Group_2__1"


    // $ANTLR start "rule__SingleFactory__Group_2__1__Impl"
    // InternalMyDsl.g:1589:1: rule__SingleFactory__Group_2__1__Impl : ( '->' ) ;
    public final void rule__SingleFactory__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( ( '->' ) )
            // InternalMyDsl.g:1594:1: ( '->' )
            {
            // InternalMyDsl.g:1594:1: ( '->' )
            // InternalMyDsl.g:1595:2: '->'
            {
             before(grammarAccess.getSingleFactoryAccess().getHyphenMinusGreaterThanSignKeyword_2_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSingleFactoryAccess().getHyphenMinusGreaterThanSignKeyword_2_1()); 

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
    // $ANTLR end "rule__SingleFactory__Group_2__1__Impl"


    // $ANTLR start "rule__SingleFactory__Group_2__2"
    // InternalMyDsl.g:1604:1: rule__SingleFactory__Group_2__2 : rule__SingleFactory__Group_2__2__Impl ;
    public final void rule__SingleFactory__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1608:1: ( rule__SingleFactory__Group_2__2__Impl )
            // InternalMyDsl.g:1609:2: rule__SingleFactory__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleFactory__Group_2__2__Impl();

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
    // $ANTLR end "rule__SingleFactory__Group_2__2"


    // $ANTLR start "rule__SingleFactory__Group_2__2__Impl"
    // InternalMyDsl.g:1615:1: rule__SingleFactory__Group_2__2__Impl : ( ( rule__SingleFactory__InputAssignment_2_2 ) ) ;
    public final void rule__SingleFactory__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1619:1: ( ( ( rule__SingleFactory__InputAssignment_2_2 ) ) )
            // InternalMyDsl.g:1620:1: ( ( rule__SingleFactory__InputAssignment_2_2 ) )
            {
            // InternalMyDsl.g:1620:1: ( ( rule__SingleFactory__InputAssignment_2_2 ) )
            // InternalMyDsl.g:1621:2: ( rule__SingleFactory__InputAssignment_2_2 )
            {
             before(grammarAccess.getSingleFactoryAccess().getInputAssignment_2_2()); 
            // InternalMyDsl.g:1622:2: ( rule__SingleFactory__InputAssignment_2_2 )
            // InternalMyDsl.g:1622:3: rule__SingleFactory__InputAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SingleFactory__InputAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleFactoryAccess().getInputAssignment_2_2()); 

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
    // $ANTLR end "rule__SingleFactory__Group_2__2__Impl"


    // $ANTLR start "rule__SingleFactory__Group_4__0"
    // InternalMyDsl.g:1631:1: rule__SingleFactory__Group_4__0 : rule__SingleFactory__Group_4__0__Impl rule__SingleFactory__Group_4__1 ;
    public final void rule__SingleFactory__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1635:1: ( rule__SingleFactory__Group_4__0__Impl rule__SingleFactory__Group_4__1 )
            // InternalMyDsl.g:1636:2: rule__SingleFactory__Group_4__0__Impl rule__SingleFactory__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__SingleFactory__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleFactory__Group_4__1();

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
    // $ANTLR end "rule__SingleFactory__Group_4__0"


    // $ANTLR start "rule__SingleFactory__Group_4__0__Impl"
    // InternalMyDsl.g:1643:1: rule__SingleFactory__Group_4__0__Impl : ( 'out' ) ;
    public final void rule__SingleFactory__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1647:1: ( ( 'out' ) )
            // InternalMyDsl.g:1648:1: ( 'out' )
            {
            // InternalMyDsl.g:1648:1: ( 'out' )
            // InternalMyDsl.g:1649:2: 'out'
            {
             before(grammarAccess.getSingleFactoryAccess().getOutKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSingleFactoryAccess().getOutKeyword_4_0()); 

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
    // $ANTLR end "rule__SingleFactory__Group_4__0__Impl"


    // $ANTLR start "rule__SingleFactory__Group_4__1"
    // InternalMyDsl.g:1658:1: rule__SingleFactory__Group_4__1 : rule__SingleFactory__Group_4__1__Impl rule__SingleFactory__Group_4__2 ;
    public final void rule__SingleFactory__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1662:1: ( rule__SingleFactory__Group_4__1__Impl rule__SingleFactory__Group_4__2 )
            // InternalMyDsl.g:1663:2: rule__SingleFactory__Group_4__1__Impl rule__SingleFactory__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__SingleFactory__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleFactory__Group_4__2();

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
    // $ANTLR end "rule__SingleFactory__Group_4__1"


    // $ANTLR start "rule__SingleFactory__Group_4__1__Impl"
    // InternalMyDsl.g:1670:1: rule__SingleFactory__Group_4__1__Impl : ( '->' ) ;
    public final void rule__SingleFactory__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1674:1: ( ( '->' ) )
            // InternalMyDsl.g:1675:1: ( '->' )
            {
            // InternalMyDsl.g:1675:1: ( '->' )
            // InternalMyDsl.g:1676:2: '->'
            {
             before(grammarAccess.getSingleFactoryAccess().getHyphenMinusGreaterThanSignKeyword_4_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSingleFactoryAccess().getHyphenMinusGreaterThanSignKeyword_4_1()); 

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
    // $ANTLR end "rule__SingleFactory__Group_4__1__Impl"


    // $ANTLR start "rule__SingleFactory__Group_4__2"
    // InternalMyDsl.g:1685:1: rule__SingleFactory__Group_4__2 : rule__SingleFactory__Group_4__2__Impl ;
    public final void rule__SingleFactory__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1689:1: ( rule__SingleFactory__Group_4__2__Impl )
            // InternalMyDsl.g:1690:2: rule__SingleFactory__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleFactory__Group_4__2__Impl();

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
    // $ANTLR end "rule__SingleFactory__Group_4__2"


    // $ANTLR start "rule__SingleFactory__Group_4__2__Impl"
    // InternalMyDsl.g:1696:1: rule__SingleFactory__Group_4__2__Impl : ( ( rule__SingleFactory__OutputAssignment_4_2 ) ) ;
    public final void rule__SingleFactory__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1700:1: ( ( ( rule__SingleFactory__OutputAssignment_4_2 ) ) )
            // InternalMyDsl.g:1701:1: ( ( rule__SingleFactory__OutputAssignment_4_2 ) )
            {
            // InternalMyDsl.g:1701:1: ( ( rule__SingleFactory__OutputAssignment_4_2 ) )
            // InternalMyDsl.g:1702:2: ( rule__SingleFactory__OutputAssignment_4_2 )
            {
             before(grammarAccess.getSingleFactoryAccess().getOutputAssignment_4_2()); 
            // InternalMyDsl.g:1703:2: ( rule__SingleFactory__OutputAssignment_4_2 )
            // InternalMyDsl.g:1703:3: rule__SingleFactory__OutputAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SingleFactory__OutputAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleFactoryAccess().getOutputAssignment_4_2()); 

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
    // $ANTLR end "rule__SingleFactory__Group_4__2__Impl"


    // $ANTLR start "rule__Resources__Group__0"
    // InternalMyDsl.g:1712:1: rule__Resources__Group__0 : rule__Resources__Group__0__Impl rule__Resources__Group__1 ;
    public final void rule__Resources__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1716:1: ( rule__Resources__Group__0__Impl rule__Resources__Group__1 )
            // InternalMyDsl.g:1717:2: rule__Resources__Group__0__Impl rule__Resources__Group__1
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
    // InternalMyDsl.g:1724:1: rule__Resources__Group__0__Impl : ( 'Resources:' ) ;
    public final void rule__Resources__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1728:1: ( ( 'Resources:' ) )
            // InternalMyDsl.g:1729:1: ( 'Resources:' )
            {
            // InternalMyDsl.g:1729:1: ( 'Resources:' )
            // InternalMyDsl.g:1730:2: 'Resources:'
            {
             before(grammarAccess.getResourcesAccess().getResourcesKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:1739:1: rule__Resources__Group__1 : rule__Resources__Group__1__Impl rule__Resources__Group__2 ;
    public final void rule__Resources__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1743:1: ( rule__Resources__Group__1__Impl rule__Resources__Group__2 )
            // InternalMyDsl.g:1744:2: rule__Resources__Group__1__Impl rule__Resources__Group__2
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
    // InternalMyDsl.g:1751:1: rule__Resources__Group__1__Impl : ( () ) ;
    public final void rule__Resources__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1755:1: ( ( () ) )
            // InternalMyDsl.g:1756:1: ( () )
            {
            // InternalMyDsl.g:1756:1: ( () )
            // InternalMyDsl.g:1757:2: ()
            {
             before(grammarAccess.getResourcesAccess().getResourcesAction_1()); 
            // InternalMyDsl.g:1758:2: ()
            // InternalMyDsl.g:1758:3: 
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
    // InternalMyDsl.g:1766:1: rule__Resources__Group__2 : rule__Resources__Group__2__Impl ;
    public final void rule__Resources__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1770:1: ( rule__Resources__Group__2__Impl )
            // InternalMyDsl.g:1771:2: rule__Resources__Group__2__Impl
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
    // InternalMyDsl.g:1777:1: rule__Resources__Group__2__Impl : ( ( rule__Resources__ResourcesAssignment_2 )* ) ;
    public final void rule__Resources__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1781:1: ( ( ( rule__Resources__ResourcesAssignment_2 )* ) )
            // InternalMyDsl.g:1782:1: ( ( rule__Resources__ResourcesAssignment_2 )* )
            {
            // InternalMyDsl.g:1782:1: ( ( rule__Resources__ResourcesAssignment_2 )* )
            // InternalMyDsl.g:1783:2: ( rule__Resources__ResourcesAssignment_2 )*
            {
             before(grammarAccess.getResourcesAccess().getResourcesAssignment_2()); 
            // InternalMyDsl.g:1784:2: ( rule__Resources__ResourcesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1784:3: rule__Resources__ResourcesAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
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


    // $ANTLR start "rule__SingleResource__Group__0"
    // InternalMyDsl.g:1793:1: rule__SingleResource__Group__0 : rule__SingleResource__Group__0__Impl rule__SingleResource__Group__1 ;
    public final void rule__SingleResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1797:1: ( rule__SingleResource__Group__0__Impl rule__SingleResource__Group__1 )
            // InternalMyDsl.g:1798:2: rule__SingleResource__Group__0__Impl rule__SingleResource__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SingleResource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleResource__Group__1();

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
    // $ANTLR end "rule__SingleResource__Group__0"


    // $ANTLR start "rule__SingleResource__Group__0__Impl"
    // InternalMyDsl.g:1805:1: rule__SingleResource__Group__0__Impl : ( ( rule__SingleResource__NameAssignment_0 ) ) ;
    public final void rule__SingleResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1809:1: ( ( ( rule__SingleResource__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1810:1: ( ( rule__SingleResource__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1810:1: ( ( rule__SingleResource__NameAssignment_0 ) )
            // InternalMyDsl.g:1811:2: ( rule__SingleResource__NameAssignment_0 )
            {
             before(grammarAccess.getSingleResourceAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1812:2: ( rule__SingleResource__NameAssignment_0 )
            // InternalMyDsl.g:1812:3: rule__SingleResource__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SingleResource__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleResourceAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__SingleResource__Group__0__Impl"


    // $ANTLR start "rule__SingleResource__Group__1"
    // InternalMyDsl.g:1820:1: rule__SingleResource__Group__1 : rule__SingleResource__Group__1__Impl rule__SingleResource__Group__2 ;
    public final void rule__SingleResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1824:1: ( rule__SingleResource__Group__1__Impl rule__SingleResource__Group__2 )
            // InternalMyDsl.g:1825:2: rule__SingleResource__Group__1__Impl rule__SingleResource__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__SingleResource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleResource__Group__2();

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
    // $ANTLR end "rule__SingleResource__Group__1"


    // $ANTLR start "rule__SingleResource__Group__1__Impl"
    // InternalMyDsl.g:1832:1: rule__SingleResource__Group__1__Impl : ( '[' ) ;
    public final void rule__SingleResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1836:1: ( ( '[' ) )
            // InternalMyDsl.g:1837:1: ( '[' )
            {
            // InternalMyDsl.g:1837:1: ( '[' )
            // InternalMyDsl.g:1838:2: '['
            {
             before(grammarAccess.getSingleResourceAccess().getLeftSquareBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSingleResourceAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__SingleResource__Group__1__Impl"


    // $ANTLR start "rule__SingleResource__Group__2"
    // InternalMyDsl.g:1847:1: rule__SingleResource__Group__2 : rule__SingleResource__Group__2__Impl rule__SingleResource__Group__3 ;
    public final void rule__SingleResource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1851:1: ( rule__SingleResource__Group__2__Impl rule__SingleResource__Group__3 )
            // InternalMyDsl.g:1852:2: rule__SingleResource__Group__2__Impl rule__SingleResource__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SingleResource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleResource__Group__3();

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
    // $ANTLR end "rule__SingleResource__Group__2"


    // $ANTLR start "rule__SingleResource__Group__2__Impl"
    // InternalMyDsl.g:1859:1: rule__SingleResource__Group__2__Impl : ( 'cost' ) ;
    public final void rule__SingleResource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1863:1: ( ( 'cost' ) )
            // InternalMyDsl.g:1864:1: ( 'cost' )
            {
            // InternalMyDsl.g:1864:1: ( 'cost' )
            // InternalMyDsl.g:1865:2: 'cost'
            {
             before(grammarAccess.getSingleResourceAccess().getCostKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSingleResourceAccess().getCostKeyword_2()); 

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
    // $ANTLR end "rule__SingleResource__Group__2__Impl"


    // $ANTLR start "rule__SingleResource__Group__3"
    // InternalMyDsl.g:1874:1: rule__SingleResource__Group__3 : rule__SingleResource__Group__3__Impl rule__SingleResource__Group__4 ;
    public final void rule__SingleResource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1878:1: ( rule__SingleResource__Group__3__Impl rule__SingleResource__Group__4 )
            // InternalMyDsl.g:1879:2: rule__SingleResource__Group__3__Impl rule__SingleResource__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__SingleResource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleResource__Group__4();

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
    // $ANTLR end "rule__SingleResource__Group__3"


    // $ANTLR start "rule__SingleResource__Group__3__Impl"
    // InternalMyDsl.g:1886:1: rule__SingleResource__Group__3__Impl : ( '->' ) ;
    public final void rule__SingleResource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1890:1: ( ( '->' ) )
            // InternalMyDsl.g:1891:1: ( '->' )
            {
            // InternalMyDsl.g:1891:1: ( '->' )
            // InternalMyDsl.g:1892:2: '->'
            {
             before(grammarAccess.getSingleResourceAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSingleResourceAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__SingleResource__Group__3__Impl"


    // $ANTLR start "rule__SingleResource__Group__4"
    // InternalMyDsl.g:1901:1: rule__SingleResource__Group__4 : rule__SingleResource__Group__4__Impl rule__SingleResource__Group__5 ;
    public final void rule__SingleResource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1905:1: ( rule__SingleResource__Group__4__Impl rule__SingleResource__Group__5 )
            // InternalMyDsl.g:1906:2: rule__SingleResource__Group__4__Impl rule__SingleResource__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__SingleResource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleResource__Group__5();

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
    // $ANTLR end "rule__SingleResource__Group__4"


    // $ANTLR start "rule__SingleResource__Group__4__Impl"
    // InternalMyDsl.g:1913:1: rule__SingleResource__Group__4__Impl : ( ( rule__SingleResource__CostAssignment_4 ) ) ;
    public final void rule__SingleResource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1917:1: ( ( ( rule__SingleResource__CostAssignment_4 ) ) )
            // InternalMyDsl.g:1918:1: ( ( rule__SingleResource__CostAssignment_4 ) )
            {
            // InternalMyDsl.g:1918:1: ( ( rule__SingleResource__CostAssignment_4 ) )
            // InternalMyDsl.g:1919:2: ( rule__SingleResource__CostAssignment_4 )
            {
             before(grammarAccess.getSingleResourceAccess().getCostAssignment_4()); 
            // InternalMyDsl.g:1920:2: ( rule__SingleResource__CostAssignment_4 )
            // InternalMyDsl.g:1920:3: rule__SingleResource__CostAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SingleResource__CostAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSingleResourceAccess().getCostAssignment_4()); 

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
    // $ANTLR end "rule__SingleResource__Group__4__Impl"


    // $ANTLR start "rule__SingleResource__Group__5"
    // InternalMyDsl.g:1928:1: rule__SingleResource__Group__5 : rule__SingleResource__Group__5__Impl ;
    public final void rule__SingleResource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1932:1: ( rule__SingleResource__Group__5__Impl )
            // InternalMyDsl.g:1933:2: rule__SingleResource__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleResource__Group__5__Impl();

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
    // $ANTLR end "rule__SingleResource__Group__5"


    // $ANTLR start "rule__SingleResource__Group__5__Impl"
    // InternalMyDsl.g:1939:1: rule__SingleResource__Group__5__Impl : ( ']' ) ;
    public final void rule__SingleResource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1943:1: ( ( ']' ) )
            // InternalMyDsl.g:1944:1: ( ']' )
            {
            // InternalMyDsl.g:1944:1: ( ']' )
            // InternalMyDsl.g:1945:2: ']'
            {
             before(grammarAccess.getSingleResourceAccess().getRightSquareBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSingleResourceAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__SingleResource__Group__5__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // InternalMyDsl.g:1955:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1959:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalMyDsl.g:1960:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__1();

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
    // $ANTLR end "rule__DOUBLE__Group__0"


    // $ANTLR start "rule__DOUBLE__Group__0__Impl"
    // InternalMyDsl.g:1967:1: rule__DOUBLE__Group__0__Impl : ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1971:1: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) )
            // InternalMyDsl.g:1972:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            {
            // InternalMyDsl.g:1972:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            // InternalMyDsl.g:1973:2: ( ( RULE_INT ) ) ( ( RULE_INT )* )
            {
            // InternalMyDsl.g:1973:2: ( ( RULE_INT ) )
            // InternalMyDsl.g:1974:3: ( RULE_INT )
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            // InternalMyDsl.g:1975:3: ( RULE_INT )
            // InternalMyDsl.g:1975:4: RULE_INT
            {
            match(input,RULE_INT,FOLLOW_23); 

            }

             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 

            }

            // InternalMyDsl.g:1978:2: ( ( RULE_INT )* )
            // InternalMyDsl.g:1979:3: ( RULE_INT )*
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            // InternalMyDsl.g:1980:3: ( RULE_INT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1980:4: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_23); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DOUBLE__Group__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group__1"
    // InternalMyDsl.g:1989:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1993:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // InternalMyDsl.g:1994:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2();

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
    // $ANTLR end "rule__DOUBLE__Group__1"


    // $ANTLR start "rule__DOUBLE__Group__1__Impl"
    // InternalMyDsl.g:2001:1: rule__DOUBLE__Group__1__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2005:1: ( ( '.' ) )
            // InternalMyDsl.g:2006:1: ( '.' )
            {
            // InternalMyDsl.g:2006:1: ( '.' )
            // InternalMyDsl.g:2007:2: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__DOUBLE__Group__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group__2"
    // InternalMyDsl.g:2016:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2020:1: ( rule__DOUBLE__Group__2__Impl )
            // InternalMyDsl.g:2021:2: rule__DOUBLE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2__Impl();

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
    // $ANTLR end "rule__DOUBLE__Group__2"


    // $ANTLR start "rule__DOUBLE__Group__2__Impl"
    // InternalMyDsl.g:2027:1: rule__DOUBLE__Group__2__Impl : ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2031:1: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) )
            // InternalMyDsl.g:2032:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            {
            // InternalMyDsl.g:2032:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            // InternalMyDsl.g:2033:2: ( ( RULE_INT ) ) ( ( RULE_INT )* )
            {
            // InternalMyDsl.g:2033:2: ( ( RULE_INT ) )
            // InternalMyDsl.g:2034:3: ( RULE_INT )
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
            // InternalMyDsl.g:2035:3: ( RULE_INT )
            // InternalMyDsl.g:2035:4: RULE_INT
            {
            match(input,RULE_INT,FOLLOW_23); 

            }

             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 

            }

            // InternalMyDsl.g:2038:2: ( ( RULE_INT )* )
            // InternalMyDsl.g:2039:3: ( RULE_INT )*
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
            // InternalMyDsl.g:2040:3: ( RULE_INT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2040:4: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_23); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__DOUBLE__Group__2__Impl"


    // $ANTLR start "rule__ClazzModel__ElementAssignment"
    // InternalMyDsl.g:2050:1: rule__ClazzModel__ElementAssignment : ( ruleElement ) ;
    public final void rule__ClazzModel__ElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2054:1: ( ( ruleElement ) )
            // InternalMyDsl.g:2055:2: ( ruleElement )
            {
            // InternalMyDsl.g:2055:2: ( ruleElement )
            // InternalMyDsl.g:2056:3: ruleElement
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
    // InternalMyDsl.g:2065:1: rule__Cities__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cities__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2069:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2070:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2070:2: ( RULE_ID )
            // InternalMyDsl.g:2071:3: RULE_ID
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


    // $ANTLR start "rule__Cities__XAssignment_5"
    // InternalMyDsl.g:2080:1: rule__Cities__XAssignment_5 : ( RULE_INT ) ;
    public final void rule__Cities__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2084:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2085:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2085:2: ( RULE_INT )
            // InternalMyDsl.g:2086:3: RULE_INT
            {
             before(grammarAccess.getCitiesAccess().getXINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getXINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Cities__XAssignment_5"


    // $ANTLR start "rule__Cities__YAssignment_8"
    // InternalMyDsl.g:2095:1: rule__Cities__YAssignment_8 : ( RULE_INT ) ;
    public final void rule__Cities__YAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2099:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2100:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2100:2: ( RULE_INT )
            // InternalMyDsl.g:2101:3: RULE_INT
            {
             before(grammarAccess.getCitiesAccess().getYINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getYINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__Cities__YAssignment_8"


    // $ANTLR start "rule__Cities__FactoryAssignment_10"
    // InternalMyDsl.g:2110:1: rule__Cities__FactoryAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Cities__FactoryAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2114:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2115:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2115:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2116:3: ( RULE_ID )
            {
             before(grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_10_0()); 
            // InternalMyDsl.g:2117:3: ( RULE_ID )
            // InternalMyDsl.g:2118:4: RULE_ID
            {
             before(grammarAccess.getCitiesAccess().getFactorySingleFactoryIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getFactorySingleFactoryIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_10_0()); 

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
    // $ANTLR end "rule__Cities__FactoryAssignment_10"


    // $ANTLR start "rule__Cities__FactoryAssignment_11_1"
    // InternalMyDsl.g:2129:1: rule__Cities__FactoryAssignment_11_1 : ( ( RULE_ID ) ) ;
    public final void rule__Cities__FactoryAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2133:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2134:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2134:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2135:3: ( RULE_ID )
            {
             before(grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_11_1_0()); 
            // InternalMyDsl.g:2136:3: ( RULE_ID )
            // InternalMyDsl.g:2137:4: RULE_ID
            {
             before(grammarAccess.getCitiesAccess().getFactorySingleFactoryIDTerminalRuleCall_11_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getFactorySingleFactoryIDTerminalRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_11_1_0()); 

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
    // $ANTLR end "rule__Cities__FactoryAssignment_11_1"


    // $ANTLR start "rule__Vehicles__VehiclesAssignment_2"
    // InternalMyDsl.g:2148:1: rule__Vehicles__VehiclesAssignment_2 : ( ruleSingleVehicle ) ;
    public final void rule__Vehicles__VehiclesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2152:1: ( ( ruleSingleVehicle ) )
            // InternalMyDsl.g:2153:2: ( ruleSingleVehicle )
            {
            // InternalMyDsl.g:2153:2: ( ruleSingleVehicle )
            // InternalMyDsl.g:2154:3: ruleSingleVehicle
            {
             before(grammarAccess.getVehiclesAccess().getVehiclesSingleVehicleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleVehicle();

            state._fsp--;

             after(grammarAccess.getVehiclesAccess().getVehiclesSingleVehicleParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__SingleVehicle__NameAssignment_0"
    // InternalMyDsl.g:2163:1: rule__SingleVehicle__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SingleVehicle__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2167:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2168:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2168:2: ( RULE_ID )
            // InternalMyDsl.g:2169:3: RULE_ID
            {
             before(grammarAccess.getSingleVehicleAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__SingleVehicle__NameAssignment_0"


    // $ANTLR start "rule__SingleVehicle__SpeedAssignment_4"
    // InternalMyDsl.g:2178:1: rule__SingleVehicle__SpeedAssignment_4 : ( RULE_INT ) ;
    public final void rule__SingleVehicle__SpeedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2182:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2183:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2183:2: ( RULE_INT )
            // InternalMyDsl.g:2184:3: RULE_INT
            {
             before(grammarAccess.getSingleVehicleAccess().getSpeedINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getSpeedINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__SingleVehicle__SpeedAssignment_4"


    // $ANTLR start "rule__SingleVehicle__LoadAssignment_8"
    // InternalMyDsl.g:2193:1: rule__SingleVehicle__LoadAssignment_8 : ( RULE_INT ) ;
    public final void rule__SingleVehicle__LoadAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2198:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2198:2: ( RULE_INT )
            // InternalMyDsl.g:2199:3: RULE_INT
            {
             before(grammarAccess.getSingleVehicleAccess().getLoadINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getLoadINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__SingleVehicle__LoadAssignment_8"


    // $ANTLR start "rule__SingleVehicle__TankSizeAssignment_12"
    // InternalMyDsl.g:2208:1: rule__SingleVehicle__TankSizeAssignment_12 : ( RULE_INT ) ;
    public final void rule__SingleVehicle__TankSizeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2213:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2213:2: ( RULE_INT )
            // InternalMyDsl.g:2214:3: RULE_INT
            {
             before(grammarAccess.getSingleVehicleAccess().getTankSizeINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getTankSizeINTTerminalRuleCall_12_0()); 

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
    // $ANTLR end "rule__SingleVehicle__TankSizeAssignment_12"


    // $ANTLR start "rule__SingleVehicle__FuelConsumptionAssignment_16"
    // InternalMyDsl.g:2223:1: rule__SingleVehicle__FuelConsumptionAssignment_16 : ( ruleDOUBLE ) ;
    public final void rule__SingleVehicle__FuelConsumptionAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2227:1: ( ( ruleDOUBLE ) )
            // InternalMyDsl.g:2228:2: ( ruleDOUBLE )
            {
            // InternalMyDsl.g:2228:2: ( ruleDOUBLE )
            // InternalMyDsl.g:2229:3: ruleDOUBLE
            {
             before(grammarAccess.getSingleVehicleAccess().getFuelConsumptionDOUBLEParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getSingleVehicleAccess().getFuelConsumptionDOUBLEParserRuleCall_16_0()); 

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
    // $ANTLR end "rule__SingleVehicle__FuelConsumptionAssignment_16"


    // $ANTLR start "rule__Factories__FactoriesAssignment_2"
    // InternalMyDsl.g:2238:1: rule__Factories__FactoriesAssignment_2 : ( ruleSingleFactory ) ;
    public final void rule__Factories__FactoriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2242:1: ( ( ruleSingleFactory ) )
            // InternalMyDsl.g:2243:2: ( ruleSingleFactory )
            {
            // InternalMyDsl.g:2243:2: ( ruleSingleFactory )
            // InternalMyDsl.g:2244:3: ruleSingleFactory
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
    // InternalMyDsl.g:2253:1: rule__SingleFactory__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SingleFactory__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2258:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2258:2: ( RULE_ID )
            // InternalMyDsl.g:2259:3: RULE_ID
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


    // $ANTLR start "rule__SingleFactory__InputAssignment_2_2"
    // InternalMyDsl.g:2268:1: rule__SingleFactory__InputAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__SingleFactory__InputAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2272:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2273:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2273:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2274:3: ( RULE_ID )
            {
             before(grammarAccess.getSingleFactoryAccess().getInputSingleResourceCrossReference_2_2_0()); 
            // InternalMyDsl.g:2275:3: ( RULE_ID )
            // InternalMyDsl.g:2276:4: RULE_ID
            {
             before(grammarAccess.getSingleFactoryAccess().getInputSingleResourceIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleFactoryAccess().getInputSingleResourceIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getSingleFactoryAccess().getInputSingleResourceCrossReference_2_2_0()); 

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
    // $ANTLR end "rule__SingleFactory__InputAssignment_2_2"


    // $ANTLR start "rule__SingleFactory__OutputAssignment_4_2"
    // InternalMyDsl.g:2287:1: rule__SingleFactory__OutputAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__SingleFactory__OutputAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2291:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2292:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2292:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2293:3: ( RULE_ID )
            {
             before(grammarAccess.getSingleFactoryAccess().getOutputSingleResourceCrossReference_4_2_0()); 
            // InternalMyDsl.g:2294:3: ( RULE_ID )
            // InternalMyDsl.g:2295:4: RULE_ID
            {
             before(grammarAccess.getSingleFactoryAccess().getOutputSingleResourceIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleFactoryAccess().getOutputSingleResourceIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getSingleFactoryAccess().getOutputSingleResourceCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__SingleFactory__OutputAssignment_4_2"


    // $ANTLR start "rule__Resources__ResourcesAssignment_2"
    // InternalMyDsl.g:2306:1: rule__Resources__ResourcesAssignment_2 : ( ruleSingleResource ) ;
    public final void rule__Resources__ResourcesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2310:1: ( ( ruleSingleResource ) )
            // InternalMyDsl.g:2311:2: ( ruleSingleResource )
            {
            // InternalMyDsl.g:2311:2: ( ruleSingleResource )
            // InternalMyDsl.g:2312:3: ruleSingleResource
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


    // $ANTLR start "rule__SingleResource__NameAssignment_0"
    // InternalMyDsl.g:2321:1: rule__SingleResource__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SingleResource__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2325:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2326:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2326:2: ( RULE_ID )
            // InternalMyDsl.g:2327:3: RULE_ID
            {
             before(grammarAccess.getSingleResourceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleResourceAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__SingleResource__NameAssignment_0"


    // $ANTLR start "rule__SingleResource__CostAssignment_4"
    // InternalMyDsl.g:2336:1: rule__SingleResource__CostAssignment_4 : ( RULE_INT ) ;
    public final void rule__SingleResource__CostAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2340:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2341:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2341:2: ( RULE_INT )
            // InternalMyDsl.g:2342:3: RULE_INT
            {
             before(grammarAccess.getSingleResourceAccess().getCostINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSingleResourceAccess().getCostINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__SingleResource__CostAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000009080802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000012L});

}