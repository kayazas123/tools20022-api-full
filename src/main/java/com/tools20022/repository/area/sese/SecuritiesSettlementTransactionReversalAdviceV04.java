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
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope An account servicer sends a
 * SecuritiesSettlementTransactionReversalAdvice to an account owner to reverse
 * the confirmation of a partial or full delivery or receipt of financial
 * instruments, free or against of payment, physically or by book-entry. The
 * account servicer/owner relationship may be: - a central securities depository
 * or another settlement market infrastructure acting on behalf of their
 * participants - an agent (sub-custodian) acting on behalf of their global
 * custodian customer, or - a custodian acting on behalf of an investment
 * management institution or a broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 * 
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmTransactionIdentificationDetails
 * SecuritiesSettlementTransactionReversalAdviceV04.
 * mmTransactionIdentificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmConfirmationReference
 * SecuritiesSettlementTransactionReversalAdviceV04.mmConfirmationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmAdditionalParameters
 * SecuritiesSettlementTransactionReversalAdviceV04.mmAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmTradeDetails
 * SecuritiesSettlementTransactionReversalAdviceV04.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionReversalAdviceV04.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionReversalAdviceV04.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionReversalAdviceV04.mmQuantityAndAccountDetails}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmSettlementParameters
 * SecuritiesSettlementTransactionReversalAdviceV04.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionReversalAdviceV04.
 * mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionReversalAdviceV04.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionReversalAdviceV04.mmReceivingSettlementParties
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmCashParties
 * SecuritiesSettlementTransactionReversalAdviceV04.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmSettledAmount
 * SecuritiesSettlementTransactionReversalAdviceV04.mmSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmOtherAmounts
 * SecuritiesSettlementTransactionReversalAdviceV04.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmOtherBusinessParties
 * SecuritiesSettlementTransactionReversalAdviceV04.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionReversalAdviceV04.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmSupplementaryData
 * SecuritiesSettlementTransactionReversalAdviceV04.mmSupplementaryData}</li>
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
 * xmlTag} = "SctiesSttlmTxRvslAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.026.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesSettlementTransactionReversalAdviceV04
 * ConstraintCoexistenceAmountRule.
 * forSecuritiesSettlementTransactionReversalAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesSettlementTransactionReversalAdviceV04
 * ConstraintCoexistenceCharacterSetXRule.
 * forSecuritiesSettlementTransactionReversalAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#forSecuritiesSettlementTransactionReversalAdviceV04
 * ConstraintCoexistenceIdentificationRule.
 * forSecuritiesSettlementTransactionReversalAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBuyerSSIRule#forSecuritiesSettlementTransactionReversalAdviceV04
 * ConstraintBuyerSSIRule.forSecuritiesSettlementTransactionReversalAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesSettlementTransactionReversalAdviceV04
 * ConstraintReceivingDepositoryAndParty1Rule.
 * forSecuritiesSettlementTransactionReversalAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule#forSecuritiesSettlementTransactionReversalAdviceV04
 * ConstraintDeliveringDepositoryAndParty1Rule.
 * forSecuritiesSettlementTransactionReversalAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettledAmountRule#forSecuritiesSettlementTransactionReversalAdviceV04
 * ConstraintSettledAmountRule.
 * forSecuritiesSettlementTransactionReversalAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSIRule#forSecuritiesSettlementTransactionReversalAdviceV04
 * ConstraintSellerSSIRule.forSecuritiesSettlementTransactionReversalAdviceV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionReversalAdviceV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account servicer sends a SecuritiesSettlementTransactionReversalAdvice to an account owner to reverse the confirmation of a partial or full delivery or receipt of financial instruments, free or against of payment, physically or by book-entry.\nThe account servicer/owner relationship may be:\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05
 * SecuritiesSettlementTransactionReversalAdviceV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03
 * SecuritiesSettlementTransactionReversalAdviceV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionReversalAdviceV04", propOrder = {"transactionIdentificationDetails", "confirmationReference", "additionalParameters", "tradeDetails", "financialInstrumentIdentification",
		"financialInstrumentAttributes", "quantityAndAccountDetails", "settlementParameters", "standingSettlementInstructionDetails", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "settledAmount",
		"otherAmounts", "otherBusinessParties", "additionalPhysicalOrRegistrationDetails", "supplementaryData"})
