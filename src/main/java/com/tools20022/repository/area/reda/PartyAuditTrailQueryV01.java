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

package com.tools20022.repository.area.reda;

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ReferenceDataLatestVersion;
import com.tools20022.repository.choice.PartyIdentification71Choice;
import com.tools20022.repository.msg.DocumentIdentification50;
import com.tools20022.repository.msg.PartyAuditTrailSearchCriteria2;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._T2S_Party_Reference_Data_ForRegistration;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The PartyAuditTrailQuery message is sent by an instructing party to the
 * executing party to query for the party audit trail recorded in the system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code reda.042.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ReferenceDataLatestVersion
 * ReferenceDataLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyAuditTrailQueryV01#mmMessageIdentification
 * PartyAuditTrailQueryV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyAuditTrailQueryV01#mmMessageOriginator
 * PartyAuditTrailQueryV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyAuditTrailQueryV01#mmMessageRecipient
 * PartyAuditTrailQueryV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyAuditTrailQueryV01#mmSearchCriteria
 * PartyAuditTrailQueryV01.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PartyAuditTrailQueryV01#mmSupplementaryData
 * PartyAuditTrailQueryV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset._T2S_Party_Reference_Data_ForRegistration
 * _T2S_Party_Reference_Data_ForRegistration}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PtyAudtTrlQry"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyAuditTrailQueryV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The PartyAuditTrailQuery message is sent by an instructing party to the executing party to query for the party audit trail recorded in the system."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=prefix, prefix=DRAFT4</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyAuditTrailQueryV01", propOrder = {"messageIdentification", "messageOriginator", "messageRecipient", "searchCriteria", "supplementaryData"})
public class PartyAuditTrailQueryV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId")
	protected DocumentIdentification50 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification50
	 * DocumentIdentification50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference elements, as assigned by the instructing party, to unambiguously identify the query message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PartyAuditTrailQueryV01, Optional<DocumentIdentification50>> mmMessageIdentification = new MMMessageBuildingBlock<PartyAuditTrailQueryV01, Optional<DocumentIdentification50>>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference elements, as assigned by the instructing party, to unambiguously identify the query message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification50.mmObject();
		}

		@Override
		public Optional<DocumentIdentification50> getValue(PartyAuditTrailQueryV01 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(PartyAuditTrailQueryV01 obj, Optional<DocumentIdentification50> value) {
			obj.setMessageIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected PartyIdentification71Choice messageOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgOrgtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that originated the query message, if other than the sender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PartyAuditTrailQueryV01, Optional<PartyIdentification71Choice>> mmMessageOriginator = new MMMessageBuildingBlock<PartyAuditTrailQueryV01, Optional<PartyIdentification71Choice>>() {
		{
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the query message, if other than the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(PartyAuditTrailQueryV01 obj) {
			return obj.getMessageOriginator();
		}

		@Override
		public void setValue(PartyAuditTrailQueryV01 obj, Optional<PartyIdentification71Choice> value) {
			obj.setMessageOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgRcpt")
	protected PartyIdentification71Choice messageRecipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRcpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageRecipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is the final destination of the query message, if other than the receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PartyAuditTrailQueryV01, Optional<PartyIdentification71Choice>> mmMessageRecipient = new MMMessageBuildingBlock<PartyAuditTrailQueryV01, Optional<PartyIdentification71Choice>>() {
		{
			xmlTag = "MsgRcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageRecipient";
			definition = "Party that is the final destination of the query message, if other than the receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification71Choice> getValue(PartyAuditTrailQueryV01 obj) {
			return obj.getMessageRecipient();
		}

		@Override
		public void setValue(PartyAuditTrailQueryV01 obj, Optional<PartyIdentification71Choice> value) {
			obj.setMessageRecipient(value.orElse(null));
		}
	};
	@XmlElement(name = "SchCrit", required = true)
	protected PartyAuditTrailSearchCriteria2 searchCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailSearchCriteria2
	 * PartyAuditTrailSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria to be used to query the party audit trail by the executing system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PartyAuditTrailQueryV01, PartyAuditTrailSearchCriteria2> mmSearchCriteria = new MMMessageBuildingBlock<PartyAuditTrailQueryV01, PartyAuditTrailSearchCriteria2>() {
		{
			xmlTag = "SchCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchCriteria";
			definition = "Defines the criteria to be used to query the party audit trail by the executing system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyAuditTrailSearchCriteria2.mmObject();
		}

		@Override
		public PartyAuditTrailSearchCriteria2 getValue(PartyAuditTrailQueryV01 obj) {
			return obj.getSearchCriteria();
		}

		@Override
		public void setValue(PartyAuditTrailQueryV01 obj, PartyAuditTrailSearchCriteria2 value) {
			obj.setSearchCriteria(value);
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
	public static final MMMessageBuildingBlock<PartyAuditTrailQueryV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<PartyAuditTrailQueryV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(PartyAuditTrailQueryV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(PartyAuditTrailQueryV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "prefix", new String[]{"prefix", "DRAFT4"}));
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PartyAuditTrailQueryV01";
				definition = "The PartyAuditTrailQuery message is sent by an instructing party to the executing party to query for the party audit trail recorded in the system.";
				messageSet_lazy = () -> Arrays.asList(_T2S_Party_Reference_Data_ForRegistration.mmObject());
				rootElement = "Document";
				xmlTag = "PtyAudtTrlQry";
				businessArea_lazy = () -> ReferenceDataLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.reda.PartyAuditTrailQueryV01.mmMessageIdentification, com.tools20022.repository.area.reda.PartyAuditTrailQueryV01.mmMessageOriginator,
						com.tools20022.repository.area.reda.PartyAuditTrailQueryV01.mmMessageRecipient, com.tools20022.repository.area.reda.PartyAuditTrailQueryV01.mmSearchCriteria,
						com.tools20022.repository.area.reda.PartyAuditTrailQueryV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "reda";
						messageFunctionality = "042";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PartyAuditTrailQueryV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DocumentIdentification50> getMessageIdentification() {
		return messageIdentification == null ? Optional.empty() : Optional.of(messageIdentification);
	}

	public PartyAuditTrailQueryV01 setMessageIdentification(DocumentIdentification50 messageIdentification) {
		this.messageIdentification = messageIdentification;
		return this;
	}

	public Optional<PartyIdentification71Choice> getMessageOriginator() {
		return messageOriginator == null ? Optional.empty() : Optional.of(messageOriginator);
	}

	public PartyAuditTrailQueryV01 setMessageOriginator(PartyIdentification71Choice messageOriginator) {
		this.messageOriginator = messageOriginator;
		return this;
	}

	public Optional<PartyIdentification71Choice> getMessageRecipient() {
		return messageRecipient == null ? Optional.empty() : Optional.of(messageRecipient);
	}

	public PartyAuditTrailQueryV01 setMessageRecipient(PartyIdentification71Choice messageRecipient) {
		this.messageRecipient = messageRecipient;
		return this;
	}

	public PartyAuditTrailSearchCriteria2 getSearchCriteria() {
		return searchCriteria;
	}

	public PartyAuditTrailQueryV01 setSearchCriteria(PartyAuditTrailSearchCriteria2 searchCriteria) {
		this.searchCriteria = Objects.requireNonNull(searchCriteria);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public PartyAuditTrailQueryV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.042.001.01")
	static public class Document {
		@XmlElement(name = "PtyAudtTrlQry", required = true)
		public PartyAuditTrailQueryV01 messageBody;
	}
}