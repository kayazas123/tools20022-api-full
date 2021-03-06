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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.RestrictedFINXMax35Text;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OrganisationIdentification9;
import com.tools20022.repository.msg.ProprietaryReason2;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the history of status and reasons for a pending, posted or cancelled
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail5#mmStatusDate
 * StatusTrail5.mmStatusDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmSendingOrganisationIdentification
 * StatusTrail5.mmSendingOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmUserIdentification
 * StatusTrail5.mmUserIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmProcessingStatus
 * StatusTrail5.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmInferredMatchingStatus
 * StatusTrail5.mmInferredMatchingStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail5#mmMatchingStatus
 * StatusTrail5.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmSettlementStatus
 * StatusTrail5.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmModificationProcessingStatus
 * StatusTrail5.mmModificationProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmCancellationStatus
 * StatusTrail5.mmCancellationStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusTrail5#mmSettled
 * StatusTrail5.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusTrail5#mmSupplementaryData
 * StatusTrail5.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusTrail5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the history of status and reasons for a pending, posted or cancelled transaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatusTrail5", propOrder = {"statusDate", "sendingOrganisationIdentification", "userIdentification", "processingStatus", "inferredMatchingStatus", "matchingStatus", "settlementStatus", "modificationProcessingStatus",
		"cancellationStatus", "settled", "supplementaryData"})
