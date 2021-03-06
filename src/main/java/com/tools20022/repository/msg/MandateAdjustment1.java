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
import com.tools20022.repository.choice.Frequency37Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.DirectDebitMandate;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the details for the adjustment of the mandate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAdjustment1#mmDateAdjustmentRuleIndicator
 * MandateAdjustment1.mmDateAdjustmentRuleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAdjustment1#mmCategory
 * MandateAdjustment1.mmCategory}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAdjustment1#mmAmount
 * MandateAdjustment1.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAdjustment1#mmRate
 * MandateAdjustment1.mmRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
 * DirectDebitMandate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateAdjustment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the details for the adjustment of the mandate."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MandateAdjustment1", propOrder = {"dateAdjustmentRuleIndicator", "category", "amount", "rate"})
public class MandateAdjustment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtAdjstmntRuleInd", required = true)
	protected TrueFalseIndicator dateAdjustmentRuleIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.MandateAdjustment1
	 * MandateAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtAdjstmntRuleInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateAdjustmentRuleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether an adjustment is to be applied on pre-agreed collection date or not."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateAdjustment1, TrueFalseIndicator> mmDateAdjustmentRuleIndicator = new MMMessageAttribute<MandateAdjustment1, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "DtAdjstmntRuleInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateAdjustmentRuleIndicator";
			definition = "Specifies whether an adjustment is to be applied on pre-agreed collection date or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(MandateAdjustment1 obj) {
			return obj.getDateAdjustmentRuleIndicator();
		}

		@Override
		public void setValue(MandateAdjustment1 obj, TrueFalseIndicator value) {
			obj.setDateAdjustmentRuleIndicator(value);
		}
	};
	@XmlElement(name = "Ctgy")
	protected Frequency37Choice category;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Frequency37Choice
	 * Frequency37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFrequency
	 * DirectDebitMandate.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAdjustment1
	 * MandateAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctgy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Category"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the category of adjustment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateAdjustment1, Optional<Frequency37Choice>> mmCategory = new MMMessageAssociationEnd<MandateAdjustment1, Optional<Frequency37Choice>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "Ctgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Category";
			definition = "Defines the category of adjustment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Frequency37Choice.mmObject();
		}

		@Override
		public Optional<Frequency37Choice> getValue(MandateAdjustment1 obj) {
			return obj.getCategory();
		}

		@Override
		public void setValue(MandateAdjustment1 obj, Optional<Frequency37Choice> value) {
			obj.setCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "Amt")
	protected ActiveCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmCollectionAmount
	 * DirectDebitMandate.mmCollectionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAdjustment1
	 * MandateAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-agreed amount to increase or decrease the mandate amount as justified per information in the category."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateAdjustment1, Optional<ActiveCurrencyAndAmount>> mmAmount = new MMMessageAttribute<MandateAdjustment1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmCollectionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Pre-agreed amount to increase or decrease the mandate amount as justified per information in the category.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(MandateAdjustment1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(MandateAdjustment1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "Rate")
	protected PercentageRate rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmRate
	 * Mandate.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAdjustment1
	 * MandateAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-agreed increase or decrease rate that will be applied to the collection amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateAdjustment1, Optional<PercentageRate>> mmRate = new MMMessageAttribute<MandateAdjustment1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Mandate.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Pre-agreed increase or decrease rate that will be applied to the collection amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(MandateAdjustment1 obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(MandateAdjustment1 obj, Optional<PercentageRate> value) {
			obj.setRate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAdjustment1.mmDateAdjustmentRuleIndicator, com.tools20022.repository.msg.MandateAdjustment1.mmCategory,
						com.tools20022.repository.msg.MandateAdjustment1.mmAmount, com.tools20022.repository.msg.MandateAdjustment1.mmRate);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateAdjustment1";
				definition = "Specifies the details for the adjustment of the mandate.";
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getDateAdjustmentRuleIndicator() {
		return dateAdjustmentRuleIndicator;
	}

	public MandateAdjustment1 setDateAdjustmentRuleIndicator(TrueFalseIndicator dateAdjustmentRuleIndicator) {
		this.dateAdjustmentRuleIndicator = Objects.requireNonNull(dateAdjustmentRuleIndicator);
		return this;
	}

	public Optional<Frequency37Choice> getCategory() {
		return category == null ? Optional.empty() : Optional.of(category);
	}

	public MandateAdjustment1 setCategory(Frequency37Choice category) {
		this.category = category;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getAmount() {
		return amount == null ? Optional.empty() : Optional.of(amount);
	}

	public MandateAdjustment1 setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = amount;
		return this;
	}

	public Optional<PercentageRate> getRate() {
		return rate == null ? Optional.empty() : Optional.of(rate);
	}

	public MandateAdjustment1 setRate(PercentageRate rate) {
		this.rate = rate;
		return this;
	}
}