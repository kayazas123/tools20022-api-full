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
import com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.IncomePreference1Code;
import com.tools20022.repository.datatype.Max35Text;
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
 * Subscription leg, or switch-in, of a switch order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmLegIdentification
 * SwitchSubscriptionLegOrder2.mmLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmFinancialInstrumentDetails
 * SwitchSubscriptionLegOrder2.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmFinancialInstrumentQuantityChoice
 * SwitchSubscriptionLegOrder2.mmFinancialInstrumentQuantityChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmIncomePreference
 * SwitchSubscriptionLegOrder2.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmRequestedSettlementCurrency
 * SwitchSubscriptionLegOrder2.mmRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmRequestedNAVCurrency
 * SwitchSubscriptionLegOrder2.mmRequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmChargeDetails
 * SwitchSubscriptionLegOrder2.mmChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmCommissionDetails
 * SwitchSubscriptionLegOrder2.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmTaxDetails
 * SwitchSubscriptionLegOrder2.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmSettlementAndCustodyDetails
 * SwitchSubscriptionLegOrder2.mmSettlementAndCustodyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmPhysicalDeliveryIndicator
 * SwitchSubscriptionLegOrder2.mmPhysicalDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmPhysicalDeliveryDetails
 * SwitchSubscriptionLegOrder2.mmPhysicalDeliveryDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg
 * SwitchSubscriptionLeg}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SwitchSubscriptionLegOrder2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Subscription leg, or switch-in, of a switch order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetailsRule#forSwitchSubscriptionLegOrder2
 * ConstraintPhysicalDeliveryDetailsRule.forSwitchSubscriptionLegOrder2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SwitchSubscriptionLegOrder2", propOrder = {"legIdentification", "financialInstrumentDetails", "financialInstrumentQuantityChoice", "incomePreference", "requestedSettlementCurrency", "requestedNAVCurrency", "chargeDetails",
		"commissionDetails", "taxDetails", "settlementAndCustodyDetails", "physicalDeliveryIndicator", "physicalDeliveryDetails"})
