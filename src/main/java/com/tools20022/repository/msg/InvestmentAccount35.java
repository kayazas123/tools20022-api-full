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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
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
 * Account between an investor(s) and a fund manager or a fund. The account can
 * contain holdings in any investment fund or investment fund class managed (or
 * distributed) by the fund manager, within the same fund family.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmIdentification
 * InvestmentAccount35.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmStatus
 * InvestmentAccount35.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmName
 * InvestmentAccount35.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmDesignation
 * InvestmentAccount35.mmDesignation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmType
 * InvestmentAccount35.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmOwnershipType
 * InvestmentAccount35.mmOwnershipType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmTaxExemption
 * InvestmentAccount35.mmTaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmStatementFrequency
 * InvestmentAccount35.mmStatementFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmReferenceCurrency
 * InvestmentAccount35.mmReferenceCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmLanguage
 * InvestmentAccount35.mmLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmIncomePreference
 * InvestmentAccount35.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmTaxWithholdingMethod
 * InvestmentAccount35.mmTaxWithholdingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmLetterIntentDetails
 * InvestmentAccount35.mmLetterIntentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmAccumulationRightReference
 * InvestmentAccount35.mmAccumulationRightReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmRequiredSignatoriesNumber
 * InvestmentAccount35.mmRequiredSignatoriesNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmFundFamilyName
 * InvestmentAccount35.mmFundFamilyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmRoundingDetails
 * InvestmentAccount35.mmRoundingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmAccountServicer
 * InvestmentAccount35.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmFundsDetails
 * InvestmentAccount35.mmFundsDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmCashAccount
 * InvestmentAccount35.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmSecuritiesAccount
 * InvestmentAccount35.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmBlockedStatus
 * InvestmentAccount35.mmBlockedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmAccountUsageType
 * InvestmentAccount35.mmAccountUsageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmForeignStatusCertification
 * InvestmentAccount35.mmForeignStatusCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#mmAccountSignatureDateTime
 * InvestmentAccount35.mmAccountSignatureDateTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
 * InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmInvestmentAccount
 * AccountDetailsConfirmationV03.mmInvestmentAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentAccount35"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount35
 * ConstraintFundDetailsGuideline.forInvestmentAccount35}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount38
 * InvestmentAccount38}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27
 * InvestmentAccount27}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccount35", propOrder = {"identification", "status", "name", "designation", "type", "ownershipType", "taxExemption", "statementFrequency", "referenceCurrency", "language", "incomePreference",
		"taxWithholdingMethod", "letterIntentDetails", "accumulationRightReference", "requiredSignatoriesNumber", "fundFamilyName", "roundingDetails", "accountServicer", "fundsDetails", "cashAccount", "securitiesAccount", "blockedStatus",
		"accountUsageType", "foreignStatusCertification", "accountSignatureDateTime"})
