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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.FinancialInstrument46Choice;
import com.tools20022.repository.choice.FinancialInstrument48Choice;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Margin over or under an index which determines a rate.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Spread" src="doc-files/Spread.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkSecurity
 * Spread.mmBenchmarkSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Spread#mmSecuritiesFinancing
 * Spread.mmSecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmSpreadRate
 * Spread.mmSpreadRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBasisPointSpread
 * Spread.mmBasisPointSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmIndex
 * Spread.mmIndex}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkPrice
 * Spread.mmBenchmarkPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Spread#mmRelatedIndicationOfInterest
 * Spread.mmRelatedIndicationOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Spread#mmIndicationOfInterest
 * Spread.mmIndicationOfInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmRelatedInterest
 * Spread.mmRelatedInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkCurve
 * Spread.mmBenchmarkCurve}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmPriceOffset
 * Spread.mmPriceOffset}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmSpread
 * Security.mmSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSpread
 * SecuritiesPricing.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmSpread
 * InterestCalculation.mmSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmSpread
 * Index.mmSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseSpread
 * SecuritiesFinancing.mmRepurchaseSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmSpreadToBenchmark
 * BuyOrSellIndicationOfInterest.mmSpreadToBenchmark}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmSwapSpread
 * BuyOrSellIndicationOfInterest.mmSwapSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#mmSpread
 * Curve.mmSpread}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#mmSpreadAndBenchmarkCurveDetails
 * SingleQuote1.mmSpreadAndBenchmarkCurveDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleOrder1#mmSpreadAndBenchmarkCurveDetails
 * SingleOrder1.mmSpreadAndBenchmarkCurveDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmSpreadAndBenchmarkCurveDetails
 * QuoteRequest1.mmSpreadAndBenchmarkCurveDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Spread"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Margin over or under an index which determines a rate."</li>
 * </ul>
 */
