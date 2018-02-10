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
import com.tools20022.repository.choice.FinancialInstrumentQuantity15Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CorporateActionCashEntitlement;
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
 * Provides additional information regarding corporate action movement option
 * details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmPlaceAndName
 * OptionTransactionDetailsSD4.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmTransactionIdentification
 * OptionTransactionDetailsSD4.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmTransactionSequenceNumber
 * OptionTransactionDetailsSD4.mmTransactionSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmTransactionIdentificationDate
 * OptionTransactionDetailsSD4.mmTransactionIdentificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmTransactionIdentificationQuantity
 * OptionTransactionDetailsSD4.mmTransactionIdentificationQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmTransactionIdentificationOversubscriptionQuantity
 * OptionTransactionDetailsSD4.
 * mmTransactionIdentificationOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmAcceptedQuantity
 * OptionTransactionDetailsSD4.mmAcceptedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmUnacceptedQuantity
 * OptionTransactionDetailsSD4.mmUnacceptedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmEntitledAmount
 * OptionTransactionDetailsSD4.mmEntitledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmEntitledQuantity
 * OptionTransactionDetailsSD4.mmEntitledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmEntitledOversubscriptionQuantity
 * OptionTransactionDetailsSD4.mmEntitledOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmSubscriptionAmount
 * OptionTransactionDetailsSD4.mmSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmRefundedSubscriptionAmount
 * OptionTransactionDetailsSD4.mmRefundedSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmOversubscriptionAmount
 * OptionTransactionDetailsSD4.mmOversubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmRefundedOversubscriptionAmount
 * OptionTransactionDetailsSD4.mmRefundedOversubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmFinalSubscriptionAdjustmentAmount
 * OptionTransactionDetailsSD4.mmFinalSubscriptionAdjustmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmCashInLieuOfShare
 * OptionTransactionDetailsSD4.mmCashInLieuOfShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmCustomerReferenceIdentification
 * OptionTransactionDetailsSD4.mmCustomerReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmAgentEnteredQuantity
 * OptionTransactionDetailsSD4.mmAgentEnteredQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4#mmInstructionComments
 * OptionTransactionDetailsSD4.mmInstructionComments}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionTransactionDetailsSD4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action movement option details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2
 * OptionTransactionDetailsSD2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OptionTransactionDetailsSD4", propOrder = {"placeAndName", "transactionIdentification", "transactionSequenceNumber", "transactionIdentificationDate", "transactionIdentificationQuantity",
		"transactionIdentificationOversubscriptionQuantity", "acceptedQuantity", "unacceptedQuantity", "entitledAmount", "entitledQuantity", "entitledOversubscriptionQuantity", "subscriptionAmount", "refundedSubscriptionAmount",
		"oversubscriptionAmount", "refundedOversubscriptionAmount", "finalSubscriptionAdjustmentAmount", "cashInLieuOfShare", "customerReferenceIdentification", "agentEnteredQuantity", "instructionComments"})
