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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV02;
import com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV03;
import com.tools20022.repository.choice.AcceptedStatus1Choice;
import com.tools20022.repository.choice.CancelledStatus3Choice;
import com.tools20022.repository.choice.PendingStatus1Choice;
import com.tools20022.repository.choice.RejectedStatus1Choice;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.entity.CorporateActionStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NoSpecifiedReason1;
import com.tools20022.repository.msg.ProprietaryStatusAndReason1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between different instruction processing statuses.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#mmCancelled
 * InstructionProcessingStatus7Choice.mmCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#mmAccepted
 * InstructionProcessingStatus7Choice.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#mmRejected
 * InstructionProcessingStatus7Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#mmPending
 * InstructionProcessingStatus7Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#mmDefaultAction
 * InstructionProcessingStatus7Choice.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#mmStandingInstruction
 * InstructionProcessingStatus7Choice.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice#mmProprietaryStatus
 * InstructionProcessingStatus7Choice.mmProprietaryStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
 * CorporateActionStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV02#mmInstructionProcessingStatus
 * CorporateActionInstructionStatusAdviceV02.mmInstructionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV03#mmInstructionProcessingStatus
 * CorporateActionInstructionStatusAdviceV03.mmInstructionProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionProcessingStatus7Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between different instruction processing statuses."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus12Choice
 * InstructionProcessingStatus12Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionProcessingStatus7Choice", propOrder = {"cancelled", "accepted", "rejected", "pending", "defaultAction", "standingInstruction", "proprietaryStatus"})
