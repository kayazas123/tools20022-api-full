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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionNotification002V06;
import com.tools20022.repository.area.seev.CorporateActionNotification002V08;
import com.tools20022.repository.entity.BiddingConditions;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.UpdatedAdditionalInformation10;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information such as the taxation conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmAdditionalText
 * CorporateActionNarrative41.mmAdditionalText}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmNarrativeVersion
 * CorporateActionNarrative41.mmNarrativeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmInformationConditions
 * CorporateActionNarrative41.mmInformationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmInformationToComplyWith
 * CorporateActionNarrative41.mmInformationToComplyWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmTaxationConditions
 * CorporateActionNarrative41.mmTaxationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmDisclaimer
 * CorporateActionNarrative41.mmDisclaimer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmPartyContactNarrative
 * CorporateActionNarrative41.mmPartyContactNarrative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmRegistrationDetails
 * CorporateActionNarrative41.mmRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmBasketOrIndexInformation
 * CorporateActionNarrative41.mmBasketOrIndexInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmCertificationBreakdown
 * CorporateActionNarrative41.mmCertificationBreakdown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V06#mmAdditionalInformation
 * CorporateActionNotification002V06.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V08#mmAdditionalInformation
 * CorporateActionNotification002V08.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNarrative41"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the taxation conditions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionNarrative41
 * ConstraintAdditionalInformationRule.forCorporateActionNarrative41}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNarrative41", propOrder = {"additionalText", "narrativeVersion", "informationConditions", "informationToComplyWith", "taxationConditions", "disclaimer", "partyContactNarrative", "registrationDetails",
		"basketOrIndexInformation", "certificationBreakdown"})
