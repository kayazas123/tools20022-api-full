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

package com.tools20022.repository.area.pacs;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion;
import com.tools20022.repository.msg.DirectDebitTransactionInformation21;
import com.tools20022.repository.msg.GroupHeader50;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017;
import com.tools20022.repository.msgset.PaymentsClearingandSettlementISOLatestversion;
import com.tools20022.repository.msgset.PaymentsClearingandSettlementMaintenance20162017;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The FinancialInstitutionToFinancialInstitutionCustomerDirectDebit message is
 * sent by the creditor agent to the debtor agent, directly or through other
 * agents and/or a payment clearing and settlement system.<br>
 * It is used to collect funds from a debtor account for a creditor.<br>
 * <b>Usage</b><br>
 * The FItoFICustomerDirectDebit message can contain one or more customer direct
 * debit instructions.<br>
 * The FIToFICustomerDirectDebit message does not allow for grouping.<br>
 * The FItoFICustomerDirectDebit message may or may not contain mandate related
 * information, i.e. extracts from a mandate, such as the MandateIdentification
 * or DateOfSignature. The FIToFICustomerDirectDebit message must not be
 * considered as a mandate.<br>
 * The FItoFICustomerDirectDebit message can be used in domestic and
 * cross-border scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.003.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion
 * PaymentsClearingandSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07#mmGroupHeader
 * FIToFICustomerDirectDebitV07.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07#mmDirectDebitTransactionInformation
 * FIToFICustomerDirectDebitV07.mmDirectDebitTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07#mmSupplementaryData
 * FIToFICustomerDirectDebitV07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementISOLatestversion
 * PaymentsClearingandSettlementISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017
 * MX_Payment_Maintenance_2016_2017}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementMaintenance20162017
 * PaymentsClearingandSettlementMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FIToFICstmrDrctDbt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFICustomerDirectDebitV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionToFinancialInstitutionCustomerDirectDebit message is sent by the creditor agent to the debtor agent, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to collect funds from a debtor account for a creditor.\r\nUsage\r\nThe FItoFICustomerDirectDebit message can contain one or more customer direct debit instructions.\r\nThe FIToFICustomerDirectDebit message does not allow for grouping.\r\nThe FItoFICustomerDirectDebit message may or may not contain mandate related information, i.e. extracts from a mandate, such as the MandateIdentification or DateOfSignature. The FIToFICustomerDirectDebit message must not be considered as a mandate.\r\nThe FItoFICustomerDirectDebit message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#for_pacs_FIToFICustomerDirectDebitV07
 * ConstraintInstructedAgentRule.for_pacs_FIToFICustomerDirectDebitV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#for_pacs_FIToFICustomerDirectDebitV07
 * ConstraintInstructingAgentRule.for_pacs_FIToFICustomerDirectDebitV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountRule#for_pacs_FIToFICustomerDirectDebitV07
 * ConstraintTotalInterbankSettlementAmountRule.
 * for_pacs_FIToFICustomerDirectDebitV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountAndSumRule#for_pacs_FIToFICustomerDirectDebitV07
 * ConstraintTotalInterbankSettlementAmountAndSumRule.
 * for_pacs_FIToFICustomerDirectDebitV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#for_pacs_FIToFICustomerDirectDebitV07
 * ConstraintGroupHeaderInterbankSettlementDateRule.
 * for_pacs_FIToFICustomerDirectDebitV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule#for_pacs_FIToFICustomerDirectDebitV07
 * ConstraintTransactionInterbankSettlementDateRule.
 * for_pacs_FIToFICustomerDirectDebitV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule#for_pacs_FIToFICustomerDirectDebitV07
 * ConstraintPaymentTypeInformationRule.for_pacs_FIToFICustomerDirectDebitV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFICustomerDirectDebitV07
 * ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerDirectDebitV07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV06
 * FIToFICustomerDirectDebitV06}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FIToFICustomerDirectDebitV07", propOrder = {"groupHeader", "directDebitTransactionInformation", "supplementaryData"})
