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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RateValueType7Code;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RateTypeAndPercentageRate3;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format between a rate or a rate type and rate or an amount or a
 * unspecified rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat30Choice#mmRate
 * RateAndAmountFormat30Choice.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat30Choice#mmNotSpecifiedRate
 * RateAndAmountFormat30Choice.mmNotSpecifiedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat30Choice#mmAmount
 * RateAndAmountFormat30Choice.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat30Choice#mmRateTypeAndRate
 * RateAndAmountFormat30Choice.mmRateTypeAndRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RateAndAmountFormat30Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of format between a rate or a rate type and rate or an amount or a unspecified rate."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forRateAndAmountFormat30Choice
 * ConstraintCoexistenceAmountRule.forRateAndAmountFormat30Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RateAndAmountFormat30Choice", propOrder = {"rate", "notSpecifiedRate", "amount", "rateTypeAndRate"})
public class RateAndAmountFormat30Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rate", required = true)
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat30Choice
	 * RateAndAmountFormat30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value expressed as a rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RateAndAmountFormat30Choice, PercentageRate> mmRate = new MMMessageAttribute<RateAndAmountFormat30Choice, PercentageRate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.RateAndAmountFormat30Choice.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Value expressed as a rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(RateAndAmountFormat30Choice obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(RateAndAmountFormat30Choice obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	@XmlElement(name = "NotSpcfdRate", required = true)
	protected RateValueType7Code notSpecifiedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RateValueType7Code
	 * RateValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat30Choice
	 * RateAndAmountFormat30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the rate not specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92K:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RateAndAmountFormat30Choice, RateValueType7Code> mmNotSpecifiedRate = new MMMessageAttribute<RateAndAmountFormat30Choice, RateValueType7Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.RateAndAmountFormat30Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92K:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedRate";
			definition = "Value of the rate not specified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateValueType7Code.mmObject();
		}

		@Override
		public RateValueType7Code getValue(RateAndAmountFormat30Choice obj) {
			return obj.getNotSpecifiedRate();
		}

		@Override
		public void setValue(RateAndAmountFormat30Choice obj, RateValueType7Code value) {
			obj.setNotSpecifiedRate(value);
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat30Choice
	 * RateAndAmountFormat30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value is expressed as a currency and amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RateAndAmountFormat30Choice, RestrictedFINActiveCurrencyAnd13DecimalAmount> mmAmount = new MMMessageAttribute<RateAndAmountFormat30Choice, RestrictedFINActiveCurrencyAnd13DecimalAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.RateAndAmountFormat30Choice.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Value is expressed as a currency and amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public RestrictedFINActiveCurrencyAnd13DecimalAmount getValue(RateAndAmountFormat30Choice obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(RateAndAmountFormat30Choice obj, RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "RateTpAndRate", required = true)
	protected RateTypeAndPercentageRate3 rateTypeAndRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate3
	 * RateTypeAndPercentageRate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat30Choice
	 * RateAndAmountFormat30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTpAndRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateTypeAndRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value is expressed as a rate type and a percentage rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RateAndAmountFormat30Choice, RateTypeAndPercentageRate3> mmRateTypeAndRate = new MMMessageAssociationEnd<RateAndAmountFormat30Choice, RateTypeAndPercentageRate3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.RateAndAmountFormat30Choice.mmObject();
			isDerived = false;
			xmlTag = "RateTpAndRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateTypeAndRate";
			definition = "Value is expressed as a rate type and a percentage rate.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RateTypeAndPercentageRate3.mmObject();
		}

		@Override
		public RateTypeAndPercentageRate3 getValue(RateAndAmountFormat30Choice obj) {
			return obj.getRateTypeAndRate();
		}

		@Override
		public void setValue(RateAndAmountFormat30Choice obj, RateTypeAndPercentageRate3 value) {
			obj.setRateTypeAndRate(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RateAndAmountFormat30Choice.mmRate, com.tools20022.repository.choice.RateAndAmountFormat30Choice.mmNotSpecifiedRate,
						com.tools20022.repository.choice.RateAndAmountFormat30Choice.mmAmount, com.tools20022.repository.choice.RateAndAmountFormat30Choice.mmRateTypeAndRate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forRateAndAmountFormat30Choice);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "RateAndAmountFormat30Choice";
				definition = "Choice of format between a rate or a rate type and rate or an amount or a unspecified rate.";
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getRate() {
		return rate;
	}

	public RateAndAmountFormat30Choice setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public RateValueType7Code getNotSpecifiedRate() {
		return notSpecifiedRate;
	}

	public RateAndAmountFormat30Choice setNotSpecifiedRate(RateValueType7Code notSpecifiedRate) {
		this.notSpecifiedRate = Objects.requireNonNull(notSpecifiedRate);
		return this;
	}

	public RestrictedFINActiveCurrencyAnd13DecimalAmount getAmount() {
		return amount;
	}

	public RateAndAmountFormat30Choice setAmount(RestrictedFINActiveCurrencyAnd13DecimalAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public RateTypeAndPercentageRate3 getRateTypeAndRate() {
		return rateTypeAndRate;
	}

	public RateAndAmountFormat30Choice setRateTypeAndRate(RateTypeAndPercentageRate3 rateTypeAndRate) {
		this.rateTypeAndRate = Objects.requireNonNull(rateTypeAndRate);
		return this;
	}
}