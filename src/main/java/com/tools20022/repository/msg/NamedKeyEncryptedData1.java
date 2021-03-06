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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.EncryptedContent1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Encrypted data with an encryption key identified with a name.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData1#mmVersion
 * NamedKeyEncryptedData1.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData1#mmKeyName
 * NamedKeyEncryptedData1.mmKeyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData1#mmEncryptedContent
 * NamedKeyEncryptedData1.mmEncryptedContent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NamedKeyEncryptedData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Encrypted data with an encryption key identified with a name."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData2
 * NamedKeyEncryptedData2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NamedKeyEncryptedData1", propOrder = {"version", "keyName", "encryptedContent"})
public class NamedKeyEncryptedData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Vrsn")
	protected Number version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData1
	 * NamedKeyEncryptedData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the data structure."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NamedKeyEncryptedData1, Optional<Number>> mmVersion = new MMMessageAttribute<NamedKeyEncryptedData1, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NamedKeyEncryptedData1.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the data structure.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(NamedKeyEncryptedData1 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(NamedKeyEncryptedData1 obj, Optional<Number> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "KeyNm")
	protected Max140Text keyName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData1
	 * NamedKeyEncryptedData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the key encryption key (KEK)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NamedKeyEncryptedData1, Optional<Max140Text>> mmKeyName = new MMMessageAttribute<NamedKeyEncryptedData1, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NamedKeyEncryptedData1.mmObject();
			isDerived = false;
			xmlTag = "KeyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyName";
			definition = "Name of the key encryption key (KEK).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(NamedKeyEncryptedData1 obj) {
			return obj.getKeyName();
		}

		@Override
		public void setValue(NamedKeyEncryptedData1 obj, Optional<Max140Text> value) {
			obj.setKeyName(value.orElse(null));
		}
	};
	@XmlElement(name = "NcrptdCntt", required = true)
	protected EncryptedContent1 encryptedContent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EncryptedContent1
	 * EncryptedContent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData1
	 * NamedKeyEncryptedData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptdCntt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted data with an encryption key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NamedKeyEncryptedData1, EncryptedContent1> mmEncryptedContent = new MMMessageAssociationEnd<NamedKeyEncryptedData1, EncryptedContent1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NamedKeyEncryptedData1.mmObject();
			isDerived = false;
			xmlTag = "NcrptdCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedContent";
			definition = "Encrypted data with an encryption key.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EncryptedContent1.mmObject();
		}

		@Override
		public EncryptedContent1 getValue(NamedKeyEncryptedData1 obj) {
			return obj.getEncryptedContent();
		}

		@Override
		public void setValue(NamedKeyEncryptedData1 obj, EncryptedContent1 value) {
			obj.setEncryptedContent(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NamedKeyEncryptedData1.mmVersion, com.tools20022.repository.msg.NamedKeyEncryptedData1.mmKeyName,
						com.tools20022.repository.msg.NamedKeyEncryptedData1.mmEncryptedContent);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NamedKeyEncryptedData1";
				definition = "Encrypted data with an encryption key identified with a name.";
				nextVersions_lazy = () -> Arrays.asList(NamedKeyEncryptedData2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public NamedKeyEncryptedData1 setVersion(Number version) {
		this.version = version;
		return this;
	}

	public Optional<Max140Text> getKeyName() {
		return keyName == null ? Optional.empty() : Optional.of(keyName);
	}

	public NamedKeyEncryptedData1 setKeyName(Max140Text keyName) {
		this.keyName = keyName;
		return this;
	}

	public EncryptedContent1 getEncryptedContent() {
		return encryptedContent;
	}

	public NamedKeyEncryptedData1 setEncryptedContent(EncryptedContent1 encryptedContent) {
		this.encryptedContent = Objects.requireNonNull(encryptedContent);
		return this;
	}
}