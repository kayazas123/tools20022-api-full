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
import com.tools20022.repository.area.camt.ResolutionOfInvestigationV07;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalGroupHeader5;
import com.tools20022.repository.msg.OriginalPaymentInstruction22;
import com.tools20022.repository.msg.PaymentTransaction79;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the underlying (group of) transaction(s) to which the resolution
 * of investigation applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#mmOriginalGroupInformationAndStatus
 * UnderlyingTransaction17.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#mmOriginalPaymentInformationAndStatus
 * UnderlyingTransaction17.mmOriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17#mmTransactionInformationAndStatus
 * UnderlyingTransaction17.mmTransactionInformationAndStatus}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.ResolutionOfInvestigationV07#mmCancellationDetails
 * ResolutionOfInvestigationV07.mmCancellationDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingTransaction17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the underlying (group of) transaction(s) to which the resolution of investigation applies."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule#forUnderlyingTransaction17
 * ConstraintGroupOrPaymentInformationResolvedCaseRule.
 * forUnderlyingTransaction17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrInitiationTransactionResolvedCaseRule#forUnderlyingTransaction17
 * ConstraintGroupOrInitiationTransactionResolvedCaseRule.
 * forUnderlyingTransaction17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupOrInterbankTransactionResolvedCaseRule#forUnderlyingTransaction17
 * ConstraintGroupOrInterbankTransactionResolvedCaseRule.
 * forUnderlyingTransaction17}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingTransaction19
 * UnderlyingTransaction19}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction14
 * UnderlyingTransaction14}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingTransaction17", propOrder = {"originalGroupInformationAndStatus", "originalPaymentInformationAndStatus", "transactionInformationAndStatus"})
