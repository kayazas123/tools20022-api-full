/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.*;
import java.util.Arrays;

/**
 * ResolvedCase may be present at either ResolvedCase,
 * OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or
 * TransactionInformationAndStatus level.
 */
public class ConstraintMessageOrPaymentInformationResolvedCaseRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV08
	 * ResolutionOfInvestigationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CancellationDetails[*]/OriginalPaymentInformationAndStatus[*]/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[1]/OriginalPaymentInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrPaymentInformationResolvedCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule#forResolutionOfInvestigationV07
	 * ConstraintMessageOrPaymentInformationResolvedCaseRule.
	 * forResolutionOfInvestigationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<ResolutionOfInvestigationV08> forResolutionOfInvestigationV08 = new MMConstraint<ResolutionOfInvestigationV08>() {
		{
			validator = ConstraintMessageOrPaymentInformationResolvedCaseRule::checkResolutionOfInvestigationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrPaymentInformationResolvedCaseRule";
			definition = "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule.forResolutionOfInvestigationV07;
			owner_lazy = () -> ResolutionOfInvestigationV08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CancellationDetails[*]/OriginalPaymentInformationAndStatus[*]/ResolvedCase</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ResolvedCase</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[1]/OriginalPaymentInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07
	 * ResolutionOfInvestigationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CancellationDetails[*]/OriginalPaymentInformationAndStatus[*]/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[1]/OriginalPaymentInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrPaymentInformationResolvedCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule#forResolutionOfInvestigationV08
	 * ConstraintMessageOrPaymentInformationResolvedCaseRule.
	 * forResolutionOfInvestigationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule#forResolutionOfInvestigationV06
	 * ConstraintMessageOrPaymentInformationResolvedCaseRule.
	 * forResolutionOfInvestigationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<ResolutionOfInvestigationV07> forResolutionOfInvestigationV07 = new MMConstraint<ResolutionOfInvestigationV07>() {
		{
			validator = ConstraintMessageOrPaymentInformationResolvedCaseRule::checkResolutionOfInvestigationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrPaymentInformationResolvedCaseRule";
			definition = "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule.forResolutionOfInvestigationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule.forResolutionOfInvestigationV06;
			owner_lazy = () -> ResolutionOfInvestigationV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CancellationDetails[*]/OriginalPaymentInformationAndStatus[*]/ResolvedCase</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ResolvedCase</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[1]/OriginalPaymentInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV03
	 * ResolutionOfInvestigationV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CancellationDetails[*]/OriginalPaymentInformationAndStatus[*]/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[1]/OriginalPaymentInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrPaymentInformationResolvedCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ResolutionOfInvestigationV03> forResolutionOfInvestigationV03 = new MMConstraint<ResolutionOfInvestigationV03>() {
		{
			validator = ConstraintMessageOrPaymentInformationResolvedCaseRule::checkResolutionOfInvestigationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrPaymentInformationResolvedCaseRule";
			definition = "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level.";
			owner_lazy = () -> ResolutionOfInvestigationV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CancellationDetails[*]/OriginalPaymentInformationAndStatus[*]/ResolvedCase</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ResolvedCase</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[1]/OriginalPaymentInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV04
	 * ResolutionOfInvestigationV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CancellationDetails[*]/OriginalPaymentInformationAndStatus[*]/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[1]/OriginalPaymentInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrPaymentInformationResolvedCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule#forResolutionOfInvestigationV05
	 * ConstraintMessageOrPaymentInformationResolvedCaseRule.
	 * forResolutionOfInvestigationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ResolutionOfInvestigationV04> forResolutionOfInvestigationV04 = new MMConstraint<ResolutionOfInvestigationV04>() {
		{
			validator = ConstraintMessageOrPaymentInformationResolvedCaseRule::checkResolutionOfInvestigationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrPaymentInformationResolvedCaseRule";
			definition = "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule.forResolutionOfInvestigationV05);
			owner_lazy = () -> ResolutionOfInvestigationV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CancellationDetails[*]/OriginalPaymentInformationAndStatus[*]/ResolvedCase</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ResolvedCase</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[1]/OriginalPaymentInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV05
	 * ResolutionOfInvestigationV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CancellationDetails[*]/OriginalPaymentInformationAndStatus[*]/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[1]/OriginalPaymentInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrPaymentInformationResolvedCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule#forResolutionOfInvestigationV06
	 * ConstraintMessageOrPaymentInformationResolvedCaseRule.
	 * forResolutionOfInvestigationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule#forResolutionOfInvestigationV04
	 * ConstraintMessageOrPaymentInformationResolvedCaseRule.
	 * forResolutionOfInvestigationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<ResolutionOfInvestigationV05> forResolutionOfInvestigationV05 = new MMConstraint<ResolutionOfInvestigationV05>() {
		{
			validator = ConstraintMessageOrPaymentInformationResolvedCaseRule::checkResolutionOfInvestigationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrPaymentInformationResolvedCaseRule";
			definition = "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule.forResolutionOfInvestigationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule.forResolutionOfInvestigationV04;
			owner_lazy = () -> ResolutionOfInvestigationV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CancellationDetails[*]/OriginalPaymentInformationAndStatus[*]/ResolvedCase</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ResolvedCase</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[1]/OriginalPaymentInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV06
	 * ResolutionOfInvestigationV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/CancellationDetails[*]/OriginalPaymentInformationAndStatus[*]/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ResolvedCase&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/CancellationDetails[1]/OriginalPaymentInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOrPaymentInformationResolvedCaseRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule#forResolutionOfInvestigationV07
	 * ConstraintMessageOrPaymentInformationResolvedCaseRule.
	 * forResolutionOfInvestigationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule#forResolutionOfInvestigationV05
	 * ConstraintMessageOrPaymentInformationResolvedCaseRule.
	 * forResolutionOfInvestigationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<ResolutionOfInvestigationV06> forResolutionOfInvestigationV06 = new MMConstraint<ResolutionOfInvestigationV06>() {
		{
			validator = ConstraintMessageOrPaymentInformationResolvedCaseRule::checkResolutionOfInvestigationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOrPaymentInformationResolvedCaseRule";
			definition = "ResolvedCase may be present at either ResolvedCase, OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or TransactionInformationAndStatus level.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule.forResolutionOfInvestigationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMessageOrPaymentInformationResolvedCaseRule.forResolutionOfInvestigationV05;
			owner_lazy = () -> ResolutionOfInvestigationV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/CancellationDetails[*]/OriginalPaymentInformationAndStatus[*]/ResolvedCase</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ResolvedCase</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/CancellationDetails[1]/OriginalPaymentInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * ResolvedCase may be present at either ResolvedCase,
	 * OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or
	 * TransactionInformationAndStatus level.
	 */
	public static void checkResolutionOfInvestigationV08(ResolutionOfInvestigationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ResolvedCase may be present at either ResolvedCase,
	 * OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or
	 * TransactionInformationAndStatus level.
	 */
	public static void checkResolutionOfInvestigationV07(ResolutionOfInvestigationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ResolvedCase may be present at either ResolvedCase,
	 * OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or
	 * TransactionInformationAndStatus level.
	 */
	public static void checkResolutionOfInvestigationV03(ResolutionOfInvestigationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ResolvedCase may be present at either ResolvedCase,
	 * OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or
	 * TransactionInformationAndStatus level.
	 */
	public static void checkResolutionOfInvestigationV04(ResolutionOfInvestigationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ResolvedCase may be present at either ResolvedCase,
	 * OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or
	 * TransactionInformationAndStatus level.
	 */
	public static void checkResolutionOfInvestigationV05(ResolutionOfInvestigationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ResolvedCase may be present at either ResolvedCase,
	 * OriginalGroupInformationAndStatus, OriginalPaymentInformationAndStatus or
	 * TransactionInformationAndStatus level.
	 */
	public static void checkResolutionOfInvestigationV06(ResolutionOfInvestigationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}