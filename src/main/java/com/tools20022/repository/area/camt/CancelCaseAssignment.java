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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.msg.Case;
import com.tools20022.repository.msg.CaseAssignment;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Cancel Case Assignment message is sent by a case creator or case assigner
 * to a case assignee. This message is used to request the cancellation of a
 * case.<br>
 * <b>Usage</b><br>
 * The Cancel Case Assignment message is used to stop the processing of a case
 * at a case assignee when a case assignment is incorrect or when the root cause
 * for the case disappears (such as the account owner was able to reconcile
 * after sending a Claim Non Receipt message).<br>
 * The Cancel Case Assignment message can be used to stop the processing of a:<br>
 * - request to cancel payment case<br>
 * - request to modify payment case<br>
 * - unable to apply case<br>
 * - claim non receipt case<br>
 * The Cancel Case Assignment message covers one and only one case at a time. If
 * several case assignments need to be cancelled, then multiple Cancel Case
 * Assignment messages must be sent.<br>
 * The Cancel Case Assignment message must be forwarded by all subsequent case
 * assignee(s) in the case processing chain until it reaches the end point.<br>
 * When an agent re-assigns the Cancel Case Assignment to a subsequent case
 * assignee, this agent must send a Notification Of Case Assignment message to
 * its assigner.<br>
 * When the Cancel Case Assignment instruction has been acted upon by the
 * relevant case assignee, a Resolution Of Investigation message is sent to the
 * case assigner or case creator, in reply.<br>
 * The Cancel Case Assignment message must not be used for other purposes. If,
 * for example, a request to modify payment fails, and the case creator requests
 * the cancellation of the payment, then a Request To Cancel Payment message
 * must be used, with the case identification of the original Request To Modify
 * Payment message. In this context it is incorrect to use the Cancel Case
 * Assignment message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelCaseAssignment#mmAssignment
 * CancelCaseAssignment.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelCaseAssignment#mmCase
 * CancelCaseAssignment.mmCase}</li>
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
 * xmlTag} = "camt.032.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "camt.032.001.01"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.032.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancelCaseAssignment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Cancel Case Assignment message is sent by a case creator or case assigner to a case assignee. This message is used to request the cancellation of a case.\r\nUsage\r\nThe Cancel Case Assignment message is used to stop the processing of a case at a case assignee when a case assignment is incorrect or when the root cause for the case disappears (such as the account owner was able to reconcile after sending a Claim Non Receipt message).\r\nThe Cancel Case Assignment message can be used to stop the processing of a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe Cancel Case Assignment message covers one and only one case at a time. If several case assignments need to be cancelled, then multiple Cancel Case Assignment messages must be sent.\r\nThe Cancel Case Assignment message must be forwarded by all subsequent case assignee(s) in the case processing chain until it reaches the end point.\r\nWhen an agent re-assigns the Cancel Case Assignment to a subsequent case assignee, this agent must send a Notification Of Case Assignment message to its assigner.\r\nWhen the Cancel Case Assignment instruction has been acted upon by the relevant case assignee, a Resolution Of Investigation message is sent to the case assigner or case creator, in reply.\r\nThe Cancel Case Assignment message must not be used for other purposes. If, for example, a request to modify payment fails, and the case creator requests the cancellation of the payment, then a Request To Cancel Payment message must be used, with the case identification of the original Request To Modify Payment message. In this context it is incorrect to use the Cancel Case Assignment message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.camt.CancelCaseAssignmentV02
 * CancelCaseAssignmentV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "camt.032.001.01", propOrder = {"assignment", "case_"})
public class CancelCaseAssignment {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment
	 * CaseAssignment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the assignment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CancelCaseAssignment.class.getMethod("getAssignment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Case", required = true)
	protected Case case_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case Case}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the case."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCase = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CancelCaseAssignment.class.getMethod("getCase", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancelCaseAssignment";
				definition = "Scope\r\nThe Cancel Case Assignment message is sent by a case creator or case assigner to a case assignee. This message is used to request the cancellation of a case.\r\nUsage\r\nThe Cancel Case Assignment message is used to stop the processing of a case at a case assignee when a case assignment is incorrect or when the root cause for the case disappears (such as the account owner was able to reconcile after sending a Claim Non Receipt message).\r\nThe Cancel Case Assignment message can be used to stop the processing of a:\r\n- request to cancel payment case\r\n- request to modify payment case\r\n- unable to apply case\r\n- claim non receipt case\r\nThe Cancel Case Assignment message covers one and only one case at a time. If several case assignments need to be cancelled, then multiple Cancel Case Assignment messages must be sent.\r\nThe Cancel Case Assignment message must be forwarded by all subsequent case assignee(s) in the case processing chain until it reaches the end point.\r\nWhen an agent re-assigns the Cancel Case Assignment to a subsequent case assignee, this agent must send a Notification Of Case Assignment message to its assigner.\r\nWhen the Cancel Case Assignment instruction has been acted upon by the relevant case assignee, a Resolution Of Investigation message is sent to the case assigner or case creator, in reply.\r\nThe Cancel Case Assignment message must not be used for other purposes. If, for example, a request to modify payment fails, and the case creator requests the cancellation of the payment, then a Request To Cancel Payment message must be used, with the case identification of the original Request To Modify Payment message. In this context it is incorrect to use the Cancel Case Assignment message.";
				nextVersions_lazy = () -> Arrays.asList(CancelCaseAssignmentV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "camt.032.001.01";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				xmlName = "camt.032.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.CancelCaseAssignment.mmAssignment, com.tools20022.repository.area.camt.CancelCaseAssignment.mmCase);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "032";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CancelCaseAssignment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment getAssignment() {
		return assignment;
	}

	public CancelCaseAssignment setAssignment(CaseAssignment assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Case getCase() {
		return case_;
	}

	public CancelCaseAssignment setCase(Case case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.032.001.01")
	static public class Document {
		@XmlElement(name = "camt.032.001.01", required = true)
		public CancelCaseAssignment messageBody;
	}
}