public class SwitchSubscriptionLegOrder2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LegId")
	protected Max35Text legIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2
	 * SwitchSubscriptionLegOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique technical identifier for an instance of a leg within a switch."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchSubscriptionLegOrder2, Optional<Max35Text>> mmLegIdentification = new MMMessageAttribute<SwitchSubscriptionLegOrder2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmObject();
			isDerived = false;
			xmlTag = "LegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegIdentification";
			definition = "Unique technical identifier for an instance of a leg within a switch.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SwitchSubscriptionLegOrder2 obj) {
			return obj.getLegIdentification();
		}

		@Override
		public void setValue(SwitchSubscriptionLegOrder2 obj, Optional<Max35Text> value) {
			obj.setLegIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected FinancialInstrument6 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument6
	 * FinancialInstrument6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2
	 * SwitchSubscriptionLegOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund class related to an order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchSubscriptionLegOrder2, FinancialInstrument6> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<SwitchSubscriptionLegOrder2, FinancialInstrument6>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class related to an order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrument6.mmObject();
		}

		@Override
		public FinancialInstrument6 getValue(SwitchSubscriptionLegOrder2 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(SwitchSubscriptionLegOrder2 obj, FinancialInstrument6 value) {
			obj.setFinancialInstrumentDetails(value);
		}
	};
	@XmlElement(name = "FinInstrmQtyChc")
	protected FinancialInstrumentQuantity4Choice financialInstrumentQuantityChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice
	 * FinancialInstrumentQuantity4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
	 * InvestmentFundOrder.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2
	 * SwitchSubscriptionLegOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmQtyChc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantityChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund class related to an order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchSubscriptionLegOrder2, Optional<FinancialInstrumentQuantity4Choice>> mmFinancialInstrumentQuantityChoice = new MMMessageAssociationEnd<SwitchSubscriptionLegOrder2, Optional<FinancialInstrumentQuantity4Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmQtyChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantityChoice";
			definition = "Investment fund class related to an order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity4Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity4Choice> getValue(SwitchSubscriptionLegOrder2 obj) {
			return obj.getFinancialInstrumentQuantityChoice();
		}

		@Override
		public void setValue(SwitchSubscriptionLegOrder2 obj, Optional<FinancialInstrumentQuantity4Choice> value) {
			obj.setFinancialInstrumentQuantityChoice(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmPref")
	protected IncomePreference1Code incomePreference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreference1Code
	 * IncomePreference1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
	 * InvestmentAccountService.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2
	 * SwitchSubscriptionLegOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPref"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchSubscriptionLegOrder2, Optional<IncomePreference1Code>> mmIncomePreference = new MMMessageAttribute<SwitchSubscriptionLegOrder2, Optional<IncomePreference1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}

		@Override
		public Optional<IncomePreference1Code> getValue(SwitchSubscriptionLegOrder2 obj) {
			return obj.getIncomePreference();
		}

		@Override
		public void setValue(SwitchSubscriptionLegOrder2 obj, Optional<IncomePreference1Code> value) {
			obj.setIncomePreference(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdSttlmCcy")
	protected CurrencyCode requestedSettlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedSettlementCurrency
	 * InvestmentFundOrder.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2
	 * SwitchSubscriptionLegOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdSttlmCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency requested for settlement of cash proceeds."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchSubscriptionLegOrder2, Optional<CurrencyCode>> mmRequestedSettlementCurrency = new MMMessageAttribute<SwitchSubscriptionLegOrder2, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRequestedSettlementCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrency";
			definition = "Currency requested for settlement of cash proceeds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(SwitchSubscriptionLegOrder2 obj) {
			return obj.getRequestedSettlementCurrency();
		}

		@Override
		public void setValue(SwitchSubscriptionLegOrder2 obj, Optional<CurrencyCode> value) {
			obj.setRequestedSettlementCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdNAVCcy")
	protected CurrencyCode requestedNAVCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmRequestedNAVCurrency
	 * InvestmentFundClass.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2
	 * SwitchSubscriptionLegOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdNAVCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedNAVCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchSubscriptionLegOrder2, Optional<CurrencyCode>> mmRequestedNAVCurrency = new MMMessageAttribute<SwitchSubscriptionLegOrder2, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmRequestedNAVCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmObject();
			isDerived = false;
			xmlTag = "ReqdNAVCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedNAVCurrency";
			definition = "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(SwitchSubscriptionLegOrder2 obj) {
			return obj.getRequestedNAVCurrency();
		}

		@Override
		public void setValue(SwitchSubscriptionLegOrder2 obj, Optional<CurrencyCode> value) {
			obj.setRequestedNAVCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgDtls")
	protected List<Charge8> chargeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge8 Charge8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
	 * InvestmentFundTransaction.mmTransactionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2
	 * SwitchSubscriptionLegOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money associated with a service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchSubscriptionLegOrder2, List<Charge8>> mmChargeDetails = new MMMessageAssociationEnd<SwitchSubscriptionLegOrder2, List<Charge8>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmObject();
			isDerived = false;
			xmlTag = "ChrgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeDetails";
			definition = "Amount of money associated with a service.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charge8.mmObject();
		}

		@Override
		public List<Charge8> getValue(SwitchSubscriptionLegOrder2 obj) {
			return obj.getChargeDetails();
		}

		@Override
		public void setValue(SwitchSubscriptionLegOrder2 obj, List<Charge8> value) {
			obj.setChargeDetails(value);
		}
	};
	@XmlElement(name = "ComssnDtls")
	protected List<Commission6> commissionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission6
	 * Commission6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
	 * Trade.mmTradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2
	 * SwitchSubscriptionLegOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission linked to the execution of an investment fund order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchSubscriptionLegOrder2, List<Commission6>> mmCommissionDetails = new MMMessageAssociationEnd<SwitchSubscriptionLegOrder2, List<Commission6>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Commission linked to the execution of an investment fund order.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Commission6.mmObject();
		}

		@Override
		public List<Commission6> getValue(SwitchSubscriptionLegOrder2 obj) {
			return obj.getCommissionDetails();
		}

		@Override
		public void setValue(SwitchSubscriptionLegOrder2 obj, List<Commission6> value) {
			obj.setCommissionDetails(value);
		}
	};
	@XmlElement(name = "TaxDtls")
	protected List<Tax6> taxDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax6 Tax6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionTax
	 * InvestmentFundTransaction.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2
	 * SwitchSubscriptionLegOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax related to an investment fund order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchSubscriptionLegOrder2, List<Tax6>> mmTaxDetails = new MMMessageAssociationEnd<SwitchSubscriptionLegOrder2, List<Tax6>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmObject();
			isDerived = false;
			xmlTag = "TaxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDetails";
			definition = "Tax related to an investment fund order.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax6.mmObject();
		}

		@Override
		public List<Tax6> getValue(SwitchSubscriptionLegOrder2 obj) {
			return obj.getTaxDetails();
		}

		@Override
		public void setValue(SwitchSubscriptionLegOrder2 obj, List<Tax6> value) {
			obj.setTaxDetails(value);
		}
	};
	@XmlElement(name = "SttlmAndCtdyDtls")
	protected FundSettlementParameters4 settlementAndCustodyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4
	 * FundSettlementParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmRelatedSettlement
	 * SecuritiesTransfer.mmRelatedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2
	 * SwitchSubscriptionLegOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAndCtdyDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAndCustodyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters used to execute the settlement of an investment fund order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchSubscriptionLegOrder2, Optional<FundSettlementParameters4>> mmSettlementAndCustodyDetails = new MMMessageAssociationEnd<SwitchSubscriptionLegOrder2, Optional<FundSettlementParameters4>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmRelatedSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmObject();
			isDerived = false;
			xmlTag = "SttlmAndCtdyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAndCustodyDetails";
			definition = "Parameters used to execute the settlement of an investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundSettlementParameters4.mmObject();
		}

		@Override
		public Optional<FundSettlementParameters4> getValue(SwitchSubscriptionLegOrder2 obj) {
			return obj.getSettlementAndCustodyDetails();
		}

		@Override
		public void setValue(SwitchSubscriptionLegOrder2 obj, Optional<FundSettlementParameters4> value) {
			obj.setSettlementAndCustodyDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PhysDlvryInd", required = true)
	protected YesNoIndicator physicalDeliveryIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2
	 * SwitchSubscriptionLegOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysDlvryInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument is to be physically delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchSubscriptionLegOrder2, YesNoIndicator> mmPhysicalDeliveryIndicator = new MMMessageAttribute<SwitchSubscriptionLegOrder2, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryIndicator";
			definition = "Indicates whether the financial instrument is to be physically delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SwitchSubscriptionLegOrder2 obj) {
			return obj.getPhysicalDeliveryIndicator();
		}

		@Override
		public void setValue(SwitchSubscriptionLegOrder2 obj, YesNoIndicator value) {
			obj.setPhysicalDeliveryIndicator(value);
		}
	};
	@XmlElement(name = "PhysDlvryDtls")
	protected NameAndAddress4 physicalDeliveryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress4
	 * NameAndAddress4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmAddress
	 * PhysicalDelivery.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2
	 * SwitchSubscriptionLegOrder2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysDlvryDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to physical delivery of the securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchSubscriptionLegOrder2, Optional<NameAndAddress4>> mmPhysicalDeliveryDetails = new MMMessageAssociationEnd<SwitchSubscriptionLegOrder2, Optional<NameAndAddress4>>() {
		{
			businessElementTrace_lazy = () -> PhysicalDelivery.mmAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetails";
			definition = "Information related to physical delivery of the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NameAndAddress4.mmObject();
		}

		@Override
		public Optional<NameAndAddress4> getValue(SwitchSubscriptionLegOrder2 obj) {
			return obj.getPhysicalDeliveryDetails();
		}

		@Override
		public void setValue(SwitchSubscriptionLegOrder2 obj, Optional<NameAndAddress4> value) {
			obj.setPhysicalDeliveryDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmLegIdentification, com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmFinancialInstrumentQuantityChoice, com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmIncomePreference,
						com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmRequestedSettlementCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmRequestedNAVCurrency,
						com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmChargeDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmCommissionDetails,
						com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmTaxDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmSettlementAndCustodyDetails,
						com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmPhysicalDeliveryIndicator, com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.mmPhysicalDeliveryDetails);
				trace_lazy = () -> SwitchSubscriptionLeg.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetailsRule.forSwitchSubscriptionLegOrder2);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SwitchSubscriptionLegOrder2";
				definition = "Subscription leg, or switch-in, of a switch order.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getLegIdentification() {
		return legIdentification == null ? Optional.empty() : Optional.of(legIdentification);
	}

	public SwitchSubscriptionLegOrder2 setLegIdentification(Max35Text legIdentification) {
		this.legIdentification = legIdentification;
		return this;
	}

	public FinancialInstrument6 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public SwitchSubscriptionLegOrder2 setFinancialInstrumentDetails(FinancialInstrument6 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public Optional<FinancialInstrumentQuantity4Choice> getFinancialInstrumentQuantityChoice() {
		return financialInstrumentQuantityChoice == null ? Optional.empty() : Optional.of(financialInstrumentQuantityChoice);
	}

	public SwitchSubscriptionLegOrder2 setFinancialInstrumentQuantityChoice(FinancialInstrumentQuantity4Choice financialInstrumentQuantityChoice) {
		this.financialInstrumentQuantityChoice = financialInstrumentQuantityChoice;
		return this;
	}

	public Optional<IncomePreference1Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public SwitchSubscriptionLegOrder2 setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public Optional<CurrencyCode> getRequestedSettlementCurrency() {
		return requestedSettlementCurrency == null ? Optional.empty() : Optional.of(requestedSettlementCurrency);
	}

	public SwitchSubscriptionLegOrder2 setRequestedSettlementCurrency(CurrencyCode requestedSettlementCurrency) {
		this.requestedSettlementCurrency = requestedSettlementCurrency;
		return this;
	}

	public Optional<CurrencyCode> getRequestedNAVCurrency() {
		return requestedNAVCurrency == null ? Optional.empty() : Optional.of(requestedNAVCurrency);
	}

	public SwitchSubscriptionLegOrder2 setRequestedNAVCurrency(CurrencyCode requestedNAVCurrency) {
		this.requestedNAVCurrency = requestedNAVCurrency;
		return this;
	}

	public List<Charge8> getChargeDetails() {
		return chargeDetails == null ? chargeDetails = new ArrayList<>() : chargeDetails;
	}

	public SwitchSubscriptionLegOrder2 setChargeDetails(List<Charge8> chargeDetails) {
		this.chargeDetails = Objects.requireNonNull(chargeDetails);
		return this;
	}

	public List<Commission6> getCommissionDetails() {
		return commissionDetails == null ? commissionDetails = new ArrayList<>() : commissionDetails;
	}

	public SwitchSubscriptionLegOrder2 setCommissionDetails(List<Commission6> commissionDetails) {
		this.commissionDetails = Objects.requireNonNull(commissionDetails);
		return this;
	}

	public List<Tax6> getTaxDetails() {
		return taxDetails == null ? taxDetails = new ArrayList<>() : taxDetails;
	}

	public SwitchSubscriptionLegOrder2 setTaxDetails(List<Tax6> taxDetails) {
		this.taxDetails = Objects.requireNonNull(taxDetails);
		return this;
	}

	public Optional<FundSettlementParameters4> getSettlementAndCustodyDetails() {
		return settlementAndCustodyDetails == null ? Optional.empty() : Optional.of(settlementAndCustodyDetails);
	}

	public SwitchSubscriptionLegOrder2 setSettlementAndCustodyDetails(FundSettlementParameters4 settlementAndCustodyDetails) {
		this.settlementAndCustodyDetails = settlementAndCustodyDetails;
		return this;
	}

	public YesNoIndicator getPhysicalDeliveryIndicator() {
		return physicalDeliveryIndicator;
	}

	public SwitchSubscriptionLegOrder2 setPhysicalDeliveryIndicator(YesNoIndicator physicalDeliveryIndicator) {
		this.physicalDeliveryIndicator = Objects.requireNonNull(physicalDeliveryIndicator);
		return this;
	}

	public Optional<NameAndAddress4> getPhysicalDeliveryDetails() {
		return physicalDeliveryDetails == null ? Optional.empty() : Optional.of(physicalDeliveryDetails);
	}

	public SwitchSubscriptionLegOrder2 setPhysicalDeliveryDetails(NameAndAddress4 physicalDeliveryDetails) {
		this.physicalDeliveryDetails = physicalDeliveryDetails;
		return this;
	}
}