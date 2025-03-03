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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'entity'", "'is'", "'weak'", "'{'", "'}'", "'attribute'", "'['", "','", "']'", "'key'", "'as'", "'relation'", "'1..1'", "'*..*'", "'1..*'", "'*..1'", "'Number'", "'String'"
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
        	return "System";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalMyDsl.g:64:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalMyDsl.g:64:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalMyDsl.g:65:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalMyDsl.g:71:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* ) ;
    public final EObject ruleSystem() throws RecognitionException {
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

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
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

            	    					newCompositeNode(grammarAccess.getSystemAccess().getEntitiesEntityParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_entities_2_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
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

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:121:4: (lv_relations_3_0= ruleRelation )
            	    {
            	    // InternalMyDsl.g:121:4: (lv_relations_3_0= ruleRelation )
            	    // InternalMyDsl.g:122:5: lv_relations_3_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getRelationsRelationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_relations_3_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
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
    // $ANTLR end "ruleSystem"


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
    // InternalMyDsl.g:150:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' otherlv_3= 'weak' )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:156:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' otherlv_3= 'weak' )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )? ) )
            // InternalMyDsl.g:157:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' otherlv_3= 'weak' )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )? )
            {
            // InternalMyDsl.g:157:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' otherlv_3= 'weak' )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )? )
            // InternalMyDsl.g:158:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' otherlv_3= 'weak' )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )?
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

            // InternalMyDsl.g:190:3: (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:191:4: otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
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

                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_2());
                    			

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
    // InternalMyDsl.g:223:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:223:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:224:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalMyDsl.g:230:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )? otherlv_6= ']' )? (otherlv_7= 'is' (otherlv_8= 'weak' | otherlv_9= 'key' ) )? (otherlv_10= 'as' ( (lv_type_11_0= ruleType ) ) )? ) ;
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
        AntlrDatatypeRuleToken lv_type_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:236:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )? otherlv_6= ']' )? (otherlv_7= 'is' (otherlv_8= 'weak' | otherlv_9= 'key' ) )? (otherlv_10= 'as' ( (lv_type_11_0= ruleType ) ) )? ) )
            // InternalMyDsl.g:237:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )? otherlv_6= ']' )? (otherlv_7= 'is' (otherlv_8= 'weak' | otherlv_9= 'key' ) )? (otherlv_10= 'as' ( (lv_type_11_0= ruleType ) ) )? )
            {
            // InternalMyDsl.g:237:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )? otherlv_6= ']' )? (otherlv_7= 'is' (otherlv_8= 'weak' | otherlv_9= 'key' ) )? (otherlv_10= 'as' ( (lv_type_11_0= ruleType ) ) )? )
            // InternalMyDsl.g:238:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )? otherlv_6= ']' )? (otherlv_7= 'is' (otherlv_8= 'weak' | otherlv_9= 'key' ) )? (otherlv_10= 'as' ( (lv_type_11_0= ruleType ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalMyDsl.g:242:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:243:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:243:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:244:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalMyDsl.g:260:3: (otherlv_2= '[' (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )? otherlv_6= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:261:4: otherlv_2= '[' (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )? otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalMyDsl.g:265:4: (this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:266:5: this_ID_3= RULE_ID (otherlv_4= ',' this_ID_5= RULE_ID )*
                            {
                            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_12); 

                            					newLeafNode(this_ID_3, grammarAccess.getAttributeAccess().getIDTerminalRuleCall_2_1_0());
                            				
                            // InternalMyDsl.g:270:5: (otherlv_4= ',' this_ID_5= RULE_ID )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==19) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // InternalMyDsl.g:271:6: otherlv_4= ',' this_ID_5= RULE_ID
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_3); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_12); 

                            	    						newLeafNode(this_ID_5, grammarAccess.getAttributeAccess().getIDTerminalRuleCall_2_1_1_1());
                            	    					

                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:286:3: (otherlv_7= 'is' (otherlv_8= 'weak' | otherlv_9= 'key' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:287:4: otherlv_7= 'is' (otherlv_8= 'weak' | otherlv_9= 'key' )
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getIsKeyword_3_0());
                    			
                    // InternalMyDsl.g:291:4: (otherlv_8= 'weak' | otherlv_9= 'key' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==14) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==21) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:292:5: otherlv_8= 'weak'
                            {
                            otherlv_8=(Token)match(input,14,FOLLOW_15); 

                            					newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getWeakKeyword_3_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:297:5: otherlv_9= 'key'
                            {
                            otherlv_9=(Token)match(input,21,FOLLOW_15); 

                            					newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getKeyKeyword_3_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:303:3: (otherlv_10= 'as' ( (lv_type_11_0= ruleType ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:304:4: otherlv_10= 'as' ( (lv_type_11_0= ruleType ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getAsKeyword_4_0());
                    			
                    // InternalMyDsl.g:308:4: ( (lv_type_11_0= ruleType ) )
                    // InternalMyDsl.g:309:5: (lv_type_11_0= ruleType )
                    {
                    // InternalMyDsl.g:309:5: (lv_type_11_0= ruleType )
                    // InternalMyDsl.g:310:6: lv_type_11_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_11_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_11_0,
                    							"org.xtext.example.mydsl.MyDsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // InternalMyDsl.g:332:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:332:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:333:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalMyDsl.g:339:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relation' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_cardinality_4_0= ruleCardinality ) ) (otherlv_5= 'is' otherlv_6= 'weak' )? (otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )? ) ;
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
            // InternalMyDsl.g:345:2: ( (otherlv_0= 'relation' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_cardinality_4_0= ruleCardinality ) ) (otherlv_5= 'is' otherlv_6= 'weak' )? (otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )? ) )
            // InternalMyDsl.g:346:2: (otherlv_0= 'relation' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_cardinality_4_0= ruleCardinality ) ) (otherlv_5= 'is' otherlv_6= 'weak' )? (otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )? )
            {
            // InternalMyDsl.g:346:2: (otherlv_0= 'relation' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_cardinality_4_0= ruleCardinality ) ) (otherlv_5= 'is' otherlv_6= 'weak' )? (otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )? )
            // InternalMyDsl.g:347:3: otherlv_0= 'relation' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_cardinality_4_0= ruleCardinality ) ) (otherlv_5= 'is' otherlv_6= 'weak' )? (otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalMyDsl.g:351:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:352:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:352:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:353:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getFromEntityEntityCrossReference_1_0());
            				

            }


            }

            // InternalMyDsl.g:364:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:365:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:365:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:366:5: lv_name_2_0= RULE_ID
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

            // InternalMyDsl.g:382:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:383:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:383:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:384:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getToEntityEntityCrossReference_3_0());
            				

            }


            }

            // InternalMyDsl.g:395:3: ( (lv_cardinality_4_0= ruleCardinality ) )
            // InternalMyDsl.g:396:4: (lv_cardinality_4_0= ruleCardinality )
            {
            // InternalMyDsl.g:396:4: (lv_cardinality_4_0= ruleCardinality )
            // InternalMyDsl.g:397:5: lv_cardinality_4_0= ruleCardinality
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

            // InternalMyDsl.g:414:3: (otherlv_5= 'is' otherlv_6= 'weak' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:415:4: otherlv_5= 'is' otherlv_6= 'weak'
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getIsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getWeakKeyword_5_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:424:3: (otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:425:4: otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalMyDsl.g:429:4: ( (lv_attributes_8_0= ruleAttribute ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==17) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDsl.g:430:5: (lv_attributes_8_0= ruleAttribute )
                    	    {
                    	    // InternalMyDsl.g:430:5: (lv_attributes_8_0= ruleAttribute )
                    	    // InternalMyDsl.g:431:6: lv_attributes_8_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop13;
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
    // InternalMyDsl.g:457:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalMyDsl.g:457:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalMyDsl.g:458:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalMyDsl.g:464:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '1..1' | kw= '*..*' | kw= '1..*' | kw= '*..1' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:470:2: ( (kw= '1..1' | kw= '*..*' | kw= '1..*' | kw= '*..1' ) )
            // InternalMyDsl.g:471:2: (kw= '1..1' | kw= '*..*' | kw= '1..*' | kw= '*..1' )
            {
            // InternalMyDsl.g:471:2: (kw= '1..1' | kw= '*..*' | kw= '1..*' | kw= '*..1' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case 26:
                {
                alt15=3;
                }
                break;
            case 27:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:472:3: kw= '1..1'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopDigitOneKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:478:3: kw= '*..*'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskFullStopFullStopAsteriskKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:484:3: kw= '1..*'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getDigitOneFullStopFullStopAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:490:3: kw= '*..1'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:499:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:499:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:500:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:506:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Number' | kw= 'String' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:512:2: ( (kw= 'Number' | kw= 'String' ) )
            // InternalMyDsl.g:513:2: (kw= 'Number' | kw= 'String' )
            {
            // InternalMyDsl.g:513:2: (kw= 'Number' | kw= 'String' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            else if ( (LA16_0==29) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:514:3: kw= 'Number'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getNumberKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:520:3: kw= 'String'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000801002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000442002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000402002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000F000000L});

}