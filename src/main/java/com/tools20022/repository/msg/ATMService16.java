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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ATMServiceType3Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Service provided by the ATM inside the session.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMService16#mmServiceReference
 * ATMService16.mmServiceReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService16#mmATMServiceCode
 * ATMService16.mmATMServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService16#mmHostServiceCode
 * ATMService16.mmHostServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService16#mmServiceType
 * ATMService16.mmServiceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMService16#mmServiceVariantIdentification
 * ATMService16.mmServiceVariantIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMService16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Service provided by the ATM inside the session."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService18 ATMService18}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMService16", propOrder = {"serviceReference", "aTMServiceCode", "hostServiceCode", "serviceType", "serviceVariantIdentification"})
public class ATMService16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SvcRef")
	protected Max35Text serviceReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService16 ATMService16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the withdrawal service provided by the ATM inside the session."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMService18#mmIdentification
	 * ATMService18.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMService16, Optional<Max35Text>> mmServiceReference = new MMMessageAttribute<ATMService16, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMService16.mmObject();
			isDerived = false;
			xmlTag = "SvcRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceReference";
			definition = "Unique identification of the withdrawal service provided by the ATM inside the session.";
			nextVersions_lazy = () -> Arrays.asList(ATMService18.mmIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMService16 obj) {
			return obj.getServiceReference();
		}

		@Override
		public void setValue(ATMService16 obj, Optional<Max35Text> value) {
			obj.setServiceReference(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMSvcCd")
	protected Max35Text aTMServiceCode;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService16 ATMService16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMSvcCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMServiceCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Codification of the type of service for the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMService18#mmLabel
	 * ATMService18.mmLabel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMService16, Optional<Max35Text>> mmATMServiceCode = new MMMessageAttribute<ATMService16, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMService16.mmObject();
			isDerived = false;
			xmlTag = "ATMSvcCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMServiceCode";
			definition = "Codification of the type of service for the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMService18.mmLabel);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMService16 obj) {
			return obj.getATMServiceCode();
		}

		@Override
		public void setValue(ATMService16 obj, Optional<Max35Text> value) {
			obj.setATMServiceCode(value.orElse(null));
		}
	};
	@XmlElement(name = "HstSvcCd")
	protected Max35Text hostServiceCode;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService16 ATMService16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstSvcCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostServiceCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Codification of the type of service for the host."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMService16, Optional<Max35Text>> mmHostServiceCode = new MMMessageAttribute<ATMService16, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMService16.mmObject();
			isDerived = false;
			xmlTag = "HstSvcCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostServiceCode";
			definition = "Codification of the type of service for the host.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMService16 obj) {
			return obj.getHostServiceCode();
		}

		@Override
		public void setValue(ATMService16 obj, Optional<Max35Text> value) {
			obj.setHostServiceCode(value.orElse(null));
		}
	};
	@XmlElement(name = "SvcTp", required = true)
	protected ATMServiceType3Code serviceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code
	 * ATMServiceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService16 ATMService16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the type of withdrawal selected by the customer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMService16, ATMServiceType3Code> mmServiceType = new MMMessageAttribute<ATMService16, ATMServiceType3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMService16.mmObject();
			isDerived = false;
			xmlTag = "SvcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceType";
			definition = "Describes the type of withdrawal selected by the customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMServiceType3Code.mmObject();
		}

		@Override
		public ATMServiceType3Code getValue(ATMService16 obj) {
			return obj.getServiceType();
		}

		@Override
		public void setValue(ATMService16 obj, ATMServiceType3Code value) {
			obj.setServiceType(value);
		}
	};
	@XmlElement(name = "SvcVarntId")
	protected List<Max35Text> serviceVariantIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService16 ATMService16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcVarntId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceVariantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the variant of the service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMService16, List<Max35Text>> mmServiceVariantIdentification = new MMMessageAttribute<ATMService16, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMService16.mmObject();
			isDerived = false;
			xmlTag = "SvcVarntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceVariantIdentification";
			definition = "Identification of the variant of the service.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(ATMService16 obj) {
			return obj.getServiceVariantIdentification();
		}

		@Override
		public void setValue(ATMService16 obj, List<Max35Text> value) {
			obj.setServiceVariantIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMService16.mmServiceReference, com.tools20022.repository.msg.ATMService16.mmATMServiceCode,
						com.tools20022.repository.msg.ATMService16.mmHostServiceCode, com.tools20022.repository.msg.ATMService16.mmServiceType, com.tools20022.repository.msg.ATMService16.mmServiceVariantIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMService16";
				definition = "Service provided by the ATM inside the session.";
				nextVersions_lazy = () -> Arrays.asList(ATMService18.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getServiceReference() {
		return serviceReference == null ? Optional.empty() : Optional.of(serviceReference);
	}

	public ATMService16 setServiceReference(Max35Text serviceReference) {
		this.serviceReference = serviceReference;
		return this;
	}

	public Optional<Max35Text> getATMServiceCode() {
		return aTMServiceCode == null ? Optional.empty() : Optional.of(aTMServiceCode);
	}

	public ATMService16 setATMServiceCode(Max35Text aTMServiceCode) {
		this.aTMServiceCode = aTMServiceCode;
		return this;
	}

	public Optional<Max35Text> getHostServiceCode() {
		return hostServiceCode == null ? Optional.empty() : Optional.of(hostServiceCode);
	}

	public ATMService16 setHostServiceCode(Max35Text hostServiceCode) {
		this.hostServiceCode = hostServiceCode;
		return this;
	}

	public ATMServiceType3Code getServiceType() {
		return serviceType;
	}

	public ATMService16 setServiceType(ATMServiceType3Code serviceType) {
		this.serviceType = Objects.requireNonNull(serviceType);
		return this;
	}

	public List<Max35Text> getServiceVariantIdentification() {
		return serviceVariantIdentification == null ? serviceVariantIdentification = new ArrayList<>() : serviceVariantIdentification;
	}

	public ATMService16 setServiceVariantIdentification(List<Max35Text> serviceVariantIdentification) {
		this.serviceVariantIdentification = Objects.requireNonNull(serviceVariantIdentification);
		return this;
	}
}