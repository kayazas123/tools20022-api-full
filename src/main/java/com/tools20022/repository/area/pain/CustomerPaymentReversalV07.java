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

package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsInitiationPreviousVersion;
import com.tools20022.repository.msg.GroupHeader56;
import com.tools20022.repository.msg.OriginalGroupHeader3;
import com.tools20022.repository.msg.OriginalPaymentInstruction21;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017;
import com.tools20022.repository.msgset.PaymentsInitiationISOLatestversion;
import com.tools20022.repository.msgset.PaymentsInitiationMaintenance20162017;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CustomerPaymentReversal message is sent by the initiating party to the
 * next party in the payment chain. It is used to reverse a payment previously
 * executed.<br>
 * <b>Usage</b><br>
 * The CustomerPaymentReversal message is exchanged between a non-financial
 * institution customer and an agent to reverse a CustomerDirectDebitInitiation
 * message that has been settled. The result will be a credit on the debtor
 * account.<br>
 * The CustomerPaymentReversal message refers to the original
 * CustomerDirectDebitInitiation message by means of references only or by means
 * of references and a set of elements from the original instruction.<br>
 * The CustomerPaymentReversal message can be used in domestic and cross-border
 * scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07#mmGroupHeader
 * CustomerPaymentReversalV07.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07#mmOriginalGroupInformation
 * CustomerPaymentReversalV07.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07#mmOriginalPaymentInformationAndReversal
 * CustomerPaymentReversalV07.mmOriginalPaymentInformationAndReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV07#mmSupplementaryData
 * CustomerPaymentReversalV07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsInitiationISOLatestversion
 * PaymentsInitiationISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017
 * MX_Payment_Maintenance_2016_2017}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsInitiationMaintenance20162017
 * PaymentsInitiationMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CstmrPmtRvsl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationPreviousVersion
 * PaymentsInitiationPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.007.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule#forCustomerPaymentReversalV07
 * ConstraintGroupReversalAndPaymentInformationNotPresentRule.
 * forCustomerPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndReasonRule#forCustomerPaymentReversalV07
 * ConstraintGroupReversalAndReasonRule.forCustomerPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline#forCustomerPaymentReversalV07
 * ConstraintGroupReversalAndNumberOfTransactionsGuideline.
 * forCustomerPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationPresentRule#forCustomerPaymentReversalV07
 * ConstraintGroupReversalAndPaymentInformationPresentRule.
 * forCustomerPaymentReversalV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerPaymentReversalV07
 * ConstraintSupplementaryDataRule.forCustomerPaymentReversalV07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerPaymentReversalV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CustomerPaymentReversal message is sent by the initiating party to the next party in the payment chain. It is used to reverse a payment previously executed.\r\nUsage\r\nThe CustomerPaymentReversal message is exchanged between a non-financial institution customer and an agent to reverse a CustomerDirectDebitInitiation message that has been settled. The result will be a credit on the debtor account.\r\nThe CustomerPaymentReversal message refers to the original CustomerDirectDebitInitiation message by means of references only or by means of references and a set of elements from the original instruction.\r\nThe CustomerPaymentReversal message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV08
 * CustomerPaymentReversalV08}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV06
 * CustomerPaymentReversalV06}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustomerPaymentReversalV07", propOrder = {"groupHeader", "originalGroupInformation", "originalPaymentInformationAndReversal", "supplementaryData"})