public class UnderlyingTransaction17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlGrpInfAndSts")
	protected OriginalGroupHeader5 originalGroupInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5
	 * OriginalGroupHeader5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17
	 * UnderlyingTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInfAndSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original cancellation message, to which the resolution refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction19#mmOriginalGroupInformationAndStatus
	 * UnderlyingTransaction19.mmOriginalGroupInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction14#mmOriginalGroupInformationAndStatus
	 * UnderlyingTransaction14.mmOriginalGroupInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction17, Optional<OriginalGroupHeader5>> mmOriginalGroupInformationAndStatus = new MMMessageAssociationEnd<UnderlyingTransaction17, Optional<OriginalGroupHeader5>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction17.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndStatus";
			definition = "Provides information on the original cancellation message, to which the resolution refers.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction19.mmOriginalGroupInformationAndStatus);
			previousVersion_lazy = () -> UnderlyingTransaction14.mmOriginalGroupInformationAndStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalGroupHeader5.mmObject();
		}

		@Override
		public Optional<OriginalGroupHeader5> getValue(UnderlyingTransaction17 obj) {
			return obj.getOriginalGroupInformationAndStatus();
		}

		@Override
		public void setValue(UnderlyingTransaction17 obj, Optional<OriginalGroupHeader5> value) {
			obj.setOriginalGroupInformationAndStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlPmtInfAndSts")
	protected List<OriginalPaymentInstruction22> originalPaymentInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
	 * OriginalPaymentInstruction22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17
	 * UnderlyingTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfAndSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original (group of) transactions, to which the cancellation status refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction19#mmOriginalPaymentInformationAndStatus
	 * UnderlyingTransaction19.mmOriginalPaymentInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction14#mmOriginalPaymentInformationAndStatus
	 * UnderlyingTransaction14.mmOriginalPaymentInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction17, List<OriginalPaymentInstruction22>> mmOriginalPaymentInformationAndStatus = new MMMessageAssociationEnd<UnderlyingTransaction17, List<OriginalPaymentInstruction22>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction17.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationAndStatus";
			definition = "Provides information on the original (group of) transactions, to which the cancellation status refers.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction19.mmOriginalPaymentInformationAndStatus);
			previousVersion_lazy = () -> UnderlyingTransaction14.mmOriginalPaymentInformationAndStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalPaymentInstruction22.mmObject();
		}

		@Override
		public List<OriginalPaymentInstruction22> getValue(UnderlyingTransaction17 obj) {
			return obj.getOriginalPaymentInformationAndStatus();
		}

		@Override
		public void setValue(UnderlyingTransaction17 obj, List<OriginalPaymentInstruction22> value) {
			obj.setOriginalPaymentInformationAndStatus(value);
		}
	};
	@XmlElement(name = "TxInfAndSts")
	protected List<PaymentTransaction79> transactionInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction79
	 * PaymentTransaction79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
	 * PaymentExecution.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction17
	 * UnderlyingTransaction17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInfAndSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the original transactions to which the cancellation request message refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction19#mmTransactionInformationAndStatus
	 * UnderlyingTransaction19.mmTransactionInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingTransaction14#mmTransactionInformationAndStatus
	 * UnderlyingTransaction14.mmTransactionInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingTransaction17, List<PaymentTransaction79>> mmTransactionInformationAndStatus = new MMMessageAssociationEnd<UnderlyingTransaction17, List<PaymentTransaction79>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnderlyingTransaction17.mmObject();
			isDerived = false;
			xmlTag = "TxInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformationAndStatus";
			definition = "Provides details on the original transactions to which the cancellation request message refers.";
			nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction19.mmTransactionInformationAndStatus);
			previousVersion_lazy = () -> UnderlyingTransaction14.mmTransactionInformationAndStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction79.mmObject();
		}

		@Override
		public List<PaymentTransaction79> getValue(UnderlyingTransaction17 obj) {
			return obj.getTransactionInformationAndStatus();
		}

		@Override
		public void setValue(UnderlyingTransaction17 obj, List<PaymentTransaction79> value) {
			obj.setTransactionInformationAndStatus(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnderlyingTransaction17.mmOriginalGroupInformationAndStatus,
						com.tools20022.repository.msg.UnderlyingTransaction17.mmOriginalPaymentInformationAndStatus, com.tools20022.repository.msg.UnderlyingTransaction17.mmTransactionInformationAndStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(ResolutionOfInvestigationV07.mmCancellationDetails);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupOrPaymentInformationResolvedCaseRule.forUnderlyingTransaction17,
						com.tools20022.repository.constraints.ConstraintGroupOrInitiationTransactionResolvedCaseRule.forUnderlyingTransaction17,
						com.tools20022.repository.constraints.ConstraintGroupOrInterbankTransactionResolvedCaseRule.forUnderlyingTransaction17);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTransaction17";
				definition = "Identifies the underlying (group of) transaction(s) to which the resolution of investigation applies.";
				nextVersions_lazy = () -> Arrays.asList(UnderlyingTransaction19.mmObject());
				previousVersion_lazy = () -> UnderlyingTransaction14.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OriginalGroupHeader5> getOriginalGroupInformationAndStatus() {
		return originalGroupInformationAndStatus == null ? Optional.empty() : Optional.of(originalGroupInformationAndStatus);
	}

	public UnderlyingTransaction17 setOriginalGroupInformationAndStatus(OriginalGroupHeader5 originalGroupInformationAndStatus) {
		this.originalGroupInformationAndStatus = originalGroupInformationAndStatus;
		return this;
	}

	public List<OriginalPaymentInstruction22> getOriginalPaymentInformationAndStatus() {
		return originalPaymentInformationAndStatus == null ? originalPaymentInformationAndStatus = new ArrayList<>() : originalPaymentInformationAndStatus;
	}

	public UnderlyingTransaction17 setOriginalPaymentInformationAndStatus(List<OriginalPaymentInstruction22> originalPaymentInformationAndStatus) {
		this.originalPaymentInformationAndStatus = Objects.requireNonNull(originalPaymentInformationAndStatus);
		return this;
	}

	public List<PaymentTransaction79> getTransactionInformationAndStatus() {
		return transactionInformationAndStatus == null ? transactionInformationAndStatus = new ArrayList<>() : transactionInformationAndStatus;
	}

	public UnderlyingTransaction17 setTransactionInformationAndStatus(List<PaymentTransaction79> transactionInformationAndStatus) {
		this.transactionInformationAndStatus = Objects.requireNonNull(transactionInformationAndStatus);
		return this;
	}
}