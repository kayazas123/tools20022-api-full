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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV06;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.codeset.PaymentMethod7Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Instruction to pay an amount of money to an ultimate beneficiary, on behalf
 * of an originator. This instruction may have to be forwarded several times to
 * complete the settlement chain.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmPaymentInformationIdentification
 * PaymentInstruction23.mmPaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmPaymentMethod
 * PaymentInstruction23.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmPaymentTypeInformation
 * PaymentInstruction23.mmPaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmRequestedExecutionDate
 * PaymentInstruction23.mmRequestedExecutionDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmDebtor
 * PaymentInstruction23.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmDebtorAccount
 * PaymentInstruction23.mmDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmDebtorAgent
 * PaymentInstruction23.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmUltimateDebtor
 * PaymentInstruction23.mmUltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmChargeBearer
 * PaymentInstruction23.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmCreditTransferTransaction
 * PaymentInstruction23.mmCreditTransferTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV06#mmPaymentInformation
 * CreditorPaymentActivationRequestV06.mmPaymentInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInstruction23"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule#forPaymentInstruction23
 * ConstraintPaymentTypeInformationRule.forPaymentInstruction23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionRule#forPaymentInstruction23
 * ConstraintChequeInstructionRule.forPaymentInstruction23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule#forPaymentInstruction23
 * ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAgentRule#forPaymentInstruction23
 * ConstraintCreditorAgentRule.forPaymentInstruction23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstruction23
 * ConstraintUltimateDebtorGuideline.forPaymentInstruction23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction23
 * ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstruction23
 * ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction23
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstruction23
 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
 * forPaymentInstruction23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeFromGuideline#forPaymentInstruction23
 * ConstraintChequeFromGuideline.forPaymentInstruction23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction23
 * ConstraintChargeBearerRule.forPaymentInstruction23}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19
 * PaymentInstruction19}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentInstruction23", propOrder = {"paymentInformationIdentification", "paymentMethod", "paymentTypeInformation", "requestedExecutionDate", "debtor", "debtorAccount", "debtorAgent", "ultimateDebtor", "chargeBearer",
		"creditTransferTransaction"})
