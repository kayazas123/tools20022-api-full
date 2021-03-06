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
import com.tools20022.repository.choice.GeneralBusinessOrError4Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SystemBusinessInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports either on the business information or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport4#mmBusinessInformationReference
 * GeneralBusinessReport4.mmBusinessInformationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport4#mmGeneralBusinessOrError
 * GeneralBusinessReport4.mmGeneralBusinessOrError}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
 * SystemBusinessInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GeneralBusinessReport4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reports either on the business information or on a business error."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralBusinessReport5
 * GeneralBusinessReport5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport3
 * GeneralBusinessReport3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GeneralBusinessReport4", propOrder = {"businessInformationReference", "generalBusinessOrError"})
public class GeneralBusinessReport4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BizInfRef", required = true)
	protected Max35Text businessInformationReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmIdentification
	 * SystemBusinessInformation.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport4
	 * GeneralBusinessReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizInfRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessInformationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a general business information system, as assigned by the system transaction administrator."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport5#mmBusinessInformationReference
	 * GeneralBusinessReport5.mmBusinessInformationReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport3#mmBusinessInformationReference
	 * GeneralBusinessReport3.mmBusinessInformationReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeneralBusinessReport4, Max35Text> mmBusinessInformationReference = new MMMessageAttribute<GeneralBusinessReport4, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SystemBusinessInformation.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralBusinessReport4.mmObject();
			isDerived = false;
			xmlTag = "BizInfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessInformationReference";
			definition = "Unique and unambiguous identification of a general business information system, as assigned by the system transaction administrator.";
			nextVersions_lazy = () -> Arrays.asList(GeneralBusinessReport5.mmBusinessInformationReference);
			previousVersion_lazy = () -> GeneralBusinessReport3.mmBusinessInformationReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(GeneralBusinessReport4 obj) {
			return obj.getBusinessInformationReference();
		}

		@Override
		public void setValue(GeneralBusinessReport4 obj, Max35Text value) {
			obj.setBusinessInformationReference(value);
		}
	};
	@XmlElement(name = "GnlBizOrErr", required = true)
	protected GeneralBusinessOrError4Choice generalBusinessOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GeneralBusinessOrError4Choice
	 * GeneralBusinessOrError4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport4
	 * GeneralBusinessReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GnlBizOrErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralBusinessOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested business information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport5#mmGeneralBusinessOrError
	 * GeneralBusinessReport5.mmGeneralBusinessOrError}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport3#mmGeneralBusinessOrError
	 * GeneralBusinessReport3.mmGeneralBusinessOrError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GeneralBusinessReport4, GeneralBusinessOrError4Choice> mmGeneralBusinessOrError = new MMMessageAssociationEnd<GeneralBusinessReport4, GeneralBusinessOrError4Choice>() {
		{
			businessComponentTrace_lazy = () -> SystemBusinessInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralBusinessReport4.mmObject();
			isDerived = false;
			xmlTag = "GnlBizOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralBusinessOrError";
			definition = "Requested business information.";
			nextVersions_lazy = () -> Arrays.asList(GeneralBusinessReport5.mmGeneralBusinessOrError);
			previousVersion_lazy = () -> GeneralBusinessReport3.mmGeneralBusinessOrError;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GeneralBusinessOrError4Choice.mmObject();
		}

		@Override
		public GeneralBusinessOrError4Choice getValue(GeneralBusinessReport4 obj) {
			return obj.getGeneralBusinessOrError();
		}

		@Override
		public void setValue(GeneralBusinessReport4 obj, GeneralBusinessOrError4Choice value) {
			obj.setGeneralBusinessOrError(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessReport4.mmBusinessInformationReference, com.tools20022.repository.msg.GeneralBusinessReport4.mmGeneralBusinessOrError);
				trace_lazy = () -> SystemBusinessInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GeneralBusinessReport4";
				definition = "Reports either on the business information or on a business error.";
				nextVersions_lazy = () -> Arrays.asList(GeneralBusinessReport5.mmObject());
				previousVersion_lazy = () -> GeneralBusinessReport3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getBusinessInformationReference() {
		return businessInformationReference;
	}

	public GeneralBusinessReport4 setBusinessInformationReference(Max35Text businessInformationReference) {
		this.businessInformationReference = Objects.requireNonNull(businessInformationReference);
		return this;
	}

	public GeneralBusinessOrError4Choice getGeneralBusinessOrError() {
		return generalBusinessOrError;
	}

	public GeneralBusinessReport4 setGeneralBusinessOrError(GeneralBusinessOrError4Choice generalBusinessOrError) {
		this.generalBusinessOrError = Objects.requireNonNull(generalBusinessOrError);
		return this;
	}
}