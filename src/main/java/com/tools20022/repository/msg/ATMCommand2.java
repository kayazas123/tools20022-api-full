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
import com.tools20022.repository.codeset.ATMCommand2Code;
import com.tools20022.repository.codeset.TerminalManagementActionResult2Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCommandIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Result of a maintenance command performed by the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand2#mmType
 * ATMCommand2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand2#mmRequiredDateTime
 * ATMCommand2.mmRequiredDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCommand2#mmProcessedDateTime
 * ATMCommand2.mmProcessedDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCommand2#mmCommandIdentification
 * ATMCommand2.mmCommandIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand2#mmResult
 * ATMCommand2.mmResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCommand2#mmAdditionalErrorInformation
 * ATMCommand2.mmAdditionalErrorInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMCommand2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of a maintenance command performed by the ATM."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand3 ATMCommand3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand5 ATMCommand5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand11 ATMCommand11}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMCommand1
 * ATMCommand1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMCommand2", propOrder = {"type", "requiredDateTime", "processedDateTime", "commandIdentification", "result", "additionalErrorInformation"})
public class ATMCommand2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected ATMCommand2Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
	 * ATMCommand2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand2 ATMCommand2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of command to be performed by the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand3#mmType
	 * ATMCommand3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand5#mmType
	 * ATMCommand5.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand11#mmType
	 * ATMCommand11.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand1#mmType
	 * ATMCommand1.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommand2, ATMCommand2Code> mmType = new MMMessageAttribute<ATMCommand2, ATMCommand2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of command to be performed by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand3.mmType, ATMCommand5.mmType, ATMCommand11.mmType);
			previousVersion_lazy = () -> ATMCommand1.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMCommand2Code.mmObject();
		}

		@Override
		public ATMCommand2Code getValue(ATMCommand2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(ATMCommand2 obj, ATMCommand2Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "ReqrdDtTm")
	protected ISODateTime requiredDateTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand2 ATMCommand2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqrdDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date time on which the command has been requested to be performed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand5#mmRequiredDateTime
	 * ATMCommand5.mmRequiredDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand11#mmRequiredDateTime
	 * ATMCommand11.mmRequiredDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand1#mmDateTime
	 * ATMCommand1.mmDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommand2, Optional<ISODateTime>> mmRequiredDateTime = new MMMessageAttribute<ATMCommand2, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand2.mmObject();
			isDerived = false;
			xmlTag = "ReqrdDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredDateTime";
			definition = "Date time on which the command has been requested to be performed.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand5.mmRequiredDateTime, ATMCommand11.mmRequiredDateTime);
			previousVersion_lazy = () -> ATMCommand1.mmDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(ATMCommand2 obj) {
			return obj.getRequiredDateTime();
		}

		@Override
		public void setValue(ATMCommand2 obj, Optional<ISODateTime> value) {
			obj.setRequiredDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcdDtTm", required = true)
	protected ISODateTime processedDateTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand2 ATMCommand2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcdDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessedDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date time on which the command has been performed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand5#mmProcessedDateTime
	 * ATMCommand5.mmProcessedDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand11#mmProcessedDateTime
	 * ATMCommand11.mmProcessedDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommand2, ISODateTime> mmProcessedDateTime = new MMMessageAttribute<ATMCommand2, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand2.mmObject();
			isDerived = false;
			xmlTag = "PrcdDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessedDateTime";
			definition = "Date time on which the command has been performed.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand5.mmProcessedDateTime, ATMCommand11.mmProcessedDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(ATMCommand2 obj) {
			return obj.getProcessedDateTime();
		}

		@Override
		public void setValue(ATMCommand2 obj, ISODateTime value) {
			obj.setProcessedDateTime(value);
		}
	};
	@XmlElement(name = "CmdId")
	protected ATMCommandIdentification1 commandIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommandIdentification1
	 * ATMCommandIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand2 ATMCommand2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmdId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommandIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the entity issuing the command."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand3#mmCommandIdentification
	 * ATMCommand3.mmCommandIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand5#mmCommandIdentification
	 * ATMCommand5.mmCommandIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand11#mmCommandIdentification
	 * ATMCommand11.mmCommandIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand1#mmCommandIdentification
	 * ATMCommand1.mmCommandIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMCommand2, Optional<ATMCommandIdentification1>> mmCommandIdentification = new MMMessageAssociationEnd<ATMCommand2, Optional<ATMCommandIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand2.mmObject();
			isDerived = false;
			xmlTag = "CmdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandIdentification";
			definition = "Identification of the entity issuing the command.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand3.mmCommandIdentification, ATMCommand5.mmCommandIdentification, ATMCommand11.mmCommandIdentification);
			previousVersion_lazy = () -> ATMCommand1.mmCommandIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommandIdentification1.mmObject();
		}

		@Override
		public Optional<ATMCommandIdentification1> getValue(ATMCommand2 obj) {
			return obj.getCommandIdentification();
		}

		@Override
		public void setValue(ATMCommand2 obj, Optional<ATMCommandIdentification1> value) {
			obj.setCommandIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Rslt", required = true)
	protected TerminalManagementActionResult2Code result;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code
	 * TerminalManagementActionResult2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand2 ATMCommand2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Result"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Final result of the processed command at the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand5#mmResult
	 * ATMCommand5.mmResult}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand11#mmResult
	 * ATMCommand11.mmResult}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommand2, TerminalManagementActionResult2Code> mmResult = new MMMessageAttribute<ATMCommand2, TerminalManagementActionResult2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand2.mmObject();
			isDerived = false;
			xmlTag = "Rslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Result";
			definition = "Final result of the processed command at the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand5.mmResult, ATMCommand11.mmResult);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionResult2Code.mmObject();
		}

		@Override
		public TerminalManagementActionResult2Code getValue(ATMCommand2 obj) {
			return obj.getResult();
		}

		@Override
		public void setValue(ATMCommand2 obj, TerminalManagementActionResult2Code value) {
			obj.setResult(value);
		}
	};
	@XmlElement(name = "AddtlErrInf")
	protected Max140Text additionalErrorInformation;
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
	 * {@linkplain com.tools20022.repository.msg.ATMCommand2 ATMCommand2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlErrInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalErrorInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information on the failure to be logged for further examination."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand5#mmAdditionalErrorInformation
	 * ATMCommand5.mmAdditionalErrorInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCommand11#mmAdditionalErrorInformation
	 * ATMCommand11.mmAdditionalErrorInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommand2, Optional<Max140Text>> mmAdditionalErrorInformation = new MMMessageAttribute<ATMCommand2, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand2.mmObject();
			isDerived = false;
			xmlTag = "AddtlErrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalErrorInformation";
			definition = "Additional information on the failure to be logged for further examination.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand5.mmAdditionalErrorInformation, ATMCommand11.mmAdditionalErrorInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(ATMCommand2 obj) {
			return obj.getAdditionalErrorInformation();
		}

		@Override
		public void setValue(ATMCommand2 obj, Optional<Max140Text> value) {
			obj.setAdditionalErrorInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMCommand2.mmType, com.tools20022.repository.msg.ATMCommand2.mmRequiredDateTime, com.tools20022.repository.msg.ATMCommand2.mmProcessedDateTime,
						com.tools20022.repository.msg.ATMCommand2.mmCommandIdentification, com.tools20022.repository.msg.ATMCommand2.mmResult, com.tools20022.repository.msg.ATMCommand2.mmAdditionalErrorInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCommand2";
				definition = "Result of a maintenance command performed by the ATM.";
				nextVersions_lazy = () -> Arrays.asList(ATMCommand3.mmObject(), ATMCommand5.mmObject(), ATMCommand11.mmObject());
				previousVersion_lazy = () -> ATMCommand1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ATMCommand2Code getType() {
		return type;
	}

	public ATMCommand2 setType(ATMCommand2Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<ISODateTime> getRequiredDateTime() {
		return requiredDateTime == null ? Optional.empty() : Optional.of(requiredDateTime);
	}

	public ATMCommand2 setRequiredDateTime(ISODateTime requiredDateTime) {
		this.requiredDateTime = requiredDateTime;
		return this;
	}

	public ISODateTime getProcessedDateTime() {
		return processedDateTime;
	}

	public ATMCommand2 setProcessedDateTime(ISODateTime processedDateTime) {
		this.processedDateTime = Objects.requireNonNull(processedDateTime);
		return this;
	}

	public Optional<ATMCommandIdentification1> getCommandIdentification() {
		return commandIdentification == null ? Optional.empty() : Optional.of(commandIdentification);
	}

	public ATMCommand2 setCommandIdentification(ATMCommandIdentification1 commandIdentification) {
		this.commandIdentification = commandIdentification;
		return this;
	}

	public TerminalManagementActionResult2Code getResult() {
		return result;
	}

	public ATMCommand2 setResult(TerminalManagementActionResult2Code result) {
		this.result = Objects.requireNonNull(result);
		return this;
	}

	public Optional<Max140Text> getAdditionalErrorInformation() {
		return additionalErrorInformation == null ? Optional.empty() : Optional.of(additionalErrorInformation);
	}

	public ATMCommand2 setAdditionalErrorInformation(Max140Text additionalErrorInformation) {
		this.additionalErrorInformation = additionalErrorInformation;
		return this;
	}
}