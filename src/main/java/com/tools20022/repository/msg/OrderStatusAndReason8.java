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
import com.tools20022.repository.area.setr.OrderCancellationStatusReportV03;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.OrderCancellationStatus1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Order;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RejectedStatus7;
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
 * Status report of a bulk or multiple or switch order cancellation instruction
 * that was previously received.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8#TypeOfStatusRule
 * OrderStatusAndReason8.TypeOfStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8#mmMasterReference
 * OrderStatusAndReason8.mmMasterReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatusAndReason8#mmStatus
 * OrderStatusAndReason8.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8#mmRejected
 * OrderStatusAndReason8.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8#mmStatusInitiator
 * OrderStatusAndReason8.mmStatusInitiator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmCancellationStatusReport
 * OrderCancellationStatusReportV03.mmCancellationStatusReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderStatusAndReason8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status report of a bulk or multiple or switch order cancellation instruction that was previously received."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OrderStatusAndReason9
 * OrderStatusAndReason9}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderStatusAndReason8", propOrder = {"masterReference", "status", "rejected", "statusInitiator"})
public class OrderStatusAndReason8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8
	 * OrderStatusAndReason8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to a set of orders or trades in order to link them together."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason9#mmMasterReference
	 * OrderStatusAndReason9.mmMasterReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderStatusAndReason8, Optional<Max35Text>> mmMasterReference = new MMMessageAttribute<OrderStatusAndReason8, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason8.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Reference assigned to a set of orders or trades in order to link them together.";
			nextVersions_lazy = () -> Arrays.asList(OrderStatusAndReason9.mmMasterReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OrderStatusAndReason8 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(OrderStatusAndReason8 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected OrderCancellationStatus1Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderCancellationStatus1Code
	 * OrderCancellationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmCancellationStatus
	 * SecuritiesOrderStatus.mmCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8
	 * OrderStatusAndReason8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation status of the order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrderStatusAndReason8, OrderCancellationStatus1Code> mmStatus = new MMMessageAttribute<OrderStatusAndReason8, OrderCancellationStatus1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmCancellationStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason8.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Cancellation status of the order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderCancellationStatus1Code.mmObject();
		}

		@Override
		public OrderCancellationStatus1Code getValue(OrderStatusAndReason8 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(OrderStatusAndReason8 obj, OrderCancellationStatus1Code value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected RejectedStatus7 rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RejectedStatus7
	 * RejectedStatus7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectedStatusReason
	 * StatusReason.mmRejectedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8
	 * OrderStatusAndReason8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the order cancellation request is rejected."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderStatusAndReason8, RejectedStatus7> mmRejected = new MMMessageAssociationEnd<OrderStatusAndReason8, RejectedStatus7>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason8.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Status of the order cancellation request is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedStatus7.mmObject();
		}

		@Override
		public RejectedStatus7 getValue(OrderStatusAndReason8 obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(OrderStatusAndReason8 obj, RejectedStatus7 value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "StsInitr")
	protected PartyIdentification2Choice statusInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8
	 * OrderStatusAndReason8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsInitr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusInitiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that initiates the status of the order cancellation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason9#mmStatusInitiator
	 * OrderStatusAndReason9.mmStatusInitiator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OrderStatusAndReason8, Optional<PartyIdentification2Choice>> mmStatusInitiator = new MMMessageAssociationEnd<OrderStatusAndReason8, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason8.mmObject();
			isDerived = false;
			xmlTag = "StsInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusInitiator";
			definition = "Party that initiates the status of the order cancellation.";
			nextVersions_lazy = () -> Arrays.asList(OrderStatusAndReason9.mmStatusInitiator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(OrderStatusAndReason8 obj) {
			return obj.getStatusInitiator();
		}

		@Override
		public void setValue(OrderStatusAndReason8 obj, Optional<PartyIdentification2Choice> value) {
			obj.setStatusInitiator(value.orElse(null));
		}
	};
	/**
	 * Either Status or Rejected must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8
	 * OrderStatusAndReason8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8#mmStatus
	 * OrderStatusAndReason8.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8#mmRejected
	 * OrderStatusAndReason8.mmRejected}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either Status or Rejected must be present, but not both."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor TypeOfStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfStatusRule";
			definition = "Either Status or Rejected must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.OrderStatusAndReason8.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatusAndReason8.mmStatus, com.tools20022.repository.msg.OrderStatusAndReason8.mmRejected);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatusAndReason8.mmMasterReference, com.tools20022.repository.msg.OrderStatusAndReason8.mmStatus,
						com.tools20022.repository.msg.OrderStatusAndReason8.mmRejected, com.tools20022.repository.msg.OrderStatusAndReason8.mmStatusInitiator);
				messageBuildingBlock_lazy = () -> Arrays.asList(OrderCancellationStatusReportV03.mmCancellationStatusReport);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "OrderStatusAndReason8";
				definition = "Status report of a bulk or multiple or switch order cancellation instruction that was previously received.";
				nextVersions_lazy = () -> Arrays.asList(OrderStatusAndReason9.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OrderStatusAndReason8.TypeOfStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public OrderStatusAndReason8 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public OrderCancellationStatus1Code getStatus() {
		return status;
	}

	public OrderStatusAndReason8 setStatus(OrderCancellationStatus1Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public RejectedStatus7 getRejected() {
		return rejected;
	}

	public OrderStatusAndReason8 setRejected(RejectedStatus7 rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public Optional<PartyIdentification2Choice> getStatusInitiator() {
		return statusInitiator == null ? Optional.empty() : Optional.of(statusInitiator);
	}

	public OrderStatusAndReason8 setStatusInitiator(PartyIdentification2Choice statusInitiator) {
		this.statusInitiator = statusInitiator;
		return this;
	}
}