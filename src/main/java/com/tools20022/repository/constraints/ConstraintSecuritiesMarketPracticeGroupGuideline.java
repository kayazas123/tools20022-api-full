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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.SecuritiesTransactionPendingReport002V08;
import com.tools20022.repository.area.seev.SecuritiesTransactionPostingReport002V07;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.area.sese.*;
import java.util.Arrays;

/**
 * The Securities Market Practice Group (SMPG) has published market practice
 * recommendations on the use of this message.<br>
 * These market practices are available on www.smpg.info.
 */
public class ConstraintSecuritiesMarketPracticeGroupGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.SecuritiesTransactionPendingReport002V08
	 * SecuritiesTransactionPendingReport002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReport002V08> forSecuritiesTransactionPendingReport002V08 = new MMConstraint<SecuritiesTransactionPendingReport002V08>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPendingReport002V08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPendingReport002V08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.SecuritiesTransactionPostingReport002V07
	 * SecuritiesTransactionPostingReport002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReport002V07> forSecuritiesTransactionPostingReport002V07 = new MMConstraint<SecuritiesTransactionPostingReport002V07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPostingReport002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPostingReport002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09
	 * SecuritiesBalanceCustodyReportV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesBalanceCustodyReportV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesBalanceCustodyReportV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV09> forSecuritiesBalanceCustodyReportV09 = new MMConstraint<SecuritiesBalanceCustodyReportV09>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceCustodyReportV09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesBalanceCustodyReportV08;
			owner_lazy = () -> SecuritiesBalanceCustodyReportV09.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09
	 * SecuritiesBalanceAccountingReportV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesBalanceAccountingReportV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesBalanceAccountingReportV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV09> forSecuritiesBalanceAccountingReportV09 = new MMConstraint<SecuritiesBalanceAccountingReportV09>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceAccountingReportV09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesBalanceAccountingReportV08;
			owner_lazy = () -> SecuritiesBalanceAccountingReportV09.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV09
	 * SecuritiesTransactionPendingReportV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPendingReportV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPendingReportV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV09> forSecuritiesTransactionPendingReportV09 = new MMConstraint<SecuritiesTransactionPendingReportV09>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPendingReportV09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPendingReportV08;
			owner_lazy = () -> SecuritiesTransactionPendingReportV09.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV08
	 * SecuritiesTransactionPostingReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPostingReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPostingReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV08> forSecuritiesTransactionPostingReportV08 = new MMConstraint<SecuritiesTransactionPostingReportV08>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPostingReportV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPostingReportV07;
			owner_lazy = () -> SecuritiesTransactionPostingReportV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReport002V09
	 * SecuritiesBalanceAccountingReport002V09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReport002V09> forSecuritiesBalanceAccountingReport002V09 = new MMConstraint<SecuritiesBalanceAccountingReport002V09>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceAccountingReport002V09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesBalanceAccountingReport002V09.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReport002V09
	 * SecuritiesBalanceCustodyReport002V09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReport002V09> forSecuritiesBalanceCustodyReport002V09 = new MMConstraint<SecuritiesBalanceCustodyReport002V09>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceCustodyReport002V09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesBalanceCustodyReport002V09.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV08
	 * SecuritiesBalanceCustodyReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesBalanceCustodyReportV09
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesBalanceCustodyReportV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesBalanceCustodyReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesBalanceCustodyReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV08> forSecuritiesBalanceCustodyReportV08 = new MMConstraint<SecuritiesBalanceCustodyReportV08>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceCustodyReportV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesBalanceCustodyReportV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesBalanceCustodyReportV07;
			owner_lazy = () -> SecuritiesBalanceCustodyReportV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08
	 * SecuritiesBalanceAccountingReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesBalanceAccountingReportV09
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesBalanceAccountingReportV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesBalanceAccountingReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesBalanceAccountingReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV08> forSecuritiesBalanceAccountingReportV08 = new MMConstraint<SecuritiesBalanceAccountingReportV08>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceAccountingReportV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesBalanceAccountingReportV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesBalanceAccountingReportV07;
			owner_lazy = () -> SecuritiesBalanceAccountingReportV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV08
	 * SecuritiesTransactionPendingReportV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPendingReportV09
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPendingReportV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPendingReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPendingReportV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV08> forSecuritiesTransactionPendingReportV08 = new MMConstraint<SecuritiesTransactionPendingReportV08>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPendingReportV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPendingReportV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPendingReportV07;
			owner_lazy = () -> SecuritiesTransactionPendingReportV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV07
	 * SecuritiesTransactionPostingReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPostingReportV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPostingReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPostingReportV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPostingReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV07> forSecuritiesTransactionPostingReportV07 = new MMConstraint<SecuritiesTransactionPostingReportV07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPostingReportV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPostingReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPostingReportV06;
			owner_lazy = () -> SecuritiesTransactionPostingReportV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReport002V06
	 * SecuritiesTransactionPostingReport002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReport002V06> forSecuritiesTransactionPostingReport002V06 = new MMConstraint<SecuritiesTransactionPostingReport002V06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPostingReport002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPostingReport002V06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReport002V07
	 * SecuritiesTransactionPendingReport002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReport002V07> forSecuritiesTransactionPendingReport002V07 = new MMConstraint<SecuritiesTransactionPendingReport002V07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPendingReport002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPendingReport002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05
	 * SecuritiesTransactionCancellationRequestStatusAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionCancellationRequestStatusAdviceV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionCancellationRequestStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV05> forSecuritiesTransactionCancellationRequestStatusAdviceV05 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV05>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionCancellationRequestStatusAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionCancellationRequestStatusAdviceV04;
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV07
	 * SecuritiesSettlementConditionsModificationRequestV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementConditionsModificationRequestV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementConditionsModificationRequestV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV07> forSecuritiesSettlementConditionsModificationRequestV07 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementConditionsModificationRequestV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementConditionsModificationRequestV06;
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07
	 * SecuritiesSettlementTransactionAllegementNotificationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionAllegementNotificationV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionAllegementNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07> forSecuritiesSettlementTransactionAllegementNotificationV07 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionAllegementNotificationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionAllegementNotificationV06;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08
	 * SecuritiesSettlementTransactionConfirmationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionConfirmationV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV08> forSecuritiesSettlementTransactionConfirmationV08 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV08>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionConfirmationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionConfirmationV07;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV05
	 * PortfolioTransferNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forPortfolioTransferNotificationV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forPortfolioTransferNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotificationV05> forPortfolioTransferNotificationV05 = new MMConstraint<PortfolioTransferNotificationV05>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkPortfolioTransferNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forPortfolioTransferNotificationV04;
			owner_lazy = () -> PortfolioTransferNotificationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08
	 * SecuritiesFinancingInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesFinancingInstructionV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesFinancingInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV08> forSecuritiesFinancingInstructionV08 = new MMConstraint<SecuritiesFinancingInstructionV08>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesFinancingInstructionV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesFinancingInstructionV07;
			owner_lazy = () -> SecuritiesFinancingInstructionV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09
	 * SecuritiesSettlementTransactionStatusAdviceV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionStatusAdviceV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionStatusAdviceV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV09> forSecuritiesSettlementTransactionStatusAdviceV09 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV09>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionStatusAdviceV09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionStatusAdviceV08;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV09.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08
	 * SecuritiesSettlementTransactionInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionInstructionV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV08> forSecuritiesSettlementTransactionInstructionV08 = new MMConstraint<SecuritiesSettlementTransactionInstructionV08>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionInstructionV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionInstructionV07;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05
	 * SecuritiesTransactionCancellationRequestStatusAdvice002V05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdvice002V05> forSecuritiesTransactionCancellationRequestStatusAdvice002V05 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdvice002V05>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionCancellationRequestStatusAdvice002V05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdvice002V05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequest002V07
	 * SecuritiesSettlementConditionsModificationRequest002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequest002V07> forSecuritiesSettlementConditionsModificationRequest002V07 = new MMConstraint<SecuritiesSettlementConditionsModificationRequest002V07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementConditionsModificationRequest002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequest002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04
	 * SecuritiesTransactionCancellationRequestStatusAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionCancellationRequestStatusAdviceV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionCancellationRequestStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionCancellationRequestStatusAdviceV03
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionCancellationRequestStatusAdviceV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV04> forSecuritiesTransactionCancellationRequestStatusAdviceV04 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV04>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionCancellationRequestStatusAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionCancellationRequestStatusAdviceV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionCancellationRequestStatusAdviceV03;
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV06
	 * SecuritiesSettlementConditionsModificationRequestV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementConditionsModificationRequestV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementConditionsModificationRequestV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementConditionsModificationRequestV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementConditionsModificationRequestV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV06> forSecuritiesSettlementConditionsModificationRequestV06 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementConditionsModificationRequestV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementConditionsModificationRequestV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementConditionsModificationRequestV05;
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV04
	 * PortfolioTransferNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forPortfolioTransferNotificationV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forPortfolioTransferNotificationV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forPortfolioTransferNotificationV03
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forPortfolioTransferNotificationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotificationV04> forPortfolioTransferNotificationV04 = new MMConstraint<PortfolioTransferNotificationV04>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkPortfolioTransferNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forPortfolioTransferNotificationV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forPortfolioTransferNotificationV03;
			owner_lazy = () -> PortfolioTransferNotificationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07
	 * SecuritiesFinancingInstructionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesFinancingInstructionV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesFinancingInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesFinancingInstructionV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesFinancingInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV07> forSecuritiesFinancingInstructionV07 = new MMConstraint<SecuritiesFinancingInstructionV07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesFinancingInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesFinancingInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesFinancingInstructionV06;
			owner_lazy = () -> SecuritiesFinancingInstructionV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV06
	 * SecuritiesSettlementTransactionAllegementNotificationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionAllegementNotificationV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionAllegementNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionAllegementNotificationV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionAllegementNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV06> forSecuritiesSettlementTransactionAllegementNotificationV06 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionAllegementNotificationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionAllegementNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionAllegementNotificationV05;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07
	 * SecuritiesSettlementTransactionConfirmationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionConfirmationV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionConfirmationV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV07> forSecuritiesSettlementTransactionConfirmationV07 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionConfirmationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionConfirmationV06;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08
	 * SecuritiesSettlementTransactionStatusAdviceV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionStatusAdviceV09
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionStatusAdviceV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionStatusAdviceV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionStatusAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV08> forSecuritiesSettlementTransactionStatusAdviceV08 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV08>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionStatusAdviceV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionStatusAdviceV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionStatusAdviceV07;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07
	 * SecuritiesSettlementTransactionInstructionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionInstructionV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionInstructionV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV07> forSecuritiesSettlementTransactionInstructionV07 = new MMConstraint<SecuritiesSettlementTransactionInstructionV07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionInstructionV06;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotification002V04
	 * PortfolioTransferNotification002V04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotification002V04> forPortfolioTransferNotification002V04 = new MMConstraint<PortfolioTransferNotification002V04>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkPortfolioTransferNotification002V04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> PortfolioTransferNotification002V04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequest002V06
	 * SecuritiesSettlementConditionsModificationRequest002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequest002V06> forSecuritiesSettlementConditionsModificationRequest002V06 = new MMConstraint<SecuritiesSettlementConditionsModificationRequest002V06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementConditionsModificationRequest002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequest002V06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V06
	 * SecuritiesSettlementTransactionAllegementNotification002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V06> forSecuritiesSettlementTransactionAllegementNotification002V06 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionAllegementNotification002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotification002V06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07
	 * SecuritiesSettlementTransactionInstruction002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V07> forSecuritiesSettlementTransactionInstruction002V07 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionInstruction002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V08
	 * SecuritiesSettlementTransactionStatusAdvice002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V08> forSecuritiesSettlementTransactionStatusAdvice002V08 = new MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V08>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionStatusAdvice002V08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdvice002V08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V07
	 * SecuritiesFinancingInstruction002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstruction002V07> forSecuritiesFinancingInstruction002V07 = new MMConstraint<SecuritiesFinancingInstruction002V07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesFinancingInstruction002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesFinancingInstruction002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07
	 * SecuritiesSettlementTransactionConfirmation002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmation002V07> forSecuritiesSettlementTransactionConfirmation002V07 = new MMConstraint<SecuritiesSettlementTransactionConfirmation002V07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionConfirmation002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmation002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03
	 * SecuritiesBalanceAccountingReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV03> forSecuritiesBalanceAccountingReportV03 = new MMConstraint<SecuritiesBalanceAccountingReportV03>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceAccountingReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04
	 * SecuritiesBalanceAccountingReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV04> forSecuritiesBalanceAccountingReportV04 = new MMConstraint<SecuritiesBalanceAccountingReportV04>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceAccountingReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05
	 * SecuritiesBalanceAccountingReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV05> forSecuritiesBalanceAccountingReportV05 = new MMConstraint<SecuritiesBalanceAccountingReportV05>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceAccountingReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesBalanceAccountingReportV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06
	 * SecuritiesBalanceAccountingReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesBalanceAccountingReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesBalanceAccountingReportV07}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV06> forSecuritiesBalanceAccountingReportV06 = new MMConstraint<SecuritiesBalanceAccountingReportV06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceAccountingReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesBalanceAccountingReportV07);
			owner_lazy = () -> SecuritiesBalanceAccountingReportV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03
	 * SecuritiesBalanceCustodyReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV03> forSecuritiesBalanceCustodyReportV03 = new MMConstraint<SecuritiesBalanceCustodyReportV03>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceCustodyReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV04
	 * SecuritiesBalanceCustodyReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV04> forSecuritiesBalanceCustodyReportV04 = new MMConstraint<SecuritiesBalanceCustodyReportV04>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceCustodyReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05
	 * SecuritiesBalanceCustodyReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV05> forSecuritiesBalanceCustodyReportV05 = new MMConstraint<SecuritiesBalanceCustodyReportV05>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceCustodyReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesBalanceCustodyReportV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV06
	 * SecuritiesBalanceCustodyReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesBalanceCustodyReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesBalanceCustodyReportV07}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV06> forSecuritiesBalanceCustodyReportV06 = new MMConstraint<SecuritiesBalanceCustodyReportV06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceCustodyReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesBalanceCustodyReportV07);
			owner_lazy = () -> SecuritiesBalanceCustodyReportV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV01
	 * SecuritiesTransactionPendingReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV01> forSecuritiesTransactionPendingReportV01 = new MMConstraint<SecuritiesTransactionPendingReportV01>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPendingReportV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPendingReportV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV02
	 * SecuritiesTransactionPendingReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV02> forSecuritiesTransactionPendingReportV02 = new MMConstraint<SecuritiesTransactionPendingReportV02>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPendingReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPendingReportV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV03
	 * SecuritiesTransactionPendingReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV03> forSecuritiesTransactionPendingReportV03 = new MMConstraint<SecuritiesTransactionPendingReportV03>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPendingReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPendingReportV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV04
	 * SecuritiesTransactionPendingReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPendingReportV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPendingReportV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV04> forSecuritiesTransactionPendingReportV04 = new MMConstraint<SecuritiesTransactionPendingReportV04>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPendingReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPendingReportV05);
			owner_lazy = () -> SecuritiesTransactionPendingReportV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV01
	 * SecuritiesTransactionPostingReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV01> forSecuritiesTransactionPostingReportV01 = new MMConstraint<SecuritiesTransactionPostingReportV01>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPostingReportV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPostingReportV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV02
	 * SecuritiesTransactionPostingReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV02> forSecuritiesTransactionPostingReportV02 = new MMConstraint<SecuritiesTransactionPostingReportV02>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPostingReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPostingReportV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV03
	 * SecuritiesTransactionPostingReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV03> forSecuritiesTransactionPostingReportV03 = new MMConstraint<SecuritiesTransactionPostingReportV03>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPostingReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionPostingReportV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV04
	 * SecuritiesTransactionPostingReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPostingReportV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPostingReportV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV04> forSecuritiesTransactionPostingReportV04 = new MMConstraint<SecuritiesTransactionPostingReportV04>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPostingReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPostingReportV05);
			owner_lazy = () -> SecuritiesTransactionPostingReportV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV05
	 * SecuritiesTransactionPendingReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPendingReportV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPendingReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPendingReportV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPendingReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV05> forSecuritiesTransactionPendingReportV05 = new MMConstraint<SecuritiesTransactionPendingReportV05>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPendingReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPendingReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPendingReportV04;
			owner_lazy = () -> SecuritiesTransactionPendingReportV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV05
	 * SecuritiesTransactionPostingReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPostingReportV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPostingReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPostingReportV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPostingReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV05> forSecuritiesTransactionPostingReportV05 = new MMConstraint<SecuritiesTransactionPostingReportV05>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPostingReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPostingReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPostingReportV04;
			owner_lazy = () -> SecuritiesTransactionPostingReportV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV07
	 * SecuritiesBalanceCustodyReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesBalanceCustodyReportV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesBalanceCustodyReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesBalanceCustodyReportV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesBalanceCustodyReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceCustodyReportV07> forSecuritiesBalanceCustodyReportV07 = new MMConstraint<SecuritiesBalanceCustodyReportV07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceCustodyReportV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesBalanceCustodyReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesBalanceCustodyReportV06;
			owner_lazy = () -> SecuritiesBalanceCustodyReportV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07
	 * SecuritiesBalanceAccountingReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesBalanceAccountingReportV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesBalanceAccountingReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesBalanceAccountingReportV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesBalanceAccountingReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesBalanceAccountingReportV07> forSecuritiesBalanceAccountingReportV07 = new MMConstraint<SecuritiesBalanceAccountingReportV07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesBalanceAccountingReportV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesBalanceAccountingReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesBalanceAccountingReportV06;
			owner_lazy = () -> SecuritiesBalanceAccountingReportV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV06
	 * SecuritiesTransactionPendingReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPendingReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPendingReportV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPendingReportV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPendingReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV06> forSecuritiesTransactionPendingReportV06 = new MMConstraint<SecuritiesTransactionPendingReportV06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPendingReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPendingReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPendingReportV05;
			owner_lazy = () -> SecuritiesTransactionPendingReportV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPostingReportV06
	 * SecuritiesTransactionPostingReportV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPostingReportV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPostingReportV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPostingReportV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPostingReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPostingReportV06> forSecuritiesTransactionPostingReportV06 = new MMConstraint<SecuritiesTransactionPostingReportV06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPostingReportV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPostingReportV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPostingReportV05;
			owner_lazy = () -> SecuritiesTransactionPostingReportV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.semt.SecuritiesTransactionPendingReportV07
	 * SecuritiesTransactionPendingReportV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPendingReportV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPendingReportV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionPendingReportV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionPendingReportV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionPendingReportV07> forSecuritiesTransactionPendingReportV07 = new MMConstraint<SecuritiesTransactionPendingReportV07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionPendingReportV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPendingReportV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionPendingReportV06;
			owner_lazy = () -> SecuritiesTransactionPendingReportV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01
	 * SecuritiesFinancingInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV01> forSecuritiesFinancingInstructionV01 = new MMConstraint<SecuritiesFinancingInstructionV01>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesFinancingInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesFinancingInstructionV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV02
	 * SecuritiesFinancingInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV02> forSecuritiesFinancingInstructionV02 = new MMConstraint<SecuritiesFinancingInstructionV02>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesFinancingInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesFinancingInstructionV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV03
	 * SecuritiesFinancingInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV03> forSecuritiesFinancingInstructionV03 = new MMConstraint<SecuritiesFinancingInstructionV03>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesFinancingInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesFinancingInstructionV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV01
	 * SecuritiesSettlementConditionsModificationRequestV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV01> forSecuritiesSettlementConditionsModificationRequestV01 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV01>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementConditionsModificationRequestV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV02
	 * SecuritiesSettlementConditionsModificationRequestV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV02> forSecuritiesSettlementConditionsModificationRequestV02 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV02>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementConditionsModificationRequestV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV03
	 * SecuritiesSettlementConditionsModificationRequestV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV03> forSecuritiesSettlementConditionsModificationRequestV03 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV03>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementConditionsModificationRequestV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV04
	 * SecuritiesSettlementConditionsModificationRequestV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementConditionsModificationRequestV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementConditionsModificationRequestV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV04> forSecuritiesSettlementConditionsModificationRequestV04 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV04>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementConditionsModificationRequestV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementConditionsModificationRequestV05);
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01
	 * SecuritiesSettlementTransactionConfirmationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV01> forSecuritiesSettlementTransactionConfirmationV01 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV01>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionConfirmationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV02
	 * SecuritiesSettlementTransactionConfirmationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV02> forSecuritiesSettlementTransactionConfirmationV02 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV02>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV03
	 * SecuritiesSettlementTransactionConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV03> forSecuritiesSettlementTransactionConfirmationV03 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV03>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV04
	 * SecuritiesSettlementTransactionConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionConfirmationV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV04> forSecuritiesSettlementTransactionConfirmationV04 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV04>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionConfirmationV05);
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01
	 * SecuritiesSettlementTransactionInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV01> forSecuritiesSettlementTransactionInstructionV01 = new MMConstraint<SecuritiesSettlementTransactionInstructionV01>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV02
	 * SecuritiesSettlementTransactionInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV02> forSecuritiesSettlementTransactionInstructionV02 = new MMConstraint<SecuritiesSettlementTransactionInstructionV02>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV03
	 * SecuritiesSettlementTransactionInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV03> forSecuritiesSettlementTransactionInstructionV03 = new MMConstraint<SecuritiesSettlementTransactionInstructionV03>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04
	 * SecuritiesSettlementTransactionInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV04> forSecuritiesSettlementTransactionInstructionV04 = new MMConstraint<SecuritiesSettlementTransactionInstructionV04>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionInstructionV05);
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV01
	 * SecuritiesSettlementTransactionStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV01> forSecuritiesSettlementTransactionStatusAdviceV01 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV01>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV02
	 * SecuritiesSettlementTransactionStatusAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV02> forSecuritiesSettlementTransactionStatusAdviceV02 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV02>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV03
	 * SecuritiesSettlementTransactionStatusAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV03> forSecuritiesSettlementTransactionStatusAdviceV03 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV03>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04
	 * SecuritiesSettlementTransactionStatusAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionStatusAdviceV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV04> forSecuritiesSettlementTransactionStatusAdviceV04 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV04>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionStatusAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionStatusAdviceV05);
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV04
	 * SecuritiesFinancingInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesFinancingInstructionV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesFinancingInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV04> forSecuritiesFinancingInstructionV04 = new MMConstraint<SecuritiesFinancingInstructionV04>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesFinancingInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesFinancingInstructionV05);
			owner_lazy = () -> SecuritiesFinancingInstructionV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV01
	 * PortfolioTransferNotificationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotificationV01> forPortfolioTransferNotificationV01 = new MMConstraint<PortfolioTransferNotificationV01>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkPortfolioTransferNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> PortfolioTransferNotificationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV02
	 * PortfolioTransferNotificationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotificationV02> forPortfolioTransferNotificationV02 = new MMConstraint<PortfolioTransferNotificationV02>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkPortfolioTransferNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> PortfolioTransferNotificationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01
	 * SecuritiesSettlementTransactionAllegementNotificationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01> forSecuritiesSettlementTransactionAllegementNotificationV01 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionAllegementNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV02
	 * SecuritiesSettlementTransactionAllegementNotificationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02> forSecuritiesSettlementTransactionAllegementNotificationV02 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionAllegementNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV01
	 * SecuritiesTransactionCancellationRequestStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV01> forSecuritiesTransactionCancellationRequestStatusAdviceV01 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV01>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionCancellationRequestStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV02
	 * SecuritiesTransactionCancellationRequestStatusAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV02> forSecuritiesTransactionCancellationRequestStatusAdviceV02 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV02>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionCancellationRequestStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV03
	 * SecuritiesSettlementTransactionAllegementNotificationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionAllegementNotificationV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03> forSecuritiesSettlementTransactionAllegementNotificationV03 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionAllegementNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionAllegementNotificationV04);
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV03
	 * SecuritiesTransactionCancellationRequestStatusAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesTransactionCancellationRequestStatusAdviceV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesTransactionCancellationRequestStatusAdviceV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV03> forSecuritiesTransactionCancellationRequestStatusAdviceV03 = new MMConstraint<SecuritiesTransactionCancellationRequestStatusAdviceV03>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesTransactionCancellationRequestStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesTransactionCancellationRequestStatusAdviceV04);
			owner_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV03
	 * PortfolioTransferNotificationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forPortfolioTransferNotificationV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forPortfolioTransferNotificationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PortfolioTransferNotificationV03> forPortfolioTransferNotificationV03 = new MMConstraint<PortfolioTransferNotificationV03>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkPortfolioTransferNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forPortfolioTransferNotificationV04);
			owner_lazy = () -> PortfolioTransferNotificationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV04
	 * SecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionAllegementNotificationV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionAllegementNotificationV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionAllegementNotificationV03
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionAllegementNotificationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04> forSecuritiesSettlementTransactionAllegementNotificationV04 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionAllegementNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionAllegementNotificationV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionAllegementNotificationV03;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV05
	 * SecuritiesFinancingInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesFinancingInstructionV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesFinancingInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesFinancingInstructionV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesFinancingInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV05> forSecuritiesFinancingInstructionV05 = new MMConstraint<SecuritiesFinancingInstructionV05>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesFinancingInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesFinancingInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesFinancingInstructionV04;
			owner_lazy = () -> SecuritiesFinancingInstructionV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05
	 * SecuritiesSettlementTransactionInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionInstructionV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionInstructionV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV05> forSecuritiesSettlementTransactionInstructionV05 = new MMConstraint<SecuritiesSettlementTransactionInstructionV05>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionInstructionV04;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV05
	 * SecuritiesSettlementTransactionConfirmationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionConfirmationV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionConfirmationV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV05> forSecuritiesSettlementTransactionConfirmationV05 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV05>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionConfirmationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV05
	 * SecuritiesSettlementConditionsModificationRequestV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementConditionsModificationRequestV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementConditionsModificationRequestV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementConditionsModificationRequestV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementConditionsModificationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementConditionsModificationRequestV05> forSecuritiesSettlementConditionsModificationRequestV05 = new MMConstraint<SecuritiesSettlementConditionsModificationRequestV05>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementConditionsModificationRequestV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementConditionsModificationRequestV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementConditionsModificationRequestV04;
			owner_lazy = () -> SecuritiesSettlementConditionsModificationRequestV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05
	 * SecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionStatusAdviceV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionStatusAdviceV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV05> forSecuritiesSettlementTransactionStatusAdviceV05 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV05>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionStatusAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionStatusAdviceV04;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06
	 * SecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionStatusAdviceV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionStatusAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionStatusAdviceV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV06> forSecuritiesSettlementTransactionStatusAdviceV06 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionStatusAdviceV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionStatusAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionStatusAdviceV05;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06
	 * SecuritiesSettlementTransactionInstructionV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionInstructionV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV06> forSecuritiesSettlementTransactionInstructionV06 = new MMConstraint<SecuritiesSettlementTransactionInstructionV06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionInstructionV05;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06
	 * SecuritiesSettlementTransactionConfirmationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionConfirmationV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionConfirmationV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV06> forSecuritiesSettlementTransactionConfirmationV06 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionConfirmationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionConfirmationV05;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV06
	 * SecuritiesFinancingInstructionV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesFinancingInstructionV07
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesFinancingInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesFinancingInstructionV05
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesFinancingInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstructionV06> forSecuritiesFinancingInstructionV06 = new MMConstraint<SecuritiesFinancingInstructionV06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesFinancingInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesFinancingInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesFinancingInstructionV05;
			owner_lazy = () -> SecuritiesFinancingInstructionV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07
	 * SecuritiesSettlementTransactionStatusAdviceV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionStatusAdviceV08
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionStatusAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionStatusAdviceV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionStatusAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdviceV07> forSecuritiesSettlementTransactionStatusAdviceV07 = new MMConstraint<SecuritiesSettlementTransactionStatusAdviceV07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionStatusAdviceV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionStatusAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionStatusAdviceV06;
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV05
	 * SecuritiesSettlementTransactionAllegementNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionAllegementNotificationV06
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionAllegementNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionAllegementNotificationV04
	 * ConstraintSecuritiesMarketPracticeGroupGuideline.
	 * forSecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV05> forSecuritiesSettlementTransactionAllegementNotificationV05 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV05>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionAllegementNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionAllegementNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionAllegementNotificationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V05
	 * SecuritiesSettlementTransactionAllegementNotification002V05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V05> forSecuritiesSettlementTransactionAllegementNotification002V05 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V05>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionAllegementNotification002V05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotification002V05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07
	 * SecuritiesSettlementTransactionStatusAdvice002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V07> forSecuritiesSettlementTransactionStatusAdvice002V07 = new MMConstraint<SecuritiesSettlementTransactionStatusAdvice002V07>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionStatusAdvice002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionStatusAdvice002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V06
	 * SecuritiesSettlementTransactionConfirmation002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmation002V06> forSecuritiesSettlementTransactionConfirmation002V06 = new MMConstraint<SecuritiesSettlementTransactionConfirmation002V06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionConfirmation002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmation002V06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06
	 * SecuritiesSettlementTransactionInstruction002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V06> forSecuritiesSettlementTransactionInstruction002V06 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesSettlementTransactionInstruction002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06
	 * SecuritiesFinancingInstruction002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMarketPracticeGroupGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesFinancingInstruction002V06> forSecuritiesFinancingInstruction002V06 = new MMConstraint<SecuritiesFinancingInstruction002V06>() {
		{
			validator = ConstraintSecuritiesMarketPracticeGroupGuideline::checkSecuritiesFinancingInstruction002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMarketPracticeGroupGuideline";
			definition = "The Securities Market Practice Group (SMPG) has published market practice recommendations on the use of this message.\r\nThese market practices are available on www.smpg.info.";
			owner_lazy = () -> SecuritiesFinancingInstruction002V06.mmObject();
		}
	};

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPendingReport002V08(SecuritiesTransactionPendingReport002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPostingReport002V07(SecuritiesTransactionPostingReport002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceCustodyReportV09(SecuritiesBalanceCustodyReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceAccountingReportV09(SecuritiesBalanceAccountingReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPendingReportV09(SecuritiesTransactionPendingReportV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPostingReportV08(SecuritiesTransactionPostingReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceAccountingReport002V09(SecuritiesBalanceAccountingReport002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceCustodyReport002V09(SecuritiesBalanceCustodyReport002V09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceCustodyReportV08(SecuritiesBalanceCustodyReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceAccountingReportV08(SecuritiesBalanceAccountingReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPendingReportV08(SecuritiesTransactionPendingReportV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPostingReportV07(SecuritiesTransactionPostingReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPostingReport002V06(SecuritiesTransactionPostingReport002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPendingReport002V07(SecuritiesTransactionPendingReport002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionCancellationRequestStatusAdviceV05(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementConditionsModificationRequestV07(SecuritiesSettlementConditionsModificationRequestV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV07(SecuritiesSettlementTransactionAllegementNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV08(SecuritiesSettlementTransactionConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkPortfolioTransferNotificationV05(PortfolioTransferNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesFinancingInstructionV08(SecuritiesFinancingInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV09(SecuritiesSettlementTransactionStatusAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV08(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionCancellationRequestStatusAdvice002V05(SecuritiesTransactionCancellationRequestStatusAdvice002V05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementConditionsModificationRequest002V07(SecuritiesSettlementConditionsModificationRequest002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionCancellationRequestStatusAdviceV04(SecuritiesTransactionCancellationRequestStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementConditionsModificationRequestV06(SecuritiesSettlementConditionsModificationRequestV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkPortfolioTransferNotificationV04(PortfolioTransferNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesFinancingInstructionV07(SecuritiesFinancingInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV06(SecuritiesSettlementTransactionAllegementNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV07(SecuritiesSettlementTransactionConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV08(SecuritiesSettlementTransactionStatusAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV07(SecuritiesSettlementTransactionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkPortfolioTransferNotification002V04(PortfolioTransferNotification002V04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementConditionsModificationRequest002V06(SecuritiesSettlementConditionsModificationRequest002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotification002V06(SecuritiesSettlementTransactionAllegementNotification002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V07(SecuritiesSettlementTransactionInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdvice002V08(SecuritiesSettlementTransactionStatusAdvice002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesFinancingInstruction002V07(SecuritiesFinancingInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmation002V07(SecuritiesSettlementTransactionConfirmation002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceAccountingReportV03(SecuritiesBalanceAccountingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceAccountingReportV04(SecuritiesBalanceAccountingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceAccountingReportV05(SecuritiesBalanceAccountingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceAccountingReportV06(SecuritiesBalanceAccountingReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceCustodyReportV03(SecuritiesBalanceCustodyReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceCustodyReportV04(SecuritiesBalanceCustodyReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceCustodyReportV05(SecuritiesBalanceCustodyReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceCustodyReportV06(SecuritiesBalanceCustodyReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPendingReportV01(SecuritiesTransactionPendingReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPendingReportV02(SecuritiesTransactionPendingReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPendingReportV03(SecuritiesTransactionPendingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPendingReportV04(SecuritiesTransactionPendingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPostingReportV01(SecuritiesTransactionPostingReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPostingReportV02(SecuritiesTransactionPostingReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPostingReportV03(SecuritiesTransactionPostingReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPostingReportV04(SecuritiesTransactionPostingReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPendingReportV05(SecuritiesTransactionPendingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPostingReportV05(SecuritiesTransactionPostingReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceCustodyReportV07(SecuritiesBalanceCustodyReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesBalanceAccountingReportV07(SecuritiesBalanceAccountingReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPendingReportV06(SecuritiesTransactionPendingReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPostingReportV06(SecuritiesTransactionPostingReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionPendingReportV07(SecuritiesTransactionPendingReportV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesFinancingInstructionV01(SecuritiesFinancingInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesFinancingInstructionV02(SecuritiesFinancingInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesFinancingInstructionV03(SecuritiesFinancingInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementConditionsModificationRequestV01(SecuritiesSettlementConditionsModificationRequestV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementConditionsModificationRequestV02(SecuritiesSettlementConditionsModificationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementConditionsModificationRequestV03(SecuritiesSettlementConditionsModificationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementConditionsModificationRequestV04(SecuritiesSettlementConditionsModificationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV01(SecuritiesSettlementTransactionConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV02(SecuritiesSettlementTransactionConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV03(SecuritiesSettlementTransactionConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV04(SecuritiesSettlementTransactionConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV01(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV02(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV03(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV04(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV01(SecuritiesSettlementTransactionStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV02(SecuritiesSettlementTransactionStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV03(SecuritiesSettlementTransactionStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV04(SecuritiesSettlementTransactionStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesFinancingInstructionV04(SecuritiesFinancingInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkPortfolioTransferNotificationV01(PortfolioTransferNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkPortfolioTransferNotificationV02(PortfolioTransferNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV01(SecuritiesSettlementTransactionAllegementNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV02(SecuritiesSettlementTransactionAllegementNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionCancellationRequestStatusAdviceV01(SecuritiesTransactionCancellationRequestStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionCancellationRequestStatusAdviceV02(SecuritiesTransactionCancellationRequestStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV03(SecuritiesSettlementTransactionAllegementNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesTransactionCancellationRequestStatusAdviceV03(SecuritiesTransactionCancellationRequestStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkPortfolioTransferNotificationV03(PortfolioTransferNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV04(SecuritiesSettlementTransactionAllegementNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesFinancingInstructionV05(SecuritiesFinancingInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV05(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV05(SecuritiesSettlementTransactionConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementConditionsModificationRequestV05(SecuritiesSettlementConditionsModificationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV05(SecuritiesSettlementTransactionStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV06(SecuritiesSettlementTransactionStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV06(SecuritiesSettlementTransactionInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV06(SecuritiesSettlementTransactionConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesFinancingInstructionV06(SecuritiesFinancingInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdviceV07(SecuritiesSettlementTransactionStatusAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV05(SecuritiesSettlementTransactionAllegementNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotification002V05(SecuritiesSettlementTransactionAllegementNotification002V05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionStatusAdvice002V07(SecuritiesSettlementTransactionStatusAdvice002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionConfirmation002V06(SecuritiesSettlementTransactionConfirmation002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V06(SecuritiesSettlementTransactionInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Securities Market Practice Group (SMPG) has published market practice
	 * recommendations on the use of this message.<br>
	 * These market practices are available on www.smpg.info.
	 */
	public static void checkSecuritiesFinancingInstruction002V06(SecuritiesFinancingInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}