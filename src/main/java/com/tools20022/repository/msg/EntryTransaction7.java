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
import com.tools20022.repository.choice.Purpose2Choice;
import com.tools20022.repository.choice.TransactionPrice3Choice;
import com.tools20022.repository.choice.TransactionQuantities2Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction7#mmReferences
 * EntryTransaction7.mmReferences}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction7#mmAmount
 * EntryTransaction7.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmCreditDebitIndicator
 * EntryTransaction7.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmAmountDetails
 * EntryTransaction7.mmAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmAvailability
 * EntryTransaction7.mmAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmBankTransactionCode
 * EntryTransaction7.mmBankTransactionCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction7#mmCharges
 * EntryTransaction7.mmCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction7#mmInterest
 * EntryTransaction7.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRelatedParties
 * EntryTransaction7.mmRelatedParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRelatedAgents
 * EntryTransaction7.mmRelatedAgents}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction7#mmPurpose
 * EntryTransaction7.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRelatedRemittanceInformation
 * EntryTransaction7.mmRelatedRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRemittanceInformation
 * EntryTransaction7.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRelatedDates
 * EntryTransaction7.mmRelatedDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRelatedPrice
 * EntryTransaction7.mmRelatedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmRelatedQuantities
 * EntryTransaction7.mmRelatedQuantities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmFinancialInstrumentIdentification
 * EntryTransaction7.mmFinancialInstrumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction7#mmTax
 * EntryTransaction7.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmReturnInformation
 * EntryTransaction7.mmReturnInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmCorporateAction
 * EntryTransaction7.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmSafekeepingAccount
 * EntryTransaction7.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmCashDeposit
 * EntryTransaction7.mmCashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmCardTransaction
 * EntryTransaction7.mmCardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmAdditionalTransactionInformation
 * EntryTransaction7.mmAdditionalTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryTransaction7#mmSupplementaryData
 * EntryTransaction7.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EntryTransaction7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the underlying transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8
 * EntryTransaction8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.EntryTransaction4
 * EntryTransaction4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EntryTransaction7", propOrder = {"references", "amount", "creditDebitIndicator", "amountDetails", "availability", "bankTransactionCode", "charges", "interest", "relatedParties", "relatedAgents", "purpose",
		"relatedRemittanceInformation", "remittanceInformation", "relatedDates", "relatedPrice", "relatedQuantities", "financialInstrumentIdentification", "tax", "returnInformation", "corporateAction", "safekeepingAccount", "cashDeposit",
		"cardTransaction", "additionalTransactionInformation", "supplementaryData"})
