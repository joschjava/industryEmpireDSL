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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'Cities:'", "'['", "'x'", "'->'", "':'", "'y->'", "']'", "','", "'Vehicles:'", "'speed'", "'load'", "'tankSize'", "'fuelConsumption'", "'Buildings:'", "'in'", "'out'", "'Resources:'", "'cost'"
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
    // InternalMyDsl.g:62:1: ruleClazzModel : ( ( rule__ClazzModel__Group__0 ) ) ;
    public final void ruleClazzModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__ClazzModel__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__ClazzModel__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__ClazzModel__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__ClazzModel__Group__0 )
            {
             before(grammarAccess.getClazzModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__ClazzModel__Group__0 )
            // InternalMyDsl.g:69:4: rule__ClazzModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClazzModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClazzModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleBuildings"
    // InternalMyDsl.g:178:1: entryRuleBuildings : ruleBuildings EOF ;
    public final void entryRuleBuildings() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleBuildings EOF )
            // InternalMyDsl.g:180:1: ruleBuildings EOF
            {
             before(grammarAccess.getBuildingsRule()); 
            pushFollow(FOLLOW_1);
            ruleBuildings();

            state._fsp--;

             after(grammarAccess.getBuildingsRule()); 
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
    // $ANTLR end "entryRuleBuildings"


    // $ANTLR start "ruleBuildings"
    // InternalMyDsl.g:187:1: ruleBuildings : ( ( rule__Buildings__Group__0 ) ) ;
    public final void ruleBuildings() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Buildings__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Buildings__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Buildings__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Buildings__Group__0 )
            {
             before(grammarAccess.getBuildingsAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Buildings__Group__0 )
            // InternalMyDsl.g:194:4: rule__Buildings__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Buildings__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBuildingsAccess().getGroup()); 

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
    // $ANTLR end "ruleBuildings"


    // $ANTLR start "entryRuleSingleBuilding"
    // InternalMyDsl.g:203:1: entryRuleSingleBuilding : ruleSingleBuilding EOF ;
    public final void entryRuleSingleBuilding() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleSingleBuilding EOF )
            // InternalMyDsl.g:205:1: ruleSingleBuilding EOF
            {
             before(grammarAccess.getSingleBuildingRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleBuilding();

            state._fsp--;

             after(grammarAccess.getSingleBuildingRule()); 
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
    // $ANTLR end "entryRuleSingleBuilding"


    // $ANTLR start "ruleSingleBuilding"
    // InternalMyDsl.g:212:1: ruleSingleBuilding : ( ( rule__SingleBuilding__Group__0 ) ) ;
    public final void ruleSingleBuilding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__SingleBuilding__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__SingleBuilding__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__SingleBuilding__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__SingleBuilding__Group__0 )
            {
             before(grammarAccess.getSingleBuildingAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__SingleBuilding__Group__0 )
            // InternalMyDsl.g:219:4: rule__SingleBuilding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleBuilding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleBuildingAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleBuilding"


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


    // $ANTLR start "rule__Element__Alternatives"
    // InternalMyDsl.g:277:1: rule__Element__Alternatives : ( ( ruleResources ) | ( ruleBuildings ) | ( ruleVehicles ) | ( ruleCities ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( ( ruleResources ) | ( ruleBuildings ) | ( ruleVehicles ) | ( ruleCities ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 13:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:282:2: ( ruleResources )
                    {
                    // InternalMyDsl.g:282:2: ( ruleResources )
                    // InternalMyDsl.g:283:3: ruleResources
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
                    // InternalMyDsl.g:288:2: ( ruleBuildings )
                    {
                    // InternalMyDsl.g:288:2: ( ruleBuildings )
                    // InternalMyDsl.g:289:3: ruleBuildings
                    {
                     before(grammarAccess.getElementAccess().getBuildingsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBuildings();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getBuildingsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:294:2: ( ruleVehicles )
                    {
                    // InternalMyDsl.g:294:2: ( ruleVehicles )
                    // InternalMyDsl.g:295:3: ruleVehicles
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
                    // InternalMyDsl.g:300:2: ( ruleCities )
                    {
                    // InternalMyDsl.g:300:2: ( ruleCities )
                    // InternalMyDsl.g:301:3: ruleCities
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


    // $ANTLR start "rule__ClazzModel__Group__0"
    // InternalMyDsl.g:310:1: rule__ClazzModel__Group__0 : rule__ClazzModel__Group__0__Impl rule__ClazzModel__Group__1 ;
    public final void rule__ClazzModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:314:1: ( rule__ClazzModel__Group__0__Impl rule__ClazzModel__Group__1 )
            // InternalMyDsl.g:315:2: rule__ClazzModel__Group__0__Impl rule__ClazzModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ClazzModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClazzModel__Group__1();

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
    // $ANTLR end "rule__ClazzModel__Group__0"


    // $ANTLR start "rule__ClazzModel__Group__0__Impl"
    // InternalMyDsl.g:322:1: rule__ClazzModel__Group__0__Impl : ( 'project' ) ;
    public final void rule__ClazzModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:326:1: ( ( 'project' ) )
            // InternalMyDsl.g:327:1: ( 'project' )
            {
            // InternalMyDsl.g:327:1: ( 'project' )
            // InternalMyDsl.g:328:2: 'project'
            {
             before(grammarAccess.getClazzModelAccess().getProjectKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClazzModelAccess().getProjectKeyword_0()); 

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
    // $ANTLR end "rule__ClazzModel__Group__0__Impl"


    // $ANTLR start "rule__ClazzModel__Group__1"
    // InternalMyDsl.g:337:1: rule__ClazzModel__Group__1 : rule__ClazzModel__Group__1__Impl rule__ClazzModel__Group__2 ;
    public final void rule__ClazzModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:1: ( rule__ClazzModel__Group__1__Impl rule__ClazzModel__Group__2 )
            // InternalMyDsl.g:342:2: rule__ClazzModel__Group__1__Impl rule__ClazzModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ClazzModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClazzModel__Group__2();

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
    // $ANTLR end "rule__ClazzModel__Group__1"


    // $ANTLR start "rule__ClazzModel__Group__1__Impl"
    // InternalMyDsl.g:349:1: rule__ClazzModel__Group__1__Impl : ( ( rule__ClazzModel__NameAssignment_1 ) ) ;
    public final void rule__ClazzModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:353:1: ( ( ( rule__ClazzModel__NameAssignment_1 ) ) )
            // InternalMyDsl.g:354:1: ( ( rule__ClazzModel__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:354:1: ( ( rule__ClazzModel__NameAssignment_1 ) )
            // InternalMyDsl.g:355:2: ( rule__ClazzModel__NameAssignment_1 )
            {
             before(grammarAccess.getClazzModelAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:356:2: ( rule__ClazzModel__NameAssignment_1 )
            // InternalMyDsl.g:356:3: rule__ClazzModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClazzModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClazzModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ClazzModel__Group__1__Impl"


    // $ANTLR start "rule__ClazzModel__Group__2"
    // InternalMyDsl.g:364:1: rule__ClazzModel__Group__2 : rule__ClazzModel__Group__2__Impl ;
    public final void rule__ClazzModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:368:1: ( rule__ClazzModel__Group__2__Impl )
            // InternalMyDsl.g:369:2: rule__ClazzModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClazzModel__Group__2__Impl();

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
    // $ANTLR end "rule__ClazzModel__Group__2"


    // $ANTLR start "rule__ClazzModel__Group__2__Impl"
    // InternalMyDsl.g:375:1: rule__ClazzModel__Group__2__Impl : ( ( rule__ClazzModel__ElementAssignment_2 )* ) ;
    public final void rule__ClazzModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:379:1: ( ( ( rule__ClazzModel__ElementAssignment_2 )* ) )
            // InternalMyDsl.g:380:1: ( ( rule__ClazzModel__ElementAssignment_2 )* )
            {
            // InternalMyDsl.g:380:1: ( ( rule__ClazzModel__ElementAssignment_2 )* )
            // InternalMyDsl.g:381:2: ( rule__ClazzModel__ElementAssignment_2 )*
            {
             before(grammarAccess.getClazzModelAccess().getElementAssignment_2()); 
            // InternalMyDsl.g:382:2: ( rule__ClazzModel__ElementAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||LA2_0==21||LA2_0==26||LA2_0==29) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:382:3: rule__ClazzModel__ElementAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ClazzModel__ElementAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getClazzModelAccess().getElementAssignment_2()); 

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
    // $ANTLR end "rule__ClazzModel__Group__2__Impl"


    // $ANTLR start "rule__Cities__Group__0"
    // InternalMyDsl.g:391:1: rule__Cities__Group__0 : rule__Cities__Group__0__Impl rule__Cities__Group__1 ;
    public final void rule__Cities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( rule__Cities__Group__0__Impl rule__Cities__Group__1 )
            // InternalMyDsl.g:396:2: rule__Cities__Group__0__Impl rule__Cities__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:403:1: rule__Cities__Group__0__Impl : ( 'Cities:' ) ;
    public final void rule__Cities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( ( 'Cities:' ) )
            // InternalMyDsl.g:408:1: ( 'Cities:' )
            {
            // InternalMyDsl.g:408:1: ( 'Cities:' )
            // InternalMyDsl.g:409:2: 'Cities:'
            {
             before(grammarAccess.getCitiesAccess().getCitiesKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:418:1: rule__Cities__Group__1 : rule__Cities__Group__1__Impl rule__Cities__Group__2 ;
    public final void rule__Cities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( rule__Cities__Group__1__Impl rule__Cities__Group__2 )
            // InternalMyDsl.g:423:2: rule__Cities__Group__1__Impl rule__Cities__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:430:1: rule__Cities__Group__1__Impl : ( ( rule__Cities__NameAssignment_1 ) ) ;
    public final void rule__Cities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( ( ( rule__Cities__NameAssignment_1 ) ) )
            // InternalMyDsl.g:435:1: ( ( rule__Cities__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:435:1: ( ( rule__Cities__NameAssignment_1 ) )
            // InternalMyDsl.g:436:2: ( rule__Cities__NameAssignment_1 )
            {
             before(grammarAccess.getCitiesAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:437:2: ( rule__Cities__NameAssignment_1 )
            // InternalMyDsl.g:437:3: rule__Cities__NameAssignment_1
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
    // InternalMyDsl.g:445:1: rule__Cities__Group__2 : rule__Cities__Group__2__Impl rule__Cities__Group__3 ;
    public final void rule__Cities__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( rule__Cities__Group__2__Impl rule__Cities__Group__3 )
            // InternalMyDsl.g:450:2: rule__Cities__Group__2__Impl rule__Cities__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:457:1: rule__Cities__Group__2__Impl : ( '[' ) ;
    public final void rule__Cities__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( ( '[' ) )
            // InternalMyDsl.g:462:1: ( '[' )
            {
            // InternalMyDsl.g:462:1: ( '[' )
            // InternalMyDsl.g:463:2: '['
            {
             before(grammarAccess.getCitiesAccess().getLeftSquareBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:472:1: rule__Cities__Group__3 : rule__Cities__Group__3__Impl rule__Cities__Group__4 ;
    public final void rule__Cities__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( rule__Cities__Group__3__Impl rule__Cities__Group__4 )
            // InternalMyDsl.g:477:2: rule__Cities__Group__3__Impl rule__Cities__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:484:1: rule__Cities__Group__3__Impl : ( 'x' ) ;
    public final void rule__Cities__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:488:1: ( ( 'x' ) )
            // InternalMyDsl.g:489:1: ( 'x' )
            {
            // InternalMyDsl.g:489:1: ( 'x' )
            // InternalMyDsl.g:490:2: 'x'
            {
             before(grammarAccess.getCitiesAccess().getXKeyword_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:499:1: rule__Cities__Group__4 : rule__Cities__Group__4__Impl rule__Cities__Group__5 ;
    public final void rule__Cities__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( rule__Cities__Group__4__Impl rule__Cities__Group__5 )
            // InternalMyDsl.g:504:2: rule__Cities__Group__4__Impl rule__Cities__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:511:1: rule__Cities__Group__4__Impl : ( '->' ) ;
    public final void rule__Cities__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( ( '->' ) )
            // InternalMyDsl.g:516:1: ( '->' )
            {
            // InternalMyDsl.g:516:1: ( '->' )
            // InternalMyDsl.g:517:2: '->'
            {
             before(grammarAccess.getCitiesAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:526:1: rule__Cities__Group__5 : rule__Cities__Group__5__Impl rule__Cities__Group__6 ;
    public final void rule__Cities__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( rule__Cities__Group__5__Impl rule__Cities__Group__6 )
            // InternalMyDsl.g:531:2: rule__Cities__Group__5__Impl rule__Cities__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:538:1: rule__Cities__Group__5__Impl : ( ( rule__Cities__XAssignment_5 ) ) ;
    public final void rule__Cities__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:542:1: ( ( ( rule__Cities__XAssignment_5 ) ) )
            // InternalMyDsl.g:543:1: ( ( rule__Cities__XAssignment_5 ) )
            {
            // InternalMyDsl.g:543:1: ( ( rule__Cities__XAssignment_5 ) )
            // InternalMyDsl.g:544:2: ( rule__Cities__XAssignment_5 )
            {
             before(grammarAccess.getCitiesAccess().getXAssignment_5()); 
            // InternalMyDsl.g:545:2: ( rule__Cities__XAssignment_5 )
            // InternalMyDsl.g:545:3: rule__Cities__XAssignment_5
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
    // InternalMyDsl.g:553:1: rule__Cities__Group__6 : rule__Cities__Group__6__Impl rule__Cities__Group__7 ;
    public final void rule__Cities__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( rule__Cities__Group__6__Impl rule__Cities__Group__7 )
            // InternalMyDsl.g:558:2: rule__Cities__Group__6__Impl rule__Cities__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:565:1: rule__Cities__Group__6__Impl : ( ':' ) ;
    public final void rule__Cities__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( ( ':' ) )
            // InternalMyDsl.g:570:1: ( ':' )
            {
            // InternalMyDsl.g:570:1: ( ':' )
            // InternalMyDsl.g:571:2: ':'
            {
             before(grammarAccess.getCitiesAccess().getColonKeyword_6()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:580:1: rule__Cities__Group__7 : rule__Cities__Group__7__Impl rule__Cities__Group__8 ;
    public final void rule__Cities__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( rule__Cities__Group__7__Impl rule__Cities__Group__8 )
            // InternalMyDsl.g:585:2: rule__Cities__Group__7__Impl rule__Cities__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:592:1: rule__Cities__Group__7__Impl : ( 'y->' ) ;
    public final void rule__Cities__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( ( 'y->' ) )
            // InternalMyDsl.g:597:1: ( 'y->' )
            {
            // InternalMyDsl.g:597:1: ( 'y->' )
            // InternalMyDsl.g:598:2: 'y->'
            {
             before(grammarAccess.getCitiesAccess().getYKeyword_7()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:607:1: rule__Cities__Group__8 : rule__Cities__Group__8__Impl rule__Cities__Group__9 ;
    public final void rule__Cities__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( rule__Cities__Group__8__Impl rule__Cities__Group__9 )
            // InternalMyDsl.g:612:2: rule__Cities__Group__8__Impl rule__Cities__Group__9
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
    // InternalMyDsl.g:619:1: rule__Cities__Group__8__Impl : ( ( rule__Cities__YAssignment_8 ) ) ;
    public final void rule__Cities__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( ( ( rule__Cities__YAssignment_8 ) ) )
            // InternalMyDsl.g:624:1: ( ( rule__Cities__YAssignment_8 ) )
            {
            // InternalMyDsl.g:624:1: ( ( rule__Cities__YAssignment_8 ) )
            // InternalMyDsl.g:625:2: ( rule__Cities__YAssignment_8 )
            {
             before(grammarAccess.getCitiesAccess().getYAssignment_8()); 
            // InternalMyDsl.g:626:2: ( rule__Cities__YAssignment_8 )
            // InternalMyDsl.g:626:3: rule__Cities__YAssignment_8
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
    // InternalMyDsl.g:634:1: rule__Cities__Group__9 : rule__Cities__Group__9__Impl rule__Cities__Group__10 ;
    public final void rule__Cities__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( rule__Cities__Group__9__Impl rule__Cities__Group__10 )
            // InternalMyDsl.g:639:2: rule__Cities__Group__9__Impl rule__Cities__Group__10
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:646:1: rule__Cities__Group__9__Impl : ( ':' ) ;
    public final void rule__Cities__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( ( ':' ) )
            // InternalMyDsl.g:651:1: ( ':' )
            {
            // InternalMyDsl.g:651:1: ( ':' )
            // InternalMyDsl.g:652:2: ':'
            {
             before(grammarAccess.getCitiesAccess().getColonKeyword_9()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:661:1: rule__Cities__Group__10 : rule__Cities__Group__10__Impl rule__Cities__Group__11 ;
    public final void rule__Cities__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( rule__Cities__Group__10__Impl rule__Cities__Group__11 )
            // InternalMyDsl.g:666:2: rule__Cities__Group__10__Impl rule__Cities__Group__11
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:673:1: rule__Cities__Group__10__Impl : ( ( rule__Cities__FactoryAssignment_10 )* ) ;
    public final void rule__Cities__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( ( ( rule__Cities__FactoryAssignment_10 )* ) )
            // InternalMyDsl.g:678:1: ( ( rule__Cities__FactoryAssignment_10 )* )
            {
            // InternalMyDsl.g:678:1: ( ( rule__Cities__FactoryAssignment_10 )* )
            // InternalMyDsl.g:679:2: ( rule__Cities__FactoryAssignment_10 )*
            {
             before(grammarAccess.getCitiesAccess().getFactoryAssignment_10()); 
            // InternalMyDsl.g:680:2: ( rule__Cities__FactoryAssignment_10 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:680:3: rule__Cities__FactoryAssignment_10
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:688:1: rule__Cities__Group__11 : rule__Cities__Group__11__Impl rule__Cities__Group__12 ;
    public final void rule__Cities__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( rule__Cities__Group__11__Impl rule__Cities__Group__12 )
            // InternalMyDsl.g:693:2: rule__Cities__Group__11__Impl rule__Cities__Group__12
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:700:1: rule__Cities__Group__11__Impl : ( ( rule__Cities__Group_11__0 )* ) ;
    public final void rule__Cities__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:704:1: ( ( ( rule__Cities__Group_11__0 )* ) )
            // InternalMyDsl.g:705:1: ( ( rule__Cities__Group_11__0 )* )
            {
            // InternalMyDsl.g:705:1: ( ( rule__Cities__Group_11__0 )* )
            // InternalMyDsl.g:706:2: ( rule__Cities__Group_11__0 )*
            {
             before(grammarAccess.getCitiesAccess().getGroup_11()); 
            // InternalMyDsl.g:707:2: ( rule__Cities__Group_11__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:707:3: rule__Cities__Group_11__0
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:715:1: rule__Cities__Group__12 : rule__Cities__Group__12__Impl ;
    public final void rule__Cities__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( rule__Cities__Group__12__Impl )
            // InternalMyDsl.g:720:2: rule__Cities__Group__12__Impl
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
    // InternalMyDsl.g:726:1: rule__Cities__Group__12__Impl : ( ']' ) ;
    public final void rule__Cities__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( ( ']' ) )
            // InternalMyDsl.g:731:1: ( ']' )
            {
            // InternalMyDsl.g:731:1: ( ']' )
            // InternalMyDsl.g:732:2: ']'
            {
             before(grammarAccess.getCitiesAccess().getRightSquareBracketKeyword_12()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:742:1: rule__Cities__Group_11__0 : rule__Cities__Group_11__0__Impl rule__Cities__Group_11__1 ;
    public final void rule__Cities__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:746:1: ( rule__Cities__Group_11__0__Impl rule__Cities__Group_11__1 )
            // InternalMyDsl.g:747:2: rule__Cities__Group_11__0__Impl rule__Cities__Group_11__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:754:1: rule__Cities__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Cities__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:758:1: ( ( ',' ) )
            // InternalMyDsl.g:759:1: ( ',' )
            {
            // InternalMyDsl.g:759:1: ( ',' )
            // InternalMyDsl.g:760:2: ','
            {
             before(grammarAccess.getCitiesAccess().getCommaKeyword_11_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:769:1: rule__Cities__Group_11__1 : rule__Cities__Group_11__1__Impl ;
    public final void rule__Cities__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( rule__Cities__Group_11__1__Impl )
            // InternalMyDsl.g:774:2: rule__Cities__Group_11__1__Impl
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
    // InternalMyDsl.g:780:1: rule__Cities__Group_11__1__Impl : ( ( rule__Cities__FactoryAssignment_11_1 ) ) ;
    public final void rule__Cities__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( ( ( rule__Cities__FactoryAssignment_11_1 ) ) )
            // InternalMyDsl.g:785:1: ( ( rule__Cities__FactoryAssignment_11_1 ) )
            {
            // InternalMyDsl.g:785:1: ( ( rule__Cities__FactoryAssignment_11_1 ) )
            // InternalMyDsl.g:786:2: ( rule__Cities__FactoryAssignment_11_1 )
            {
             before(grammarAccess.getCitiesAccess().getFactoryAssignment_11_1()); 
            // InternalMyDsl.g:787:2: ( rule__Cities__FactoryAssignment_11_1 )
            // InternalMyDsl.g:787:3: rule__Cities__FactoryAssignment_11_1
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
    // InternalMyDsl.g:796:1: rule__Vehicles__Group__0 : rule__Vehicles__Group__0__Impl rule__Vehicles__Group__1 ;
    public final void rule__Vehicles__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( rule__Vehicles__Group__0__Impl rule__Vehicles__Group__1 )
            // InternalMyDsl.g:801:2: rule__Vehicles__Group__0__Impl rule__Vehicles__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:808:1: rule__Vehicles__Group__0__Impl : ( 'Vehicles:' ) ;
    public final void rule__Vehicles__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( ( 'Vehicles:' ) )
            // InternalMyDsl.g:813:1: ( 'Vehicles:' )
            {
            // InternalMyDsl.g:813:1: ( 'Vehicles:' )
            // InternalMyDsl.g:814:2: 'Vehicles:'
            {
             before(grammarAccess.getVehiclesAccess().getVehiclesKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:823:1: rule__Vehicles__Group__1 : rule__Vehicles__Group__1__Impl rule__Vehicles__Group__2 ;
    public final void rule__Vehicles__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( rule__Vehicles__Group__1__Impl rule__Vehicles__Group__2 )
            // InternalMyDsl.g:828:2: rule__Vehicles__Group__1__Impl rule__Vehicles__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:835:1: rule__Vehicles__Group__1__Impl : ( () ) ;
    public final void rule__Vehicles__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( () ) )
            // InternalMyDsl.g:840:1: ( () )
            {
            // InternalMyDsl.g:840:1: ( () )
            // InternalMyDsl.g:841:2: ()
            {
             before(grammarAccess.getVehiclesAccess().getVehiclesAction_1()); 
            // InternalMyDsl.g:842:2: ()
            // InternalMyDsl.g:842:3: 
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
    // InternalMyDsl.g:850:1: rule__Vehicles__Group__2 : rule__Vehicles__Group__2__Impl ;
    public final void rule__Vehicles__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( rule__Vehicles__Group__2__Impl )
            // InternalMyDsl.g:855:2: rule__Vehicles__Group__2__Impl
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
    // InternalMyDsl.g:861:1: rule__Vehicles__Group__2__Impl : ( ( rule__Vehicles__VehiclesAssignment_2 )* ) ;
    public final void rule__Vehicles__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:865:1: ( ( ( rule__Vehicles__VehiclesAssignment_2 )* ) )
            // InternalMyDsl.g:866:1: ( ( rule__Vehicles__VehiclesAssignment_2 )* )
            {
            // InternalMyDsl.g:866:1: ( ( rule__Vehicles__VehiclesAssignment_2 )* )
            // InternalMyDsl.g:867:2: ( rule__Vehicles__VehiclesAssignment_2 )*
            {
             before(grammarAccess.getVehiclesAccess().getVehiclesAssignment_2()); 
            // InternalMyDsl.g:868:2: ( rule__Vehicles__VehiclesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:868:3: rule__Vehicles__VehiclesAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:877:1: rule__SingleVehicle__Group__0 : rule__SingleVehicle__Group__0__Impl rule__SingleVehicle__Group__1 ;
    public final void rule__SingleVehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( rule__SingleVehicle__Group__0__Impl rule__SingleVehicle__Group__1 )
            // InternalMyDsl.g:882:2: rule__SingleVehicle__Group__0__Impl rule__SingleVehicle__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:889:1: rule__SingleVehicle__Group__0__Impl : ( ( rule__SingleVehicle__NameAssignment_0 ) ) ;
    public final void rule__SingleVehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( ( ( rule__SingleVehicle__NameAssignment_0 ) ) )
            // InternalMyDsl.g:894:1: ( ( rule__SingleVehicle__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:894:1: ( ( rule__SingleVehicle__NameAssignment_0 ) )
            // InternalMyDsl.g:895:2: ( rule__SingleVehicle__NameAssignment_0 )
            {
             before(grammarAccess.getSingleVehicleAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:896:2: ( rule__SingleVehicle__NameAssignment_0 )
            // InternalMyDsl.g:896:3: rule__SingleVehicle__NameAssignment_0
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
    // InternalMyDsl.g:904:1: rule__SingleVehicle__Group__1 : rule__SingleVehicle__Group__1__Impl rule__SingleVehicle__Group__2 ;
    public final void rule__SingleVehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( rule__SingleVehicle__Group__1__Impl rule__SingleVehicle__Group__2 )
            // InternalMyDsl.g:909:2: rule__SingleVehicle__Group__1__Impl rule__SingleVehicle__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:916:1: rule__SingleVehicle__Group__1__Impl : ( '[' ) ;
    public final void rule__SingleVehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( '[' ) )
            // InternalMyDsl.g:921:1: ( '[' )
            {
            // InternalMyDsl.g:921:1: ( '[' )
            // InternalMyDsl.g:922:2: '['
            {
             before(grammarAccess.getSingleVehicleAccess().getLeftSquareBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:931:1: rule__SingleVehicle__Group__2 : rule__SingleVehicle__Group__2__Impl rule__SingleVehicle__Group__3 ;
    public final void rule__SingleVehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( rule__SingleVehicle__Group__2__Impl rule__SingleVehicle__Group__3 )
            // InternalMyDsl.g:936:2: rule__SingleVehicle__Group__2__Impl rule__SingleVehicle__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:943:1: rule__SingleVehicle__Group__2__Impl : ( 'speed' ) ;
    public final void rule__SingleVehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( ( 'speed' ) )
            // InternalMyDsl.g:948:1: ( 'speed' )
            {
            // InternalMyDsl.g:948:1: ( 'speed' )
            // InternalMyDsl.g:949:2: 'speed'
            {
             before(grammarAccess.getSingleVehicleAccess().getSpeedKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:958:1: rule__SingleVehicle__Group__3 : rule__SingleVehicle__Group__3__Impl rule__SingleVehicle__Group__4 ;
    public final void rule__SingleVehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( rule__SingleVehicle__Group__3__Impl rule__SingleVehicle__Group__4 )
            // InternalMyDsl.g:963:2: rule__SingleVehicle__Group__3__Impl rule__SingleVehicle__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:970:1: rule__SingleVehicle__Group__3__Impl : ( '->' ) ;
    public final void rule__SingleVehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( ( '->' ) )
            // InternalMyDsl.g:975:1: ( '->' )
            {
            // InternalMyDsl.g:975:1: ( '->' )
            // InternalMyDsl.g:976:2: '->'
            {
             before(grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:985:1: rule__SingleVehicle__Group__4 : rule__SingleVehicle__Group__4__Impl rule__SingleVehicle__Group__5 ;
    public final void rule__SingleVehicle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( rule__SingleVehicle__Group__4__Impl rule__SingleVehicle__Group__5 )
            // InternalMyDsl.g:990:2: rule__SingleVehicle__Group__4__Impl rule__SingleVehicle__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:997:1: rule__SingleVehicle__Group__4__Impl : ( ( rule__SingleVehicle__SpeedAssignment_4 ) ) ;
    public final void rule__SingleVehicle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1001:1: ( ( ( rule__SingleVehicle__SpeedAssignment_4 ) ) )
            // InternalMyDsl.g:1002:1: ( ( rule__SingleVehicle__SpeedAssignment_4 ) )
            {
            // InternalMyDsl.g:1002:1: ( ( rule__SingleVehicle__SpeedAssignment_4 ) )
            // InternalMyDsl.g:1003:2: ( rule__SingleVehicle__SpeedAssignment_4 )
            {
             before(grammarAccess.getSingleVehicleAccess().getSpeedAssignment_4()); 
            // InternalMyDsl.g:1004:2: ( rule__SingleVehicle__SpeedAssignment_4 )
            // InternalMyDsl.g:1004:3: rule__SingleVehicle__SpeedAssignment_4
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
    // InternalMyDsl.g:1012:1: rule__SingleVehicle__Group__5 : rule__SingleVehicle__Group__5__Impl rule__SingleVehicle__Group__6 ;
    public final void rule__SingleVehicle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( rule__SingleVehicle__Group__5__Impl rule__SingleVehicle__Group__6 )
            // InternalMyDsl.g:1017:2: rule__SingleVehicle__Group__5__Impl rule__SingleVehicle__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1024:1: rule__SingleVehicle__Group__5__Impl : ( ':' ) ;
    public final void rule__SingleVehicle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( ( ':' ) )
            // InternalMyDsl.g:1029:1: ( ':' )
            {
            // InternalMyDsl.g:1029:1: ( ':' )
            // InternalMyDsl.g:1030:2: ':'
            {
             before(grammarAccess.getSingleVehicleAccess().getColonKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:1039:1: rule__SingleVehicle__Group__6 : rule__SingleVehicle__Group__6__Impl rule__SingleVehicle__Group__7 ;
    public final void rule__SingleVehicle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1043:1: ( rule__SingleVehicle__Group__6__Impl rule__SingleVehicle__Group__7 )
            // InternalMyDsl.g:1044:2: rule__SingleVehicle__Group__6__Impl rule__SingleVehicle__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1051:1: rule__SingleVehicle__Group__6__Impl : ( 'load' ) ;
    public final void rule__SingleVehicle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( ( 'load' ) )
            // InternalMyDsl.g:1056:1: ( 'load' )
            {
            // InternalMyDsl.g:1056:1: ( 'load' )
            // InternalMyDsl.g:1057:2: 'load'
            {
             before(grammarAccess.getSingleVehicleAccess().getLoadKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1066:1: rule__SingleVehicle__Group__7 : rule__SingleVehicle__Group__7__Impl rule__SingleVehicle__Group__8 ;
    public final void rule__SingleVehicle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( rule__SingleVehicle__Group__7__Impl rule__SingleVehicle__Group__8 )
            // InternalMyDsl.g:1071:2: rule__SingleVehicle__Group__7__Impl rule__SingleVehicle__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1078:1: rule__SingleVehicle__Group__7__Impl : ( '->' ) ;
    public final void rule__SingleVehicle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( ( '->' ) )
            // InternalMyDsl.g:1083:1: ( '->' )
            {
            // InternalMyDsl.g:1083:1: ( '->' )
            // InternalMyDsl.g:1084:2: '->'
            {
             before(grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_7()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:1093:1: rule__SingleVehicle__Group__8 : rule__SingleVehicle__Group__8__Impl rule__SingleVehicle__Group__9 ;
    public final void rule__SingleVehicle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( rule__SingleVehicle__Group__8__Impl rule__SingleVehicle__Group__9 )
            // InternalMyDsl.g:1098:2: rule__SingleVehicle__Group__8__Impl rule__SingleVehicle__Group__9
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1105:1: rule__SingleVehicle__Group__8__Impl : ( ( rule__SingleVehicle__LoadAssignment_8 ) ) ;
    public final void rule__SingleVehicle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1109:1: ( ( ( rule__SingleVehicle__LoadAssignment_8 ) ) )
            // InternalMyDsl.g:1110:1: ( ( rule__SingleVehicle__LoadAssignment_8 ) )
            {
            // InternalMyDsl.g:1110:1: ( ( rule__SingleVehicle__LoadAssignment_8 ) )
            // InternalMyDsl.g:1111:2: ( rule__SingleVehicle__LoadAssignment_8 )
            {
             before(grammarAccess.getSingleVehicleAccess().getLoadAssignment_8()); 
            // InternalMyDsl.g:1112:2: ( rule__SingleVehicle__LoadAssignment_8 )
            // InternalMyDsl.g:1112:3: rule__SingleVehicle__LoadAssignment_8
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
    // InternalMyDsl.g:1120:1: rule__SingleVehicle__Group__9 : rule__SingleVehicle__Group__9__Impl rule__SingleVehicle__Group__10 ;
    public final void rule__SingleVehicle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( rule__SingleVehicle__Group__9__Impl rule__SingleVehicle__Group__10 )
            // InternalMyDsl.g:1125:2: rule__SingleVehicle__Group__9__Impl rule__SingleVehicle__Group__10
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1132:1: rule__SingleVehicle__Group__9__Impl : ( ':' ) ;
    public final void rule__SingleVehicle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( ( ':' ) )
            // InternalMyDsl.g:1137:1: ( ':' )
            {
            // InternalMyDsl.g:1137:1: ( ':' )
            // InternalMyDsl.g:1138:2: ':'
            {
             before(grammarAccess.getSingleVehicleAccess().getColonKeyword_9()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:1147:1: rule__SingleVehicle__Group__10 : rule__SingleVehicle__Group__10__Impl rule__SingleVehicle__Group__11 ;
    public final void rule__SingleVehicle__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( rule__SingleVehicle__Group__10__Impl rule__SingleVehicle__Group__11 )
            // InternalMyDsl.g:1152:2: rule__SingleVehicle__Group__10__Impl rule__SingleVehicle__Group__11
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1159:1: rule__SingleVehicle__Group__10__Impl : ( 'tankSize' ) ;
    public final void rule__SingleVehicle__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1163:1: ( ( 'tankSize' ) )
            // InternalMyDsl.g:1164:1: ( 'tankSize' )
            {
            // InternalMyDsl.g:1164:1: ( 'tankSize' )
            // InternalMyDsl.g:1165:2: 'tankSize'
            {
             before(grammarAccess.getSingleVehicleAccess().getTankSizeKeyword_10()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1174:1: rule__SingleVehicle__Group__11 : rule__SingleVehicle__Group__11__Impl rule__SingleVehicle__Group__12 ;
    public final void rule__SingleVehicle__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( rule__SingleVehicle__Group__11__Impl rule__SingleVehicle__Group__12 )
            // InternalMyDsl.g:1179:2: rule__SingleVehicle__Group__11__Impl rule__SingleVehicle__Group__12
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1186:1: rule__SingleVehicle__Group__11__Impl : ( '->' ) ;
    public final void rule__SingleVehicle__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1190:1: ( ( '->' ) )
            // InternalMyDsl.g:1191:1: ( '->' )
            {
            // InternalMyDsl.g:1191:1: ( '->' )
            // InternalMyDsl.g:1192:2: '->'
            {
             before(grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_11()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:1201:1: rule__SingleVehicle__Group__12 : rule__SingleVehicle__Group__12__Impl rule__SingleVehicle__Group__13 ;
    public final void rule__SingleVehicle__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( rule__SingleVehicle__Group__12__Impl rule__SingleVehicle__Group__13 )
            // InternalMyDsl.g:1206:2: rule__SingleVehicle__Group__12__Impl rule__SingleVehicle__Group__13
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1213:1: rule__SingleVehicle__Group__12__Impl : ( ( rule__SingleVehicle__TankSizeAssignment_12 ) ) ;
    public final void rule__SingleVehicle__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1217:1: ( ( ( rule__SingleVehicle__TankSizeAssignment_12 ) ) )
            // InternalMyDsl.g:1218:1: ( ( rule__SingleVehicle__TankSizeAssignment_12 ) )
            {
            // InternalMyDsl.g:1218:1: ( ( rule__SingleVehicle__TankSizeAssignment_12 ) )
            // InternalMyDsl.g:1219:2: ( rule__SingleVehicle__TankSizeAssignment_12 )
            {
             before(grammarAccess.getSingleVehicleAccess().getTankSizeAssignment_12()); 
            // InternalMyDsl.g:1220:2: ( rule__SingleVehicle__TankSizeAssignment_12 )
            // InternalMyDsl.g:1220:3: rule__SingleVehicle__TankSizeAssignment_12
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
    // InternalMyDsl.g:1228:1: rule__SingleVehicle__Group__13 : rule__SingleVehicle__Group__13__Impl rule__SingleVehicle__Group__14 ;
    public final void rule__SingleVehicle__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( rule__SingleVehicle__Group__13__Impl rule__SingleVehicle__Group__14 )
            // InternalMyDsl.g:1233:2: rule__SingleVehicle__Group__13__Impl rule__SingleVehicle__Group__14
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1240:1: rule__SingleVehicle__Group__13__Impl : ( ':' ) ;
    public final void rule__SingleVehicle__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1244:1: ( ( ':' ) )
            // InternalMyDsl.g:1245:1: ( ':' )
            {
            // InternalMyDsl.g:1245:1: ( ':' )
            // InternalMyDsl.g:1246:2: ':'
            {
             before(grammarAccess.getSingleVehicleAccess().getColonKeyword_13()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:1255:1: rule__SingleVehicle__Group__14 : rule__SingleVehicle__Group__14__Impl rule__SingleVehicle__Group__15 ;
    public final void rule__SingleVehicle__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( rule__SingleVehicle__Group__14__Impl rule__SingleVehicle__Group__15 )
            // InternalMyDsl.g:1260:2: rule__SingleVehicle__Group__14__Impl rule__SingleVehicle__Group__15
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1267:1: rule__SingleVehicle__Group__14__Impl : ( 'fuelConsumption' ) ;
    public final void rule__SingleVehicle__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1271:1: ( ( 'fuelConsumption' ) )
            // InternalMyDsl.g:1272:1: ( 'fuelConsumption' )
            {
            // InternalMyDsl.g:1272:1: ( 'fuelConsumption' )
            // InternalMyDsl.g:1273:2: 'fuelConsumption'
            {
             before(grammarAccess.getSingleVehicleAccess().getFuelConsumptionKeyword_14()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1282:1: rule__SingleVehicle__Group__15 : rule__SingleVehicle__Group__15__Impl rule__SingleVehicle__Group__16 ;
    public final void rule__SingleVehicle__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( rule__SingleVehicle__Group__15__Impl rule__SingleVehicle__Group__16 )
            // InternalMyDsl.g:1287:2: rule__SingleVehicle__Group__15__Impl rule__SingleVehicle__Group__16
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1294:1: rule__SingleVehicle__Group__15__Impl : ( '->' ) ;
    public final void rule__SingleVehicle__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( ( '->' ) )
            // InternalMyDsl.g:1299:1: ( '->' )
            {
            // InternalMyDsl.g:1299:1: ( '->' )
            // InternalMyDsl.g:1300:2: '->'
            {
             before(grammarAccess.getSingleVehicleAccess().getHyphenMinusGreaterThanSignKeyword_15()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:1309:1: rule__SingleVehicle__Group__16 : rule__SingleVehicle__Group__16__Impl rule__SingleVehicle__Group__17 ;
    public final void rule__SingleVehicle__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( rule__SingleVehicle__Group__16__Impl rule__SingleVehicle__Group__17 )
            // InternalMyDsl.g:1314:2: rule__SingleVehicle__Group__16__Impl rule__SingleVehicle__Group__17
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1321:1: rule__SingleVehicle__Group__16__Impl : ( ( rule__SingleVehicle__FuelConsumptionAssignment_16 ) ) ;
    public final void rule__SingleVehicle__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( ( ( rule__SingleVehicle__FuelConsumptionAssignment_16 ) ) )
            // InternalMyDsl.g:1326:1: ( ( rule__SingleVehicle__FuelConsumptionAssignment_16 ) )
            {
            // InternalMyDsl.g:1326:1: ( ( rule__SingleVehicle__FuelConsumptionAssignment_16 ) )
            // InternalMyDsl.g:1327:2: ( rule__SingleVehicle__FuelConsumptionAssignment_16 )
            {
             before(grammarAccess.getSingleVehicleAccess().getFuelConsumptionAssignment_16()); 
            // InternalMyDsl.g:1328:2: ( rule__SingleVehicle__FuelConsumptionAssignment_16 )
            // InternalMyDsl.g:1328:3: rule__SingleVehicle__FuelConsumptionAssignment_16
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
    // InternalMyDsl.g:1336:1: rule__SingleVehicle__Group__17 : rule__SingleVehicle__Group__17__Impl ;
    public final void rule__SingleVehicle__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( rule__SingleVehicle__Group__17__Impl )
            // InternalMyDsl.g:1341:2: rule__SingleVehicle__Group__17__Impl
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
    // InternalMyDsl.g:1347:1: rule__SingleVehicle__Group__17__Impl : ( ']' ) ;
    public final void rule__SingleVehicle__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( ( ']' ) )
            // InternalMyDsl.g:1352:1: ( ']' )
            {
            // InternalMyDsl.g:1352:1: ( ']' )
            // InternalMyDsl.g:1353:2: ']'
            {
             before(grammarAccess.getSingleVehicleAccess().getRightSquareBracketKeyword_17()); 
            match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__Buildings__Group__0"
    // InternalMyDsl.g:1363:1: rule__Buildings__Group__0 : rule__Buildings__Group__0__Impl rule__Buildings__Group__1 ;
    public final void rule__Buildings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( rule__Buildings__Group__0__Impl rule__Buildings__Group__1 )
            // InternalMyDsl.g:1368:2: rule__Buildings__Group__0__Impl rule__Buildings__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Buildings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Buildings__Group__1();

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
    // $ANTLR end "rule__Buildings__Group__0"


    // $ANTLR start "rule__Buildings__Group__0__Impl"
    // InternalMyDsl.g:1375:1: rule__Buildings__Group__0__Impl : ( 'Buildings:' ) ;
    public final void rule__Buildings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( ( 'Buildings:' ) )
            // InternalMyDsl.g:1380:1: ( 'Buildings:' )
            {
            // InternalMyDsl.g:1380:1: ( 'Buildings:' )
            // InternalMyDsl.g:1381:2: 'Buildings:'
            {
             before(grammarAccess.getBuildingsAccess().getBuildingsKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBuildingsAccess().getBuildingsKeyword_0()); 

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
    // $ANTLR end "rule__Buildings__Group__0__Impl"


    // $ANTLR start "rule__Buildings__Group__1"
    // InternalMyDsl.g:1390:1: rule__Buildings__Group__1 : rule__Buildings__Group__1__Impl rule__Buildings__Group__2 ;
    public final void rule__Buildings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( rule__Buildings__Group__1__Impl rule__Buildings__Group__2 )
            // InternalMyDsl.g:1395:2: rule__Buildings__Group__1__Impl rule__Buildings__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Buildings__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Buildings__Group__2();

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
    // $ANTLR end "rule__Buildings__Group__1"


    // $ANTLR start "rule__Buildings__Group__1__Impl"
    // InternalMyDsl.g:1402:1: rule__Buildings__Group__1__Impl : ( () ) ;
    public final void rule__Buildings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1406:1: ( ( () ) )
            // InternalMyDsl.g:1407:1: ( () )
            {
            // InternalMyDsl.g:1407:1: ( () )
            // InternalMyDsl.g:1408:2: ()
            {
             before(grammarAccess.getBuildingsAccess().getFactoriesAction_1()); 
            // InternalMyDsl.g:1409:2: ()
            // InternalMyDsl.g:1409:3: 
            {
            }

             after(grammarAccess.getBuildingsAccess().getFactoriesAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Buildings__Group__1__Impl"


    // $ANTLR start "rule__Buildings__Group__2"
    // InternalMyDsl.g:1417:1: rule__Buildings__Group__2 : rule__Buildings__Group__2__Impl ;
    public final void rule__Buildings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1421:1: ( rule__Buildings__Group__2__Impl )
            // InternalMyDsl.g:1422:2: rule__Buildings__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Buildings__Group__2__Impl();

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
    // $ANTLR end "rule__Buildings__Group__2"


    // $ANTLR start "rule__Buildings__Group__2__Impl"
    // InternalMyDsl.g:1428:1: rule__Buildings__Group__2__Impl : ( ( rule__Buildings__FactoriesAssignment_2 )* ) ;
    public final void rule__Buildings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1432:1: ( ( ( rule__Buildings__FactoriesAssignment_2 )* ) )
            // InternalMyDsl.g:1433:1: ( ( rule__Buildings__FactoriesAssignment_2 )* )
            {
            // InternalMyDsl.g:1433:1: ( ( rule__Buildings__FactoriesAssignment_2 )* )
            // InternalMyDsl.g:1434:2: ( rule__Buildings__FactoriesAssignment_2 )*
            {
             before(grammarAccess.getBuildingsAccess().getFactoriesAssignment_2()); 
            // InternalMyDsl.g:1435:2: ( rule__Buildings__FactoriesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1435:3: rule__Buildings__FactoriesAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Buildings__FactoriesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getBuildingsAccess().getFactoriesAssignment_2()); 

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
    // $ANTLR end "rule__Buildings__Group__2__Impl"


    // $ANTLR start "rule__SingleBuilding__Group__0"
    // InternalMyDsl.g:1444:1: rule__SingleBuilding__Group__0 : rule__SingleBuilding__Group__0__Impl rule__SingleBuilding__Group__1 ;
    public final void rule__SingleBuilding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( rule__SingleBuilding__Group__0__Impl rule__SingleBuilding__Group__1 )
            // InternalMyDsl.g:1449:2: rule__SingleBuilding__Group__0__Impl rule__SingleBuilding__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SingleBuilding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleBuilding__Group__1();

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
    // $ANTLR end "rule__SingleBuilding__Group__0"


    // $ANTLR start "rule__SingleBuilding__Group__0__Impl"
    // InternalMyDsl.g:1456:1: rule__SingleBuilding__Group__0__Impl : ( ( rule__SingleBuilding__NameAssignment_0 ) ) ;
    public final void rule__SingleBuilding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( ( ( rule__SingleBuilding__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1461:1: ( ( rule__SingleBuilding__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1461:1: ( ( rule__SingleBuilding__NameAssignment_0 ) )
            // InternalMyDsl.g:1462:2: ( rule__SingleBuilding__NameAssignment_0 )
            {
             before(grammarAccess.getSingleBuildingAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1463:2: ( rule__SingleBuilding__NameAssignment_0 )
            // InternalMyDsl.g:1463:3: rule__SingleBuilding__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SingleBuilding__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleBuildingAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__SingleBuilding__Group__0__Impl"


    // $ANTLR start "rule__SingleBuilding__Group__1"
    // InternalMyDsl.g:1471:1: rule__SingleBuilding__Group__1 : rule__SingleBuilding__Group__1__Impl rule__SingleBuilding__Group__2 ;
    public final void rule__SingleBuilding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( rule__SingleBuilding__Group__1__Impl rule__SingleBuilding__Group__2 )
            // InternalMyDsl.g:1476:2: rule__SingleBuilding__Group__1__Impl rule__SingleBuilding__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__SingleBuilding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleBuilding__Group__2();

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
    // $ANTLR end "rule__SingleBuilding__Group__1"


    // $ANTLR start "rule__SingleBuilding__Group__1__Impl"
    // InternalMyDsl.g:1483:1: rule__SingleBuilding__Group__1__Impl : ( '[' ) ;
    public final void rule__SingleBuilding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( ( '[' ) )
            // InternalMyDsl.g:1488:1: ( '[' )
            {
            // InternalMyDsl.g:1488:1: ( '[' )
            // InternalMyDsl.g:1489:2: '['
            {
             before(grammarAccess.getSingleBuildingAccess().getLeftSquareBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSingleBuildingAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__SingleBuilding__Group__1__Impl"


    // $ANTLR start "rule__SingleBuilding__Group__2"
    // InternalMyDsl.g:1498:1: rule__SingleBuilding__Group__2 : rule__SingleBuilding__Group__2__Impl rule__SingleBuilding__Group__3 ;
    public final void rule__SingleBuilding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( rule__SingleBuilding__Group__2__Impl rule__SingleBuilding__Group__3 )
            // InternalMyDsl.g:1503:2: rule__SingleBuilding__Group__2__Impl rule__SingleBuilding__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__SingleBuilding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleBuilding__Group__3();

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
    // $ANTLR end "rule__SingleBuilding__Group__2"


    // $ANTLR start "rule__SingleBuilding__Group__2__Impl"
    // InternalMyDsl.g:1510:1: rule__SingleBuilding__Group__2__Impl : ( ( rule__SingleBuilding__Group_2__0 )? ) ;
    public final void rule__SingleBuilding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( ( ( rule__SingleBuilding__Group_2__0 )? ) )
            // InternalMyDsl.g:1515:1: ( ( rule__SingleBuilding__Group_2__0 )? )
            {
            // InternalMyDsl.g:1515:1: ( ( rule__SingleBuilding__Group_2__0 )? )
            // InternalMyDsl.g:1516:2: ( rule__SingleBuilding__Group_2__0 )?
            {
             before(grammarAccess.getSingleBuildingAccess().getGroup_2()); 
            // InternalMyDsl.g:1517:2: ( rule__SingleBuilding__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1517:3: rule__SingleBuilding__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleBuilding__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleBuildingAccess().getGroup_2()); 

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
    // $ANTLR end "rule__SingleBuilding__Group__2__Impl"


    // $ANTLR start "rule__SingleBuilding__Group__3"
    // InternalMyDsl.g:1525:1: rule__SingleBuilding__Group__3 : rule__SingleBuilding__Group__3__Impl rule__SingleBuilding__Group__4 ;
    public final void rule__SingleBuilding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( rule__SingleBuilding__Group__3__Impl rule__SingleBuilding__Group__4 )
            // InternalMyDsl.g:1530:2: rule__SingleBuilding__Group__3__Impl rule__SingleBuilding__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__SingleBuilding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleBuilding__Group__4();

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
    // $ANTLR end "rule__SingleBuilding__Group__3"


    // $ANTLR start "rule__SingleBuilding__Group__3__Impl"
    // InternalMyDsl.g:1537:1: rule__SingleBuilding__Group__3__Impl : ( ':' ) ;
    public final void rule__SingleBuilding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1541:1: ( ( ':' ) )
            // InternalMyDsl.g:1542:1: ( ':' )
            {
            // InternalMyDsl.g:1542:1: ( ':' )
            // InternalMyDsl.g:1543:2: ':'
            {
             before(grammarAccess.getSingleBuildingAccess().getColonKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSingleBuildingAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__SingleBuilding__Group__3__Impl"


    // $ANTLR start "rule__SingleBuilding__Group__4"
    // InternalMyDsl.g:1552:1: rule__SingleBuilding__Group__4 : rule__SingleBuilding__Group__4__Impl rule__SingleBuilding__Group__5 ;
    public final void rule__SingleBuilding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( rule__SingleBuilding__Group__4__Impl rule__SingleBuilding__Group__5 )
            // InternalMyDsl.g:1557:2: rule__SingleBuilding__Group__4__Impl rule__SingleBuilding__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__SingleBuilding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleBuilding__Group__5();

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
    // $ANTLR end "rule__SingleBuilding__Group__4"


    // $ANTLR start "rule__SingleBuilding__Group__4__Impl"
    // InternalMyDsl.g:1564:1: rule__SingleBuilding__Group__4__Impl : ( ( rule__SingleBuilding__Group_4__0 )? ) ;
    public final void rule__SingleBuilding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( ( ( rule__SingleBuilding__Group_4__0 )? ) )
            // InternalMyDsl.g:1569:1: ( ( rule__SingleBuilding__Group_4__0 )? )
            {
            // InternalMyDsl.g:1569:1: ( ( rule__SingleBuilding__Group_4__0 )? )
            // InternalMyDsl.g:1570:2: ( rule__SingleBuilding__Group_4__0 )?
            {
             before(grammarAccess.getSingleBuildingAccess().getGroup_4()); 
            // InternalMyDsl.g:1571:2: ( rule__SingleBuilding__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1571:3: rule__SingleBuilding__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleBuilding__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleBuildingAccess().getGroup_4()); 

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
    // $ANTLR end "rule__SingleBuilding__Group__4__Impl"


    // $ANTLR start "rule__SingleBuilding__Group__5"
    // InternalMyDsl.g:1579:1: rule__SingleBuilding__Group__5 : rule__SingleBuilding__Group__5__Impl ;
    public final void rule__SingleBuilding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( rule__SingleBuilding__Group__5__Impl )
            // InternalMyDsl.g:1584:2: rule__SingleBuilding__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleBuilding__Group__5__Impl();

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
    // $ANTLR end "rule__SingleBuilding__Group__5"


    // $ANTLR start "rule__SingleBuilding__Group__5__Impl"
    // InternalMyDsl.g:1590:1: rule__SingleBuilding__Group__5__Impl : ( ']' ) ;
    public final void rule__SingleBuilding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1594:1: ( ( ']' ) )
            // InternalMyDsl.g:1595:1: ( ']' )
            {
            // InternalMyDsl.g:1595:1: ( ']' )
            // InternalMyDsl.g:1596:2: ']'
            {
             before(grammarAccess.getSingleBuildingAccess().getRightSquareBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSingleBuildingAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__SingleBuilding__Group__5__Impl"


    // $ANTLR start "rule__SingleBuilding__Group_2__0"
    // InternalMyDsl.g:1606:1: rule__SingleBuilding__Group_2__0 : rule__SingleBuilding__Group_2__0__Impl rule__SingleBuilding__Group_2__1 ;
    public final void rule__SingleBuilding__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( rule__SingleBuilding__Group_2__0__Impl rule__SingleBuilding__Group_2__1 )
            // InternalMyDsl.g:1611:2: rule__SingleBuilding__Group_2__0__Impl rule__SingleBuilding__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__SingleBuilding__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleBuilding__Group_2__1();

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
    // $ANTLR end "rule__SingleBuilding__Group_2__0"


    // $ANTLR start "rule__SingleBuilding__Group_2__0__Impl"
    // InternalMyDsl.g:1618:1: rule__SingleBuilding__Group_2__0__Impl : ( 'in' ) ;
    public final void rule__SingleBuilding__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1622:1: ( ( 'in' ) )
            // InternalMyDsl.g:1623:1: ( 'in' )
            {
            // InternalMyDsl.g:1623:1: ( 'in' )
            // InternalMyDsl.g:1624:2: 'in'
            {
             before(grammarAccess.getSingleBuildingAccess().getInKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSingleBuildingAccess().getInKeyword_2_0()); 

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
    // $ANTLR end "rule__SingleBuilding__Group_2__0__Impl"


    // $ANTLR start "rule__SingleBuilding__Group_2__1"
    // InternalMyDsl.g:1633:1: rule__SingleBuilding__Group_2__1 : rule__SingleBuilding__Group_2__1__Impl rule__SingleBuilding__Group_2__2 ;
    public final void rule__SingleBuilding__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1637:1: ( rule__SingleBuilding__Group_2__1__Impl rule__SingleBuilding__Group_2__2 )
            // InternalMyDsl.g:1638:2: rule__SingleBuilding__Group_2__1__Impl rule__SingleBuilding__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__SingleBuilding__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleBuilding__Group_2__2();

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
    // $ANTLR end "rule__SingleBuilding__Group_2__1"


    // $ANTLR start "rule__SingleBuilding__Group_2__1__Impl"
    // InternalMyDsl.g:1645:1: rule__SingleBuilding__Group_2__1__Impl : ( '->' ) ;
    public final void rule__SingleBuilding__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1649:1: ( ( '->' ) )
            // InternalMyDsl.g:1650:1: ( '->' )
            {
            // InternalMyDsl.g:1650:1: ( '->' )
            // InternalMyDsl.g:1651:2: '->'
            {
             before(grammarAccess.getSingleBuildingAccess().getHyphenMinusGreaterThanSignKeyword_2_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSingleBuildingAccess().getHyphenMinusGreaterThanSignKeyword_2_1()); 

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
    // $ANTLR end "rule__SingleBuilding__Group_2__1__Impl"


    // $ANTLR start "rule__SingleBuilding__Group_2__2"
    // InternalMyDsl.g:1660:1: rule__SingleBuilding__Group_2__2 : rule__SingleBuilding__Group_2__2__Impl ;
    public final void rule__SingleBuilding__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( rule__SingleBuilding__Group_2__2__Impl )
            // InternalMyDsl.g:1665:2: rule__SingleBuilding__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleBuilding__Group_2__2__Impl();

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
    // $ANTLR end "rule__SingleBuilding__Group_2__2"


    // $ANTLR start "rule__SingleBuilding__Group_2__2__Impl"
    // InternalMyDsl.g:1671:1: rule__SingleBuilding__Group_2__2__Impl : ( ( rule__SingleBuilding__InputAssignment_2_2 ) ) ;
    public final void rule__SingleBuilding__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1675:1: ( ( ( rule__SingleBuilding__InputAssignment_2_2 ) ) )
            // InternalMyDsl.g:1676:1: ( ( rule__SingleBuilding__InputAssignment_2_2 ) )
            {
            // InternalMyDsl.g:1676:1: ( ( rule__SingleBuilding__InputAssignment_2_2 ) )
            // InternalMyDsl.g:1677:2: ( rule__SingleBuilding__InputAssignment_2_2 )
            {
             before(grammarAccess.getSingleBuildingAccess().getInputAssignment_2_2()); 
            // InternalMyDsl.g:1678:2: ( rule__SingleBuilding__InputAssignment_2_2 )
            // InternalMyDsl.g:1678:3: rule__SingleBuilding__InputAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SingleBuilding__InputAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleBuildingAccess().getInputAssignment_2_2()); 

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
    // $ANTLR end "rule__SingleBuilding__Group_2__2__Impl"


    // $ANTLR start "rule__SingleBuilding__Group_4__0"
    // InternalMyDsl.g:1687:1: rule__SingleBuilding__Group_4__0 : rule__SingleBuilding__Group_4__0__Impl rule__SingleBuilding__Group_4__1 ;
    public final void rule__SingleBuilding__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1691:1: ( rule__SingleBuilding__Group_4__0__Impl rule__SingleBuilding__Group_4__1 )
            // InternalMyDsl.g:1692:2: rule__SingleBuilding__Group_4__0__Impl rule__SingleBuilding__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__SingleBuilding__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleBuilding__Group_4__1();

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
    // $ANTLR end "rule__SingleBuilding__Group_4__0"


    // $ANTLR start "rule__SingleBuilding__Group_4__0__Impl"
    // InternalMyDsl.g:1699:1: rule__SingleBuilding__Group_4__0__Impl : ( 'out' ) ;
    public final void rule__SingleBuilding__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1703:1: ( ( 'out' ) )
            // InternalMyDsl.g:1704:1: ( 'out' )
            {
            // InternalMyDsl.g:1704:1: ( 'out' )
            // InternalMyDsl.g:1705:2: 'out'
            {
             before(grammarAccess.getSingleBuildingAccess().getOutKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSingleBuildingAccess().getOutKeyword_4_0()); 

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
    // $ANTLR end "rule__SingleBuilding__Group_4__0__Impl"


    // $ANTLR start "rule__SingleBuilding__Group_4__1"
    // InternalMyDsl.g:1714:1: rule__SingleBuilding__Group_4__1 : rule__SingleBuilding__Group_4__1__Impl rule__SingleBuilding__Group_4__2 ;
    public final void rule__SingleBuilding__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( rule__SingleBuilding__Group_4__1__Impl rule__SingleBuilding__Group_4__2 )
            // InternalMyDsl.g:1719:2: rule__SingleBuilding__Group_4__1__Impl rule__SingleBuilding__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__SingleBuilding__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleBuilding__Group_4__2();

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
    // $ANTLR end "rule__SingleBuilding__Group_4__1"


    // $ANTLR start "rule__SingleBuilding__Group_4__1__Impl"
    // InternalMyDsl.g:1726:1: rule__SingleBuilding__Group_4__1__Impl : ( '->' ) ;
    public final void rule__SingleBuilding__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1730:1: ( ( '->' ) )
            // InternalMyDsl.g:1731:1: ( '->' )
            {
            // InternalMyDsl.g:1731:1: ( '->' )
            // InternalMyDsl.g:1732:2: '->'
            {
             before(grammarAccess.getSingleBuildingAccess().getHyphenMinusGreaterThanSignKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSingleBuildingAccess().getHyphenMinusGreaterThanSignKeyword_4_1()); 

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
    // $ANTLR end "rule__SingleBuilding__Group_4__1__Impl"


    // $ANTLR start "rule__SingleBuilding__Group_4__2"
    // InternalMyDsl.g:1741:1: rule__SingleBuilding__Group_4__2 : rule__SingleBuilding__Group_4__2__Impl ;
    public final void rule__SingleBuilding__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( rule__SingleBuilding__Group_4__2__Impl )
            // InternalMyDsl.g:1746:2: rule__SingleBuilding__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleBuilding__Group_4__2__Impl();

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
    // $ANTLR end "rule__SingleBuilding__Group_4__2"


    // $ANTLR start "rule__SingleBuilding__Group_4__2__Impl"
    // InternalMyDsl.g:1752:1: rule__SingleBuilding__Group_4__2__Impl : ( ( rule__SingleBuilding__OutputAssignment_4_2 ) ) ;
    public final void rule__SingleBuilding__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1756:1: ( ( ( rule__SingleBuilding__OutputAssignment_4_2 ) ) )
            // InternalMyDsl.g:1757:1: ( ( rule__SingleBuilding__OutputAssignment_4_2 ) )
            {
            // InternalMyDsl.g:1757:1: ( ( rule__SingleBuilding__OutputAssignment_4_2 ) )
            // InternalMyDsl.g:1758:2: ( rule__SingleBuilding__OutputAssignment_4_2 )
            {
             before(grammarAccess.getSingleBuildingAccess().getOutputAssignment_4_2()); 
            // InternalMyDsl.g:1759:2: ( rule__SingleBuilding__OutputAssignment_4_2 )
            // InternalMyDsl.g:1759:3: rule__SingleBuilding__OutputAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SingleBuilding__OutputAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleBuildingAccess().getOutputAssignment_4_2()); 

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
    // $ANTLR end "rule__SingleBuilding__Group_4__2__Impl"


    // $ANTLR start "rule__Resources__Group__0"
    // InternalMyDsl.g:1768:1: rule__Resources__Group__0 : rule__Resources__Group__0__Impl rule__Resources__Group__1 ;
    public final void rule__Resources__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( rule__Resources__Group__0__Impl rule__Resources__Group__1 )
            // InternalMyDsl.g:1773:2: rule__Resources__Group__0__Impl rule__Resources__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1780:1: rule__Resources__Group__0__Impl : ( 'Resources:' ) ;
    public final void rule__Resources__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1784:1: ( ( 'Resources:' ) )
            // InternalMyDsl.g:1785:1: ( 'Resources:' )
            {
            // InternalMyDsl.g:1785:1: ( 'Resources:' )
            // InternalMyDsl.g:1786:2: 'Resources:'
            {
             before(grammarAccess.getResourcesAccess().getResourcesKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1795:1: rule__Resources__Group__1 : rule__Resources__Group__1__Impl rule__Resources__Group__2 ;
    public final void rule__Resources__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1799:1: ( rule__Resources__Group__1__Impl rule__Resources__Group__2 )
            // InternalMyDsl.g:1800:2: rule__Resources__Group__1__Impl rule__Resources__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1807:1: rule__Resources__Group__1__Impl : ( () ) ;
    public final void rule__Resources__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1811:1: ( ( () ) )
            // InternalMyDsl.g:1812:1: ( () )
            {
            // InternalMyDsl.g:1812:1: ( () )
            // InternalMyDsl.g:1813:2: ()
            {
             before(grammarAccess.getResourcesAccess().getResourcesAction_1()); 
            // InternalMyDsl.g:1814:2: ()
            // InternalMyDsl.g:1814:3: 
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
    // InternalMyDsl.g:1822:1: rule__Resources__Group__2 : rule__Resources__Group__2__Impl ;
    public final void rule__Resources__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( rule__Resources__Group__2__Impl )
            // InternalMyDsl.g:1827:2: rule__Resources__Group__2__Impl
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
    // InternalMyDsl.g:1833:1: rule__Resources__Group__2__Impl : ( ( rule__Resources__ResourcesAssignment_2 )* ) ;
    public final void rule__Resources__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1837:1: ( ( ( rule__Resources__ResourcesAssignment_2 )* ) )
            // InternalMyDsl.g:1838:1: ( ( rule__Resources__ResourcesAssignment_2 )* )
            {
            // InternalMyDsl.g:1838:1: ( ( rule__Resources__ResourcesAssignment_2 )* )
            // InternalMyDsl.g:1839:2: ( rule__Resources__ResourcesAssignment_2 )*
            {
             before(grammarAccess.getResourcesAccess().getResourcesAssignment_2()); 
            // InternalMyDsl.g:1840:2: ( rule__Resources__ResourcesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1840:3: rule__Resources__ResourcesAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1849:1: rule__SingleResource__Group__0 : rule__SingleResource__Group__0__Impl rule__SingleResource__Group__1 ;
    public final void rule__SingleResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( rule__SingleResource__Group__0__Impl rule__SingleResource__Group__1 )
            // InternalMyDsl.g:1854:2: rule__SingleResource__Group__0__Impl rule__SingleResource__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1861:1: rule__SingleResource__Group__0__Impl : ( ( rule__SingleResource__NameAssignment_0 ) ) ;
    public final void rule__SingleResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1865:1: ( ( ( rule__SingleResource__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1866:1: ( ( rule__SingleResource__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1866:1: ( ( rule__SingleResource__NameAssignment_0 ) )
            // InternalMyDsl.g:1867:2: ( rule__SingleResource__NameAssignment_0 )
            {
             before(grammarAccess.getSingleResourceAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1868:2: ( rule__SingleResource__NameAssignment_0 )
            // InternalMyDsl.g:1868:3: rule__SingleResource__NameAssignment_0
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
    // InternalMyDsl.g:1876:1: rule__SingleResource__Group__1 : rule__SingleResource__Group__1__Impl rule__SingleResource__Group__2 ;
    public final void rule__SingleResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( rule__SingleResource__Group__1__Impl rule__SingleResource__Group__2 )
            // InternalMyDsl.g:1881:2: rule__SingleResource__Group__1__Impl rule__SingleResource__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:1888:1: rule__SingleResource__Group__1__Impl : ( '[' ) ;
    public final void rule__SingleResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1892:1: ( ( '[' ) )
            // InternalMyDsl.g:1893:1: ( '[' )
            {
            // InternalMyDsl.g:1893:1: ( '[' )
            // InternalMyDsl.g:1894:2: '['
            {
             before(grammarAccess.getSingleResourceAccess().getLeftSquareBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:1903:1: rule__SingleResource__Group__2 : rule__SingleResource__Group__2__Impl rule__SingleResource__Group__3 ;
    public final void rule__SingleResource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( rule__SingleResource__Group__2__Impl rule__SingleResource__Group__3 )
            // InternalMyDsl.g:1908:2: rule__SingleResource__Group__2__Impl rule__SingleResource__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1915:1: rule__SingleResource__Group__2__Impl : ( 'cost' ) ;
    public final void rule__SingleResource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1919:1: ( ( 'cost' ) )
            // InternalMyDsl.g:1920:1: ( 'cost' )
            {
            // InternalMyDsl.g:1920:1: ( 'cost' )
            // InternalMyDsl.g:1921:2: 'cost'
            {
             before(grammarAccess.getSingleResourceAccess().getCostKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:1930:1: rule__SingleResource__Group__3 : rule__SingleResource__Group__3__Impl rule__SingleResource__Group__4 ;
    public final void rule__SingleResource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1934:1: ( rule__SingleResource__Group__3__Impl rule__SingleResource__Group__4 )
            // InternalMyDsl.g:1935:2: rule__SingleResource__Group__3__Impl rule__SingleResource__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1942:1: rule__SingleResource__Group__3__Impl : ( '->' ) ;
    public final void rule__SingleResource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1946:1: ( ( '->' ) )
            // InternalMyDsl.g:1947:1: ( '->' )
            {
            // InternalMyDsl.g:1947:1: ( '->' )
            // InternalMyDsl.g:1948:2: '->'
            {
             before(grammarAccess.getSingleResourceAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:1957:1: rule__SingleResource__Group__4 : rule__SingleResource__Group__4__Impl rule__SingleResource__Group__5 ;
    public final void rule__SingleResource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( rule__SingleResource__Group__4__Impl rule__SingleResource__Group__5 )
            // InternalMyDsl.g:1962:2: rule__SingleResource__Group__4__Impl rule__SingleResource__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1969:1: rule__SingleResource__Group__4__Impl : ( ( rule__SingleResource__CostAssignment_4 ) ) ;
    public final void rule__SingleResource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( ( ( rule__SingleResource__CostAssignment_4 ) ) )
            // InternalMyDsl.g:1974:1: ( ( rule__SingleResource__CostAssignment_4 ) )
            {
            // InternalMyDsl.g:1974:1: ( ( rule__SingleResource__CostAssignment_4 ) )
            // InternalMyDsl.g:1975:2: ( rule__SingleResource__CostAssignment_4 )
            {
             before(grammarAccess.getSingleResourceAccess().getCostAssignment_4()); 
            // InternalMyDsl.g:1976:2: ( rule__SingleResource__CostAssignment_4 )
            // InternalMyDsl.g:1976:3: rule__SingleResource__CostAssignment_4
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
    // InternalMyDsl.g:1984:1: rule__SingleResource__Group__5 : rule__SingleResource__Group__5__Impl ;
    public final void rule__SingleResource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( rule__SingleResource__Group__5__Impl )
            // InternalMyDsl.g:1989:2: rule__SingleResource__Group__5__Impl
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
    // InternalMyDsl.g:1995:1: rule__SingleResource__Group__5__Impl : ( ']' ) ;
    public final void rule__SingleResource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1999:1: ( ( ']' ) )
            // InternalMyDsl.g:2000:1: ( ']' )
            {
            // InternalMyDsl.g:2000:1: ( ']' )
            // InternalMyDsl.g:2001:2: ']'
            {
             before(grammarAccess.getSingleResourceAccess().getRightSquareBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__ClazzModel__NameAssignment_1"
    // InternalMyDsl.g:2011:1: rule__ClazzModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClazzModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2015:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2016:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2016:2: ( RULE_ID )
            // InternalMyDsl.g:2017:3: RULE_ID
            {
             before(grammarAccess.getClazzModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClazzModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ClazzModel__NameAssignment_1"


    // $ANTLR start "rule__ClazzModel__ElementAssignment_2"
    // InternalMyDsl.g:2026:1: rule__ClazzModel__ElementAssignment_2 : ( ruleElement ) ;
    public final void rule__ClazzModel__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2030:1: ( ( ruleElement ) )
            // InternalMyDsl.g:2031:2: ( ruleElement )
            {
            // InternalMyDsl.g:2031:2: ( ruleElement )
            // InternalMyDsl.g:2032:3: ruleElement
            {
             before(grammarAccess.getClazzModelAccess().getElementElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getClazzModelAccess().getElementElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ClazzModel__ElementAssignment_2"


    // $ANTLR start "rule__Cities__NameAssignment_1"
    // InternalMyDsl.g:2041:1: rule__Cities__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cities__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2045:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2046:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2046:2: ( RULE_ID )
            // InternalMyDsl.g:2047:3: RULE_ID
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
    // InternalMyDsl.g:2056:1: rule__Cities__XAssignment_5 : ( RULE_INT ) ;
    public final void rule__Cities__XAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2060:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2061:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2061:2: ( RULE_INT )
            // InternalMyDsl.g:2062:3: RULE_INT
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
    // InternalMyDsl.g:2071:1: rule__Cities__YAssignment_8 : ( RULE_INT ) ;
    public final void rule__Cities__YAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2075:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2076:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2076:2: ( RULE_INT )
            // InternalMyDsl.g:2077:3: RULE_INT
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
    // InternalMyDsl.g:2086:1: rule__Cities__FactoryAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Cities__FactoryAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2090:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2091:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2091:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2092:3: ( RULE_ID )
            {
             before(grammarAccess.getCitiesAccess().getFactorySingleBuildingCrossReference_10_0()); 
            // InternalMyDsl.g:2093:3: ( RULE_ID )
            // InternalMyDsl.g:2094:4: RULE_ID
            {
             before(grammarAccess.getCitiesAccess().getFactorySingleBuildingIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getFactorySingleBuildingIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getCitiesAccess().getFactorySingleBuildingCrossReference_10_0()); 

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
    // InternalMyDsl.g:2105:1: rule__Cities__FactoryAssignment_11_1 : ( ( RULE_ID ) ) ;
    public final void rule__Cities__FactoryAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2109:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2110:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2110:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2111:3: ( RULE_ID )
            {
             before(grammarAccess.getCitiesAccess().getFactorySingleBuildingCrossReference_11_1_0()); 
            // InternalMyDsl.g:2112:3: ( RULE_ID )
            // InternalMyDsl.g:2113:4: RULE_ID
            {
             before(grammarAccess.getCitiesAccess().getFactorySingleBuildingIDTerminalRuleCall_11_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCitiesAccess().getFactorySingleBuildingIDTerminalRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getCitiesAccess().getFactorySingleBuildingCrossReference_11_1_0()); 

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
    // InternalMyDsl.g:2124:1: rule__Vehicles__VehiclesAssignment_2 : ( ruleSingleVehicle ) ;
    public final void rule__Vehicles__VehiclesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2128:1: ( ( ruleSingleVehicle ) )
            // InternalMyDsl.g:2129:2: ( ruleSingleVehicle )
            {
            // InternalMyDsl.g:2129:2: ( ruleSingleVehicle )
            // InternalMyDsl.g:2130:3: ruleSingleVehicle
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
    // InternalMyDsl.g:2139:1: rule__SingleVehicle__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SingleVehicle__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2143:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2144:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2144:2: ( RULE_ID )
            // InternalMyDsl.g:2145:3: RULE_ID
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
    // InternalMyDsl.g:2154:1: rule__SingleVehicle__SpeedAssignment_4 : ( RULE_INT ) ;
    public final void rule__SingleVehicle__SpeedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2159:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2159:2: ( RULE_INT )
            // InternalMyDsl.g:2160:3: RULE_INT
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
    // InternalMyDsl.g:2169:1: rule__SingleVehicle__LoadAssignment_8 : ( RULE_INT ) ;
    public final void rule__SingleVehicle__LoadAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2173:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2174:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2174:2: ( RULE_INT )
            // InternalMyDsl.g:2175:3: RULE_INT
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
    // InternalMyDsl.g:2184:1: rule__SingleVehicle__TankSizeAssignment_12 : ( RULE_INT ) ;
    public final void rule__SingleVehicle__TankSizeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2189:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2189:2: ( RULE_INT )
            // InternalMyDsl.g:2190:3: RULE_INT
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
    // InternalMyDsl.g:2199:1: rule__SingleVehicle__FuelConsumptionAssignment_16 : ( RULE_DOUBLE ) ;
    public final void rule__SingleVehicle__FuelConsumptionAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( ( RULE_DOUBLE ) )
            // InternalMyDsl.g:2204:2: ( RULE_DOUBLE )
            {
            // InternalMyDsl.g:2204:2: ( RULE_DOUBLE )
            // InternalMyDsl.g:2205:3: RULE_DOUBLE
            {
             before(grammarAccess.getSingleVehicleAccess().getFuelConsumptionDOUBLETerminalRuleCall_16_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getSingleVehicleAccess().getFuelConsumptionDOUBLETerminalRuleCall_16_0()); 

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


    // $ANTLR start "rule__Buildings__FactoriesAssignment_2"
    // InternalMyDsl.g:2214:1: rule__Buildings__FactoriesAssignment_2 : ( ruleSingleBuilding ) ;
    public final void rule__Buildings__FactoriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2218:1: ( ( ruleSingleBuilding ) )
            // InternalMyDsl.g:2219:2: ( ruleSingleBuilding )
            {
            // InternalMyDsl.g:2219:2: ( ruleSingleBuilding )
            // InternalMyDsl.g:2220:3: ruleSingleBuilding
            {
             before(grammarAccess.getBuildingsAccess().getFactoriesSingleBuildingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleBuilding();

            state._fsp--;

             after(grammarAccess.getBuildingsAccess().getFactoriesSingleBuildingParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Buildings__FactoriesAssignment_2"


    // $ANTLR start "rule__SingleBuilding__NameAssignment_0"
    // InternalMyDsl.g:2229:1: rule__SingleBuilding__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SingleBuilding__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2233:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2234:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2234:2: ( RULE_ID )
            // InternalMyDsl.g:2235:3: RULE_ID
            {
             before(grammarAccess.getSingleBuildingAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleBuildingAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__SingleBuilding__NameAssignment_0"


    // $ANTLR start "rule__SingleBuilding__InputAssignment_2_2"
    // InternalMyDsl.g:2244:1: rule__SingleBuilding__InputAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__SingleBuilding__InputAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2248:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2249:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2249:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2250:3: ( RULE_ID )
            {
             before(grammarAccess.getSingleBuildingAccess().getInputSingleResourceCrossReference_2_2_0()); 
            // InternalMyDsl.g:2251:3: ( RULE_ID )
            // InternalMyDsl.g:2252:4: RULE_ID
            {
             before(grammarAccess.getSingleBuildingAccess().getInputSingleResourceIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleBuildingAccess().getInputSingleResourceIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getSingleBuildingAccess().getInputSingleResourceCrossReference_2_2_0()); 

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
    // $ANTLR end "rule__SingleBuilding__InputAssignment_2_2"


    // $ANTLR start "rule__SingleBuilding__OutputAssignment_4_2"
    // InternalMyDsl.g:2263:1: rule__SingleBuilding__OutputAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__SingleBuilding__OutputAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2267:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2268:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2268:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2269:3: ( RULE_ID )
            {
             before(grammarAccess.getSingleBuildingAccess().getOutputSingleResourceCrossReference_4_2_0()); 
            // InternalMyDsl.g:2270:3: ( RULE_ID )
            // InternalMyDsl.g:2271:4: RULE_ID
            {
             before(grammarAccess.getSingleBuildingAccess().getOutputSingleResourceIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSingleBuildingAccess().getOutputSingleResourceIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getSingleBuildingAccess().getOutputSingleResourceCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__SingleBuilding__OutputAssignment_4_2"


    // $ANTLR start "rule__Resources__ResourcesAssignment_2"
    // InternalMyDsl.g:2282:1: rule__Resources__ResourcesAssignment_2 : ( ruleSingleResource ) ;
    public final void rule__Resources__ResourcesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2286:1: ( ( ruleSingleResource ) )
            // InternalMyDsl.g:2287:2: ( ruleSingleResource )
            {
            // InternalMyDsl.g:2287:2: ( ruleSingleResource )
            // InternalMyDsl.g:2288:3: ruleSingleResource
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
    // InternalMyDsl.g:2297:1: rule__SingleResource__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SingleResource__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2301:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2302:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2302:2: ( RULE_ID )
            // InternalMyDsl.g:2303:3: RULE_ID
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
    // InternalMyDsl.g:2312:1: rule__SingleResource__CostAssignment_4 : ( RULE_INT ) ;
    public final void rule__SingleResource__CostAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2316:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2317:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2317:2: ( RULE_INT )
            // InternalMyDsl.g:2318:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000024202000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000024202002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});

}