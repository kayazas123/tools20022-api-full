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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementPreviousversionsubsetvariant;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOPreviousversion;
import com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017ISO15022Variants;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * A securities financing transaction account servicer sends a
 * SecuritiesFinancingConfirmation to an account owner to confirm or advise of
 * the partial or full settlement of the opening or closing leg of a securities
 * financing transaction. <br>
 * <br>
 * The account servicer/owner relationship may be:<br>
 * - a central securities depository or another settlement market infrastructure
 * managing securities financing transactions on behalf of their participants<br>
 * - an agent (sub-custodian) managing securities financing transactions on
 * behalf of their global custodian customer, or <br>
 * - a custodian managing securities financing transactions on behalf of an
 * investment management institution or a broker/dealer.<br>
 * <br>
 * <br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent,<br>
 * - provide a third party with a copy of a message for information,<br>
 * - re-send to a third party a copy of a message for information<br>
 * using the relevant elements in the Business Application Header.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.035.002.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementPreviousversionsubsetvariant
 * SecuritiesSettlementPreviousversionsubsetvariant}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmTransactionIdentificationDetails
 * SecuritiesFinancingConfirmation002V07.mmTransactionIdentificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmAdditionalParameters
 * SecuritiesFinancingConfirmation002V07.mmAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmTradeDetails
 * SecuritiesFinancingConfirmation002V07.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmation002V07.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmFinancialInstrumentAttributes
 * SecuritiesFinancingConfirmation002V07.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmQuantityAndAccountDetails
 * SecuritiesFinancingConfirmation002V07.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmSecuritiesFinancingDetails
 * SecuritiesFinancingConfirmation002V07.mmSecuritiesFinancingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmStandingSettlementInstructionDetails
 * SecuritiesFinancingConfirmation002V07.mmStandingSettlementInstructionDetails}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmSettlementParameters
 * SecuritiesFinancingConfirmation002V07.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmDeliveringSettlementParties
 * SecuritiesFinancingConfirmation002V07.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmReceivingSettlementParties
 * SecuritiesFinancingConfirmation002V07.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmCashParties
 * SecuritiesFinancingConfirmation002V07.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmSettledAmount
 * SecuritiesFinancingConfirmation002V07.mmSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmOtherAmounts
 * SecuritiesFinancingConfirmation002V07.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmOtherBusinessParties
 * SecuritiesFinancingConfirmation002V07.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmSupplementaryData
 * SecuritiesFinancingConfirmation002V07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017ISO15022Variants
 * SettlementandReconciliationMaintenance20162017ISO15022Variants}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOPreviousversion
 * SettlementAndReconciliationISO15022VariantsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesFincgConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingConfirmation002V07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA securities financing transaction account servicer sends a SecuritiesFinancingConfirmation to an account owner to confirm or advise of the partial or full settlement of the opening or closing leg of a securities financing transaction. \r\n\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants\r\n- an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or \r\n- a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.\r\n\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBuyerSSIRule#for_sese_SecuritiesFinancingConfirmation002V07
 * ConstraintBuyerSSIRule.for_sese_SecuritiesFinancingConfirmation002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSIRule#for_sese_SecuritiesFinancingConfirmation002V07
 * ConstraintSellerSSIRule.for_sese_SecuritiesFinancingConfirmation002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule#for_sese_SecuritiesFinancingConfirmation002V07
 * ConstraintDeliveringDepositoryAndParty1Rule.
 * for_sese_SecuritiesFinancingConfirmation002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#for_sese_SecuritiesFinancingConfirmation002V07
 * ConstraintReceivingDepositoryAndParty1Rule.
 * for_sese_SecuritiesFinancingConfirmation002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettledAmountRule#for_sese_SecuritiesFinancingConfirmation002V07
 * ConstraintSettledAmountRule.for_sese_SecuritiesFinancingConfirmation002V07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V08
 * SecuritiesFinancingConfirmation002V08}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V06
 * SecuritiesFinancingConfirmation002V06}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancingConfirmation002V07", propOrder = {"transactionIdentificationDetails", "additionalParameters", "tradeDetails", "financialInstrumentIdentification", "financialInstrumentAttributes",
		"quantityAndAccountDetails", "securitiesFinancingDetails", "standingSettlementInstructionDetails", "settlementParameters", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "settledAmount", "otherAmounts",
		"otherBusinessParties", "supplementaryData"})
