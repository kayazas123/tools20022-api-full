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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.setr.RedemptionBulkOrderV03;
import com.tools20022.repository.area.setr.RedemptionOrderV03;
import com.tools20022.repository.area.setr.SubscriptionBulkOrderV03;
import com.tools20022.repository.area.setr.SubscriptionOrderV03;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.InvestmentFundRole2Code;
import com.tools20022.repository.codeset.OrderOriginatorEligibility1Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.entity.InvestorRole;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.TradePartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Account7;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Party that provides services to investors relating to financial products.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary8#RoleOrExtendedRoleRule
 * Intermediary8.RoleOrExtendedRoleRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary8#mmIdentification
 * Intermediary8.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary8#mmAccount
 * Intermediary8.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Intermediary8#mmOrderOriginatorEligibility
 * Intermediary8.mmOrderOriginatorEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary8#mmRole
 * Intermediary8.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary8#mmExtendedRole
 * Intermediary8.mmExtendedRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV03#mmRelatedPartyDetails
 * RedemptionBulkOrderV03.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV03#mmRelatedPartyDetails
 * RedemptionOrderV03.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV03#mmRelatedPartyDetails
 * SubscriptionBulkOrderV03.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV03#mmRelatedPartyDetails
 * SubscriptionOrderV03.mmRelatedPartyDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Intermediary8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that provides services to investors relating to financial products."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility1Rule#forIntermediary8
 * ConstraintOrderOriginatorEligibility1Rule.forIntermediary8}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary29 Intermediary29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary40 Intermediary40}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Intermediary8", propOrder = {"identification", "account", "orderOriginatorEligibility", "role", "extendedRole"})
