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
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a (old) plan manager (Transferor), sends the
 * PortfolioTransferConfirmation message to the instructing party, for example,
 * a (new) plan manager (Transferee), to confirm the transfer of one or more ISA
 * or portfolio products from the client's account at the old plan manager
 * (Transferor) to the client's account at the new plan manager (Transferee)
 * through a nominee account.<br>
 * <b>Usage</b><br>
 * The PortfolioTransferConfirmation message is used to confirm the transfer of
 * one or more ISA or portfolio products.<br>
 * The reference of each product transfer confirmation is identified in
 * TransferConfirmationIdentification. The reference of the original product
 * transfer is specified in TransferInstructionReference. The message
 * identification of the PortfolioTransferInstruction message in which the
 * product transfers were conveyed may also be quoted in RelatedReference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.013.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmMessageReference
 * PortfolioTransferConfirmationV06.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmPoolReference
 * PortfolioTransferConfirmationV06.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmPreviousReference
 * PortfolioTransferConfirmationV06.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmRelatedReference
 * PortfolioTransferConfirmationV06.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmPrimaryIndividualInvestor
 * PortfolioTransferConfirmationV06.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmSecondaryIndividualInvestor
 * PortfolioTransferConfirmationV06.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmOtherIndividualInvestor
 * PortfolioTransferConfirmationV06.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmPrimaryCorporateInvestor
 * PortfolioTransferConfirmationV06.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmSecondaryCorporateInvestor
 * PortfolioTransferConfirmationV06.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmOtherCorporateInvestor
 * PortfolioTransferConfirmationV06.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmTransferorAccount
 * PortfolioTransferConfirmationV06.mmTransferorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmNomineeAccount
 * PortfolioTransferConfirmationV06.mmNomineeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmTransferee
 * PortfolioTransferConfirmationV06.mmTransferee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmCashAccount
 * PortfolioTransferConfirmationV06.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmProductTransfer
 * PortfolioTransferConfirmationV06.mmProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmMarketPracticeVersion
 * PortfolioTransferConfirmationV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmExtension
 * PortfolioTransferConfirmationV06.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PrtflTrfConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PortfolioTransferConfirmationV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a (old) plan manager (Transferor), sends the PortfolioTransferConfirmation message to the instructing party, for example, a (new) plan manager (Transferee), to confirm the transfer of one or more ISA or portfolio products from the client's account at the old plan manager (Transferor) to the client's account at the new plan manager (Transferee) through a nominee account.\r\nUsage\r\nThe PortfolioTransferConfirmation message is used to confirm the transfer of one or more ISA or portfolio products.\r\nThe reference of each product transfer confirmation is identified in TransferConfirmationIdentification. The reference of the original product transfer is specified in TransferInstructionReference. The message identification of the PortfolioTransferInstruction message in which the product transfers were conveyed may also be quoted in RelatedReference."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#for_sese_PortfolioTransferConfirmationV06
 * ConstraintPorfolioRule.for_sese_PortfolioTransferConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#for_sese_PortfolioTransferConfirmationV06
 * ConstraintInvestorRule.for_sese_PortfolioTransferConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#for_sese_PortfolioTransferConfirmationV06
 * ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNomineeAccountServicerRule#for_sese_PortfolioTransferConfirmationV06
 * ConstraintNomineeAccountServicerRule.
 * for_sese_PortfolioTransferConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#for_sese_PortfolioTransferConfirmationV06
 * ConstraintISARule.for_sese_PortfolioTransferConfirmationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#for_sese_PortfolioTransferConfirmationV06
 * ConstraintDesignationRule.for_sese_PortfolioTransferConfirmationV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07
 * PortfolioTransferConfirmationV07}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05
 * PortfolioTransferConfirmationV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PortfolioTransferConfirmationV06", propOrder = {"messageReference", "poolReference", "previousReference", "relatedReference", "primaryIndividualInvestor", "secondaryIndividualInvestor", "otherIndividualInvestor",
		"primaryCorporateInvestor", "secondaryCorporateInvestor", "otherCorporateInvestor", "transferorAccount", "nomineeAccount", "transferee", "cashAccount", "productTransfer", "marketPracticeVersion", "extension"})
