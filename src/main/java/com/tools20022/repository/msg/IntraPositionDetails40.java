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
import com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice;
import com.tools20022.repository.choice.SecuritiesBalanceType6Choice;
import com.tools20022.repository.entity.IntraPositionTransfer;
import com.tools20022.repository.entity.SafekeepingPlace;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IntraPositionMovementDetails13;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the intra-position movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails40#mmSafekeepingPlace
 * IntraPositionDetails40.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails40#mmBalanceFrom
 * IntraPositionDetails40.mmBalanceFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails40#mmIntraPositionMovement
 * IntraPositionDetails40.mmIntraPositionMovement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
 * IntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraPositionDetails40"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the intra-position movement."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule2#forIntraPositionDetails40
 * ConstraintBalanceFromToRule2.forIntraPositionDetails40}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails45
 * IntraPositionDetails45}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails32
 * IntraPositionDetails32}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraPositionDetails40", propOrder = {"safekeepingPlace", "balanceFrom", "intraPositionMovement"})
public class IntraPositionDetails40 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SfkpgPlc")
	protected SafekeepingPlaceFormat10Choice safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice
	 * SafekeepingPlaceFormat10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails40
	 * IntraPositionDetails40}</li>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails45#mmSafekeepingPlace
	 * IntraPositionDetails45.mmSafekeepingPlace}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails32#mmSafekeepingPlace
	 * IntraPositionDetails32.mmSafekeepingPlace}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionDetails40, Optional<SafekeepingPlaceFormat10Choice>> mmSafekeepingPlace = new MMMessageAssociationEnd<IntraPositionDetails40, Optional<SafekeepingPlaceFormat10Choice>>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails40.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails45.mmSafekeepingPlace);
			previousVersion_lazy = () -> IntraPositionDetails32.mmSafekeepingPlace;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceFormat10Choice.mmObject();
		}

		@Override
		public Optional<SafekeepingPlaceFormat10Choice> getValue(IntraPositionDetails40 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(IntraPositionDetails40 obj, Optional<SafekeepingPlaceFormat10Choice> value) {
			obj.setSafekeepingPlace(value.orElse(null));
		}
	};
	@XmlElement(name = "BalFr", required = true)
	protected SecuritiesBalanceType6Choice balanceFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesBalanceType6Choice
	 * SecuritiesBalanceType6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
	 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails40
	 * IntraPositionDetails40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance from which the securities were moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails45#mmBalanceFrom
	 * IntraPositionDetails45.mmBalanceFrom}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails32#mmBalanceFrom
	 * IntraPositionDetails32.mmBalanceFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionDetails40, SecuritiesBalanceType6Choice> mmBalanceFrom = new MMMessageAssociationEnd<IntraPositionDetails40, SecuritiesBalanceType6Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails40.mmObject();
			isDerived = false;
			xmlTag = "BalFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFrom";
			definition = "Balance from which the securities were moved.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails45.mmBalanceFrom);
			previousVersion_lazy = () -> IntraPositionDetails32.mmBalanceFrom;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesBalanceType6Choice.mmObject();
		}

		@Override
		public SecuritiesBalanceType6Choice getValue(IntraPositionDetails40 obj) {
			return obj.getBalanceFrom();
		}

		@Override
		public void setValue(IntraPositionDetails40 obj, SecuritiesBalanceType6Choice value) {
			obj.setBalanceFrom(value);
		}
	};
	@XmlElement(name = "IntraPosMvmnt", required = true)
	protected List<IntraPositionMovementDetails13> intraPositionMovement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13
	 * IntraPositionMovementDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
	 * IntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails40
	 * IntraPositionDetails40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraPosMvmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intra-position movement(s) having been performed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails45#mmIntraPositionMovement
	 * IntraPositionDetails45.mmIntraPositionMovement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails32#mmIntraPositionMovement
	 * IntraPositionDetails32.mmIntraPositionMovement}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionDetails40, List<IntraPositionMovementDetails13>> mmIntraPositionMovement = new MMMessageAssociationEnd<IntraPositionDetails40, List<IntraPositionMovementDetails13>>() {
		{
			businessComponentTrace_lazy = () -> IntraPositionTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails40.mmObject();
			isDerived = false;
			xmlTag = "IntraPosMvmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionMovement";
			definition = "Intra-position movement(s) having been performed.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails45.mmIntraPositionMovement);
			previousVersion_lazy = () -> IntraPositionDetails32.mmIntraPositionMovement;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IntraPositionMovementDetails13.mmObject();
		}

		@Override
		public List<IntraPositionMovementDetails13> getValue(IntraPositionDetails40 obj) {
			return obj.getIntraPositionMovement();
		}

		@Override
		public void setValue(IntraPositionDetails40 obj, List<IntraPositionMovementDetails13> value) {
			obj.setIntraPositionMovement(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraPositionDetails40.mmSafekeepingPlace, com.tools20022.repository.msg.IntraPositionDetails40.mmBalanceFrom,
						com.tools20022.repository.msg.IntraPositionDetails40.mmIntraPositionMovement);
				trace_lazy = () -> IntraPositionTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceFromToRule2.forIntraPositionDetails40);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IntraPositionDetails40";
				definition = "Details of the intra-position movement.";
				nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails45.mmObject());
				previousVersion_lazy = () -> IntraPositionDetails32.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SafekeepingPlaceFormat10Choice> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public IntraPositionDetails40 setSafekeepingPlace(SafekeepingPlaceFormat10Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public SecuritiesBalanceType6Choice getBalanceFrom() {
		return balanceFrom;
	}

	public IntraPositionDetails40 setBalanceFrom(SecuritiesBalanceType6Choice balanceFrom) {
		this.balanceFrom = Objects.requireNonNull(balanceFrom);
		return this;
	}

	public List<IntraPositionMovementDetails13> getIntraPositionMovement() {
		return intraPositionMovement == null ? intraPositionMovement = new ArrayList<>() : intraPositionMovement;
	}

	public IntraPositionDetails40 setIntraPositionMovement(List<IntraPositionMovementDetails13> intraPositionMovement) {
		this.intraPositionMovement = Objects.requireNonNull(intraPositionMovement);
		return this;
	}
}