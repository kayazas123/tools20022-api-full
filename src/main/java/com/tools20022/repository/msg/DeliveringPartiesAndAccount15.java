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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyIdentification102Choice;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentificationAndAccount126;
import com.tools20022.repository.msg.PartyIdentificationAndAccount127;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Chain of parties involved in the settlement of a transaction, including
 * receipts and deliveries, book transfers, treasury deals, or other activities,
 * resulting in the movement of a security or amount of money from one account
 * to another.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount15#mmDepository
 * DeliveringPartiesAndAccount15.mmDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount15#mmParty1
 * DeliveringPartiesAndAccount15.mmParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount15#mmParty2
 * DeliveringPartiesAndAccount15.mmParty2}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveringPartiesAndAccount15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forDeliveringPartiesAndAccount15
 * ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount15}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount10
 * DeliveringPartiesAndAccount10}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DeliveringPartiesAndAccount15", propOrder = {"depository", "party1", "party2"})
public class DeliveringPartiesAndAccount15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dpstry", required = true)
	protected PartyIdentification102Choice depository;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification102Choice
	 * PartyIdentification102Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount15
	 * DeliveringPartiesAndAccount15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dpstry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Depository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First party in the settlement chain. In a plain vanilla settlement, it is the Central Securities Depository where the counterparty requests to receive the financial instrument or from where the counterparty delivers the financial instruments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount10#mmDepository
	 * DeliveringPartiesAndAccount10.mmDepository}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliveringPartiesAndAccount15, PartyIdentification102Choice> mmDepository = new MMMessageAssociationEnd<DeliveringPartiesAndAccount15, PartyIdentification102Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount15.mmObject();
			isDerived = false;
			xmlTag = "Dpstry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Depository";
			definition = "First party in the settlement chain. In a plain vanilla settlement, it is the Central Securities Depository where the counterparty requests to receive the financial instrument or from where the counterparty delivers the financial instruments.";
			previousVersion_lazy = () -> DeliveringPartiesAndAccount10.mmDepository;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification102Choice.mmObject();
		}

		@Override
		public PartyIdentification102Choice getValue(DeliveringPartiesAndAccount15 obj) {
			return obj.getDepository();
		}

		@Override
		public void setValue(DeliveringPartiesAndAccount15 obj, PartyIdentification102Choice value) {
			obj.setDepository(value);
		}
	};
	@XmlElement(name = "Pty1", required = true)
	protected PartyIdentificationAndAccount126 party1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount126
	 * PartyIdentificationAndAccount126}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount15
	 * DeliveringPartiesAndAccount15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that, in a settlement chain interacts with the depository."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount10#mmParty1
	 * DeliveringPartiesAndAccount10.mmParty1}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliveringPartiesAndAccount15, PartyIdentificationAndAccount126> mmParty1 = new MMMessageAssociationEnd<DeliveringPartiesAndAccount15, PartyIdentificationAndAccount126>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount15.mmObject();
			isDerived = false;
			xmlTag = "Pty1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party1";
			definition = "Party that, in a settlement chain interacts with the depository.";
			previousVersion_lazy = () -> DeliveringPartiesAndAccount10.mmParty1;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount126.mmObject();
		}

		@Override
		public PartyIdentificationAndAccount126 getValue(DeliveringPartiesAndAccount15 obj) {
			return obj.getParty1();
		}

		@Override
		public void setValue(DeliveringPartiesAndAccount15 obj, PartyIdentificationAndAccount126 value) {
			obj.setParty1(value);
		}
	};
	@XmlElement(name = "Pty2")
	protected PartyIdentificationAndAccount127 party2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount127
	 * PartyIdentificationAndAccount127}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount15
	 * DeliveringPartiesAndAccount15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that, in a settlement chain interacts with the party 1."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount10#mmParty2
	 * DeliveringPartiesAndAccount10.mmParty2}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliveringPartiesAndAccount15, Optional<PartyIdentificationAndAccount127>> mmParty2 = new MMMessageAssociationEnd<DeliveringPartiesAndAccount15, Optional<PartyIdentificationAndAccount127>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount15.mmObject();
			isDerived = false;
			xmlTag = "Pty2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party2";
			definition = "Party that, in a settlement chain interacts with the party 1.";
			previousVersion_lazy = () -> DeliveringPartiesAndAccount10.mmParty2;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount127.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount127> getValue(DeliveringPartiesAndAccount15 obj) {
			return obj.getParty2();
		}

		@Override
		public void setValue(DeliveringPartiesAndAccount15 obj, Optional<PartyIdentificationAndAccount127> value) {
			obj.setParty2(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveringPartiesAndAccount15.mmDepository, com.tools20022.repository.msg.DeliveringPartiesAndAccount15.mmParty1,
						com.tools20022.repository.msg.DeliveringPartiesAndAccount15.mmParty2);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forDeliveringPartiesAndAccount15);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveringPartiesAndAccount15";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
				previousVersion_lazy = () -> DeliveringPartiesAndAccount10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification102Choice getDepository() {
		return depository;
	}

	public DeliveringPartiesAndAccount15 setDepository(PartyIdentification102Choice depository) {
		this.depository = Objects.requireNonNull(depository);
		return this;
	}

	public PartyIdentificationAndAccount126 getParty1() {
		return party1;
	}

	public DeliveringPartiesAndAccount15 setParty1(PartyIdentificationAndAccount126 party1) {
		this.party1 = Objects.requireNonNull(party1);
		return this;
	}

	public Optional<PartyIdentificationAndAccount127> getParty2() {
		return party2 == null ? Optional.empty() : Optional.of(party2);
	}

	public DeliveringPartiesAndAccount15 setParty2(PartyIdentificationAndAccount127 party2) {
		this.party2 = party2;
		return this;
	}
}