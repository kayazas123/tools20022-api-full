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
import com.tools20022.repository.area.seev.*;
import java.util.Arrays;

/**
 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1'
 * (Yes), then at least one occurrence of
 * AccountDetails/AccountsListAndBalanceDetails must be present and
 * TotalEligibleBalance must be present in all occurrences of
 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0'
 * (No) or is not present, then TotalEligibleBalance may or may not be present
 * in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance
 * but it will not necessarily be the final eligible balance quantity.
 */
public class ConstraintTotalEligibleBalanceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV07
	 * CorporateActionNotificationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#forCorporateActionNotificationV06
	 * ConstraintTotalEligibleBalanceRule.forCorporateActionNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV07> forCorporateActionNotificationV07 = new MMConstraint<CorporateActionNotificationV07>() {
		{
			validator = ConstraintTotalEligibleBalanceRule::checkCorporateActionNotificationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.forCorporateActionNotificationV06;
			owner_lazy = () -> CorporateActionNotificationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotification002V07
	 * CorporateActionNotification002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V07> forCorporateActionNotification002V07 = new MMConstraint<CorporateActionNotification002V07>() {
		{
			validator = ConstraintTotalEligibleBalanceRule::checkCorporateActionNotification002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			owner_lazy = () -> CorporateActionNotification002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV06
	 * CorporateActionNotificationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#forCorporateActionNotificationV07
	 * ConstraintTotalEligibleBalanceRule.forCorporateActionNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#forCorporateActionNotificationV05
	 * ConstraintTotalEligibleBalanceRule.forCorporateActionNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV06> forCorporateActionNotificationV06 = new MMConstraint<CorporateActionNotificationV06>() {
		{
			validator = ConstraintTotalEligibleBalanceRule::checkCorporateActionNotificationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or '1' (Yes), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or '0' (No) or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.forCorporateActionNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.forCorporateActionNotificationV05;
			owner_lazy = () -> CorporateActionNotificationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV01
	 * CorporateActionNotificationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV01> forCorporateActionNotificationV01 = new MMConstraint<CorporateActionNotificationV01>() {
		{
			validator = ConstraintTotalEligibleBalanceRule::checkCorporateActionNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			owner_lazy = () -> CorporateActionNotificationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV02
	 * CorporateActionNotificationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV02> forCorporateActionNotificationV02 = new MMConstraint<CorporateActionNotificationV02>() {
		{
			validator = ConstraintTotalEligibleBalanceRule::checkCorporateActionNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			owner_lazy = () -> CorporateActionNotificationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV03
	 * CorporateActionNotificationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV03> forCorporateActionNotificationV03 = new MMConstraint<CorporateActionNotificationV03>() {
		{
			validator = ConstraintTotalEligibleBalanceRule::checkCorporateActionNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			owner_lazy = () -> CorporateActionNotificationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV04
	 * CorporateActionNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#forCorporateActionNotificationV05
	 * ConstraintTotalEligibleBalanceRule.forCorporateActionNotificationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV04> forCorporateActionNotificationV04 = new MMConstraint<CorporateActionNotificationV04>() {
		{
			validator = ConstraintTotalEligibleBalanceRule::checkCorporateActionNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.forCorporateActionNotificationV05);
			owner_lazy = () -> CorporateActionNotificationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05
	 * CorporateActionNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalanceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#forCorporateActionNotificationV06
	 * ConstraintTotalEligibleBalanceRule.forCorporateActionNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule#forCorporateActionNotificationV04
	 * ConstraintTotalEligibleBalanceRule.forCorporateActionNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV05> forCorporateActionNotificationV05 = new MMConstraint<CorporateActionNotificationV05>() {
		{
			validator = ConstraintTotalEligibleBalanceRule::checkCorporateActionNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalanceRule";
			definition = "If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes' ('true' or '1'), then at least one occurrence of AccountDetails/AccountsListAndBalanceDetails must be present and TotalEligibleBalance must be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance.\r\nIf NotificationGeneralInformation/EligibleBalanceIndicator is 'No' ('false' or '0') or is not present, then TotalEligibleBalance may or may not be present in all occurrences of AccountDetails/AccountsListAndBalanceDetails/Balance but it will not necessarily be the final eligible balance quantity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.forCorporateActionNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalEligibleBalanceRule.forCorporateActionNotificationV04;
			owner_lazy = () -> CorporateActionNotificationV05.mmObject();
		}
	};

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or
	 * '1' (Yes), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or
	 * '0' (No) or is not present, then TotalEligibleBalance may or may not be
	 * present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void checkCorporateActionNotificationV07(CorporateActionNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or
	 * '1' (Yes), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or
	 * '0' (No) or is not present, then TotalEligibleBalance may or may not be
	 * present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void checkCorporateActionNotification002V07(CorporateActionNotification002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'true' or
	 * '1' (Yes), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'false' or
	 * '0' (No) or is not present, then TotalEligibleBalance may or may not be
	 * present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void checkCorporateActionNotificationV06(CorporateActionNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes'
	 * ('true' or '1'), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'No'
	 * ('false' or '0') or is not present, then TotalEligibleBalance may or may
	 * not be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void checkCorporateActionNotificationV01(CorporateActionNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes'
	 * ('true' or '1'), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'No'
	 * ('false' or '0') or is not present, then TotalEligibleBalance may or may
	 * not be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void checkCorporateActionNotificationV02(CorporateActionNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes'
	 * ('true' or '1'), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'No'
	 * ('false' or '0') or is not present, then TotalEligibleBalance may or may
	 * not be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void checkCorporateActionNotificationV03(CorporateActionNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes'
	 * ('true' or '1'), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'No'
	 * ('false' or '0') or is not present, then TotalEligibleBalance may or may
	 * not be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void checkCorporateActionNotificationV04(CorporateActionNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'Yes'
	 * ('true' or '1'), then at least one occurrence of
	 * AccountDetails/AccountsListAndBalanceDetails must be present and
	 * TotalEligibleBalance must be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance.<br>
	 * If NotificationGeneralInformation/EligibleBalanceIndicator is 'No'
	 * ('false' or '0') or is not present, then TotalEligibleBalance may or may
	 * not be present in all occurrences of
	 * AccountDetails/AccountsListAndBalanceDetails/Balance but it will not
	 * necessarily be the final eligible balance quantity.
	 */
	public static void checkCorporateActionNotificationV05(CorporateActionNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}