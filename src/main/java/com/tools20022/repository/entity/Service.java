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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ServiceTaxDesignationCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Service is the intangible equivalent of a good.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Service" src="doc-files/Service.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Service#mmAmount
 * Service.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Service#mmType
 * Service.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Service#mmTaxDesignation
 * Service.mmTaxDesignation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Service#mmRate
 * Service.mmRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.FinancialService
 * FinancialService}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Service"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Service is the intangible equivalent of a good."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Service extends Product {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.BillingCompensation1#mmValue
	 * BillingCompensation1.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount1#mmHostAmount
	 * BillingServicesAmount1.mmHostAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount2#mmHostAmount
	 * BillingServicesAmount2.mmHostAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount2#mmSettlementAmount
	 * BillingServicesAmount2.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmOriginalChargeSettlementAmount
	 * BillingService1.mmOriginalChargeSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount3#mmSourceAmount
	 * BillingServicesAmount3.mmSourceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesAmount3#mmHostAmount
	 * BillingServicesAmount3.mmHostAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#mmTotalTaxableServiceChargeHostAmount
	 * TaxCalculation1.mmTotalTaxableServiceChargeHostAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmAmount
	 * BillingServiceAdjustment1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmOriginalChargeAmount
	 * BillingServiceAdjustment1.mmOriginalChargeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmNewChargeAmount
	 * BillingServiceAdjustment1.mmNewChargeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmOriginalChargeSettlementAmount
	 * BillingService2.mmOriginalChargeSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Service
	 * Service}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount charged for the service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Service, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<Service, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(BillingCompensation1.mmValue, BillingServicesAmount1.mmHostAmount, BillingServicesAmount2.mmHostAmount, BillingServicesAmount2.mmSettlementAmount,
					BillingService1.mmOriginalChargeSettlementAmount, BillingServicesAmount3.mmSourceAmount, BillingServicesAmount3.mmHostAmount, TaxCalculation1.mmTotalTaxableServiceChargeHostAmount, BillingServiceAdjustment1.mmAmount,
					BillingServiceAdjustment1.mmOriginalChargeAmount, BillingServiceAdjustment1.mmNewChargeAmount, BillingService2.mmOriginalChargeSettlementAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Service.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount charged for the service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Service obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Service obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected Max35Text type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmType
	 * BillingServiceAdjustment1.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Service
	 * Service}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type used to classify and organise different services."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Service, Max35Text> mmType = new MMBusinessAttribute<Service, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(BillingServiceAdjustment1.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Service.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type used to classify and organise different services.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Service obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Service obj, Max35Text value) {
			obj.setType(value);
		}
	};
	protected ServiceTaxDesignationCode taxDesignation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceTaxDesignationCode
	 * ServiceTaxDesignationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Service
	 * Service}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDesignation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the taxable status of the service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Service, ServiceTaxDesignationCode> mmTaxDesignation = new MMBusinessAttribute<Service, ServiceTaxDesignationCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Service.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxDesignation";
			definition = "Identifies the taxable status of the service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ServiceTaxDesignationCode.mmObject();
		}

		@Override
		public ServiceTaxDesignationCode getValue(Service obj) {
			return obj.getTaxDesignation();
		}

		@Override
		public void setValue(Service obj, ServiceTaxDesignationCode value) {
			obj.setTaxDesignation(value);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Service
	 * Service}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate applied on a basis amount to calculate the service charge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Service, PercentageRate> mmRate = new MMBusinessAttribute<Service, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Service.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate applied on a basis amount to calculate the service charge.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Service obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(Service obj, PercentageRate value) {
			obj.setRate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Service";
				definition = "Service is the intangible equivalent of a good.";
				subType_lazy = () -> Arrays.asList(FinancialService.mmObject());
				superType_lazy = () -> Product.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Service.mmAmount, com.tools20022.repository.entity.Service.mmType, com.tools20022.repository.entity.Service.mmTaxDesignation,
						com.tools20022.repository.entity.Service.mmRate);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Service.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public Service setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Max35Text getType() {
		return type;
	}

	public Service setType(Max35Text type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public ServiceTaxDesignationCode getTaxDesignation() {
		return taxDesignation;
	}

	public Service setTaxDesignation(ServiceTaxDesignationCode taxDesignation) {
		this.taxDesignation = Objects.requireNonNull(taxDesignation);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public Service setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}
}