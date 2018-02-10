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
import com.tools20022.repository.msg.GroupHeader53;
import com.tools20022.repository.msg.OriginalGroupInformation27;
import com.tools20022.repository.msg.PaymentTransaction94;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_Payments_Maintenance;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The FinancialInstitutionToFinancialInstitutionPaymentStatusRequest message is
 * sent by the debtor agent to the creditor agent, directly or through other
 * agents and/or a payment clearing and settlement system. It is used to request
 * a FIToFIPaymentStatusReport message containing information on the status of a
 * previously sent instruction. <br>
 * <b>Usage</b><br>
 * The FIToFIPaymentStatusRequest message is exchanged between agents to request
 * status information about instructions previously sent. Its usage will always
 * be governed by a bilateral agreement between the agents.<br>
 * The FIToFIPaymentStatusRequest message can be used to request information
 * about the status (e.g. rejection, acceptance) of a credit transfer
 * instruction, a direct debit instruction, as well as other intra-agent
 * instructions (for example FIToFIPaymentCancellationRequest).<br>
 * The FIToFIPaymentStatusRequest message refers to the original instruction(s)
 * by means of references only or by means of references and a set of elements
 * from the original instruction.<br>
 * The FIToFIPaymentStatusRequest message can be used in domestic and
 * cross-border scenarios.<br>
 * <br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV02#mmGroupHeader
 * FIToFIPaymentStatusRequestV02.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV02#mmOriginalGroupInformation
 * FIToFIPaymentStatusRequestV02.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV02#mmTransactionInformation
 * FIToFIPaymentStatusRequestV02.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV02#mmSupplementaryData
 * FIToFIPaymentStatusRequestV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset._SR2018_MX_Payments_Maintenance
 * _SR2018_MX_Payments_Maintenance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FIToFIPmtStsReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion
 * PaymentsClearingandSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.028.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalGroupInformationAbsenceRule#forFIToFIPaymentStatusRequestV02
 * ConstraintOriginalGroupInformationAbsenceRule.
 * forFIToFIPaymentStatusRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalGroupInformationMultiplePresenceRule#forFIToFIPaymentStatusRequestV02
 * ConstraintOriginalGroupInformationMultiplePresenceRule.
 * forFIToFIPaymentStatusRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalGroupInformationSinglePresenceRule#forFIToFIPaymentStatusRequestV02
 * ConstraintOriginalGroupInformationSinglePresenceRule.
 * forFIToFIPaymentStatusRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forFIToFIPaymentStatusRequestV02
 * ConstraintSupplementaryDataRule.forFIToFIPaymentStatusRequestV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFIPaymentStatusRequestV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentStatusRequest message is sent by the debtor agent to the creditor agent, directly or through other agents and/or a payment clearing and settlement system. It is used to request a FIToFIPaymentStatusReport message containing information on the status of a previously sent instruction. \r\nUsage\r\nThe FIToFIPaymentStatusRequest message is exchanged between agents to request status information about instructions previously sent. Its usage will always be governed by a bilateral agreement between the agents.\r\nThe FIToFIPaymentStatusRequest message can be used to request information about the status (e.g. rejection, acceptance) of a credit transfer instruction, a direct debit instruction, as well as other intra-agent instructions (for example FIToFIPaymentCancellationRequest).\r\nThe FIToFIPaymentStatusRequest message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentStatusRequest message can be used in domestic and cross-border scenarios.\r\n\r\n"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01
 * FIToFIPaymentStatusRequestV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FIToFIPaymentStatusRequestV02", propOrder = {"groupHeader", "originalGroupInformation", "transactionInformation", "supplementaryData"})
