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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementPreviousVersion;
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.codeset.BusinessFlowDirectionType1Code;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An instructing party, for example, a (new) plan manager (Transferee) sends
 * the AccountHoldingInformationRequest message to the executing party, for
 * example, a (old) plan manager (Transferor), on behalf of the initiating
 * party, for example, an investor (client), to request information about
 * financial instruments held on behalf of the client.<br>
 * <b>Usage</b><br>
 * The AccountHoldingInformationRequest message is used to request information
 * about one or more ISA or portfolio products held in a client's account for
 * which it intends to instruct a transfer at a later time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.019.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementPreviousVersion
 * SecuritiesSettlementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmMessageReference
 * AccountHoldingInformationRequestV04.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmPoolReference
 * AccountHoldingInformationRequestV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmPreviousReference
 * AccountHoldingInformationRequestV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmRelatedReference
 * AccountHoldingInformationRequestV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmBusinessFlowDirectionType
 * AccountHoldingInformationRequestV04.mmBusinessFlowDirectionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmPrimaryIndividualInvestor
 * AccountHoldingInformationRequestV04.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmSecondaryIndividualInvestor
 * AccountHoldingInformationRequestV04.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmOtherIndividualInvestor
 * AccountHoldingInformationRequestV04.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmPrimaryCorporateInvestor
 * AccountHoldingInformationRequestV04.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmSecondaryCorporateInvestor
 * AccountHoldingInformationRequestV04.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmOtherCorporateInvestor
 * AccountHoldingInformationRequestV04.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmTransferorAccount
 * AccountHoldingInformationRequestV04.mmTransferorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmNomineeAccount
 * AccountHoldingInformationRequestV04.mmNomineeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmTransferee
 * AccountHoldingInformationRequestV04.mmTransferee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmProductTransfer
 * AccountHoldingInformationRequestV04.mmProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmMarketPracticeVersion
 * AccountHoldingInformationRequestV04.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmExtension
 * AccountHoldingInformationRequestV04.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctHldgInfReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountHoldingInformationRequestV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn instructing party, for example, a (new) plan manager (Transferee) sends the AccountHoldingInformationRequest message to the executing party, for example, a (old) plan manager (Transferor), on behalf of the initiating party, for example, an investor (client), to request information about financial instruments held on behalf of the client.\r\nUsage\r\nThe AccountHoldingInformationRequest message is used to request information about one or more ISA or portfolio products held in a client's account for which it intends to instruct a transfer at a later time."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#for_sese_AccountHoldingInformationRequestV04
 * ConstraintPortfolioRule.for_sese_AccountHoldingInformationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#for_sese_AccountHoldingInformationRequestV04
 * ConstraintInvestorRule.for_sese_AccountHoldingInformationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_AccountHoldingInformationRequestV04
 * ConstraintCorporateRule.for_sese_AccountHoldingInformationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNomineeAccountServicerRule#for_sese_AccountHoldingInformationRequestV04
 * ConstraintNomineeAccountServicerRule.
 * for_sese_AccountHoldingInformationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_AccountHoldingInformationRequestV04
 * ConstraintDesignationRule.for_sese_AccountHoldingInformationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#for_sese_AccountHoldingInformationRequestV04
 * ConstraintISARule.for_sese_AccountHoldingInformationRequestV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05
 * AccountHoldingInformationRequestV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03
 * AccountHoldingInformationRequestV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountHoldingInformationRequestV04", propOrder = {"messageReference", "poolReference", "previousReference", "relatedReference", "businessFlowDirectionType", "primaryIndividualInvestor", "secondaryIndividualInvestor",
		"otherIndividualInvestor", "primaryCorporateInvestor", "secondaryCorporateInvestor", "otherCorporateInvestor", "transferorAccount", "nomineeAccount", "transferee", "productTransfer", "marketPracticeVersion", "extension"})
