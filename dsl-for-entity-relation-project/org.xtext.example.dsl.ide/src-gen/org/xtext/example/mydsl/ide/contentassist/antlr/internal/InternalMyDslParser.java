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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'weak'", "'key'", "'1..1'", "'*..*'", "'1..*'", "'*..1'", "'Number'", "'String'", "'system'", "'entity'", "'is'", "'{'", "'}'", "'attribute'", "'['", "']'", "','", "'as'", "'relation'"
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



    // $ANTLR start "entryRuleSystem"
    // InternalMyDsl.g:53:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleSystem EOF )
            // InternalMyDsl.g:55:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalMyDsl.g:62:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__System__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__System__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__System__Group__0 )
            // InternalMyDsl.g:69:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


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


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:178:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleType EOF )
            // InternalMyDsl.g:180:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:187:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:194:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Attribute__Alternatives_3_1"
    // InternalMyDsl.g:202:1: rule__Attribute__Alternatives_3_1 : ( ( 'weak' ) | ( 'key' ) );
    public final void rule__Attribute__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:206:1: ( ( 'weak' ) | ( 'key' ) )
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
                    // InternalMyDsl.g:207:2: ( 'weak' )
                    {
                    // InternalMyDsl.g:207:2: ( 'weak' )
                    // InternalMyDsl.g:208:3: 'weak'
                    {
                     before(grammarAccess.getAttributeAccess().getWeakKeyword_3_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAttributeAccess().getWeakKeyword_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:213:2: ( 'key' )
                    {
                    // InternalMyDsl.g:213:2: ( 'key' )
                    // InternalMyDsl.g:214:3: 'key'
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


    // $ANTLR start "rule__Cardinality__Alternatives"
    // InternalMyDsl.g:223:1: rule__Cardinality__Alternatives : ( ( '1..1' ) | ( '*..*' ) | ( '1..*' ) | ( '*..1' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:227:1: ( ( '1..1' ) | ( '*..*' ) | ( '1..*' ) | ( '*..1' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
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
                    // InternalMyDsl.g:228:2: ( '1..1' )
                    {
                    // InternalMyDsl.g:228:2: ( '1..1' )
                    // InternalMyDsl.g:229:3: '1..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:234:2: ( '*..*' )
                    {
                    // InternalMyDsl.g:234:2: ( '*..*' )
                    // InternalMyDsl.g:235:3: '*..*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:240:2: ( '1..*' )
                    {
                    // InternalMyDsl.g:240:2: ( '1..*' )
                    // InternalMyDsl.g:241:3: '1..*'
                    {
                     before(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:246:2: ( '*..1' )
                    {
                    // InternalMyDsl.g:246:2: ( '*..1' )
                    // InternalMyDsl.g:247:3: '*..1'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopDigitOneKeyword_3()); 
                    match(input,16,FOLLOW_2); 
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:256:1: rule__Type__Alternatives : ( ( 'Number' ) | ( 'String' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:260:1: ( ( 'Number' ) | ( 'String' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:261:2: ( 'Number' )
                    {
                    // InternalMyDsl.g:261:2: ( 'Number' )
                    // InternalMyDsl.g:262:3: 'Number'
                    {
                     before(grammarAccess.getTypeAccess().getNumberKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getNumberKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:267:2: ( 'String' )
                    {
                    // InternalMyDsl.g:267:2: ( 'String' )
                    // InternalMyDsl.g:268:3: 'String'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__System__Group__0"
    // InternalMyDsl.g:277:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalMyDsl.g:282:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalMyDsl.g:289:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:293:1: ( ( 'system' ) )
            // InternalMyDsl.g:294:1: ( 'system' )
            {
            // InternalMyDsl.g:294:1: ( 'system' )
            // InternalMyDsl.g:295:2: 'system'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalMyDsl.g:304:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:308:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalMyDsl.g:309:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalMyDsl.g:316:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:320:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // InternalMyDsl.g:321:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:321:1: ( ( rule__System__NameAssignment_1 ) )
            // InternalMyDsl.g:322:2: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:323:2: ( rule__System__NameAssignment_1 )
            // InternalMyDsl.g:323:3: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalMyDsl.g:331:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:335:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalMyDsl.g:336:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__3();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalMyDsl.g:343:1: rule__System__Group__2__Impl : ( ( rule__System__EntitiesAssignment_2 )* ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:347:1: ( ( ( rule__System__EntitiesAssignment_2 )* ) )
            // InternalMyDsl.g:348:1: ( ( rule__System__EntitiesAssignment_2 )* )
            {
            // InternalMyDsl.g:348:1: ( ( rule__System__EntitiesAssignment_2 )* )
            // InternalMyDsl.g:349:2: ( rule__System__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getSystemAccess().getEntitiesAssignment_2()); 
            // InternalMyDsl.g:350:2: ( rule__System__EntitiesAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:350:3: rule__System__EntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__System__EntitiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getEntitiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalMyDsl.g:358:1: rule__System__Group__3 : rule__System__Group__3__Impl ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:362:1: ( rule__System__Group__3__Impl )
            // InternalMyDsl.g:363:2: rule__System__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__3__Impl();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalMyDsl.g:369:1: rule__System__Group__3__Impl : ( ( rule__System__RelationsAssignment_3 )* ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:1: ( ( ( rule__System__RelationsAssignment_3 )* ) )
            // InternalMyDsl.g:374:1: ( ( rule__System__RelationsAssignment_3 )* )
            {
            // InternalMyDsl.g:374:1: ( ( rule__System__RelationsAssignment_3 )* )
            // InternalMyDsl.g:375:2: ( rule__System__RelationsAssignment_3 )*
            {
             before(grammarAccess.getSystemAccess().getRelationsAssignment_3()); 
            // InternalMyDsl.g:376:2: ( rule__System__RelationsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:376:3: rule__System__RelationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__System__RelationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getRelationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalMyDsl.g:385:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:390:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalMyDsl.g:397:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:401:1: ( ( 'entity' ) )
            // InternalMyDsl.g:402:1: ( 'entity' )
            {
            // InternalMyDsl.g:402:1: ( 'entity' )
            // InternalMyDsl.g:403:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:412:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyDsl.g:417:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalMyDsl.g:424:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:428:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:429:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:429:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMyDsl.g:430:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:431:2: ( rule__Entity__NameAssignment_1 )
            // InternalMyDsl.g:431:3: rule__Entity__NameAssignment_1
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
    // InternalMyDsl.g:439:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalMyDsl.g:444:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalMyDsl.g:451:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:455:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalMyDsl.g:456:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalMyDsl.g:456:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalMyDsl.g:457:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalMyDsl.g:458:2: ( rule__Entity__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:458:3: rule__Entity__Group_2__0
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
    // InternalMyDsl.g:466:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:470:1: ( rule__Entity__Group__3__Impl )
            // InternalMyDsl.g:471:2: rule__Entity__Group__3__Impl
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
    // InternalMyDsl.g:477:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:481:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalMyDsl.g:482:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalMyDsl.g:482:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalMyDsl.g:483:2: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalMyDsl.g:484:2: ( rule__Entity__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:484:3: rule__Entity__Group_3__0
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
    // InternalMyDsl.g:493:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:497:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalMyDsl.g:498:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalMyDsl.g:505:1: rule__Entity__Group_2__0__Impl : ( 'is' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:509:1: ( ( 'is' ) )
            // InternalMyDsl.g:510:1: ( 'is' )
            {
            // InternalMyDsl.g:510:1: ( 'is' )
            // InternalMyDsl.g:511:2: 'is'
            {
             before(grammarAccess.getEntityAccess().getIsKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:520:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:524:1: ( rule__Entity__Group_2__1__Impl )
            // InternalMyDsl.g:525:2: rule__Entity__Group_2__1__Impl
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
    // InternalMyDsl.g:531:1: rule__Entity__Group_2__1__Impl : ( 'weak' ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:535:1: ( ( 'weak' ) )
            // InternalMyDsl.g:536:1: ( 'weak' )
            {
            // InternalMyDsl.g:536:1: ( 'weak' )
            // InternalMyDsl.g:537:2: 'weak'
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
    // InternalMyDsl.g:547:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:551:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalMyDsl.g:552:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
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
    // InternalMyDsl.g:559:1: rule__Entity__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:563:1: ( ( '{' ) )
            // InternalMyDsl.g:564:1: ( '{' )
            {
            // InternalMyDsl.g:564:1: ( '{' )
            // InternalMyDsl.g:565:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:574:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:578:1: ( rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 )
            // InternalMyDsl.g:579:2: rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2
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
    // InternalMyDsl.g:586:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__AttributesAssignment_3_1 )* ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:590:1: ( ( ( rule__Entity__AttributesAssignment_3_1 )* ) )
            // InternalMyDsl.g:591:1: ( ( rule__Entity__AttributesAssignment_3_1 )* )
            {
            // InternalMyDsl.g:591:1: ( ( rule__Entity__AttributesAssignment_3_1 )* )
            // InternalMyDsl.g:592:2: ( rule__Entity__AttributesAssignment_3_1 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3_1()); 
            // InternalMyDsl.g:593:2: ( rule__Entity__AttributesAssignment_3_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:593:3: rule__Entity__AttributesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__AttributesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMyDsl.g:601:1: rule__Entity__Group_3__2 : rule__Entity__Group_3__2__Impl ;
    public final void rule__Entity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( rule__Entity__Group_3__2__Impl )
            // InternalMyDsl.g:606:2: rule__Entity__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__2__Impl();

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
    // InternalMyDsl.g:612:1: rule__Entity__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Entity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:1: ( ( '}' ) )
            // InternalMyDsl.g:617:1: ( '}' )
            {
            // InternalMyDsl.g:617:1: ( '}' )
            // InternalMyDsl.g:618:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDsl.g:628:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:633:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalMyDsl.g:640:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:644:1: ( ( 'attribute' ) )
            // InternalMyDsl.g:645:1: ( 'attribute' )
            {
            // InternalMyDsl.g:645:1: ( 'attribute' )
            // InternalMyDsl.g:646:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:655:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:660:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:667:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:671:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyDsl.g:672:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:672:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyDsl.g:673:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:674:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyDsl.g:674:3: rule__Attribute__NameAssignment_1
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
    // InternalMyDsl.g:682:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalMyDsl.g:687:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:694:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // InternalMyDsl.g:699:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // InternalMyDsl.g:699:1: ( ( rule__Attribute__Group_2__0 )? )
            // InternalMyDsl.g:700:2: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // InternalMyDsl.g:701:2: ( rule__Attribute__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:701:3: rule__Attribute__Group_2__0
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
    // InternalMyDsl.g:709:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalMyDsl.g:714:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:721:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__Group_3__0 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:725:1: ( ( ( rule__Attribute__Group_3__0 )? ) )
            // InternalMyDsl.g:726:1: ( ( rule__Attribute__Group_3__0 )? )
            {
            // InternalMyDsl.g:726:1: ( ( rule__Attribute__Group_3__0 )? )
            // InternalMyDsl.g:727:2: ( rule__Attribute__Group_3__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_3()); 
            // InternalMyDsl.g:728:2: ( rule__Attribute__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:728:3: rule__Attribute__Group_3__0
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
    // InternalMyDsl.g:736:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( rule__Attribute__Group__4__Impl )
            // InternalMyDsl.g:741:2: rule__Attribute__Group__4__Impl
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
    // InternalMyDsl.g:747:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:751:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // InternalMyDsl.g:752:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // InternalMyDsl.g:752:1: ( ( rule__Attribute__Group_4__0 )? )
            // InternalMyDsl.g:753:2: ( rule__Attribute__Group_4__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_4()); 
            // InternalMyDsl.g:754:2: ( rule__Attribute__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:754:3: rule__Attribute__Group_4__0
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
    // InternalMyDsl.g:763:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalMyDsl.g:768:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:775:1: rule__Attribute__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:779:1: ( ( '[' ) )
            // InternalMyDsl.g:780:1: ( '[' )
            {
            // InternalMyDsl.g:780:1: ( '[' )
            // InternalMyDsl.g:781:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:790:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:794:1: ( rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 )
            // InternalMyDsl.g:795:2: rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:802:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__Group_2_1__0 )? ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:806:1: ( ( ( rule__Attribute__Group_2_1__0 )? ) )
            // InternalMyDsl.g:807:1: ( ( rule__Attribute__Group_2_1__0 )? )
            {
            // InternalMyDsl.g:807:1: ( ( rule__Attribute__Group_2_1__0 )? )
            // InternalMyDsl.g:808:2: ( rule__Attribute__Group_2_1__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_1()); 
            // InternalMyDsl.g:809:2: ( rule__Attribute__Group_2_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:809:3: rule__Attribute__Group_2_1__0
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
    // InternalMyDsl.g:817:1: rule__Attribute__Group_2__2 : rule__Attribute__Group_2__2__Impl ;
    public final void rule__Attribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( rule__Attribute__Group_2__2__Impl )
            // InternalMyDsl.g:822:2: rule__Attribute__Group_2__2__Impl
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
    // InternalMyDsl.g:828:1: rule__Attribute__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:832:1: ( ( ']' ) )
            // InternalMyDsl.g:833:1: ( ']' )
            {
            // InternalMyDsl.g:833:1: ( ']' )
            // InternalMyDsl.g:834:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:844:1: rule__Attribute__Group_2_1__0 : rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 ;
    public final void rule__Attribute__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 )
            // InternalMyDsl.g:849:2: rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:856:1: rule__Attribute__Group_2_1__0__Impl : ( RULE_ID ) ;
    public final void rule__Attribute__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:860:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:861:1: ( RULE_ID )
            {
            // InternalMyDsl.g:861:1: ( RULE_ID )
            // InternalMyDsl.g:862:2: RULE_ID
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
    // InternalMyDsl.g:871:1: rule__Attribute__Group_2_1__1 : rule__Attribute__Group_2_1__1__Impl ;
    public final void rule__Attribute__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( rule__Attribute__Group_2_1__1__Impl )
            // InternalMyDsl.g:876:2: rule__Attribute__Group_2_1__1__Impl
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
    // InternalMyDsl.g:882:1: rule__Attribute__Group_2_1__1__Impl : ( ( rule__Attribute__Group_2_1_1__0 )* ) ;
    public final void rule__Attribute__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:886:1: ( ( ( rule__Attribute__Group_2_1_1__0 )* ) )
            // InternalMyDsl.g:887:1: ( ( rule__Attribute__Group_2_1_1__0 )* )
            {
            // InternalMyDsl.g:887:1: ( ( rule__Attribute__Group_2_1_1__0 )* )
            // InternalMyDsl.g:888:2: ( rule__Attribute__Group_2_1_1__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_1_1()); 
            // InternalMyDsl.g:889:2: ( rule__Attribute__Group_2_1_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:889:3: rule__Attribute__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Attribute__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:898:1: rule__Attribute__Group_2_1_1__0 : rule__Attribute__Group_2_1_1__0__Impl rule__Attribute__Group_2_1_1__1 ;
    public final void rule__Attribute__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( rule__Attribute__Group_2_1_1__0__Impl rule__Attribute__Group_2_1_1__1 )
            // InternalMyDsl.g:903:2: rule__Attribute__Group_2_1_1__0__Impl rule__Attribute__Group_2_1_1__1
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
    // InternalMyDsl.g:910:1: rule__Attribute__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:914:1: ( ( ',' ) )
            // InternalMyDsl.g:915:1: ( ',' )
            {
            // InternalMyDsl.g:915:1: ( ',' )
            // InternalMyDsl.g:916:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_2_1_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:925:1: rule__Attribute__Group_2_1_1__1 : rule__Attribute__Group_2_1_1__1__Impl ;
    public final void rule__Attribute__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( rule__Attribute__Group_2_1_1__1__Impl )
            // InternalMyDsl.g:930:2: rule__Attribute__Group_2_1_1__1__Impl
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
    // InternalMyDsl.g:936:1: rule__Attribute__Group_2_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Attribute__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:940:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:941:1: ( RULE_ID )
            {
            // InternalMyDsl.g:941:1: ( RULE_ID )
            // InternalMyDsl.g:942:2: RULE_ID
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
    // InternalMyDsl.g:952:1: rule__Attribute__Group_3__0 : rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 ;
    public final void rule__Attribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 )
            // InternalMyDsl.g:957:2: rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:964:1: rule__Attribute__Group_3__0__Impl : ( 'is' ) ;
    public final void rule__Attribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( ( 'is' ) )
            // InternalMyDsl.g:969:1: ( 'is' )
            {
            // InternalMyDsl.g:969:1: ( 'is' )
            // InternalMyDsl.g:970:2: 'is'
            {
             before(grammarAccess.getAttributeAccess().getIsKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:979:1: rule__Attribute__Group_3__1 : rule__Attribute__Group_3__1__Impl ;
    public final void rule__Attribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:983:1: ( rule__Attribute__Group_3__1__Impl )
            // InternalMyDsl.g:984:2: rule__Attribute__Group_3__1__Impl
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
    // InternalMyDsl.g:990:1: rule__Attribute__Group_3__1__Impl : ( ( rule__Attribute__Alternatives_3_1 ) ) ;
    public final void rule__Attribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:994:1: ( ( ( rule__Attribute__Alternatives_3_1 ) ) )
            // InternalMyDsl.g:995:1: ( ( rule__Attribute__Alternatives_3_1 ) )
            {
            // InternalMyDsl.g:995:1: ( ( rule__Attribute__Alternatives_3_1 ) )
            // InternalMyDsl.g:996:2: ( rule__Attribute__Alternatives_3_1 )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_3_1()); 
            // InternalMyDsl.g:997:2: ( rule__Attribute__Alternatives_3_1 )
            // InternalMyDsl.g:997:3: rule__Attribute__Alternatives_3_1
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
    // InternalMyDsl.g:1006:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // InternalMyDsl.g:1011:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1018:1: rule__Attribute__Group_4__0__Impl : ( 'as' ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( ( 'as' ) )
            // InternalMyDsl.g:1023:1: ( 'as' )
            {
            // InternalMyDsl.g:1023:1: ( 'as' )
            // InternalMyDsl.g:1024:2: 'as'
            {
             before(grammarAccess.getAttributeAccess().getAsKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1033:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( rule__Attribute__Group_4__1__Impl )
            // InternalMyDsl.g:1038:2: rule__Attribute__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4__1__Impl();

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
    // InternalMyDsl.g:1044:1: rule__Attribute__Group_4__1__Impl : ( ( rule__Attribute__TypeAssignment_4_1 ) ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1048:1: ( ( ( rule__Attribute__TypeAssignment_4_1 ) ) )
            // InternalMyDsl.g:1049:1: ( ( rule__Attribute__TypeAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1049:1: ( ( rule__Attribute__TypeAssignment_4_1 ) )
            // InternalMyDsl.g:1050:2: ( rule__Attribute__TypeAssignment_4_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4_1()); 
            // InternalMyDsl.g:1051:2: ( rule__Attribute__TypeAssignment_4_1 )
            // InternalMyDsl.g:1051:3: rule__Attribute__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Relation__Group__0"
    // InternalMyDsl.g:1060:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1064:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalMyDsl.g:1065:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
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
    // InternalMyDsl.g:1072:1: rule__Relation__Group__0__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( ( 'relation' ) )
            // InternalMyDsl.g:1077:1: ( 'relation' )
            {
            // InternalMyDsl.g:1077:1: ( 'relation' )
            // InternalMyDsl.g:1078:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1087:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalMyDsl.g:1092:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
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
    // InternalMyDsl.g:1099:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__FromEntityAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1103:1: ( ( ( rule__Relation__FromEntityAssignment_1 ) ) )
            // InternalMyDsl.g:1104:1: ( ( rule__Relation__FromEntityAssignment_1 ) )
            {
            // InternalMyDsl.g:1104:1: ( ( rule__Relation__FromEntityAssignment_1 ) )
            // InternalMyDsl.g:1105:2: ( rule__Relation__FromEntityAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getFromEntityAssignment_1()); 
            // InternalMyDsl.g:1106:2: ( rule__Relation__FromEntityAssignment_1 )
            // InternalMyDsl.g:1106:3: rule__Relation__FromEntityAssignment_1
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
    // InternalMyDsl.g:1114:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1118:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalMyDsl.g:1119:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
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
    // InternalMyDsl.g:1126:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__NameAssignment_2 ) ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:1: ( ( ( rule__Relation__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1131:1: ( ( rule__Relation__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1131:1: ( ( rule__Relation__NameAssignment_2 ) )
            // InternalMyDsl.g:1132:2: ( rule__Relation__NameAssignment_2 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1133:2: ( rule__Relation__NameAssignment_2 )
            // InternalMyDsl.g:1133:3: rule__Relation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NameAssignment_2();

            state._fsp--;


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
    // InternalMyDsl.g:1141:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalMyDsl.g:1146:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1153:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__ToEntityAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1157:1: ( ( ( rule__Relation__ToEntityAssignment_3 ) ) )
            // InternalMyDsl.g:1158:1: ( ( rule__Relation__ToEntityAssignment_3 ) )
            {
            // InternalMyDsl.g:1158:1: ( ( rule__Relation__ToEntityAssignment_3 ) )
            // InternalMyDsl.g:1159:2: ( rule__Relation__ToEntityAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getToEntityAssignment_3()); 
            // InternalMyDsl.g:1160:2: ( rule__Relation__ToEntityAssignment_3 )
            // InternalMyDsl.g:1160:3: rule__Relation__ToEntityAssignment_3
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
    // InternalMyDsl.g:1168:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1172:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalMyDsl.g:1173:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
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
    // InternalMyDsl.g:1180:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__CardinalityAssignment_4 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1184:1: ( ( ( rule__Relation__CardinalityAssignment_4 ) ) )
            // InternalMyDsl.g:1185:1: ( ( rule__Relation__CardinalityAssignment_4 ) )
            {
            // InternalMyDsl.g:1185:1: ( ( rule__Relation__CardinalityAssignment_4 ) )
            // InternalMyDsl.g:1186:2: ( rule__Relation__CardinalityAssignment_4 )
            {
             before(grammarAccess.getRelationAccess().getCardinalityAssignment_4()); 
            // InternalMyDsl.g:1187:2: ( rule__Relation__CardinalityAssignment_4 )
            // InternalMyDsl.g:1187:3: rule__Relation__CardinalityAssignment_4
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
    // InternalMyDsl.g:1195:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1199:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // InternalMyDsl.g:1200:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
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
    // InternalMyDsl.g:1207:1: rule__Relation__Group__5__Impl : ( ( rule__Relation__Group_5__0 )? ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( ( ( rule__Relation__Group_5__0 )? ) )
            // InternalMyDsl.g:1212:1: ( ( rule__Relation__Group_5__0 )? )
            {
            // InternalMyDsl.g:1212:1: ( ( rule__Relation__Group_5__0 )? )
            // InternalMyDsl.g:1213:2: ( rule__Relation__Group_5__0 )?
            {
             before(grammarAccess.getRelationAccess().getGroup_5()); 
            // InternalMyDsl.g:1214:2: ( rule__Relation__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1214:3: rule__Relation__Group_5__0
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
    // InternalMyDsl.g:1222:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1226:1: ( rule__Relation__Group__6__Impl )
            // InternalMyDsl.g:1227:2: rule__Relation__Group__6__Impl
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
    // InternalMyDsl.g:1233:1: rule__Relation__Group__6__Impl : ( ( rule__Relation__Group_6__0 )? ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1237:1: ( ( ( rule__Relation__Group_6__0 )? ) )
            // InternalMyDsl.g:1238:1: ( ( rule__Relation__Group_6__0 )? )
            {
            // InternalMyDsl.g:1238:1: ( ( rule__Relation__Group_6__0 )? )
            // InternalMyDsl.g:1239:2: ( rule__Relation__Group_6__0 )?
            {
             before(grammarAccess.getRelationAccess().getGroup_6()); 
            // InternalMyDsl.g:1240:2: ( rule__Relation__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1240:3: rule__Relation__Group_6__0
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
    // InternalMyDsl.g:1249:1: rule__Relation__Group_5__0 : rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1 ;
    public final void rule__Relation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1 )
            // InternalMyDsl.g:1254:2: rule__Relation__Group_5__0__Impl rule__Relation__Group_5__1
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
    // InternalMyDsl.g:1261:1: rule__Relation__Group_5__0__Impl : ( 'is' ) ;
    public final void rule__Relation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( ( 'is' ) )
            // InternalMyDsl.g:1266:1: ( 'is' )
            {
            // InternalMyDsl.g:1266:1: ( 'is' )
            // InternalMyDsl.g:1267:2: 'is'
            {
             before(grammarAccess.getRelationAccess().getIsKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1276:1: rule__Relation__Group_5__1 : rule__Relation__Group_5__1__Impl ;
    public final void rule__Relation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1280:1: ( rule__Relation__Group_5__1__Impl )
            // InternalMyDsl.g:1281:2: rule__Relation__Group_5__1__Impl
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
    // InternalMyDsl.g:1287:1: rule__Relation__Group_5__1__Impl : ( 'weak' ) ;
    public final void rule__Relation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1291:1: ( ( 'weak' ) )
            // InternalMyDsl.g:1292:1: ( 'weak' )
            {
            // InternalMyDsl.g:1292:1: ( 'weak' )
            // InternalMyDsl.g:1293:2: 'weak'
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
    // InternalMyDsl.g:1303:1: rule__Relation__Group_6__0 : rule__Relation__Group_6__0__Impl rule__Relation__Group_6__1 ;
    public final void rule__Relation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1307:1: ( rule__Relation__Group_6__0__Impl rule__Relation__Group_6__1 )
            // InternalMyDsl.g:1308:2: rule__Relation__Group_6__0__Impl rule__Relation__Group_6__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1315:1: rule__Relation__Group_6__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1319:1: ( ( '{' ) )
            // InternalMyDsl.g:1320:1: ( '{' )
            {
            // InternalMyDsl.g:1320:1: ( '{' )
            // InternalMyDsl.g:1321:2: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1330:1: rule__Relation__Group_6__1 : rule__Relation__Group_6__1__Impl rule__Relation__Group_6__2 ;
    public final void rule__Relation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1334:1: ( rule__Relation__Group_6__1__Impl rule__Relation__Group_6__2 )
            // InternalMyDsl.g:1335:2: rule__Relation__Group_6__1__Impl rule__Relation__Group_6__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1342:1: rule__Relation__Group_6__1__Impl : ( ( rule__Relation__AttributesAssignment_6_1 )* ) ;
    public final void rule__Relation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( ( ( rule__Relation__AttributesAssignment_6_1 )* ) )
            // InternalMyDsl.g:1347:1: ( ( rule__Relation__AttributesAssignment_6_1 )* )
            {
            // InternalMyDsl.g:1347:1: ( ( rule__Relation__AttributesAssignment_6_1 )* )
            // InternalMyDsl.g:1348:2: ( rule__Relation__AttributesAssignment_6_1 )*
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_6_1()); 
            // InternalMyDsl.g:1349:2: ( rule__Relation__AttributesAssignment_6_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1349:3: rule__Relation__AttributesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Relation__AttributesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMyDsl.g:1357:1: rule__Relation__Group_6__2 : rule__Relation__Group_6__2__Impl ;
    public final void rule__Relation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1361:1: ( rule__Relation__Group_6__2__Impl )
            // InternalMyDsl.g:1362:2: rule__Relation__Group_6__2__Impl
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
    // InternalMyDsl.g:1368:1: rule__Relation__Group_6__2__Impl : ( '}' ) ;
    public final void rule__Relation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1372:1: ( ( '}' ) )
            // InternalMyDsl.g:1373:1: ( '}' )
            {
            // InternalMyDsl.g:1373:1: ( '}' )
            // InternalMyDsl.g:1374:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_6_2()); 
            match(input,23,FOLLOW_2); 
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


    // $ANTLR start "rule__System__NameAssignment_1"
    // InternalMyDsl.g:1384:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1388:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1389:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1389:2: ( RULE_ID )
            // InternalMyDsl.g:1390:3: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__EntitiesAssignment_2"
    // InternalMyDsl.g:1399:1: rule__System__EntitiesAssignment_2 : ( ruleEntity ) ;
    public final void rule__System__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1403:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:1404:2: ( ruleEntity )
            {
            // InternalMyDsl.g:1404:2: ( ruleEntity )
            // InternalMyDsl.g:1405:3: ruleEntity
            {
             before(grammarAccess.getSystemAccess().getEntitiesEntityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getEntitiesEntityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__EntitiesAssignment_2"


    // $ANTLR start "rule__System__RelationsAssignment_3"
    // InternalMyDsl.g:1414:1: rule__System__RelationsAssignment_3 : ( ruleRelation ) ;
    public final void rule__System__RelationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1418:1: ( ( ruleRelation ) )
            // InternalMyDsl.g:1419:2: ( ruleRelation )
            {
            // InternalMyDsl.g:1419:2: ( ruleRelation )
            // InternalMyDsl.g:1420:3: ruleRelation
            {
             before(grammarAccess.getSystemAccess().getRelationsRelationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getRelationsRelationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__RelationsAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalMyDsl.g:1429:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1434:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1434:2: ( RULE_ID )
            // InternalMyDsl.g:1435:3: RULE_ID
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
    // InternalMyDsl.g:1444:1: rule__Entity__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:1449:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:1449:2: ( ruleAttribute )
            // InternalMyDsl.g:1450:3: ruleAttribute
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


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDsl.g:1459:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1464:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1464:2: ( RULE_ID )
            // InternalMyDsl.g:1465:3: RULE_ID
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


    // $ANTLR start "rule__Attribute__TypeAssignment_4_1"
    // InternalMyDsl.g:1474:1: rule__Attribute__TypeAssignment_4_1 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1478:1: ( ( ruleType ) )
            // InternalMyDsl.g:1479:2: ( ruleType )
            {
            // InternalMyDsl.g:1479:2: ( ruleType )
            // InternalMyDsl.g:1480:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_4_1"


    // $ANTLR start "rule__Relation__FromEntityAssignment_1"
    // InternalMyDsl.g:1489:1: rule__Relation__FromEntityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__FromEntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1493:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1494:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1494:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1495:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getFromEntityEntityCrossReference_1_0()); 
            // InternalMyDsl.g:1496:3: ( RULE_ID )
            // InternalMyDsl.g:1497:4: RULE_ID
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
    // InternalMyDsl.g:1508:1: rule__Relation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1512:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1513:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1513:2: ( RULE_ID )
            // InternalMyDsl.g:1514:3: RULE_ID
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
    // InternalMyDsl.g:1523:1: rule__Relation__ToEntityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ToEntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1528:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1528:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1529:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getToEntityEntityCrossReference_3_0()); 
            // InternalMyDsl.g:1530:3: ( RULE_ID )
            // InternalMyDsl.g:1531:4: RULE_ID
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
    // InternalMyDsl.g:1542:1: rule__Relation__CardinalityAssignment_4 : ( ruleCardinality ) ;
    public final void rule__Relation__CardinalityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1546:1: ( ( ruleCardinality ) )
            // InternalMyDsl.g:1547:2: ( ruleCardinality )
            {
            // InternalMyDsl.g:1547:2: ( ruleCardinality )
            // InternalMyDsl.g:1548:3: ruleCardinality
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
    // InternalMyDsl.g:1557:1: rule__Relation__AttributesAssignment_6_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1561:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:1562:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:1562:2: ( ruleAttribute )
            // InternalMyDsl.g:1563:3: ruleAttribute
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000012200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000001E000L});

}