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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionNotificationV02;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.Max3Number;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction5#mmDateDetails
 * CorporateAction5.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmPeriodDetails
 * CorporateAction5.mmPeriodDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmRateAndAmountDetails
 * CorporateAction5.mmRateAndAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmPriceDetails
 * CorporateAction5.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmSecuritiesQuantity
 * CorporateAction5.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmInterestAccruedNumberOfDays
 * CorporateAction5.mmInterestAccruedNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmCouponNumber
 * CorporateAction5.mmCouponNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmCertificationRequiredIndicator
 * CorporateAction5.mmCertificationRequiredIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmChargesAppliedIndicator
 * CorporateAction5.mmChargesAppliedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmRestrictionIndicator
 * CorporateAction5.mmRestrictionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmAccruedInterestIndicator
 * CorporateAction5.mmAccruedInterestIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmDividendType
 * CorporateAction5.mmDividendType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmConversionType
 * CorporateAction5.mmConversionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmDistributionType
 * CorporateAction5.mmDistributionType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction5#mmOfferType
 * CorporateAction5.mmOfferType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmRenounceableEntitlementStatusType
 * CorporateAction5.mmRenounceableEntitlementStatusType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction5#mmEventStage
 * CorporateAction5.mmEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmAdditionalBusinessProcessIndicator
 * CorporateAction5.mmAdditionalBusinessProcessIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction5#mmChangeType
 * CorporateAction5.mmChangeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmIntermediateSecuritiesDistributionType
 * CorporateAction5.mmIntermediateSecuritiesDistributionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmCapitalGainInOutIndicator
 * CorporateAction5.mmCapitalGainInOutIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmTaxableIncomePerShareCalculated
 * CorporateAction5.mmTaxableIncomePerShareCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmElectionType
 * CorporateAction5.mmElectionType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction5#mmLotteryType
 * CorporateAction5.mmLotteryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmCertificationType
 * CorporateAction5.mmCertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmNewPlaceOfIncorporation
 * CorporateAction5.mmNewPlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmAdditionalInformation
 * CorporateAction5.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02#mmCorporateActionDetails
 * CorporateActionNotificationV02.mmCorporateActionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateAction5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forCorporateAction5
 * ConstraintCoexistenceQuantityRule.forCorporateAction5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction7
 * CorporateAction7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateAction5", propOrder = {"dateDetails", "periodDetails", "rateAndAmountDetails", "priceDetails", "securitiesQuantity", "interestAccruedNumberOfDays", "couponNumber", "certificationRequiredIndicator",
		"chargesAppliedIndicator", "restrictionIndicator", "accruedInterestIndicator", "dividendType", "conversionType", "distributionType", "offerType", "renounceableEntitlementStatusType", "eventStage",
		"additionalBusinessProcessIndicator", "changeType", "intermediateSecuritiesDistributionType", "capitalGainInOutIndicator", "taxableIncomePerShareCalculated", "electionType", "lotteryType", "certificationType",
		"newPlaceOfIncorporation", "additionalInformation"})
