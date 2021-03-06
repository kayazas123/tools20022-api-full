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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.QuoteRequestType1Code;
import com.tools20022.repository.codeset.Side1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Request for a proposition of price for a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmQuoteRequestType
 * QuoteRequest1.mmQuoteRequestType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#mmExpiryDateTime
 * QuoteRequest1.mmExpiryDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmPreviousClosingPrice
 * QuoteRequest1.mmPreviousClosingPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#mmSide
 * QuoteRequest1.mmSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmFinancialInstrumentDetails
 * QuoteRequest1.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmFinancialInstrumentAttributes
 * QuoteRequest1.mmFinancialInstrumentAttributes}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#mmStipulations
 * QuoteRequest1.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmUnderlyingFinancialInstrumentDetails
 * QuoteRequest1.mmUnderlyingFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmUnderlyingFinancialInstrumentAttributes
 * QuoteRequest1.mmUnderlyingFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmUnderlyingStipulations
 * QuoteRequest1.mmUnderlyingStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmInstrumentLegGroupDetails
 * QuoteRequest1.mmInstrumentLegGroupDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#mmQuoteDetails
 * QuoteRequest1.mmQuoteDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#mmYieldDetails
 * QuoteRequest1.mmYieldDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmSpreadAndBenchmarkCurveDetails
 * QuoteRequest1.mmSpreadAndBenchmarkCurveDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmTradingSessionDetails
 * QuoteRequest1.mmTradingSessionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmTwoLegTransactionDetails
 * QuoteRequest1.mmTwoLegTransactionDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#mmTradingParties
 * QuoteRequest1.mmTradingParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuoteRequest1#mmCashParties
 * QuoteRequest1.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmReceivingSettlementParties
 * QuoteRequest1.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmDeliveringSettlementParties
 * QuoteRequest1.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmOtherBusinessParties
 * QuoteRequest1.mmOtherBusinessParties}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
 * SecuritiesQuoteVariable}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteRequest1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Request for a proposition of price for a financial instrument."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "QuoteRequest1", propOrder = {"quoteRequestType", "expiryDateTime", "previousClosingPrice", "side", "financialInstrumentDetails", "financialInstrumentAttributes", "stipulations", "underlyingFinancialInstrumentDetails",
		"underlyingFinancialInstrumentAttributes", "underlyingStipulations", "instrumentLegGroupDetails", "quoteDetails", "yieldDetails", "spreadAndBenchmarkCurveDetails", "tradingSessionDetails", "twoLegTransactionDetails",
		"tradingParties", "cashParties", "receivingSettlementParties", "deliveringSettlementParties", "otherBusinessParties"})
