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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V06;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V05;
import com.tools20022.repository.choice.CashAccountIdentification6Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.choice.Quantity10Choice;
import com.tools20022.repository.datatype.RestrictedFINXMax210Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details on the quantity, account and other related information involved in a
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmSettledQuantity
 * QuantityAndAccount51.mmSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmPreviouslySettledQuantity
 * QuantityAndAccount51.mmPreviouslySettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmRemainingToBeSettledQuantity
 * QuantityAndAccount51.mmRemainingToBeSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmPreviouslySettledAmount
 * QuantityAndAccount51.mmPreviouslySettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmRemainingToBeSettledAmount
 * QuantityAndAccount51.mmRemainingToBeSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmDenominationChoice
 * QuantityAndAccount51.mmDenominationChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmAccountOwner
 * QuantityAndAccount51.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmSafekeepingAccount
 * QuantityAndAccount51.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmCashAccount
 * QuantityAndAccount51.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmQuantityBreakdown
 * QuantityAndAccount51.mmQuantityBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmSafekeepingPlace
 * QuantityAndAccount51.mmSafekeepingPlace}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V05#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionReversalAdvice002V05.
 * mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V06#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionConfirmation002V06.mmQuantityAndAccountDetails
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuantityAndAccount51"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details on the quantity, account and other related information involved in a transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount51
 * ConstraintDenominationRule.forQuantityAndAccount51}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule#forQuantityAndAccount51
 * ConstraintSafekeepingPlaceRule.forQuantityAndAccount51}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline#forQuantityAndAccount51
 * ConstraintPartialSettlementGuideline.forQuantityAndAccount51}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount51
 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount51}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityAndAccount57
 * QuantityAndAccount57}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "QuantityAndAccount51", propOrder = {"settledQuantity", "previouslySettledQuantity", "remainingToBeSettledQuantity", "previouslySettledAmount", "remainingToBeSettledAmount", "denominationChoice", "accountOwner",
		"safekeepingAccount", "cashAccount", "quantityBreakdown", "safekeepingPlace"})
