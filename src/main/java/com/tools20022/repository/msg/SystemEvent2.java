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
import com.tools20022.repository.choice.SystemEventType2Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.SystemEventInformation;
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
 * Provides details on an event occurring in a system, whether planned or
 * unplanned as stipulated in the specifications of the system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#mmType
 * SystemEvent2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#mmScheduledTime
 * SystemEvent2.mmScheduledTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#mmEffectiveTime
 * SystemEvent2.mmEffectiveTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#mmStartTime
 * SystemEvent2.mmStartTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemEvent2#mmEndTime
 * SystemEvent2.mmEndTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SystemEventInformation
 * SystemEventInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemEvent2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on an event occurring in a system, whether planned or unplanned as stipulated in the specifications of the system."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SystemEvent2", propOrder = {"type", "scheduledTime", "effectiveTime", "startTime", "endTime"})
public class SystemEvent2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected SystemEventType2Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SystemEventType2Choice
	 * SystemEventType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmType
	 * SystemEventInformation.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemEvent2 SystemEvent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the event that has occurred."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemEvent2, SystemEventType2Choice> mmType = new MMMessageAttribute<SystemEvent2, SystemEventType2Choice>() {
		{
			businessElementTrace_lazy = () -> SystemEventInformation.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemEvent2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Nature of the event that has occurred.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SystemEventType2Choice.mmObject();
		}

		@Override
		public SystemEventType2Choice getValue(SystemEvent2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(SystemEvent2 obj, SystemEventType2Choice value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "SchdldTm", required = true)
	protected ISODateTime scheduledTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmTime
	 * SystemEventInformation.mmTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemEvent2 SystemEvent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchdldTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScheduledTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the event is foreseen to occur."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemEvent2, ISODateTime> mmScheduledTime = new MMMessageAttribute<SystemEvent2, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> SystemEventInformation.mmTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemEvent2.mmObject();
			isDerived = false;
			xmlTag = "SchdldTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScheduledTime";
			definition = "Date and time at which the event is foreseen to occur.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(SystemEvent2 obj) {
			return obj.getScheduledTime();
		}

		@Override
		public void setValue(SystemEvent2 obj, ISODateTime value) {
			obj.setScheduledTime(value);
		}
	};
	@XmlElement(name = "FctvTm")
	protected ISODateTime effectiveTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmTime
	 * SystemEventInformation.mmTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemEvent2 SystemEvent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the event effectively takes place."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemEvent2, Optional<ISODateTime>> mmEffectiveTime = new MMMessageAttribute<SystemEvent2, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> SystemEventInformation.mmTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemEvent2.mmObject();
			isDerived = false;
			xmlTag = "FctvTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveTime";
			definition = "Date and time at which the event effectively takes place.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(SystemEvent2 obj) {
			return obj.getEffectiveTime();
		}

		@Override
		public void setValue(SystemEvent2 obj, Optional<ISODateTime> value) {
			obj.setEffectiveTime(value.orElse(null));
		}
	};
	@XmlElement(name = "StartTm")
	protected ISODateTime startTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmTime
	 * SystemEventInformation.mmTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemEvent2 SystemEvent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time at which the event starts."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemEvent2, Optional<ISODateTime>> mmStartTime = new MMMessageAttribute<SystemEvent2, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> SystemEventInformation.mmTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemEvent2.mmObject();
			isDerived = false;
			xmlTag = "StartTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartTime";
			definition = "Time at which the event starts.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(SystemEvent2 obj) {
			return obj.getStartTime();
		}

		@Override
		public void setValue(SystemEvent2 obj, Optional<ISODateTime> value) {
			obj.setStartTime(value.orElse(null));
		}
	};
	@XmlElement(name = "EndTm")
	protected ISODateTime endTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmTime
	 * SystemEventInformation.mmTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SystemEvent2 SystemEvent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time at which the event ends."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SystemEvent2, Optional<ISODateTime>> mmEndTime = new MMMessageAttribute<SystemEvent2, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> SystemEventInformation.mmTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SystemEvent2.mmObject();
			isDerived = false;
			xmlTag = "EndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndTime";
			definition = "Time at which the event ends.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(SystemEvent2 obj) {
			return obj.getEndTime();
		}

		@Override
		public void setValue(SystemEvent2 obj, Optional<ISODateTime> value) {
			obj.setEndTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemEvent2.mmType, com.tools20022.repository.msg.SystemEvent2.mmScheduledTime, com.tools20022.repository.msg.SystemEvent2.mmEffectiveTime,
						com.tools20022.repository.msg.SystemEvent2.mmStartTime, com.tools20022.repository.msg.SystemEvent2.mmEndTime);
				trace_lazy = () -> SystemEventInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemEvent2";
				definition = "Provides details on an event occurring in a system, whether planned or unplanned as stipulated in the specifications of the system.";
			}
		});
		return mmObject_lazy.get();
	}

	public SystemEventType2Choice getType() {
		return type;
	}

	public SystemEvent2 setType(SystemEventType2Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public ISODateTime getScheduledTime() {
		return scheduledTime;
	}

	public SystemEvent2 setScheduledTime(ISODateTime scheduledTime) {
		this.scheduledTime = Objects.requireNonNull(scheduledTime);
		return this;
	}

	public Optional<ISODateTime> getEffectiveTime() {
		return effectiveTime == null ? Optional.empty() : Optional.of(effectiveTime);
	}

	public SystemEvent2 setEffectiveTime(ISODateTime effectiveTime) {
		this.effectiveTime = effectiveTime;
		return this;
	}

	public Optional<ISODateTime> getStartTime() {
		return startTime == null ? Optional.empty() : Optional.of(startTime);
	}

	public SystemEvent2 setStartTime(ISODateTime startTime) {
		this.startTime = startTime;
		return this;
	}

	public Optional<ISODateTime> getEndTime() {
		return endTime == null ? Optional.empty() : Optional.of(endTime);
	}

	public SystemEvent2 setEndTime(ISODateTime endTime) {
		this.endTime = endTime;
		return this;
	}
}