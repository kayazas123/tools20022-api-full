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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max10Text;
import com.tools20022.repository.datatype.Max20000Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentStatusDetails1;
import com.tools20022.repository.msg.PaymentTransactionParty;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Instruction to pay an amount of money to an ultimate beneficiary, on behalf
 * of an originator. This instruction may have to be forwarded several times to
 * complete the settlement chain. .
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmTransactionReference
 * PaymentDetails5.mmTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmTransferValueDate
 * PaymentDetails5.mmTransferValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmInstructionStatus
 * PaymentDetails5.mmInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmInstructedAmount
 * PaymentDetails5.mmInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmInterbankSettlementAmount
 * PaymentDetails5.mmInterbankSettlementAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails5#mmPurpose
 * PaymentDetails5.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmPaymentMethod
 * PaymentDetails5.mmPaymentMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails5#mmPriority
 * PaymentDetails5.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmProcessingValidityTime
 * PaymentDetails5.mmProcessingValidityTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmInstructionCopy
 * PaymentDetails5.mmInstructionCopy}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails5#mmPaymentType
 * PaymentDetails5.mmPaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmPaymentInstructionReference
 * PaymentDetails5.mmPaymentInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmInterbankValueDate
 * PaymentDetails5.mmInterbankValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmRelatedReference
 * PaymentDetails5.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDetails5#mmPaymentTransactionParty
 * PaymentDetails5.mmPaymentTransactionParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentDetails5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.\n."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentDetails5", propOrder = {"transactionReference", "transferValueDate", "instructionStatus", "instructedAmount", "interbankSettlementAmount", "purpose", "paymentMethod", "priority", "processingValidityTime",
		"instructionCopy", "paymentType", "paymentInstructionReference", "interbankValueDate", "relatedReference", "paymentTransactionParty"})