public class InstructionProcessingStatus7Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Canc", required = true)
	protected CancelledStatus3Choice cancelled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancelledStatus3Choice
	 * CancelledStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice
	 * InstructionProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Canc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to an instruction request cancelled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//CAND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus7Choice, CancelledStatus3Choice> mmCancelled = new MMMessageAssociationEnd<InstructionProcessingStatus7Choice, CancelledStatus3Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Canc";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//CAND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Provides status information related to an instruction request cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancelledStatus3Choice.mmObject();
		}

		@Override
		public CancelledStatus3Choice getValue(InstructionProcessingStatus7Choice obj) {
			return obj.getCancelled();
		}

		@Override
		public void setValue(InstructionProcessingStatus7Choice obj, CancelledStatus3Choice value) {
			obj.setCancelled(value);
		}
	};
	@XmlElement(name = "Accptd", required = true)
	protected AcceptedStatus1Choice accepted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AcceptedStatus1Choice
	 * AcceptedStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmAcceptedReason
	 * CorporateActionStatusReason.mmAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice
	 * InstructionProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Accptd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to an instruction request accepted for further processing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//PACK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus7Choice, AcceptedStatus1Choice> mmAccepted = new MMMessageAssociationEnd<InstructionProcessingStatus7Choice, AcceptedStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmAcceptedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Accptd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//PACK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Provides status information related to an instruction request accepted for further processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AcceptedStatus1Choice.mmObject();
		}

		@Override
		public AcceptedStatus1Choice getValue(InstructionProcessingStatus7Choice obj) {
			return obj.getAccepted();
		}

		@Override
		public void setValue(InstructionProcessingStatus7Choice obj, AcceptedStatus1Choice value) {
			obj.setAccepted(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected RejectedStatus1Choice rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectedStatus1Choice
	 * RejectedStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice
	 * InstructionProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to an instruction request rejected for further processing due to system reasons."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//REJT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus7Choice, RejectedStatus1Choice> mmRejected = new MMMessageAssociationEnd<InstructionProcessingStatus7Choice, RejectedStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//REJT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Provides status information related to an instruction request rejected for further processing due to system reasons.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedStatus1Choice.mmObject();
		}

		@Override
		public RejectedStatus1Choice getValue(InstructionProcessingStatus7Choice obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(InstructionProcessingStatus7Choice obj, RejectedStatus1Choice value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "Pdg", required = true)
	protected PendingStatus1Choice pending;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingStatus1Choice
	 * PendingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice
	 * InstructionProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status information related to a pending instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//PEND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus7Choice, PendingStatus1Choice> mmPending = new MMMessageAssociationEnd<InstructionProcessingStatus7Choice, PendingStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Pdg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//PEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Provides status information related to a pending instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingStatus1Choice.mmObject();
		}

		@Override
		public PendingStatus1Choice getValue(InstructionProcessingStatus7Choice obj) {
			return obj.getPending();
		}

		@Override
		public void setValue(InstructionProcessingStatus7Choice obj, PendingStatus1Choice value) {
			obj.setPending(value);
		}
	};
	@XmlElement(name = "DfltActn", required = true)
	protected NoSpecifiedReason1 defaultAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NoSpecifiedReason1
	 * NoSpecifiedReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice
	 * InstructionProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltActn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Default action is taken."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//DFLA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus7Choice, NoSpecifiedReason1> mmDefaultAction = new MMMessageAssociationEnd<InstructionProcessingStatus7Choice, NoSpecifiedReason1>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "DfltActn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//DFLA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultAction";
			definition = "Default action is taken.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NoSpecifiedReason1.mmObject();
		}

		@Override
		public NoSpecifiedReason1 getValue(InstructionProcessingStatus7Choice obj) {
			return obj.getDefaultAction();
		}

		@Override
		public void setValue(InstructionProcessingStatus7Choice obj, NoSpecifiedReason1 value) {
			obj.setDefaultAction(value);
		}
	};
	@XmlElement(name = "StgInstr", required = true)
	protected NoSpecifiedReason1 standingInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NoSpecifiedReason1
	 * NoSpecifiedReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
	 * CorporateActionStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice
	 * InstructionProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgInstr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing instruction has been applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//STIN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus7Choice, NoSpecifiedReason1> mmStandingInstruction = new MMMessageAssociationEnd<InstructionProcessingStatus7Choice, NoSpecifiedReason1>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "StgInstr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//STIN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstruction";
			definition = "Standing instruction has been applied.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NoSpecifiedReason1.mmObject();
		}

		@Override
		public NoSpecifiedReason1 getValue(InstructionProcessingStatus7Choice obj) {
			return obj.getStandingInstruction();
		}

		@Override
		public void setValue(InstructionProcessingStatus7Choice obj, NoSpecifiedReason1 value) {
			obj.setStandingInstruction(value);
		}
	};
	@XmlElement(name = "PrtrySts", required = true)
	protected ProprietaryStatusAndReason1 proprietaryStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1
	 * ProprietaryStatusAndReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus7Choice
	 * InstructionProcessingStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtrySts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary status related to an instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::IPRC//[8c]/4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionProcessingStatus7Choice, ProprietaryStatusAndReason1> mmProprietaryStatus = new MMMessageAssociationEnd<InstructionProcessingStatus7Choice, ProprietaryStatusAndReason1>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionProcessingStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtrySts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::IPRC//[8c]/4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatus";
			definition = "Proprietary status related to an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason1.mmObject();
		}

		@Override
		public ProprietaryStatusAndReason1 getValue(InstructionProcessingStatus7Choice obj) {
			return obj.getProprietaryStatus();
		}

		@Override
		public void setValue(InstructionProcessingStatus7Choice obj, ProprietaryStatusAndReason1 value) {
			obj.setProprietaryStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructionProcessingStatus7Choice.mmCancelled, com.tools20022.repository.choice.InstructionProcessingStatus7Choice.mmAccepted,
						com.tools20022.repository.choice.InstructionProcessingStatus7Choice.mmRejected, com.tools20022.repository.choice.InstructionProcessingStatus7Choice.mmPending,
						com.tools20022.repository.choice.InstructionProcessingStatus7Choice.mmDefaultAction, com.tools20022.repository.choice.InstructionProcessingStatus7Choice.mmStandingInstruction,
						com.tools20022.repository.choice.InstructionProcessingStatus7Choice.mmProprietaryStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionInstructionStatusAdviceV02.mmInstructionProcessingStatus, CorporateActionInstructionStatusAdviceV03.mmInstructionProcessingStatus);
				trace_lazy = () -> CorporateActionStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "InstructionProcessingStatus7Choice";
				definition = "Choice between different instruction processing statuses.";
				nextVersions_lazy = () -> Arrays.asList(InstructionProcessingStatus12Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CancelledStatus3Choice getCancelled() {
		return cancelled;
	}

	public InstructionProcessingStatus7Choice setCancelled(CancelledStatus3Choice cancelled) {
		this.cancelled = Objects.requireNonNull(cancelled);
		return this;
	}

	public AcceptedStatus1Choice getAccepted() {
		return accepted;
	}

	public InstructionProcessingStatus7Choice setAccepted(AcceptedStatus1Choice accepted) {
		this.accepted = Objects.requireNonNull(accepted);
		return this;
	}

	public RejectedStatus1Choice getRejected() {
		return rejected;
	}

	public InstructionProcessingStatus7Choice setRejected(RejectedStatus1Choice rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public PendingStatus1Choice getPending() {
		return pending;
	}

	public InstructionProcessingStatus7Choice setPending(PendingStatus1Choice pending) {
		this.pending = Objects.requireNonNull(pending);
		return this;
	}

	public NoSpecifiedReason1 getDefaultAction() {
		return defaultAction;
	}

	public InstructionProcessingStatus7Choice setDefaultAction(NoSpecifiedReason1 defaultAction) {
		this.defaultAction = Objects.requireNonNull(defaultAction);
		return this;
	}

	public NoSpecifiedReason1 getStandingInstruction() {
		return standingInstruction;
	}

	public InstructionProcessingStatus7Choice setStandingInstruction(NoSpecifiedReason1 standingInstruction) {
		this.standingInstruction = Objects.requireNonNull(standingInstruction);
		return this;
	}

	public ProprietaryStatusAndReason1 getProprietaryStatus() {
		return proprietaryStatus;
	}

	public InstructionProcessingStatus7Choice setProprietaryStatus(ProprietaryStatusAndReason1 proprietaryStatus) {
		this.proprietaryStatus = Objects.requireNonNull(proprietaryStatus);
		return this;
	}
}