public class Intermediary8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected PartyIdentification2Choice identification;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary8 Intermediary8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identifier of the intermediary."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary40#mmIdentification
	 * Intermediary40.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Intermediary8, PartyIdentification2Choice> mmIdentification = new MMMessageAttribute<Intermediary8, PartyIdentification2Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary8.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier of the intermediary.";
			nextVersions_lazy = () -> Arrays.asList(Intermediary40.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public PartyIdentification2Choice getValue(Intermediary8 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Intermediary8 obj, PartyIdentification2Choice value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Acct")
	protected Account7 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Account7 Account7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmAccount
	 * TradePartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary8 Intermediary8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business relationship between two entities; one entity is the account owner, the other entity is the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary40#mmAccount
	 * Intermediary40.mmAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Intermediary8, Optional<Account7>> mmAccount = new MMMessageAssociationEnd<Intermediary8, Optional<Account7>>() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary8.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Business relationship between two entities; one entity is the account owner, the other entity is the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(Intermediary40.mmAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Account7.mmObject();
		}

		@Override
		public Optional<Account7> getValue(Intermediary8 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(Intermediary8 obj, Optional<Account7> value) {
			obj.setAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrOrgtrElgblty")
	protected OrderOriginatorEligibility1Code orderOriginatorEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderOriginatorEligibility1Code
	 * OrderOriginatorEligibility1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole#mmCapacity
	 * InvestorRole.mmCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary8 Intermediary8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrOrgtrElgblty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary40#mmOrderOriginatorEligibility
	 * Intermediary40.mmOrderOriginatorEligibility}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Intermediary8, Optional<OrderOriginatorEligibility1Code>> mmOrderOriginatorEligibility = new MMMessageAttribute<Intermediary8, Optional<OrderOriginatorEligibility1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestorRole.mmCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary8.mmObject();
			isDerived = false;
			xmlTag = "OrdrOrgtrElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility";
			definition = "Counterparties eligibility as defined by article 24 of the EU MiFID Directive applicable to transactions executed by investment firms for eligible counterparties.";
			nextVersions_lazy = () -> Arrays.asList(Intermediary40.mmOrderOriginatorEligibility);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OrderOriginatorEligibility1Code.mmObject();
		}

		@Override
		public Optional<OrderOriginatorEligibility1Code> getValue(Intermediary8 obj) {
			return obj.getOrderOriginatorEligibility();
		}

		@Override
		public void setValue(Intermediary8 obj, Optional<OrderOriginatorEligibility1Code> value) {
			obj.setOrderOriginatorEligibility(value.orElse(null));
		}
	};
	@XmlElement(name = "Role")
	protected InvestmentFundRole2Code role;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary8 Intermediary8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Role"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Function performed by the intermediary."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary40#mmRole
	 * Intermediary40.mmRole}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Intermediary8, Optional<InvestmentFundRole2Code>> mmRole = new MMMessageAttribute<Intermediary8, Optional<InvestmentFundRole2Code>>() {
		{
			businessComponentTrace_lazy = () -> TradePartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary8.mmObject();
			isDerived = false;
			xmlTag = "Role";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Role";
			definition = "Function performed by the intermediary.";
			nextVersions_lazy = () -> Arrays.asList(Intermediary40.mmRole);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InvestmentFundRole2Code.mmObject();
		}

		@Override
		public Optional<InvestmentFundRole2Code> getValue(Intermediary8 obj) {
			return obj.getRole();
		}

		@Override
		public void setValue(Intermediary8 obj, Optional<InvestmentFundRole2Code> value) {
			obj.setRole(value.orElse(null));
		}
	};
	@XmlElement(name = "XtndedRole")
	protected Extended350Code extendedRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole
	 * TradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary8 Intermediary8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedRole"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Function performed by the intermediary."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Intermediary8, Optional<Extended350Code>> mmExtendedRole = new MMMessageAttribute<Intermediary8, Optional<Extended350Code>>() {
		{
			businessComponentTrace_lazy = () -> TradePartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Intermediary8.mmObject();
			isDerived = false;
			xmlTag = "XtndedRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedRole";
			definition = "Function performed by the intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Optional<Extended350Code> getValue(Intermediary8 obj) {
			return obj.getExtendedRole();
		}

		@Override
		public void setValue(Intermediary8 obj, Optional<Extended350Code> value) {
			obj.setExtendedRole(value.orElse(null));
		}
	};
	/**
	 * Either Role or ExtendedRole may be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.Intermediary8 Intermediary8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary8#mmRole
	 * Intermediary8.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary8#mmExtendedRole
	 * Intermediary8.mmExtendedRole}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoleOrExtendedRoleRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either Role or ExtendedRole may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor RoleOrExtendedRoleRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoleOrExtendedRoleRule";
			definition = "Either Role or ExtendedRole may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.Intermediary8.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary8.mmRole, com.tools20022.repository.msg.Intermediary8.mmExtendedRole);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary8.mmIdentification, com.tools20022.repository.msg.Intermediary8.mmAccount,
						com.tools20022.repository.msg.Intermediary8.mmOrderOriginatorEligibility, com.tools20022.repository.msg.Intermediary8.mmRole, com.tools20022.repository.msg.Intermediary8.mmExtendedRole);
				messageBuildingBlock_lazy = () -> Arrays.asList(RedemptionBulkOrderV03.mmRelatedPartyDetails, RedemptionOrderV03.mmRelatedPartyDetails, SubscriptionBulkOrderV03.mmRelatedPartyDetails,
						SubscriptionOrderV03.mmRelatedPartyDetails);
				trace_lazy = () -> TradePartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility1Rule.forIntermediary8);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Intermediary8";
				definition = "Party that provides services to investors relating to financial products.";
				nextVersions_lazy = () -> Arrays.asList(Intermediary29.mmObject(), Intermediary40.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary8.RoleOrExtendedRoleRule);
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification2Choice getIdentification() {
		return identification;
	}

	public Intermediary8 setIdentification(PartyIdentification2Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Account7> getAccount() {
		return account == null ? Optional.empty() : Optional.of(account);
	}

	public Intermediary8 setAccount(Account7 account) {
		this.account = account;
		return this;
	}

	public Optional<OrderOriginatorEligibility1Code> getOrderOriginatorEligibility() {
		return orderOriginatorEligibility == null ? Optional.empty() : Optional.of(orderOriginatorEligibility);
	}

	public Intermediary8 setOrderOriginatorEligibility(OrderOriginatorEligibility1Code orderOriginatorEligibility) {
		this.orderOriginatorEligibility = orderOriginatorEligibility;
		return this;
	}

	public Optional<InvestmentFundRole2Code> getRole() {
		return role == null ? Optional.empty() : Optional.of(role);
	}

	public Intermediary8 setRole(InvestmentFundRole2Code role) {
		this.role = role;
		return this;
	}

	public Optional<Extended350Code> getExtendedRole() {
		return extendedRole == null ? Optional.empty() : Optional.of(extendedRole);
	}

	public Intermediary8 setExtendedRole(Extended350Code extendedRole) {
		this.extendedRole = extendedRole;
		return this;
	}
}