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
import com.tools20022.repository.datatype.Max9NumericText;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentContext24;
import com.tools20022.repository.msg.CardPaymentEnvironment61;
import com.tools20022.repository.msg.CardPaymentTransaction70;
import com.tools20022.repository.msg.Traceability5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Completed card payment transaction to be captured in batch.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18#mmTransactionSequenceCounter
 * CardPaymentDataSetTransaction18.mmTransactionSequenceCounter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18#mmTraceability
 * CardPaymentDataSetTransaction18.mmTraceability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18#mmEnvironment
 * CardPaymentDataSetTransaction18.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18#mmContext
 * CardPaymentDataSetTransaction18.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18#mmTransaction
 * CardPaymentDataSetTransaction18.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentDataSetTransaction18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Completed card payment transaction to be captured in batch."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24
 * CardPaymentDataSetTransaction24}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction14
 * CardPaymentDataSetTransaction14}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentDataSetTransaction18", propOrder = {"transactionSequenceCounter", "traceability", "environment", "context", "transaction"})
public class CardPaymentDataSetTransaction18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxSeqCntr", required = true)
	protected Max9NumericText transactionSequenceCounter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max9NumericText
	 * Max9NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18
	 * CardPaymentDataSetTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSeqCntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionSequenceCounter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential counter of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24#mmTransactionSequenceCounter
	 * CardPaymentDataSetTransaction24.mmTransactionSequenceCounter}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction14#mmTransactionSequenceCounter
	 * CardPaymentDataSetTransaction14.mmTransactionSequenceCounter}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentDataSetTransaction18, Max9NumericText> mmTransactionSequenceCounter = new MMMessageAttribute<CardPaymentDataSetTransaction18, Max9NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction18.mmObject();
			isDerived = false;
			xmlTag = "TxSeqCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSequenceCounter";
			definition = "Sequential counter of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction24.mmTransactionSequenceCounter);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction14.mmTransactionSequenceCounter;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}

		@Override
		public Max9NumericText getValue(CardPaymentDataSetTransaction18 obj) {
			return obj.getTransactionSequenceCounter();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction18 obj, Max9NumericText value) {
			obj.setTransactionSequenceCounter(value);
		}
	};
	@XmlElement(name = "Tracblt")
	protected List<Traceability5> traceability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Traceability5
	 * Traceability5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18
	 * CardPaymentDataSetTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tracblt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Traceability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of partners involved in the exchange from the merchant to the issuer, with the corresponding timestamp of their exchanges."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24#mmTraceability
	 * CardPaymentDataSetTransaction24.mmTraceability}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction14#mmTraceability
	 * CardPaymentDataSetTransaction14.mmTraceability}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSetTransaction18, List<Traceability5>> mmTraceability = new MMMessageAssociationEnd<CardPaymentDataSetTransaction18, List<Traceability5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction18.mmObject();
			isDerived = false;
			xmlTag = "Tracblt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traceability";
			definition = "Identification of partners involved in the exchange from the merchant to the issuer, with the corresponding timestamp of their exchanges.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction24.mmTraceability);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction14.mmTraceability;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Traceability5.mmObject();
		}

		@Override
		public List<Traceability5> getValue(CardPaymentDataSetTransaction18 obj) {
			return obj.getTraceability();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction18 obj, List<Traceability5> value) {
			obj.setTraceability(value);
		}
	};
	@XmlElement(name = "Envt", required = true)
	protected CardPaymentEnvironment61 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61
	 * CardPaymentEnvironment61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18
	 * CardPaymentDataSetTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to the environment of the transaction in a transaction captured in batch."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24#mmEnvironment
	 * CardPaymentDataSetTransaction24.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction14#mmEnvironment
	 * CardPaymentDataSetTransaction14.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSetTransaction18, CardPaymentEnvironment61> mmEnvironment = new MMMessageAssociationEnd<CardPaymentDataSetTransaction18, CardPaymentEnvironment61>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction18.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Data related to the environment of the transaction in a transaction captured in batch.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction24.mmEnvironment);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction14.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentEnvironment61.mmObject();
		}

		@Override
		public CardPaymentEnvironment61 getValue(CardPaymentDataSetTransaction18 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction18 obj, CardPaymentEnvironment61 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt")
	protected CardPaymentContext24 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentContext24
	 * CardPaymentContext24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18
	 * CardPaymentDataSetTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cntxt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Context"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data related to the context of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24#mmContext
	 * CardPaymentDataSetTransaction24.mmContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction14#mmContext
	 * CardPaymentDataSetTransaction14.mmContext}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSetTransaction18, Optional<CardPaymentContext24>> mmContext = new MMMessageAssociationEnd<CardPaymentDataSetTransaction18, Optional<CardPaymentContext24>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction18.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Data related to the context of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction24.mmContext);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction14.mmContext;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardPaymentContext24.mmObject();
		}

		@Override
		public Optional<CardPaymentContext24> getValue(CardPaymentDataSetTransaction18 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction18 obj, Optional<CardPaymentContext24> value) {
			obj.setContext(value.orElse(null));
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected CardPaymentTransaction70 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70
	 * CardPaymentTransaction70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction18
	 * CardPaymentDataSetTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction information to be captured."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction24#mmTransaction
	 * CardPaymentDataSetTransaction24.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction14#mmTransaction
	 * CardPaymentDataSetTransaction14.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSetTransaction18, CardPaymentTransaction70> mmTransaction = new MMMessageAssociationEnd<CardPaymentDataSetTransaction18, CardPaymentTransaction70>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction18.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Transaction information to be captured.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction24.mmTransaction);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction14.mmTransaction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentTransaction70.mmObject();
		}

		@Override
		public CardPaymentTransaction70 getValue(CardPaymentDataSetTransaction18 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction18 obj, CardPaymentTransaction70 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentDataSetTransaction18.mmTransactionSequenceCounter, com.tools20022.repository.msg.CardPaymentDataSetTransaction18.mmTraceability,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction18.mmEnvironment, com.tools20022.repository.msg.CardPaymentDataSetTransaction18.mmContext,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction18.mmTransaction);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentDataSetTransaction18";
				definition = "Completed card payment transaction to be captured in batch.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction24.mmObject());
				previousVersion_lazy = () -> CardPaymentDataSetTransaction14.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max9NumericText getTransactionSequenceCounter() {
		return transactionSequenceCounter;
	}

	public CardPaymentDataSetTransaction18 setTransactionSequenceCounter(Max9NumericText transactionSequenceCounter) {
		this.transactionSequenceCounter = Objects.requireNonNull(transactionSequenceCounter);
		return this;
	}

	public List<Traceability5> getTraceability() {
		return traceability == null ? traceability = new ArrayList<>() : traceability;
	}

	public CardPaymentDataSetTransaction18 setTraceability(List<Traceability5> traceability) {
		this.traceability = Objects.requireNonNull(traceability);
		return this;
	}

	public CardPaymentEnvironment61 getEnvironment() {
		return environment;
	}

	public CardPaymentDataSetTransaction18 setEnvironment(CardPaymentEnvironment61 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public Optional<CardPaymentContext24> getContext() {
		return context == null ? Optional.empty() : Optional.of(context);
	}

	public CardPaymentDataSetTransaction18 setContext(CardPaymentContext24 context) {
		this.context = context;
		return this;
	}

	public CardPaymentTransaction70 getTransaction() {
		return transaction;
	}

	public CardPaymentDataSetTransaction18 setTransaction(CardPaymentTransaction70 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}