public class OptionTransactionDetailsSD4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Xpath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmPlaceAndName
	 * OptionTransactionDetailsSD2.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "TxId", required = true)
	protected Max15Text transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max15Text
	 * Max15Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique number assigned by the depository. Transaction identification will be either the DTC Instruction reference number for reorganisation instructions (VOI) or the DAM reference number for custody / reorganisation deposits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmTransactionIdentification
	 * OptionTransactionDetailsSD2.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique number assigned by the depository. Transaction identification will be either the DTC Instruction reference number for reorganisation instructions (VOI) or the DAM reference number for custody / reorganisation deposits.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15Text.mmObject();
		}
	};
	@XmlElement(name = "TxSeqNb")
	protected Max3NumericText transactionSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number which further identifies DTC instruction reference number. Not applicable to reorganisation / custody deposits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmTransactionSequenceNumber
	 * OptionTransactionDetailsSD2.mmTransactionSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "TxSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSequenceNumber";
			definition = "Number which further identifies DTC instruction reference number. Not applicable to reorganisation / custody deposits.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmTransactionSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	@XmlElement(name = "TxIdDt", required = true)
	protected ISODateTime transactionIdentificationDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction date and time for reorganisation instructions or the deposit date for reorganisation / custody deposits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmTransactionIdentificationDate
	 * OptionTransactionDetailsSD2.mmTransactionIdentificationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentificationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "TxIdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationDate";
			definition = "Instruction date and time for reorganisation instructions or the deposit date for reorganisation / custody deposits.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmTransactionIdentificationDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "TxIdQty", required = true)
	protected FinancialInstrumentQuantity15Choice transactionIdentificationQuantity;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructed quantity for reorganisation instructions or the deposit quantity for reorganisation / custody deposits."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmTransactionIdentificationQuantity
	 * OptionTransactionDetailsSD2.mmTransactionIdentificationQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentificationQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "TxIdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationQuantity";
			definition = "Instructed quantity for reorganisation instructions or the deposit quantity for reorganisation / custody deposits.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmTransactionIdentificationQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "TxIdOvrsbcptQty")
	protected FinancialInstrumentQuantity15Choice transactionIdentificationOversubscriptionQuantity;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdOvrsbcptQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationOversubscriptionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Oversubscribed quantity of the instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmTransactionIdentificationOversubscriptionQuantity
	 * OptionTransactionDetailsSD2.
	 * mmTransactionIdentificationOversubscriptionQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentificationOversubscriptionQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "TxIdOvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationOversubscriptionQuantity";
			definition = "Oversubscribed quantity of the instruction.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmTransactionIdentificationOversubscriptionQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "AccptdQty")
	protected FinancialInstrumentQuantity15Choice acceptedQuantity;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For prorated events, portion of the instructed units that was accepted by the Issuer / Agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmAcceptedQuantity
	 * OptionTransactionDetailsSD2.mmAcceptedQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcceptedQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "AccptdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedQuantity";
			definition = "For prorated events, portion of the instructed units that was accepted by the Issuer / Agent.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmAcceptedQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "UaccptdQty")
	protected FinancialInstrumentQuantity15Choice unacceptedQuantity;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UaccptdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For prorated events, the portion of the instructed quantity that was not accepted by the Issuer / Agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmUnacceptedQuantity
	 * OptionTransactionDetailsSD2.mmUnacceptedQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnacceptedQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "UaccptdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptedQuantity";
			definition = "For prorated events, the portion of the instructed quantity that was not accepted by the Issuer / Agent.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmUnacceptedQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "EntitldAmt")
	protected RestrictedFINActiveCurrencyAndAmount entitledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount based upon the DTC cash rate per instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmEntitledAmount
	 * OptionTransactionDetailsSD2.mmEntitledAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitledAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "EntitldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitledAmount";
			definition = "Amount based upon the DTC cash rate per instruction.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmEntitledAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "EntitldQty")
	protected FinancialInstrumentQuantity15Choice entitledQuantity;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity based upon the DTC security rate per instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmEntitledQuantity
	 * OptionTransactionDetailsSD2.mmEntitledQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEntitledQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "EntitldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitledQuantity";
			definition = "Quantity based upon the DTC security rate per instruction.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmEntitledQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "EntitldOvrsbcptQty")
	protected FinancialInstrumentQuantity15Choice entitledOversubscriptionQuantity;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitldOvrsbcptQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitledOversubscriptionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entitled units for the oversubscription."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmEntitledOversubscriptionQuantity
	 * OptionTransactionDetailsSD2.mmEntitledOversubscriptionQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEntitledOversubscriptionQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "EntitldOvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitledOversubscriptionQuantity";
			definition = "Entitled units for the oversubscription.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmEntitledOversubscriptionQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "SbcptAmt")
	protected RestrictedFINActiveCurrencyAndAmount subscriptionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount paid to the issuer / agent for subscription cost."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmSubscriptionAmount
	 * OptionTransactionDetailsSD2.mmSubscriptionAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubscriptionAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "SbcptAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionAmount";
			definition = "Amount paid to the issuer / agent for subscription cost.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmSubscriptionAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "RfnddSbcptAmt")
	protected RestrictedFINActiveCurrencyAndAmount refundedSubscriptionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfnddSbcptAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundedSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount due to proration of the basic subscription or from protect instruction which was not covered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRefundedSubscriptionAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "RfnddSbcptAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundedSubscriptionAmount";
			definition = "Amount due to proration of the basic subscription or from protect instruction which was not covered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "OvrsbcptAmt")
	protected RestrictedFINActiveCurrencyAndAmount oversubscriptionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OvrsbcptAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount paid to the issuer / agent for the oversubscription cost."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmOversubscriptionAmount
	 * OptionTransactionDetailsSD2.mmOversubscriptionAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOversubscriptionAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "OvrsbcptAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionAmount";
			definition = "Amount paid to the issuer / agent for the oversubscription cost.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmOversubscriptionAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "RfnddOvrsbcptAmt")
	protected RestrictedFINActiveCurrencyAndAmount refundedOversubscriptionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfnddOvrsbcptAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundedOversubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount to be refunded for oversubscribed shares not accepted by the issuer / agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmRefundedOversubscriptionAmount
	 * OptionTransactionDetailsSD2.mmRefundedOversubscriptionAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRefundedOversubscriptionAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "RfnddOvrsbcptAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundedOversubscriptionAmount";
			definition = "Amount to be refunded for oversubscribed shares not accepted by the issuer / agent.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmRefundedOversubscriptionAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "FnlSbcptAdjstmntAmt")
	protected RestrictedFINActiveCurrencyAndAmount finalSubscriptionAdjustmentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlSbcptAdjstmntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalSubscriptionAdjustmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment related to the difference between the estimated and final price for the subscription cost."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmFinalSubscriptionAdjustmentAmount
	 * OptionTransactionDetailsSD2.mmFinalSubscriptionAdjustmentAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinalSubscriptionAdjustmentAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "FnlSbcptAdjstmntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalSubscriptionAdjustmentAmount";
			definition = "Adjustment related to the difference between the estimated and final price for the subscription cost.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmFinalSubscriptionAdjustmentAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "CshInLieuOfShr")
	protected RestrictedFINActiveCurrencyAndAmount cashInLieuOfShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAndAmount
	 * RestrictedFINActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmCashInLieuOfShare
	 * CorporateActionCashEntitlement.mmCashInLieuOfShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInLieuOfShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19B:CINL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of a fractional quantity of, for example, equity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmCashInLieuOfShare
	 * OptionTransactionDetailsSD2.mmCashInLieuOfShare}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashInLieuOfShare = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionCashEntitlement.mmCashInLieuOfShare;
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19B:CINL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfShare";
			definition = "Cash disbursement in lieu of a fractional quantity of, for example, equity.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmCashInLieuOfShare;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "CstmrRefId")
	protected Max30Text customerReferenceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max30Text
	 * Max30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrRefId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerReferenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer identification entered by client upon instruction submission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmCustomerReferenceIdentification
	 * OptionTransactionDetailsSD2.mmCustomerReferenceIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerReferenceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "CstmrRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerReferenceIdentification";
			definition = "Customer identification entered by client upon instruction submission.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmCustomerReferenceIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max30Text.mmObject();
		}
	};
	@XmlElement(name = "AgtNtrdQty")
	protected FinancialInstrumentQuantity15Choice agentEnteredQuantity;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtNtrdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentEnteredQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity entered by the agent on PUT (Mortgage Backed) instructions to be paid. This quantity can be for the full or partial instructed quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD2#mmAgentEnteredQuantity
	 * OptionTransactionDetailsSD2.mmAgentEnteredQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAgentEnteredQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "AgtNtrdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentEnteredQuantity";
			definition = "Quantity entered by the agent on PUT (Mortgage Backed) instructions to be paid. This quantity can be for the full or partial instructed quantity.";
			previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmAgentEnteredQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity15Choice.mmObject();
		}
	};
	@XmlElement(name = "InstrCmnts")
	protected Max210Text instructionComments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OptionTransactionDetailsSD4
	 * OptionTransactionDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCmnts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionComments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Client free format instruction narrative information. Will be 80 characters for tender instructions, 150 characters for rights instructions and 20 characters for put instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionComments = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "InstrCmnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionComments";
			definition = "Client free format instruction narrative information. Will be 80 characters for tender instructions, 150 characters for rights instructions and 20 characters for put instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmPlaceAndName, com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmTransactionIdentification,
						com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmTransactionSequenceNumber, com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmTransactionIdentificationDate,
						com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmTransactionIdentificationQuantity, com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmTransactionIdentificationOversubscriptionQuantity,
						com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmAcceptedQuantity, com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmUnacceptedQuantity,
						com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmEntitledAmount, com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmEntitledQuantity,
						com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmEntitledOversubscriptionQuantity, com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmSubscriptionAmount,
						com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmRefundedSubscriptionAmount, com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmOversubscriptionAmount,
						com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmRefundedOversubscriptionAmount, com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmFinalSubscriptionAdjustmentAmount,
						com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmCashInLieuOfShare, com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmCustomerReferenceIdentification,
						com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmAgentEnteredQuantity, com.tools20022.repository.msg.OptionTransactionDetailsSD4.mmInstructionComments);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionTransactionDetailsSD4";
				definition = "Provides additional information regarding corporate action movement option details.";
				previousVersion_lazy = () -> OptionTransactionDetailsSD2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public OptionTransactionDetailsSD4 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Max15Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public OptionTransactionDetailsSD4 setTransactionIdentification(Max15Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<Max3NumericText> getTransactionSequenceNumber() {
		return transactionSequenceNumber == null ? Optional.empty() : Optional.of(transactionSequenceNumber);
	}

	public OptionTransactionDetailsSD4 setTransactionSequenceNumber(Max3NumericText transactionSequenceNumber) {
		this.transactionSequenceNumber = transactionSequenceNumber;
		return this;
	}

	public ISODateTime getTransactionIdentificationDate() {
		return transactionIdentificationDate;
	}

	public OptionTransactionDetailsSD4 setTransactionIdentificationDate(ISODateTime transactionIdentificationDate) {
		this.transactionIdentificationDate = Objects.requireNonNull(transactionIdentificationDate);
		return this;
	}

	public FinancialInstrumentQuantity15Choice getTransactionIdentificationQuantity() {
		return transactionIdentificationQuantity;
	}

	public OptionTransactionDetailsSD4 setTransactionIdentificationQuantity(FinancialInstrumentQuantity15Choice transactionIdentificationQuantity) {
		this.transactionIdentificationQuantity = Objects.requireNonNull(transactionIdentificationQuantity);
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getTransactionIdentificationOversubscriptionQuantity() {
		return transactionIdentificationOversubscriptionQuantity == null ? Optional.empty() : Optional.of(transactionIdentificationOversubscriptionQuantity);
	}

	public OptionTransactionDetailsSD4 setTransactionIdentificationOversubscriptionQuantity(FinancialInstrumentQuantity15Choice transactionIdentificationOversubscriptionQuantity) {
		this.transactionIdentificationOversubscriptionQuantity = transactionIdentificationOversubscriptionQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getAcceptedQuantity() {
		return acceptedQuantity == null ? Optional.empty() : Optional.of(acceptedQuantity);
	}

	public OptionTransactionDetailsSD4 setAcceptedQuantity(FinancialInstrumentQuantity15Choice acceptedQuantity) {
		this.acceptedQuantity = acceptedQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getUnacceptedQuantity() {
		return unacceptedQuantity == null ? Optional.empty() : Optional.of(unacceptedQuantity);
	}

	public OptionTransactionDetailsSD4 setUnacceptedQuantity(FinancialInstrumentQuantity15Choice unacceptedQuantity) {
		this.unacceptedQuantity = unacceptedQuantity;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getEntitledAmount() {
		return entitledAmount == null ? Optional.empty() : Optional.of(entitledAmount);
	}

	public OptionTransactionDetailsSD4 setEntitledAmount(RestrictedFINActiveCurrencyAndAmount entitledAmount) {
		this.entitledAmount = entitledAmount;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getEntitledQuantity() {
		return entitledQuantity == null ? Optional.empty() : Optional.of(entitledQuantity);
	}

	public OptionTransactionDetailsSD4 setEntitledQuantity(FinancialInstrumentQuantity15Choice entitledQuantity) {
		this.entitledQuantity = entitledQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getEntitledOversubscriptionQuantity() {
		return entitledOversubscriptionQuantity == null ? Optional.empty() : Optional.of(entitledOversubscriptionQuantity);
	}

	public OptionTransactionDetailsSD4 setEntitledOversubscriptionQuantity(FinancialInstrumentQuantity15Choice entitledOversubscriptionQuantity) {
		this.entitledOversubscriptionQuantity = entitledOversubscriptionQuantity;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getSubscriptionAmount() {
		return subscriptionAmount == null ? Optional.empty() : Optional.of(subscriptionAmount);
	}

	public OptionTransactionDetailsSD4 setSubscriptionAmount(RestrictedFINActiveCurrencyAndAmount subscriptionAmount) {
		this.subscriptionAmount = subscriptionAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getRefundedSubscriptionAmount() {
		return refundedSubscriptionAmount == null ? Optional.empty() : Optional.of(refundedSubscriptionAmount);
	}

	public OptionTransactionDetailsSD4 setRefundedSubscriptionAmount(RestrictedFINActiveCurrencyAndAmount refundedSubscriptionAmount) {
		this.refundedSubscriptionAmount = refundedSubscriptionAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getOversubscriptionAmount() {
		return oversubscriptionAmount == null ? Optional.empty() : Optional.of(oversubscriptionAmount);
	}

	public OptionTransactionDetailsSD4 setOversubscriptionAmount(RestrictedFINActiveCurrencyAndAmount oversubscriptionAmount) {
		this.oversubscriptionAmount = oversubscriptionAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getRefundedOversubscriptionAmount() {
		return refundedOversubscriptionAmount == null ? Optional.empty() : Optional.of(refundedOversubscriptionAmount);
	}

	public OptionTransactionDetailsSD4 setRefundedOversubscriptionAmount(RestrictedFINActiveCurrencyAndAmount refundedOversubscriptionAmount) {
		this.refundedOversubscriptionAmount = refundedOversubscriptionAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getFinalSubscriptionAdjustmentAmount() {
		return finalSubscriptionAdjustmentAmount == null ? Optional.empty() : Optional.of(finalSubscriptionAdjustmentAmount);
	}

	public OptionTransactionDetailsSD4 setFinalSubscriptionAdjustmentAmount(RestrictedFINActiveCurrencyAndAmount finalSubscriptionAdjustmentAmount) {
		this.finalSubscriptionAdjustmentAmount = finalSubscriptionAdjustmentAmount;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAndAmount> getCashInLieuOfShare() {
		return cashInLieuOfShare == null ? Optional.empty() : Optional.of(cashInLieuOfShare);
	}

	public OptionTransactionDetailsSD4 setCashInLieuOfShare(RestrictedFINActiveCurrencyAndAmount cashInLieuOfShare) {
		this.cashInLieuOfShare = cashInLieuOfShare;
		return this;
	}

	public Optional<Max30Text> getCustomerReferenceIdentification() {
		return customerReferenceIdentification == null ? Optional.empty() : Optional.of(customerReferenceIdentification);
	}

	public OptionTransactionDetailsSD4 setCustomerReferenceIdentification(Max30Text customerReferenceIdentification) {
		this.customerReferenceIdentification = customerReferenceIdentification;
		return this;
	}

	public Optional<FinancialInstrumentQuantity15Choice> getAgentEnteredQuantity() {
		return agentEnteredQuantity == null ? Optional.empty() : Optional.of(agentEnteredQuantity);
	}

	public OptionTransactionDetailsSD4 setAgentEnteredQuantity(FinancialInstrumentQuantity15Choice agentEnteredQuantity) {
		this.agentEnteredQuantity = agentEnteredQuantity;
		return this;
	}

	public Optional<Max210Text> getInstructionComments() {
		return instructionComments == null ? Optional.empty() : Optional.of(instructionComments);
	}

	public OptionTransactionDetailsSD4 setInstructionComments(Max210Text instructionComments) {
		this.instructionComments = instructionComments;
		return this;
	}
}