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
import com.tools20022.repository.codeset.GuarantyTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Partial or full coverage of amounts by a party other than the debtor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Guarantee" src="doc-files/Guarantee.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmCoveredAmount
 * Guarantee.mmCoveredAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmEffectivePeriod
 * Guarantee.mmEffectivePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmGuaranteeType
 * Guarantee.mmGuaranteeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Guarantee#mmCoveredPercentage
 * Guarantee.mmCoveredPercentage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmDocument
 * Guarantee.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmGuaranteedTrade
 * Guarantee.mmGuaranteedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmExcessAmount
 * Guarantee.mmExcessAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Guarantee#mmGuaranteePartyRole
 * Guarantee.mmGuaranteePartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmGuarantee
 * Trade.mmGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmGuarantee
 * DateTimePeriod.mmGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmGuarantee
 * Document.mmGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GuaranteePartyRole#mmGuarantee
 * GuaranteePartyRole.mmGuarantee}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GuaranteeDetails1
 * GuaranteeDetails1}</li>
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
 * "Guarantee"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Partial or full coverage of amounts by a party other than the debtor."</li>
 * </ul>
 */
public class Guarantee extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount coveredAmount;
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
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral1#mmGuaranteeAmount
	 * OtherCollateral1.mmGuaranteeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmGuaranteeAmount
	 * OtherCollateral2.mmGuaranteeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmGuaranteeAmount
	 * OtherCollateral3.mmGuaranteeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmGuaranteeAmount
	 * OtherCollateral4.mmGuaranteeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmGuaranteedAmount
	 * GuaranteeDetails1.mmGuaranteedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmGuaranteeAmount
	 * OtherCollateral7.mmGuaranteeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmGuaranteeAmount
	 * OtherCollateral6.mmGuaranteeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmGuaranteeAmount
	 * OtherCollateral5.mmGuaranteeAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Guarantee1#mmAmount
	 * Guarantee1.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount covered by the guarantee."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCoveredAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OtherCollateral1.mmGuaranteeAmount, OtherCollateral2.mmGuaranteeAmount, OtherCollateral3.mmGuaranteeAmount, OtherCollateral4.mmGuaranteeAmount, GuaranteeDetails1.mmGuaranteedAmount,
					OtherCollateral7.mmGuaranteeAmount, OtherCollateral6.mmGuaranteeAmount, OtherCollateral5.mmGuaranteeAmount, Guarantee1.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoveredAmount";
			definition = "Amount covered by the guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Guarantee.class.getMethod("getCoveredAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod effectivePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmGuarantee
	 * DateTimePeriod.mmGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the guarantee is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEffectivePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the guarantee is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmGuarantee;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected GuarantyTypeCode guaranteeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GuarantyTypeCode
	 * GuarantyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of security granted by an organisation with the role as 'guarantor', for example, suretyship."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmGuaranteeType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteeType";
			definition = "Specifies the type of security granted by an organisation with the role as 'guarantor', for example, suretyship.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GuarantyTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Guarantee.class.getMethod("getGuaranteeType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate coveredPercentage;
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
	 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmCoveredPercentage
	 * GuaranteeDetails1.mmCoveredPercentage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount covered by the guarantee, expressed as a percentage."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCoveredPercentage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(GuaranteeDetails1.mmCoveredPercentage);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoveredPercentage";
			definition = "Amount covered by the guarantee, expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Guarantee.class.getMethod("getCoveredPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Document> document;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmGuarantee
	 * Document.mmGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Document"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document which contains the description of the guarantee."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Document";
			definition = "Document which contains the description of the guarantee.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmGuarantee;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};
	protected Trade guaranteedTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmGuarantee
	 * Trade.mmGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which is partially or fully covered by a guarantee."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGuaranteedTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedTrade";
			definition = "Trade which is partially or fully covered by a guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmGuarantee;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected CurrencyAndAmount excessAmount;
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
	 * <li>{@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmExcess
	 * GuaranteeDetails1.mmExcess}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExcessAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount not covered by the guarantee."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExcessAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(GuaranteeDetails1.mmExcess);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExcessAmount";
			definition = "Amount not covered by the guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Guarantee.class.getMethod("getExcessAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected GuaranteePartyRole guaranteePartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GuaranteePartyRole#mmGuarantee
	 * GuaranteePartyRole.mmGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.GuaranteePartyRole
	 * GuaranteePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the roles played by a party in the context of guarantees."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGuaranteePartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteePartyRole";
			definition = "Specifies the roles played by a party in the context of guarantees.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GuaranteePartyRole.mmGuarantee;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GuaranteePartyRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Guarantee";
				definition = "Partial or full coverage of amounts by a party other than the debtor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmGuarantee, com.tools20022.repository.entity.DateTimePeriod.mmGuarantee, com.tools20022.repository.entity.Document.mmGuarantee,
						com.tools20022.repository.entity.GuaranteePartyRole.mmGuarantee);
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Guarantee.mmCoveredAmount, com.tools20022.repository.entity.Guarantee.mmEffectivePeriod, com.tools20022.repository.entity.Guarantee.mmGuaranteeType,
						com.tools20022.repository.entity.Guarantee.mmCoveredPercentage, com.tools20022.repository.entity.Guarantee.mmDocument, com.tools20022.repository.entity.Guarantee.mmGuaranteedTrade,
						com.tools20022.repository.entity.Guarantee.mmExcessAmount, com.tools20022.repository.entity.Guarantee.mmGuaranteePartyRole);
				derivationComponent_lazy = () -> Arrays.asList(GuaranteeDetails1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Guarantee.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getCoveredAmount() {
		return coveredAmount;
	}

	public Guarantee setCoveredAmount(CurrencyAndAmount coveredAmount) {
		this.coveredAmount = Objects.requireNonNull(coveredAmount);
		return this;
	}

	public DateTimePeriod getEffectivePeriod() {
		return effectivePeriod;
	}

	public Guarantee setEffectivePeriod(com.tools20022.repository.entity.DateTimePeriod effectivePeriod) {
		this.effectivePeriod = Objects.requireNonNull(effectivePeriod);
		return this;
	}

	public GuarantyTypeCode getGuaranteeType() {
		return guaranteeType;
	}

	public Guarantee setGuaranteeType(GuarantyTypeCode guaranteeType) {
		this.guaranteeType = Objects.requireNonNull(guaranteeType);
		return this;
	}

	public PercentageRate getCoveredPercentage() {
		return coveredPercentage;
	}

	public Guarantee setCoveredPercentage(PercentageRate coveredPercentage) {
		this.coveredPercentage = Objects.requireNonNull(coveredPercentage);
		return this;
	}

	public List<Document> getDocument() {
		return document == null ? document = new ArrayList<>() : document;
	}

	public Guarantee setDocument(List<com.tools20022.repository.entity.Document> document) {
		this.document = Objects.requireNonNull(document);
		return this;
	}

	public Trade getGuaranteedTrade() {
		return guaranteedTrade;
	}

	public Guarantee setGuaranteedTrade(com.tools20022.repository.entity.Trade guaranteedTrade) {
		this.guaranteedTrade = Objects.requireNonNull(guaranteedTrade);
		return this;
	}

	public CurrencyAndAmount getExcessAmount() {
		return excessAmount;
	}

	public Guarantee setExcessAmount(CurrencyAndAmount excessAmount) {
		this.excessAmount = Objects.requireNonNull(excessAmount);
		return this;
	}

	public GuaranteePartyRole getGuaranteePartyRole() {
		return guaranteePartyRole;
	}

	public Guarantee setGuaranteePartyRole(com.tools20022.repository.entity.GuaranteePartyRole guaranteePartyRole) {
		this.guaranteePartyRole = Objects.requireNonNull(guaranteePartyRole);
		return this;
	}
}