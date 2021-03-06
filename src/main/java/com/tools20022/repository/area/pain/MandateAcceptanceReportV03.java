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
import com.tools20022.repository.msg.GroupHeader47;
import com.tools20022.repository.msg.MandateAcceptance3;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The MandateAcceptanceReport message is sent from the agent of the receiver
 * (debtor or creditor) of the MandateRequest message (initiation, amendment or
 * cancellation) to the agent of the initiator of the MandateRequest message
 * (debtor or creditor).<br>
 * A MandateAcceptanceReport message is used to confirm the acceptance or
 * rejection of a MandateRequest message. Where acceptance is part of the full
 * process flow, a MandateRequest message only becomes valid after a
 * confirmation of acceptance is received through a MandateAcceptanceReport
 * message from the agent of the receiver.<br>
 * <b>Usage</b><br>
 * The MandateAcceptanceReport message can contain one or more confirmation(s)
 * of acceptance or rejection of a specific Mandate Request.<br>
 * The messages can be exchanged between debtor agent and creditor agent and
 * between debtor agent and debtor and creditor agent and creditor.<br>
 * The MandateAcceptanceReport message can be used in domestic and cross-border
 * scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.012.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationArchive
 * PaymentsInitiationArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV03#mmGroupHeader
 * MandateAcceptanceReportV03.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV03#mmUnderlyingAcceptanceDetails
 * MandateAcceptanceReportV03.mmUnderlyingAcceptanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV03#mmSupplementaryData
 * MandateAcceptanceReportV03.mmSupplementaryData}</li>
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
 * xmlTag} = "MndtAccptncRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateAcceptanceReportV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MandateAcceptanceReport message is sent from the agent of the receiver (debtor or creditor) of the MandateRequest message (initiation, amendment or cancellation) to the agent of the initiator of the MandateRequest message (debtor or creditor).\r\nA MandateAcceptanceReport message is used to confirm the acceptance or rejection of a MandateRequest message. Where acceptance is part of the full process flow, a MandateRequest message only becomes valid after a confirmation of acceptance is received through a MandateAcceptanceReport message from the agent of the receiver.\r\nUsage\r\nThe MandateAcceptanceReport message can contain one or more confirmation(s) of acceptance or rejection of a specific Mandate Request.\r\nThe messages can be exchanged between debtor agent and creditor agent and between debtor agent and debtor and creditor agent and creditor.\r\nThe MandateAcceptanceReport message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_MandateAcceptanceReportV03
 * ConstraintSupplementaryDataRule.for_pain_MandateAcceptanceReportV03}</li>
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
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV04
 * MandateAcceptanceReportV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV02
 * MandateAcceptanceReportV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MandateAcceptanceReportV03", propOrder = {"groupHeader", "underlyingAcceptanceDetails", "supplementaryData"})
public class MandateAcceptanceReportV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader47 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader47
	 * GroupHeader47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics to identify the message and parties playing a role in the mandate acceptance, but which are not part of the mandate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV04#mmGroupHeader
	 * MandateAcceptanceReportV04.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MandateAcceptanceReportV03, GroupHeader47> mmGroupHeader = new MMMessageBuildingBlock<MandateAcceptanceReportV03, GroupHeader47>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics to identify the message and parties playing a role in the mandate acceptance, but which are not part of the mandate.";
			nextVersions_lazy = () -> Arrays.asList(MandateAcceptanceReportV04.mmGroupHeader);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader47.mmObject();
		}

		@Override
		public GroupHeader47 getValue(MandateAcceptanceReportV03 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(MandateAcceptanceReportV03 obj, GroupHeader47 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "UndrlygAccptncDtls", required = true)
	protected List<MandateAcceptance3> underlyingAcceptanceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance3
	 * MandateAcceptance3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygAccptncDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingAcceptanceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the acception or rejection of the mandate request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV04#mmUnderlyingAcceptanceDetails
	 * MandateAcceptanceReportV04.mmUnderlyingAcceptanceDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MandateAcceptanceReportV03, List<MandateAcceptance3>> mmUnderlyingAcceptanceDetails = new MMMessageBuildingBlock<MandateAcceptanceReportV03, List<MandateAcceptance3>>() {
		{
			xmlTag = "UndrlygAccptncDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingAcceptanceDetails";
			definition = "Set of elements used to provide information on the acception or rejection of the mandate request.";
			nextVersions_lazy = () -> Arrays.asList(MandateAcceptanceReportV04.mmUnderlyingAcceptanceDetails);
			minOccurs = 1;
			complexType_lazy = () -> MandateAcceptance3.mmObject();
		}

		@Override
		public List<MandateAcceptance3> getValue(MandateAcceptanceReportV03 obj) {
			return obj.getUnderlyingAcceptanceDetails();
		}

		@Override
		public void setValue(MandateAcceptanceReportV03 obj, List<MandateAcceptance3> value) {
			obj.setUnderlyingAcceptanceDetails(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV04#mmSupplementaryData
	 * MandateAcceptanceReportV04.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MandateAcceptanceReportV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MandateAcceptanceReportV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(MandateAcceptanceReportV04.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MandateAcceptanceReportV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MandateAcceptanceReportV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_MandateAcceptanceReportV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateAcceptanceReportV03";
				definition = "Scope\r\nThe MandateAcceptanceReport message is sent from the agent of the receiver (debtor or creditor) of the MandateRequest message (initiation, amendment or cancellation) to the agent of the initiator of the MandateRequest message (debtor or creditor).\r\nA MandateAcceptanceReport message is used to confirm the acceptance or rejection of a MandateRequest message. Where acceptance is part of the full process flow, a MandateRequest message only becomes valid after a confirmation of acceptance is received through a MandateAcceptanceReport message from the agent of the receiver.\r\nUsage\r\nThe MandateAcceptanceReport message can contain one or more confirmation(s) of acceptance or rejection of a specific Mandate Request.\r\nThe messages can be exchanged between debtor agent and creditor agent and between debtor agent and debtor and creditor agent and creditor.\r\nThe MandateAcceptanceReport message can be used in domestic and cross-border scenarios.";
				nextVersions_lazy = () -> Arrays.asList(MandateAcceptanceReportV04.mmObject());
				previousVersion_lazy = () -> MandateAcceptanceReportV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MndtAccptncRpt";
				businessArea_lazy = () -> PaymentsInitiationArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.MandateAcceptanceReportV03.mmGroupHeader, com.tools20022.repository.area.pain.MandateAcceptanceReportV03.mmUnderlyingAcceptanceDetails,
						com.tools20022.repository.area.pain.MandateAcceptanceReportV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "012";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MandateAcceptanceReportV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader47 getGroupHeader() {
		return groupHeader;
	}

	public MandateAcceptanceReportV03 setGroupHeader(GroupHeader47 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<MandateAcceptance3> getUnderlyingAcceptanceDetails() {
		return underlyingAcceptanceDetails == null ? underlyingAcceptanceDetails = new ArrayList<>() : underlyingAcceptanceDetails;
	}

	public MandateAcceptanceReportV03 setUnderlyingAcceptanceDetails(List<MandateAcceptance3> underlyingAcceptanceDetails) {
		this.underlyingAcceptanceDetails = Objects.requireNonNull(underlyingAcceptanceDetails);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MandateAcceptanceReportV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.012.001.03")
	static public class Document {
		@XmlElement(name = "MndtAccptncRpt", required = true)
		public MandateAcceptanceReportV03 messageBody;
	}
}