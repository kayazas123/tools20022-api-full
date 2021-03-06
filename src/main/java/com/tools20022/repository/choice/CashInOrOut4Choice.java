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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PaymentInstrument10Choice;
import com.tools20022.repository.choice.PaymentInstrument7Choice;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of a payment instrument for the cash-in flow or cash-out flow.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut4Choice#mmCashInPaymentInstrument
 * CashInOrOut4Choice.mmCashInPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashInOrOut4Choice#mmCashOutPaymentInstrument
 * CashInOrOut4Choice.mmCashOutPaymentInstrument}</li>
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
 * "CashInOrOut4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of a payment instrument for the cash-in flow or cash-out flow."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashInOrOut4Choice", propOrder = {"cashInPaymentInstrument", "cashOutPaymentInstrument"})
public class CashInOrOut4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CshInPmtInstrm", required = true)
	protected PaymentInstrument10Choice cashInPaymentInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument10Choice
	 * PaymentInstrument10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CashInOrOut4Choice
	 * CashInOrOut4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInPmtInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment instrument for the cash-in flow."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashInOrOut4Choice, PaymentInstrument10Choice> mmCashInPaymentInstrument = new MMMessageAssociationEnd<CashInOrOut4Choice, PaymentInstrument10Choice>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.CashInOrOut4Choice.mmObject();
			isDerived = false;
			xmlTag = "CshInPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInPaymentInstrument";
			definition = "Payment instrument for the cash-in flow.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentInstrument10Choice.mmObject();
		}

		@Override
		public PaymentInstrument10Choice getValue(CashInOrOut4Choice obj) {
			return obj.getCashInPaymentInstrument();
		}

		@Override
		public void setValue(CashInOrOut4Choice obj, PaymentInstrument10Choice value) {
			obj.setCashInPaymentInstrument(value);
		}
	};
	@XmlElement(name = "CshOutPmtInstrm", required = true)
	protected PaymentInstrument7Choice cashOutPaymentInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument7Choice
	 * PaymentInstrument7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CashInOrOut4Choice
	 * CashInOrOut4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshOutPmtInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashOutPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment instrument for the cash-out flow."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashInOrOut4Choice, PaymentInstrument7Choice> mmCashOutPaymentInstrument = new MMMessageAssociationEnd<CashInOrOut4Choice, PaymentInstrument7Choice>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.CashInOrOut4Choice.mmObject();
			isDerived = false;
			xmlTag = "CshOutPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutPaymentInstrument";
			definition = "Payment instrument for the cash-out flow.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentInstrument7Choice.mmObject();
		}

		@Override
		public PaymentInstrument7Choice getValue(CashInOrOut4Choice obj) {
			return obj.getCashOutPaymentInstrument();
		}

		@Override
		public void setValue(CashInOrOut4Choice obj, PaymentInstrument7Choice value) {
			obj.setCashOutPaymentInstrument(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CashInOrOut4Choice.mmCashInPaymentInstrument, com.tools20022.repository.choice.CashInOrOut4Choice.mmCashOutPaymentInstrument);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashInOrOut4Choice";
				definition = "Choice of a payment instrument for the cash-in flow or cash-out flow.";
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentInstrument10Choice getCashInPaymentInstrument() {
		return cashInPaymentInstrument;
	}

	public CashInOrOut4Choice setCashInPaymentInstrument(PaymentInstrument10Choice cashInPaymentInstrument) {
		this.cashInPaymentInstrument = Objects.requireNonNull(cashInPaymentInstrument);
		return this;
	}

	public PaymentInstrument7Choice getCashOutPaymentInstrument() {
		return cashOutPaymentInstrument;
	}

	public CashInOrOut4Choice setCashOutPaymentInstrument(PaymentInstrument7Choice cashOutPaymentInstrument) {
		this.cashOutPaymentInstrument = Objects.requireNonNull(cashOutPaymentInstrument);
		return this;
	}
}