public class AccountHoldingInformationRequestV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgRef", required = true)
	protected MessageIdentification1 messageReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmMessageReference
	 * AccountHoldingInformationRequestV05.mmMessageReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmMessageReference
	 * AccountHoldingInformationRequestV03.mmMessageReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, MessageIdentification1> mmMessageReference = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, MessageIdentification1>() {
		{
			xmlTag = "MsgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReference";
			definition = "Identifies the message.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmMessageReference);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmMessageReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getMessageReference();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, MessageIdentification1 value) {
			obj.setMessageReference(value);
		}
	};
	@XmlElement(name = "PoolRef")
	protected AdditionalReference6 poolReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmPoolReference
	 * AccountHoldingInformationRequestV05.mmPoolReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmPoolReference
	 * AccountHoldingInformationRequestV03.mmPoolReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<AdditionalReference6>> mmPoolReference = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<AdditionalReference6>>() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmPoolReference);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmPoolReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		@Override
		public Optional<AdditionalReference6> getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getPoolReference();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, Optional<AdditionalReference6> value) {
			obj.setPoolReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsRef")
	protected AdditionalReference6 previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmPreviousReference
	 * AccountHoldingInformationRequestV05.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmPreviousReference
	 * AccountHoldingInformationRequestV03.mmPreviousReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<AdditionalReference6>> mmPreviousReference = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<AdditionalReference6>>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmPreviousReference);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmPreviousReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		@Override
		public Optional<AdditionalReference6> getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, Optional<AdditionalReference6> value) {
			obj.setPreviousReference(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference6 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmRelatedReference
	 * AccountHoldingInformationRequestV05.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmRelatedReference
	 * AccountHoldingInformationRequestV03.mmRelatedReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<AdditionalReference6>> mmRelatedReference = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<AdditionalReference6>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmRelatedReference);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmRelatedReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		@Override
		public Optional<AdditionalReference6> getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, Optional<AdditionalReference6> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "BizFlowDrctnTp")
	protected BusinessFlowDirectionType1Code businessFlowDirectionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessFlowDirectionType1Code
	 * BusinessFlowDirectionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizFlowDrctnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessFlowDirectionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the business flow type (assets to be delivered or received)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmBusinessFlowDirectionType
	 * AccountHoldingInformationRequestV05.mmBusinessFlowDirectionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmBusinessFlowDirectionType
	 * AccountHoldingInformationRequestV03.mmBusinessFlowDirectionType}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<BusinessFlowDirectionType1Code>> mmBusinessFlowDirectionType = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<BusinessFlowDirectionType1Code>>() {
		{
			xmlTag = "BizFlowDrctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessFlowDirectionType";
			definition = "Identifies the business flow type (assets to be delivered or received).";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmBusinessFlowDirectionType);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmBusinessFlowDirectionType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BusinessFlowDirectionType1Code.mmObject();
		}

		@Override
		public Optional<BusinessFlowDirectionType1Code> getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getBusinessFlowDirectionType();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, Optional<BusinessFlowDirectionType1Code> value) {
			obj.setBusinessFlowDirectionType(value.orElse(null));
		}
	};
	@XmlElement(name = "PmryIndvInvstr")
	protected IndividualPerson8 primaryIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryIndvInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryIndividualInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the primary individual investor, for example, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmPrimaryIndividualInvestor
	 * AccountHoldingInformationRequestV05.mmPrimaryIndividualInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmPrimaryIndividualInvestor
	 * AccountHoldingInformationRequestV03.mmPrimaryIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<IndividualPerson8>> mmPrimaryIndividualInvestor = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<IndividualPerson8>>() {
		{
			xmlTag = "PmryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryIndividualInvestor";
			definition = "Information identifying the primary individual investor, for example, name, address, social security number and date of birth.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmPrimaryIndividualInvestor);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmPrimaryIndividualInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		@Override
		public Optional<IndividualPerson8> getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getPrimaryIndividualInvestor();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, Optional<IndividualPerson8> value) {
			obj.setPrimaryIndividualInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndryIndvInvstr")
	protected IndividualPerson8 secondaryIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryIndvInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryIndividualInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the secondary individual investor, for example, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmSecondaryIndividualInvestor
	 * AccountHoldingInformationRequestV05.mmSecondaryIndividualInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmSecondaryIndividualInvestor
	 * AccountHoldingInformationRequestV03.mmSecondaryIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<IndividualPerson8>> mmSecondaryIndividualInvestor = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<IndividualPerson8>>() {
		{
			xmlTag = "ScndryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryIndividualInvestor";
			definition = "Information identifying the secondary individual investor, for example, name, address, social security number and date of birth.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmSecondaryIndividualInvestor);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmSecondaryIndividualInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		@Override
		public Optional<IndividualPerson8> getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getSecondaryIndividualInvestor();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, Optional<IndividualPerson8> value) {
			obj.setSecondaryIndividualInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrIndvInvstr")
	protected List<IndividualPerson8> otherIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrIndvInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIndividualInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying other individual investors, for example, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmOtherIndividualInvestor
	 * AccountHoldingInformationRequestV05.mmOtherIndividualInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmOtherIndividualInvestor
	 * AccountHoldingInformationRequestV03.mmOtherIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, List<IndividualPerson8>> mmOtherIndividualInvestor = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, List<IndividualPerson8>>() {
		{
			xmlTag = "OthrIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIndividualInvestor";
			definition = "Information identifying other individual investors, for example, name, address, social security number and date of birth.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmOtherIndividualInvestor);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmOtherIndividualInvestor;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		@Override
		public List<IndividualPerson8> getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getOtherIndividualInvestor();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, List<IndividualPerson8> value) {
			obj.setOtherIndividualInvestor(value);
		}
	};
	@XmlElement(name = "PmryCorpInvstr")
	protected Organisation21 primaryCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation21
	 * Organisation21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryCorpInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryCorporateInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the primary corporate investor, for example, name and address."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmPrimaryCorporateInvestor
	 * AccountHoldingInformationRequestV05.mmPrimaryCorporateInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmPrimaryCorporateInvestor
	 * AccountHoldingInformationRequestV03.mmPrimaryCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<Organisation21>> mmPrimaryCorporateInvestor = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<Organisation21>>() {
		{
			xmlTag = "PmryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryCorporateInvestor";
			definition = "Information identifying the primary corporate investor, for example, name and address.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmPrimaryCorporateInvestor);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmPrimaryCorporateInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Organisation21.mmObject();
		}

		@Override
		public Optional<Organisation21> getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getPrimaryCorporateInvestor();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, Optional<Organisation21> value) {
			obj.setPrimaryCorporateInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndryCorpInvstr")
	protected Organisation21 secondaryCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation21
	 * Organisation21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryCorpInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryCorporateInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the secondary corporate investor, for example, name and address."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmSecondaryCorporateInvestor
	 * AccountHoldingInformationRequestV05.mmSecondaryCorporateInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmSecondaryCorporateInvestor
	 * AccountHoldingInformationRequestV03.mmSecondaryCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<Organisation21>> mmSecondaryCorporateInvestor = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<Organisation21>>() {
		{
			xmlTag = "ScndryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryCorporateInvestor";
			definition = "Information identifying the secondary corporate investor, for example, name and address.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmSecondaryCorporateInvestor);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmSecondaryCorporateInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Organisation21.mmObject();
		}

		@Override
		public Optional<Organisation21> getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getSecondaryCorporateInvestor();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, Optional<Organisation21> value) {
			obj.setSecondaryCorporateInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrCorpInvstr")
	protected List<Organisation21> otherCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation21
	 * Organisation21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrCorpInvstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCorporateInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the other corporate investors, for example, name and address."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmOtherCorporateInvestor
	 * AccountHoldingInformationRequestV05.mmOtherCorporateInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmOtherCorporateInvestor
	 * AccountHoldingInformationRequestV03.mmOtherCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, List<Organisation21>> mmOtherCorporateInvestor = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, List<Organisation21>>() {
		{
			xmlTag = "OthrCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCorporateInvestor";
			definition = "Information identifying the other corporate investors, for example, name and address.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmOtherCorporateInvestor);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmOtherCorporateInvestor;
			minOccurs = 0;
			complexType_lazy = () -> Organisation21.mmObject();
		}

		@Override
		public List<Organisation21> getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getOtherCorporateInvestor();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, List<Organisation21> value) {
			obj.setOtherCorporateInvestor(value);
		}
	};
	@XmlElement(name = "TrfrAcct", required = true)
	protected Account19 transferorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account19
	 * Account19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfrAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an account owned by the investor at the old plan manager (account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmTransferorAccount
	 * AccountHoldingInformationRequestV05.mmTransferorAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmTransferorAccount
	 * AccountHoldingInformationRequestV03.mmTransferorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Account19> mmTransferorAccount = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Account19>() {
		{
			xmlTag = "TrfrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferorAccount";
			definition = "Identification of an account owned by the investor at the old plan manager (account servicer).";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmTransferorAccount);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmTransferorAccount;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Account19.mmObject();
		}

		@Override
		public Account19 getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getTransferorAccount();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, Account19 value) {
			obj.setTransferorAccount(value);
		}
	};
	@XmlElement(name = "NmneeAcct")
	protected Account19 nomineeAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account19
	 * Account19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmneeAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NomineeAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account held in the name of a party that is not the name of the beneficial owner of the shares."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmNomineeAccount
	 * AccountHoldingInformationRequestV05.mmNomineeAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmNomineeAccount
	 * AccountHoldingInformationRequestV03.mmNomineeAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<Account19>> mmNomineeAccount = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<Account19>>() {
		{
			xmlTag = "NmneeAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NomineeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmNomineeAccount);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmNomineeAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Account19.mmObject();
		}

		@Override
		public Optional<Account19> getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getNomineeAccount();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, Optional<Account19> value) {
			obj.setNomineeAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "Trfee", required = true)
	protected PartyIdentification70Choice transferee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trfee"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transferee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the institution to which the financial instrument is to be transferred."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmTransferee
	 * AccountHoldingInformationRequestV05.mmTransferee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmTransferee
	 * AccountHoldingInformationRequestV03.mmTransferee}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, PartyIdentification70Choice> mmTransferee = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, PartyIdentification70Choice>() {
		{
			xmlTag = "Trfee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transferee";
			definition = "Information related to the institution to which the financial instrument is to be transferred.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmTransferee);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmTransferee;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification70Choice.mmObject();
		}

		@Override
		public PartyIdentification70Choice getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getTransferee();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, PartyIdentification70Choice value) {
			obj.setTransferee(value);
		}
	};
	@XmlElement(name = "PdctTrf", required = true)
	protected List<ISATransfer27> productTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ISATransfer27
	 * ISATransfer27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctTrf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information related to the asset(s) transferred."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmProductTransfer
	 * AccountHoldingInformationRequestV05.mmProductTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmProductTransfer
	 * AccountHoldingInformationRequestV03.mmProductTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, List<ISATransfer27>> mmProductTransfer = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, List<ISATransfer27>>() {
		{
			xmlTag = "PdctTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductTransfer";
			definition = "Provides information related to the asset(s) transferred.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmProductTransfer);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmProductTransfer;
			minOccurs = 1;
			complexType_lazy = () -> ISATransfer27.mmObject();
		}

		@Override
		public List<ISATransfer27> getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getProductTransfer();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, List<ISATransfer27> value) {
			obj.setProductTransfer(value);
		}
	};
	@XmlElement(name = "MktPrctcVrsn")
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmMarketPracticeVersion
	 * AccountHoldingInformationRequestV05.mmMarketPracticeVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmMarketPracticeVersion
	 * AccountHoldingInformationRequestV03.mmMarketPracticeVersion}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<MarketPracticeVersion1>> mmMarketPracticeVersion = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, Optional<MarketPracticeVersion1>>() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmMarketPracticeVersion);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmMarketPracticeVersion;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		@Override
		public Optional<MarketPracticeVersion1> getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getMarketPracticeVersion();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, Optional<MarketPracticeVersion1> value) {
			obj.setMarketPracticeVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmExtension
	 * AccountHoldingInformationRequestV05.mmExtension}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV03#mmExtension
	 * AccountHoldingInformationRequestV03.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountHoldingInformationRequestV04, List<Extension1>> mmExtension = new MMMessageBuildingBlock<AccountHoldingInformationRequestV04, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmExtension);
			previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(AccountHoldingInformationRequestV04 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(AccountHoldingInformationRequestV04 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPortfolioRule.for_sese_AccountHoldingInformationRequestV04,
						com.tools20022.repository.constraints.ConstraintInvestorRule.for_sese_AccountHoldingInformationRequestV04, com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_AccountHoldingInformationRequestV04,
						com.tools20022.repository.constraints.ConstraintNomineeAccountServicerRule.for_sese_AccountHoldingInformationRequestV04,
						com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_AccountHoldingInformationRequestV04, com.tools20022.repository.constraints.ConstraintISARule.for_sese_AccountHoldingInformationRequestV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountHoldingInformationRequestV04";
				definition = "Scope\r\nAn instructing party, for example, a (new) plan manager (Transferee) sends the AccountHoldingInformationRequest message to the executing party, for example, a (old) plan manager (Transferor), on behalf of the initiating party, for example, an investor (client), to request information about financial instruments held on behalf of the client.\r\nUsage\r\nThe AccountHoldingInformationRequest message is used to request information about one or more ISA or portfolio products held in a client's account for which it intends to instruct a transfer at a later time.";
				nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationRequestV05.mmObject());
				previousVersion_lazy = () -> AccountHoldingInformationRequestV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "AcctHldgInfReq";
				businessArea_lazy = () -> SecuritiesSettlementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmMessageReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmPoolReference, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmPreviousReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmRelatedReference, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmBusinessFlowDirectionType,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmPrimaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmSecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmOtherIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmPrimaryCorporateInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmSecondaryCorporateInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmOtherCorporateInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmTransferorAccount, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmNomineeAccount,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmTransferee, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmProductTransfer,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmMarketPracticeVersion, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "019";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountHoldingInformationRequestV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageReference() {
		return messageReference;
	}

	public AccountHoldingInformationRequestV04 setMessageReference(MessageIdentification1 messageReference) {
		this.messageReference = Objects.requireNonNull(messageReference);
		return this;
	}

	public Optional<AdditionalReference6> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public AccountHoldingInformationRequestV04 setPoolReference(AdditionalReference6 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public Optional<AdditionalReference6> getPreviousReference() {
		return previousReference == null ? Optional.empty() : Optional.of(previousReference);
	}

	public AccountHoldingInformationRequestV04 setPreviousReference(AdditionalReference6 previousReference) {
		this.previousReference = previousReference;
		return this;
	}

	public Optional<AdditionalReference6> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public AccountHoldingInformationRequestV04 setRelatedReference(AdditionalReference6 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public Optional<BusinessFlowDirectionType1Code> getBusinessFlowDirectionType() {
		return businessFlowDirectionType == null ? Optional.empty() : Optional.of(businessFlowDirectionType);
	}

	public AccountHoldingInformationRequestV04 setBusinessFlowDirectionType(BusinessFlowDirectionType1Code businessFlowDirectionType) {
		this.businessFlowDirectionType = businessFlowDirectionType;
		return this;
	}

	public Optional<IndividualPerson8> getPrimaryIndividualInvestor() {
		return primaryIndividualInvestor == null ? Optional.empty() : Optional.of(primaryIndividualInvestor);
	}

	public AccountHoldingInformationRequestV04 setPrimaryIndividualInvestor(IndividualPerson8 primaryIndividualInvestor) {
		this.primaryIndividualInvestor = primaryIndividualInvestor;
		return this;
	}

	public Optional<IndividualPerson8> getSecondaryIndividualInvestor() {
		return secondaryIndividualInvestor == null ? Optional.empty() : Optional.of(secondaryIndividualInvestor);
	}

	public AccountHoldingInformationRequestV04 setSecondaryIndividualInvestor(IndividualPerson8 secondaryIndividualInvestor) {
		this.secondaryIndividualInvestor = secondaryIndividualInvestor;
		return this;
	}

	public List<IndividualPerson8> getOtherIndividualInvestor() {
		return otherIndividualInvestor == null ? otherIndividualInvestor = new ArrayList<>() : otherIndividualInvestor;
	}

	public AccountHoldingInformationRequestV04 setOtherIndividualInvestor(List<IndividualPerson8> otherIndividualInvestor) {
		this.otherIndividualInvestor = Objects.requireNonNull(otherIndividualInvestor);
		return this;
	}

	public Optional<Organisation21> getPrimaryCorporateInvestor() {
		return primaryCorporateInvestor == null ? Optional.empty() : Optional.of(primaryCorporateInvestor);
	}

	public AccountHoldingInformationRequestV04 setPrimaryCorporateInvestor(Organisation21 primaryCorporateInvestor) {
		this.primaryCorporateInvestor = primaryCorporateInvestor;
		return this;
	}

	public Optional<Organisation21> getSecondaryCorporateInvestor() {
		return secondaryCorporateInvestor == null ? Optional.empty() : Optional.of(secondaryCorporateInvestor);
	}

	public AccountHoldingInformationRequestV04 setSecondaryCorporateInvestor(Organisation21 secondaryCorporateInvestor) {
		this.secondaryCorporateInvestor = secondaryCorporateInvestor;
		return this;
	}

	public List<Organisation21> getOtherCorporateInvestor() {
		return otherCorporateInvestor == null ? otherCorporateInvestor = new ArrayList<>() : otherCorporateInvestor;
	}

	public AccountHoldingInformationRequestV04 setOtherCorporateInvestor(List<Organisation21> otherCorporateInvestor) {
		this.otherCorporateInvestor = Objects.requireNonNull(otherCorporateInvestor);
		return this;
	}

	public Account19 getTransferorAccount() {
		return transferorAccount;
	}

	public AccountHoldingInformationRequestV04 setTransferorAccount(Account19 transferorAccount) {
		this.transferorAccount = Objects.requireNonNull(transferorAccount);
		return this;
	}

	public Optional<Account19> getNomineeAccount() {
		return nomineeAccount == null ? Optional.empty() : Optional.of(nomineeAccount);
	}

	public AccountHoldingInformationRequestV04 setNomineeAccount(Account19 nomineeAccount) {
		this.nomineeAccount = nomineeAccount;
		return this;
	}

	public PartyIdentification70Choice getTransferee() {
		return transferee;
	}

	public AccountHoldingInformationRequestV04 setTransferee(PartyIdentification70Choice transferee) {
		this.transferee = Objects.requireNonNull(transferee);
		return this;
	}

	public List<ISATransfer27> getProductTransfer() {
		return productTransfer == null ? productTransfer = new ArrayList<>() : productTransfer;
	}

	public AccountHoldingInformationRequestV04 setProductTransfer(List<ISATransfer27> productTransfer) {
		this.productTransfer = Objects.requireNonNull(productTransfer);
		return this;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return marketPracticeVersion == null ? Optional.empty() : Optional.of(marketPracticeVersion);
	}

	public AccountHoldingInformationRequestV04 setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public AccountHoldingInformationRequestV04 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.019.001.04")
	static public class Document {
		@XmlElement(name = "AcctHldgInfReq", required = true)
		public AccountHoldingInformationRequestV04 messageBody;
	}
}