public class FIToFIPaymentStatusRequestV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader53 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader53
	 * GroupHeader53}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics shared by all individual transactions included in the status request message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01#mmGroupHeader
	 * FIToFIPaymentStatusRequestV01.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the status request message.";
			previousVersion_lazy = () -> FIToFIPaymentStatusRequestV01.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader53.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFIPaymentStatusRequestV02.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OrgnlGrpInf")
	protected List<OriginalGroupInformation27> originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation27
	 * OriginalGroupInformation27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original group information concerning the group of transactions, to which the status request message refers to."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01#mmOriginalGroupInformation
	 * FIToFIPaymentStatusRequestV01.mmOriginalGroupInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOriginalGroupInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Original group information concerning the group of transactions, to which the status request message refers to.";
			previousVersion_lazy = () -> FIToFIPaymentStatusRequestV01.mmOriginalGroupInformation;
			minOccurs = 0;
			complexType_lazy = () -> OriginalGroupInformation27.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFIPaymentStatusRequestV02.class.getMethod("getOriginalGroupInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxInf")
	protected List<PaymentTransaction94> transactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction94
	 * PaymentTransaction94}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original transaction, to which the status request message refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01#mmTransactionInformation
	 * FIToFIPaymentStatusRequestV01.mmTransactionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Information concerning the original transaction, to which the status request message refers.";
			previousVersion_lazy = () -> FIToFIPaymentStatusRequestV01.mmTransactionInformation;
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransaction94.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFIPaymentStatusRequestV02.class.getMethod("getTransactionInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV01#mmSupplementaryData
	 * FIToFIPaymentStatusRequestV01.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> FIToFIPaymentStatusRequestV01.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFIPaymentStatusRequestV02.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOriginalGroupInformationAbsenceRule.forFIToFIPaymentStatusRequestV02,
						com.tools20022.repository.constraints.ConstraintOriginalGroupInformationMultiplePresenceRule.forFIToFIPaymentStatusRequestV02,
						com.tools20022.repository.constraints.ConstraintOriginalGroupInformationSinglePresenceRule.forFIToFIPaymentStatusRequestV02,
						com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forFIToFIPaymentStatusRequestV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FIToFIPaymentStatusRequestV02";
				definition = "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentStatusRequest message is sent by the debtor agent to the creditor agent, directly or through other agents and/or a payment clearing and settlement system. It is used to request a FIToFIPaymentStatusReport message containing information on the status of a previously sent instruction. \r\nUsage\r\nThe FIToFIPaymentStatusRequest message is exchanged between agents to request status information about instructions previously sent. Its usage will always be governed by a bilateral agreement between the agents.\r\nThe FIToFIPaymentStatusRequest message can be used to request information about the status (e.g. rejection, acceptance) of a credit transfer instruction, a direct debit instruction, as well as other intra-agent instructions (for example FIToFIPaymentCancellationRequest).\r\nThe FIToFIPaymentStatusRequest message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentStatusRequest message can be used in domestic and cross-border scenarios.\r\n\r\n";
				previousVersion_lazy = () -> FIToFIPaymentStatusRequestV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_Payments_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "FIToFIPmtStsReq";
				businessArea_lazy = () -> PaymentsClearingandSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV02.mmGroupHeader, com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV02.mmOriginalGroupInformation,
						com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV02.mmTransactionInformation, com.tools20022.repository.area.pacs.FIToFIPaymentStatusRequestV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "028";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FIToFIPaymentStatusRequestV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader53 getGroupHeader() {
		return groupHeader;
	}

	public FIToFIPaymentStatusRequestV02 setGroupHeader(GroupHeader53 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<OriginalGroupInformation27> getOriginalGroupInformation() {
		return originalGroupInformation == null ? originalGroupInformation = new ArrayList<>() : originalGroupInformation;
	}

	public FIToFIPaymentStatusRequestV02 setOriginalGroupInformation(List<OriginalGroupInformation27> originalGroupInformation) {
		this.originalGroupInformation = Objects.requireNonNull(originalGroupInformation);
		return this;
	}

	public List<PaymentTransaction94> getTransactionInformation() {
		return transactionInformation == null ? transactionInformation = new ArrayList<>() : transactionInformation;
	}

	public FIToFIPaymentStatusRequestV02 setTransactionInformation(List<PaymentTransaction94> transactionInformation) {
		this.transactionInformation = Objects.requireNonNull(transactionInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public FIToFIPaymentStatusRequestV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.028.001.02")
	static public class Document {
		@XmlElement(name = "FIToFIPmtStsReq", required = true)
		public FIToFIPaymentStatusRequestV02 messageBody;
	}
}