public class PaymentInstruction23 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtInfId")
	protected Max35Text paymentInformationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInfId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by a sending party to unambiguously identify the payment information block within the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmPaymentInformationIdentification
	 * PaymentInstruction19.mmPaymentInformationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction23, Optional<Max35Text>> mmPaymentInformationIdentification = new MMMessageAttribute<PaymentInstruction23, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "PmtInfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationIdentification";
			definition = "Reference assigned by a sending party to unambiguously identify the payment information block within the message.";
			previousVersion_lazy = () -> PaymentInstruction19.mmPaymentInformationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentInstruction23 obj) {
			return obj.getPaymentInformationIdentification();
		}

		@Override
		public void setValue(PaymentInstruction23 obj, Optional<Max35Text> value) {
			obj.setPaymentInformationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtMtd", required = true)
	protected PaymentMethod7Code paymentMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentMethod7Code
	 * PaymentMethod7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmMethod
	 * CreditInstrument.mmMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the means of payment that will be used to move the amount of money."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmPaymentMethod
	 * PaymentInstruction19.mmPaymentMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction23, PaymentMethod7Code> mmPaymentMethod = new MMMessageAttribute<PaymentInstruction23, PaymentMethod7Code>() {
		{
			businessElementTrace_lazy = () -> CreditInstrument.mmMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Specifies the means of payment that will be used to move the amount of money.";
			previousVersion_lazy = () -> PaymentInstruction19.mmPaymentMethod;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentMethod7Code.mmObject();
		}

		@Override
		public PaymentMethod7Code getValue(PaymentInstruction23 obj) {
			return obj.getPaymentMethod();
		}

		@Override
		public void setValue(PaymentInstruction23 obj, PaymentMethod7Code value) {
			obj.setPaymentMethod(value);
		}
	};
	@XmlElement(name = "PmtTpInf")
	protected PaymentTypeInformation19 paymentTypeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19
	 * PaymentTypeInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
	 * PaymentExecution.mmProcessingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTpInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTypeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to further specify the type of transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmPaymentTypeInformation
	 * PaymentInstruction19.mmPaymentTypeInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction23, Optional<PaymentTypeInformation19>> mmPaymentTypeInformation = new MMMessageAssociationEnd<PaymentInstruction23, Optional<PaymentTypeInformation19>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmProcessingInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeInformation";
			definition = "Set of elements used to further specify the type of transaction.";
			previousVersion_lazy = () -> PaymentInstruction19.mmPaymentTypeInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTypeInformation19.mmObject();
		}

		@Override
		public Optional<PaymentTypeInformation19> getValue(PaymentInstruction23 obj) {
			return obj.getPaymentTypeInformation();
		}

		@Override
		public void setValue(PaymentInstruction23 obj, Optional<PaymentTypeInformation19> value) {
			obj.setPaymentTypeInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdExctnDt", required = true)
	protected DateAndDateTimeChoice requestedExecutionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRequestedExecutionDate
	 * PaymentExecution.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdExctnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the initiating party requests the clearing agent to process the payment. If payment by cheque, the date when the cheque must be generated by the bank.\r\n\r\nUsage: This is the date on which the debtor's account(s) is (are) to be debited."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmRequestedExecutionDate
	 * PaymentInstruction19.mmRequestedExecutionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction23, DateAndDateTimeChoice> mmRequestedExecutionDate = new MMMessageAttribute<PaymentInstruction23, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmRequestedExecutionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the initiating party requests the clearing agent to process the payment. If payment by cheque, the date when the cheque must be generated by the bank.\r\n\r\nUsage: This is the date on which the debtor's account(s) is (are) to be debited.";
			previousVersion_lazy = () -> PaymentInstruction19.mmRequestedExecutionDate;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(PaymentInstruction23 obj) {
			return obj.getRequestedExecutionDate();
		}

		@Override
		public void setValue(PaymentInstruction23 obj, DateAndDateTimeChoice value) {
			obj.setRequestedExecutionDate(value);
		}
	};
	@XmlElement(name = "Dbtr", required = true)
	protected PartyIdentification43 debtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that owes an amount of money to the (ultimate) creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmDebtor
	 * PaymentInstruction19.mmDebtor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction23, PartyIdentification43> mmDebtor = new MMMessageAssociationEnd<PaymentInstruction23, PartyIdentification43>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the (ultimate) creditor.";
			previousVersion_lazy = () -> PaymentInstruction19.mmDebtor;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public PartyIdentification43 getValue(PaymentInstruction23 obj) {
			return obj.getDebtor();
		}

		@Override
		public void setValue(PaymentInstruction23 obj, PartyIdentification43 value) {
			obj.setDebtor(value);
		}
	};
	@XmlElement(name = "DbtrAcct")
	protected CashAccount24 debtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used to process charges associated with a transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmDebtorAccount
	 * PaymentInstruction19.mmDebtorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction23, Optional<CashAccount24>> mmDebtorAccount = new MMMessageAssociationEnd<PaymentInstruction23, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Account used to process charges associated with a transaction.";
			previousVersion_lazy = () -> PaymentInstruction19.mmDebtorAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(PaymentInstruction23 obj) {
			return obj.getDebtorAccount();
		}

		@Override
		public void setValue(PaymentInstruction23 obj, Optional<CashAccount24> value) {
			obj.setDebtorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAgt", required = true)
	protected BranchAndFinancialInstitutionIdentification5 debtorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmDebtorAgent
	 * PaymentInstruction19.mmDebtorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction23, BranchAndFinancialInstitutionIdentification5> mmDebtorAgent = new MMMessageAssociationEnd<PaymentInstruction23, BranchAndFinancialInstitutionIdentification5>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			previousVersion_lazy = () -> PaymentInstruction19.mmDebtorAgent;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public BranchAndFinancialInstitutionIdentification5 getValue(PaymentInstruction23 obj) {
			return obj.getDebtorAgent();
		}

		@Override
		public void setValue(PaymentInstruction23 obj, BranchAndFinancialInstitutionIdentification5 value) {
			obj.setDebtorAgent(value);
		}
	};
	@XmlElement(name = "UltmtDbtr")
	protected PartyIdentification43 ultimateDebtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtDbtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that owes an amount of money to the (ultimate) creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmUltimateDebtor
	 * PaymentInstruction19.mmUltimateDebtor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction23, Optional<PartyIdentification43>> mmUltimateDebtor = new MMMessageAssociationEnd<PaymentInstruction23, Optional<PartyIdentification43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			previousVersion_lazy = () -> PaymentInstruction19.mmUltimateDebtor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(PaymentInstruction23 obj) {
			return obj.getUltimateDebtor();
		}

		@Override
		public void setValue(PaymentInstruction23 obj, Optional<PartyIdentification43> value) {
			obj.setUltimateDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgBr")
	protected ChargeBearerType1Code chargeBearer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmBearerType
	 * Charges.mmBearerType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgBr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which party/parties will bear the charges associated with the processing of the payment transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmChargeBearer
	 * PaymentInstruction19.mmChargeBearer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction23, Optional<ChargeBearerType1Code>> mmChargeBearer = new MMMessageAttribute<PaymentInstruction23, Optional<ChargeBearerType1Code>>() {
		{
			businessElementTrace_lazy = () -> Charges.mmBearerType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			previousVersion_lazy = () -> PaymentInstruction19.mmChargeBearer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearerType1Code.mmObject();
		}

		@Override
		public Optional<ChargeBearerType1Code> getValue(PaymentInstruction23 obj) {
			return obj.getChargeBearer();
		}

		@Override
		public void setValue(PaymentInstruction23 obj, Optional<ChargeBearerType1Code> value) {
			obj.setChargeBearer(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtTrfTx", required = true)
	protected List<CreditTransferTransaction22> creditTransferTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22
	 * CreditTransferTransaction22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23
	 * PaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtTrfTx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransferTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment processes required to transfer cash from the debtor to the creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmCreditTransferTransaction
	 * PaymentInstruction19.mmCreditTransferTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction23, List<CreditTransferTransaction22>> mmCreditTransferTransaction = new MMMessageAssociationEnd<PaymentInstruction23, List<CreditTransferTransaction22>>() {
		{
			businessComponentTrace_lazy = () -> CreditTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "CdtTrfTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferTransaction";
			definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			previousVersion_lazy = () -> PaymentInstruction19.mmCreditTransferTransaction;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditTransferTransaction22.mmObject();
		}

		@Override
		public List<CreditTransferTransaction22> getValue(PaymentInstruction23 obj) {
			return obj.getCreditTransferTransaction();
		}

		@Override
		public void setValue(PaymentInstruction23 obj, List<CreditTransferTransaction22> value) {
			obj.setCreditTransferTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction23.mmPaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstruction23.mmPaymentMethod,
						com.tools20022.repository.msg.PaymentInstruction23.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction23.mmRequestedExecutionDate, com.tools20022.repository.msg.PaymentInstruction23.mmDebtor,
						com.tools20022.repository.msg.PaymentInstruction23.mmDebtorAccount, com.tools20022.repository.msg.PaymentInstruction23.mmDebtorAgent, com.tools20022.repository.msg.PaymentInstruction23.mmUltimateDebtor,
						com.tools20022.repository.msg.PaymentInstruction23.mmChargeBearer, com.tools20022.repository.msg.PaymentInstruction23.mmCreditTransferTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(CreditorPaymentActivationRequestV06.mmPaymentInformation);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule.forPaymentInstruction23,
						com.tools20022.repository.constraints.ConstraintChequeInstructionRule.forPaymentInstruction23, com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction23,
						com.tools20022.repository.constraints.ConstraintCreditorAgentRule.forPaymentInstruction23, com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstruction23,
						com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction23,
						com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction23,
						com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstruction23, com.tools20022.repository.constraints.ConstraintChequeFromGuideline.forPaymentInstruction23,
						com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction23);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstruction23";
				definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.";
				previousVersion_lazy = () -> PaymentInstruction19.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getPaymentInformationIdentification() {
		return paymentInformationIdentification == null ? Optional.empty() : Optional.of(paymentInformationIdentification);
	}

	public PaymentInstruction23 setPaymentInformationIdentification(Max35Text paymentInformationIdentification) {
		this.paymentInformationIdentification = paymentInformationIdentification;
		return this;
	}

	public PaymentMethod7Code getPaymentMethod() {
		return paymentMethod;
	}

	public PaymentInstruction23 setPaymentMethod(PaymentMethod7Code paymentMethod) {
		this.paymentMethod = Objects.requireNonNull(paymentMethod);
		return this;
	}

	public Optional<PaymentTypeInformation19> getPaymentTypeInformation() {
		return paymentTypeInformation == null ? Optional.empty() : Optional.of(paymentTypeInformation);
	}

	public PaymentInstruction23 setPaymentTypeInformation(PaymentTypeInformation19 paymentTypeInformation) {
		this.paymentTypeInformation = paymentTypeInformation;
		return this;
	}

	public DateAndDateTimeChoice getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public PaymentInstruction23 setRequestedExecutionDate(DateAndDateTimeChoice requestedExecutionDate) {
		this.requestedExecutionDate = Objects.requireNonNull(requestedExecutionDate);
		return this;
	}

	public PartyIdentification43 getDebtor() {
		return debtor;
	}

	public PaymentInstruction23 setDebtor(PartyIdentification43 debtor) {
		this.debtor = Objects.requireNonNull(debtor);
		return this;
	}

	public Optional<CashAccount24> getDebtorAccount() {
		return debtorAccount == null ? Optional.empty() : Optional.of(debtorAccount);
	}

	public PaymentInstruction23 setDebtorAccount(CashAccount24 debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	public BranchAndFinancialInstitutionIdentification5 getDebtorAgent() {
		return debtorAgent;
	}

	public PaymentInstruction23 setDebtorAgent(BranchAndFinancialInstitutionIdentification5 debtorAgent) {
		this.debtorAgent = Objects.requireNonNull(debtorAgent);
		return this;
	}

	public Optional<PartyIdentification43> getUltimateDebtor() {
		return ultimateDebtor == null ? Optional.empty() : Optional.of(ultimateDebtor);
	}

	public PaymentInstruction23 setUltimateDebtor(PartyIdentification43 ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
		return this;
	}

	public Optional<ChargeBearerType1Code> getChargeBearer() {
		return chargeBearer == null ? Optional.empty() : Optional.of(chargeBearer);
	}

	public PaymentInstruction23 setChargeBearer(ChargeBearerType1Code chargeBearer) {
		this.chargeBearer = chargeBearer;
		return this;
	}

	public List<CreditTransferTransaction22> getCreditTransferTransaction() {
		return creditTransferTransaction == null ? creditTransferTransaction = new ArrayList<>() : creditTransferTransaction;
	}

	public PaymentInstruction23 setCreditTransferTransaction(List<CreditTransferTransaction22> creditTransferTransaction) {
		this.creditTransferTransaction = Objects.requireNonNull(creditTransferTransaction);
		return this;
	}
}