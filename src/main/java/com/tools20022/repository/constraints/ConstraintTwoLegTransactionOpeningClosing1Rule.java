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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * For settlement of two parts transactions (Securities Financing), the
 * opening/initiation and closing/return of the transaction is alleged by
 * sending the below combination of
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
 * SettlementParameters/SecuritiesTransactionType codes:<br>
 * <br>
 * Repo Opening<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
 * (DELI)<br>
 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
 * Repo Closing<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
 * <br>
 * Reverse Repo Opening<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
 * Reverse Repo Closing<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
 * (DELI) <br>
 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
 * <br>
 * TriParty Repo Opening<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
 * (DELI)<br>
 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
 * TriParty Repo Closing<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
 * <br>
 * TriParty Reverse Repo Opening<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)<br>
 * TriParty Reverse Repo Closing<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
 * (DELI) <br>
 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)<br>
 * <br>
 * Securities Lending Initiation<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
 * (DELI)<br>
 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
 * Securities Lending Return<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
 * <br>
 * Securities Borrowing Initiation<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)<br>
 * Securities Borrowing Return<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
 * (DELI) <br>
 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)
 */
public class ConstraintTwoLegTransactionOpeningClosing1Rule {

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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionAllegementNotificationV05
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV06> forSecuritiesSettlementTransactionAllegementNotificationV06 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV06>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionAllegementNotificationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionAllegementNotificationV05;
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionConfirmationV06
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV07> forSecuritiesSettlementTransactionConfirmationV07 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV07>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionConfirmationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionConfirmationV06;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV07.mmObject();
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionInstructionV06
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV07> forSecuritiesSettlementTransactionInstructionV07 = new MMConstraint<SecuritiesSettlementTransactionInstructionV07>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionInstructionV06;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV07.mmObject();
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V06> forSecuritiesSettlementTransactionAllegementNotification002V06 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V06>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionAllegementNotification002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V07> forSecuritiesSettlementTransactionInstruction002V07 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V07>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionInstruction002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V07.mmObject();
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmation002V07> forSecuritiesSettlementTransactionConfirmation002V07 = new MMConstraint<SecuritiesSettlementTransactionConfirmation002V07>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionConfirmation002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmation002V07.mmObject();
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionInstructionV07
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV06> forSecuritiesSettlementTransactionInstructionV06 = new MMConstraint<SecuritiesSettlementTransactionInstructionV06>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionInstructionV05;
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionConfirmationV07
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionConfirmationV05
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV06> forSecuritiesSettlementTransactionConfirmationV06 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV06>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionConfirmationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionConfirmationV05;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmObject();
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionAllegementNotificationV06
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionAllegementNotificationV04
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV05> forSecuritiesSettlementTransactionAllegementNotificationV05 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV05>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionAllegementNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionAllegementNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionAllegementNotificationV04;
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V05> forSecuritiesSettlementTransactionAllegementNotification002V05 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V05>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionAllegementNotification002V05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotification002V05.mmObject();
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmation002V06> forSecuritiesSettlementTransactionConfirmation002V06 = new MMConstraint<SecuritiesSettlementTransactionConfirmation002V06>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionConfirmation002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V06> forSecuritiesSettlementTransactionInstruction002V06 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V06>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionInstruction002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V06.mmObject();
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV01> forSecuritiesSettlementTransactionConfirmationV01 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV01>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionConfirmationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV02> forSecuritiesSettlementTransactionConfirmationV02 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV02>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV03> forSecuritiesSettlementTransactionConfirmationV03 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV03>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionConfirmationV05
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV04> forSecuritiesSettlementTransactionConfirmationV04 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV04>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionConfirmationV05);
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV01> forSecuritiesSettlementTransactionInstructionV01 = new MMConstraint<SecuritiesSettlementTransactionInstructionV01>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV02> forSecuritiesSettlementTransactionInstructionV02 = new MMConstraint<SecuritiesSettlementTransactionInstructionV02>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV03> forSecuritiesSettlementTransactionInstructionV03 = new MMConstraint<SecuritiesSettlementTransactionInstructionV03>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV04> forSecuritiesSettlementTransactionInstructionV04 = new MMConstraint<SecuritiesSettlementTransactionInstructionV04>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionInstructionV05);
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV04.mmObject();
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01> forSecuritiesSettlementTransactionAllegementNotificationV01 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionAllegementNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02> forSecuritiesSettlementTransactionAllegementNotificationV02 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionAllegementNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV02.mmObject();
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionAllegementNotificationV04
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03> forSecuritiesSettlementTransactionAllegementNotificationV03 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionAllegementNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionAllegementNotificationV04);
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV03.mmObject();
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionAllegementNotificationV05
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionAllegementNotificationV03
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04> forSecuritiesSettlementTransactionAllegementNotificationV04 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionAllegementNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionAllegementNotificationV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionAllegementNotificationV03;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV04.mmObject();
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionInstructionV06
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionInstructionV04
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV05> forSecuritiesSettlementTransactionInstructionV05 = new MMConstraint<SecuritiesSettlementTransactionInstructionV05>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionInstructionV04;
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
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionConfirmationV06
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesSettlementTransactionConfirmationV04
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesSettlementTransactionConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV05> forSecuritiesSettlementTransactionConfirmationV05 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV05>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesSettlementTransactionConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesSettlementTransactionConfirmationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5
	 * TransactionDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails5> forTransactionDetails5 = new MMConstraint<TransactionDetails5>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9
	 * TransactionDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails9> forTransactionDetails9 = new MMConstraint<TransactionDetails9>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22
	 * TransactionDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails22> forTransactionDetails22 = new MMConstraint<TransactionDetails22>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23
	 * TransactionDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails23> forTransactionDetails23 = new MMConstraint<TransactionDetails23>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36
	 * TransactionDetails36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails36> forTransactionDetails36 = new MMConstraint<TransactionDetails36>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47
	 * TransactionDetails47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails47> forTransactionDetails47 = new MMConstraint<TransactionDetails47>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails47.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53
	 * TransactionDetails53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails61
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails61}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails53> forTransactionDetails53 = new MMConstraint<TransactionDetails53>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails53;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails61);
			owner_lazy = () -> TransactionDetails53.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58
	 * TransactionDetails58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails58> forTransactionDetails58 = new MMConstraint<TransactionDetails58>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails58;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails58.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7
	 * TransactionDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails7> forTransactionDetails7 = new MMConstraint<TransactionDetails7>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16
	 * TransactionDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails16> forTransactionDetails16 = new MMConstraint<TransactionDetails16>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26
	 * TransactionDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails26> forTransactionDetails26 = new MMConstraint<TransactionDetails26>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27
	 * TransactionDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails27> forTransactionDetails27 = new MMConstraint<TransactionDetails27>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39
	 * TransactionDetails39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails39> forTransactionDetails39 = new MMConstraint<TransactionDetails39>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50
	 * TransactionDetails50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails50> forTransactionDetails50 = new MMConstraint<TransactionDetails50>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails50.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56
	 * TransactionDetails56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails62
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails62}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails56> forTransactionDetails56 = new MMConstraint<TransactionDetails56>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails62);
			owner_lazy = () -> TransactionDetails56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59
	 * TransactionDetails59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails59> forTransactionDetails59 = new MMConstraint<TransactionDetails59>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails59;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails59.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6
	 * TransactionDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails6> forTransactionDetails6 = new MMConstraint<TransactionDetails6>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18
	 * TransactionDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails18> forTransactionDetails18 = new MMConstraint<TransactionDetails18>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24
	 * TransactionDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails24> forTransactionDetails24 = new MMConstraint<TransactionDetails24>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34
	 * TransactionDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails34> forTransactionDetails34 = new MMConstraint<TransactionDetails34>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37
	 * TransactionDetails37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails37> forTransactionDetails37 = new MMConstraint<TransactionDetails37>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48
	 * TransactionDetails48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails48> forTransactionDetails48 = new MMConstraint<TransactionDetails48>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails48;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails48.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57
	 * TransactionDetails57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails63
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails63}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails57> forTransactionDetails57 = new MMConstraint<TransactionDetails57>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails63);
			owner_lazy = () -> TransactionDetails57.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60
	 * TransactionDetails60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails60> forTransactionDetails60 = new MMConstraint<TransactionDetails60>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails60;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails60.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4
	 * SecuritiesTradeDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails4> forSecuritiesTradeDetails4 = new MMConstraint<SecuritiesTradeDetails4>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesTradeDetails4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesTradeDetails4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17
	 * SecuritiesTradeDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails17> forSecuritiesTradeDetails17 = new MMConstraint<SecuritiesTradeDetails17>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesTradeDetails17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesTradeDetails17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10
	 * SecuritiesTradeDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails10> forSecuritiesTradeDetails10 = new MMConstraint<SecuritiesTradeDetails10>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesTradeDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesTradeDetails10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22
	 * SecuritiesTradeDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails22> forSecuritiesTradeDetails22 = new MMConstraint<SecuritiesTradeDetails22>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesTradeDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesTradeDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23
	 * SecuritiesTradeDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesTradeDetails35
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesTradeDetails35}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails23> forSecuritiesTradeDetails23 = new MMConstraint<SecuritiesTradeDetails23>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesTradeDetails23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesTradeDetails35);
			owner_lazy = () -> SecuritiesTradeDetails23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29
	 * SecuritiesTradeDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails29> forSecuritiesTradeDetails29 = new MMConstraint<SecuritiesTradeDetails29>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesTradeDetails29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesTradeDetails29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51
	 * TransactionDetails51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails51> forTransactionDetails51 = new MMConstraint<TransactionDetails51>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61
	 * TransactionDetails61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails70
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails70}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails53
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails53}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails61> forTransactionDetails61 = new MMConstraint<TransactionDetails61>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails61;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails70);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails53;
			owner_lazy = () -> TransactionDetails61.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62
	 * TransactionDetails62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails69
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails69}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails56
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails56}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails62> forTransactionDetails62 = new MMConstraint<TransactionDetails62>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails69);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails56;
			owner_lazy = () -> TransactionDetails62.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63
	 * TransactionDetails63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails78
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails78}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails57
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails57}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails63> forTransactionDetails63 = new MMConstraint<TransactionDetails63>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails78);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails57;
			owner_lazy = () -> TransactionDetails63.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35
	 * SecuritiesTradeDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesTradeDetails49
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesTradeDetails49}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesTradeDetails23
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesTradeDetails23}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails35> forSecuritiesTradeDetails35 = new MMConstraint<SecuritiesTradeDetails35>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesTradeDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesTradeDetails49);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesTradeDetails23;
			owner_lazy = () -> SecuritiesTradeDetails35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66
	 * TransactionDetails66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails66> forTransactionDetails66 = new MMConstraint<TransactionDetails66>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails66;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails66.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42
	 * SecuritiesTradeDetails42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails42> forSecuritiesTradeDetails42 = new MMConstraint<SecuritiesTradeDetails42>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesTradeDetails42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesTradeDetails42.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67
	 * TransactionDetails67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails67> forTransactionDetails67 = new MMConstraint<TransactionDetails67>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails67.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68
	 * TransactionDetails68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails68> forTransactionDetails68 = new MMConstraint<TransactionDetails68>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails68.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70
	 * TransactionDetails70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails79
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails79}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails61
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails61}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails70> forTransactionDetails70 = new MMConstraint<TransactionDetails70>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails79);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails61;
			owner_lazy = () -> TransactionDetails70.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69
	 * TransactionDetails69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails75
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails75}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails62
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails62}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails69> forTransactionDetails69 = new MMConstraint<TransactionDetails69>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails69;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails75);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails62;
			owner_lazy = () -> TransactionDetails69.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71
	 * TransactionDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails71> forTransactionDetails71 = new MMConstraint<TransactionDetails71>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails71;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails71.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72
	 * TransactionDetails72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails72> forTransactionDetails72 = new MMConstraint<TransactionDetails72>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails72;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails72.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49
	 * SecuritiesTradeDetails49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesTradeDetails68
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesTradeDetails68}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesTradeDetails35
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesTradeDetails35}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails49> forSecuritiesTradeDetails49 = new MMConstraint<SecuritiesTradeDetails49>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesTradeDetails49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesTradeDetails68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesTradeDetails35;
			owner_lazy = () -> SecuritiesTradeDetails49.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79
	 * TransactionDetails79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails97
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails97}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails70
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails70}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails79> forTransactionDetails79 = new MMConstraint<TransactionDetails79>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails79;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails97);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails70;
			owner_lazy = () -> TransactionDetails79.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75
	 * TransactionDetails75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails96
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails96}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails69
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails69}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails75> forTransactionDetails75 = new MMConstraint<TransactionDetails75>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails75;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails96);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails69;
			owner_lazy = () -> TransactionDetails75.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78
	 * TransactionDetails78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails95
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails95}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails63
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails63}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails78> forTransactionDetails78 = new MMConstraint<TransactionDetails78>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails78;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails95);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails63;
			owner_lazy = () -> TransactionDetails78.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61
	 * SecuritiesTradeDetails61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails61> forSecuritiesTradeDetails61 = new MMConstraint<SecuritiesTradeDetails61>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesTradeDetails61;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesTradeDetails61.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87
	 * TransactionDetails87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails87> forTransactionDetails87 = new MMConstraint<TransactionDetails87>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails87;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails87.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91
	 * TransactionDetails91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails91> forTransactionDetails91 = new MMConstraint<TransactionDetails91>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails91;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails91.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90
	 * TransactionDetails90}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails90> forTransactionDetails90 = new MMConstraint<TransactionDetails90>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails90;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails90.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68
	 * SecuritiesTradeDetails68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesTradeDetails49
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesTradeDetails49}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails68> forSecuritiesTradeDetails68 = new MMConstraint<SecuritiesTradeDetails68>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesTradeDetails68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesTradeDetails49;
			owner_lazy = () -> SecuritiesTradeDetails68.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97
	 * TransactionDetails97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails79
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails79}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails97> forTransactionDetails97 = new MMConstraint<TransactionDetails97>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails97;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails79;
			owner_lazy = () -> TransactionDetails97.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96
	 * TransactionDetails96}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails75
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails75}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails96> forTransactionDetails96 = new MMConstraint<TransactionDetails96>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails96;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails75;
			owner_lazy = () -> TransactionDetails96.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails78
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails78}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails95> forTransactionDetails95 = new MMConstraint<TransactionDetails95>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails95;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails78;
			owner_lazy = () -> TransactionDetails95.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69
	 * SecuritiesTradeDetails69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails69> forSecuritiesTradeDetails69 = new MMConstraint<SecuritiesTradeDetails69>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkSecuritiesTradeDetails69;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> SecuritiesTradeDetails69.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100
	 * TransactionDetails100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails100> forTransactionDetails100 = new MMConstraint<TransactionDetails100>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails100;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails100.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99
	 * TransactionDetails99}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails99> forTransactionDetails99 = new MMConstraint<TransactionDetails99>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails99;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails99.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98
	 * TransactionDetails98}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails98> forTransactionDetails98 = new MMConstraint<TransactionDetails98>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing1Rule::checkTransactionDetails98;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType : Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType : Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType : Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing (SECB)";
			owner_lazy = () -> TransactionDetails98.mmObject();
		}
	};

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV06(SecuritiesSettlementTransactionAllegementNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV07(SecuritiesSettlementTransactionConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV07(SecuritiesSettlementTransactionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotification002V06(SecuritiesSettlementTransactionAllegementNotification002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V07(SecuritiesSettlementTransactionInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionConfirmation002V07(SecuritiesSettlementTransactionConfirmation002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV06(SecuritiesSettlementTransactionInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV06(SecuritiesSettlementTransactionConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV05(SecuritiesSettlementTransactionAllegementNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotification002V05(SecuritiesSettlementTransactionAllegementNotification002V05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionConfirmation002V06(SecuritiesSettlementTransactionConfirmation002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V06(SecuritiesSettlementTransactionInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV01(SecuritiesSettlementTransactionConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV02(SecuritiesSettlementTransactionConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV03(SecuritiesSettlementTransactionConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV04(SecuritiesSettlementTransactionConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV01(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV02(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV03(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV04(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV01(SecuritiesSettlementTransactionAllegementNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV02(SecuritiesSettlementTransactionAllegementNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV03(SecuritiesSettlementTransactionAllegementNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV04(SecuritiesSettlementTransactionAllegementNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType : Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV05(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV05(SecuritiesSettlementTransactionConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails5(TransactionDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails9(TransactionDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails22(TransactionDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails23(TransactionDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails36(TransactionDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails47(TransactionDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails53(TransactionDetails53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails58(TransactionDetails58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails7(TransactionDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails16(TransactionDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails26(TransactionDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails27(TransactionDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails39(TransactionDetails39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails50(TransactionDetails50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails56(TransactionDetails56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails59(TransactionDetails59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails6(TransactionDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails18(TransactionDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails24(TransactionDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails34(TransactionDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails37(TransactionDetails37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails48(TransactionDetails48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails57(TransactionDetails57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails60(TransactionDetails60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesTradeDetails4(SecuritiesTradeDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesTradeDetails17(SecuritiesTradeDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesTradeDetails10(SecuritiesTradeDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesTradeDetails22(SecuritiesTradeDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesTradeDetails23(SecuritiesTradeDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesTradeDetails29(SecuritiesTradeDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails51(TransactionDetails51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails61(TransactionDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails62(TransactionDetails62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails63(TransactionDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesTradeDetails35(SecuritiesTradeDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails66(TransactionDetails66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesTradeDetails42(SecuritiesTradeDetails42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails67(TransactionDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails68(TransactionDetails68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails70(TransactionDetails70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails69(TransactionDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails71(TransactionDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails72(TransactionDetails72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesTradeDetails49(SecuritiesTradeDetails49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails79(TransactionDetails79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails75(TransactionDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails78(TransactionDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesTradeDetails61(SecuritiesTradeDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails87(TransactionDetails87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails91(TransactionDetails91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails90(TransactionDetails90 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesTradeDetails68(SecuritiesTradeDetails68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails97(TransactionDetails97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails96(TransactionDetails96 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails95(TransactionDetails95 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkSecuritiesTradeDetails69(SecuritiesTradeDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails100(TransactionDetails100 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails99(TransactionDetails99 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType : Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType : Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType : Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType : SecuritiesBorrowing
	 * (SECB)
	 */
	public static void checkTransactionDetails98(TransactionDetails98 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}