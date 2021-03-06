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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.Quantity11Choice;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.SecuritiesProceedsDefinition;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between an instructed quantity or a quantity to receive.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice#mmInstructedQuantity
 * InstructedOrQuantityToReceive2Choice.mmInstructedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice#mmQuantityToReceive
 * InstructedOrQuantityToReceive2Choice.mmQuantityToReceive}</li>
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
 * "InstructedOrQuantityToReceive2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between an instructed quantity or a quantity to receive."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedQuantityRule#forInstructedOrQuantityToReceive2Choice
 * ConstraintInstructedQuantityRule.forInstructedOrQuantityToReceive2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forInstructedOrQuantityToReceive2Choice
 * ConstraintCoexistenceQuantityRule.forInstructedOrQuantityToReceive2Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructedOrQuantityToReceive2Choice", propOrder = {"instructedQuantity", "quantityToReceive"})
public class InstructedOrQuantityToReceive2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstdQty", required = true)
	protected Quantity11Choice instructedQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity11Choice
	 * Quantity11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice
	 * InstructedOrQuantityToReceive2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of underlying securities to which this instruction applies."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructedOrQuantityToReceive2Choice, Quantity11Choice> mmInstructedQuantity = new MMMessageAssociationEnd<InstructedOrQuantityToReceive2Choice, Quantity11Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice.mmObject();
			isDerived = false;
			xmlTag = "InstdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedQuantity";
			definition = "Quantity of underlying securities to which this instruction applies.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity11Choice.mmObject();
		}

		@Override
		public Quantity11Choice getValue(InstructedOrQuantityToReceive2Choice obj) {
			return obj.getInstructedQuantity();
		}

		@Override
		public void setValue(InstructedOrQuantityToReceive2Choice obj, Quantity11Choice value) {
			obj.setInstructedQuantity(value);
		}
	};
	@XmlElement(name = "QtyToRcv", required = true)
	protected Quantity11Choice quantityToReceive;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity11Choice
	 * Quantity11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmQuantityToReceive
	 * SecuritiesProceedsDefinition.mmQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice
	 * InstructedOrQuantityToReceive2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyToRcv"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityToReceive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of the benefits that the account owner wants to receive, for example, as a result of dividend reinvestment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36a::QINS or QREC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructedOrQuantityToReceive2Choice, Quantity11Choice> mmQuantityToReceive = new MMMessageAssociationEnd<InstructedOrQuantityToReceive2Choice, Quantity11Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmQuantityToReceive;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyToRcv";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36a::QINS or QREC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityToReceive";
			definition = "Quantity of the benefits that the account owner wants to receive, for example, as a result of dividend reinvestment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity11Choice.mmObject();
		}

		@Override
		public Quantity11Choice getValue(InstructedOrQuantityToReceive2Choice obj) {
			return obj.getQuantityToReceive();
		}

		@Override
		public void setValue(InstructedOrQuantityToReceive2Choice obj, Quantity11Choice value) {
			obj.setQuantityToReceive(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice.mmInstructedQuantity, com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice.mmQuantityToReceive);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedQuantityRule.forInstructedOrQuantityToReceive2Choice,
						com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forInstructedOrQuantityToReceive2Choice);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "InstructedOrQuantityToReceive2Choice";
				definition = "Choice between an instructed quantity or a quantity to receive.";
			}
		});
		return mmObject_lazy.get();
	}

	public Quantity11Choice getInstructedQuantity() {
		return instructedQuantity;
	}

	public InstructedOrQuantityToReceive2Choice setInstructedQuantity(Quantity11Choice instructedQuantity) {
		this.instructedQuantity = Objects.requireNonNull(instructedQuantity);
		return this;
	}

	public Quantity11Choice getQuantityToReceive() {
		return quantityToReceive;
	}

	public InstructedOrQuantityToReceive2Choice setQuantityToReceive(Quantity11Choice quantityToReceive) {
		this.quantityToReceive = Objects.requireNonNull(quantityToReceive);
		return this;
	}
}