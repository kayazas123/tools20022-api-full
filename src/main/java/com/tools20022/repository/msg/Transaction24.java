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
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccountAndEntry1;
import com.tools20022.repository.msg.PaymentInstruction1;
import com.tools20022.repository.msg.System1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction24#mmPaymentTo
 * Transaction24.mmPaymentTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction24#mmPaymentFrom
 * Transaction24.mmPaymentFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction24#mmCreditDebitIndicator
 * Transaction24.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction24#mmPayment
 * Transaction24.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction24#mmAccountEntry
 * Transaction24.mmAccountEntry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Transaction24"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the payment transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditDebitIndicatorGuideline#forTransaction24
 * ConstraintCreditDebitIndicatorGuideline.forTransaction24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionCreditDebitIndicatorRule#forTransaction24
 * ConstraintTransactionCreditDebitIndicatorRule.forTransaction24}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction33 Transaction33}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Transaction24", propOrder = {"paymentTo", "paymentFrom", "creditDebitIndicator", "payment", "accountEntry"})
public class Transaction24 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtTo")
	protected System1 paymentTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.System1 System1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction24 Transaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Destination of the payment (be it a member or a system or both)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Transaction33#mmPaymentTo
	 * Transaction33.mmPaymentTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transaction24, Optional<System1>> mmPaymentTo = new MMMessageAssociationEnd<Transaction24, Optional<System1>>() {
		{
			businessComponentTrace_lazy = () -> System.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Transaction24.mmObject();
			isDerived = false;
			xmlTag = "PmtTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTo";
			definition = "Destination of the payment (be it a member or a system or both).";
			nextVersions_lazy = () -> Arrays.asList(Transaction33.mmPaymentTo);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> System1.mmObject();
		}

		@Override
		public Optional<System1> getValue(Transaction24 obj) {
			return obj.getPaymentTo();
		}

		@Override
		public void setValue(Transaction24 obj, Optional<System1> value) {
			obj.setPaymentTo(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtFr")
	protected System1 paymentFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.System1 System1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction24 Transaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Origin of the payment (be it a member or a system or both)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction33#mmPaymentFrom
	 * Transaction33.mmPaymentFrom}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transaction24, Optional<System1>> mmPaymentFrom = new MMMessageAssociationEnd<Transaction24, Optional<System1>>() {
		{
			businessComponentTrace_lazy = () -> System.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Transaction24.mmObject();
			isDerived = false;
			xmlTag = "PmtFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrom";
			definition = "Origin of the payment (be it a member or a system or both).";
			nextVersions_lazy = () -> Arrays.asList(Transaction33.mmPaymentFrom);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> System1.mmObject();
		}

		@Override
		public Optional<System1> getValue(Transaction24 obj) {
			return obj.getPaymentFrom();
		}

		@Override
		public void setValue(Transaction24 obj, Optional<System1> value) {
			obj.setPaymentFrom(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtDbtInd")
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreditDebitIndicator
	 * PaymentExecution.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction24 Transaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the payment transaction is a debit or credit transaction. \n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction33#mmCreditDebitIndicator
	 * Transaction33.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transaction24, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<Transaction24, Optional<CreditDebitCode>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transaction24.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the payment transaction is a debit or credit transaction. \n.";
			nextVersions_lazy = () -> Arrays.asList(Transaction33.mmCreditDebitIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public Optional<CreditDebitCode> getValue(Transaction24 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(Transaction24 obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Pmt")
	protected PaymentInstruction1 payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstruction1
	 * PaymentInstruction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction24 Transaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Transaction33#mmPayment
	 * Transaction33.mmPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transaction24, Optional<PaymentInstruction1>> mmPayment = new MMMessageAssociationEnd<Transaction24, Optional<PaymentInstruction1>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Transaction24.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.\n.";
			nextVersions_lazy = () -> Arrays.asList(Transaction33.mmPayment);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentInstruction1.mmObject();
		}

		@Override
		public Optional<PaymentInstruction1> getValue(Transaction24 obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(Transaction24 obj, Optional<PaymentInstruction1> value) {
			obj.setPayment(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctNtry")
	protected CashAccountAndEntry1 accountEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccountAndEntry1
	 * CashAccountAndEntry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BookEntry#mmCashEntry
	 * BookEntry.mmCashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction24 Transaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctNtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction33#mmAccountEntry
	 * Transaction33.mmAccountEntry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transaction24, Optional<CashAccountAndEntry1>> mmAccountEntry = new MMMessageAssociationEnd<Transaction24, Optional<CashAccountAndEntry1>>() {
		{
			businessElementTrace_lazy = () -> BookEntry.mmCashEntry;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transaction24.mmObject();
			isDerived = false;
			xmlTag = "AcctNtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountEntry";
			definition = "Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.";
			nextVersions_lazy = () -> Arrays.asList(Transaction33.mmAccountEntry);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountAndEntry1.mmObject();
		}

		@Override
		public Optional<CashAccountAndEntry1> getValue(Transaction24 obj) {
			return obj.getAccountEntry();
		}

		@Override
		public void setValue(Transaction24 obj, Optional<CashAccountAndEntry1> value) {
			obj.setAccountEntry(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transaction24.mmPaymentTo, com.tools20022.repository.msg.Transaction24.mmPaymentFrom,
						com.tools20022.repository.msg.Transaction24.mmCreditDebitIndicator, com.tools20022.repository.msg.Transaction24.mmPayment, com.tools20022.repository.msg.Transaction24.mmAccountEntry);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCreditDebitIndicatorGuideline.forTransaction24,
						com.tools20022.repository.constraints.ConstraintTransactionCreditDebitIndicatorRule.forTransaction24);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Transaction24";
				definition = "Information related to the payment transaction.";
				nextVersions_lazy = () -> Arrays.asList(Transaction33.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<System1> getPaymentTo() {
		return paymentTo == null ? Optional.empty() : Optional.of(paymentTo);
	}

	public Transaction24 setPaymentTo(System1 paymentTo) {
		this.paymentTo = paymentTo;
		return this;
	}

	public Optional<System1> getPaymentFrom() {
		return paymentFrom == null ? Optional.empty() : Optional.of(paymentFrom);
	}

	public Transaction24 setPaymentFrom(System1 paymentFrom) {
		this.paymentFrom = paymentFrom;
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return creditDebitIndicator == null ? Optional.empty() : Optional.of(creditDebitIndicator);
	}

	public Transaction24 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public Optional<PaymentInstruction1> getPayment() {
		return payment == null ? Optional.empty() : Optional.of(payment);
	}

	public Transaction24 setPayment(PaymentInstruction1 payment) {
		this.payment = payment;
		return this;
	}

	public Optional<CashAccountAndEntry1> getAccountEntry() {
		return accountEntry == null ? Optional.empty() : Optional.of(accountEntry);
	}

	public Transaction24 setAccountEntry(CashAccountAndEntry1 accountEntry) {
		this.accountEntry = accountEntry;
		return this;
	}
}