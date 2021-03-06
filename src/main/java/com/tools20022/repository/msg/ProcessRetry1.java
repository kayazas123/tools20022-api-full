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
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.datatype.Max9NumericText;
import com.tools20022.repository.datatype.Number;
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
 * Definition of retry process if activation of an action fails.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessRetry1#mmDelay
 * ProcessRetry1.mmDelay}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessRetry1#mmMaximumNumber
 * ProcessRetry1.mmMaximumNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessRetry1#mmLastReTryTime
 * ProcessRetry1.mmLastReTryTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessRetry1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Definition of retry process if activation of an action fails."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProcessRetry2 ProcessRetry2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProcessRetry1", propOrder = {"delay", "maximumNumber", "lastReTryTime"})
public class ProcessRetry1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dely", required = true)
	protected Max9NumericText delay;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max9NumericText
	 * Max9NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessRetry1 ProcessRetry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dely"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time period to wait for a retry in months, days, hours and minutes, leading zeros could be omitted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProcessRetry1, Max9NumericText> mmDelay = new MMMessageAttribute<ProcessRetry1, Max9NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessRetry1.mmObject();
			isDerived = false;
			xmlTag = "Dely";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delay";
			definition = "Time period to wait for a retry in months, days, hours and minutes, leading zeros could be omitted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}

		@Override
		public Max9NumericText getValue(ProcessRetry1 obj) {
			return obj.getDelay();
		}

		@Override
		public void setValue(ProcessRetry1 obj, Max9NumericText value) {
			obj.setDelay(value);
		}
	};
	@XmlElement(name = "MaxNb")
	protected Number maximumNumber;
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
	 * {@linkplain com.tools20022.repository.msg.ProcessRetry1 ProcessRetry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of retries."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProcessRetry1, Optional<Number>> mmMaximumNumber = new MMMessageAttribute<ProcessRetry1, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessRetry1.mmObject();
			isDerived = false;
			xmlTag = "MaxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumNumber";
			definition = "Maximum number of retries.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(ProcessRetry1 obj) {
			return obj.getMaximumNumber();
		}

		@Override
		public void setValue(ProcessRetry1 obj, Optional<Number> value) {
			obj.setMaximumNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "LastReTryTm")
	protected ISOTime lastReTryTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProcessRetry1 ProcessRetry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastReTryTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastReTryTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time of the last retry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProcessRetry1, Optional<ISOTime>> mmLastReTryTime = new MMMessageAttribute<ProcessRetry1, Optional<ISOTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProcessRetry1.mmObject();
			isDerived = false;
			xmlTag = "LastReTryTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastReTryTime";
			definition = "Time of the last retry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOTime.mmObject();
		}

		@Override
		public Optional<ISOTime> getValue(ProcessRetry1 obj) {
			return obj.getLastReTryTime();
		}

		@Override
		public void setValue(ProcessRetry1 obj, Optional<ISOTime> value) {
			obj.setLastReTryTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProcessRetry1.mmDelay, com.tools20022.repository.msg.ProcessRetry1.mmMaximumNumber, com.tools20022.repository.msg.ProcessRetry1.mmLastReTryTime);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessRetry1";
				definition = "Definition of retry process if activation of an action fails.";
				nextVersions_lazy = () -> Arrays.asList(ProcessRetry2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max9NumericText getDelay() {
		return delay;
	}

	public ProcessRetry1 setDelay(Max9NumericText delay) {
		this.delay = Objects.requireNonNull(delay);
		return this;
	}

	public Optional<Number> getMaximumNumber() {
		return maximumNumber == null ? Optional.empty() : Optional.of(maximumNumber);
	}

	public ProcessRetry1 setMaximumNumber(Number maximumNumber) {
		this.maximumNumber = maximumNumber;
		return this;
	}

	public Optional<ISOTime> getLastReTryTime() {
		return lastReTryTime == null ? Optional.empty() : Optional.of(lastReTryTime);
	}

	public ProcessRetry1 setLastReTryTime(ISOTime lastReTryTime) {
		this.lastReTryTime = lastReTryTime;
		return this;
	}
}