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
import com.tools20022.repository.codeset.MessageFunction12Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Acquirer configuration parameters for a host.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration4#mmHostIdentification
 * AcquirerHostConfiguration4.mmHostIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration4#mmMessageToSend
 * AcquirerHostConfiguration4.mmMessageToSend}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
 * TerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcquirerHostConfiguration4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Acquirer configuration parameters for a host."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration5
 * AcquirerHostConfiguration5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration3
 * AcquirerHostConfiguration3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcquirerHostConfiguration4", propOrder = {"hostIdentification", "messageToSend"})
public class AcquirerHostConfiguration4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "HstId", required = true)
	protected Max35Text hostIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.System#mmSystemIdentification
	 * System.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration4
	 * AcquirerHostConfiguration4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a host."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration5#mmHostIdentification
	 * AcquirerHostConfiguration5.mmHostIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration3#mmHostIdentification
	 * AcquirerHostConfiguration3.mmHostIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcquirerHostConfiguration4, Max35Text> mmHostIdentification = new MMMessageAttribute<AcquirerHostConfiguration4, Max35Text>() {
		{
			businessElementTrace_lazy = () -> System.mmSystemIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerHostConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "HstId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostIdentification";
			definition = "Identification of a host.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerHostConfiguration5.mmHostIdentification);
			previousVersion_lazy = () -> AcquirerHostConfiguration3.mmHostIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AcquirerHostConfiguration4 obj) {
			return obj.getHostIdentification();
		}

		@Override
		public void setValue(AcquirerHostConfiguration4 obj, Max35Text value) {
			obj.setHostIdentification(value);
		}
	};
	@XmlElement(name = "MsgToSnd")
	protected List<MessageFunction12Code> messageToSend;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction12Code
	 * MessageFunction12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration4
	 * AcquirerHostConfiguration4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgToSnd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageToSend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Types of message to sent to this host."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration5#mmMessageToSend
	 * AcquirerHostConfiguration5.mmMessageToSend}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration3#mmMessageToSend
	 * AcquirerHostConfiguration3.mmMessageToSend}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcquirerHostConfiguration4, List<MessageFunction12Code>> mmMessageToSend = new MMMessageAttribute<AcquirerHostConfiguration4, List<MessageFunction12Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerHostConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "MsgToSnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageToSend";
			definition = "Types of message to sent to this host.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerHostConfiguration5.mmMessageToSend);
			previousVersion_lazy = () -> AcquirerHostConfiguration3.mmMessageToSend;
			minOccurs = 0;
			simpleType_lazy = () -> MessageFunction12Code.mmObject();
		}

		@Override
		public List<MessageFunction12Code> getValue(AcquirerHostConfiguration4 obj) {
			return obj.getMessageToSend();
		}

		@Override
		public void setValue(AcquirerHostConfiguration4 obj, List<MessageFunction12Code> value) {
			obj.setMessageToSend(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerHostConfiguration4.mmHostIdentification, com.tools20022.repository.msg.AcquirerHostConfiguration4.mmMessageToSend);
				trace_lazy = () -> TerminalManagementSystem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerHostConfiguration4";
				definition = "Acquirer configuration parameters for a host.";
				nextVersions_lazy = () -> Arrays.asList(AcquirerHostConfiguration5.mmObject());
				previousVersion_lazy = () -> AcquirerHostConfiguration3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getHostIdentification() {
		return hostIdentification;
	}

	public AcquirerHostConfiguration4 setHostIdentification(Max35Text hostIdentification) {
		this.hostIdentification = Objects.requireNonNull(hostIdentification);
		return this;
	}

	public List<MessageFunction12Code> getMessageToSend() {
		return messageToSend == null ? messageToSend = new ArrayList<>() : messageToSend;
	}

	public AcquirerHostConfiguration4 setMessageToSend(List<MessageFunction12Code> messageToSend) {
		this.messageToSend = Objects.requireNonNull(messageToSend);
		return this;
	}
}