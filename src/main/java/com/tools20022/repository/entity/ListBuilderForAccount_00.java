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

import com.tools20022.repository.choice.AccountSelection1Choice;
import com.tools20022.repository.choice.AccountSelection2Choice;
import com.tools20022.repository.choice.BalanceType7Choice;
import com.tools20022.repository.choice.InvestmentAccountSelection1Choice;
import com.tools20022.repository.msg.*;
import java.util.List;

class ListBuilderForAccount_00 {

	@SuppressWarnings("unchecked")
	static <T> List<T> addElems(List<T> list) {
		list.add((T) CashAccount15.mmIdentification);
		list.add((T) CashAccount14.mmIdentification);
		list.add((T) CashAccount21.mmIdentification);
		list.add((T) CashAccount22.mmIdentification);
		list.add((T) StatementDetails.mmAccountIdentification);
		list.add((T) StatementDetails.mmSubAccountIdentification);
		list.add((T) StatementAndFinancialInstrumentDetails.mmAccountIdentification);
		list.add((T) StatementAndFinancialInstrumentDetails.mmSubAccountIdentification);
		list.add((T) CashAccount5.mmIdentification);
		list.add((T) SecuritiesAccount1.mmIdentification);
		list.add((T) InvestmentAccount17.mmIdentification);
		list.add((T) Account1.mmIdentification);
		list.add((T) Account2.mmIdentification);
		list.add((T) CashAccount4.mmIdentification);
		list.add((T) DirectDebitMandate2.mmDebtorAccountIdentification);
		list.add((T) DirectDebitMandate3.mmDebtorAccountIdentification);
		list.add((T) CashAccount12.mmIdentification);
		list.add((T) SecuritiesAccount4.mmIdentification);
		list.add((T) InvestmentAccount27.mmIdentification);
		list.add((T) DirectDebitMandate4.mmDebtorAccount);
		list.add((T) InvestmentAccount35.mmIdentification);
		list.add((T) CashAccount26.mmIdentification);
		list.add((T) Account4.mmIdentification);
		list.add((T) Account5.mmIdentification);
		list.add((T) Account6.mmIdentification);
		list.add((T) PartyIdentificationAndAccount93.mmAccountIdentification);
		list.add((T) InvestmentAccountSelection1.mmAccountIdentification);
		list.add((T) InvestmentAccountSelection2.mmAccountIdentification);
		list.add((T) InvestmentAccount16.mmIdentification);
		list.add((T) InvestmentAccount26.mmIdentification);
		list.add((T) InvestmentAccount34.mmIdentification);
		list.add((T) LimitIdentificationDetails1.mmAccountIdentification);
		list.add((T) LimitIdentificationDetails2.mmAccountIdentification);
		list.add((T) LimitIdentificationDetails3.mmAccountIdentification);
		list.add((T) LimitIdentification1.mmAccountIdentification);
		list.add((T) LimitIdentification2.mmAccountIdentification);
		list.add((T) ReservationIdentificationDetails1.mmAccountIdentification);
		list.add((T) ReservationIdentification1.mmAccountIdentification);
		list.add((T) CashAccountSearchCriteria2.mmAccountIdentification);
		list.add((T) CashAccountSearchCriteria3.mmAccountIdentification);
		list.add((T) CashAccountSearchCriteria4.mmAccountIdentification);
		list.add((T) CashAccountSearchCriteria5.mmAccountIdentification);
		list.add((T) LimitSearchCriteria2.mmAccountIdentification);
		list.add((T) LimitSearchCriteria3.mmAccountIdentification);
		list.add((T) ReservationSearchCriteria1.mmAccountIdentification);
		list.add((T) ReservationSearchCriteria2.mmAccountIdentification);
		list.add((T) CashAccount7.mmIdentification);
		list.add((T) CashAccount16.mmIdentification);
		list.add((T) CashAccount24.mmIdentification);
		list.add((T) StandingOrderSearchCriteria1.mmAssociatedPoolAccount);
		list.add((T) SystemSearch2.mmAccountIdentification);
		list.add((T) AccountCashEntrySearch2.mmAccountIdentification);
		list.add((T) SystemSearch3.mmAccountIdentification);
		list.add((T) StandingOrderIdentification1.mmAccountIdentification);
		list.add((T) Account3.mmIdentification);
		list.add((T) CashAccount6.mmIdentification);
		list.add((T) CashAccount11.mmIdentification);
		list.add((T) StandingOrderDetails3.mmAssociatedPoolAccount);
		list.add((T) AccountReport7.mmAccountIdentification);
		list.add((T) AccountReport8.mmAccountIdentification);
		list.add((T) AccountReport10.mmAccountIdentification);
		list.add((T) StandingOrder2.mmAssociatedPoolAccount);
		list.add((T) AccountReport13.mmAccountIdentification);
		list.add((T) SystemDetails2.mmAccountIdentification);
		list.add((T) AccountCashEntryDetails3.mmAccountIdentification);
		list.add((T) System1.mmAccountIdentification);
		list.add((T) CashAccount13.mmIdentification);
		list.add((T) CashAccount20.mmIdentification);
		list.add((T) CashAccount25.mmIdentification);
		list.add((T) InvestmentAccount10.mmAccountIdentification);
		list.add((T) InvestmentAccount11.mmAccountIdentification);
		list.add((T) PartyIdentificationAndAccount2.mmAccountIdentification);
		list.add((T) Account7.mmIdentification);
		list.add((T) InvestmentAccount22.mmAccountIdentification);
		list.add((T) SubAccount1.mmIdentification);
		list.add((T) InvestmentAccount24.mmAccountIdentification);
		list.add((T) PartyIdentificationAndAccount5.mmAccountIdentification);
		list.add((T) PartyIdentificationAndAccount4.mmAccountIdentification);
		list.add((T) QuantityAndAccount29.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount11.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount11.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount11.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount11.mmTaxAccount);
		list.add((T) PartyIdentificationAndAccount12.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount12.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount12.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount12.mmTaxAccount);
		list.add((T) PartyIdentificationAndAccount20.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount20.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount20.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount20.mmTaxAccount);
		list.add((T) PartyIdentificationAndAccount15.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount15.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount15.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount15.mmTaxAccount);
		list.add((T) PartyIdentificationAndAccount39.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount39.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount39.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount39.mmTaxAccount);
		list.add((T) PartyIdentificationAndAccount50.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount50.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount50.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount50.mmTaxAccount);
		list.add((T) QuantityAndAccount30.mmCashAccount);
		list.add((T) QuantityAndAccount32.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount64.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount64.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount64.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount64.mmTaxAccount);
		list.add((T) PartyIdentificationAndAccount60.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount60.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount60.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount60.mmTaxAccount);
		list.add((T) QuantityAndAccount33.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount17.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount18.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount23.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount24.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount52.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount54.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount57.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount58.mmCashAccount);
		list.add((T) CashOption3.mmCashAccountIdentification);
		list.add((T) CashOption6.mmCashAccountIdentification);
		list.add((T) CashOption11.mmCashAccountIdentification);
		list.add((T) CashOption14.mmCashAccountIdentification);
		list.add((T) CashOption16.mmCashAccountIdentification);
		list.add((T) CashOption20.mmCashAccountIdentification);
		list.add((T) CashOption25.mmCashAccountIdentification);
		list.add((T) CashOption28.mmCashAccountIdentification);
		list.add((T) CashOption4.mmCashAccountIdentification);
		list.add((T) CashOption8.mmCashAccountIdentification);
		list.add((T) CashOption10.mmCashAccountIdentification);
		list.add((T) CashOption15.mmCashAccountIdentification);
		list.add((T) CashOption17.mmCashAccountIdentification);
		list.add((T) CashOption21.mmCashAccountIdentification);
		list.add((T) CashOption24.mmCashAccountIdentification);
		list.add((T) CashOption29.mmCashAccountIdentification);
		list.add((T) Account9.mmIdentification);
		list.add((T) Account10.mmIdentification);
		list.add((T) SafekeepingAccount1.mmIdentification);
		list.add((T) SafekeepingAccount2.mmIdentification);
		list.add((T) Account11.mmIdentification);
		list.add((T) Account13.mmIdentification);
		list.add((T) Account12.mmIdentification);
		list.add((T) QuantityAndAccount6.mmCashAccount);
		list.add((T) QuantityAndAccount11.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount29.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount29.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount29.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount29.mmTaxAccount);
		list.add((T) PartyIdentificationAndAccount27.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount27.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount27.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount27.mmTaxAccount);
		list.add((T) QuantityAndAccount18.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount38.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount38.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount38.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount38.mmTaxAccount);
		list.add((T) QuantityAndAccount19.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount59.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount59.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount59.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount59.mmTaxAccount);
		list.add((T) QuantityAndAccount1.mmCashAccount);
		list.add((T) QuantityAndAccount5.mmCashAccount);
		list.add((T) QuantityAndAccount17.mmCashAccount);
		list.add((T) QuantityAndAccount24.mmCashAccount);
		list.add((T) QuantityAndAccount25.mmCashAccount);
		list.add((T) QuantityAndAccount34.mmCashAccount);
		list.add((T) QuantityAndAccount2.mmCashAccount);
		list.add((T) QuantityAndAccount12.mmCashAccount);
		list.add((T) QuantityAndAccount15.mmCashAccount);
		list.add((T) QuantityAndAccount20.mmCashAccount);
		list.add((T) QuantityAndAccount28.mmCashAccount);
		list.add((T) QuantityAndAccount37.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount9.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount79.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount83.mmCashAccount);
		list.add((T) SecuritiesAccount20.mmIdentification);
		list.add((T) ConfirmationPartyDetails3.mmCashDetails);
		list.add((T) PartyIdentificationAndAccount8.mmCashAccount);
		list.add((T) ConfirmationPartyDetails6.mmCashDetails);
		list.add((T) PartyIdentificationAndAccount80.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount80.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount80.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount80.mmTaxAccount);
		list.add((T) AccountForAction1.mmIdentification);
		list.add((T) AccountForAction2.mmIdentification);
		list.add((T) CustomerAccount1.mmIdentification);
		list.add((T) CustomerAccount5.mmIdentification);
		list.add((T) CustomerAccountModification1.mmIdentification);
		list.add((T) CustomerAccount4.mmIdentification);
		list.add((T) CashAccount28.mmIdentification);
		list.add((T) CashAccount27.mmIdentification);
		list.add((T) AccountingStatementOfHoldings1.mmSubAccountDetails);
		list.add((T) AccountingStatementOfHoldings2.mmSubAccountDetails);
		list.add((T) CustodyStatementOfHoldings1.mmSubAccountDetails);
		list.add((T) CustodyStatementOfHoldings2.mmSubAccountDetails);
		list.add((T) InvestmentAccount13.mmAccountIdentification);
		list.add((T) PartyIdentificationAndAccount3.mmAccountIdentification);
		list.add((T) Creditor2.mmAccountIdentification);
		list.add((T) Debtor2.mmAccountIdentification);
		list.add((T) InvestmentAccount15.mmAccountIdentification);
		list.add((T) InvestmentAccount21.mmAccountIdentification);
		list.add((T) CreditTransfer6.mmCreditorAgentAccount);
		list.add((T) InvestmentAccount20.mmAccountIdentification);
		list.add((T) InvestmentAccount14.mmAccountIdentification);
		list.add((T) InvestmentAccount12.mmIdentification);
		list.add((T) StatementOfInvestmentFundTransactions1.mmSubAccountDetails);
		list.add((T) InvestmentAccount25.mmIdentification);
		list.add((T) StatementOfInvestmentFundTransactions2.mmSubAccountDetails);
		list.add((T) CashAccount3.mmIdentification);
		list.add((T) EligiblePosition2.mmAccountIdentification);
		list.add((T) EligiblePosition3.mmAccountIdentification);
		list.add((T) EligiblePosition4.mmAccountIdentification);
		list.add((T) SubAccount2.mmIdentification);
		list.add((T) DetailedInstructionStatus1.mmAccountIdentification);
		list.add((T) DetailedInstructionStatus1.mmSubAccountIdentification);
		list.add((T) DetailedInstructionStatus2.mmAccountIdentification);
		list.add((T) DetailedInstructionStatus2.mmSubAccountIdentification);
		list.add((T) DetailedInstructionStatus9.mmAccountIdentification);
		list.add((T) DetailedInstructionStatus9.mmSubAccountIdentification);
		list.add((T) CorporateActionOption1.mmAgentSecuritiesAccountIdentification);
		list.add((T) CorporateActionOption1.mmAgentCashAccountIdentification);
		list.add((T) CashAccount19.mmAccountIdentification);
		list.add((T) ProceedsDelivery1.mmCashAccountIdentification);
		list.add((T) CashAccount18.mmAccountIdentification);
		list.add((T) CorporateActionMovementFailedStatus1.mmAgentAccountIdentification);
		list.add((T) CorporateActionMovementFailedStatus1.mmClientAccountIdentification);
		list.add((T) IncludedAccount1.mmSecuritiesAccountIdentification);
		list.add((T) CashAccount17.mmAccountIdentification);
		list.add((T) QuantityAndAccount7.mmCashAccount);
		list.add((T) QuantityAndAccount16.mmCashAccount);
		list.add((T) QuantityAndAccount3.mmCashAccount);
		list.add((T) QuantityAndAccount13.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount53.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount53.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount53.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount53.mmTaxAccount);
		list.add((T) PartyIdentificationAndAccount55.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount55.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount55.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount55.mmTaxAccount);
		list.add((T) QuantityAndAccount8.mmCashAccount);
		list.add((T) QuantityAndAccount14.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount48.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount48.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount48.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount48.mmTaxAccount);
		list.add((T) IdentificationInformation1.mmAccount);
		list.add((T) IdentificationInformation2.mmAccount);
		list.add((T) AccountingAccount1.mmIdentification);
		list.add((T) SettlementTerms1.mmBeneficiaryAccount);
		list.add((T) InterestCalculation2.mmCollateralAccountIdentification);
		list.add((T) CollateralAccount1.mmIdentification);
		list.add((T) MemberDetails.mmAccount);
		list.add((T) QuantityAndAccount10.mmCashAccount);
		list.add((T) QuantityAndAccount21.mmCashAccount);
		list.add((T) QuantityAndAccount4.mmCashAccount);
		list.add((T) QuantityAndAccount22.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount69.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount69.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount69.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount69.mmTaxAccount);
		list.add((T) PartyIdentificationAndAccount70.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount70.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount70.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount70.mmTaxAccount);
		list.add((T) QuantityAndAccount27.mmCashAccount);
		list.add((T) QuantityAndAccount36.mmCashAccount);
		list.add((T) QuantityAndAccount9.mmCashAccount);
		list.add((T) QuantityAndAccount23.mmCashAccount);
		list.add((T) QuantityAndAccount26.mmCashAccount);
		list.add((T) QuantityAndAccount35.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount72.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount72.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount72.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount72.mmTaxAccount);
		list.add((T) SecuritiesAccount21.mmAccount);
		list.add((T) BalanceType7Choice.mmAccount);
		list.add((T) SecuritiesAccount19.mmIdentification);
		list.add((T) SecuritiesAccount18.mmIdentification);
		list.add((T) PartyIdentificationAndAccount32.mmAccountIdentification);
		list.add((T) Contribution1.mmAccount);
		list.add((T) DefaultFund1.mmDefaultFundAccount);
		list.add((T) CashAccountCharacteristics1.mmDebitAccount);
		list.add((T) SubAccount3.mmIdentification);
		list.add((T) CashAccount10.mmIdentification);
		list.add((T) CashAccount8.mmIdentification);
		list.add((T) PartyIdentificationAndAccount13.mmAccountIdentification);
		list.add((T) InvestmentAccount31.mmAccountIdentification);
		list.add((T) InvestmentAccount32.mmAccountIdentification);
		list.add((T) InvestmentAccount33.mmAccountIdentification);
		list.add((T) CreditTransfer7.mmCreditorAgentAccount);
		list.add((T) Account8.mmIdentification);
		list.add((T) PartyIdentificationAndAccount7.mmAccountIdentification);
		list.add((T) StatementAttributes1.mmAccountIdentification);
		list.add((T) StatementAttributes1.mmSubAccountIdentification);
		list.add((T) CustomerAccount2.mmIdentification);
		list.add((T) CustomerAccount2.mmReferenceAccountIdentification);
		list.add((T) CustomerAccount3.mmIdentification);
		list.add((T) Balance3.mmSubAccountDetails);
		list.add((T) LimitIdentification4.mmAccountIdentification);
		list.add((T) ServiceCategoryTotals1.mmAccountIdentification);
		list.add((T) BillingSearchCriteria1.mmAccountIdentification);
		list.add((T) LimitUtilisationJournalSearchCriteria1.mmAccountIdentification);
		list.add((T) InvestmentAccount38.mmIdentification);
		list.add((T) InvestmentAccount37.mmIdentification);
		list.add((T) InvestmentAccount40.mmAccountIdentification);
		list.add((T) AccountReport17.mmAccountIdentification);
		list.add((T) Account15.mmIdentification);
		list.add((T) Account16.mmIdentification);
		list.add((T) CashAccount29.mmIdentification);
		list.add((T) InvestmentAccount41.mmAccountIdentification);
		list.add((T) Account14.mmIdentification);
		list.add((T) CashOption31.mmCashAccountIdentification);
		list.add((T) CashOption32.mmCashAccountIdentification);
		list.add((T) PartyIdentificationAndAccount97.mmAccountIdentification);
		list.add((T) PartyIdentificationAndAccount96.mmAccountIdentification);
		list.add((T) CashOption36.mmCashAccountIdentification);
		list.add((T) CashOption35.mmCashAccountIdentification);
		list.add((T) InvestmentAccount43.mmIdentification);
		list.add((T) StatementOfInvestmentFundTransactions3.mmSubAccountDetails);
		list.add((T) InvestmentAccountSelection1Choice.mmAccountIdentification);
		list.add((T) InvestmentAccount45.mmAccountIdentification);
		list.add((T) InvestmentAccount42.mmAccountIdentification);
		list.add((T) InvestmentAccount46.mmIdentification);
		list.add((T) AccountSubLevel1.mmAccountIdentification);
		list.add((T) AccountSubLevel4.mmAccountIdentification);
		list.add((T) AccountSubLevel5.mmAccountIdentification);
		list.add((T) AccountSubLevel2.mmAccountIdentification);
		list.add((T) AccountSubLevel3.mmAccountIdentification);
		list.add((T) AccountSubLevel6.mmAccountIdentification);
		list.add((T) AccountSubLevel7.mmAccountIdentification);
		list.add((T) AccountSubLevel8.mmAccountIdentification);
		list.add((T) AccountSubLevel9.mmAccountIdentification);
		list.add((T) PartyIdentificationAndAccount101.mmCashAccount);
		list.add((T) CashCollateral3.mmCashAccountIdentification);
		list.add((T) CashCollateral2.mmCashAccountIdentification);
		list.add((T) DetailedInstructionStatus10.mmAccountIdentification);
		list.add((T) DetailedInstructionStatus10.mmSubAccountIdentification);
		list.add((T) EligiblePosition5.mmAccountIdentification);
		list.add((T) EligiblePosition6.mmAccountIdentification);
		list.add((T) CashCollateralResponse1.mmCashAccountIdentification);
		list.add((T) PartyIdentificationAndAccount102.mmAccountIdentification);
		list.add((T) InterestCalculation3.mmCollateralAccountIdentification);
		list.add((T) SubAccount4.mmIdentification);
		list.add((T) PartyIdentificationAndAccount104.mmCashAccount);
		list.add((T) CashCollateral5.mmCashAccountIdentification);
		list.add((T) FinancialItemParameters1.mmDebitAccount);
		list.add((T) FinancialItemParameters1.mmCreditAccount);
		list.add((T) ATMAccountStatement1.mmAccountIdentifier);
		list.add((T) CardAccount3.mmAccountIdentifier);
		list.add((T) CardAccount1.mmAccountIdentifier);
		list.add((T) CardAccount6.mmAccountIdentifier);
		list.add((T) CardAccount4.mmAccountIdentifier);
		list.add((T) CardAccount5.mmAccountIdentifier);
		list.add((T) CardAccount2.mmAccountIdentifier);
		list.add((T) QuantityAndAccount39.mmCashAccount);
		list.add((T) QuantityAndAccount41.mmCashAccount);
		list.add((T) QuantityAndAccount40.mmCashAccount);
		list.add((T) QuantityAndAccount42.mmCashAccount);
		list.add((T) QuantityAndAccount38.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount112.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount112.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount112.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount112.mmTaxAccount);
		list.add((T) PartyIdentificationAndAccount111.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount111.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount111.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount111.mmTaxAccount);
		list.add((T) QuantityAndAccount43.mmCashAccount);
		list.add((T) Account18.mmIdentification);
		list.add((T) QuantityAndAccount45.mmCashAccount);
		list.add((T) QuantityAndAccount44.mmCashAccount);
		list.add((T) CashAccountCharacteristics2.mmDebitAccount);
		list.add((T) CashOption42.mmCashAccountIdentification);
		list.add((T) CashOption43.mmCashAccountIdentification);
		list.add((T) PartyIdentificationAndAccount120.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount121.mmCashAccount);
		list.add((T) Account19.mmIdentification);
		list.add((T) InvestmentAccount49.mmIdentification);
		list.add((T) CashAccount34.mmIdentification);
		list.add((T) InvestmentAccount54.mmAccountIdentification);
		list.add((T) AccountSelection1Choice.mmAccountIdentification);
		list.add((T) InvestmentAccount50.mmIdentification);
		list.add((T) InvestmentAccount56.mmAccountIdentification);
		list.add((T) PartyIdentificationAndAccount124.mmAccountIdentification);
		list.add((T) SubAccount5.mmIdentification);
		list.add((T) InvestmentAccount55.mmAccountIdentification);
		list.add((T) DirectDebitMandate5.mmDebtorAccount);
		list.add((T) CashAccount32.mmIdentification);
		list.add((T) InvestmentAccount53.mmAccountIdentification);
		list.add((T) PartyIdentificationAndAccount125.mmAccountIdentification);
		list.add((T) Account20.mmIdentification);
		list.add((T) CashAccount33.mmIdentification);
		list.add((T) InvestmentAccount57.mmAccountIdentification);
		list.add((T) PartyIdentificationAndAccount123.mmAccountIdentification);
		list.add((T) CollateralAccount2.mmIdentification);
		list.add((T) InterestCalculation4.mmCollateralAccountIdentification);
		list.add((T) PartyIdentificationAndAccount126.mmAccountIdentification);
		list.add((T) CashOption49.mmCashAccountIdentification);
		list.add((T) CashOption47.mmCashAccountIdentification);
		list.add((T) PartyIdentificationAndAccount129.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount130.mmCashAccount);
		list.add((T) QuantityAndAccount47.mmCashAccount);
		list.add((T) QuantityAndAccount48.mmCashAccount);
		list.add((T) QuantityAndAccount46.mmCashAccount);
		list.add((T) QuantityAndAccount51.mmCashAccount);
		list.add((T) QuantityAndAccount49.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount133.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount133.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount133.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount133.mmTaxAccount);
		list.add((T) SecuritiesAccount30.mmIdentification);
		list.add((T) QuantityAndAccount50.mmCashAccount);
		list.add((T) QuantityAndAccount55.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount134.mmCashAccount);
		list.add((T) PartyIdentificationAndAccount134.mmChargesAccount);
		list.add((T) PartyIdentificationAndAccount134.mmCommissionAccount);
		list.add((T) PartyIdentificationAndAccount134.mmTaxAccount);
		list.add((T) Account21.mmIdentification);
		list.add((T) QuantityAndAccount54.mmCashAccount);
		list.add((T) CardAccount10.mmAccountIdentifier);
		list.add((T) CardAccount9.mmAccountIdentifier);
		list.add((T) CardAccount8.mmAccountIdentifier);
		list.add((T) CardAccount11.mmAccountIdentifier);
		list.add((T) CardAccount13.mmAccountIdentifier);
		list.add((T) CardAccount7.mmAccountIdentifier);
		list.add((T) CardAccount12.mmAccountIdentifier);
		list.add((T) BillingSearchCriteria2.mmAccountIdentification);
		list.add((T) Balance14.mmSubAccountDetails);
		list.add((T) CustomerAccount7.mmIdentification);
		list.add((T) CustomerAccount7.mmReferenceAccountIdentification);
		list.add((T) ServiceCategoryTotals2.mmAccountIdentification);
		list.add((T) LimitSearchCriteria4.mmAccountIdentification);
		list.add((T) CustomerAccount6.mmIdentification);
		list.add((T) InvestmentAccount61.mmIdentification);
		list.add((T) AccountSelection2Choice.mmAccountIdentification);
		list.add((T) AccountManagementStatusAndReason5.mmExistingAccountIdentification);
		list.add((T) AccountManagementStatusAndReason5.mmAccountIdentification);
		list.add((T) InvestmentAccount62.mmIdentification);
		list.add((T) AccountSubLevel15.mmAccountIdentification);
		list.add((T) AccountSubLevel16.mmAccountIdentification);
		list.add((T) InvestmentAccount58.mmAccountIdentification);
		list.add((T) AccountSubLevel18.mmAccountIdentification);
		list.add((T) AccountSubLevel19.mmAccountIdentification);
		list.add((T) SubAccount6.mmIdentification);
		list.add((T) AccountSubLevel11.mmAccountIdentification);
		list.add((T) AccountSubLevel12.mmAccountIdentification);
		list.add((T) PartyIdentificationAndAccount147.mmAccountIdentification);
		list.add((T) Account23.mmAccountIdentification);
		list.add((T) AccountSubLevel17.mmAccountIdentification);
		list.add((T) AccountSubLevel13.mmAccountIdentification);
		list.add((T) AccountSubLevel14.mmAccountIdentification);
		list.add((T) CreditTransfer8.mmCreditorAgentAccount);
		list.add((T) InvestmentAccount60.mmAccountIdentification);
		list.add((T) Account22.mmIdentification);
		list.add((T) DirectDebitMandate6.mmDebtorAccount);
		list.add((T) CashOption51.mmCashAccountIdentification);
		list.add((T) CashOption50.mmCashAccountIdentification);
		list.add((T) CashCollateralResponse2.mmCashAccountIdentification);
		list.add((T) CashOption53.mmCashAccountIdentification);
		list.add((T) CashOption54.mmCashAccountIdentification);
		list.add((T) QuantityAndAccount57.mmCashAccount);
		list.add((T) QuantityAndAccount58.mmCashAccount);
		list.add((T) QuantityAndAccount56.mmCashAccount);
		list.add((T) QuantityAndAccount61.mmCashAccount);
		list.add((T) QuantityAndAccount62.mmCashAccount);
		list.add((T) QuantityAndAccount59.mmCashAccount);
		list.add((T) QuantityAndAccount60.mmCashAccount);
		list.add((T) CollateralAccount3.mmIdentification);
		list.add((T) PositionAccount2.mmIdentification);
		list.add((T) CollateralAccount4.mmIdentification);
		list.add((T) Account24.mmIdentification);
		list.add((T) CashAccount201.mmIdentification);
		list.add((T) InvestmentAccount66.mmAccountIdentification);
		list.add((T) InvestmentAccount67.mmAccountIdentification);
		list.add((T) PartyIdentificationAndAccount157.mmAccountIdentification);
		list.add((T) InvestmentAccount65.mmAccountIdentification);
		list.add((T) PartyIdentificationAndAccount156.mmAccountIdentification);
		list.add((T) Account25.mmIdentification);
		list.add((T) PartyIdentificationAndAccount158.mmAccountIdentification);
		list.add((T) InvestmentAccount68.mmAccountIdentification);
		list.add((T) StandingOrderSearchCriteria2.mmAssociatedPoolAccount);
		list.add((T) AccountReport21.mmAccountIdentification);
		list.add((T) CashAccountSearchCriteria6.mmAccountIdentification);
		list.add((T) LimitSearchCriteria5.mmAccountIdentification);
		list.add((T) CashAccount36.mmIdentification);
		list.add((T) QuantityAndAccount64.mmCashAccount);
		list.add((T) QuantityAndAccount63.mmCashAccount);
		list.add((T) QuantityAndAccount65.mmCashAccount);
		list.add((T) QuantityAndAccount66.mmCashAccount);
		list.add((T) QuantityAndAccount67.mmCashAccount);
		list.add((T) QuantityAndAccount68.mmCashAccount);
		list.add((T) CashOption56.mmCashAccountIdentification);
		list.add((T) CashOption57.mmCashAccountIdentification);
		list.add((T) CashOption61.mmCashAccountIdentification);
		ListBuilderForAccount_01.addElems(list);
		return list;
	}
}