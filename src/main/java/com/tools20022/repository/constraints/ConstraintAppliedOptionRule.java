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
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1'
 * (Yes) in one or more occurrences of CorporateActionOptionDetails, then
 * CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must
 * be CHOS (MandatoryWithOptions) and at least one of the
 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be
 * REAC (RequiredAction).
 */
public class ConstraintAppliedOptionRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08
	 * CorporateActionNotificationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionNotificationV07
	 * ConstraintAppliedOptionRule.forCorporateActionNotificationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV08> forCorporateActionNotificationV08 = new MMConstraint<CorporateActionNotificationV08>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionNotificationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionNotificationV07;
			owner_lazy = () -> CorporateActionNotificationV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV09
	 * CorporateActionMovementPreliminaryAdviceV09}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionMovementPreliminaryAdviceV08
	 * ConstraintAppliedOptionRule.
	 * forCorporateActionMovementPreliminaryAdviceV08}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV09> forCorporateActionMovementPreliminaryAdviceV09 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV09>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionMovementPreliminaryAdviceV09;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values must be REAC (RequiredAction).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionMovementPreliminaryAdviceV08;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV09.mmObject();
		}
	};
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
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionNotificationV08
	 * ConstraintAppliedOptionRule.forCorporateActionNotificationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionNotificationV06
	 * ConstraintAppliedOptionRule.forCorporateActionNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV07> forCorporateActionNotificationV07 = new MMConstraint<CorporateActionNotificationV07>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionNotificationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionNotificationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionNotificationV06;
			owner_lazy = () -> CorporateActionNotificationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV08
	 * CorporateActionMovementPreliminaryAdviceV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionMovementPreliminaryAdviceV09
	 * ConstraintAppliedOptionRule.
	 * forCorporateActionMovementPreliminaryAdviceV09}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionMovementPreliminaryAdviceV07
	 * ConstraintAppliedOptionRule.
	 * forCorporateActionMovementPreliminaryAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV08> forCorporateActionMovementPreliminaryAdviceV08 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV08>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionMovementPreliminaryAdviceV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionMovementPreliminaryAdviceV09);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionMovementPreliminaryAdviceV07;
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdvice002V08
	 * CorporateActionMovementPreliminaryAdvice002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdvice002V08> forCorporateActionMovementPreliminaryAdvice002V08 = new MMConstraint<CorporateActionMovementPreliminaryAdvice002V08>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionMovementPreliminaryAdvice002V08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction).";
			owner_lazy = () -> CorporateActionMovementPreliminaryAdvice002V08.mmObject();
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
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotification002V07> forCorporateActionNotification002V07 = new MMConstraint<CorporateActionNotification002V07>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionNotification002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction).";
			owner_lazy = () -> CorporateActionNotification002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV07
	 * CorporateActionMovementPreliminaryAdviceV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionMovementPreliminaryAdviceV08
	 * ConstraintAppliedOptionRule.
	 * forCorporateActionMovementPreliminaryAdviceV08}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementPreliminaryAdviceV07> forCorporateActionMovementPreliminaryAdviceV07 = new MMConstraint<CorporateActionMovementPreliminaryAdviceV07>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionMovementPreliminaryAdviceV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionMovementDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionMovementPreliminaryAdviceV08);
			owner_lazy = () -> CorporateActionMovementPreliminaryAdviceV07.mmObject();
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
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionNotificationV07
	 * ConstraintAppliedOptionRule.forCorporateActionNotificationV07}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNotificationV06> forCorporateActionNotificationV06 = new MMConstraint<CorporateActionNotificationV06>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionNotificationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or '1' (Yes) in one or more occurrences of CorporateActionOptionDetails, then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value must be CHOS (MandatoryWithOptions) and at least one of the CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must be REAC (RequiredAction).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionNotificationV07);
			owner_lazy = () -> CorporateActionNotificationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115
	 * CorporateActionOption115}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption129
	 * ConstraintAppliedOptionRule.forCorporateActionOption129}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption115> forCorporateActionOption115 = new MMConstraint<CorporateActionOption115>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionOption115;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption129);
			owner_lazy = () -> CorporateActionOption115.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114
	 * CorporateActionOption114}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption130
	 * ConstraintAppliedOptionRule.forCorporateActionOption130}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption114> forCorporateActionOption114 = new MMConstraint<CorporateActionOption114>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionOption114;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption130);
			owner_lazy = () -> CorporateActionOption114.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125
	 * CorporateActionOption125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption125> forCorporateActionOption125 = new MMConstraint<CorporateActionOption125>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionOption125;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			owner_lazy = () -> CorporateActionOption125.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127
	 * CorporateActionOption127}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption127> forCorporateActionOption127 = new MMConstraint<CorporateActionOption127>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionOption127;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			owner_lazy = () -> CorporateActionOption127.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption138
	 * ConstraintAppliedOptionRule.forCorporateActionOption138}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption114
	 * ConstraintAppliedOptionRule.forCorporateActionOption114}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption130> forCorporateActionOption130 = new MMConstraint<CorporateActionOption130>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionOption130;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption138);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption114;
			owner_lazy = () -> CorporateActionOption130.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129
	 * CorporateActionOption129}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption139
	 * ConstraintAppliedOptionRule.forCorporateActionOption139}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption115
	 * ConstraintAppliedOptionRule.forCorporateActionOption115}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption129> forCorporateActionOption129 = new MMConstraint<CorporateActionOption129>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionOption129;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption139);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption115;
			owner_lazy = () -> CorporateActionOption129.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135
	 * CorporateActionOption135}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption135> forCorporateActionOption135 = new MMConstraint<CorporateActionOption135>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionOption135;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			owner_lazy = () -> CorporateActionOption135.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133
	 * CorporateActionOption133}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption133> forCorporateActionOption133 = new MMConstraint<CorporateActionOption133>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionOption133;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			owner_lazy = () -> CorporateActionOption133.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption138
	 * CorporateActionOption138}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption130
	 * ConstraintAppliedOptionRule.forCorporateActionOption130}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption138> forCorporateActionOption138 = new MMConstraint<CorporateActionOption138>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionOption138;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption130;
			owner_lazy = () -> CorporateActionOption138.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption139
	 * CorporateActionOption139}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedOptionRule#forCorporateActionOption129
	 * ConstraintAppliedOptionRule.forCorporateActionOption129}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption139> forCorporateActionOption139 = new MMConstraint<CorporateActionOption139>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionOption139;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAppliedOptionRule.forCorporateActionOption129;
			owner_lazy = () -> CorporateActionOption139.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption148
	 * CorporateActionOption148}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption148> forCorporateActionOption148 = new MMConstraint<CorporateActionOption148>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionOption148;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			owner_lazy = () -> CorporateActionOption148.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption150
	 * CorporateActionOption150}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedOptionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption150> forCorporateActionOption150 = new MMConstraint<CorporateActionOption150>() {
		{
			validator = ConstraintAppliedOptionRule::checkCorporateActionOption150;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedOptionRule";
			definition = "If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator value must not be '1' or 'true' (Yes).";
			owner_lazy = () -> CorporateActionOption150.mmObject();
		}
	};

	/**
	 * If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or
	 * '1' (Yes) in one or more occurrences of CorporateActionOptionDetails,
	 * then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code
	 * value must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values
	 * must be REAC (RequiredAction).
	 */
	public static void checkCorporateActionNotificationV08(CorporateActionNotificationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true'
	 * or '1' (Yes) in one or more occurrences of
	 * CorporateActionMovementDetails, then
	 * CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value
	 * must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code values
	 * must be REAC (RequiredAction).
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV09(CorporateActionMovementPreliminaryAdviceV09 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or
	 * '1' (Yes) in one or more occurrences of CorporateActionOptionDetails,
	 * then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code
	 * value must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must
	 * be REAC (RequiredAction).
	 */
	public static void checkCorporateActionNotificationV07(CorporateActionNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true'
	 * or '1' (Yes) in one or more occurrences of
	 * CorporateActionMovementDetails, then
	 * CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value
	 * must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must
	 * be REAC (RequiredAction).
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV08(CorporateActionMovementPreliminaryAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true'
	 * or '1' (Yes) in one or more occurrences of
	 * CorporateActionMovementDetails, then
	 * CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value
	 * must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must
	 * be REAC (RequiredAction).
	 */
	public static void checkCorporateActionMovementPreliminaryAdvice002V08(CorporateActionMovementPreliminaryAdvice002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or
	 * '1' (Yes) in one or more occurrences of CorporateActionOptionDetails,
	 * then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code
	 * value must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must
	 * be REAC (RequiredAction).
	 */
	public static void checkCorporateActionNotification002V07(CorporateActionNotification002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionMovementDetails/AppliedOptionIndicator value is 'true'
	 * or '1' (Yes) in one or more occurrences of
	 * CorporateActionMovementDetails, then
	 * CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code value
	 * must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must
	 * be REAC (RequiredAction).
	 */
	public static void checkCorporateActionMovementPreliminaryAdviceV07(CorporateActionMovementPreliminaryAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionOptionDetails/AppliedOptionIndicator value is 'true' or
	 * '1' (Yes) in one or more occurrences of CorporateActionOptionDetails,
	 * then CorporateActionGeneralInformation/MandatoryVoluntaryEventType/Code
	 * value must be CHOS (MandatoryWithOptions) and at least one of the
	 * CorporateActionDetails/AdditionalBusinessProcessIndicator/Code value must
	 * be REAC (RequiredAction).
	 */
	public static void checkCorporateActionNotificationV06(CorporateActionNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption115(CorporateActionOption115 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption114(CorporateActionOption114 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption125(CorporateActionOption125 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption127(CorporateActionOption127 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption130(CorporateActionOption130 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption129(CorporateActionOption129 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption135(CorporateActionOption135 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption133(CorporateActionOption133 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption138(CorporateActionOption138 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption139(CorporateActionOption139 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption148(CorporateActionOption148 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DefaultProcessingOrStandingInstruction/DefaultOptionIndicator is
	 * present and its value is '1' or 'true' (Yes), then AppliedOptionIndicator
	 * value must not be '1' or 'true' (Yes).
	 */
	public static void checkCorporateActionOption150(CorporateActionOption150 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}