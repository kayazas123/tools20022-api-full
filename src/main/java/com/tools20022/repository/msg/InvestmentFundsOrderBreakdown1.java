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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.FundOrderType5Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * An investor's instruction to either subscribe or redeem an amount of money or
 * its equivalent, eg, other assets, into or out of an investment fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1#OrderBreakdownTypeOrExtendedOrderBreakdownTypeRule
 * InvestmentFundsOrderBreakdown1.
 * OrderBreakdownTypeOrExtendedOrderBreakdownTypeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1#mmOrderBreakdownType
 * InvestmentFundsOrderBreakdown1.mmOrderBreakdownType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1#mmExtendedOrderBreakdownType
 * InvestmentFundsOrderBreakdown1.mmExtendedOrderBreakdownType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1#mmAmount
 * InvestmentFundsOrderBreakdown1.mmAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentFundsOrderBreakdown1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, eg, other assets, into or out of an investment fund."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2
 * InvestmentFundsOrderBreakdown2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentFundsOrderBreakdown1", propOrder = {"orderBreakdownType", "extendedOrderBreakdownType", "amount"})
public class InvestmentFundsOrderBreakdown1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrdrBrkdwnTp", required = true)
	protected FundOrderType5Code orderBreakdownType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType5Code
	 * FundOrderType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderType
	 * InvestmentFundOrder.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1
	 * InvestmentFundsOrderBreakdown1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrBrkdwnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderBreakdownType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of order breakdown."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2#mmOrderBreakdownType
	 * InvestmentFundsOrderBreakdown2.mmOrderBreakdownType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundsOrderBreakdown1, FundOrderType5Code> mmOrderBreakdownType = new MMMessageAttribute<InvestmentFundsOrderBreakdown1, FundOrderType5Code>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1.mmObject();
			isDerived = false;
			xmlTag = "OrdrBrkdwnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderBreakdownType";
			definition = "Type of order breakdown.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundsOrderBreakdown2.mmOrderBreakdownType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FundOrderType5Code.mmObject();
		}

		@Override
		public FundOrderType5Code getValue(InvestmentFundsOrderBreakdown1 obj) {
			return obj.getOrderBreakdownType();
		}

		@Override
		public void setValue(InvestmentFundsOrderBreakdown1 obj, FundOrderType5Code value) {
			obj.setOrderBreakdownType(value);
		}
	};
	@XmlElement(name = "XtndedOrdrBrkdwnTp", required = true)
	protected Extended350Code extendedOrderBreakdownType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderType
	 * InvestmentFundOrder.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1
	 * InvestmentFundsOrderBreakdown1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedOrdrBrkdwnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedOrderBreakdownType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of order breakdown."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundsOrderBreakdown1, Extended350Code> mmExtendedOrderBreakdownType = new MMMessageAttribute<InvestmentFundsOrderBreakdown1, Extended350Code>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1.mmObject();
			isDerived = false;
			xmlTag = "XtndedOrdrBrkdwnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedOrderBreakdownType";
			definition = "Type of order breakdown.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Extended350Code getValue(InvestmentFundsOrderBreakdown1 obj) {
			return obj.getExtendedOrderBreakdownType();
		}

		@Override
		public void setValue(InvestmentFundsOrderBreakdown1 obj, Extended350Code value) {
			obj.setExtendedOrderBreakdownType(value);
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected ActiveCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedAmount
	 * SecuritiesOrder.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1
	 * InvestmentFundsOrderBreakdown1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the net amount that is attributed to an order type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2#mmAmount
	 * InvestmentFundsOrderBreakdown2.mmAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundsOrderBreakdown1, ActiveCurrencyAndAmount> mmAmount = new MMMessageAttribute<InvestmentFundsOrderBreakdown1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Portion of the net amount that is attributed to an order type.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundsOrderBreakdown2.mmAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(InvestmentFundsOrderBreakdown1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(InvestmentFundsOrderBreakdown1 obj, ActiveCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	/**
	 * Either OrderBreakdownType Or ExtendedOrderBreakdownType must be present
	 * but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1
	 * InvestmentFundsOrderBreakdown1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1#mmOrderBreakdownType
	 * InvestmentFundsOrderBreakdown1.mmOrderBreakdownType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1#mmExtendedOrderBreakdownType
	 * InvestmentFundsOrderBreakdown1.mmExtendedOrderBreakdownType}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderBreakdownTypeOrExtendedOrderBreakdownTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either OrderBreakdownType Or ExtendedOrderBreakdownType must be present but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor OrderBreakdownTypeOrExtendedOrderBreakdownTypeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderBreakdownTypeOrExtendedOrderBreakdownTypeRule";
			definition = "Either OrderBreakdownType Or ExtendedOrderBreakdownType must be present but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1.mmOrderBreakdownType, com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1.mmExtendedOrderBreakdownType);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1.mmOrderBreakdownType, com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1.mmExtendedOrderBreakdownType,
						com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1.mmAmount);
				trace_lazy = () -> InvestmentFundOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "InvestmentFundsOrderBreakdown1";
				definition = "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, eg, other assets, into or out of an investment fund.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentFundsOrderBreakdown2.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundsOrderBreakdown1.OrderBreakdownTypeOrExtendedOrderBreakdownTypeRule);
			}
		});
		return mmObject_lazy.get();
	}

	public FundOrderType5Code getOrderBreakdownType() {
		return orderBreakdownType;
	}

	public InvestmentFundsOrderBreakdown1 setOrderBreakdownType(FundOrderType5Code orderBreakdownType) {
		this.orderBreakdownType = Objects.requireNonNull(orderBreakdownType);
		return this;
	}

	public Extended350Code getExtendedOrderBreakdownType() {
		return extendedOrderBreakdownType;
	}

	public InvestmentFundsOrderBreakdown1 setExtendedOrderBreakdownType(Extended350Code extendedOrderBreakdownType) {
		this.extendedOrderBreakdownType = Objects.requireNonNull(extendedOrderBreakdownType);
		return this;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public InvestmentFundsOrderBreakdown1 setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}
}