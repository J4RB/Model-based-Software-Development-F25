package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'weak'", "'key'", "'('", "'['", "']'", "')'", "'1..1'", "'*..*'", "'1..*'", "'*..1'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'true'", "'false'", "'system'", "'entity'", "'is'", "'{'", "'}'", "'attribute'", "','", "'as'", "'relation'", "'require'", "'||'", "'&&'", "'+'", "'-'", "'!'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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



    // $ANTLR start "entryRuleSystemRoot"
    // InternalMyDsl.g:53:1: entryRuleSystemRoot : ruleSystemRoot EOF ;
    public final void entryRuleSystemRoot() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleSystemRoot EOF )
            // InternalMyDsl.g:55:1: ruleSystemRoot EOF
            {
             before(grammarAccess.getSystemRootRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemRoot();

            state._fsp--;

             after(grammarAccess.getSystemRootRule()); 
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
    // $ANTLR end "entryRuleSystemRoot"


    // $ANTLR start "ruleSystemRoot"
    // InternalMyDsl.g:62:1: ruleSystemRoot : ( ( rule__SystemRoot__Group__0 ) ) ;
    public final void ruleSystemRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__SystemRoot__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__SystemRoot__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__SystemRoot__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__SystemRoot__Group__0 )
            {
             before(grammarAccess.getSystemRootAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__SystemRoot__Group__0 )
            // InternalMyDsl.g:69:4: rule__SystemRoot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemRoot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemRoot"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEntity EOF )
            // InternalMyDsl.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Entity__Group__0 )
            // InternalMyDsl.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleAttribute EOF )
            // InternalMyDsl.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Attribute__Group__0 )
            // InternalMyDsl.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:128:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRelation EOF )
            // InternalMyDsl.g:130:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:137:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Relation__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Relation__Group__0 )
            // InternalMyDsl.g:144:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleCardinality"
    // InternalMyDsl.g:153:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleCardinality EOF )
            // InternalMyDsl.g:155:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalMyDsl.g:162:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Cardinality__Alternatives )
            // InternalMyDsl.g:169:4: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleRequire"
    // InternalMyDsl.g:178:1: entryRuleRequire : ruleRequire EOF ;
    public final void entryRuleRequire() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleRequire EOF )
            // InternalMyDsl.g:180:1: ruleRequire EOF
            {
             before(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            ruleRequire();

            state._fsp--;

             after(grammarAccess.getRequireRule()); 
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
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalMyDsl.g:187:1: ruleRequire : ( ( rule__Require__Group__0 ) ) ;
    public final void ruleRequire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Require__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Require__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Require__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Require__Group__0 )
            {
             before(grammarAccess.getRequireAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Require__Group__0 )
            // InternalMyDsl.g:194:4: rule__Require__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Require__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:203:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleExpression EOF )
            // InternalMyDsl.g:205:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:212:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ruleOr ) )
            // InternalMyDsl.g:217:2: ( ruleOr )
            {
            // InternalMyDsl.g:217:2: ( ruleOr )
            // InternalMyDsl.g:218:3: ruleOr
            {
             before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalMyDsl.g:228:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleOr EOF )
            // InternalMyDsl.g:230:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalMyDsl.g:237:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Or__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Or__Group__0 )
            // InternalMyDsl.g:244:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalMyDsl.g:253:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleAnd EOF )
            // InternalMyDsl.g:255:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalMyDsl.g:262:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__And__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__And__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__And__Group__0 )
            // InternalMyDsl.g:269:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalMyDsl.g:278:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleEquality EOF )
            // InternalMyDsl.g:280:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalMyDsl.g:287:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Equality__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Equality__Group__0 )
            // InternalMyDsl.g:294:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalMyDsl.g:303:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleComparison EOF )
            // InternalMyDsl.g:305:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMyDsl.g:312:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Comparison__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Comparison__Group__0 )
            // InternalMyDsl.g:319:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMyDsl.g:328:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( rulePlusOrMinus EOF )
            // InternalMyDsl.g:330:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMyDsl.g:337:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__PlusOrMinus__Group__0 )
            // InternalMyDsl.g:344:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalMyDsl.g:353:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleMulOrDiv EOF )
            // InternalMyDsl.g:355:1: ruleMulOrDiv EOF
            {
             before(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getMulOrDivRule()); 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalMyDsl.g:362:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__MulOrDiv__Group__0 )
            // InternalMyDsl.g:369:4: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalMyDsl.g:378:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( rulePrimary EOF )
            // InternalMyDsl.g:380:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMyDsl.g:387:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Primary__Alternatives ) )
            // InternalMyDsl.g:393:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMyDsl.g:394:3: ( rule__Primary__Alternatives )
            // InternalMyDsl.g:394:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalMyDsl.g:403:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleAtomic EOF )
            // InternalMyDsl.g:405:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalMyDsl.g:412:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Atomic__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__Atomic__Alternatives )
            // InternalMyDsl.g:419:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "rule__Attribute__Alternatives_3_1"
    // InternalMyDsl.g:427:1: rule__Attribute__Alternatives_3_1 : ( ( 'weak' ) | ( 'key' ) );
    public final void rule__Attribute__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( ( 'weak' ) | ( 'key' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:432:2: ( 'weak' )
                    {
                    // InternalMyDsl.g:432:2: ( 'weak' )
                    // InternalMyDsl.g:433:3: 'weak'
                    {
                     before(grammarAccess.getAttributeAccess().getWeakKeyword_3_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getWeakKeyword_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:438:2: ( 'key' )
                    {
                    // InternalMyDsl.g:438:2: ( 'key' )
                    // InternalMyDsl.g:439:3: 'key'
                    {
                     before(grammarAccess.getAttributeAccess().getKeyKeyword_3_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getKeyKeyword_3_1_1()); 

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
    // $ANTLR end "rule__Attribute__Alternatives_3_1"


    // $ANTLR start "rule__Attribute__Alternatives_4_2_0"
    // InternalMyDsl.g:448:1: rule__Attribute__Alternatives_4_2_0 : ( ( '(' ) | ( '[' ) );
    public final void rule__Attribute__Alternatives_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:452:1: ( ( '(' ) | ( '[' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:453:2: ( '(' )
                    {
                    // InternalMyDsl.g:453:2: ( '(' )
                    // InternalMyDsl.g:454:3: '('
                    {
                     before(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_4_2_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_4_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:459:2: ( '[' )
                    {
                    // InternalMyDsl.g:459:2: ( '[' )
                    // InternalMyDsl.g:460:3: '['
                    {
                     before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_4_2_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_4_2_0_1()); 

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
    // $ANTLR end "rule__Attribute__Alternatives_4_2_0"


    // $ANTLR start "rule__Attribute__Alternatives_4_2_2"
    // InternalMyDsl.g:469:1: rule__Attribute__Alternatives_4_2_2 : ( ( ']' ) | ( ')' ) );
    public final void rule__Attribute__Alternatives_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( ']' ) | ( ')' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:474:2: ( ']' )
                    {
                    // InternalMyDsl.g:474:2: ( ']' )
                    // InternalMyDsl.g:475:3: ']'
                    {
                     before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_4_2_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_4_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:480:2: ( ')' )
                    {
                    // InternalMyDsl.g:480:2: ( ')' )
                    // InternalMyDsl.g:481:3: ')'
                    {
                     before(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_4_2_2_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_4_2_2_1()); 

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
    // $ANTLR end "rule__Attribute__Alternatives_4_2_2"


    // $ANTLR start "rule__Cardinality__Alternatives"
    // InternalMyDsl.g:490:1: rule__Cardinality__Alternatives : ( ( '1..1' ) | ( '*..*' ) | ( '1..*' ) | ( '*..1' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:494:1: ( ( '1..1' ) | ( '*..*' ) | ( '1..*' ) | ( '*..1' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:495:2: ( '1..1' )
                    {
                    // InternalMyDsl.g:495:2: ( '1..1' )
                    // InternalMyDsl.g:496:3: '1..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:501:2: ( '*..*' )
                    {
                    // InternalMyDsl.g:501:2: ( '*..*' )
                    // InternalMyDsl.g:502:3: '*..*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:507:2: ( '1..*' )
                    {
                    // InternalMyDsl.g:507:2: ( '1..*' )
                    // InternalMyDsl.g:508:3: '1..*'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:513:2: ( '*..1' )
                    {
                    // InternalMyDsl.g:513:2: ( '*..1' )
                    // InternalMyDsl.g:514:3: '*..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopDigitOneKeyword_3()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopDigitOneKeyword_3()); 

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
    // $ANTLR end "rule__Cardinality__Alternatives"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // InternalMyDsl.g:523:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:527:1: ( ( '==' ) | ( '!=' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:528:2: ( '==' )
                    {
                    // InternalMyDsl.g:528:2: ( '==' )
                    // InternalMyDsl.g:529:3: '=='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:534:2: ( '!=' )
                    {
                    // InternalMyDsl.g:534:2: ( '!=' )
                    // InternalMyDsl.g:535:3: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_1_0"
    // InternalMyDsl.g:544:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:548:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:549:2: ( '>=' )
                    {
                    // InternalMyDsl.g:549:2: ( '>=' )
                    // InternalMyDsl.g:550:3: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:555:2: ( '<=' )
                    {
                    // InternalMyDsl.g:555:2: ( '<=' )
                    // InternalMyDsl.g:556:3: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:561:2: ( '>' )
                    {
                    // InternalMyDsl.g:561:2: ( '>' )
                    // InternalMyDsl.g:562:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:567:2: ( '<' )
                    {
                    // InternalMyDsl.g:567:2: ( '<' )
                    // InternalMyDsl.g:568:3: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 

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
    // $ANTLR end "rule__Comparison__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // InternalMyDsl.g:577:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:581:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==43) ) {
                alt7=1;
            }
            else if ( (LA7_0==44) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:582:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalMyDsl.g:582:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalMyDsl.g:583:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // InternalMyDsl.g:584:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalMyDsl.g:584:4: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:588:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalMyDsl.g:588:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalMyDsl.g:589:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // InternalMyDsl.g:590:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalMyDsl.g:590:4: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__OpAlternatives_1_1_0"
    // InternalMyDsl.g:598:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:602:1: ( ( '*' ) | ( '/' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:603:2: ( '*' )
                    {
                    // InternalMyDsl.g:603:2: ( '*' )
                    // InternalMyDsl.g:604:3: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:609:2: ( '/' )
                    {
                    // InternalMyDsl.g:609:2: ( '/' )
                    // InternalMyDsl.g:610:3: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__MulOrDiv__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMyDsl.g:619:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt9=1;
                }
                break;
            case 45:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 29:
            case 30:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:624:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:624:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMyDsl.g:625:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMyDsl.g:626:3: ( rule__Primary__Group_0__0 )
                    // InternalMyDsl.g:626:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:630:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:630:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMyDsl.g:631:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalMyDsl.g:632:3: ( rule__Primary__Group_1__0 )
                    // InternalMyDsl.g:632:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:636:2: ( ruleAtomic )
                    {
                    // InternalMyDsl.g:636:2: ( ruleAtomic )
                    // InternalMyDsl.g:637:3: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalMyDsl.g:646:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case RULE_STRING:
                {
                alt10=2;
                }
                break;
            case 29:
            case 30:
                {
                alt10=3;
                }
                break;
            case RULE_ID:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:651:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:651:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalMyDsl.g:652:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalMyDsl.g:653:3: ( rule__Atomic__Group_0__0 )
                    // InternalMyDsl.g:653:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:657:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:657:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalMyDsl.g:658:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalMyDsl.g:659:3: ( rule__Atomic__Group_1__0 )
                    // InternalMyDsl.g:659:4: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:663:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:663:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalMyDsl.g:664:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalMyDsl.g:665:3: ( rule__Atomic__Group_2__0 )
                    // InternalMyDsl.g:665:4: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:669:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalMyDsl.g:669:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalMyDsl.g:670:3: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // InternalMyDsl.g:671:3: ( rule__Atomic__Group_3__0 )
                    // InternalMyDsl.g:671:4: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_2_1_0"
    // InternalMyDsl.g:679:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:683:1: ( ( 'true' ) | ( 'false' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            else if ( (LA11_0==30) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:684:2: ( 'true' )
                    {
                    // InternalMyDsl.g:684:2: ( 'true' )
                    // InternalMyDsl.g:685:3: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:690:2: ( 'false' )
                    {
                    // InternalMyDsl.g:690:2: ( 'false' )
                    // InternalMyDsl.g:691:3: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 

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
    // $ANTLR end "rule__Atomic__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__SystemRoot__Group__0"
    // InternalMyDsl.g:700:1: rule__SystemRoot__Group__0 : rule__SystemRoot__Group__0__Impl rule__SystemRoot__Group__1 ;
    public final void rule__SystemRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:704:1: ( rule__SystemRoot__Group__0__Impl rule__SystemRoot__Group__1 )
            // InternalMyDsl.g:705:2: rule__SystemRoot__Group__0__Impl rule__SystemRoot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SystemRoot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemRoot__Group__1();

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
    // $ANTLR end "rule__SystemRoot__Group__0"


    // $ANTLR start "rule__SystemRoot__Group__0__Impl"
    // InternalMyDsl.g:712:1: rule__SystemRoot__Group__0__Impl : ( 'system' ) ;
    public final void rule__SystemRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:1: ( ( 'system' ) )
            // InternalMyDsl.g:717:1: ( 'system' )
            {
            // InternalMyDsl.g:717:1: ( 'system' )
            // InternalMyDsl.g:718:2: 'system'
            {
             before(grammarAccess.getSystemRootAccess().getSystemKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSystemRootAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__Group__0__Impl"


    // $ANTLR start "rule__SystemRoot__Group__1"
    // InternalMyDsl.g:727:1: rule__SystemRoot__Group__1 : rule__SystemRoot__Group__1__Impl rule__SystemRoot__Group__2 ;
    public final void rule__SystemRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( rule__SystemRoot__Group__1__Impl rule__SystemRoot__Group__2 )
            // InternalMyDsl.g:732:2: rule__SystemRoot__Group__1__Impl rule__SystemRoot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SystemRoot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemRoot__Group__2();

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
    // $ANTLR end "rule__SystemRoot__Group__1"


    // $ANTLR start "rule__SystemRoot__Group__1__Impl"
    // InternalMyDsl.g:739:1: rule__SystemRoot__Group__1__Impl : ( ( rule__SystemRoot__NameAssignment_1 ) ) ;
    public final void rule__SystemRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:743:1: ( ( ( rule__SystemRoot__NameAssignment_1 ) ) )
            // InternalMyDsl.g:744:1: ( ( rule__SystemRoot__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:744:1: ( ( rule__SystemRoot__NameAssignment_1 ) )
            // InternalMyDsl.g:745:2: ( rule__SystemRoot__NameAssignment_1 )
            {
             before(grammarAccess.getSystemRootAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:746:2: ( rule__SystemRoot__NameAssignment_1 )
            // InternalMyDsl.g:746:3: rule__SystemRoot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemRoot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemRootAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__Group__1__Impl"


    // $ANTLR start "rule__SystemRoot__Group__2"
    // InternalMyDsl.g:754:1: rule__SystemRoot__Group__2 : rule__SystemRoot__Group__2__Impl rule__SystemRoot__Group__3 ;
    public final void rule__SystemRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:758:1: ( rule__SystemRoot__Group__2__Impl rule__SystemRoot__Group__3 )
            // InternalMyDsl.g:759:2: rule__SystemRoot__Group__2__Impl rule__SystemRoot__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SystemRoot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemRoot__Group__3();

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
    // $ANTLR end "rule__SystemRoot__Group__2"


    // $ANTLR start "rule__SystemRoot__Group__2__Impl"
    // InternalMyDsl.g:766:1: rule__SystemRoot__Group__2__Impl : ( ( rule__SystemRoot__EntitiesAssignment_2 )* ) ;
    public final void rule__SystemRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:770:1: ( ( ( rule__SystemRoot__EntitiesAssignment_2 )* ) )
            // InternalMyDsl.g:771:1: ( ( rule__SystemRoot__EntitiesAssignment_2 )* )
            {
            // InternalMyDsl.g:771:1: ( ( rule__SystemRoot__EntitiesAssignment_2 )* )
            // InternalMyDsl.g:772:2: ( rule__SystemRoot__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getSystemRootAccess().getEntitiesAssignment_2()); 
            // InternalMyDsl.g:773:2: ( rule__SystemRoot__EntitiesAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:773:3: rule__SystemRoot__EntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SystemRoot__EntitiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSystemRootAccess().getEntitiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__Group__2__Impl"


    // $ANTLR start "rule__SystemRoot__Group__3"
    // InternalMyDsl.g:781:1: rule__SystemRoot__Group__3 : rule__SystemRoot__Group__3__Impl ;
    public final void rule__SystemRoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:785:1: ( rule__SystemRoot__Group__3__Impl )
            // InternalMyDsl.g:786:2: rule__SystemRoot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemRoot__Group__3__Impl();

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
    // $ANTLR end "rule__SystemRoot__Group__3"


    // $ANTLR start "rule__SystemRoot__Group__3__Impl"
    // InternalMyDsl.g:792:1: rule__SystemRoot__Group__3__Impl : ( ( rule__SystemRoot__RelationsAssignment_3 )* ) ;
    public final void rule__SystemRoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( ( ( rule__SystemRoot__RelationsAssignment_3 )* ) )
            // InternalMyDsl.g:797:1: ( ( rule__SystemRoot__RelationsAssignment_3 )* )
            {
            // InternalMyDsl.g:797:1: ( ( rule__SystemRoot__RelationsAssignment_3 )* )
            // InternalMyDsl.g:798:2: ( rule__SystemRoot__RelationsAssignment_3 )*
            {
             before(grammarAccess.getSystemRootAccess().getRelationsAssignment_3()); 
            // InternalMyDsl.g:799:2: ( rule__SystemRoot__RelationsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:799:3: rule__SystemRoot__RelationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SystemRoot__RelationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSystemRootAccess().getRelationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalMyDsl.g:808:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:813:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalMyDsl.g:820:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:824:1: ( ( 'entity' ) )
            // InternalMyDsl.g:825:1: ( 'entity' )
            {
            // InternalMyDsl.g:825:1: ( 'entity' )
            // InternalMyDsl.g:826:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalMyDsl.g:835:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyDsl.g:840:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalMyDsl.g:847:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:851:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:852:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:852:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMyDsl.g:853:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:854:2: ( rule__Entity__NameAssignment_1 )
            // InternalMyDsl.g:854:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalMyDsl.g:862:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalMyDsl.g:867:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalMyDsl.g:874:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:878:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalMyDsl.g:879:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalMyDsl.g:879:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalMyDsl.g:880:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalMyDsl.g:881:2: ( rule__Entity__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:881:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalMyDsl.g:889:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( rule__Entity__Group__3__Impl )
            // InternalMyDsl.g:894:2: rule__Entity__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__3__Impl();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalMyDsl.g:900:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:904:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalMyDsl.g:905:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalMyDsl.g:905:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalMyDsl.g:906:2: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalMyDsl.g:907:2: ( rule__Entity__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:907:3: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalMyDsl.g:916:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalMyDsl.g:921:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalMyDsl.g:928:1: rule__Entity__Group_2__0__Impl : ( 'is' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:932:1: ( ( 'is' ) )
            // InternalMyDsl.g:933:1: ( 'is' )
            {
            // InternalMyDsl.g:933:1: ( 'is' )
            // InternalMyDsl.g:934:2: 'is'
            {
             before(grammarAccess.getEntityAccess().getIsKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getIsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalMyDsl.g:943:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( rule__Entity__Group_2__1__Impl )
            // InternalMyDsl.g:948:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalMyDsl.g:954:1: rule__Entity__Group_2__1__Impl : ( 'weak' ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:958:1: ( ( 'weak' ) )
            // InternalMyDsl.g:959:1: ( 'weak' )
            {
            // InternalMyDsl.g:959:1: ( 'weak' )
            // InternalMyDsl.g:960:2: 'weak'
            {
             before(grammarAccess.getEntityAccess().getWeakKeyword_2_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getWeakKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // InternalMyDsl.g:970:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalMyDsl.g:975:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1();

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
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // InternalMyDsl.g:982:1: rule__Entity__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:986:1: ( ( '{' ) )
            // InternalMyDsl.g:987:1: ( '{' )
            {
            // InternalMyDsl.g:987:1: ( '{' )
            // InternalMyDsl.g:988:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // InternalMyDsl.g:997:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1001:1: ( rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 )
            // InternalMyDsl.g:1002:2: rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__2();

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
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // InternalMyDsl.g:1009:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__AttributesAssignment_3_1 )* ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1013:1: ( ( ( rule__Entity__AttributesAssignment_3_1 )* ) )
            // InternalMyDsl.g:1014:1: ( ( rule__Entity__AttributesAssignment_3_1 )* )
            {
            // InternalMyDsl.g:1014:1: ( ( rule__Entity__AttributesAssignment_3_1 )* )
            // InternalMyDsl.g:1015:2: ( rule__Entity__AttributesAssignment_3_1 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3_1()); 
            // InternalMyDsl.g:1016:2: ( rule__Entity__AttributesAssignment_3_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1016:3: rule__Entity__AttributesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__AttributesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_3__2"
    // InternalMyDsl.g:1024:1: rule__Entity__Group_3__2 : rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3 ;
    public final void rule__Entity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3 )
            // InternalMyDsl.g:1029:2: rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__3();

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
    // $ANTLR end "rule__Entity__Group_3__2"


    // $ANTLR start "rule__Entity__Group_3__2__Impl"
    // InternalMyDsl.g:1036:1: rule__Entity__Group_3__2__Impl : ( ( rule__Entity__RequiresAssignment_3_2 )* ) ;
    public final void rule__Entity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1040:1: ( ( ( rule__Entity__RequiresAssignment_3_2 )* ) )
            // InternalMyDsl.g:1041:1: ( ( rule__Entity__RequiresAssignment_3_2 )* )
            {
            // InternalMyDsl.g:1041:1: ( ( rule__Entity__RequiresAssignment_3_2 )* )
            // InternalMyDsl.g:1042:2: ( rule__Entity__RequiresAssignment_3_2 )*
            {
             before(grammarAccess.getEntityAccess().getRequiresAssignment_3_2()); 
            // InternalMyDsl.g:1043:2: ( rule__Entity__RequiresAssignment_3_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==40) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1043:3: rule__Entity__RequiresAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Entity__RequiresAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getRequiresAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__2__Impl"


    // $ANTLR start "rule__Entity__Group_3__3"
    // InternalMyDsl.g:1051:1: rule__Entity__Group_3__3 : rule__Entity__Group_3__3__Impl ;
    public final void rule__Entity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( rule__Entity__Group_3__3__Impl )
            // InternalMyDsl.g:1056:2: rule__Entity__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__3__Impl();

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
    // $ANTLR end "rule__Entity__Group_3__3"


    // $ANTLR start "rule__Entity__Group_3__3__Impl"
    // InternalMyDsl.g:1062:1: rule__Entity__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Entity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:1: ( ( '}' ) )
            // InternalMyDsl.g:1067:1: ( '}' )
            {
            // InternalMyDsl.g:1067:1: ( '}' )
            // InternalMyDsl.g:1068:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDsl.g:1078:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:1083:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDsl.g:1090:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1094:1: ( ( 'attribute' ) )
            // InternalMyDsl.g:1095:1: ( 'attribute' )
            {
            // InternalMyDsl.g:1095:1: ( 'attribute' )
            // InternalMyDsl.g:1096:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDsl.g:1105:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1109:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:1110:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDsl.g:1117:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1121:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1122:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1122:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyDsl.g:1123:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1124:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyDsl.g:1124:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyDsl.g:1132:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalMyDsl.g:1137:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyDsl.g:1144:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1148:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // InternalMyDsl.g:1149:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // InternalMyDsl.g:1149:1: ( ( rule__Attribute__Group_2__0 )? )
            // InternalMyDsl.g:1150:2: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // InternalMyDsl.g:1151:2: ( rule__Attribute__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1151:3: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalMyDsl.g:1159:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1163:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalMyDsl.g:1164:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalMyDsl.g:1171:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__Group_3__0 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1175:1: ( ( ( rule__Attribute__Group_3__0 )? ) )
            // InternalMyDsl.g:1176:1: ( ( rule__Attribute__Group_3__0 )? )
            {
            // InternalMyDsl.g:1176:1: ( ( rule__Attribute__Group_3__0 )? )
            // InternalMyDsl.g:1177:2: ( rule__Attribute__Group_3__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_3()); 
            // InternalMyDsl.g:1178:2: ( rule__Attribute__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1178:3: rule__Attribute__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalMyDsl.g:1186:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1190:1: ( rule__Attribute__Group__4__Impl )
            // InternalMyDsl.g:1191:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4__Impl();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalMyDsl.g:1197:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1201:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // InternalMyDsl.g:1202:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // InternalMyDsl.g:1202:1: ( ( rule__Attribute__Group_4__0 )? )
            // InternalMyDsl.g:1203:2: ( rule__Attribute__Group_4__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_4()); 
            // InternalMyDsl.g:1204:2: ( rule__Attribute__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1204:3: rule__Attribute__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group_2__0"
    // InternalMyDsl.g:1213:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1217:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalMyDsl.g:1218:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__1();

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
    // $ANTLR end "rule__Attribute__Group_2__0"


    // $ANTLR start "rule__Attribute__Group_2__0__Impl"
    // InternalMyDsl.g:1225:1: rule__Attribute__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1229:1: ( ( '[' ) )
            // InternalMyDsl.g:1230:1: ( '[' )
            {
            // InternalMyDsl.g:1230:1: ( '[' )
            // InternalMyDsl.g:1231:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2__1"
    // InternalMyDsl.g:1240:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1244:1: ( rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 )
            // InternalMyDsl.g:1245:2: rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__2();

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
    // $ANTLR end "rule__Attribute__Group_2__1"


    // $ANTLR start "rule__Attribute__Group_2__1__Impl"
    // InternalMyDsl.g:1252:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__Group_2_1__0 )? ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1256:1: ( ( ( rule__Attribute__Group_2_1__0 )? ) )
            // InternalMyDsl.g:1257:1: ( ( rule__Attribute__Group_2_1__0 )? )
            {
            // InternalMyDsl.g:1257:1: ( ( rule__Attribute__Group_2_1__0 )? )
            // InternalMyDsl.g:1258:2: ( rule__Attribute__Group_2_1__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_1()); 
            // InternalMyDsl.g:1259:2: ( rule__Attribute__Group_2_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1259:3: rule__Attribute__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group_2__2"
    // InternalMyDsl.g:1267:1: rule__Attribute__Group_2__2 : rule__Attribute__Group_2__2__Impl ;
    public final void rule__Attribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1271:1: ( rule__Attribute__Group_2__2__Impl )
            // InternalMyDsl.g:1272:2: rule__Attribute__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group_2__2"


    // $ANTLR start "rule__Attribute__Group_2__2__Impl"
    // InternalMyDsl.g:1278:1: rule__Attribute__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1282:1: ( ( ']' ) )
            // InternalMyDsl.g:1283:1: ( ']' )
            {
            // InternalMyDsl.g:1283:1: ( ']' )
            // InternalMyDsl.g:1284:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__2__Impl"


    // $ANTLR start "rule__Attribute__Group_2_1__0"
    // InternalMyDsl.g:1294:1: rule__Attribute__Group_2_1__0 : rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 ;
    public final void rule__Attribute__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 )
            // InternalMyDsl.g:1299:2: rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2_1__1();

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
    // $ANTLR end "rule__Attribute__Group_2_1__0"


    // $ANTLR start "rule__Attribute__Group_2_1__0__Impl"
    // InternalMyDsl.g:1306:1: rule__Attribute__Group_2_1__0__Impl : ( RULE_ID ) ;
    public final void rule__Attribute__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1310:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1311:1: ( RULE_ID )
            {
            // InternalMyDsl.g:1311:1: ( RULE_ID )
            // InternalMyDsl.g:1312:2: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2_1__1"
    // InternalMyDsl.g:1321:1: rule__Attribute__Group_2_1__1 : rule__Attribute__Group_2_1__1__Impl ;
    public final void rule__Attribute__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( rule__Attribute__Group_2_1__1__Impl )
            // InternalMyDsl.g:1326:2: rule__Attribute__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group_2_1__1"


    // $ANTLR start "rule__Attribute__Group_2_1__1__Impl"
    // InternalMyDsl.g:1332:1: rule__Attribute__Group_2_1__1__Impl : ( ( rule__Attribute__Group_2_1_1__0 )* ) ;
    public final void rule__Attribute__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1336:1: ( ( ( rule__Attribute__Group_2_1_1__0 )* ) )
            // InternalMyDsl.g:1337:1: ( ( rule__Attribute__Group_2_1_1__0 )* )
            {
            // InternalMyDsl.g:1337:1: ( ( rule__Attribute__Group_2_1_1__0 )* )
            // InternalMyDsl.g:1338:2: ( rule__Attribute__Group_2_1_1__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_1_1()); 
            // InternalMyDsl.g:1339:2: ( rule__Attribute__Group_2_1_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1339:3: rule__Attribute__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Attribute__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group_2_1_1__0"
    // InternalMyDsl.g:1348:1: rule__Attribute__Group_2_1_1__0 : rule__Attribute__Group_2_1_1__0__Impl rule__Attribute__Group_2_1_1__1 ;
    public final void rule__Attribute__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( rule__Attribute__Group_2_1_1__0__Impl rule__Attribute__Group_2_1_1__1 )
            // InternalMyDsl.g:1353:2: rule__Attribute__Group_2_1_1__0__Impl rule__Attribute__Group_2_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2_1_1__1();

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
    // $ANTLR end "rule__Attribute__Group_2_1_1__0"


    // $ANTLR start "rule__Attribute__Group_2_1_1__0__Impl"
    // InternalMyDsl.g:1360:1: rule__Attribute__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1364:1: ( ( ',' ) )
            // InternalMyDsl.g:1365:1: ( ',' )
            {
            // InternalMyDsl.g:1365:1: ( ',' )
            // InternalMyDsl.g:1366:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_2_1_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2_1_1__1"
    // InternalMyDsl.g:1375:1: rule__Attribute__Group_2_1_1__1 : rule__Attribute__Group_2_1_1__1__Impl ;
    public final void rule__Attribute__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( rule__Attribute__Group_2_1_1__1__Impl )
            // InternalMyDsl.g:1380:2: rule__Attribute__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group_2_1_1__1"


    // $ANTLR start "rule__Attribute__Group_2_1_1__1__Impl"
    // InternalMyDsl.g:1386:1: rule__Attribute__Group_2_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Attribute__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1390:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1391:1: ( RULE_ID )
            {
            // InternalMyDsl.g:1391:1: ( RULE_ID )
            // InternalMyDsl.g:1392:2: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getIDTerminalRuleCall_2_1_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIDTerminalRuleCall_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group_3__0"
    // InternalMyDsl.g:1402:1: rule__Attribute__Group_3__0 : rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 ;
    public final void rule__Attribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1406:1: ( rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 )
            // InternalMyDsl.g:1407:2: rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Attribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__1();

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
    // $ANTLR end "rule__Attribute__Group_3__0"


    // $ANTLR start "rule__Attribute__Group_3__0__Impl"
    // InternalMyDsl.g:1414:1: rule__Attribute__Group_3__0__Impl : ( 'is' ) ;
    public final void rule__Attribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1418:1: ( ( 'is' ) )
            // InternalMyDsl.g:1419:1: ( 'is' )
            {
            // InternalMyDsl.g:1419:1: ( 'is' )
            // InternalMyDsl.g:1420:2: 'is'
            {
             before(grammarAccess.getAttributeAccess().getIsKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__0__Impl"


    // $ANTLR start "rule__Attribute__Group_3__1"
    // InternalMyDsl.g:1429:1: rule__Attribute__Group_3__1 : rule__Attribute__Group_3__1__Impl ;
    public final void rule__Attribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( rule__Attribute__Group_3__1__Impl )
            // InternalMyDsl.g:1434:2: rule__Attribute__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group_3__1"


    // $ANTLR start "rule__Attribute__Group_3__1__Impl"
    // InternalMyDsl.g:1440:1: rule__Attribute__Group_3__1__Impl : ( ( rule__Attribute__Alternatives_3_1 ) ) ;
    public final void rule__Attribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1444:1: ( ( ( rule__Attribute__Alternatives_3_1 ) ) )
            // InternalMyDsl.g:1445:1: ( ( rule__Attribute__Alternatives_3_1 ) )
            {
            // InternalMyDsl.g:1445:1: ( ( rule__Attribute__Alternatives_3_1 ) )
            // InternalMyDsl.g:1446:2: ( rule__Attribute__Alternatives_3_1 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_3_1()); 
            // InternalMyDsl.g:1447:2: ( rule__Attribute__Alternatives_3_1 )
            // InternalMyDsl.g:1447:3: rule__Attribute__Alternatives_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group_4__0"
    // InternalMyDsl.g:1456:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // InternalMyDsl.g:1461:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4__1();

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
    // $ANTLR end "rule__Attribute__Group_4__0"


    // $ANTLR start "rule__Attribute__Group_4__0__Impl"
    // InternalMyDsl.g:1468:1: rule__Attribute__Group_4__0__Impl : ( 'as' ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1472:1: ( ( 'as' ) )
            // InternalMyDsl.g:1473:1: ( 'as' )
            {
            // InternalMyDsl.g:1473:1: ( 'as' )
            // InternalMyDsl.g:1474:2: 'as'
            {
             before(grammarAccess.getAttributeAccess().getAsKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__0__Impl"


    // $ANTLR start "rule__Attribute__Group_4__1"
    // InternalMyDsl.g:1483:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 )
            // InternalMyDsl.g:1488:2: rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4__2();

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
    // $ANTLR end "rule__Attribute__Group_4__1"


    // $ANTLR start "rule__Attribute__Group_4__1__Impl"
    // InternalMyDsl.g:1495:1: rule__Attribute__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1499:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1500:1: ( RULE_ID )
            {
            // InternalMyDsl.g:1500:1: ( RULE_ID )
            // InternalMyDsl.g:1501:2: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getIDTerminalRuleCall_4_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIDTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__1__Impl"


    // $ANTLR start "rule__Attribute__Group_4__2"
    // InternalMyDsl.g:1510:1: rule__Attribute__Group_4__2 : rule__Attribute__Group_4__2__Impl ;
    public final void rule__Attribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( rule__Attribute__Group_4__2__Impl )
            // InternalMyDsl.g:1515:2: rule__Attribute__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group_4__2"


    // $ANTLR start "rule__Attribute__Group_4__2__Impl"
    // InternalMyDsl.g:1521:1: rule__Attribute__Group_4__2__Impl : ( ( rule__Attribute__Group_4_2__0 )? ) ;
    public final void rule__Attribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( ( ( rule__Attribute__Group_4_2__0 )? ) )
            // InternalMyDsl.g:1526:1: ( ( rule__Attribute__Group_4_2__0 )? )
            {
            // InternalMyDsl.g:1526:1: ( ( rule__Attribute__Group_4_2__0 )? )
            // InternalMyDsl.g:1527:2: ( rule__Attribute__Group_4_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_4_2()); 
            // InternalMyDsl.g:1528:2: ( rule__Attribute__Group_4_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=13 && LA23_0<=14)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1528:3: rule__Attribute__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_4_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__2__Impl"


    // $ANTLR start "rule__Attribute__Group_4_2__0"
    // InternalMyDsl.g:1537:1: rule__Attribute__Group_4_2__0 : rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1 ;
    public final void rule__Attribute__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1541:1: ( rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1 )
            // InternalMyDsl.g:1542:2: rule__Attribute__Group_4_2__0__Impl rule__Attribute__Group_4_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4_2__1();

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
    // $ANTLR end "rule__Attribute__Group_4_2__0"


    // $ANTLR start "rule__Attribute__Group_4_2__0__Impl"
    // InternalMyDsl.g:1549:1: rule__Attribute__Group_4_2__0__Impl : ( ( rule__Attribute__Alternatives_4_2_0 ) ) ;
    public final void rule__Attribute__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1553:1: ( ( ( rule__Attribute__Alternatives_4_2_0 ) ) )
            // InternalMyDsl.g:1554:1: ( ( rule__Attribute__Alternatives_4_2_0 ) )
            {
            // InternalMyDsl.g:1554:1: ( ( rule__Attribute__Alternatives_4_2_0 ) )
            // InternalMyDsl.g:1555:2: ( rule__Attribute__Alternatives_4_2_0 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_4_2_0()); 
            // InternalMyDsl.g:1556:2: ( rule__Attribute__Alternatives_4_2_0 )
            // InternalMyDsl.g:1556:3: rule__Attribute__Alternatives_4_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_4_2__1"
    // InternalMyDsl.g:1564:1: rule__Attribute__Group_4_2__1 : rule__Attribute__Group_4_2__1__Impl rule__Attribute__Group_4_2__2 ;
    public final void rule__Attribute__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( rule__Attribute__Group_4_2__1__Impl rule__Attribute__Group_4_2__2 )
            // InternalMyDsl.g:1569:2: rule__Attribute__Group_4_2__1__Impl rule__Attribute__Group_4_2__2
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group_4_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4_2__2();

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
    // $ANTLR end "rule__Attribute__Group_4_2__1"


    // $ANTLR start "rule__Attribute__Group_4_2__1__Impl"
    // InternalMyDsl.g:1576:1: rule__Attribute__Group_4_2__1__Impl : ( RULE_INT ) ;
    public final void rule__Attribute__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1580:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1581:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1581:1: ( RULE_INT )
            // InternalMyDsl.g:1582:2: RULE_INT
            {
             before(grammarAccess.getAttributeAccess().getINTTerminalRuleCall_4_2_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getINTTerminalRuleCall_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group_4_2__2"
    // InternalMyDsl.g:1591:1: rule__Attribute__Group_4_2__2 : rule__Attribute__Group_4_2__2__Impl ;
    public final void rule__Attribute__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1595:1: ( rule__Attribute__Group_4_2__2__Impl )
            // InternalMyDsl.g:1596:2: rule__Attribute__Group_4_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4_2__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group_4_2__2"


    // $ANTLR start "rule__Attribute__Group_4_2__2__Impl"
    // InternalMyDsl.g:1602:1: rule__Attribute__Group_4_2__2__Impl : ( ( rule__Attribute__Alternatives_4_2_2 ) ) ;
    public final void rule__Attribute__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1606:1: ( ( ( rule__Attribute__Alternatives_4_2_2 ) ) )
            // InternalMyDsl.g:1607:1: ( ( rule__Attribute__Alternatives_4_2_2 ) )
            {
            // InternalMyDsl.g:1607:1: ( ( rule__Attribute__Alternatives_4_2_2 ) )
            // InternalMyDsl.g:1608:2: ( rule__Attribute__Alternatives_4_2_2 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_4_2_2()); 
            // InternalMyDsl.g:1609:2: ( rule__Attribute__Alternatives_4_2_2 )
            // InternalMyDsl.g:1609:3: rule__Attribute__Alternatives_4_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives_4_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives_4_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4_2__2__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalMyDsl.g:1618:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1622:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalMyDsl.g:1623:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

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
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalMyDsl.g:1630:1: rule__Relation__Group__0__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1634:1: ( ( 'relation' ) )
            // InternalMyDsl.g:1635:1: ( 'relation' )
            {
            // InternalMyDsl.g:1635:1: ( 'relation' )
            // InternalMyDsl.g:1636:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalMyDsl.g:1645:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1649:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalMyDsl.g:1650:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

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
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalMyDsl.g:1657:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__FromEntityAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1661:1: ( ( ( rule__Relation__FromEntityAssignment_1 ) ) )
            // InternalMyDsl.g:1662:1: ( ( rule__Relation__FromEntityAssignment_1 ) )
            {
            // InternalMyDsl.g:1662:1: ( ( rule__Relation__FromEntityAssignment_1 ) )
            // InternalMyDsl.g:1663:2: ( rule__Relation__FromEntityAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getFromEntityAssignment_1()); 
            // InternalMyDsl.g:1664:2: ( rule__Relation__FromEntityAssignment_1 )
            // InternalMyDsl.g:1664:3: rule__Relation__FromEntityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__FromEntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getFromEntityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalMyDsl.g:1672:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1676:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalMyDsl.g:1677:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

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
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalMyDsl.g:1684:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__NameAssignment_2 )? ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1688:1: ( ( ( rule__Relation__NameAssignment_2 )? ) )
            // InternalMyDsl.g:1689:1: ( ( rule__Relation__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:1689:1: ( ( rule__Relation__NameAssignment_2 )? )
            // InternalMyDsl.g:1690:2: ( rule__Relation__NameAssignment_2 )?
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1691:2: ( rule__Relation__NameAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_ID) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1691:3: rule__Relation__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalMyDsl.g:1699:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1703:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalMyDsl.g:1704:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__4();

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
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalMyDsl.g:1711:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__ToEntityAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1715:1: ( ( ( rule__Relation__ToEntityAssignment_3 ) ) )
            // InternalMyDsl.g:1716:1: ( ( rule__Relation__ToEntityAssignment_3 ) )
            {
            // InternalMyDsl.g:1716:1: ( ( rule__Relation__ToEntityAssignment_3 ) )
            // InternalMyDsl.g:1717:2: ( rule__Relation__ToEntityAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getToEntityAssignment_3()); 
            // InternalMyDsl.g:1718:2: ( rule__Relation__ToEntityAssignment_3 )
            // InternalMyDsl.g:1718:3: rule__Relation__ToEntityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Relation__ToEntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getToEntityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // InternalMyDsl.g:1726:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1730:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalMyDsl.g:1731:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__5();

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
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // InternalMyDsl.g:1738:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__CardinalityAssignment_4 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1742:1: ( ( ( rule__Relation__CardinalityAssignment_4 ) ) )
            // InternalMyDsl.g:1743:1: ( ( rule__Relation__CardinalityAssignment_4 ) )
            {
            // InternalMyDsl.g:1743:1: ( ( rule__Relation__CardinalityAssignment_4 ) )
            // InternalMyDsl.g:1744:2: ( rule__Relation__CardinalityAssignment_4 )
            {
             before(grammarAccess.getRelationAccess().getCardinalityAssignment_4()); 
            // InternalMyDsl.g:1745:2: ( rule__Relation__CardinalityAssignment_4 )
            // InternalMyDsl.g:1745:3: rule__Relation__CardinalityAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Relation__CardinalityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getCardinalityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // InternalMyDsl.g:1753:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1757:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // InternalMyDsl.g:1758:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Relation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__6();

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
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // InternalMyDsl.g:1765:1: rule__Relation__Group__5__Impl : ( ( rule__Relation__Group_5__0 )? ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1769:1: ( ( ( rule__Relation__Group_5__0 )? ) )
            // InternalMyDsl.g:1770:1: ( ( rule__Relation__Group_5__0 )? )
            {
            // InternalMyDsl.g:1770:1: ( ( rule__Relation__Group_5__0 )? )
            // InternalMyDsl.g:1771:2: ( rule__Relation__Group_5__0 )?
            {
             before(grammarAccess.getRelationAccess().getGroup_5()); 
            // InternalMyDsl.g:1772:2: ( rule__Relation__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1772:3: rule__Relation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group__6"
    // InternalMyDsl.g:1780:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1784:1: ( rule__Relation__Group__6__Impl )
            // InternalMyDsl.g:1785:2: rule__Relation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__6__Impl();

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
    // $ANTLR end "rule__Relation__Group__6"


    // $ANTLR start "rule__Relation__Group__6__Impl"
    // InternalMyDsl.g:1791:1: rule__Relation__Group__6__Impl : ( ( rule__Relation__Group_6__0 )? ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1795:1: ( ( ( rule__Relation__Group_6__0 )? ) )
            // InternalMyDsl.g:1796:1: ( ( rule__Relation__Group_6__0 )? )
            {
            // InternalMyDsl.g:1796:1: ( ( rule__Relation__Group_6__0 )? )
            // InternalMyDsl.g:1797:2: ( rule__Relation__Group_6__0 )?
            {
             before(grammarAccess.getRelationAccess().getGroup_6()); 
            // InternalMyDsl.g:1798:2: ( rule__Relation__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1798:3: rule__Relation__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6__Impl"


    // $ANTLR start "rule__Relation__Group_5__0"
    // InternalMyDsl.g:1807:1: rule__Relation__Group_5__0 : rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1 ;
    public final void rule__Relation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1811:1: ( rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1 )
            // InternalMyDsl.g:1812:2: rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Relation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_5__1();

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
    // $ANTLR end "rule__Relation__Group_5__0"


    // $ANTLR start "rule__Relation__Group_5__0__Impl"
    // InternalMyDsl.g:1819:1: rule__Relation__Group_5__0__Impl : ( 'is' ) ;
    public final void rule__Relation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1823:1: ( ( 'is' ) )
            // InternalMyDsl.g:1824:1: ( 'is' )
            {
            // InternalMyDsl.g:1824:1: ( 'is' )
            // InternalMyDsl.g:1825:2: 'is'
            {
             before(grammarAccess.getRelationAccess().getIsKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getIsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_5__0__Impl"


    // $ANTLR start "rule__Relation__Group_5__1"
    // InternalMyDsl.g:1834:1: rule__Relation__Group_5__1 : rule__Relation__Group_5__1__Impl ;
    public final void rule__Relation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1838:1: ( rule__Relation__Group_5__1__Impl )
            // InternalMyDsl.g:1839:2: rule__Relation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_5__1__Impl();

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
    // $ANTLR end "rule__Relation__Group_5__1"


    // $ANTLR start "rule__Relation__Group_5__1__Impl"
    // InternalMyDsl.g:1845:1: rule__Relation__Group_5__1__Impl : ( 'weak' ) ;
    public final void rule__Relation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( ( 'weak' ) )
            // InternalMyDsl.g:1850:1: ( 'weak' )
            {
            // InternalMyDsl.g:1850:1: ( 'weak' )
            // InternalMyDsl.g:1851:2: 'weak'
            {
             before(grammarAccess.getRelationAccess().getWeakKeyword_5_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getWeakKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_5__1__Impl"


    // $ANTLR start "rule__Relation__Group_6__0"
    // InternalMyDsl.g:1861:1: rule__Relation__Group_6__0 : rule__Relation__Group_6__0__Impl rule__Relation__Group_6__1 ;
    public final void rule__Relation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1865:1: ( rule__Relation__Group_6__0__Impl rule__Relation__Group_6__1 )
            // InternalMyDsl.g:1866:2: rule__Relation__Group_6__0__Impl rule__Relation__Group_6__1
            {
            pushFollow(FOLLOW_21);
            rule__Relation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_6__1();

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
    // $ANTLR end "rule__Relation__Group_6__0"


    // $ANTLR start "rule__Relation__Group_6__0__Impl"
    // InternalMyDsl.g:1873:1: rule__Relation__Group_6__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1877:1: ( ( '{' ) )
            // InternalMyDsl.g:1878:1: ( '{' )
            {
            // InternalMyDsl.g:1878:1: ( '{' )
            // InternalMyDsl.g:1879:2: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_6__0__Impl"


    // $ANTLR start "rule__Relation__Group_6__1"
    // InternalMyDsl.g:1888:1: rule__Relation__Group_6__1 : rule__Relation__Group_6__1__Impl rule__Relation__Group_6__2 ;
    public final void rule__Relation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1892:1: ( rule__Relation__Group_6__1__Impl rule__Relation__Group_6__2 )
            // InternalMyDsl.g:1893:2: rule__Relation__Group_6__1__Impl rule__Relation__Group_6__2
            {
            pushFollow(FOLLOW_21);
            rule__Relation__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_6__2();

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
    // $ANTLR end "rule__Relation__Group_6__1"


    // $ANTLR start "rule__Relation__Group_6__1__Impl"
    // InternalMyDsl.g:1900:1: rule__Relation__Group_6__1__Impl : ( ( rule__Relation__AttributesAssignment_6_1 )* ) ;
    public final void rule__Relation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1904:1: ( ( ( rule__Relation__AttributesAssignment_6_1 )* ) )
            // InternalMyDsl.g:1905:1: ( ( rule__Relation__AttributesAssignment_6_1 )* )
            {
            // InternalMyDsl.g:1905:1: ( ( rule__Relation__AttributesAssignment_6_1 )* )
            // InternalMyDsl.g:1906:2: ( rule__Relation__AttributesAssignment_6_1 )*
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_6_1()); 
            // InternalMyDsl.g:1907:2: ( rule__Relation__AttributesAssignment_6_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==36) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:1907:3: rule__Relation__AttributesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Relation__AttributesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getRelationAccess().getAttributesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_6__1__Impl"


    // $ANTLR start "rule__Relation__Group_6__2"
    // InternalMyDsl.g:1915:1: rule__Relation__Group_6__2 : rule__Relation__Group_6__2__Impl ;
    public final void rule__Relation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1919:1: ( rule__Relation__Group_6__2__Impl )
            // InternalMyDsl.g:1920:2: rule__Relation__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_6__2__Impl();

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
    // $ANTLR end "rule__Relation__Group_6__2"


    // $ANTLR start "rule__Relation__Group_6__2__Impl"
    // InternalMyDsl.g:1926:1: rule__Relation__Group_6__2__Impl : ( '}' ) ;
    public final void rule__Relation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1930:1: ( ( '}' ) )
            // InternalMyDsl.g:1931:1: ( '}' )
            {
            // InternalMyDsl.g:1931:1: ( '}' )
            // InternalMyDsl.g:1932:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_6_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_6__2__Impl"


    // $ANTLR start "rule__Require__Group__0"
    // InternalMyDsl.g:1942:1: rule__Require__Group__0 : rule__Require__Group__0__Impl rule__Require__Group__1 ;
    public final void rule__Require__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1946:1: ( rule__Require__Group__0__Impl rule__Require__Group__1 )
            // InternalMyDsl.g:1947:2: rule__Require__Group__0__Impl rule__Require__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Require__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Require__Group__1();

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
    // $ANTLR end "rule__Require__Group__0"


    // $ANTLR start "rule__Require__Group__0__Impl"
    // InternalMyDsl.g:1954:1: rule__Require__Group__0__Impl : ( 'require' ) ;
    public final void rule__Require__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1958:1: ( ( 'require' ) )
            // InternalMyDsl.g:1959:1: ( 'require' )
            {
            // InternalMyDsl.g:1959:1: ( 'require' )
            // InternalMyDsl.g:1960:2: 'require'
            {
             before(grammarAccess.getRequireAccess().getRequireKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRequireAccess().getRequireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__0__Impl"


    // $ANTLR start "rule__Require__Group__1"
    // InternalMyDsl.g:1969:1: rule__Require__Group__1 : rule__Require__Group__1__Impl ;
    public final void rule__Require__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( rule__Require__Group__1__Impl )
            // InternalMyDsl.g:1974:2: rule__Require__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Require__Group__1__Impl();

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
    // $ANTLR end "rule__Require__Group__1"


    // $ANTLR start "rule__Require__Group__1__Impl"
    // InternalMyDsl.g:1980:1: rule__Require__Group__1__Impl : ( ( rule__Require__ExpressionAssignment_1 ) ) ;
    public final void rule__Require__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1984:1: ( ( ( rule__Require__ExpressionAssignment_1 ) ) )
            // InternalMyDsl.g:1985:1: ( ( rule__Require__ExpressionAssignment_1 ) )
            {
            // InternalMyDsl.g:1985:1: ( ( rule__Require__ExpressionAssignment_1 ) )
            // InternalMyDsl.g:1986:2: ( rule__Require__ExpressionAssignment_1 )
            {
             before(grammarAccess.getRequireAccess().getExpressionAssignment_1()); 
            // InternalMyDsl.g:1987:2: ( rule__Require__ExpressionAssignment_1 )
            // InternalMyDsl.g:1987:3: rule__Require__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Require__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequireAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__1__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalMyDsl.g:1996:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2000:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalMyDsl.g:2001:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

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
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalMyDsl.g:2008:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2012:1: ( ( ruleAnd ) )
            // InternalMyDsl.g:2013:1: ( ruleAnd )
            {
            // InternalMyDsl.g:2013:1: ( ruleAnd )
            // InternalMyDsl.g:2014:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalMyDsl.g:2023:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2027:1: ( rule__Or__Group__1__Impl )
            // InternalMyDsl.g:2028:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

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
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalMyDsl.g:2034:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2038:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalMyDsl.g:2039:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalMyDsl.g:2039:1: ( ( rule__Or__Group_1__0 )* )
            // InternalMyDsl.g:2040:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalMyDsl.g:2041:2: ( rule__Or__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==41) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:2041:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalMyDsl.g:2050:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2054:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalMyDsl.g:2055:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

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
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalMyDsl.g:2062:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2066:1: ( ( () ) )
            // InternalMyDsl.g:2067:1: ( () )
            {
            // InternalMyDsl.g:2067:1: ( () )
            // InternalMyDsl.g:2068:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalMyDsl.g:2069:2: ()
            // InternalMyDsl.g:2069:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalMyDsl.g:2077:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2081:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalMyDsl.g:2082:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

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
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalMyDsl.g:2089:1: rule__Or__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2093:1: ( ( '||' ) )
            // InternalMyDsl.g:2094:1: ( '||' )
            {
            // InternalMyDsl.g:2094:1: ( '||' )
            // InternalMyDsl.g:2095:2: '||'
            {
             before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalMyDsl.g:2104:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2108:1: ( rule__Or__Group_1__2__Impl )
            // InternalMyDsl.g:2109:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

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
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalMyDsl.g:2115:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2119:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:2120:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2120:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalMyDsl.g:2121:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:2122:2: ( rule__Or__RightAssignment_1_2 )
            // InternalMyDsl.g:2122:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalMyDsl.g:2131:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2135:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalMyDsl.g:2136:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalMyDsl.g:2143:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2147:1: ( ( ruleEquality ) )
            // InternalMyDsl.g:2148:1: ( ruleEquality )
            {
            // InternalMyDsl.g:2148:1: ( ruleEquality )
            // InternalMyDsl.g:2149:2: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalMyDsl.g:2158:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2162:1: ( rule__And__Group__1__Impl )
            // InternalMyDsl.g:2163:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalMyDsl.g:2169:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2173:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalMyDsl.g:2174:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalMyDsl.g:2174:1: ( ( rule__And__Group_1__0 )* )
            // InternalMyDsl.g:2175:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalMyDsl.g:2176:2: ( rule__And__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==42) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:2176:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalMyDsl.g:2185:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2189:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalMyDsl.g:2190:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

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
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalMyDsl.g:2197:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2201:1: ( ( () ) )
            // InternalMyDsl.g:2202:1: ( () )
            {
            // InternalMyDsl.g:2202:1: ( () )
            // InternalMyDsl.g:2203:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalMyDsl.g:2204:2: ()
            // InternalMyDsl.g:2204:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalMyDsl.g:2212:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2216:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalMyDsl.g:2217:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

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
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalMyDsl.g:2224:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2228:1: ( ( '&&' ) )
            // InternalMyDsl.g:2229:1: ( '&&' )
            {
            // InternalMyDsl.g:2229:1: ( '&&' )
            // InternalMyDsl.g:2230:2: '&&'
            {
             before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalMyDsl.g:2239:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2243:1: ( rule__And__Group_1__2__Impl )
            // InternalMyDsl.g:2244:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

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
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalMyDsl.g:2250:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2254:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:2255:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2255:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalMyDsl.g:2256:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:2257:2: ( rule__And__RightAssignment_1_2 )
            // InternalMyDsl.g:2257:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalMyDsl.g:2266:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2270:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalMyDsl.g:2271:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

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
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalMyDsl.g:2278:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2282:1: ( ( ruleComparison ) )
            // InternalMyDsl.g:2283:1: ( ruleComparison )
            {
            // InternalMyDsl.g:2283:1: ( ruleComparison )
            // InternalMyDsl.g:2284:2: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalMyDsl.g:2293:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2297:1: ( rule__Equality__Group__1__Impl )
            // InternalMyDsl.g:2298:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

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
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalMyDsl.g:2304:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2308:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalMyDsl.g:2309:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalMyDsl.g:2309:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalMyDsl.g:2310:2: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalMyDsl.g:2311:2: ( rule__Equality__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=21 && LA30_0<=22)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:2311:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalMyDsl.g:2320:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2324:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalMyDsl.g:2325:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

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
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalMyDsl.g:2332:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2336:1: ( ( () ) )
            // InternalMyDsl.g:2337:1: ( () )
            {
            // InternalMyDsl.g:2337:1: ( () )
            // InternalMyDsl.g:2338:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // InternalMyDsl.g:2339:2: ()
            // InternalMyDsl.g:2339:3: 
            {
            }

             after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalMyDsl.g:2347:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2351:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalMyDsl.g:2352:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2();

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
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalMyDsl.g:2359:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2363:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalMyDsl.g:2364:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2364:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalMyDsl.g:2365:2: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // InternalMyDsl.g:2366:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalMyDsl.g:2366:3: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // InternalMyDsl.g:2374:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2378:1: ( rule__Equality__Group_1__2__Impl )
            // InternalMyDsl.g:2379:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2__Impl();

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
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // InternalMyDsl.g:2385:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2389:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:2390:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2390:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalMyDsl.g:2391:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:2392:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalMyDsl.g:2392:3: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalMyDsl.g:2401:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2405:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalMyDsl.g:2406:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalMyDsl.g:2413:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2417:1: ( ( rulePlusOrMinus ) )
            // InternalMyDsl.g:2418:1: ( rulePlusOrMinus )
            {
            // InternalMyDsl.g:2418:1: ( rulePlusOrMinus )
            // InternalMyDsl.g:2419:2: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalMyDsl.g:2428:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2432:1: ( rule__Comparison__Group__1__Impl )
            // InternalMyDsl.g:2433:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalMyDsl.g:2439:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2443:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalMyDsl.g:2444:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalMyDsl.g:2444:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalMyDsl.g:2445:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalMyDsl.g:2446:2: ( rule__Comparison__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=23 && LA31_0<=26)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:2446:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalMyDsl.g:2455:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2459:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalMyDsl.g:2460:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalMyDsl.g:2467:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2471:1: ( ( () ) )
            // InternalMyDsl.g:2472:1: ( () )
            {
            // InternalMyDsl.g:2472:1: ( () )
            // InternalMyDsl.g:2473:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalMyDsl.g:2474:2: ()
            // InternalMyDsl.g:2474:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalMyDsl.g:2482:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2486:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalMyDsl.g:2487:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2();

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
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalMyDsl.g:2494:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2498:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalMyDsl.g:2499:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2499:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalMyDsl.g:2500:2: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // InternalMyDsl.g:2501:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalMyDsl.g:2501:3: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // InternalMyDsl.g:2509:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2513:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalMyDsl.g:2514:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // InternalMyDsl.g:2520:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2524:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:2525:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2525:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalMyDsl.g:2526:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:2527:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalMyDsl.g:2527:3: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalMyDsl.g:2536:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2540:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalMyDsl.g:2541:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalMyDsl.g:2548:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2552:1: ( ( ruleMulOrDiv ) )
            // InternalMyDsl.g:2553:1: ( ruleMulOrDiv )
            {
            // InternalMyDsl.g:2553:1: ( ruleMulOrDiv )
            // InternalMyDsl.g:2554:2: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalMyDsl.g:2563:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2567:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalMyDsl.g:2568:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalMyDsl.g:2574:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2578:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalMyDsl.g:2579:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalMyDsl.g:2579:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalMyDsl.g:2580:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalMyDsl.g:2581:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=43 && LA32_0<=44)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:2581:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalMyDsl.g:2590:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2594:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalMyDsl.g:2595:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalMyDsl.g:2602:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2606:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalMyDsl.g:2607:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalMyDsl.g:2607:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalMyDsl.g:2608:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // InternalMyDsl.g:2609:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalMyDsl.g:2609:3: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalMyDsl.g:2617:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2621:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalMyDsl.g:2622:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalMyDsl.g:2628:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2632:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalMyDsl.g:2633:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2633:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalMyDsl.g:2634:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalMyDsl.g:2635:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalMyDsl.g:2635:3: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // InternalMyDsl.g:2644:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2648:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalMyDsl.g:2649:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_33);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // InternalMyDsl.g:2656:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2660:1: ( ( () ) )
            // InternalMyDsl.g:2661:1: ( () )
            {
            // InternalMyDsl.g:2661:1: ( () )
            // InternalMyDsl.g:2662:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalMyDsl.g:2663:2: ()
            // InternalMyDsl.g:2663:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // InternalMyDsl.g:2671:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2675:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalMyDsl.g:2676:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // InternalMyDsl.g:2682:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2686:1: ( ( '+' ) )
            // InternalMyDsl.g:2687:1: ( '+' )
            {
            // InternalMyDsl.g:2687:1: ( '+' )
            // InternalMyDsl.g:2688:2: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // InternalMyDsl.g:2698:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2702:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalMyDsl.g:2703:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_31);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // InternalMyDsl.g:2710:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2714:1: ( ( () ) )
            // InternalMyDsl.g:2715:1: ( () )
            {
            // InternalMyDsl.g:2715:1: ( () )
            // InternalMyDsl.g:2716:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalMyDsl.g:2717:2: ()
            // InternalMyDsl.g:2717:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // InternalMyDsl.g:2725:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2729:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalMyDsl.g:2730:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // InternalMyDsl.g:2736:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2740:1: ( ( '-' ) )
            // InternalMyDsl.g:2741:1: ( '-' )
            {
            // InternalMyDsl.g:2741:1: ( '-' )
            // InternalMyDsl.g:2742:2: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // InternalMyDsl.g:2752:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2756:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalMyDsl.g:2757:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1();

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
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // InternalMyDsl.g:2764:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2768:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:2769:1: ( rulePrimary )
            {
            // InternalMyDsl.g:2769:1: ( rulePrimary )
            // InternalMyDsl.g:2770:2: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // InternalMyDsl.g:2779:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2783:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalMyDsl.g:2784:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // InternalMyDsl.g:2790:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2794:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalMyDsl.g:2795:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalMyDsl.g:2795:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalMyDsl.g:2796:2: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // InternalMyDsl.g:2797:2: ( rule__MulOrDiv__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=27 && LA33_0<=28)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:2797:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getMulOrDivAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // InternalMyDsl.g:2806:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2810:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalMyDsl.g:2811:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // InternalMyDsl.g:2818:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2822:1: ( ( () ) )
            // InternalMyDsl.g:2823:1: ( () )
            {
            // InternalMyDsl.g:2823:1: ( () )
            // InternalMyDsl.g:2824:2: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // InternalMyDsl.g:2825:2: ()
            // InternalMyDsl.g:2825:3: 
            {
            }

             after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // InternalMyDsl.g:2833:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2837:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // InternalMyDsl.g:2838:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__2();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // InternalMyDsl.g:2845:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2849:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // InternalMyDsl.g:2850:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2850:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // InternalMyDsl.g:2851:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // InternalMyDsl.g:2852:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            // InternalMyDsl.g:2852:3: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__2"
    // InternalMyDsl.g:2860:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2864:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // InternalMyDsl.g:2865:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__2__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__2"


    // $ANTLR start "rule__MulOrDiv__Group_1__2__Impl"
    // InternalMyDsl.g:2871:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2875:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:2876:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2876:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // InternalMyDsl.g:2877:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:2878:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            // InternalMyDsl.g:2878:3: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMyDsl.g:2887:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2891:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMyDsl.g:2892:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalMyDsl.g:2899:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2903:1: ( ( '(' ) )
            // InternalMyDsl.g:2904:1: ( '(' )
            {
            // InternalMyDsl.g:2904:1: ( '(' )
            // InternalMyDsl.g:2905:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalMyDsl.g:2914:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2918:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalMyDsl.g:2919:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_36);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalMyDsl.g:2926:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2930:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2931:1: ( ruleExpression )
            {
            // InternalMyDsl.g:2931:1: ( ruleExpression )
            // InternalMyDsl.g:2932:2: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalMyDsl.g:2941:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2945:1: ( rule__Primary__Group_0__2__Impl )
            // InternalMyDsl.g:2946:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalMyDsl.g:2952:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2956:1: ( ( ')' ) )
            // InternalMyDsl.g:2957:1: ( ')' )
            {
            // InternalMyDsl.g:2957:1: ( ')' )
            // InternalMyDsl.g:2958:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalMyDsl.g:2968:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2972:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMyDsl.g:2973:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalMyDsl.g:2980:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2984:1: ( ( () ) )
            // InternalMyDsl.g:2985:1: ( () )
            {
            // InternalMyDsl.g:2985:1: ( () )
            // InternalMyDsl.g:2986:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // InternalMyDsl.g:2987:2: ()
            // InternalMyDsl.g:2987:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalMyDsl.g:2995:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2999:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalMyDsl.g:3000:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalMyDsl.g:3007:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3011:1: ( ( '!' ) )
            // InternalMyDsl.g:3012:1: ( '!' )
            {
            // InternalMyDsl.g:3012:1: ( '!' )
            // InternalMyDsl.g:3013:2: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalMyDsl.g:3022:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3026:1: ( rule__Primary__Group_1__2__Impl )
            // InternalMyDsl.g:3027:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalMyDsl.g:3033:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3037:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalMyDsl.g:3038:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalMyDsl.g:3038:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalMyDsl.g:3039:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // InternalMyDsl.g:3040:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalMyDsl.g:3040:3: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalMyDsl.g:3049:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3053:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalMyDsl.g:3054:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

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
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalMyDsl.g:3061:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3065:1: ( ( () ) )
            // InternalMyDsl.g:3066:1: ( () )
            {
            // InternalMyDsl.g:3066:1: ( () )
            // InternalMyDsl.g:3067:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            // InternalMyDsl.g:3068:2: ()
            // InternalMyDsl.g:3068:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalMyDsl.g:3076:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3080:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalMyDsl.g:3081:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalMyDsl.g:3087:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3091:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalMyDsl.g:3092:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalMyDsl.g:3092:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalMyDsl.g:3093:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalMyDsl.g:3094:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalMyDsl.g:3094:3: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // InternalMyDsl.g:3103:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3107:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalMyDsl.g:3108:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1();

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
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // InternalMyDsl.g:3115:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3119:1: ( ( () ) )
            // InternalMyDsl.g:3120:1: ( () )
            {
            // InternalMyDsl.g:3120:1: ( () )
            // InternalMyDsl.g:3121:2: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 
            // InternalMyDsl.g:3122:2: ()
            // InternalMyDsl.g:3122:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // InternalMyDsl.g:3130:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3134:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalMyDsl.g:3135:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // InternalMyDsl.g:3141:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3145:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalMyDsl.g:3146:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalMyDsl.g:3146:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalMyDsl.g:3147:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // InternalMyDsl.g:3148:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalMyDsl.g:3148:3: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalMyDsl.g:3157:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3161:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalMyDsl.g:3162:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_39);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1();

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
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // InternalMyDsl.g:3169:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3173:1: ( ( () ) )
            // InternalMyDsl.g:3174:1: ( () )
            {
            // InternalMyDsl.g:3174:1: ( () )
            // InternalMyDsl.g:3175:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // InternalMyDsl.g:3176:2: ()
            // InternalMyDsl.g:3176:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // InternalMyDsl.g:3184:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3188:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalMyDsl.g:3189:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // InternalMyDsl.g:3195:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3199:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalMyDsl.g:3200:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalMyDsl.g:3200:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalMyDsl.g:3201:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalMyDsl.g:3202:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalMyDsl.g:3202:3: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // InternalMyDsl.g:3211:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3215:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalMyDsl.g:3216:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1();

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
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // InternalMyDsl.g:3223:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3227:1: ( ( () ) )
            // InternalMyDsl.g:3228:1: ( () )
            {
            // InternalMyDsl.g:3228:1: ( () )
            // InternalMyDsl.g:3229:2: ()
            {
             before(grammarAccess.getAtomicAccess().getVariableRefAction_3_0()); 
            // InternalMyDsl.g:3230:2: ()
            // InternalMyDsl.g:3230:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getVariableRefAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // InternalMyDsl.g:3238:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3242:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalMyDsl.g:3243:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // InternalMyDsl.g:3249:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__VariableAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3253:1: ( ( ( rule__Atomic__VariableAssignment_3_1 ) ) )
            // InternalMyDsl.g:3254:1: ( ( rule__Atomic__VariableAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3254:1: ( ( rule__Atomic__VariableAssignment_3_1 ) )
            // InternalMyDsl.g:3255:2: ( rule__Atomic__VariableAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getVariableAssignment_3_1()); 
            // InternalMyDsl.g:3256:2: ( rule__Atomic__VariableAssignment_3_1 )
            // InternalMyDsl.g:3256:3: rule__Atomic__VariableAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__VariableAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getVariableAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__SystemRoot__NameAssignment_1"
    // InternalMyDsl.g:3265:1: rule__SystemRoot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemRoot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3269:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3270:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3270:2: ( RULE_ID )
            // InternalMyDsl.g:3271:3: RULE_ID
            {
             before(grammarAccess.getSystemRootAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemRootAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__NameAssignment_1"


    // $ANTLR start "rule__SystemRoot__EntitiesAssignment_2"
    // InternalMyDsl.g:3280:1: rule__SystemRoot__EntitiesAssignment_2 : ( ruleEntity ) ;
    public final void rule__SystemRoot__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3284:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:3285:2: ( ruleEntity )
            {
            // InternalMyDsl.g:3285:2: ( ruleEntity )
            // InternalMyDsl.g:3286:3: ruleEntity
            {
             before(grammarAccess.getSystemRootAccess().getEntitiesEntityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getSystemRootAccess().getEntitiesEntityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__EntitiesAssignment_2"


    // $ANTLR start "rule__SystemRoot__RelationsAssignment_3"
    // InternalMyDsl.g:3295:1: rule__SystemRoot__RelationsAssignment_3 : ( ruleRelation ) ;
    public final void rule__SystemRoot__RelationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3299:1: ( ( ruleRelation ) )
            // InternalMyDsl.g:3300:2: ( ruleRelation )
            {
            // InternalMyDsl.g:3300:2: ( ruleRelation )
            // InternalMyDsl.g:3301:3: ruleRelation
            {
             before(grammarAccess.getSystemRootAccess().getRelationsRelationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getSystemRootAccess().getRelationsRelationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemRoot__RelationsAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalMyDsl.g:3310:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3314:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3315:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3315:2: ( RULE_ID )
            // InternalMyDsl.g:3316:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_3_1"
    // InternalMyDsl.g:3325:1: rule__Entity__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3329:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:3330:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:3330:2: ( ruleAttribute )
            // InternalMyDsl.g:3331:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_3_1"


    // $ANTLR start "rule__Entity__RequiresAssignment_3_2"
    // InternalMyDsl.g:3340:1: rule__Entity__RequiresAssignment_3_2 : ( ruleRequire ) ;
    public final void rule__Entity__RequiresAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3344:1: ( ( ruleRequire ) )
            // InternalMyDsl.g:3345:2: ( ruleRequire )
            {
            // InternalMyDsl.g:3345:2: ( ruleRequire )
            // InternalMyDsl.g:3346:3: ruleRequire
            {
             before(grammarAccess.getEntityAccess().getRequiresRequireParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequire();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getRequiresRequireParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__RequiresAssignment_3_2"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDsl.g:3355:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3359:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3360:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3360:2: ( RULE_ID )
            // InternalMyDsl.g:3361:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Relation__FromEntityAssignment_1"
    // InternalMyDsl.g:3370:1: rule__Relation__FromEntityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__FromEntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3374:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3375:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3375:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3376:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getFromEntityEntityCrossReference_1_0()); 
            // InternalMyDsl.g:3377:3: ( RULE_ID )
            // InternalMyDsl.g:3378:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromEntityEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromEntityEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getFromEntityEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__FromEntityAssignment_1"


    // $ANTLR start "rule__Relation__NameAssignment_2"
    // InternalMyDsl.g:3389:1: rule__Relation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3393:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3394:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3394:2: ( RULE_ID )
            // InternalMyDsl.g:3395:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NameAssignment_2"


    // $ANTLR start "rule__Relation__ToEntityAssignment_3"
    // InternalMyDsl.g:3404:1: rule__Relation__ToEntityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ToEntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3408:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3409:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3409:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3410:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getToEntityEntityCrossReference_3_0()); 
            // InternalMyDsl.g:3411:3: ( RULE_ID )
            // InternalMyDsl.g:3412:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToEntityEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToEntityEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getToEntityEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__ToEntityAssignment_3"


    // $ANTLR start "rule__Relation__CardinalityAssignment_4"
    // InternalMyDsl.g:3423:1: rule__Relation__CardinalityAssignment_4 : ( ruleCardinality ) ;
    public final void rule__Relation__CardinalityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3427:1: ( ( ruleCardinality ) )
            // InternalMyDsl.g:3428:2: ( ruleCardinality )
            {
            // InternalMyDsl.g:3428:2: ( ruleCardinality )
            // InternalMyDsl.g:3429:3: ruleCardinality
            {
             before(grammarAccess.getRelationAccess().getCardinalityCardinalityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getCardinalityCardinalityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__CardinalityAssignment_4"


    // $ANTLR start "rule__Relation__AttributesAssignment_6_1"
    // InternalMyDsl.g:3438:1: rule__Relation__AttributesAssignment_6_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3442:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:3443:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:3443:2: ( ruleAttribute )
            // InternalMyDsl.g:3444:3: ruleAttribute
            {
             before(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__AttributesAssignment_6_1"


    // $ANTLR start "rule__Require__ExpressionAssignment_1"
    // InternalMyDsl.g:3453:1: rule__Require__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Require__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3457:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3458:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3458:2: ( ruleExpression )
            // InternalMyDsl.g:3459:3: ruleExpression
            {
             before(grammarAccess.getRequireAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getRequireAccess().getExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__ExpressionAssignment_1"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalMyDsl.g:3468:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3472:1: ( ( ruleAnd ) )
            // InternalMyDsl.g:3473:2: ( ruleAnd )
            {
            // InternalMyDsl.g:3473:2: ( ruleAnd )
            // InternalMyDsl.g:3474:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalMyDsl.g:3483:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3487:1: ( ( ruleEquality ) )
            // InternalMyDsl.g:3488:2: ( ruleEquality )
            {
            // InternalMyDsl.g:3488:2: ( ruleEquality )
            // InternalMyDsl.g:3489:3: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1"
    // InternalMyDsl.g:3498:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3502:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalMyDsl.g:3503:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalMyDsl.g:3503:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalMyDsl.g:3504:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // InternalMyDsl.g:3505:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalMyDsl.g:3505:4: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OpAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // InternalMyDsl.g:3513:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3517:1: ( ( ruleComparison ) )
            // InternalMyDsl.g:3518:2: ( ruleComparison )
            {
            // InternalMyDsl.g:3518:2: ( ruleComparison )
            // InternalMyDsl.g:3519:3: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1"
    // InternalMyDsl.g:3528:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3532:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalMyDsl.g:3533:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalMyDsl.g:3533:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalMyDsl.g:3534:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // InternalMyDsl.g:3535:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalMyDsl.g:3535:4: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // InternalMyDsl.g:3543:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3547:1: ( ( rulePlusOrMinus ) )
            // InternalMyDsl.g:3548:2: ( rulePlusOrMinus )
            {
            // InternalMyDsl.g:3548:2: ( rulePlusOrMinus )
            // InternalMyDsl.g:3549:3: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // InternalMyDsl.g:3558:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3562:1: ( ( ruleMulOrDiv ) )
            // InternalMyDsl.g:3563:2: ( ruleMulOrDiv )
            {
            // InternalMyDsl.g:3563:2: ( ruleMulOrDiv )
            // InternalMyDsl.g:3564:3: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_1"
    // InternalMyDsl.g:3573:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3577:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // InternalMyDsl.g:3578:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // InternalMyDsl.g:3578:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // InternalMyDsl.g:3579:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // InternalMyDsl.g:3580:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // InternalMyDsl.g:3580:4: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_2"
    // InternalMyDsl.g:3588:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3592:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:3593:2: ( rulePrimary )
            {
            // InternalMyDsl.g:3593:2: ( rulePrimary )
            // InternalMyDsl.g:3594:3: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalMyDsl.g:3603:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3607:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:3608:2: ( rulePrimary )
            {
            // InternalMyDsl.g:3608:2: ( rulePrimary )
            // InternalMyDsl.g:3609:3: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // InternalMyDsl.g:3618:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3622:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3623:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3623:2: ( RULE_INT )
            // InternalMyDsl.g:3624:3: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // InternalMyDsl.g:3633:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3637:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3638:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3638:2: ( RULE_STRING )
            // InternalMyDsl.g:3639:3: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // InternalMyDsl.g:3648:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3652:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // InternalMyDsl.g:3653:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // InternalMyDsl.g:3653:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // InternalMyDsl.g:3654:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // InternalMyDsl.g:3655:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // InternalMyDsl.g:3655:4: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__VariableAssignment_3_1"
    // InternalMyDsl.g:3663:1: rule__Atomic__VariableAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__VariableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3667:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3668:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3668:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3669:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getVariableAttributeCrossReference_3_1_0()); 
            // InternalMyDsl.g:3670:3: ( RULE_ID )
            // InternalMyDsl.g:3671:4: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getVariableAttributeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getVariableAttributeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getVariableAttributeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__VariableAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000011800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004200004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200060002070L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000060000000L});

}