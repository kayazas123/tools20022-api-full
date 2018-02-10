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
import com.tools20022.repository.area.pacs.*;
import com.tools20022.repository.msg.GroupHeader17;
import com.tools20022.repository.msg.GroupHeader27;
import com.tools20022.repository.msg.GroupHeader6;
import java.util.Arrays;

/**
 * If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all
 * occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must
 * have the same currency as the currency of
 * GroupHeader/TotalReturnedInterbankSettlementAmount.
 */
public class ConstraintTotalReturnedInterbankSettlementAmountRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV08
	 * PaymentReturnV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReturnedInterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReturnedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReturnedInterbankSettlementAmount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule#forPaymentReturnV07
	 * ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV07}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV08> forPaymentReturnV08 = new MMConstraint<PaymentReturnV08>() {
		{
			validator = ConstraintTotalReturnedInterbankSettlementAmountRule::checkPaymentReturnV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReturnedInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReturnedInterbankSettlementAmount.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV07;
			owner_lazy = () -> PaymentReturnV08.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/TransactionInformation[*]/ReturnedInterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalReturnedInterbankSettlementAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[*]/ReturnedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV07
	 * PaymentReturnV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReturnedInterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReturnedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReturnedInterbankSettlementAmount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule#forPaymentReturnV08
	 * ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV08}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule#forPaymentReturnV06
	 * ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV06}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV07> forPaymentReturnV07 = new MMConstraint<PaymentReturnV07>() {
		{
			validator = ConstraintTotalReturnedInterbankSettlementAmountRule::checkPaymentReturnV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReturnedInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReturnedInterbankSettlementAmount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV06;
			owner_lazy = () -> PaymentReturnV07.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/TransactionInformation[*]/ReturnedInterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalReturnedInterbankSettlementAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[*]/ReturnedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV02
	 * PaymentReturnV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReturnedInterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReturnedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReturnedInterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV02> forPaymentReturnV02 = new MMConstraint<PaymentReturnV02>() {
		{
			validator = ConstraintTotalReturnedInterbankSettlementAmountRule::checkPaymentReturnV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReturnedInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReturnedInterbankSettlementAmount.";
			owner_lazy = () -> PaymentReturnV02.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/TransactionInformation[*]/ReturnedInterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalReturnedInterbankSettlementAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[*]/ReturnedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV03
	 * PaymentReturnV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReturnedInterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReturnedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReturnedInterbankSettlementAmount."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV03> forPaymentReturnV03 = new MMConstraint<PaymentReturnV03>() {
		{
			validator = ConstraintTotalReturnedInterbankSettlementAmountRule::checkPaymentReturnV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReturnedInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReturnedInterbankSettlementAmount.";
			owner_lazy = () -> PaymentReturnV03.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/TransactionInformation[*]/ReturnedInterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalReturnedInterbankSettlementAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[*]/ReturnedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV04
	 * PaymentReturnV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReturnedInterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReturnedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReturnedInterbankSettlementAmount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule#forPaymentReturnV05
	 * ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV05}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV04> forPaymentReturnV04 = new MMConstraint<PaymentReturnV04>() {
		{
			validator = ConstraintTotalReturnedInterbankSettlementAmountRule::checkPaymentReturnV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReturnedInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReturnedInterbankSettlementAmount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV05);
			owner_lazy = () -> PaymentReturnV04.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/TransactionInformation[*]/ReturnedInterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalReturnedInterbankSettlementAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[*]/ReturnedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV05
	 * PaymentReturnV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReturnedInterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReturnedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReturnedInterbankSettlementAmount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule#forPaymentReturnV06
	 * ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV06}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule#forPaymentReturnV04
	 * ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV04}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV05> forPaymentReturnV05 = new MMConstraint<PaymentReturnV05>() {
		{
			validator = ConstraintTotalReturnedInterbankSettlementAmountRule::checkPaymentReturnV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReturnedInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReturnedInterbankSettlementAmount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV04;
			owner_lazy = () -> PaymentReturnV05.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/TransactionInformation[*]/ReturnedInterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalReturnedInterbankSettlementAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[*]/ReturnedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV06
	 * PaymentReturnV06}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"EqualToNode\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReturnedInterbankSettlementAmount/@Currency&lt;/leftOperand&gt;&lt;rightOperand&gt;/GroupHeader/TotalReturnedInterbankSettlementAmount/@Currency&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/GroupHeader/TotalReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformation[*]/ReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReturnedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReturnedInterbankSettlementAmount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule#forPaymentReturnV07
	 * ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV07}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule#forPaymentReturnV05
	 * ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV05}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV06> forPaymentReturnV06 = new MMConstraint<PaymentReturnV06>() {
		{
			validator = ConstraintTotalReturnedInterbankSettlementAmountRule::checkPaymentReturnV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReturnedInterbankSettlementAmountRule";
			definition = "If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then all occurrences of TransactionInformation/ReturnedInterbankSettlementAmount must have the same currency as the currency of GroupHeader/TotalReturnedInterbankSettlementAmount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV05;
			owner_lazy = () -> PaymentReturnV06.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"EqualToNode\"><leftOperand>/TransactionInformation[*]/ReturnedInterbankSettlementAmount/@Currency</leftOperand><rightOperand>/GroupHeader/TotalReturnedInterbankSettlementAmount/@Currency</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/GroupHeader/TotalReturnedInterbankSettlementAmount</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[1]</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformation[*]/ReturnedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader6 GroupHeader6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReturnedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TotalReturnedInterbankSettlementAmount is present, then InterbankSettlementDate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader6> forGroupHeader6 = new MMConstraint<GroupHeader6>() {
		{
			validator = ConstraintTotalReturnedInterbankSettlementAmountRule::checkGroupHeader6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReturnedInterbankSettlementAmountRule";
			definition = "If TotalReturnedInterbankSettlementAmount is present, then InterbankSettlementDate must be present.";
			owner_lazy = () -> GroupHeader6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader17 GroupHeader17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TotalReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReturnedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: (not injected)\nIf TotalReturnedInterbankSettlementAmount is present, then InterbankSettlementDate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader17> forGroupHeader17 = new MMConstraint<GroupHeader17>() {
		{
			validator = ConstraintTotalReturnedInterbankSettlementAmountRule::checkGroupHeader17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReturnedInterbankSettlementAmountRule";
			definition = "ISO20022 Rule: (not injected)\nIf TotalReturnedInterbankSettlementAmount is present, then InterbankSettlementDate must be present.";
			owner_lazy = () -> GroupHeader17.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TotalReturnedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader27 GroupHeader27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TotalReturnedInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReturnedInterbankSettlementAmountRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: (not injected)\nIf TotalReturnedInterbankSettlementAmount is present, then InterbankSettlementDate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GroupHeader27> forGroupHeader27 = new MMConstraint<GroupHeader27>() {
		{
			validator = ConstraintTotalReturnedInterbankSettlementAmountRule::checkGroupHeader27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReturnedInterbankSettlementAmountRule";
			definition = "ISO20022 Rule: (not injected)\nIf TotalReturnedInterbankSettlementAmount is present, then InterbankSettlementDate must be present.";
			owner_lazy = () -> GroupHeader27.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TotalReturnedInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then
	 * all occurrences of
	 * TransactionInformation/ReturnedInterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalReturnedInterbankSettlementAmount.
	 */
	public static void checkPaymentReturnV08(PaymentReturnV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then
	 * all occurrences of
	 * TransactionInformation/ReturnedInterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalReturnedInterbankSettlementAmount.
	 */
	public static void checkPaymentReturnV07(PaymentReturnV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then
	 * all occurrences of
	 * TransactionInformation/ReturnedInterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalReturnedInterbankSettlementAmount.
	 */
	public static void checkPaymentReturnV02(PaymentReturnV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then
	 * all occurrences of
	 * TransactionInformation/ReturnedInterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalReturnedInterbankSettlementAmount.
	 */
	public static void checkPaymentReturnV03(PaymentReturnV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then
	 * all occurrences of
	 * TransactionInformation/ReturnedInterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalReturnedInterbankSettlementAmount.
	 */
	public static void checkPaymentReturnV04(PaymentReturnV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then
	 * all occurrences of
	 * TransactionInformation/ReturnedInterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalReturnedInterbankSettlementAmount.
	 */
	public static void checkPaymentReturnV05(PaymentReturnV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If GroupHeader/TotalReturnedInterbankSettlementAmount is present, then
	 * all occurrences of
	 * TransactionInformation/ReturnedInterbankSettlementAmount must have the
	 * same currency as the currency of
	 * GroupHeader/TotalReturnedInterbankSettlementAmount.
	 */
	public static void checkPaymentReturnV06(PaymentReturnV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TotalReturnedInterbankSettlementAmount is present, then
	 * InterbankSettlementDate must be present.
	 */
	public static void checkGroupHeader6(GroupHeader6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: (not injected) If TotalReturnedInterbankSettlementAmount
	 * is present, then InterbankSettlementDate must be present.
	 */
	public static void checkGroupHeader17(GroupHeader17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule: (not injected) If TotalReturnedInterbankSettlementAmount
	 * is present, then InterbankSettlementDate must be present.
	 */
	public static void checkGroupHeader27(GroupHeader27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}