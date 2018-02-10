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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.BenchmarkCurveNameCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BenchmarkCurve1;
import com.tools20022.repository.msg.BenchmarkCurve2;
import com.tools20022.repository.msg.BenchmarkCurve4;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Describes a benchmark curve.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Curve" src="doc-files/Curve.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#mmCurrency
 * Curve.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#mmName Curve.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#mmPoint Curve.mmPoint}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Curve#mmSpread
 * Curve.mmSpread}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkCurve
 * Spread.mmBenchmarkCurve}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BenchmarkCurve2
 * BenchmarkCurve2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BenchmarkCurve1
 * BenchmarkCurve1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BenchmarkCurve4
 * BenchmarkCurve4}</li>
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
 * "Curve"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Describes a benchmark curve."</li>
 * </ul>
 */
public class Curve {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmBenchmarkCurveCurrency
	 * BenchmarkCurve2.mmBenchmarkCurveCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve1#mmBenchmarkCurveCurrency
	 * BenchmarkCurve1.mmBenchmarkCurveCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4#mmBenchmarkCurveCurrency
	 * BenchmarkCurve4.mmBenchmarkCurveCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 220</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the currency used for the benchmark curve."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BenchmarkCurve2.mmBenchmarkCurveCurrency, BenchmarkCurve1.mmBenchmarkCurveCurrency, BenchmarkCurve4.mmBenchmarkCurveCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Curve.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "220"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Identifies the currency used for the benchmark curve.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Curve.class.getMethod("getCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BenchmarkCurveNameCode name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveNameCode
	 * BenchmarkCurveNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName2Choice#mmCode
	 * BenchmarkCurveName2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName2Choice#mmProprietary
	 * BenchmarkCurveName2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmBenchmarkCurveName
	 * BenchmarkCurve2.mmBenchmarkCurveName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve1#mmBenchmarkCurveName
	 * BenchmarkCurve1.mmBenchmarkCurveName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InflationIndex1Choice#mmName
	 * InflationIndex1Choice.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice#mmIndex
	 * BenchmarkCurveName4Choice.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice#mmName
	 * BenchmarkCurveName4Choice.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName5Choice#mmIndex
	 * BenchmarkCurveName5Choice.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName5Choice#mmName
	 * BenchmarkCurveName5Choice.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice#mmIndex
	 * BenchmarkCurveName6Choice.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice#mmName
	 * BenchmarkCurveName6Choice.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4#mmBenchmarkCurveName
	 * BenchmarkCurve4.mmBenchmarkCurveName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName7Choice#mmCode
	 * BenchmarkCurveName7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName7Choice#mmProprietary
	 * BenchmarkCurveName7Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 221</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the name of the benchmark curve."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BenchmarkCurveName2Choice.mmCode, BenchmarkCurveName2Choice.mmProprietary, BenchmarkCurve2.mmBenchmarkCurveName, BenchmarkCurve1.mmBenchmarkCurveName, InflationIndex1Choice.mmName,
					BenchmarkCurveName4Choice.mmIndex, BenchmarkCurveName4Choice.mmName, BenchmarkCurveName5Choice.mmIndex, BenchmarkCurveName5Choice.mmName, BenchmarkCurveName6Choice.mmIndex, BenchmarkCurveName6Choice.mmName,
					BenchmarkCurve4.mmBenchmarkCurveName, BenchmarkCurveName7Choice.mmCode, BenchmarkCurveName7Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Curve.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "221"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Identifies the name of the benchmark curve.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BenchmarkCurveNameCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Curve.class.getMethod("getName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max256Text point;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmBenchmarkCurvePoint
	 * BenchmarkCurve2.mmBenchmarkCurvePoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve1#mmBenchmarkCurvePoint
	 * BenchmarkCurve1.mmBenchmarkCurvePoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BenchmarkCurve4#mmBenchmarkCurvePoint
	 * BenchmarkCurve4.mmBenchmarkCurvePoint}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 222</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Point"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a point on a benchmark curve. The point can be stated via a combination of maturity month/year and coupon."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPoint = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BenchmarkCurve2.mmBenchmarkCurvePoint, BenchmarkCurve1.mmBenchmarkCurvePoint, BenchmarkCurve4.mmBenchmarkCurvePoint);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Curve.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "222"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Point";
			definition = "Identifies a point on a benchmark curve. The point can be stated via a combination of maturity month/year and coupon.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Curve.class.getMethod("getPoint", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Spread spread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkCurve
	 * Spread.mmBenchmarkCurve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BenchmarkCurve2#mmSpread
	 * BenchmarkCurve2.mmSpread}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BenchmarkCurve1#mmSpread
	 * BenchmarkCurve1.mmSpread}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BenchmarkCurve4#mmSpread
	 * BenchmarkCurve4.mmSpread}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Curve
	 * Curve}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Spread for which a benchmark curve is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSpread = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BenchmarkCurve2.mmSpread, BenchmarkCurve1.mmSpread, BenchmarkCurve4.mmSpread);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Curve.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread for which a benchmark curve is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmBenchmarkCurve;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Curve";
				definition = "Describes a benchmark curve.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Spread.mmBenchmarkCurve);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Curve.mmCurrency, com.tools20022.repository.entity.Curve.mmName, com.tools20022.repository.entity.Curve.mmPoint,
						com.tools20022.repository.entity.Curve.mmSpread);
				derivationComponent_lazy = () -> Arrays.asList(BenchmarkCurve2.mmObject(), BenchmarkCurve1.mmObject(), BenchmarkCurve4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Curve.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public Curve setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public BenchmarkCurveNameCode getName() {
		return name;
	}

	public Curve setName(BenchmarkCurveNameCode name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Max256Text getPoint() {
		return point;
	}

	public Curve setPoint(Max256Text point) {
		this.point = Objects.requireNonNull(point);
		return this;
	}

	public Optional<Spread> getSpread() {
		return spread == null ? Optional.empty() : Optional.of(spread);
	}

	public Curve setSpread(com.tools20022.repository.entity.Spread spread) {
		this.spread = spread;
		return this;
	}
}