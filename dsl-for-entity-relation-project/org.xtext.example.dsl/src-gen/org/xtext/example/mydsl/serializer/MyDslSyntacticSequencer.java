/*
 * generated by Xtext 2.37.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Attribute___IsKeyword_3_0___KeyKeyword_3_1_1_or_WeakKeyword_3_1_0____q;
	protected AbstractElementAlias match_Attribute___LeftSquareBracketKeyword_2_0___IDTerminalRuleCall_2_1_0___CommaKeyword_2_1_1_0_IDTerminalRuleCall_2_1_1_1__a__q_RightSquareBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Entity___IsKeyword_2_0_WeakKeyword_2_1__q;
	protected AbstractElementAlias match_Entity___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_Relation___IsKeyword_5_0_WeakKeyword_5_1__q;
	protected AbstractElementAlias match_Relation___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_Attribute___IsKeyword_3_0___KeyKeyword_3_1_1_or_WeakKeyword_3_1_0____q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getIsKeyword_3_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getKeyKeyword_3_1_1()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getWeakKeyword_3_1_0())));
		match_Attribute___LeftSquareBracketKeyword_2_0___IDTerminalRuleCall_2_1_0___CommaKeyword_2_1_1_0_IDTerminalRuleCall_2_1_1_1__a__q_RightSquareBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_2_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getIDTerminalRuleCall_2_1_0()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getCommaKeyword_2_1_1_0()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getIDTerminalRuleCall_2_1_1_1()))), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_2_2()));
		match_Entity___IsKeyword_2_0_WeakKeyword_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEntityAccess().getIsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getEntityAccess().getWeakKeyword_2_1()));
		match_Entity___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_2()));
		match_Relation___IsKeyword_5_0_WeakKeyword_5_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRelationAccess().getIsKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getRelationAccess().getWeakKeyword_5_1()));
		match_Relation___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_6_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Attribute___IsKeyword_3_0___KeyKeyword_3_1_1_or_WeakKeyword_3_1_0____q.equals(syntax))
				emit_Attribute___IsKeyword_3_0___KeyKeyword_3_1_1_or_WeakKeyword_3_1_0____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Attribute___LeftSquareBracketKeyword_2_0___IDTerminalRuleCall_2_1_0___CommaKeyword_2_1_1_0_IDTerminalRuleCall_2_1_1_1__a__q_RightSquareBracketKeyword_2_2__q.equals(syntax))
				emit_Attribute___LeftSquareBracketKeyword_2_0___IDTerminalRuleCall_2_1_0___CommaKeyword_2_1_1_0_IDTerminalRuleCall_2_1_1_1__a__q_RightSquareBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entity___IsKeyword_2_0_WeakKeyword_2_1__q.equals(syntax))
				emit_Entity___IsKeyword_2_0_WeakKeyword_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entity___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Entity___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Relation___IsKeyword_5_0_WeakKeyword_5_1__q.equals(syntax))
				emit_Relation___IsKeyword_5_0_WeakKeyword_5_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Relation___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q.equals(syntax))
				emit_Relation___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('is' ('weak' | 'key'))?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID ('[' (ID (',' ID)*)? ']')? (ambiguity) 'as' type=Type
	 *     name=ID ('[' (ID (',' ID)*)? ']')? (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Attribute___IsKeyword_3_0___KeyKeyword_3_1_1_or_WeakKeyword_3_1_0____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('[' (ID (',' ID)*)? ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) ('is' ('weak' | 'key'))? 'as' type=Type
	 *     name=ID (ambiguity) ('is' ('weak' | 'key'))? (rule end)
	 
	 * </pre>
	 */
	protected void emit_Attribute___LeftSquareBracketKeyword_2_0___IDTerminalRuleCall_2_1_0___CommaKeyword_2_1_1_0_IDTerminalRuleCall_2_1_1_1__a__q_RightSquareBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('is' 'weak')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) '{' attributes+=Attribute
	 *     name=ID (ambiguity) ('{' '}')? (rule end)
	 
	 * </pre>
	 */
	protected void emit_Entity___IsKeyword_2_0_WeakKeyword_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID ('is' 'weak')? (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Entity___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('is' 'weak')?
	 *
	 * This ambiguous syntax occurs at:
	 *     cardinality=Cardinality (ambiguity) '{' attributes+=Attribute
	 *     cardinality=Cardinality (ambiguity) ('{' '}')? (rule end)
	 
	 * </pre>
	 */
	protected void emit_Relation___IsKeyword_5_0_WeakKeyword_5_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     cardinality=Cardinality ('is' 'weak')? (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Relation___LeftCurlyBracketKeyword_6_0_RightCurlyBracketKeyword_6_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
