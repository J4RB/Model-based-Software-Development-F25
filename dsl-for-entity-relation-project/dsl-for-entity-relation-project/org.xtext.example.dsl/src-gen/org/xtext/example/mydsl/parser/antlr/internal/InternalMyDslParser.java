package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'entity'", "'is'", "'weak'", "'{'", "'}'", "'attribute'", "'['", "','", "']'", "'key'", "'as'", "'('", "')'", "'relation'", "'1..1'", "'*..*'", "'1..*'", "'*..1'", "'require'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'true'", "'false'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SystemRoot";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystemRoot"
    // InternalMyDsl.g:64:1: entryRuleSystemRoot returns [EObject current=null] : iv_ruleSystemRoot= ruleSystemRoot EOF ;
    public final EObject entryRuleSystemRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemRoot = null;


        try {
            // InternalMyDsl.g:64:51: (iv_ruleSystemRoot= ruleSystemRoot EOF )
            // InternalMyDsl.g:65:2: iv_ruleSystemRoot= ruleSystemRoot EOF
            {
             newCompositeNode(grammarAccess.getSystemRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemRoot=ruleSystemRoot();

            state._fsp--;

             current =iv_ruleSystemRoot; 
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
    // $ANTLR end "entryRuleSystemRoot"


    // $ANTLR start "ruleSystemRoot"
    // InternalMyDsl.g:71:1: ruleSystemRoot returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* ) ;
    public final EObject ruleSystemRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_entities_2_0 = null;

        EObject lv_relations_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemRootAccess().getSystemKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemRootAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRootRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:101:3: ( (lv_entities_2_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:102:4: (lv_entities_2_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:102:4: (lv_entities_2_0= ruleEntity )
            	    // InternalMyDsl.g:103:5: lv_entities_2_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getSystemRootAccess().getEntitiesEntityParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_entities_2_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:120:3: ( (lv_relations_3_0= ruleRelation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:121:4: (lv_relations_3_0= ruleRelation )
            	    {
            	    // InternalMyDsl.g:121:4: (lv_relations_3_0= ruleRelation )
            	    // InternalMyDsl.g:122:5: lv_relations_3_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getSystemRootAccess().getRelationsRelationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_relations_3_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleSystemRoot"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:143:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:143:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:144:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:150:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' otherlv_3= 'weak' )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* ( (lv_requires_6_0= ruleRequire ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_attributes_5_0 = null;

        EObject lv_requires_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:156:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' otherlv_3= 'weak' )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* ( (lv_requires_6_0= ruleRequire ) )* otherlv_7= '}' )? ) )
            // InternalMyDsl.g:157:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' otherlv_3= 'weak' )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* ( (lv_requires_6_0= ruleRequire ) )* otherlv_7= '}' )? )
            {
            // InternalMyDsl.g:157:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' otherlv_3= 'weak' )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* ( (lv_requires_6_0= ruleRequire ) )* otherlv_7= '}' )? )
            // InternalMyDsl.g:158:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' otherlv_3= 'weak' )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* ( (lv_requires_6_0= ruleRequire ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:180:3: (otherlv_2= 'is' otherlv_3= 'weak' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:181:4: otherlv_2= 'is' otherlv_3= 'weak'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getIsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getWeakKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:190:3: (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* ( (lv_requires_6_0= ruleRequire ) )* otherlv_7= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:191:4: otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* ( (lv_requires_6_0= ruleRequire ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalMyDsl.g:195:4: ( (lv_attributes_5_0= ruleAttribute ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:196:5: (lv_attributes_5_0= ruleAttribute )
                    	    {
                    	    // InternalMyDsl.g:196:5: (lv_attributes_5_0= ruleAttribute )
                    	    // InternalMyDsl.g:197:6: lv_attributes_5_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_attributes_5_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_5_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // InternalMyDsl.g:214:4: ( (lv_requires_6_0= ruleRequire ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==30) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:215:5: (lv_requires_6_0= ruleRequire )
                    	    {
                    	    // InternalMyDsl.g:215:5: (lv_requires_6_0= ruleRequire )
                    	    // InternalMyDsl.g:216:6: lv_requires_6_0= ruleRequire
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityAccess().getRequiresRequireParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_requires_6_0=ruleRequire();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"requires",
                    	    							lv_requires_6_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Require");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_3());
                    			

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:242:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:242:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:243:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:249:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )? otherlv_6= ']' )? (otherlv_7= 'is' (otherlv_8= 'weak' | otherlv_9= 'key' ) )? (otherlv_10= 'as' this_ID_11= RULE_ID ( (otherlv_12= '(' | otherlv_13= '[' ) this_INT_14= RULE_INT (otherlv_15= ']' | otherlv_16= ')' ) )? )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_ID_3=null;
        Token otherlv_4=null;
        Token this_ID_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_ID_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token this_INT_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalMyDsl.g:255:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )? otherlv_6= ']' )? (otherlv_7= 'is' (otherlv_8= 'weak' | otherlv_9= 'key' ) )? (otherlv_10= 'as' this_ID_11= RULE_ID ( (otherlv_12= '(' | otherlv_13= '[' ) this_INT_14= RULE_INT (otherlv_15= ']' | otherlv_16= ')' ) )? )? ) )
            // InternalMyDsl.g:256:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )? otherlv_6= ']' )? (otherlv_7= 'is' (otherlv_8= 'weak' | otherlv_9= 'key' ) )? (otherlv_10= 'as' this_ID_11= RULE_ID ( (otherlv_12= '(' | otherlv_13= '[' ) this_INT_14= RULE_INT (otherlv_15= ']' | otherlv_16= ')' ) )? )? )
            {
            // InternalMyDsl.g:256:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )? otherlv_6= ']' )? (otherlv_7= 'is' (otherlv_8= 'weak' | otherlv_9= 'key' ) )? (otherlv_10= 'as' this_ID_11= RULE_ID ( (otherlv_12= '(' | otherlv_13= '[' ) this_INT_14= RULE_INT (otherlv_15= ']' | otherlv_16= ')' ) )? )? )
            // InternalMyDsl.g:257:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )? otherlv_6= ']' )? (otherlv_7= 'is' (otherlv_8= 'weak' | otherlv_9= 'key' ) )? (otherlv_10= 'as' this_ID_11= RULE_ID ( (otherlv_12= '(' | otherlv_13= '[' ) this_INT_14= RULE_INT (otherlv_15= ']' | otherlv_16= ')' ) )? )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalMyDsl.g:261:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:262:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:262:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:263:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:279:3: (otherlv_2= '[' (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )? otherlv_6= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:280:4: otherlv_2= '[' (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )? otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalMyDsl.g:284:4: (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:285:5: this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )*
                            {
                            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_13); 

                            					newLeafNode(this_ID_3, grammarAccess.getAttributeAccess().getIDTerminalRuleCall_2_1_0());
                            				
                            // InternalMyDsl.g:289:5: (otherlv_4= ',' this_ID_5= RULE_ID )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==19) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalMyDsl.g:290:6: otherlv_4= ',' this_ID_5= RULE_ID
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_3); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_13); 

                            	    						newLeafNode(this_ID_5, grammarAccess.getAttributeAccess().getIDTerminalRuleCall_2_1_1_1());
                            	    					

                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:305:3: (otherlv_7= 'is' (otherlv_8= 'weak' | otherlv_9= 'key' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:306:4: otherlv_7= 'is' (otherlv_8= 'weak' | otherlv_9= 'key' )
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getIsKeyword_3_0());
                    			
                    // InternalMyDsl.g:310:4: (otherlv_8= 'weak' | otherlv_9= 'key' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==14) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==21) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyDsl.g:311:5: otherlv_8= 'weak'
                            {
                            otherlv_8=(Token)match(input,14,FOLLOW_16); 

                            					newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getWeakKeyword_3_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:316:5: otherlv_9= 'key'
                            {
                            otherlv_9=(Token)match(input,21,FOLLOW_16); 

                            					newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getKeyKeyword_3_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:322:3: (otherlv_10= 'as' this_ID_11= RULE_ID ( (otherlv_12= '(' | otherlv_13= '[' ) this_INT_14= RULE_INT (otherlv_15= ']' | otherlv_16= ')' ) )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:323:4: otherlv_10= 'as' this_ID_11= RULE_ID ( (otherlv_12= '(' | otherlv_13= '[' ) this_INT_14= RULE_INT (otherlv_15= ']' | otherlv_16= ')' ) )?
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getAsKeyword_4_0());
                    			
                    this_ID_11=(Token)match(input,RULE_ID,FOLLOW_17); 

                    				newLeafNode(this_ID_11, grammarAccess.getAttributeAccess().getIDTerminalRuleCall_4_1());
                    			
                    // InternalMyDsl.g:331:4: ( (otherlv_12= '(' | otherlv_13= '[' ) this_INT_14= RULE_INT (otherlv_15= ']' | otherlv_16= ')' ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==18||LA14_0==23) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyDsl.g:332:5: (otherlv_12= '(' | otherlv_13= '[' ) this_INT_14= RULE_INT (otherlv_15= ']' | otherlv_16= ')' )
                            {
                            // InternalMyDsl.g:332:5: (otherlv_12= '(' | otherlv_13= '[' )
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==23) ) {
                                alt12=1;
                            }
                            else if ( (LA12_0==18) ) {
                                alt12=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 0, input);

                                throw nvae;
                            }
                            switch (alt12) {
                                case 1 :
                                    // InternalMyDsl.g:333:6: otherlv_12= '('
                                    {
                                    otherlv_12=(Token)match(input,23,FOLLOW_18); 

                                    						newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_4_2_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:338:6: otherlv_13= '['
                                    {
                                    otherlv_13=(Token)match(input,18,FOLLOW_18); 

                                    						newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_4_2_0_1());
                                    					

                                    }
                                    break;

                            }

                            this_INT_14=(Token)match(input,RULE_INT,FOLLOW_19); 

                            					newLeafNode(this_INT_14, grammarAccess.getAttributeAccess().getINTTerminalRuleCall_4_2_1());
                            				
                            // InternalMyDsl.g:347:5: (otherlv_15= ']' | otherlv_16= ')' )
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==20) ) {
                                alt13=1;
                            }
                            else if ( (LA13_0==24) ) {
                                alt13=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 0, input);

                                throw nvae;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalMyDsl.g:348:6: otherlv_15= ']'
                                    {
                                    otherlv_15=(Token)match(input,20,FOLLOW_2); 

                                    						newLeafNode(otherlv_15, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_4_2_2_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:353:6: otherlv_16= ')'
                                    {
                                    otherlv_16=(Token)match(input,24,FOLLOW_2); 

                                    						newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_4_2_2_1());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:364:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:364:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:365:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:371:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relation' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= RULE_ID ) ) ( (lv_cardinality_4_0= ruleCardinality ) ) (otherlv_5= 'is' otherlv_6= 'weak' )? (otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_cardinality_4_0 = null;

        EObject lv_attributes_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:377:2: ( (otherlv_0= 'relation' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= RULE_ID ) ) ( (lv_cardinality_4_0= ruleCardinality ) ) (otherlv_5= 'is' otherlv_6= 'weak' )? (otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )? ) )
            // InternalMyDsl.g:378:2: (otherlv_0= 'relation' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= RULE_ID ) ) ( (lv_cardinality_4_0= ruleCardinality ) ) (otherlv_5= 'is' otherlv_6= 'weak' )? (otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )? )
            {
            // InternalMyDsl.g:378:2: (otherlv_0= 'relation' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= RULE_ID ) ) ( (lv_cardinality_4_0= ruleCardinality ) ) (otherlv_5= 'is' otherlv_6= 'weak' )? (otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )? )
            // InternalMyDsl.g:379:3: otherlv_0= 'relation' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= RULE_ID ) ) ( (lv_cardinality_4_0= ruleCardinality ) ) (otherlv_5= 'is' otherlv_6= 'weak' )? (otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalMyDsl.g:383:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:384:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:384:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:385:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getFromEntityEntityCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:396:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_ID) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:397:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:397:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:398:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:414:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:415:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:415:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:416:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getToEntityEntityCrossReference_3_0());
            				

            }


            }

            // InternalMyDsl.g:427:3: ( (lv_cardinality_4_0= ruleCardinality ) )
            // InternalMyDsl.g:428:4: (lv_cardinality_4_0= ruleCardinality )
            {
            // InternalMyDsl.g:428:4: (lv_cardinality_4_0= ruleCardinality )
            // InternalMyDsl.g:429:5: lv_cardinality_4_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getRelationAccess().getCardinalityCardinalityParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_cardinality_4_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationRule());
            					}
            					set(
            						current,
            						"cardinality",
            						lv_cardinality_4_0,
            						"org.xtext.example.mydsl.MyDsl.Cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:446:3: (otherlv_5= 'is' otherlv_6= 'weak' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:447:4: otherlv_5= 'is' otherlv_6= 'weak'
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getIsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getWeakKeyword_5_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:456:3: (otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:457:4: otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalMyDsl.g:461:4: ( (lv_attributes_8_0= ruleAttribute ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==17) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:462:5: (lv_attributes_8_0= ruleAttribute )
                    	    {
                    	    // InternalMyDsl.g:462:5: (lv_attributes_8_0= ruleAttribute )
                    	    // InternalMyDsl.g:463:6: lv_attributes_8_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_attributes_8_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRelationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_8_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_6_2());
                    			

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleCardinality"
    // InternalMyDsl.g:489:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalMyDsl.g:489:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalMyDsl.g:490:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality.getText(); 
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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalMyDsl.g:496:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '1..1' | kw= '*..*' | kw= '1..*' | kw= '*..1' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:502:2: ( (kw= '1..1' | kw= '*..*' | kw= '1..*' | kw= '*..1' ) )
            // InternalMyDsl.g:503:2: (kw= '1..1' | kw= '*..*' | kw= '1..*' | kw= '*..1' )
            {
            // InternalMyDsl.g:503:2: (kw= '1..1' | kw= '*..*' | kw= '1..*' | kw= '*..1' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt20=1;
                }
                break;
            case 27:
                {
                alt20=2;
                }
                break;
            case 28:
                {
                alt20=3;
                }
                break;
            case 29:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:504:3: kw= '1..1'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:510:3: kw= '*..*'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:516:3: kw= '1..*'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:522:3: kw= '*..1'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopDigitOneKeyword_3());
                    		

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleRequire"
    // InternalMyDsl.g:531:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalMyDsl.g:531:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalMyDsl.g:532:2: iv_ruleRequire= ruleRequire EOF
            {
             newCompositeNode(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequire=ruleRequire();

            state._fsp--;

             current =iv_ruleRequire; 
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
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalMyDsl.g:538:1: ruleRequire returns [EObject current=null] : (otherlv_0= 'require' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:544:2: ( (otherlv_0= 'require' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:545:2: (otherlv_0= 'require' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:545:2: (otherlv_0= 'require' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMyDsl.g:546:3: otherlv_0= 'require' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0());
            		
            // InternalMyDsl.g:550:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMyDsl.g:551:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMyDsl.g:551:4: (lv_expression_1_0= ruleExpression )
            // InternalMyDsl.g:552:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRequireAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequireRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:573:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:573:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:574:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:580:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:586:2: (this_Or_0= ruleOr )
            // InternalMyDsl.g:587:2: this_Or_0= ruleOr
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;


            		current = this_Or_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalMyDsl.g:598:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalMyDsl.g:598:43: (iv_ruleOr= ruleOr EOF )
            // InternalMyDsl.g:599:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalMyDsl.g:605:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:611:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalMyDsl.g:612:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalMyDsl.g:612:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalMyDsl.g:613:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:621:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:622:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalMyDsl.g:622:4: ()
            	    // InternalMyDsl.g:623:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_22); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalMyDsl.g:633:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalMyDsl.g:634:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalMyDsl.g:634:5: (lv_right_3_0= ruleAnd )
            	    // InternalMyDsl.g:635:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalMyDsl.g:657:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalMyDsl.g:657:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalMyDsl.g:658:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalMyDsl.g:664:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:670:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalMyDsl.g:671:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalMyDsl.g:671:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalMyDsl.g:672:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:680:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:681:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalMyDsl.g:681:4: ()
            	    // InternalMyDsl.g:682:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_22); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalMyDsl.g:692:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalMyDsl.g:693:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalMyDsl.g:693:5: (lv_right_3_0= ruleEquality )
            	    // InternalMyDsl.g:694:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalMyDsl.g:716:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalMyDsl.g:716:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalMyDsl.g:717:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalMyDsl.g:723:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:729:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalMyDsl.g:730:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalMyDsl.g:730:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalMyDsl.g:731:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:739:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=33 && LA24_0<=34)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:740:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalMyDsl.g:740:4: ()
            	    // InternalMyDsl.g:741:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyDsl.g:747:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalMyDsl.g:748:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalMyDsl.g:748:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalMyDsl.g:749:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalMyDsl.g:749:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==33) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==34) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalMyDsl.g:750:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,33,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:761:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,34,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMyDsl.g:774:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalMyDsl.g:775:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalMyDsl.g:775:5: (lv_right_3_0= ruleComparison )
            	    // InternalMyDsl.g:776:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalMyDsl.g:798:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalMyDsl.g:798:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalMyDsl.g:799:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMyDsl.g:805:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:811:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalMyDsl.g:812:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalMyDsl.g:812:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalMyDsl.g:813:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:821:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=35 && LA26_0<=38)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:822:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalMyDsl.g:822:4: ()
            	    // InternalMyDsl.g:823:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyDsl.g:829:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalMyDsl.g:830:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalMyDsl.g:830:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalMyDsl.g:831:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalMyDsl.g:831:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt25=4;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // InternalMyDsl.g:832:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,35,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:843:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,36,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:854:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,37,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalMyDsl.g:865:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,38,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMyDsl.g:878:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalMyDsl.g:879:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalMyDsl.g:879:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalMyDsl.g:880:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.PlusOrMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMyDsl.g:902:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalMyDsl.g:902:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalMyDsl.g:903:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMyDsl.g:909:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:915:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalMyDsl.g:916:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalMyDsl.g:916:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalMyDsl.g:917:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:925:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=39 && LA28_0<=40)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:926:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalMyDsl.g:926:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==39) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==40) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalMyDsl.g:927:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMyDsl.g:927:5: ( () otherlv_2= '+' )
            	            // InternalMyDsl.g:928:6: () otherlv_2= '+'
            	            {
            	            // InternalMyDsl.g:928:6: ()
            	            // InternalMyDsl.g:929:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,39,FOLLOW_22); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:941:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMyDsl.g:941:5: ( () otherlv_4= '-' )
            	            // InternalMyDsl.g:942:6: () otherlv_4= '-'
            	            {
            	            // InternalMyDsl.g:942:6: ()
            	            // InternalMyDsl.g:943:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,40,FOLLOW_22); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:955:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalMyDsl.g:956:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalMyDsl.g:956:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalMyDsl.g:957:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalMyDsl.g:979:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalMyDsl.g:979:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalMyDsl.g:980:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalMyDsl.g:986:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:992:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalMyDsl.g:993:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalMyDsl.g:993:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalMyDsl.g:994:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1002:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=41 && LA30_0<=42)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:1003:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMyDsl.g:1003:4: ()
            	    // InternalMyDsl.g:1004:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyDsl.g:1010:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalMyDsl.g:1011:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalMyDsl.g:1011:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalMyDsl.g:1012:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalMyDsl.g:1012:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==41) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==42) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalMyDsl.g:1013:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,41,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1024:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,42,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMyDsl.g:1037:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMyDsl.g:1038:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMyDsl.g:1038:5: (lv_right_3_0= rulePrimary )
            	    // InternalMyDsl.g:1039:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalMyDsl.g:1061:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMyDsl.g:1061:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMyDsl.g:1062:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMyDsl.g:1068:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1074:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalMyDsl.g:1075:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalMyDsl.g:1075:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt31=1;
                }
                break;
            case 43:
                {
                alt31=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 44:
            case 45:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1076:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalMyDsl.g:1076:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalMyDsl.g:1077:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_29);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1095:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalMyDsl.g:1095:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalMyDsl.g:1096:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalMyDsl.g:1096:4: ()
                    // InternalMyDsl.g:1097:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,43,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalMyDsl.g:1107:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalMyDsl.g:1108:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalMyDsl.g:1108:5: (lv_expression_5_0= rulePrimary )
                    // InternalMyDsl.g:1109:6: lv_expression_5_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1128:3: this_Atomic_6= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_6;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalMyDsl.g:1140:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalMyDsl.g:1140:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalMyDsl.g:1141:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalMyDsl.g:1147:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1153:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalMyDsl.g:1154:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalMyDsl.g:1154:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt33=1;
                }
                break;
            case RULE_STRING:
                {
                alt33=2;
                }
                break;
            case 44:
            case 45:
                {
                alt33=3;
                }
                break;
            case RULE_ID:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1155:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:1155:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMyDsl.g:1156:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:1156:4: ()
                    // InternalMyDsl.g:1157:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:1163:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMyDsl.g:1164:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMyDsl.g:1164:5: (lv_value_1_0= RULE_INT )
                    // InternalMyDsl.g:1165:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1183:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalMyDsl.g:1183:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalMyDsl.g:1184:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:1184:4: ()
                    // InternalMyDsl.g:1185:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:1191:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalMyDsl.g:1192:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1192:5: (lv_value_3_0= RULE_STRING )
                    // InternalMyDsl.g:1193:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1211:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalMyDsl.g:1211:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalMyDsl.g:1212:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalMyDsl.g:1212:4: ()
                    // InternalMyDsl.g:1213:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:1219:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalMyDsl.g:1220:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalMyDsl.g:1220:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalMyDsl.g:1221:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalMyDsl.g:1221:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==44) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==45) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalMyDsl.g:1222:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,44,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1233:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,45,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1248:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:1248:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalMyDsl.g:1249:4: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1249:4: ()
                    // InternalMyDsl.g:1250:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:1256:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMyDsl.g:1257:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMyDsl.g:1257:5: (otherlv_7= RULE_ID )
                    // InternalMyDsl.g:1258:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getVariableAttributeCrossReference_3_1_0());
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000442002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000402002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000380000800070L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001000000L});

}