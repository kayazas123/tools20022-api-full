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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.PaymentPurposeCode;
import com.tools20022.repository.codeset.RemittanceLocationMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Obligation for the debtor to pay the creditor an amount of cash.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PaymentObligation" src="doc-files/PaymentObligation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Obligation
 * Obligation}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
 * PaymentObligation.mmPaymentOffset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#mmPurpose
 * PaymentObligation.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRemittanceDeliveryMethod
 * PaymentObligation.mmRemittanceDeliveryMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
 * PaymentObligation.mmAssociatedDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
 * PaymentObligation.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRemittanceLocation
 * PaymentObligation.mmRemittanceLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmInterest
 * PaymentObligation.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmCommercialTrade
 * PaymentObligation.mmCommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPercentage
 * PaymentObligation.mmPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmMaximumAmount
 * PaymentObligation.mmMaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExpiryDate
 * PaymentObligation.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmApplicableLaw
 * PaymentObligation.mmApplicableLaw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceBuyIn
 * PaymentObligation.mmPaymentSourceBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedCorporateAction
 * PaymentObligation.mmRelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedCollateralMovement
 * PaymentObligation.mmRelatedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceUndertakingDemand
 * PaymentObligation.mmPaymentSourceUndertakingDemand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPartyRole
 * PaymentObligation.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExecutedSecuritiesTrade
 * PaymentObligation.mmExecutedSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedAccountClosingTerms
 * PaymentObligation.mmRelatedAccountClosingTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourcePortfolioTransfer
 * PaymentObligation.mmPaymentSourcePortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourceCurrencyOption
 * PaymentObligation.mmPaymentSourceCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmExchangeRateInformation
 * PaymentObligation.mmExchangeRateInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmDividend
 * PaymentObligation.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRepurchaseAgreement
 * PaymentObligation.mmRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedAssignment
 * PaymentObligation.mmRelatedAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmBankingTransaction
 * PaymentObligation.mmBankingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentTerms
 * PaymentObligation.mmPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentDueDate
 * PaymentObligation.mmPaymentDueDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmObligation
 * Dividend.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRemittanceRelatedPayment
 * ContactPoint.mmRemittanceRelatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Document#mmPaymentObligation
 * Document.mmPaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmPaymentObligation
 * Payment.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmPaymentObligation
 * PortfolioTransfer.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmBalanceTransfer
 * CashAccountContract.mmBalanceTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmPaymentObligation
 * SecuritiesTradeExecution.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmResultingSettlement
 * ForeignExchangeTrade.mmResultingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmCashProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole#mmPaymentObligation
 * PaymentObligationPartyRole.mmPaymentObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Demand#mmPayment
 * Demand.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmPremiumSettlement
 * CurrencyOption.mmPremiumSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPaymentObligation
 * CommercialTrade.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmCashCollateralMovement
 * CollateralMovement.mmCashCollateralMovement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#mmCashCompensation
 * BuyIn.mmCashCompensation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmPaymentObligation
 * BankingTransaction.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RepurchaseAgreement#mmPaymentObligation
 * RepurchaseAgreement.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Assignment#mmPaymentObligation
 * Assignment.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmRelatedPaymentObligation
 * PaymentTerms.mmRelatedPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmPaymentObligation
 * InterestManagement.mmPaymentObligation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmPaymentTerms
 * PaymentObligation1.mmPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmPaymentTerms
 * PaymentObligation2.mmPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceTransferReference1#mmBalanceTransferReference
 * BalanceTransferReference1.mmBalanceTransferReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Garnishment Garnishment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Purpose1Choice
 * Purpose1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Purpose2Choice
 * Purpose2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PurposeChoice PurposeChoice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementData1
 * SettlementData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementData2
 * SettlementData2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms3 PaymentTerms3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms1 PaymentTerms1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms2 PaymentTerms2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentObligation1
 * PaymentObligation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentObligation2
 * PaymentObligation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms4 PaymentTerms4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms5 PaymentTerms5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Purpose3Choice
 * Purpose3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms6 PaymentTerms6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CreditLineType1Choice
 * CreditLineType1Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentObligation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Obligation for the debtor to pay the creditor an amount of cash."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class PaymentObligation extends Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Payment> paymentOffset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentObligation
	 * Payment.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan2#mmCashSettlement
	 * InvestmentPlan2.mmCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan4#mmCashSettlement
	 * InvestmentPlan4.mmCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan6#mmCashSettlement
	 * InvestmentPlan6.mmCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan5#mmModifiedCashSettlement
	 * InvestmentPlan5.mmModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan3#mmModifiedCashSettlement
	 * InvestmentPlan3.mmModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmModifiedCashSettlement
	 * InvestmentPlan7.mmModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder3#mmCashSettlementDetails
	 * RedemptionOrder3.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder5#mmCashSettlementDetails
	 * RedemptionOrder5.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution3#mmCashSettlementDetails
	 * RedemptionExecution3.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution5#mmCashSettlementDetails
	 * RedemptionExecution5.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder7#mmCashSettlementDetails
	 * RedemptionOrder7.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder4#mmCashSettlementDetails
	 * RedemptionOrder4.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder6#mmCashSettlementDetails
	 * RedemptionOrder6.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution4#mmCashSettlementDetails
	 * RedemptionExecution4.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution6#mmCashSettlementDetails
	 * RedemptionExecution6.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder8#mmCashSettlementDetails
	 * RedemptionOrder8.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmCashSettlementDetails
	 * SubscriptionOrder3.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmCashSettlementDetails
	 * SubscriptionOrder5.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution3#mmCashSettlementDetails
	 * SubscriptionExecution3.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution5#mmCashSettlementDetails
	 * SubscriptionExecution5.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmCashSettlementDetails
	 * SubscriptionOrder7.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmCashSettlementDetails
	 * SubscriptionOrder4.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmCashSettlementDetails
	 * SubscriptionOrder6.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution4#mmCashSettlementDetails
	 * SubscriptionExecution4.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution6#mmCashSettlementDetails
	 * SubscriptionExecution6.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmCashSettlementDetails
	 * SubscriptionOrder8.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder2#mmCashSettlementDetails
	 * SwitchOrder2.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder3#mmCashSettlementDetails
	 * SwitchOrder3.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmCashSettlementDetails
	 * SwitchExecution3.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmCashSettlementDetails
	 * SwitchExecution4.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder4#mmCashSettlementDetails
	 * SwitchOrder4.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder11#mmCashSettlementDetails
	 * RedemptionOrder11.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution12#mmCashSettlementDetails
	 * RedemptionExecution12.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder11#mmCashSettlementDetails
	 * SubscriptionOrder11.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution9#mmCashSettlementDetails
	 * SubscriptionExecution9.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan9#mmCashSettlement
	 * InvestmentPlan9.mmCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmModifiedCashSettlement
	 * InvestmentPlan8.mmModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms4#mmPaymentTerms
	 * PaymentTerms4.mmPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms5#mmPaymentTerms
	 * PaymentTerms5.mmPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmCashSettlement
	 * InvestmentPlan10.mmCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmModifiedCashSettlement
	 * InvestmentPlan11.mmModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instalment2#mmPaymentInstrument
	 * Instalment2.mmPaymentInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmCashSettlement
	 * InvestmentPlan12.mmCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmModifiedCashSettlement
	 * InvestmentPlan13.mmModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmCashSettlement
	 * InvestmentPlan14.mmCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmCashSettlementDetails
	 * SwitchExecution7.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmCashSettlementDetails
	 * SwitchOrder7.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmCashSettlementDetails
	 * RedemptionOrder14.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmModifiedCashSettlement
	 * InvestmentPlan15.mmModifiedCashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmCashSettlementDetails
	 * SubscriptionExecution13.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmCashSettlementDetails
	 * SubscriptionExecution12.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmCashSettlementDetails
	 * SubscriptionOrder15.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmCashSettlementDetails
	 * RedemptionOrder15.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmCashSettlementDetails
	 * RedemptionExecution16.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmCashSettlementDetails
	 * SubscriptionOrder14.mmCashSettlementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmCashSettlementDetails
	 * RedemptionExecution15.mmCashSettlementDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOffset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fulfilment of a payment obligation through a payment and its execution. It is derived from the association between Obligation and Obligation fulfillment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, List<Payment>> mmPaymentOffset = new MMBusinessAssociationEnd<PaymentObligation, List<Payment>>() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentPlan2.mmCashSettlement, InvestmentPlan4.mmCashSettlement, InvestmentPlan6.mmCashSettlement, InvestmentPlan5.mmModifiedCashSettlement, InvestmentPlan3.mmModifiedCashSettlement,
					InvestmentPlan7.mmModifiedCashSettlement, RedemptionOrder3.mmCashSettlementDetails, RedemptionOrder5.mmCashSettlementDetails, RedemptionExecution3.mmCashSettlementDetails, RedemptionExecution5.mmCashSettlementDetails,
					RedemptionOrder7.mmCashSettlementDetails, RedemptionOrder4.mmCashSettlementDetails, RedemptionOrder6.mmCashSettlementDetails, RedemptionExecution4.mmCashSettlementDetails, RedemptionExecution6.mmCashSettlementDetails,
					RedemptionOrder8.mmCashSettlementDetails, SubscriptionOrder3.mmCashSettlementDetails, SubscriptionOrder5.mmCashSettlementDetails, SubscriptionExecution3.mmCashSettlementDetails,
					SubscriptionExecution5.mmCashSettlementDetails, SubscriptionOrder7.mmCashSettlementDetails, SubscriptionOrder4.mmCashSettlementDetails, SubscriptionOrder6.mmCashSettlementDetails,
					SubscriptionExecution4.mmCashSettlementDetails, SubscriptionExecution6.mmCashSettlementDetails, SubscriptionOrder8.mmCashSettlementDetails, SwitchOrder2.mmCashSettlementDetails, SwitchOrder3.mmCashSettlementDetails,
					SwitchExecution3.mmCashSettlementDetails, SwitchExecution4.mmCashSettlementDetails, SwitchOrder4.mmCashSettlementDetails, RedemptionOrder11.mmCashSettlementDetails, RedemptionExecution12.mmCashSettlementDetails,
					SubscriptionOrder11.mmCashSettlementDetails, SubscriptionExecution9.mmCashSettlementDetails, InvestmentPlan9.mmCashSettlement, InvestmentPlan8.mmModifiedCashSettlement, PaymentTerms4.mmPaymentTerms,
					PaymentTerms5.mmPaymentTerms, InvestmentPlan10.mmCashSettlement, InvestmentPlan11.mmModifiedCashSettlement, Instalment2.mmPaymentInstrument, InvestmentPlan12.mmCashSettlement, InvestmentPlan13.mmModifiedCashSettlement,
					InvestmentPlan14.mmCashSettlement, SwitchExecution7.mmCashSettlementDetails, SwitchOrder7.mmCashSettlementDetails, RedemptionOrder14.mmCashSettlementDetails, InvestmentPlan15.mmModifiedCashSettlement,
					SubscriptionExecution13.mmCashSettlementDetails, SubscriptionExecution12.mmCashSettlementDetails, SubscriptionOrder15.mmCashSettlementDetails, RedemptionOrder15.mmCashSettlementDetails,
					RedemptionExecution16.mmCashSettlementDetails, SubscriptionOrder14.mmCashSettlementDetails, RedemptionExecution15.mmCashSettlementDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentOffset";
			definition = "Fulfilment of a payment obligation through a payment and its execution. It is derived from the association between Obligation and Obligation fulfillment.";
			minOccurs = 0;
			opposite_lazy = () -> Payment.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}

		@Override
		public List<Payment> getValue(PaymentObligation obj) {
			return obj.getPaymentOffset();
		}

		@Override
		public void setValue(PaymentObligation obj, List<Payment> value) {
			obj.setPaymentOffset(value);
		}
	};
	protected PaymentPurposeCode purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details#mmPurpose
	 * PaymentInstructionReference2Details.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails5#mmPurpose
	 * PaymentDetails5.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails6#mmPurpose
	 * PaymentDetails6.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentDetails7#mmPurpose
	 * PaymentDetails7.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmPurpose
	 * PaymentInstruction1.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Purpose1Choice#mmCode
	 * Purpose1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Purpose1Choice#mmProprietary
	 * Purpose1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmPurpose
	 * EntryTransaction1.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Purpose2Choice#mmCode
	 * Purpose2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Purpose2Choice#mmProprietary
	 * Purpose2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmPurpose
	 * EntryTransaction2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmPurpose
	 * EntryTransaction3.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmPurpose
	 * EntryTransaction4.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmPurpose
	 * CreditTransferTransactionInformation1.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmPurpose
	 * CreditTransferTransactionInformation10.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmPurpose
	 * CreditTransferTransaction1.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmPurpose
	 * CreditTransferTransaction6.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmPurpose
	 * CreditTransferTransactionInformation2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmPurpose
	 * CreditTransferTransactionInformation11.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmPurpose
	 * CreditTransferTransaction2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmPurpose
	 * CreditTransferTransaction7.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmPurpose
	 * CreditTransferTransactionInformation14.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#mmPurpose
	 * CreditTransferTransaction5.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmPurpose
	 * CreditTransferTransaction10.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PurposeChoice#mmProprietary
	 * PurposeChoice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.PurposeChoice#mmCode
	 * PurposeChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmPurpose
	 * RequestedModification.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#mmPurpose
	 * NotificationItem3.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#mmPurpose
	 * OriginalItemReference1.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmPurpose
	 * PaymentComplementaryInformation2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry1#mmPurpose
	 * StatementResolutionEntry1.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmPurpose
	 * PaymentComplementaryInformation3.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry2#mmPurpose
	 * StatementResolutionEntry2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification3#mmPurpose
	 * RequestedModification3.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#mmPurpose
	 * NotificationItem4.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#mmPurpose
	 * OriginalItemReference2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#mmPurpose
	 * CreditTransferTransactionInformation8.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmPurpose
	 * CreditTransferTransactionInformation7.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmPurpose
	 * CreditTransferTransactionInformation9.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmPurpose
	 * PaymentInstruction14.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Purpose3Choice#mmSecuritiesPurposeCode
	 * Purpose3Choice.mmSecuritiesPurposeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Purpose3Choice#mmProprietary
	 * Purpose3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmPurpose
	 * PaymentComplementaryInformation4.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmPurpose
	 * CreditTransferTransaction19.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#mmPurpose
	 * OriginalItemReference3.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification4#mmPurpose
	 * RequestedModification4.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmPurpose
	 * CreditTransferTransaction20.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#mmPurpose
	 * NotificationItem5.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmPurpose
	 * EntryTransaction7.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmPurpose
	 * CreditTransferTransaction21.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification5#mmPurpose
	 * RequestedModification5.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmPurpose
	 * CreditTransferTransaction25.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmPurpose
	 * PaymentComplementaryInformation5.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmPurpose
	 * CreditTransferTransaction26.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmPurpose
	 * OriginalItemReference4.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmPurpose
	 * CreditTransferTransaction22.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmPurpose
	 * EntryTransaction8.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmPurpose
	 * NotificationItem6.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6#mmPurpose
	 * RequestedModification6.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmPurpose
	 * PaymentComplementaryInformation6.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmPurpose
	 * CreditTransferTransaction27.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmPurpose
	 * PaymentComplementaryInformation7.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequestedModification7#mmPurpose
	 * RequestedModification7.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmPurpose
	 * EntryTransaction9.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmPurpose
	 * OriginalTransactionReference27.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CreditLineType1Choice#mmCode
	 * CreditLineType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CreditLineType1Choice#mmProprietary
	 * CreditLineType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmPurpose
	 * CreditTransferTransaction30.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmPurpose
	 * PaymentInstruction26.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementResolutionEntry3#mmPurpose
	 * StatementResolutionEntry3.mmPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying reason for the payment obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentObligation, PaymentPurposeCode> mmPurpose = new MMBusinessAttribute<PaymentObligation, PaymentPurposeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstructionReference2Details.mmPurpose, PaymentDetails5.mmPurpose, PaymentDetails6.mmPurpose, PaymentDetails7.mmPurpose, PaymentInstruction1.mmPurpose, Purpose1Choice.mmCode,
					Purpose1Choice.mmProprietary, EntryTransaction1.mmPurpose, Purpose2Choice.mmCode, Purpose2Choice.mmProprietary, EntryTransaction2.mmPurpose, EntryTransaction3.mmPurpose, EntryTransaction4.mmPurpose,
					CreditTransferTransactionInformation1.mmPurpose, CreditTransferTransactionInformation10.mmPurpose, CreditTransferTransaction1.mmPurpose, CreditTransferTransaction6.mmPurpose,
					CreditTransferTransactionInformation2.mmPurpose, CreditTransferTransactionInformation11.mmPurpose, CreditTransferTransaction2.mmPurpose, CreditTransferTransaction7.mmPurpose,
					CreditTransferTransactionInformation14.mmPurpose, CreditTransferTransaction5.mmPurpose, CreditTransferTransaction10.mmPurpose, PurposeChoice.mmProprietary, PurposeChoice.mmCode, RequestedModification.mmPurpose,
					NotificationItem3.mmPurpose, OriginalItemReference1.mmPurpose, PaymentComplementaryInformation2.mmPurpose, StatementResolutionEntry1.mmPurpose, PaymentComplementaryInformation3.mmPurpose,
					StatementResolutionEntry2.mmPurpose, RequestedModification3.mmPurpose, NotificationItem4.mmPurpose, OriginalItemReference2.mmPurpose, CreditTransferTransactionInformation8.mmPurpose,
					CreditTransferTransactionInformation7.mmPurpose, CreditTransferTransactionInformation9.mmPurpose, PaymentInstruction14.mmPurpose, Purpose3Choice.mmSecuritiesPurposeCode, Purpose3Choice.mmProprietary,
					PaymentComplementaryInformation4.mmPurpose, CreditTransferTransaction19.mmPurpose, OriginalItemReference3.mmPurpose, RequestedModification4.mmPurpose, CreditTransferTransaction20.mmPurpose, NotificationItem5.mmPurpose,
					EntryTransaction7.mmPurpose, CreditTransferTransaction21.mmPurpose, RequestedModification5.mmPurpose, CreditTransferTransaction25.mmPurpose, PaymentComplementaryInformation5.mmPurpose,
					CreditTransferTransaction26.mmPurpose, OriginalItemReference4.mmPurpose, CreditTransferTransaction22.mmPurpose, EntryTransaction8.mmPurpose, NotificationItem6.mmPurpose, RequestedModification6.mmPurpose,
					PaymentComplementaryInformation6.mmPurpose, CreditTransferTransaction27.mmPurpose, PaymentComplementaryInformation7.mmPurpose, RequestedModification7.mmPurpose, EntryTransaction9.mmPurpose,
					OriginalTransactionReference27.mmPurpose, CreditLineType1Choice.mmCode, CreditLineType1Choice.mmProprietary, CreditTransferTransaction30.mmPurpose, PaymentInstruction26.mmPurpose, StatementResolutionEntry3.mmPurpose);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment obligation";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentPurposeCode.mmObject();
		}

		@Override
		public PaymentPurposeCode getValue(PaymentObligation obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(PaymentObligation obj, PaymentPurposeCode value) {
			obj.setPurpose(value);
		}
	};
	protected RemittanceLocationMethodCode remittanceDeliveryMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethodCode
	 * RemittanceLocationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation1#mmRemittanceLocationMethod
	 * RemittanceLocation1.mmRemittanceLocationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation2#mmRemittanceLocationMethod
	 * RemittanceLocation2.mmRemittanceLocationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1#mmMethod
	 * RemittanceLocationDetails1.mmMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceDeliveryMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the method to be used by the first agent (debtor agent in the case of a credit transfer, creditor agent in the case of a direct debit) to deliver the remittance advice information, which may be sent separately from the payment instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentObligation, RemittanceLocationMethodCode> mmRemittanceDeliveryMethod = new MMBusinessAttribute<PaymentObligation, RemittanceLocationMethodCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RemittanceLocation1.mmRemittanceLocationMethod, RemittanceLocation2.mmRemittanceLocationMethod, RemittanceLocationDetails1.mmMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemittanceDeliveryMethod";
			definition = "Specifies the method to be used by the first agent (debtor agent in the case of a credit transfer, creditor agent in the case of a direct debit) to deliver the remittance advice information, which may be sent separately from the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RemittanceLocationMethodCode.mmObject();
		}

		@Override
		public RemittanceLocationMethodCode getValue(PaymentObligation obj) {
			return obj.getRemittanceDeliveryMethod();
		}

		@Override
		public void setValue(PaymentObligation obj, RemittanceLocationMethodCode value) {
			obj.setRemittanceDeliveryMethod(value);
		}
	};
	protected List<Document> associatedDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPaymentObligation
	 * Document.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction1#mmRemittanceInformation
	 * EntryTransaction1.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction2#mmRemittanceInformation
	 * EntryTransaction2.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction3#mmRemittanceInformation
	 * EntryTransaction3.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRemittanceInformation
	 * EntryTransaction4.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmRemittanceInformation
	 * CreditTransferTransactionInformation1.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmRemittanceInformation
	 * CreditTransferTransactionInformation10.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmRemittanceInformation
	 * CreditTransferTransaction1.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmRemittanceInformation
	 * CreditTransferTransaction6.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation1#mmRemittanceInformation
	 * DirectDebitTransactionInformation1.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmRemittanceInformation
	 * DirectDebitTransactionInformation9.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation11#mmRemittanceInformation
	 * DirectDebitTransactionInformation11.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation13#mmRemittanceInformation
	 * DirectDebitTransactionInformation13.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference1#mmRemittanceInformation
	 * OriginalTransactionReference1.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference13#mmRemittanceInformation
	 * OriginalTransactionReference13.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference16#mmRemittanceInformation
	 * OriginalTransactionReference16.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmRemittanceInformation
	 * CreditTransferTransactionInformation2.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmRemittanceInformation
	 * CreditTransferTransactionInformation11.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmRemittanceInformation
	 * CreditTransferTransaction2.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmRemittanceInformation
	 * CreditTransferTransaction7.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmRemittanceInformation
	 * DirectDebitTransactionInformation2.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmRemittanceInformation
	 * DirectDebitTransactionInformation10.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmRemittanceInformation
	 * DirectDebitTransactionInformation12.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmRemittanceInformation
	 * DirectDebitTransactionInformation14.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3#mmRemittanceInformation
	 * CreditTransferTransactionInformation3.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmRemittanceInformation
	 * CreditTransferTransactionInformation12.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13#mmRemittanceInformation
	 * CreditTransferTransactionInformation13.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction3#mmRemittanceInformation
	 * CreditTransferTransaction3.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction4#mmRemittanceInformation
	 * CreditTransferTransaction4.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction8#mmRemittanceInformation
	 * CreditTransferTransaction8.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference15#mmRemittanceInformation
	 * OriginalTransactionReference15.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference17#mmRemittanceInformation
	 * OriginalTransactionReference17.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference19#mmRemittanceInformation
	 * OriginalTransactionReference19.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmRemittanceInformation
	 * CreditTransferTransactionInformation14.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#mmRemittanceInformation
	 * CreditTransferTransaction5.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmRemittanceInformation
	 * CreditTransferTransaction10.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmRemittanceChoice
	 * PaymentComplementaryInformation.mmRemittanceChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem3#mmRemittanceInformation
	 * NotificationItem3.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference1#mmRemittanceInformation
	 * OriginalItemReference1.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation2#mmRemittanceInformation
	 * PaymentComplementaryInformation2.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation3#mmRemittanceInformation
	 * PaymentComplementaryInformation3.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem4#mmRemittanceInformation
	 * NotificationItem4.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference2#mmRemittanceInformation
	 * OriginalItemReference2.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation15#mmRemittanceInformation
	 * DirectDebitTransactionInformation15.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference7#mmRemittanceInformation
	 * OriginalTransactionReference7.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference10#mmRemittanceInformation
	 * OriginalTransactionReference10.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference9#mmRemittanceInformation
	 * OriginalTransactionReference9.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference12#mmRemittanceInformation
	 * OriginalTransactionReference12.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference8#mmRemittanceInformation
	 * OriginalTransactionReference8.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference11#mmRemittanceInformation
	 * OriginalTransactionReference11.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation6#mmRemittanceInformation
	 * CreditTransferTransactionInformation6.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation8#mmRemittanceInformation
	 * CreditTransferTransactionInformation8.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmRemittanceInformation
	 * CreditTransferTransactionInformation7.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmRemittanceInformation
	 * CreditTransferTransactionInformation9.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation5#mmRemittanceInformation
	 * DirectDebitTransactionInformation5.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation7#mmRemittanceInformation
	 * DirectDebitTransactionInformation7.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmRemittanceInformation
	 * DirectDebitTransactionInformation6.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmRemittanceInformation
	 * DirectDebitTransactionInformation8.mmRemittanceInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Garnishment1#mmType
	 * Garnishment1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation4#mmRemittanceInformation
	 * PaymentComplementaryInformation4.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction17#mmRemittanceInformation
	 * CreditTransferTransaction17.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmRemittanceInformation
	 * CreditTransferTransaction19.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmRemittanceInformation
	 * DirectDebitTransactionInformation17.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference3#mmRemittanceInformation
	 * OriginalItemReference3.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference20#mmRemittanceInformation
	 * OriginalTransactionReference20.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction18#mmRemittanceInformation
	 * CreditTransferTransaction18.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18#mmRemittanceInformation
	 * DirectDebitTransactionInformation18.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmRemittanceInformation
	 * CreditTransferTransaction20.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem5#mmRemittanceInformation
	 * NotificationItem5.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRemittanceInformation
	 * EntryTransaction7.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference21#mmRemittanceInformation
	 * OriginalTransactionReference21.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmRemittanceInformation
	 * CreditTransferTransaction21.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23#mmRemittanceInformation
	 * CreditTransferTransaction23.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmRemittanceInformation
	 * CreditTransferTransaction25.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation5#mmRemittanceInformation
	 * PaymentComplementaryInformation5.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmRemittanceInformation
	 * DirectDebitTransactionInformation20.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference22#mmRemittanceInformation
	 * OriginalTransactionReference22.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction24#mmRemittanceInformation
	 * CreditTransferTransaction24.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmRemittanceInformation
	 * CreditTransferTransaction26.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemReference4#mmRemittanceInformation
	 * OriginalItemReference4.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation19#mmRemittanceInformation
	 * DirectDebitTransactionInformation19.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmRemittanceInformation
	 * CreditTransferTransaction22.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRemittanceInformation
	 * EntryTransaction8.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmRemittanceInformation
	 * NotificationItem6.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference23#mmRemittanceInformation
	 * OriginalTransactionReference23.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmRemittanceInformation
	 * DirectDebitTransactionInformation21.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference24#mmRemittanceInformation
	 * OriginalTransactionReference24.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference26#mmRemittanceInformation
	 * OriginalTransactionReference26.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#mmRemittanceInformation
	 * DirectDebitTransactionInformation22.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation6#mmRemittanceInformation
	 * PaymentComplementaryInformation6.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmRemittanceInformation
	 * CreditTransferTransaction27.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation7#mmRemittanceInformation
	 * PaymentComplementaryInformation7.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction31#mmRemittanceInformation
	 * CreditTransferTransaction31.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction9#mmRemittanceInformation
	 * EntryTransaction9.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalTransactionReference27#mmRemittanceInformation
	 * OriginalTransactionReference27.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction32#mmRemittanceInformation
	 * CreditTransferTransaction32.mmRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmRemittanceInformation
	 * CreditTransferTransaction30.mmRemittanceInformation}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Garnishment2#mmType
	 * Garnishment2.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the referred document/transaction, eg, invoice or credit note."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, List<Document>> mmAssociatedDocument = new MMBusinessAssociationEnd<PaymentObligation, List<Document>>() {
		{
			derivation_lazy = () -> Arrays.asList(EntryTransaction1.mmRemittanceInformation, EntryTransaction2.mmRemittanceInformation, EntryTransaction3.mmRemittanceInformation, EntryTransaction4.mmRemittanceInformation,
					CreditTransferTransactionInformation1.mmRemittanceInformation, CreditTransferTransactionInformation10.mmRemittanceInformation, CreditTransferTransaction1.mmRemittanceInformation,
					CreditTransferTransaction6.mmRemittanceInformation, DirectDebitTransactionInformation1.mmRemittanceInformation, DirectDebitTransactionInformation9.mmRemittanceInformation,
					DirectDebitTransactionInformation11.mmRemittanceInformation, DirectDebitTransactionInformation13.mmRemittanceInformation, OriginalTransactionReference1.mmRemittanceInformation,
					OriginalTransactionReference13.mmRemittanceInformation, OriginalTransactionReference16.mmRemittanceInformation, CreditTransferTransactionInformation2.mmRemittanceInformation,
					CreditTransferTransactionInformation11.mmRemittanceInformation, CreditTransferTransaction2.mmRemittanceInformation, CreditTransferTransaction7.mmRemittanceInformation,
					DirectDebitTransactionInformation2.mmRemittanceInformation, DirectDebitTransactionInformation10.mmRemittanceInformation, DirectDebitTransactionInformation12.mmRemittanceInformation,
					DirectDebitTransactionInformation14.mmRemittanceInformation, CreditTransferTransactionInformation3.mmRemittanceInformation, CreditTransferTransactionInformation12.mmRemittanceInformation,
					CreditTransferTransactionInformation13.mmRemittanceInformation, CreditTransferTransaction3.mmRemittanceInformation, CreditTransferTransaction4.mmRemittanceInformation, CreditTransferTransaction8.mmRemittanceInformation,
					OriginalTransactionReference15.mmRemittanceInformation, OriginalTransactionReference17.mmRemittanceInformation, OriginalTransactionReference19.mmRemittanceInformation,
					CreditTransferTransactionInformation14.mmRemittanceInformation, CreditTransferTransaction5.mmRemittanceInformation, CreditTransferTransaction10.mmRemittanceInformation,
					PaymentComplementaryInformation.mmRemittanceChoice, NotificationItem3.mmRemittanceInformation, OriginalItemReference1.mmRemittanceInformation, PaymentComplementaryInformation2.mmRemittanceInformation,
					PaymentComplementaryInformation3.mmRemittanceInformation, NotificationItem4.mmRemittanceInformation, OriginalItemReference2.mmRemittanceInformation, DirectDebitTransactionInformation15.mmRemittanceInformation,
					OriginalTransactionReference7.mmRemittanceInformation, OriginalTransactionReference10.mmRemittanceInformation, OriginalTransactionReference9.mmRemittanceInformation,
					OriginalTransactionReference12.mmRemittanceInformation, OriginalTransactionReference8.mmRemittanceInformation, OriginalTransactionReference11.mmRemittanceInformation,
					CreditTransferTransactionInformation6.mmRemittanceInformation, CreditTransferTransactionInformation8.mmRemittanceInformation, CreditTransferTransactionInformation7.mmRemittanceInformation,
					CreditTransferTransactionInformation9.mmRemittanceInformation, DirectDebitTransactionInformation5.mmRemittanceInformation, DirectDebitTransactionInformation7.mmRemittanceInformation,
					DirectDebitTransactionInformation6.mmRemittanceInformation, DirectDebitTransactionInformation8.mmRemittanceInformation, Garnishment1.mmType, PaymentComplementaryInformation4.mmRemittanceInformation,
					CreditTransferTransaction17.mmRemittanceInformation, CreditTransferTransaction19.mmRemittanceInformation, DirectDebitTransactionInformation17.mmRemittanceInformation, OriginalItemReference3.mmRemittanceInformation,
					OriginalTransactionReference20.mmRemittanceInformation, CreditTransferTransaction18.mmRemittanceInformation, DirectDebitTransactionInformation18.mmRemittanceInformation,
					CreditTransferTransaction20.mmRemittanceInformation, NotificationItem5.mmRemittanceInformation, EntryTransaction7.mmRemittanceInformation, OriginalTransactionReference21.mmRemittanceInformation,
					CreditTransferTransaction21.mmRemittanceInformation, CreditTransferTransaction23.mmRemittanceInformation, CreditTransferTransaction25.mmRemittanceInformation, PaymentComplementaryInformation5.mmRemittanceInformation,
					DirectDebitTransactionInformation20.mmRemittanceInformation, OriginalTransactionReference22.mmRemittanceInformation, CreditTransferTransaction24.mmRemittanceInformation,
					CreditTransferTransaction26.mmRemittanceInformation, OriginalItemReference4.mmRemittanceInformation, DirectDebitTransactionInformation19.mmRemittanceInformation, CreditTransferTransaction22.mmRemittanceInformation,
					EntryTransaction8.mmRemittanceInformation, NotificationItem6.mmRemittanceInformation, OriginalTransactionReference23.mmRemittanceInformation, DirectDebitTransactionInformation21.mmRemittanceInformation,
					OriginalTransactionReference24.mmRemittanceInformation, OriginalTransactionReference26.mmRemittanceInformation, DirectDebitTransactionInformation22.mmRemittanceInformation,
					PaymentComplementaryInformation6.mmRemittanceInformation, CreditTransferTransaction27.mmRemittanceInformation, PaymentComplementaryInformation7.mmRemittanceInformation,
					CreditTransferTransaction31.mmRemittanceInformation, EntryTransaction9.mmRemittanceInformation, OriginalTransactionReference27.mmRemittanceInformation, CreditTransferTransaction32.mmRemittanceInformation,
					CreditTransferTransaction30.mmRemittanceInformation, Garnishment2.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssociatedDocument";
			definition = "Specifies the referred document/transaction, eg, invoice or credit note.";
			minOccurs = 0;
			opposite_lazy = () -> Document.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}

		@Override
		public List<Document> getValue(PaymentObligation obj) {
			return obj.getAssociatedDocument();
		}

		@Override
		public void setValue(PaymentObligation obj, List<Document> value) {
			obj.setAssociatedDocument(value);
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
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice#mmDuePayableAmount
	 * ReferredDocumentAmount1Choice.mmDuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#mmDuePayableAmount
	 * RemittanceAmount1.mmDuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmDuePayableAmount
	 * RemittanceAmount2.mmDuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FailedMovement1#mmCashAmount
	 * FailedMovement1.mmCashAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PremiumAmount1#mmAmount
	 * PremiumAmount1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PremiumAmount2#mmAmount
	 * PremiumAmount2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Instalment1#mmAmount
	 * Instalment1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmDuePayableAmount
	 * TradeSettlement1.mmDuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCompensation1#mmSettlementAmount
	 * CashCompensation1.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmAmountToBeTransferred
	 * PEPISACashTransfer1.mmAmountToBeTransferred}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmAmountToBeTransferred
	 * PEPISACashTransfer2.mmAmountToBeTransferred}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmDuePayableAmount
	 * RemittanceAmount3.mmDuePayableAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Instalment2#mmAmount
	 * Instalment2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmTransactionNominalAmount
	 * UnsecuredMarketTransaction1.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#mmTransactionNominalAmount
	 * OvernightIndexSwapTransaction1.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmTransactionNominalAmount
	 * SecuredMarketTransaction1.mmTransactionNominalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeContract1#mmAmount
	 * TradeContract1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InitialAmount1Choice#mmAmount
	 * InitialAmount1Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmTransactionNominalAmount
	 * UnsecuredMarketTransaction2.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmTransactionNominalAmount
	 * SecuredMarketTransaction2.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmTransactionNominalAmount
	 * UnsecuredMarketTransaction3.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#mmTransactionNominalAmount
	 * OvernightIndexSwapTransaction3.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmTransactionNominalAmount
	 * SecuredMarketTransaction3.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmDuePayableAmount
	 * TradeSettlement2.mmDuePayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmTransactionNominalAmount
	 * SecuredMarketTransaction4.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmTransactionNominalAmount
	 * OvernightIndexSwapTransaction4.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmTransactionNominalAmount
	 * UnsecuredMarketTransaction4.mmTransactionNominalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount payable to the creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentObligation, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<PaymentObligation, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(ReferredDocumentAmount1Choice.mmDuePayableAmount, RemittanceAmount1.mmDuePayableAmount, RemittanceAmount2.mmDuePayableAmount, FailedMovement1.mmCashAmount, PremiumAmount1.mmAmount,
					PremiumAmount2.mmAmount, Instalment1.mmAmount, TradeSettlement1.mmDuePayableAmount, CashCompensation1.mmSettlementAmount, PEPISACashTransfer1.mmAmountToBeTransferred, PEPISACashTransfer2.mmAmountToBeTransferred,
					RemittanceAmount3.mmDuePayableAmount, Instalment2.mmAmount, UnsecuredMarketTransaction1.mmTransactionNominalAmount, OvernightIndexSwapTransaction1.mmTransactionNominalAmount,
					SecuredMarketTransaction1.mmTransactionNominalAmount, TradeContract1.mmAmount, InitialAmount1Choice.mmAmount, UnsecuredMarketTransaction2.mmTransactionNominalAmount, SecuredMarketTransaction2.mmTransactionNominalAmount,
					UnsecuredMarketTransaction3.mmTransactionNominalAmount, OvernightIndexSwapTransaction3.mmTransactionNominalAmount, SecuredMarketTransaction3.mmTransactionNominalAmount, TradeSettlement2.mmDuePayableAmount,
					SecuredMarketTransaction4.mmTransactionNominalAmount, OvernightIndexSwapTransaction4.mmTransactionNominalAmount, UnsecuredMarketTransaction4.mmTransactionNominalAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount payable to the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(PaymentObligation obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(PaymentObligation obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected List<ContactPoint> remittanceLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRemittanceRelatedPayment
	 * ContactPoint.mmRemittanceRelatedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1#mmRelatedRemittanceInformation
	 * CreditTransferTransactionInformation1.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation10#mmRelatedRemittanceInformation
	 * CreditTransferTransactionInformation10.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction1#mmRelatedRemittanceInformation
	 * CreditTransferTransaction1.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction6#mmRelatedRemittanceInformation
	 * CreditTransferTransaction6.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation2#mmRelatedRemittanceInformation
	 * CreditTransferTransactionInformation2.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation11#mmRelatedRemittanceInformation
	 * CreditTransferTransactionInformation11.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmRelatedRemittanceInformation
	 * CreditTransferTransaction2.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7#mmRelatedRemittanceInformation
	 * CreditTransferTransaction7.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmRelatedRemittanceInformation
	 * CreditTransferTransactionInformation14.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction5#mmRelatedRemittanceInformation
	 * CreditTransferTransaction5.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction10#mmRelatedRemittanceInformation
	 * CreditTransferTransaction10.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation7#mmRelatedRemittanceInformation
	 * CreditTransferTransactionInformation7.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmRelatedRemittanceInformation
	 * CreditTransferTransactionInformation9.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction19#mmRelatedRemittanceInformation
	 * CreditTransferTransaction19.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction20#mmRelatedRemittanceInformation
	 * CreditTransferTransaction20.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction21#mmRelatedRemittanceInformation
	 * CreditTransferTransaction21.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#mmRelatedRemittanceInformation
	 * CreditTransferTransaction25.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#mmRelatedRemittanceInformation
	 * CreditTransferTransaction26.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#mmRelatedRemittanceInformation
	 * CreditTransferTransaction22.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction27#mmRelatedRemittanceInformation
	 * CreditTransferTransaction27.mmRelatedRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction30#mmRelatedRemittanceInformation
	 * CreditTransferTransaction30.mmRelatedRemittanceInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address to which the first agent is to send the remittance information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, List<ContactPoint>> mmRemittanceLocation = new MMBusinessAssociationEnd<PaymentObligation, List<ContactPoint>>() {
		{
			derivation_lazy = () -> Arrays.asList(CreditTransferTransactionInformation1.mmRelatedRemittanceInformation, CreditTransferTransactionInformation10.mmRelatedRemittanceInformation,
					CreditTransferTransaction1.mmRelatedRemittanceInformation, CreditTransferTransaction6.mmRelatedRemittanceInformation, CreditTransferTransactionInformation2.mmRelatedRemittanceInformation,
					CreditTransferTransactionInformation11.mmRelatedRemittanceInformation, CreditTransferTransaction2.mmRelatedRemittanceInformation, CreditTransferTransaction7.mmRelatedRemittanceInformation,
					CreditTransferTransactionInformation14.mmRelatedRemittanceInformation, CreditTransferTransaction5.mmRelatedRemittanceInformation, CreditTransferTransaction10.mmRelatedRemittanceInformation,
					CreditTransferTransactionInformation7.mmRelatedRemittanceInformation, CreditTransferTransactionInformation9.mmRelatedRemittanceInformation, CreditTransferTransaction19.mmRelatedRemittanceInformation,
					CreditTransferTransaction20.mmRelatedRemittanceInformation, CreditTransferTransaction21.mmRelatedRemittanceInformation, CreditTransferTransaction25.mmRelatedRemittanceInformation,
					CreditTransferTransaction26.mmRelatedRemittanceInformation, CreditTransferTransaction22.mmRelatedRemittanceInformation, CreditTransferTransaction27.mmRelatedRemittanceInformation,
					CreditTransferTransaction30.mmRelatedRemittanceInformation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemittanceLocation";
			definition = "Address to which the first agent is to send the remittance information.";
			minOccurs = 0;
			opposite_lazy = () -> ContactPoint.mmRemittanceRelatedPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}

		@Override
		public List<ContactPoint> getValue(PaymentObligation obj) {
			return obj.getRemittanceLocation();
		}

		@Override
		public void setValue(PaymentObligation obj, List<ContactPoint> value) {
			obj.setRemittanceLocation(value);
		}
	};
	protected List<InterestManagement> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmPaymentObligation
	 * InterestManagement.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecurringTransaction1#mmInterestCharges
	 * RecurringTransaction1.mmInterestCharges}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which calculates the interest to be paid. It may also specify the interest charged on instalment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, List<InterestManagement>> mmInterest = new MMBusinessAssociationEnd<PaymentObligation, List<InterestManagement>>() {
		{
			derivation_lazy = () -> Arrays.asList(RecurringTransaction1.mmInterestCharges);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Process which calculates the interest to be paid. It may also specify the interest charged on instalment.";
			minOccurs = 0;
			opposite_lazy = () -> InterestManagement.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InterestManagement.mmObject();
		}

		@Override
		public List<InterestManagement> getValue(PaymentObligation obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(PaymentObligation obj, List<InterestManagement> value) {
			obj.setInterest(value);
		}
	};
	protected CommercialTrade commercialTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPaymentObligation
	 * CommercialTrade.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commercial trade which creates the payment obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, com.tools20022.repository.entity.CommercialTrade> mmCommercialTrade = new MMBusinessAssociationEnd<PaymentObligation, com.tools20022.repository.entity.CommercialTrade>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Commercial trade which creates the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.CommercialTrade getValue(PaymentObligation obj) {
			return obj.getCommercialTrade();
		}

		@Override
		public void setValue(PaymentObligation obj, com.tools20022.repository.entity.CommercialTrade value) {
			obj.setCommercialTrade(value);
		}
	};
	protected PercentageRate percentage;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmPercentage
	 * PaymentObligation1.mmPercentage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount that a financial institution guarantees to pay for a specific commercial trade, expressed as a percentage of the purchase order net amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentObligation, PercentageRate> mmPercentage = new MMBusinessAttribute<PaymentObligation, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentObligation1.mmPercentage);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Maximum amount that a financial institution guarantees to pay for a specific commercial trade, expressed as a percentage of the purchase order net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(PaymentObligation obj) {
			return obj.getPercentage();
		}

		@Override
		public void setValue(PaymentObligation obj, PercentageRate value) {
			obj.setPercentage(value);
		}
	};
	protected CurrencyAndAmount maximumAmount;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmAmount
	 * PaymentObligation1.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount that a financial institution guarantees to pay for a specific commercial trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentObligation, CurrencyAndAmount> mmMaximumAmount = new MMBusinessAttribute<PaymentObligation, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentObligation1.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that a financial institution guarantees to pay for a specific commercial trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(PaymentObligation obj) {
			return obj.getMaximumAmount();
		}

		@Override
		public void setValue(PaymentObligation obj, CurrencyAndAmount value) {
			obj.setMaximumAmount(value);
		}
	};
	protected ISODateTime expiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmExpiryDate
	 * PaymentObligation1.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmExpiryDate
	 * PaymentObligation2.mmExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the obligation will expire. For instance, it is the transaction authorisation deadline to complete a payment by card."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentObligation, ISODateTime> mmExpiryDate = new MMBusinessAttribute<PaymentObligation, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentObligation1.mmExpiryDate, PaymentObligation2.mmExpiryDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the obligation will expire. For instance, it is the transaction authorisation deadline to complete a payment by card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(PaymentObligation obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(PaymentObligation obj, ISODateTime value) {
			obj.setExpiryDate(value);
		}
	};
	protected CountryCode applicableLaw;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmApplicableLaw
	 * PaymentObligation1.mmApplicableLaw}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmApplicableLaw
	 * PaymentObligation2.mmApplicableLaw}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of which the law governs the payment obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentObligation, CountryCode> mmApplicableLaw = new MMBusinessAttribute<PaymentObligation, CountryCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentObligation1.mmApplicableLaw, PaymentObligation2.mmApplicableLaw);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicableLaw";
			definition = "Country of which the law governs the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(PaymentObligation obj) {
			return obj.getApplicableLaw();
		}

		@Override
		public void setValue(PaymentObligation obj, CountryCode value) {
			obj.setApplicableLaw(value);
		}
	};
	protected BuyIn paymentSourceBuyIn;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmCashCompensation
	 * BuyIn.mmCashCompensation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSourceBuyIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Buy-in process which created the payment obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, Optional<BuyIn>> mmPaymentSourceBuyIn = new MMBusinessAssociationEnd<PaymentObligation, Optional<BuyIn>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentSourceBuyIn";
			definition = "Buy-in process which created the payment obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BuyIn.mmCashCompensation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BuyIn.mmObject();
		}

		@Override
		public Optional<BuyIn> getValue(PaymentObligation obj) {
			return obj.getPaymentSourceBuyIn();
		}

		@Override
		public void setValue(PaymentObligation obj, Optional<BuyIn> value) {
			obj.setPaymentSourceBuyIn(value.orElse(null));
		}
	};
	protected CorporateActionProceedsDeliveryInstruction relatedCorporateAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmCashProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action processes which are the source of the payment obligation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, CorporateActionProceedsDeliveryInstruction> mmRelatedCorporateAction = new MMBusinessAssociationEnd<PaymentObligation, CorporateActionProceedsDeliveryInstruction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateAction";
			definition = "Corporate action processes which are the source of the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
		}

		@Override
		public CorporateActionProceedsDeliveryInstruction getValue(PaymentObligation obj) {
			return obj.getRelatedCorporateAction();
		}

		@Override
		public void setValue(PaymentObligation obj, CorporateActionProceedsDeliveryInstruction value) {
			obj.setRelatedCorporateAction(value);
		}
	};
	protected CollateralMovement relatedCollateralMovement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmCashCollateralMovement
	 * CollateralMovement.mmCashCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral movement which is the source of the obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, CollateralMovement> mmRelatedCollateralMovement = new MMBusinessAssociationEnd<PaymentObligation, CollateralMovement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralMovement";
			definition = "Collateral movement which is the source of the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CollateralMovement.mmCashCollateralMovement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralMovement.mmObject();
		}

		@Override
		public CollateralMovement getValue(PaymentObligation obj) {
			return obj.getRelatedCollateralMovement();
		}

		@Override
		public void setValue(PaymentObligation obj, CollateralMovement value) {
			obj.setRelatedCollateralMovement(value);
		}
	};
	protected Demand paymentSourceUndertakingDemand;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Demand Demand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Demand#mmPayment
	 * Demand.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSourceUndertakingDemand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Undertaking demand which is the source of a payment obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, Demand> mmPaymentSourceUndertakingDemand = new MMBusinessAssociationEnd<PaymentObligation, Demand>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentSourceUndertakingDemand";
			definition = "Undertaking demand which is the source of a payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Demand.mmPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Demand.mmObject();
		}

		@Override
		public Demand getValue(PaymentObligation obj) {
			return obj.getPaymentSourceUndertakingDemand();
		}

		@Override
		public void setValue(PaymentObligation obj, Demand value) {
			obj.setPaymentSourceUndertakingDemand(value);
		}
	};
	protected List<PaymentObligationPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole
	 * PaymentObligationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole#mmPaymentObligation
	 * PaymentObligationPartyRole.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a payment obligation and played by a party at that step in a payment flow."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, List<PaymentObligationPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<PaymentObligation, List<PaymentObligationPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a payment obligation and played by a party at that step in a payment flow.";
			minOccurs = 0;
			opposite_lazy = () -> PaymentObligationPartyRole.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentObligationPartyRole.mmObject();
		}

		@Override
		public List<PaymentObligationPartyRole> getValue(PaymentObligation obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(PaymentObligation obj, List<PaymentObligationPartyRole> value) {
			obj.setPartyRole(value);
		}
	};
	protected SecuritiesTradeExecution executedSecuritiesTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmPaymentObligation
	 * SecuritiesTradeExecution.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutedSecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities trade which created a payment flow."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, SecuritiesTradeExecution> mmExecutedSecuritiesTrade = new MMBusinessAssociationEnd<PaymentObligation, SecuritiesTradeExecution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutedSecuritiesTrade";
			definition = "Securities trade which created a payment flow.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesTradeExecution.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesTradeExecution.mmObject();
		}

		@Override
		public SecuritiesTradeExecution getValue(PaymentObligation obj) {
			return obj.getExecutedSecuritiesTrade();
		}

		@Override
		public void setValue(PaymentObligation obj, SecuritiesTradeExecution value) {
			obj.setExecutedSecuritiesTrade(value);
		}
	};
	protected CashAccountContract relatedAccountClosingTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmBalanceTransfer
	 * CashAccountContract.mmBalanceTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccountClosingTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract which authorises the transfer of funds resulting in a payment obligation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, Optional<CashAccountContract>> mmRelatedAccountClosingTerms = new MMBusinessAssociationEnd<PaymentObligation, Optional<CashAccountContract>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountClosingTerms";
			definition = "Contract which authorises the transfer of funds resulting in a payment obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CashAccountContract.mmBalanceTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAccountContract.mmObject();
		}

		@Override
		public Optional<CashAccountContract> getValue(PaymentObligation obj) {
			return obj.getRelatedAccountClosingTerms();
		}

		@Override
		public void setValue(PaymentObligation obj, Optional<CashAccountContract> value) {
			obj.setRelatedAccountClosingTerms(value.orElse(null));
		}
	};
	protected List<PortfolioTransfer> paymentSourcePortfolioTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmPaymentObligation
	 * PortfolioTransfer.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSourcePortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The PaymentObligation that specifies the payment resulting from charges due by one party to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, List<PortfolioTransfer>> mmPaymentSourcePortfolioTransfer = new MMBusinessAssociationEnd<PaymentObligation, List<PortfolioTransfer>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentSourcePortfolioTransfer";
			definition = "The PaymentObligation that specifies the payment resulting from charges due by one party to another.";
			minOccurs = 0;
			opposite_lazy = () -> PortfolioTransfer.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PortfolioTransfer.mmObject();
		}

		@Override
		public List<PortfolioTransfer> getValue(PaymentObligation obj) {
			return obj.getPaymentSourcePortfolioTransfer();
		}

		@Override
		public void setValue(PaymentObligation obj, List<PortfolioTransfer> value) {
			obj.setPaymentSourcePortfolioTransfer(value);
		}
	};
	protected CurrencyOption paymentSourceCurrencyOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmPremiumSettlement
	 * CurrencyOption.mmPremiumSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentSourceCurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The PaymentObligation that specifies the amount of the premium paid by the buyer of the option and its settlement place."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, Optional<CurrencyOption>> mmPaymentSourceCurrencyOption = new MMBusinessAssociationEnd<PaymentObligation, Optional<CurrencyOption>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentSourceCurrencyOption";
			definition = "The PaymentObligation that specifies the amount of the premium paid by the buyer of the option and its settlement place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CurrencyOption.mmPremiumSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CurrencyOption.mmObject();
		}

		@Override
		public Optional<CurrencyOption> getValue(PaymentObligation obj) {
			return obj.getPaymentSourceCurrencyOption();
		}

		@Override
		public void setValue(PaymentObligation obj, Optional<CurrencyOption> value) {
			obj.setPaymentSourceCurrencyOption(value.orElse(null));
		}
	};
	protected ForeignExchangeTrade exchangeRateInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmResultingSettlement
	 * ForeignExchangeTrade.mmResultingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmFXAdditionalDetails
	 * SecuritiesTradeDetails25.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmFXAdditionalDetails
	 * SecuritiesTradeDetails26.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmFXAdditionalDetails
	 * SecuritiesTradeDetails27.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmFXAdditionalDetails
	 * SecuritiesTradeDetails28.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmFXAdditionalDetails
	 * SecuritiesTradeDetails6.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#mmFXAdditionalDetails
	 * SecuritiesTradeDetails13.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#mmFXAdditionalDetails
	 * SecuritiesTradeDetails3.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#mmFXAdditionalDetails
	 * SecuritiesTradeDetails11.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmFXAdditionalDetails
	 * SecuritiesTradeDetails2.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmFXAdditionalDetails
	 * SecuritiesTradeDetails16.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmFXAdditionalDetails
	 * SecuritiesTradeDetails1.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmFXAdditionalDetails
	 * SecuritiesTradeDetails15.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmFXAdditionalDetails
	 * SecuritiesTradeDetails31.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmFXAdditionalDetails
	 * SecuritiesTradeDetails33.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmFXAdditionalDetails
	 * SecuritiesTradeDetails38.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmFXAdditionalDetails
	 * SecuritiesTradeDetails37.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmFXAdditionalDetails
	 * SecuritiesTradeDetails34.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmFXAdditionalDetails
	 * SecuritiesTradeDetails32.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmFXAdditionalDetails
	 * SecuritiesTradeDetails44.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#mmFXAdditionalDetails
	 * SecuritiesTradeDetails39.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmFXAdditionalDetails
	 * SecuritiesTradeDetails43.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#mmFXAdditionalDetails
	 * SecuritiesTradeDetails40.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmFXAdditionalDetails
	 * SecuritiesTradeDetails46.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmFXAdditionalDetails
	 * SecuritiesTradeDetails47.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmExchangeRateInformation
	 * TradeContract1.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SyndicatedLoan1#mmExchangeRateInformation
	 * SyndicatedLoan1.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmFXAdditionalDetails
	 * SecuritiesTradeDetails51.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmFXAdditionalDetails
	 * SecuritiesTradeDetails53.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmFXAdditionalDetails
	 * SecuritiesTradeDetails55.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmFXAdditionalDetails
	 * SecuritiesTradeDetails56.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmFXAdditionalDetails
	 * SecuritiesTradeDetails52.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmFXAdditionalDetails
	 * SecuritiesTradeDetails50.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#mmFXAdditionalDetails
	 * SecuritiesTradeDetails59.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#mmFXAdditionalDetails
	 * SecuritiesTradeDetails58.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmFXAdditionalDetails
	 * SecuritiesTradeDetails63.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmFXAdditionalDetails
	 * SecuritiesTradeDetails62.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmFXAdditionalDetails
	 * SecuritiesTradeDetails65.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmFXAdditionalDetails
	 * SecuritiesTradeDetails66.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmFXAdditionalDetails
	 * SecuritiesTradeDetails67.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmFXAdditionalDetails
	 * SecuritiesTradeDetails70.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails73#mmFXAdditionalDetails
	 * SecuritiesTradeDetails73.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails74#mmFXAdditionalDetails
	 * SecuritiesTradeDetails74.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails75#mmFXAdditionalDetails
	 * SecuritiesTradeDetails75.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails76#mmFXAdditionalDetails
	 * SecuritiesTradeDetails76.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails77#mmFXAdditionalDetails
	 * SecuritiesTradeDetails77.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails78#mmFXAdditionalDetails
	 * SecuritiesTradeDetails78.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails79#mmFXAdditionalDetails
	 * SecuritiesTradeDetails79.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails82#mmFXAdditionalDetails
	 * SecuritiesTradeDetails82.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails83#mmFXAdditionalDetails
	 * SecuritiesTradeDetails83.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails86#mmFXAdditionalDetails
	 * SecuritiesTradeDetails86.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails87#mmFXAdditionalDetails
	 * SecuritiesTradeDetails87.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails88#mmFXAdditionalDetails
	 * SecuritiesTradeDetails88.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails89#mmFXAdditionalDetails
	 * SecuritiesTradeDetails89.mmFXAdditionalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails90#mmFXAdditionalDetails
	 * SecuritiesTradeDetails90.mmFXAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign exchange trade which is the source of the payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, Optional<ForeignExchangeTrade>> mmExchangeRateInformation = new MMBusinessAssociationEnd<PaymentObligation, Optional<ForeignExchangeTrade>>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesTradeDetails25.mmFXAdditionalDetails, SecuritiesTradeDetails26.mmFXAdditionalDetails, SecuritiesTradeDetails27.mmFXAdditionalDetails,
					SecuritiesTradeDetails28.mmFXAdditionalDetails, SecuritiesTradeDetails6.mmFXAdditionalDetails, SecuritiesTradeDetails13.mmFXAdditionalDetails, SecuritiesTradeDetails3.mmFXAdditionalDetails,
					SecuritiesTradeDetails11.mmFXAdditionalDetails, SecuritiesTradeDetails2.mmFXAdditionalDetails, SecuritiesTradeDetails16.mmFXAdditionalDetails, SecuritiesTradeDetails1.mmFXAdditionalDetails,
					SecuritiesTradeDetails15.mmFXAdditionalDetails, SecuritiesTradeDetails31.mmFXAdditionalDetails, SecuritiesTradeDetails33.mmFXAdditionalDetails, SecuritiesTradeDetails38.mmFXAdditionalDetails,
					SecuritiesTradeDetails37.mmFXAdditionalDetails, SecuritiesTradeDetails34.mmFXAdditionalDetails, SecuritiesTradeDetails32.mmFXAdditionalDetails, SecuritiesTradeDetails44.mmFXAdditionalDetails,
					SecuritiesTradeDetails39.mmFXAdditionalDetails, SecuritiesTradeDetails43.mmFXAdditionalDetails, SecuritiesTradeDetails40.mmFXAdditionalDetails, SecuritiesTradeDetails46.mmFXAdditionalDetails,
					SecuritiesTradeDetails47.mmFXAdditionalDetails, TradeContract1.mmExchangeRateInformation, SyndicatedLoan1.mmExchangeRateInformation, SecuritiesTradeDetails51.mmFXAdditionalDetails,
					SecuritiesTradeDetails53.mmFXAdditionalDetails, SecuritiesTradeDetails55.mmFXAdditionalDetails, SecuritiesTradeDetails56.mmFXAdditionalDetails, SecuritiesTradeDetails52.mmFXAdditionalDetails,
					SecuritiesTradeDetails50.mmFXAdditionalDetails, SecuritiesTradeDetails59.mmFXAdditionalDetails, SecuritiesTradeDetails58.mmFXAdditionalDetails, SecuritiesTradeDetails63.mmFXAdditionalDetails,
					SecuritiesTradeDetails62.mmFXAdditionalDetails, SecuritiesTradeDetails65.mmFXAdditionalDetails, SecuritiesTradeDetails66.mmFXAdditionalDetails, SecuritiesTradeDetails67.mmFXAdditionalDetails,
					SecuritiesTradeDetails70.mmFXAdditionalDetails, SecuritiesTradeDetails73.mmFXAdditionalDetails, SecuritiesTradeDetails74.mmFXAdditionalDetails, SecuritiesTradeDetails75.mmFXAdditionalDetails,
					SecuritiesTradeDetails76.mmFXAdditionalDetails, SecuritiesTradeDetails77.mmFXAdditionalDetails, SecuritiesTradeDetails78.mmFXAdditionalDetails, SecuritiesTradeDetails79.mmFXAdditionalDetails,
					SecuritiesTradeDetails82.mmFXAdditionalDetails, SecuritiesTradeDetails83.mmFXAdditionalDetails, SecuritiesTradeDetails86.mmFXAdditionalDetails, SecuritiesTradeDetails87.mmFXAdditionalDetails,
					SecuritiesTradeDetails88.mmFXAdditionalDetails, SecuritiesTradeDetails89.mmFXAdditionalDetails, SecuritiesTradeDetails90.mmFXAdditionalDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeRateInformation";
			definition = "Foreign exchange trade which is the source of the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ForeignExchangeTrade.mmResultingSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
		}

		@Override
		public Optional<ForeignExchangeTrade> getValue(PaymentObligation obj) {
			return obj.getExchangeRateInformation();
		}

		@Override
		public void setValue(PaymentObligation obj, Optional<ForeignExchangeTrade> value) {
			obj.setExchangeRateInformation(value.orElse(null));
		}
	};
	protected Dividend dividend;
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
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmObligation
	 * Dividend.mmObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend for which payment terms are specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, com.tools20022.repository.entity.Dividend> mmDividend = new MMBusinessAssociationEnd<PaymentObligation, com.tools20022.repository.entity.Dividend>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			definition = "Dividend for which payment terms are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Dividend getValue(PaymentObligation obj) {
			return obj.getDividend();
		}

		@Override
		public void setValue(PaymentObligation obj, com.tools20022.repository.entity.Dividend value) {
			obj.setDividend(value);
		}
	};
	protected RepurchaseAgreement repurchaseAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RepurchaseAgreement
	 * RepurchaseAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RepurchaseAgreement#mmPaymentObligation
	 * RepurchaseAgreement.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase agreement which covers the delivery of cash by the buyer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, com.tools20022.repository.entity.RepurchaseAgreement> mmRepurchaseAgreement = new MMBusinessAssociationEnd<PaymentObligation, com.tools20022.repository.entity.RepurchaseAgreement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseAgreement";
			definition = "Repurchase agreement which covers the delivery of cash by the buyer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RepurchaseAgreement.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RepurchaseAgreement.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.RepurchaseAgreement getValue(PaymentObligation obj) {
			return obj.getRepurchaseAgreement();
		}

		@Override
		public void setValue(PaymentObligation obj, com.tools20022.repository.entity.RepurchaseAgreement value) {
			obj.setRepurchaseAgreement(value);
		}
	};
	protected Assignment relatedAssignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Assignment
	 * Assignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Assignment#mmPaymentObligation
	 * Assignment.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAssignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assignment which contains one or more payment obligations."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, Assignment> mmRelatedAssignment = new MMBusinessAssociationEnd<PaymentObligation, Assignment>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAssignment";
			definition = "Assignment which contains one or more payment obligations.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Assignment.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Assignment.mmObject();
		}

		@Override
		public Assignment getValue(PaymentObligation obj) {
			return obj.getRelatedAssignment();
		}

		@Override
		public void setValue(PaymentObligation obj, Assignment value) {
			obj.setRelatedAssignment(value);
		}
	};
	protected BankingTransaction bankingTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankingTransaction
	 * BankingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankingTransaction#mmPaymentObligation
	 * BankingTransaction.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, com.tools20022.repository.entity.BankingTransaction> mmBankingTransaction = new MMBusinessAssociationEnd<PaymentObligation, com.tools20022.repository.entity.BankingTransaction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankingTransaction";
			definition = "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.BankingTransaction getValue(PaymentObligation obj) {
			return obj.getBankingTransaction();
		}

		@Override
		public void setValue(PaymentObligation obj, com.tools20022.repository.entity.BankingTransaction value) {
			obj.setBankingTransaction(value);
		}
	};
	protected PaymentTerms paymentTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentTerms
	 * PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmRelatedPaymentObligation
	 * PaymentTerms.mmRelatedPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms1#mmOtherPaymentTerms
	 * PaymentTerms1.mmOtherPaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms1#mmPaymentCode
	 * PaymentTerms1.mmPaymentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTerms2#mmPaymentCode
	 * PaymentTerms2.mmPaymentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmPaymentSchedule
	 * TradeContract1.mmPaymentSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmPaymentSchedule
	 * LoanContract1.mmPaymentSchedule}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the payment terms of the obligation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PaymentObligation, com.tools20022.repository.entity.PaymentTerms> mmPaymentTerms = new MMBusinessAssociationEnd<PaymentObligation, com.tools20022.repository.entity.PaymentTerms>() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentTerms1.mmOtherPaymentTerms, PaymentTerms1.mmPaymentCode, PaymentTerms2.mmPaymentCode, TradeContract1.mmPaymentSchedule, LoanContract1.mmPaymentSchedule);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentTerms";
			definition = "Specifies the payment terms of the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmRelatedPaymentObligation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.PaymentTerms getValue(PaymentObligation obj) {
			return obj.getPaymentTerms();
		}

		@Override
		public void setValue(PaymentObligation obj, com.tools20022.repository.entity.PaymentTerms value) {
			obj.setPaymentTerms(value);
		}
	};
	protected ISODate paymentDueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount1#mmSettlementDate
	 * PremiumAmount1.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount2#mmSettlementDate
	 * PremiumAmount2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals1#mmPaymentDueDate
	 * InvoiceTotals1.mmPaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instalment1#mmPaymentDueDate
	 * Instalment1.mmPaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalInvoiceInformation1#mmPaymentDueDate
	 * OriginalInvoiceInformation1.mmPaymentDueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentTerms3#mmDueDate
	 * PaymentTerms3.mmDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals2#mmPaymentDueDate
	 * InvoiceTotals2.mmPaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther2Choice#mmPaymentDueDate
	 * PaymentCodeOrOther2Choice.mmPaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Instalment2#mmPaymentDueDate
	 * Instalment2.mmPaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmExpectedAdvancePaymentReturnDate
	 * TransactionCertificateContract1.mmExpectedAdvancePaymentReturnDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Due date for the payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PaymentObligation, ISODate> mmPaymentDueDate = new MMBusinessAttribute<PaymentObligation, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(PremiumAmount1.mmSettlementDate, PremiumAmount2.mmSettlementDate, InvoiceTotals1.mmPaymentDueDate, Instalment1.mmPaymentDueDate, OriginalInvoiceInformation1.mmPaymentDueDate,
					PaymentTerms3.mmDueDate, InvoiceTotals2.mmPaymentDueDate, PaymentCodeOrOther2Choice.mmPaymentDueDate, Instalment2.mmPaymentDueDate, TransactionCertificateContract1.mmExpectedAdvancePaymentReturnDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDueDate";
			definition = "Due date for the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(PaymentObligation obj) {
			return obj.getPaymentDueDate();
		}

		@Override
		public void setValue(PaymentObligation obj, ISODate value) {
			obj.setPaymentDueDate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentObligation";
				definition = "Obligation for the debtor to pay the creditor an amount of cash.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.mmObligation, ContactPoint.mmRemittanceRelatedPayment, Document.mmPaymentObligation, Payment.mmPaymentObligation,
						PortfolioTransfer.mmPaymentObligation, CashAccountContract.mmBalanceTransfer, SecuritiesTradeExecution.mmPaymentObligation, ForeignExchangeTrade.mmResultingSettlement,
						CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement, PaymentObligationPartyRole.mmPaymentObligation, Demand.mmPayment, CurrencyOption.mmPremiumSettlement,
						com.tools20022.repository.entity.CommercialTrade.mmPaymentObligation, CollateralMovement.mmCashCollateralMovement, BuyIn.mmCashCompensation, com.tools20022.repository.entity.BankingTransaction.mmPaymentObligation,
						com.tools20022.repository.entity.RepurchaseAgreement.mmPaymentObligation, Assignment.mmPaymentObligation, com.tools20022.repository.entity.PaymentTerms.mmRelatedPaymentObligation,
						InterestManagement.mmPaymentObligation);
				derivationElement_lazy = () -> Arrays.asList(PaymentObligation1.mmPaymentTerms, PaymentObligation2.mmPaymentTerms, BalanceTransferReference1.mmBalanceTransferReference);
				subType_lazy = () -> Arrays.asList(Instalment.mmObject(), Garnishment.mmObject());
				superType_lazy = () -> Obligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.mmPaymentOffset, com.tools20022.repository.entity.PaymentObligation.mmPurpose,
						com.tools20022.repository.entity.PaymentObligation.mmRemittanceDeliveryMethod, com.tools20022.repository.entity.PaymentObligation.mmAssociatedDocument, com.tools20022.repository.entity.PaymentObligation.mmAmount,
						com.tools20022.repository.entity.PaymentObligation.mmRemittanceLocation, com.tools20022.repository.entity.PaymentObligation.mmInterest, com.tools20022.repository.entity.PaymentObligation.mmCommercialTrade,
						com.tools20022.repository.entity.PaymentObligation.mmPercentage, com.tools20022.repository.entity.PaymentObligation.mmMaximumAmount, com.tools20022.repository.entity.PaymentObligation.mmExpiryDate,
						com.tools20022.repository.entity.PaymentObligation.mmApplicableLaw, com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceBuyIn,
						com.tools20022.repository.entity.PaymentObligation.mmRelatedCorporateAction, com.tools20022.repository.entity.PaymentObligation.mmRelatedCollateralMovement,
						com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceUndertakingDemand, com.tools20022.repository.entity.PaymentObligation.mmPartyRole,
						com.tools20022.repository.entity.PaymentObligation.mmExecutedSecuritiesTrade, com.tools20022.repository.entity.PaymentObligation.mmRelatedAccountClosingTerms,
						com.tools20022.repository.entity.PaymentObligation.mmPaymentSourcePortfolioTransfer, com.tools20022.repository.entity.PaymentObligation.mmPaymentSourceCurrencyOption,
						com.tools20022.repository.entity.PaymentObligation.mmExchangeRateInformation, com.tools20022.repository.entity.PaymentObligation.mmDividend, com.tools20022.repository.entity.PaymentObligation.mmRepurchaseAgreement,
						com.tools20022.repository.entity.PaymentObligation.mmRelatedAssignment, com.tools20022.repository.entity.PaymentObligation.mmBankingTransaction, com.tools20022.repository.entity.PaymentObligation.mmPaymentTerms,
						com.tools20022.repository.entity.PaymentObligation.mmPaymentDueDate);
				derivationComponent_lazy = () -> Arrays.asList(Purpose1Choice.mmObject(), Purpose2Choice.mmObject(), PurposeChoice.mmObject(), SettlementData1.mmObject(), SettlementData2.mmObject(), PaymentTerms3.mmObject(),
						PaymentTerms1.mmObject(), PaymentTerms2.mmObject(), PaymentObligation1.mmObject(), PaymentObligation2.mmObject(), PaymentTerms4.mmObject(), PaymentTerms5.mmObject(), Purpose3Choice.mmObject(),
						PaymentTerms6.mmObject(), CreditLineType1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentObligation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Payment> getPaymentOffset() {
		return paymentOffset == null ? paymentOffset = new ArrayList<>() : paymentOffset;
	}

	public PaymentObligation setPaymentOffset(List<Payment> paymentOffset) {
		this.paymentOffset = Objects.requireNonNull(paymentOffset);
		return this;
	}

	public PaymentPurposeCode getPurpose() {
		return purpose;
	}

	public PaymentObligation setPurpose(PaymentPurposeCode purpose) {
		this.purpose = Objects.requireNonNull(purpose);
		return this;
	}

	public RemittanceLocationMethodCode getRemittanceDeliveryMethod() {
		return remittanceDeliveryMethod;
	}

	public PaymentObligation setRemittanceDeliveryMethod(RemittanceLocationMethodCode remittanceDeliveryMethod) {
		this.remittanceDeliveryMethod = Objects.requireNonNull(remittanceDeliveryMethod);
		return this;
	}

	public List<Document> getAssociatedDocument() {
		return associatedDocument == null ? associatedDocument = new ArrayList<>() : associatedDocument;
	}

	public PaymentObligation setAssociatedDocument(List<Document> associatedDocument) {
		this.associatedDocument = Objects.requireNonNull(associatedDocument);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public PaymentObligation setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public List<ContactPoint> getRemittanceLocation() {
		return remittanceLocation == null ? remittanceLocation = new ArrayList<>() : remittanceLocation;
	}

	public PaymentObligation setRemittanceLocation(List<ContactPoint> remittanceLocation) {
		this.remittanceLocation = Objects.requireNonNull(remittanceLocation);
		return this;
	}

	public List<InterestManagement> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public PaymentObligation setInterest(List<InterestManagement> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public CommercialTrade getCommercialTrade() {
		return commercialTrade;
	}

	public PaymentObligation setCommercialTrade(com.tools20022.repository.entity.CommercialTrade commercialTrade) {
		this.commercialTrade = Objects.requireNonNull(commercialTrade);
		return this;
	}

	public PercentageRate getPercentage() {
		return percentage;
	}

	public PaymentObligation setPercentage(PercentageRate percentage) {
		this.percentage = Objects.requireNonNull(percentage);
		return this;
	}

	public CurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public PaymentObligation setMaximumAmount(CurrencyAndAmount maximumAmount) {
		this.maximumAmount = Objects.requireNonNull(maximumAmount);
		return this;
	}

	public ISODateTime getExpiryDate() {
		return expiryDate;
	}

	public PaymentObligation setExpiryDate(ISODateTime expiryDate) {
		this.expiryDate = Objects.requireNonNull(expiryDate);
		return this;
	}

	public CountryCode getApplicableLaw() {
		return applicableLaw;
	}

	public PaymentObligation setApplicableLaw(CountryCode applicableLaw) {
		this.applicableLaw = Objects.requireNonNull(applicableLaw);
		return this;
	}

	public Optional<BuyIn> getPaymentSourceBuyIn() {
		return paymentSourceBuyIn == null ? Optional.empty() : Optional.of(paymentSourceBuyIn);
	}

	public PaymentObligation setPaymentSourceBuyIn(BuyIn paymentSourceBuyIn) {
		this.paymentSourceBuyIn = paymentSourceBuyIn;
		return this;
	}

	public CorporateActionProceedsDeliveryInstruction getRelatedCorporateAction() {
		return relatedCorporateAction;
	}

	public PaymentObligation setRelatedCorporateAction(CorporateActionProceedsDeliveryInstruction relatedCorporateAction) {
		this.relatedCorporateAction = Objects.requireNonNull(relatedCorporateAction);
		return this;
	}

	public CollateralMovement getRelatedCollateralMovement() {
		return relatedCollateralMovement;
	}

	public PaymentObligation setRelatedCollateralMovement(CollateralMovement relatedCollateralMovement) {
		this.relatedCollateralMovement = Objects.requireNonNull(relatedCollateralMovement);
		return this;
	}

	public Demand getPaymentSourceUndertakingDemand() {
		return paymentSourceUndertakingDemand;
	}

	public PaymentObligation setPaymentSourceUndertakingDemand(Demand paymentSourceUndertakingDemand) {
		this.paymentSourceUndertakingDemand = Objects.requireNonNull(paymentSourceUndertakingDemand);
		return this;
	}

	public List<PaymentObligationPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public PaymentObligation setPartyRole(List<PaymentObligationPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public SecuritiesTradeExecution getExecutedSecuritiesTrade() {
		return executedSecuritiesTrade;
	}

	public PaymentObligation setExecutedSecuritiesTrade(SecuritiesTradeExecution executedSecuritiesTrade) {
		this.executedSecuritiesTrade = Objects.requireNonNull(executedSecuritiesTrade);
		return this;
	}

	public Optional<CashAccountContract> getRelatedAccountClosingTerms() {
		return relatedAccountClosingTerms == null ? Optional.empty() : Optional.of(relatedAccountClosingTerms);
	}

	public PaymentObligation setRelatedAccountClosingTerms(CashAccountContract relatedAccountClosingTerms) {
		this.relatedAccountClosingTerms = relatedAccountClosingTerms;
		return this;
	}

	public List<PortfolioTransfer> getPaymentSourcePortfolioTransfer() {
		return paymentSourcePortfolioTransfer == null ? paymentSourcePortfolioTransfer = new ArrayList<>() : paymentSourcePortfolioTransfer;
	}

	public PaymentObligation setPaymentSourcePortfolioTransfer(List<PortfolioTransfer> paymentSourcePortfolioTransfer) {
		this.paymentSourcePortfolioTransfer = Objects.requireNonNull(paymentSourcePortfolioTransfer);
		return this;
	}

	public Optional<CurrencyOption> getPaymentSourceCurrencyOption() {
		return paymentSourceCurrencyOption == null ? Optional.empty() : Optional.of(paymentSourceCurrencyOption);
	}

	public PaymentObligation setPaymentSourceCurrencyOption(CurrencyOption paymentSourceCurrencyOption) {
		this.paymentSourceCurrencyOption = paymentSourceCurrencyOption;
		return this;
	}

	public Optional<ForeignExchangeTrade> getExchangeRateInformation() {
		return exchangeRateInformation == null ? Optional.empty() : Optional.of(exchangeRateInformation);
	}

	public PaymentObligation setExchangeRateInformation(ForeignExchangeTrade exchangeRateInformation) {
		this.exchangeRateInformation = exchangeRateInformation;
		return this;
	}

	public Dividend getDividend() {
		return dividend;
	}

	public PaymentObligation setDividend(com.tools20022.repository.entity.Dividend dividend) {
		this.dividend = Objects.requireNonNull(dividend);
		return this;
	}

	public RepurchaseAgreement getRepurchaseAgreement() {
		return repurchaseAgreement;
	}

	public PaymentObligation setRepurchaseAgreement(com.tools20022.repository.entity.RepurchaseAgreement repurchaseAgreement) {
		this.repurchaseAgreement = Objects.requireNonNull(repurchaseAgreement);
		return this;
	}

	public Assignment getRelatedAssignment() {
		return relatedAssignment;
	}

	public PaymentObligation setRelatedAssignment(Assignment relatedAssignment) {
		this.relatedAssignment = Objects.requireNonNull(relatedAssignment);
		return this;
	}

	public BankingTransaction getBankingTransaction() {
		return bankingTransaction;
	}

	public PaymentObligation setBankingTransaction(com.tools20022.repository.entity.BankingTransaction bankingTransaction) {
		this.bankingTransaction = Objects.requireNonNull(bankingTransaction);
		return this;
	}

	public PaymentTerms getPaymentTerms() {
		return paymentTerms;
	}

	public PaymentObligation setPaymentTerms(com.tools20022.repository.entity.PaymentTerms paymentTerms) {
		this.paymentTerms = Objects.requireNonNull(paymentTerms);
		return this;
	}

	public ISODate getPaymentDueDate() {
		return paymentDueDate;
	}

	public PaymentObligation setPaymentDueDate(ISODate paymentDueDate) {
		this.paymentDueDate = Objects.requireNonNull(paymentDueDate);
		return this;
	}
}