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
import com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV04;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.codeset.PaymentMethod7Code;
import com.tools20022.repository.datatype.ISODate;
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
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmPaymentInformationIdentification
 * PaymentInstruction17.mmPaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmPaymentMethod
 * PaymentInstruction17.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmPaymentTypeInformation
 * PaymentInstruction17.mmPaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmRequestedExecutionDate
 * PaymentInstruction17.mmRequestedExecutionDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmDebtor
 * PaymentInstruction17.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmDebtorAccount
 * PaymentInstruction17.mmDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmDebtorAgent
 * PaymentInstruction17.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmUltimateDebtor
 * PaymentInstruction17.mmUltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmChargeBearer
 * PaymentInstruction17.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17#mmCreditTransferTransaction
 * PaymentInstruction17.mmCreditTransferTransaction}</li>
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
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestV04#mmPaymentInformation
 * CreditorPaymentActivationRequestV04.mmPaymentInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInstruction17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule#forPaymentInstruction17
 * ConstraintPaymentTypeInformationRule.forPaymentInstruction17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionRule#forPaymentInstruction17
 * ConstraintChequeInstructionRule.forPaymentInstruction17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule#forPaymentInstruction17
 * ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAgentRule#forPaymentInstruction17
 * ConstraintCreditorAgentRule.forPaymentInstruction17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstruction17
 * ConstraintUltimateDebtorGuideline.forPaymentInstruction17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstruction17
 * ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstruction17
 * ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction17
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstruction17
 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
 * forPaymentInstruction17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeFromGuideline#forPaymentInstruction17
 * ConstraintChequeFromGuideline.forPaymentInstruction17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction17
 * ConstraintChargeBearerRule.forPaymentInstruction17}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction19
 * PaymentInstruction19}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11
 * PaymentInstruction11}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentInstruction17", propOrder = {"paymentInformationIdentification", "paymentMethod", "paymentTypeInformation", "requestedExecutionDate", "debtor", "debtorAccount", "debtorAgent", "ultimateDebtor", "chargeBearer",
		"creditTransferTransaction"})
