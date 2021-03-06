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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.entity.CorporateActionEventRegistration;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a corporate action identification or a corporate action
 * official identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference4Choice#mmLinkedOfficialCorporateActionEventIdentification
 * CorporateActionEventReference4Choice.
 * mmLinkedOfficialCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference4Choice#mmLinkedCorporateActionIdentification
 * CorporateActionEventReference4Choice.mmLinkedCorporateActionIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
 * CorporateActionEventRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventReference4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a corporate action identification or a corporate action official identification."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionEventReference4Choice", propOrder = {"linkedOfficialCorporateActionEventIdentification", "linkedCorporateActionIdentification"})
public class CorporateActionEventReference4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LkdOffclCorpActnEvtId", required = true)
	protected RestrictedFINXMax16Text linkedOfficialCorporateActionEventIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmOfficialCorporateActionEventIdentification
	 * CorporateActionEventRegistration.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference4Choice
	 * CorporateActionEventReference4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdOffclCorpActnEvtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedOfficialCorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Official and unique reference assigned by the official central body/ entity within each market at the beginning of a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::CORP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionEventReference4Choice, RestrictedFINXMax16Text> mmLinkedOfficialCorporateActionEventIdentification = new MMMessageAttribute<CorporateActionEventReference4Choice, RestrictedFINXMax16Text>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmOfficialCorporateActionEventIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionEventReference4Choice.mmObject();
			isDerived = false;
			xmlTag = "LkdOffclCorpActnEvtId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::CORP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedOfficialCorporateActionEventIdentification";
			definition = "Official and unique reference assigned by the official central body/ entity within each market at the beginning of a corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public RestrictedFINXMax16Text getValue(CorporateActionEventReference4Choice obj) {
			return obj.getLinkedOfficialCorporateActionEventIdentification();
		}

		@Override
		public void setValue(CorporateActionEventReference4Choice obj, RestrictedFINXMax16Text value) {
			obj.setLinkedOfficialCorporateActionEventIdentification(value);
		}
	};
	@XmlElement(name = "LkdCorpActnId", required = true)
	protected RestrictedFINXMax16Text linkedCorporateActionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
	 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference4Choice
	 * CorporateActionEventReference4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdCorpActnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedCorporateActionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by the account servicer to unambiguously identify a related corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::COAF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionEventReference4Choice, RestrictedFINXMax16Text> mmLinkedCorporateActionIdentification = new MMMessageAttribute<CorporateActionEventReference4Choice, RestrictedFINXMax16Text>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionEventReference4Choice.mmObject();
			isDerived = false;
			xmlTag = "LkdCorpActnId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::COAF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedCorporateActionIdentification";
			definition = "Reference assigned by the account servicer to unambiguously identify a related corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public RestrictedFINXMax16Text getValue(CorporateActionEventReference4Choice obj) {
			return obj.getLinkedCorporateActionIdentification();
		}

		@Override
		public void setValue(CorporateActionEventReference4Choice obj, RestrictedFINXMax16Text value) {
			obj.setLinkedCorporateActionIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionEventReference4Choice.mmLinkedOfficialCorporateActionEventIdentification,
						com.tools20022.repository.choice.CorporateActionEventReference4Choice.mmLinkedCorporateActionIdentification);
				trace_lazy = () -> CorporateActionEventRegistration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventReference4Choice";
				definition = "Choice between a corporate action identification or a corporate action official identification.";
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINXMax16Text getLinkedOfficialCorporateActionEventIdentification() {
		return linkedOfficialCorporateActionEventIdentification;
	}

	public CorporateActionEventReference4Choice setLinkedOfficialCorporateActionEventIdentification(RestrictedFINXMax16Text linkedOfficialCorporateActionEventIdentification) {
		this.linkedOfficialCorporateActionEventIdentification = Objects.requireNonNull(linkedOfficialCorporateActionEventIdentification);
		return this;
	}

	public RestrictedFINXMax16Text getLinkedCorporateActionIdentification() {
		return linkedCorporateActionIdentification;
	}

	public CorporateActionEventReference4Choice setLinkedCorporateActionIdentification(RestrictedFINXMax16Text linkedCorporateActionIdentification) {
		this.linkedCorporateActionIdentification = Objects.requireNonNull(linkedCorporateActionIdentification);
		return this;
	}
}