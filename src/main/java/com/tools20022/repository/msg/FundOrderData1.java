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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrument10;
import com.tools20022.repository.msg.FinancialInstrumentQuantity1;
import com.tools20022.repository.msg.InvestmentAccount13;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Extract of trade data for an investment fund order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmInvestmentAccountDetails
 * FundOrderData1.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmFinancialInstrumentDetails
 * FundOrderData1.mmFinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData1#mmUnitsNumber
 * FundOrderData1.mmUnitsNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData1#mmNetAmount
 * FundOrderData1.mmNetAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData1#mmGrossAmount
 * FundOrderData1.mmGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmHoldingsRedemptionRate
 * FundOrderData1.mmHoldingsRedemptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmSettlementAmount
 * FundOrderData1.mmSettlementAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData1#mmUnitCurrency
 * FundOrderData1.mmUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmQuotedCurrency
 * FundOrderData1.mmQuotedCurrency}</li>
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
 * "FundOrderData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extract of trade data for an investment fund order."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData5 FundOrderData5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundOrderData1", propOrder = {"investmentAccountDetails", "financialInstrumentDetails", "unitsNumber", "netAmount", "grossAmount", "holdingsRedemptionRate", "settlementAmount", "unitCurrency", "quotedCurrency"})
public class FundOrderData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InvstmtAcctDtls")
	protected InvestmentAccount13 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount13
	 * InvestmentAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1 FundOrderData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account information of the individual order instruction for which the status is given."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmInvestmentAccountDetails
	 * FundOrderData5.mmInvestmentAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundOrderData1, Optional<InvestmentAccount13>> mmInvestmentAccountDetails = new MMMessageAssociationEnd<FundOrderData1, Optional<InvestmentAccount13>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account information of the individual order instruction for which the status is given.";
			nextVersions_lazy = () -> Arrays.asList(FundOrderData5.mmInvestmentAccountDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccount13.mmObject();
		}

		@Override
		public Optional<InvestmentAccount13> getValue(FundOrderData1 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(FundOrderData1 obj, Optional<InvestmentAccount13> value) {
			obj.setInvestmentAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmDtls")
	protected FinancialInstrument10 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument10
	 * FinancialInstrument10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1 FundOrderData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument information of the individual order instruction for which the status is given."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmFinancialInstrumentDetails
	 * FundOrderData5.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundOrderData1, Optional<FinancialInstrument10>> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<FundOrderData1, Optional<FinancialInstrument10>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Financial instrument information of the individual order instruction for which the status is given.";
			nextVersions_lazy = () -> Arrays.asList(FundOrderData5.mmFinancialInstrumentDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrument10.mmObject();
		}

		@Override
		public Optional<FinancialInstrument10> getValue(FundOrderData1 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(FundOrderData1 obj, Optional<FinancialInstrument10> value) {
			obj.setFinancialInstrumentDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitsNb")
	protected FinancialInstrumentQuantity1 unitsNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
	 * InvestmentFundOrder.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1 FundOrderData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of investment fund units subscribed or redeemed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmUnitsNumber
	 * FundOrderData5.mmUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundOrderData1, Optional<FinancialInstrumentQuantity1>> mmUnitsNumber = new MMMessageAttribute<FundOrderData1, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData1.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Quantity of investment fund units subscribed or redeemed.";
			nextVersions_lazy = () -> Arrays.asList(FundOrderData5.mmUnitsNumber);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(FundOrderData1 obj) {
			return obj.getUnitsNumber();
		}

		@Override
		public void setValue(FundOrderData1 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setUnitsNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "NetAmt")
	protected ActiveOrHistoricCurrencyAndAmount netAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmNetAmount
	 * InvestmentFundOrder.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1 FundOrderData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to derive the quantity of investment fund units to be sold or subscribed to."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData5#mmNetAmount
	 * FundOrderData5.mmNetAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundOrderData1, Optional<ActiveOrHistoricCurrencyAndAmount>> mmNetAmount = new MMMessageAttribute<FundOrderData1, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmNetAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData1.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Amount of money used to derive the quantity of investment fund units to be sold or subscribed to.";
			nextVersions_lazy = () -> Arrays.asList(FundOrderData5.mmNetAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(FundOrderData1 obj) {
			return obj.getNetAmount();
		}

		@Override
		public void setValue(FundOrderData1 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setNetAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "GrssAmt")
	protected ActiveOrHistoricCurrencyAndAmount grossAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmount
	 * InvestmentFundOrder.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1 FundOrderData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to derive the quantity of investment fund units to be sold or subscribed to, including all charges, commissions, and tax."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmGrossAmount
	 * FundOrderData5.mmGrossAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundOrderData1, Optional<ActiveOrHistoricCurrencyAndAmount>> mmGrossAmount = new MMMessageAttribute<FundOrderData1, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmGrossAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData1.mmObject();
			isDerived = false;
			xmlTag = "GrssAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			definition = "Amount of money used to derive the quantity of investment fund units to be sold or subscribed to, including all charges, commissions, and tax.";
			nextVersions_lazy = () -> Arrays.asList(FundOrderData5.mmGrossAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(FundOrderData1 obj) {
			return obj.getGrossAmount();
		}

		@Override
		public void setValue(FundOrderData1 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setGrossAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "HldgsRedRate")
	protected PercentageRate holdingsRedemptionRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionOrder#mmHoldingsRedemptionRate
	 * RedemptionOrder.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1 FundOrderData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgsRedRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsRedemptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the investor's holdings, in a specific investment fund/ fund class, that is redeemed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmHoldingsRedemptionRate
	 * FundOrderData5.mmHoldingsRedemptionRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundOrderData1, Optional<PercentageRate>> mmHoldingsRedemptionRate = new MMMessageAttribute<FundOrderData1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> RedemptionOrder.mmHoldingsRedemptionRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData1.mmObject();
			isDerived = false;
			xmlTag = "HldgsRedRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingsRedemptionRate";
			definition = "Portion of the investor's holdings, in a specific investment fund/ fund class, that is redeemed.";
			nextVersions_lazy = () -> Arrays.asList(FundOrderData5.mmHoldingsRedemptionRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(FundOrderData1 obj) {
			return obj.getHoldingsRedemptionRate();
		}

		@Override
		public void setValue(FundOrderData1 obj, Optional<PercentageRate> value) {
			obj.setHoldingsRedemptionRate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAmt")
	protected ActiveCurrencyAndAmount settlementAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1 FundOrderData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmSettlementAmount
	 * FundOrderData5.mmSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundOrderData1, Optional<ActiveCurrencyAndAmount>> mmSettlementAmount = new MMMessageAttribute<FundOrderData1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData1.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order.";
			nextVersions_lazy = () -> Arrays.asList(FundOrderData5.mmSettlementAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(FundOrderData1 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(FundOrderData1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitCcy")
	protected ActiveOrHistoricCurrencyCode unitCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmUnitCurrency
	 * CurrencyExchange.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1 FundOrderData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmUnitCurrency
	 * FundOrderData5.mmUnitCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundOrderData1, Optional<ActiveOrHistoricCurrencyCode>> mmUnitCurrency = new MMMessageAttribute<FundOrderData1, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmUnitCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData1.mmObject();
			isDerived = false;
			xmlTag = "UnitCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			nextVersions_lazy = () -> Arrays.asList(FundOrderData5.mmUnitCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(FundOrderData1 obj) {
			return obj.getUnitCurrency();
		}

		@Override
		public void setValue(FundOrderData1 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setUnitCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "QtdCcy")
	protected ActiveOrHistoricCurrencyCode quotedCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotedCurrency
	 * CurrencyExchange.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1 FundOrderData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtdCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotedCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the base currency is converted, in a currency exchange."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmQuotedCurrency
	 * FundOrderData5.mmQuotedCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundOrderData1, Optional<ActiveOrHistoricCurrencyCode>> mmQuotedCurrency = new MMMessageAttribute<FundOrderData1, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmQuotedCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData1.mmObject();
			isDerived = false;
			xmlTag = "QtdCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			nextVersions_lazy = () -> Arrays.asList(FundOrderData5.mmQuotedCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(FundOrderData1 obj) {
			return obj.getQuotedCurrency();
		}

		@Override
		public void setValue(FundOrderData1 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setQuotedCurrency(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundOrderData1.mmInvestmentAccountDetails, com.tools20022.repository.msg.FundOrderData1.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.FundOrderData1.mmUnitsNumber, com.tools20022.repository.msg.FundOrderData1.mmNetAmount, com.tools20022.repository.msg.FundOrderData1.mmGrossAmount,
						com.tools20022.repository.msg.FundOrderData1.mmHoldingsRedemptionRate, com.tools20022.repository.msg.FundOrderData1.mmSettlementAmount, com.tools20022.repository.msg.FundOrderData1.mmUnitCurrency,
						com.tools20022.repository.msg.FundOrderData1.mmQuotedCurrency);
				trace_lazy = () -> InvestmentFundOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundOrderData1";
				definition = "Extract of trade data for an investment fund order.";
				nextVersions_lazy = () -> Arrays.asList(FundOrderData5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<InvestmentAccount13> getInvestmentAccountDetails() {
		return investmentAccountDetails == null ? Optional.empty() : Optional.of(investmentAccountDetails);
	}

	public FundOrderData1 setInvestmentAccountDetails(InvestmentAccount13 investmentAccountDetails) {
		this.investmentAccountDetails = investmentAccountDetails;
		return this;
	}

	public Optional<FinancialInstrument10> getFinancialInstrumentDetails() {
		return financialInstrumentDetails == null ? Optional.empty() : Optional.of(financialInstrumentDetails);
	}

	public FundOrderData1 setFinancialInstrumentDetails(FinancialInstrument10 financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getUnitsNumber() {
		return unitsNumber == null ? Optional.empty() : Optional.of(unitsNumber);
	}

	public FundOrderData1 setUnitsNumber(FinancialInstrumentQuantity1 unitsNumber) {
		this.unitsNumber = unitsNumber;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getNetAmount() {
		return netAmount == null ? Optional.empty() : Optional.of(netAmount);
	}

	public FundOrderData1 setNetAmount(ActiveOrHistoricCurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getGrossAmount() {
		return grossAmount == null ? Optional.empty() : Optional.of(grossAmount);
	}

	public FundOrderData1 setGrossAmount(ActiveOrHistoricCurrencyAndAmount grossAmount) {
		this.grossAmount = grossAmount;
		return this;
	}

	public Optional<PercentageRate> getHoldingsRedemptionRate() {
		return holdingsRedemptionRate == null ? Optional.empty() : Optional.of(holdingsRedemptionRate);
	}

	public FundOrderData1 setHoldingsRedemptionRate(PercentageRate holdingsRedemptionRate) {
		this.holdingsRedemptionRate = holdingsRedemptionRate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public FundOrderData1 setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getUnitCurrency() {
		return unitCurrency == null ? Optional.empty() : Optional.of(unitCurrency);
	}

	public FundOrderData1 setUnitCurrency(ActiveOrHistoricCurrencyCode unitCurrency) {
		this.unitCurrency = unitCurrency;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getQuotedCurrency() {
		return quotedCurrency == null ? Optional.empty() : Optional.of(quotedCurrency);
	}

	public FundOrderData1 setQuotedCurrency(ActiveOrHistoricCurrencyCode quotedCurrency) {
		this.quotedCurrency = quotedCurrency;
		return this;
	}
}