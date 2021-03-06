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
import com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV06;
import com.tools20022.repository.entity.ReconciliationTransaction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentEnvironment67;
import com.tools20022.repository.msg.TransactionReconciliation4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reconciliation request from an acceptor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest6#mmEnvironment
 * AcceptorReconciliationRequest6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest6#mmTransaction
 * AcceptorReconciliationRequest6.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
 * ReconciliationTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV06#mmReconciliationRequest
 * AcceptorReconciliationRequestV06.mmReconciliationRequest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorReconciliationRequest6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reconciliation request from an acceptor."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest7
 * AcceptorReconciliationRequest7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest5
 * AcceptorReconciliationRequest5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorReconciliationRequest6", propOrder = {"environment", "transaction"})
public class AcceptorReconciliationRequest6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected CardPaymentEnvironment67 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67
	 * CardPaymentEnvironment67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmCardPaymentTotal
	 * ReconciliationTransaction.mmCardPaymentTotal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest6
	 * AcceptorReconciliationRequest6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest7#mmEnvironment
	 * AcceptorReconciliationRequest7.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest5#mmEnvironment
	 * AcceptorReconciliationRequest5.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorReconciliationRequest6, CardPaymentEnvironment67> mmEnvironment = new MMMessageAssociationEnd<AcceptorReconciliationRequest6, CardPaymentEnvironment67>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmCardPaymentTotal;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorReconciliationRequest6.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationRequest7.mmEnvironment);
			previousVersion_lazy = () -> AcceptorReconciliationRequest5.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentEnvironment67.mmObject();
		}

		@Override
		public CardPaymentEnvironment67 getValue(AcceptorReconciliationRequest6 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(AcceptorReconciliationRequest6 obj, CardPaymentEnvironment67 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected TransactionReconciliation4 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionReconciliation4
	 * TransactionReconciliation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
	 * ReconciliationTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest6
	 * AcceptorReconciliationRequest6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reconciliation transaction between an acceptor an acquirer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest7#mmTransaction
	 * AcceptorReconciliationRequest7.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest5#mmTransaction
	 * AcceptorReconciliationRequest5.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorReconciliationRequest6, TransactionReconciliation4> mmTransaction = new MMMessageAssociationEnd<AcceptorReconciliationRequest6, TransactionReconciliation4>() {
		{
			businessComponentTrace_lazy = () -> ReconciliationTransaction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorReconciliationRequest6.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Reconciliation transaction between an acceptor an acquirer.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationRequest7.mmTransaction);
			previousVersion_lazy = () -> AcceptorReconciliationRequest5.mmTransaction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionReconciliation4.mmObject();
		}

		@Override
		public TransactionReconciliation4 getValue(AcceptorReconciliationRequest6 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(AcceptorReconciliationRequest6 obj, TransactionReconciliation4 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorReconciliationRequest6.mmEnvironment, com.tools20022.repository.msg.AcceptorReconciliationRequest6.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorReconciliationRequestV06.mmReconciliationRequest);
				trace_lazy = () -> ReconciliationTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorReconciliationRequest6";
				definition = "Reconciliation request from an acceptor.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationRequest7.mmObject());
				previousVersion_lazy = () -> AcceptorReconciliationRequest5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentEnvironment67 getEnvironment() {
		return environment;
	}

	public AcceptorReconciliationRequest6 setEnvironment(CardPaymentEnvironment67 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public TransactionReconciliation4 getTransaction() {
		return transaction;
	}

	public AcceptorReconciliationRequest6 setTransaction(TransactionReconciliation4 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}