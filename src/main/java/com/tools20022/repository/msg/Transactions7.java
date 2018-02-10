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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports on transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transactions7#mmPaymentCommonInformation
 * Transactions7.mmPaymentCommonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transactions7#mmTransactionsSummary
 * Transactions7.mmTransactionsSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transactions7#mmTransactionReport
 * Transactions7.mmTransactionReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInstructionStatusRule#forTransactions7
 * ConstraintPaymentInstructionStatusRule.forTransactions7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransferValueDateRule#forTransactions7
 * ConstraintTransferValueDateRule.forTransactions7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditDebitIndicator1Rule#forTransactions7
 * ConstraintCreditDebitIndicator1Rule.forTransactions7}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Transactions7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reports on transactions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Transactions6
 * Transactions6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Transactions7", propOrder = {"paymentCommonInformation", "transactionsSummary", "transactionReport"})
public class Transactions7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtCmonInf")
	protected PaymentCommon3 paymentCommonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCommon3
	 * PaymentCommon3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transactions7 Transactions7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCmonInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCommonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common detailed payment instruction information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transactions6#mmPaymentCommonInformation
	 * Transactions6.mmPaymentCommonInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentCommonInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Transactions7.mmObject();
			isDerived = false;
			xmlTag = "PmtCmonInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCommonInformation";
			definition = "Common detailed payment instruction information.";
			previousVersion_lazy = () -> Transactions6.mmPaymentCommonInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentCommon3.mmObject();
		}
	};
	@XmlElement(name = "TxsSummry")
	protected NumberAndSumOfTransactions2 transactionsSummary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberAndSumOfTransactions2
	 * NumberAndSumOfTransactions2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transactions7 Transactions7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxsSummry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionsSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the total number and sum of the transactions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transactions6#mmTransactionsSummary
	 * Transactions6.mmTransactionsSummary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionsSummary = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Transactions7.mmObject();
			isDerived = false;
			xmlTag = "TxsSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionsSummary";
			definition = "Indicates the total number and sum of the transactions.";
			previousVersion_lazy = () -> Transactions6.mmTransactionsSummary;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NumberAndSumOfTransactions2.mmObject();
		}
	};
	@XmlElement(name = "TxRpt", required = true)
	protected List<com.tools20022.repository.msg.TransactionReport4> transactionReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionReport4
	 * TransactionReport4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transactions7 Transactions7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reports either on the transaction information or on a business error."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transactions6#mmTransactionReport
	 * Transactions6.mmTransactionReport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Transactions7.mmObject();
			isDerived = false;
			xmlTag = "TxRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionReport";
			definition = "Reports either on the transaction information or on a business error.";
			previousVersion_lazy = () -> Transactions6.mmTransactionReport;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionReport4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transactions7.mmPaymentCommonInformation, com.tools20022.repository.msg.Transactions7.mmTransactionsSummary,
						com.tools20022.repository.msg.Transactions7.mmTransactionReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentInstructionStatusRule.forTransactions7, com.tools20022.repository.constraints.ConstraintTransferValueDateRule.forTransactions7,
						com.tools20022.repository.constraints.ConstraintCreditDebitIndicator1Rule.forTransactions7);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Transactions7";
				definition = "Reports on transactions.";
				previousVersion_lazy = () -> Transactions6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PaymentCommon3> getPaymentCommonInformation() {
		return paymentCommonInformation == null ? Optional.empty() : Optional.of(paymentCommonInformation);
	}

	public Transactions7 setPaymentCommonInformation(com.tools20022.repository.msg.PaymentCommon3 paymentCommonInformation) {
		this.paymentCommonInformation = paymentCommonInformation;
		return this;
	}

	public Optional<NumberAndSumOfTransactions2> getTransactionsSummary() {
		return transactionsSummary == null ? Optional.empty() : Optional.of(transactionsSummary);
	}

	public Transactions7 setTransactionsSummary(com.tools20022.repository.msg.NumberAndSumOfTransactions2 transactionsSummary) {
		this.transactionsSummary = transactionsSummary;
		return this;
	}

	public List<TransactionReport4> getTransactionReport() {
		return transactionReport == null ? transactionReport = new ArrayList<>() : transactionReport;
	}

	public Transactions7 setTransactionReport(List<com.tools20022.repository.msg.TransactionReport4> transactionReport) {
		this.transactionReport = Objects.requireNonNull(transactionReport);
		return this;
	}
}