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
import com.tools20022.repository.choice.DocumentNumber1Choice;
import com.tools20022.repository.choice.PartyIdentification36Choice;
import com.tools20022.repository.choice.ProcessingPosition2Choice;
import com.tools20022.repository.choice.References13Choice;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesTradeIdentification;
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
 * Information related to a linked transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Linkages10#mmProcessingPosition
 * Linkages10.mmProcessingPosition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages10#mmMessageNumber
 * Linkages10.mmMessageNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages10#mmReference
 * Linkages10.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages10#mmReferenceOwner
 * Linkages10.mmReferenceOwner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Linkages10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to a linked transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages16 Linkages16}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Linkages10", propOrder = {"processingPosition", "messageNumber", "reference", "referenceOwner"})
public class Linkages10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrcgPos")
	protected ProcessingPosition2Choice processingPosition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition2Choice
	 * ProcessingPosition2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages10
	 * Linkages10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgPos"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the transaction is to be executed relative to a linked transaction."
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
	public static final MMMessageAssociationEnd<Linkages10, Optional<ProcessingPosition2Choice>> mmProcessingPosition = new MMMessageAssociationEnd<Linkages10, Optional<ProcessingPosition2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Linkages10.mmObject();
			isDerived = false;
			xmlTag = "PrcgPos";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LINK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingPosition";
			definition = "When the transaction is to be executed relative to a linked transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingPosition2Choice.mmObject();
		}

		@Override
		public Optional<ProcessingPosition2Choice> getValue(Linkages10 obj) {
			return obj.getProcessingPosition();
		}

		@Override
		public void setValue(Linkages10 obj, Optional<ProcessingPosition2Choice> value) {
			obj.setProcessingPosition(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgNb")
	protected DocumentNumber1Choice messageNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber1Choice
	 * DocumentNumber1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages10
	 * Linkages10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message type number/message identifier of the message referenced in the linkage sequence."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::LINK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Linkages10, Optional<DocumentNumber1Choice>> mmMessageNumber = new MMMessageAssociationEnd<Linkages10, Optional<DocumentNumber1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Linkages10.mmObject();
			isDerived = false;
			xmlTag = "MsgNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::LINK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageNumber";
			definition = "Message type number/message identifier of the message referenced in the linkage sequence.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentNumber1Choice.mmObject();
		}

		@Override
		public Optional<DocumentNumber1Choice> getValue(Linkages10 obj) {
			return obj.getMessageNumber();
		}

		@Override
		public void setValue(Linkages10 obj, Optional<DocumentNumber1Choice> value) {
			obj.setMessageNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "Ref", required = true)
	protected References13Choice reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.References13Choice
	 * References13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages10
	 * Linkages10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to the linked transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Linkages10, References13Choice> mmReference = new MMMessageAssociationEnd<Linkages10, References13Choice>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Linkages10.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference to the linked transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> References13Choice.mmObject();
		}

		@Override
		public References13Choice getValue(Linkages10 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(Linkages10 obj, References13Choice value) {
			obj.setReference(value);
		}
	};
	@XmlElement(name = "RefOwnr")
	protected PartyIdentification36Choice referenceOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification36Choice
	 * PartyIdentification36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages10
	 * Linkages10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that generates the reference."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Linkages10, Optional<PartyIdentification36Choice>> mmReferenceOwner = new MMMessageAssociationEnd<Linkages10, Optional<PartyIdentification36Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Linkages10.mmObject();
			isDerived = false;
			xmlTag = "RefOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceOwner";
			definition = "Party that generates the reference.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification36Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification36Choice> getValue(Linkages10 obj) {
			return obj.getReferenceOwner();
		}

		@Override
		public void setValue(Linkages10 obj, Optional<PartyIdentification36Choice> value) {
			obj.setReferenceOwner(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Linkages10.mmProcessingPosition, com.tools20022.repository.msg.Linkages10.mmMessageNumber, com.tools20022.repository.msg.Linkages10.mmReference,
						com.tools20022.repository.msg.Linkages10.mmReferenceOwner);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Linkages10";
				definition = "Information related to a linked transaction.";
				nextVersions_lazy = () -> Arrays.asList(Linkages16.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ProcessingPosition2Choice> getProcessingPosition() {
		return processingPosition == null ? Optional.empty() : Optional.of(processingPosition);
	}

	public Linkages10 setProcessingPosition(ProcessingPosition2Choice processingPosition) {
		this.processingPosition = processingPosition;
		return this;
	}

	public Optional<DocumentNumber1Choice> getMessageNumber() {
		return messageNumber == null ? Optional.empty() : Optional.of(messageNumber);
	}

	public Linkages10 setMessageNumber(DocumentNumber1Choice messageNumber) {
		this.messageNumber = messageNumber;
		return this;
	}

	public References13Choice getReference() {
		return reference;
	}

	public Linkages10 setReference(References13Choice reference) {
		this.reference = Objects.requireNonNull(reference);
		return this;
	}

	public Optional<PartyIdentification36Choice> getReferenceOwner() {
		return referenceOwner == null ? Optional.empty() : Optional.of(referenceOwner);
	}

	public Linkages10 setReferenceOwner(PartyIdentification36Choice referenceOwner) {
		this.referenceOwner = referenceOwner;
		return this;
	}
}