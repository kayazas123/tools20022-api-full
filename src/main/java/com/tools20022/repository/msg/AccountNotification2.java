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
import com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV02;
import com.tools20022.repository.choice.ReportingSource1Choice;
import com.tools20022.repository.codeset.CopyDuplicate1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide details of the account notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmIdentification
 * AccountNotification2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmElectronicSequenceNumber
 * AccountNotification2.mmElectronicSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmLegalSequenceNumber
 * AccountNotification2.mmLegalSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmCreationDateTime
 * AccountNotification2.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmFromToDate
 * AccountNotification2.mmFromToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmCopyDuplicateIndicator
 * AccountNotification2.mmCopyDuplicateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmReportingSource
 * AccountNotification2.mmReportingSource}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification2#mmAccount
 * AccountNotification2.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmRelatedAccount
 * AccountNotification2.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmInterest
 * AccountNotification2.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmTransactionsSummary
 * AccountNotification2.mmTransactionsSummary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification2#mmEntry
 * AccountNotification2.mmEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmAdditionalNotificationInformation
 * AccountNotification2.mmAdditionalNotificationInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashBalance
 * CashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV02#mmNotification
 * BankToCustomerDebitCreditNotificationV02.mmNotification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountNotification2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide details of the account notification."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountNotification2", propOrder = {"identification", "electronicSequenceNumber", "legalSequenceNumber", "creationDateTime", "fromToDate", "copyDuplicateIndicator", "reportingSource", "account", "relatedAccount",
		"interest", "transactionsSummary", "entry", "additionalNotificationInformation"})
