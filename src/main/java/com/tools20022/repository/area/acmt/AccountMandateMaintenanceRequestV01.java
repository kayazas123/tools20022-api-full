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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementPreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.BankAccountManagementISOPreviousversion;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The AccountMandateMaintenanceRequest message is sent from an organisation to
 * a financial institution as part of the account maintenance process. It is the
 * initial request message to update an account. This update is only about
 * mandate information.<br>
 * <b>Usage</b><br>
 * This message should only be used for initiating the maintenance process of
 * mandate information. This update is only about mandate information. The
 * organisation will specify under the Mandate tag the complete information as
 * it should be in the financial institutions records after processing the
 * update request. It is not possible to update the account characteristics or
 * organisation information with this message.<br>
 * It is possible to request to update the mandate information of several
 * accounts, if these accounts must have exactly the same mandates.<br>
 * This message could be sent together with other related documents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.017.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementPreviousVersion
 * AccountManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01#mmReferences
 * AccountMandateMaintenanceRequestV01.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01#mmContractDates
 * AccountMandateMaintenanceRequestV01.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01#mmUnderlyingMasterAgreement
 * AccountMandateMaintenanceRequestV01.mmUnderlyingMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01#mmAccountIdentification
 * AccountMandateMaintenanceRequestV01.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01#mmAccountServicerIdentification
 * AccountMandateMaintenanceRequestV01.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01#mmOrganisationIdentification
 * AccountMandateMaintenanceRequestV01.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01#mmMandate
 * AccountMandateMaintenanceRequestV01.mmMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01#mmAdditionalMessageInformation
 * AccountMandateMaintenanceRequestV01.mmAdditionalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01#mmDigitalSignature
 * AccountMandateMaintenanceRequestV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.BankAccountManagementISOPreviousversion
 * BankAccountManagementISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctMndtMntncReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountMandateMaintenanceRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AccountMandateMaintenanceRequest message is sent from an organisation to a financial institution as part of the account maintenance process. It is the initial request message to update an account. This update is only about mandate information.\r\nUsage\r\nThis message should only be used for initiating the maintenance process of mandate information. This update is only about mandate information. The organisation will specify under the Mandate tag the complete information as it should be in the financial institutions records after processing the update request. It is not possible to update the account characteristics or organisation information with this message.\r\nIt is possible to request to update the mandate information of several accounts, if these accounts must have exactly the same mandates.\r\nThis message could be sent together with other related documents."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02
 * AccountMandateMaintenanceRequestV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountMandateMaintenanceRequestV01", propOrder = {"references", "contractDates", "underlyingMasterAgreement", "accountIdentification", "accountServicerIdentification", "organisationIdentification", "mandate",
		"additionalMessageInformation", "digitalSignature"})
public class AccountMandateMaintenanceRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Refs", required = true)
	protected References4 references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.References4
	 * References4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements for the identification of the message and related references."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, References4> mmReferences = new MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, References4>() {
		{
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Set of elements for the identification of the message and related references.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> References4.mmObject();
		}

		@Override
		public References4 getValue(AccountMandateMaintenanceRequestV01 obj) {
			return obj.getReferences();
		}

		@Override
		public void setValue(AccountMandateMaintenanceRequestV01 obj, References4 value) {
			obj.setReferences(value);
		}
	};
	@XmlElement(name = "CtrctDts")
	protected AccountContract2 contractDates;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract2
	 * AccountContract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctDts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractDates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies target dates."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, Optional<AccountContract2>> mmContractDates = new MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, Optional<AccountContract2>>() {
		{
			xmlTag = "CtrctDts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractDates";
			definition = "Specifies target dates.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountContract2.mmObject();
		}

		@Override
		public Optional<AccountContract2> getValue(AccountMandateMaintenanceRequestV01 obj) {
			return obj.getContractDates();
		}

		@Override
		public void setValue(AccountMandateMaintenanceRequestV01 obj, Optional<AccountContract2> value) {
			obj.setContractDates(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygMstrAgrmt")
	protected ContractDocument1 underlyingMasterAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1
	 * ContractDocument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygMstrAgrmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingMasterAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer. This contract has to be applied for the new account to be opened and maintained."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, Optional<ContractDocument1>> mmUnderlyingMasterAgreement = new MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, Optional<ContractDocument1>>() {
		{
			xmlTag = "UndrlygMstrAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingMasterAgreement";
			definition = "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer. This contract has to be applied for the new account to be opened and maintained.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContractDocument1.mmObject();
		}

		@Override
		public Optional<ContractDocument1> getValue(AccountMandateMaintenanceRequestV01 obj) {
			return obj.getUnderlyingMasterAgreement();
		}

		@Override
		public void setValue(AccountMandateMaintenanceRequestV01 obj, Optional<ContractDocument1> value) {
			obj.setUnderlyingMasterAgreement(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctId", required = true)
	protected List<AccountForAction1> accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountForAction1
	 * AccountForAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, List<AccountForAction1>> mmAccountIdentification = new MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, List<AccountForAction1>>() {
		{
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification of the account between the account owner and the account servicer.";
			minOccurs = 1;
			complexType_lazy = () -> AccountForAction1.mmObject();
		}

		@Override
		public List<AccountForAction1> getValue(AccountMandateMaintenanceRequestV01 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(AccountMandateMaintenanceRequestV01 obj, List<AccountForAction1> value) {
			obj.setAccountIdentification(value);
		}
	};
	@XmlElement(name = "AcctSvcrId", required = true)
	protected BranchAndFinancialInstitutionIdentification4 accountServicerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, BranchAndFinancialInstitutionIdentification4> mmAccountServicerIdentification = new MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, BranchAndFinancialInstitutionIdentification4>() {
		{
			xmlTag = "AcctSvcrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIdentification";
			definition = "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification4.mmObject();
		}

		@Override
		public BranchAndFinancialInstitutionIdentification4 getValue(AccountMandateMaintenanceRequestV01 obj) {
			return obj.getAccountServicerIdentification();
		}

		@Override
		public void setValue(AccountMandateMaintenanceRequestV01 obj, BranchAndFinancialInstitutionIdentification4 value) {
			obj.setAccountServicerIdentification(value);
		}
	};
	@XmlElement(name = "OrgId", required = true)
	protected List<OrganisationIdentification6> organisationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification6
	 * OrganisationIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the organisation requesting the change."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, List<OrganisationIdentification6>> mmOrganisationIdentification = new MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, List<OrganisationIdentification6>>() {
		{
			xmlTag = "OrgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationIdentification";
			definition = "Identification of the organisation requesting the change.";
			minOccurs = 1;
			complexType_lazy = () -> OrganisationIdentification6.mmObject();
		}

		@Override
		public List<OrganisationIdentification6> getValue(AccountMandateMaintenanceRequestV01 obj) {
			return obj.getOrganisationIdentification();
		}

		@Override
		public void setValue(AccountMandateMaintenanceRequestV01 obj, List<OrganisationIdentification6> value) {
			obj.setOrganisationIdentification(value);
		}
	};
	@XmlElement(name = "Mndt", required = true)
	protected List<OperationMandate1> mandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OperationMandate1
	 * OperationMandate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mndt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information specifying the account mandate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, List<OperationMandate1>> mmMandate = new MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, List<OperationMandate1>>() {
		{
			xmlTag = "Mndt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mandate";
			definition = "Information specifying the account mandate.";
			minOccurs = 1;
			complexType_lazy = () -> OperationMandate1.mmObject();
		}

		@Override
		public List<OperationMandate1> getValue(AccountMandateMaintenanceRequestV01 obj) {
			return obj.getMandate();
		}

		@Override
		public void setValue(AccountMandateMaintenanceRequestV01 obj, List<OperationMandate1> value) {
			obj.setMandate(value);
		}
	};
	@XmlElement(name = "AddtlMsgInf")
	protected AdditionalInformation5 additionalMessageInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation5
	 * AdditionalInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlMsgInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalMessageInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contains additional information related to the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, Optional<AdditionalInformation5>> mmAdditionalMessageInformation = new MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, Optional<AdditionalInformation5>>() {
		{
			xmlTag = "AddtlMsgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalMessageInformation";
			definition = "Contains additional information related to the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalInformation5.mmObject();
		}

		@Override
		public Optional<AdditionalInformation5> getValue(AccountMandateMaintenanceRequestV01 obj) {
			return obj.getAdditionalMessageInformation();
		}

		@Override
		public void setValue(AccountMandateMaintenanceRequestV01 obj, Optional<AdditionalInformation5> value) {
			obj.setAdditionalMessageInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "DgtlSgntr")
	protected List<PartyAndSignature1> digitalSignature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature1
	 * PartyAndSignature1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the signature with its components, namely signed info, signature value, key info and the object."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, List<PartyAndSignature1>> mmDigitalSignature = new MMMessageBuildingBlock<AccountMandateMaintenanceRequestV01, List<PartyAndSignature1>>() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Contains the signature with its components, namely signed info, signature value, key info and the object.";
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature1.mmObject();
		}

		@Override
		public List<PartyAndSignature1> getValue(AccountMandateMaintenanceRequestV01 obj) {
			return obj.getDigitalSignature();
		}

		@Override
		public void setValue(AccountMandateMaintenanceRequestV01 obj, List<PartyAndSignature1> value) {
			obj.setDigitalSignature(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountMandateMaintenanceRequestV01";
				definition = "Scope\r\nThe AccountMandateMaintenanceRequest message is sent from an organisation to a financial institution as part of the account maintenance process. It is the initial request message to update an account. This update is only about mandate information.\r\nUsage\r\nThis message should only be used for initiating the maintenance process of mandate information. This update is only about mandate information. The organisation will specify under the Mandate tag the complete information as it should be in the financial institutions records after processing the update request. It is not possible to update the account characteristics or organisation information with this message.\r\nIt is possible to request to update the mandate information of several accounts, if these accounts must have exactly the same mandates.\r\nThis message could be sent together with other related documents.";
				nextVersions_lazy = () -> Arrays.asList(AccountMandateMaintenanceRequestV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(BankAccountManagementISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AcctMndtMntncReq";
				businessArea_lazy = () -> AccountManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01.mmReferences, com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01.mmContractDates,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01.mmUnderlyingMasterAgreement, com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01.mmAccountIdentification,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01.mmAccountServicerIdentification, com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01.mmOrganisationIdentification,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01.mmMandate, com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01.mmAdditionalMessageInformation,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "017";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountMandateMaintenanceRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public References4 getReferences() {
		return references;
	}

	public AccountMandateMaintenanceRequestV01 setReferences(References4 references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public Optional<AccountContract2> getContractDates() {
		return contractDates == null ? Optional.empty() : Optional.of(contractDates);
	}

	public AccountMandateMaintenanceRequestV01 setContractDates(AccountContract2 contractDates) {
		this.contractDates = contractDates;
		return this;
	}

	public Optional<ContractDocument1> getUnderlyingMasterAgreement() {
		return underlyingMasterAgreement == null ? Optional.empty() : Optional.of(underlyingMasterAgreement);
	}

	public AccountMandateMaintenanceRequestV01 setUnderlyingMasterAgreement(ContractDocument1 underlyingMasterAgreement) {
		this.underlyingMasterAgreement = underlyingMasterAgreement;
		return this;
	}

	public List<AccountForAction1> getAccountIdentification() {
		return accountIdentification == null ? accountIdentification = new ArrayList<>() : accountIdentification;
	}

	public AccountMandateMaintenanceRequestV01 setAccountIdentification(List<AccountForAction1> accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification4 getAccountServicerIdentification() {
		return accountServicerIdentification;
	}

	public AccountMandateMaintenanceRequestV01 setAccountServicerIdentification(BranchAndFinancialInstitutionIdentification4 accountServicerIdentification) {
		this.accountServicerIdentification = Objects.requireNonNull(accountServicerIdentification);
		return this;
	}

	public List<OrganisationIdentification6> getOrganisationIdentification() {
		return organisationIdentification == null ? organisationIdentification = new ArrayList<>() : organisationIdentification;
	}

	public AccountMandateMaintenanceRequestV01 setOrganisationIdentification(List<OrganisationIdentification6> organisationIdentification) {
		this.organisationIdentification = Objects.requireNonNull(organisationIdentification);
		return this;
	}

	public List<OperationMandate1> getMandate() {
		return mandate == null ? mandate = new ArrayList<>() : mandate;
	}

	public AccountMandateMaintenanceRequestV01 setMandate(List<OperationMandate1> mandate) {
		this.mandate = Objects.requireNonNull(mandate);
		return this;
	}

	public Optional<AdditionalInformation5> getAdditionalMessageInformation() {
		return additionalMessageInformation == null ? Optional.empty() : Optional.of(additionalMessageInformation);
	}

	public AccountMandateMaintenanceRequestV01 setAdditionalMessageInformation(AdditionalInformation5 additionalMessageInformation) {
		this.additionalMessageInformation = additionalMessageInformation;
		return this;
	}

	public List<PartyAndSignature1> getDigitalSignature() {
		return digitalSignature == null ? digitalSignature = new ArrayList<>() : digitalSignature;
	}

	public AccountMandateMaintenanceRequestV01 setDigitalSignature(List<PartyAndSignature1> digitalSignature) {
		this.digitalSignature = Objects.requireNonNull(digitalSignature);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.017.001.01")
	static public class Document {
		@XmlElement(name = "AcctMndtMntncReq", required = true)
		public AccountMandateMaintenanceRequestV01 messageBody;
	}
}