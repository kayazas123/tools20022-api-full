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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AssetClass1Code;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.DTCAssetType1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OtherIdentification2;
import com.tools20022.repository.msg.SecurityIdentification15;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding underlying security details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmPlaceAndName
 * FinancialInstrumentAttributesSD8.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmCountryOfListing
 * FinancialInstrumentAttributesSD8.mmCountryOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmIncomeSourceCountry
 * FinancialInstrumentAttributesSD8.mmIncomeSourceCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmDTCAssetClass
 * FinancialInstrumentAttributesSD8.mmDTCAssetClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmDTCAssetType
 * FinancialInstrumentAttributesSD8.mmDTCAssetType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmSecurityEligibilityIndicator
 * FinancialInstrumentAttributesSD8.mmSecurityEligibilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmTickerSymbol
 * FinancialInstrumentAttributesSD8.mmTickerSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmLinkedSecurity
 * FinancialInstrumentAttributesSD8.mmLinkedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8#mmOriginatingSecurityIdentification
 * FinancialInstrumentAttributesSD8.mmOriginatingSecurityIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentAttributesSD8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding underlying security details."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6
 * FinancialInstrumentAttributesSD6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAttributesSD8", propOrder = {"placeAndName", "countryOfListing", "incomeSourceCountry", "dTCAssetClass", "dTCAssetType", "securityEligibilityIndicator", "tickerSymbol", "linkedSecurity",
		"originatingSecurityIdentification"})