public class InvestmentAccount35 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected AccountIdentification1 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification1
	 * AccountIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmIdentification
	 * InvestmentAccount38.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, AccountIdentification1> mmIdentification = new MMMessageAttribute<InvestmentAccount35, AccountIdentification1>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification1.mmObject();
		}

		@Override
		public AccountIdentification1 getValue(InvestmentAccount35 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, AccountIdentification1 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected AccountStatus2Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatus2Code
	 * AccountStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmStatus
	 * Account.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the current state of an account, eg, enabled or deleted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmStatus
	 * InvestmentAccount38.mmStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, AccountStatus2Code> mmStatus = new MMMessageAttribute<InvestmentAccount35, AccountStatus2Code>() {
		{
			businessElementTrace_lazy = () -> Account.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Specifies the current state of an account, eg, enabled or deleted.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmStatus);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountStatus2Code.mmObject();
		}

		@Override
		public AccountStatus2Code getValue(InvestmentAccount35 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, AccountStatus2Code value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "Nm")
	protected Max35Text name;
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
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmName
	 * InvestmentAccount38.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<Max35Text>> mmName = new MMMessageAttribute<InvestmentAccount35, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentAccount35 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<Max35Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "Dsgnt")
	protected Max35Text designation;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDesignation
	 * InvestmentAccount.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dsgnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Designation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmDesignation
	 * InvestmentAccount38.mmDesignation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<Max35Text>> mmDesignation = new MMMessageAttribute<InvestmentAccount35, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmDesignation;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "Dsgnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Designation";
			definition = "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmDesignation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentAccount35 obj) {
			return obj.getDesignation();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<Max35Text> value) {
			obj.setDesignation(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected AccountType1Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountType1Choice
	 * AccountType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purpose of the account/source fund type. This is typically linked to an investment product, for example, wrapper, ISA."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmType
	 * InvestmentAccount38.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<AccountType1Choice>> mmType = new MMMessageAttribute<InvestmentAccount35, Optional<AccountType1Choice>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Purpose of the account/source fund type. This is typically linked to an investment product, for example, wrapper, ISA.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountType1Choice.mmObject();
		}

		@Override
		public Optional<AccountType1Choice> getValue(InvestmentAccount35 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<AccountType1Choice> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "OwnrshTp", required = true)
	protected OwnershipType1Choice ownershipType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.OwnershipType1Choice
	 * OwnershipType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmOwnershipType
	 * InvestmentAccount.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnrshTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnershipType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership status of the account, for example, joint owners."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmOwnershipType
	 * InvestmentAccount38.mmOwnershipType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, OwnershipType1Choice> mmOwnershipType = new MMMessageAttribute<InvestmentAccount35, OwnershipType1Choice>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmOwnershipType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "OwnrshTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnershipType";
			definition = "Ownership status of the account, for example, joint owners.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmOwnershipType);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OwnershipType1Choice.mmObject();
		}

		@Override
		public OwnershipType1Choice getValue(InvestmentAccount35 obj) {
			return obj.getOwnershipType();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, OwnershipType1Choice value) {
			obj.setOwnershipType(value);
		}
	};
	@XmlElement(name = "TaxXmptn")
	protected TaxExemptionReason1Choice taxExemption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReason1Choice
	 * TaxExemptionReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTax
	 * InvestmentAccount.mmInvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxXmptn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax advantage specific to the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmTaxExemption
	 * InvestmentAccount38.mmTaxExemption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<TaxExemptionReason1Choice>> mmTaxExemption = new MMMessageAttribute<InvestmentAccount35, Optional<TaxExemptionReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentFundTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "TaxXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemption";
			definition = "Tax advantage specific to the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmTaxExemption);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TaxExemptionReason1Choice.mmObject();
		}

		@Override
		public Optional<TaxExemptionReason1Choice> getValue(InvestmentAccount35 obj) {
			return obj.getTaxExemption();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<TaxExemptionReason1Choice> value) {
			obj.setTaxExemption(value.orElse(null));
		}
	};
	@XmlElement(name = "StmtFrqcy")
	protected StatementFrequencyReason1Choice statementFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementFrequencyReason1Choice
	 * StatementFrequencyReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
	 * ReportingService.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtFrqcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency at which a statement is issued."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmStatementFrequency
	 * InvestmentAccount38.mmStatementFrequency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<StatementFrequencyReason1Choice>> mmStatementFrequency = new MMMessageAttribute<InvestmentAccount35, Optional<StatementFrequencyReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "StmtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementFrequency";
			definition = "Frequency at which a statement is issued.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmStatementFrequency);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementFrequencyReason1Choice.mmObject();
		}

		@Override
		public Optional<StatementFrequencyReason1Choice> getValue(InvestmentAccount35 obj) {
			return obj.getStatementFrequency();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<StatementFrequencyReason1Choice> value) {
			obj.setStatementFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "RefCcy")
	protected ActiveCurrencyCode referenceCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmReferenceCurrency
	 * InvestmentAccount.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency chosen for reporting purposes by the account owner in agreement with the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmReferenceCurrency
	 * InvestmentAccount38.mmReferenceCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<ActiveCurrencyCode>> mmReferenceCurrency = new MMMessageAttribute<InvestmentAccount35, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmReferenceCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "RefCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceCurrency";
			definition = "Currency chosen for reporting purposes by the account owner in agreement with the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmReferenceCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(InvestmentAccount35 obj) {
			return obj.getReferenceCurrency();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<ActiveCurrencyCode> value) {
			obj.setReferenceCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "Lang")
	protected LanguageCode language;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmLanguage
	 * Account.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lang"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language for all communication concerning the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmLanguage
	 * InvestmentAccount38.mmLanguage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<LanguageCode>> mmLanguage = new MMMessageAttribute<InvestmentAccount35, Optional<LanguageCode>>() {
		{
			businessElementTrace_lazy = () -> Account.mmLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "Lang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Language";
			definition = "Language for all communication concerning the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmLanguage);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public Optional<LanguageCode> getValue(InvestmentAccount35 obj) {
			return obj.getLanguage();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<LanguageCode> value) {
			obj.setLanguage(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmPref")
	protected IncomePreference1Code incomePreference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreference1Code
	 * IncomePreference1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
	 * InvestmentAccountService.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPref"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmIncomePreference
	 * InvestmentAccount38.mmIncomePreference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<IncomePreference1Code>> mmIncomePreference = new MMMessageAttribute<InvestmentAccount35, Optional<IncomePreference1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmIncomePreference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}

		@Override
		public Optional<IncomePreference1Code> getValue(InvestmentAccount35 obj) {
			return obj.getIncomePreference();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<IncomePreference1Code> value) {
			obj.setIncomePreference(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxWhldgMtd")
	protected TaxWithholdingMethod2Code taxWithholdingMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod2Code
	 * TaxWithholdingMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmTaxWithholdingMethod
	 * InvestmentAccountService.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxWhldgMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxWithholdingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method by which the tax (withholding tax) is to be processed i.e. either withheld at source or tax information reported to tax authorities or tax information is reported due to the provision of a tax certificate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmTaxWithholdingMethod
	 * InvestmentAccount38.mmTaxWithholdingMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<TaxWithholdingMethod2Code>> mmTaxWithholdingMethod = new MMMessageAttribute<InvestmentAccount35, Optional<TaxWithholdingMethod2Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmTaxWithholdingMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "TaxWhldgMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxWithholdingMethod";
			definition = "Method by which the tax (withholding tax) is to be processed i.e. either withheld at source or tax information reported to tax authorities or tax information is reported due to the provision of a tax certificate.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmTaxWithholdingMethod);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxWithholdingMethod2Code.mmObject();
		}

		@Override
		public Optional<TaxWithholdingMethod2Code> getValue(InvestmentAccount35 obj) {
			return obj.getTaxWithholdingMethod();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<TaxWithholdingMethod2Code> value) {
			obj.setTaxWithholdingMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "LttrInttDtls")
	protected LetterIntent1 letterIntentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.LetterIntent1
	 * LetterIntent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmLetterIntentReference
	 * InvestmentAccountContract.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrInttDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterIntentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the letter of intent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmLetterIntentDetails
	 * InvestmentAccount38.mmLetterIntentDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<LetterIntent1>> mmLetterIntentDetails = new MMMessageAttribute<InvestmentAccount35, Optional<LetterIntent1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountContract.mmLetterIntentReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "LttrInttDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterIntentDetails";
			definition = "Details of the letter of intent.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmLetterIntentDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> LetterIntent1.mmObject();
		}

		@Override
		public Optional<LetterIntent1> getValue(InvestmentAccount35 obj) {
			return obj.getLetterIntentDetails();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<LetterIntent1> value) {
			obj.setLetterIntentDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "AcmltnRghtRef")
	protected Max35Text accumulationRightReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmAccumulationRightReference
	 * InvestmentAccountContract.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcmltnRghtRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulationRightReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of an accumulation rights program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmAccumulationRightReference
	 * InvestmentAccount38.mmAccumulationRightReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<Max35Text>> mmAccumulationRightReference = new MMMessageAttribute<InvestmentAccount35, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountContract.mmAccumulationRightReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "AcmltnRghtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulationRightReference";
			definition = "Reference of an accumulation rights program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmAccumulationRightReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentAccount35 obj) {
			return obj.getAccumulationRightReference();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<Max35Text> value) {
			obj.setAccumulationRightReference(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqrdSgntriesNb")
	protected Number requiredSignatoriesNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmRequiredSignatureNumber
	 * SignatureCondition.mmRequiredSignatureNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqrdSgntriesNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredSignatoriesNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of account owners or related parties required to authorise transactions on the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmRequiredSignatoriesNumber
	 * InvestmentAccount38.mmRequiredSignatoriesNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<Number>> mmRequiredSignatoriesNumber = new MMMessageAttribute<InvestmentAccount35, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmRequiredSignatureNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "ReqrdSgntriesNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredSignatoriesNumber";
			definition = "Number of account owners or related parties required to authorise transactions on the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmRequiredSignatoriesNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(InvestmentAccount35 obj) {
			return obj.getRequiredSignatoriesNumber();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<Number> value) {
			obj.setRequiredSignatoriesNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "FndFmlyNm")
	protected Max350Text fundFamilyName;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily#mmFundFamilyName
	 * InvestmentFundFamily.mmFundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndFmlyNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundFamilyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the investment fund family."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmFundFamilyName
	 * InvestmentAccount38.mmFundFamilyName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<Max350Text>> mmFundFamilyName = new MMMessageAttribute<InvestmentAccount35, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundFamily.mmFundFamilyName;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "FndFmlyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundFamilyName";
			definition = "Name of the investment fund family.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmFundFamilyName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(InvestmentAccount35 obj) {
			return obj.getFundFamilyName();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<Max350Text> value) {
			obj.setFundFamilyName(value.orElse(null));
		}
	};
	@XmlElement(name = "RndgDtls")
	protected RoundingParameters1 roundingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RoundingParameters1
	 * RoundingParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmRoundingMethod
	 * InvestmentAccountService.mmRoundingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndgDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters to be applied on deal amount for orders when the amount is a fractional number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmRoundingDetails
	 * InvestmentAccount38.mmRoundingDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccount35, Optional<RoundingParameters1>> mmRoundingDetails = new MMMessageAssociationEnd<InvestmentAccount35, Optional<RoundingParameters1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmRoundingMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "RndgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingDetails";
			definition = "Parameters to be applied on deal amount for orders when the amount is a fractional number.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmRoundingDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RoundingParameters1.mmObject();
		}

		@Override
		public Optional<RoundingParameters1> getValue(InvestmentAccount35 obj) {
			return obj.getRoundingDetails();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<RoundingParameters1> value) {
			obj.setRoundingDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected PartyIdentification2Choice accountServicer;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmAccountServicer
	 * InvestmentAccount38.mmAccountServicer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccount35, Optional<PartyIdentification2Choice>> mmAccountServicer = new MMMessageAssociationEnd<InvestmentAccount35, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmAccountServicer);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(InvestmentAccount35 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<PartyIdentification2Choice> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "FndsDtls")
	protected List<FinancialInstrument29> fundsDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument29
	 * FinancialInstrument29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundClass
	 * InvestmentAccount.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndsDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information about the investment fund associated to the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmFundsDetails
	 * InvestmentAccount38.mmFundsDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccount35, List<FinancialInstrument29>> mmFundsDetails = new MMMessageAssociationEnd<InvestmentAccount35, List<FinancialInstrument29>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "FndsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsDetails";
			definition = "Detailed information about the investment fund associated to the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmFundsDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrument29.mmObject();
		}

		@Override
		public List<FinancialInstrument29> getValue(InvestmentAccount35 obj) {
			return obj.getFundsDetails();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, List<FinancialInstrument29> value) {
			obj.setFundsDetails(value);
		}
	};
	@XmlElement(name = "CshAcct")
	protected List<CashAccount12> cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount12
	 * CashAccount12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCashAccount
	 * InvestmentAccount.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the investment account to or from which cash entries are made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmCashAccount
	 * InvestmentAccount38.mmCashAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccount35, List<CashAccount12>> mmCashAccount = new MMMessageAssociationEnd<InvestmentAccount35, List<CashAccount12>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Part of the investment account to or from which cash entries are made.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmCashAccount);
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount12.mmObject();
		}

		@Override
		public List<CashAccount12> getValue(InvestmentAccount35 obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, List<CashAccount12> value) {
			obj.setCashAccount(value);
		}
	};
	@XmlElement(name = "SctiesAcct")
	protected List<SecuritiesAccount4> securitiesAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount4
	 * SecuritiesAccount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmSecuritiesAccount
	 * InvestmentAccount.mmSecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the investment account to or from which securities entries are made."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmSecuritiesAccount
	 * InvestmentAccount38.mmSecuritiesAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccount35, List<SecuritiesAccount4>> mmSecuritiesAccount = new MMMessageAssociationEnd<InvestmentAccount35, List<SecuritiesAccount4>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmSecuritiesAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccount";
			definition = "Part of the investment account to or from which securities entries are made.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmSecuritiesAccount);
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount4.mmObject();
		}

		@Override
		public List<SecuritiesAccount4> getValue(InvestmentAccount35 obj) {
			return obj.getSecuritiesAccount();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, List<SecuritiesAccount4> value) {
			obj.setSecuritiesAccount(value);
		}
	};
	@XmlElement(name = "BlckdSts")
	protected Blocked1 blockedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Blocked1
	 * Blocked1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmStatus
	 * Account.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckdSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies information about blocked accounts."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmBlockedStatus
	 * InvestmentAccount38.mmBlockedStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<Blocked1>> mmBlockedStatus = new MMMessageAttribute<InvestmentAccount35, Optional<Blocked1>>() {
		{
			businessElementTrace_lazy = () -> Account.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "BlckdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedStatus";
			definition = "Specifies information about blocked accounts.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmBlockedStatus);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Blocked1.mmObject();
		}

		@Override
		public Optional<Blocked1> getValue(InvestmentAccount35 obj) {
			return obj.getBlockedStatus();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<Blocked1> value) {
			obj.setBlockedStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctUsgTp")
	protected AccountUsageType1Choice accountUsageType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountUsageType1Choice
	 * AccountUsageType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctUsgTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountUsageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of usage of the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmAccountUsageType
	 * InvestmentAccount38.mmAccountUsageType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<AccountUsageType1Choice>> mmAccountUsageType = new MMMessageAttribute<InvestmentAccount35, Optional<AccountUsageType1Choice>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "AcctUsgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountUsageType";
			definition = "Specifies the type of usage of the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmAccountUsageType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountUsageType1Choice.mmObject();
		}

		@Override
		public Optional<AccountUsageType1Choice> getValue(InvestmentAccount35 obj) {
			return obj.getAccountUsageType();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<AccountUsageType1Choice> value) {
			obj.setAccountUsageType(value.orElse(null));
		}
	};
	@XmlElement(name = "FrgnStsCertfctn")
	protected Provided1Code foreignStatusCertification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Provided1Code
	 * Provided1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnStsCertfctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignStatusCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if documentary evidence has been provided for the foreign resident."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmForeignStatusCertification
	 * InvestmentAccount38.mmForeignStatusCertification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<Provided1Code>> mmForeignStatusCertification = new MMMessageAttribute<InvestmentAccount35, Optional<Provided1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "FrgnStsCertfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignStatusCertification";
			definition = "Specifies if documentary evidence has been provided for the foreign resident.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmForeignStatusCertification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Provided1Code.mmObject();
		}

		@Override
		public Optional<Provided1Code> getValue(InvestmentAccount35 obj) {
			return obj.getForeignStatusCertification();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<Provided1Code> value) {
			obj.setForeignStatusCertification(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSgntrDtTm")
	protected DateAndDateTimeChoice accountSignatureDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDateSigned
	 * Agreement.mmDateSigned}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35
	 * InvestmentAccount35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSgntrDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSignatureDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the investor signs the open account form."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmAccountSignatureDateTime
	 * InvestmentAccount38.mmAccountSignatureDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount35, Optional<DateAndDateTimeChoice>> mmAccountSignatureDateTime = new MMMessageAttribute<InvestmentAccount35, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDateSigned;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount35.mmObject();
			isDerived = false;
			xmlTag = "AcctSgntrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSignatureDateTime";
			definition = "Date the investor signs the open account form.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmAccountSignatureDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(InvestmentAccount35 obj) {
			return obj.getAccountSignatureDateTime();
		}

		@Override
		public void setValue(InvestmentAccount35 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setAccountSignatureDateTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount35.mmIdentification, com.tools20022.repository.msg.InvestmentAccount35.mmStatus,
						com.tools20022.repository.msg.InvestmentAccount35.mmName, com.tools20022.repository.msg.InvestmentAccount35.mmDesignation, com.tools20022.repository.msg.InvestmentAccount35.mmType,
						com.tools20022.repository.msg.InvestmentAccount35.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount35.mmTaxExemption, com.tools20022.repository.msg.InvestmentAccount35.mmStatementFrequency,
						com.tools20022.repository.msg.InvestmentAccount35.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount35.mmLanguage, com.tools20022.repository.msg.InvestmentAccount35.mmIncomePreference,
						com.tools20022.repository.msg.InvestmentAccount35.mmTaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount35.mmLetterIntentDetails,
						com.tools20022.repository.msg.InvestmentAccount35.mmAccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount35.mmRequiredSignatoriesNumber,
						com.tools20022.repository.msg.InvestmentAccount35.mmFundFamilyName, com.tools20022.repository.msg.InvestmentAccount35.mmRoundingDetails, com.tools20022.repository.msg.InvestmentAccount35.mmAccountServicer,
						com.tools20022.repository.msg.InvestmentAccount35.mmFundsDetails, com.tools20022.repository.msg.InvestmentAccount35.mmCashAccount, com.tools20022.repository.msg.InvestmentAccount35.mmSecuritiesAccount,
						com.tools20022.repository.msg.InvestmentAccount35.mmBlockedStatus, com.tools20022.repository.msg.InvestmentAccount35.mmAccountUsageType,
						com.tools20022.repository.msg.InvestmentAccount35.mmForeignStatusCertification, com.tools20022.repository.msg.InvestmentAccount35.mmAccountSignatureDateTime);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountDetailsConfirmationV03.mmInvestmentAccount);
				trace_lazy = () -> InvestmentAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount35);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccount35";
				definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentAccount38.mmObject());
				previousVersion_lazy = () -> InvestmentAccount27.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentification1 getIdentification() {
		return identification;
	}

	public InvestmentAccount35 setIdentification(AccountIdentification1 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public AccountStatus2Code getStatus() {
		return status;
	}

	public InvestmentAccount35 setStatus(AccountStatus2Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<Max35Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public InvestmentAccount35 setName(Max35Text name) {
		this.name = name;
		return this;
	}

	public Optional<Max35Text> getDesignation() {
		return designation == null ? Optional.empty() : Optional.of(designation);
	}

	public InvestmentAccount35 setDesignation(Max35Text designation) {
		this.designation = designation;
		return this;
	}

	public Optional<AccountType1Choice> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public InvestmentAccount35 setType(AccountType1Choice type) {
		this.type = type;
		return this;
	}

	public OwnershipType1Choice getOwnershipType() {
		return ownershipType;
	}

	public InvestmentAccount35 setOwnershipType(OwnershipType1Choice ownershipType) {
		this.ownershipType = Objects.requireNonNull(ownershipType);
		return this;
	}

	public Optional<TaxExemptionReason1Choice> getTaxExemption() {
		return taxExemption == null ? Optional.empty() : Optional.of(taxExemption);
	}

	public InvestmentAccount35 setTaxExemption(TaxExemptionReason1Choice taxExemption) {
		this.taxExemption = taxExemption;
		return this;
	}

	public Optional<StatementFrequencyReason1Choice> getStatementFrequency() {
		return statementFrequency == null ? Optional.empty() : Optional.of(statementFrequency);
	}

	public InvestmentAccount35 setStatementFrequency(StatementFrequencyReason1Choice statementFrequency) {
		this.statementFrequency = statementFrequency;
		return this;
	}

	public Optional<ActiveCurrencyCode> getReferenceCurrency() {
		return referenceCurrency == null ? Optional.empty() : Optional.of(referenceCurrency);
	}

	public InvestmentAccount35 setReferenceCurrency(ActiveCurrencyCode referenceCurrency) {
		this.referenceCurrency = referenceCurrency;
		return this;
	}

	public Optional<LanguageCode> getLanguage() {
		return language == null ? Optional.empty() : Optional.of(language);
	}

	public InvestmentAccount35 setLanguage(LanguageCode language) {
		this.language = language;
		return this;
	}

	public Optional<IncomePreference1Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public InvestmentAccount35 setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public Optional<TaxWithholdingMethod2Code> getTaxWithholdingMethod() {
		return taxWithholdingMethod == null ? Optional.empty() : Optional.of(taxWithholdingMethod);
	}

	public InvestmentAccount35 setTaxWithholdingMethod(TaxWithholdingMethod2Code taxWithholdingMethod) {
		this.taxWithholdingMethod = taxWithholdingMethod;
		return this;
	}

	public Optional<LetterIntent1> getLetterIntentDetails() {
		return letterIntentDetails == null ? Optional.empty() : Optional.of(letterIntentDetails);
	}

	public InvestmentAccount35 setLetterIntentDetails(LetterIntent1 letterIntentDetails) {
		this.letterIntentDetails = letterIntentDetails;
		return this;
	}

	public Optional<Max35Text> getAccumulationRightReference() {
		return accumulationRightReference == null ? Optional.empty() : Optional.of(accumulationRightReference);
	}

	public InvestmentAccount35 setAccumulationRightReference(Max35Text accumulationRightReference) {
		this.accumulationRightReference = accumulationRightReference;
		return this;
	}

	public Optional<Number> getRequiredSignatoriesNumber() {
		return requiredSignatoriesNumber == null ? Optional.empty() : Optional.of(requiredSignatoriesNumber);
	}

	public InvestmentAccount35 setRequiredSignatoriesNumber(Number requiredSignatoriesNumber) {
		this.requiredSignatoriesNumber = requiredSignatoriesNumber;
		return this;
	}

	public Optional<Max350Text> getFundFamilyName() {
		return fundFamilyName == null ? Optional.empty() : Optional.of(fundFamilyName);
	}

	public InvestmentAccount35 setFundFamilyName(Max350Text fundFamilyName) {
		this.fundFamilyName = fundFamilyName;
		return this;
	}

	public Optional<RoundingParameters1> getRoundingDetails() {
		return roundingDetails == null ? Optional.empty() : Optional.of(roundingDetails);
	}

	public InvestmentAccount35 setRoundingDetails(RoundingParameters1 roundingDetails) {
		this.roundingDetails = roundingDetails;
		return this;
	}

	public Optional<PartyIdentification2Choice> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public InvestmentAccount35 setAccountServicer(PartyIdentification2Choice accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public List<FinancialInstrument29> getFundsDetails() {
		return fundsDetails == null ? fundsDetails = new ArrayList<>() : fundsDetails;
	}

	public InvestmentAccount35 setFundsDetails(List<FinancialInstrument29> fundsDetails) {
		this.fundsDetails = Objects.requireNonNull(fundsDetails);
		return this;
	}

	public List<CashAccount12> getCashAccount() {
		return cashAccount == null ? cashAccount = new ArrayList<>() : cashAccount;
	}

	public InvestmentAccount35 setCashAccount(List<CashAccount12> cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}

	public List<SecuritiesAccount4> getSecuritiesAccount() {
		return securitiesAccount == null ? securitiesAccount = new ArrayList<>() : securitiesAccount;
	}

	public InvestmentAccount35 setSecuritiesAccount(List<SecuritiesAccount4> securitiesAccount) {
		this.securitiesAccount = Objects.requireNonNull(securitiesAccount);
		return this;
	}

	public Optional<Blocked1> getBlockedStatus() {
		return blockedStatus == null ? Optional.empty() : Optional.of(blockedStatus);
	}

	public InvestmentAccount35 setBlockedStatus(Blocked1 blockedStatus) {
		this.blockedStatus = blockedStatus;
		return this;
	}

	public Optional<AccountUsageType1Choice> getAccountUsageType() {
		return accountUsageType == null ? Optional.empty() : Optional.of(accountUsageType);
	}

	public InvestmentAccount35 setAccountUsageType(AccountUsageType1Choice accountUsageType) {
		this.accountUsageType = accountUsageType;
		return this;
	}

	public Optional<Provided1Code> getForeignStatusCertification() {
		return foreignStatusCertification == null ? Optional.empty() : Optional.of(foreignStatusCertification);
	}

	public InvestmentAccount35 setForeignStatusCertification(Provided1Code foreignStatusCertification) {
		this.foreignStatusCertification = foreignStatusCertification;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getAccountSignatureDateTime() {
		return accountSignatureDateTime == null ? Optional.empty() : Optional.of(accountSignatureDateTime);
	}

	public InvestmentAccount35 setAccountSignatureDateTime(DateAndDateTimeChoice accountSignatureDateTime) {
		this.accountSignatureDateTime = accountSignatureDateTime;
		return this;
	}
}