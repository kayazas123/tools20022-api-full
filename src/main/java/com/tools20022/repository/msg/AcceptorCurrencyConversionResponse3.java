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
import com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV03;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentEnvironment46;
import com.tools20022.repository.msg.CardPaymentTransaction53;
import com.tools20022.repository.msg.CurrencyConversion7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Currency conversion outcome from the service provider.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3#mmEnvironment
 * AcceptorCurrencyConversionResponse3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3#mmTransaction
 * AcceptorCurrencyConversionResponse3.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3#mmCurrencyConversionResult
 * AcceptorCurrencyConversionResponse3.mmCurrencyConversionResult}</li>
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
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV03#mmCurrencyConversionResponse
 * AcceptorCurrencyConversionResponseV03.mmCurrencyConversionResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorCurrencyConversionResponse3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Currency conversion outcome from the service provider."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4
 * AcceptorCurrencyConversionResponse4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2
 * AcceptorCurrencyConversionResponse2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorCurrencyConversionResponse3", propOrder = {"environment", "transaction", "currencyConversionResult"})
public class AcceptorCurrencyConversionResponse3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected CardPaymentEnvironment46 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment46
	 * CardPaymentEnvironment46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3
	 * AcceptorCurrencyConversionResponse3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4#mmEnvironment
	 * AcceptorCurrencyConversionResponse4.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2#mmEnvironment
	 * AcceptorCurrencyConversionResponse2.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorCurrencyConversionResponse3, CardPaymentEnvironment46> mmEnvironment = new MMMessageAssociationEnd<AcceptorCurrencyConversionResponse3, CardPaymentEnvironment46>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponse4.mmEnvironment);
			previousVersion_lazy = () -> AcceptorCurrencyConversionResponse2.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentEnvironment46.mmObject();
		}

		@Override
		public CardPaymentEnvironment46 getValue(AcceptorCurrencyConversionResponse3 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(AcceptorCurrencyConversionResponse3 obj, CardPaymentEnvironment46 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected CardPaymentTransaction53 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction53
	 * CardPaymentTransaction53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3
	 * AcceptorCurrencyConversionResponse3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency conversion of a card payment transaction between an acceptor and an acquirer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4#mmTransaction
	 * AcceptorCurrencyConversionResponse4.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2#mmTransaction
	 * AcceptorCurrencyConversionResponse2.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorCurrencyConversionResponse3, CardPaymentTransaction53> mmTransaction = new MMMessageAssociationEnd<AcceptorCurrencyConversionResponse3, CardPaymentTransaction53>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Currency conversion of a card payment transaction between an acceptor and an acquirer.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponse4.mmTransaction);
			previousVersion_lazy = () -> AcceptorCurrencyConversionResponse2.mmTransaction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentTransaction53.mmObject();
		}

		@Override
		public CardPaymentTransaction53 getValue(AcceptorCurrencyConversionResponse3 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(AcceptorCurrencyConversionResponse3 obj, CardPaymentTransaction53 value) {
			obj.setTransaction(value);
		}
	};
	@XmlElement(name = "CcyConvsRslt", required = true)
	protected CurrencyConversion7 currencyConversionResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyConversion7
	 * CurrencyConversion7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3
	 * AcceptorCurrencyConversionResponse3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvsRslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the currency conversion."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse4#mmCurrencyConversionResult
	 * AcceptorCurrencyConversionResponse4.mmCurrencyConversionResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2#mmCurrencyConversion
	 * AcceptorCurrencyConversionResponse2.mmCurrencyConversion}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorCurrencyConversionResponse3, CurrencyConversion7> mmCurrencyConversionResult = new MMMessageAssociationEnd<AcceptorCurrencyConversionResponse3, CurrencyConversion7>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3.mmObject();
			isDerived = false;
			xmlTag = "CcyConvsRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionResult";
			definition = "Details of the currency conversion.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponse4.mmCurrencyConversionResult);
			previousVersion_lazy = () -> AcceptorCurrencyConversionResponse2.mmCurrencyConversion;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CurrencyConversion7.mmObject();
		}

		@Override
		public CurrencyConversion7 getValue(AcceptorCurrencyConversionResponse3 obj) {
			return obj.getCurrencyConversionResult();
		}

		@Override
		public void setValue(AcceptorCurrencyConversionResponse3 obj, CurrencyConversion7 value) {
			obj.setCurrencyConversionResult(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3.mmEnvironment, com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3.mmTransaction,
						com.tools20022.repository.msg.AcceptorCurrencyConversionResponse3.mmCurrencyConversionResult);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponseV03.mmCurrencyConversionResponse);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorCurrencyConversionResponse3";
				definition = "Currency conversion outcome from the service provider.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponse4.mmObject());
				previousVersion_lazy = () -> AcceptorCurrencyConversionResponse2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentEnvironment46 getEnvironment() {
		return environment;
	}

	public AcceptorCurrencyConversionResponse3 setEnvironment(CardPaymentEnvironment46 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public CardPaymentTransaction53 getTransaction() {
		return transaction;
	}

	public AcceptorCurrencyConversionResponse3 setTransaction(CardPaymentTransaction53 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}

	public CurrencyConversion7 getCurrencyConversionResult() {
		return currencyConversionResult;
	}

	public AcceptorCurrencyConversionResponse3 setCurrencyConversionResult(CurrencyConversion7 currencyConversionResult) {
		this.currencyConversionResult = Objects.requireNonNull(currencyConversionResult);
		return this;
	}
}