public class Spread {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Security benchmarkSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSpread
	 * Security.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security used as a reference to express the value of another security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBenchmarkSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BenchmarkSecurity";
			definition = "Security used as a reference to express the value of another security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSpread;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected SecuritiesFinancing securitiesFinancing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseSpread
	 * SecuritiesFinancing.mmRepurchaseSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities financing process for which a repurchase spread is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesFinancing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancing";
			definition = "Securities financing process for which a repurchase spread is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmRepurchaseSpread;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	protected PercentageRate spreadRate;
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
	 * {@linkplain com.tools20022.repository.msg.InterestChange1#mmSpreadRate
	 * InterestChange1.mmSpreadRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmSpreadRate
	 * SecuritiesFinancing10.mmSpreadRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation1#mmSpread
	 * InterestCalculation1.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation2#mmSpread
	 * InterestCalculation2.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing1#mmSpread
	 * SecuritiesFinancing1.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation3#mmSpread
	 * InterestCalculation3.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmSpread
	 * InterestCalculation4.mmSpread}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin over or under an index which determines the interest rate of an interest bearing instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSpreadRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InterestChange1.mmSpreadRate, SecuritiesFinancing10.mmSpreadRate, InterestCalculation1.mmSpread, InterestCalculation2.mmSpread, SecuritiesFinancing1.mmSpread, InterestCalculation3.mmSpread,
					InterestCalculation4.mmSpread);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpreadRate";
			definition = "Margin over or under an index which determines the interest rate of an interest bearing instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Spread.class.getMethod("getSpreadRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number basisPointSpread;
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
	 * {@linkplain com.tools20022.repository.msg.VariableInterest1Rate#mmBasisPointSpread
	 * VariableInterest1Rate.mmBasisPointSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingRateNote1#mmBasisPointSpread
	 * FloatingRateNote1.mmBasisPointSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4#mmBasisPointSpread
	 * FloatingInterestRate4.mmBasisPointSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingRateNote2#mmBasisPointSpread
	 * FloatingRateNote2.mmBasisPointSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate6#mmBasisPointSpread
	 * FloatingInterestRate6.mmBasisPointSpread}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisPointSpread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of points to be added or substracted to the rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBasisPointSpread = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(VariableInterest1Rate.mmBasisPointSpread, FloatingRateNote1.mmBasisPointSpread, FloatingInterestRate4.mmBasisPointSpread, FloatingRateNote2.mmBasisPointSpread,
					FloatingInterestRate6.mmBasisPointSpread);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BasisPointSpread";
			definition = "Specifies the number of points to be added or substracted to the rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Spread.class.getMethod("getBasisPointSpread", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Index index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Index#mmSpread
	 * Index.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Index Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument46Choice#mmIndex
	 * FinancialInstrument46Choice.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument58#mmName
	 * FinancialInstrument58.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument48Choice#mmIndex
	 * FinancialInstrument48Choice.mmIndex}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Index for which a spread is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIndex = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument46Choice.mmIndex, FinancialInstrument58.mmName, FinancialInstrument48Choice.mmIndex);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Index for which a spread is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Index.mmSpread;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
		}
	};
	protected SecuritiesPricing benchmarkPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSpread
	 * SecuritiesPricing.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmBenchmarkPrice
	 * BenchmarkCurve2.mmBenchmarkPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve1#mmBenchmarkPrice
	 * BenchmarkCurve1.mmBenchmarkPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4#mmBenchmarkPrice
	 * BenchmarkCurve4.mmBenchmarkPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the price of the benchmark security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBenchmarkPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BenchmarkCurve2.mmBenchmarkPrice, BenchmarkCurve1.mmBenchmarkPrice, BenchmarkCurve4.mmBenchmarkPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BenchmarkPrice";
			definition = "Identifies the price of the benchmark security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmSpread;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.BuyOrSellIndicationOfInterest> relatedIndicationOfInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmSpreadToBenchmark
	 * BuyOrSellIndicationOfInterest.mmSpreadToBenchmark}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIndicationOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of interest process for which a spread to benchmark is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process for which a spread to benchmark is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmSpreadToBenchmark;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
		}
	};
	protected BuyOrSellIndicationOfInterest indicationOfInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmSwapSpread
	 * BuyOrSellIndicationOfInterest.mmSwapSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndicationOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of interest process for which a spread is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndicationOfInterest";
			definition = "Indication of interest process for which a spread is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmSwapSpread;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
		}
	};
	protected InterestCalculation relatedInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmSpread
	 * InterestCalculation.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest calculation process for which a spread is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterest";
			definition = "Interest calculation process for which a spread is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmSpread;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
		}
	};
	protected Curve benchmarkCurve;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Curve#mmSpread
	 * Curve.mmSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Curve Curve}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmLegBenchmarkCurveDetails
	 * InstrumentLeg2.mmLegBenchmarkCurveDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quote1#mmSpreadAndBenchmarkCurveDetails
	 * Quote1.mmSpreadAndBenchmarkCurveDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenchmarkCurve"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes a benchmark curve."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBenchmarkCurve = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InstrumentLeg2.mmLegBenchmarkCurveDetails, Quote1.mmSpreadAndBenchmarkCurveDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BenchmarkCurve";
			definition = "Describes a benchmark curve.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Curve.mmSpread;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Curve.mmObject();
		}
	};
	protected DecimalNumber priceOffset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Spread
	 * Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 218</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either a swap spread or spread to benchmark depending upon order type. In case of a spread to benchmark, the price offset is expressed in terms of basis points relative to a benchmark - this can be a positive or a negative spread. In case of a swap spread, the price offset is target spread for a swap."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPriceOffset = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "218"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceOffset";
			definition = "Either a swap spread or spread to benchmark depending upon order type. In case of a spread to benchmark, the price offset is expressed in terms of basis points relative to a benchmark - this can be a positive or a negative spread. In case of a swap spread, the price offset is target spread for a swap.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Spread.class.getMethod("getPriceOffset", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Spread";
				definition = "Margin over or under an index which determines a rate.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSpread, com.tools20022.repository.entity.SecuritiesPricing.mmSpread, com.tools20022.repository.entity.InterestCalculation.mmSpread,
						com.tools20022.repository.entity.Index.mmSpread, com.tools20022.repository.entity.SecuritiesFinancing.mmRepurchaseSpread, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmSpreadToBenchmark,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmSwapSpread, com.tools20022.repository.entity.Curve.mmSpread);
				derivationElement_lazy = () -> Arrays.asList(SingleQuote1.mmSpreadAndBenchmarkCurveDetails, SingleOrder1.mmSpreadAndBenchmarkCurveDetails, QuoteRequest1.mmSpreadAndBenchmarkCurveDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Spread.mmBenchmarkSecurity, com.tools20022.repository.entity.Spread.mmSecuritiesFinancing, com.tools20022.repository.entity.Spread.mmSpreadRate,
						com.tools20022.repository.entity.Spread.mmBasisPointSpread, com.tools20022.repository.entity.Spread.mmIndex, com.tools20022.repository.entity.Spread.mmBenchmarkPrice,
						com.tools20022.repository.entity.Spread.mmRelatedIndicationOfInterest, com.tools20022.repository.entity.Spread.mmIndicationOfInterest, com.tools20022.repository.entity.Spread.mmRelatedInterest,
						com.tools20022.repository.entity.Spread.mmBenchmarkCurve, com.tools20022.repository.entity.Spread.mmPriceOffset);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Spread.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Security getBenchmarkSecurity() {
		return benchmarkSecurity;
	}

	public Spread setBenchmarkSecurity(com.tools20022.repository.entity.Security benchmarkSecurity) {
		this.benchmarkSecurity = Objects.requireNonNull(benchmarkSecurity);
		return this;
	}

	public Optional<SecuritiesFinancing> getSecuritiesFinancing() {
		return securitiesFinancing == null ? Optional.empty() : Optional.of(securitiesFinancing);
	}

	public Spread setSecuritiesFinancing(com.tools20022.repository.entity.SecuritiesFinancing securitiesFinancing) {
		this.securitiesFinancing = securitiesFinancing;
		return this;
	}

	public PercentageRate getSpreadRate() {
		return spreadRate;
	}

	public Spread setSpreadRate(PercentageRate spreadRate) {
		this.spreadRate = Objects.requireNonNull(spreadRate);
		return this;
	}

	public Number getBasisPointSpread() {
		return basisPointSpread;
	}

	public Spread setBasisPointSpread(Number basisPointSpread) {
		this.basisPointSpread = Objects.requireNonNull(basisPointSpread);
		return this;
	}

	public Optional<Index> getIndex() {
		return index == null ? Optional.empty() : Optional.of(index);
	}

	public Spread setIndex(com.tools20022.repository.entity.Index index) {
		this.index = index;
		return this;
	}

	public SecuritiesPricing getBenchmarkPrice() {
		return benchmarkPrice;
	}

	public Spread setBenchmarkPrice(com.tools20022.repository.entity.SecuritiesPricing benchmarkPrice) {
		this.benchmarkPrice = Objects.requireNonNull(benchmarkPrice);
		return this;
	}

	public List<BuyOrSellIndicationOfInterest> getRelatedIndicationOfInterest() {
		return relatedIndicationOfInterest == null ? relatedIndicationOfInterest = new ArrayList<>() : relatedIndicationOfInterest;
	}

	public Spread setRelatedIndicationOfInterest(List<com.tools20022.repository.entity.BuyOrSellIndicationOfInterest> relatedIndicationOfInterest) {
		this.relatedIndicationOfInterest = Objects.requireNonNull(relatedIndicationOfInterest);
		return this;
	}

	public Optional<BuyOrSellIndicationOfInterest> getIndicationOfInterest() {
		return indicationOfInterest == null ? Optional.empty() : Optional.of(indicationOfInterest);
	}

	public Spread setIndicationOfInterest(com.tools20022.repository.entity.BuyOrSellIndicationOfInterest indicationOfInterest) {
		this.indicationOfInterest = indicationOfInterest;
		return this;
	}

	public InterestCalculation getRelatedInterest() {
		return relatedInterest;
	}

	public Spread setRelatedInterest(com.tools20022.repository.entity.InterestCalculation relatedInterest) {
		this.relatedInterest = Objects.requireNonNull(relatedInterest);
		return this;
	}

	public Curve getBenchmarkCurve() {
		return benchmarkCurve;
	}

	public Spread setBenchmarkCurve(com.tools20022.repository.entity.Curve benchmarkCurve) {
		this.benchmarkCurve = Objects.requireNonNull(benchmarkCurve);
		return this;
	}

	public DecimalNumber getPriceOffset() {
		return priceOffset;
	}

	public Spread setPriceOffset(DecimalNumber priceOffset) {
		this.priceOffset = Objects.requireNonNull(priceOffset);
		return this;
	}
}