public class CustomerPaymentReversalV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader56 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader56
	 * GroupHeader56}</li>
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
	 * "Set of characteristics shared by all individual transactions included in the message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV08#mmGroupHeader
	 * CustomerPaymentReversalV08.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV06#mmGroupHeader
	 * CustomerPaymentReversalV06.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			nextVersions_lazy = () -> Arrays.asList(CustomerPaymentReversalV08.mmGroupHeader);
			previousVersion_lazy = () -> CustomerPaymentReversalV06.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader56.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustomerPaymentReversalV07.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OrgnlGrpInf", required = true)
	protected OriginalGroupHeader3 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3
	 * OriginalGroupHeader3}</li>
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
	 * "Information concerning the original group of transactions, to which the message refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV08#mmOriginalGroupInformation
	 * CustomerPaymentReversalV08.mmOriginalGroupInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV06#mmOriginalGroupInformation
	 * CustomerPaymentReversalV06.mmOriginalGroupInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOriginalGroupInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Information concerning the original group of transactions, to which the message refers.";
			nextVersions_lazy = () -> Arrays.asList(CustomerPaymentReversalV08.mmOriginalGroupInformation);
			previousVersion_lazy = () -> CustomerPaymentReversalV06.mmOriginalGroupInformation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OriginalGroupHeader3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustomerPaymentReversalV07.class.getMethod("getOriginalGroupInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OrgnlPmtInfAndRvsl")
	protected List<OriginalPaymentInstruction21> originalPaymentInformationAndReversal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21
	 * OriginalPaymentInstruction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfAndRvsl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationAndReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original payment information, to which the reversal message refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV08#mmOriginalPaymentInformationAndReversal
	 * CustomerPaymentReversalV08.mmOriginalPaymentInformationAndReversal}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV06#mmOriginalPaymentInformationAndReversal
	 * CustomerPaymentReversalV06.mmOriginalPaymentInformationAndReversal}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOriginalPaymentInformationAndReversal = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlPmtInfAndRvsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationAndReversal";
			definition = "Information concerning the original payment information, to which the reversal message refers.";
			nextVersions_lazy = () -> Arrays.asList(CustomerPaymentReversalV08.mmOriginalPaymentInformationAndReversal);
			previousVersion_lazy = () -> CustomerPaymentReversalV06.mmOriginalPaymentInformationAndReversal;
			minOccurs = 0;
			complexType_lazy = () -> OriginalPaymentInstruction21.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustomerPaymentReversalV07.class.getMethod("getOriginalPaymentInformationAndReversal", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV08#mmSupplementaryData
	 * CustomerPaymentReversalV08.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV06#mmSupplementaryData
	 * CustomerPaymentReversalV06.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CustomerPaymentReversalV08.mmSupplementaryData);
			previousVersion_lazy = () -> CustomerPaymentReversalV06.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustomerPaymentReversalV07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule.forCustomerPaymentReversalV07,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndReasonRule.forCustomerPaymentReversalV07,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsGuideline.forCustomerPaymentReversalV07,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationPresentRule.forCustomerPaymentReversalV07,
						com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerPaymentReversalV07);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerPaymentReversalV07";
				definition = "Scope\r\nThe CustomerPaymentReversal message is sent by the initiating party to the next party in the payment chain. It is used to reverse a payment previously executed.\r\nUsage\r\nThe CustomerPaymentReversal message is exchanged between a non-financial institution customer and an agent to reverse a CustomerDirectDebitInitiation message that has been settled. The result will be a credit on the debtor account.\r\nThe CustomerPaymentReversal message refers to the original CustomerDirectDebitInitiation message by means of references only or by means of references and a set of elements from the original instruction.\r\nThe CustomerPaymentReversal message can be used in domestic and cross-border scenarios.";
				nextVersions_lazy = () -> Arrays.asList(CustomerPaymentReversalV08.mmObject());
				previousVersion_lazy = () -> CustomerPaymentReversalV06.mmObject();
				messageSet_lazy = () -> Arrays.asList(PaymentsInitiationISOLatestversion.mmObject(), MX_Payment_Maintenance_2016_2017.mmObject(), PaymentsInitiationMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "CstmrPmtRvsl";
				businessArea_lazy = () -> PaymentsInitiationPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerPaymentReversalV07.mmGroupHeader, com.tools20022.repository.area.pain.CustomerPaymentReversalV07.mmOriginalGroupInformation,
						com.tools20022.repository.area.pain.CustomerPaymentReversalV07.mmOriginalPaymentInformationAndReversal, com.tools20022.repository.area.pain.CustomerPaymentReversalV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "007";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustomerPaymentReversalV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader56 getGroupHeader() {
		return groupHeader;
	}

	public CustomerPaymentReversalV07 setGroupHeader(GroupHeader56 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public OriginalGroupHeader3 getOriginalGroupInformation() {
		return originalGroupInformation;
	}

	public CustomerPaymentReversalV07 setOriginalGroupInformation(OriginalGroupHeader3 originalGroupInformation) {
		this.originalGroupInformation = Objects.requireNonNull(originalGroupInformation);
		return this;
	}

	public List<OriginalPaymentInstruction21> getOriginalPaymentInformationAndReversal() {
		return originalPaymentInformationAndReversal == null ? originalPaymentInformationAndReversal = new ArrayList<>() : originalPaymentInformationAndReversal;
	}

	public CustomerPaymentReversalV07 setOriginalPaymentInformationAndReversal(List<OriginalPaymentInstruction21> originalPaymentInformationAndReversal) {
		this.originalPaymentInformationAndReversal = Objects.requireNonNull(originalPaymentInformationAndReversal);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CustomerPaymentReversalV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.007.001.07")
	static public class Document {
		@XmlElement(name = "CstmrPmtRvsl", required = true)
		public CustomerPaymentReversalV07 messageBody;
	}
}