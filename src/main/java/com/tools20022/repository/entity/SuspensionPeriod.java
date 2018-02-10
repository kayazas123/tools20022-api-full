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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Period defining the last date for which an action will be accepted and the
 * date on which the suspension will be released and normal processing will
 * resume.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SuspensionPeriod" src="doc-files/SuspensionPeriod.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmPrivilegeSuspensionPeriod
 * SuspensionPeriod.mmPrivilegeSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawal
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForBookEntryTransfer
 * SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDepositAtAgent
 * SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForDeposit
 * SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForPledge
 * SuspensionPeriod.mmDepositorySuspensionPeriodForPledge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForSegregation
 * SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalAtAgent
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawalInStreetName
 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCoDepositoriesSuspensionPeriod
 * SuspensionPeriod.mmCoDepositoriesSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmCorporateActionEvent
 * SuspensionPeriod.mmCorporateActionEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPrivilegeSuspensionCorporateAction
 * DateTimePeriod.mmPrivilegeSuspensionCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBookEntryTransferSuspensionRelatedEvent
 * DateTimePeriod.mmBookEntryTransferSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmDepositAtAgentSuspensionRelatedEvent
 * DateTimePeriod.mmDepositAtAgentSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmDepositSuspensionRelatedEvent
 * DateTimePeriod.mmDepositSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPledgeSuspensionRelatedEvent
 * DateTimePeriod.mmPledgeSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSegregationPeriodRelatedEvent
 * DateTimePeriod.mmSegregationPeriodRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalAtAgentSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalAtAgentSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalInNomineeNameSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalInNomineeNameSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalInStreetNameSuspensionRelatedEvent
 * DateTimePeriod.mmWithdrawalInStreetNameSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCoDepositoriesSuspensionRelatedEvent
 * DateTimePeriod.mmCoDepositoriesSuspensionRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSuspensionPeriod
 * CorporateActionEvent.mmSuspensionPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SuspensionPeriod"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume."
 * </li>
 * </ul>
 */
