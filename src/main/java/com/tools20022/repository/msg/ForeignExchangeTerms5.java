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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information needed to process a currency exchange or conversion.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#mmUnitCurrency
 * ForeignExchangeTerms5.mmUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#mmQuotedCurrency
 * ForeignExchangeTerms5.mmQuotedCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#mmExchangeRate
 * ForeignExchangeTerms5.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#mmQuotationDate
 * ForeignExchangeTerms5.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#mmQuotingInstitution
 * ForeignExchangeTerms5.mmQuotingInstitution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
 * CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTerms5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information needed to process a currency exchange or conversion."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeTerms5", propOrder = {"unitCurrency", "quotedCurrency", "exchangeRate", "quotationDate", "quotingInstitution"})
public class ForeignExchangeTerms5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UnitCcy", required = true)
	protected CurrencyCode unitCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmUnitCurrency
	 * CurrencyExchange.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5
	 * ForeignExchangeTerms5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ForeignExchangeTerms5, CurrencyCode> mmUnitCurrency = new MMMessageAttribute<ForeignExchangeTerms5, CurrencyCode>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmUnitCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms5.mmObject();
			isDerived = false;
			xmlTag = "UnitCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(ForeignExchangeTerms5 obj) {
			return obj.getUnitCurrency();
		}

		@Override
		public void setValue(ForeignExchangeTerms5 obj, CurrencyCode value) {
			obj.setUnitCurrency(value);
		}
	};
	@XmlElement(name = "QtdCcy", required = true)
	protected CurrencyCode quotedCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotedCurrency
	 * CurrencyExchange.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5
	 * ForeignExchangeTerms5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtdCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotedCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the base currency is converted, in a currency exchange."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ForeignExchangeTerms5, CurrencyCode> mmQuotedCurrency = new MMMessageAttribute<ForeignExchangeTerms5, CurrencyCode>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmQuotedCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms5.mmObject();
			isDerived = false;
			xmlTag = "QtdCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(ForeignExchangeTerms5 obj) {
			return obj.getQuotedCurrency();
		}

		@Override
		public void setValue(ForeignExchangeTerms5 obj, CurrencyCode value) {
			obj.setQuotedCurrency(value);
		}
	};
	@XmlElement(name = "XchgRate", required = true)
	protected BaseOneRate exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5
	 * ForeignExchangeTerms5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::EXCH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ForeignExchangeTerms5, BaseOneRate> mmExchangeRate = new MMMessageAttribute<ForeignExchangeTerms5, BaseOneRate>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms5.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::EXCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public BaseOneRate getValue(ForeignExchangeTerms5 obj) {
			return obj.getExchangeRate();
		}

		@Override
		public void setValue(ForeignExchangeTerms5 obj, BaseOneRate value) {
			obj.setExchangeRate(value);
		}
	};
	@XmlElement(name = "QtnDt")
	protected ISODateTime quotationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotationDate
	 * CurrencyExchange.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5
	 * ForeignExchangeTerms5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which an exchange rate is quoted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ForeignExchangeTerms5, Optional<ISODateTime>> mmQuotationDate = new MMMessageAttribute<ForeignExchangeTerms5, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmQuotationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms5.mmObject();
			isDerived = false;
			xmlTag = "QtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDate";
			definition = "Date and time at which an exchange rate is quoted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(ForeignExchangeTerms5 obj) {
			return obj.getQuotationDate();
		}

		@Override
		public void setValue(ForeignExchangeTerms5 obj, Optional<ISODateTime> value) {
			obj.setQuotationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "QtgInstn")
	protected PartyIdentification2Choice quotingInstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5
	 * ForeignExchangeTerms5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtgInstn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotingInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that proposes a foreign exchange rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ForeignExchangeTerms5, Optional<PartyIdentification2Choice>> mmQuotingInstitution = new MMMessageAttribute<ForeignExchangeTerms5, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms5.mmObject();
			isDerived = false;
			xmlTag = "QtgInstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotingInstitution";
			definition = "Party that proposes a foreign exchange rate.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(ForeignExchangeTerms5 obj) {
			return obj.getQuotingInstitution();
		}

		@Override
		public void setValue(ForeignExchangeTerms5 obj, Optional<PartyIdentification2Choice> value) {
			obj.setQuotingInstitution(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForeignExchangeTerms5.mmUnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms5.mmQuotedCurrency,
						com.tools20022.repository.msg.ForeignExchangeTerms5.mmExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms5.mmQuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms5.mmQuotingInstitution);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ForeignExchangeTerms5";
				definition = "Information needed to process a currency exchange or conversion.";
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getUnitCurrency() {
		return unitCurrency;
	}

	public ForeignExchangeTerms5 setUnitCurrency(CurrencyCode unitCurrency) {
		this.unitCurrency = Objects.requireNonNull(unitCurrency);
		return this;
	}

	public CurrencyCode getQuotedCurrency() {
		return quotedCurrency;
	}

	public ForeignExchangeTerms5 setQuotedCurrency(CurrencyCode quotedCurrency) {
		this.quotedCurrency = Objects.requireNonNull(quotedCurrency);
		return this;
	}

	public BaseOneRate getExchangeRate() {
		return exchangeRate;
	}

	public ForeignExchangeTerms5 setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = Objects.requireNonNull(exchangeRate);
		return this;
	}

	public Optional<ISODateTime> getQuotationDate() {
		return quotationDate == null ? Optional.empty() : Optional.of(quotationDate);
	}

	public ForeignExchangeTerms5 setQuotationDate(ISODateTime quotationDate) {
		this.quotationDate = quotationDate;
		return this;
	}

	public Optional<PartyIdentification2Choice> getQuotingInstitution() {
		return quotingInstitution == null ? Optional.empty() : Optional.of(quotingInstitution);
	}

	public ForeignExchangeTerms5 setQuotingInstitution(PartyIdentification2Choice quotingInstitution) {
		this.quotingInstitution = quotingInstitution;
		return this;
	}
}