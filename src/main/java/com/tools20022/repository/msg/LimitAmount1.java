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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CreditDebitAmount1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of money characterics used to specify a limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LimitAmount1#mmAmount
 * LimitAmount1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitAmount1#mmUtilisationAmount
 * LimitAmount1.mmUtilisationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitAmount1#mmAvailableAmount
 * LimitAmount1.mmAvailableAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount of money characterics used to specify a limit."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LimitAmount1", propOrder = {"amount", "utilisationAmount", "availableAmount"})
public class LimitAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt", required = true)
	protected CreditDebitAmount1 amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditDebitAmount1
	 * CreditDebitAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAmount
	 * Limit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitAmount1 LimitAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money of the limit, expressed in an eligible currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LimitAmount1, CreditDebitAmount1> mmAmount = new MMMessageAttribute<LimitAmount1, CreditDebitAmount1>() {
		{
			businessElementTrace_lazy = () -> Limit.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitAmount1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money of the limit, expressed in an eligible currency.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CreditDebitAmount1.mmObject();
		}

		@Override
		public CreditDebitAmount1 getValue(LimitAmount1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(LimitAmount1 obj, CreditDebitAmount1 value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "UtlstnAmt", required = true)
	protected CreditDebitAmount1 utilisationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditDebitAmount1
	 * CreditDebitAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmUsedAmount
	 * Limit.mmUsedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitAmount1 LimitAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UtlstnAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UtilisationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Utilised amount of money of the limit expressed in an eligible currency."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LimitAmount1, CreditDebitAmount1> mmUtilisationAmount = new MMMessageAttribute<LimitAmount1, CreditDebitAmount1>() {
		{
			businessElementTrace_lazy = () -> Limit.mmUsedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitAmount1.mmObject();
			isDerived = false;
			xmlTag = "UtlstnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UtilisationAmount";
			definition = "Utilised amount of money of the limit expressed in an eligible currency.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CreditDebitAmount1.mmObject();
		}

		@Override
		public CreditDebitAmount1 getValue(LimitAmount1 obj) {
			return obj.getUtilisationAmount();
		}

		@Override
		public void setValue(LimitAmount1 obj, CreditDebitAmount1 value) {
			obj.setUtilisationAmount(value);
		}
	};
	@XmlElement(name = "AvlblAmt", required = true)
	protected CreditDebitAmount1 availableAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditDebitAmount1
	 * CreditDebitAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAvailableAmount
	 * Limit.mmAvailableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitAmount1 LimitAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remaining amount of money of the limit expressed in an eligible currency."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LimitAmount1, CreditDebitAmount1> mmAvailableAmount = new MMMessageAttribute<LimitAmount1, CreditDebitAmount1>() {
		{
			businessElementTrace_lazy = () -> Limit.mmAvailableAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitAmount1.mmObject();
			isDerived = false;
			xmlTag = "AvlblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableAmount";
			definition = "Remaining amount of money of the limit expressed in an eligible currency.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CreditDebitAmount1.mmObject();
		}

		@Override
		public CreditDebitAmount1 getValue(LimitAmount1 obj) {
			return obj.getAvailableAmount();
		}

		@Override
		public void setValue(LimitAmount1 obj, CreditDebitAmount1 value) {
			obj.setAvailableAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitAmount1.mmAmount, com.tools20022.repository.msg.LimitAmount1.mmUtilisationAmount, com.tools20022.repository.msg.LimitAmount1.mmAvailableAmount);
				trace_lazy = () -> Limit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LimitAmount1";
				definition = "Amount of money characterics used to specify a limit.";
			}
		});
		return mmObject_lazy.get();
	}

	public CreditDebitAmount1 getAmount() {
		return amount;
	}

	public LimitAmount1 setAmount(CreditDebitAmount1 amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public CreditDebitAmount1 getUtilisationAmount() {
		return utilisationAmount;
	}

	public LimitAmount1 setUtilisationAmount(CreditDebitAmount1 utilisationAmount) {
		this.utilisationAmount = Objects.requireNonNull(utilisationAmount);
		return this;
	}

	public CreditDebitAmount1 getAvailableAmount() {
		return availableAmount;
	}

	public LimitAmount1 setAvailableAmount(CreditDebitAmount1 availableAmount) {
		this.availableAmount = Objects.requireNonNull(availableAmount);
		return this;
	}
}