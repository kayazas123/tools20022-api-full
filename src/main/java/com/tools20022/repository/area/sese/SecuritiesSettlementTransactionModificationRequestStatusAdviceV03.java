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
import com.tools20022.repository.area.SecuritiesSettlementPreviousVersion;
import com.tools20022.repository.choice.ModificationProcessingStatus4Choice;
import com.tools20022.repository.choice.PartyIdentification36Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import com.tools20022.repository.msgset.SettlementAndReconciliationISOPreviousversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope An account servicer sends a
 * SecuritiesSettlementTransactionModificationRequestStatusAdvice to an account
 * owner to advise the status of a SecuritiesSettlementModificationRequest
 * message previously sent by the account owner. The account servicer may be: -
 * a central securities depository or another settlement market infrastructure
 * managing securities settlement transactions on behalf of their participants -
 * an custodian acting as an accounting and/or settlement agent.
 * 
 * Usage The message may also be used to: - re-send a message sent by the
 * account owner to the account servicer, - provide a third party with a copy of
 * a message being sent by the account owner for information, - re-send to a
 * third party a copy of a message being sent by the account owner for
 * information using the relevant elements in the Business Application Header.
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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.039.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementPreviousVersion
 * SecuritiesSettlementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmModificationRequestReference
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
 * mmModificationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmAccountOwner
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
 * mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmSafekeepingAccount
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
 * mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmTransactionIdentification
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
 * mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmModificationProcessingStatus
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
 * mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmTransactionDetails
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
 * mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03#mmSupplementaryData
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.
 * mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISOPreviousversion
 * SettlementAndReconciliationISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesSttlmTxModReqStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionModificationRequestStatusAdviceV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn account servicer sends a SecuritiesSettlementTransactionModificationRequestStatusAdvice to an account owner to advise the status of a SecuritiesSettlementModificationRequest message previously sent by the account owner.\nThe account servicer may be:\n- a central securities depository or another settlement market infrastructure managing securities settlement transactions on behalf of their participants\n- an custodian acting as an accounting and/or settlement agent.\n\nUsage\nThe message may also be used to:\n- re-send a message sent by the account owner to the account servicer,\n- provide a third party with a copy of a message being sent by the account owner for information,\n- re-send to a third party a copy of a message being sent by the account owner for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionModificationRequestStatusAdviceV03", propOrder = {"modificationRequestReference", "accountOwner", "safekeepingAccount", "transactionIdentification", "modificationProcessingStatus",
		"transactionDetails", "supplementaryData"})
