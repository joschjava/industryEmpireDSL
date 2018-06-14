/*
 * generated by Xtext 2.13.0
 */
package org.xtext.industryempire.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ClazzModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.industryempire.MyDsl.ClazzModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cElementAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementElementParserRuleCall_2_0 = (RuleCall)cElementAssignment_2.eContents().get(0);
		
		////TODO: Only 1 of each element => &
		////TODO: No factory at city
		////Questions: 
		//// Difference between factory = [SingleFactory] and [SingleFactory]
		//// [SingleFactory]* (',' factory+=[SingleFactory])* => Fehler wenn nichts da steht
		//// Vehicle Attributes: Wie attrib -> value :, sodass jedes nur einmal vorkommt?
		//// Wie double richtig schreiben?
		//ClazzModel:
		//	'project' name=ID
		//	element+=Element*;
		@Override public ParserRule getRule() { return rule; }
		
		//'project' name=ID element+=Element*
		public Group getGroup() { return cGroup; }
		
		//'project'
		public Keyword getProjectKeyword_0() { return cProjectKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//element+=Element*
		public Assignment getElementAssignment_2() { return cElementAssignment_2; }
		
		//Element
		public RuleCall getElementElementParserRuleCall_2_0() { return cElementElementParserRuleCall_2_0; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.industryempire.MyDsl.Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cResourcesParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBuildingsParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cVehiclesParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cCitiesParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Element:
		//	Resources | Buildings | Vehicles | Cities;
		@Override public ParserRule getRule() { return rule; }
		
		//Resources | Buildings | Vehicles | Cities
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Resources
		public RuleCall getResourcesParserRuleCall_0() { return cResourcesParserRuleCall_0; }
		
		//Buildings
		public RuleCall getBuildingsParserRuleCall_1() { return cBuildingsParserRuleCall_1; }
		
		//Vehicles
		public RuleCall getVehiclesParserRuleCall_2() { return cVehiclesParserRuleCall_2; }
		
		//Cities
		public RuleCall getCitiesParserRuleCall_3() { return cCitiesParserRuleCall_3; }
	}
	public class CitiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.industryempire.MyDsl.Cities");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCitiesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cXKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cXAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cXINTTerminalRuleCall_5_0 = (RuleCall)cXAssignment_5.eContents().get(0);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cYKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cYAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cYINTTerminalRuleCall_8_0 = (RuleCall)cYAssignment_8.eContents().get(0);
		private final Keyword cColonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cFactoryAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final CrossReference cFactorySingleBuildingCrossReference_10_0 = (CrossReference)cFactoryAssignment_10.eContents().get(0);
		private final RuleCall cFactorySingleBuildingIDTerminalRuleCall_10_0_1 = (RuleCall)cFactorySingleBuildingCrossReference_10_0.eContents().get(1);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cCommaKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Assignment cFactoryAssignment_11_1 = (Assignment)cGroup_11.eContents().get(1);
		private final CrossReference cFactorySingleBuildingCrossReference_11_1_0 = (CrossReference)cFactoryAssignment_11_1.eContents().get(0);
		private final RuleCall cFactorySingleBuildingIDTerminalRuleCall_11_1_0_1 = (RuleCall)cFactorySingleBuildingCrossReference_11_1_0.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		////Gruppe | Validator ClazzModel, Filter resourcen, length max 1
		// Cities:
		//	'Cities:' name+=ID '[' 'x' '->' x=INT ':' 'y->' y=INT ':' factory+=[SingleBuilding]* (',' factory+=[SingleBuilding])*
		//	']';
		@Override public ParserRule getRule() { return rule; }
		
		//'Cities:' name+=ID '[' 'x' '->' x=INT ':' 'y->' y=INT ':' factory+=[SingleBuilding]* (',' factory+=[SingleBuilding])*
		//']'
		public Group getGroup() { return cGroup; }
		
		//'Cities:'
		public Keyword getCitiesKeyword_0() { return cCitiesKeyword_0; }
		
		//name+=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }
		
		//'x'
		public Keyword getXKeyword_3() { return cXKeyword_3; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4() { return cHyphenMinusGreaterThanSignKeyword_4; }
		
		//x=INT
		public Assignment getXAssignment_5() { return cXAssignment_5; }
		
		//INT
		public RuleCall getXINTTerminalRuleCall_5_0() { return cXINTTerminalRuleCall_5_0; }
		
		//':'
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }
		
		//'y->'
		public Keyword getYKeyword_7() { return cYKeyword_7; }
		
		//y=INT
		public Assignment getYAssignment_8() { return cYAssignment_8; }
		
		//INT
		public RuleCall getYINTTerminalRuleCall_8_0() { return cYINTTerminalRuleCall_8_0; }
		
		//':'
		public Keyword getColonKeyword_9() { return cColonKeyword_9; }
		
		//factory+=[SingleBuilding]*
		public Assignment getFactoryAssignment_10() { return cFactoryAssignment_10; }
		
		//[SingleBuilding]
		public CrossReference getFactorySingleBuildingCrossReference_10_0() { return cFactorySingleBuildingCrossReference_10_0; }
		
		//ID
		public RuleCall getFactorySingleBuildingIDTerminalRuleCall_10_0_1() { return cFactorySingleBuildingIDTerminalRuleCall_10_0_1; }
		
		//(',' factory+=[SingleBuilding])*
		public Group getGroup_11() { return cGroup_11; }
		
		//','
		public Keyword getCommaKeyword_11_0() { return cCommaKeyword_11_0; }
		
		//factory+=[SingleBuilding]
		public Assignment getFactoryAssignment_11_1() { return cFactoryAssignment_11_1; }
		
		//[SingleBuilding]
		public CrossReference getFactorySingleBuildingCrossReference_11_1_0() { return cFactorySingleBuildingCrossReference_11_1_0; }
		
		//ID
		public RuleCall getFactorySingleBuildingIDTerminalRuleCall_11_1_0_1() { return cFactorySingleBuildingIDTerminalRuleCall_11_1_0_1; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_12() { return cRightSquareBracketKeyword_12; }
	}
	public class VehiclesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.industryempire.MyDsl.Vehicles");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVehiclesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cVehiclesAction_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cVehiclesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVehiclesSingleVehicleParserRuleCall_2_0 = (RuleCall)cVehiclesAssignment_2.eContents().get(0);
		
		////Cities:
		////	'Cities:'
		////	{SingleCity} (cities += [SingleCity]*)
		////	;
		////
		////SingleCity:
		////	name += ID '[' 'x->' x = INT ':' 'y->' y = INT ':' factory += [SingleFactory]* (',' factory+=[SingleFactory])* ']'
		////;
		//Vehicles:
		//	'Vehicles:' {Vehicles} vehicles+=SingleVehicle*;
		@Override public ParserRule getRule() { return rule; }
		
		//'Vehicles:' {Vehicles} vehicles+=SingleVehicle*
		public Group getGroup() { return cGroup; }
		
		//'Vehicles:'
		public Keyword getVehiclesKeyword_0() { return cVehiclesKeyword_0; }
		
		//{Vehicles}
		public Action getVehiclesAction_1() { return cVehiclesAction_1; }
		
		//vehicles+=SingleVehicle*
		public Assignment getVehiclesAssignment_2() { return cVehiclesAssignment_2; }
		
		//SingleVehicle
		public RuleCall getVehiclesSingleVehicleParserRuleCall_2_0() { return cVehiclesSingleVehicleParserRuleCall_2_0; }
	}
	public class SingleVehicleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.industryempire.MyDsl.SingleVehicle");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSpeedKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSpeedAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSpeedINTTerminalRuleCall_4_0 = (RuleCall)cSpeedAssignment_4.eContents().get(0);
		private final Keyword cColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLoadKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cLoadAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cLoadINTTerminalRuleCall_8_0 = (RuleCall)cLoadAssignment_8.eContents().get(0);
		private final Keyword cColonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cTankSizeKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cTankSizeAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cTankSizeINTTerminalRuleCall_12_0 = (RuleCall)cTankSizeAssignment_12.eContents().get(0);
		private final Keyword cColonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cFuelConsumptionKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cFuelConsumptionAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cFuelConsumptionDOUBLETerminalRuleCall_16_0 = (RuleCall)cFuelConsumptionAssignment_16.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_17 = (Keyword)cGroup.eContents().get(17);
		
		//SingleVehicle:
		//	name=ID '[' 'speed' '->' speed=INT ':'
		//	'load' '->' load=INT ':'
		//	'tankSize' '->' tankSize=INT ':'
		//	'fuelConsumption' '->' fuelConsumption=DOUBLE ']';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '[' 'speed' '->' speed=INT ':' 'load' '->' load=INT ':' 'tankSize' '->' tankSize=INT ':' 'fuelConsumption' '->'
		//fuelConsumption=DOUBLE ']'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//'speed'
		public Keyword getSpeedKeyword_2() { return cSpeedKeyword_2; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_3() { return cHyphenMinusGreaterThanSignKeyword_3; }
		
		//speed=INT
		public Assignment getSpeedAssignment_4() { return cSpeedAssignment_4; }
		
		//INT
		public RuleCall getSpeedINTTerminalRuleCall_4_0() { return cSpeedINTTerminalRuleCall_4_0; }
		
		//':'
		public Keyword getColonKeyword_5() { return cColonKeyword_5; }
		
		//'load'
		public Keyword getLoadKeyword_6() { return cLoadKeyword_6; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_7() { return cHyphenMinusGreaterThanSignKeyword_7; }
		
		//load=INT
		public Assignment getLoadAssignment_8() { return cLoadAssignment_8; }
		
		//INT
		public RuleCall getLoadINTTerminalRuleCall_8_0() { return cLoadINTTerminalRuleCall_8_0; }
		
		//':'
		public Keyword getColonKeyword_9() { return cColonKeyword_9; }
		
		//'tankSize'
		public Keyword getTankSizeKeyword_10() { return cTankSizeKeyword_10; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_11() { return cHyphenMinusGreaterThanSignKeyword_11; }
		
		//tankSize=INT
		public Assignment getTankSizeAssignment_12() { return cTankSizeAssignment_12; }
		
		//INT
		public RuleCall getTankSizeINTTerminalRuleCall_12_0() { return cTankSizeINTTerminalRuleCall_12_0; }
		
		//':'
		public Keyword getColonKeyword_13() { return cColonKeyword_13; }
		
		//'fuelConsumption'
		public Keyword getFuelConsumptionKeyword_14() { return cFuelConsumptionKeyword_14; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_15() { return cHyphenMinusGreaterThanSignKeyword_15; }
		
		//fuelConsumption=DOUBLE
		public Assignment getFuelConsumptionAssignment_16() { return cFuelConsumptionAssignment_16; }
		
		//DOUBLE
		public RuleCall getFuelConsumptionDOUBLETerminalRuleCall_16_0() { return cFuelConsumptionDOUBLETerminalRuleCall_16_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_17() { return cRightSquareBracketKeyword_17; }
	}
	public class BuildingsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.industryempire.MyDsl.Buildings");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBuildingsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cFactoriesAction_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cFactoriesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFactoriesSingleBuildingParserRuleCall_2_0 = (RuleCall)cFactoriesAssignment_2.eContents().get(0);
		
		////Vehicles:
		////	'Vehicles:'
		// //	name = STRING '[' attrib += VehicleAttributes '->' value = INT ']'
		// //;
		// //
		////VehicleAttributes:
		////	'speed' & 'load' & 'tankSize' & 'fuelConsumption'
		////;
		//Buildings:
		//	'Buildings:' {Factories} factories+=SingleBuilding*;
		@Override public ParserRule getRule() { return rule; }
		
		//'Buildings:' {Factories} factories+=SingleBuilding*
		public Group getGroup() { return cGroup; }
		
		//'Buildings:'
		public Keyword getBuildingsKeyword_0() { return cBuildingsKeyword_0; }
		
		//{Factories}
		public Action getFactoriesAction_1() { return cFactoriesAction_1; }
		
		//factories+=SingleBuilding*
		public Assignment getFactoriesAssignment_2() { return cFactoriesAssignment_2; }
		
		//SingleBuilding
		public RuleCall getFactoriesSingleBuildingParserRuleCall_2_0() { return cFactoriesSingleBuildingParserRuleCall_2_0; }
	}
	public class SingleBuildingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.industryempire.MyDsl.SingleBuilding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cInKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cInputAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final CrossReference cInputSingleResourceCrossReference_2_2_0 = (CrossReference)cInputAssignment_2_2.eContents().get(0);
		private final RuleCall cInputSingleResourceIDTerminalRuleCall_2_2_0_1 = (RuleCall)cInputSingleResourceCrossReference_2_2_0.eContents().get(1);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOutKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cOutputAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final CrossReference cOutputSingleResourceCrossReference_4_2_0 = (CrossReference)cOutputAssignment_4_2.eContents().get(0);
		private final RuleCall cOutputSingleResourceIDTerminalRuleCall_4_2_0_1 = (RuleCall)cOutputSingleResourceCrossReference_4_2_0.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//SingleBuilding:
		//	name=ID '[' ('in' '->' input=[SingleResource])? ':' ('out' '->' output=[SingleResource])? ']';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '[' ('in' '->' input=[SingleResource])? ':' ('out' '->' output=[SingleResource])? ']'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//('in' '->' input=[SingleResource])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'in'
		public Keyword getInKeyword_2_0() { return cInKeyword_2_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_2_1() { return cHyphenMinusGreaterThanSignKeyword_2_1; }
		
		//input=[SingleResource]
		public Assignment getInputAssignment_2_2() { return cInputAssignment_2_2; }
		
		//[SingleResource]
		public CrossReference getInputSingleResourceCrossReference_2_2_0() { return cInputSingleResourceCrossReference_2_2_0; }
		
		//ID
		public RuleCall getInputSingleResourceIDTerminalRuleCall_2_2_0_1() { return cInputSingleResourceIDTerminalRuleCall_2_2_0_1; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//('out' '->' output=[SingleResource])?
		public Group getGroup_4() { return cGroup_4; }
		
		//'out'
		public Keyword getOutKeyword_4_0() { return cOutKeyword_4_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4_1() { return cHyphenMinusGreaterThanSignKeyword_4_1; }
		
		//output=[SingleResource]
		public Assignment getOutputAssignment_4_2() { return cOutputAssignment_4_2; }
		
		//[SingleResource]
		public CrossReference getOutputSingleResourceCrossReference_4_2_0() { return cOutputSingleResourceCrossReference_4_2_0; }
		
		//ID
		public RuleCall getOutputSingleResourceIDTerminalRuleCall_4_2_0_1() { return cOutputSingleResourceIDTerminalRuleCall_4_2_0_1; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
	}
	public class ResourcesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.industryempire.MyDsl.Resources");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cResourcesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cResourcesAction_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cResourcesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cResourcesSingleResourceParserRuleCall_2_0 = (RuleCall)cResourcesAssignment_2.eContents().get(0);
		
		//Resources:
		//	'Resources:' {Resources} resources+=SingleResource*;
		@Override public ParserRule getRule() { return rule; }
		
		//'Resources:' {Resources} resources+=SingleResource*
		public Group getGroup() { return cGroup; }
		
		//'Resources:'
		public Keyword getResourcesKeyword_0() { return cResourcesKeyword_0; }
		
		//{Resources}
		public Action getResourcesAction_1() { return cResourcesAction_1; }
		
		//resources+=SingleResource*
		public Assignment getResourcesAssignment_2() { return cResourcesAssignment_2; }
		
		//SingleResource
		public RuleCall getResourcesSingleResourceParserRuleCall_2_0() { return cResourcesSingleResourceParserRuleCall_2_0; }
	}
	public class SingleResourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.industryempire.MyDsl.SingleResource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cCostKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCostAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCostINTTerminalRuleCall_4_0 = (RuleCall)cCostAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//SingleResource:
		//	name=ID '[' 'cost' '->' cost=INT ']';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '[' 'cost' '->' cost=INT ']'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//'cost'
		public Keyword getCostKeyword_2() { return cCostKeyword_2; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_3() { return cHyphenMinusGreaterThanSignKeyword_3; }
		
		//cost=INT
		public Assignment getCostAssignment_4() { return cCostAssignment_4; }
		
		//INT
		public RuleCall getCostINTTerminalRuleCall_4_0() { return cCostINTTerminalRuleCall_4_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
	}
	
	
	private final ClazzModelElements pClazzModel;
	private final ElementElements pElement;
	private final CitiesElements pCities;
	private final VehiclesElements pVehicles;
	private final SingleVehicleElements pSingleVehicle;
	private final BuildingsElements pBuildings;
	private final SingleBuildingElements pSingleBuilding;
	private final ResourcesElements pResources;
	private final SingleResourceElements pSingleResource;
	private final TerminalRule tDOUBLE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pClazzModel = new ClazzModelElements();
		this.pElement = new ElementElements();
		this.pCities = new CitiesElements();
		this.pVehicles = new VehiclesElements();
		this.pSingleVehicle = new SingleVehicleElements();
		this.pBuildings = new BuildingsElements();
		this.pSingleBuilding = new SingleBuildingElements();
		this.pResources = new ResourcesElements();
		this.pSingleResource = new SingleResourceElements();
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.industryempire.MyDsl.DOUBLE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.industryempire.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	////TODO: Only 1 of each element => &
	////TODO: No factory at city
	////Questions: 
	//// Difference between factory = [SingleFactory] and [SingleFactory]
	//// [SingleFactory]* (',' factory+=[SingleFactory])* => Fehler wenn nichts da steht
	//// Vehicle Attributes: Wie attrib -> value :, sodass jedes nur einmal vorkommt?
	//// Wie double richtig schreiben?
	//ClazzModel:
	//	'project' name=ID
	//	element+=Element*;
	public ClazzModelElements getClazzModelAccess() {
		return pClazzModel;
	}
	
	public ParserRule getClazzModelRule() {
		return getClazzModelAccess().getRule();
	}
	
	//Element:
	//	Resources | Buildings | Vehicles | Cities;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	////Gruppe | Validator ClazzModel, Filter resourcen, length max 1
	// Cities:
	//	'Cities:' name+=ID '[' 'x' '->' x=INT ':' 'y->' y=INT ':' factory+=[SingleBuilding]* (',' factory+=[SingleBuilding])*
	//	']';
	public CitiesElements getCitiesAccess() {
		return pCities;
	}
	
	public ParserRule getCitiesRule() {
		return getCitiesAccess().getRule();
	}
	
	////Cities:
	////	'Cities:'
	////	{SingleCity} (cities += [SingleCity]*)
	////	;
	////
	////SingleCity:
	////	name += ID '[' 'x->' x = INT ':' 'y->' y = INT ':' factory += [SingleFactory]* (',' factory+=[SingleFactory])* ']'
	////;
	//Vehicles:
	//	'Vehicles:' {Vehicles} vehicles+=SingleVehicle*;
	public VehiclesElements getVehiclesAccess() {
		return pVehicles;
	}
	
	public ParserRule getVehiclesRule() {
		return getVehiclesAccess().getRule();
	}
	
	//SingleVehicle:
	//	name=ID '[' 'speed' '->' speed=INT ':'
	//	'load' '->' load=INT ':'
	//	'tankSize' '->' tankSize=INT ':'
	//	'fuelConsumption' '->' fuelConsumption=DOUBLE ']';
	public SingleVehicleElements getSingleVehicleAccess() {
		return pSingleVehicle;
	}
	
	public ParserRule getSingleVehicleRule() {
		return getSingleVehicleAccess().getRule();
	}
	
	////Vehicles:
	////	'Vehicles:'
	// //	name = STRING '[' attrib += VehicleAttributes '->' value = INT ']'
	// //;
	// //
	////VehicleAttributes:
	////	'speed' & 'load' & 'tankSize' & 'fuelConsumption'
	////;
	//Buildings:
	//	'Buildings:' {Factories} factories+=SingleBuilding*;
	public BuildingsElements getBuildingsAccess() {
		return pBuildings;
	}
	
	public ParserRule getBuildingsRule() {
		return getBuildingsAccess().getRule();
	}
	
	//SingleBuilding:
	//	name=ID '[' ('in' '->' input=[SingleResource])? ':' ('out' '->' output=[SingleResource])? ']';
	public SingleBuildingElements getSingleBuildingAccess() {
		return pSingleBuilding;
	}
	
	public ParserRule getSingleBuildingRule() {
		return getSingleBuildingAccess().getRule();
	}
	
	//Resources:
	//	'Resources:' {Resources} resources+=SingleResource*;
	public ResourcesElements getResourcesAccess() {
		return pResources;
	}
	
	public ParserRule getResourcesRule() {
		return getResourcesAccess().getRule();
	}
	
	//SingleResource:
	//	name=ID '[' 'cost' '->' cost=INT ']';
	public SingleResourceElements getSingleResourceAccess() {
		return pSingleResource;
	}
	
	public ParserRule getSingleResourceRule() {
		return getSingleResourceAccess().getRule();
	}
	
	//terminal DOUBLE:
	//	INT+ '.' INT+;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
