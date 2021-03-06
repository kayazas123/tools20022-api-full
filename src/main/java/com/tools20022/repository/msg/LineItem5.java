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
import com.tools20022.repository.choice.TransportMeans1Choice;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.YesNoIndicator;
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
 * Commercial details of a trade transaction between a buyer and a seller.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmGoodsDescription
 * LineItem5.mmGoodsDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmPartialShipment
 * LineItem5.mmPartialShipment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmTransShipment
 * LineItem5.mmTransShipment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmLatestShipmentDate
 * LineItem5.mmLatestShipmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmLineItemDetails
 * LineItem5.mmLineItemDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem5#mmLineItemsTotalAmount
 * LineItem5.mmLineItemsTotalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmRoutingSummary
 * LineItem5.mmRoutingSummary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmIncoterms
 * LineItem5.mmIncoterms}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmAdjustment
 * LineItem5.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmFreightCharges
 * LineItem5.mmFreightCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmTax
 * LineItem5.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmTotalNetAmount
 * LineItem5.mmTotalNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem5#mmBuyerDefinedInformation
 * LineItem5.mmBuyerDefinedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItem5#mmSellerDefinedInformation
 * LineItem5.mmSellerDefinedInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CommercialTrade
 * CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LineItem5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Commercial details of a trade transaction between a buyer and a seller."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintLatestShipmentDateRule#forLineItem5
 * ConstraintLatestShipmentDateRule.forLineItem5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRoutingSummaryRule#forLineItem5
 * ConstraintRoutingSummaryRule.forLineItem5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIncotermsRule#forLineItem5
 * ConstraintIncotermsRule.forLineItem5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule#forLineItem5
 * ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LineItem5", propOrder = {"goodsDescription", "partialShipment", "transShipment", "latestShipmentDate", "lineItemDetails", "lineItemsTotalAmount", "routingSummary", "incoterms", "adjustment", "freightCharges", "tax",
		"totalNetAmount", "buyerDefinedInformation", "sellerDefinedInformation"})