public class SuspensionPeriod {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriod privilegeSuspensionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPrivilegeSuspensionCorporateAction
	 * DateTimePeriod.mmPrivilegeSuspensionCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod5#mmPrivilegeSuspensionPeriod
	 * CorporateActionPeriod5.mmPrivilegeSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmPrivilegeSuspensionPeriod
	 * CorporateActionPeriod7.mmPrivilegeSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmPrivilegeSuspensionPeriod
	 * CorporateActionPeriod2.mmPrivilegeSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12#mmPrivilegeSuspensionPeriod
	 * CorporateActionPeriod12.mmPrivilegeSuspensionPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivilegeSuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the privilege is not available, eg, this can happen whenever a meeting takes place or whenever a coupon payment is due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPrivilegeSuspensionPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod5.mmPrivilegeSuspensionPeriod, CorporateActionPeriod7.mmPrivilegeSuspensionPeriod, CorporateActionPeriod2.mmPrivilegeSuspensionPeriod,
					CorporateActionPeriod12.mmPrivilegeSuspensionPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrivilegeSuspensionPeriod";
			definition = "Period during which the privilege is not available, eg, this can happen whenever a meeting takes place or whenever a coupon payment is due.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmPrivilegeSuspensionCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForWithdrawal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalSuspensionRelatedEvent
	 * DateTimePeriod.mmWithdrawalSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod5#mmDepositorySuspensionPeriodForWithdrawal
	 * CorporateActionPeriod5.mmDepositorySuspensionPeriodForWithdrawal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmDepositorySuspensionPeriodForWithdrawal
	 * CorporateActionPeriod7.mmDepositorySuspensionPeriodForWithdrawal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12#mmDepositorySuspensionPeriodForWithdrawal
	 * CorporateActionPeriod12.mmDepositorySuspensionPeriodForWithdrawal}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which withdrawal in street name requests on the outturn security will be accepted and the date on which the suspension will be released and withdrawal by transfer processing on the outturn security will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForWithdrawal = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod5.mmDepositorySuspensionPeriodForWithdrawal, CorporateActionPeriod7.mmDepositorySuspensionPeriodForWithdrawal,
					CorporateActionPeriod12.mmDepositorySuspensionPeriodForWithdrawal);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawal";
			definition = "Period defining the last date on which withdrawal in street name requests on the outturn security will be accepted and the date on which the suspension will be released and withdrawal by transfer processing on the outturn security will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForBookEntryTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBookEntryTransferSuspensionRelatedEvent
	 * DateTimePeriod.mmBookEntryTransferSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#mmDepositorySuspensionPeriodForBookEntryTransfer
	 * CorporateActionPeriod3.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForBookEntryTransfer
	 * CorporateActionPeriod6.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForBookEntryTransfer
	 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForBookEntryTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForBookEntryTransfer
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForBookEntryTransfer}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForBookEntryTransfer
	 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForBookEntryTransfer}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForBookEntryTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which book entry transfers will be accepted and the date on which the suspension will be released and book entry transfer processing will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForBookEntryTransfer = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays
					.asList(CorporateActionPeriod3.mmDepositorySuspensionPeriodForBookEntryTransfer, CorporateActionPeriod6.mmDepositorySuspensionPeriodForBookEntryTransfer,
							CorporateActionPeriod8.mmDepositorySuspensionPeriodForBookEntryTransfer, CorporateActionPeriod10.mmDepositorySuspensionPeriodForBookEntryTransfer,
							CorporateActionPeriod14.mmDepositorySuspensionPeriodForBookEntryTransfer);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForBookEntryTransfer";
			definition = "Period defining the last date for which book entry transfers will be accepted and the date on which the suspension will be released and book entry transfer processing will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmBookEntryTransferSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForDepositAtAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmDepositAtAgentSuspensionRelatedEvent
	 * DateTimePeriod.mmDepositAtAgentSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#mmDepositorySuspensionPeriodForDepositAtAgent
	 * CorporateActionPeriod3.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForDepositAtAgent
	 * CorporateActionPeriod6.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForDepositAtAgent
	 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForDepositAtAgent
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForDepositAtAgent
	 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForDepositAtAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForDepositAtAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which deposits, into nominee name, at the agent will be accepted and the date on which the suspension will be released and deposits at agent will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForDepositAtAgent = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod3.mmDepositorySuspensionPeriodForDepositAtAgent, CorporateActionPeriod6.mmDepositorySuspensionPeriodForDepositAtAgent,
					CorporateActionPeriod8.mmDepositorySuspensionPeriodForDepositAtAgent, CorporateActionPeriod10.mmDepositorySuspensionPeriodForDepositAtAgent, CorporateActionPeriod14.mmDepositorySuspensionPeriodForDepositAtAgent);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForDepositAtAgent";
			definition = "Period defining the last date for which deposits, into nominee name, at the agent will be accepted and the date on which the suspension will be released and deposits at agent will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmDepositAtAgentSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForDeposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmDepositSuspensionRelatedEvent
	 * DateTimePeriod.mmDepositSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#mmDepositorySuspensionPeriodForDeposit
	 * CorporateActionPeriod3.mmDepositorySuspensionPeriodForDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForDeposit
	 * CorporateActionPeriod6.mmDepositorySuspensionPeriodForDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForDeposit
	 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForDeposit
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForDeposit
	 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForDeposit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which deposits will be accepted and the date on which the suspension will be released and deposits will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForDeposit = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod3.mmDepositorySuspensionPeriodForDeposit, CorporateActionPeriod6.mmDepositorySuspensionPeriodForDeposit, CorporateActionPeriod8.mmDepositorySuspensionPeriodForDeposit,
					CorporateActionPeriod10.mmDepositorySuspensionPeriodForDeposit, CorporateActionPeriod14.mmDepositorySuspensionPeriodForDeposit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForDeposit";
			definition = "Period defining the last date for which deposits will be accepted and the date on which the suspension will be released and deposits will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmDepositSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForPledge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPledgeSuspensionRelatedEvent
	 * DateTimePeriod.mmPledgeSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#mmDepositorySuspensionPeriodForPledge
	 * CorporateActionPeriod3.mmDepositorySuspensionPeriodForPledge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForPledge
	 * CorporateActionPeriod6.mmDepositorySuspensionPeriodForPledge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForPledge
	 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForPledge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForPledge
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForPledge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForPledge
	 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForPledge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForPledge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which pledges will be accepted and the date on which the suspension will be released and pledge processing will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForPledge = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod3.mmDepositorySuspensionPeriodForPledge, CorporateActionPeriod6.mmDepositorySuspensionPeriodForPledge, CorporateActionPeriod8.mmDepositorySuspensionPeriodForPledge,
					CorporateActionPeriod10.mmDepositorySuspensionPeriodForPledge, CorporateActionPeriod14.mmDepositorySuspensionPeriodForPledge);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForPledge";
			definition = "Period defining the last date for which pledges will be accepted and the date on which the suspension will be released and pledge processing will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmPledgeSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForSegregation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSegregationPeriodRelatedEvent
	 * DateTimePeriod.mmSegregationPeriodRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#mmDepositorySuspensionPeriodForSegregation
	 * CorporateActionPeriod3.mmDepositorySuspensionPeriodForSegregation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForSegregation
	 * CorporateActionPeriod6.mmDepositorySuspensionPeriodForSegregation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForSegregation
	 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForSegregation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForSegregation
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForSegregation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForSegregation
	 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForSegregation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForSegregation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which intra-position balances can be segregated and the date on which the suspension will be released and the ability to segregate intra-position balances will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForSegregation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod3.mmDepositorySuspensionPeriodForSegregation, CorporateActionPeriod6.mmDepositorySuspensionPeriodForSegregation,
					CorporateActionPeriod8.mmDepositorySuspensionPeriodForSegregation, CorporateActionPeriod10.mmDepositorySuspensionPeriodForSegregation, CorporateActionPeriod14.mmDepositorySuspensionPeriodForSegregation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForSegregation";
			definition = "Period defining the last date for which intra-position balances can be segregated and the date on which the suspension will be released and the ability to segregate intra-position balances will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmSegregationPeriodRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForWithdrawalAtAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalAtAgentSuspensionRelatedEvent
	 * DateTimePeriod.mmWithdrawalAtAgentSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#mmDepositorySuspensionPeriodForWithdrawalAtAgent
	 * CorporateActionPeriod3.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForWithdrawalAtAgent
	 * CorporateActionPeriod6.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForWithdrawalAtAgent
	 * CorporateActionPeriod8.mmDepositorySuspensionPeriodForWithdrawalAtAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForWithdrawalAtAgent
	 * CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalAtAgent}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForWithdrawalAtAgent
	 * CorporateActionPeriod14.mmDepositorySuspensionPeriodForWithdrawalAtAgent}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalAtAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which withdrawals, from nominee name at the agent will be accepted and the date on which the suspension will be released and withdrawals at agent processing will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForWithdrawalAtAgent = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays
					.asList(CorporateActionPeriod3.mmDepositorySuspensionPeriodForWithdrawalAtAgent, CorporateActionPeriod6.mmDepositorySuspensionPeriodForWithdrawalAtAgent,
							CorporateActionPeriod8.mmDepositorySuspensionPeriodForWithdrawalAtAgent, CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalAtAgent,
							CorporateActionPeriod14.mmDepositorySuspensionPeriodForWithdrawalAtAgent);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalAtAgent";
			definition = "Period defining the last date for which withdrawals, from nominee name at the agent will be accepted and the date on which the suspension will be released and withdrawals at agent processing will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalAtAgentSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForWithdrawalInNomineeName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalInNomineeNameSuspensionRelatedEvent
	 * DateTimePeriod.mmWithdrawalInNomineeNameSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
	 * CorporateActionPeriod3.
	 * mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
	 * CorporateActionPeriod6.
	 * mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
	 * CorporateActionPeriod8.
	 * mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
	 * CorporateActionPeriod10.
	 * mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForWithdrawalInNomineeName
	 * CorporateActionPeriod14.
	 * mmDepositorySuspensionPeriodForWithdrawalInNomineeName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalInNomineeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date for which physical withdrawals in the nominee's name will be accepted and the date on which the suspension will be released and physical withdrawals in the nominee's name will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForWithdrawalInNomineeName = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod3.mmDepositorySuspensionPeriodForWithdrawalInNomineeName, CorporateActionPeriod6.mmDepositorySuspensionPeriodForWithdrawalInNomineeName,
					CorporateActionPeriod8.mmDepositorySuspensionPeriodForWithdrawalInNomineeName, CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalInNomineeName,
					CorporateActionPeriod14.mmDepositorySuspensionPeriodForWithdrawalInNomineeName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInNomineeName";
			definition = "Period defining the last date for which physical withdrawals in the nominee's name will be accepted and the date on which the suspension will be released and physical withdrawals in the nominee's name will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalInNomineeNameSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod depositorySuspensionPeriodForWithdrawalInStreetName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmWithdrawalInStreetNameSuspensionRelatedEvent
	 * DateTimePeriod.mmWithdrawalInStreetNameSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#mmDepositorySuspensionPeriodForWithdrawalInStreetName
	 * CorporateActionPeriod3.
	 * mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmDepositorySuspensionPeriodForWithdrawalInStreetName
	 * CorporateActionPeriod6.
	 * mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmDepositorySuspensionPeriodForWithdrawalInStreetName
	 * CorporateActionPeriod8.
	 * mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmDepositorySuspensionPeriodForWithdrawalInStreetName
	 * CorporateActionPeriod10.
	 * mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmDepositorySuspensionPeriodForWithdrawalInStreetName
	 * CorporateActionPeriod14.
	 * mmDepositorySuspensionPeriodForWithdrawalInStreetName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawalInStreetName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which withdrawal requests in street name's will be accepted on the event security and the date on which the suspension will be released and withdrawal in street name's processing on the event security will resume."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDepositorySuspensionPeriodForWithdrawalInStreetName = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod3.mmDepositorySuspensionPeriodForWithdrawalInStreetName, CorporateActionPeriod6.mmDepositorySuspensionPeriodForWithdrawalInStreetName,
					CorporateActionPeriod8.mmDepositorySuspensionPeriodForWithdrawalInStreetName, CorporateActionPeriod10.mmDepositorySuspensionPeriodForWithdrawalInStreetName,
					CorporateActionPeriod14.mmDepositorySuspensionPeriodForWithdrawalInStreetName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawalInStreetName";
			definition = "Period defining the last date on which withdrawal requests in street name's will be accepted on the event security and the date on which the suspension will be released and withdrawal in street name's processing on the event security will resume.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalInStreetNameSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected DateTimePeriod coDepositoriesSuspensionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmCoDepositoriesSuspensionRelatedEvent
	 * DateTimePeriod.mmCoDepositoriesSuspensionRelatedEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmCoDepositoriesSuspensionPeriod
	 * CorporateActionPeriod8.mmCoDepositoriesSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmCoDepositoriesSuspensionPeriod
	 * CorporateActionPeriod10.mmCoDepositoriesSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod14#mmCoDepositoriesSuspensionPeriod
	 * CorporateActionPeriod14.mmCoDepositoriesSuspensionPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoDepositoriesSuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the settlement activities at the co-depositories are suspended in order to stabilise the holdings at the CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCoDepositoriesSuspensionPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod8.mmCoDepositoriesSuspensionPeriod, CorporateActionPeriod10.mmCoDepositoriesSuspensionPeriod, CorporateActionPeriod14.mmCoDepositoriesSuspensionPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoDepositoriesSuspensionPeriod";
			definition = "Period during which the settlement activities at the co-depositories are suspended in order to stabilise the holdings at the CSD.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmCoDepositoriesSuspensionRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmSuspensionPeriod
	 * CorporateActionEvent.mmSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod
	 * SuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a depository suspension period is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate action event for which a depository suspension period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmSuspensionPeriod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SuspensionPeriod";
				definition = "Period defining the last date for which an action will be accepted and the date on which the suspension will be released and normal processing will resume.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmPrivilegeSuspensionCorporateAction, com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmBookEntryTransferSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmDepositAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmDepositSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmPledgeSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmSegregationPeriodRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalInNomineeNameSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.mmWithdrawalInStreetNameSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.mmCoDepositoriesSuspensionRelatedEvent, com.tools20022.repository.entity.CorporateActionEvent.mmSuspensionPeriod);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SuspensionPeriod.mmPrivilegeSuspensionPeriod, com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal,
						com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForBookEntryTransfer, com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForDepositAtAgent,
						com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForDeposit, com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForPledge,
						com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForSegregation, com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalAtAgent,
						com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInNomineeName, com.tools20022.repository.entity.SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawalInStreetName,
						com.tools20022.repository.entity.SuspensionPeriod.mmCoDepositoriesSuspensionPeriod, com.tools20022.repository.entity.SuspensionPeriod.mmCorporateActionEvent);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SuspensionPeriod.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriod getPrivilegeSuspensionPeriod() {
		return privilegeSuspensionPeriod;
	}

	public SuspensionPeriod setPrivilegeSuspensionPeriod(com.tools20022.repository.entity.DateTimePeriod privilegeSuspensionPeriod) {
		this.privilegeSuspensionPeriod = Objects.requireNonNull(privilegeSuspensionPeriod);
		return this;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForWithdrawal() {
		return depositorySuspensionPeriodForWithdrawal;
	}

	public SuspensionPeriod setDepositorySuspensionPeriodForWithdrawal(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForWithdrawal) {
		this.depositorySuspensionPeriodForWithdrawal = Objects.requireNonNull(depositorySuspensionPeriodForWithdrawal);
		return this;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForBookEntryTransfer() {
		return depositorySuspensionPeriodForBookEntryTransfer;
	}

	public SuspensionPeriod setDepositorySuspensionPeriodForBookEntryTransfer(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForBookEntryTransfer) {
		this.depositorySuspensionPeriodForBookEntryTransfer = Objects.requireNonNull(depositorySuspensionPeriodForBookEntryTransfer);
		return this;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForDepositAtAgent() {
		return depositorySuspensionPeriodForDepositAtAgent;
	}

	public SuspensionPeriod setDepositorySuspensionPeriodForDepositAtAgent(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForDepositAtAgent) {
		this.depositorySuspensionPeriodForDepositAtAgent = Objects.requireNonNull(depositorySuspensionPeriodForDepositAtAgent);
		return this;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForDeposit() {
		return depositorySuspensionPeriodForDeposit;
	}

	public SuspensionPeriod setDepositorySuspensionPeriodForDeposit(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForDeposit) {
		this.depositorySuspensionPeriodForDeposit = Objects.requireNonNull(depositorySuspensionPeriodForDeposit);
		return this;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForPledge() {
		return depositorySuspensionPeriodForPledge;
	}

	public SuspensionPeriod setDepositorySuspensionPeriodForPledge(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForPledge) {
		this.depositorySuspensionPeriodForPledge = Objects.requireNonNull(depositorySuspensionPeriodForPledge);
		return this;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForSegregation() {
		return depositorySuspensionPeriodForSegregation;
	}

	public SuspensionPeriod setDepositorySuspensionPeriodForSegregation(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForSegregation) {
		this.depositorySuspensionPeriodForSegregation = Objects.requireNonNull(depositorySuspensionPeriodForSegregation);
		return this;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForWithdrawalAtAgent() {
		return depositorySuspensionPeriodForWithdrawalAtAgent;
	}

	public SuspensionPeriod setDepositorySuspensionPeriodForWithdrawalAtAgent(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForWithdrawalAtAgent) {
		this.depositorySuspensionPeriodForWithdrawalAtAgent = Objects.requireNonNull(depositorySuspensionPeriodForWithdrawalAtAgent);
		return this;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForWithdrawalInNomineeName() {
		return depositorySuspensionPeriodForWithdrawalInNomineeName;
	}

	public SuspensionPeriod setDepositorySuspensionPeriodForWithdrawalInNomineeName(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForWithdrawalInNomineeName) {
		this.depositorySuspensionPeriodForWithdrawalInNomineeName = Objects.requireNonNull(depositorySuspensionPeriodForWithdrawalInNomineeName);
		return this;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForWithdrawalInStreetName() {
		return depositorySuspensionPeriodForWithdrawalInStreetName;
	}

	public SuspensionPeriod setDepositorySuspensionPeriodForWithdrawalInStreetName(com.tools20022.repository.entity.DateTimePeriod depositorySuspensionPeriodForWithdrawalInStreetName) {
		this.depositorySuspensionPeriodForWithdrawalInStreetName = Objects.requireNonNull(depositorySuspensionPeriodForWithdrawalInStreetName);
		return this;
	}

	public DateTimePeriod getCoDepositoriesSuspensionPeriod() {
		return coDepositoriesSuspensionPeriod;
	}

	public SuspensionPeriod setCoDepositoriesSuspensionPeriod(com.tools20022.repository.entity.DateTimePeriod coDepositoriesSuspensionPeriod) {
		this.coDepositoriesSuspensionPeriod = Objects.requireNonNull(coDepositoriesSuspensionPeriod);
		return this;
	}

	public Optional<CorporateActionEvent> getCorporateActionEvent() {
		return corporateActionEvent == null ? Optional.empty() : Optional.of(corporateActionEvent);
	}

	public SuspensionPeriod setCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = corporateActionEvent;
		return this;
	}
}