public class PortfolioTransferConfirmationV06 {

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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmMessageReference
	 * PortfolioTransferConfirmationV07.mmMessageReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmMessageReference
	 * PortfolioTransferConfirmationV05.mmMessageReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, MessageIdentification1> mmMessageReference = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, MessageIdentification1>() {
		{
			xmlTag = "MsgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReference";
			definition = "Identifies the message.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmMessageReference);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmMessageReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getMessageReference();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, MessageIdentification1 value) {
			obj.setMessageReference(value);
		}
	};
	@XmlElement(name = "PoolRef")
	protected AdditionalReference3 poolReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmPoolReference
	 * PortfolioTransferConfirmationV07.mmPoolReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmPoolReference
	 * PortfolioTransferConfirmationV05.mmPoolReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<AdditionalReference3>> mmPoolReference = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<AdditionalReference3>>() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmPoolReference);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmPoolReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getPoolReference();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, Optional<AdditionalReference3> value) {
			obj.setPoolReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsRef")
	protected AdditionalReference3 previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmPreviousReference
	 * PortfolioTransferConfirmationV07.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmPreviousReference
	 * PortfolioTransferConfirmationV05.mmPreviousReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<AdditionalReference3>> mmPreviousReference = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<AdditionalReference3>>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmPreviousReference);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmPreviousReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, Optional<AdditionalReference3> value) {
			obj.setPreviousReference(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference3 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmRelatedReference
	 * PortfolioTransferConfirmationV07.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmRelatedReference
	 * PortfolioTransferConfirmationV05.mmRelatedReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<AdditionalReference3>> mmRelatedReference = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<AdditionalReference3>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmRelatedReference);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmRelatedReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, Optional<AdditionalReference3> value) {
			obj.setRelatedReference(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmPrimaryIndividualInvestor
	 * PortfolioTransferConfirmationV07.mmPrimaryIndividualInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmPrimaryIndividualInvestor
	 * PortfolioTransferConfirmationV05.mmPrimaryIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<IndividualPerson8>> mmPrimaryIndividualInvestor = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<IndividualPerson8>>() {
		{
			xmlTag = "PmryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryIndividualInvestor";
			definition = "Information identifying the primary individual investor, for example, name, address, social security number and date of birth.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmPrimaryIndividualInvestor);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmPrimaryIndividualInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		@Override
		public Optional<IndividualPerson8> getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getPrimaryIndividualInvestor();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, Optional<IndividualPerson8> value) {
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmSecondaryIndividualInvestor
	 * PortfolioTransferConfirmationV07.mmSecondaryIndividualInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmSecondaryIndividualInvestor
	 * PortfolioTransferConfirmationV05.mmSecondaryIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<IndividualPerson8>> mmSecondaryIndividualInvestor = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<IndividualPerson8>>() {
		{
			xmlTag = "ScndryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryIndividualInvestor";
			definition = "Information identifying the secondary individual investor, for example, name, address, social security number and date of birth.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmSecondaryIndividualInvestor);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmSecondaryIndividualInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		@Override
		public Optional<IndividualPerson8> getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getSecondaryIndividualInvestor();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, Optional<IndividualPerson8> value) {
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
	 * "Information identifying the other individual investors, for example, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmOtherIndividualInvestor
	 * PortfolioTransferConfirmationV07.mmOtherIndividualInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmOtherIndividualInvestor
	 * PortfolioTransferConfirmationV05.mmOtherIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, List<IndividualPerson8>> mmOtherIndividualInvestor = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, List<IndividualPerson8>>() {
		{
			xmlTag = "OthrIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIndividualInvestor";
			definition = "Information identifying the other individual investors, for example, name, address, social security number and date of birth.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmOtherIndividualInvestor);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmOtherIndividualInvestor;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		@Override
		public List<IndividualPerson8> getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getOtherIndividualInvestor();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, List<IndividualPerson8> value) {
			obj.setOtherIndividualInvestor(value);
		}
	};
	@XmlElement(name = "PmryCorpInvstr")
	protected Organisation4 primaryCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmPrimaryCorporateInvestor
	 * PortfolioTransferConfirmationV07.mmPrimaryCorporateInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmPrimaryCorporateInvestor
	 * PortfolioTransferConfirmationV05.mmPrimaryCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<Organisation4>> mmPrimaryCorporateInvestor = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<Organisation4>>() {
		{
			xmlTag = "PmryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryCorporateInvestor";
			definition = "Information identifying the primary corporate investor, for example, name and address.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmPrimaryCorporateInvestor);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmPrimaryCorporateInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Organisation4.mmObject();
		}

		@Override
		public Optional<Organisation4> getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getPrimaryCorporateInvestor();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, Optional<Organisation4> value) {
			obj.setPrimaryCorporateInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndryCorpInvstr")
	protected Organisation4 secondaryCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmSecondaryCorporateInvestor
	 * PortfolioTransferConfirmationV07.mmSecondaryCorporateInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmSecondaryCorporateInvestor
	 * PortfolioTransferConfirmationV05.mmSecondaryCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<Organisation4>> mmSecondaryCorporateInvestor = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<Organisation4>>() {
		{
			xmlTag = "ScndryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryCorporateInvestor";
			definition = "Information identifying the secondary corporate investor, for example, name and address.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmSecondaryCorporateInvestor);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmSecondaryCorporateInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Organisation4.mmObject();
		}

		@Override
		public Optional<Organisation4> getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getSecondaryCorporateInvestor();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, Optional<Organisation4> value) {
			obj.setSecondaryCorporateInvestor(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrCorpInvstr")
	protected List<Organisation4> otherCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmOtherCorporateInvestor
	 * PortfolioTransferConfirmationV07.mmOtherCorporateInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmOtherCorporateInvestor
	 * PortfolioTransferConfirmationV05.mmOtherCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, List<Organisation4>> mmOtherCorporateInvestor = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, List<Organisation4>>() {
		{
			xmlTag = "OthrCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCorporateInvestor";
			definition = "Information identifying the other corporate investors, for example, name and address.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmOtherCorporateInvestor);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmOtherCorporateInvestor;
			minOccurs = 0;
			complexType_lazy = () -> Organisation4.mmObject();
		}

		@Override
		public List<Organisation4> getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getOtherCorporateInvestor();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, List<Organisation4> value) {
			obj.setOtherCorporateInvestor(value);
		}
	};
	@XmlElement(name = "TrfrAcct", required = true)
	protected Account15 transferorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account15
	 * Account15}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmTransferorAccount
	 * PortfolioTransferConfirmationV07.mmTransferorAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmTransferorAccount
	 * PortfolioTransferConfirmationV05.mmTransferorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Account15> mmTransferorAccount = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Account15>() {
		{
			xmlTag = "TrfrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferorAccount";
			definition = "Identification of an account owned by the investor at the old plan manager (account servicer).";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmTransferorAccount);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmTransferorAccount;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Account15.mmObject();
		}

		@Override
		public Account15 getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getTransferorAccount();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, Account15 value) {
			obj.setTransferorAccount(value);
		}
	};
	@XmlElement(name = "NmneeAcct")
	protected Account16 nomineeAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account16
	 * Account16}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmNomineeAccount
	 * PortfolioTransferConfirmationV07.mmNomineeAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmNomineeAccount
	 * PortfolioTransferConfirmationV05.mmNomineeAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<Account16>> mmNomineeAccount = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<Account16>>() {
		{
			xmlTag = "NmneeAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NomineeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmNomineeAccount);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmNomineeAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Account16.mmObject();
		}

		@Override
		public Optional<Account16> getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getNomineeAccount();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, Optional<Account16> value) {
			obj.setNomineeAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "Trfee", required = true)
	protected PartyIdentification2Choice transferee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmTransferee
	 * PortfolioTransferConfirmationV07.mmTransferee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmTransferee
	 * PortfolioTransferConfirmationV05.mmTransferee}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, PartyIdentification2Choice> mmTransferee = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, PartyIdentification2Choice>() {
		{
			xmlTag = "Trfee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transferee";
			definition = "Information related to the institution to which the financial instrument is to be transferred.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmTransferee);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmTransferee;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public PartyIdentification2Choice getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getTransferee();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, PartyIdentification2Choice value) {
			obj.setTransferee(value);
		}
	};
	@XmlElement(name = "CshAcct")
	protected CashAccount29 cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashAccount29
	 * CashAccount29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an account owned by the investor to which a cash entry is made based on the transfer of asset(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmCashAccount
	 * PortfolioTransferConfirmationV07.mmCashAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmCashAccount
	 * PortfolioTransferConfirmationV05.mmCashAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<CashAccount29>> mmCashAccount = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<CashAccount29>>() {
		{
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Identification of an account owned by the investor to which a cash entry is made based on the transfer of asset(s).";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmCashAccount);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmCashAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashAccount29.mmObject();
		}

		@Override
		public Optional<CashAccount29> getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, Optional<CashAccount29> value) {
			obj.setCashAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctTrf", required = true)
	protected List<ISATransfer21> productTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ISATransfer21
	 * ISATransfer21}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmProductTransfer
	 * PortfolioTransferConfirmationV07.mmProductTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmProductTransfer
	 * PortfolioTransferConfirmationV05.mmProductTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, List<ISATransfer21>> mmProductTransfer = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, List<ISATransfer21>>() {
		{
			xmlTag = "PdctTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductTransfer";
			definition = "Provides information related to the asset(s) transferred.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmProductTransfer);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmProductTransfer;
			minOccurs = 1;
			complexType_lazy = () -> ISATransfer21.mmObject();
		}

		@Override
		public List<ISATransfer21> getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getProductTransfer();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, List<ISATransfer21> value) {
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmMarketPracticeVersion
	 * PortfolioTransferConfirmationV07.mmMarketPracticeVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmMarketPracticeVersion
	 * PortfolioTransferConfirmationV05.mmMarketPracticeVersion}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<MarketPracticeVersion1>> mmMarketPracticeVersion = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, Optional<MarketPracticeVersion1>>() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmMarketPracticeVersion);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmMarketPracticeVersion;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		@Override
		public Optional<MarketPracticeVersion1> getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getMarketPracticeVersion();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, Optional<MarketPracticeVersion1> value) {
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
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmExtension
	 * PortfolioTransferConfirmationV07.mmExtension}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmExtension
	 * PortfolioTransferConfirmationV05.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PortfolioTransferConfirmationV06, List<Extension1>> mmExtension = new MMMessageBuildingBlock<PortfolioTransferConfirmationV06, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmExtension);
			previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(PortfolioTransferConfirmationV06 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(PortfolioTransferConfirmationV06 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPorfolioRule.for_sese_PortfolioTransferConfirmationV06,
						com.tools20022.repository.constraints.ConstraintInvestorRule.for_sese_PortfolioTransferConfirmationV06, com.tools20022.repository.constraints.ConstraintCorporateRule.for_sese_PortfolioTransferConfirmationV06,
						com.tools20022.repository.constraints.ConstraintNomineeAccountServicerRule.for_sese_PortfolioTransferConfirmationV06,
						com.tools20022.repository.constraints.ConstraintISARule.for_sese_PortfolioTransferConfirmationV06, com.tools20022.repository.constraints.ConstraintDesignationRule.for_sese_PortfolioTransferConfirmationV06);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PortfolioTransferConfirmationV06";
				definition = "Scope\r\nAn executing party, for example, a (old) plan manager (Transferor), sends the PortfolioTransferConfirmation message to the instructing party, for example, a (new) plan manager (Transferee), to confirm the transfer of one or more ISA or portfolio products from the client's account at the old plan manager (Transferor) to the client's account at the new plan manager (Transferee) through a nominee account.\r\nUsage\r\nThe PortfolioTransferConfirmation message is used to confirm the transfer of one or more ISA or portfolio products.\r\nThe reference of each product transfer confirmation is identified in TransferConfirmationIdentification. The reference of the original product transfer is specified in TransferInstructionReference. The message identification of the PortfolioTransferInstruction message in which the product transfers were conveyed may also be quoted in RelatedReference.";
				nextVersions_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV07.mmObject());
				previousVersion_lazy = () -> PortfolioTransferConfirmationV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "PrtflTrfConf";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmMessageReference, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmPoolReference,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmPreviousReference, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmRelatedReference,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmPrimaryIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmSecondaryIndividualInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmOtherIndividualInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmPrimaryCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmSecondaryCorporateInvestor, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmOtherCorporateInvestor,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmTransferorAccount, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmNomineeAccount,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmTransferee, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmCashAccount,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmProductTransfer, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "013";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PortfolioTransferConfirmationV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageReference() {
		return messageReference;
	}

	public PortfolioTransferConfirmationV06 setMessageReference(MessageIdentification1 messageReference) {
		this.messageReference = Objects.requireNonNull(messageReference);
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public PortfolioTransferConfirmationV06 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? Optional.empty() : Optional.of(previousReference);
	}

	public PortfolioTransferConfirmationV06 setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
		return this;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public PortfolioTransferConfirmationV06 setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public Optional<IndividualPerson8> getPrimaryIndividualInvestor() {
		return primaryIndividualInvestor == null ? Optional.empty() : Optional.of(primaryIndividualInvestor);
	}

	public PortfolioTransferConfirmationV06 setPrimaryIndividualInvestor(IndividualPerson8 primaryIndividualInvestor) {
		this.primaryIndividualInvestor = primaryIndividualInvestor;
		return this;
	}

	public Optional<IndividualPerson8> getSecondaryIndividualInvestor() {
		return secondaryIndividualInvestor == null ? Optional.empty() : Optional.of(secondaryIndividualInvestor);
	}

	public PortfolioTransferConfirmationV06 setSecondaryIndividualInvestor(IndividualPerson8 secondaryIndividualInvestor) {
		this.secondaryIndividualInvestor = secondaryIndividualInvestor;
		return this;
	}

	public List<IndividualPerson8> getOtherIndividualInvestor() {
		return otherIndividualInvestor == null ? otherIndividualInvestor = new ArrayList<>() : otherIndividualInvestor;
	}

	public PortfolioTransferConfirmationV06 setOtherIndividualInvestor(List<IndividualPerson8> otherIndividualInvestor) {
		this.otherIndividualInvestor = Objects.requireNonNull(otherIndividualInvestor);
		return this;
	}

	public Optional<Organisation4> getPrimaryCorporateInvestor() {
		return primaryCorporateInvestor == null ? Optional.empty() : Optional.of(primaryCorporateInvestor);
	}

	public PortfolioTransferConfirmationV06 setPrimaryCorporateInvestor(Organisation4 primaryCorporateInvestor) {
		this.primaryCorporateInvestor = primaryCorporateInvestor;
		return this;
	}

	public Optional<Organisation4> getSecondaryCorporateInvestor() {
		return secondaryCorporateInvestor == null ? Optional.empty() : Optional.of(secondaryCorporateInvestor);
	}

	public PortfolioTransferConfirmationV06 setSecondaryCorporateInvestor(Organisation4 secondaryCorporateInvestor) {
		this.secondaryCorporateInvestor = secondaryCorporateInvestor;
		return this;
	}

	public List<Organisation4> getOtherCorporateInvestor() {
		return otherCorporateInvestor == null ? otherCorporateInvestor = new ArrayList<>() : otherCorporateInvestor;
	}

	public PortfolioTransferConfirmationV06 setOtherCorporateInvestor(List<Organisation4> otherCorporateInvestor) {
		this.otherCorporateInvestor = Objects.requireNonNull(otherCorporateInvestor);
		return this;
	}

	public Account15 getTransferorAccount() {
		return transferorAccount;
	}

	public PortfolioTransferConfirmationV06 setTransferorAccount(Account15 transferorAccount) {
		this.transferorAccount = Objects.requireNonNull(transferorAccount);
		return this;
	}

	public Optional<Account16> getNomineeAccount() {
		return nomineeAccount == null ? Optional.empty() : Optional.of(nomineeAccount);
	}

	public PortfolioTransferConfirmationV06 setNomineeAccount(Account16 nomineeAccount) {
		this.nomineeAccount = nomineeAccount;
		return this;
	}

	public PartyIdentification2Choice getTransferee() {
		return transferee;
	}

	public PortfolioTransferConfirmationV06 setTransferee(PartyIdentification2Choice transferee) {
		this.transferee = Objects.requireNonNull(transferee);
		return this;
	}

	public Optional<CashAccount29> getCashAccount() {
		return cashAccount == null ? Optional.empty() : Optional.of(cashAccount);
	}

	public PortfolioTransferConfirmationV06 setCashAccount(CashAccount29 cashAccount) {
		this.cashAccount = cashAccount;
		return this;
	}

	public List<ISATransfer21> getProductTransfer() {
		return productTransfer == null ? productTransfer = new ArrayList<>() : productTransfer;
	}

	public PortfolioTransferConfirmationV06 setProductTransfer(List<ISATransfer21> productTransfer) {
		this.productTransfer = Objects.requireNonNull(productTransfer);
		return this;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return marketPracticeVersion == null ? Optional.empty() : Optional.of(marketPracticeVersion);
	}

	public PortfolioTransferConfirmationV06 setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public PortfolioTransferConfirmationV06 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.013.001.06")
	static public class Document {
		@XmlElement(name = "PrtflTrfConf", required = true)
		public PortfolioTransferConfirmationV06 messageBody;
	}
}