public class SecuritiesSettlementTransactionReversalAdviceV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxIdDtls", required = true)
	protected SettlementTypeAndIdentification15 transactionIdentificationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15
	 * SettlementTypeAndIdentification15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmTransactionIdentificationDetails
	 * SecuritiesSettlementTransactionReversalAdviceV05.
	 * mmTransactionIdentificationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmTransactionIdentificationDetails
	 * SecuritiesSettlementTransactionReversalAdviceV03.
	 * mmTransactionIdentificationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentificationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxIdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationDetails";
			definition = "Provides transaction type and identification information.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmTransactionIdentificationDetails);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmTransactionIdentificationDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementTypeAndIdentification15.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getTransactionIdentificationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ConfRef", required = true)
	protected Identification1 confirmationReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Identification1
	 * Identification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the unambiguous identification of the confirmation as per the account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmConfirmationReference
	 * SecuritiesSettlementTransactionReversalAdviceV05.mmConfirmationReference}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmConfirmationReference
	 * SecuritiesSettlementTransactionReversalAdviceV03.mmConfirmationReference}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmConfirmationReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "ConfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationReference";
			definition = "Reference to the unambiguous identification of the confirmation as per the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmConfirmationReference);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmConfirmationReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Identification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getConfirmationReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AddtlParams")
	protected AdditionalParameters14 additionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters14
	 * AdditionalParameters14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmAdditionalParameters
	 * SecuritiesSettlementTransactionReversalAdviceV05.mmAdditionalParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmAdditionalParameters
	 * SecuritiesSettlementTransactionReversalAdviceV03.mmAdditionalParameters}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParameters";
			definition = "Additional parameters to the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmAdditionalParameters);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmAdditionalParameters;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalParameters14.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getAdditionalParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TradDtls", required = true)
	protected SecuritiesTradeDetails31 tradeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31
	 * SecuritiesTradeDetails31}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmTradeDetails
	 * SecuritiesSettlementTransactionReversalAdviceV05.mmTradeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmTradeDetails
	 * SecuritiesSettlementTransactionReversalAdviceV03.mmTradeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the trade.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmTradeDetails);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmTradeDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails31.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getTradeDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmFinancialInstrumentIdentification
	 * SecuritiesSettlementTransactionReversalAdviceV05.
	 * mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmFinancialInstrumentIdentification
	 * SecuritiesSettlementTransactionReversalAdviceV03.
	 * mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmFinancialInstrumentIdentification);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification14.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getFinancialInstrumentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes35 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35
	 * FinancialInstrumentAttributes35}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionReversalAdviceV05.
	 * mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionReversalAdviceV03.
	 * mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentAttributes = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmFinancialInstrumentAttributes);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmFinancialInstrumentAttributes;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes35.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getFinancialInstrumentAttributes", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "QtyAndAcctDtls", required = true)
	protected QuantityAndAccount28 quantityAndAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28
	 * QuantityAndAccount28}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmQuantityAndAccountDetails
	 * SecuritiesSettlementTransactionReversalAdviceV05.
	 * mmQuantityAndAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmQuantityAndAccountDetails
	 * SecuritiesSettlementTransactionReversalAdviceV03.
	 * mmQuantityAndAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQuantityAndAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmQuantityAndAccountDetails);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmQuantityAndAccountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount28.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getQuantityAndAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttlmParams", required = true)
	protected SettlementDetails70 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70
	 * SettlementDetails70}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmSettlementParameters
	 * SecuritiesSettlementTransactionReversalAdviceV05.mmSettlementParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmSettlementParameters
	 * SecuritiesSettlementTransactionReversalAdviceV03.mmSettlementParameters}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmSettlementParameters);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmSettlementParameters;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementDetails70.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getSettlementParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "StgSttlmInstrDtls")
	protected StandingSettlementInstruction5 standingSettlementInstructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction5
	 * StandingSettlementInstruction5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionReversalAdviceV05.
	 * mmStandingSettlementInstructionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionReversalAdviceV03.
	 * mmStandingSettlementInstructionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStandingSettlementInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StgSttlmInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructionDetails";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmStandingSettlementInstructionDetails);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmStandingSettlementInstructionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingSettlementInstruction5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getStandingSettlementInstructionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties14 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties14
	 * SettlementParties14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmDeliveringSettlementParties
	 * SecuritiesSettlementTransactionReversalAdviceV05.
	 * mmDeliveringSettlementParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmDeliveringSettlementParties
	 * SecuritiesSettlementTransactionReversalAdviceV03.
	 * mmDeliveringSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDeliveringSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmDeliveringSettlementParties);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmDeliveringSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties14.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getDeliveringSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties14 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties14
	 * SettlementParties14}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmReceivingSettlementParties
	 * SecuritiesSettlementTransactionReversalAdviceV05.
	 * mmReceivingSettlementParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmReceivingSettlementParties
	 * SecuritiesSettlementTransactionReversalAdviceV03.
	 * mmReceivingSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReceivingSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmReceivingSettlementParties);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmReceivingSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties14.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getReceivingSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties9 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashParties9
	 * CashParties9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmCashParties
	 * SecuritiesSettlementTransactionReversalAdviceV05.mmCashParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmCashParties
	 * SecuritiesSettlementTransactionReversalAdviceV03.mmCashParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCashParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction if different for the securities settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmCashParties);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmCashParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties9.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getCashParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttldAmt")
	protected AmountAndDirection36 settledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36
	 * AmountAndDirection36}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmSettledAmount
	 * SecuritiesSettlementTransactionReversalAdviceV05.mmSettledAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmSettledAmount
	 * SecuritiesSettlementTransactionReversalAdviceV03.mmSettledAmount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettledAmount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledAmount";
			definition = "Amount effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmSettledAmount);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmSettledAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection36.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getSettledAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OthrAmts")
	protected OtherAmounts18 otherAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherAmounts18
	 * OtherAmounts18}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmOtherAmounts
	 * SecuritiesSettlementTransactionReversalAdviceV05.mmOtherAmounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmOtherAmounts
	 * SecuritiesSettlementTransactionReversalAdviceV03.mmOtherAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherAmounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmOtherAmounts);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmOtherAmounts;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts18.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getOtherAmounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties19 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherParties19
	 * OtherParties19}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmOtherBusinessParties
	 * SecuritiesSettlementTransactionReversalAdviceV05.mmOtherBusinessParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmOtherBusinessParties
	 * SecuritiesSettlementTransactionReversalAdviceV03.mmOtherBusinessParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherBusinessParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmOtherBusinessParties);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmOtherBusinessParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties19.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getOtherBusinessParties", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionReversalAdviceV05.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionReversalAdviceV03.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalPhysicalOrRegistrationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlPhysOrRegnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetails";
			definition = "Provides information required for the registration or physical settlement.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmAdditionalPhysicalOrRegistrationDetails);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmAdditionalPhysicalOrRegistrationDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegistrationParameters1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getAdditionalPhysicalOrRegistrationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV05#mmSupplementaryData
	 * SecuritiesSettlementTransactionReversalAdviceV05.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmSupplementaryData
	 * SecuritiesSettlementTransactionReversalAdviceV03.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmSupplementaryData);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionReversalAdviceV04.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesSettlementTransactionReversalAdviceV04,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesSettlementTransactionReversalAdviceV04,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.forSecuritiesSettlementTransactionReversalAdviceV04,
						com.tools20022.repository.constraints.ConstraintBuyerSSIRule.forSecuritiesSettlementTransactionReversalAdviceV04,
						com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesSettlementTransactionReversalAdviceV04,
						com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule.forSecuritiesSettlementTransactionReversalAdviceV04,
						com.tools20022.repository.constraints.ConstraintSettledAmountRule.forSecuritiesSettlementTransactionReversalAdviceV04,
						com.tools20022.repository.constraints.ConstraintSellerSSIRule.forSecuritiesSettlementTransactionReversalAdviceV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionReversalAdviceV04";
				definition = "Scope\nAn account servicer sends a SecuritiesSettlementTransactionReversalAdvice to an account owner to reverse the confirmation of a partial or full delivery or receipt of financial instruments, free or against of payment, physically or by book-entry.\nThe account servicer/owner relationship may be:\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV05.mmObject());
				previousVersion_lazy = () -> SecuritiesSettlementTransactionReversalAdviceV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxRvslAdvc";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmTransactionIdentificationDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmConfirmationReference,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmAdditionalParameters, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmTradeDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmFinancialInstrumentIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmFinancialInstrumentAttributes,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmQuantityAndAccountDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmSettlementParameters,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmStandingSettlementInstructionDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmDeliveringSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmReceivingSettlementParties, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmCashParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmSettledAmount, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmOtherAmounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmAdditionalPhysicalOrRegistrationDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "026";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionReversalAdviceV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementTypeAndIdentification15 getTransactionIdentificationDetails() {
		return transactionIdentificationDetails;
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setTransactionIdentificationDetails(SettlementTypeAndIdentification15 transactionIdentificationDetails) {
		this.transactionIdentificationDetails = Objects.requireNonNull(transactionIdentificationDetails);
		return this;
	}

	public Identification1 getConfirmationReference() {
		return confirmationReference;
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setConfirmationReference(Identification1 confirmationReference) {
		this.confirmationReference = Objects.requireNonNull(confirmationReference);
		return this;
	}

	public Optional<AdditionalParameters14> getAdditionalParameters() {
		return additionalParameters == null ? Optional.empty() : Optional.of(additionalParameters);
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setAdditionalParameters(AdditionalParameters14 additionalParameters) {
		this.additionalParameters = additionalParameters;
		return this;
	}

	public SecuritiesTradeDetails31 getTradeDetails() {
		return tradeDetails;
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setTradeDetails(SecuritiesTradeDetails31 tradeDetails) {
		this.tradeDetails = Objects.requireNonNull(tradeDetails);
		return this;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes35> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setFinancialInstrumentAttributes(FinancialInstrumentAttributes35 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public QuantityAndAccount28 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setQuantityAndAccountDetails(QuantityAndAccount28 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = Objects.requireNonNull(quantityAndAccountDetails);
		return this;
	}

	public SettlementDetails70 getSettlementParameters() {
		return settlementParameters;
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setSettlementParameters(SettlementDetails70 settlementParameters) {
		this.settlementParameters = Objects.requireNonNull(settlementParameters);
		return this;
	}

	public Optional<StandingSettlementInstruction5> getStandingSettlementInstructionDetails() {
		return standingSettlementInstructionDetails == null ? Optional.empty() : Optional.of(standingSettlementInstructionDetails);
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setStandingSettlementInstructionDetails(StandingSettlementInstruction5 standingSettlementInstructionDetails) {
		this.standingSettlementInstructionDetails = standingSettlementInstructionDetails;
		return this;
	}

	public Optional<SettlementParties14> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setDeliveringSettlementParties(SettlementParties14 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties14> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setReceivingSettlementParties(SettlementParties14 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<CashParties9> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setCashParties(CashParties9 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<AmountAndDirection36> getSettledAmount() {
		return settledAmount == null ? Optional.empty() : Optional.of(settledAmount);
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setSettledAmount(AmountAndDirection36 settledAmount) {
		this.settledAmount = settledAmount;
		return this;
	}

	public Optional<OtherAmounts18> getOtherAmounts() {
		return otherAmounts == null ? Optional.empty() : Optional.of(otherAmounts);
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setOtherAmounts(OtherAmounts18 otherAmounts) {
		this.otherAmounts = otherAmounts;
		return this;
	}

	public Optional<OtherParties19> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setOtherBusinessParties(OtherParties19 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public Optional<RegistrationParameters1> getAdditionalPhysicalOrRegistrationDetails() {
		return additionalPhysicalOrRegistrationDetails == null ? Optional.empty() : Optional.of(additionalPhysicalOrRegistrationDetails);
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setAdditionalPhysicalOrRegistrationDetails(RegistrationParameters1 additionalPhysicalOrRegistrationDetails) {
		this.additionalPhysicalOrRegistrationDetails = additionalPhysicalOrRegistrationDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesSettlementTransactionReversalAdviceV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.026.001.04")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxRvslAdvc", required = true)
		public SecuritiesSettlementTransactionReversalAdviceV04 messageBody;
	}
}