public class StatusTrail5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StsDt", required = true)
	protected ISODateTime statusDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
	 * Status.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5 StatusTrail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the status was assigned."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatusTrail5, ISODateTime> mmStatusDate = new MMMessageAttribute<StatusTrail5, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail5.mmObject();
			isDerived = false;
			xmlTag = "StsDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDate";
			definition = "Date and time at which the status was assigned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(StatusTrail5 obj) {
			return obj.getStatusDate();
		}

		@Override
		public void setValue(StatusTrail5 obj, ISODateTime value) {
			obj.setStatusDate(value);
		}
	};
	@XmlElement(name = "SndgOrgId")
	protected OrganisationIdentification9 sendingOrganisationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification9
	 * OrganisationIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5 StatusTrail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndgOrgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendingOrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous way to identify the organisation that sent the message instance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatusTrail5, Optional<OrganisationIdentification9>> mmSendingOrganisationIdentification = new MMMessageAttribute<StatusTrail5, Optional<OrganisationIdentification9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail5.mmObject();
			isDerived = false;
			xmlTag = "SndgOrgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendingOrganisationIdentification";
			definition = "Unique and unambiguous way to identify the organisation that sent the message instance.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OrganisationIdentification9.mmObject();
		}

		@Override
		public Optional<OrganisationIdentification9> getValue(StatusTrail5 obj) {
			return obj.getSendingOrganisationIdentification();
		}

		@Override
		public void setValue(StatusTrail5 obj, Optional<OrganisationIdentification9> value) {
			obj.setSendingOrganisationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "UsrId")
	protected RestrictedFINXMax35Text userIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax35Text
	 * RestrictedFINXMax35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5 StatusTrail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous way to identify the user that created the message instance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StatusTrail5, Optional<RestrictedFINXMax35Text>> mmUserIdentification = new MMMessageAttribute<StatusTrail5, Optional<RestrictedFINXMax35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail5.mmObject();
			isDerived = false;
			xmlTag = "UsrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserIdentification";
			definition = "Unique and unambiguous way to identify the user that created the message instance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax35Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax35Text> getValue(StatusTrail5 obj) {
			return obj.getUserIdentification();
		}

		@Override
		public void setValue(StatusTrail5 obj, Optional<RestrictedFINXMax35Text> value) {
			obj.setUserIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgSts")
	protected ProcessingStatus25Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus25Choice
	 * ProcessingStatus25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5 StatusTrail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the processing status of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusTrail5, Optional<ProcessingStatus25Choice>> mmProcessingStatus = new MMMessageAssociationEnd<StatusTrail5, Optional<ProcessingStatus25Choice>>() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail5.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides details on the processing status of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingStatus25Choice.mmObject();
		}

		@Override
		public Optional<ProcessingStatus25Choice> getValue(StatusTrail5 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(StatusTrail5 obj, Optional<ProcessingStatus25Choice> value) {
			obj.setProcessingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "IfrrdMtchgSts")
	protected MatchingStatus18Choice inferredMatchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus18Choice
	 * MatchingStatus18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5 StatusTrail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IfrrdMtchgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the matching status of an instruction as per the account servicer or the Market Infrastructure based on an allegement. At this time no matching took place on the market (at the CSD/ICSD/MI)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusTrail5, Optional<MatchingStatus18Choice>> mmInferredMatchingStatus = new MMMessageAssociationEnd<StatusTrail5, Optional<MatchingStatus18Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail5.mmObject();
			isDerived = false;
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as per the account servicer or the Market Infrastructure based on an allegement. At this time no matching took place on the market (at the CSD/ICSD/MI).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MatchingStatus18Choice.mmObject();
		}

		@Override
		public Optional<MatchingStatus18Choice> getValue(StatusTrail5 obj) {
			return obj.getInferredMatchingStatus();
		}

		@Override
		public void setValue(StatusTrail5 obj, Optional<MatchingStatus18Choice> value) {
			obj.setInferredMatchingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "MtchgSts")
	protected MatchingStatus18Choice matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus18Choice
	 * MatchingStatus18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5 StatusTrail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the matching status of the instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusTrail5, Optional<MatchingStatus18Choice>> mmMatchingStatus = new MMMessageAssociationEnd<StatusTrail5, Optional<MatchingStatus18Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail5.mmObject();
			isDerived = false;
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MatchingStatus18Choice.mmObject();
		}

		@Override
		public Optional<MatchingStatus18Choice> getValue(StatusTrail5 obj) {
			return obj.getMatchingStatus();
		}

		@Override
		public void setValue(StatusTrail5 obj, Optional<MatchingStatus18Choice> value) {
			obj.setMatchingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmSts")
	protected SettlementStatus13Choice settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus13Choice
	 * SettlementStatus13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmSettlementStatus
	 * Status.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5 StatusTrail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of settlement of a transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusTrail5, Optional<SettlementStatus13Choice>> mmSettlementStatus = new MMMessageAssociationEnd<StatusTrail5, Optional<SettlementStatus13Choice>>() {
		{
			businessElementTrace_lazy = () -> Status.mmSettlementStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail5.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementStatus13Choice.mmObject();
		}

		@Override
		public Optional<SettlementStatus13Choice> getValue(StatusTrail5 obj) {
			return obj.getSettlementStatus();
		}

		@Override
		public void setValue(StatusTrail5 obj, Optional<SettlementStatus13Choice> value) {
			obj.setSettlementStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "ModPrcgSts")
	protected ModificationProcessingStatus5Choice modificationProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus5Choice
	 * ModificationProcessingStatus5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5 StatusTrail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModPrcgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the modification processing status of the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusTrail5, Optional<ModificationProcessingStatus5Choice>> mmModificationProcessingStatus = new MMMessageAssociationEnd<StatusTrail5, Optional<ModificationProcessingStatus5Choice>>() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail5.mmObject();
			isDerived = false;
			xmlTag = "ModPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationProcessingStatus";
			definition = "Provides details on the modification processing status of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ModificationProcessingStatus5Choice.mmObject();
		}

		@Override
		public Optional<ModificationProcessingStatus5Choice> getValue(StatusTrail5 obj) {
			return obj.getModificationProcessingStatus();
		}

		@Override
		public void setValue(StatusTrail5 obj, Optional<ModificationProcessingStatus5Choice> value) {
			obj.setModificationProcessingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlSts")
	protected ProcessingStatus26Choice cancellationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus26Choice
	 * ProcessingStatus26Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5 StatusTrail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the processing status of the cancellation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusTrail5, Optional<ProcessingStatus26Choice>> mmCancellationStatus = new MMMessageAssociationEnd<StatusTrail5, Optional<ProcessingStatus26Choice>>() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail5.mmObject();
			isDerived = false;
			xmlTag = "CxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatus";
			definition = "Provides details on the processing status of the cancellation request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingStatus26Choice.mmObject();
		}

		@Override
		public Optional<ProcessingStatus26Choice> getValue(StatusTrail5 obj) {
			return obj.getCancellationStatus();
		}

		@Override
		public void setValue(StatusTrail5 obj, Optional<ProcessingStatus26Choice> value) {
			obj.setCancellationStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "Sttld")
	protected ProprietaryReason2 settled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason2
	 * ProprietaryReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5 StatusTrail5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sttld"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status is settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatusTrail5, Optional<ProprietaryReason2>> mmSettled = new MMMessageAssociationEnd<StatusTrail5, Optional<ProprietaryReason2>>() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail5.mmObject();
			isDerived = false;
			xmlTag = "Sttld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			definition = "Status is settled.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProprietaryReason2.mmObject();
		}

		@Override
		public Optional<ProprietaryReason2> getValue(StatusTrail5 obj) {
			return obj.getSettled();
		}

		@Override
		public void setValue(StatusTrail5 obj, Optional<ProprietaryReason2> value) {
			obj.setSettled(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusTrail5 StatusTrail5}</li>
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
	public static final MMMessageAssociationEnd<StatusTrail5, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<StatusTrail5, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatusTrail5.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(StatusTrail5 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(StatusTrail5 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusTrail5.mmStatusDate, com.tools20022.repository.msg.StatusTrail5.mmSendingOrganisationIdentification,
						com.tools20022.repository.msg.StatusTrail5.mmUserIdentification, com.tools20022.repository.msg.StatusTrail5.mmProcessingStatus, com.tools20022.repository.msg.StatusTrail5.mmInferredMatchingStatus,
						com.tools20022.repository.msg.StatusTrail5.mmMatchingStatus, com.tools20022.repository.msg.StatusTrail5.mmSettlementStatus, com.tools20022.repository.msg.StatusTrail5.mmModificationProcessingStatus,
						com.tools20022.repository.msg.StatusTrail5.mmCancellationStatus, com.tools20022.repository.msg.StatusTrail5.mmSettled, com.tools20022.repository.msg.StatusTrail5.mmSupplementaryData);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "StatusTrail5";
				definition = "Provides the history of status and reasons for a pending, posted or cancelled transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getStatusDate() {
		return statusDate;
	}

	public StatusTrail5 setStatusDate(ISODateTime statusDate) {
		this.statusDate = Objects.requireNonNull(statusDate);
		return this;
	}

	public Optional<OrganisationIdentification9> getSendingOrganisationIdentification() {
		return sendingOrganisationIdentification == null ? Optional.empty() : Optional.of(sendingOrganisationIdentification);
	}

	public StatusTrail5 setSendingOrganisationIdentification(OrganisationIdentification9 sendingOrganisationIdentification) {
		this.sendingOrganisationIdentification = sendingOrganisationIdentification;
		return this;
	}

	public Optional<RestrictedFINXMax35Text> getUserIdentification() {
		return userIdentification == null ? Optional.empty() : Optional.of(userIdentification);
	}

	public StatusTrail5 setUserIdentification(RestrictedFINXMax35Text userIdentification) {
		this.userIdentification = userIdentification;
		return this;
	}

	public Optional<ProcessingStatus25Choice> getProcessingStatus() {
		return processingStatus == null ? Optional.empty() : Optional.of(processingStatus);
	}

	public StatusTrail5 setProcessingStatus(ProcessingStatus25Choice processingStatus) {
		this.processingStatus = processingStatus;
		return this;
	}

	public Optional<MatchingStatus18Choice> getInferredMatchingStatus() {
		return inferredMatchingStatus == null ? Optional.empty() : Optional.of(inferredMatchingStatus);
	}

	public StatusTrail5 setInferredMatchingStatus(MatchingStatus18Choice inferredMatchingStatus) {
		this.inferredMatchingStatus = inferredMatchingStatus;
		return this;
	}

	public Optional<MatchingStatus18Choice> getMatchingStatus() {
		return matchingStatus == null ? Optional.empty() : Optional.of(matchingStatus);
	}

	public StatusTrail5 setMatchingStatus(MatchingStatus18Choice matchingStatus) {
		this.matchingStatus = matchingStatus;
		return this;
	}

	public Optional<SettlementStatus13Choice> getSettlementStatus() {
		return settlementStatus == null ? Optional.empty() : Optional.of(settlementStatus);
	}

	public StatusTrail5 setSettlementStatus(SettlementStatus13Choice settlementStatus) {
		this.settlementStatus = settlementStatus;
		return this;
	}

	public Optional<ModificationProcessingStatus5Choice> getModificationProcessingStatus() {
		return modificationProcessingStatus == null ? Optional.empty() : Optional.of(modificationProcessingStatus);
	}

	public StatusTrail5 setModificationProcessingStatus(ModificationProcessingStatus5Choice modificationProcessingStatus) {
		this.modificationProcessingStatus = modificationProcessingStatus;
		return this;
	}

	public Optional<ProcessingStatus26Choice> getCancellationStatus() {
		return cancellationStatus == null ? Optional.empty() : Optional.of(cancellationStatus);
	}

	public StatusTrail5 setCancellationStatus(ProcessingStatus26Choice cancellationStatus) {
		this.cancellationStatus = cancellationStatus;
		return this;
	}

	public Optional<ProprietaryReason2> getSettled() {
		return settled == null ? Optional.empty() : Optional.of(settled);
	}

	public StatusTrail5 setSettled(ProprietaryReason2 settled) {
		this.settled = settled;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public StatusTrail5 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}