public class SecuritiesFinancingConfirmation002V07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxIdDtls", required = true)
	protected TransactionTypeAndAdditionalParameters19 transactionIdentificationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19
	 * TransactionTypeAndAdditionalParameters19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing) and other parameters."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, TransactionTypeAndAdditionalParameters19> mmTransactionIdentificationDetails = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, TransactionTypeAndAdditionalParameters19>() {
		{
			xmlTag = "TxIdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationDetails";
			definition = "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing) and other parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionTypeAndAdditionalParameters19.mmObject();
		}

		@Override
		public TransactionTypeAndAdditionalParameters19 getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getTransactionIdentificationDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, TransactionTypeAndAdditionalParameters19 value) {
			obj.setTransactionIdentificationDetails(value);
		}
	};
	@XmlElement(name = "AddtlParams")
	protected AdditionalParameters26 additionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters26
	 * AdditionalParameters26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional parameters to the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<AdditionalParameters26>> mmAdditionalParameters = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<AdditionalParameters26>>() {
		{
			xmlTag = "AddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParameters";
			definition = "Additional parameters to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalParameters26.mmObject();
		}

		@Override
		public Optional<AdditionalParameters26> getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getAdditionalParameters();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, Optional<AdditionalParameters26> value) {
			obj.setAdditionalParameters(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDtls", required = true)
	protected SecuritiesTradeDetails58 tradeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58
	 * SecuritiesTradeDetails58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the securities financing deal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, SecuritiesTradeDetails58> mmTradeDetails = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, SecuritiesTradeDetails58>() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the securities financing deal.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails58.mmObject();
		}

		@Override
		public SecuritiesTradeDetails58 getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getTradeDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, SecuritiesTradeDetails58 value) {
			obj.setTradeDetails(value);
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification20 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20
	 * SecurityIdentification20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, SecurityIdentification20> mmFinancialInstrumentIdentification = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, SecurityIdentification20>() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification20.mmObject();
		}

		@Override
		public SecurityIdentification20 getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, SecurityIdentification20 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes78 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78
	 * FinancialInstrumentAttributes78}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elements characterising a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<FinancialInstrumentAttributes78>> mmFinancialInstrumentAttributes = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<FinancialInstrumentAttributes78>>() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes78.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes78> getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, Optional<FinancialInstrumentAttributes78> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyAndAcctDtls", required = true)
	protected QuantityAndAccount62 quantityAndAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62
	 * QuantityAndAccount62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyAndAcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityAndAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the account and quantity involved in the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, QuantityAndAccount62> mmQuantityAndAccountDetails = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, QuantityAndAccount62>() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount62.mmObject();
		}

		@Override
		public QuantityAndAccount62 getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getQuantityAndAccountDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, QuantityAndAccount62 value) {
			obj.setQuantityAndAccountDetails(value);
		}
	};
	@XmlElement(name = "SctiesFincgDtls")
	protected SecuritiesFinancingTransactionDetails30 securitiesFinancingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails30
	 * SecuritiesFinancingTransactionDetails30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the closing of the securities financing transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<SecuritiesFinancingTransactionDetails30>> mmSecuritiesFinancingDetails = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<SecuritiesFinancingTransactionDetails30>>() {
		{
			xmlTag = "SctiesFincgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingDetails";
			definition = "Details of the closing of the securities financing transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesFinancingTransactionDetails30.mmObject();
		}

		@Override
		public Optional<SecuritiesFinancingTransactionDetails30> getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getSecuritiesFinancingDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, Optional<SecuritiesFinancingTransactionDetails30> value) {
			obj.setSecuritiesFinancingDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "StgSttlmInstrDtls")
	protected StandingSettlementInstruction12 standingSettlementInstructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction12
	 * StandingSettlementInstruction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgSttlmInstrDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<StandingSettlementInstruction12>> mmStandingSettlementInstructionDetails = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<StandingSettlementInstruction12>>() {
		{
			xmlTag = "StgSttlmInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructionDetails";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingSettlementInstruction12.mmObject();
		}

		@Override
		public Optional<StandingSettlementInstruction12> getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getStandingSettlementInstructionDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, Optional<StandingSettlementInstruction12> value) {
			obj.setStandingSettlementInstructionDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmParams")
	protected SettlementDetails104 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104
	 * SettlementDetails104}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<SettlementDetails104>> mmSettlementParameters = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<SettlementDetails104>>() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementDetails104.mmObject();
		}

		@Override
		public Optional<SettlementDetails104> getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getSettlementParameters();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, Optional<SettlementDetails104> value) {
			obj.setSettlementParameters(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties44 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties44
	 * SettlementParties44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<SettlementParties44>> mmDeliveringSettlementParties = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<SettlementParties44>>() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties44.mmObject();
		}

		@Override
		public Optional<SettlementParties44> getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, Optional<SettlementParties44> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties44 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties44
	 * SettlementParties44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<SettlementParties44>> mmReceivingSettlementParties = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<SettlementParties44>>() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties44.mmObject();
		}

		@Override
		public Optional<SettlementParties44> getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, Optional<SettlementParties44> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties30 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashParties30
	 * CashParties30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash parties involved in the transaction if different for the securities settlement parties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<CashParties30>> mmCashParties = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<CashParties30>>() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction if different for the securities settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties30.mmObject();
		}

		@Override
		public Optional<CashParties30> getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, Optional<CashParties30> value) {
			obj.setCashParties(value.orElse(null));
		}
	};
	@XmlElement(name = "SttldAmt")
	protected AmountAndDirection60 settledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60
	 * AmountAndDirection60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<AmountAndDirection60>> mmSettledAmount = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<AmountAndDirection60>>() {
		{
			xmlTag = "SttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledAmount";
			definition = "Amount effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection60.mmObject();
		}

		@Override
		public Optional<AmountAndDirection60> getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getSettledAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, Optional<AmountAndDirection60> value) {
			obj.setSettledAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrAmts")
	protected OtherAmounts34 otherAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherAmounts34
	 * OtherAmounts34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other amounts than the settlement amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<OtherAmounts34>> mmOtherAmounts = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<OtherAmounts34>>() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts34.mmObject();
		}

		@Override
		public Optional<OtherAmounts34> getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getOtherAmounts();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, Optional<OtherAmounts34> value) {
			obj.setOtherAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties29 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherParties29
	 * OtherParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other business parties relevant to the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<OtherParties29>> mmOtherBusinessParties = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, Optional<OtherParties29>>() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties29.mmObject();
		}

		@Override
		public Optional<OtherParties29> getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, Optional<OtherParties29> value) {
			obj.setOtherBusinessParties(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesFinancingConfirmation002V07, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesFinancingConfirmation002V07 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesFinancingConfirmation002V07 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBuyerSSIRule.for_sese_SecuritiesFinancingConfirmation002V07,
						com.tools20022.repository.constraints.ConstraintSellerSSIRule.for_sese_SecuritiesFinancingConfirmation002V07,
						com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule.for_sese_SecuritiesFinancingConfirmation002V07,
						com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.for_sese_SecuritiesFinancingConfirmation002V07,
						com.tools20022.repository.constraints.ConstraintSettledAmountRule.for_sese_SecuritiesFinancingConfirmation002V07);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingConfirmation002V07";
				definition = "Scope\r\nA securities financing transaction account servicer sends a SecuritiesFinancingConfirmation to an account owner to confirm or advise of the partial or full settlement of the opening or closing leg of a securities financing transaction. \r\n\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants\r\n- an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or \r\n- a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.\r\n\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmation002V08.mmObject());
				previousVersion_lazy = () -> SecuritiesFinancingConfirmation002V06.mmObject();
				messageSet_lazy = () -> Arrays.asList(SettlementandReconciliationMaintenance20162017ISO15022Variants.mmObject(), SettlementAndReconciliationISO15022VariantsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesFincgConf";
				businessArea_lazy = () -> SecuritiesSettlementPreviousversionsubsetvariant.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmTransactionIdentificationDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmAdditionalParameters, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmTradeDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmFinancialInstrumentIdentification,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmFinancialInstrumentAttributes, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmQuantityAndAccountDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmSecuritiesFinancingDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmStandingSettlementInstructionDetails, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmSettlementParameters,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmDeliveringSettlementParties, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmReceivingSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmCashParties, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmSettledAmount,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmOtherAmounts, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "035";
						version = "07";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesFinancingConfirmation002V07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionTypeAndAdditionalParameters19 getTransactionIdentificationDetails() {
		return transactionIdentificationDetails;
	}

	public SecuritiesFinancingConfirmation002V07 setTransactionIdentificationDetails(TransactionTypeAndAdditionalParameters19 transactionIdentificationDetails) {
		this.transactionIdentificationDetails = Objects.requireNonNull(transactionIdentificationDetails);
		return this;
	}

	public Optional<AdditionalParameters26> getAdditionalParameters() {
		return additionalParameters == null ? Optional.empty() : Optional.of(additionalParameters);
	}

	public SecuritiesFinancingConfirmation002V07 setAdditionalParameters(AdditionalParameters26 additionalParameters) {
		this.additionalParameters = additionalParameters;
		return this;
	}

	public SecuritiesTradeDetails58 getTradeDetails() {
		return tradeDetails;
	}

	public SecuritiesFinancingConfirmation002V07 setTradeDetails(SecuritiesTradeDetails58 tradeDetails) {
		this.tradeDetails = Objects.requireNonNull(tradeDetails);
		return this;
	}

	public SecurityIdentification20 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesFinancingConfirmation002V07 setFinancialInstrumentIdentification(SecurityIdentification20 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes78> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public SecuritiesFinancingConfirmation002V07 setFinancialInstrumentAttributes(FinancialInstrumentAttributes78 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public QuantityAndAccount62 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public SecuritiesFinancingConfirmation002V07 setQuantityAndAccountDetails(QuantityAndAccount62 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = Objects.requireNonNull(quantityAndAccountDetails);
		return this;
	}

	public Optional<SecuritiesFinancingTransactionDetails30> getSecuritiesFinancingDetails() {
		return securitiesFinancingDetails == null ? Optional.empty() : Optional.of(securitiesFinancingDetails);
	}

	public SecuritiesFinancingConfirmation002V07 setSecuritiesFinancingDetails(SecuritiesFinancingTransactionDetails30 securitiesFinancingDetails) {
		this.securitiesFinancingDetails = securitiesFinancingDetails;
		return this;
	}

	public Optional<StandingSettlementInstruction12> getStandingSettlementInstructionDetails() {
		return standingSettlementInstructionDetails == null ? Optional.empty() : Optional.of(standingSettlementInstructionDetails);
	}

	public SecuritiesFinancingConfirmation002V07 setStandingSettlementInstructionDetails(StandingSettlementInstruction12 standingSettlementInstructionDetails) {
		this.standingSettlementInstructionDetails = standingSettlementInstructionDetails;
		return this;
	}

	public Optional<SettlementDetails104> getSettlementParameters() {
		return settlementParameters == null ? Optional.empty() : Optional.of(settlementParameters);
	}

	public SecuritiesFinancingConfirmation002V07 setSettlementParameters(SettlementDetails104 settlementParameters) {
		this.settlementParameters = settlementParameters;
		return this;
	}

	public Optional<SettlementParties44> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesFinancingConfirmation002V07 setDeliveringSettlementParties(SettlementParties44 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties44> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesFinancingConfirmation002V07 setReceivingSettlementParties(SettlementParties44 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<CashParties30> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public SecuritiesFinancingConfirmation002V07 setCashParties(CashParties30 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<AmountAndDirection60> getSettledAmount() {
		return settledAmount == null ? Optional.empty() : Optional.of(settledAmount);
	}

	public SecuritiesFinancingConfirmation002V07 setSettledAmount(AmountAndDirection60 settledAmount) {
		this.settledAmount = settledAmount;
		return this;
	}

	public Optional<OtherAmounts34> getOtherAmounts() {
		return otherAmounts == null ? Optional.empty() : Optional.of(otherAmounts);
	}

	public SecuritiesFinancingConfirmation002V07 setOtherAmounts(OtherAmounts34 otherAmounts) {
		this.otherAmounts = otherAmounts;
		return this;
	}

	public Optional<OtherParties29> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public SecuritiesFinancingConfirmation002V07 setOtherBusinessParties(OtherParties29 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesFinancingConfirmation002V07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.035.002.07")
	static public class Document {
		@XmlElement(name = "SctiesFincgConf", required = true)
		public SecuritiesFinancingConfirmation002V07 messageBody;
	}
}