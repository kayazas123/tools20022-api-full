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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies how the supply chain shipping arrangements and the delivery of
 * products and/or services as well as related documentation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeDelivery3#mmDeliveryPeriod
 * TradeDelivery3.mmDeliveryPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeDelivery3#mmDeliveryDateTime
 * TradeDelivery3.mmDeliveryDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery3#mmShipFrom
 * TradeDelivery3.mmShipFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery3#mmShipTo
 * TradeDelivery3.mmShipTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeDelivery3#mmUltimateShipTo
 * TradeDelivery3.mmUltimateShipTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery3#mmDeliveryNote
 * TradeDelivery3.mmDeliveryNote}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery3#mmConsignment
 * TradeDelivery3.mmConsignment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ProductDelivery
 * ProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeDelivery3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies how the supply chain shipping arrangements and the delivery of products and/or services as well as related documentation."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TradeDelivery2
 * TradeDelivery2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeDelivery3", propOrder = {"deliveryPeriod", "deliveryDateTime", "shipFrom", "shipTo", "ultimateShipTo", "deliveryNote", "consignment"})
public class TradeDelivery3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DlvryPrd")
	protected Period14 deliveryPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period14
	 * Period14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmDeliveryPeriod
	 * ProductDelivery.mmDeliveryPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery3 TradeDelivery3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual delivery period of the products and/or services."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmDeliveryPeriod
	 * TradeDelivery2.mmDeliveryPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProductDelivery.mmDeliveryPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDelivery3.mmObject();
			isDerived = false;
			xmlTag = "DlvryPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryPeriod";
			definition = "Actual delivery period of the products and/or services.";
			previousVersion_lazy = () -> TradeDelivery2.mmDeliveryPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period14.mmObject();
		}
	};
	@XmlElement(name = "DlvryDtTm")
	protected ISODateTime deliveryDateTime;
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
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery3 TradeDelivery3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actual delivery date/time of the products and/or services."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmDeliveryDateTime
	 * TradeDelivery2.mmDeliveryDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDelivery3.mmObject();
			isDerived = false;
			xmlTag = "DlvryDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryDateTime";
			definition = "Actual delivery date/time of the products and/or services.";
			previousVersion_lazy = () -> TradeDelivery2.mmDeliveryDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "ShipFr")
	protected TradeParty4 shipFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty4
	 * TradeParty4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipFrom ShipFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery3 TradeDelivery3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShipFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party from whom the goods are dispatched."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmShipFrom
	 * TradeDelivery2.mmShipFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShipFrom = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ShipFrom.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDelivery3.mmObject();
			isDerived = false;
			xmlTag = "ShipFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipFrom";
			definition = "Party from whom the goods are dispatched.";
			previousVersion_lazy = () -> TradeDelivery2.mmShipFrom;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeParty4.mmObject();
		}
	};
	@XmlElement(name = "ShipTo")
	protected TradeParty4 shipTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty4
	 * TradeParty4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipTo ShipTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery3 TradeDelivery3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShipTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to whom the goods are dispatched."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmShipTo
	 * TradeDelivery2.mmShipTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShipTo = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ShipTo.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDelivery3.mmObject();
			isDerived = false;
			xmlTag = "ShipTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipTo";
			definition = "Party to whom the goods are dispatched.";
			previousVersion_lazy = () -> TradeDelivery2.mmShipTo;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeParty4.mmObject();
		}
	};
	@XmlElement(name = "UltmtShipTo")
	protected TradeParty4 ultimateShipTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty4
	 * TradeParty4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipTo ShipTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery3 TradeDelivery3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtShipTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateShipTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Final party to whom the goods are dispatched."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmUltimateShipTo
	 * TradeDelivery2.mmUltimateShipTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUltimateShipTo = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ShipTo.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDelivery3.mmObject();
			isDerived = false;
			xmlTag = "UltmtShipTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateShipTo";
			definition = "Final party to whom the goods are dispatched.";
			previousVersion_lazy = () -> TradeDelivery2.mmUltimateShipTo;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeParty4.mmObject();
		}
	};
	@XmlElement(name = "DlvryNote")
	protected DocumentIdentification22 deliveryNote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22
	 * DocumentIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveryNote DeliveryNote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery3 TradeDelivery3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivery note related to the delivery of the products and/or services."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmDeliveryNote
	 * TradeDelivery2.mmDeliveryNote}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryNote = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> DeliveryNote.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDelivery3.mmObject();
			isDerived = false;
			xmlTag = "DlvryNote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryNote";
			definition = "Delivery note related to the delivery of the products and/or services.";
			previousVersion_lazy = () -> TradeDelivery2.mmDeliveryNote;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DocumentIdentification22.mmObject();
		}
	};
	@XmlElement(name = "Consgnmt")
	protected List<com.tools20022.repository.msg.Consignment5> consignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Consignment5
	 * Consignment5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmRouting
	 * ProductDelivery.mmRouting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery3 TradeDelivery3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Consgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical consolidation of goods for transport."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmConsignment
	 * TradeDelivery2.mmConsignment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConsignment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ProductDelivery.mmRouting;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDelivery3.mmObject();
			isDerived = false;
			xmlTag = "Consgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignment";
			definition = "Physical consolidation of goods for transport.";
			previousVersion_lazy = () -> TradeDelivery2.mmConsignment;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Consignment5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeDelivery3.mmDeliveryPeriod, com.tools20022.repository.msg.TradeDelivery3.mmDeliveryDateTime,
						com.tools20022.repository.msg.TradeDelivery3.mmShipFrom, com.tools20022.repository.msg.TradeDelivery3.mmShipTo, com.tools20022.repository.msg.TradeDelivery3.mmUltimateShipTo,
						com.tools20022.repository.msg.TradeDelivery3.mmDeliveryNote, com.tools20022.repository.msg.TradeDelivery3.mmConsignment);
				trace_lazy = () -> ProductDelivery.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeDelivery3";
				definition = "Specifies how the supply chain shipping arrangements and the delivery of products and/or services as well as related documentation.";
				previousVersion_lazy = () -> TradeDelivery2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Period14> getDeliveryPeriod() {
		return deliveryPeriod == null ? Optional.empty() : Optional.of(deliveryPeriod);
	}

	public TradeDelivery3 setDeliveryPeriod(com.tools20022.repository.msg.Period14 deliveryPeriod) {
		this.deliveryPeriod = deliveryPeriod;
		return this;
	}

	public Optional<ISODateTime> getDeliveryDateTime() {
		return deliveryDateTime == null ? Optional.empty() : Optional.of(deliveryDateTime);
	}

	public TradeDelivery3 setDeliveryDateTime(ISODateTime deliveryDateTime) {
		this.deliveryDateTime = deliveryDateTime;
		return this;
	}

	public Optional<TradeParty4> getShipFrom() {
		return shipFrom == null ? Optional.empty() : Optional.of(shipFrom);
	}

	public TradeDelivery3 setShipFrom(com.tools20022.repository.msg.TradeParty4 shipFrom) {
		this.shipFrom = shipFrom;
		return this;
	}

	public Optional<TradeParty4> getShipTo() {
		return shipTo == null ? Optional.empty() : Optional.of(shipTo);
	}

	public TradeDelivery3 setShipTo(com.tools20022.repository.msg.TradeParty4 shipTo) {
		this.shipTo = shipTo;
		return this;
	}

	public Optional<TradeParty4> getUltimateShipTo() {
		return ultimateShipTo == null ? Optional.empty() : Optional.of(ultimateShipTo);
	}

	public TradeDelivery3 setUltimateShipTo(com.tools20022.repository.msg.TradeParty4 ultimateShipTo) {
		this.ultimateShipTo = ultimateShipTo;
		return this;
	}

	public Optional<DocumentIdentification22> getDeliveryNote() {
		return deliveryNote == null ? Optional.empty() : Optional.of(deliveryNote);
	}

	public TradeDelivery3 setDeliveryNote(com.tools20022.repository.msg.DocumentIdentification22 deliveryNote) {
		this.deliveryNote = deliveryNote;
		return this;
	}

	public List<Consignment5> getConsignment() {
		return consignment == null ? consignment = new ArrayList<>() : consignment;
	}

	public TradeDelivery3 setConsignment(List<com.tools20022.repository.msg.Consignment5> consignment) {
		this.consignment = Objects.requireNonNull(consignment);
		return this;
	}
}