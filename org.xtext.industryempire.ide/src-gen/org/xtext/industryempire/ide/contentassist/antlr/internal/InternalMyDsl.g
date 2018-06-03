/*
 * generated by Xtext 2.13.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.industryempire.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleClazzModel
entryRuleClazzModel
:
{ before(grammarAccess.getClazzModelRule()); }
	 ruleClazzModel
{ after(grammarAccess.getClazzModelRule()); } 
	 EOF 
;

// Rule ClazzModel
ruleClazzModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClazzModelAccess().getElementAssignment()); }
		(rule__ClazzModel__ElementAssignment)*
		{ after(grammarAccess.getClazzModelAccess().getElementAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleElement
entryRuleElement
:
{ before(grammarAccess.getElementRule()); }
	 ruleElement
{ after(grammarAccess.getElementRule()); } 
	 EOF 
;

// Rule Element
ruleElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getElementAccess().getAlternatives()); }
		(rule__Element__Alternatives)
		{ after(grammarAccess.getElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCities
entryRuleCities
:
{ before(grammarAccess.getCitiesRule()); }
	 ruleCities
{ after(grammarAccess.getCitiesRule()); } 
	 EOF 
;

// Rule Cities
ruleCities 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCitiesAccess().getGroup()); }
		(rule__Cities__Group__0)
		{ after(grammarAccess.getCitiesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVehicles
entryRuleVehicles
:
{ before(grammarAccess.getVehiclesRule()); }
	 ruleVehicles
{ after(grammarAccess.getVehiclesRule()); } 
	 EOF 
;

// Rule Vehicles
ruleVehicles 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVehiclesAccess().getGroup()); }
		(rule__Vehicles__Group__0)
		{ after(grammarAccess.getVehiclesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFactories
entryRuleFactories
:
{ before(grammarAccess.getFactoriesRule()); }
	 ruleFactories
{ after(grammarAccess.getFactoriesRule()); } 
	 EOF 
;

// Rule Factories
ruleFactories 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFactoriesAccess().getGroup()); }
		(rule__Factories__Group__0)
		{ after(grammarAccess.getFactoriesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSingleFactory
entryRuleSingleFactory
:
{ before(grammarAccess.getSingleFactoryRule()); }
	 ruleSingleFactory
{ after(grammarAccess.getSingleFactoryRule()); } 
	 EOF 
;

// Rule SingleFactory
ruleSingleFactory 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSingleFactoryAccess().getGroup()); }
		(rule__SingleFactory__Group__0)
		{ after(grammarAccess.getSingleFactoryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleResources
entryRuleResources
:
{ before(grammarAccess.getResourcesRule()); }
	 ruleResources
{ after(grammarAccess.getResourcesRule()); } 
	 EOF 
;

// Rule Resources
ruleResources 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getResourcesAccess().getGroup()); }
		(rule__Resources__Group__0)
		{ after(grammarAccess.getResourcesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSingleResource
entryRuleSingleResource
:
{ before(grammarAccess.getSingleResourceRule()); }
	 ruleSingleResource
{ after(grammarAccess.getSingleResourceRule()); } 
	 EOF 
;

// Rule SingleResource
ruleSingleResource 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSingleResourceAccess().getNameAssignment()); }
		(rule__SingleResource__NameAssignment)
		{ after(grammarAccess.getSingleResourceAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementAccess().getResourcesParserRuleCall_0()); }
		ruleResources
		{ after(grammarAccess.getElementAccess().getResourcesParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getFactoriesParserRuleCall_1()); }
		ruleFactories
		{ after(grammarAccess.getElementAccess().getFactoriesParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getVehiclesParserRuleCall_2()); }
		ruleVehicles
		{ after(grammarAccess.getElementAccess().getVehiclesParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getCitiesParserRuleCall_3()); }
		ruleCities
		{ after(grammarAccess.getElementAccess().getCitiesParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cities__Group__0__Impl
	rule__Cities__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCitiesAccess().getCitiesKeyword_0()); }
	'Cities:'
	{ after(grammarAccess.getCitiesAccess().getCitiesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cities__Group__1__Impl
	rule__Cities__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCitiesAccess().getNameAssignment_1()); }
	(rule__Cities__NameAssignment_1)
	{ after(grammarAccess.getCitiesAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cities__Group__2__Impl
	rule__Cities__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCitiesAccess().getLeftSquareBracketKeyword_2()); }
	'['
	{ after(grammarAccess.getCitiesAccess().getLeftSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cities__Group__3__Impl
	rule__Cities__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCitiesAccess().getXKeyword_3()); }
	'x->'
	{ after(grammarAccess.getCitiesAccess().getXKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cities__Group__4__Impl
	rule__Cities__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCitiesAccess().getXAssignment_4()); }
	(rule__Cities__XAssignment_4)
	{ after(grammarAccess.getCitiesAccess().getXAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cities__Group__5__Impl
	rule__Cities__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCitiesAccess().getColonKeyword_5()); }
	':'
	{ after(grammarAccess.getCitiesAccess().getColonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cities__Group__6__Impl
	rule__Cities__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCitiesAccess().getYKeyword_6()); }
	'y->'
	{ after(grammarAccess.getCitiesAccess().getYKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cities__Group__7__Impl
	rule__Cities__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCitiesAccess().getYAssignment_7()); }
	(rule__Cities__YAssignment_7)
	{ after(grammarAccess.getCitiesAccess().getYAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cities__Group__8__Impl
	rule__Cities__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCitiesAccess().getColonKeyword_8()); }
	':'
	{ after(grammarAccess.getCitiesAccess().getColonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cities__Group__9__Impl
	rule__Cities__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCitiesAccess().getFactoryAssignment_9()); }
	(rule__Cities__FactoryAssignment_9)*
	{ after(grammarAccess.getCitiesAccess().getFactoryAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cities__Group__10__Impl
	rule__Cities__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCitiesAccess().getGroup_10()); }
	(rule__Cities__Group_10__0)*
	{ after(grammarAccess.getCitiesAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cities__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCitiesAccess().getRightSquareBracketKeyword_11()); }
	']'
	{ after(grammarAccess.getCitiesAccess().getRightSquareBracketKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cities__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cities__Group_10__0__Impl
	rule__Cities__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCitiesAccess().getCommaKeyword_10_0()); }
	','
	{ after(grammarAccess.getCitiesAccess().getCommaKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cities__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCitiesAccess().getFactoryAssignment_10_1()); }
	(rule__Cities__FactoryAssignment_10_1)
	{ after(grammarAccess.getCitiesAccess().getFactoryAssignment_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vehicles__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vehicles__Group__0__Impl
	rule__Vehicles__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vehicles__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVehiclesAccess().getVehiclesKeyword_0()); }
	'Vehicles:'
	{ after(grammarAccess.getVehiclesAccess().getVehiclesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vehicles__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vehicles__Group__1__Impl
	rule__Vehicles__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Vehicles__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVehiclesAccess().getVehiclesAction_1()); }
	()
	{ after(grammarAccess.getVehiclesAccess().getVehiclesAction_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vehicles__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vehicles__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vehicles__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVehiclesAccess().getVehiclesAssignment_2()); }
	(rule__Vehicles__VehiclesAssignment_2)*
	{ after(grammarAccess.getVehiclesAccess().getVehiclesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Factories__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Factories__Group__0__Impl
	rule__Factories__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Factories__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFactoriesAccess().getFactoriesKeyword_0()); }
	'Factories:'
	{ after(grammarAccess.getFactoriesAccess().getFactoriesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Factories__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Factories__Group__1__Impl
	rule__Factories__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Factories__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFactoriesAccess().getFactoriesAction_1()); }
	()
	{ after(grammarAccess.getFactoriesAccess().getFactoriesAction_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Factories__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Factories__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Factories__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFactoriesAccess().getFactoriesAssignment_2()); }
	(rule__Factories__FactoriesAssignment_2)*
	{ after(grammarAccess.getFactoriesAccess().getFactoriesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SingleFactory__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleFactory__Group__0__Impl
	rule__SingleFactory__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleFactory__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleFactoryAccess().getNameAssignment_0()); }
	(rule__SingleFactory__NameAssignment_0)
	{ after(grammarAccess.getSingleFactoryAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleFactory__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleFactory__Group__1__Impl
	rule__SingleFactory__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleFactory__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleFactoryAccess().getLeftSquareBracketKeyword_1()); }
	'['
	{ after(grammarAccess.getSingleFactoryAccess().getLeftSquareBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleFactory__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleFactory__Group__2__Impl
	rule__SingleFactory__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleFactory__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleFactoryAccess().getInputAssignment_2()); }
	(rule__SingleFactory__InputAssignment_2)?
	{ after(grammarAccess.getSingleFactoryAccess().getInputAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleFactory__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleFactory__Group__3__Impl
	rule__SingleFactory__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleFactory__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleFactoryAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getSingleFactoryAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleFactory__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleFactory__Group__4__Impl
	rule__SingleFactory__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleFactory__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleFactoryAccess().getOutputAssignment_4()); }
	(rule__SingleFactory__OutputAssignment_4)?
	{ after(grammarAccess.getSingleFactoryAccess().getOutputAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleFactory__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SingleFactory__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleFactory__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSingleFactoryAccess().getRightSquareBracketKeyword_5()); }
	']'
	{ after(grammarAccess.getSingleFactoryAccess().getRightSquareBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Resources__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Resources__Group__0__Impl
	rule__Resources__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Resources__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getResourcesAccess().getResourcesKeyword_0()); }
	'Resources:'
	{ after(grammarAccess.getResourcesAccess().getResourcesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Resources__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Resources__Group__1__Impl
	rule__Resources__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Resources__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getResourcesAccess().getResourcesAction_1()); }
	()
	{ after(grammarAccess.getResourcesAccess().getResourcesAction_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Resources__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Resources__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Resources__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getResourcesAccess().getResourcesAssignment_2()); }
	(rule__Resources__ResourcesAssignment_2)*
	{ after(grammarAccess.getResourcesAccess().getResourcesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClazzModel__ElementAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClazzModelAccess().getElementElementParserRuleCall_0()); }
		ruleElement
		{ after(grammarAccess.getClazzModelAccess().getElementElementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCitiesAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCitiesAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__XAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCitiesAccess().getXINTTerminalRuleCall_4_0()); }
		RULE_INT
		{ after(grammarAccess.getCitiesAccess().getXINTTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__YAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCitiesAccess().getYINTTerminalRuleCall_7_0()); }
		RULE_INT
		{ after(grammarAccess.getCitiesAccess().getYINTTerminalRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__FactoryAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_9_0()); }
		(
			{ before(grammarAccess.getCitiesAccess().getFactorySingleFactoryIDTerminalRuleCall_9_0_1()); }
			RULE_ID
			{ after(grammarAccess.getCitiesAccess().getFactorySingleFactoryIDTerminalRuleCall_9_0_1()); }
		)
		{ after(grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cities__FactoryAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_10_1_0()); }
		(
			{ before(grammarAccess.getCitiesAccess().getFactorySingleFactoryIDTerminalRuleCall_10_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getCitiesAccess().getFactorySingleFactoryIDTerminalRuleCall_10_1_0_1()); }
		)
		{ after(grammarAccess.getCitiesAccess().getFactorySingleFactoryCrossReference_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vehicles__VehiclesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVehiclesAccess().getVehiclesSingleVehicleCrossReference_2_0()); }
		(
			{ before(grammarAccess.getVehiclesAccess().getVehiclesSingleVehicleIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getVehiclesAccess().getVehiclesSingleVehicleIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getVehiclesAccess().getVehiclesSingleVehicleCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Factories__FactoriesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFactoriesAccess().getFactoriesSingleFactoryParserRuleCall_2_0()); }
		ruleSingleFactory
		{ after(grammarAccess.getFactoriesAccess().getFactoriesSingleFactoryParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleFactory__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSingleFactoryAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getSingleFactoryAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleFactory__InputAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSingleFactoryAccess().getInputSingleResourceCrossReference_2_0()); }
		(
			{ before(grammarAccess.getSingleFactoryAccess().getInputSingleResourceIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSingleFactoryAccess().getInputSingleResourceIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getSingleFactoryAccess().getInputSingleResourceCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleFactory__OutputAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSingleFactoryAccess().getOutputSingleResourceCrossReference_4_0()); }
		(
			{ before(grammarAccess.getSingleFactoryAccess().getOutputSingleResourceIDTerminalRuleCall_4_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSingleFactoryAccess().getOutputSingleResourceIDTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getSingleFactoryAccess().getOutputSingleResourceCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Resources__ResourcesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getResourcesAccess().getResourcesSingleResourceParserRuleCall_2_0()); }
		ruleSingleResource
		{ after(grammarAccess.getResourcesAccess().getResourcesSingleResourceParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleResource__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSingleResourceAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getSingleResourceAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;