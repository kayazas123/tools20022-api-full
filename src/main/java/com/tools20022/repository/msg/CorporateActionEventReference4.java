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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.choice.CorporateActionEventReference4Choice;
import com.tools20022.repository.choice.ProcessingPosition10Choice;
import com.tools20022.repository.entity.CorporateActionEventRegistration;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a linked corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference4#mmEventIdentification
 * CorporateActionEventReference4.mmEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference4#mmLinkageType
 * CorporateActionEventReference4.mmLinkageType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
 * CorporateActionEventRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06#mmEventsLinkage
 * CorporateActionNotification002V06.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V07#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdvice002V07.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V07#mmEventsLinkage
 * CorporateActionMovementReversalAdvice002V07.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V07#mmEventsLinkage
 * CorporateActionMovementConfirmation002V07.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstruction002V06#mmEventsLinkage
 * CorporateActionInstruction002V06.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstruction002V08#mmEventsLinkage
 * CorporateActionInstruction002V08.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V09#mmEventsLinkage
 * CorporateActionMovementConfirmation002V09.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V09#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdvice002V09.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V09#mmEventsLinkage
 * CorporateActionMovementReversalAdvice002V09.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmEventsLinkage
 * CorporateActionNotification002V08.mmEventsLinkage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventReference4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a linked corporate action event."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionEventReference4", propOrder = {"eventIdentification", "linkageType"})
public class CorporateActionEventReference4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "EvtId", required = true)
	protected CorporateActionEventReference4Choice eventIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference4Choice
	 * CorporateActionEventReference4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
	 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference4
	 * CorporateActionEventReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the linked corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventReference4, CorporateActionEventReference4Choice> mmEventIdentification = new MMMessageAssociationEnd<CorporateActionEventReference4, CorporateActionEventReference4Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventReference4.mmObject();
			isDerived = false;
			xmlTag = "EvtId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventIdentification";
			definition = "Identification of the linked corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionEventReference4Choice.mmObject();
		}

		@Override
		public CorporateActionEventReference4Choice getValue(CorporateActionEventReference4 obj) {
			return obj.getEventIdentification();
		}

		@Override
		public void setValue(CorporateActionEventReference4 obj, CorporateActionEventReference4Choice value) {
			obj.setEventIdentification(value);
		}
	};
	@XmlElement(name = "LkgTp")
	protected ProcessingPosition10Choice linkageType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition10Choice
	 * ProcessingPosition10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference4
	 * CorporateActionEventReference4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkgTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies when this corporate action event is to be processed relative to a linked corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LINK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionEventReference4, Optional<ProcessingPosition10Choice>> mmLinkageType = new MMMessageAssociationEnd<CorporateActionEventReference4, Optional<ProcessingPosition10Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionEventReference4.mmObject();
			isDerived = false;
			xmlTag = "LkgTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LINK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageType";
			definition = "Specifies when this corporate action event is to be processed relative to a linked corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingPosition10Choice.mmObject();
		}

		@Override
		public Optional<ProcessingPosition10Choice> getValue(CorporateActionEventReference4 obj) {
			return obj.getLinkageType();
		}

		@Override
		public void setValue(CorporateActionEventReference4 obj, Optional<ProcessingPosition10Choice> value) {
			obj.setLinkageType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionEventReference4.mmEventIdentification, com.tools20022.repository.msg.CorporateActionEventReference4.mmLinkageType);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotification002V06.mmEventsLinkage, CorporateActionMovementPreliminaryAdvice002V07.mmEventsLinkage, CorporateActionMovementReversalAdvice002V07.mmEventsLinkage,
						CorporateActionMovementConfirmation002V07.mmEventsLinkage, CorporateActionInstruction002V06.mmEventsLinkage, CorporateActionInstruction002V08.mmEventsLinkage,
						CorporateActionMovementConfirmation002V09.mmEventsLinkage, CorporateActionMovementPreliminaryAdvice002V09.mmEventsLinkage, CorporateActionMovementReversalAdvice002V09.mmEventsLinkage,
						CorporateActionNotification002V08.mmEventsLinkage);
				trace_lazy = () -> CorporateActionEventRegistration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventReference4";
				definition = "Identification of a linked corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionEventReference4Choice getEventIdentification() {
		return eventIdentification;
	}

	public CorporateActionEventReference4 setEventIdentification(CorporateActionEventReference4Choice eventIdentification) {
		this.eventIdentification = Objects.requireNonNull(eventIdentification);
		return this;
	}

	public Optional<ProcessingPosition10Choice> getLinkageType() {
		return linkageType == null ? Optional.empty() : Optional.of(linkageType);
	}

	public CorporateActionEventReference4 setLinkageType(ProcessingPosition10Choice linkageType) {
		this.linkageType = linkageType;
		return this;
	}
}