public class CorporateActionNarrative41 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlTxt")
	protected UpdatedAdditionalInformation10 additionalText;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation10
	 * UpdatedAdditionalInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41
	 * CorporateActionNarrative41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTxt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalText"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::ADTX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>> mmAdditionalText = new MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative41.mmObject();
			isDerived = false;
			xmlTag = "AddtlTxt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::ADTX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalText";
			definition = "Provides additional information or specifies in more detail the content of a message. This field may only be used when the information to be transmitted, cannot be coded.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation10.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation10> getValue(CorporateActionNarrative41 obj) {
			return obj.getAdditionalText();
		}

		@Override
		public void setValue(CorporateActionNarrative41 obj, Optional<UpdatedAdditionalInformation10> value) {
			obj.setAdditionalText(value.orElse(null));
		}
	};
	@XmlElement(name = "NrrtvVrsn")
	protected UpdatedAdditionalInformation10 narrativeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation10
	 * UpdatedAdditionalInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41
	 * CorporateActionNarrative41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NrrtvVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information that can be ignored for automated processing; - reiteration of information that has been included within structured fields, - or narrative information not needed for automatic processing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::TXNR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>> mmNarrativeVersion = new MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative41.mmObject();
			isDerived = false;
			xmlTag = "NrrtvVrsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::TXNR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeVersion";
			definition = "Provides information that can be ignored for automated processing; - reiteration of information that has been included within structured fields, - or narrative information not needed for automatic processing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation10.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation10> getValue(CorporateActionNarrative41 obj) {
			return obj.getNarrativeVersion();
		}

		@Override
		public void setValue(CorporateActionNarrative41 obj, Optional<UpdatedAdditionalInformation10> value) {
			obj.setNarrativeVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "InfConds")
	protected UpdatedAdditionalInformation10 informationConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation10
	 * UpdatedAdditionalInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmInformationConditions
	 * CorporateActionEvent.mmInformationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41
	 * CorporateActionNarrative41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfConds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides conditional information related to the event, for example, an offer is subject to 50 percent acceptance, the offeror allows the securities holder to set some conditions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::INCO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>> mmInformationConditions = new MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmInformationConditions;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative41.mmObject();
			isDerived = false;
			xmlTag = "InfConds";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::INCO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationConditions";
			definition = "Provides conditional information related to the event, for example, an offer is subject to 50 percent acceptance, the offeror allows the securities holder to set some conditions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation10.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation10> getValue(CorporateActionNarrative41 obj) {
			return obj.getInformationConditions();
		}

		@Override
		public void setValue(CorporateActionNarrative41 obj, Optional<UpdatedAdditionalInformation10> value) {
			obj.setInformationConditions(value.orElse(null));
		}
	};
	@XmlElement(name = "InfToCmplyWth")
	protected UpdatedAdditionalInformation10 informationToComplyWith;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation10
	 * UpdatedAdditionalInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmInformationToComplyWith
	 * BiddingConditions.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41
	 * CorporateActionNarrative41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfToCmplyWth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationToComplyWith"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or SIL (Sophisticated Investor Letter) to be provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::COMP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>> mmInformationToComplyWith = new MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmInformationToComplyWith;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative41.mmObject();
			isDerived = false;
			xmlTag = "InfToCmplyWth";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::COMP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, for example, not open to US/Canadian residents, Qualified Institutional Buyers (QIB) or SIL (Sophisticated Investor Letter) to be provided.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation10.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation10> getValue(CorporateActionNarrative41 obj) {
			return obj.getInformationToComplyWith();
		}

		@Override
		public void setValue(CorporateActionNarrative41 obj, Optional<UpdatedAdditionalInformation10> value) {
			obj.setInformationToComplyWith(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxtnConds")
	protected UpdatedAdditionalInformation10 taxationConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation10
	 * UpdatedAdditionalInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxationConditions
	 * Tax.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41
	 * CorporateActionNarrative41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxtnConds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides taxation conditions that cannot be included within the structured fields of this message and has not been mentioned in the Service Level Agreement (SLA)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::TAXE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>> mmTaxationConditions = new MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxationConditions;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative41.mmObject();
			isDerived = false;
			xmlTag = "TaxtnConds";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::TAXE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxationConditions";
			definition = "Provides taxation conditions that cannot be included within the structured fields of this message and has not been mentioned in the Service Level Agreement (SLA).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation10.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation10> getValue(CorporateActionNarrative41 obj) {
			return obj.getTaxationConditions();
		}

		@Override
		public void setValue(CorporateActionNarrative41 obj, Optional<UpdatedAdditionalInformation10> value) {
			obj.setTaxationConditions(value.orElse(null));
		}
	};
	@XmlElement(name = "Dsclmr")
	protected UpdatedAdditionalInformation10 disclaimer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation10
	 * UpdatedAdditionalInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41
	 * CorporateActionNarrative41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dsclmr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disclaimer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides a disclaimer relative to the information provided in the message. It may be ignored for automated processing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::DISC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>> mmDisclaimer = new MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative41.mmObject();
			isDerived = false;
			xmlTag = "Dsclmr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::DISC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclaimer";
			definition = "Provides a disclaimer relative to the information provided in the message. It may be ignored for automated processing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation10.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation10> getValue(CorporateActionNarrative41 obj) {
			return obj.getDisclaimer();
		}

		@Override
		public void setValue(CorporateActionNarrative41 obj, Optional<UpdatedAdditionalInformation10> value) {
			obj.setDisclaimer(value.orElse(null));
		}
	};
	@XmlElement(name = "PtyCtctNrrtv")
	protected UpdatedAdditionalInformation10 partyContactNarrative;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation10
	 * UpdatedAdditionalInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
	 * Role.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41
	 * CorporateActionNarrative41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyCtctNrrtv"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyContactNarrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::PACO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>> mmPartyContactNarrative = new MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>>() {
		{
			businessElementTrace_lazy = () -> Role.mmContactPersonRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative41.mmObject();
			isDerived = false;
			xmlTag = "PtyCtctNrrtv";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::PACO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyContactNarrative";
			definition = "Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation10.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation10> getValue(CorporateActionNarrative41 obj) {
			return obj.getPartyContactNarrative();
		}

		@Override
		public void setValue(CorporateActionNarrative41 obj, Optional<UpdatedAdditionalInformation10> value) {
			obj.setPartyContactNarrative(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnDtls")
	protected UpdatedAdditionalInformation10 registrationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation10
	 * UpdatedAdditionalInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRegistrationDetails
	 * CorporateActionEvent.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41
	 * CorporateActionNarrative41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information required for the registration."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::REGI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>> mmRegistrationDetails = new MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmRegistrationDetails;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative41.mmObject();
			isDerived = false;
			xmlTag = "RegnDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::REGI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation10.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation10> getValue(CorporateActionNarrative41 obj) {
			return obj.getRegistrationDetails();
		}

		@Override
		public void setValue(CorporateActionNarrative41 obj, Optional<UpdatedAdditionalInformation10> value) {
			obj.setRegistrationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "BsktOrIndxInf")
	protected UpdatedAdditionalInformation10 basketOrIndexInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation10
	 * UpdatedAdditionalInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBasketOrIndexInformation
	 * CorporateActionEvent.mmBasketOrIndexInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41
	 * CorporateActionNarrative41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsktOrIndxInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasketOrIndexInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information on the basket or index underlying a security, for example a warrant."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::BAIN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>> mmBasketOrIndexInformation = new MMMessageAssociationEnd<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmBasketOrIndexInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative41.mmObject();
			isDerived = false;
			xmlTag = "BsktOrIndxInf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::BAIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasketOrIndexInformation";
			definition = "Provides additional information on the basket or index underlying a security, for example a warrant.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation10.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation10> getValue(CorporateActionNarrative41 obj) {
			return obj.getBasketOrIndexInformation();
		}

		@Override
		public void setValue(CorporateActionNarrative41 obj, Optional<UpdatedAdditionalInformation10> value) {
			obj.setBasketOrIndexInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnBrkdwn")
	protected UpdatedAdditionalInformation10 certificationBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation10
	 * UpdatedAdditionalInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41
	 * CorporateActionNarrative41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnBrkdwn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the type of certification/breakdown required."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>> mmCertificationBreakdown = new MMMessageAttribute<CorporateActionNarrative41, Optional<UpdatedAdditionalInformation10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative41.mmObject();
			isDerived = false;
			xmlTag = "CertfctnBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationBreakdown";
			definition = "Provides additional information about the type of certification/breakdown required.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UpdatedAdditionalInformation10.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation10> getValue(CorporateActionNarrative41 obj) {
			return obj.getCertificationBreakdown();
		}

		@Override
		public void setValue(CorporateActionNarrative41 obj, Optional<UpdatedAdditionalInformation10> value) {
			obj.setCertificationBreakdown(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative41.mmAdditionalText, com.tools20022.repository.msg.CorporateActionNarrative41.mmNarrativeVersion,
						com.tools20022.repository.msg.CorporateActionNarrative41.mmInformationConditions, com.tools20022.repository.msg.CorporateActionNarrative41.mmInformationToComplyWith,
						com.tools20022.repository.msg.CorporateActionNarrative41.mmTaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative41.mmDisclaimer,
						com.tools20022.repository.msg.CorporateActionNarrative41.mmPartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative41.mmRegistrationDetails,
						com.tools20022.repository.msg.CorporateActionNarrative41.mmBasketOrIndexInformation, com.tools20022.repository.msg.CorporateActionNarrative41.mmCertificationBreakdown);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotification002V06.mmAdditionalInformation, CorporateActionNotification002V08.mmAdditionalInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionNarrative41);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative41";
				definition = "Provides additional information such as the taxation conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<UpdatedAdditionalInformation10> getAdditionalText() {
		return additionalText == null ? Optional.empty() : Optional.of(additionalText);
	}

	public CorporateActionNarrative41 setAdditionalText(UpdatedAdditionalInformation10 additionalText) {
		this.additionalText = additionalText;
		return this;
	}

	public Optional<UpdatedAdditionalInformation10> getNarrativeVersion() {
		return narrativeVersion == null ? Optional.empty() : Optional.of(narrativeVersion);
	}

	public CorporateActionNarrative41 setNarrativeVersion(UpdatedAdditionalInformation10 narrativeVersion) {
		this.narrativeVersion = narrativeVersion;
		return this;
	}

	public Optional<UpdatedAdditionalInformation10> getInformationConditions() {
		return informationConditions == null ? Optional.empty() : Optional.of(informationConditions);
	}

	public CorporateActionNarrative41 setInformationConditions(UpdatedAdditionalInformation10 informationConditions) {
		this.informationConditions = informationConditions;
		return this;
	}

	public Optional<UpdatedAdditionalInformation10> getInformationToComplyWith() {
		return informationToComplyWith == null ? Optional.empty() : Optional.of(informationToComplyWith);
	}

	public CorporateActionNarrative41 setInformationToComplyWith(UpdatedAdditionalInformation10 informationToComplyWith) {
		this.informationToComplyWith = informationToComplyWith;
		return this;
	}

	public Optional<UpdatedAdditionalInformation10> getTaxationConditions() {
		return taxationConditions == null ? Optional.empty() : Optional.of(taxationConditions);
	}

	public CorporateActionNarrative41 setTaxationConditions(UpdatedAdditionalInformation10 taxationConditions) {
		this.taxationConditions = taxationConditions;
		return this;
	}

	public Optional<UpdatedAdditionalInformation10> getDisclaimer() {
		return disclaimer == null ? Optional.empty() : Optional.of(disclaimer);
	}

	public CorporateActionNarrative41 setDisclaimer(UpdatedAdditionalInformation10 disclaimer) {
		this.disclaimer = disclaimer;
		return this;
	}

	public Optional<UpdatedAdditionalInformation10> getPartyContactNarrative() {
		return partyContactNarrative == null ? Optional.empty() : Optional.of(partyContactNarrative);
	}

	public CorporateActionNarrative41 setPartyContactNarrative(UpdatedAdditionalInformation10 partyContactNarrative) {
		this.partyContactNarrative = partyContactNarrative;
		return this;
	}

	public Optional<UpdatedAdditionalInformation10> getRegistrationDetails() {
		return registrationDetails == null ? Optional.empty() : Optional.of(registrationDetails);
	}

	public CorporateActionNarrative41 setRegistrationDetails(UpdatedAdditionalInformation10 registrationDetails) {
		this.registrationDetails = registrationDetails;
		return this;
	}

	public Optional<UpdatedAdditionalInformation10> getBasketOrIndexInformation() {
		return basketOrIndexInformation == null ? Optional.empty() : Optional.of(basketOrIndexInformation);
	}

	public CorporateActionNarrative41 setBasketOrIndexInformation(UpdatedAdditionalInformation10 basketOrIndexInformation) {
		this.basketOrIndexInformation = basketOrIndexInformation;
		return this;
	}

	public Optional<UpdatedAdditionalInformation10> getCertificationBreakdown() {
		return certificationBreakdown == null ? Optional.empty() : Optional.of(certificationBreakdown);
	}

	public CorporateActionNarrative41 setCertificationBreakdown(UpdatedAdditionalInformation10 certificationBreakdown) {
		this.certificationBreakdown = certificationBreakdown;
		return this;
	}
}