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
import com.tools20022.repository.msg.InvestmentAccount21;
import com.tools20022.repository.msg.InvestmentAccount58;
import java.util.Arrays;

/**
 * OrderOriginatorEligibility may only be present if one or more of the parties
 * identified in OwnerIdentification is/are the originator of the order.
 */
public class ConstraintOrderOriginatorEligibility2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount21
	 * InvestmentAccount21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OrderOriginatorEligibility may only be present if one or more of the parties identified in OwnerIdentification is/are the originator of the order."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility2Rule#forInvestmentAccount58
	 * ConstraintOrderOriginatorEligibility2Rule.forInvestmentAccount58}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount21> forInvestmentAccount21 = new MMConstraint<InvestmentAccount21>() {
		{
			validator = ConstraintOrderOriginatorEligibility2Rule::checkInvestmentAccount21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility2Rule";
			definition = "OrderOriginatorEligibility may only be present if one or more of the parties identified in OwnerIdentification is/are the originator of the order.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility2Rule.forInvestmentAccount58);
			owner_lazy = () -> InvestmentAccount21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount58
	 * InvestmentAccount58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderOriginatorEligibility2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OrderOriginatorEligibility may only be present if one or more of the parties identified in OwnerIdentification is/are the originator of the order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility2Rule#forInvestmentAccount21
	 * ConstraintOrderOriginatorEligibility2Rule.forInvestmentAccount21}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount58> forInvestmentAccount58 = new MMConstraint<InvestmentAccount58>() {
		{
			validator = ConstraintOrderOriginatorEligibility2Rule::checkInvestmentAccount58;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginatorEligibility2Rule";
			definition = "OrderOriginatorEligibility may only be present if one or more of the parties identified in OwnerIdentification is/are the originator of the order.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility2Rule.forInvestmentAccount21;
			owner_lazy = () -> InvestmentAccount58.mmObject();
		}
	};

	/**
	 * OrderOriginatorEligibility may only be present if one or more of the
	 * parties identified in OwnerIdentification is/are the originator of the
	 * order.
	 */
	public static void checkInvestmentAccount21(InvestmentAccount21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OrderOriginatorEligibility may only be present if one or more of the
	 * parties identified in OwnerIdentification is/are the originator of the
	 * order.
	 */
	public static void checkInvestmentAccount58(InvestmentAccount58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}