public class LineItem5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GoodsDesc")
	protected Max70Text goodsDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmDescription
	 * Product.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem5
	 * LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GoodsDesc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoodsDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the goods and/or services of a trade transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem5, Optional<Max70Text>> mmGoodsDescription = new MMMessageAttribute<LineItem5, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> Product.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
			isDerived = false;
			xmlTag = "GoodsDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoodsDescription";
			definition = "Information about the goods and/or services of a trade transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(LineItem5 obj) {
			return obj.getGoodsDescription();
		}

		@Override
		public void setValue(LineItem5 obj, Optional<Max70Text> value) {
			obj.setGoodsDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtlShipmnt", required = true)
	protected YesNoIndicator partialShipment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPartialShipment
	 * Transport.mmPartialShipment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem5
	 * LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlShipmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether or not partial shipments are allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem5, YesNoIndicator> mmPartialShipment = new MMMessageAttribute<LineItem5, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPartialShipment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
			isDerived = false;
			xmlTag = "PrtlShipmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialShipment";
			definition = "Indicates whether or not partial shipments are allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(LineItem5 obj) {
			return obj.getPartialShipment();
		}

		@Override
		public void setValue(LineItem5 obj, YesNoIndicator value) {
			obj.setPartialShipment(value);
		}
	};
	@XmlElement(name = "TrnsShipmnt")
	protected YesNoIndicator transShipment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransShipment
	 * Transport.mmTransShipment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem5
	 * LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsShipmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not transshipment of goods is allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem5, Optional<YesNoIndicator>> mmTransShipment = new MMMessageAttribute<LineItem5, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransShipment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
			isDerived = false;
			xmlTag = "TrnsShipmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransShipment";
			definition = "Indicates whether or not transshipment of goods is allowed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(LineItem5 obj) {
			return obj.getTransShipment();
		}

		@Override
		public void setValue(LineItem5 obj, Optional<YesNoIndicator> value) {
			obj.setTransShipment(value.orElse(null));
		}
	};
	@XmlElement(name = "LatstShipmntDt")
	protected ISODate latestShipmentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmLatestShipmentDate
	 * ShipmentDateRange.mmLatestShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem5
	 * LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LatstShipmntDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LatestShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Latest date whereby the goods must be shipped."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem5, Optional<ISODate>> mmLatestShipmentDate = new MMMessageAttribute<LineItem5, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> ShipmentDateRange.mmLatestShipmentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
			isDerived = false;
			xmlTag = "LatstShipmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestShipmentDate";
			definition = "Latest date whereby the goods must be shipped.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(LineItem5 obj) {
			return obj.getLatestShipmentDate();
		}

		@Override
		public void setValue(LineItem5 obj, Optional<ISODate> value) {
			obj.setLatestShipmentDate(value.orElse(null));
		}
	};
	@XmlElement(name = "LineItmDtls", required = true)
	protected List<LineItemDetails4> lineItemDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LineItemDetails4
	 * LineItemDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmLineItem
	 * Invoice.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem5
	 * LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineItmDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItemDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Goods or services that are purchased."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem5, List<LineItemDetails4>> mmLineItemDetails = new MMMessageAssociationEnd<LineItem5, List<LineItemDetails4>>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmLineItem;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
			isDerived = false;
			xmlTag = "LineItmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemDetails";
			definition = "Goods or services that are purchased.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LineItemDetails4.mmObject();
		}

		@Override
		public List<LineItemDetails4> getValue(LineItem5 obj) {
			return obj.getLineItemDetails();
		}

		@Override
		public void setValue(LineItem5 obj, List<LineItemDetails4> value) {
			obj.setLineItemDetails(value);
		}
	};
	@XmlElement(name = "LineItmsTtlAmt", required = true)
	protected CurrencyAndAmount lineItemsTotalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalInvoiceAmount
	 * Invoice.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem5
	 * LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineItmsTtlAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItemsTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total amount of all line items (incl. their adjustments)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem5, CurrencyAndAmount> mmLineItemsTotalAmount = new MMMessageAttribute<LineItem5, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
			isDerived = false;
			xmlTag = "LineItmsTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemsTotalAmount";
			definition = "Specifies the total amount of all line items (incl. their adjustments).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(LineItem5 obj) {
			return obj.getLineItemsTotalAmount();
		}

		@Override
		public void setValue(LineItem5 obj, CurrencyAndAmount value) {
			obj.setLineItemsTotalAmount(value);
		}
	};
	@XmlElement(name = "RtgSummry")
	protected TransportMeans1Choice routingSummary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransportMeans1Choice
	 * TransportMeans1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmRouting
	 * ProductDelivery.mmRouting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem5
	 * LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtgSummry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoutingSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the conveyance of goods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem5, Optional<TransportMeans1Choice>> mmRoutingSummary = new MMMessageAssociationEnd<LineItem5, Optional<TransportMeans1Choice>>() {
		{
			businessElementTrace_lazy = () -> ProductDelivery.mmRouting;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
			isDerived = false;
			xmlTag = "RtgSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoutingSummary";
			definition = "Information related to the conveyance of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransportMeans1Choice.mmObject();
		}

		@Override
		public Optional<TransportMeans1Choice> getValue(LineItem5 obj) {
			return obj.getRoutingSummary();
		}

		@Override
		public void setValue(LineItem5 obj, Optional<TransportMeans1Choice> value) {
			obj.setRoutingSummary(value.orElse(null));
		}
	};
	@XmlElement(name = "Incotrms")
	protected List<Incoterms1> incoterms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Incoterms1 Incoterms1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmIncoterms
	 * Transport.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem5
	 * LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Incotrms"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incoterms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the applicable Incoterm and associated location."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem5, List<Incoterms1>> mmIncoterms = new MMMessageAssociationEnd<LineItem5, List<Incoterms1>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmIncoterms;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
			isDerived = false;
			xmlTag = "Incotrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Incoterms1.mmObject();
		}

		@Override
		public List<Incoterms1> getValue(LineItem5 obj) {
			return obj.getIncoterms();
		}

		@Override
		public void setValue(LineItem5 obj, List<Incoterms1> value) {
			obj.setIncoterms(value);
		}
	};
	@XmlElement(name = "Adjstmnt")
	protected List<Adjustment3> adjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Adjustment3
	 * Adjustment3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmPriceAdjustment
	 * Price.mmPriceAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem5
	 * LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Adjstmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance on price for the goods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem5, List<Adjustment3>> mmAdjustment = new MMMessageAssociationEnd<LineItem5, List<Adjustment3>>() {
		{
			businessElementTrace_lazy = () -> Price.mmPriceAdjustment;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
			isDerived = false;
			xmlTag = "Adjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adjustment";
			definition = "Variance on price for the goods.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Adjustment3.mmObject();
		}

		@Override
		public List<Adjustment3> getValue(LineItem5 obj) {
			return obj.getAdjustment();
		}

		@Override
		public void setValue(LineItem5 obj, List<Adjustment3> value) {
			obj.setAdjustment(value);
		}
	};
	@XmlElement(name = "FrghtChrgs")
	protected Charge12 freightCharges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge12 Charge12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
	 * Transport.mmTransportCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem5
	 * LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrghtChrgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreightCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges related to the conveyance of goods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem5, Optional<Charge12>> mmFreightCharges = new MMMessageAssociationEnd<LineItem5, Optional<Charge12>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransportCharges;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
			isDerived = false;
			xmlTag = "FrghtChrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreightCharges";
			definition = "Charges related to the conveyance of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charge12.mmObject();
		}

		@Override
		public Optional<Charge12> getValue(LineItem5 obj) {
			return obj.getFreightCharges();
		}

		@Override
		public void setValue(LineItem5 obj, Optional<Charge12> value) {
			obj.setFreightCharges(value.orElse(null));
		}
	};
	@XmlElement(name = "Tax")
	protected List<Tax13> tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax13 Tax13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem5
	 * LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods in a trade transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem5, List<Tax13>> mmTax = new MMMessageAssociationEnd<LineItem5, List<Tax13>>() {
		{
			businessElementTrace_lazy = () -> Product.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters linked to the value of the goods in a trade transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax13.mmObject();
		}

		@Override
		public List<Tax13> getValue(LineItem5 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(LineItem5 obj, List<Tax13> value) {
			obj.setTax(value);
		}
	};
	@XmlElement(name = "TtlNetAmt", required = true)
	protected CurrencyAndAmount totalNetAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalInvoiceAmount
	 * Invoice.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem5
	 * LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNetAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total net amount of a trade transaction. Total amount resulting from the gross amount plus freight charges, tax and plus/minus Adjustments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItem5, CurrencyAndAmount> mmTotalNetAmount = new MMMessageAttribute<LineItem5, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
			isDerived = false;
			xmlTag = "TtlNetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNetAmount";
			definition = "Total net amount of a trade transaction. Total amount resulting from the gross amount plus freight charges, tax and plus/minus Adjustments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(LineItem5 obj) {
			return obj.getTotalNetAmount();
		}

		@Override
		public void setValue(LineItem5 obj, CurrencyAndAmount value) {
			obj.setTotalNetAmount(value);
		}
	};
	@XmlElement(name = "BuyrDfndInf")
	protected List<UserDefinedInformation1> buyerDefinedInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UserDefinedInformation1
	 * UserDefinedInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem5
	 * LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrDfndInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerDefinedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem5, List<UserDefinedInformation1>> mmBuyerDefinedInformation = new MMMessageAssociationEnd<LineItem5, List<UserDefinedInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
			isDerived = false;
			xmlTag = "BuyrDfndInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerDefinedInformation";
			definition = "Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UserDefinedInformation1.mmObject();
		}

		@Override
		public List<UserDefinedInformation1> getValue(LineItem5 obj) {
			return obj.getBuyerDefinedInformation();
		}

		@Override
		public void setValue(LineItem5 obj, List<UserDefinedInformation1> value) {
			obj.setBuyerDefinedInformation(value);
		}
	};
	@XmlElement(name = "SellrDfndInf")
	protected List<UserDefinedInformation1> sellerDefinedInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UserDefinedInformation1
	 * UserDefinedInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.LineItem5
	 * LineItem5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrDfndInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerDefinedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItem5, List<UserDefinedInformation1>> mmSellerDefinedInformation = new MMMessageAssociationEnd<LineItem5, List<UserDefinedInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItem5.mmObject();
			isDerived = false;
			xmlTag = "SellrDfndInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerDefinedInformation";
			definition = "Information important for the users of the message/service, which cannot be captured in any other message component/element. For example: Warehouse number.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UserDefinedInformation1.mmObject();
		}

		@Override
		public List<UserDefinedInformation1> getValue(LineItem5 obj) {
			return obj.getSellerDefinedInformation();
		}

		@Override
		public void setValue(LineItem5 obj, List<UserDefinedInformation1> value) {
			obj.setSellerDefinedInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem5.mmGoodsDescription, com.tools20022.repository.msg.LineItem5.mmPartialShipment, com.tools20022.repository.msg.LineItem5.mmTransShipment,
						com.tools20022.repository.msg.LineItem5.mmLatestShipmentDate, com.tools20022.repository.msg.LineItem5.mmLineItemDetails, com.tools20022.repository.msg.LineItem5.mmLineItemsTotalAmount,
						com.tools20022.repository.msg.LineItem5.mmRoutingSummary, com.tools20022.repository.msg.LineItem5.mmIncoterms, com.tools20022.repository.msg.LineItem5.mmAdjustment,
						com.tools20022.repository.msg.LineItem5.mmFreightCharges, com.tools20022.repository.msg.LineItem5.mmTax, com.tools20022.repository.msg.LineItem5.mmTotalNetAmount,
						com.tools20022.repository.msg.LineItem5.mmBuyerDefinedInformation, com.tools20022.repository.msg.LineItem5.mmSellerDefinedInformation);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLatestShipmentDateRule.forLineItem5, com.tools20022.repository.constraints.ConstraintRoutingSummaryRule.forLineItem5,
						com.tools20022.repository.constraints.ConstraintIncotermsRule.forLineItem5, com.tools20022.repository.constraints.ConstraintAdjustmentFreightChargesAndTaxRule.forLineItem5);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LineItem5";
				definition = "Commercial details of a trade transaction between a buyer and a seller.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max70Text> getGoodsDescription() {
		return goodsDescription == null ? Optional.empty() : Optional.of(goodsDescription);
	}

	public LineItem5 setGoodsDescription(Max70Text goodsDescription) {
		this.goodsDescription = goodsDescription;
		return this;
	}

	public YesNoIndicator getPartialShipment() {
		return partialShipment;
	}

	public LineItem5 setPartialShipment(YesNoIndicator partialShipment) {
		this.partialShipment = Objects.requireNonNull(partialShipment);
		return this;
	}

	public Optional<YesNoIndicator> getTransShipment() {
		return transShipment == null ? Optional.empty() : Optional.of(transShipment);
	}

	public LineItem5 setTransShipment(YesNoIndicator transShipment) {
		this.transShipment = transShipment;
		return this;
	}

	public Optional<ISODate> getLatestShipmentDate() {
		return latestShipmentDate == null ? Optional.empty() : Optional.of(latestShipmentDate);
	}

	public LineItem5 setLatestShipmentDate(ISODate latestShipmentDate) {
		this.latestShipmentDate = latestShipmentDate;
		return this;
	}

	public List<LineItemDetails4> getLineItemDetails() {
		return lineItemDetails == null ? lineItemDetails = new ArrayList<>() : lineItemDetails;
	}

	public LineItem5 setLineItemDetails(List<LineItemDetails4> lineItemDetails) {
		this.lineItemDetails = Objects.requireNonNull(lineItemDetails);
		return this;
	}

	public CurrencyAndAmount getLineItemsTotalAmount() {
		return lineItemsTotalAmount;
	}

	public LineItem5 setLineItemsTotalAmount(CurrencyAndAmount lineItemsTotalAmount) {
		this.lineItemsTotalAmount = Objects.requireNonNull(lineItemsTotalAmount);
		return this;
	}

	public Optional<TransportMeans1Choice> getRoutingSummary() {
		return routingSummary == null ? Optional.empty() : Optional.of(routingSummary);
	}

	public LineItem5 setRoutingSummary(TransportMeans1Choice routingSummary) {
		this.routingSummary = routingSummary;
		return this;
	}

	public List<Incoterms1> getIncoterms() {
		return incoterms == null ? incoterms = new ArrayList<>() : incoterms;
	}

	public LineItem5 setIncoterms(List<Incoterms1> incoterms) {
		this.incoterms = Objects.requireNonNull(incoterms);
		return this;
	}

	public List<Adjustment3> getAdjustment() {
		return adjustment == null ? adjustment = new ArrayList<>() : adjustment;
	}

	public LineItem5 setAdjustment(List<Adjustment3> adjustment) {
		this.adjustment = Objects.requireNonNull(adjustment);
		return this;
	}

	public Optional<Charge12> getFreightCharges() {
		return freightCharges == null ? Optional.empty() : Optional.of(freightCharges);
	}

	public LineItem5 setFreightCharges(Charge12 freightCharges) {
		this.freightCharges = freightCharges;
		return this;
	}

	public List<Tax13> getTax() {
		return tax == null ? tax = new ArrayList<>() : tax;
	}

	public LineItem5 setTax(List<Tax13> tax) {
		this.tax = Objects.requireNonNull(tax);
		return this;
	}

	public CurrencyAndAmount getTotalNetAmount() {
		return totalNetAmount;
	}

	public LineItem5 setTotalNetAmount(CurrencyAndAmount totalNetAmount) {
		this.totalNetAmount = Objects.requireNonNull(totalNetAmount);
		return this;
	}

	public List<UserDefinedInformation1> getBuyerDefinedInformation() {
		return buyerDefinedInformation == null ? buyerDefinedInformation = new ArrayList<>() : buyerDefinedInformation;
	}

	public LineItem5 setBuyerDefinedInformation(List<UserDefinedInformation1> buyerDefinedInformation) {
		this.buyerDefinedInformation = Objects.requireNonNull(buyerDefinedInformation);
		return this;
	}

	public List<UserDefinedInformation1> getSellerDefinedInformation() {
		return sellerDefinedInformation == null ? sellerDefinedInformation = new ArrayList<>() : sellerDefinedInformation;
	}

	public LineItem5 setSellerDefinedInformation(List<UserDefinedInformation1> sellerDefinedInformation) {
		this.sellerDefinedInformation = Objects.requireNonNull(sellerDefinedInformation);
		return this;
	}
}