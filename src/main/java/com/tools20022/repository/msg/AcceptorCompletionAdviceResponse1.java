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
import com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV01;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.CardPaymentValidation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentEnvironment3;
import com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse1;
import com.tools20022.repository.msg.TMSTrigger1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Acknowledgement by the acquirer, of the completion advice of the card payment
 * at the acceptor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1#mmEnvironment
 * AcceptorCompletionAdviceResponse1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1#mmTransaction
 * AcceptorCompletionAdviceResponse1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1#mmTMSTrigger
 * AcceptorCompletionAdviceResponse1.mmTMSTrigger}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV01#mmCompletionAdviceResponse
 * AcceptorCompletionAdviceResponseV01.mmCompletionAdviceResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorCompletionAdviceResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Acknowledgement by the acquirer, of the completion advice of the card payment at the acceptor."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse2
 * AcceptorCompletionAdviceResponse2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorCompletionAdviceResponse1", propOrder = {"environment", "transaction", "tMSTrigger"})
public class AcceptorCompletionAdviceResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected CardPaymentEnvironment3 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment3
	 * CardPaymentEnvironment3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1
	 * AcceptorCompletionAdviceResponse1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorCompletionAdviceResponse1, CardPaymentEnvironment3> mmEnvironment = new MMMessageAssociationEnd<AcceptorCompletionAdviceResponse1, CardPaymentEnvironment3>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentEnvironment3.mmObject();
		}

		@Override
		public CardPaymentEnvironment3 getValue(AcceptorCompletionAdviceResponse1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(AcceptorCompletionAdviceResponse1 obj, CardPaymentEnvironment3 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected CardPaymentTransactionAdviceResponse1 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse1
	 * CardPaymentTransactionAdviceResponse1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
	 * CardPaymentValidation.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1
	 * AcceptorCompletionAdviceResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment transaction between an acceptor and an acquirer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorCompletionAdviceResponse1, CardPaymentTransactionAdviceResponse1> mmTransaction = new MMMessageAssociationEnd<AcceptorCompletionAdviceResponse1, CardPaymentTransactionAdviceResponse1>() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmResponse;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Card payment transaction between an acceptor and an acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentTransactionAdviceResponse1.mmObject();
		}

		@Override
		public CardPaymentTransactionAdviceResponse1 getValue(AcceptorCompletionAdviceResponse1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(AcceptorCompletionAdviceResponse1 obj, CardPaymentTransactionAdviceResponse1 value) {
			obj.setTransaction(value);
		}
	};
	@XmlElement(name = "TMSTrggr")
	protected TMSTrigger1 tMSTrigger;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TMSTrigger1
	 * TMSTrigger1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTMSTrigger
	 * CardPaymentAcquiring.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1
	 * AcceptorCompletionAdviceResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMSTrggr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSTrigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instructions for contacting the terminal management host."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorCompletionAdviceResponse1, Optional<TMSTrigger1>> mmTMSTrigger = new MMMessageAssociationEnd<AcceptorCompletionAdviceResponse1, Optional<TMSTrigger1>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTMSTrigger;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1.mmObject();
			isDerived = false;
			xmlTag = "TMSTrggr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSTrigger";
			definition = "Instructions for contacting the terminal management host.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TMSTrigger1.mmObject();
		}

		@Override
		public Optional<TMSTrigger1> getValue(AcceptorCompletionAdviceResponse1 obj) {
			return obj.getTMSTrigger();
		}

		@Override
		public void setValue(AcceptorCompletionAdviceResponse1 obj, Optional<TMSTrigger1> value) {
			obj.setTMSTrigger(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1.mmEnvironment, com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1.mmTransaction,
						com.tools20022.repository.msg.AcceptorCompletionAdviceResponse1.mmTMSTrigger);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorCompletionAdviceResponseV01.mmCompletionAdviceResponse);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorCompletionAdviceResponse1";
				definition = "Acknowledgement by the acquirer, of the completion advice of the card payment at the acceptor.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorCompletionAdviceResponse2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentEnvironment3 getEnvironment() {
		return environment;
	}

	public AcceptorCompletionAdviceResponse1 setEnvironment(CardPaymentEnvironment3 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public CardPaymentTransactionAdviceResponse1 getTransaction() {
		return transaction;
	}

	public AcceptorCompletionAdviceResponse1 setTransaction(CardPaymentTransactionAdviceResponse1 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}

	public Optional<TMSTrigger1> getTMSTrigger() {
		return tMSTrigger == null ? Optional.empty() : Optional.of(tMSTrigger);
	}

	public AcceptorCompletionAdviceResponse1 setTMSTrigger(TMSTrigger1 tMSTrigger) {
		this.tMSTrigger = tMSTrigger;
		return this;
	}
}