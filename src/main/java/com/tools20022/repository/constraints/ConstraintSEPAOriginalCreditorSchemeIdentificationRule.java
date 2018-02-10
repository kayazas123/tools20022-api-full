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
import com.tools20022.repository.msg.DirectDebitTransactionInformation7;
import com.tools20022.repository.msg.DirectDebitTransactionInformation8;

/**
 * SEPA TVS 3.x rule OriginalCreditorSchemeIdentification is mandatory if
 * changes occur in Creditor Scheme Identification, otherwise not to be used.
 */
public class ConstraintSEPAOriginalCreditorSchemeIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7
	 * DirectDebitTransactionInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalCreditorSchemeIdentification/Identification/PrivateIdentification/OtherIdentification/Identification&lt;/leftOperand&gt;&lt;rightOperand&gt;/DirectDebitTransaction/CreditorSchemeIdentification/Identification/PrivateIdentification/OtherIdentification/Identification&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalCreditorSchemeIdentification/Identification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEPAOriginalCreditorSchemeIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SEPA TVS 3.x rule\nOriginalCreditorSchemeIdentification is mandatory if changes occur in Creditor Scheme Identification, otherwise not to be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation7> forDirectDebitTransactionInformation7 = new MMConstraint<DirectDebitTransactionInformation7>() {
		{
			validator = ConstraintSEPAOriginalCreditorSchemeIdentificationRule::checkDirectDebitTransactionInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEPAOriginalCreditorSchemeIdentificationRule";
			definition = "SEPA TVS 3.x rule\nOriginalCreditorSchemeIdentification is mandatory if changes occur in Creditor Scheme Identification, otherwise not to be used.";
			owner_lazy = () -> DirectDebitTransactionInformation7.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalCreditorSchemeIdentification/Identification/PrivateIdentification/OtherIdentification/Identification</leftOperand><rightOperand>/DirectDebitTransaction/CreditorSchemeIdentification/Identification/PrivateIdentification/OtherIdentification/Identification</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalCreditorSchemeIdentification/Identification</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8
	 * DirectDebitTransactionInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalCreditorSchemeIdentification/Identification/PrivateIdentification/OtherIdentification/Identification&lt;/leftOperand&gt;&lt;rightOperand&gt;/DirectDebitTransaction/CreditorSchemeIdentification/Identification/PrivateIdentification/OtherIdentification/Identification&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalCreditorSchemeIdentification/Identification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEPAOriginalCreditorSchemeIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SEPA TVS 3.x rule\nOriginalCreditorSchemeIdentification is mandatory if changes occur in Creditor Scheme Identification, otherwise not to be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DirectDebitTransactionInformation8> forDirectDebitTransactionInformation8 = new MMConstraint<DirectDebitTransactionInformation8>() {
		{
			validator = ConstraintSEPAOriginalCreditorSchemeIdentificationRule::checkDirectDebitTransactionInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEPAOriginalCreditorSchemeIdentificationRule";
			definition = "SEPA TVS 3.x rule\nOriginalCreditorSchemeIdentification is mandatory if changes occur in Creditor Scheme Identification, otherwise not to be used.";
			owner_lazy = () -> DirectDebitTransactionInformation8.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalCreditorSchemeIdentification/Identification/PrivateIdentification/OtherIdentification/Identification</leftOperand><rightOperand>/DirectDebitTransaction/CreditorSchemeIdentification/Identification/PrivateIdentification/OtherIdentification/Identification</rightOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DirectDebitTransaction/MandateRelatedInformation/AmendmentInformationDetails/OriginalCreditorSchemeIdentification/Identification</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/DirectDebitTransaction/MandateRelatedInformation/AmendmentIndicator</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}
	};

	/**
	 * SEPA TVS 3.x rule OriginalCreditorSchemeIdentification is mandatory if
	 * changes occur in Creditor Scheme Identification, otherwise not to be
	 * used.
	 */
	public static void checkDirectDebitTransactionInformation7(DirectDebitTransactionInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SEPA TVS 3.x rule OriginalCreditorSchemeIdentification is mandatory if
	 * changes occur in Creditor Scheme Identification, otherwise not to be
	 * used.
	 */
	public static void checkDirectDebitTransactionInformation8(DirectDebitTransactionInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}