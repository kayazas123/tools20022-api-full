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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.choice.PartyIdentification10Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends a SecuritiesSettlementTransactionConfirmation to an
 * account owner to confirm the partial or full delivery or receipt of financial
 * instruments, free or against of payment, physically or by book-entry.<br>
 * The account servicer/owner relationship may be:<br>
 * - a central securities depository or another settlement market infrastructure
 * acting on behalf of their participants<br>
 * - an agent (sub-custodian) acting on behalf of their global custodian
 * customer, or<br>
 * - a custodian acting on behalf of an investment management institution or a
 * broker/dealer.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate),<br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy),<br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate). ISO 15022 - 20022 Coexistence
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards
 * will coexist for a certain number of years. Until this coexistence period
 * ends, the usage of certain data types is restricted to ensure
 * interoperability between ISO 15022 and 20022 users. Compliance to these rules
 * is mandatory in a coexistence environment. The coexistence restrictions are
 * described in a Textual Rule linked to the Message Items they concern. These
 * coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmIdentification
 * SecuritiesSettlementTransactionConfirmationV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmTransactionIdentificationDetails
 * SecuritiesSettlementTransactionConfirmationV01.
 * mmTransactionIdentificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmAdditionalParameters
 * SecuritiesSettlementTransactionConfirmationV01.mmAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmTradeDetails
 * SecuritiesSettlementTransactionConfirmationV01.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionConfirmationV01.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionConfirmationV01.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionConfirmationV01.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmSettlementParameters
 * SecuritiesSettlementTransactionConfirmationV01.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionConfirmationV01.
 * mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionConfirmationV01.mmDeliveringSettlementParties}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionConfirmationV01.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmCashParties
 * SecuritiesSettlementTransactionConfirmationV01.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmSettledAmount
 * SecuritiesSettlementTransactionConfirmationV01.mmSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmOtherAmounts
 * SecuritiesSettlementTransactionConfirmationV01.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmOtherBusinessParties
 * SecuritiesSettlementTransactionConfirmationV01.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionConfirmationV01.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmMessageOriginator
 * SecuritiesSettlementTransactionConfirmationV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmMessageRecipient
 * SecuritiesSettlementTransactionConfirmationV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmExtension
 * SecuritiesSettlementTransactionConfirmationV01.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesSttlmTxConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.025.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettledAmountRule#forSecuritiesSettlementTransactionConfirmationV01
 * ConstraintSettledAmountRule.forSecuritiesSettlementTransactionConfirmationV01
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionConfirmationV01
 * ConstraintReceivingDepositoryAndParty1Rule.
 * forSecuritiesSettlementTransactionConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule#forSecuritiesSettlementTransactionConfirmationV01
 * ConstraintDeliveringDepositoryAndParty1Rule.
 * forSecuritiesSettlementTransactionConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSIRule#forSecuritiesSettlementTransactionConfirmationV01
 * ConstraintSellerSSIRule.forSecuritiesSettlementTransactionConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBuyerSSIRule#forSecuritiesSettlementTransactionConfirmationV01
 * ConstraintBuyerSSIRule.forSecuritiesSettlementTransactionConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesSettlementTransactionConfirmationV01
 * ConstraintCoexistenceAmountRule.
 * forSecuritiesSettlementTransactionConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionConfirmationV01
 * ConstraintCoexistenceCharacterSetXRule.
 * forSecuritiesSettlementTransactionConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionConfirmationV01
 * ConstraintTwoLegTransactionOpeningClosing1Rule.
 * forSecuritiesSettlementTransactionConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#forSecuritiesSettlementTransactionConfirmationV01
 * ConstraintCoexistenceIdentificationRule.
 * forSecuritiesSettlementTransactionConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionConfirmationV01
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * forSecuritiesSettlementTransactionConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionConfirmationV01
 * ConstraintTwoLegTransactionOpeningClosing2Rule.
 * forSecuritiesSettlementTransactionConfirmationV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: MT 544-7, Seq A :23G:NEWM, Seq D absent</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionConfirmationV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends a SecuritiesSettlementTransactionConfirmation to an account owner to confirm the partial or full delivery or receipt of financial instruments, free or against of payment, physically or by book-entry.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV02
 * SecuritiesSettlementTransactionConfirmationV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionConfirmationV01", propOrder = {"identification", "transactionIdentificationDetails", "additionalParameters", "tradeDetails", "financialInstrumentIdentification",
		"financialInstrumentAttributes", "quantityAndAccountDetails", "settlementParameters", "standingSettlementInstructionDetails", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "settledAmount",
		"otherAmounts", "otherBusinessParties", "additionalPhysicalOrRegistrationDetails", "messageOriginator", "messageRecipient", "extension"})
