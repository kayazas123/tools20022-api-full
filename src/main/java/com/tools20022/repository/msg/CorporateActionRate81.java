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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RateTypeAndAmountAndStatus26;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies rates related to a corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmAdditionalTax
 * CorporateActionRate81.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmGrossDividendRate
 * CorporateActionRate81.mmGrossDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmNetDividendRate
 * CorporateActionRate81.mmNetDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmIndexFactor
 * CorporateActionRate81.mmIndexFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmInterestRateUsedForPayment
 * CorporateActionRate81.mmInterestRateUsedForPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmMaximumAllowedOversubscriptionRate
 * CorporateActionRate81.mmMaximumAllowedOversubscriptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmProrationRate
 * CorporateActionRate81.mmProrationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmWithholdingTaxRate
 * CorporateActionRate81.mmWithholdingTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmSecondLevelTax
 * CorporateActionRate81.mmSecondLevelTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmTaxableIncomePerDividendShare
 * CorporateActionRate81.mmTaxableIncomePerDividendShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmTaxOnIncome
 * CorporateActionRate81.mmTaxOnIncome}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionRate81"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies rates related to a corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate2Rule#forCorporateActionRate81
 * ConstraintGrossDividendRate2Rule.forCorporateActionRate81}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forCorporateActionRate81
 * ConstraintGrossDividendRate3Rule.forCorporateActionRate81}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate1Rule#forCorporateActionRate81
 * ConstraintNetDividendRate1Rule.forCorporateActionRate81}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forCorporateActionRate81
 * ConstraintNetDividendRate2Rule.forCorporateActionRate81}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule#forCorporateActionRate81
 * ConstraintSecondLevelTax1Rule.forCorporateActionRate81}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate86
 * CorporateActionRate86}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67
 * CorporateActionRate67}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionRate81", propOrder = {"additionalTax", "grossDividendRate", "netDividendRate", "indexFactor", "interestRateUsedForPayment", "maximumAllowedOversubscriptionRate", "prorationRate", "withholdingTaxRate",
		"secondLevelTax", "taxableIncomePerDividendShare", "taxOnIncome"})
