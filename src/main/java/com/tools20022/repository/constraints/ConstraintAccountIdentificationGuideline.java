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
import com.tools20022.repository.msg.InvestmentAccount24;
import com.tools20022.repository.msg.InvestmentAccount41;
import com.tools20022.repository.msg.InvestmentAccount55;
import com.tools20022.repository.msg.InvestmentAccount57;
import java.util.Arrays;

/**
 * It is recommended that AccountIdentification be used to identify an account.
 */
public class ConstraintAccountIdentificationGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24
	 * InvestmentAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that AccountIdentification be used to identify an account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationGuideline#forInvestmentAccount41
	 * ConstraintAccountIdentificationGuideline.forInvestmentAccount41}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount24> forInvestmentAccount24 = new MMConstraint<InvestmentAccount24>() {
		{
			validator = ConstraintAccountIdentificationGuideline::checkInvestmentAccount24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationGuideline";
			definition = "It is recommended that AccountIdentification be used to identify an account.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationGuideline.forInvestmentAccount41);
			owner_lazy = () -> InvestmentAccount24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41
	 * InvestmentAccount41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that AccountIdentification be used to identify an account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationGuideline#forInvestmentAccount55
	 * ConstraintAccountIdentificationGuideline.forInvestmentAccount55}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationGuideline#forInvestmentAccount24
	 * ConstraintAccountIdentificationGuideline.forInvestmentAccount24}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount41> forInvestmentAccount41 = new MMConstraint<InvestmentAccount41>() {
		{
			validator = ConstraintAccountIdentificationGuideline::checkInvestmentAccount41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationGuideline";
			definition = "It is recommended that AccountIdentification be used to identify an account.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationGuideline.forInvestmentAccount55);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationGuideline.forInvestmentAccount24;
			owner_lazy = () -> InvestmentAccount41.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55
	 * InvestmentAccount55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that AccountIdentification be used to identify an account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationGuideline#forInvestmentAccount57
	 * ConstraintAccountIdentificationGuideline.forInvestmentAccount57}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationGuideline#forInvestmentAccount41
	 * ConstraintAccountIdentificationGuideline.forInvestmentAccount41}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount55> forInvestmentAccount55 = new MMConstraint<InvestmentAccount55>() {
		{
			validator = ConstraintAccountIdentificationGuideline::checkInvestmentAccount55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationGuideline";
			definition = "It is recommended that AccountIdentification be used to identify an account.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationGuideline.forInvestmentAccount57);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationGuideline.forInvestmentAccount41;
			owner_lazy = () -> InvestmentAccount55.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57
	 * InvestmentAccount57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended that AccountIdentification be used to identify an account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationGuideline#forInvestmentAccount55
	 * ConstraintAccountIdentificationGuideline.forInvestmentAccount55}</li>
	 * </ul>
	 */
	public static final MMConstraint<InvestmentAccount57> forInvestmentAccount57 = new MMConstraint<InvestmentAccount57>() {
		{
			validator = ConstraintAccountIdentificationGuideline::checkInvestmentAccount57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationGuideline";
			definition = "It is recommended that AccountIdentification be used to identify an account.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAccountIdentificationGuideline.forInvestmentAccount55;
			owner_lazy = () -> InvestmentAccount57.mmObject();
		}
	};

	/**
	 * It is recommended that AccountIdentification be used to identify an
	 * account.
	 */
	public static void checkInvestmentAccount24(InvestmentAccount24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that AccountIdentification be used to identify an
	 * account.
	 */
	public static void checkInvestmentAccount41(InvestmentAccount41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that AccountIdentification be used to identify an
	 * account.
	 */
	public static void checkInvestmentAccount55(InvestmentAccount55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended that AccountIdentification be used to identify an
	 * account.
	 */
	public static void checkInvestmentAccount57(InvestmentAccount57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}