public class SecuritiesSettlementTransactionConfirmationV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected DocumentIdentification11 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11
	 * DocumentIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that unambiguously identifies an SecuritiesSettlementTransactionConfirmation message as known by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Information that unambiguously identifies an SecuritiesSettlementTransactionConfirmation message as known by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification11.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxIdDtls", required = true)
	protected SettlementTypeAndIdentification1 transactionIdentificationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1
	 * SettlementTypeAndIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides transaction type and identification information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentificationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxIdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationDetails";
			definition = "Provides transaction type and identification information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementTypeAndIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getTransactionIdentificationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AddtlParams")
	protected AdditionalParameters2 additionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters2
	 * AdditionalParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional parameters to the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParameters";
			definition = "Additional parameters to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalParameters2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getAdditionalParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TradDtls", required = true)
	protected SecuritiesTradeDetails2 tradeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2
	 * SecuritiesTradeDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getTradeDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification11 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11
	 * SecurityIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification11.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getFinancialInstrumentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes8 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8
	 * FinancialInstrumentAttributes8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elements characterising a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentAttributes = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getFinancialInstrumentAttributes", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "QtyAndAcctDtls", required = true)
	protected QuantityAndAccount2 quantityAndAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2
	 * QuantityAndAccount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyAndAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityAndAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the account and quantity involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQuantityAndAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getQuantityAndAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttlmParams", required = true)
	protected SettlementDetails6 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6
	 * SettlementDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementDetails6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getSettlementParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "StgSttlmInstrDtls")
	protected StandingSettlementInstruction1 standingSettlementInstructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction1
	 * StandingSettlementInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgSttlmInstrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStandingSettlementInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StgSttlmInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructionDetails";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingSettlementInstruction1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getStandingSettlementInstructionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties5 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties5
	 * SettlementParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDeliveringSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getDeliveringSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties5 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties5
	 * SettlementParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReceivingSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getReceivingSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties3 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashParties3
	 * CashParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash parties involved in the transaction if different for the securities settlement parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCashParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction if different for the securities settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getCashParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttldAmt")
	protected AmountAndDirection2 settledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2
	 * AmountAndDirection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettledAmount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledAmount";
			definition = "Amount effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getSettledAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OthrAmts")
	protected OtherAmounts4 otherAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherAmounts4
	 * OtherAmounts4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other amounts than the settlement amount."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherAmounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getOtherAmounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties2 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherParties2
	 * OtherParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other business parties relevant to the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherBusinessParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getOtherBusinessParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AddtlPhysOrRegnDtls")
	protected RegistrationParameters1 additionalPhysicalOrRegistrationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1
	 * RegistrationParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPhysOrRegnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information required for the registration or physical settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalPhysicalOrRegistrationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlPhysOrRegnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetails";
			definition = "Provides information required for the registration or physical settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegistrationParameters1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getAdditionalPhysicalOrRegistrationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected PartyIdentification10Choice messageOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgOrgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that originated the message, if other than the sender."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageOriginator = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getMessageOriginator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MsgRcpt")
	protected PartyIdentification10Choice messageRecipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageRecipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is the final destination of the message, if other than the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageRecipient = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgRcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageRecipient";
			definition = "Party that is the final destination of the message, if other than the receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getMessageRecipient", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension2> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension2
	 * Extension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV01.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettledAmountRule.forSecuritiesSettlementTransactionConfirmationV01,
						com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionConfirmationV01,
						com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule.forSecuritiesSettlementTransactionConfirmationV01,
						com.tools20022.repository.constraints.ConstraintSellerSSIRule.forSecuritiesSettlementTransactionConfirmationV01,
						com.tools20022.repository.constraints.ConstraintBuyerSSIRule.forSecuritiesSettlementTransactionConfirmationV01,
						com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesSettlementTransactionConfirmationV01,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionConfirmationV01,
						com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionConfirmationV01,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.forSecuritiesSettlementTransactionConfirmationV01,
						com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionConfirmationV01,
						com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionConfirmationV01);
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "MT 544-7, Seq A :23G:NEWM, Seq D absent"));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionConfirmationV01";
				definition = "Scope\r\nAn account servicer sends a SecuritiesSettlementTransactionConfirmation to an account owner to confirm the partial or full delivery or receipt of financial instruments, free or against of payment, physically or by book-entry.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionConfirmationV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxConf";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmTransactionIdentificationDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmAdditionalParameters, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmTradeDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmFinancialInstrumentIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmFinancialInstrumentAttributes,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmQuantityAndAccountDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmSettlementParameters,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmStandingSettlementInstructionDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmDeliveringSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmReceivingSettlementParties, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmCashParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmSettledAmount, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmOtherAmounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmAdditionalPhysicalOrRegistrationDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmMessageOriginator, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmMessageRecipient,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "025";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionConfirmationV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification11 getIdentification() {
		return identification;
	}

	public SecuritiesSettlementTransactionConfirmationV01 setIdentification(DocumentIdentification11 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public SettlementTypeAndIdentification1 getTransactionIdentificationDetails() {
		return transactionIdentificationDetails;
	}

	public SecuritiesSettlementTransactionConfirmationV01 setTransactionIdentificationDetails(SettlementTypeAndIdentification1 transactionIdentificationDetails) {
		this.transactionIdentificationDetails = Objects.requireNonNull(transactionIdentificationDetails);
		return this;
	}

	public Optional<AdditionalParameters2> getAdditionalParameters() {
		return additionalParameters == null ? Optional.empty() : Optional.of(additionalParameters);
	}

	public SecuritiesSettlementTransactionConfirmationV01 setAdditionalParameters(AdditionalParameters2 additionalParameters) {
		this.additionalParameters = additionalParameters;
		return this;
	}

	public SecuritiesTradeDetails2 getTradeDetails() {
		return tradeDetails;
	}

	public SecuritiesSettlementTransactionConfirmationV01 setTradeDetails(SecuritiesTradeDetails2 tradeDetails) {
		this.tradeDetails = Objects.requireNonNull(tradeDetails);
		return this;
	}

	public SecurityIdentification11 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesSettlementTransactionConfirmationV01 setFinancialInstrumentIdentification(SecurityIdentification11 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes8> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public SecuritiesSettlementTransactionConfirmationV01 setFinancialInstrumentAttributes(FinancialInstrumentAttributes8 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public QuantityAndAccount2 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public SecuritiesSettlementTransactionConfirmationV01 setQuantityAndAccountDetails(QuantityAndAccount2 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = Objects.requireNonNull(quantityAndAccountDetails);
		return this;
	}

	public SettlementDetails6 getSettlementParameters() {
		return settlementParameters;
	}

	public SecuritiesSettlementTransactionConfirmationV01 setSettlementParameters(SettlementDetails6 settlementParameters) {
		this.settlementParameters = Objects.requireNonNull(settlementParameters);
		return this;
	}

	public Optional<StandingSettlementInstruction1> getStandingSettlementInstructionDetails() {
		return standingSettlementInstructionDetails == null ? Optional.empty() : Optional.of(standingSettlementInstructionDetails);
	}

	public SecuritiesSettlementTransactionConfirmationV01 setStandingSettlementInstructionDetails(StandingSettlementInstruction1 standingSettlementInstructionDetails) {
		this.standingSettlementInstructionDetails = standingSettlementInstructionDetails;
		return this;
	}

	public Optional<SettlementParties5> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesSettlementTransactionConfirmationV01 setDeliveringSettlementParties(SettlementParties5 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties5> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesSettlementTransactionConfirmationV01 setReceivingSettlementParties(SettlementParties5 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<CashParties3> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public SecuritiesSettlementTransactionConfirmationV01 setCashParties(CashParties3 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<AmountAndDirection2> getSettledAmount() {
		return settledAmount == null ? Optional.empty() : Optional.of(settledAmount);
	}

	public SecuritiesSettlementTransactionConfirmationV01 setSettledAmount(AmountAndDirection2 settledAmount) {
		this.settledAmount = settledAmount;
		return this;
	}

	public Optional<OtherAmounts4> getOtherAmounts() {
		return otherAmounts == null ? Optional.empty() : Optional.of(otherAmounts);
	}

	public SecuritiesSettlementTransactionConfirmationV01 setOtherAmounts(OtherAmounts4 otherAmounts) {
		this.otherAmounts = otherAmounts;
		return this;
	}

	public Optional<OtherParties2> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public SecuritiesSettlementTransactionConfirmationV01 setOtherBusinessParties(OtherParties2 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public Optional<RegistrationParameters1> getAdditionalPhysicalOrRegistrationDetails() {
		return additionalPhysicalOrRegistrationDetails == null ? Optional.empty() : Optional.of(additionalPhysicalOrRegistrationDetails);
	}

	public SecuritiesSettlementTransactionConfirmationV01 setAdditionalPhysicalOrRegistrationDetails(RegistrationParameters1 additionalPhysicalOrRegistrationDetails) {
		this.additionalPhysicalOrRegistrationDetails = additionalPhysicalOrRegistrationDetails;
		return this;
	}

	public Optional<PartyIdentification10Choice> getMessageOriginator() {
		return messageOriginator == null ? Optional.empty() : Optional.of(messageOriginator);
	}

	public SecuritiesSettlementTransactionConfirmationV01 setMessageOriginator(PartyIdentification10Choice messageOriginator) {
		this.messageOriginator = messageOriginator;
		return this;
	}

	public Optional<PartyIdentification10Choice> getMessageRecipient() {
		return messageRecipient == null ? Optional.empty() : Optional.of(messageRecipient);
	}

	public SecuritiesSettlementTransactionConfirmationV01 setMessageRecipient(PartyIdentification10Choice messageRecipient) {
		this.messageRecipient = messageRecipient;
		return this;
	}

	public List<Extension2> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public SecuritiesSettlementTransactionConfirmationV01 setExtension(List<Extension2> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.025.001.01")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxConf", required = true)
		public SecuritiesSettlementTransactionConfirmationV01 messageBody;
	}
}