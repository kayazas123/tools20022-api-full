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
import com.tools20022.repository.msg.*;

/**
 * Only a single occurrence of either SecondLevelTax/Amount or
 * SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only
 * one of these elements may be present. <br>
 * (MT 564 NVR C7).
 */
public class ConstraintSecondLevelTax2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails31> forRateDetails31 = new MMConstraint<RateDetails31>() {
		{
			validator = ConstraintSecondLevelTax2Rule::checkRateDetails31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax2Rule";
			definition = "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7).";
			owner_lazy = () -> RateDetails31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86
	 * CorporateActionRate86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate86> forCorporateActionRate86 = new MMConstraint<CorporateActionRate86>() {
		{
			validator = ConstraintSecondLevelTax2Rule::checkCorporateActionRate86;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax2Rule";
			definition = "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate86.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails32> forRateDetails32 = new MMConstraint<RateDetails32>() {
		{
			validator = ConstraintSecondLevelTax2Rule::checkRateDetails32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax2Rule";
			definition = "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 566 NVR C3).";
			owner_lazy = () -> RateDetails32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87
	 * CorporateActionRate87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate87> forCorporateActionRate87 = new MMConstraint<CorporateActionRate87>() {
		{
			validator = ConstraintSecondLevelTax2Rule::checkCorporateActionRate87;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax2Rule";
			definition = "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate87.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate88
	 * CorporateActionRate88}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate88> forCorporateActionRate88 = new MMConstraint<CorporateActionRate88>() {
		{
			validator = ConstraintSecondLevelTax2Rule::checkCorporateActionRate88;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax2Rule";
			definition = "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate88.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate92
	 * CorporateActionRate92}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate92> forCorporateActionRate92 = new MMConstraint<CorporateActionRate92>() {
		{
			validator = ConstraintSecondLevelTax2Rule::checkCorporateActionRate92;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax2Rule";
			definition = "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate92.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails33 RateDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 566 NVR C3)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails33> forRateDetails33 = new MMConstraint<RateDetails33>() {
		{
			validator = ConstraintSecondLevelTax2Rule::checkRateDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax2Rule";
			definition = "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 566 NVR C3).";
			owner_lazy = () -> RateDetails33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate94
	 * CorporateActionRate94}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate94> forCorporateActionRate94 = new MMConstraint<CorporateActionRate94>() {
		{
			validator = ConstraintSecondLevelTax2Rule::checkCorporateActionRate94;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax2Rule";
			definition = "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate94.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails34 RateDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<RateDetails34> forRateDetails34 = new MMConstraint<RateDetails34>() {
		{
			validator = ConstraintSecondLevelTax2Rule::checkRateDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax2Rule";
			definition = "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7).";
			owner_lazy = () -> RateDetails34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate97
	 * CorporateActionRate97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionRate97> forCorporateActionRate97 = new MMConstraint<CorporateActionRate97>() {
		{
			validator = ConstraintSecondLevelTax2Rule::checkCorporateActionRate97;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax2Rule";
			definition = "Only a single occurrence of either SecondLevelTax/Amount or SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present, only one of these elements may be present. \r\n(MT 564 NVR C7).";
			owner_lazy = () -> CorporateActionRate97.mmObject();
		}
	};

	/**
	 * Only a single occurrence of either SecondLevelTax/Amount or
	 * SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present,
	 * only one of these elements may be present. <br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails31(RateDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either SecondLevelTax/Amount or
	 * SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present,
	 * only one of these elements may be present. <br>
	 * (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate86(CorporateActionRate86 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either SecondLevelTax/Amount or
	 * SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present,
	 * only one of these elements may be present. <br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails32(RateDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either SecondLevelTax/Amount or
	 * SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present,
	 * only one of these elements may be present. <br>
	 * (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate87(CorporateActionRate87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either SecondLevelTax/Amount or
	 * SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present,
	 * only one of these elements may be present. <br>
	 * (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate88(CorporateActionRate88 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either SecondLevelTax/Amount or
	 * SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present,
	 * only one of these elements may be present. <br>
	 * (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate92(CorporateActionRate92 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either SecondLevelTax/Amount or
	 * SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present,
	 * only one of these elements may be present. <br>
	 * (MT 566 NVR C3).
	 */
	public static void checkRateDetails33(RateDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either SecondLevelTax/Amount or
	 * SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present,
	 * only one of these elements may be present. <br>
	 * (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate94(CorporateActionRate94 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either SecondLevelTax/Amount or
	 * SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present,
	 * only one of these elements may be present. <br>
	 * (MT 564 NVR C7).
	 */
	public static void checkRateDetails34(RateDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Only a single occurrence of either SecondLevelTax/Amount or
	 * SecondLevelTax/Rate or SecondLevelTax/NotSpecifiedRate may be present,
	 * only one of these elements may be present. <br>
	 * (MT 564 NVR C7).
	 */
	public static void checkCorporateActionRate97(CorporateActionRate97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}