public class CorporateAction5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtDtls")
	protected CorporateActionDate14 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate14
	 * CorporateActionDate14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the dates related to a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<CorporateActionDate14>> mmDateDetails = new MMMessageAssociationEnd<CorporateAction5, Optional<CorporateActionDate14>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionDate14.mmObject();
		}

		@Override
		public Optional<CorporateActionDate14> getValue(CorporateAction5 obj) {
			return obj.getDateDetails();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<CorporateActionDate14> value) {
			obj.setDateDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PrdDtls")
	protected CorporateActionPeriod6 periodDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6
	 * CorporateActionPeriod6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrdDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the periods related to a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<CorporateActionPeriod6>> mmPeriodDetails = new MMMessageAssociationEnd<CorporateAction5, Optional<CorporateActionPeriod6>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "PrdDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodDetails";
			definition = "Provides information about the periods related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPeriod6.mmObject();
		}

		@Override
		public Optional<CorporateActionPeriod6> getValue(CorporateAction5 obj) {
			return obj.getPeriodDetails();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<CorporateActionPeriod6> value) {
			obj.setPeriodDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RateAndAmtDtls")
	protected CorporateActionRate16 rateAndAmountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate16
	 * CorporateActionRate16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateAndAmtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateAndAmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about rates and amounts related to a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<CorporateActionRate16>> mmRateAndAmountDetails = new MMMessageAssociationEnd<CorporateAction5, Optional<CorporateActionRate16>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "RateAndAmtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateAndAmountDetails";
			definition = "Provides information about rates and amounts related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionRate16.mmObject();
		}

		@Override
		public Optional<CorporateActionRate16> getValue(CorporateAction5 obj) {
			return obj.getRateAndAmountDetails();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<CorporateActionRate16> value) {
			obj.setRateAndAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected CorporateActionPrice17 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice17
	 * CorporateActionPrice17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the prices related to a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<CorporateActionPrice17>> mmPriceDetails = new MMMessageAssociationEnd<CorporateAction5, Optional<CorporateActionPrice17>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPrice17.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice17> getValue(CorporateAction5 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<CorporateActionPrice17> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesQty")
	protected CorporateActionQuantity3 securitiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3
	 * CorporateActionQuantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSecuritiesQuantity
	 * CorporateActionEvent.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about securities quantity linked to a corporate action."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<CorporateActionQuantity3>> mmSecuritiesQuantity = new MMMessageAssociationEnd<CorporateAction5, Optional<CorporateActionQuantity3>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "SctiesQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Provides information about securities quantity linked to a corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionQuantity3.mmObject();
		}

		@Override
		public Optional<CorporateActionQuantity3> getValue(CorporateAction5 obj) {
			return obj.getSecuritiesQuantity();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<CorporateActionQuantity3> value) {
			obj.setSecuritiesQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstAcrdNbOfDays")
	protected Max3Number interestAccruedNumberOfDays;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstAcrdNbOfDays"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAccruedNumberOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of days used for calculating the accrued interest amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99A::DAAC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction5, Optional<Max3Number>> mmInterestAccruedNumberOfDays = new MMMessageAttribute<CorporateAction5, Optional<Max3Number>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "IntrstAcrdNbOfDays";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99A::DAAC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAccruedNumberOfDays";
			definition = "Number of days used for calculating the accrued interest amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}

		@Override
		public Optional<Max3Number> getValue(CorporateAction5 obj) {
			return obj.getInterestAccruedNumberOfDays();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<Max3Number> value) {
			obj.setInterestAccruedNumberOfDays(value.orElse(null));
		}
	};
	@XmlElement(name = "CpnNb")
	protected List<IdentificationFormat1Choice> couponNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationFormat1Choice
	 * IdentificationFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CouponAttached#mmNumber
	 * CouponAttached.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of the coupon attached/associated with a security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::COUP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, List<IdentificationFormat1Choice>> mmCouponNumber = new MMMessageAssociationEnd<CorporateAction5, List<IdentificationFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CouponAttached.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "CpnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::COUP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponNumber";
			definition = "Number of the coupon attached/associated with a security.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IdentificationFormat1Choice.mmObject();
		}

		@Override
		public List<IdentificationFormat1Choice> getValue(CorporateAction5 obj) {
			return obj.getCouponNumber();
		}

		@Override
		public void setValue(CorporateAction5 obj, List<IdentificationFormat1Choice> value) {
			obj.setCouponNumber(value);
		}
	};
	@XmlElement(name = "CertfctnReqrdInd")
	protected YesNoIndicator certificationRequiredIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationIndicator
	 * BeneficialOwner.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnReqrdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationRequiredIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether certification is required from the account owner. \nYes = certification required.\nNo = no certification required."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CEFI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction5, Optional<YesNoIndicator>> mmCertificationRequiredIndicator = new MMMessageAttribute<CorporateAction5, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "CertfctnReqrdInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CEFI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationRequiredIndicator";
			definition = "Indicates whether certification is required from the account owner. \nYes = certification required.\nNo = no certification required.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction5 obj) {
			return obj.getCertificationRequiredIndicator();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<YesNoIndicator> value) {
			obj.setCertificationRequiredIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgsApldInd")
	protected YesNoIndicator chargesAppliedIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmChargesAppliedIndicator
	 * CorporateActionOption.mmChargesAppliedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsApldInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAppliedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether charges apply to the holder, for instance redemption charges."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::RCHG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction5, Optional<YesNoIndicator>> mmChargesAppliedIndicator = new MMMessageAttribute<CorporateAction5, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmChargesAppliedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "ChrgsApldInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::RCHG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether charges apply to the holder, for instance redemption charges.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction5 obj) {
			return obj.getChargesAppliedIndicator();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<YesNoIndicator> value) {
			obj.setChargesAppliedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "RstrctnInd")
	protected YesNoIndicator restrictionIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRestrictionIndicator
	 * CorporateActionEvent.mmRestrictionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctnInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is restrictions apply to the corporate action event or not.\nYes = There is restrictions.\nNo = There is no restrictions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::COMP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction5, Optional<YesNoIndicator>> mmRestrictionIndicator = new MMMessageAttribute<CorporateAction5, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmRestrictionIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "RstrctnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::COMP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionIndicator";
			definition = "Indicates whether there is restrictions apply to the corporate action event or not.\nYes = There is restrictions.\nNo = There is no restrictions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction5 obj) {
			return obj.getRestrictionIndicator();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<YesNoIndicator> value) {
			obj.setRestrictionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstInd")
	protected YesNoIndicator accruedInterestIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterestIndicator
	 * SecuritiesSettlement.mmAccruedInterestIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the holder is entitled to accrued interest."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::ACRU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction5, Optional<YesNoIndicator>> mmAccruedInterestIndicator = new MMMessageAttribute<CorporateAction5, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmAccruedInterestIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::ACRU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestIndicator";
			definition = "Indicates whether the holder is entitled to accrued interest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateAction5 obj) {
			return obj.getAccruedInterestIndicator();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<YesNoIndicator> value) {
			obj.setAccruedInterestIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "DvddTp")
	protected DividendTypeFormat3Choice dividendType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat3Choice
	 * DividendTypeFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmType
	 * Dividend.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conditions in which a dividend is paid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DIVI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<DividendTypeFormat3Choice>> mmDividendType = new MMMessageAssociationEnd<CorporateAction5, Optional<DividendTypeFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "DvddTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DIVI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendType";
			definition = "Specifies the conditions in which a dividend is paid.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DividendTypeFormat3Choice.mmObject();
		}

		@Override
		public Optional<DividendTypeFormat3Choice> getValue(CorporateAction5 obj) {
			return obj.getDividendType();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<DividendTypeFormat3Choice> value) {
			obj.setDividendType(value.orElse(null));
		}
	};
	@XmlElement(name = "ConvsTp")
	protected ConversionTypeFormat1Choice conversionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ConversionTypeFormat1Choice
	 * ConversionTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionType
	 * SecuritiesConversion.mmConversionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conversion type of an instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CONV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<ConversionTypeFormat1Choice>> mmConversionType = new MMMessageAssociationEnd<CorporateAction5, Optional<ConversionTypeFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmConversionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "ConvsTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CONV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionType";
			definition = "Specifies the conversion type of an instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ConversionTypeFormat1Choice.mmObject();
		}

		@Override
		public Optional<ConversionTypeFormat1Choice> getValue(CorporateAction5 obj) {
			return obj.getConversionType();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<ConversionTypeFormat1Choice> value) {
			obj.setConversionType(value.orElse(null));
		}
	};
	@XmlElement(name = "DstrbtnTp")
	protected DistributionTypeFormat1Choice distributionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat1Choice
	 * DistributionTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionDistribution
	 * CorporateActionServicing.mmCorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DstrbtnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the proceeds of the event will be distributed on a rolling basis rather than on a specific date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DITY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<DistributionTypeFormat1Choice>> mmDistributionType = new MMMessageAssociationEnd<CorporateAction5, Optional<DistributionTypeFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionServicing.mmCorporateActionDistribution;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DITY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionType";
			definition = "Specifies whether the proceeds of the event will be distributed on a rolling basis rather than on a specific date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DistributionTypeFormat1Choice.mmObject();
		}

		@Override
		public Optional<DistributionTypeFormat1Choice> getValue(CorporateAction5 obj) {
			return obj.getDistributionType();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<DistributionTypeFormat1Choice> value) {
			obj.setDistributionType(value.orElse(null));
		}
	};
	@XmlElement(name = "OfferTp")
	protected List<OfferTypeFormat1Choice> offerType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OfferTypeFormat1Choice
	 * OfferTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOfferType
	 * CorporateActionOption.mmOfferType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OfferTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conditions that apply to the offer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::OFFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, List<OfferTypeFormat1Choice>> mmOfferType = new MMMessageAssociationEnd<CorporateAction5, List<OfferTypeFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOfferType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "OfferTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::OFFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferType";
			definition = "Specifies the conditions that apply to the offer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OfferTypeFormat1Choice.mmObject();
		}

		@Override
		public List<OfferTypeFormat1Choice> getValue(CorporateAction5 obj) {
			return obj.getOfferType();
		}

		@Override
		public void setValue(CorporateAction5 obj, List<OfferTypeFormat1Choice> value) {
			obj.setOfferType(value);
		}
	};
	@XmlElement(name = "RnncblEntitlmntStsTp")
	protected RenounceableEntitlementStatusTypeFormat1Choice renounceableEntitlementStatusType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat1Choice
	 * RenounceableEntitlementStatusTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmRenounceableEntitlementStatusType
	 * CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RnncblEntitlmntStsTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenounceableEntitlementStatusType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether terms of the event allow resale of the rights."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SELL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<RenounceableEntitlementStatusTypeFormat1Choice>> mmRenounceableEntitlementStatusType = new MMMessageAssociationEnd<CorporateAction5, Optional<RenounceableEntitlementStatusTypeFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "RnncblEntitlmntStsTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenounceableEntitlementStatusType";
			definition = "Specifies whether terms of the event allow resale of the rights.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RenounceableEntitlementStatusTypeFormat1Choice.mmObject();
		}

		@Override
		public Optional<RenounceableEntitlementStatusTypeFormat1Choice> getValue(CorporateAction5 obj) {
			return obj.getRenounceableEntitlementStatusType();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<RenounceableEntitlementStatusTypeFormat1Choice> value) {
			obj.setRenounceableEntitlementStatusType(value.orElse(null));
		}
	};
	@XmlElement(name = "EvtStag")
	protected List<CorporateActionEventStageFormat3Choice> eventStage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat3Choice
	 * CorporateActionEventStageFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventStage
	 * CorporateActionEvent.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtStag"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ESTA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, List<CorporateActionEventStageFormat3Choice>> mmEventStage = new MMMessageAssociationEnd<CorporateAction5, List<CorporateActionEventStageFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventStage;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "EvtStag";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ESTA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionEventStageFormat3Choice.mmObject();
		}

		@Override
		public List<CorporateActionEventStageFormat3Choice> getValue(CorporateAction5 obj) {
			return obj.getEventStage();
		}

		@Override
		public void setValue(CorporateAction5 obj, List<CorporateActionEventStageFormat3Choice> value) {
			obj.setEventStage(value);
		}
	};
	@XmlElement(name = "AddtlBizPrcInd")
	protected List<AdditionalBusinessProcessFormat1Choice> additionalBusinessProcessIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat1Choice
	 * AdditionalBusinessProcessFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAdditionalBusinessProcess
	 * CorporateActionEvent.mmAdditionalBusinessProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBizPrcInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBusinessProcessIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ADDB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, List<AdditionalBusinessProcessFormat1Choice>> mmAdditionalBusinessProcessIndicator = new MMMessageAssociationEnd<CorporateAction5, List<AdditionalBusinessProcessFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAdditionalBusinessProcess;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "AddtlBizPrcInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ADDB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBusinessProcessIndicator";
			definition = "Specifies the type of the additional business process linked to a corporate action event such as a claim compensation or tax refund.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalBusinessProcessFormat1Choice.mmObject();
		}

		@Override
		public List<AdditionalBusinessProcessFormat1Choice> getValue(CorporateAction5 obj) {
			return obj.getAdditionalBusinessProcessIndicator();
		}

		@Override
		public void setValue(CorporateAction5 obj, List<AdditionalBusinessProcessFormat1Choice> value) {
			obj.setAdditionalBusinessProcessIndicator(value);
		}
	};
	@XmlElement(name = "ChngTp")
	protected List<CorporateActionChangeTypeFormat1Choice> changeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionChangeTypeFormat1Choice
	 * CorporateActionChangeTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmChangeType
	 * SecuritiesModification.mmChangeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChngTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of change announced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CHAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, List<CorporateActionChangeTypeFormat1Choice>> mmChangeType = new MMMessageAssociationEnd<CorporateAction5, List<CorporateActionChangeTypeFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesModification.mmChangeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "ChngTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CHAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeType";
			definition = "Specifies the type of change announced.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionChangeTypeFormat1Choice.mmObject();
		}

		@Override
		public List<CorporateActionChangeTypeFormat1Choice> getValue(CorporateAction5 obj) {
			return obj.getChangeType();
		}

		@Override
		public void setValue(CorporateAction5 obj, List<CorporateActionChangeTypeFormat1Choice> value) {
			obj.setChangeType(value);
		}
	};
	@XmlElement(name = "IntrmdtSctiesDstrbtnTp")
	protected IntermediateSecuritiesDistributionTypeFormat5Choice intermediateSecuritiesDistributionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IntermediateSecuritiesDistributionTypeFormat5Choice
	 * IntermediateSecuritiesDistributionTypeFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesDistributionType
	 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmdtSctiesDstrbtnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistributionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of intermediates securities distribution."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::RHDI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<IntermediateSecuritiesDistributionTypeFormat5Choice>> mmIntermediateSecuritiesDistributionType = new MMMessageAssociationEnd<CorporateAction5, Optional<IntermediateSecuritiesDistributionTypeFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmIntermediateSecuritiesDistributionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "IntrmdtSctiesDstrbtnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::RHDI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistributionType";
			definition = "Type of intermediates securities distribution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IntermediateSecuritiesDistributionTypeFormat5Choice.mmObject();
		}

		@Override
		public Optional<IntermediateSecuritiesDistributionTypeFormat5Choice> getValue(CorporateAction5 obj) {
			return obj.getIntermediateSecuritiesDistributionType();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<IntermediateSecuritiesDistributionTypeFormat5Choice> value) {
			obj.setIntermediateSecuritiesDistributionType(value.orElse(null));
		}
	};
	@XmlElement(name = "CptlGnInOutInd")
	protected CapitalGainFormat1Choice capitalGainInOutIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat1Choice
	 * CapitalGainFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUCapitalGain
	 * SecuritiesTax.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CptlGnInOutInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainInOutIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the capital gain is in the scope of the EU Savings directive for the income realised upon the sale, refund or redemption of shares and units (.) (Article 6(1d))."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ECIO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<CapitalGainFormat1Choice>> mmCapitalGainInOutIndicator = new MMMessageAssociationEnd<CorporateAction5, Optional<CapitalGainFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUCapitalGain;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "CptlGnInOutInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ECIO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainInOutIndicator";
			definition = "Specifies whether the capital gain is in the scope of the EU Savings directive for the income realised upon the sale, refund or redemption of shares and units (.) (Article 6(1d)).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CapitalGainFormat1Choice.mmObject();
		}

		@Override
		public Optional<CapitalGainFormat1Choice> getValue(CorporateAction5 obj) {
			return obj.getCapitalGainInOutIndicator();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<CapitalGainFormat1Choice> value) {
			obj.setCapitalGainInOutIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxblIncmPerShrClctd")
	protected TaxableIncomePerShareCalculatedFormat1Choice taxableIncomePerShareCalculated;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat1Choice
	 * TaxableIncomePerShareCalculatedFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShareCalculated
	 * SecuritiesTax.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerShrClctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShareCalculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the financial instrument calculates the taxable income per dividend/taxable income per share."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TDTA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<TaxableIncomePerShareCalculatedFormat1Choice>> mmTaxableIncomePerShareCalculated = new MMMessageAssociationEnd<CorporateAction5, Optional<TaxableIncomePerShareCalculatedFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerShareCalculated;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerShrClctd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TDTA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the financial instrument calculates the taxable income per dividend/taxable income per share.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxableIncomePerShareCalculatedFormat1Choice.mmObject();
		}

		@Override
		public Optional<TaxableIncomePerShareCalculatedFormat1Choice> getValue(CorporateAction5 obj) {
			return obj.getTaxableIncomePerShareCalculated();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<TaxableIncomePerShareCalculatedFormat1Choice> value) {
			obj.setTaxableIncomePerShareCalculated(value.orElse(null));
		}
	};
	@XmlElement(name = "ElctnTp")
	protected ElectionTypeFormat1Choice electionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ElectionTypeFormat1Choice
	 * ElectionTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmElectionType
	 * CorporateActionElection.mmElectionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the effect on the holdings of electing a corporate action option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ELCT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<ElectionTypeFormat1Choice>> mmElectionType = new MMMessageAssociationEnd<CorporateAction5, Optional<ElectionTypeFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionElection.mmElectionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "ElctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ELCT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionType";
			definition = "Specifies the effect on the holdings of electing a corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ElectionTypeFormat1Choice.mmObject();
		}

		@Override
		public Optional<ElectionTypeFormat1Choice> getValue(CorporateAction5 obj) {
			return obj.getElectionType();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<ElectionTypeFormat1Choice> value) {
			obj.setElectionType(value.orElse(null));
		}
	};
	@XmlElement(name = "LtryTp")
	protected LotteryTypeFormat1Choice lotteryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat1Choice
	 * LotteryTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmLotteryType
	 * Lottery.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtryTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of lottery announced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LOTO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<LotteryTypeFormat1Choice>> mmLotteryType = new MMMessageAssociationEnd<CorporateAction5, Optional<LotteryTypeFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> Lottery.mmLotteryType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "LtryTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LOTO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LotteryTypeFormat1Choice.mmObject();
		}

		@Override
		public Optional<LotteryTypeFormat1Choice> getValue(CorporateAction5 obj) {
			return obj.getLotteryType();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<LotteryTypeFormat1Choice> value) {
			obj.setLotteryType(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnTp")
	protected CertificationTypeFormat1Choice certificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CertificationTypeFormat1Choice
	 * CertificationTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the certification format required, this is, physical or electronic format."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CETI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<CertificationTypeFormat1Choice>> mmCertificationType = new MMMessageAssociationEnd<CorporateAction5, Optional<CertificationTypeFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "CertfctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CETI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationType";
			definition = "Specifies the certification format required, this is, physical or electronic format.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CertificationTypeFormat1Choice.mmObject();
		}

		@Override
		public Optional<CertificationTypeFormat1Choice> getValue(CorporateAction5 obj) {
			return obj.getCertificationType();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<CertificationTypeFormat1Choice> value) {
			obj.setCertificationType(value.orElse(null));
		}
	};
	@XmlElement(name = "NewPlcOfIncorprtn")
	protected Max70Text newPlaceOfIncorporation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesModification#mmNewOrganisationInformation
	 * SecuritiesModification.mmNewOrganisationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewPlcOfIncorprtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPlaceOfIncorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New company's place of incorporation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94G::NPLI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateAction5, Optional<Max70Text>> mmNewPlaceOfIncorporation = new MMMessageAttribute<CorporateAction5, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesModification.mmNewOrganisationInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "NewPlcOfIncorprtn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94G::NPLI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPlaceOfIncorporation";
			definition = "New company's place of incorporation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(CorporateAction5 obj) {
			return obj.getNewPlaceOfIncorporation();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<Max70Text> value) {
			obj.setNewPlaceOfIncorporation(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative3 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative3
	 * CorporateActionNarrative3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5
	 * CorporateAction5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information. This field may only be used when the information to be transmitted, cannot be coded."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction5, Optional<CorporateActionNarrative3>> mmAdditionalInformation = new MMMessageAssociationEnd<CorporateAction5, Optional<CorporateActionNarrative3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction5.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information. This field may only be used when the information to be transmitted, cannot be coded.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionNarrative3.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative3> getValue(CorporateAction5 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateAction5 obj, Optional<CorporateActionNarrative3> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction5.mmDateDetails, com.tools20022.repository.msg.CorporateAction5.mmPeriodDetails,
						com.tools20022.repository.msg.CorporateAction5.mmRateAndAmountDetails, com.tools20022.repository.msg.CorporateAction5.mmPriceDetails, com.tools20022.repository.msg.CorporateAction5.mmSecuritiesQuantity,
						com.tools20022.repository.msg.CorporateAction5.mmInterestAccruedNumberOfDays, com.tools20022.repository.msg.CorporateAction5.mmCouponNumber,
						com.tools20022.repository.msg.CorporateAction5.mmCertificationRequiredIndicator, com.tools20022.repository.msg.CorporateAction5.mmChargesAppliedIndicator,
						com.tools20022.repository.msg.CorporateAction5.mmRestrictionIndicator, com.tools20022.repository.msg.CorporateAction5.mmAccruedInterestIndicator, com.tools20022.repository.msg.CorporateAction5.mmDividendType,
						com.tools20022.repository.msg.CorporateAction5.mmConversionType, com.tools20022.repository.msg.CorporateAction5.mmDistributionType, com.tools20022.repository.msg.CorporateAction5.mmOfferType,
						com.tools20022.repository.msg.CorporateAction5.mmRenounceableEntitlementStatusType, com.tools20022.repository.msg.CorporateAction5.mmEventStage,
						com.tools20022.repository.msg.CorporateAction5.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction5.mmChangeType,
						com.tools20022.repository.msg.CorporateAction5.mmIntermediateSecuritiesDistributionType, com.tools20022.repository.msg.CorporateAction5.mmCapitalGainInOutIndicator,
						com.tools20022.repository.msg.CorporateAction5.mmTaxableIncomePerShareCalculated, com.tools20022.repository.msg.CorporateAction5.mmElectionType, com.tools20022.repository.msg.CorporateAction5.mmLotteryType,
						com.tools20022.repository.msg.CorporateAction5.mmCertificationType, com.tools20022.repository.msg.CorporateAction5.mmNewPlaceOfIncorporation, com.tools20022.repository.msg.CorporateAction5.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotificationV02.mmCorporateActionDetails);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forCorporateAction5);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CorporateAction5";
				definition = "Provides information about the corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateAction7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CorporateActionDate14> getDateDetails() {
		return dateDetails == null ? Optional.empty() : Optional.of(dateDetails);
	}

	public CorporateAction5 setDateDetails(CorporateActionDate14 dateDetails) {
		this.dateDetails = dateDetails;
		return this;
	}

	public Optional<CorporateActionPeriod6> getPeriodDetails() {
		return periodDetails == null ? Optional.empty() : Optional.of(periodDetails);
	}

	public CorporateAction5 setPeriodDetails(CorporateActionPeriod6 periodDetails) {
		this.periodDetails = periodDetails;
		return this;
	}

	public Optional<CorporateActionRate16> getRateAndAmountDetails() {
		return rateAndAmountDetails == null ? Optional.empty() : Optional.of(rateAndAmountDetails);
	}

	public CorporateAction5 setRateAndAmountDetails(CorporateActionRate16 rateAndAmountDetails) {
		this.rateAndAmountDetails = rateAndAmountDetails;
		return this;
	}

	public Optional<CorporateActionPrice17> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public CorporateAction5 setPriceDetails(CorporateActionPrice17 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}

	public Optional<CorporateActionQuantity3> getSecuritiesQuantity() {
		return securitiesQuantity == null ? Optional.empty() : Optional.of(securitiesQuantity);
	}

	public CorporateAction5 setSecuritiesQuantity(CorporateActionQuantity3 securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
		return this;
	}

	public Optional<Max3Number> getInterestAccruedNumberOfDays() {
		return interestAccruedNumberOfDays == null ? Optional.empty() : Optional.of(interestAccruedNumberOfDays);
	}

	public CorporateAction5 setInterestAccruedNumberOfDays(Max3Number interestAccruedNumberOfDays) {
		this.interestAccruedNumberOfDays = interestAccruedNumberOfDays;
		return this;
	}

	public List<IdentificationFormat1Choice> getCouponNumber() {
		return couponNumber == null ? couponNumber = new ArrayList<>() : couponNumber;
	}

	public CorporateAction5 setCouponNumber(List<IdentificationFormat1Choice> couponNumber) {
		this.couponNumber = Objects.requireNonNull(couponNumber);
		return this;
	}

	public Optional<YesNoIndicator> getCertificationRequiredIndicator() {
		return certificationRequiredIndicator == null ? Optional.empty() : Optional.of(certificationRequiredIndicator);
	}

	public CorporateAction5 setCertificationRequiredIndicator(YesNoIndicator certificationRequiredIndicator) {
		this.certificationRequiredIndicator = certificationRequiredIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getChargesAppliedIndicator() {
		return chargesAppliedIndicator == null ? Optional.empty() : Optional.of(chargesAppliedIndicator);
	}

	public CorporateAction5 setChargesAppliedIndicator(YesNoIndicator chargesAppliedIndicator) {
		this.chargesAppliedIndicator = chargesAppliedIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getRestrictionIndicator() {
		return restrictionIndicator == null ? Optional.empty() : Optional.of(restrictionIndicator);
	}

	public CorporateAction5 setRestrictionIndicator(YesNoIndicator restrictionIndicator) {
		this.restrictionIndicator = restrictionIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getAccruedInterestIndicator() {
		return accruedInterestIndicator == null ? Optional.empty() : Optional.of(accruedInterestIndicator);
	}

	public CorporateAction5 setAccruedInterestIndicator(YesNoIndicator accruedInterestIndicator) {
		this.accruedInterestIndicator = accruedInterestIndicator;
		return this;
	}

	public Optional<DividendTypeFormat3Choice> getDividendType() {
		return dividendType == null ? Optional.empty() : Optional.of(dividendType);
	}

	public CorporateAction5 setDividendType(DividendTypeFormat3Choice dividendType) {
		this.dividendType = dividendType;
		return this;
	}

	public Optional<ConversionTypeFormat1Choice> getConversionType() {
		return conversionType == null ? Optional.empty() : Optional.of(conversionType);
	}

	public CorporateAction5 setConversionType(ConversionTypeFormat1Choice conversionType) {
		this.conversionType = conversionType;
		return this;
	}

	public Optional<DistributionTypeFormat1Choice> getDistributionType() {
		return distributionType == null ? Optional.empty() : Optional.of(distributionType);
	}

	public CorporateAction5 setDistributionType(DistributionTypeFormat1Choice distributionType) {
		this.distributionType = distributionType;
		return this;
	}

	public List<OfferTypeFormat1Choice> getOfferType() {
		return offerType == null ? offerType = new ArrayList<>() : offerType;
	}

	public CorporateAction5 setOfferType(List<OfferTypeFormat1Choice> offerType) {
		this.offerType = Objects.requireNonNull(offerType);
		return this;
	}

	public Optional<RenounceableEntitlementStatusTypeFormat1Choice> getRenounceableEntitlementStatusType() {
		return renounceableEntitlementStatusType == null ? Optional.empty() : Optional.of(renounceableEntitlementStatusType);
	}

	public CorporateAction5 setRenounceableEntitlementStatusType(RenounceableEntitlementStatusTypeFormat1Choice renounceableEntitlementStatusType) {
		this.renounceableEntitlementStatusType = renounceableEntitlementStatusType;
		return this;
	}

	public List<CorporateActionEventStageFormat3Choice> getEventStage() {
		return eventStage == null ? eventStage = new ArrayList<>() : eventStage;
	}

	public CorporateAction5 setEventStage(List<CorporateActionEventStageFormat3Choice> eventStage) {
		this.eventStage = Objects.requireNonNull(eventStage);
		return this;
	}

	public List<AdditionalBusinessProcessFormat1Choice> getAdditionalBusinessProcessIndicator() {
		return additionalBusinessProcessIndicator == null ? additionalBusinessProcessIndicator = new ArrayList<>() : additionalBusinessProcessIndicator;
	}

	public CorporateAction5 setAdditionalBusinessProcessIndicator(List<AdditionalBusinessProcessFormat1Choice> additionalBusinessProcessIndicator) {
		this.additionalBusinessProcessIndicator = Objects.requireNonNull(additionalBusinessProcessIndicator);
		return this;
	}

	public List<CorporateActionChangeTypeFormat1Choice> getChangeType() {
		return changeType == null ? changeType = new ArrayList<>() : changeType;
	}

	public CorporateAction5 setChangeType(List<CorporateActionChangeTypeFormat1Choice> changeType) {
		this.changeType = Objects.requireNonNull(changeType);
		return this;
	}

	public Optional<IntermediateSecuritiesDistributionTypeFormat5Choice> getIntermediateSecuritiesDistributionType() {
		return intermediateSecuritiesDistributionType == null ? Optional.empty() : Optional.of(intermediateSecuritiesDistributionType);
	}

	public CorporateAction5 setIntermediateSecuritiesDistributionType(IntermediateSecuritiesDistributionTypeFormat5Choice intermediateSecuritiesDistributionType) {
		this.intermediateSecuritiesDistributionType = intermediateSecuritiesDistributionType;
		return this;
	}

	public Optional<CapitalGainFormat1Choice> getCapitalGainInOutIndicator() {
		return capitalGainInOutIndicator == null ? Optional.empty() : Optional.of(capitalGainInOutIndicator);
	}

	public CorporateAction5 setCapitalGainInOutIndicator(CapitalGainFormat1Choice capitalGainInOutIndicator) {
		this.capitalGainInOutIndicator = capitalGainInOutIndicator;
		return this;
	}

	public Optional<TaxableIncomePerShareCalculatedFormat1Choice> getTaxableIncomePerShareCalculated() {
		return taxableIncomePerShareCalculated == null ? Optional.empty() : Optional.of(taxableIncomePerShareCalculated);
	}

	public CorporateAction5 setTaxableIncomePerShareCalculated(TaxableIncomePerShareCalculatedFormat1Choice taxableIncomePerShareCalculated) {
		this.taxableIncomePerShareCalculated = taxableIncomePerShareCalculated;
		return this;
	}

	public Optional<ElectionTypeFormat1Choice> getElectionType() {
		return electionType == null ? Optional.empty() : Optional.of(electionType);
	}

	public CorporateAction5 setElectionType(ElectionTypeFormat1Choice electionType) {
		this.electionType = electionType;
		return this;
	}

	public Optional<LotteryTypeFormat1Choice> getLotteryType() {
		return lotteryType == null ? Optional.empty() : Optional.of(lotteryType);
	}

	public CorporateAction5 setLotteryType(LotteryTypeFormat1Choice lotteryType) {
		this.lotteryType = lotteryType;
		return this;
	}

	public Optional<CertificationTypeFormat1Choice> getCertificationType() {
		return certificationType == null ? Optional.empty() : Optional.of(certificationType);
	}

	public CorporateAction5 setCertificationType(CertificationTypeFormat1Choice certificationType) {
		this.certificationType = certificationType;
		return this;
	}

	public Optional<Max70Text> getNewPlaceOfIncorporation() {
		return newPlaceOfIncorporation == null ? Optional.empty() : Optional.of(newPlaceOfIncorporation);
	}

	public CorporateAction5 setNewPlaceOfIncorporation(Max70Text newPlaceOfIncorporation) {
		this.newPlaceOfIncorporation = newPlaceOfIncorporation;
		return this;
	}

	public Optional<CorporateActionNarrative3> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateAction5 setAdditionalInformation(CorporateActionNarrative3 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}