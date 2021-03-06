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
import com.tools20022.repository.choice.ChargeBasisType1Choice;
import com.tools20022.repository.choice.ChargeType4Choice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.ChargeBearer1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Charges;
import com.tools20022.repository.entity.Party;
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
 * Amount of money associated with a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Charge27#mmType
 * Charge27.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge27#mmAmount
 * Charge27.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge27#mmChargeBasis
 * Charge27.mmChargeBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Charge27#mmChargeBearer
 * Charge27.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Charge27#mmRecipientIdentification
 * Charge27.mmRecipientIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Charge27"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount of money associated with a service."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Charge29 Charge29}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Charge20
 * Charge20}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Charge27", propOrder = {"type", "amount", "chargeBasis", "chargeBearer", "recipientIdentification"})
public class Charge27 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected ChargeType4Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ChargeType4Choice
	 * ChargeType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmChargeType
	 * Charges.mmChargeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Charge27
	 * Charge27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of charge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge29#mmType
	 * Charge29.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Charge27, ChargeType4Choice> mmType = new MMMessageAssociationEnd<Charge27, ChargeType4Choice>() {
		{
			businessElementTrace_lazy = () -> Charges.mmChargeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Charge27.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of charge.";
			nextVersions_lazy = () -> Arrays.asList(Charge29.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ChargeType4Choice.mmObject();
		}

		@Override
		public ChargeType4Choice getValue(Charge27 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Charge27 obj, ChargeType4Choice value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Charge27
	 * Charge27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money asked or paid for the charge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge29#mmAmount
	 * Charge29.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Charge20#mmAmount
	 * Charge20.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Charge27, ActiveOrHistoricCurrencyAndAmount> mmAmount = new MMMessageAttribute<Charge27, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Charge27.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money asked or paid for the charge.";
			nextVersions_lazy = () -> Arrays.asList(Charge29.mmAmount);
			previousVersion_lazy = () -> Charge20.mmAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(Charge27 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Charge27 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "ChrgBsis")
	protected ChargeBasisType1Choice chargeBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ChargeBasisType1Choice
	 * ChargeBasisType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCalculationMethod
	 * Adjustment.mmCalculationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Charge27
	 * Charge27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgBsis"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method used to calculate the charge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge29#mmChargeBasis
	 * Charge29.mmChargeBasis}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Charge27, Optional<ChargeBasisType1Choice>> mmChargeBasis = new MMMessageAssociationEnd<Charge27, Optional<ChargeBasisType1Choice>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmCalculationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Charge27.mmObject();
			isDerived = false;
			xmlTag = "ChrgBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBasis";
			definition = "Method used to calculate the charge.";
			nextVersions_lazy = () -> Arrays.asList(Charge29.mmChargeBasis);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ChargeBasisType1Choice.mmObject();
		}

		@Override
		public Optional<ChargeBasisType1Choice> getValue(Charge27 obj) {
			return obj.getChargeBasis();
		}

		@Override
		public void setValue(Charge27 obj, Optional<ChargeBasisType1Choice> value) {
			obj.setChargeBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgBr")
	protected ChargeBearer1Code chargeBearer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearer1Code
	 * ChargeBearer1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmBearerType
	 * Charges.mmBearerType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Charge27
	 * Charge27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgBr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party that will bear the charges associated with a transfer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge29#mmChargeBearer
	 * Charge29.mmChargeBearer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Charge27, Optional<ChargeBearer1Code>> mmChargeBearer = new MMMessageAttribute<Charge27, Optional<ChargeBearer1Code>>() {
		{
			businessElementTrace_lazy = () -> Charges.mmBearerType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Charge27.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies the party that will bear the charges associated with a transfer.";
			nextVersions_lazy = () -> Arrays.asList(Charge29.mmChargeBearer);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearer1Code.mmObject();
		}

		@Override
		public Optional<ChargeBearer1Code> getValue(Charge27 obj) {
			return obj.getChargeBearer();
		}

		@Override
		public void setValue(Charge27 obj, Optional<ChargeBearer1Code> value) {
			obj.setChargeBearer(value.orElse(null));
		}
	};
	@XmlElement(name = "RcptId")
	protected PartyIdentification2Choice recipientIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Charge27
	 * Charge27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party entitled to the amount of money resulting from a charge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Charge29#mmRecipientIdentification
	 * Charge29.mmRecipientIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Charge20#mmRecipientIdentification
	 * Charge20.mmRecipientIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Charge27, Optional<PartyIdentification2Choice>> mmRecipientIdentification = new MMMessageAttribute<Charge27, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Charge27.mmObject();
			isDerived = false;
			xmlTag = "RcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientIdentification";
			definition = "Party entitled to the amount of money resulting from a charge.";
			nextVersions_lazy = () -> Arrays.asList(Charge29.mmRecipientIdentification);
			previousVersion_lazy = () -> Charge20.mmRecipientIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(Charge27 obj) {
			return obj.getRecipientIdentification();
		}

		@Override
		public void setValue(Charge27 obj, Optional<PartyIdentification2Choice> value) {
			obj.setRecipientIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Charge27.mmType, com.tools20022.repository.msg.Charge27.mmAmount, com.tools20022.repository.msg.Charge27.mmChargeBasis,
						com.tools20022.repository.msg.Charge27.mmChargeBearer, com.tools20022.repository.msg.Charge27.mmRecipientIdentification);
				trace_lazy = () -> Charges.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Charge27";
				definition = "Amount of money associated with a service.";
				nextVersions_lazy = () -> Arrays.asList(Charge29.mmObject());
				previousVersion_lazy = () -> Charge20.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ChargeType4Choice getType() {
		return type;
	}

	public Charge27 setType(ChargeType4Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getAmount() {
		return amount;
	}

	public Charge27 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Optional<ChargeBasisType1Choice> getChargeBasis() {
		return chargeBasis == null ? Optional.empty() : Optional.of(chargeBasis);
	}

	public Charge27 setChargeBasis(ChargeBasisType1Choice chargeBasis) {
		this.chargeBasis = chargeBasis;
		return this;
	}

	public Optional<ChargeBearer1Code> getChargeBearer() {
		return chargeBearer == null ? Optional.empty() : Optional.of(chargeBearer);
	}

	public Charge27 setChargeBearer(ChargeBearer1Code chargeBearer) {
		this.chargeBearer = chargeBearer;
		return this;
	}

	public Optional<PartyIdentification2Choice> getRecipientIdentification() {
		return recipientIdentification == null ? Optional.empty() : Optional.of(recipientIdentification);
	}

	public Charge27 setRecipientIdentification(PartyIdentification2Choice recipientIdentification) {
		this.recipientIdentification = recipientIdentification;
		return this;
	}
}