public class PaymentInstruction17 {

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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmPaymentInformationIdentification
	 * PaymentInstruction19.mmPaymentInformationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmPaymentInformationIdentification
	 * PaymentInstruction11.mmPaymentInformationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction17, Optional<Max35Text>> mmPaymentInformationIdentification = new MMMessageAttribute<PaymentInstruction17, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction17.mmObject();
			isDerived = false;
			xmlTag = "PmtInfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationIdentification";
			definition = "Reference assigned by a sending party to unambiguously identify the payment information block within the message.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction19.mmPaymentInformationIdentification);
			previousVersion_lazy = () -> PaymentInstruction11.mmPaymentInformationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentInstruction17 obj) {
			return obj.getPaymentInformationIdentification();
		}

		@Override
		public void setValue(PaymentInstruction17 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmPaymentMethod
	 * PaymentInstruction19.mmPaymentMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmPaymentMethod
	 * PaymentInstruction11.mmPaymentMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction17, PaymentMethod7Code> mmPaymentMethod = new MMMessageAttribute<PaymentInstruction17, PaymentMethod7Code>() {
		{
			businessElementTrace_lazy = () -> CreditInstrument.mmMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction17.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Specifies the means of payment that will be used to move the amount of money.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction19.mmPaymentMethod);
			previousVersion_lazy = () -> PaymentInstruction11.mmPaymentMethod;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentMethod7Code.mmObject();
		}

		@Override
		public PaymentMethod7Code getValue(PaymentInstruction17 obj) {
			return obj.getPaymentMethod();
		}

		@Override
		public void setValue(PaymentInstruction17 obj, PaymentMethod7Code value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmPaymentTypeInformation
	 * PaymentInstruction19.mmPaymentTypeInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmPaymentTypeInformation
	 * PaymentInstruction11.mmPaymentTypeInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction17, Optional<PaymentTypeInformation19>> mmPaymentTypeInformation = new MMMessageAssociationEnd<PaymentInstruction17, Optional<PaymentTypeInformation19>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmProcessingInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction17.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeInformation";
			definition = "Set of elements used to further specify the type of transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction19.mmPaymentTypeInformation);
			previousVersion_lazy = () -> PaymentInstruction11.mmPaymentTypeInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTypeInformation19.mmObject();
		}

		@Override
		public Optional<PaymentTypeInformation19> getValue(PaymentInstruction17 obj) {
			return obj.getPaymentTypeInformation();
		}

		@Override
		public void setValue(PaymentInstruction17 obj, Optional<PaymentTypeInformation19> value) {
			obj.setPaymentTypeInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdExctnDt", required = true)
	protected ISODate requestedExecutionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRequestedExecutionDate
	 * PaymentExecution.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmRequestedExecutionDate
	 * PaymentInstruction19.mmRequestedExecutionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmRequestedExecutionDate
	 * PaymentInstruction11.mmRequestedExecutionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction17, ISODate> mmRequestedExecutionDate = new MMMessageAttribute<PaymentInstruction17, ISODate>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmRequestedExecutionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction17.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the initiating party requests the clearing agent to process the payment. If payment by cheque, the date when the cheque must be generated by the bank.\r\n\r\nUsage: This is the date on which the debtor's account(s) is (are) to be debited.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction19.mmRequestedExecutionDate);
			previousVersion_lazy = () -> PaymentInstruction11.mmRequestedExecutionDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(PaymentInstruction17 obj) {
			return obj.getRequestedExecutionDate();
		}

		@Override
		public void setValue(PaymentInstruction17 obj, ISODate value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmDebtor
	 * PaymentInstruction19.mmDebtor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmDebtor
	 * PaymentInstruction11.mmDebtor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction17, PartyIdentification43> mmDebtor = new MMMessageAssociationEnd<PaymentInstruction17, PartyIdentification43>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction17.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the (ultimate) creditor.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction19.mmDebtor);
			previousVersion_lazy = () -> PaymentInstruction11.mmDebtor;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public PartyIdentification43 getValue(PaymentInstruction17 obj) {
			return obj.getDebtor();
		}

		@Override
		public void setValue(PaymentInstruction17 obj, PartyIdentification43 value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmDebtorAccount
	 * PaymentInstruction19.mmDebtorAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmDebtorAccount
	 * PaymentInstruction11.mmDebtorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction17, Optional<CashAccount24>> mmDebtorAccount = new MMMessageAssociationEnd<PaymentInstruction17, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction17.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Account used to process charges associated with a transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction19.mmDebtorAccount);
			previousVersion_lazy = () -> PaymentInstruction11.mmDebtorAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(PaymentInstruction17 obj) {
			return obj.getDebtorAccount();
		}

		@Override
		public void setValue(PaymentInstruction17 obj, Optional<CashAccount24> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmDebtorAgent
	 * PaymentInstruction19.mmDebtorAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmDebtorAgent
	 * PaymentInstruction11.mmDebtorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction17, BranchAndFinancialInstitutionIdentification5> mmDebtorAgent = new MMMessageAssociationEnd<PaymentInstruction17, BranchAndFinancialInstitutionIdentification5>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction17.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction19.mmDebtorAgent);
			previousVersion_lazy = () -> PaymentInstruction11.mmDebtorAgent;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public BranchAndFinancialInstitutionIdentification5 getValue(PaymentInstruction17 obj) {
			return obj.getDebtorAgent();
		}

		@Override
		public void setValue(PaymentInstruction17 obj, BranchAndFinancialInstitutionIdentification5 value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmUltimateDebtor
	 * PaymentInstruction19.mmUltimateDebtor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmUltimateDebtor
	 * PaymentInstruction11.mmUltimateDebtor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction17, Optional<PartyIdentification43>> mmUltimateDebtor = new MMMessageAssociationEnd<PaymentInstruction17, Optional<PartyIdentification43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction17.mmObject();
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction19.mmUltimateDebtor);
			previousVersion_lazy = () -> PaymentInstruction11.mmUltimateDebtor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(PaymentInstruction17 obj) {
			return obj.getUltimateDebtor();
		}

		@Override
		public void setValue(PaymentInstruction17 obj, Optional<PartyIdentification43> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmChargeBearer
	 * PaymentInstruction19.mmChargeBearer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmChargeBearer
	 * PaymentInstruction11.mmChargeBearer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction17, Optional<ChargeBearerType1Code>> mmChargeBearer = new MMMessageAttribute<PaymentInstruction17, Optional<ChargeBearerType1Code>>() {
		{
			businessElementTrace_lazy = () -> Charges.mmBearerType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction17.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction19.mmChargeBearer);
			previousVersion_lazy = () -> PaymentInstruction11.mmChargeBearer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearerType1Code.mmObject();
		}

		@Override
		public Optional<ChargeBearerType1Code> getValue(PaymentInstruction17 obj) {
			return obj.getChargeBearer();
		}

		@Override
		public void setValue(PaymentInstruction17 obj, Optional<ChargeBearerType1Code> value) {
			obj.setChargeBearer(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtTrfTx", required = true)
	protected List<CreditTransferTransaction21> creditTransferTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21
	 * CreditTransferTransaction21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction17
	 * PaymentInstruction17}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction19#mmCreditTransferTransaction
	 * PaymentInstruction19.mmCreditTransferTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction11#mmCreditTransferTransaction
	 * PaymentInstruction11.mmCreditTransferTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction17, List<CreditTransferTransaction21>> mmCreditTransferTransaction = new MMMessageAssociationEnd<PaymentInstruction17, List<CreditTransferTransaction21>>() {
		{
			businessComponentTrace_lazy = () -> CreditTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction17.mmObject();
			isDerived = false;
			xmlTag = "CdtTrfTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferTransaction";
			definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction19.mmCreditTransferTransaction);
			previousVersion_lazy = () -> PaymentInstruction11.mmCreditTransferTransaction;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditTransferTransaction21.mmObject();
		}

		@Override
		public List<CreditTransferTransaction21> getValue(PaymentInstruction17 obj) {
			return obj.getCreditTransferTransaction();
		}

		@Override
		public void setValue(PaymentInstruction17 obj, List<CreditTransferTransaction21> value) {
			obj.setCreditTransferTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction17.mmPaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstruction17.mmPaymentMethod,
						com.tools20022.repository.msg.PaymentInstruction17.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction17.mmRequestedExecutionDate, com.tools20022.repository.msg.PaymentInstruction17.mmDebtor,
						com.tools20022.repository.msg.PaymentInstruction17.mmDebtorAccount, com.tools20022.repository.msg.PaymentInstruction17.mmDebtorAgent, com.tools20022.repository.msg.PaymentInstruction17.mmUltimateDebtor,
						com.tools20022.repository.msg.PaymentInstruction17.mmChargeBearer, com.tools20022.repository.msg.PaymentInstruction17.mmCreditTransferTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(CreditorPaymentActivationRequestV04.mmPaymentInformation);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule.forPaymentInstruction17,
						com.tools20022.repository.constraints.ConstraintChequeInstructionRule.forPaymentInstruction17, com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAgentRule.forPaymentInstruction17,
						com.tools20022.repository.constraints.ConstraintCreditorAgentRule.forPaymentInstruction17, com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstruction17,
						com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstruction17,
						com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstruction17,
						com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstruction17, com.tools20022.repository.constraints.ConstraintChequeFromGuideline.forPaymentInstruction17,
						com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction17);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstruction17";
				definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.";
				nextVersions_lazy = () -> Arrays.asList(PaymentInstruction19.mmObject());
				previousVersion_lazy = () -> PaymentInstruction11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getPaymentInformationIdentification() {
		return paymentInformationIdentification == null ? Optional.empty() : Optional.of(paymentInformationIdentification);
	}

	public PaymentInstruction17 setPaymentInformationIdentification(Max35Text paymentInformationIdentification) {
		this.paymentInformationIdentification = paymentInformationIdentification;
		return this;
	}

	public PaymentMethod7Code getPaymentMethod() {
		return paymentMethod;
	}

	public PaymentInstruction17 setPaymentMethod(PaymentMethod7Code paymentMethod) {
		this.paymentMethod = Objects.requireNonNull(paymentMethod);
		return this;
	}

	public Optional<PaymentTypeInformation19> getPaymentTypeInformation() {
		return paymentTypeInformation == null ? Optional.empty() : Optional.of(paymentTypeInformation);
	}

	public PaymentInstruction17 setPaymentTypeInformation(PaymentTypeInformation19 paymentTypeInformation) {
		this.paymentTypeInformation = paymentTypeInformation;
		return this;
	}

	public ISODate getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public PaymentInstruction17 setRequestedExecutionDate(ISODate requestedExecutionDate) {
		this.requestedExecutionDate = Objects.requireNonNull(requestedExecutionDate);
		return this;
	}

	public PartyIdentification43 getDebtor() {
		return debtor;
	}

	public PaymentInstruction17 setDebtor(PartyIdentification43 debtor) {
		this.debtor = Objects.requireNonNull(debtor);
		return this;
	}

	public Optional<CashAccount24> getDebtorAccount() {
		return debtorAccount == null ? Optional.empty() : Optional.of(debtorAccount);
	}

	public PaymentInstruction17 setDebtorAccount(CashAccount24 debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	public BranchAndFinancialInstitutionIdentification5 getDebtorAgent() {
		return debtorAgent;
	}

	public PaymentInstruction17 setDebtorAgent(BranchAndFinancialInstitutionIdentification5 debtorAgent) {
		this.debtorAgent = Objects.requireNonNull(debtorAgent);
		return this;
	}

	public Optional<PartyIdentification43> getUltimateDebtor() {
		return ultimateDebtor == null ? Optional.empty() : Optional.of(ultimateDebtor);
	}

	public PaymentInstruction17 setUltimateDebtor(PartyIdentification43 ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
		return this;
	}

	public Optional<ChargeBearerType1Code> getChargeBearer() {
		return chargeBearer == null ? Optional.empty() : Optional.of(chargeBearer);
	}

	public PaymentInstruction17 setChargeBearer(ChargeBearerType1Code chargeBearer) {
		this.chargeBearer = chargeBearer;
		return this;
	}

	public List<CreditTransferTransaction21> getCreditTransferTransaction() {
		return creditTransferTransaction == null ? creditTransferTransaction = new ArrayList<>() : creditTransferTransaction;
	}

	public PaymentInstruction17 setCreditTransferTransaction(List<CreditTransferTransaction21> creditTransferTransaction) {
		this.creditTransferTransaction = Objects.requireNonNull(creditTransferTransaction);
		return this;
	}
}