public class FinancialInstrumentAttributesSD8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8
	 * FinancialInstrumentAttributesSD8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmPlaceAndName
	 * FinancialInstrumentAttributesSD6.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD8, Max350Text> mmPlaceAndName = new MMMessageAttribute<FinancialInstrumentAttributesSD8, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD6.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(FinancialInstrumentAttributesSD8 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD8 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "CtryOfListg")
	protected CountryCode countryOfListing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8
	 * FinancialInstrumentAttributesSD8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfListg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the security was issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Country of Listing</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmCountryOfListing
	 * FinancialInstrumentAttributesSD6.mmCountryOfListing}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD8, Optional<CountryCode>> mmCountryOfListing = new MMMessageAttribute<FinancialInstrumentAttributesSD8, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmObject();
			isDerived = false;
			xmlTag = "CtryOfListg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Country of Listing"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfListing";
			definition = "Country in which the security was issued.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD6.mmCountryOfListing;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(FinancialInstrumentAttributesSD8 obj) {
			return obj.getCountryOfListing();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD8 obj, Optional<CountryCode> value) {
			obj.setCountryOfListing(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmSrcCtry")
	protected CountryCode incomeSourceCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8
	 * FinancialInstrumentAttributesSD8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmSrcCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeSourceCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of source income for the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Income Source Country</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmIncomeSourceCountry
	 * FinancialInstrumentAttributesSD6.mmIncomeSourceCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD8, Optional<CountryCode>> mmIncomeSourceCountry = new MMMessageAttribute<FinancialInstrumentAttributesSD8, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmObject();
			isDerived = false;
			xmlTag = "IncmSrcCtry";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Income Source Country"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeSourceCountry";
			definition = "Country of source income for the security.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD6.mmIncomeSourceCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(FinancialInstrumentAttributesSD8 obj) {
			return obj.getIncomeSourceCountry();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD8 obj, Optional<CountryCode> value) {
			obj.setIncomeSourceCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCAsstClss")
	protected AssetClass1Code dTCAssetClass;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClass1Code
	 * AssetClass1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8
	 * FinancialInstrumentAttributesSD8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCAsstClss"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCAssetClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification of instruments into asset classes at DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Asset Class</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmDTCAssetClass
	 * FinancialInstrumentAttributesSD6.mmDTCAssetClass}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD8, Optional<AssetClass1Code>> mmDTCAssetClass = new MMMessageAttribute<FinancialInstrumentAttributesSD8, Optional<AssetClass1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstClss";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Asset Class"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetClass";
			definition = "Classification of instruments into asset classes at DTC (The Depository Trust Corporation).";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD6.mmDTCAssetClass;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClass1Code.mmObject();
		}

		@Override
		public Optional<AssetClass1Code> getValue(FinancialInstrumentAttributesSD8 obj) {
			return obj.getDTCAssetClass();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD8 obj, Optional<AssetClass1Code> value) {
			obj.setDTCAssetClass(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCAsstTp")
	protected DTCAssetType1Code dTCAssetType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAssetType1Code
	 * DTCAssetType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8
	 * FinancialInstrumentAttributesSD8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCAsstTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCAssetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further classification of instruments into (issue) asset types at DTC (The Depository Trust Corporation)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Asset Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmDTCAssetType
	 * FinancialInstrumentAttributesSD6.mmDTCAssetType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD8, Optional<DTCAssetType1Code>> mmDTCAssetType = new MMMessageAttribute<FinancialInstrumentAttributesSD8, Optional<DTCAssetType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmObject();
			isDerived = false;
			xmlTag = "DTCAsstTp";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Asset Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAssetType";
			definition = "Further classification of instruments into (issue) asset types at DTC (The Depository Trust Corporation).";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD6.mmDTCAssetType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCAssetType1Code.mmObject();
		}

		@Override
		public Optional<DTCAssetType1Code> getValue(FinancialInstrumentAttributesSD8 obj) {
			return obj.getDTCAssetType();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD8 obj, Optional<DTCAssetType1Code> value) {
			obj.setDTCAssetType(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyElgbltyInd")
	protected YesNoIndicator securityEligibilityIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8
	 * FinancialInstrumentAttributesSD8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyElgbltyInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityEligibilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is eligible for holding at DTC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Security Eligibility Indicator</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmSecurityEligibilityIndicator
	 * FinancialInstrumentAttributesSD6.mmSecurityEligibilityIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD8, Optional<YesNoIndicator>> mmSecurityEligibilityIndicator = new MMMessageAttribute<FinancialInstrumentAttributesSD8, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmObject();
			isDerived = false;
			xmlTag = "SctyElgbltyInd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Security Eligibility Indicator"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityEligibilityIndicator";
			definition = "Indicates whether the security is eligible for holding at DTC.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD6.mmSecurityEligibilityIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FinancialInstrumentAttributesSD8 obj) {
			return obj.getSecurityEligibilityIndicator();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD8 obj, Optional<YesNoIndicator> value) {
			obj.setSecurityEligibilityIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TckrSymb")
	protected Max35Text tickerSymbol;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8
	 * FinancialInstrumentAttributesSD8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TckrSymb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TickerSymbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ticket symbol for the event security (underlying security)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Ticker Symbol</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmTickerSymbol
	 * FinancialInstrumentAttributesSD6.mmTickerSymbol}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD8, Optional<Max35Text>> mmTickerSymbol = new MMMessageAttribute<FinancialInstrumentAttributesSD8, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmObject();
			isDerived = false;
			xmlTag = "TckrSymb";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Ticker Symbol"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TickerSymbol";
			definition = "Ticket symbol for the event security (underlying security).";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD6.mmTickerSymbol;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(FinancialInstrumentAttributesSD8 obj) {
			return obj.getTickerSymbol();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD8 obj, Optional<Max35Text> value) {
			obj.setTickerSymbol(value.orElse(null));
		}
	};
	@XmlElement(name = "LkdScty")
	protected SecurityIdentification15 linkedSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15
	 * SecurityIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8
	 * FinancialInstrumentAttributesSD8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdScty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security whose characteristics mirror the event security for purposes of FCP eligibility and tax relief. Certain derivative securities like HOLDR may have certain events where the source of payments are from an underlying security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Linked Security ID, DTCCSynonym: Linked
	 * Security ID Type</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD6#mmLinkedSecurity
	 * FinancialInstrumentAttributesSD6.mmLinkedSecurity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD8, Optional<SecurityIdentification15>> mmLinkedSecurity = new MMMessageAttribute<FinancialInstrumentAttributesSD8, Optional<SecurityIdentification15>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmObject();
			isDerived = false;
			xmlTag = "LkdScty";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Linked Security ID"), new DTCCSynonym(this, "Linked Security ID Type"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedSecurity";
			definition = "Security whose characteristics mirror the event security for purposes of FCP eligibility and tax relief. Certain derivative securities like HOLDR may have certain events where the source of payments are from an underlying security.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD6.mmLinkedSecurity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityIdentification15.mmObject();
		}

		@Override
		public Optional<SecurityIdentification15> getValue(FinancialInstrumentAttributesSD8 obj) {
			return obj.getLinkedSecurity();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD8 obj, Optional<SecurityIdentification15> value) {
			obj.setLinkedSecurity(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgtgSctyId")
	protected OtherIdentification2 originatingSecurityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherIdentification2
	 * OtherIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD8
	 * FinancialInstrumentAttributesSD8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgtgSctyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatingSecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the 'original' security identifier of the event. It is used in the scenarios like \"partial call\" where there are 2 events. The first event distributes into the Contra CUSIP, a temporary security; and on the second event that temporary security becomes the underlying security of the event. This element is used in the second event to point to the original CUSIP."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributesSD8, Optional<OtherIdentification2>> mmOriginatingSecurityIdentification = new MMMessageAssociationEnd<FinancialInstrumentAttributesSD8, Optional<OtherIdentification2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmObject();
			isDerived = false;
			xmlTag = "OrgtgSctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingSecurityIdentification";
			definition = "Represents the 'original' security identifier of the event. It is used in the scenarios like \"partial call\" where there are 2 events. The first event distributes into the Contra CUSIP, a temporary security; and on the second event that temporary security becomes the underlying security of the event. This element is used in the second event to point to the original CUSIP.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherIdentification2.mmObject();
		}

		@Override
		public Optional<OtherIdentification2> getValue(FinancialInstrumentAttributesSD8 obj) {
			return obj.getOriginatingSecurityIdentification();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD8 obj, Optional<OtherIdentification2> value) {
			obj.setOriginatingSecurityIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmPlaceAndName, com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmCountryOfListing,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmIncomeSourceCountry, com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmDTCAssetClass,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmDTCAssetType, com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmSecurityEligibilityIndicator,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmTickerSymbol, com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmLinkedSecurity,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD8.mmOriginatingSecurityIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAttributesSD8";
				definition = "Provides additional information regarding underlying security details.";
				previousVersion_lazy = () -> FinancialInstrumentAttributesSD6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public FinancialInstrumentAttributesSD8 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<CountryCode> getCountryOfListing() {
		return countryOfListing == null ? Optional.empty() : Optional.of(countryOfListing);
	}

	public FinancialInstrumentAttributesSD8 setCountryOfListing(CountryCode countryOfListing) {
		this.countryOfListing = countryOfListing;
		return this;
	}

	public Optional<CountryCode> getIncomeSourceCountry() {
		return incomeSourceCountry == null ? Optional.empty() : Optional.of(incomeSourceCountry);
	}

	public FinancialInstrumentAttributesSD8 setIncomeSourceCountry(CountryCode incomeSourceCountry) {
		this.incomeSourceCountry = incomeSourceCountry;
		return this;
	}

	public Optional<AssetClass1Code> getDTCAssetClass() {
		return dTCAssetClass == null ? Optional.empty() : Optional.of(dTCAssetClass);
	}

	public FinancialInstrumentAttributesSD8 setDTCAssetClass(AssetClass1Code dTCAssetClass) {
		this.dTCAssetClass = dTCAssetClass;
		return this;
	}

	public Optional<DTCAssetType1Code> getDTCAssetType() {
		return dTCAssetType == null ? Optional.empty() : Optional.of(dTCAssetType);
	}

	public FinancialInstrumentAttributesSD8 setDTCAssetType(DTCAssetType1Code dTCAssetType) {
		this.dTCAssetType = dTCAssetType;
		return this;
	}

	public Optional<YesNoIndicator> getSecurityEligibilityIndicator() {
		return securityEligibilityIndicator == null ? Optional.empty() : Optional.of(securityEligibilityIndicator);
	}

	public FinancialInstrumentAttributesSD8 setSecurityEligibilityIndicator(YesNoIndicator securityEligibilityIndicator) {
		this.securityEligibilityIndicator = securityEligibilityIndicator;
		return this;
	}

	public Optional<Max35Text> getTickerSymbol() {
		return tickerSymbol == null ? Optional.empty() : Optional.of(tickerSymbol);
	}

	public FinancialInstrumentAttributesSD8 setTickerSymbol(Max35Text tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
		return this;
	}

	public Optional<SecurityIdentification15> getLinkedSecurity() {
		return linkedSecurity == null ? Optional.empty() : Optional.of(linkedSecurity);
	}

	public FinancialInstrumentAttributesSD8 setLinkedSecurity(SecurityIdentification15 linkedSecurity) {
		this.linkedSecurity = linkedSecurity;
		return this;
	}

	public Optional<OtherIdentification2> getOriginatingSecurityIdentification() {
		return originatingSecurityIdentification == null ? Optional.empty() : Optional.of(originatingSecurityIdentification);
	}

	public FinancialInstrumentAttributesSD8 setOriginatingSecurityIdentification(OtherIdentification2 originatingSecurityIdentification) {
		this.originatingSecurityIdentification = originatingSecurityIdentification;
		return this;
	}
}