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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.BalanceFormat2Choice;
import com.tools20022.repository.choice.CorporateActionOption17Choice;
import com.tools20022.repository.choice.DeadlineCode2Choice;
import com.tools20022.repository.choice.DefaultProcessingOrStandingInstruction1Choice;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.CorporateActionOption;
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
 * Provides corporate action option details about total instructed balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#mmOptionNumber
 * InstructedCorporateActionOption5.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#mmOptionType
 * InstructedCorporateActionOption5.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#mmInstructedBalance
 * InstructedCorporateActionOption5.mmInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#mmDefaultAction
 * InstructedCorporateActionOption5.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#mmDeadlineDateTime
 * InstructedCorporateActionOption5.mmDeadlineDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#mmDeadlineType
 * InstructedCorporateActionOption5.mmDeadlineType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructedCorporateActionOption5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides corporate action option details about total instructed balance."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption2
 * InstructedCorporateActionOption2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructedCorporateActionOption5", propOrder = {"optionNumber", "optionType", "instructedBalance", "defaultAction", "deadlineDateTime", "deadlineType"})
public class InstructedCorporateActionOption5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OptnNb")
	protected Exact3NumericText optionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
	 * CorporateActionOption.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5
	 * InstructedCorporateActionOption5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13A::CAON</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstructedCorporateActionOption5, Optional<Exact3NumericText>> mmOptionNumber = new MMMessageAttribute<InstructedCorporateActionOption5, Optional<Exact3NumericText>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedCorporateActionOption5.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13A::CAON"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Optional<Exact3NumericText> getValue(InstructedCorporateActionOption5 obj) {
			return obj.getOptionNumber();
		}

		@Override
		public void setValue(InstructedCorporateActionOption5 obj, Optional<Exact3NumericText> value) {
			obj.setOptionNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "OptnTp", required = true)
	protected CorporateActionOption17Choice optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption17Choice
	 * CorporateActionOption17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5
	 * InstructedCorporateActionOption5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the corporate action options available to the account owner."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAOP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructedCorporateActionOption5, CorporateActionOption17Choice> mmOptionType = new MMMessageAssociationEnd<InstructedCorporateActionOption5, CorporateActionOption17Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedCorporateActionOption5.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAOP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionOption17Choice.mmObject();
		}

		@Override
		public CorporateActionOption17Choice getValue(InstructedCorporateActionOption5 obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(InstructedCorporateActionOption5 obj, CorporateActionOption17Choice value) {
			obj.setOptionType(value);
		}
	};
	@XmlElement(name = "InstdBal", required = true)
	protected BalanceFormat2Choice instructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice
	 * BalanceFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5
	 * InstructedCorporateActionOption5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of instructed position."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::INBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructedCorporateActionOption5, BalanceFormat2Choice> mmInstructedBalance = new MMMessageAssociationEnd<InstructedCorporateActionOption5, BalanceFormat2Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedCorporateActionOption5.mmObject();
			isDerived = false;
			xmlTag = "InstdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::INBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of instructed position.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BalanceFormat2Choice.mmObject();
		}

		@Override
		public BalanceFormat2Choice getValue(InstructedCorporateActionOption5 obj) {
			return obj.getInstructedBalance();
		}

		@Override
		public void setValue(InstructedCorporateActionOption5 obj, BalanceFormat2Choice value) {
			obj.setInstructedBalance(value);
		}
	};
	@XmlElement(name = "DfltActn")
	protected DefaultProcessingOrStandingInstruction1Choice defaultAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DefaultProcessingOrStandingInstruction1Choice
	 * DefaultProcessingOrStandingInstruction1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5
	 * InstructedCorporateActionOption5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltActn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the default action related to a corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::DFLT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructedCorporateActionOption5, Optional<DefaultProcessingOrStandingInstruction1Choice>> mmDefaultAction = new MMMessageAssociationEnd<InstructedCorporateActionOption5, Optional<DefaultProcessingOrStandingInstruction1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedCorporateActionOption5.mmObject();
			isDerived = false;
			xmlTag = "DfltActn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::DFLT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultAction";
			definition = "Indicates the default action related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DefaultProcessingOrStandingInstruction1Choice.mmObject();
		}

		@Override
		public Optional<DefaultProcessingOrStandingInstruction1Choice> getValue(InstructedCorporateActionOption5 obj) {
			return obj.getDefaultAction();
		}

		@Override
		public void setValue(InstructedCorporateActionOption5 obj, Optional<DefaultProcessingOrStandingInstruction1Choice> value) {
			obj.setDefaultAction(value.orElse(null));
		}
	};
	@XmlElement(name = "DdlnDtTm", required = true)
	protected ISODateTime deadlineDateTime;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDeadline
	 * CorporateActionEvent.mmDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5
	 * InstructedCorporateActionOption5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DdlnDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any deadline chosen by the account servicer (service level agreement)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstructedCorporateActionOption5, ISODateTime> mmDeadlineDateTime = new MMMessageAttribute<InstructedCorporateActionOption5, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedCorporateActionOption5.mmObject();
			isDerived = false;
			xmlTag = "DdlnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineDateTime";
			definition = "Any deadline chosen by the account servicer (service level agreement).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(InstructedCorporateActionOption5 obj) {
			return obj.getDeadlineDateTime();
		}

		@Override
		public void setValue(InstructedCorporateActionOption5 obj, ISODateTime value) {
			obj.setDeadlineDateTime(value);
		}
	};
	@XmlElement(name = "DdlnTp", required = true)
	protected DeadlineCode2Choice deadlineType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DeadlineCode2Choice
	 * DeadlineCode2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDeadline
	 * CorporateActionEvent.mmDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5
	 * InstructedCorporateActionOption5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DdlnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of deadline for instructing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructedCorporateActionOption5, DeadlineCode2Choice> mmDeadlineType = new MMMessageAssociationEnd<InstructedCorporateActionOption5, DeadlineCode2Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedCorporateActionOption5.mmObject();
			isDerived = false;
			xmlTag = "DdlnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineType";
			definition = "Specifies the type of deadline for instructing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DeadlineCode2Choice.mmObject();
		}

		@Override
		public DeadlineCode2Choice getValue(InstructedCorporateActionOption5 obj) {
			return obj.getDeadlineType();
		}

		@Override
		public void setValue(InstructedCorporateActionOption5 obj, DeadlineCode2Choice value) {
			obj.setDeadlineType(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructedCorporateActionOption5.mmOptionNumber, com.tools20022.repository.msg.InstructedCorporateActionOption5.mmOptionType,
						com.tools20022.repository.msg.InstructedCorporateActionOption5.mmInstructedBalance, com.tools20022.repository.msg.InstructedCorporateActionOption5.mmDefaultAction,
						com.tools20022.repository.msg.InstructedCorporateActionOption5.mmDeadlineDateTime, com.tools20022.repository.msg.InstructedCorporateActionOption5.mmDeadlineType);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructedCorporateActionOption5";
				definition = "Provides corporate action option details about total instructed balance.";
				previousVersion_lazy = () -> InstructedCorporateActionOption2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Exact3NumericText> getOptionNumber() {
		return optionNumber == null ? Optional.empty() : Optional.of(optionNumber);
	}

	public InstructedCorporateActionOption5 setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = optionNumber;
		return this;
	}

	public CorporateActionOption17Choice getOptionType() {
		return optionType;
	}

	public InstructedCorporateActionOption5 setOptionType(CorporateActionOption17Choice optionType) {
		this.optionType = Objects.requireNonNull(optionType);
		return this;
	}

	public BalanceFormat2Choice getInstructedBalance() {
		return instructedBalance;
	}

	public InstructedCorporateActionOption5 setInstructedBalance(BalanceFormat2Choice instructedBalance) {
		this.instructedBalance = Objects.requireNonNull(instructedBalance);
		return this;
	}

	public Optional<DefaultProcessingOrStandingInstruction1Choice> getDefaultAction() {
		return defaultAction == null ? Optional.empty() : Optional.of(defaultAction);
	}

	public InstructedCorporateActionOption5 setDefaultAction(DefaultProcessingOrStandingInstruction1Choice defaultAction) {
		this.defaultAction = defaultAction;
		return this;
	}

	public ISODateTime getDeadlineDateTime() {
		return deadlineDateTime;
	}

	public InstructedCorporateActionOption5 setDeadlineDateTime(ISODateTime deadlineDateTime) {
		this.deadlineDateTime = Objects.requireNonNull(deadlineDateTime);
		return this;
	}

	public DeadlineCode2Choice getDeadlineType() {
		return deadlineType;
	}

	public InstructedCorporateActionOption5 setDeadlineType(DeadlineCode2Choice deadlineType) {
		this.deadlineType = Objects.requireNonNull(deadlineType);
		return this;
	}
}