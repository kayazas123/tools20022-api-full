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
import com.tools20022.repository.area.tsin.InvoiceFinancingRequestV01;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.FinancingRequestorRole;
import com.tools20022.repository.entity.FirstAgentRole;
import com.tools20022.repository.entity.IntermediaryAgentRole;
import com.tools20022.repository.entity.InvoiceFinancingAgreement;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics that unambiguously identify the global invoice
 * financing request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1#mmGroupIdentification
 * RequestGroupInformation1.mmGroupIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1#mmCreationDateTime
 * RequestGroupInformation1.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1#mmAuthorisation
 * RequestGroupInformation1.mmAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1#mmNumberOfInvoiceRequests
 * RequestGroupInformation1.mmNumberOfInvoiceRequests}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1#mmTotalBulkInvoiceAmount
 * RequestGroupInformation1.mmTotalBulkInvoiceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1#mmCurrency
 * RequestGroupInformation1.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1#mmFinancingAgreement
 * RequestGroupInformation1.mmFinancingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1#mmFinancingRequestor
 * RequestGroupInformation1.mmFinancingRequestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1#mmIntermediaryAgent
 * RequestGroupInformation1.mmIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1#mmFirstAgent
 * RequestGroupInformation1.mmFirstAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1#mmAgreementClauses
 * RequestGroupInformation1.mmAgreementClauses}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1#mmAdditionalInformation
 * RequestGroupInformation1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
 * InvoiceFinancingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestV01#mmRequestGroupInformation
 * InvoiceFinancingRequestV01.mmRequestGroupInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestGroupInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics that unambiguously identify the global invoice financing request."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequestGroupInformation1", propOrder = {"groupIdentification", "creationDateTime", "authorisation", "numberOfInvoiceRequests", "totalBulkInvoiceAmount", "currency", "financingAgreement", "financingRequestor",
		"intermediaryAgent", "firstAgent", "agreementClauses", "additionalInformation"})