public class QuantityAndAccount51 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttldQty", required = true)
	protected Quantity10Choice settledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity10Choice
	 * Quantity10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
	 * SecuritiesSettlement.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument effectively settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::ESTT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmSettledQuantity
	 * QuantityAndAccount57.mmSettledQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityAndAccount51, Quantity10Choice> mmSettledQuantity = new MMMessageAssociationEnd<QuantityAndAccount51, Quantity10Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount51.mmObject();
			isDerived = false;
			xmlTag = "SttldQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::ESTT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledQuantity";
			definition = "Quantity of financial instrument effectively settled.";
			nextVersions_lazy = () -> Arrays.asList(QuantityAndAccount57.mmSettledQuantity);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity10Choice.mmObject();
		}

		@Override
		public Quantity10Choice getValue(QuantityAndAccount51 obj) {
			return obj.getSettledQuantity();
		}

		@Override
		public void setValue(QuantityAndAccount51 obj, Quantity10Choice value) {
			obj.setSettledQuantity(value);
		}
	};
	@XmlElement(name = "PrevslySttldQty")
	protected FinancialInstrumentQuantity15Choice previouslySettledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
	 * SecuritiesSettlement.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrevslySttldQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslySettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument previously settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::PSTT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmPreviouslySettledQuantity
	 * QuantityAndAccount57.mmPreviouslySettledQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityAndAccount51, Optional<FinancialInstrumentQuantity15Choice>> mmPreviouslySettledQuantity = new MMMessageAssociationEnd<QuantityAndAccount51, Optional<FinancialInstrumentQuantity15Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount51.mmObject();
			isDerived = false;
			xmlTag = "PrevslySttldQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::PSTT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslySettledQuantity";
			definition = "Quantity of financial instrument previously settled.";
			nextVersions_lazy = () -> Arrays.asList(QuantityAndAccount57.mmPreviouslySettledQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity15Choice> getValue(QuantityAndAccount51 obj) {
			return obj.getPreviouslySettledQuantity();
		}

		@Override
		public void setValue(QuantityAndAccount51 obj, Optional<FinancialInstrumentQuantity15Choice> value) {
			obj.setPreviouslySettledQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "RmngToBeSttldQty")
	protected FinancialInstrumentQuantity15Choice remainingToBeSettledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice
	 * FinancialInstrumentQuantity15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
	 * SecuritiesSettlement.mmSettlementQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngToBeSttldQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingToBeSettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument remaining to be settled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::RSTT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmRemainingToBeSettledQuantity
	 * QuantityAndAccount57.mmRemainingToBeSettledQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityAndAccount51, Optional<FinancialInstrumentQuantity15Choice>> mmRemainingToBeSettledQuantity = new MMMessageAssociationEnd<QuantityAndAccount51, Optional<FinancialInstrumentQuantity15Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount51.mmObject();
			isDerived = false;
			xmlTag = "RmngToBeSttldQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::RSTT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingToBeSettledQuantity";
			definition = "Quantity of financial instrument remaining to be settled.";
			nextVersions_lazy = () -> Arrays.asList(QuantityAndAccount57.mmRemainingToBeSettledQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity15Choice> getValue(QuantityAndAccount51 obj) {
			return obj.getRemainingToBeSettledQuantity();
		}

		@Override
		public void setValue(QuantityAndAccount51 obj, Optional<FinancialInstrumentQuantity15Choice> value) {
			obj.setRemainingToBeSettledQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "PrevslySttldAmt")
	protected AmountAndDirection57 previouslySettledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection57
	 * AmountAndDirection57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrevslySttldAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslySettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money previously settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::PSTT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmPreviouslySettledAmount
	 * QuantityAndAccount57.mmPreviouslySettledAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityAndAccount51, Optional<AmountAndDirection57>> mmPreviouslySettledAmount = new MMMessageAssociationEnd<QuantityAndAccount51, Optional<AmountAndDirection57>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount51.mmObject();
			isDerived = false;
			xmlTag = "PrevslySttldAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::PSTT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslySettledAmount";
			definition = "Amount of money previously settled.";
			nextVersions_lazy = () -> Arrays.asList(QuantityAndAccount57.mmPreviouslySettledAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection57.mmObject();
		}

		@Override
		public Optional<AmountAndDirection57> getValue(QuantityAndAccount51 obj) {
			return obj.getPreviouslySettledAmount();
		}

		@Override
		public void setValue(QuantityAndAccount51 obj, Optional<AmountAndDirection57> value) {
			obj.setPreviouslySettledAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RmngToBeSttldAmt")
	protected AmountAndDirection57 remainingToBeSettledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection57
	 * AmountAndDirection57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngToBeSttldAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingToBeSettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money remaining to be settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::RSTT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmRemainingToBeSettledAmount
	 * QuantityAndAccount57.mmRemainingToBeSettledAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityAndAccount51, Optional<AmountAndDirection57>> mmRemainingToBeSettledAmount = new MMMessageAssociationEnd<QuantityAndAccount51, Optional<AmountAndDirection57>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount51.mmObject();
			isDerived = false;
			xmlTag = "RmngToBeSttldAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::RSTT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingToBeSettledAmount";
			definition = "Amount of money remaining to be settled.";
			nextVersions_lazy = () -> Arrays.asList(QuantityAndAccount57.mmRemainingToBeSettledAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection57.mmObject();
		}

		@Override
		public Optional<AmountAndDirection57> getValue(QuantityAndAccount51 obj) {
			return obj.getRemainingToBeSettledAmount();
		}

		@Override
		public void setValue(QuantityAndAccount51 obj, Optional<AmountAndDirection57> value) {
			obj.setRemainingToBeSettledAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "DnmtnChc")
	protected RestrictedFINXMax210Text denominationChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax210Text
	 * RestrictedFINXMax210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmDenominationChoice
	 * SecuritiesSettlement.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DnmtnChc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denomination of the security to be received or delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70D::DENC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmDenominationChoice
	 * QuantityAndAccount57.mmDenominationChoice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuantityAndAccount51, Optional<RestrictedFINXMax210Text>> mmDenominationChoice = new MMMessageAttribute<QuantityAndAccount51, Optional<RestrictedFINXMax210Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmDenominationChoice;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount51.mmObject();
			isDerived = false;
			xmlTag = "DnmtnChc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70D::DENC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationChoice";
			definition = "Denomination of the security to be received or delivered.";
			nextVersions_lazy = () -> Arrays.asList(QuantityAndAccount57.mmDenominationChoice);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax210Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax210Text> getValue(QuantityAndAccount51 obj) {
			return obj.getDenominationChoice();
		}

		@Override
		public void setValue(QuantityAndAccount51 obj, Optional<RestrictedFINXMax210Text> value) {
			obj.setDenominationChoice(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification109 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification109
	 * PartyIdentification109}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::ACOW</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmAccountOwner
	 * QuantityAndAccount57.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityAndAccount51, Optional<PartyIdentification109>> mmAccountOwner = new MMMessageAssociationEnd<QuantityAndAccount51, Optional<PartyIdentification109>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount51.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::ACOW"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(QuantityAndAccount57.mmAccountOwner);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification109.mmObject();
		}

		@Override
		public Optional<PartyIdentification109> getValue(QuantityAndAccount51 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(QuantityAndAccount51 obj, Optional<PartyIdentification109> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct", required = true)
	protected SecuritiesAccount27 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount27
	 * SecuritiesAccount27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97A::SAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmSafekeepingAccount
	 * QuantityAndAccount57.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityAndAccount51, SecuritiesAccount27> mmSafekeepingAccount = new MMMessageAssociationEnd<QuantityAndAccount51, SecuritiesAccount27>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount51.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97A::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(QuantityAndAccount57.mmSafekeepingAccount);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount27.mmObject();
		}

		@Override
		public SecuritiesAccount27 getValue(QuantityAndAccount51 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(QuantityAndAccount51 obj, SecuritiesAccount27 value) {
			obj.setSafekeepingAccount(value);
		}
	};
	@XmlElement(name = "CshAcct")
	protected CashAccountIdentification6Choice cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification6Choice
	 * CashAccountIdentification6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97a::CASH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmCashAccount
	 * QuantityAndAccount57.mmCashAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityAndAccount51, Optional<CashAccountIdentification6Choice>> mmCashAccount = new MMMessageAssociationEnd<QuantityAndAccount51, Optional<CashAccountIdentification6Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount51.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97a::CASH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account to or from which a cash entry is made.";
			nextVersions_lazy = () -> Arrays.asList(QuantityAndAccount57.mmCashAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountIdentification6Choice.mmObject();
		}

		@Override
		public Optional<CashAccountIdentification6Choice> getValue(QuantityAndAccount51 obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(QuantityAndAccount51 obj, Optional<CashAccountIdentification6Choice> value) {
			obj.setCashAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyBrkdwn")
	protected List<QuantityBreakdown44> quantityBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityBreakdown44
	 * QuantityBreakdown44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
	 * SecuritiesQuantity.mmLotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyBrkdwn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of a quantity into lots such as tax lots, instrument series, etc."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:BREAK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmQuantityBreakdown
	 * QuantityAndAccount57.mmQuantityBreakdown}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityAndAccount51, List<QuantityBreakdown44>> mmQuantityBreakdown = new MMMessageAssociationEnd<QuantityAndAccount51, List<QuantityBreakdown44>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmLotBreakdown;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount51.mmObject();
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:BREAK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of a quantity into lots such as tax lots, instrument series, etc.";
			nextVersions_lazy = () -> Arrays.asList(QuantityAndAccount57.mmQuantityBreakdown);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> QuantityBreakdown44.mmObject();
		}

		@Override
		public List<QuantityBreakdown44> getValue(QuantityAndAccount51 obj) {
			return obj.getQuantityBreakdown();
		}

		@Override
		public void setValue(QuantityAndAccount51 obj, List<QuantityBreakdown44> value) {
			obj.setQuantityBreakdown(value);
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected SafeKeepingPlace2 safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SafeKeepingPlace2
	 * SafeKeepingPlace2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51
	 * QuantityAndAccount51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94a::SAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmSafekeepingPlace
	 * QuantityAndAccount57.mmSafekeepingPlace}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityAndAccount51, Optional<SafeKeepingPlace2>> mmSafekeepingPlace = new MMMessageAssociationEnd<QuantityAndAccount51, Optional<SafeKeepingPlace2>>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount51.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94a::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			nextVersions_lazy = () -> Arrays.asList(QuantityAndAccount57.mmSafekeepingPlace);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafeKeepingPlace2.mmObject();
		}

		@Override
		public Optional<SafeKeepingPlace2> getValue(QuantityAndAccount51 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(QuantityAndAccount51 obj, Optional<SafeKeepingPlace2> value) {
			obj.setSafekeepingPlace(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuantityAndAccount51.mmSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount51.mmPreviouslySettledQuantity,
						com.tools20022.repository.msg.QuantityAndAccount51.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.QuantityAndAccount51.mmPreviouslySettledAmount,
						com.tools20022.repository.msg.QuantityAndAccount51.mmRemainingToBeSettledAmount, com.tools20022.repository.msg.QuantityAndAccount51.mmDenominationChoice,
						com.tools20022.repository.msg.QuantityAndAccount51.mmAccountOwner, com.tools20022.repository.msg.QuantityAndAccount51.mmSafekeepingAccount, com.tools20022.repository.msg.QuantityAndAccount51.mmCashAccount,
						com.tools20022.repository.msg.QuantityAndAccount51.mmQuantityBreakdown, com.tools20022.repository.msg.QuantityAndAccount51.mmSafekeepingPlace);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdvice002V05.mmQuantityAndAccountDetails, SecuritiesSettlementTransactionConfirmation002V06.mmQuantityAndAccountDetails);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount51, com.tools20022.repository.constraints.ConstraintSafekeepingPlaceRule.forQuantityAndAccount51,
						com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline.forQuantityAndAccount51, com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount51);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuantityAndAccount51";
				definition = "Details on the quantity, account and other related information involved in a transaction.";
				nextVersions_lazy = () -> Arrays.asList(QuantityAndAccount57.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Quantity10Choice getSettledQuantity() {
		return settledQuantity;
	}

	public QuantityAndAccount51 setSettledQuantity(Quantity10Choice settledQuantity) {
		this.settledQuantity = Objects.requireNonNull(settledQuantity);
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getPreviouslySettledQuantity() {
		return previouslySettledQuantity == null ? Optional.empty() : Optional.of(previouslySettledQuantity);
	}

	public QuantityAndAccount51 setPreviouslySettledQuantity(FinancialInstrumentQuantity15Choice previouslySettledQuantity) {
		this.previouslySettledQuantity = previouslySettledQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getRemainingToBeSettledQuantity() {
		return remainingToBeSettledQuantity == null ? Optional.empty() : Optional.of(remainingToBeSettledQuantity);
	}

	public QuantityAndAccount51 setRemainingToBeSettledQuantity(FinancialInstrumentQuantity15Choice remainingToBeSettledQuantity) {
		this.remainingToBeSettledQuantity = remainingToBeSettledQuantity;
		return this;
	}

	public Optional<AmountAndDirection57> getPreviouslySettledAmount() {
		return previouslySettledAmount == null ? Optional.empty() : Optional.of(previouslySettledAmount);
	}

	public QuantityAndAccount51 setPreviouslySettledAmount(AmountAndDirection57 previouslySettledAmount) {
		this.previouslySettledAmount = previouslySettledAmount;
		return this;
	}

	public Optional<AmountAndDirection57> getRemainingToBeSettledAmount() {
		return remainingToBeSettledAmount == null ? Optional.empty() : Optional.of(remainingToBeSettledAmount);
	}

	public QuantityAndAccount51 setRemainingToBeSettledAmount(AmountAndDirection57 remainingToBeSettledAmount) {
		this.remainingToBeSettledAmount = remainingToBeSettledAmount;
		return this;
	}

	public Optional<RestrictedFINXMax210Text> getDenominationChoice() {
		return denominationChoice == null ? Optional.empty() : Optional.of(denominationChoice);
	}

	public QuantityAndAccount51 setDenominationChoice(RestrictedFINXMax210Text denominationChoice) {
		this.denominationChoice = denominationChoice;
		return this;
	}

	public Optional<PartyIdentification109> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public QuantityAndAccount51 setAccountOwner(PartyIdentification109 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public SecuritiesAccount27 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public QuantityAndAccount51 setSafekeepingAccount(SecuritiesAccount27 safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public Optional<CashAccountIdentification6Choice> getCashAccount() {
		return cashAccount == null ? Optional.empty() : Optional.of(cashAccount);
	}

	public QuantityAndAccount51 setCashAccount(CashAccountIdentification6Choice cashAccount) {
		this.cashAccount = cashAccount;
		return this;
	}

	public List<QuantityBreakdown44> getQuantityBreakdown() {
		return quantityBreakdown == null ? quantityBreakdown = new ArrayList<>() : quantityBreakdown;
	}

	public QuantityAndAccount51 setQuantityBreakdown(List<QuantityBreakdown44> quantityBreakdown) {
		this.quantityBreakdown = Objects.requireNonNull(quantityBreakdown);
		return this;
	}

	public Optional<SafeKeepingPlace2> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public QuantityAndAccount51 setSafekeepingPlace(SafeKeepingPlace2 safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}
}