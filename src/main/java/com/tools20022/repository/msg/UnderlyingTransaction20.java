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
import com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV07;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the underlying (group of) transaction(s) to which the
 * investigation applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction20#mmOriginalGroupInformationAndCancellation
 * UnderlyingTransaction20.mmOriginalGroupInformationAndCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction20#mmTransactionInformation
 * UnderlyingTransaction20.mmTransactionInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV07#mmUnderlying
 * FIToFIPaymentCancellationRequestV07.mmUnderlying}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationAndReasonRule#forUnderlyingTransaction20
 * ConstraintGroupCancellationAndReasonRule.forUnderlyingTransaction20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationAndNumberOfTransactionsRule#forUnderlyingTransaction20
 * ConstraintGroupCancellationAndNumberOfTransactionsRule.
 * forUnderlyingTransaction20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule#forUnderlyingTransaction20
 * ConstraintGroupCancellationTrueAndTransactionInformationRule.
 * forUnderlyingTransaction20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationFalseAndTransactionInformationRule#forUnderlyingTransaction20
 * ConstraintGroupCancellationFalseAndTransactionInformationRule.
 * forUnderlyingTransaction20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrTransactionCaseRule#forUnderlyingTransaction20
 * ConstraintGroupOrTransactionCaseRule.forUnderlyingTransaction20}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingTransaction20"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the underlying (group of) transaction(s) to which the investigation applies."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16
 * UnderlyingTransaction16}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingTransaction20", propOrder = {"originalGroupInformationAndCancellation", "transactionInformation"})
public class UnderlyingTransaction20 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlGrpInfAndCxl")
	protected OriginalGroupHeader10 originalGroupInformationAndCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalGroupHeader10
	 * OriginalGroupHeader10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction20
	 * UnderlyingTransaction20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInfAndCxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformationAndCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original message, to which the cancellation refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16#mmOriginalGroupInformationAndCancellation
	 * UnderlyingTransaction16.mmOriginalGroupInformationAndCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalGroupInformationAndCancellation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction20.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInfAndCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndCancellation";
			definition = "Provides information on the original message, to which the cancellation refers.";
			previousVersion_lazy = () -> UnderlyingTransaction16.mmOriginalGroupInformationAndCancellation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader10.mmObject();
		}
	};
	@XmlElement(name = "TxInf")
	protected List<com.tools20022.repository.msg.PaymentTransaction89> transactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction89
	 * PaymentTransaction89}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
	 * PaymentExecution.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction20
	 * UnderlyingTransaction20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original transactions to which the cancellation request message refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction16#mmTransactionInformation
	 * UnderlyingTransaction16.mmTransactionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction20.mmObject();
			isDerived = false;
			xmlTag = "TxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Provides information on the original transactions to which the cancellation request message refers.";
			previousVersion_lazy = () -> UnderlyingTransaction16.mmTransactionInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTransaction89.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingTransaction20.mmOriginalGroupInformationAndCancellation, com.tools20022.repository.msg.UnderlyingTransaction20.mmTransactionInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(FIToFIPaymentCancellationRequestV07.mmUnderlying);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupCancellationAndReasonRule.forUnderlyingTransaction20,
						com.tools20022.repository.constraints.ConstraintGroupCancellationAndNumberOfTransactionsRule.forUnderlyingTransaction20,
						com.tools20022.repository.constraints.ConstraintGroupCancellationTrueAndTransactionInformationRule.forUnderlyingTransaction20,
						com.tools20022.repository.constraints.ConstraintGroupCancellationFalseAndTransactionInformationRule.forUnderlyingTransaction20,
						com.tools20022.repository.constraints.ConstraintGroupOrTransactionCaseRule.forUnderlyingTransaction20);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTransaction20";
				definition = "Identifies the underlying (group of) transaction(s) to which the investigation applies.";
				previousVersion_lazy = () -> UnderlyingTransaction16.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OriginalGroupHeader10> getOriginalGroupInformationAndCancellation() {
		return originalGroupInformationAndCancellation == null ? Optional.empty() : Optional.of(originalGroupInformationAndCancellation);
	}

	public UnderlyingTransaction20 setOriginalGroupInformationAndCancellation(com.tools20022.repository.msg.OriginalGroupHeader10 originalGroupInformationAndCancellation) {
		this.originalGroupInformationAndCancellation = originalGroupInformationAndCancellation;
		return this;
	}

	public List<PaymentTransaction89> getTransactionInformation() {
		return transactionInformation == null ? transactionInformation = new ArrayList<>() : transactionInformation;
	}

	public UnderlyingTransaction20 setTransactionInformation(List<com.tools20022.repository.msg.PaymentTransaction89> transactionInformation) {
		this.transactionInformation = Objects.requireNonNull(transactionInformation);
		return this;
	}
}