public class FIToFICustomerDirectDebitV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader50 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader50
	 * GroupHeader50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics shared by all individual transactions included in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV06#mmGroupHeader
	 * FIToFICustomerDirectDebitV06.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFICustomerDirectDebitV07, GroupHeader50> mmGroupHeader = new MMMessageBuildingBlock<FIToFICustomerDirectDebitV07, GroupHeader50>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			previousVersion_lazy = () -> FIToFICustomerDirectDebitV06.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader50.mmObject();
		}

		@Override
		public GroupHeader50 getValue(FIToFICustomerDirectDebitV07 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(FIToFICustomerDirectDebitV07 obj, GroupHeader50 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "DrctDbtTxInf", required = true)
	protected List<DirectDebitTransactionInformation21> directDebitTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21
	 * DirectDebitTransactionInformation21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrctDbtTxInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebitTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information specific to the individual direct debit(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV06#mmDirectDebitTransactionInformation
	 * FIToFICustomerDirectDebitV06.mmDirectDebitTransactionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFICustomerDirectDebitV07, List<DirectDebitTransactionInformation21>> mmDirectDebitTransactionInformation = new MMMessageBuildingBlock<FIToFICustomerDirectDebitV07, List<DirectDebitTransactionInformation21>>() {
		{
			xmlTag = "DrctDbtTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebitTransactionInformation";
			definition = "Set of elements providing information specific to the individual direct debit(s).";
			previousVersion_lazy = () -> FIToFICustomerDirectDebitV06.mmDirectDebitTransactionInformation;
			minOccurs = 1;
			complexType_lazy = () -> DirectDebitTransactionInformation21.mmObject();
		}

		@Override
		public List<DirectDebitTransactionInformation21> getValue(FIToFICustomerDirectDebitV07 obj) {
			return obj.getDirectDebitTransactionInformation();
		}

		@Override
		public void setValue(FIToFICustomerDirectDebitV07 obj, List<DirectDebitTransactionInformation21> value) {
			obj.setDirectDebitTransactionInformation(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV06#mmSupplementaryData
	 * FIToFICustomerDirectDebitV06.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFICustomerDirectDebitV07, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<FIToFICustomerDirectDebitV07, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> FIToFICustomerDirectDebitV06.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(FIToFICustomerDirectDebitV07 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(FIToFICustomerDirectDebitV07 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAgentRule.for_pacs_FIToFICustomerDirectDebitV07,
						com.tools20022.repository.constraints.ConstraintInstructingAgentRule.for_pacs_FIToFICustomerDirectDebitV07,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountRule.for_pacs_FIToFICustomerDirectDebitV07,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountAndSumRule.for_pacs_FIToFICustomerDirectDebitV07,
						com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.for_pacs_FIToFICustomerDirectDebitV07,
						com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule.for_pacs_FIToFICustomerDirectDebitV07,
						com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule.for_pacs_FIToFICustomerDirectDebitV07,
						com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerDirectDebitV07);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FIToFICustomerDirectDebitV07";
				definition = "Scope\r\nThe FinancialInstitutionToFinancialInstitutionCustomerDirectDebit message is sent by the creditor agent to the debtor agent, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to collect funds from a debtor account for a creditor.\r\nUsage\r\nThe FItoFICustomerDirectDebit message can contain one or more customer direct debit instructions.\r\nThe FIToFICustomerDirectDebit message does not allow for grouping.\r\nThe FItoFICustomerDirectDebit message may or may not contain mandate related information, i.e. extracts from a mandate, such as the MandateIdentification or DateOfSignature. The FIToFICustomerDirectDebit message must not be considered as a mandate.\r\nThe FItoFICustomerDirectDebit message can be used in domestic and cross-border scenarios.";
				previousVersion_lazy = () -> FIToFICustomerDirectDebitV06.mmObject();
				messageSet_lazy = () -> Arrays.asList(PaymentsClearingandSettlementISOLatestversion.mmObject(), MX_Payment_Maintenance_2016_2017.mmObject(), PaymentsClearingandSettlementMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "FIToFICstmrDrctDbt";
				businessArea_lazy = () -> PaymentsClearingandSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07.mmGroupHeader,
						com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07.mmDirectDebitTransactionInformation, com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "003";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FIToFICustomerDirectDebitV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader50 getGroupHeader() {
		return groupHeader;
	}

	public FIToFICustomerDirectDebitV07 setGroupHeader(GroupHeader50 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<DirectDebitTransactionInformation21> getDirectDebitTransactionInformation() {
		return directDebitTransactionInformation == null ? directDebitTransactionInformation = new ArrayList<>() : directDebitTransactionInformation;
	}

	public FIToFICustomerDirectDebitV07 setDirectDebitTransactionInformation(List<DirectDebitTransactionInformation21> directDebitTransactionInformation) {
		this.directDebitTransactionInformation = Objects.requireNonNull(directDebitTransactionInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public FIToFICustomerDirectDebitV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.003.001.07")
	static public class Document {
		@XmlElement(name = "FIToFICstmrDrctDbt", required = true)
		public FIToFICustomerDirectDebitV07 messageBody;
	}
}