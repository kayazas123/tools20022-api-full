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
import com.tools20022.repository.msg.DebitAuthorisationConfirmation;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Debit Authorisation Response message is sent by an account owner to its
 * account servicing institution. This message is used to approve or reject a
 * debit authorisation request.<br>
 * <b>Usage</b><br>
 * The Debit Authorisation Response message is used to reply to a Debit
 * Authorisation Request message.<br>
 * The Debit Authorisation Response message covers one and only one payment
 * instruction at a time. If an account owner needs to reply to several Debit
 * Authorisation Request messages, then multiple Debit Authorisation Response
 * messages must be sent.<br>
 * The Debit Authorisation Response message indicates whether the account owner
 * agrees with the request by means of a code. It also allows further details to
 * be given about the debit authorisation, such as acceptable amount and value
 * date for the debit.<br>
 * The Debit Authorisation Response message must be used exclusively between the
 * account owner and the account servicing institution. It must not be used in
 * place of a Resolution Of Investigation message between subsequent agents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.036.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponse#mmAssignment
 * DebitAuthorisationResponse.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponse#mmCase
 * DebitAuthorisationResponse.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponse#mmConfirmation
 * DebitAuthorisationResponse.mmConfirmation}</li>
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
 * xmlTag} = "camt.036.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "camt.036.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DebitAuthorisationResponse"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Debit Authorisation Response message is sent by an account owner to its account servicing institution. This message is used to approve or reject a debit authorisation request.\r\nUsage\r\nThe Debit Authorisation Response message is used to reply to a Debit Authorisation Request message.\r\nThe Debit Authorisation Response message covers one and only one payment instruction at a time. If an account owner needs to reply to several Debit Authorisation Request messages, then multiple Debit Authorisation Response messages must be sent.\r\nThe Debit Authorisation Response message indicates whether the account owner agrees with the request by means of a code. It also allows further details to be given about the debit authorisation, such as acceptable amount and value date for the debit.\r\nThe Debit Authorisation Response message must be used exclusively between the account owner and the account servicing institution. It must not be used in place of a Resolution Of Investigation message between subsequent agents."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV02
 * DebitAuthorisationResponseV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "camt.036.001.01", propOrder = {"assignment", "case_", "confirmation"})
public class DebitAuthorisationResponse {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies an assignment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DebitAuthorisationResponse, CaseAssignment> mmAssignment = new MMMessageBuildingBlock<DebitAuthorisationResponse, CaseAssignment>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies an assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment.mmObject();
		}

		@Override
		public CaseAssignment getValue(DebitAuthorisationResponse obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(DebitAuthorisationResponse obj, CaseAssignment value) {
			obj.setAssignment(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a case."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DebitAuthorisationResponse, Case> mmCase = new MMMessageBuildingBlock<DebitAuthorisationResponse, Case>() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies a case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case.mmObject();
		}

		@Override
		public Case getValue(DebitAuthorisationResponse obj) {
			return obj.getCase();
		}

		@Override
		public void setValue(DebitAuthorisationResponse obj, Case value) {
			obj.setCase(value);
		}
	};
	@XmlElement(name = "Conf", required = true)
	protected DebitAuthorisationConfirmation confirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation
	 * DebitAuthorisationConfirmation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Conf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if the debit authorisation is granted or not."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<DebitAuthorisationResponse, DebitAuthorisationConfirmation> mmConfirmation = new MMMessageBuildingBlock<DebitAuthorisationResponse, DebitAuthorisationConfirmation>() {
		{
			xmlTag = "Conf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmation";
			definition = "Indicates if the debit authorisation is granted or not.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DebitAuthorisationConfirmation.mmObject();
		}

		@Override
		public DebitAuthorisationConfirmation getValue(DebitAuthorisationResponse obj) {
			return obj.getConfirmation();
		}

		@Override
		public void setValue(DebitAuthorisationResponse obj, DebitAuthorisationConfirmation value) {
			obj.setConfirmation(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DebitAuthorisationResponse";
				definition = "Scope\r\nThe Debit Authorisation Response message is sent by an account owner to its account servicing institution. This message is used to approve or reject a debit authorisation request.\r\nUsage\r\nThe Debit Authorisation Response message is used to reply to a Debit Authorisation Request message.\r\nThe Debit Authorisation Response message covers one and only one payment instruction at a time. If an account owner needs to reply to several Debit Authorisation Request messages, then multiple Debit Authorisation Response messages must be sent.\r\nThe Debit Authorisation Response message indicates whether the account owner agrees with the request by means of a code. It also allows further details to be given about the debit authorisation, such as acceptable amount and value date for the debit.\r\nThe Debit Authorisation Response message must be used exclusively between the account owner and the account servicing institution. It must not be used in place of a Resolution Of Investigation message between subsequent agents.";
				nextVersions_lazy = () -> Arrays.asList(DebitAuthorisationResponseV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "camt.036.001.01";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				xmlName = "camt.036.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.DebitAuthorisationResponse.mmAssignment, com.tools20022.repository.area.camt.DebitAuthorisationResponse.mmCase,
						com.tools20022.repository.area.camt.DebitAuthorisationResponse.mmConfirmation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "036";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return DebitAuthorisationResponse.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment getAssignment() {
		return assignment;
	}

	public DebitAuthorisationResponse setAssignment(CaseAssignment assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Case getCase() {
		return case_;
	}

	public DebitAuthorisationResponse setCase(Case case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	public DebitAuthorisationConfirmation getConfirmation() {
		return confirmation;
	}

	public DebitAuthorisationResponse setConfirmation(DebitAuthorisationConfirmation confirmation) {
		this.confirmation = Objects.requireNonNull(confirmation);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.036.001.01")
	static public class Document {
		@XmlElement(name = "camt.036.001.01", required = true)
		public DebitAuthorisationResponse messageBody;
	}
}