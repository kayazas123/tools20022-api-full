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
import com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02;
import com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03;
import com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04;
import com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV05;
import java.util.Arrays;

/**
 * It is recommended to cancel an instruction message by using PreviousReference
 * only. It is recommended to avoid the repetition of optional building blocks,
 * unless otherwise specified by market practise rules and or legislation.
 */
public class ConstraintCancellation3Guideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03
	 * MeetingInstructionCancellationRequestV03}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation3Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended to cancel an instruction message by using PreviousReference only. It is recommended to avoid the repetition of optional building blocks, unless otherwise specified by market practise rules and or legislation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingInstructionCancellationRequestV03> for_seev_MeetingInstructionCancellationRequestV03 = new MMConstraint<MeetingInstructionCancellationRequestV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation3Guideline";
			definition = "It is recommended to cancel an instruction message by using PreviousReference only. It is recommended to avoid the repetition of optional building blocks, unless otherwise specified by market practise rules and or legislation.";
			owner_lazy = () -> MeetingInstructionCancellationRequestV03.mmObject();
		}

		@Override
		public void executeValidator(MeetingInstructionCancellationRequestV03 obj) throws Exception {
			check_seev_MeetingInstructionCancellationRequestV03(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV05
	 * MeetingInstructionCancellationRequestV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation3Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended to cancel an instruction message by using PreviousReference only. It is recommended to avoid the repetition of optional building blocks, unless otherwise specified by market practise rules and or legislation. If any information is present in the optional building blocks, it must be identical to the information being present into the instruction message being cancelled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellation3Guideline#for_seev_MeetingInstructionCancellationRequestV04
	 * ConstraintCancellation3Guideline.
	 * for_seev_MeetingInstructionCancellationRequestV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingInstructionCancellationRequestV05> for_seev_MeetingInstructionCancellationRequestV05 = new MMConstraint<MeetingInstructionCancellationRequestV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation3Guideline";
			definition = "It is recommended to cancel an instruction message by using PreviousReference only. It is recommended to avoid the repetition of optional building blocks, unless otherwise specified by market practise rules and or legislation. If any information is present in the optional building blocks, it must be identical to the information being present into the instruction message being cancelled.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCancellation3Guideline.for_seev_MeetingInstructionCancellationRequestV04;
			owner_lazy = () -> MeetingInstructionCancellationRequestV05.mmObject();
		}

		@Override
		public void executeValidator(MeetingInstructionCancellationRequestV05 obj) throws Exception {
			check_seev_MeetingInstructionCancellationRequestV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04
	 * MeetingInstructionCancellationRequestV04}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation3Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended to cancel an instruction message by using PreviousReference only. It is recommended to avoid the repetition of optional building blocks, unless otherwise specified by market practise rules and or legislation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellation3Guideline#for_seev_MeetingInstructionCancellationRequestV05
	 * ConstraintCancellation3Guideline.
	 * for_seev_MeetingInstructionCancellationRequestV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingInstructionCancellationRequestV04> for_seev_MeetingInstructionCancellationRequestV04 = new MMConstraint<MeetingInstructionCancellationRequestV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation3Guideline";
			definition = "It is recommended to cancel an instruction message by using PreviousReference only. It is recommended to avoid the repetition of optional building blocks, unless otherwise specified by market practise rules and or legislation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCancellation3Guideline.for_seev_MeetingInstructionCancellationRequestV05);
			owner_lazy = () -> MeetingInstructionCancellationRequestV04.mmObject();
		}

		@Override
		public void executeValidator(MeetingInstructionCancellationRequestV04 obj) throws Exception {
			check_seev_MeetingInstructionCancellationRequestV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02
	 * MeetingInstructionCancellationRequestV02}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation3Guideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is recommended to cancel an instruction message by using PreviousReference only. It is recommended to avoid the repetition of optional building blocks, unless otherwise specified by market practise rules and or legislation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<MeetingInstructionCancellationRequestV02> for_seev_MeetingInstructionCancellationRequestV02 = new MMConstraint<MeetingInstructionCancellationRequestV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation3Guideline";
			definition = "It is recommended to cancel an instruction message by using PreviousReference only. It is recommended to avoid the repetition of optional building blocks, unless otherwise specified by market practise rules and or legislation.";
			owner_lazy = () -> MeetingInstructionCancellationRequestV02.mmObject();
		}

		@Override
		public void executeValidator(MeetingInstructionCancellationRequestV02 obj) throws Exception {
			check_seev_MeetingInstructionCancellationRequestV02(obj);
		}
	};

	/**
	 * It is recommended to cancel an instruction message by using
	 * PreviousReference only. It is recommended to avoid the repetition of
	 * optional building blocks, unless otherwise specified by market practise
	 * rules and or legislation.
	 */
	public static void check_seev_MeetingInstructionCancellationRequestV03(MeetingInstructionCancellationRequestV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended to cancel an instruction message by using
	 * PreviousReference only. It is recommended to avoid the repetition of
	 * optional building blocks, unless otherwise specified by market practise
	 * rules and or legislation. If any information is present in the optional
	 * building blocks, it must be identical to the information being present
	 * into the instruction message being cancelled.
	 */
	public static void check_seev_MeetingInstructionCancellationRequestV05(MeetingInstructionCancellationRequestV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended to cancel an instruction message by using
	 * PreviousReference only. It is recommended to avoid the repetition of
	 * optional building blocks, unless otherwise specified by market practise
	 * rules and or legislation.
	 */
	public static void check_seev_MeetingInstructionCancellationRequestV04(MeetingInstructionCancellationRequestV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * It is recommended to cancel an instruction message by using
	 * PreviousReference only. It is recommended to avoid the repetition of
	 * optional building blocks, unless otherwise specified by market practise
	 * rules and or legislation.
	 */
	public static void check_seev_MeetingInstructionCancellationRequestV02(MeetingInstructionCancellationRequestV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}