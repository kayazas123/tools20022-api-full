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

package com.tools20022.repository.area;

import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support the settlement process for securities and report its
 * status and confirmation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getCode code} =
 * "sese"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessArea#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementAllegementRemovalAdviceV03
 * SecuritiesSettlementAllegementRemovalAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesStatusOrStatementQueryStatusAdviceV03
 * SecuritiesStatusOrStatementQueryStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionStatusQueryV03
 * SecuritiesTransactionStatusQueryV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV01
 * SecuritiesSettlementTransactionCounterpartyResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV04
 * SecuritiesTransactionCancellationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04
 * SecuritiesTransactionCancellationRequestStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV06
 * SecuritiesSettlementConditionModificationStatusAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestStatusAdviceV03
 * SecuritiesSettlementTransactionModificationRequestStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV06
 * SecuritiesFinancingStatusAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV06
 * SecuritiesSettlementConditionsModificationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV04
 * PortfolioTransferNotificationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV05
 * SecuritiesFinancingModificationInstructionV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07
 * PortfolioTransferInstructionV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV07
 * ReversalOfTransferOutConfirmationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV07
 * TransferOutCancellationRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05
 * AccountHoldingInformationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07
 * PortfolioTransferCancellationRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05
 * TransferInstructionStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07
 * TransferInConfirmationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07
 * TransferOutConfirmationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.RequestForTransferStatusReportV05
 * RequestForTransferStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV07
 * TransferInCancellationRequestV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07
 * PortfolioTransferConfirmationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05
 * TransferCancellationStatusReportV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07
 * TransferOutInstructionV07}</li>
 * <li>{@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07
 * TransferInInstructionV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04
 * AccountHoldingInformationRequestV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV07
 * ReversalOfTransferInConfirmationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV07
 * SecuritiesFinancingInstructionV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV06
 * SecuritiesSettlementTransactionAllegementNotificationV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV07
 * SecuritiesSettlementTransactionGenerationNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV05
 * SecuritiesSettlementTransactionModificationRequestV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07
 * SecuritiesSettlementTransactionConfirmationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV06
 * SecuritiesSettlementTransactionReversalAdviceV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV07
 * SecuritiesFinancingConfirmationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08
 * SecuritiesSettlementTransactionStatusAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07
 * SecuritiesSettlementTransactionInstructionV07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Securities Settlement - Previous version - master"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support the settlement process for securities and report its status and confirmation."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
public class SecuritiesSettlementPreviousVersion {

	final static private AtomicReference<MMBusinessArea> mmObject_lazy = new AtomicReference<>();

	final static public MMBusinessArea mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessArea() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Securities Settlement - Previous version - master";
				definition = "Messages that support the settlement process for securities and report its status and confirmation.";
				code = "sese";
				messageDefinition_lazy = () -> Arrays.asList(SecuritiesSettlementAllegementRemovalAdviceV03.mmObject(), SecuritiesStatusOrStatementQueryStatusAdviceV03.mmObject(), SecuritiesTransactionStatusQueryV03.mmObject(),
						SecuritiesSettlementTransactionCounterpartyResponseV01.mmObject(), SecuritiesTransactionCancellationRequestV04.mmObject(), SecuritiesTransactionCancellationRequestStatusAdviceV04.mmObject(),
						SecuritiesSettlementConditionModificationStatusAdviceV06.mmObject(), SecuritiesSettlementTransactionModificationRequestStatusAdviceV03.mmObject(), SecuritiesFinancingStatusAdviceV06.mmObject(),
						SecuritiesSettlementConditionsModificationRequestV06.mmObject(), PortfolioTransferNotificationV04.mmObject(), SecuritiesFinancingModificationInstructionV05.mmObject(), PortfolioTransferInstructionV07.mmObject(),
						ReversalOfTransferOutConfirmationV07.mmObject(), TransferOutCancellationRequestV07.mmObject(), AccountHoldingInformationV05.mmObject(), PortfolioTransferCancellationRequestV07.mmObject(),
						TransferInstructionStatusReportV05.mmObject(), TransferInConfirmationV07.mmObject(), TransferOutConfirmationV07.mmObject(), RequestForTransferStatusReportV05.mmObject(), TransferInCancellationRequestV07.mmObject(),
						PortfolioTransferConfirmationV07.mmObject(), TransferCancellationStatusReportV05.mmObject(), TransferOutInstructionV07.mmObject(), TransferInInstructionV07.mmObject(), AccountHoldingInformationRequestV04.mmObject(),
						ReversalOfTransferInConfirmationV07.mmObject(), SecuritiesFinancingInstructionV07.mmObject(), SecuritiesSettlementTransactionAllegementNotificationV06.mmObject(),
						SecuritiesSettlementTransactionGenerationNotificationV07.mmObject(), SecuritiesSettlementTransactionModificationRequestV05.mmObject(), SecuritiesSettlementTransactionConfirmationV07.mmObject(),
						SecuritiesSettlementTransactionReversalAdviceV06.mmObject(), SecuritiesFinancingConfirmationV07.mmObject(), SecuritiesSettlementTransactionStatusAdviceV08.mmObject(),
						SecuritiesSettlementTransactionInstructionV07.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}