public class QuoteRequest1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QtReqTp")
	protected QuoteRequestType1Code quoteRequestType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteRequestType1Code
	 * QuoteRequestType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtReqTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteRequestType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of quote request being sent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 303</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuoteRequest1, Optional<QuoteRequestType1Code>> mmQuoteRequestType = new MMMessageAttribute<QuoteRequest1, Optional<QuoteRequestType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "QtReqTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "303"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteRequestType";
			definition = "Specifies the type of quote request being sent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> QuoteRequestType1Code.mmObject();
		}

		@Override
		public Optional<QuoteRequestType1Code> getValue(QuoteRequest1 obj) {
			return obj.getQuoteRequestType();
		}

		@Override
		public void setValue(QuoteRequest1 obj, Optional<QuoteRequestType1Code> value) {
			obj.setQuoteRequestType(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDtTm")
	protected ISODateTime expiryDateTime;
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
	 * {@linkplain com.tools20022.repository.entity.Quote#mmValidUntilDateTime
	 * Quote.mmValidUntilDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expresses the validity date and time of the Quote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 126</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuoteRequest1, Optional<ISODateTime>> mmExpiryDateTime = new MMMessageAttribute<QuoteRequest1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Quote.mmValidUntilDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "XpryDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "126"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDateTime";
			definition = "Expresses the validity date and time of the Quote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(QuoteRequest1 obj) {
			return obj.getExpiryDateTime();
		}

		@Override
		public void setValue(QuoteRequest1 obj, Optional<ISODateTime> value) {
			obj.setExpiryDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsClsgPric")
	protected List<Price1> previousClosingPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsClsgPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousClosingPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price of a financial instrument at closing time of the exchange in which it is traded."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 140</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuoteRequest1, List<Price1>> mmPreviousClosingPrice = new MMMessageAttribute<QuoteRequest1, List<Price1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "PrvsClsgPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "140"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousClosingPrice";
			definition = "Price of a financial instrument at closing time of the exchange in which it is traded.";
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public List<Price1> getValue(QuoteRequest1 obj) {
			return obj.getPreviousClosingPrice();
		}

		@Override
		public void setValue(QuoteRequest1 obj, List<Price1> value) {
			obj.setPreviousClosingPrice(value);
		}
	};
	@XmlElement(name = "Sd")
	protected Side1Code side;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Side1Code
	 * Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable#mmOfferSide
	 * SecuritiesQuoteVariable.mmOfferSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the side of the requested quote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 54</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuoteRequest1, Optional<Side1Code>> mmSide = new MMMessageAttribute<QuoteRequest1, Optional<Side1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuoteVariable.mmOfferSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "Sd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "54"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Side";
			definition = "Specifies the side of the requested quote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Side1Code.mmObject();
		}

		@Override
		public Optional<Side1Code> getValue(QuoteRequest1 obj) {
			return obj.getSide();
		}

		@Override
		public void setValue(QuoteRequest1 obj, Optional<Side1Code> value) {
			obj.setSide(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected SecurityIdentification7 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, SecurityIdentification7> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<QuoteRequest1, SecurityIdentification7>() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Provides details about the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification7.mmObject();
		}

		@Override
		public SecurityIdentification7 getValue(QuoteRequest1 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(QuoteRequest1 obj, SecurityIdentification7 value) {
			obj.setFinancialInstrumentDetails(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes1 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument attributes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, Optional<FinancialInstrumentAttributes1>> mmFinancialInstrumentAttributes = new MMMessageAssociationEnd<QuoteRequest1, Optional<FinancialInstrumentAttributes1>>() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Provides details about the financial instrument attributes.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes1> getValue(QuoteRequest1 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(QuoteRequest1 obj, Optional<FinancialInstrumentAttributes1> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "Stiptns")
	protected FinancialInstrumentStipulations stipulations;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Stiptns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument stipulations."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, Optional<FinancialInstrumentStipulations>> mmStipulations = new MMMessageAssociationEnd<QuoteRequest1, Optional<FinancialInstrumentStipulations>>() {
		{
			businessComponentTrace_lazy = () -> Debt.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "Stiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stipulations";
			definition = "Provides details about the financial instrument stipulations.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentStipulations.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentStipulations> getValue(QuoteRequest1 obj) {
			return obj.getStipulations();
		}

		@Override
		public void setValue(QuoteRequest1 obj, Optional<FinancialInstrumentStipulations> value) {
			obj.setStipulations(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygFinInstrmDtls")
	protected List<SecurityIdentification7> underlyingFinancialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrmDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, List<SecurityIdentification7>> mmUnderlyingFinancialInstrumentDetails = new MMMessageAssociationEnd<QuoteRequest1, List<SecurityIdentification7>>() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrumentDetails";
			definition = "Provides details about the underlying financial instrument.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification7.mmObject();
		}

		@Override
		public List<SecurityIdentification7> getValue(QuoteRequest1 obj) {
			return obj.getUnderlyingFinancialInstrumentDetails();
		}

		@Override
		public void setValue(QuoteRequest1 obj, List<SecurityIdentification7> value) {
			obj.setUnderlyingFinancialInstrumentDetails(value);
		}
	};
	@XmlElement(name = "UndrlygFinInstrmAttrbts")
	protected List<FinancialInstrumentAttributes1> underlyingFinancialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrmAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument attributes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, List<FinancialInstrumentAttributes1>> mmUnderlyingFinancialInstrumentAttributes = new MMMessageAssociationEnd<QuoteRequest1, List<FinancialInstrumentAttributes1>>() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrumentAttributes";
			definition = "Provides details about the underlying financial instrument attributes.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes1.mmObject();
		}

		@Override
		public List<FinancialInstrumentAttributes1> getValue(QuoteRequest1 obj) {
			return obj.getUnderlyingFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(QuoteRequest1 obj, List<FinancialInstrumentAttributes1> value) {
			obj.setUnderlyingFinancialInstrumentAttributes(value);
		}
	};
	@XmlElement(name = "UndrlygStiptns")
	protected List<FinancialInstrumentStipulations> underlyingStipulations;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygStiptns"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingStipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument stipulations."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, List<FinancialInstrumentStipulations>> mmUnderlyingStipulations = new MMMessageAssociationEnd<QuoteRequest1, List<FinancialInstrumentStipulations>>() {
		{
			businessComponentTrace_lazy = () -> Debt.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygStiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingStipulations";
			definition = "Provides details about the underlying financial instrument stipulations.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentStipulations.mmObject();
		}

		@Override
		public List<FinancialInstrumentStipulations> getValue(QuoteRequest1 obj) {
			return obj.getUnderlyingStipulations();
		}

		@Override
		public void setValue(QuoteRequest1 obj, List<FinancialInstrumentStipulations> value) {
			obj.setUnderlyingStipulations(value);
		}
	};
	@XmlElement(name = "InstrmLegGrpDtls")
	protected List<InstrumentLeg2> instrumentLegGroupDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InstrumentLeg2
	 * InstrumentLeg2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmLegGrpDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentLegGroupDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about each intrument leg."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, List<InstrumentLeg2>> mmInstrumentLegGroupDetails = new MMMessageAssociationEnd<QuoteRequest1, List<InstrumentLeg2>>() {
		{
			businessComponentTrace_lazy = () -> Leg.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "InstrmLegGrpDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentLegGroupDetails";
			definition = "Provides details about each intrument leg.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InstrumentLeg2.mmObject();
		}

		@Override
		public List<InstrumentLeg2> getValue(QuoteRequest1 obj) {
			return obj.getInstrumentLegGroupDetails();
		}

		@Override
		public void setValue(QuoteRequest1 obj, List<InstrumentLeg2> value) {
			obj.setInstrumentLegGroupDetails(value);
		}
	};
	@XmlElement(name = "QtDtls", required = true)
	protected List<Quote3> quoteDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Quote3 Quote3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuoteVariable
	 * SecuritiesQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the requested quote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, List<Quote3>> mmQuoteDetails = new MMMessageAssociationEnd<QuoteRequest1, List<Quote3>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesQuoteVariable.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "QtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteDetails";
			definition = "Details of the requested quote.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quote3.mmObject();
		}

		@Override
		public List<Quote3> getValue(QuoteRequest1 obj) {
			return obj.getQuoteDetails();
		}

		@Override
		public void setValue(QuoteRequest1 obj, List<Quote3> value) {
			obj.setQuoteDetails(value);
		}
	};
	@XmlElement(name = "YldDtls")
	protected YieldCalculation1 yieldDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.YieldCalculation1
	 * YieldCalculation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "YldDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Characteristics related to the yield."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, Optional<YieldCalculation1>> mmYieldDetails = new MMMessageAssociationEnd<QuoteRequest1, Optional<YieldCalculation1>>() {
		{
			businessComponentTrace_lazy = () -> YieldCalculation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "YldDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YieldDetails";
			definition = "Characteristics related to the yield.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> YieldCalculation1.mmObject();
		}

		@Override
		public Optional<YieldCalculation1> getValue(QuoteRequest1 obj) {
			return obj.getYieldDetails();
		}

		@Override
		public void setValue(QuoteRequest1 obj, Optional<YieldCalculation1> value) {
			obj.setYieldDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SprdAndBchmkCrvDtls")
	protected BenchmarkCurve1 spreadAndBenchmarkCurveDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BenchmarkCurve1
	 * BenchmarkCurve1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SprdAndBchmkCrvDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadAndBenchmarkCurveDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the benchmark against which the financial instrument is measured."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, Optional<BenchmarkCurve1>> mmSpreadAndBenchmarkCurveDetails = new MMMessageAssociationEnd<QuoteRequest1, Optional<BenchmarkCurve1>>() {
		{
			businessComponentTrace_lazy = () -> Spread.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "SprdAndBchmkCrvDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadAndBenchmarkCurveDetails";
			definition = "Provides details about the benchmark against which the financial instrument is measured.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BenchmarkCurve1.mmObject();
		}

		@Override
		public Optional<BenchmarkCurve1> getValue(QuoteRequest1 obj) {
			return obj.getSpreadAndBenchmarkCurveDetails();
		}

		@Override
		public void setValue(QuoteRequest1 obj, Optional<BenchmarkCurve1> value) {
			obj.setSpreadAndBenchmarkCurveDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgSsnDtls")
	protected TradingSession1 tradingSessionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradingSession1
	 * TradingSession1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingSession
	 * TradingSession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSsnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSessionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Established constraints under which a market operates."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, Optional<TradingSession1>> mmTradingSessionDetails = new MMMessageAssociationEnd<QuoteRequest1, Optional<TradingSession1>>() {
		{
			businessComponentTrace_lazy = () -> TradingSession.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "TradgSsnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSessionDetails";
			definition = "Established constraints under which a market operates.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradingSession1.mmObject();
		}

		@Override
		public Optional<TradingSession1> getValue(QuoteRequest1 obj) {
			return obj.getTradingSessionDetails();
		}

		@Override
		public void setValue(QuoteRequest1 obj, Optional<TradingSession1> value) {
			obj.setTradingSessionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TwoLegTxDtls")
	protected SecuritiesFinancing1 twoLegTransactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1
	 * SecuritiesFinancing1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TwoLegTxDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the trading session."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, Optional<SecuritiesFinancing1>> mmTwoLegTransactionDetails = new MMMessageAssociationEnd<QuoteRequest1, Optional<SecuritiesFinancing1>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesFinancing.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "TwoLegTxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionDetails";
			definition = "Provides details about the trading session.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesFinancing1.mmObject();
		}

		@Override
		public Optional<SecuritiesFinancing1> getValue(QuoteRequest1 obj) {
			return obj.getTwoLegTransactionDetails();
		}

		@Override
		public void setValue(QuoteRequest1 obj, Optional<SecuritiesFinancing1> value) {
			obj.setTwoLegTransactionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgPties")
	protected List<Intermediary14> tradingParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary14
	 * Intermediary14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parties involved in the process of quote request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, List<Intermediary14>> mmTradingParties = new MMMessageAssociationEnd<QuoteRequest1, List<Intermediary14>>() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "TradgPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingParties";
			definition = "Parties involved in the process of quote request.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary14.mmObject();
		}

		@Override
		public List<Intermediary14> getValue(QuoteRequest1 obj) {
			return obj.getTradingParties();
		}

		@Override
		public void setValue(QuoteRequest1 obj, List<Intermediary14> value) {
			obj.setTradingParties(value);
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties1 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashParties1
	 * CashParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole
	 * PaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment processes required to transfer cash from the debtor to the creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, Optional<CashParties1>> mmCashParties = new MMMessageAssociationEnd<QuoteRequest1, Optional<CashParties1>>() {
		{
			businessComponentTrace_lazy = () -> PaymentPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashParties1.mmObject();
		}

		@Override
		public Optional<CashParties1> getValue(QuoteRequest1 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(QuoteRequest1 obj, Optional<CashParties1> value) {
			obj.setCashParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties3 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties3
	 * SettlementParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, Optional<SettlementParties3>> mmReceivingSettlementParties = new MMMessageAssociationEnd<QuoteRequest1, Optional<SettlementParties3>>() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties3.mmObject();
		}

		@Override
		public Optional<SettlementParties3> getValue(QuoteRequest1 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(QuoteRequest1 obj, Optional<SettlementParties3> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties3 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties3
	 * SettlementParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, Optional<SettlementParties3>> mmDeliveringSettlementParties = new MMMessageAssociationEnd<QuoteRequest1, Optional<SettlementParties3>>() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties3.mmObject();
		}

		@Override
		public Optional<SettlementParties3> getValue(QuoteRequest1 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(QuoteRequest1 obj, Optional<SettlementParties3> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties1 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherParties1
	 * OtherParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuoteRequest1 QuoteRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuoteRequest1, Optional<OtherParties1>> mmOtherBusinessParties = new MMMessageAssociationEnd<QuoteRequest1, Optional<OtherParties1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QuoteRequest1.mmObject();
			isDerived = false;
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherParties1.mmObject();
		}

		@Override
		public Optional<OtherParties1> getValue(QuoteRequest1 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(QuoteRequest1 obj, Optional<OtherParties1> value) {
			obj.setOtherBusinessParties(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.msg.QuoteRequest1.mmQuoteRequestType, com.tools20022.repository.msg.QuoteRequest1.mmExpiryDateTime, com.tools20022.repository.msg.QuoteRequest1.mmPreviousClosingPrice,
								com.tools20022.repository.msg.QuoteRequest1.mmSide, com.tools20022.repository.msg.QuoteRequest1.mmFinancialInstrumentDetails, com.tools20022.repository.msg.QuoteRequest1.mmFinancialInstrumentAttributes,
								com.tools20022.repository.msg.QuoteRequest1.mmStipulations, com.tools20022.repository.msg.QuoteRequest1.mmUnderlyingFinancialInstrumentDetails,
								com.tools20022.repository.msg.QuoteRequest1.mmUnderlyingFinancialInstrumentAttributes, com.tools20022.repository.msg.QuoteRequest1.mmUnderlyingStipulations,
								com.tools20022.repository.msg.QuoteRequest1.mmInstrumentLegGroupDetails, com.tools20022.repository.msg.QuoteRequest1.mmQuoteDetails, com.tools20022.repository.msg.QuoteRequest1.mmYieldDetails,
								com.tools20022.repository.msg.QuoteRequest1.mmSpreadAndBenchmarkCurveDetails, com.tools20022.repository.msg.QuoteRequest1.mmTradingSessionDetails,
								com.tools20022.repository.msg.QuoteRequest1.mmTwoLegTransactionDetails, com.tools20022.repository.msg.QuoteRequest1.mmTradingParties, com.tools20022.repository.msg.QuoteRequest1.mmCashParties,
								com.tools20022.repository.msg.QuoteRequest1.mmReceivingSettlementParties, com.tools20022.repository.msg.QuoteRequest1.mmDeliveringSettlementParties,
								com.tools20022.repository.msg.QuoteRequest1.mmOtherBusinessParties);
				trace_lazy = () -> SecuritiesQuoteVariable.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "QuoteRequest1";
				definition = "Request for a proposition of price for a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<QuoteRequestType1Code> getQuoteRequestType() {
		return quoteRequestType == null ? Optional.empty() : Optional.of(quoteRequestType);
	}

	public QuoteRequest1 setQuoteRequestType(QuoteRequestType1Code quoteRequestType) {
		this.quoteRequestType = quoteRequestType;
		return this;
	}

	public Optional<ISODateTime> getExpiryDateTime() {
		return expiryDateTime == null ? Optional.empty() : Optional.of(expiryDateTime);
	}

	public QuoteRequest1 setExpiryDateTime(ISODateTime expiryDateTime) {
		this.expiryDateTime = expiryDateTime;
		return this;
	}

	public List<Price1> getPreviousClosingPrice() {
		return previousClosingPrice == null ? previousClosingPrice = new ArrayList<>() : previousClosingPrice;
	}

	public QuoteRequest1 setPreviousClosingPrice(List<Price1> previousClosingPrice) {
		this.previousClosingPrice = Objects.requireNonNull(previousClosingPrice);
		return this;
	}

	public Optional<Side1Code> getSide() {
		return side == null ? Optional.empty() : Optional.of(side);
	}

	public QuoteRequest1 setSide(Side1Code side) {
		this.side = side;
		return this;
	}

	public SecurityIdentification7 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public QuoteRequest1 setFinancialInstrumentDetails(SecurityIdentification7 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public Optional<FinancialInstrumentAttributes1> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public QuoteRequest1 setFinancialInstrumentAttributes(FinancialInstrumentAttributes1 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public Optional<FinancialInstrumentStipulations> getStipulations() {
		return stipulations == null ? Optional.empty() : Optional.of(stipulations);
	}

	public QuoteRequest1 setStipulations(FinancialInstrumentStipulations stipulations) {
		this.stipulations = stipulations;
		return this;
	}

	public List<SecurityIdentification7> getUnderlyingFinancialInstrumentDetails() {
		return underlyingFinancialInstrumentDetails == null ? underlyingFinancialInstrumentDetails = new ArrayList<>() : underlyingFinancialInstrumentDetails;
	}

	public QuoteRequest1 setUnderlyingFinancialInstrumentDetails(List<SecurityIdentification7> underlyingFinancialInstrumentDetails) {
		this.underlyingFinancialInstrumentDetails = Objects.requireNonNull(underlyingFinancialInstrumentDetails);
		return this;
	}

	public List<FinancialInstrumentAttributes1> getUnderlyingFinancialInstrumentAttributes() {
		return underlyingFinancialInstrumentAttributes == null ? underlyingFinancialInstrumentAttributes = new ArrayList<>() : underlyingFinancialInstrumentAttributes;
	}

	public QuoteRequest1 setUnderlyingFinancialInstrumentAttributes(List<FinancialInstrumentAttributes1> underlyingFinancialInstrumentAttributes) {
		this.underlyingFinancialInstrumentAttributes = Objects.requireNonNull(underlyingFinancialInstrumentAttributes);
		return this;
	}

	public List<FinancialInstrumentStipulations> getUnderlyingStipulations() {
		return underlyingStipulations == null ? underlyingStipulations = new ArrayList<>() : underlyingStipulations;
	}

	public QuoteRequest1 setUnderlyingStipulations(List<FinancialInstrumentStipulations> underlyingStipulations) {
		this.underlyingStipulations = Objects.requireNonNull(underlyingStipulations);
		return this;
	}

	public List<InstrumentLeg2> getInstrumentLegGroupDetails() {
		return instrumentLegGroupDetails == null ? instrumentLegGroupDetails = new ArrayList<>() : instrumentLegGroupDetails;
	}

	public QuoteRequest1 setInstrumentLegGroupDetails(List<InstrumentLeg2> instrumentLegGroupDetails) {
		this.instrumentLegGroupDetails = Objects.requireNonNull(instrumentLegGroupDetails);
		return this;
	}

	public List<Quote3> getQuoteDetails() {
		return quoteDetails == null ? quoteDetails = new ArrayList<>() : quoteDetails;
	}

	public QuoteRequest1 setQuoteDetails(List<Quote3> quoteDetails) {
		this.quoteDetails = Objects.requireNonNull(quoteDetails);
		return this;
	}

	public Optional<YieldCalculation1> getYieldDetails() {
		return yieldDetails == null ? Optional.empty() : Optional.of(yieldDetails);
	}

	public QuoteRequest1 setYieldDetails(YieldCalculation1 yieldDetails) {
		this.yieldDetails = yieldDetails;
		return this;
	}

	public Optional<BenchmarkCurve1> getSpreadAndBenchmarkCurveDetails() {
		return spreadAndBenchmarkCurveDetails == null ? Optional.empty() : Optional.of(spreadAndBenchmarkCurveDetails);
	}

	public QuoteRequest1 setSpreadAndBenchmarkCurveDetails(BenchmarkCurve1 spreadAndBenchmarkCurveDetails) {
		this.spreadAndBenchmarkCurveDetails = spreadAndBenchmarkCurveDetails;
		return this;
	}

	public Optional<TradingSession1> getTradingSessionDetails() {
		return tradingSessionDetails == null ? Optional.empty() : Optional.of(tradingSessionDetails);
	}

	public QuoteRequest1 setTradingSessionDetails(TradingSession1 tradingSessionDetails) {
		this.tradingSessionDetails = tradingSessionDetails;
		return this;
	}

	public Optional<SecuritiesFinancing1> getTwoLegTransactionDetails() {
		return twoLegTransactionDetails == null ? Optional.empty() : Optional.of(twoLegTransactionDetails);
	}

	public QuoteRequest1 setTwoLegTransactionDetails(SecuritiesFinancing1 twoLegTransactionDetails) {
		this.twoLegTransactionDetails = twoLegTransactionDetails;
		return this;
	}

	public List<Intermediary14> getTradingParties() {
		return tradingParties == null ? tradingParties = new ArrayList<>() : tradingParties;
	}

	public QuoteRequest1 setTradingParties(List<Intermediary14> tradingParties) {
		this.tradingParties = Objects.requireNonNull(tradingParties);
		return this;
	}

	public Optional<CashParties1> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public QuoteRequest1 setCashParties(CashParties1 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<SettlementParties3> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public QuoteRequest1 setReceivingSettlementParties(SettlementParties3 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<SettlementParties3> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public QuoteRequest1 setDeliveringSettlementParties(SettlementParties3 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<OtherParties1> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public QuoteRequest1 setOtherBusinessParties(OtherParties1 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}
}