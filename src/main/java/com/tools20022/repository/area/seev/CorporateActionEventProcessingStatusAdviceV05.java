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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsPreviousVersion;
import com.tools20022.repository.choice.EventProcessingStatus3Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CorporateActionsISOPreviousversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends the CorporateActionEventProcessingStatusAdvice
 * message to an account owner or its designated agent to report processing
 * status of a corporate action event. <br>
 * The account servicer uses this message to provide a reason as to why a
 * corporate action event has not been completed by the announced payment dates.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate),<br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy),<br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate), <br>
 * using the relevant elements in the business application header (BAH).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.032.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsPreviousVersion
 * SecuritiesEventsPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05#mmNotificationIdentification
 * CorporateActionEventProcessingStatusAdviceV05.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05#mmOtherDocumentIdentification
 * CorporateActionEventProcessingStatusAdviceV05.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05#mmCorporateActionGeneralInformation
 * CorporateActionEventProcessingStatusAdviceV05.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05#mmEventProcessingStatus
 * CorporateActionEventProcessingStatusAdviceV05.mmEventProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05#mmAdditionalInformation
 * CorporateActionEventProcessingStatusAdviceV05.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05#mmSupplementaryData
 * CorporateActionEventProcessingStatusAdviceV05.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CorporateActionsISOPreviousversion
 * CorporateActionsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnEvtPrcgStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventProcessingStatusAdviceV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionEventProcessingStatusAdvice message to an account owner or its designated agent to report processing status of a corporate action event.\r\r\nThe account servicer uses this message to provide a reason as to why a corporate action event has not been completed by the announced payment dates.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate), \r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06
 * CorporateActionEventProcessingStatusAdviceV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04
 * CorporateActionEventProcessingStatusAdviceV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionEventProcessingStatusAdviceV05", propOrder = {"notificationIdentification", "otherDocumentIdentification", "corporateActionGeneralInformation", "eventProcessingStatus", "additionalInformation",
		"supplementaryData"})
