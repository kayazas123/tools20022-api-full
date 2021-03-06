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
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Result of the captured set of transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18#mmDataSetIdentification
 * CardPaymentDataSet18.mmDataSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18#mmDataSetResult
 * CardPaymentDataSet18.mmDataSetResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18#mmRemoveDataSet
 * CardPaymentDataSet18.mmRemoveDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18#mmDataSetInitiator
 * CardPaymentDataSet18.mmDataSetInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18#mmTransactionTotals
 * CardPaymentDataSet18.mmTransactionTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18#mmRejectedTransaction
 * CardPaymentDataSet18.mmRejectedTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentDataSet18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of the captured set of transactions."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentDataSet21
 * CardPaymentDataSet21}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14
 * CardPaymentDataSet14}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentDataSet18", propOrder = {"dataSetIdentification", "dataSetResult", "removeDataSet", "dataSetInitiator", "transactionTotals", "rejectedTransaction"})
public class CardPaymentDataSet18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DataSetId", required = true)
	protected DataSetIdentification5 dataSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification5
	 * DataSetIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18
	 * CardPaymentDataSet18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet21#mmDataSetIdentification
	 * CardPaymentDataSet21.mmDataSetIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmDataSetIdentification
	 * CardPaymentDataSet14.mmDataSetIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet18, DataSetIdentification5> mmDataSetIdentification = new MMMessageAssociationEnd<CardPaymentDataSet18, DataSetIdentification5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet18.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Identification of the data set.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet21.mmDataSetIdentification);
			previousVersion_lazy = () -> CardPaymentDataSet14.mmDataSetIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DataSetIdentification5.mmObject();
		}

		@Override
		public DataSetIdentification5 getValue(CardPaymentDataSet18 obj) {
			return obj.getDataSetIdentification();
		}

		@Override
		public void setValue(CardPaymentDataSet18 obj, DataSetIdentification5 value) {
			obj.setDataSetIdentification(value);
		}
	};
	@XmlElement(name = "DataSetRslt", required = true)
	protected ResponseType5 dataSetResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType5
	 * ResponseType5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18
	 * CardPaymentDataSet18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetRslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the data set capture."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet21#mmDataSetResult
	 * CardPaymentDataSet21.mmDataSetResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmDataSetResult
	 * CardPaymentDataSet14.mmDataSetResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet18, ResponseType5> mmDataSetResult = new MMMessageAssociationEnd<CardPaymentDataSet18, ResponseType5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet18.mmObject();
			isDerived = false;
			xmlTag = "DataSetRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetResult";
			definition = "Result of the data set capture.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet21.mmDataSetResult);
			previousVersion_lazy = () -> CardPaymentDataSet14.mmDataSetResult;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ResponseType5.mmObject();
		}

		@Override
		public ResponseType5 getValue(CardPaymentDataSet18 obj) {
			return obj.getDataSetResult();
		}

		@Override
		public void setValue(CardPaymentDataSet18 obj, ResponseType5 value) {
			obj.setDataSetResult(value);
		}
	};
	@XmlElement(name = "RmvDataSet", required = true)
	protected TrueFalseIndicator removeDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18
	 * CardPaymentDataSet18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmvDataSet"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemoveDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the data set must be removed from the POI (Point Of Interaction)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet21#mmRemoveDataSet
	 * CardPaymentDataSet21.mmRemoveDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmRemoveDataSet
	 * CardPaymentDataSet14.mmRemoveDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentDataSet18, TrueFalseIndicator> mmRemoveDataSet = new MMMessageAttribute<CardPaymentDataSet18, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet18.mmObject();
			isDerived = false;
			xmlTag = "RmvDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemoveDataSet";
			definition = "Indicates if the data set must be removed from the POI (Point Of Interaction).";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet21.mmRemoveDataSet);
			previousVersion_lazy = () -> CardPaymentDataSet14.mmRemoveDataSet;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(CardPaymentDataSet18 obj) {
			return obj.getRemoveDataSet();
		}

		@Override
		public void setValue(CardPaymentDataSet18 obj, TrueFalseIndicator value) {
			obj.setRemoveDataSet(value);
		}
	};
	@XmlElement(name = "DataSetInitr")
	protected GenericIdentification53 dataSetInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification53
	 * GenericIdentification53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18
	 * CardPaymentDataSet18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetInitr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetInitiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initiator of the data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet21#mmDataSetInitiator
	 * CardPaymentDataSet21.mmDataSetInitiator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmDataSetInitiator
	 * CardPaymentDataSet14.mmDataSetInitiator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet18, Optional<GenericIdentification53>> mmDataSetInitiator = new MMMessageAssociationEnd<CardPaymentDataSet18, Optional<GenericIdentification53>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet18.mmObject();
			isDerived = false;
			xmlTag = "DataSetInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetInitiator";
			definition = "Initiator of the data set.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet21.mmDataSetInitiator);
			previousVersion_lazy = () -> CardPaymentDataSet14.mmDataSetInitiator;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification53.mmObject();
		}

		@Override
		public Optional<GenericIdentification53> getValue(CardPaymentDataSet18 obj) {
			return obj.getDataSetInitiator();
		}

		@Override
		public void setValue(CardPaymentDataSet18 obj, Optional<GenericIdentification53> value) {
			obj.setDataSetInitiator(value.orElse(null));
		}
	};
	@XmlElement(name = "TxTtls", required = true)
	protected List<TransactionTotals7> transactionTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionTotals7
	 * TransactionTotals7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18
	 * CardPaymentDataSet18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction totals of the batch."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet21#mmTransactionTotals
	 * CardPaymentDataSet21.mmTransactionTotals}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmTransactionTotals
	 * CardPaymentDataSet14.mmTransactionTotals}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet18, List<TransactionTotals7>> mmTransactionTotals = new MMMessageAssociationEnd<CardPaymentDataSet18, List<TransactionTotals7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet18.mmObject();
			isDerived = false;
			xmlTag = "TxTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTotals";
			definition = "Transaction totals of the batch.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet21.mmTransactionTotals);
			previousVersion_lazy = () -> CardPaymentDataSet14.mmTransactionTotals;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionTotals7.mmObject();
		}

		@Override
		public List<TransactionTotals7> getValue(CardPaymentDataSet18 obj) {
			return obj.getTransactionTotals();
		}

		@Override
		public void setValue(CardPaymentDataSet18 obj, List<TransactionTotals7> value) {
			obj.setTransactionTotals(value);
		}
	};
	@XmlElement(name = "RjctdTx")
	protected List<CardPaymentDataSet17> rejectedTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardPaymentDataSet17
	 * CardPaymentDataSet17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet18
	 * CardPaymentDataSet18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdTx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction in the batch, whose capture has been rejected."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet21#mmRejectedTransaction
	 * CardPaymentDataSet21.mmRejectedTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet14#mmRejectedTransaction
	 * CardPaymentDataSet14.mmRejectedTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSet18, List<CardPaymentDataSet17>> mmRejectedTransaction = new MMMessageAssociationEnd<CardPaymentDataSet18, List<CardPaymentDataSet17>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSet18.mmObject();
			isDerived = false;
			xmlTag = "RjctdTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedTransaction";
			definition = "Transaction in the batch, whose capture has been rejected.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet21.mmRejectedTransaction);
			previousVersion_lazy = () -> CardPaymentDataSet14.mmRejectedTransaction;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardPaymentDataSet17.mmObject();
		}

		@Override
		public List<CardPaymentDataSet17> getValue(CardPaymentDataSet18 obj) {
			return obj.getRejectedTransaction();
		}

		@Override
		public void setValue(CardPaymentDataSet18 obj, List<CardPaymentDataSet17> value) {
			obj.setRejectedTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentDataSet18.mmDataSetIdentification, com.tools20022.repository.msg.CardPaymentDataSet18.mmDataSetResult,
						com.tools20022.repository.msg.CardPaymentDataSet18.mmRemoveDataSet, com.tools20022.repository.msg.CardPaymentDataSet18.mmDataSetInitiator, com.tools20022.repository.msg.CardPaymentDataSet18.mmTransactionTotals,
						com.tools20022.repository.msg.CardPaymentDataSet18.mmRejectedTransaction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentDataSet18";
				definition = "Result of the captured set of transactions.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSet21.mmObject());
				previousVersion_lazy = () -> CardPaymentDataSet14.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DataSetIdentification5 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public CardPaymentDataSet18 setDataSetIdentification(DataSetIdentification5 dataSetIdentification) {
		this.dataSetIdentification = Objects.requireNonNull(dataSetIdentification);
		return this;
	}

	public ResponseType5 getDataSetResult() {
		return dataSetResult;
	}

	public CardPaymentDataSet18 setDataSetResult(ResponseType5 dataSetResult) {
		this.dataSetResult = Objects.requireNonNull(dataSetResult);
		return this;
	}

	public TrueFalseIndicator getRemoveDataSet() {
		return removeDataSet;
	}

	public CardPaymentDataSet18 setRemoveDataSet(TrueFalseIndicator removeDataSet) {
		this.removeDataSet = Objects.requireNonNull(removeDataSet);
		return this;
	}

	public Optional<GenericIdentification53> getDataSetInitiator() {
		return dataSetInitiator == null ? Optional.empty() : Optional.of(dataSetInitiator);
	}

	public CardPaymentDataSet18 setDataSetInitiator(GenericIdentification53 dataSetInitiator) {
		this.dataSetInitiator = dataSetInitiator;
		return this;
	}

	public List<TransactionTotals7> getTransactionTotals() {
		return transactionTotals == null ? transactionTotals = new ArrayList<>() : transactionTotals;
	}

	public CardPaymentDataSet18 setTransactionTotals(List<TransactionTotals7> transactionTotals) {
		this.transactionTotals = Objects.requireNonNull(transactionTotals);
		return this;
	}

	public List<CardPaymentDataSet17> getRejectedTransaction() {
		return rejectedTransaction == null ? rejectedTransaction = new ArrayList<>() : rejectedTransaction;
	}

	public CardPaymentDataSet18 setRejectedTransaction(List<CardPaymentDataSet17> rejectedTransaction) {
		this.rejectedTransaction = Objects.requireNonNull(rejectedTransaction);
		return this;
	}
}