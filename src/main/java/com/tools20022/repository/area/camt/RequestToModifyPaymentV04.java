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
import com.tools20022.repository.area.CashManagementPreviousVersion;
import com.tools20022.repository.choice.UnderlyingTransaction3Choice;
import com.tools20022.repository.msg.Case3;
import com.tools20022.repository.msg.CaseAssignment3;
import com.tools20022.repository.msg.RequestedModification6;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ExceptionsandInvestigationsISOLatestversion;
import com.tools20022.repository.msgset.ExceptionsandInvestigationsMaintenance20162017;
import com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The RequestToModifyPayment message is sent by a case creator/case assigner to
 * a case assignee.<br>
 * This message is used to request the modification of characteristics of an
 * original payment instruction.<br>
 * <b>Usage</b><br>
 * The RequestToModifyPayment message must be answered with a:<br>
 * - Resolution Of Investigation message with a positive final outcome when the
 * case assignee can perform the requested modification<br>
 * - Resolution Of Investigation message with a negative final outcome when the
 * case assignee may perform the requested modification but fails to do so (too
 * late, irrevocable instruction, one requested element cannot be modified.)<br>
 * - Reject Case Assignment message when the case assignee is unable or not
 * authorised to perform the requested modification<br>
 * - Notification Of Case Assignment message to indicate whether the case
 * assignee will take on the case himself or reassign the case to a subsequent
 * party in the payment processing chain.<br>
 * The Request To Modify Payment message covers one and only one original
 * instruction at a time. If several original payment instructions need to be
 * modified, then multiple Request To Modify Payment messages must be sent.<br>
 * The Request To Modify Payment message can be sent to request the modification
 * of one or several elements of the original payment instruction. If many
 * elements need to be modified, it is recommended to cancel the original
 * payment instruction and initiate a new one.<br>
 * The Request To Modify Payment must be processed on an all or nothing basis.
 * If one of the elements to be modified cannot be altered, the assignment must
 * be rejected in full by means of a negative Resolution Of Investigation
 * message. (See section on Resolution Of Investigation for more details.)<br>
 * The Request To Modify Payment message must never be sent to request the
 * modification of the currency of the original payment instruction. If the
 * currency is wrong, use Request To Cancel Payment message to cancel it and
 * issue and a new payment instruction.<br>
 * The Request To Modify Payment message may be forwarded to subsequent case
 * assignee(s).<br>
 * When a Request To Modify Payment message is used to decrease the amount of
 * the original payment instruction, the modification will trigger a return of
 * funds from the case assignee to the case creator. The assignee may indicate,
 * within the Resolution Of Investigation message, the amount to be returned,
 * the date it is or will be returned and the channel through which the return
 * will be done.<br>
 * The Request To Modify Payment message must never be sent to request the
 * increase of the amount of the original payment instruction. To increase the
 * amount in a payment, the debtor can do one of the following:<br>
 * - Cancel the first payment using a Request To Cancel Payment message and make
 * a new payment with a higher and correct amount.<br>
 * - Simply send a second payment with the supplementary amount.<br>
 * Depending on the requested modification(s) and the processing stage of the
 * original payment instruction, the processing of a request to modify payment
 * case may end with one of the following:<br>
 * - an Additional Payment Information message sent to the creditor of the
 * original payment instruction<br>
 * - a Debit Authorisation Request message sent to the creditor of the original
 * payment instruction<br>
 * - a Request To Cancel Payment message sent to a subsequent case assignee<br>
 * The Request To Modify Payment message can be sent to correct characteristics
 * of an original payment instruction following receipt of an Unable To Apply
 * message. In this scenario, the case identification will remain the same.<br>
 * The RequestToModifyPayment message has the following main characteristics:<br>
 * The case creator assigns a unique case identification. This information will
 * be passed unchanged to all subsequent case assignee(s).<br>
 * Lowering the amount of an original payment instruction for which cover is
 * provided by a separate instruction will systematically mean the modification
 * of the whole transaction, including the cover. The case assignee performing
 * the amount modification must initiate the return of funds in excess to the
 * case creator.<br>
 * The modification of the agent's or agents' information on an original payment
 * instruction for which cover is provided by a separate instruction will
 * systematically mean the whole transaction is modified, i.e., the cover is
 * executed through the agent(s) mentioned in the Request To Modify Payment
 * message. The cover payment must not be modified separately.<br>
 * The modification of a payment instruction can be initiated by either the
 * debtor or any subsequent agent in the payment processing chain.<br>
 * The case creator provides the information to be modified in line with
 * agreements made with the case assignee. If the case assignee needs in turn to
 * assign the case to a subsequent case assignee, the requested modification(s)
 * must be in line with the agreement made with the next case assignee and a
 * Notification Of Case Assignment message must be sent to the case assigner.
 * Otherwise, the request to modify payment case must be rejected (by means of a
 * negative Resolution Of Investigation message).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV04#mmAssignment
 * RequestToModifyPaymentV04.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV04#mmCase
 * RequestToModifyPaymentV04.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV04#mmUnderlying
 * RequestToModifyPaymentV04.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV04#mmModification
 * RequestToModifyPaymentV04.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV04#mmSupplementaryData
 * RequestToModifyPaymentV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ExceptionsandInvestigationsISOLatestversion
 * ExceptionsandInvestigationsISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017
 * MX_Payment_Maintenance_2016_2017}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ExceptionsandInvestigationsMaintenance20162017
 * ExceptionsandInvestigationsMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ReqToModfyPmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementPreviousVersion
 * CashManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.087.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestToModifyPaymentV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe RequestToModifyPayment message is sent by a case creator/case assigner to a case assignee.\r\nThis message is used to request the modification of characteristics of an original payment instruction.\r\nUsage\r\nThe RequestToModifyPayment message must be answered with a:\r\n- Resolution Of Investigation message with a positive final outcome when the case assignee can perform the requested modification\r\n- Resolution Of Investigation message with a negative final outcome when the case assignee may perform the requested modification but fails to do so (too late, irrevocable instruction, one requested element cannot be modified.)\r\n- Reject Case Assignment message when the case assignee is unable or not authorised to perform the requested modification\r\n- Notification Of Case Assignment message to indicate whether the case assignee will take on the case himself or reassign the case to a subsequent party in the payment processing chain.\r\nThe Request To Modify Payment message covers one and only one original instruction at a time. If several original payment instructions need to be modified, then multiple Request To Modify Payment messages must be sent.\r\nThe Request To Modify Payment message can be sent to request the modification of one or several elements of the original payment instruction. If many elements need to be modified, it is recommended to cancel the original payment instruction and initiate a new one.\r\nThe Request To Modify Payment must be processed on an all or nothing basis. If one of the elements to be modified cannot be altered, the assignment must be rejected in full by means of a negative Resolution Of Investigation message. (See section on Resolution Of Investigation for more details.)\r\nThe Request To Modify Payment message must never be sent to request the modification of the currency of the original payment instruction. If the currency is wrong, use Request To Cancel Payment message to cancel it and issue and a new payment instruction.\r\nThe Request To Modify Payment message may be forwarded to subsequent case assignee(s).\r\nWhen a Request To Modify Payment message is used to decrease the amount of the original payment instruction, the modification will trigger a return of funds from the case assignee to the case creator. The assignee may indicate, within the Resolution Of Investigation message, the amount to be returned, the date it is or will be returned and the channel through which the return will be done.\r\nThe Request To Modify Payment message must never be sent to request the increase of the amount of the original payment instruction. To increase the amount in a payment, the debtor can do one of the following:\r\n- Cancel the first payment using a Request To Cancel Payment message and make a new payment with a higher and correct amount.\r\n- Simply send a second payment with the supplementary amount.\r\nDepending on the requested modification(s) and the processing stage of the original payment instruction, the processing of a request to modify payment case may end with one of the following:\r\n- an Additional Payment Information message sent to the creditor of the original payment instruction\r\n- a Debit Authorisation Request message sent to the creditor of the original payment instruction\r\n- a Request To Cancel Payment message sent to a subsequent case assignee\r\nThe Request To Modify Payment message can be sent to correct characteristics of an original payment instruction following receipt of an Unable To Apply message. In this scenario, the case identification will remain the same.\r\nThe RequestToModifyPayment message has the following main characteristics:\r\nThe case creator assigns a unique case identification. This information will be passed unchanged to all subsequent case assignee(s).\r\nLowering the amount of an original payment instruction for which cover is provided by a separate instruction will systematically mean the modification of the whole transaction, including the cover. The case assignee performing the amount modification must initiate the return of funds in excess to the case creator.\r\nThe modification of the agent's or agents' information on an original payment instruction for which cover is provided by a separate instruction will systematically mean the whole transaction is modified, i.e., the cover is executed through the agent(s) mentioned in the Request To Modify Payment message. The cover payment must not be modified separately.\r\nThe modification of a payment instruction can be initiated by either the debtor or any subsequent agent in the payment processing chain.\r\nThe case creator provides the information to be modified in line with agreements made with the case assignee. If the case assignee needs in turn to assign the case to a subsequent case assignee, the requested modification(s) must be in line with the agreement made with the next case assignee and a Notification Of Case Assignment message must be sent to the case assigner. Otherwise, the request to modify payment case must be rejected (by means of a negative Resolution Of Investigation message)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV05
 * RequestToModifyPaymentV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03
 * RequestToModifyPaymentV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequestToModifyPaymentV04", propOrder = {"assignment", "case_", "underlying", "modification", "supplementaryData"})
