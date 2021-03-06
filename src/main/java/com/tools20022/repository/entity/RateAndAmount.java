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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.OperatorCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the value expressed as a rate or an amount. For example, the value
 * of a tax or a commission.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RateAndAmount" src="doc-files/RateAndAmount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmFinalDividendParameters
 * RateAndAmount.mmFinalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmFullyFrankedRateAndAmountDividendParameters
 * RateAndAmount.mmFullyFrankedRateAndAmountDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmGrossDividendParameters
 * RateAndAmount.mmGrossDividendParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#mmAmount
 * RateAndAmount.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#mmIndex
 * RateAndAmount.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmNetDividendParameters
 * RateAndAmount.mmNetDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmMaximumAllowedBiddingConditions
 * RateAndAmount.mmMaximumAllowedBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmProvisionalDividendParameters
 * RateAndAmount.mmProvisionalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmSolicitationFeeCorporateActionParameters
 * RateAndAmount.mmSolicitationFeeCorporateActionParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#mmRate
 * RateAndAmount.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmRateBiddingConditions
 * RateAndAmount.mmRateBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmSecuritiesTax
 * RateAndAmount.mmSecuritiesTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmEarlySolicitationFeeCorporateActionParameters
 * RateAndAmount.mmEarlySolicitationFeeCorporateActionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmInterestRelatedIssuance
 * RateAndAmount.mmInterestRelatedIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmLossRelatedIssuance
 * RateAndAmount.mmLossRelatedIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmAbsoluteValue
 * RateAndAmount.mmAbsoluteValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#mmOperator
 * RateAndAmount.mmOperator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmRelatedYieldCalculation
 * RateAndAmount.mmRelatedYieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmConduitForeignIncomeAmountDividendParameters
 * RateAndAmount.mmConduitForeignIncomeAmountDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmDeemedAmountDividendParameters
 * RateAndAmount.mmDeemedAmountDividendParameters}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmFinalDividend
 * Dividend.mmFinalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmFullyFrankedRateAndAmount
 * Dividend.mmFullyFrankedRateAndAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
 * Dividend.mmGrossDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
 * Dividend.mmNetDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmProvisionalDividend
 * Dividend.mmProvisionalDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmDeemedAmount
 * Dividend.mmDeemedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmConduitForeignIncomeAmount
 * Dividend.mmConduitForeignIncomeAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmRelatedTax
 * SecuritiesTax.mmRelatedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#mmInterestShortfall
 * Issuance.mmInterestShortfall}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmRealisedLoss
 * Issuance.mmRealisedLoss}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmIndexFactor
 * Index.mmIndexFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumAllowedOverSubscription
 * BiddingConditions.mmMaximumAllowedOverSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmApplicableRate
 * BiddingConditions.mmApplicableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmEarlySolicitationFeeRate
 * CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmYieldRange
 * YieldCalculation.mmYieldRange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FromToPercentageRange1#mmFrom
 * FromToPercentageRange1.mmFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FromToPercentageRange1#mmTo
 * FromToPercentageRange1.mmTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat19Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat19Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndRateStatus1#mmRateStatus
 * AmountAndRateStatus1.mmRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat21Choice#mmAmountAndRateStatus
 * NetDividendRateFormat21Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat23Choice#mmAmountAndRateStatus
 * NetDividendRateFormat23Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat21Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat21Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat22Choice#mmAmountAndRateStatus
 * NetDividendRateFormat22Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat20Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat20Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat24Choice#mmAmountAndRateStatus
 * NetDividendRateFormat24Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat22Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat22Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat28Choice#mmAmountAndRateStatus
 * NetDividendRateFormat28Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat26Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat26Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat25Choice#mmAmountAndRateStatus
 * NetDividendRateFormat25Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat23Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat23Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat24Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat24Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat26Choice#mmAmountAndRateStatus
 * NetDividendRateFormat26Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat27Choice#mmAmountAndRateStatus
 * NetDividendRateFormat27Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat25Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat25Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndRateStatus2#mmRateStatus
 * AmountAndRateStatus2.mmRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat27Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat27Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat29Choice#mmAmountAndRateStatus
 * NetDividendRateFormat29Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat32Choice#mmAmountAndRateStatus
 * NetDividendRateFormat32Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat29Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat29Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat30Choice#mmAmountAndRateStatus
 * NetDividendRateFormat30Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat28Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat28Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat31Choice#mmAmountAndRateStatus
 * NetDividendRateFormat31Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat30Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat30Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat31Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat31Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat33Choice#mmAmountAndRateStatus
 * NetDividendRateFormat33Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat32Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat32Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat34Choice#mmAmountAndRateStatus
 * NetDividendRateFormat34Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat33Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat33Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat35Choice#mmAmountAndRateStatus
 * NetDividendRateFormat35Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat34Choice#mmAmountAndRateStatus
 * GrossDividendRateFormat34Choice.mmAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat36Choice#mmAmountAndRateStatus
 * NetDividendRateFormat36Choice.mmAmountAndRateStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PercentageRangeBoundary1
 * PercentageRangeBoundary1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FromToPercentageRange1
 * FromToPercentageRange1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat12Choice
 * RateAndAmountFormat12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat13Choice
 * RateAndAmountFormat13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat5Choice
 * RateAndAmountFormat5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat2Choice
 * TaxCreditRateFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat6Choice
 * RateAndAmountFormat6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat3Choice
 * TaxCreditRateFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat18Choice
 * RateAndAmountFormat18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat3Choice
 * RateFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat2Choice
 * RateFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat1Choice
 * TaxCreditRateFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat1Choice
 * SolicitationFeeRateFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat4Choice
 * TaxCreditRateFormat4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat2Choice
 * SolicitationFeeRateFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat6Choice
 * RateFormat6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat3Choice
 * SolicitationFeeRateFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat5Choice
 * TaxCreditRateFormat5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat4Choice
 * SolicitationFeeRateFormat4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat6Choice
 * TaxCreditRateFormat6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice
 * SolicitationFeeRateFormat5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat8Choice
 * RateFormat8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat6Choice
 * SolicitationFeeRateFormat6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat9Choice
 * RateFormat9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat5Choice
 * RateFormat5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat7Choice
 * RateFormat7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateOrAbsoluteValue1Choice
 * RateOrAbsoluteValue1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat1Choice
 * RateFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RelatedTaxType1
 * RelatedTaxType1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat10Choice
 * RateFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat12Choice
 * RateFormat12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat11Choice
 * RateFormat11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat14Choice
 * RateFormat14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat17Choice
 * RateFormat17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat36Choice
 * RateAndAmountFormat36Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat7Choice
 * TaxCreditRateFormat7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat39Choice
 * RateAndAmountFormat39Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat7Choice
 * SolicitationFeeRateFormat7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat8Choice
 * TaxCreditRateFormat8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat20Choice
 * RateFormat20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndRateStatus1
 * AmountAndRateStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice
 * SolicitationFeeRateFormat8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat21Choice
 * RateFormat21Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat10Choice
 * SolicitationFeeRateFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat10Choice
 * TaxCreditRateFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat43Choice
 * RateAndAmountFormat43Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat9Choice
 * TaxCreditRateFormat9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat9Choice
 * SolicitationFeeRateFormat9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndRateStatus2
 * AmountAndRateStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalAmountDetails1
 * OriginalAmountDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndDirection86
 * AmountAndDirection86}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat22Choice
 * RateFormat22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat23Choice
 * RateFormat23Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RateAndAmount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the value expressed as a rate or an amount. For example, the value of a tax or a commission."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class RateAndAmount {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Dividend finalDividendParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmFinalDividend
	 * Dividend.mmFinalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a final dividend rate is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Dividend> mmFinalDividendParameters = new MMBusinessAssociationEnd<RateAndAmount, Dividend>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalDividendParameters";
			definition = "Dividend information for which a final dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Dividend.mmFinalDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Dividend getValue(RateAndAmount obj) {
			return obj.getFinalDividendParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, Dividend value) {
			obj.setFinalDividendParameters(value);
		}
	};
	protected Dividend fullyFrankedRateAndAmountDividendParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmFullyFrankedRateAndAmount
	 * Dividend.mmFullyFrankedRateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFrankedRateAndAmountDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a fully franked rate and amount is specified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Optional<Dividend>> mmFullyFrankedRateAndAmountDividendParameters = new MMBusinessAssociationEnd<RateAndAmount, Optional<Dividend>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FullyFrankedRateAndAmountDividendParameters";
			definition = "Dividend information for which a fully franked rate and amount is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Dividend.mmFullyFrankedRateAndAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Optional<Dividend> getValue(RateAndAmount obj) {
			return obj.getFullyFrankedRateAndAmountDividendParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, Optional<Dividend> value) {
			obj.setFullyFrankedRateAndAmountDividendParameters(value.orElse(null));
		}
	};
	protected Dividend grossDividendParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a gross dividend rate is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Dividend> mmGrossDividendParameters = new MMBusinessAssociationEnd<RateAndAmount, Dividend>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossDividendParameters";
			definition = "Dividend information for which a gross dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Dividend.mmGrossDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Dividend getValue(RateAndAmount obj) {
			return obj.getGrossDividendParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, Dividend value) {
			obj.setGrossDividendParameters(value);
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat5Choice#mmAmount
	 * RateAndAmountFormat5Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat2Choice#mmAmount
	 * GrossDividendRateFormat2Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat2Choice#mmAmount
	 * TaxCreditRateFormat2Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmFullyFrankedAmount
	 * CorporateActionAmounts2.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat6Choice#mmAmount
	 * RateAndAmountFormat6Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat3Choice#mmAmount
	 * GrossDividendRateFormat3Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat3Choice#mmAmount
	 * TaxCreditRateFormat3Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmFullyFrankedAmount
	 * CorporateActionAmounts5.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmFullyFrankedAmount
	 * CorporateActionAmounts11.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmFullyFrankedAmount
	 * CorporateActionAmounts12.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmFullyFrankedAmount
	 * CorporateActionAmounts17.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmFullyFrankedAmount
	 * CorporateActionAmounts20.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat10Choice#mmAmount
	 * GrossDividendRateFormat10Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmFullyFrankedAmount
	 * CorporateActionAmounts23.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat8Choice#mmAmount
	 * GrossDividendRateFormat8Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat11Choice#mmAmount
	 * GrossDividendRateFormat11Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmFullyFrankedAmount
	 * CorporateActionAmounts24.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat12Choice#mmAmount
	 * GrossDividendRateFormat12Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat18Choice#mmAmount
	 * RateAndAmountFormat18Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat1Choice#mmAmount
	 * GrossDividendRateFormat1Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat1Choice#mmAmount
	 * TaxCreditRateFormat1Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmFullyFrankedAmount
	 * CorporateActionAmounts3.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat4Choice#mmAmount
	 * GrossDividendRateFormat4Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat4Choice#mmAmount
	 * TaxCreditRateFormat4Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmFullyFrankedAmount
	 * CorporateActionAmounts6.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat5Choice#mmAmount
	 * GrossDividendRateFormat5Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmFullyFrankedAmount
	 * CorporateActionAmounts9.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat5Choice#mmAmount
	 * TaxCreditRateFormat5Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat6Choice#mmAmount
	 * GrossDividendRateFormat6Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmFullyFrankedAmount
	 * CorporateActionAmounts13.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat6Choice#mmAmount
	 * TaxCreditRateFormat6Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmFullyFrankedAmount
	 * CorporateActionAmounts16.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmFullyFrankedAmount
	 * CorporateActionAmounts19.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat9Choice#mmAmount
	 * GrossDividendRateFormat9Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmFullyFrankedAmount
	 * CorporateActionAmounts22.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat7Choice#mmAmount
	 * GrossDividendRateFormat7Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice#mmAmount
	 * SolicitationFeeRateFormat5Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat8Choice#mmAmount
	 * RateFormat8Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat13Choice#mmAmount
	 * GrossDividendRateFormat13Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmFullyFrankedAmount
	 * CorporateActionAmounts25.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat14Choice#mmAmount
	 * GrossDividendRateFormat14Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat6Choice#mmAmount
	 * SolicitationFeeRateFormat6Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat9Choice#mmAmount
	 * RateFormat9Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmFullyFrankedAmount
	 * CorporateActionAmounts4.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmFullyFrankedAmount
	 * CorporateActionAmounts7.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmFullyFrankedAmount
	 * CorporateActionAmounts10.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmFullyFrankedAmount
	 * CorporateActionAmounts14.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmFullyFrankedAmount
	 * CorporateActionAmounts15.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmFullyFrankedAmount
	 * CorporateActionAmounts18.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmFullyFrankedAmount
	 * CorporateActionAmounts21.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmFullyFrankedAmount
	 * CorporateActionAmounts26.mmFullyFrankedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RelatedTaxType1#mmAmount
	 * RelatedTaxType1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GrossDividendRate2#mmAmount
	 * GrossDividendRate2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmFullyFrankedAmount
	 * CorporateActionAmounts1.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmFullyFrankedAmount
	 * CorporateActionAmounts29.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmFullyFrankedAmount
	 * CorporateActionAmounts27.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmFullyFrankedAmount
	 * CorporateActionAmounts28.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmFullyFrankedAmount
	 * CorporateActionAmounts33.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmFullyFrankedAmount
	 * CorporateActionAmounts32.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmFullyFrankedAmount
	 * CorporateActionAmounts35.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat36Choice#mmAmount
	 * RateAndAmountFormat36Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat7Choice#mmAmount
	 * TaxCreditRateFormat7Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat39Choice#mmAmount
	 * RateAndAmountFormat39Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmFullyFrankedAmount
	 * CorporateActionAmounts37.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat7Choice#mmAmount
	 * SolicitationFeeRateFormat7Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat8Choice#mmAmount
	 * TaxCreditRateFormat8Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmFullyFrankedAmount
	 * CorporateActionAmounts36.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat20Choice#mmAmount
	 * RateFormat20Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat19Choice#mmAmount
	 * GrossDividendRateFormat19Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndRateStatus1#mmAmount
	 * AmountAndRateStatus1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat21Choice#mmAmount
	 * GrossDividendRateFormat21Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat20Choice#mmAmount
	 * GrossDividendRateFormat20Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat22Choice#mmAmount
	 * GrossDividendRateFormat22Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice#mmAmount
	 * SolicitationFeeRateFormat8Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmFullyFrankedAmount
	 * CorporateActionAmounts38.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmFullyFrankedAmount
	 * CorporateActionAmounts39.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat21Choice#mmAmount
	 * RateFormat21Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmFullyFrankedAmount
	 * CorporateActionAmounts41.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat10Choice#mmAmount
	 * SolicitationFeeRateFormat10Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmFullyFrankedAmount
	 * CorporateActionAmounts40.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat10Choice#mmAmount
	 * TaxCreditRateFormat10Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat43Choice#mmAmount
	 * RateAndAmountFormat43Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat26Choice#mmAmount
	 * GrossDividendRateFormat26Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat23Choice#mmAmount
	 * GrossDividendRateFormat23Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat24Choice#mmAmount
	 * GrossDividendRateFormat24Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat9Choice#mmAmount
	 * TaxCreditRateFormat9Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat9Choice#mmAmount
	 * SolicitationFeeRateFormat9Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat25Choice#mmAmount
	 * GrossDividendRateFormat25Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndRateStatus2#mmAmount
	 * AmountAndRateStatus2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAmountDetails1#mmActualAmount
	 * OriginalAmountDetails1.mmActualAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAmountDetails1#mmMinimumAmount
	 * OriginalAmountDetails1.mmMinimumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAmountDetails1#mmMaximumAmount
	 * OriginalAmountDetails1.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection86#mmAmount
	 * AmountAndDirection86.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmFullyFrankedAmount
	 * CorporateActionAmounts42.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmFullyFrankedAmount
	 * CorporateActionAmounts43.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat27Choice#mmAmount
	 * GrossDividendRateFormat27Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat22Choice#mmAmount
	 * RateFormat22Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat29Choice#mmAmount
	 * GrossDividendRateFormat29Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat28Choice#mmAmount
	 * GrossDividendRateFormat28Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmFullyFrankedAmount
	 * CorporateActionAmounts44.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat30Choice#mmAmount
	 * GrossDividendRateFormat30Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat31Choice#mmAmount
	 * GrossDividendRateFormat31Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat23Choice#mmAmount
	 * RateFormat23Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmFullyFrankedAmount
	 * CorporateActionAmounts45.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat32Choice#mmAmount
	 * GrossDividendRateFormat32Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat33Choice#mmAmount
	 * GrossDividendRateFormat33Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmFullyFrankedAmount
	 * CorporateActionAmounts46.mmFullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat34Choice#mmAmount
	 * GrossDividendRateFormat34Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmFullyFrankedAmount
	 * CorporateActionAmounts47.mmFullyFrankedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value expressed as an amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RateAndAmount, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<RateAndAmount, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(RateAndAmountFormat5Choice.mmAmount, GrossDividendRateFormat2Choice.mmAmount, TaxCreditRateFormat2Choice.mmAmount, CorporateActionAmounts2.mmFullyFrankedAmount,
					RateAndAmountFormat6Choice.mmAmount, GrossDividendRateFormat3Choice.mmAmount, TaxCreditRateFormat3Choice.mmAmount, CorporateActionAmounts5.mmFullyFrankedAmount, CorporateActionAmounts11.mmFullyFrankedAmount,
					CorporateActionAmounts12.mmFullyFrankedAmount, CorporateActionAmounts17.mmFullyFrankedAmount, CorporateActionAmounts20.mmFullyFrankedAmount, GrossDividendRateFormat10Choice.mmAmount,
					CorporateActionAmounts23.mmFullyFrankedAmount, GrossDividendRateFormat8Choice.mmAmount, GrossDividendRateFormat11Choice.mmAmount, CorporateActionAmounts24.mmFullyFrankedAmount, GrossDividendRateFormat12Choice.mmAmount,
					RateAndAmountFormat18Choice.mmAmount, GrossDividendRateFormat1Choice.mmAmount, TaxCreditRateFormat1Choice.mmAmount, CorporateActionAmounts3.mmFullyFrankedAmount, GrossDividendRateFormat4Choice.mmAmount,
					TaxCreditRateFormat4Choice.mmAmount, CorporateActionAmounts6.mmFullyFrankedAmount, GrossDividendRateFormat5Choice.mmAmount, CorporateActionAmounts9.mmFullyFrankedAmount, TaxCreditRateFormat5Choice.mmAmount,
					GrossDividendRateFormat6Choice.mmAmount, CorporateActionAmounts13.mmFullyFrankedAmount, TaxCreditRateFormat6Choice.mmAmount, CorporateActionAmounts16.mmFullyFrankedAmount, CorporateActionAmounts19.mmFullyFrankedAmount,
					GrossDividendRateFormat9Choice.mmAmount, CorporateActionAmounts22.mmFullyFrankedAmount, GrossDividendRateFormat7Choice.mmAmount, SolicitationFeeRateFormat5Choice.mmAmount, RateFormat8Choice.mmAmount,
					GrossDividendRateFormat13Choice.mmAmount, CorporateActionAmounts25.mmFullyFrankedAmount, GrossDividendRateFormat14Choice.mmAmount, SolicitationFeeRateFormat6Choice.mmAmount, RateFormat9Choice.mmAmount,
					CorporateActionAmounts4.mmFullyFrankedAmount, CorporateActionAmounts7.mmFullyFrankedAmount, CorporateActionAmounts10.mmFullyFrankedAmount, CorporateActionAmounts14.mmFullyFrankedAmount,
					CorporateActionAmounts15.mmFullyFrankedAmount, CorporateActionAmounts18.mmFullyFrankedAmount, CorporateActionAmounts21.mmFullyFrankedAmount, CorporateActionAmounts26.mmFullyFrankedAmount, RelatedTaxType1.mmAmount,
					GrossDividendRate2.mmAmount, CorporateActionAmounts1.mmFullyFrankedAmount, CorporateActionAmounts29.mmFullyFrankedAmount, CorporateActionAmounts27.mmFullyFrankedAmount, CorporateActionAmounts28.mmFullyFrankedAmount,
					CorporateActionAmounts33.mmFullyFrankedAmount, CorporateActionAmounts32.mmFullyFrankedAmount, CorporateActionAmounts35.mmFullyFrankedAmount, RateAndAmountFormat36Choice.mmAmount, TaxCreditRateFormat7Choice.mmAmount,
					RateAndAmountFormat39Choice.mmAmount, CorporateActionAmounts37.mmFullyFrankedAmount, SolicitationFeeRateFormat7Choice.mmAmount, TaxCreditRateFormat8Choice.mmAmount, CorporateActionAmounts36.mmFullyFrankedAmount,
					RateFormat20Choice.mmAmount, GrossDividendRateFormat19Choice.mmAmount, AmountAndRateStatus1.mmAmount, GrossDividendRateFormat21Choice.mmAmount, GrossDividendRateFormat20Choice.mmAmount,
					GrossDividendRateFormat22Choice.mmAmount, SolicitationFeeRateFormat8Choice.mmAmount, CorporateActionAmounts38.mmFullyFrankedAmount, CorporateActionAmounts39.mmFullyFrankedAmount, RateFormat21Choice.mmAmount,
					CorporateActionAmounts41.mmFullyFrankedAmount, SolicitationFeeRateFormat10Choice.mmAmount, CorporateActionAmounts40.mmFullyFrankedAmount, TaxCreditRateFormat10Choice.mmAmount, RateAndAmountFormat43Choice.mmAmount,
					GrossDividendRateFormat26Choice.mmAmount, GrossDividendRateFormat23Choice.mmAmount, GrossDividendRateFormat24Choice.mmAmount, TaxCreditRateFormat9Choice.mmAmount, SolicitationFeeRateFormat9Choice.mmAmount,
					GrossDividendRateFormat25Choice.mmAmount, AmountAndRateStatus2.mmAmount, OriginalAmountDetails1.mmActualAmount, OriginalAmountDetails1.mmMinimumAmount, OriginalAmountDetails1.mmMaximumAmount,
					AmountAndDirection86.mmAmount, CorporateActionAmounts42.mmFullyFrankedAmount, CorporateActionAmounts43.mmFullyFrankedAmount, GrossDividendRateFormat27Choice.mmAmount, RateFormat22Choice.mmAmount,
					GrossDividendRateFormat29Choice.mmAmount, GrossDividendRateFormat28Choice.mmAmount, CorporateActionAmounts44.mmFullyFrankedAmount, GrossDividendRateFormat30Choice.mmAmount, GrossDividendRateFormat31Choice.mmAmount,
					RateFormat23Choice.mmAmount, CorporateActionAmounts45.mmFullyFrankedAmount, GrossDividendRateFormat32Choice.mmAmount, GrossDividendRateFormat33Choice.mmAmount, CorporateActionAmounts46.mmFullyFrankedAmount,
					GrossDividendRateFormat34Choice.mmAmount, CorporateActionAmounts47.mmFullyFrankedAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Value expressed as an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(RateAndAmount obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(RateAndAmount obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected Index index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Index Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexFactor
	 * Index.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Index for which a factor is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Index> mmIndex = new MMBusinessAssociationEnd<RateAndAmount, Index>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Index for which a factor is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Index.mmIndexFactor;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Index.mmObject();
		}

		@Override
		public Index getValue(RateAndAmount obj) {
			return obj.getIndex();
		}

		@Override
		public void setValue(RateAndAmount obj, Index value) {
			obj.setIndex(value);
		}
	};
	protected Dividend netDividendParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
	 * Dividend.mmNetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a net dividend rate is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Dividend> mmNetDividendParameters = new MMBusinessAssociationEnd<RateAndAmount, Dividend>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetDividendParameters";
			definition = "Dividend information for which a net dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Dividend.mmNetDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Dividend getValue(RateAndAmount obj) {
			return obj.getNetDividendParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, Dividend value) {
			obj.setNetDividendParameters(value);
		}
	};
	protected BiddingConditions maximumAllowedBiddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumAllowedOverSubscription
	 * BiddingConditions.mmMaximumAllowedOverSubscription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAllowedBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a maximum amount is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, BiddingConditions> mmMaximumAllowedBiddingConditions = new MMBusinessAssociationEnd<RateAndAmount, BiddingConditions>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumAllowedBiddingConditions";
			definition = "Bidding conditions for which a maximum amount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> BiddingConditions.mmMaximumAllowedOverSubscription;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}

		@Override
		public BiddingConditions getValue(RateAndAmount obj) {
			return obj.getMaximumAllowedBiddingConditions();
		}

		@Override
		public void setValue(RateAndAmount obj, BiddingConditions value) {
			obj.setMaximumAllowedBiddingConditions(value);
		}
	};
	protected Dividend provisionalDividendParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmProvisionalDividend
	 * Dividend.mmProvisionalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProvisionalDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a provisional dividend rate is specified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Dividend> mmProvisionalDividendParameters = new MMBusinessAssociationEnd<RateAndAmount, Dividend>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProvisionalDividendParameters";
			definition = "Dividend information for which a provisional dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Dividend.mmProvisionalDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Dividend getValue(RateAndAmount obj) {
			return obj.getProvisionalDividendParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, Dividend value) {
			obj.setProvisionalDividendParameters(value);
		}
	};
	protected CorporateActionFeesAndCharges solicitationFeeCorporateActionParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
	 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFeeCorporateActionParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a solicitation fee is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, CorporateActionFeesAndCharges> mmSolicitationFeeCorporateActionParameters = new MMBusinessAssociationEnd<RateAndAmount, CorporateActionFeesAndCharges>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SolicitationFeeCorporateActionParameters";
			definition = "Corporate event for which a solicitation fee is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionFeesAndCharges.mmSolicitationFee;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
		}

		@Override
		public CorporateActionFeesAndCharges getValue(RateAndAmount obj) {
			return obj.getSolicitationFeeCorporateActionParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, CorporateActionFeesAndCharges value) {
			obj.setSolicitationFeeCorporateActionParameters(value);
		}
	};
	protected PercentageRate rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PercentageRangeBoundary1#mmBoundaryRate
	 * PercentageRangeBoundary1.mmBoundaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat5Choice#mmRate
	 * RateAndAmountFormat5Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat2Choice#mmRate
	 * TaxCreditRateFormat2Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat6Choice#mmRate
	 * RateAndAmountFormat6Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat3Choice#mmRate
	 * TaxCreditRateFormat3Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat18Choice#mmRate
	 * RateAndAmountFormat18Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat3Choice#mmRate
	 * RateFormat3Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat2Choice#mmRate
	 * RateFormat2Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat1Choice#mmRate
	 * TaxCreditRateFormat1Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat1Choice#mmRate
	 * SolicitationFeeRateFormat1Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat4Choice#mmRate
	 * TaxCreditRateFormat4Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat2Choice#mmRate
	 * SolicitationFeeRateFormat2Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat6Choice#mmRate
	 * RateFormat6Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat3Choice#mmRate
	 * SolicitationFeeRateFormat3Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat5Choice#mmRate
	 * TaxCreditRateFormat5Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat4Choice#mmRate
	 * SolicitationFeeRateFormat4Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat6Choice#mmRate
	 * TaxCreditRateFormat6Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice#mmRate
	 * SolicitationFeeRateFormat5Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat8Choice#mmRate
	 * RateFormat8Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat6Choice#mmRate
	 * SolicitationFeeRateFormat6Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat9Choice#mmRate
	 * RateFormat9Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat5Choice#mmRate
	 * RateFormat5Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateOrAbsoluteValue1Choice#mmRateValue
	 * RateOrAbsoluteValue1Choice.mmRateValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat1Choice#mmRate
	 * RateFormat1Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat10Choice#mmRate
	 * RateFormat10Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat12Choice#mmRate
	 * RateFormat12Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat11Choice#mmRate
	 * RateFormat11Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat14Choice#mmRate
	 * RateFormat14Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat17Choice#mmRate
	 * RateFormat17Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat36Choice#mmRate
	 * RateAndAmountFormat36Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat7Choice#mmRate
	 * TaxCreditRateFormat7Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat39Choice#mmRate
	 * RateAndAmountFormat39Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat7Choice#mmRate
	 * SolicitationFeeRateFormat7Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat8Choice#mmRate
	 * TaxCreditRateFormat8Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat20Choice#mmRate
	 * RateFormat20Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice#mmRate
	 * SolicitationFeeRateFormat8Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat21Choice#mmRate
	 * RateFormat21Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat10Choice#mmRate
	 * SolicitationFeeRateFormat10Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat10Choice#mmRate
	 * TaxCreditRateFormat10Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat43Choice#mmRate
	 * RateAndAmountFormat43Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat9Choice#mmRate
	 * TaxCreditRateFormat9Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat9Choice#mmRate
	 * SolicitationFeeRateFormat9Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat22Choice#mmRate
	 * RateFormat22Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat23Choice#mmRate
	 * RateFormat23Choice.mmRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value expressed as a rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RateAndAmount, PercentageRate> mmRate = new MMBusinessAttribute<RateAndAmount, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(PercentageRangeBoundary1.mmBoundaryRate, RateAndAmountFormat5Choice.mmRate, TaxCreditRateFormat2Choice.mmRate, RateAndAmountFormat6Choice.mmRate, TaxCreditRateFormat3Choice.mmRate,
					RateAndAmountFormat18Choice.mmRate, RateFormat3Choice.mmRate, RateFormat2Choice.mmRate, TaxCreditRateFormat1Choice.mmRate, SolicitationFeeRateFormat1Choice.mmRate, TaxCreditRateFormat4Choice.mmRate,
					SolicitationFeeRateFormat2Choice.mmRate, RateFormat6Choice.mmRate, SolicitationFeeRateFormat3Choice.mmRate, TaxCreditRateFormat5Choice.mmRate, SolicitationFeeRateFormat4Choice.mmRate, TaxCreditRateFormat6Choice.mmRate,
					SolicitationFeeRateFormat5Choice.mmRate, RateFormat8Choice.mmRate, SolicitationFeeRateFormat6Choice.mmRate, RateFormat9Choice.mmRate, RateFormat5Choice.mmRate, RateOrAbsoluteValue1Choice.mmRateValue,
					RateFormat1Choice.mmRate, RateFormat10Choice.mmRate, RateFormat12Choice.mmRate, RateFormat11Choice.mmRate, RateFormat14Choice.mmRate, RateFormat17Choice.mmRate, RateAndAmountFormat36Choice.mmRate,
					TaxCreditRateFormat7Choice.mmRate, RateAndAmountFormat39Choice.mmRate, SolicitationFeeRateFormat7Choice.mmRate, TaxCreditRateFormat8Choice.mmRate, RateFormat20Choice.mmRate, SolicitationFeeRateFormat8Choice.mmRate,
					RateFormat21Choice.mmRate, SolicitationFeeRateFormat10Choice.mmRate, TaxCreditRateFormat10Choice.mmRate, RateAndAmountFormat43Choice.mmRate, TaxCreditRateFormat9Choice.mmRate, SolicitationFeeRateFormat9Choice.mmRate,
					RateFormat22Choice.mmRate, RateFormat23Choice.mmRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Value expressed as a rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(RateAndAmount obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(RateAndAmount obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	protected BiddingConditions rateBiddingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmApplicableRate
	 * BiddingConditions.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bidding conditions for which a rate is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, BiddingConditions> mmRateBiddingConditions = new MMBusinessAssociationEnd<RateAndAmount, BiddingConditions>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateBiddingConditions";
			definition = "Bidding conditions for which a rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> BiddingConditions.mmApplicableRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BiddingConditions.mmObject();
		}

		@Override
		public BiddingConditions getValue(RateAndAmount obj) {
			return obj.getRateBiddingConditions();
		}

		@Override
		public void setValue(RateAndAmount obj, BiddingConditions value) {
			obj.setRateBiddingConditions(value);
		}
	};
	protected SecuritiesTax securitiesTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTax
	 * SecuritiesTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmRelatedTax
	 * SecuritiesTax.mmRelatedTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax for which a percentage of the gross dividend rate is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, SecuritiesTax> mmSecuritiesTax = new MMBusinessAssociationEnd<RateAndAmount, SecuritiesTax>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTax";
			definition = "Tax for which a percentage of the gross dividend rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesTax.mmRelatedTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTax.mmObject();
		}

		@Override
		public SecuritiesTax getValue(RateAndAmount obj) {
			return obj.getSecuritiesTax();
		}

		@Override
		public void setValue(RateAndAmount obj, SecuritiesTax value) {
			obj.setSecuritiesTax(value);
		}
	};
	protected CorporateActionFeesAndCharges earlySolicitationFeeCorporateActionParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmEarlySolicitationFeeRate
	 * CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlySolicitationFeeCorporateActionParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which an early solicitation fee is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, CorporateActionFeesAndCharges> mmEarlySolicitationFeeCorporateActionParameters = new MMBusinessAssociationEnd<RateAndAmount, CorporateActionFeesAndCharges>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarlySolicitationFeeCorporateActionParameters";
			definition = "Corporate event for which an early solicitation fee is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
		}

		@Override
		public CorporateActionFeesAndCharges getValue(RateAndAmount obj) {
			return obj.getEarlySolicitationFeeCorporateActionParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, CorporateActionFeesAndCharges value) {
			obj.setEarlySolicitationFeeCorporateActionParameters(value);
		}
	};
	protected Issuance interestRelatedIssuance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmInterestShortfall
	 * Issuance.mmInterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRelatedIssuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuance for which an interest shortfall has been specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Issuance> mmInterestRelatedIssuance = new MMBusinessAssociationEnd<RateAndAmount, Issuance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestRelatedIssuance";
			definition = "Issuance for which an interest shortfall has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Issuance.mmInterestShortfall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Issuance.mmObject();
		}

		@Override
		public Issuance getValue(RateAndAmount obj) {
			return obj.getInterestRelatedIssuance();
		}

		@Override
		public void setValue(RateAndAmount obj, Issuance value) {
			obj.setInterestRelatedIssuance(value);
		}
	};
	protected Issuance lossRelatedIssuance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmRealisedLoss
	 * Issuance.mmRealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LossRelatedIssuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance for which a realised loss has been specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Issuance> mmLossRelatedIssuance = new MMBusinessAssociationEnd<RateAndAmount, Issuance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LossRelatedIssuance";
			definition = "Issuance for which a realised loss has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Issuance.mmRealisedLoss;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Issuance.mmObject();
		}

		@Override
		public Issuance getValue(RateAndAmount obj) {
			return obj.getLossRelatedIssuance();
		}

		@Override
		public void setValue(RateAndAmount obj, Issuance value) {
			obj.setLossRelatedIssuance(value);
		}
	};
	protected Number absoluteValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateOrAbsoluteValue1Choice#mmAbsoluteValue
	 * RateOrAbsoluteValue1Choice.mmAbsoluteValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AbsoluteValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Absolute value determined with a number."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RateAndAmount, Number> mmAbsoluteValue = new MMBusinessAttribute<RateAndAmount, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(RateOrAbsoluteValue1Choice.mmAbsoluteValue);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AbsoluteValue";
			definition = "Absolute value determined with a number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(RateAndAmount obj) {
			return obj.getAbsoluteValue();
		}

		@Override
		public void setValue(RateAndAmount obj, Number value) {
			obj.setAbsoluteValue(value);
		}
	};
	protected OperatorCode operator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.OperatorCode
	 * OperatorCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Operator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the relationship between a variable and a fixed value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RateAndAmount, OperatorCode> mmOperator = new MMBusinessAttribute<RateAndAmount, OperatorCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Operator";
			definition = "Provides the relationship between a variable and a fixed value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OperatorCode.mmObject();
		}

		@Override
		public OperatorCode getValue(RateAndAmount obj) {
			return obj.getOperator();
		}

		@Override
		public void setValue(RateAndAmount obj, OperatorCode value) {
			obj.setOperator(value);
		}
	};
	protected YieldCalculation relatedYieldCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmYieldRange
	 * YieldCalculation.mmYieldRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedYieldCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Yield calculation which uses a yield range."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Optional<YieldCalculation>> mmRelatedYieldCalculation = new MMBusinessAssociationEnd<RateAndAmount, Optional<YieldCalculation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedYieldCalculation";
			definition = "Yield calculation which uses a yield range.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> YieldCalculation.mmYieldRange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> YieldCalculation.mmObject();
		}

		@Override
		public Optional<YieldCalculation> getValue(RateAndAmount obj) {
			return obj.getRelatedYieldCalculation();
		}

		@Override
		public void setValue(RateAndAmount obj, Optional<YieldCalculation> value) {
			obj.setRelatedYieldCalculation(value.orElse(null));
		}
	};
	protected Dividend conduitForeignIncomeAmountDividendParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmConduitForeignIncomeAmount
	 * Dividend.mmConduitForeignIncomeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConduitForeignIncomeAmountDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a conduit foreign income amount is specified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Dividend> mmConduitForeignIncomeAmountDividendParameters = new MMBusinessAssociationEnd<RateAndAmount, Dividend>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConduitForeignIncomeAmountDividendParameters";
			definition = "Dividend information for which a conduit foreign income amount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Dividend.mmConduitForeignIncomeAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Dividend getValue(RateAndAmount obj) {
			return obj.getConduitForeignIncomeAmountDividendParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, Dividend value) {
			obj.setConduitForeignIncomeAmountDividendParameters(value);
		}
	};
	protected Dividend deemedAmountDividendParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmDeemedAmount
	 * Dividend.mmDeemedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedAmountDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a deemed amount is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RateAndAmount, Dividend> mmDeemedAmountDividendParameters = new MMBusinessAssociationEnd<RateAndAmount, Dividend>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeemedAmountDividendParameters";
			definition = "Dividend information for which a deemed amount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Dividend.mmDeemedAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Dividend.mmObject();
		}

		@Override
		public Dividend getValue(RateAndAmount obj) {
			return obj.getDeemedAmountDividendParameters();
		}

		@Override
		public void setValue(RateAndAmount obj, Dividend value) {
			obj.setDeemedAmountDividendParameters(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateAndAmount";
				definition = "Specifies the value expressed as a rate or an amount. For example, the value of a tax or a commission.";
				associationDomain_lazy = () -> Arrays.asList(Dividend.mmFinalDividend, Dividend.mmFullyFrankedRateAndAmount, Dividend.mmGrossDividend, Dividend.mmNetDividend, Dividend.mmProvisionalDividend, Dividend.mmDeemedAmount,
						Dividend.mmConduitForeignIncomeAmount, SecuritiesTax.mmRelatedTax, Issuance.mmInterestShortfall, Issuance.mmRealisedLoss, Index.mmIndexFactor, BiddingConditions.mmMaximumAllowedOverSubscription,
						BiddingConditions.mmApplicableRate, CorporateActionFeesAndCharges.mmSolicitationFee, CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate, YieldCalculation.mmYieldRange);
				derivationElement_lazy = () -> Arrays.asList(FromToPercentageRange1.mmFrom, FromToPercentageRange1.mmTo, GrossDividendRateFormat19Choice.mmAmountAndRateStatus, AmountAndRateStatus1.mmRateStatus,
						NetDividendRateFormat21Choice.mmAmountAndRateStatus, NetDividendRateFormat23Choice.mmAmountAndRateStatus, GrossDividendRateFormat21Choice.mmAmountAndRateStatus, NetDividendRateFormat22Choice.mmAmountAndRateStatus,
						GrossDividendRateFormat20Choice.mmAmountAndRateStatus, NetDividendRateFormat24Choice.mmAmountAndRateStatus, GrossDividendRateFormat22Choice.mmAmountAndRateStatus, NetDividendRateFormat28Choice.mmAmountAndRateStatus,
						GrossDividendRateFormat26Choice.mmAmountAndRateStatus, NetDividendRateFormat25Choice.mmAmountAndRateStatus, GrossDividendRateFormat23Choice.mmAmountAndRateStatus,
						GrossDividendRateFormat24Choice.mmAmountAndRateStatus, NetDividendRateFormat26Choice.mmAmountAndRateStatus, NetDividendRateFormat27Choice.mmAmountAndRateStatus, GrossDividendRateFormat25Choice.mmAmountAndRateStatus,
						AmountAndRateStatus2.mmRateStatus, GrossDividendRateFormat27Choice.mmAmountAndRateStatus, NetDividendRateFormat29Choice.mmAmountAndRateStatus, NetDividendRateFormat32Choice.mmAmountAndRateStatus,
						GrossDividendRateFormat29Choice.mmAmountAndRateStatus, NetDividendRateFormat30Choice.mmAmountAndRateStatus, GrossDividendRateFormat28Choice.mmAmountAndRateStatus, NetDividendRateFormat31Choice.mmAmountAndRateStatus,
						GrossDividendRateFormat30Choice.mmAmountAndRateStatus, GrossDividendRateFormat31Choice.mmAmountAndRateStatus, NetDividendRateFormat33Choice.mmAmountAndRateStatus,
						GrossDividendRateFormat32Choice.mmAmountAndRateStatus, NetDividendRateFormat34Choice.mmAmountAndRateStatus, GrossDividendRateFormat33Choice.mmAmountAndRateStatus, NetDividendRateFormat35Choice.mmAmountAndRateStatus,
						GrossDividendRateFormat34Choice.mmAmountAndRateStatus, NetDividendRateFormat36Choice.mmAmountAndRateStatus);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RateAndAmount.mmFinalDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmFullyFrankedRateAndAmountDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.mmGrossDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmAmount, com.tools20022.repository.entity.RateAndAmount.mmIndex,
						com.tools20022.repository.entity.RateAndAmount.mmNetDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmMaximumAllowedBiddingConditions,
						com.tools20022.repository.entity.RateAndAmount.mmProvisionalDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmSolicitationFeeCorporateActionParameters,
						com.tools20022.repository.entity.RateAndAmount.mmRate, com.tools20022.repository.entity.RateAndAmount.mmRateBiddingConditions, com.tools20022.repository.entity.RateAndAmount.mmSecuritiesTax,
						com.tools20022.repository.entity.RateAndAmount.mmEarlySolicitationFeeCorporateActionParameters, com.tools20022.repository.entity.RateAndAmount.mmInterestRelatedIssuance,
						com.tools20022.repository.entity.RateAndAmount.mmLossRelatedIssuance, com.tools20022.repository.entity.RateAndAmount.mmAbsoluteValue, com.tools20022.repository.entity.RateAndAmount.mmOperator,
						com.tools20022.repository.entity.RateAndAmount.mmRelatedYieldCalculation, com.tools20022.repository.entity.RateAndAmount.mmConduitForeignIncomeAmountDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.mmDeemedAmountDividendParameters);
				derivationComponent_lazy = () -> Arrays.asList(PercentageRangeBoundary1.mmObject(), FromToPercentageRange1.mmObject(), RateAndAmountFormat12Choice.mmObject(), RateAndAmountFormat13Choice.mmObject(),
						RateAndAmountFormat5Choice.mmObject(), TaxCreditRateFormat2Choice.mmObject(), RateAndAmountFormat6Choice.mmObject(), TaxCreditRateFormat3Choice.mmObject(), RateAndAmountFormat18Choice.mmObject(),
						RateFormat3Choice.mmObject(), RateFormat2Choice.mmObject(), TaxCreditRateFormat1Choice.mmObject(), SolicitationFeeRateFormat1Choice.mmObject(), TaxCreditRateFormat4Choice.mmObject(),
						SolicitationFeeRateFormat2Choice.mmObject(), RateFormat6Choice.mmObject(), SolicitationFeeRateFormat3Choice.mmObject(), TaxCreditRateFormat5Choice.mmObject(), SolicitationFeeRateFormat4Choice.mmObject(),
						TaxCreditRateFormat6Choice.mmObject(), SolicitationFeeRateFormat5Choice.mmObject(), RateFormat8Choice.mmObject(), SolicitationFeeRateFormat6Choice.mmObject(), RateFormat9Choice.mmObject(),
						RateFormat5Choice.mmObject(), RateFormat7Choice.mmObject(), RateOrAbsoluteValue1Choice.mmObject(), RateFormat1Choice.mmObject(), RelatedTaxType1.mmObject(), RateFormat10Choice.mmObject(),
						RateFormat12Choice.mmObject(), RateFormat11Choice.mmObject(), RateFormat14Choice.mmObject(), RateFormat17Choice.mmObject(), RateAndAmountFormat36Choice.mmObject(), TaxCreditRateFormat7Choice.mmObject(),
						RateAndAmountFormat39Choice.mmObject(), SolicitationFeeRateFormat7Choice.mmObject(), TaxCreditRateFormat8Choice.mmObject(), RateFormat20Choice.mmObject(), AmountAndRateStatus1.mmObject(),
						SolicitationFeeRateFormat8Choice.mmObject(), RateFormat21Choice.mmObject(), SolicitationFeeRateFormat10Choice.mmObject(), TaxCreditRateFormat10Choice.mmObject(), RateAndAmountFormat43Choice.mmObject(),
						TaxCreditRateFormat9Choice.mmObject(), SolicitationFeeRateFormat9Choice.mmObject(), AmountAndRateStatus2.mmObject(), OriginalAmountDetails1.mmObject(), AmountAndDirection86.mmObject(), RateFormat22Choice.mmObject(),
						RateFormat23Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return RateAndAmount.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Dividend getFinalDividendParameters() {
		return finalDividendParameters;
	}

	public RateAndAmount setFinalDividendParameters(Dividend finalDividendParameters) {
		this.finalDividendParameters = Objects.requireNonNull(finalDividendParameters);
		return this;
	}

	public Optional<Dividend> getFullyFrankedRateAndAmountDividendParameters() {
		return fullyFrankedRateAndAmountDividendParameters == null ? Optional.empty() : Optional.of(fullyFrankedRateAndAmountDividendParameters);
	}

	public RateAndAmount setFullyFrankedRateAndAmountDividendParameters(Dividend fullyFrankedRateAndAmountDividendParameters) {
		this.fullyFrankedRateAndAmountDividendParameters = fullyFrankedRateAndAmountDividendParameters;
		return this;
	}

	public Dividend getGrossDividendParameters() {
		return grossDividendParameters;
	}

	public RateAndAmount setGrossDividendParameters(Dividend grossDividendParameters) {
		this.grossDividendParameters = Objects.requireNonNull(grossDividendParameters);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public RateAndAmount setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Index getIndex() {
		return index;
	}

	public RateAndAmount setIndex(Index index) {
		this.index = Objects.requireNonNull(index);
		return this;
	}

	public Dividend getNetDividendParameters() {
		return netDividendParameters;
	}

	public RateAndAmount setNetDividendParameters(Dividend netDividendParameters) {
		this.netDividendParameters = Objects.requireNonNull(netDividendParameters);
		return this;
	}

	public BiddingConditions getMaximumAllowedBiddingConditions() {
		return maximumAllowedBiddingConditions;
	}

	public RateAndAmount setMaximumAllowedBiddingConditions(BiddingConditions maximumAllowedBiddingConditions) {
		this.maximumAllowedBiddingConditions = Objects.requireNonNull(maximumAllowedBiddingConditions);
		return this;
	}

	public Dividend getProvisionalDividendParameters() {
		return provisionalDividendParameters;
	}

	public RateAndAmount setProvisionalDividendParameters(Dividend provisionalDividendParameters) {
		this.provisionalDividendParameters = Objects.requireNonNull(provisionalDividendParameters);
		return this;
	}

	public CorporateActionFeesAndCharges getSolicitationFeeCorporateActionParameters() {
		return solicitationFeeCorporateActionParameters;
	}

	public RateAndAmount setSolicitationFeeCorporateActionParameters(CorporateActionFeesAndCharges solicitationFeeCorporateActionParameters) {
		this.solicitationFeeCorporateActionParameters = Objects.requireNonNull(solicitationFeeCorporateActionParameters);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public RateAndAmount setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public BiddingConditions getRateBiddingConditions() {
		return rateBiddingConditions;
	}

	public RateAndAmount setRateBiddingConditions(BiddingConditions rateBiddingConditions) {
		this.rateBiddingConditions = Objects.requireNonNull(rateBiddingConditions);
		return this;
	}

	public SecuritiesTax getSecuritiesTax() {
		return securitiesTax;
	}

	public RateAndAmount setSecuritiesTax(SecuritiesTax securitiesTax) {
		this.securitiesTax = Objects.requireNonNull(securitiesTax);
		return this;
	}

	public CorporateActionFeesAndCharges getEarlySolicitationFeeCorporateActionParameters() {
		return earlySolicitationFeeCorporateActionParameters;
	}

	public RateAndAmount setEarlySolicitationFeeCorporateActionParameters(CorporateActionFeesAndCharges earlySolicitationFeeCorporateActionParameters) {
		this.earlySolicitationFeeCorporateActionParameters = Objects.requireNonNull(earlySolicitationFeeCorporateActionParameters);
		return this;
	}

	public Issuance getInterestRelatedIssuance() {
		return interestRelatedIssuance;
	}

	public RateAndAmount setInterestRelatedIssuance(Issuance interestRelatedIssuance) {
		this.interestRelatedIssuance = Objects.requireNonNull(interestRelatedIssuance);
		return this;
	}

	public Issuance getLossRelatedIssuance() {
		return lossRelatedIssuance;
	}

	public RateAndAmount setLossRelatedIssuance(Issuance lossRelatedIssuance) {
		this.lossRelatedIssuance = Objects.requireNonNull(lossRelatedIssuance);
		return this;
	}

	public Number getAbsoluteValue() {
		return absoluteValue;
	}

	public RateAndAmount setAbsoluteValue(Number absoluteValue) {
		this.absoluteValue = Objects.requireNonNull(absoluteValue);
		return this;
	}

	public OperatorCode getOperator() {
		return operator;
	}

	public RateAndAmount setOperator(OperatorCode operator) {
		this.operator = Objects.requireNonNull(operator);
		return this;
	}

	public Optional<YieldCalculation> getRelatedYieldCalculation() {
		return relatedYieldCalculation == null ? Optional.empty() : Optional.of(relatedYieldCalculation);
	}

	public RateAndAmount setRelatedYieldCalculation(YieldCalculation relatedYieldCalculation) {
		this.relatedYieldCalculation = relatedYieldCalculation;
		return this;
	}

	public Dividend getConduitForeignIncomeAmountDividendParameters() {
		return conduitForeignIncomeAmountDividendParameters;
	}

	public RateAndAmount setConduitForeignIncomeAmountDividendParameters(Dividend conduitForeignIncomeAmountDividendParameters) {
		this.conduitForeignIncomeAmountDividendParameters = Objects.requireNonNull(conduitForeignIncomeAmountDividendParameters);
		return this;
	}

	public Dividend getDeemedAmountDividendParameters() {
		return deemedAmountDividendParameters;
	}

	public RateAndAmount setDeemedAmountDividendParameters(Dividend deemedAmountDividendParameters) {
		this.deemedAmountDividendParameters = Objects.requireNonNull(deemedAmountDividendParameters);
		return this;
	}
}