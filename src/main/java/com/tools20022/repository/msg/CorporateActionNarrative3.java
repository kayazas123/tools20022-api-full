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
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.ElectronicAddress;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.UpdatedAdditionalInformation3;
import com.tools20022.repository.msg.UpdatedURLlnformation;
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
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative3#mmOfferor
 * CorporateActionNarrative3.mmOfferor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative3#mmNewCompanyName
 * CorporateActionNarrative3.mmNewCompanyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative3#mmURLAddress
 * CorporateActionNarrative3.mmURLAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNarrative3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the taxation conditions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forCorporateActionNarrative3
 * ConstraintAdditionalInforrmationRule.forCorporateActionNarrative3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNarrative24
 * CorporateActionNarrative24}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNarrative3", propOrder = {"offeror", "newCompanyName", "uRLAddress"})
public class CorporateActionNarrative3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Offerr")
	protected UpdatedAdditionalInformation3 offeror;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation3
	 * UpdatedAdditionalInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative3
	 * CorporateActionNarrative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Offerr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offeror"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the entity making the offer and is different from the issuing company."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E:OFFO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative3, Optional<UpdatedAdditionalInformation3>> mmOfferor = new MMMessageAssociationEnd<CorporateActionNarrative3, Optional<UpdatedAdditionalInformation3>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative3.mmObject();
			isDerived = false;
			xmlTag = "Offerr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E:OFFO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offeror";
			definition = "Provides the entity making the offer and is different from the issuing company.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation3.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation3> getValue(CorporateActionNarrative3 obj) {
			return obj.getOfferor();
		}

		@Override
		public void setValue(CorporateActionNarrative3 obj, Optional<UpdatedAdditionalInformation3> value) {
			obj.setOfferor(value.orElse(null));
		}
	};
	@XmlElement(name = "NewCpnyNm")
	protected UpdatedAdditionalInformation3 newCompanyName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation3
	 * UpdatedAdditionalInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative3
	 * CorporateActionNarrative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewCpnyNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewCompanyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the new name of a company following a name change."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E:NAME</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative3, Optional<UpdatedAdditionalInformation3>> mmNewCompanyName = new MMMessageAssociationEnd<CorporateActionNarrative3, Optional<UpdatedAdditionalInformation3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative3.mmObject();
			isDerived = false;
			xmlTag = "NewCpnyNm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E:NAME"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewCompanyName";
			definition = "Provides the new name of a company following a name change.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedAdditionalInformation3.mmObject();
		}

		@Override
		public Optional<UpdatedAdditionalInformation3> getValue(CorporateActionNarrative3 obj) {
			return obj.getNewCompanyName();
		}

		@Override
		public void setValue(CorporateActionNarrative3 obj, Optional<UpdatedAdditionalInformation3> value) {
			obj.setNewCompanyName(value.orElse(null));
		}
	};
	@XmlElement(name = "URLAdr")
	protected UpdatedURLlnformation uRLAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UpdatedURLlnformation
	 * UpdatedURLlnformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmURLAddress
	 * ElectronicAddress.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative3
	 * CorporateActionNarrative3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "URLAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "URLAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the web address published for the event, that is, the address for the Universal Resource Locator (URL), for example, used over the www (HTTP) service."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::WEBB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNarrative3, Optional<UpdatedURLlnformation>> mmURLAddress = new MMMessageAssociationEnd<CorporateActionNarrative3, Optional<UpdatedURLlnformation>>() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmURLAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNarrative3.mmObject();
			isDerived = false;
			xmlTag = "URLAdr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::WEBB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "URLAddress";
			definition = "Provides the web address published for the event, that is, the address for the Universal Resource Locator (URL), for example, used over the www (HTTP) service.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UpdatedURLlnformation.mmObject();
		}

		@Override
		public Optional<UpdatedURLlnformation> getValue(CorporateActionNarrative3 obj) {
			return obj.getURLAddress();
		}

		@Override
		public void setValue(CorporateActionNarrative3 obj, Optional<UpdatedURLlnformation> value) {
			obj.setURLAddress(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative3.mmOfferor, com.tools20022.repository.msg.CorporateActionNarrative3.mmNewCompanyName,
						com.tools20022.repository.msg.CorporateActionNarrative3.mmURLAddress);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forCorporateActionNarrative3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative3";
				definition = "Provides additional information such as the taxation conditions.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionNarrative24.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<UpdatedAdditionalInformation3> getOfferor() {
		return offeror == null ? Optional.empty() : Optional.of(offeror);
	}

	public CorporateActionNarrative3 setOfferor(UpdatedAdditionalInformation3 offeror) {
		this.offeror = offeror;
		return this;
	}

	public Optional<UpdatedAdditionalInformation3> getNewCompanyName() {
		return newCompanyName == null ? Optional.empty() : Optional.of(newCompanyName);
	}

	public CorporateActionNarrative3 setNewCompanyName(UpdatedAdditionalInformation3 newCompanyName) {
		this.newCompanyName = newCompanyName;
		return this;
	}

	public Optional<UpdatedURLlnformation> getURLAddress() {
		return uRLAddress == null ? Optional.empty() : Optional.of(uRLAddress);
	}

	public CorporateActionNarrative3 setURLAddress(UpdatedURLlnformation uRLAddress) {
		this.uRLAddress = uRLAddress;
		return this;
	}
}