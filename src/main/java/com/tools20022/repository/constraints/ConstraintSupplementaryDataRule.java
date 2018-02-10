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
import com.tools20022.repository.area.pacs.*;
import com.tools20022.repository.area.pain.*;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.Arrays;

/**
 * The SupplementaryData building block at message level must not be used to
 * provide additional information about a transaction. The SupplementaryData
 * element at transaction level should be used for that purpose.
 */
public class ConstraintSupplementaryDataRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV04
	 * MandateAmendmentRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateAmendmentRequestV05
	 * ConstraintSupplementaryDataRule.forMandateAmendmentRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateAmendmentRequestV03
	 * ConstraintSupplementaryDataRule.forMandateAmendmentRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateAmendmentRequestV04> forMandateAmendmentRequestV04 = new MMConstraint<MandateAmendmentRequestV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkMandateAmendmentRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateAmendmentRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateAmendmentRequestV03;
			owner_lazy = () -> MandateAmendmentRequestV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV04
	 * MandateCancellationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateCancellationRequestV05
	 * ConstraintSupplementaryDataRule.forMandateCancellationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateCancellationRequestV03
	 * ConstraintSupplementaryDataRule.forMandateCancellationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateCancellationRequestV04> forMandateCancellationRequestV04 = new MMConstraint<MandateCancellationRequestV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkMandateCancellationRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateCancellationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateCancellationRequestV03;
			owner_lazy = () -> MandateCancellationRequestV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV04
	 * MandateAcceptanceReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateAcceptanceReportV05
	 * ConstraintSupplementaryDataRule.forMandateAcceptanceReportV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateAcceptanceReportV03
	 * ConstraintSupplementaryDataRule.forMandateAcceptanceReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateAcceptanceReportV04> forMandateAcceptanceReportV04 = new MMConstraint<MandateAcceptanceReportV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkMandateAcceptanceReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateAcceptanceReportV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateAcceptanceReportV03;
			owner_lazy = () -> MandateAcceptanceReportV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV04
	 * MandateInitiationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateInitiationRequestV05
	 * ConstraintSupplementaryDataRule.forMandateInitiationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateInitiationRequestV03
	 * ConstraintSupplementaryDataRule.forMandateInitiationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateInitiationRequestV04> forMandateInitiationRequestV04 = new MMConstraint<MandateInitiationRequestV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkMandateInitiationRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateInitiationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateInitiationRequestV03;
			owner_lazy = () -> MandateInitiationRequestV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV07
	 * CustomerCreditTransferInitiationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerCreditTransferInitiationV08
	 * ConstraintSupplementaryDataRule.forCustomerCreditTransferInitiationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerCreditTransferInitiationV06
	 * ConstraintSupplementaryDataRule.forCustomerCreditTransferInitiationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerCreditTransferInitiationV07> forCustomerCreditTransferInitiationV07 = new MMConstraint<CustomerCreditTransferInitiationV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerCreditTransferInitiationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerCreditTransferInitiationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerCreditTransferInitiationV06;
			owner_lazy = () -> CustomerCreditTransferInitiationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV05
	 * CreditorPaymentActivationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCreditorPaymentActivationRequestV06
	 * ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCreditorPaymentActivationRequestV04
	 * ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestV05> forCreditorPaymentActivationRequestV05 = new MMConstraint<CreditorPaymentActivationRequestV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCreditorPaymentActivationRequestV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestV04;
			owner_lazy = () -> CreditorPaymentActivationRequestV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06
	 * CustomerDirectDebitInitiationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerDirectDebitInitiationV07
	 * ConstraintSupplementaryDataRule.forCustomerDirectDebitInitiationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerDirectDebitInitiationV05
	 * ConstraintSupplementaryDataRule.forCustomerDirectDebitInitiationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerDirectDebitInitiationV06> forCustomerDirectDebitInitiationV06 = new MMConstraint<CustomerDirectDebitInitiationV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerDirectDebitInitiationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerDirectDebitInitiationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerDirectDebitInitiationV05;
			owner_lazy = () -> CustomerDirectDebitInitiationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV05
	 * CreditorPaymentActivationRequestStatusReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCreditorPaymentActivationRequestStatusReportV06
	 * ConstraintSupplementaryDataRule.
	 * forCreditorPaymentActivationRequestStatusReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCreditorPaymentActivationRequestStatusReportV04
	 * ConstraintSupplementaryDataRule.
	 * forCreditorPaymentActivationRequestStatusReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestStatusReportV05> forCreditorPaymentActivationRequestStatusReportV05 = new MMConstraint<CreditorPaymentActivationRequestStatusReportV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCreditorPaymentActivationRequestStatusReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestStatusReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestStatusReportV04;
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08
	 * CustomerPaymentStatusReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentStatusReportV09
	 * ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentStatusReportV07
	 * ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV08> forCustomerPaymentStatusReportV08 = new MMConstraint<CustomerPaymentStatusReportV08>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentStatusReportV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV07;
			owner_lazy = () -> CustomerPaymentStatusReportV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07
	 * CustomerPaymentReversalV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentReversalV08
	 * ConstraintSupplementaryDataRule.forCustomerPaymentReversalV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentReversalV06
	 * ConstraintSupplementaryDataRule.forCustomerPaymentReversalV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV07> forCustomerPaymentReversalV07 = new MMConstraint<CustomerPaymentReversalV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentReversalV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentReversalV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentReversalV06;
			owner_lazy = () -> CustomerPaymentReversalV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV05
	 * MandateAcceptanceReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateAcceptanceReportV04
	 * ConstraintSupplementaryDataRule.forMandateAcceptanceReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateAcceptanceReportV05> forMandateAcceptanceReportV05 = new MMConstraint<MandateAcceptanceReportV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkMandateAcceptanceReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateAcceptanceReportV04;
			owner_lazy = () -> MandateAcceptanceReportV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV05
	 * MandateAmendmentRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateAmendmentRequestV04
	 * ConstraintSupplementaryDataRule.forMandateAmendmentRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateAmendmentRequestV05> forMandateAmendmentRequestV05 = new MMConstraint<MandateAmendmentRequestV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkMandateAmendmentRequestV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateAmendmentRequestV04;
			owner_lazy = () -> MandateAmendmentRequestV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV05
	 * MandateInitiationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateInitiationRequestV04
	 * ConstraintSupplementaryDataRule.forMandateInitiationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateInitiationRequestV05> forMandateInitiationRequestV05 = new MMConstraint<MandateInitiationRequestV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkMandateInitiationRequestV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateInitiationRequestV04;
			owner_lazy = () -> MandateInitiationRequestV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV08
	 * CustomerCreditTransferInitiationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerCreditTransferInitiationV07
	 * ConstraintSupplementaryDataRule.forCustomerCreditTransferInitiationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerCreditTransferInitiationV08> forCustomerCreditTransferInitiationV08 = new MMConstraint<CustomerCreditTransferInitiationV08>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerCreditTransferInitiationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerCreditTransferInitiationV07;
			owner_lazy = () -> CustomerCreditTransferInitiationV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV05
	 * MandateCancellationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateCancellationRequestV04
	 * ConstraintSupplementaryDataRule.forMandateCancellationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<MandateCancellationRequestV05> forMandateCancellationRequestV05 = new MMConstraint<MandateCancellationRequestV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkMandateCancellationRequestV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateCancellationRequestV04;
			owner_lazy = () -> MandateCancellationRequestV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07
	 * CustomerDirectDebitInitiationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerDirectDebitInitiationV06
	 * ConstraintSupplementaryDataRule.forCustomerDirectDebitInitiationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerDirectDebitInitiationV07> forCustomerDirectDebitInitiationV07 = new MMConstraint<CustomerDirectDebitInitiationV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerDirectDebitInitiationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerDirectDebitInitiationV06;
			owner_lazy = () -> CustomerDirectDebitInitiationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV06
	 * CreditorPaymentActivationRequestStatusReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCreditorPaymentActivationRequestStatusReportV05
	 * ConstraintSupplementaryDataRule.
	 * forCreditorPaymentActivationRequestStatusReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestStatusReportV06> forCreditorPaymentActivationRequestStatusReportV06 = new MMConstraint<CreditorPaymentActivationRequestStatusReportV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCreditorPaymentActivationRequestStatusReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestStatusReportV05;
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV06
	 * CreditorPaymentActivationRequestV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCreditorPaymentActivationRequestV05
	 * ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestV06> forCreditorPaymentActivationRequestV06 = new MMConstraint<CreditorPaymentActivationRequestV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCreditorPaymentActivationRequestV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestV05;
			owner_lazy = () -> CreditorPaymentActivationRequestV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateSuspensionRequestV01
	 * MandateSuspensionRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateSuspensionRequestV01> forMandateSuspensionRequestV01 = new MMConstraint<MandateSuspensionRequestV01>() {
		{
			validator = ConstraintSupplementaryDataRule::checkMandateSuspensionRequestV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> MandateSuspensionRequestV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateCopyRequestV01
	 * MandateCopyRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateCopyRequestV01> forMandateCopyRequestV01 = new MMConstraint<MandateCopyRequestV01>() {
		{
			validator = ConstraintSupplementaryDataRule::checkMandateCopyRequestV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> MandateCopyRequestV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV09
	 * CustomerPaymentStatusReportV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentStatusReportV08
	 * ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV09> forCustomerPaymentStatusReportV09 = new MMConstraint<CustomerPaymentStatusReportV09>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentStatusReportV09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV08;
			owner_lazy = () -> CustomerPaymentStatusReportV09.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV08
	 * CustomerPaymentReversalV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentReversalV07
	 * ConstraintSupplementaryDataRule.forCustomerPaymentReversalV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV08> forCustomerPaymentReversalV08 = new MMConstraint<CustomerPaymentReversalV08>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentReversalV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentReversalV07;
			owner_lazy = () -> CustomerPaymentReversalV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV07
	 * BankToCustomerAccountReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerAccountReportV06
	 * ConstraintSupplementaryDataRule.forBankToCustomerAccountReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerAccountReportV07> forBankToCustomerAccountReportV07 = new MMConstraint<BankToCustomerAccountReportV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkBankToCustomerAccountReportV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerAccountReportV06;
			owner_lazy = () -> BankToCustomerAccountReportV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV07
	 * FIToFIPaymentCancellationRequestV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentCancellationRequestV06
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV07> forFIToFIPaymentCancellationRequestV07 = new MMConstraint<FIToFIPaymentCancellationRequestV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentCancellationRequestV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV06;
			owner_lazy = () -> FIToFIPaymentCancellationRequestV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV07
	 * BankToCustomerStatementV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerStatementV06
	 * ConstraintSupplementaryDataRule.forBankToCustomerStatementV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerStatementV07> forBankToCustomerStatementV07 = new MMConstraint<BankToCustomerStatementV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkBankToCustomerStatementV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerStatementV06;
			owner_lazy = () -> BankToCustomerStatementV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV07
	 * BankToCustomerDebitCreditNotificationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerDebitCreditNotificationV06
	 * ConstraintSupplementaryDataRule.
	 * forBankToCustomerDebitCreditNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerDebitCreditNotificationV07> forBankToCustomerDebitCreditNotificationV07 = new MMConstraint<BankToCustomerDebitCreditNotificationV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkBankToCustomerDebitCreditNotificationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerDebitCreditNotificationV06;
			owner_lazy = () -> BankToCustomerDebitCreditNotificationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV07
	 * CustomerPaymentCancellationRequestV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentCancellationRequestV06
	 * ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV06}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV07> forCustomerPaymentCancellationRequestV07 = new MMConstraint<CustomerPaymentCancellationRequestV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentCancellationRequestV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV06;
			owner_lazy = () -> CustomerPaymentCancellationRequestV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV06
	 * BankToCustomerAccountReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerAccountReportV07
	 * ConstraintSupplementaryDataRule.forBankToCustomerAccountReportV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerAccountReportV05
	 * ConstraintSupplementaryDataRule.forBankToCustomerAccountReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerAccountReportV06> forBankToCustomerAccountReportV06 = new MMConstraint<BankToCustomerAccountReportV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkBankToCustomerAccountReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerAccountReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerAccountReportV05;
			owner_lazy = () -> BankToCustomerAccountReportV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV06
	 * BankToCustomerStatementV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerStatementV07
	 * ConstraintSupplementaryDataRule.forBankToCustomerStatementV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerStatementV05
	 * ConstraintSupplementaryDataRule.forBankToCustomerStatementV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerStatementV06> forBankToCustomerStatementV06 = new MMConstraint<BankToCustomerStatementV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkBankToCustomerStatementV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerStatementV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerStatementV05;
			owner_lazy = () -> BankToCustomerStatementV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06
	 * BankToCustomerDebitCreditNotificationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerDebitCreditNotificationV07
	 * ConstraintSupplementaryDataRule.
	 * forBankToCustomerDebitCreditNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerDebitCreditNotificationV05
	 * ConstraintSupplementaryDataRule.
	 * forBankToCustomerDebitCreditNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerDebitCreditNotificationV06> forBankToCustomerDebitCreditNotificationV06 = new MMConstraint<BankToCustomerDebitCreditNotificationV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkBankToCustomerDebitCreditNotificationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerDebitCreditNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerDebitCreditNotificationV05;
			owner_lazy = () -> BankToCustomerDebitCreditNotificationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV06
	 * CustomerPaymentCancellationRequestV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentCancellationRequestV07
	 * ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV07}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentCancellationRequestV05
	 * ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV05}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV06> forCustomerPaymentCancellationRequestV06 = new MMConstraint<CustomerPaymentCancellationRequestV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentCancellationRequestV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV05;
			owner_lazy = () -> CustomerPaymentCancellationRequestV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV06
	 * FIToFIPaymentCancellationRequestV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentCancellationRequestV07
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentCancellationRequestV05
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV06> forFIToFIPaymentCancellationRequestV06 = new MMConstraint<FIToFIPaymentCancellationRequestV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentCancellationRequestV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV05;
			owner_lazy = () -> FIToFIPaymentCancellationRequestV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionDirectDebitV02
	 * FinancialInstitutionDirectDebitV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionDirectDebitV02> forFinancialInstitutionDirectDebitV02 = new MMConstraint<FinancialInstitutionDirectDebitV02>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFinancialInstitutionDirectDebitV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			owner_lazy = () -> FinancialInstitutionDirectDebitV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07
	 * FIToFICustomerDirectDebitV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFICustomerDirectDebitV06
	 * ConstraintSupplementaryDataRule.forFIToFICustomerDirectDebitV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV07> forFIToFICustomerDirectDebitV07 = new MMConstraint<FIToFICustomerDirectDebitV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFICustomerDirectDebitV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFICustomerDirectDebitV06;
			owner_lazy = () -> FIToFICustomerDirectDebitV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV07
	 * FIToFICustomerCreditTransferV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFICustomerCreditTransferV06
	 * ConstraintSupplementaryDataRule.forFIToFICustomerCreditTransferV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV07> forFIToFICustomerCreditTransferV07 = new MMConstraint<FIToFICustomerCreditTransferV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFICustomerCreditTransferV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFICustomerCreditTransferV06;
			owner_lazy = () -> FIToFICustomerCreditTransferV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV07
	 * FinancialInstitutionCreditTransferV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFinancialInstitutionCreditTransferV06
	 * ConstraintSupplementaryDataRule.forFinancialInstitutionCreditTransferV06}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV07> forFinancialInstitutionCreditTransferV07 = new MMConstraint<FinancialInstitutionCreditTransferV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFinancialInstitutionCreditTransferV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFinancialInstitutionCreditTransferV06;
			owner_lazy = () -> FinancialInstitutionCreditTransferV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV08
	 * FIToFIPaymentReversalV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentReversalV07
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV08> forFIToFIPaymentReversalV08 = new MMConstraint<FIToFIPaymentReversalV08>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentReversalV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV07;
			owner_lazy = () -> FIToFIPaymentReversalV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV08
	 * PaymentReturnV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forPaymentReturnV07
	 * ConstraintSupplementaryDataRule.forPaymentReturnV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV08> forPaymentReturnV08 = new MMConstraint<PaymentReturnV08>() {
		{
			validator = ConstraintSupplementaryDataRule::checkPaymentReturnV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forPaymentReturnV07;
			owner_lazy = () -> PaymentReturnV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV09
	 * FIToFIPaymentStatusReportV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentStatusReportV08
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV09> forFIToFIPaymentStatusReportV09 = new MMConstraint<FIToFIPaymentStatusReportV09>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentStatusReportV09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV08;
			owner_lazy = () -> FIToFIPaymentStatusReportV09.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV02
	 * FIToFIPaymentStatusRequestV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentStatusRequestV01
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentStatusRequestV01}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusRequestV02> forFIToFIPaymentStatusRequestV02 = new MMConstraint<FIToFIPaymentStatusRequestV02>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentStatusRequestV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentStatusRequestV01;
			owner_lazy = () -> FIToFIPaymentStatusRequestV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV06
	 * FIToFICustomerDirectDebitV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFICustomerDirectDebitV07
	 * ConstraintSupplementaryDataRule.forFIToFICustomerDirectDebitV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFICustomerDirectDebitV05
	 * ConstraintSupplementaryDataRule.forFIToFICustomerDirectDebitV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV06> forFIToFICustomerDirectDebitV06 = new MMConstraint<FIToFICustomerDirectDebitV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFICustomerDirectDebitV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFICustomerDirectDebitV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFICustomerDirectDebitV05;
			owner_lazy = () -> FIToFICustomerDirectDebitV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06
	 * FinancialInstitutionCreditTransferV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFinancialInstitutionCreditTransferV07
	 * ConstraintSupplementaryDataRule.forFinancialInstitutionCreditTransferV07}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFinancialInstitutionCreditTransferV05
	 * ConstraintSupplementaryDataRule.forFinancialInstitutionCreditTransferV05}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV06> forFinancialInstitutionCreditTransferV06 = new MMConstraint<FinancialInstitutionCreditTransferV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFinancialInstitutionCreditTransferV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFinancialInstitutionCreditTransferV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFinancialInstitutionCreditTransferV05;
			owner_lazy = () -> FinancialInstitutionCreditTransferV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV06
	 * FIToFICustomerCreditTransferV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFICustomerCreditTransferV07
	 * ConstraintSupplementaryDataRule.forFIToFICustomerCreditTransferV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFICustomerCreditTransferV05
	 * ConstraintSupplementaryDataRule.forFIToFICustomerCreditTransferV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV06> forFIToFICustomerCreditTransferV06 = new MMConstraint<FIToFICustomerCreditTransferV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFICustomerCreditTransferV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFICustomerCreditTransferV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFICustomerCreditTransferV05;
			owner_lazy = () -> FIToFICustomerCreditTransferV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01
	 * FIToFIPaymentStatusRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentStatusRequestV02
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentStatusRequestV02}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusRequestV01> forFIToFIPaymentStatusRequestV01 = new MMConstraint<FIToFIPaymentStatusRequestV01>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentStatusRequestV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentStatusRequestV02);
			owner_lazy = () -> FIToFIPaymentStatusRequestV01.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forPaymentReturnV08
	 * ConstraintSupplementaryDataRule.forPaymentReturnV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forPaymentReturnV06
	 * ConstraintSupplementaryDataRule.forPaymentReturnV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV07> forPaymentReturnV07 = new MMConstraint<PaymentReturnV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkPaymentReturnV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forPaymentReturnV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forPaymentReturnV06;
			owner_lazy = () -> PaymentReturnV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08
	 * FIToFIPaymentStatusReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentStatusReportV09
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentStatusReportV07
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV08> forFIToFIPaymentStatusReportV08 = new MMConstraint<FIToFIPaymentStatusReportV08>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentStatusReportV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV07;
			owner_lazy = () -> FIToFIPaymentStatusReportV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07
	 * FIToFIPaymentReversalV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentReversalV08
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentReversalV06
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV07> forFIToFIPaymentReversalV07 = new MMConstraint<FIToFIPaymentReversalV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentReversalV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV06;
			owner_lazy = () -> FIToFIPaymentReversalV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV04
	 * BankToCustomerAccountReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerAccountReportV05
	 * ConstraintSupplementaryDataRule.forBankToCustomerAccountReportV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerAccountReportV04> forBankToCustomerAccountReportV04 = new MMConstraint<BankToCustomerAccountReportV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkBankToCustomerAccountReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerAccountReportV05);
			owner_lazy = () -> BankToCustomerAccountReportV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV04
	 * BankToCustomerDebitCreditNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerDebitCreditNotificationV05
	 * ConstraintSupplementaryDataRule.
	 * forBankToCustomerDebitCreditNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerDebitCreditNotificationV04> forBankToCustomerDebitCreditNotificationV04 = new MMConstraint<BankToCustomerDebitCreditNotificationV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkBankToCustomerDebitCreditNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerDebitCreditNotificationV05);
			owner_lazy = () -> BankToCustomerDebitCreditNotificationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV04
	 * BankToCustomerStatementV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerStatementV05
	 * ConstraintSupplementaryDataRule.forBankToCustomerStatementV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerStatementV04> forBankToCustomerStatementV04 = new MMConstraint<BankToCustomerStatementV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkBankToCustomerStatementV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerStatementV05);
			owner_lazy = () -> BankToCustomerStatementV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV03
	 * CustomerPaymentCancellationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentCancellationRequestV04
	 * ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV04}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV03> forCustomerPaymentCancellationRequestV03 = new MMConstraint<CustomerPaymentCancellationRequestV03>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentCancellationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV04);
			owner_lazy = () -> CustomerPaymentCancellationRequestV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV03
	 * FIToFIPaymentCancellationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentCancellationRequestV04
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV03> forFIToFIPaymentCancellationRequestV03 = new MMConstraint<FIToFIPaymentCancellationRequestV03>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentCancellationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV04);
			owner_lazy = () -> FIToFIPaymentCancellationRequestV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV05
	 * BankToCustomerStatementV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerStatementV06
	 * ConstraintSupplementaryDataRule.forBankToCustomerStatementV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerStatementV04
	 * ConstraintSupplementaryDataRule.forBankToCustomerStatementV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerStatementV05> forBankToCustomerStatementV05 = new MMConstraint<BankToCustomerStatementV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkBankToCustomerStatementV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerStatementV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerStatementV04;
			owner_lazy = () -> BankToCustomerStatementV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV05
	 * BankToCustomerAccountReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerAccountReportV06
	 * ConstraintSupplementaryDataRule.forBankToCustomerAccountReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerAccountReportV04
	 * ConstraintSupplementaryDataRule.forBankToCustomerAccountReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerAccountReportV05> forBankToCustomerAccountReportV05 = new MMConstraint<BankToCustomerAccountReportV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkBankToCustomerAccountReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerAccountReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerAccountReportV04;
			owner_lazy = () -> BankToCustomerAccountReportV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV04
	 * FIToFIPaymentCancellationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentCancellationRequestV05
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentCancellationRequestV03
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV04> forFIToFIPaymentCancellationRequestV04 = new MMConstraint<FIToFIPaymentCancellationRequestV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentCancellationRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV03;
			owner_lazy = () -> FIToFIPaymentCancellationRequestV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV04
	 * CustomerPaymentCancellationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentCancellationRequestV05
	 * ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV05}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentCancellationRequestV03
	 * ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV03}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV04> forCustomerPaymentCancellationRequestV04 = new MMConstraint<CustomerPaymentCancellationRequestV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentCancellationRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV03;
			owner_lazy = () -> CustomerPaymentCancellationRequestV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV05
	 * BankToCustomerDebitCreditNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerDebitCreditNotificationV06
	 * ConstraintSupplementaryDataRule.
	 * forBankToCustomerDebitCreditNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forBankToCustomerDebitCreditNotificationV04
	 * ConstraintSupplementaryDataRule.
	 * forBankToCustomerDebitCreditNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<BankToCustomerDebitCreditNotificationV05> forBankToCustomerDebitCreditNotificationV05 = new MMConstraint<BankToCustomerDebitCreditNotificationV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkBankToCustomerDebitCreditNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerDebitCreditNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forBankToCustomerDebitCreditNotificationV04;
			owner_lazy = () -> BankToCustomerDebitCreditNotificationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV05
	 * FIToFIPaymentCancellationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentCancellationRequestV06
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentCancellationRequestV04
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentCancellationRequestV05> forFIToFIPaymentCancellationRequestV05 = new MMConstraint<FIToFIPaymentCancellationRequestV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentCancellationRequestV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentCancellationRequestV04;
			owner_lazy = () -> FIToFIPaymentCancellationRequestV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.CustomerPaymentCancellationRequestV05
	 * CustomerPaymentCancellationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentCancellationRequestV06
	 * ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV06}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentCancellationRequestV04
	 * ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV04}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentCancellationRequestV05> forCustomerPaymentCancellationRequestV05 = new MMConstraint<CustomerPaymentCancellationRequestV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentCancellationRequestV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentCancellationRequestV04;
			owner_lazy = () -> CustomerPaymentCancellationRequestV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV05
	 * CustomerCreditTransferInitiationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerCreditTransferInitiationV06
	 * ConstraintSupplementaryDataRule.forCustomerCreditTransferInitiationV06}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerCreditTransferInitiationV05> forCustomerCreditTransferInitiationV05 = new MMConstraint<CustomerCreditTransferInitiationV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerCreditTransferInitiationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerCreditTransferInitiationV06);
			owner_lazy = () -> CustomerCreditTransferInitiationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV04
	 * CustomerDirectDebitInitiationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerDirectDebitInitiationV05
	 * ConstraintSupplementaryDataRule.forCustomerDirectDebitInitiationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerDirectDebitInitiationV04> forCustomerDirectDebitInitiationV04 = new MMConstraint<CustomerDirectDebitInitiationV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerDirectDebitInitiationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerDirectDebitInitiationV05);
			owner_lazy = () -> CustomerDirectDebitInitiationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV04
	 * CustomerPaymentReversalV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentReversalV05
	 * ConstraintSupplementaryDataRule.forCustomerPaymentReversalV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV04> forCustomerPaymentReversalV04 = new MMConstraint<CustomerPaymentReversalV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentReversalV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentReversalV05);
			owner_lazy = () -> CustomerPaymentReversalV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV05
	 * CustomerPaymentStatusReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentStatusReportV06
	 * ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV06}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV05> forCustomerPaymentStatusReportV05 = new MMConstraint<CustomerPaymentStatusReportV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentStatusReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV06);
			owner_lazy = () -> CustomerPaymentStatusReportV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV03
	 * MandateAcceptanceReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateAcceptanceReportV04
	 * ConstraintSupplementaryDataRule.forMandateAcceptanceReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateAcceptanceReportV03> forMandateAcceptanceReportV03 = new MMConstraint<MandateAcceptanceReportV03>() {
		{
			validator = ConstraintSupplementaryDataRule::checkMandateAcceptanceReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateAcceptanceReportV04);
			owner_lazy = () -> MandateAcceptanceReportV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV03
	 * MandateAmendmentRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateAmendmentRequestV04
	 * ConstraintSupplementaryDataRule.forMandateAmendmentRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateAmendmentRequestV03> forMandateAmendmentRequestV03 = new MMConstraint<MandateAmendmentRequestV03>() {
		{
			validator = ConstraintSupplementaryDataRule::checkMandateAmendmentRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateAmendmentRequestV04);
			owner_lazy = () -> MandateAmendmentRequestV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV03
	 * MandateCancellationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateCancellationRequestV04
	 * ConstraintSupplementaryDataRule.forMandateCancellationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateCancellationRequestV03> forMandateCancellationRequestV03 = new MMConstraint<MandateCancellationRequestV03>() {
		{
			validator = ConstraintSupplementaryDataRule::checkMandateCancellationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateCancellationRequestV04);
			owner_lazy = () -> MandateCancellationRequestV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV03
	 * MandateInitiationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forMandateInitiationRequestV04
	 * ConstraintSupplementaryDataRule.forMandateInitiationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateInitiationRequestV03> forMandateInitiationRequestV03 = new MMConstraint<MandateInitiationRequestV03>() {
		{
			validator = ConstraintSupplementaryDataRule::checkMandateInitiationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forMandateInitiationRequestV04);
			owner_lazy = () -> MandateInitiationRequestV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV03
	 * CreditorPaymentActivationRequestStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCreditorPaymentActivationRequestStatusReportV04
	 * ConstraintSupplementaryDataRule.
	 * forCreditorPaymentActivationRequestStatusReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestStatusReportV03> forCreditorPaymentActivationRequestStatusReportV03 = new MMConstraint<CreditorPaymentActivationRequestStatusReportV03>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCreditorPaymentActivationRequestStatusReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestStatusReportV04);
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV03
	 * CreditorPaymentActivationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCreditorPaymentActivationRequestV04
	 * ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestV03> forCreditorPaymentActivationRequestV03 = new MMConstraint<CreditorPaymentActivationRequestV03>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCreditorPaymentActivationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestV04);
			owner_lazy = () -> CreditorPaymentActivationRequestV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV05
	 * CustomerPaymentReversalV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentReversalV06
	 * ConstraintSupplementaryDataRule.forCustomerPaymentReversalV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentReversalV04
	 * ConstraintSupplementaryDataRule.forCustomerPaymentReversalV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV05> forCustomerPaymentReversalV05 = new MMConstraint<CustomerPaymentReversalV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentReversalV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentReversalV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentReversalV04;
			owner_lazy = () -> CustomerPaymentReversalV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV06
	 * CustomerCreditTransferInitiationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerCreditTransferInitiationV07
	 * ConstraintSupplementaryDataRule.forCustomerCreditTransferInitiationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerCreditTransferInitiationV05
	 * ConstraintSupplementaryDataRule.forCustomerCreditTransferInitiationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerCreditTransferInitiationV06> forCustomerCreditTransferInitiationV06 = new MMConstraint<CustomerCreditTransferInitiationV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerCreditTransferInitiationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerCreditTransferInitiationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerCreditTransferInitiationV05;
			owner_lazy = () -> CustomerCreditTransferInitiationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV06
	 * CustomerPaymentStatusReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentStatusReportV07
	 * ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentStatusReportV05
	 * ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV06> forCustomerPaymentStatusReportV06 = new MMConstraint<CustomerPaymentStatusReportV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentStatusReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV05;
			owner_lazy = () -> CustomerPaymentStatusReportV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05
	 * CustomerDirectDebitInitiationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerDirectDebitInitiationV06
	 * ConstraintSupplementaryDataRule.forCustomerDirectDebitInitiationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerDirectDebitInitiationV04
	 * ConstraintSupplementaryDataRule.forCustomerDirectDebitInitiationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerDirectDebitInitiationV05> forCustomerDirectDebitInitiationV05 = new MMConstraint<CustomerDirectDebitInitiationV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerDirectDebitInitiationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerDirectDebitInitiationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerDirectDebitInitiationV04;
			owner_lazy = () -> CustomerDirectDebitInitiationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV04
	 * CreditorPaymentActivationRequestStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCreditorPaymentActivationRequestStatusReportV05
	 * ConstraintSupplementaryDataRule.
	 * forCreditorPaymentActivationRequestStatusReportV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCreditorPaymentActivationRequestStatusReportV03
	 * ConstraintSupplementaryDataRule.
	 * forCreditorPaymentActivationRequestStatusReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestStatusReportV04> forCreditorPaymentActivationRequestStatusReportV04 = new MMConstraint<CreditorPaymentActivationRequestStatusReportV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCreditorPaymentActivationRequestStatusReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestStatusReportV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestStatusReportV03;
			owner_lazy = () -> CreditorPaymentActivationRequestStatusReportV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV04
	 * CreditorPaymentActivationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCreditorPaymentActivationRequestV05
	 * ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCreditorPaymentActivationRequestV03
	 * ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<CreditorPaymentActivationRequestV04> forCreditorPaymentActivationRequestV04 = new MMConstraint<CreditorPaymentActivationRequestV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCreditorPaymentActivationRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCreditorPaymentActivationRequestV03;
			owner_lazy = () -> CreditorPaymentActivationRequestV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV06
	 * CustomerPaymentReversalV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentReversalV07
	 * ConstraintSupplementaryDataRule.forCustomerPaymentReversalV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentReversalV05
	 * ConstraintSupplementaryDataRule.forCustomerPaymentReversalV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentReversalV06> forCustomerPaymentReversalV06 = new MMConstraint<CustomerPaymentReversalV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentReversalV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentReversalV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentReversalV05;
			owner_lazy = () -> CustomerPaymentReversalV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV07
	 * CustomerPaymentStatusReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentStatusReportV08
	 * ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentStatusReportV06
	 * ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CustomerPaymentStatusReportV07> forCustomerPaymentStatusReportV07 = new MMConstraint<CustomerPaymentStatusReportV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkCustomerPaymentStatusReportV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentStatusReportV06;
			owner_lazy = () -> CustomerPaymentStatusReportV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV04
	 * FIToFICustomerCreditTransferV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFICustomerCreditTransferV05
	 * ConstraintSupplementaryDataRule.forFIToFICustomerCreditTransferV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV04> forFIToFICustomerCreditTransferV04 = new MMConstraint<FIToFICustomerCreditTransferV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFICustomerCreditTransferV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFICustomerCreditTransferV05);
			owner_lazy = () -> FIToFICustomerCreditTransferV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV04
	 * FIToFICustomerDirectDebitV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFICustomerDirectDebitV05
	 * ConstraintSupplementaryDataRule.forFIToFICustomerDirectDebitV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV04> forFIToFICustomerDirectDebitV04 = new MMConstraint<FIToFICustomerDirectDebitV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFICustomerDirectDebitV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFICustomerDirectDebitV05);
			owner_lazy = () -> FIToFICustomerDirectDebitV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV04
	 * FIToFIPaymentReversalV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentReversalV05
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV04> forFIToFIPaymentReversalV04 = new MMConstraint<FIToFIPaymentReversalV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentReversalV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV05);
			owner_lazy = () -> FIToFIPaymentReversalV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV05
	 * FIToFIPaymentStatusReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentStatusReportV06
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV06}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV05> forFIToFIPaymentStatusReportV05 = new MMConstraint<FIToFIPaymentStatusReportV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentStatusReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV06);
			owner_lazy = () -> FIToFIPaymentStatusReportV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV04
	 * FinancialInstitutionCreditTransferV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFinancialInstitutionCreditTransferV05
	 * ConstraintSupplementaryDataRule.forFinancialInstitutionCreditTransferV05}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV04> forFinancialInstitutionCreditTransferV04 = new MMConstraint<FinancialInstitutionCreditTransferV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFinancialInstitutionCreditTransferV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFinancialInstitutionCreditTransferV05);
			owner_lazy = () -> FinancialInstitutionCreditTransferV04.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forPaymentReturnV05
	 * ConstraintSupplementaryDataRule.forPaymentReturnV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV04> forPaymentReturnV04 = new MMConstraint<PaymentReturnV04>() {
		{
			validator = ConstraintSupplementaryDataRule::checkPaymentReturnV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forPaymentReturnV05);
			owner_lazy = () -> PaymentReturnV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV05
	 * FinancialInstitutionCreditTransferV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFinancialInstitutionCreditTransferV06
	 * ConstraintSupplementaryDataRule.forFinancialInstitutionCreditTransferV06}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFinancialInstitutionCreditTransferV04
	 * ConstraintSupplementaryDataRule.forFinancialInstitutionCreditTransferV04}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<FinancialInstitutionCreditTransferV05> forFinancialInstitutionCreditTransferV05 = new MMConstraint<FinancialInstitutionCreditTransferV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFinancialInstitutionCreditTransferV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFinancialInstitutionCreditTransferV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFinancialInstitutionCreditTransferV04;
			owner_lazy = () -> FinancialInstitutionCreditTransferV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06
	 * FIToFIPaymentStatusReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentStatusReportV07
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentStatusReportV05
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV06> forFIToFIPaymentStatusReportV06 = new MMConstraint<FIToFIPaymentStatusReportV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentStatusReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV05;
			owner_lazy = () -> FIToFIPaymentStatusReportV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV05
	 * FIToFICustomerDirectDebitV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFICustomerDirectDebitV06
	 * ConstraintSupplementaryDataRule.forFIToFICustomerDirectDebitV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFICustomerDirectDebitV04
	 * ConstraintSupplementaryDataRule.forFIToFICustomerDirectDebitV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerDirectDebitV05> forFIToFICustomerDirectDebitV05 = new MMConstraint<FIToFICustomerDirectDebitV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFICustomerDirectDebitV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFICustomerDirectDebitV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFICustomerDirectDebitV04;
			owner_lazy = () -> FIToFICustomerDirectDebitV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV05
	 * FIToFIPaymentReversalV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentReversalV06
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentReversalV04
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV05> forFIToFIPaymentReversalV05 = new MMConstraint<FIToFIPaymentReversalV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentReversalV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV04;
			owner_lazy = () -> FIToFIPaymentReversalV05.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forPaymentReturnV06
	 * ConstraintSupplementaryDataRule.forPaymentReturnV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forPaymentReturnV04
	 * ConstraintSupplementaryDataRule.forPaymentReturnV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV05> forPaymentReturnV05 = new MMConstraint<PaymentReturnV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkPaymentReturnV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forPaymentReturnV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forPaymentReturnV04;
			owner_lazy = () -> PaymentReturnV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV05
	 * FIToFICustomerCreditTransferV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFICustomerCreditTransferV06
	 * ConstraintSupplementaryDataRule.forFIToFICustomerCreditTransferV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFICustomerCreditTransferV04
	 * ConstraintSupplementaryDataRule.forFIToFICustomerCreditTransferV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFICustomerCreditTransferV05> forFIToFICustomerCreditTransferV05 = new MMConstraint<FIToFICustomerCreditTransferV05>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFICustomerCreditTransferV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFICustomerCreditTransferV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFICustomerCreditTransferV04;
			owner_lazy = () -> FIToFICustomerCreditTransferV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07
	 * FIToFIPaymentStatusReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentStatusReportV08
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentStatusReportV06
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentStatusReportV07> forFIToFIPaymentStatusReportV07 = new MMConstraint<FIToFIPaymentStatusReportV07>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentStatusReportV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentStatusReportV06;
			owner_lazy = () -> FIToFIPaymentStatusReportV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV06
	 * FIToFIPaymentReversalV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentReversalV07
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentReversalV05
	 * ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<FIToFIPaymentReversalV06> forFIToFIPaymentReversalV06 = new MMConstraint<FIToFIPaymentReversalV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkFIToFIPaymentReversalV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentReversalV05;
			owner_lazy = () -> FIToFIPaymentReversalV06.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forPaymentReturnV07
	 * ConstraintSupplementaryDataRule.forPaymentReturnV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forPaymentReturnV05
	 * ConstraintSupplementaryDataRule.forPaymentReturnV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<PaymentReturnV06> forPaymentReturnV06 = new MMConstraint<PaymentReturnV06>() {
		{
			validator = ConstraintSupplementaryDataRule::checkPaymentReturnV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "The SupplementaryData building block at message level must not be used to provide additional information about a transaction. The SupplementaryData element at transaction level should be used for that purpose.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forPaymentReturnV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forPaymentReturnV05;
			owner_lazy = () -> PaymentReturnV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryDataRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This component may not be used without the explicit approval of a SEG and submission to the RA of ISO 20022 compliant structure(s) to be used in the Envelope element."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SupplementaryData1> forSupplementaryData1 = new MMConstraint<SupplementaryData1>() {
		{
			validator = ConstraintSupplementaryDataRule::checkSupplementaryData1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryDataRule";
			definition = "This component may not be used without the explicit approval of a SEG and submission to the RA of ISO 20022 compliant structure(s) to be used in the Envelope element.";
			owner_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateAmendmentRequestV04(MandateAmendmentRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateCancellationRequestV04(MandateCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateAcceptanceReportV04(MandateAcceptanceReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateInitiationRequestV04(MandateInitiationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerCreditTransferInitiationV07(CustomerCreditTransferInitiationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCreditorPaymentActivationRequestV05(CreditorPaymentActivationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerDirectDebitInitiationV06(CustomerDirectDebitInitiationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCreditorPaymentActivationRequestStatusReportV05(CreditorPaymentActivationRequestStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentStatusReportV08(CustomerPaymentStatusReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentReversalV07(CustomerPaymentReversalV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateAcceptanceReportV05(MandateAcceptanceReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateAmendmentRequestV05(MandateAmendmentRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateInitiationRequestV05(MandateInitiationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerCreditTransferInitiationV08(CustomerCreditTransferInitiationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateCancellationRequestV05(MandateCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerDirectDebitInitiationV07(CustomerDirectDebitInitiationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCreditorPaymentActivationRequestStatusReportV06(CreditorPaymentActivationRequestStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCreditorPaymentActivationRequestV06(CreditorPaymentActivationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateSuspensionRequestV01(MandateSuspensionRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateCopyRequestV01(MandateCopyRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentStatusReportV09(CustomerPaymentStatusReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentReversalV08(CustomerPaymentReversalV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerAccountReportV07(BankToCustomerAccountReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentCancellationRequestV07(FIToFIPaymentCancellationRequestV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerStatementV07(BankToCustomerStatementV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerDebitCreditNotificationV07(BankToCustomerDebitCreditNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentCancellationRequestV07(CustomerPaymentCancellationRequestV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerAccountReportV06(BankToCustomerAccountReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerStatementV06(BankToCustomerStatementV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerDebitCreditNotificationV06(BankToCustomerDebitCreditNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentCancellationRequestV06(CustomerPaymentCancellationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentCancellationRequestV06(FIToFIPaymentCancellationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFinancialInstitutionDirectDebitV02(FinancialInstitutionDirectDebitV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFICustomerDirectDebitV07(FIToFICustomerDirectDebitV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFICustomerCreditTransferV07(FIToFICustomerCreditTransferV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFinancialInstitutionCreditTransferV07(FinancialInstitutionCreditTransferV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentReversalV08(FIToFIPaymentReversalV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkPaymentReturnV08(PaymentReturnV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentStatusReportV09(FIToFIPaymentStatusReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentStatusRequestV02(FIToFIPaymentStatusRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFICustomerDirectDebitV06(FIToFICustomerDirectDebitV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFinancialInstitutionCreditTransferV06(FinancialInstitutionCreditTransferV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFICustomerCreditTransferV06(FIToFICustomerCreditTransferV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentStatusRequestV01(FIToFIPaymentStatusRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkPaymentReturnV07(PaymentReturnV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentStatusReportV08(FIToFIPaymentStatusReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentReversalV07(FIToFIPaymentReversalV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerAccountReportV04(BankToCustomerAccountReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerDebitCreditNotificationV04(BankToCustomerDebitCreditNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerStatementV04(BankToCustomerStatementV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentCancellationRequestV03(CustomerPaymentCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentCancellationRequestV03(FIToFIPaymentCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerStatementV05(BankToCustomerStatementV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerAccountReportV05(BankToCustomerAccountReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentCancellationRequestV04(FIToFIPaymentCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentCancellationRequestV04(CustomerPaymentCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkBankToCustomerDebitCreditNotificationV05(BankToCustomerDebitCreditNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentCancellationRequestV05(FIToFIPaymentCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentCancellationRequestV05(CustomerPaymentCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerCreditTransferInitiationV05(CustomerCreditTransferInitiationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerDirectDebitInitiationV04(CustomerDirectDebitInitiationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentReversalV04(CustomerPaymentReversalV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentStatusReportV05(CustomerPaymentStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateAcceptanceReportV03(MandateAcceptanceReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateAmendmentRequestV03(MandateAmendmentRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateCancellationRequestV03(MandateCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkMandateInitiationRequestV03(MandateInitiationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCreditorPaymentActivationRequestStatusReportV03(CreditorPaymentActivationRequestStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCreditorPaymentActivationRequestV03(CreditorPaymentActivationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentReversalV05(CustomerPaymentReversalV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerCreditTransferInitiationV06(CustomerCreditTransferInitiationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentStatusReportV06(CustomerPaymentStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerDirectDebitInitiationV05(CustomerDirectDebitInitiationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCreditorPaymentActivationRequestStatusReportV04(CreditorPaymentActivationRequestStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCreditorPaymentActivationRequestV04(CreditorPaymentActivationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentReversalV06(CustomerPaymentReversalV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkCustomerPaymentStatusReportV07(CustomerPaymentStatusReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFICustomerCreditTransferV04(FIToFICustomerCreditTransferV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFICustomerDirectDebitV04(FIToFICustomerDirectDebitV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentReversalV04(FIToFIPaymentReversalV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentStatusReportV05(FIToFIPaymentStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFinancialInstitutionCreditTransferV04(FinancialInstitutionCreditTransferV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkPaymentReturnV04(PaymentReturnV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFinancialInstitutionCreditTransferV05(FinancialInstitutionCreditTransferV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentStatusReportV06(FIToFIPaymentStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFICustomerDirectDebitV05(FIToFICustomerDirectDebitV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentReversalV05(FIToFIPaymentReversalV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkPaymentReturnV05(PaymentReturnV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFICustomerCreditTransferV05(FIToFICustomerCreditTransferV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentStatusReportV07(FIToFIPaymentStatusReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkFIToFIPaymentReversalV06(FIToFIPaymentReversalV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The SupplementaryData building block at message level must not be used to
	 * provide additional information about a transaction. The SupplementaryData
	 * element at transaction level should be used for that purpose.
	 */
	public static void checkPaymentReturnV06(PaymentReturnV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * This component may not be used without the explicit approval of a SEG and
	 * submission to the RA of ISO 20022 compliant structure(s) to be used in
	 * the Envelope element.
	 */
	public static void checkSupplementaryData1(SupplementaryData1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}