public class RequestToModifyPaymentV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment3 assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
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
	 * definition} =
	 * "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV05#mmAssignment
	 * RequestToModifyPaymentV05.mmAssignment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03#mmAssignment
	 * RequestToModifyPaymentV03.mmAssignment}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			nextVersions_lazy = () -> Arrays.asList(RequestToModifyPaymentV05.mmAssignment);
			previousVersion_lazy = () -> RequestToModifyPaymentV03.mmAssignment;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestToModifyPaymentV04.class.getMethod("getAssignment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Case", required = true)
	protected Case3 case_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
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
	 * definition} = "Identifies the investigation case."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV05#mmCase
	 * RequestToModifyPaymentV05.mmCase}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03#mmCase
	 * RequestToModifyPaymentV03.mmCase}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCase = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			nextVersions_lazy = () -> Arrays.asList(RequestToModifyPaymentV05.mmCase);
			previousVersion_lazy = () -> RequestToModifyPaymentV03.mmCase;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestToModifyPaymentV04.class.getMethod("getCase", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Undrlyg", required = true)
	protected UnderlyingTransaction3Choice underlying;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction3Choice
	 * UnderlyingTransaction3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Undrlyg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Underlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the payment transaction to be modified."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV05#mmUnderlying
	 * RequestToModifyPaymentV05.mmUnderlying}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03#mmUnderlying
	 * RequestToModifyPaymentV03.mmUnderlying}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUnderlying = new MMMessageBuildingBlock() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "Identifies the payment transaction to be modified.";
			nextVersions_lazy = () -> Arrays.asList(RequestToModifyPaymentV05.mmUnderlying);
			previousVersion_lazy = () -> RequestToModifyPaymentV03.mmUnderlying;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnderlyingTransaction3Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestToModifyPaymentV04.class.getMethod("getUnderlying", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Mod", required = true)
	protected RequestedModification6 modification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification6
	 * RequestedModification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the list of modifications requested."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV05#mmModification
	 * RequestToModifyPaymentV05.mmModification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03#mmModification
	 * RequestToModifyPaymentV03.mmModification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Identifies the list of modifications requested.";
			nextVersions_lazy = () -> Arrays.asList(RequestToModifyPaymentV05.mmModification);
			previousVersion_lazy = () -> RequestToModifyPaymentV03.mmModification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> RequestedModification6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestToModifyPaymentV04.class.getMethod("getModification", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV05#mmSupplementaryData
	 * RequestToModifyPaymentV05.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPaymentV03#mmSupplementaryData
	 * RequestToModifyPaymentV03.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(RequestToModifyPaymentV05.mmSupplementaryData);
			previousVersion_lazy = () -> RequestToModifyPaymentV03.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestToModifyPaymentV04.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestToModifyPaymentV04";
				definition = "Scope\r\nThe RequestToModifyPayment message is sent by a case creator/case assigner to a case assignee.\r\nThis message is used to request the modification of characteristics of an original payment instruction.\r\nUsage\r\nThe RequestToModifyPayment message must be answered with a:\r\n- Resolution Of Investigation message with a positive final outcome when the case assignee can perform the requested modification\r\n- Resolution Of Investigation message with a negative final outcome when the case assignee may perform the requested modification but fails to do so (too late, irrevocable instruction, one requested element cannot be modified.)\r\n- Reject Case Assignment message when the case assignee is unable or not authorised to perform the requested modification\r\n- Notification Of Case Assignment message to indicate whether the case assignee will take on the case himself or reassign the case to a subsequent party in the payment processing chain.\r\nThe Request To Modify Payment message covers one and only one original instruction at a time. If several original payment instructions need to be modified, then multiple Request To Modify Payment messages must be sent.\r\nThe Request To Modify Payment message can be sent to request the modification of one or several elements of the original payment instruction. If many elements need to be modified, it is recommended to cancel the original payment instruction and initiate a new one.\r\nThe Request To Modify Payment must be processed on an all or nothing basis. If one of the elements to be modified cannot be altered, the assignment must be rejected in full by means of a negative Resolution Of Investigation message. (See section on Resolution Of Investigation for more details.)\r\nThe Request To Modify Payment message must never be sent to request the modification of the currency of the original payment instruction. If the currency is wrong, use Request To Cancel Payment message to cancel it and issue and a new payment instruction.\r\nThe Request To Modify Payment message may be forwarded to subsequent case assignee(s).\r\nWhen a Request To Modify Payment message is used to decrease the amount of the original payment instruction, the modification will trigger a return of funds from the case assignee to the case creator. The assignee may indicate, within the Resolution Of Investigation message, the amount to be returned, the date it is or will be returned and the channel through which the return will be done.\r\nThe Request To Modify Payment message must never be sent to request the increase of the amount of the original payment instruction. To increase the amount in a payment, the debtor can do one of the following:\r\n- Cancel the first payment using a Request To Cancel Payment message and make a new payment with a higher and correct amount.\r\n- Simply send a second payment with the supplementary amount.\r\nDepending on the requested modification(s) and the processing stage of the original payment instruction, the processing of a request to modify payment case may end with one of the following:\r\n- an Additional Payment Information message sent to the creditor of the original payment instruction\r\n- a Debit Authorisation Request message sent to the creditor of the original payment instruction\r\n- a Request To Cancel Payment message sent to a subsequent case assignee\r\nThe Request To Modify Payment message can be sent to correct characteristics of an original payment instruction following receipt of an Unable To Apply message. In this scenario, the case identification will remain the same.\r\nThe RequestToModifyPayment message has the following main characteristics:\r\nThe case creator assigns a unique case identification. This information will be passed unchanged to all subsequent case assignee(s).\r\nLowering the amount of an original payment instruction for which cover is provided by a separate instruction will systematically mean the modification of the whole transaction, including the cover. The case assignee performing the amount modification must initiate the return of funds in excess to the case creator.\r\nThe modification of the agent's or agents' information on an original payment instruction for which cover is provided by a separate instruction will systematically mean the whole transaction is modified, i.e., the cover is executed through the agent(s) mentioned in the Request To Modify Payment message. The cover payment must not be modified separately.\r\nThe modification of a payment instruction can be initiated by either the debtor or any subsequent agent in the payment processing chain.\r\nThe case creator provides the information to be modified in line with agreements made with the case assignee. If the case assignee needs in turn to assign the case to a subsequent case assignee, the requested modification(s) must be in line with the agreement made with the next case assignee and a Notification Of Case Assignment message must be sent to the case assigner. Otherwise, the request to modify payment case must be rejected (by means of a negative Resolution Of Investigation message).";
				nextVersions_lazy = () -> Arrays.asList(RequestToModifyPaymentV05.mmObject());
				previousVersion_lazy = () -> RequestToModifyPaymentV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ExceptionsandInvestigationsISOLatestversion.mmObject(), MX_Payment_Maintenance_2016_2017.mmObject(), ExceptionsandInvestigationsMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "ReqToModfyPmt";
				businessArea_lazy = () -> CashManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.RequestToModifyPaymentV04.mmAssignment, com.tools20022.repository.area.camt.RequestToModifyPaymentV04.mmCase,
						com.tools20022.repository.area.camt.RequestToModifyPaymentV04.mmUnderlying, com.tools20022.repository.area.camt.RequestToModifyPaymentV04.mmModification,
						com.tools20022.repository.area.camt.RequestToModifyPaymentV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "087";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RequestToModifyPaymentV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment3 getAssignment() {
		return assignment;
	}

	public RequestToModifyPaymentV04 setAssignment(CaseAssignment3 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Case3 getCase() {
		return case_;
	}

	public RequestToModifyPaymentV04 setCase(Case3 case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	public UnderlyingTransaction3Choice getUnderlying() {
		return underlying;
	}

	public RequestToModifyPaymentV04 setUnderlying(UnderlyingTransaction3Choice underlying) {
		this.underlying = Objects.requireNonNull(underlying);
		return this;
	}

	public RequestedModification6 getModification() {
		return modification;
	}

	public RequestToModifyPaymentV04 setModification(RequestedModification6 modification) {
		this.modification = Objects.requireNonNull(modification);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public RequestToModifyPaymentV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.087.001.04")
	static public class Document {
		@XmlElement(name = "ReqToModfyPmt", required = true)
		public RequestToModifyPaymentV04 messageBody;
	}
}