public class AccountNotification2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2
	 * AccountNotification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the account servicer, to unambiguously identify the account notification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountNotification2, Max35Text> mmIdentification = new MMMessageAttribute<AccountNotification2, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification, as assigned by the account servicer, to unambiguously identify the account notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AccountNotification2 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(AccountNotification2 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "ElctrncSeqNb")
	protected Number electronicSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2
	 * AccountNotification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncSeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequential number of the notification, as assigned by the account servicer. \nUsage: The sequential number is increased incrementally for each notification sent electronically."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountNotification2, Optional<Number>> mmElectronicSequenceNumber = new MMMessageAttribute<AccountNotification2, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification2.mmObject();
			isDerived = false;
			xmlTag = "ElctrncSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicSequenceNumber";
			definition = "Sequential number of the notification, as assigned by the account servicer. \nUsage: The sequential number is increased incrementally for each notification sent electronically.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(AccountNotification2 obj) {
			return obj.getElectronicSequenceNumber();
		}

		@Override
		public void setValue(AccountNotification2 obj, Optional<Number> value) {
			obj.setElectronicSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "LglSeqNb")
	protected Number legalSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2
	 * AccountNotification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglSeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal sequential number of the notification, as assigned by the account servicer. It is increased incrementally for each notification sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountNotification2, Optional<Number>> mmLegalSequenceNumber = new MMMessageAttribute<AccountNotification2, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification2.mmObject();
			isDerived = false;
			xmlTag = "LglSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalSequenceNumber";
			definition = "Legal sequential number of the notification, as assigned by the account servicer. It is increased incrementally for each notification sent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(AccountNotification2 obj) {
			return obj.getLegalSequenceNumber();
		}

		@Override
		public void setValue(AccountNotification2 obj, Optional<Number> value) {
			obj.setLegalSequenceNumber(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2
	 * AccountNotification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the message was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountNotification2, ISODateTime> mmCreationDateTime = new MMMessageAttribute<AccountNotification2, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification2.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(AccountNotification2 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(AccountNotification2 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "FrToDt")
	protected DateTimePeriodDetails fromToDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
	 * DateTimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmReportedPeriod
	 * Account.mmReportedPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2
	 * AccountNotification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Range of time between a start date and an end date for which the account notification is issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountNotification2, Optional<DateTimePeriodDetails>> mmFromToDate = new MMMessageAssociationEnd<AccountNotification2, Optional<DateTimePeriodDetails>>() {
		{
			businessElementTrace_lazy = () -> Account.mmReportedPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification2.mmObject();
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Range of time between a start date and an end date for which the account notification is issued.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateTimePeriodDetails.mmObject();
		}

		@Override
		public Optional<DateTimePeriodDetails> getValue(AccountNotification2 obj) {
			return obj.getFromToDate();
		}

		@Override
		public void setValue(AccountNotification2 obj, Optional<DateTimePeriodDetails> value) {
			obj.setFromToDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CpyDplctInd")
	protected CopyDuplicate1Code copyDuplicateIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
	 * CopyDuplicate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2
	 * AccountNotification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDplctInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the document is a copy, a duplicate, or a duplicate of a copy."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountNotification2, Optional<CopyDuplicate1Code>> mmCopyDuplicateIndicator = new MMMessageAttribute<AccountNotification2, Optional<CopyDuplicate1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification2.mmObject();
			isDerived = false;
			xmlTag = "CpyDplctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDuplicateIndicator";
			definition = "Indicates whether the document is a copy, a duplicate, or a duplicate of a copy.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CopyDuplicate1Code.mmObject();
		}

		@Override
		public Optional<CopyDuplicate1Code> getValue(AccountNotification2 obj) {
			return obj.getCopyDuplicateIndicator();
		}

		@Override
		public void setValue(AccountNotification2 obj, Optional<CopyDuplicate1Code> value) {
			obj.setCopyDuplicateIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "RptgSrc")
	protected ReportingSource1Choice reportingSource;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ReportingSource1Choice
	 * ReportingSource1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2
	 * AccountNotification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgSrc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the application used to generate the reporting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountNotification2, Optional<ReportingSource1Choice>> mmReportingSource = new MMMessageAssociationEnd<AccountNotification2, Optional<ReportingSource1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification2.mmObject();
			isDerived = false;
			xmlTag = "RptgSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingSource";
			definition = "Specifies the application used to generate the reporting.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReportingSource1Choice.mmObject();
		}

		@Override
		public Optional<ReportingSource1Choice> getValue(AccountNotification2 obj) {
			return obj.getReportingSource();
		}

		@Override
		public void setValue(AccountNotification2 obj, Optional<ReportingSource1Choice> value) {
			obj.setReportingSource(value.orElse(null));
		}
	};
	@XmlElement(name = "Acct", required = true)
	protected CashAccount20 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount20
	 * CashAccount20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCashAccount
	 * CashBalance.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2
	 * AccountNotification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account to which credit and debit entries are made."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountNotification2, CashAccount20> mmAccount = new MMMessageAssociationEnd<AccountNotification2, CashAccount20>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification2.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unambiguous identification of the account to which credit and debit entries are made.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount20.mmObject();
		}

		@Override
		public CashAccount20 getValue(AccountNotification2 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(AccountNotification2 obj, CashAccount20 value) {
			obj.setAccount(value);
		}
	};
	@XmlElement(name = "RltdAcct")
	protected CashAccount16 relatedAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCashAccount
	 * CashBalance.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2
	 * AccountNotification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the parent account of the account for which the notification has been issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountNotification2, Optional<CashAccount16>> mmRelatedAccount = new MMMessageAssociationEnd<AccountNotification2, Optional<CashAccount16>>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification2.mmObject();
			isDerived = false;
			xmlTag = "RltdAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedAccount";
			definition = "Identifies the parent account of the account for which the notification has been issued.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount16.mmObject();
		}

		@Override
		public Optional<CashAccount16> getValue(AccountNotification2 obj) {
			return obj.getRelatedAccount();
		}

		@Override
		public void setValue(AccountNotification2 obj, Optional<CashAccount16> value) {
			obj.setRelatedAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "Intrst")
	protected List<AccountInterest2> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountInterest2
	 * AccountInterest2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2
	 * AccountNotification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide general interest information that applies to the account at a particular moment in time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountNotification2, List<AccountInterest2>> mmInterest = new MMMessageAssociationEnd<AccountNotification2, List<AccountInterest2>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification2.mmObject();
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Set of elements used to provide general interest information that applies to the account at a particular moment in time.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountInterest2.mmObject();
		}

		@Override
		public List<AccountInterest2> getValue(AccountNotification2 obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(AccountNotification2 obj, List<AccountInterest2> value) {
			obj.setInterest(value);
		}
	};
	@XmlElement(name = "TxsSummry")
	protected TotalTransactions2 transactionsSummary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalTransactions2
	 * TotalTransactions2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2
	 * AccountNotification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxsSummry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionsSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide summary information on entries."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountNotification2, Optional<TotalTransactions2>> mmTransactionsSummary = new MMMessageAssociationEnd<AccountNotification2, Optional<TotalTransactions2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification2.mmObject();
			isDerived = false;
			xmlTag = "TxsSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionsSummary";
			definition = "Set of elements used to provide summary information on entries.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TotalTransactions2.mmObject();
		}

		@Override
		public Optional<TotalTransactions2> getValue(AccountNotification2 obj) {
			return obj.getTransactionsSummary();
		}

		@Override
		public void setValue(AccountNotification2 obj, Optional<TotalTransactions2> value) {
			obj.setTransactionsSummary(value.orElse(null));
		}
	};
	@XmlElement(name = "Ntry")
	protected List<ReportEntry2> entry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReportEntry2
	 * ReportEntry2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCashBalanceEntry
	 * CashBalance.mmCashBalanceEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2
	 * AccountNotification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to specify an entry in the debit credit notification.\nUsage: At least one reference must be provided to identify the entry and its underlying transaction(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountNotification2, List<ReportEntry2>> mmEntry = new MMMessageAssociationEnd<AccountNotification2, List<ReportEntry2>>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCashBalanceEntry;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification2.mmObject();
			isDerived = false;
			xmlTag = "Ntry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entry";
			definition = "Set of elements used to specify an entry in the debit credit notification.\nUsage: At least one reference must be provided to identify the entry and its underlying transaction(s).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReportEntry2.mmObject();
		}

		@Override
		public List<ReportEntry2> getValue(AccountNotification2 obj) {
			return obj.getEntry();
		}

		@Override
		public void setValue(AccountNotification2 obj, List<ReportEntry2> value) {
			obj.setEntry(value);
		}
	};
	@XmlElement(name = "AddtlNtfctnInf")
	protected Max500Text additionalNotificationInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2
	 * AccountNotification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlNtfctnInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalNotificationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details of the account notification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountNotification2, Optional<Max500Text>> mmAdditionalNotificationInformation = new MMMessageAttribute<AccountNotification2, Optional<Max500Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification2.mmObject();
			isDerived = false;
			xmlTag = "AddtlNtfctnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalNotificationInformation";
			definition = "Further details of the account notification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(AccountNotification2 obj) {
			return obj.getAdditionalNotificationInformation();
		}

		@Override
		public void setValue(AccountNotification2 obj, Optional<Max500Text> value) {
			obj.setAdditionalNotificationInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountNotification2.mmIdentification, com.tools20022.repository.msg.AccountNotification2.mmElectronicSequenceNumber,
						com.tools20022.repository.msg.AccountNotification2.mmLegalSequenceNumber, com.tools20022.repository.msg.AccountNotification2.mmCreationDateTime, com.tools20022.repository.msg.AccountNotification2.mmFromToDate,
						com.tools20022.repository.msg.AccountNotification2.mmCopyDuplicateIndicator, com.tools20022.repository.msg.AccountNotification2.mmReportingSource, com.tools20022.repository.msg.AccountNotification2.mmAccount,
						com.tools20022.repository.msg.AccountNotification2.mmRelatedAccount, com.tools20022.repository.msg.AccountNotification2.mmInterest, com.tools20022.repository.msg.AccountNotification2.mmTransactionsSummary,
						com.tools20022.repository.msg.AccountNotification2.mmEntry, com.tools20022.repository.msg.AccountNotification2.mmAdditionalNotificationInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(BankToCustomerDebitCreditNotificationV02.mmNotification);
				trace_lazy = () -> CashBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountNotification2";
				definition = "Set of elements used to provide details of the account notification.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public AccountNotification2 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Number> getElectronicSequenceNumber() {
		return electronicSequenceNumber == null ? Optional.empty() : Optional.of(electronicSequenceNumber);
	}

	public AccountNotification2 setElectronicSequenceNumber(Number electronicSequenceNumber) {
		this.electronicSequenceNumber = electronicSequenceNumber;
		return this;
	}

	public Optional<Number> getLegalSequenceNumber() {
		return legalSequenceNumber == null ? Optional.empty() : Optional.of(legalSequenceNumber);
	}

	public AccountNotification2 setLegalSequenceNumber(Number legalSequenceNumber) {
		this.legalSequenceNumber = legalSequenceNumber;
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public AccountNotification2 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Optional<DateTimePeriodDetails> getFromToDate() {
		return fromToDate == null ? Optional.empty() : Optional.of(fromToDate);
	}

	public AccountNotification2 setFromToDate(DateTimePeriodDetails fromToDate) {
		this.fromToDate = fromToDate;
		return this;
	}

	public Optional<CopyDuplicate1Code> getCopyDuplicateIndicator() {
		return copyDuplicateIndicator == null ? Optional.empty() : Optional.of(copyDuplicateIndicator);
	}

	public AccountNotification2 setCopyDuplicateIndicator(CopyDuplicate1Code copyDuplicateIndicator) {
		this.copyDuplicateIndicator = copyDuplicateIndicator;
		return this;
	}

	public Optional<ReportingSource1Choice> getReportingSource() {
		return reportingSource == null ? Optional.empty() : Optional.of(reportingSource);
	}

	public AccountNotification2 setReportingSource(ReportingSource1Choice reportingSource) {
		this.reportingSource = reportingSource;
		return this;
	}

	public CashAccount20 getAccount() {
		return account;
	}

	public AccountNotification2 setAccount(CashAccount20 account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public Optional<CashAccount16> getRelatedAccount() {
		return relatedAccount == null ? Optional.empty() : Optional.of(relatedAccount);
	}

	public AccountNotification2 setRelatedAccount(CashAccount16 relatedAccount) {
		this.relatedAccount = relatedAccount;
		return this;
	}

	public List<AccountInterest2> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public AccountNotification2 setInterest(List<AccountInterest2> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public Optional<TotalTransactions2> getTransactionsSummary() {
		return transactionsSummary == null ? Optional.empty() : Optional.of(transactionsSummary);
	}

	public AccountNotification2 setTransactionsSummary(TotalTransactions2 transactionsSummary) {
		this.transactionsSummary = transactionsSummary;
		return this;
	}

	public List<ReportEntry2> getEntry() {
		return entry == null ? entry = new ArrayList<>() : entry;
	}

	public AccountNotification2 setEntry(List<ReportEntry2> entry) {
		this.entry = Objects.requireNonNull(entry);
		return this;
	}

	public Optional<Max500Text> getAdditionalNotificationInformation() {
		return additionalNotificationInformation == null ? Optional.empty() : Optional.of(additionalNotificationInformation);
	}

	public AccountNotification2 setAdditionalNotificationInformation(Max500Text additionalNotificationInformation) {
		this.additionalNotificationInformation = additionalNotificationInformation;
		return this;
	}
}