public class EntryTransaction7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Refs")
	protected TransactionReferences3 references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmIdentification
	 * Entry.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the identification of the underlying transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmReferences
	 * EntryTransaction8.mmReferences}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmReferences
	 * EntryTransaction4.mmReferences}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<TransactionReferences3>> mmReferences = new MMMessageAssociationEnd<EntryTransaction7, Optional<TransactionReferences3>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Provides the identification of the underlying transaction.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmReferences);
			previousVersion_lazy = () -> EntryTransaction4.mmReferences;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionReferences3.mmObject();
		}

		@Override
		public Optional<TransactionReferences3> getValue(EntryTransaction7 obj) {
			return obj.getReferences();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<TransactionReferences3> value) {
			obj.setReferences(value.orElse(null));
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount amount;
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
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money in the cash transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#mmAmount
	 * EntryTransaction8.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmAmount
	 * EntryTransaction4.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EntryTransaction7, ActiveOrHistoricCurrencyAndAmount> mmAmount = new MMMessageAttribute<EntryTransaction7, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money in the cash transaction.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmAmount);
			previousVersion_lazy = () -> EntryTransaction4.mmAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(EntryTransaction7 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(EntryTransaction7 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "CdtDbtInd", required = true)
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmCreditDebitIndicator
	 * Entry.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction is a credit or a debit transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmCreditDebitIndicator
	 * EntryTransaction8.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmCreditDebitIndicator
	 * EntryTransaction4.mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EntryTransaction7, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<EntryTransaction7, CreditDebitCode>() {
		{
			businessElementTrace_lazy = () -> Entry.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the transaction is a credit or a debit transaction.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmCreditDebitIndicator);
			previousVersion_lazy = () -> EntryTransaction4.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(EntryTransaction7 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(EntryTransaction7 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "AmtDtls")
	protected AmountAndCurrencyExchange3 amountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3
	 * AmountAndCurrencyExchange3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides detailed information on the original amount.\n\nUsage: This component (on transaction level) should be used in case booking is for a single transaction and the original amount is different from the entry amount. It can also be used in case individual original amounts are provided in case of a batch or aggregate booking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmAmountDetails
	 * EntryTransaction8.mmAmountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmAmountDetails
	 * EntryTransaction4.mmAmountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<AmountAndCurrencyExchange3>> mmAmountDetails = new MMMessageAssociationEnd<EntryTransaction7, Optional<AmountAndCurrencyExchange3>>() {
		{
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "AmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Provides detailed information on the original amount.\n\nUsage: This component (on transaction level) should be used in case booking is for a single transaction and the original amount is different from the entry amount. It can also be used in case individual original amounts are provided in case of a batch or aggregate booking.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmAmountDetails);
			previousVersion_lazy = () -> EntryTransaction4.mmAmountDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndCurrencyExchange3.mmObject();
		}

		@Override
		public Optional<AmountAndCurrencyExchange3> getValue(EntryTransaction7 obj) {
			return obj.getAmountDetails();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<AmountAndCurrencyExchange3> value) {
			obj.setAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "Avlbty")
	protected List<CashBalanceAvailability2> availability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailability2
	 * CashBalanceAvailability2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAvailability
	 * CashEntry.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Avlbty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates when the booked amount of money will become available, that is can be accessed and starts generating interest. \n\nUsage: This type of information is used in the US and is linked to particular instruments such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the amount of money will only be accessible as of the indicated availability day (according to national banking regulations)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmAvailability
	 * EntryTransaction8.mmAvailability}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmAvailability
	 * EntryTransaction4.mmAvailability}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, List<CashBalanceAvailability2>> mmAvailability = new MMMessageAssociationEnd<EntryTransaction7, List<CashBalanceAvailability2>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAvailability;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "Avlbty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Availability";
			definition = "Indicates when the booked amount of money will become available, that is can be accessed and starts generating interest. \n\nUsage: This type of information is used in the US and is linked to particular instruments such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the amount of money will only be accessible as of the indicated availability day (according to national banking regulations).";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmAvailability);
			previousVersion_lazy = () -> EntryTransaction4.mmAvailability;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashBalanceAvailability2.mmObject();
		}

		@Override
		public List<CashBalanceAvailability2> getValue(EntryTransaction7 obj) {
			return obj.getAvailability();
		}

		@Override
		public void setValue(EntryTransaction7 obj, List<CashBalanceAvailability2> value) {
			obj.setAvailability(value);
		}
	};
	@XmlElement(name = "BkTxCd")
	protected BankTransactionCodeStructure4 bankTransactionCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmBankTransactionCode
	 * Entry.mmBankTransactionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkTxCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransactionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to fully identify the type of underlying transaction resulting in an entry."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmBankTransactionCode
	 * EntryTransaction8.mmBankTransactionCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmBankTransactionCode
	 * EntryTransaction4.mmBankTransactionCode}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<BankTransactionCodeStructure4>> mmBankTransactionCode = new MMMessageAssociationEnd<EntryTransaction7, Optional<BankTransactionCodeStructure4>>() {
		{
			businessElementTrace_lazy = () -> Entry.mmBankTransactionCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "BkTxCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankTransactionCode";
			definition = "Set of elements used to fully identify the type of underlying transaction resulting in an entry.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmBankTransactionCode);
			previousVersion_lazy = () -> EntryTransaction4.mmBankTransactionCode;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BankTransactionCodeStructure4.mmObject();
		}

		@Override
		public Optional<BankTransactionCodeStructure4> getValue(EntryTransaction7 obj) {
			return obj.getBankTransactionCode();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<BankTransactionCodeStructure4> value) {
			obj.setBankTransactionCode(value.orElse(null));
		}
	};
	@XmlElement(name = "Chrgs")
	protected Charges4 charges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charges4 Charges4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCharges
	 * CashEntry.mmCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chrgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the charges, pre-advised or included in the entry amount.\r\n\r\nUsage: This component (on transaction level) can be used in case the booking is for a single transaction, and charges are included in the entry amount. It can also be used in case individual charge amounts are applied to individual transactions in case of a batch or aggregate amount booking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmCharges
	 * EntryTransaction8.mmCharges}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmCharges
	 * EntryTransaction4.mmCharges}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<Charges4>> mmCharges = new MMMessageAssociationEnd<EntryTransaction7, Optional<Charges4>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCharges;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "Chrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Provides information on the charges, pre-advised or included in the entry amount.\r\n\r\nUsage: This component (on transaction level) can be used in case the booking is for a single transaction, and charges are included in the entry amount. It can also be used in case individual charge amounts are applied to individual transactions in case of a batch or aggregate amount booking.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmCharges);
			previousVersion_lazy = () -> EntryTransaction4.mmCharges;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charges4.mmObject();
		}

		@Override
		public Optional<Charges4> getValue(EntryTransaction7 obj) {
			return obj.getCharges();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<Charges4> value) {
			obj.setCharges(value.orElse(null));
		}
	};
	@XmlElement(name = "Intrst")
	protected TransactionInterest3 interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionInterest3
	 * TransactionInterest3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details of the interest amount included in the entry amount.\n\nUsage: This component (on transaction level) can be used if the booking is for a single transaction, and interest amount is included in the entry amount. It can also be used if individual interest amounts are applied to individual transactions in the case of a batch or aggregate amount booking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmInterest
	 * EntryTransaction8.mmInterest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmInterest
	 * EntryTransaction4.mmInterest}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<TransactionInterest3>> mmInterest = new MMMessageAssociationEnd<EntryTransaction7, Optional<TransactionInterest3>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Provides details of the interest amount included in the entry amount.\n\nUsage: This component (on transaction level) can be used if the booking is for a single transaction, and interest amount is included in the entry amount. It can also be used if individual interest amounts are applied to individual transactions in the case of a batch or aggregate amount booking.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmInterest);
			previousVersion_lazy = () -> EntryTransaction4.mmInterest;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionInterest3.mmObject();
		}

		@Override
		public Optional<TransactionInterest3> getValue(EntryTransaction7 obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<TransactionInterest3> value) {
			obj.setInterest(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdPties")
	protected TransactionParties3 relatedParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionParties3
	 * TransactionParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the parties related to the underlying transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRelatedParties
	 * EntryTransaction8.mmRelatedParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRelatedParties
	 * EntryTransaction4.mmRelatedParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<TransactionParties3>> mmRelatedParties = new MMMessageAssociationEnd<EntryTransaction7, Optional<TransactionParties3>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "RltdPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedParties";
			definition = "Set of elements used to identify the parties related to the underlying transaction.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmRelatedParties);
			previousVersion_lazy = () -> EntryTransaction4.mmRelatedParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionParties3.mmObject();
		}

		@Override
		public Optional<TransactionParties3> getValue(EntryTransaction7 obj) {
			return obj.getRelatedParties();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<TransactionParties3> value) {
			obj.setRelatedParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdAgts")
	protected TransactionAgents3 relatedAgents;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionAgents3
	 * TransactionAgents3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdAgts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAgents"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the agents related to the underlying transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRelatedAgents
	 * EntryTransaction8.mmRelatedAgents}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRelatedAgents
	 * EntryTransaction4.mmRelatedAgents}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<TransactionAgents3>> mmRelatedAgents = new MMMessageAssociationEnd<EntryTransaction7, Optional<TransactionAgents3>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "RltdAgts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedAgents";
			definition = "Set of elements used to identify the agents related to the underlying transaction.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmRelatedAgents);
			previousVersion_lazy = () -> EntryTransaction4.mmRelatedAgents;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionAgents3.mmObject();
		}

		@Override
		public Optional<TransactionAgents3> getValue(EntryTransaction7 obj) {
			return obj.getRelatedAgents();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<TransactionAgents3> value) {
			obj.setRelatedAgents(value.orElse(null));
		}
	};
	@XmlElement(name = "Purp")
	protected Purpose2Choice purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Purpose2Choice
	 * Purpose2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPurpose
	 * PaymentObligation.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying reason for the payment transaction.\nUsage: Purpose is used by the end-customers, that is initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmPurpose
	 * EntryTransaction8.mmPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmPurpose
	 * EntryTransaction4.mmPurpose}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<Purpose2Choice>> mmPurpose = new MMMessageAssociationEnd<EntryTransaction7, Optional<Purpose2Choice>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment transaction.\nUsage: Purpose is used by the end-customers, that is initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmPurpose);
			previousVersion_lazy = () -> EntryTransaction4.mmPurpose;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Purpose2Choice.mmObject();
		}

		@Override
		public Optional<Purpose2Choice> getValue(EntryTransaction7 obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<Purpose2Choice> value) {
			obj.setPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRmtInf")
	protected List<RemittanceLocation4> relatedRemittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceLocation4
	 * RemittanceLocation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPlaceOfStorage
	 * Document.mmPlaceOfStorage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRmtInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information related to the handling of the remittance information by any of the agents in the transaction processing chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRelatedRemittanceInformation
	 * EntryTransaction8.mmRelatedRemittanceInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRelatedRemittanceInformation
	 * EntryTransaction4.mmRelatedRemittanceInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, List<RemittanceLocation4>> mmRelatedRemittanceInformation = new MMMessageAssociationEnd<EntryTransaction7, List<RemittanceLocation4>>() {
		{
			businessElementTrace_lazy = () -> Document.mmPlaceOfStorage;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "RltdRmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedRemittanceInformation";
			definition = "Provides information related to the handling of the remittance information by any of the agents in the transaction processing chain.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmRelatedRemittanceInformation);
			previousVersion_lazy = () -> EntryTransaction4.mmRelatedRemittanceInformation;
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RemittanceLocation4.mmObject();
		}

		@Override
		public List<RemittanceLocation4> getValue(EntryTransaction7 obj) {
			return obj.getRelatedRemittanceInformation();
		}

		@Override
		public void setValue(EntryTransaction7 obj, List<RemittanceLocation4> value) {
			obj.setRelatedRemittanceInformation(value);
		}
	};
	@XmlElement(name = "RmtInf")
	protected RemittanceInformation10 remittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation10
	 * RemittanceInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
	 * PaymentObligation.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Structured information that enables the matching, that is reconciliation, of a payment with the items that the payment is intended to settle, such as commercial invoices in an account receivable system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRemittanceInformation
	 * EntryTransaction8.mmRemittanceInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRemittanceInformation
	 * EntryTransaction4.mmRemittanceInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<RemittanceInformation10>> mmRemittanceInformation = new MMMessageAssociationEnd<EntryTransaction7, Optional<RemittanceInformation10>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAssociatedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "RmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceInformation";
			definition = "Structured information that enables the matching, that is reconciliation, of a payment with the items that the payment is intended to settle, such as commercial invoices in an account receivable system.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmRemittanceInformation);
			previousVersion_lazy = () -> EntryTransaction4.mmRemittanceInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RemittanceInformation10.mmObject();
		}

		@Override
		public Optional<RemittanceInformation10> getValue(EntryTransaction7 obj) {
			return obj.getRemittanceInformation();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<RemittanceInformation10> value) {
			obj.setRemittanceInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdDts")
	protected TransactionDates2 relatedDates;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionDates2
	 * TransactionDates2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
	 * Payment.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdDts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the dates related to the underlying transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRelatedDates
	 * EntryTransaction8.mmRelatedDates}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRelatedDates
	 * EntryTransaction4.mmRelatedDates}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<TransactionDates2>> mmRelatedDates = new MMMessageAssociationEnd<EntryTransaction7, Optional<TransactionDates2>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "RltdDts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDates";
			definition = "Set of elements used to identify the dates related to the underlying transactions.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmRelatedDates);
			previousVersion_lazy = () -> EntryTransaction4.mmRelatedDates;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionDates2.mmObject();
		}

		@Override
		public Optional<TransactionDates2> getValue(EntryTransaction7 obj) {
			return obj.getRelatedDates();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<TransactionDates2> value) {
			obj.setRelatedDates(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdPric")
	protected TransactionPrice3Choice relatedPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionPrice3Choice
	 * TransactionPrice3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
	 * SecuritiesTradeExecution.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the price information related to the underlying transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRelatedPrice
	 * EntryTransaction8.mmRelatedPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRelatedPrice
	 * EntryTransaction4.mmRelatedPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<TransactionPrice3Choice>> mmRelatedPrice = new MMMessageAssociationEnd<EntryTransaction7, Optional<TransactionPrice3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "RltdPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPrice";
			definition = "Set of elements used to identify the price information related to the underlying transaction.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmRelatedPrice);
			previousVersion_lazy = () -> EntryTransaction4.mmRelatedPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionPrice3Choice.mmObject();
		}

		@Override
		public Optional<TransactionPrice3Choice> getValue(EntryTransaction7 obj) {
			return obj.getRelatedPrice();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<TransactionPrice3Choice> value) {
			obj.setRelatedPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdQties")
	protected List<TransactionQuantities2Choice> relatedQuantities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionQuantities2Choice
	 * TransactionQuantities2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmFinancialInstrumentQuantity
	 * SecuritiesEntry.mmFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdQties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedQuantities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the related quantities, such as securities, in the underlying transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmRelatedQuantities
	 * EntryTransaction8.mmRelatedQuantities}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmRelatedQuantities
	 * EntryTransaction4.mmRelatedQuantities}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, List<TransactionQuantities2Choice>> mmRelatedQuantities = new MMMessageAssociationEnd<EntryTransaction7, List<TransactionQuantities2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesEntry.mmFinancialInstrumentQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "RltdQties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedQuantities";
			definition = "Set of elements used to identify the related quantities, such as securities, in the underlying transaction.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmRelatedQuantities);
			previousVersion_lazy = () -> EntryTransaction4.mmRelatedQuantities;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionQuantities2Choice.mmObject();
		}

		@Override
		public List<TransactionQuantities2Choice> getValue(EntryTransaction7 obj) {
			return obj.getRelatedQuantities();
		}

		@Override
		public void setValue(EntryTransaction7 obj, List<TransactionQuantities2Choice> value) {
			obj.setRelatedQuantities(value);
		}
	};
	@XmlElement(name = "FinInstrmId")
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a security, as assigned under a formal or proprietary identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmFinancialInstrumentIdentification
	 * EntryTransaction8.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmFinancialInstrumentIdentification
	 * EntryTransaction4.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<SecurityIdentification14>> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<EntryTransaction7, Optional<SecurityIdentification14>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of a security, as assigned under a formal or proprietary identification scheme.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmFinancialInstrumentIdentification);
			previousVersion_lazy = () -> EntryTransaction4.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public Optional<SecurityIdentification14> getValue(EntryTransaction7 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<SecurityIdentification14> value) {
			obj.setFinancialInstrumentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Tax")
	protected TaxInformation3 tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxInformation3
	 * TaxInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
	 * Payment.mmTaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryTransaction8#mmTax
	 * EntryTransaction8.mmTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmTax
	 * EntryTransaction4.mmTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<TaxInformation3>> mmTax = new MMMessageAssociationEnd<EntryTransaction7, Optional<TaxInformation3>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmTaxOnPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Provides details on the tax.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmTax);
			previousVersion_lazy = () -> EntryTransaction4.mmTax;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxInformation3.mmObject();
		}

		@Override
		public Optional<TaxInformation3> getValue(EntryTransaction7 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<TaxInformation3> value) {
			obj.setTax(value.orElse(null));
		}
	};
	@XmlElement(name = "RtrInf")
	protected PaymentReturnReason2 returnInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentReturnReason2
	 * PaymentReturnReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtrInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the return information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmReturnInformation
	 * EntryTransaction8.mmReturnInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmReturnInformation
	 * EntryTransaction4.mmReturnInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<PaymentReturnReason2>> mmReturnInformation = new MMMessageAssociationEnd<EntryTransaction7, Optional<PaymentReturnReason2>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "RtrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnInformation";
			definition = "Provides the return information.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmReturnInformation);
			previousVersion_lazy = () -> EntryTransaction4.mmReturnInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentReturnReason2.mmObject();
		}

		@Override
		public Optional<PaymentReturnReason2> getValue(EntryTransaction7 obj) {
			return obj.getReturnInformation();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<PaymentReturnReason2> value) {
			obj.setReturnInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActn")
	protected CorporateAction9 corporateAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateAction9
	 * CorporateAction9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCorporateEvent
	 * Security.mmCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to identify the underlying corporate action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmCorporateAction
	 * EntryTransaction8.mmCorporateAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmCorporateAction
	 * EntryTransaction4.mmCorporateAction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<CorporateAction9>> mmCorporateAction = new MMMessageAssociationEnd<EntryTransaction7, Optional<CorporateAction9>>() {
		{
			businessElementTrace_lazy = () -> Security.mmCorporateEvent;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "CorpActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			definition = "Set of elements used to identify the underlying corporate action.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmCorporateAction);
			previousVersion_lazy = () -> EntryTransaction4.mmCorporateAction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateAction9.mmObject();
		}

		@Override
		public Optional<CorporateAction9> getValue(EntryTransaction7 obj) {
			return obj.getCorporateAction();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<CorporateAction9> value) {
			obj.setCorporateAction(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct")
	protected SecuritiesAccount13 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashAccount
	 * CashEntry.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Safekeeping or investment account. A safekeeping account is an account on which a securities entry is made. An investment account is an account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmSafekeepingAccount
	 * EntryTransaction8.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmSafekeepingAccount
	 * EntryTransaction4.mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, Optional<SecuritiesAccount13>> mmSafekeepingAccount = new MMMessageAssociationEnd<EntryTransaction7, Optional<SecuritiesAccount13>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Safekeeping or investment account. A safekeeping account is an account on which a securities entry is made. An investment account is an account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmSafekeepingAccount);
			previousVersion_lazy = () -> EntryTransaction4.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount13.mmObject();
		}

		@Override
		public Optional<SecuritiesAccount13> getValue(EntryTransaction7 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<SecuritiesAccount13> value) {
			obj.setSafekeepingAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "CshDpst")
	protected List<CashDeposit1> cashDeposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashDeposit1
	 * CashDeposit1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashDeposit CashDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshDpst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the details of a cash deposit for an amount of money in cash notes and/or coins."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmCashDeposit
	 * EntryTransaction8.mmCashDeposit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmCashDeposit
	 * EntryTransaction4.mmCashDeposit}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryTransaction7, List<CashDeposit1>> mmCashDeposit = new MMMessageAssociationEnd<EntryTransaction7, List<CashDeposit1>>() {
		{
			businessComponentTrace_lazy = () -> CashDeposit.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "CshDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDeposit";
			definition = "Provides the details of a cash deposit for an amount of money in cash notes and/or coins.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmCashDeposit);
			previousVersion_lazy = () -> EntryTransaction4.mmCashDeposit;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashDeposit1.mmObject();
		}

		@Override
		public List<CashDeposit1> getValue(EntryTransaction7 obj) {
			return obj.getCashDeposit();
		}

		@Override
		public void setValue(EntryTransaction7 obj, List<CashDeposit1> value) {
			obj.setCashDeposit(value);
		}
	};
	@XmlElement(name = "CardTx")
	protected CardTransaction2 cardTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction2
	 * CardTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardTx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the data related to the card (number, scheme), terminal (number, identification) and transactional data used to uniquely identify a card transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmCardTransaction
	 * EntryTransaction8.mmCardTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmCardTransaction
	 * EntryTransaction4.mmCardTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EntryTransaction7, Optional<CardTransaction2>> mmCardTransaction = new MMMessageAttribute<EntryTransaction7, Optional<CardTransaction2>>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "CardTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardTransaction";
			definition = "Provides the data related to the card (number, scheme), terminal (number, identification) and transactional data used to uniquely identify a card transaction.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmCardTransaction);
			previousVersion_lazy = () -> EntryTransaction4.mmCardTransaction;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CardTransaction2.mmObject();
		}

		@Override
		public Optional<CardTransaction2> getValue(EntryTransaction7 obj) {
			return obj.getCardTransaction();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<CardTransaction2> value) {
			obj.setCardTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlTxInf")
	protected Max500Text additionalTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmAdditionalTransactionInformation
	 * EntryTransaction8.mmAdditionalTransactionInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmAdditionalTransactionInformation
	 * EntryTransaction4.mmAdditionalTransactionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EntryTransaction7, Optional<Max500Text>> mmAdditionalTransactionInformation = new MMMessageAttribute<EntryTransaction7, Optional<Max500Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTransactionInformation";
			definition = "Further details of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmAdditionalTransactionInformation);
			previousVersion_lazy = () -> EntryTransaction4.mmAdditionalTransactionInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(EntryTransaction7 obj) {
			return obj.getAdditionalTransactionInformation();
		}

		@Override
		public void setValue(EntryTransaction7 obj, Optional<Max500Text> value) {
			obj.setAdditionalTransactionInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction7
	 * EntryTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction8#mmSupplementaryData
	 * EntryTransaction8.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryTransaction4#mmSupplementaryData
	 * EntryTransaction4.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EntryTransaction7, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAttribute<EntryTransaction7, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryTransaction7.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmSupplementaryData);
			previousVersion_lazy = () -> EntryTransaction4.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(EntryTransaction7 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(EntryTransaction7 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryTransaction7.mmReferences, com.tools20022.repository.msg.EntryTransaction7.mmAmount,
						com.tools20022.repository.msg.EntryTransaction7.mmCreditDebitIndicator, com.tools20022.repository.msg.EntryTransaction7.mmAmountDetails, com.tools20022.repository.msg.EntryTransaction7.mmAvailability,
						com.tools20022.repository.msg.EntryTransaction7.mmBankTransactionCode, com.tools20022.repository.msg.EntryTransaction7.mmCharges, com.tools20022.repository.msg.EntryTransaction7.mmInterest,
						com.tools20022.repository.msg.EntryTransaction7.mmRelatedParties, com.tools20022.repository.msg.EntryTransaction7.mmRelatedAgents, com.tools20022.repository.msg.EntryTransaction7.mmPurpose,
						com.tools20022.repository.msg.EntryTransaction7.mmRelatedRemittanceInformation, com.tools20022.repository.msg.EntryTransaction7.mmRemittanceInformation,
						com.tools20022.repository.msg.EntryTransaction7.mmRelatedDates, com.tools20022.repository.msg.EntryTransaction7.mmRelatedPrice, com.tools20022.repository.msg.EntryTransaction7.mmRelatedQuantities,
						com.tools20022.repository.msg.EntryTransaction7.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.EntryTransaction7.mmTax, com.tools20022.repository.msg.EntryTransaction7.mmReturnInformation,
						com.tools20022.repository.msg.EntryTransaction7.mmCorporateAction, com.tools20022.repository.msg.EntryTransaction7.mmSafekeepingAccount, com.tools20022.repository.msg.EntryTransaction7.mmCashDeposit,
						com.tools20022.repository.msg.EntryTransaction7.mmCardTransaction, com.tools20022.repository.msg.EntryTransaction7.mmAdditionalTransactionInformation,
						com.tools20022.repository.msg.EntryTransaction7.mmSupplementaryData);
				trace_lazy = () -> Entry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EntryTransaction7";
				definition = "Identifies the underlying transaction.";
				nextVersions_lazy = () -> Arrays.asList(EntryTransaction8.mmObject());
				previousVersion_lazy = () -> EntryTransaction4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TransactionReferences3> getReferences() {
		return references == null ? Optional.empty() : Optional.of(references);
	}

	public EntryTransaction7 setReferences(TransactionReferences3 references) {
		this.references = references;
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getAmount() {
		return amount;
	}

	public EntryTransaction7 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public EntryTransaction7 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<AmountAndCurrencyExchange3> getAmountDetails() {
		return amountDetails == null ? Optional.empty() : Optional.of(amountDetails);
	}

	public EntryTransaction7 setAmountDetails(AmountAndCurrencyExchange3 amountDetails) {
		this.amountDetails = amountDetails;
		return this;
	}

	public List<CashBalanceAvailability2> getAvailability() {
		return availability == null ? availability = new ArrayList<>() : availability;
	}

	public EntryTransaction7 setAvailability(List<CashBalanceAvailability2> availability) {
		this.availability = Objects.requireNonNull(availability);
		return this;
	}

	public Optional<BankTransactionCodeStructure4> getBankTransactionCode() {
		return bankTransactionCode == null ? Optional.empty() : Optional.of(bankTransactionCode);
	}

	public EntryTransaction7 setBankTransactionCode(BankTransactionCodeStructure4 bankTransactionCode) {
		this.bankTransactionCode = bankTransactionCode;
		return this;
	}

	public Optional<Charges4> getCharges() {
		return charges == null ? Optional.empty() : Optional.of(charges);
	}

	public EntryTransaction7 setCharges(Charges4 charges) {
		this.charges = charges;
		return this;
	}

	public Optional<TransactionInterest3> getInterest() {
		return interest == null ? Optional.empty() : Optional.of(interest);
	}

	public EntryTransaction7 setInterest(TransactionInterest3 interest) {
		this.interest = interest;
		return this;
	}

	public Optional<TransactionParties3> getRelatedParties() {
		return relatedParties == null ? Optional.empty() : Optional.of(relatedParties);
	}

	public EntryTransaction7 setRelatedParties(TransactionParties3 relatedParties) {
		this.relatedParties = relatedParties;
		return this;
	}

	public Optional<TransactionAgents3> getRelatedAgents() {
		return relatedAgents == null ? Optional.empty() : Optional.of(relatedAgents);
	}

	public EntryTransaction7 setRelatedAgents(TransactionAgents3 relatedAgents) {
		this.relatedAgents = relatedAgents;
		return this;
	}

	public Optional<Purpose2Choice> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public EntryTransaction7 setPurpose(Purpose2Choice purpose) {
		this.purpose = purpose;
		return this;
	}

	public List<RemittanceLocation4> getRelatedRemittanceInformation() {
		return relatedRemittanceInformation == null ? relatedRemittanceInformation = new ArrayList<>() : relatedRemittanceInformation;
	}

	public EntryTransaction7 setRelatedRemittanceInformation(List<RemittanceLocation4> relatedRemittanceInformation) {
		this.relatedRemittanceInformation = Objects.requireNonNull(relatedRemittanceInformation);
		return this;
	}

	public Optional<RemittanceInformation10> getRemittanceInformation() {
		return remittanceInformation == null ? Optional.empty() : Optional.of(remittanceInformation);
	}

	public EntryTransaction7 setRemittanceInformation(RemittanceInformation10 remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}

	public Optional<TransactionDates2> getRelatedDates() {
		return relatedDates == null ? Optional.empty() : Optional.of(relatedDates);
	}

	public EntryTransaction7 setRelatedDates(TransactionDates2 relatedDates) {
		this.relatedDates = relatedDates;
		return this;
	}

	public Optional<TransactionPrice3Choice> getRelatedPrice() {
		return relatedPrice == null ? Optional.empty() : Optional.of(relatedPrice);
	}

	public EntryTransaction7 setRelatedPrice(TransactionPrice3Choice relatedPrice) {
		this.relatedPrice = relatedPrice;
		return this;
	}

	public List<TransactionQuantities2Choice> getRelatedQuantities() {
		return relatedQuantities == null ? relatedQuantities = new ArrayList<>() : relatedQuantities;
	}

	public EntryTransaction7 setRelatedQuantities(List<TransactionQuantities2Choice> relatedQuantities) {
		this.relatedQuantities = Objects.requireNonNull(relatedQuantities);
		return this;
	}

	public Optional<SecurityIdentification14> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? Optional.empty() : Optional.of(financialInstrumentIdentification);
	}

	public EntryTransaction7 setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
		return this;
	}

	public Optional<TaxInformation3> getTax() {
		return tax == null ? Optional.empty() : Optional.of(tax);
	}

	public EntryTransaction7 setTax(TaxInformation3 tax) {
		this.tax = tax;
		return this;
	}

	public Optional<PaymentReturnReason2> getReturnInformation() {
		return returnInformation == null ? Optional.empty() : Optional.of(returnInformation);
	}

	public EntryTransaction7 setReturnInformation(PaymentReturnReason2 returnInformation) {
		this.returnInformation = returnInformation;
		return this;
	}

	public Optional<CorporateAction9> getCorporateAction() {
		return corporateAction == null ? Optional.empty() : Optional.of(corporateAction);
	}

	public EntryTransaction7 setCorporateAction(CorporateAction9 corporateAction) {
		this.corporateAction = corporateAction;
		return this;
	}

	public Optional<SecuritiesAccount13> getSafekeepingAccount() {
		return safekeepingAccount == null ? Optional.empty() : Optional.of(safekeepingAccount);
	}

	public EntryTransaction7 setSafekeepingAccount(SecuritiesAccount13 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
		return this;
	}

	public List<CashDeposit1> getCashDeposit() {
		return cashDeposit == null ? cashDeposit = new ArrayList<>() : cashDeposit;
	}

	public EntryTransaction7 setCashDeposit(List<CashDeposit1> cashDeposit) {
		this.cashDeposit = Objects.requireNonNull(cashDeposit);
		return this;
	}

	public Optional<CardTransaction2> getCardTransaction() {
		return cardTransaction == null ? Optional.empty() : Optional.of(cardTransaction);
	}

	public EntryTransaction7 setCardTransaction(CardTransaction2 cardTransaction) {
		this.cardTransaction = cardTransaction;
		return this;
	}

	public Optional<Max500Text> getAdditionalTransactionInformation() {
		return additionalTransactionInformation == null ? Optional.empty() : Optional.of(additionalTransactionInformation);
	}

	public EntryTransaction7 setAdditionalTransactionInformation(Max500Text additionalTransactionInformation) {
		this.additionalTransactionInformation = additionalTransactionInformation;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public EntryTransaction7 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}