public class SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ModReqRef", required = true)
	protected Identification1 modificationRequestReference;
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
	 * xmlTag} = "ModReqRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationRequestReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the unambiguous identification of the cancellation request as per the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04#mmModificationRequestReference
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.
	 * mmModificationRequestReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmModificationRequestReference
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
	 * mmModificationRequestReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestStatusAdviceV03, Identification1> mmModificationRequestReference = new MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestStatusAdviceV03, Identification1>() {
		{
			xmlTag = "ModReqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationRequestReference";
			definition = "Reference to the unambiguous identification of the cancellation request as per the account owner.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmModificationRequestReference);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmModificationRequestReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Identification1.mmObject();
		}

		@Override
		public Identification1 getValue(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 obj) {
			return obj.getModificationRequestReference();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 obj, Identification1 value) {
			obj.setModificationRequestReference(value);
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification36Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
	 * PartyIdentification36Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04#mmAccountOwner
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.
	 * mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmAccountOwner
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
	 * mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestStatusAdviceV03, Optional<PartyIdentification36Choice>> mmAccountOwner = new MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestStatusAdviceV03, Optional<PartyIdentification36Choice>>() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmAccountOwner);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification36Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification36Choice> getValue(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 obj, Optional<PartyIdentification36Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct", required = true)
	protected SecuritiesAccount13 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04#mmSafekeepingAccount
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.
	 * mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmSafekeepingAccount
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
	 * mmSafekeepingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestStatusAdviceV03, SecuritiesAccount13> mmSafekeepingAccount = new MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestStatusAdviceV03, SecuritiesAccount13>() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmSafekeepingAccount);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmSafekeepingAccount;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount13.mmObject();
		}

		@Override
		public SecuritiesAccount13 getValue(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 obj, SecuritiesAccount13 value) {
			obj.setSafekeepingAccount(value);
		}
	};
	@XmlElement(name = "TxId")
	protected TransactionIdentifications25 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications25
	 * TransactionIdentifications25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides unambiguous transaction identification information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04#mmTransactionIdentification
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.
	 * mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmTransactionIdentification
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
	 * mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestStatusAdviceV03, Optional<TransactionIdentifications25>> mmTransactionIdentification = new MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestStatusAdviceV03, Optional<TransactionIdentifications25>>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Provides unambiguous transaction identification information.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmTransactionIdentification);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionIdentifications25.mmObject();
		}

		@Override
		public Optional<TransactionIdentifications25> getValue(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 obj, Optional<TransactionIdentifications25> value) {
			obj.setTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ModPrcgSts", required = true)
	protected ModificationProcessingStatus4Choice modificationProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus4Choice
	 * ModificationProcessingStatus4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModPrcgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the processing status of the request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04#mmModificationProcessingStatus
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.
	 * mmModificationProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmModificationProcessingStatus
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
	 * mmModificationProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestStatusAdviceV03, ModificationProcessingStatus4Choice> mmModificationProcessingStatus = new MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestStatusAdviceV03, ModificationProcessingStatus4Choice>() {
		{
			xmlTag = "ModPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationProcessingStatus";
			definition = "Provides details on the processing status of the request.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmModificationProcessingStatus);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmModificationProcessingStatus;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ModificationProcessingStatus4Choice.mmObject();
		}

		@Override
		public ModificationProcessingStatus4Choice getValue(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 obj) {
			return obj.getModificationProcessingStatus();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 obj, ModificationProcessingStatus4Choice value) {
			obj.setModificationProcessingStatus(value);
		}
	};
	@XmlElement(name = "TxDtls")
	protected TransactionDetails45 transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails45
	 * TransactionDetails45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the details of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04#mmTransactionDetails
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.
	 * mmTransactionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmTransactionDetails
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
	 * mmTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestStatusAdviceV03, Optional<TransactionDetails45>> mmTransactionDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestStatusAdviceV03, Optional<TransactionDetails45>>() {
		{
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Identifies the details of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmTransactionDetails);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmTransactionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionDetails45.mmObject();
		}

		@Override
		public Optional<TransactionDetails45> getValue(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 obj) {
			return obj.getTransactionDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 obj, Optional<TransactionDetails45> value) {
			obj.setTransactionDetails(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV04#mmSupplementaryData
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.
	 * mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV02#mmSupplementaryData
	 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.
	 * mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestStatusAdviceV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestStatusAdviceV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmSupplementaryData);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionModificationRequestStatusAdviceV03";
				definition = "Scope\nAn account servicer sends a SecuritiesSettlementTransactionModificationRequestStatusAdvice to an account owner to advise the status of a SecuritiesSettlementModificationRequest message previously sent by the account owner.\nThe account servicer may be:\n- a central securities depository or another settlement market infrastructure managing securities settlement transactions on behalf of their participants\n- an custodian acting as an accounting and/or settlement agent.\n\nUsage\nThe message may also be used to:\n- re-send a message sent by the account owner to the account servicer,\n- provide a third party with a copy of a message being sent by the account owner for information,\n- re-send to a third party a copy of a message being sent by the account owner for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestStatusAdviceV04.mmObject());
				previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestStatusAdviceV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxModReqStsAdvc";
				businessArea_lazy = () -> SecuritiesSettlementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmModificationRequestReference,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmAccountOwner,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmSafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmModificationProcessingStatus,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmTransactionDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "039";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Identification1 getModificationRequestReference() {
		return modificationRequestReference;
	}

	public SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 setModificationRequestReference(Identification1 modificationRequestReference) {
		this.modificationRequestReference = Objects.requireNonNull(modificationRequestReference);
		return this;
	}

	public Optional<PartyIdentification36Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 setAccountOwner(PartyIdentification36Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public SecuritiesAccount13 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 setSafekeepingAccount(SecuritiesAccount13 safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public Optional<TransactionIdentifications25> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 setTransactionIdentification(TransactionIdentifications25 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public ModificationProcessingStatus4Choice getModificationProcessingStatus() {
		return modificationProcessingStatus;
	}

	public SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 setModificationProcessingStatus(ModificationProcessingStatus4Choice modificationProcessingStatus) {
		this.modificationProcessingStatus = Objects.requireNonNull(modificationProcessingStatus);
		return this;
	}

	public Optional<TransactionDetails45> getTransactionDetails() {
		return transactionDetails == null ? Optional.empty() : Optional.of(transactionDetails);
	}

	public SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 setTransactionDetails(TransactionDetails45 transactionDetails) {
		this.transactionDetails = transactionDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.039.001.03")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxModReqStsAdvc", required = true)
		public SecuritiesSettlementTransactionModificationRequestStatusAdviceV03 messageBody;
	}
}