public class CorporateActionEventProcessingStatusAdviceV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtfctnId")
	protected DocumentIdentification9 notificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification9
	 * DocumentIdentification9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent notification document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06#mmNotificationIdentification
	 * CorporateActionEventProcessingStatusAdviceV06.
	 * mmNotificationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04#mmNotificationIdentification
	 * CorporateActionEventProcessingStatusAdviceV04.
	 * mmNotificationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionEventProcessingStatusAdviceV05, Optional<DocumentIdentification9>> mmNotificationIdentification = new MMMessageBuildingBlock<CorporateActionEventProcessingStatusAdviceV05, Optional<DocumentIdentification9>>() {
		{
			xmlTag = "NtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationIdentification";
			definition = "Identification of a previously sent notification document.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventProcessingStatusAdviceV06.mmNotificationIdentification);
			previousVersion_lazy = () -> CorporateActionEventProcessingStatusAdviceV04.mmNotificationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification9.mmObject();
		}

		@Override
		public Optional<DocumentIdentification9> getValue(CorporateActionEventProcessingStatusAdviceV05 obj) {
			return obj.getNotificationIdentification();
		}

		@Override
		public void setValue(CorporateActionEventProcessingStatusAdviceV05 obj, Optional<DocumentIdentification9> value) {
			obj.setNotificationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrDocId")
	protected List<DocumentIdentification33> otherDocumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification33
	 * DocumentIdentification33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDocId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of other documents as well as the document number."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06#mmOtherDocumentIdentification
	 * CorporateActionEventProcessingStatusAdviceV06.
	 * mmOtherDocumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04#mmOtherDocumentIdentification
	 * CorporateActionEventProcessingStatusAdviceV04.
	 * mmOtherDocumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionEventProcessingStatusAdviceV05, List<DocumentIdentification33>> mmOtherDocumentIdentification = new MMMessageBuildingBlock<CorporateActionEventProcessingStatusAdviceV05, List<DocumentIdentification33>>() {
		{
			xmlTag = "OthrDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentIdentification";
			definition = "Identification of other documents as well as the document number.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventProcessingStatusAdviceV06.mmOtherDocumentIdentification);
			previousVersion_lazy = () -> CorporateActionEventProcessingStatusAdviceV04.mmOtherDocumentIdentification;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification33.mmObject();
		}

		@Override
		public List<DocumentIdentification33> getValue(CorporateActionEventProcessingStatusAdviceV05 obj) {
			return obj.getOtherDocumentIdentification();
		}

		@Override
		public void setValue(CorporateActionEventProcessingStatusAdviceV05 obj, List<DocumentIdentification33> value) {
			obj.setOtherDocumentIdentification(value);
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation91 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91
	 * CorporateActionGeneralInformation91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06#mmCorporateActionGeneralInformation
	 * CorporateActionEventProcessingStatusAdviceV06.
	 * mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04#mmCorporateActionGeneralInformation
	 * CorporateActionEventProcessingStatusAdviceV04.
	 * mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionEventProcessingStatusAdviceV05, CorporateActionGeneralInformation91> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<CorporateActionEventProcessingStatusAdviceV05, CorporateActionGeneralInformation91>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventProcessingStatusAdviceV06.mmCorporateActionGeneralInformation);
			previousVersion_lazy = () -> CorporateActionEventProcessingStatusAdviceV04.mmCorporateActionGeneralInformation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation91.mmObject();
		}

		@Override
		public CorporateActionGeneralInformation91 getValue(CorporateActionEventProcessingStatusAdviceV05 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionEventProcessingStatusAdviceV05 obj, CorporateActionGeneralInformation91 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "EvtPrcgSts", required = true)
	protected List<EventProcessingStatus3Choice> eventProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice
	 * EventProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtPrcgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the status of a corporate action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06#mmEventProcessingStatus
	 * CorporateActionEventProcessingStatusAdviceV06.mmEventProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04#mmEventProcessingStatus
	 * CorporateActionEventProcessingStatusAdviceV04.mmEventProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionEventProcessingStatusAdviceV05, List<EventProcessingStatus3Choice>> mmEventProcessingStatus = new MMMessageBuildingBlock<CorporateActionEventProcessingStatusAdviceV05, List<EventProcessingStatus3Choice>>() {
		{
			xmlTag = "EvtPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventProcessingStatus";
			definition = "Information about the status of a corporate action.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventProcessingStatusAdviceV06.mmEventProcessingStatus);
			previousVersion_lazy = () -> CorporateActionEventProcessingStatusAdviceV04.mmEventProcessingStatus;
			minOccurs = 1;
			complexType_lazy = () -> EventProcessingStatus3Choice.mmObject();
		}

		@Override
		public List<EventProcessingStatus3Choice> getValue(CorporateActionEventProcessingStatusAdviceV05 obj) {
			return obj.getEventProcessingStatus();
		}

		@Override
		public void setValue(CorporateActionEventProcessingStatusAdviceV05 obj, List<EventProcessingStatus3Choice> value) {
			obj.setEventProcessingStatus(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative10 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative10
	 * CorporateActionNarrative10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06#mmAdditionalInformation
	 * CorporateActionEventProcessingStatusAdviceV06.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04#mmAdditionalInformation
	 * CorporateActionEventProcessingStatusAdviceV04.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionEventProcessingStatusAdviceV05, Optional<CorporateActionNarrative10>> mmAdditionalInformation = new MMMessageBuildingBlock<CorporateActionEventProcessingStatusAdviceV05, Optional<CorporateActionNarrative10>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventProcessingStatusAdviceV06.mmAdditionalInformation);
			previousVersion_lazy = () -> CorporateActionEventProcessingStatusAdviceV04.mmAdditionalInformation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative10.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative10> getValue(CorporateActionEventProcessingStatusAdviceV05 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionEventProcessingStatusAdviceV05 obj, Optional<CorporateActionNarrative10> value) {
			obj.setAdditionalInformation(value.orElse(null));
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06#mmSupplementaryData
	 * CorporateActionEventProcessingStatusAdviceV06.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV04#mmSupplementaryData
	 * CorporateActionEventProcessingStatusAdviceV04.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionEventProcessingStatusAdviceV05, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CorporateActionEventProcessingStatusAdviceV05, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventProcessingStatusAdviceV06.mmSupplementaryData);
			previousVersion_lazy = () -> CorporateActionEventProcessingStatusAdviceV04.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionEventProcessingStatusAdviceV05 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionEventProcessingStatusAdviceV05 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventProcessingStatusAdviceV05";
				definition = "Scope\r\nAn account servicer sends the CorporateActionEventProcessingStatusAdvice message to an account owner or its designated agent to report processing status of a corporate action event.\r\r\nThe account servicer uses this message to provide a reason as to why a corporate action event has not been completed by the announced payment dates.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate), \r\nusing the relevant elements in the business application header (BAH).";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionEventProcessingStatusAdviceV06.mmObject());
				previousVersion_lazy = () -> CorporateActionEventProcessingStatusAdviceV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(CorporateActionsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnEvtPrcgStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05.mmNotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05.mmOtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05.mmEventProcessingStatus, com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "032";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionEventProcessingStatusAdviceV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DocumentIdentification9> getNotificationIdentification() {
		return notificationIdentification == null ? Optional.empty() : Optional.of(notificationIdentification);
	}

	public CorporateActionEventProcessingStatusAdviceV05 setNotificationIdentification(DocumentIdentification9 notificationIdentification) {
		this.notificationIdentification = notificationIdentification;
		return this;
	}

	public List<DocumentIdentification33> getOtherDocumentIdentification() {
		return otherDocumentIdentification == null ? otherDocumentIdentification = new ArrayList<>() : otherDocumentIdentification;
	}

	public CorporateActionEventProcessingStatusAdviceV05 setOtherDocumentIdentification(List<DocumentIdentification33> otherDocumentIdentification) {
		this.otherDocumentIdentification = Objects.requireNonNull(otherDocumentIdentification);
		return this;
	}

	public CorporateActionGeneralInformation91 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionEventProcessingStatusAdviceV05 setCorporateActionGeneralInformation(CorporateActionGeneralInformation91 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public List<EventProcessingStatus3Choice> getEventProcessingStatus() {
		return eventProcessingStatus == null ? eventProcessingStatus = new ArrayList<>() : eventProcessingStatus;
	}

	public CorporateActionEventProcessingStatusAdviceV05 setEventProcessingStatus(List<EventProcessingStatus3Choice> eventProcessingStatus) {
		this.eventProcessingStatus = Objects.requireNonNull(eventProcessingStatus);
		return this;
	}

	public Optional<CorporateActionNarrative10> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionEventProcessingStatusAdviceV05 setAdditionalInformation(CorporateActionNarrative10 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionEventProcessingStatusAdviceV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.032.001.05")
	static public class Document {
		@XmlElement(name = "CorpActnEvtPrcgStsAdvc", required = true)
		public CorporateActionEventProcessingStatusAdviceV05 messageBody;
	}
}