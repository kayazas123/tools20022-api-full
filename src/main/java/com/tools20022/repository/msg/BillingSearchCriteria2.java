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
import com.tools20022.repository.choice.AccountIdentification38Choice;
import com.tools20022.repository.choice.CSDOrNCB1Choice;
import com.tools20022.repository.datatype.BICFIIdentifier;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria to be used to extract.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria2#mmBillingIdentification
 * BillingSearchCriteria2.mmBillingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria2#mmBillingPeriod
 * BillingSearchCriteria2.mmBillingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria2#mmCSDOrNCB
 * BillingSearchCriteria2.mmCSDOrNCB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria2#mmBilledCustomerIdentification
 * BillingSearchCriteria2.mmBilledCustomerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria2#mmAccountIdentification
 * BillingSearchCriteria2.mmAccountIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
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
 * "BillingSearchCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria to be used to extract."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1
 * BillingSearchCriteria1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingSearchCriteria2", propOrder = {"billingIdentification", "billingPeriod", "cSDOrNCB", "billedCustomerIdentification", "accountIdentification"})
public class BillingSearchCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BllgId")
	protected BillingIdentification2 billingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BillingIdentification2
	 * BillingIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria2
	 * BillingSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the billing report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#mmBillingIdentification
	 * BillingSearchCriteria1.mmBillingIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBillingIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "BllgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingIdentification";
			definition = "Identification of the billing report.";
			previousVersion_lazy = () -> BillingSearchCriteria1.mmBillingIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.BillingIdentification2.mmObject();
		}
	};
	@XmlElement(name = "BllgPrd")
	protected DatePeriodDetails billingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DatePeriodDetails
	 * DatePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmPeriodCovered
	 * Invoice.mmPeriodCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria2
	 * BillingSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information for each invoice invoicing request or month end billing event is stored."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#mmBillingPeriod
	 * BillingSearchCriteria1.mmBillingPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBillingPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Invoice.mmPeriodCovered;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "BllgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingPeriod";
			definition = "General information for each invoice invoicing request or month end billing event is stored.";
			previousVersion_lazy = () -> BillingSearchCriteria1.mmBillingPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DatePeriodDetails.mmObject();
		}
	};
	@XmlElement(name = "CSDOrNCB")
	protected CSDOrNCB1Choice cSDOrNCB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.CSDOrNCB1Choice
	 * CSDOrNCB1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmPartyRole
	 * CashSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria2
	 * BillingSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSDOrNCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDOrNCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party identification of the CSD or the NCB which has a contractual relationship with T2S party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#mmCSDOrNCB
	 * BillingSearchCriteria1.mmCSDOrNCB}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCSDOrNCB = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CSDOrNCB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDOrNCB";
			definition = "Party identification of the CSD or the NCB which has a contractual relationship with T2S party.";
			previousVersion_lazy = () -> BillingSearchCriteria1.mmCSDOrNCB;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CSDOrNCB1Choice.mmObject();
		}
	};
	@XmlElement(name = "BlldCstmrId")
	protected BICFIIdentifier billedCustomerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria2
	 * BillingSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlldCstmrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilledCustomerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Participant of the CSD or NCB who has to pay the bill in the end chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#mmBilledCustomerIdentification
	 * BillingSearchCriteria1.mmBilledCustomerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBilledCustomerIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "BlldCstmrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilledCustomerIdentification";
			definition = "Participant of the CSD or NCB who has to pay the bill in the end chain.";
			previousVersion_lazy = () -> BillingSearchCriteria1.mmBilledCustomerIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}
	};
	@XmlElement(name = "AcctId")
	protected AccountIdentification38Choice accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification38Choice
	 * AccountIdentification38Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria2
	 * BillingSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either securities account or dedicated cash account number."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#mmAccountIdentification
	 * BillingSearchCriteria1.mmAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Either securities account or dedicated cash account number.";
			previousVersion_lazy = () -> BillingSearchCriteria1.mmAccountIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification38Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingSearchCriteria2.mmBillingIdentification, com.tools20022.repository.msg.BillingSearchCriteria2.mmBillingPeriod,
						com.tools20022.repository.msg.BillingSearchCriteria2.mmCSDOrNCB, com.tools20022.repository.msg.BillingSearchCriteria2.mmBilledCustomerIdentification,
						com.tools20022.repository.msg.BillingSearchCriteria2.mmAccountIdentification);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BillingSearchCriteria2";
				definition = "Defines the criteria to be used to extract.";
				previousVersion_lazy = () -> BillingSearchCriteria1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BillingIdentification2> getBillingIdentification() {
		return billingIdentification == null ? Optional.empty() : Optional.of(billingIdentification);
	}

	public BillingSearchCriteria2 setBillingIdentification(com.tools20022.repository.msg.BillingIdentification2 billingIdentification) {
		this.billingIdentification = billingIdentification;
		return this;
	}

	public Optional<DatePeriodDetails> getBillingPeriod() {
		return billingPeriod == null ? Optional.empty() : Optional.of(billingPeriod);
	}

	public BillingSearchCriteria2 setBillingPeriod(com.tools20022.repository.msg.DatePeriodDetails billingPeriod) {
		this.billingPeriod = billingPeriod;
		return this;
	}

	public Optional<CSDOrNCB1Choice> getCSDOrNCB() {
		return cSDOrNCB == null ? Optional.empty() : Optional.of(cSDOrNCB);
	}

	public BillingSearchCriteria2 setCSDOrNCB(CSDOrNCB1Choice cSDOrNCB) {
		this.cSDOrNCB = cSDOrNCB;
		return this;
	}

	public Optional<BICFIIdentifier> getBilledCustomerIdentification() {
		return billedCustomerIdentification == null ? Optional.empty() : Optional.of(billedCustomerIdentification);
	}

	public BillingSearchCriteria2 setBilledCustomerIdentification(BICFIIdentifier billedCustomerIdentification) {
		this.billedCustomerIdentification = billedCustomerIdentification;
		return this;
	}

	public Optional<AccountIdentification38Choice> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public BillingSearchCriteria2 setAccountIdentification(AccountIdentification38Choice accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}
}