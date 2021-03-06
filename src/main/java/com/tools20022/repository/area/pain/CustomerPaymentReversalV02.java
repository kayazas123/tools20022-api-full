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
import com.tools20022.repository.area.PaymentsInitiationArchive;
import com.tools20022.repository.msg.GroupHeader40;
import com.tools20022.repository.msg.OriginalGroupInformation22;
import com.tools20022.repository.msg.OriginalPaymentInformation2;
import com.tools20022.repository.msgset.ISOArchive;
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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.007.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationArchive
 * PaymentsInitiationArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV02#mmGroupHeader
 * CustomerPaymentReversalV02.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV02#mmOriginalGroupInformation
 * CustomerPaymentReversalV02.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV02#mmOriginalPaymentInformationAndReversal
 * CustomerPaymentReversalV02.mmOriginalPaymentInformationAndReversal}</li>
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
 * xmlTag} = "CstmrPmtRvsl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerPaymentReversalV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CustomerPaymentReversal message is sent by the initiating party to the next party in the payment chain. It is used to reverse a payment previously executed.\r\nUsage\r\nThe CustomerPaymentReversal message is exchanged between a non-financial institution customer and an agent to reverse a CustomerDirectDebitInitiation message that has been settled. The result will be a credit on the debtor account.\r\nThe CustomerPaymentReversal message refers to the original CustomerDirectDebitInitiation message by means of references only or by means of references and a set of elements from the original instruction.\r\nThe CustomerPaymentReversal message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule#for_pain_CustomerPaymentReversalV02
 * ConstraintGroupReversalAndPaymentInformationNotPresentRule.
 * for_pain_CustomerPaymentReversalV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndReasonRule#for_pain_CustomerPaymentReversalV02
 * ConstraintGroupReversalAndReasonRule.for_pain_CustomerPaymentReversalV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule#for_pain_CustomerPaymentReversalV02
 * ConstraintGroupReversalAndNumberOfTransactionsRule.
 * for_pain_CustomerPaymentReversalV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationPresentRule#for_pain_CustomerPaymentReversalV02
 * ConstraintGroupReversalAndPaymentInformationPresentRule.
 * for_pain_CustomerPaymentReversalV02}</li>
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
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV03
 * CustomerPaymentReversalV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV01
 * CustomerPaymentReversalV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustomerPaymentReversalV02", propOrder = {"groupHeader", "originalGroupInformation", "originalPaymentInformationAndReversal"})
public class CustomerPaymentReversalV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader40 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader40
	 * GroupHeader40}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentReversalV02, GroupHeader40> mmGroupHeader = new MMMessageBuildingBlock<CustomerPaymentReversalV02, GroupHeader40>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader40.mmObject();
		}

		@Override
		public GroupHeader40 getValue(CustomerPaymentReversalV02 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(CustomerPaymentReversalV02 obj, GroupHeader40 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "OrgnlGrpInf", required = true)
	protected OriginalGroupInformation22 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation22
	 * OriginalGroupInformation22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original group of transactions, to which the message refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentReversalV02, OriginalGroupInformation22> mmOriginalGroupInformation = new MMMessageBuildingBlock<CustomerPaymentReversalV02, OriginalGroupInformation22>() {
		{
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Information concerning the original group of transactions, to which the message refers.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OriginalGroupInformation22.mmObject();
		}

		@Override
		public OriginalGroupInformation22 getValue(CustomerPaymentReversalV02 obj) {
			return obj.getOriginalGroupInformation();
		}

		@Override
		public void setValue(CustomerPaymentReversalV02 obj, OriginalGroupInformation22 value) {
			obj.setOriginalGroupInformation(value);
		}
	};
	@XmlElement(name = "OrgnlPmtInfAndRvsl")
	protected List<OriginalPaymentInformation2> originalPaymentInformationAndReversal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation2
	 * OriginalPaymentInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfAndRvsl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationAndReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original payment information, to which the reversal message refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentReversalV02, List<OriginalPaymentInformation2>> mmOriginalPaymentInformationAndReversal = new MMMessageBuildingBlock<CustomerPaymentReversalV02, List<OriginalPaymentInformation2>>() {
		{
			xmlTag = "OrgnlPmtInfAndRvsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationAndReversal";
			definition = "Information concerning the original payment information, to which the reversal message refers.";
			minOccurs = 0;
			complexType_lazy = () -> OriginalPaymentInformation2.mmObject();
		}

		@Override
		public List<OriginalPaymentInformation2> getValue(CustomerPaymentReversalV02 obj) {
			return obj.getOriginalPaymentInformationAndReversal();
		}

		@Override
		public void setValue(CustomerPaymentReversalV02 obj, List<OriginalPaymentInformation2> value) {
			obj.setOriginalPaymentInformationAndReversal(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationNotPresentRule.for_pain_CustomerPaymentReversalV02,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndReasonRule.for_pain_CustomerPaymentReversalV02,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule.for_pain_CustomerPaymentReversalV02,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndPaymentInformationPresentRule.for_pain_CustomerPaymentReversalV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerPaymentReversalV02";
				definition = "Scope\r\nThe CustomerPaymentReversal message is sent by the initiating party to the next party in the payment chain. It is used to reverse a payment previously executed.\r\nUsage\r\nThe CustomerPaymentReversal message is exchanged between a non-financial institution customer and an agent to reverse a CustomerDirectDebitInitiation message that has been settled. The result will be a credit on the debtor account.\r\nThe CustomerPaymentReversal message refers to the original CustomerDirectDebitInitiation message by means of references only or by means of references and a set of elements from the original instruction.\r\nThe CustomerPaymentReversal message can be used in domestic and cross-border scenarios.";
				nextVersions_lazy = () -> Arrays.asList(CustomerPaymentReversalV03.mmObject());
				previousVersion_lazy = () -> CustomerPaymentReversalV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CstmrPmtRvsl";
				businessArea_lazy = () -> PaymentsInitiationArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerPaymentReversalV02.mmGroupHeader, com.tools20022.repository.area.pain.CustomerPaymentReversalV02.mmOriginalGroupInformation,
						com.tools20022.repository.area.pain.CustomerPaymentReversalV02.mmOriginalPaymentInformationAndReversal);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "007";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustomerPaymentReversalV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader40 getGroupHeader() {
		return groupHeader;
	}

	public CustomerPaymentReversalV02 setGroupHeader(GroupHeader40 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public OriginalGroupInformation22 getOriginalGroupInformation() {
		return originalGroupInformation;
	}

	public CustomerPaymentReversalV02 setOriginalGroupInformation(OriginalGroupInformation22 originalGroupInformation) {
		this.originalGroupInformation = Objects.requireNonNull(originalGroupInformation);
		return this;
	}

	public List<OriginalPaymentInformation2> getOriginalPaymentInformationAndReversal() {
		return originalPaymentInformationAndReversal == null ? originalPaymentInformationAndReversal = new ArrayList<>() : originalPaymentInformationAndReversal;
	}

	public CustomerPaymentReversalV02 setOriginalPaymentInformationAndReversal(List<OriginalPaymentInformation2> originalPaymentInformationAndReversal) {
		this.originalPaymentInformationAndReversal = Objects.requireNonNull(originalPaymentInformationAndReversal);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.007.001.02")
	static public class Document {
		@XmlElement(name = "CstmrPmtRvsl", required = true)
		public CustomerPaymentReversalV02 messageBody;
	}
}