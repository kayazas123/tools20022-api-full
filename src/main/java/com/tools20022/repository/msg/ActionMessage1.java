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
import com.tools20022.repository.codeset.UserInterface1Code;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.CardPaymentAcquiring;
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
 * Message to be displayed to the cardholder or the cashier.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActionMessage1#mmMessageDestination
 * ActionMessage1.mmMessageDestination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActionMessage1#mmMessageContent
 * ActionMessage1.mmMessageContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActionMessage1#mmMessageContentSignature
 * ActionMessage1.mmMessageContentSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
 * CardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ActionMessage1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Message to be displayed to the cardholder or the cashier."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage2 ActionMessage2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage5 ActionMessage5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ActionMessage1", propOrder = {"messageDestination", "messageContent", "messageContentSignature"})
public class ActionMessage1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgDstn", required = true)
	protected UserInterface1Code messageDestination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface1Code
	 * UserInterface1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage1 ActionMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgDstn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageDestination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Destination of the message to be displayed or printed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage2#mmMessageDestination
	 * ActionMessage2.mmMessageDestination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ActionMessage1, UserInterface1Code> mmMessageDestination = new MMMessageAttribute<ActionMessage1, UserInterface1Code>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> com.tools20022.repository.msg.ActionMessage1.mmObject();
			isDerived = false;
			xmlTag = "MsgDstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageDestination";
			definition = "Destination of the message to be displayed or printed.";
			nextVersions_lazy = () -> Arrays.asList(ActionMessage2.mmMessageDestination);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UserInterface1Code.mmObject();
		}

		@Override
		public UserInterface1Code getValue(ActionMessage1 obj) {
			return obj.getMessageDestination();
		}

		@Override
		public void setValue(ActionMessage1 obj, UserInterface1Code value) {
			obj.setMessageDestination(value);
		}
	};
	@XmlElement(name = "MsgCntt", required = true)
	protected Max256Text messageContent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmActionMessage
	 * CardPaymentAcquiring.mmActionMessage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage1 ActionMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgCntt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Text or graphic data to be display or printed to the cardholder or the cashier."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage2#mmMessageContent
	 * ActionMessage2.mmMessageContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage5#mmMessageContent
	 * ActionMessage5.mmMessageContent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ActionMessage1, Max256Text> mmMessageContent = new MMMessageAttribute<ActionMessage1, Max256Text>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmActionMessage;
			componentContext_lazy = () -> com.tools20022.repository.msg.ActionMessage1.mmObject();
			isDerived = false;
			xmlTag = "MsgCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageContent";
			definition = "Text or graphic data to be display or printed to the cardholder or the cashier.";
			nextVersions_lazy = () -> Arrays.asList(ActionMessage2.mmMessageContent, ActionMessage5.mmMessageContent);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Max256Text getValue(ActionMessage1 obj) {
			return obj.getMessageContent();
		}

		@Override
		public void setValue(ActionMessage1 obj, Max256Text value) {
			obj.setMessageContent(value);
		}
	};
	@XmlElement(name = "MsgCnttSgntr")
	protected Max70Text messageContentSignature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage1 ActionMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgCnttSgntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageContentSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Electronic signature of the message to display or print."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage2#mmMessageContentSignature
	 * ActionMessage2.mmMessageContentSignature}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ActionMessage1, Optional<Max70Text>> mmMessageContentSignature = new MMMessageAttribute<ActionMessage1, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ActionMessage1.mmObject();
			isDerived = false;
			xmlTag = "MsgCnttSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageContentSignature";
			definition = "Electronic signature of the message to display or print.";
			nextVersions_lazy = () -> Arrays.asList(ActionMessage2.mmMessageContentSignature);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(ActionMessage1 obj) {
			return obj.getMessageContentSignature();
		}

		@Override
		public void setValue(ActionMessage1 obj, Optional<Max70Text> value) {
			obj.setMessageContentSignature(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ActionMessage1.mmMessageDestination, com.tools20022.repository.msg.ActionMessage1.mmMessageContent,
						com.tools20022.repository.msg.ActionMessage1.mmMessageContentSignature);
				trace_lazy = () -> CardPaymentAcquiring.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActionMessage1";
				definition = "Message to be displayed to the cardholder or the cashier.";
				nextVersions_lazy = () -> Arrays.asList(ActionMessage2.mmObject(), ActionMessage5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public UserInterface1Code getMessageDestination() {
		return messageDestination;
	}

	public ActionMessage1 setMessageDestination(UserInterface1Code messageDestination) {
		this.messageDestination = Objects.requireNonNull(messageDestination);
		return this;
	}

	public Max256Text getMessageContent() {
		return messageContent;
	}

	public ActionMessage1 setMessageContent(Max256Text messageContent) {
		this.messageContent = Objects.requireNonNull(messageContent);
		return this;
	}

	public Optional<Max70Text> getMessageContentSignature() {
		return messageContentSignature == null ? Optional.empty() : Optional.of(messageContentSignature);
	}

	public ActionMessage1 setMessageContentSignature(Max70Text messageContentSignature) {
		this.messageContentSignature = messageContentSignature;
		return this;
	}
}