public class CorporateActionRate81 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlTax")
	protected RateAndAmountFormat37Choice additionalTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat37Choice
	 * RateAndAmountFormat37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81
	 * CorporateActionRate81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used for additional tax that cannot be categorised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::ATAX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmAdditionalTax
	 * CorporateActionRate86.mmAdditionalTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmAdditionalTax
	 * CorporateActionRate67.mmAdditionalTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate81, Optional<RateAndAmountFormat37Choice>> mmAdditionalTax = new MMMessageAssociationEnd<CorporateActionRate81, Optional<RateAndAmountFormat37Choice>>() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate81.mmObject();
			isDerived = false;
			xmlTag = "AddtlTax";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::ATAX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTax";
			definition = "Rate used for additional tax that cannot be categorised.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate86.mmAdditionalTax);
			previousVersion_lazy = () -> CorporateActionRate67.mmAdditionalTax;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat37Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat37Choice> getValue(CorporateActionRate81 obj) {
			return obj.getAdditionalTax();
		}

		@Override
		public void setValue(CorporateActionRate81 obj, Optional<RateAndAmountFormat37Choice> value) {
			obj.setAdditionalTax(value.orElse(null));
		}
	};
	@XmlElement(name = "GrssDvddRate")
	protected List<GrossDividendRateFormat19Choice> grossDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat19Choice
	 * GrossDividendRateFormat19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81
	 * CorporateActionRate81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssDvddRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash dividend amount per equity before deductions or allowances have been made."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::GRSS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmGrossDividendRate
	 * CorporateActionRate86.mmGrossDividendRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmGrossDividendRate
	 * CorporateActionRate67.mmGrossDividendRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate81, List<GrossDividendRateFormat19Choice>> mmGrossDividendRate = new MMMessageAssociationEnd<CorporateActionRate81, List<GrossDividendRateFormat19Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmGrossDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate81.mmObject();
			isDerived = false;
			xmlTag = "GrssDvddRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::GRSS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate86.mmGrossDividendRate);
			previousVersion_lazy = () -> CorporateActionRate67.mmGrossDividendRate;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GrossDividendRateFormat19Choice.mmObject();
		}

		@Override
		public List<GrossDividendRateFormat19Choice> getValue(CorporateActionRate81 obj) {
			return obj.getGrossDividendRate();
		}

		@Override
		public void setValue(CorporateActionRate81 obj, List<GrossDividendRateFormat19Choice> value) {
			obj.setGrossDividendRate(value);
		}
	};
	@XmlElement(name = "NetDvddRate")
	protected List<NetDividendRateFormat21Choice> netDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat21Choice
	 * NetDividendRateFormat21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
	 * Dividend.mmNetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81
	 * CorporateActionRate81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetDvddRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash dividend amount per equity after deductions or allowances have been made."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmNetDividendRate
	 * CorporateActionRate86.mmNetDividendRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmNetDividendRate
	 * CorporateActionRate67.mmNetDividendRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate81, List<NetDividendRateFormat21Choice>> mmNetDividendRate = new MMMessageAssociationEnd<CorporateActionRate81, List<NetDividendRateFormat21Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmNetDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate81.mmObject();
			isDerived = false;
			xmlTag = "NetDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate86.mmNetDividendRate);
			previousVersion_lazy = () -> CorporateActionRate67.mmNetDividendRate;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetDividendRateFormat21Choice.mmObject();
		}

		@Override
		public List<NetDividendRateFormat21Choice> getValue(CorporateActionRate81 obj) {
			return obj.getNetDividendRate();
		}

		@Override
		public void setValue(CorporateActionRate81 obj, List<NetDividendRateFormat21Choice> value) {
			obj.setNetDividendRate(value);
		}
	};
	@XmlElement(name = "IndxFctr")
	protected RateAndAmountFormat37Choice indexFactor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat37Choice
	 * RateAndAmountFormat37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexFactor
	 * Index.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81
	 * CorporateActionRate81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxFctr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Public index rate applied to the amount paid to adjust it to inflation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::INDX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmIndexFactor
	 * CorporateActionRate86.mmIndexFactor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmIndexFactor
	 * CorporateActionRate67.mmIndexFactor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate81, Optional<RateAndAmountFormat37Choice>> mmIndexFactor = new MMMessageAssociationEnd<CorporateActionRate81, Optional<RateAndAmountFormat37Choice>>() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate81.mmObject();
			isDerived = false;
			xmlTag = "IndxFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::INDX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexFactor";
			definition = "Public index rate applied to the amount paid to adjust it to inflation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate86.mmIndexFactor);
			previousVersion_lazy = () -> CorporateActionRate67.mmIndexFactor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat37Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat37Choice> getValue(CorporateActionRate81 obj) {
			return obj.getIndexFactor();
		}

		@Override
		public void setValue(CorporateActionRate81 obj, Optional<RateAndAmountFormat37Choice> value) {
			obj.setIndexFactor(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstRateUsdForPmt")
	protected List<InterestRateUsedForPaymentFormat8Choice> interestRateUsedForPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice
	 * InterestRateUsedForPaymentFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81
	 * CorporateActionRate81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRateUsdForPmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRateUsedForPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The actual interest rate used for the payment of the interest for the specified interest period. \nUsage guideline: It is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::INTP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmInterestRateUsedForPayment
	 * CorporateActionRate86.mmInterestRateUsedForPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmInterestRateUsedForPayment
	 * CorporateActionRate67.mmInterestRateUsedForPayment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate81, List<InterestRateUsedForPaymentFormat8Choice>> mmInterestRateUsedForPayment = new MMMessageAssociationEnd<CorporateActionRate81, List<InterestRateUsedForPaymentFormat8Choice>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate81.mmObject();
			isDerived = false;
			xmlTag = "IntrstRateUsdForPmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::INTP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRateUsedForPayment";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period. \nUsage guideline: It is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate86.mmInterestRateUsedForPayment);
			previousVersion_lazy = () -> CorporateActionRate67.mmInterestRateUsedForPayment;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestRateUsedForPaymentFormat8Choice.mmObject();
		}

		@Override
		public List<InterestRateUsedForPaymentFormat8Choice> getValue(CorporateActionRate81 obj) {
			return obj.getInterestRateUsedForPayment();
		}

		@Override
		public void setValue(CorporateActionRate81 obj, List<InterestRateUsedForPaymentFormat8Choice> value) {
			obj.setInterestRateUsedForPayment(value);
		}
	};
	@XmlElement(name = "MaxAllwdOvrsbcptRate")
	protected RateFormat3Choice maximumAllowedOversubscriptionRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumAllowedOverSubscription
	 * BiddingConditions.mmMaximumAllowedOverSubscription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81
	 * CorporateActionRate81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAllwdOvrsbcptRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAllowedOversubscriptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, for example, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50 percent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::OVEP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate86.mmMaximumAllowedOversubscriptionRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate67.mmMaximumAllowedOversubscriptionRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate81, Optional<RateFormat3Choice>> mmMaximumAllowedOversubscriptionRate = new MMMessageAssociationEnd<CorporateActionRate81, Optional<RateFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMaximumAllowedOverSubscription;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate81.mmObject();
			isDerived = false;
			xmlTag = "MaxAllwdOvrsbcptRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::OVEP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAllowedOversubscriptionRate";
			definition = "Maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, for example, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50 percent.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate86.mmMaximumAllowedOversubscriptionRate);
			previousVersion_lazy = () -> CorporateActionRate67.mmMaximumAllowedOversubscriptionRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}

		@Override
		public Optional<RateFormat3Choice> getValue(CorporateActionRate81 obj) {
			return obj.getMaximumAllowedOversubscriptionRate();
		}

		@Override
		public void setValue(CorporateActionRate81 obj, Optional<RateFormat3Choice> value) {
			obj.setMaximumAllowedOversubscriptionRate(value.orElse(null));
		}
	};
	@XmlElement(name = "PrratnRate")
	protected RateFormat3Choice prorationRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProrationRate
	 * BiddingConditions.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81
	 * CorporateActionRate81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrratnRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProrationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of securities accepted by the offeror/issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::PROR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmProrationRate
	 * CorporateActionRate86.mmProrationRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmProrationRate
	 * CorporateActionRate67.mmProrationRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate81, Optional<RateFormat3Choice>> mmProrationRate = new MMMessageAssociationEnd<CorporateActionRate81, Optional<RateFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmProrationRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate81.mmObject();
			isDerived = false;
			xmlTag = "PrratnRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::PROR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProrationRate";
			definition = "Percentage of securities accepted by the offeror/issuer.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate86.mmProrationRate);
			previousVersion_lazy = () -> CorporateActionRate67.mmProrationRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}

		@Override
		public Optional<RateFormat3Choice> getValue(CorporateActionRate81 obj) {
			return obj.getProrationRate();
		}

		@Override
		public void setValue(CorporateActionRate81 obj, Optional<RateFormat3Choice> value) {
			obj.setProrationRate(value.orElse(null));
		}
	};
	@XmlElement(name = "WhldgTaxRate")
	protected List<RateAndAmountFormat41Choice> withholdingTaxRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat41Choice
	 * RateAndAmountFormat41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81
	 * CorporateActionRate81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTaxRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of a cash distribution that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::TAXR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmWithholdingTaxRate
	 * CorporateActionRate86.mmWithholdingTaxRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmWithholdingTaxRate
	 * CorporateActionRate67.mmWithholdingTaxRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate81, List<RateAndAmountFormat41Choice>> mmWithholdingTaxRate = new MMMessageAssociationEnd<CorporateActionRate81, List<RateAndAmountFormat41Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate81.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::TAXR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate";
			definition = "Percentage of a cash distribution that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate86.mmWithholdingTaxRate);
			previousVersion_lazy = () -> CorporateActionRate67.mmWithholdingTaxRate;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat41Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat41Choice> getValue(CorporateActionRate81 obj) {
			return obj.getWithholdingTaxRate();
		}

		@Override
		public void setValue(CorporateActionRate81 obj, List<RateAndAmountFormat41Choice> value) {
			obj.setWithholdingTaxRate(value);
		}
	};
	@XmlElement(name = "ScndLvlTax")
	protected List<RateAndAmountFormat41Choice> secondLevelTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat41Choice
	 * RateAndAmountFormat41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81
	 * CorporateActionRate81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndLvlTax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which the income will be withheld by a jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible. It is levied in complement or offset of the withholding tax rate (TAXR) levied by the jurisdiction of the issuer’s tax domicile."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmSecondLevelTax
	 * CorporateActionRate86.mmSecondLevelTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmSecondLevelTax
	 * CorporateActionRate67.mmSecondLevelTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate81, List<RateAndAmountFormat41Choice>> mmSecondLevelTax = new MMMessageAssociationEnd<CorporateActionRate81, List<RateAndAmountFormat41Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate81.mmObject();
			isDerived = false;
			xmlTag = "ScndLvlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax";
			definition = "Rate at which the income will be withheld by a jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible. It is levied in complement or offset of the withholding tax rate (TAXR) levied by the jurisdiction of the issuer’s tax domicile.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate86.mmSecondLevelTax);
			previousVersion_lazy = () -> CorporateActionRate67.mmSecondLevelTax;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat41Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat41Choice> getValue(CorporateActionRate81 obj) {
			return obj.getSecondLevelTax();
		}

		@Override
		public void setValue(CorporateActionRate81 obj, List<RateAndAmountFormat41Choice> value) {
			obj.setSecondLevelTax(value);
		}
	};
	@XmlElement(name = "TaxblIncmPerDvddShr")
	protected List<RateTypeAndAmountAndStatus26> taxableIncomePerDividendShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26
	 * RateTypeAndAmountAndStatus26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividendShare
	 * SecuritiesTax.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81
	 * CorporateActionRate81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerDvddShr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerDividendShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments, for example, in the context of the EU Savings directive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmTaxableIncomePerDividendShare
	 * CorporateActionRate86.mmTaxableIncomePerDividendShare}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmTaxableIncomePerDividendShare
	 * CorporateActionRate67.mmTaxableIncomePerDividendShare}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate81, List<RateTypeAndAmountAndStatus26>> mmTaxableIncomePerDividendShare = new MMMessageAssociationEnd<CorporateActionRate81, List<RateTypeAndAmountAndStatus26>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerDividendShare;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate81.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerDvddShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerDividendShare";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments, for example, in the context of the EU Savings directive.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate86.mmTaxableIncomePerDividendShare);
			previousVersion_lazy = () -> CorporateActionRate67.mmTaxableIncomePerDividendShare;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateTypeAndAmountAndStatus26.mmObject();
		}

		@Override
		public List<RateTypeAndAmountAndStatus26> getValue(CorporateActionRate81 obj) {
			return obj.getTaxableIncomePerDividendShare();
		}

		@Override
		public void setValue(CorporateActionRate81 obj, List<RateTypeAndAmountAndStatus26> value) {
			obj.setTaxableIncomePerDividendShare(value);
		}
	};
	@XmlElement(name = "TaxOnIncm")
	protected RateAndAmountFormat37Choice taxOnIncome;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat37Choice
	 * RateAndAmountFormat37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81
	 * CorporateActionRate81}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxOnIncm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Overall tax withheld at source by fund managers prior to considering the tax obligation of each unit holder."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmTaxOnIncome
	 * CorporateActionRate86.mmTaxOnIncome}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmTaxOnIncome
	 * CorporateActionRate67.mmTaxOnIncome}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionRate81, Optional<RateAndAmountFormat37Choice>> mmTaxOnIncome = new MMMessageAssociationEnd<CorporateActionRate81, Optional<RateAndAmountFormat37Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate81.mmObject();
			isDerived = false;
			xmlTag = "TaxOnIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnIncome";
			definition = "Overall tax withheld at source by fund managers prior to considering the tax obligation of each unit holder.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionRate86.mmTaxOnIncome);
			previousVersion_lazy = () -> CorporateActionRate67.mmTaxOnIncome;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat37Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat37Choice> getValue(CorporateActionRate81 obj) {
			return obj.getTaxOnIncome();
		}

		@Override
		public void setValue(CorporateActionRate81 obj, Optional<RateAndAmountFormat37Choice> value) {
			obj.setTaxOnIncome(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate81.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate81.mmGrossDividendRate,
						com.tools20022.repository.msg.CorporateActionRate81.mmNetDividendRate, com.tools20022.repository.msg.CorporateActionRate81.mmIndexFactor,
						com.tools20022.repository.msg.CorporateActionRate81.mmInterestRateUsedForPayment, com.tools20022.repository.msg.CorporateActionRate81.mmMaximumAllowedOversubscriptionRate,
						com.tools20022.repository.msg.CorporateActionRate81.mmProrationRate, com.tools20022.repository.msg.CorporateActionRate81.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate81.mmSecondLevelTax,
						com.tools20022.repository.msg.CorporateActionRate81.mmTaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate81.mmTaxOnIncome);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate2Rule.forCorporateActionRate81,
						com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forCorporateActionRate81, com.tools20022.repository.constraints.ConstraintNetDividendRate1Rule.forCorporateActionRate81,
						com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forCorporateActionRate81, com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule.forCorporateActionRate81);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRate81";
				definition = "Specifies rates related to a corporate action option.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionRate86.mmObject());
				previousVersion_lazy = () -> CorporateActionRate67.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RateAndAmountFormat37Choice> getAdditionalTax() {
		return additionalTax == null ? Optional.empty() : Optional.of(additionalTax);
	}

	public CorporateActionRate81 setAdditionalTax(RateAndAmountFormat37Choice additionalTax) {
		this.additionalTax = additionalTax;
		return this;
	}

	public List<GrossDividendRateFormat19Choice> getGrossDividendRate() {
		return grossDividendRate == null ? grossDividendRate = new ArrayList<>() : grossDividendRate;
	}

	public CorporateActionRate81 setGrossDividendRate(List<GrossDividendRateFormat19Choice> grossDividendRate) {
		this.grossDividendRate = Objects.requireNonNull(grossDividendRate);
		return this;
	}

	public List<NetDividendRateFormat21Choice> getNetDividendRate() {
		return netDividendRate == null ? netDividendRate = new ArrayList<>() : netDividendRate;
	}

	public CorporateActionRate81 setNetDividendRate(List<NetDividendRateFormat21Choice> netDividendRate) {
		this.netDividendRate = Objects.requireNonNull(netDividendRate);
		return this;
	}

	public Optional<RateAndAmountFormat37Choice> getIndexFactor() {
		return indexFactor == null ? Optional.empty() : Optional.of(indexFactor);
	}

	public CorporateActionRate81 setIndexFactor(RateAndAmountFormat37Choice indexFactor) {
		this.indexFactor = indexFactor;
		return this;
	}

	public List<InterestRateUsedForPaymentFormat8Choice> getInterestRateUsedForPayment() {
		return interestRateUsedForPayment == null ? interestRateUsedForPayment = new ArrayList<>() : interestRateUsedForPayment;
	}

	public CorporateActionRate81 setInterestRateUsedForPayment(List<InterestRateUsedForPaymentFormat8Choice> interestRateUsedForPayment) {
		this.interestRateUsedForPayment = Objects.requireNonNull(interestRateUsedForPayment);
		return this;
	}

	public Optional<RateFormat3Choice> getMaximumAllowedOversubscriptionRate() {
		return maximumAllowedOversubscriptionRate == null ? Optional.empty() : Optional.of(maximumAllowedOversubscriptionRate);
	}

	public CorporateActionRate81 setMaximumAllowedOversubscriptionRate(RateFormat3Choice maximumAllowedOversubscriptionRate) {
		this.maximumAllowedOversubscriptionRate = maximumAllowedOversubscriptionRate;
		return this;
	}

	public Optional<RateFormat3Choice> getProrationRate() {
		return prorationRate == null ? Optional.empty() : Optional.of(prorationRate);
	}

	public CorporateActionRate81 setProrationRate(RateFormat3Choice prorationRate) {
		this.prorationRate = prorationRate;
		return this;
	}

	public List<RateAndAmountFormat41Choice> getWithholdingTaxRate() {
		return withholdingTaxRate == null ? withholdingTaxRate = new ArrayList<>() : withholdingTaxRate;
	}

	public CorporateActionRate81 setWithholdingTaxRate(List<RateAndAmountFormat41Choice> withholdingTaxRate) {
		this.withholdingTaxRate = Objects.requireNonNull(withholdingTaxRate);
		return this;
	}

	public List<RateAndAmountFormat41Choice> getSecondLevelTax() {
		return secondLevelTax == null ? secondLevelTax = new ArrayList<>() : secondLevelTax;
	}

	public CorporateActionRate81 setSecondLevelTax(List<RateAndAmountFormat41Choice> secondLevelTax) {
		this.secondLevelTax = Objects.requireNonNull(secondLevelTax);
		return this;
	}

	public List<RateTypeAndAmountAndStatus26> getTaxableIncomePerDividendShare() {
		return taxableIncomePerDividendShare == null ? taxableIncomePerDividendShare = new ArrayList<>() : taxableIncomePerDividendShare;
	}

	public CorporateActionRate81 setTaxableIncomePerDividendShare(List<RateTypeAndAmountAndStatus26> taxableIncomePerDividendShare) {
		this.taxableIncomePerDividendShare = Objects.requireNonNull(taxableIncomePerDividendShare);
		return this;
	}

	public Optional<RateAndAmountFormat37Choice> getTaxOnIncome() {
		return taxOnIncome == null ? Optional.empty() : Optional.of(taxOnIncome);
	}

	public CorporateActionRate81 setTaxOnIncome(RateAndAmountFormat37Choice taxOnIncome) {
		this.taxOnIncome = taxOnIncome;
		return this;
	}
}