public class RequestGroupInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpId", required = true)
	protected Max35Text groupIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1
	 * RequestGroupInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference assigned by the financing requestor to unambiguously identify the invoice financing request message.\n\nUsage: The financing requestor has to make sure that 'GroupIdentification' is unique for a pre-agreed period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGroupIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestGroupInformation1.mmObject();
			isDerived = false;
			xmlTag = "GrpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupIdentification";
			definition = "Point to point reference assigned by the financing requestor to unambiguously identify the invoice financing request message.\n\nUsage: The financing requestor has to make sure that 'GroupIdentification' is unique for a pre-agreed period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1
	 * RequestGroupInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time on which the invoice financing request was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestGroupInformation1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time on which the invoice financing request was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "Authstn")
	protected List<Max128Text> authorisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max128Text
	 * Max128Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmAuthorisation
	 * InvoiceFinancingAgreement.mmAuthorisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1
	 * RequestGroupInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Authstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "User identification or any user key that allows to check if the financing requestor is allowed to ask for invoice financing.\n\nUsage: the content is not of a technical nature, but reflects the organisational structure at the requesting side.\nThe authorisation element can typically be used in case the financing requestor acts on behalf of one or more suppliers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthorisation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmAuthorisation;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestGroupInformation1.mmObject();
			isDerived = false;
			xmlTag = "Authstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorisation";
			definition = "User identification or any user key that allows to check if the financing requestor is allowed to ask for invoice financing.\n\nUsage: the content is not of a technical nature, but reflects the organisational structure at the requesting side.\nThe authorisation element can typically be used in case the financing requestor acts on behalf of one or more suppliers.";
			maxOccurs = 2;
			minOccurs = 0;
			simpleType_lazy = () -> Max128Text.mmObject();
		}
	};
	@XmlElement(name = "NbOfInvcReqs")
	protected Max15NumericText numberOfInvoiceRequests;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1
	 * RequestGroupInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfInvcReqs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfInvoiceRequests"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of single invoice financing requests included in the bulk request message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfInvoiceRequests = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestGroupInformation1.mmObject();
			isDerived = false;
			xmlTag = "NbOfInvcReqs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfInvoiceRequests";
			definition = "Specifies the number of single invoice financing requests included in the bulk request message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	@XmlElement(name = "TtlBlkInvcAmt")
	protected ActiveCurrencyAndAmount totalBulkInvoiceAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1
	 * RequestGroupInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlBlkInvcAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalBulkInvoiceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of the bulk invoice financing request. It is composed by the sum of the total amounts of all invoices included in the financing request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalBulkInvoiceAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestGroupInformation1.mmObject();
			isDerived = false;
			xmlTag = "TtlBlkInvcAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalBulkInvoiceAmount";
			definition = "Total amount of the bulk invoice financing request. It is composed by the sum of the total amounts of all invoices included in the financing request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "Ccy", required = true)
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1
	 * RequestGroupInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference currency of the invoice financing request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestGroupInformation1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Reference currency of the invoice financing request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "FincgAgrmt")
	protected Max350Text financingAgreement;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmFinancingMethod
	 * InvoiceFinancingAgreement.mmFinancingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1
	 * RequestGroupInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincgAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the financing method related to invoice financing (eg collection mandate)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancingAgreement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmFinancingMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestGroupInformation1.mmObject();
			isDerived = false;
			xmlTag = "FincgAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingAgreement";
			definition = "Specifies the financing method related to invoice financing (eg collection mandate).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "FincgRqstr", required = true)
	protected PartyIdentificationAndAccount6 financingRequestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount6
	 * PartyIdentificationAndAccount6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancingRequestorRole
	 * FinancingRequestorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1
	 * RequestGroupInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincgRqstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingRequestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that requests the invoice financing, on behalf of a creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancingRequestor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FinancingRequestorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestGroupInformation1.mmObject();
			isDerived = false;
			xmlTag = "FincgRqstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingRequestor";
			definition = "Party that requests the invoice financing, on behalf of a creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount6.mmObject();
		}
	};
	@XmlElement(name = "IntrmyAgt")
	protected FinancialInstitutionIdentification6 intermediaryAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6
	 * FinancialInstitutionIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryAgentRole
	 * IntermediaryAgentRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1
	 * RequestGroupInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution that receives the request from the financing requestor and forwards it to the first agent for execution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> IntermediaryAgentRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestGroupInformation1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent";
			definition = "Financial institution that receives the request from the financing requestor and forwards it to the first agent for execution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification6.mmObject();
		}
	};
	@XmlElement(name = "FrstAgt", required = true)
	protected FinancialInstitutionIdentification6 firstAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification6
	 * FinancialInstitutionIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FirstAgentRole
	 * FirstAgentRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1
	 * RequestGroupInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution of financing requestor to which an invoice financing request is addressed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFirstAgent = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FirstAgentRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestGroupInformation1.mmObject();
			isDerived = false;
			xmlTag = "FrstAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAgent";
			definition = "Financial institution of financing requestor to which an invoice financing request is addressed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitutionIdentification6.mmObject();
		}
	};
	@XmlElement(name = "AgrmtClauses")
	protected List<com.tools20022.repository.msg.AgreementClauses1> agreementClauses;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AgreementClauses1
	 * AgreementClauses1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1
	 * RequestGroupInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtClauses"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementClauses"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreements between financing requestor and his bank concerning conditions about the service of invoice financing, based on specific contractual schemes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAgreementClauses = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestGroupInformation1.mmObject();
			isDerived = false;
			xmlTag = "AgrmtClauses";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementClauses";
			definition = "Agreements between financing requestor and his bank concerning conditions about the service of invoice financing, based on specific contractual schemes.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AgreementClauses1.mmObject();
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<com.tools20022.repository.msg.AdditionalInformation1> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalInformation1
	 * AdditionalInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestGroupInformation1
	 * RequestGroupInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the financing request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestGroupInformation1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information about the financing request.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalInformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestGroupInformation1.mmGroupIdentification, com.tools20022.repository.msg.RequestGroupInformation1.mmCreationDateTime,
						com.tools20022.repository.msg.RequestGroupInformation1.mmAuthorisation, com.tools20022.repository.msg.RequestGroupInformation1.mmNumberOfInvoiceRequests,
						com.tools20022.repository.msg.RequestGroupInformation1.mmTotalBulkInvoiceAmount, com.tools20022.repository.msg.RequestGroupInformation1.mmCurrency,
						com.tools20022.repository.msg.RequestGroupInformation1.mmFinancingAgreement, com.tools20022.repository.msg.RequestGroupInformation1.mmFinancingRequestor,
						com.tools20022.repository.msg.RequestGroupInformation1.mmIntermediaryAgent, com.tools20022.repository.msg.RequestGroupInformation1.mmFirstAgent,
						com.tools20022.repository.msg.RequestGroupInformation1.mmAgreementClauses, com.tools20022.repository.msg.RequestGroupInformation1.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvoiceFinancingRequestV01.mmRequestGroupInformation);
				trace_lazy = () -> InvoiceFinancingAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "RequestGroupInformation1";
				definition = "Set of characteristics that unambiguously identify the global invoice financing request.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getGroupIdentification() {
		return groupIdentification;
	}

	public RequestGroupInformation1 setGroupIdentification(Max35Text groupIdentification) {
		this.groupIdentification = Objects.requireNonNull(groupIdentification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public RequestGroupInformation1 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public List<Max128Text> getAuthorisation() {
		return authorisation == null ? authorisation = new ArrayList<>() : authorisation;
	}

	public RequestGroupInformation1 setAuthorisation(List<Max128Text> authorisation) {
		this.authorisation = Objects.requireNonNull(authorisation);
		return this;
	}

	public Optional<Max15NumericText> getNumberOfInvoiceRequests() {
		return numberOfInvoiceRequests == null ? Optional.empty() : Optional.of(numberOfInvoiceRequests);
	}

	public RequestGroupInformation1 setNumberOfInvoiceRequests(Max15NumericText numberOfInvoiceRequests) {
		this.numberOfInvoiceRequests = numberOfInvoiceRequests;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalBulkInvoiceAmount() {
		return totalBulkInvoiceAmount == null ? Optional.empty() : Optional.of(totalBulkInvoiceAmount);
	}

	public RequestGroupInformation1 setTotalBulkInvoiceAmount(ActiveCurrencyAndAmount totalBulkInvoiceAmount) {
		this.totalBulkInvoiceAmount = totalBulkInvoiceAmount;
		return this;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public RequestGroupInformation1 setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public Optional<Max350Text> getFinancingAgreement() {
		return financingAgreement == null ? Optional.empty() : Optional.of(financingAgreement);
	}

	public RequestGroupInformation1 setFinancingAgreement(Max350Text financingAgreement) {
		this.financingAgreement = financingAgreement;
		return this;
	}

	public PartyIdentificationAndAccount6 getFinancingRequestor() {
		return financingRequestor;
	}

	public RequestGroupInformation1 setFinancingRequestor(com.tools20022.repository.msg.PartyIdentificationAndAccount6 financingRequestor) {
		this.financingRequestor = Objects.requireNonNull(financingRequestor);
		return this;
	}

	public Optional<FinancialInstitutionIdentification6> getIntermediaryAgent() {
		return intermediaryAgent == null ? Optional.empty() : Optional.of(intermediaryAgent);
	}

	public RequestGroupInformation1 setIntermediaryAgent(com.tools20022.repository.msg.FinancialInstitutionIdentification6 intermediaryAgent) {
		this.intermediaryAgent = intermediaryAgent;
		return this;
	}

	public FinancialInstitutionIdentification6 getFirstAgent() {
		return firstAgent;
	}

	public RequestGroupInformation1 setFirstAgent(com.tools20022.repository.msg.FinancialInstitutionIdentification6 firstAgent) {
		this.firstAgent = Objects.requireNonNull(firstAgent);
		return this;
	}

	public List<AgreementClauses1> getAgreementClauses() {
		return agreementClauses == null ? agreementClauses = new ArrayList<>() : agreementClauses;
	}

	public RequestGroupInformation1 setAgreementClauses(List<com.tools20022.repository.msg.AgreementClauses1> agreementClauses) {
		this.agreementClauses = Objects.requireNonNull(agreementClauses);
		return this;
	}

	public List<AdditionalInformation1> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public RequestGroupInformation1 setAdditionalInformation(List<com.tools20022.repository.msg.AdditionalInformation1> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}