public class PaymentDetails5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxRef")
	protected Max35Text transactionReference;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmTransactionIdentification
	 * PaymentIdentification.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment transaction, as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDetails5, Optional<Max35Text>> mmTransactionReference = new MMMessageAttribute<PaymentDetails5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "TxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionReference";
			definition = "Unique and unambiguous identifier for a payment transaction, as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentDetails5 obj) {
			return obj.getTransactionReference();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<Max35Text> value) {
			obj.setTransactionReference(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfValDt")
	protected DateAndDateTimeChoice transferValueDate;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfValDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the cash is at the disposal of the credit account owner, or ceases to be at the disposal of the debit account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDetails5, Optional<DateAndDateTimeChoice>> mmTransferValueDate = new MMMessageAttribute<PaymentDetails5, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "TrfValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferValueDate";
			definition = "Date and time at which the cash is at the disposal of the credit account owner, or ceases to be at the disposal of the debit account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(PaymentDetails5 obj) {
			return obj.getTransferValueDate();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setTransferValueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrSts")
	protected PaymentStatusDetails1 instructionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentStatusDetails1
	 * PaymentStatusDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed information about the status of a transfer.\n\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentDetails5, Optional<PaymentStatusDetails1>> mmInstructionStatus = new MMMessageAssociationEnd<PaymentDetails5, Optional<PaymentStatusDetails1>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "InstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionStatus";
			definition = "Detailed information about the status of a transfer.\n\n.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentStatusDetails1.mmObject();
		}

		@Override
		public Optional<PaymentStatusDetails1> getValue(PaymentDetails5 obj) {
			return obj.getInstructionStatus();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<PaymentStatusDetails1> value) {
			obj.setInstructionStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdAmt")
	protected AmountChoice instructedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.choice.AmountChoice
	 * AmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDetails5, Optional<AmountChoice>> mmInstructedAmount = new MMMessageAttribute<PaymentDetails5, Optional<AmountChoice>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountChoice.mmObject();
		}

		@Override
		public Optional<AmountChoice> getValue(PaymentDetails5 obj) {
			return obj.getInstructedAmount();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<AmountChoice> value) {
			obj.setInstructedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrBkSttlmAmt")
	protected AmountChoice interbankSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.choice.AmountChoice
	 * AmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money moved between the instructing agent and the instructed agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDetails5, Optional<AmountChoice>> mmInterbankSettlementAmount = new MMMessageAttribute<PaymentDetails5, Optional<AmountChoice>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountChoice.mmObject();
		}

		@Override
		public Optional<AmountChoice> getValue(PaymentDetails5 obj) {
			return obj.getInterbankSettlementAmount();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<AmountChoice> value) {
			obj.setInterbankSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "Purp")
	protected Max10Text purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPurpose
	 * PaymentObligation.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying reason for the payment transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDetails5, Optional<Max10Text>> mmPurpose = new MMMessageAttribute<PaymentDetails5, Optional<Max10Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}

		@Override
		public Optional<Max10Text> getValue(PaymentDetails5 obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<Max10Text> value) {
			obj.setPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtMtd")
	protected PaymentOrigin1Choice paymentMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice
	 * PaymentOrigin1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the message or event from which an instruction has been initiated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentDetails5, Optional<PaymentOrigin1Choice>> mmPaymentMethod = new MMMessageAssociationEnd<PaymentDetails5, Optional<PaymentOrigin1Choice>>() {
		{
			businessComponentTrace_lazy = () -> BookEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Indicates the message or event from which an instruction has been initiated.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentOrigin1Choice.mmObject();
		}

		@Override
		public Optional<PaymentOrigin1Choice> getValue(PaymentDetails5 obj) {
			return obj.getPaymentMethod();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<PaymentOrigin1Choice> value) {
			obj.setPaymentMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "Prty")
	protected PriorityCodeChoice priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriorityCodeChoice
	 * PriorityCodeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmPriority
	 * PaymentProcessing.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDetails5, Optional<PriorityCodeChoice>> mmPriority = new MMMessageAttribute<PaymentDetails5, Optional<PriorityCodeChoice>>() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction.\n.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriorityCodeChoice.mmObject();
		}

		@Override
		public Optional<PriorityCodeChoice> getValue(PaymentDetails5 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<PriorityCodeChoice> value) {
			obj.setPriority(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgVldtyTm")
	protected DateTimePeriodChoice processingValidityTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
	 * DateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmProcessingValidityTime
	 * PaymentInstruction.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgVldtyTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingValidityTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time range within which the payment instruction must be processed.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDetails5, Optional<DateTimePeriodChoice>> mmProcessingValidityTime = new MMMessageAttribute<PaymentDetails5, Optional<DateTimePeriodChoice>>() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmProcessingValidityTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "PrcgVldtyTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingValidityTime";
			definition = "Date and time range within which the payment instruction must be processed.\n.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}

		@Override
		public Optional<DateTimePeriodChoice> getValue(PaymentDetails5 obj) {
			return obj.getProcessingValidityTime();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<DateTimePeriodChoice> value) {
			obj.setProcessingValidityTime(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrCpy")
	protected Max20000Text instructionCopy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max20000Text Max20000Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCpy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCopy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Copy of the original instruction, in free form text."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDetails5, Optional<Max20000Text>> mmInstructionCopy = new MMMessageAttribute<PaymentDetails5, Optional<Max20000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "InstrCpy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCopy";
			definition = "Copy of the original instruction, in free form text.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max20000Text.mmObject();
		}

		@Override
		public Optional<Max20000Text> getValue(PaymentDetails5 obj) {
			return obj.getInstructionCopy();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<Max20000Text> value) {
			obj.setInstructionCopy(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtTp")
	protected PaymentType2Choice paymentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PaymentType2Choice
	 * PaymentType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmType
	 * Payment.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type, or nature, of the payment, eg, express payment.\n."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDetails5, Optional<PaymentType2Choice>> mmPaymentType = new MMMessageAttribute<PaymentDetails5, Optional<PaymentType2Choice>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "PmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentType";
			definition = "Type, or nature, of the payment, eg, express payment.\n.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PaymentType2Choice.mmObject();
		}

		@Override
		public Optional<PaymentType2Choice> getValue(PaymentDetails5 obj) {
			return obj.getPaymentType();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<PaymentType2Choice> value) {
			obj.setPaymentType(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtInstrRef")
	protected Max35Text paymentInstructionReference;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDetails5, Optional<Max35Text>> mmPaymentInstructionReference = new MMMessageAttribute<PaymentDetails5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.\n.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentDetails5 obj) {
			return obj.getPaymentInstructionReference();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<Max35Text> value) {
			obj.setPaymentInstructionReference(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrBkValDt")
	protected ISODate interbankValueDate;
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
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
	 * CashSettlement.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkValDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDetails5, Optional<ISODate>> mmInterbankValueDate = new MMMessageAttribute<PaymentDetails5, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "IntrBkValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankValueDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(PaymentDetails5 obj) {
			return obj.getInterbankValueDate();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<ISODate> value) {
			obj.setInterbankValueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRef")
	protected Max35Text relatedReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The related reference as stipulated in the payment instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDetails5, Optional<Max35Text>> mmRelatedReference = new MMMessageAttribute<PaymentDetails5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "The related reference as stipulated in the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentDetails5 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<Max35Text> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtTxPty")
	protected PaymentTransactionParty paymentTransactionParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty
	 * PaymentTransactionParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDetails5
	 * PaymentDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTxPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTransactionParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the party fields used to search for a payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentDetails5, Optional<PaymentTransactionParty>> mmPaymentTransactionParty = new MMMessageAssociationEnd<PaymentDetails5, Optional<PaymentTransactionParty>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDetails5.mmObject();
			isDerived = false;
			xmlTag = "PmtTxPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTransactionParty";
			definition = "Defines the party fields used to search for a payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransactionParty.mmObject();
		}

		@Override
		public Optional<PaymentTransactionParty> getValue(PaymentDetails5 obj) {
			return obj.getPaymentTransactionParty();
		}

		@Override
		public void setValue(PaymentDetails5 obj, Optional<PaymentTransactionParty> value) {
			obj.setPaymentTransactionParty(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentDetails5.mmTransactionReference, com.tools20022.repository.msg.PaymentDetails5.mmTransferValueDate,
						com.tools20022.repository.msg.PaymentDetails5.mmInstructionStatus, com.tools20022.repository.msg.PaymentDetails5.mmInstructedAmount, com.tools20022.repository.msg.PaymentDetails5.mmInterbankSettlementAmount,
						com.tools20022.repository.msg.PaymentDetails5.mmPurpose, com.tools20022.repository.msg.PaymentDetails5.mmPaymentMethod, com.tools20022.repository.msg.PaymentDetails5.mmPriority,
						com.tools20022.repository.msg.PaymentDetails5.mmProcessingValidityTime, com.tools20022.repository.msg.PaymentDetails5.mmInstructionCopy, com.tools20022.repository.msg.PaymentDetails5.mmPaymentType,
						com.tools20022.repository.msg.PaymentDetails5.mmPaymentInstructionReference, com.tools20022.repository.msg.PaymentDetails5.mmInterbankValueDate, com.tools20022.repository.msg.PaymentDetails5.mmRelatedReference,
						com.tools20022.repository.msg.PaymentDetails5.mmPaymentTransactionParty);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentDetails5";
				definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.\n.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getTransactionReference() {
		return transactionReference == null ? Optional.empty() : Optional.of(transactionReference);
	}

	public PaymentDetails5 setTransactionReference(Max35Text transactionReference) {
		this.transactionReference = transactionReference;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getTransferValueDate() {
		return transferValueDate == null ? Optional.empty() : Optional.of(transferValueDate);
	}

	public PaymentDetails5 setTransferValueDate(DateAndDateTimeChoice transferValueDate) {
		this.transferValueDate = transferValueDate;
		return this;
	}

	public Optional<PaymentStatusDetails1> getInstructionStatus() {
		return instructionStatus == null ? Optional.empty() : Optional.of(instructionStatus);
	}

	public PaymentDetails5 setInstructionStatus(PaymentStatusDetails1 instructionStatus) {
		this.instructionStatus = instructionStatus;
		return this;
	}

	public Optional<AmountChoice> getInstructedAmount() {
		return instructedAmount == null ? Optional.empty() : Optional.of(instructedAmount);
	}

	public PaymentDetails5 setInstructedAmount(AmountChoice instructedAmount) {
		this.instructedAmount = instructedAmount;
		return this;
	}

	public Optional<AmountChoice> getInterbankSettlementAmount() {
		return interbankSettlementAmount == null ? Optional.empty() : Optional.of(interbankSettlementAmount);
	}

	public PaymentDetails5 setInterbankSettlementAmount(AmountChoice interbankSettlementAmount) {
		this.interbankSettlementAmount = interbankSettlementAmount;
		return this;
	}

	public Optional<Max10Text> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public PaymentDetails5 setPurpose(Max10Text purpose) {
		this.purpose = purpose;
		return this;
	}

	public Optional<PaymentOrigin1Choice> getPaymentMethod() {
		return paymentMethod == null ? Optional.empty() : Optional.of(paymentMethod);
	}

	public PaymentDetails5 setPaymentMethod(PaymentOrigin1Choice paymentMethod) {
		this.paymentMethod = paymentMethod;
		return this;
	}

	public Optional<PriorityCodeChoice> getPriority() {
		return priority == null ? Optional.empty() : Optional.of(priority);
	}

	public PaymentDetails5 setPriority(PriorityCodeChoice priority) {
		this.priority = priority;
		return this;
	}

	public Optional<DateTimePeriodChoice> getProcessingValidityTime() {
		return processingValidityTime == null ? Optional.empty() : Optional.of(processingValidityTime);
	}

	public PaymentDetails5 setProcessingValidityTime(DateTimePeriodChoice processingValidityTime) {
		this.processingValidityTime = processingValidityTime;
		return this;
	}

	public Optional<Max20000Text> getInstructionCopy() {
		return instructionCopy == null ? Optional.empty() : Optional.of(instructionCopy);
	}

	public PaymentDetails5 setInstructionCopy(Max20000Text instructionCopy) {
		this.instructionCopy = instructionCopy;
		return this;
	}

	public Optional<PaymentType2Choice> getPaymentType() {
		return paymentType == null ? Optional.empty() : Optional.of(paymentType);
	}

	public PaymentDetails5 setPaymentType(PaymentType2Choice paymentType) {
		this.paymentType = paymentType;
		return this;
	}

	public Optional<Max35Text> getPaymentInstructionReference() {
		return paymentInstructionReference == null ? Optional.empty() : Optional.of(paymentInstructionReference);
	}

	public PaymentDetails5 setPaymentInstructionReference(Max35Text paymentInstructionReference) {
		this.paymentInstructionReference = paymentInstructionReference;
		return this;
	}

	public Optional<ISODate> getInterbankValueDate() {
		return interbankValueDate == null ? Optional.empty() : Optional.of(interbankValueDate);
	}

	public PaymentDetails5 setInterbankValueDate(ISODate interbankValueDate) {
		this.interbankValueDate = interbankValueDate;
		return this;
	}

	public Optional<Max35Text> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public PaymentDetails5 setRelatedReference(Max35Text relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public Optional<PaymentTransactionParty> getPaymentTransactionParty() {
		return paymentTransactionParty == null ? Optional.empty() : Optional.of(paymentTransactionParty);
	}

	public PaymentDetails5 setPaymentTransactionParty(PaymentTransactionParty paymentTransactionParty) {
		this.paymentTransactionParty = paymentTransactionParty;
		return this;
	}
}