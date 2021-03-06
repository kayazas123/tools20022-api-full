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

package com.tools20022.repository.msgset;

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Message set defined for the creation of the Cross-Border Transaction
 * Regulatory Reporting (Local name in Russia is “Currency Control”) ISO 20022
 * messages as requested through the RU-CMPG (Russian Corporate Market Practice
 * Group) Business Justification, approved on 22 July 2015.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationStatementRequestV01
 * ContractRegistrationStatementRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationAmendmentRequestV01
 * ContractRegistrationAmendmentRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationConfirmationV01
 * ContractRegistrationConfirmationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationRequestV01
 * ContractRegistrationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01
 * CurrencyControlStatusAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlSupportingDocumentDeliveryV01
 * CurrencyControlSupportingDocumentDeliveryV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationClosureRequestV01
 * ContractRegistrationClosureRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationStatementV01
 * ContractRegistrationStatementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.PaymentRegulatoryInformationNotificationV01
 * PaymentRegulatoryInformationNotificationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlRequestOrLetterV01
 * CurrencyControlRequestOrLetterV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Cross-Border Transactions Currency Control Reporting - ISO - Latest version"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Message set defined for the creation of the Cross-Border Transaction Regulatory Reporting (Local name in Russia is “Currency Control”) ISO 20022 messages as requested through the RU-CMPG (Russian Corporate Market Practice Group) Business Justification, approved on 22 July 2015."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class CrossBorderTransactionsCurrencyControlReportingISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Cross-Border Transactions Currency Control Reporting - ISO - Latest version";
				definition = "Message set defined for the creation of the Cross-Border Transaction Regulatory Reporting (Local name in Russia is “Currency Control”) ISO 20022 messages as requested through the RU-CMPG (Russian Corporate Market Practice Group) Business Justification, approved on 22 July 2015.";
				messageDefinition_lazy = () -> Arrays.asList(ContractRegistrationStatementRequestV01.mmObject(), ContractRegistrationAmendmentRequestV01.mmObject(), ContractRegistrationConfirmationV01.mmObject(),
						ContractRegistrationRequestV01.mmObject(), CurrencyControlStatusAdviceV01.mmObject(), CurrencyControlSupportingDocumentDeliveryV01.mmObject(), ContractRegistrationClosureRequestV01.mmObject(),
						ContractRegistrationStatementV01.mmObject(), PaymentRegulatoryInformationNotificationV01.mmObject(), CurrencyControlRequestOrLetterV01.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}