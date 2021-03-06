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

package com.tools20022.repository.entity;

import com.tools20022.repository.choice.ReferredDocumentAmount1Choice;
import com.tools20022.repository.msg.*;
import java.util.List;

class ListBuilderForTax_00 {

	@SuppressWarnings("unchecked")
	static <T> List<T> addElems(List<T> list) {
		list.add((T) Tax8.mmAmount);
		list.add((T) Tax17.mmAmount);
		list.add((T) Tax3.mmAmount);
		list.add((T) Tax15.mmAmount);
		list.add((T) OtherAmounts12.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts12.mmPaymentLevyTax);
		list.add((T) OtherAmounts12.mmLocalTax);
		list.add((T) OtherAmounts12.mmLocalTaxCountrySpecific);
		list.add((T) OtherAmounts12.mmStampDuty);
		list.add((T) OtherAmounts12.mmStockExchangeTax);
		list.add((T) OtherAmounts12.mmTransactionTax);
		list.add((T) OtherAmounts12.mmValueAddedTax);
		list.add((T) OtherAmounts12.mmWithholdingTax);
		list.add((T) OtherAmounts12.mmConsumptionTax);
		list.add((T) OtherAmounts14.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts14.mmPaymentLevyTax);
		list.add((T) OtherAmounts14.mmLocalTax);
		list.add((T) OtherAmounts14.mmLocalTaxCountrySpecific);
		list.add((T) OtherAmounts14.mmStampDuty);
		list.add((T) OtherAmounts14.mmStockExchangeTax);
		list.add((T) OtherAmounts14.mmTransactionTax);
		list.add((T) OtherAmounts14.mmValueAddedTax);
		list.add((T) OtherAmounts14.mmWithholdingTax);
		list.add((T) OtherAmounts14.mmConsumptionTax);
		list.add((T) OtherAmounts20.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts20.mmPaymentLevyTax);
		list.add((T) OtherAmounts20.mmLocalTax);
		list.add((T) OtherAmounts20.mmLocalTaxCountrySpecific);
		list.add((T) OtherAmounts20.mmStampDuty);
		list.add((T) OtherAmounts20.mmStockExchangeTax);
		list.add((T) OtherAmounts20.mmTransactionTax);
		list.add((T) OtherAmounts20.mmValueAddedTax);
		list.add((T) OtherAmounts20.mmWithholdingTax);
		list.add((T) OtherAmounts20.mmConsumptionTax);
		list.add((T) CorporateActionAmounts2.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts2.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts2.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts2.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts2.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts2.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts2.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts2.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts2.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts2.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts2.mmTaxArrearsAmount);
		list.add((T) CorporateActionAmounts2.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts2.mmEUTaxRetentionAmount);
		list.add((T) CorporateActionAmounts5.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts5.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts5.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts5.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts5.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts5.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts5.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts5.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts5.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts5.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts5.mmTaxArrearsAmount);
		list.add((T) CorporateActionAmounts5.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts5.mmEUTaxRetentionAmount);
		list.add((T) CorporateActionAmounts11.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts11.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts11.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts11.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts11.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts11.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts11.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts11.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts11.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts11.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts11.mmTaxArrearsAmount);
		list.add((T) CorporateActionAmounts11.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts11.mmEUTaxRetentionAmount);
		list.add((T) RateDetails2.mmWithholdingOfForeignTax);
		list.add((T) RateDetails2.mmWithholdingOfLocalTax);
		list.add((T) CorporateActionAmounts12.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts12.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts12.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts12.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts12.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts12.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts12.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts12.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts12.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts12.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts12.mmTaxArrearsAmount);
		list.add((T) CorporateActionAmounts12.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts12.mmEUTaxRetentionAmount);
		list.add((T) RateDetails4.mmWithholdingOfForeignTax);
		list.add((T) RateDetails4.mmWithholdingOfLocalTax);
		list.add((T) CorporateActionAmounts17.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts17.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts17.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts17.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts17.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts17.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts17.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts17.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts17.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts17.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts17.mmTaxArrearsAmount);
		list.add((T) CorporateActionAmounts17.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts17.mmEUTaxRetentionAmount);
		list.add((T) RateDetails7.mmWithholdingOfForeignTax);
		list.add((T) RateDetails7.mmWithholdingOfLocalTax);
		list.add((T) CorporateActionAmounts20.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts20.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts20.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts20.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts20.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts20.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts20.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts20.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts20.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts20.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts20.mmTaxArrearsAmount);
		list.add((T) CorporateActionAmounts20.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts20.mmEUTaxRetentionAmount);
		list.add((T) RateDetails9.mmWithholdingOfForeignTax);
		list.add((T) RateDetails9.mmWithholdingOfLocalTax);
		list.add((T) CorporateActionAmounts23.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts23.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts23.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts23.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts23.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts23.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts23.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts23.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts23.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts23.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts23.mmTaxArrearsAmount);
		list.add((T) CorporateActionAmounts23.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts23.mmEUTaxRetentionAmount);
		list.add((T) RateDetails11.mmWithholdingOfForeignTax);
		list.add((T) RateDetails11.mmWithholdingOfLocalTax);
		list.add((T) CorporateActionAmounts24.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts24.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts24.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts24.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts24.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts24.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts24.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts24.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts24.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts24.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts24.mmTaxArrearsAmount);
		list.add((T) CorporateActionAmounts24.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts24.mmEUTaxRetentionAmount);
		list.add((T) RateDetails12.mmWithholdingOfForeignTax);
		list.add((T) RateDetails12.mmWithholdingOfLocalTax);
		list.add((T) CorporateActionAmounts3.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts3.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts3.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts3.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts3.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts3.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts3.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts3.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts3.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts3.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts6.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts6.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts6.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts6.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts6.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts6.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts6.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts6.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts6.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts6.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts9.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts9.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts9.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts9.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts9.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts9.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts9.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts9.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts9.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts9.mmFiscalStampAmount);
		list.add((T) RateDetails3.mmWithholdingOfForeignTax);
		list.add((T) RateDetails3.mmWithholdingOfLocalTax);
		list.add((T) CorporateActionAmounts13.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts13.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts13.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts13.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts13.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts13.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts13.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts13.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts13.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts13.mmFiscalStampAmount);
		list.add((T) RateDetails5.mmWithholdingOfForeignTax);
		list.add((T) RateDetails5.mmWithholdingOfLocalTax);
		list.add((T) CorporateActionAmounts16.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts16.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts16.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts16.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts16.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts16.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts16.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts16.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts16.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts16.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts19.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts19.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts19.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts19.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts19.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts19.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts19.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts19.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts19.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts19.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts22.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts22.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts22.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts22.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts22.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts22.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts22.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts22.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts22.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts22.mmFiscalStampAmount);
		list.add((T) RateDetails10.mmWithholdingOfForeignTax);
		list.add((T) RateDetails10.mmWithholdingOfLocalTax);
		list.add((T) CorporateActionAmounts25.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts25.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts25.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts25.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts25.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts25.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts25.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts25.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts25.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts25.mmFiscalStampAmount);
		list.add((T) RateDetails13.mmWithholdingOfForeignTax);
		list.add((T) RateDetails13.mmWithholdingOfLocalTax);
		list.add((T) CorporateActionAmounts4.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts4.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts4.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts4.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts4.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts4.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts4.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts4.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts4.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts4.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts4.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts4.mmEUTaxRetentionAmount);
		list.add((T) CorporateActionAmounts7.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts7.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts7.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts7.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts7.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts7.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts7.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts7.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts7.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts7.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts7.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts7.mmEUTaxRetentionAmount);
		list.add((T) CorporateActionAmounts10.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts10.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts10.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts10.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts10.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts10.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts10.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts10.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts10.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts10.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts10.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts10.mmEUTaxRetentionAmount);
		list.add((T) CorporateActionAmounts14.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts14.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts14.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts14.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts14.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts14.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts14.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts14.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts14.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts14.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts14.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts14.mmEUTaxRetentionAmount);
		list.add((T) CorporateActionAmounts15.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts15.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts15.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts15.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts15.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts15.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts15.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts15.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts15.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts15.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts15.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts15.mmEUTaxRetentionAmount);
		list.add((T) CorporateActionAmounts18.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts18.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts18.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts18.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts18.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts18.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts18.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts18.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts18.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts18.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts18.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts18.mmEUTaxRetentionAmount);
		list.add((T) CorporateActionAmounts21.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts21.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts21.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts21.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts21.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts21.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts21.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts21.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts21.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts21.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts21.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts21.mmEUTaxRetentionAmount);
		list.add((T) CorporateActionAmounts26.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts26.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts26.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts26.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts26.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts26.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts26.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts26.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts26.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts26.mmFiscalStampAmount);
		list.add((T) CorporateActionAmounts26.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts26.mmEUTaxRetentionAmount);
		list.add((T) OtherAmounts4.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts4.mmPaymentLevyTax);
		list.add((T) OtherAmounts4.mmLocalTax);
		list.add((T) OtherAmounts4.mmStampDuty);
		list.add((T) OtherAmounts4.mmStockExchangeTax);
		list.add((T) OtherAmounts4.mmTransactionTax);
		list.add((T) OtherAmounts4.mmValueAddedTax);
		list.add((T) OtherAmounts4.mmWithholdingTax);
		list.add((T) OtherAmounts4.mmConsumptionTax);
		list.add((T) OtherAmounts5.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts5.mmPaymentLevyTax);
		list.add((T) OtherAmounts5.mmLocalTax);
		list.add((T) OtherAmounts5.mmStampDuty);
		list.add((T) OtherAmounts5.mmStockExchangeTax);
		list.add((T) OtherAmounts5.mmTransactionTax);
		list.add((T) OtherAmounts5.mmValueAddedTax);
		list.add((T) OtherAmounts5.mmWithholdingTax);
		list.add((T) OtherAmounts5.mmConsumptionTax);
		list.add((T) OtherAmounts17.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts17.mmPaymentLevyTax);
		list.add((T) OtherAmounts17.mmLocalTax);
		list.add((T) OtherAmounts17.mmStampDuty);
		list.add((T) OtherAmounts17.mmStockExchangeTax);
		list.add((T) OtherAmounts17.mmTransactionTax);
		list.add((T) OtherAmounts17.mmValueAddedTax);
		list.add((T) OtherAmounts17.mmWithholdingTax);
		list.add((T) OtherAmounts17.mmConsumptionTax);
		list.add((T) OtherAmounts23.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts23.mmPaymentLevyTax);
		list.add((T) OtherAmounts23.mmLocalTax);
		list.add((T) OtherAmounts23.mmStampDuty);
		list.add((T) OtherAmounts23.mmStockExchangeTax);
		list.add((T) OtherAmounts23.mmTransactionTax);
		list.add((T) OtherAmounts23.mmValueAddedTax);
		list.add((T) OtherAmounts23.mmWithholdingTax);
		list.add((T) OtherAmounts23.mmConsumptionTax);
		list.add((T) OtherAmounts3.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts3.mmPaymentLevyTax);
		list.add((T) OtherAmounts3.mmLocalTax);
		list.add((T) OtherAmounts3.mmStampDuty);
		list.add((T) OtherAmounts3.mmStockExchangeTax);
		list.add((T) OtherAmounts3.mmTransactionTax);
		list.add((T) OtherAmounts3.mmValueAddedTax);
		list.add((T) OtherAmounts3.mmWithholdingTax);
		list.add((T) OtherAmounts3.mmConsumptionTax);
		list.add((T) OtherAmounts7.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts7.mmPaymentLevyTax);
		list.add((T) OtherAmounts7.mmLocalTax);
		list.add((T) OtherAmounts7.mmStampDuty);
		list.add((T) OtherAmounts7.mmStockExchangeTax);
		list.add((T) OtherAmounts7.mmTransactionTax);
		list.add((T) OtherAmounts7.mmValueAddedTax);
		list.add((T) OtherAmounts7.mmWithholdingTax);
		list.add((T) OtherAmounts7.mmConsumptionTax);
		list.add((T) OtherAmounts9.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts9.mmPaymentLevyTax);
		list.add((T) OtherAmounts9.mmLocalTax);
		list.add((T) OtherAmounts9.mmLocalTaxCountrySpecific);
		list.add((T) OtherAmounts9.mmStampDuty);
		list.add((T) OtherAmounts9.mmStockExchangeTax);
		list.add((T) OtherAmounts9.mmTransactionTax);
		list.add((T) OtherAmounts9.mmValueAddedTax);
		list.add((T) OtherAmounts9.mmWithholdingTax);
		list.add((T) OtherAmounts9.mmConsumptionTax);
		list.add((T) OtherAmounts10.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts10.mmPaymentLevyTax);
		list.add((T) OtherAmounts10.mmLocalTax);
		list.add((T) OtherAmounts10.mmLocalTaxCountrySpecific);
		list.add((T) OtherAmounts10.mmStampDuty);
		list.add((T) OtherAmounts10.mmStockExchangeTax);
		list.add((T) OtherAmounts10.mmTransactionTax);
		list.add((T) OtherAmounts10.mmValueAddedTax);
		list.add((T) OtherAmounts10.mmWithholdingTax);
		list.add((T) OtherAmounts10.mmConsumptionTax);
		list.add((T) OtherAmounts18.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts18.mmPaymentLevyTax);
		list.add((T) OtherAmounts18.mmLocalTax);
		list.add((T) OtherAmounts18.mmLocalTaxCountrySpecific);
		list.add((T) OtherAmounts18.mmStampDuty);
		list.add((T) OtherAmounts18.mmStockExchangeTax);
		list.add((T) OtherAmounts18.mmTransactionTax);
		list.add((T) OtherAmounts18.mmValueAddedTax);
		list.add((T) OtherAmounts18.mmWithholdingTax);
		list.add((T) OtherAmounts18.mmConsumptionTax);
		list.add((T) OtherAmounts24.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts24.mmPaymentLevyTax);
		list.add((T) OtherAmounts24.mmLocalTax);
		list.add((T) OtherAmounts24.mmLocalTaxCountrySpecific);
		list.add((T) OtherAmounts24.mmStampDuty);
		list.add((T) OtherAmounts24.mmStockExchangeTax);
		list.add((T) OtherAmounts24.mmTransactionTax);
		list.add((T) OtherAmounts24.mmValueAddedTax);
		list.add((T) OtherAmounts24.mmWithholdingTax);
		list.add((T) OtherAmounts24.mmConsumptionTax);
		list.add((T) OtherAmounts13.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts13.mmPaymentLevyTax);
		list.add((T) OtherAmounts13.mmLocalTax);
		list.add((T) OtherAmounts13.mmLocalTaxCountrySpecific);
		list.add((T) OtherAmounts13.mmStampDuty);
		list.add((T) OtherAmounts13.mmStockExchangeTax);
		list.add((T) OtherAmounts13.mmTransactionTax);
		list.add((T) OtherAmounts13.mmValueAddedTax);
		list.add((T) OtherAmounts13.mmWithholdingTax);
		list.add((T) OtherAmounts13.mmConsumptionTax);
		list.add((T) OtherAmounts1.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts1.mmPaymentLevyTax);
		list.add((T) OtherAmounts1.mmLocalTax);
		list.add((T) OtherAmounts1.mmStampDuty);
		list.add((T) OtherAmounts1.mmStockExchangeTax);
		list.add((T) OtherAmounts1.mmTransactionTax);
		list.add((T) OtherAmounts1.mmValueAddedTax);
		list.add((T) OtherAmounts1.mmWithholdingTax);
		list.add((T) OtherAmounts1.mmConsumptionTax);
		list.add((T) OtherAmounts16.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts16.mmPaymentLevyTax);
		list.add((T) OtherAmounts16.mmLocalTax);
		list.add((T) OtherAmounts16.mmStampDuty);
		list.add((T) OtherAmounts16.mmStockExchangeTax);
		list.add((T) OtherAmounts16.mmTransactionTax);
		list.add((T) OtherAmounts16.mmValueAddedTax);
		list.add((T) OtherAmounts16.mmWithholdingTax);
		list.add((T) OtherAmounts16.mmConsumptionTax);
		list.add((T) OtherAmounts16.mmLocalTaxCountrySpecific1);
		list.add((T) OtherAmounts16.mmLocalTaxCountrySpecific2);
		list.add((T) OtherAmounts16.mmLocalTaxCountrySpecific3);
		list.add((T) OtherAmounts16.mmLocalTaxCountrySpecific4);
		list.add((T) TaxCharges1.mmAmount);
		list.add((T) ReferredDocumentAmount1Choice.mmTaxAmount);
		list.add((T) TaxType.mmAmount);
		list.add((T) TaxInformation2.mmTotalTaxAmount);
		list.add((T) TaxCharges2.mmAmount);
		list.add((T) TaxRecordDetails1.mmAmount);
		list.add((T) TaxAmount1.mmTotalAmount);
		list.add((T) TaxInformation3.mmTotalTaxAmount);
		list.add((T) TaxAmountAndType1.mmAmount);
		list.add((T) Tax6.mmAmount);
		list.add((T) Tax16.mmAmount);
		list.add((T) Tax7.mmAmount);
		list.add((T) TotalTaxes2.mmTotalAmountOfTaxes);
		list.add((T) Tax14.mmAmount);
		list.add((T) TotalTaxes3.mmTotalAmountOfTaxes);
		list.add((T) CorporateActionAmounts1.mmTaxFreeAmount);
		list.add((T) CorporateActionAmounts1.mmTaxDeferredAmount);
		list.add((T) CorporateActionAmounts1.mmGermanLocalTax1Amount);
		list.add((T) CorporateActionAmounts1.mmGermanLocalTax2Amount);
		list.add((T) CorporateActionAmounts1.mmGermanLocalTax3Amount);
		list.add((T) CorporateActionAmounts1.mmGermanLocalTax4Amount);
		list.add((T) CorporateActionAmounts1.mmStockExchangeTaxAmount);
		list.add((T) CorporateActionAmounts1.mmTransferTaxAmount);
		list.add((T) CorporateActionAmounts1.mmTransactionTaxAmount);
		list.add((T) CorporateActionAmounts1.mmValueAddedTaxAmount);
		list.add((T) CorporateActionAmounts1.mmEURetentionTaxAmount);
		list.add((T) CorporateActionAmounts1.mmLocalTaxAmount);
		list.add((T) CorporateActionAmounts1.mmPaymentLevyTaxAmount);
		list.add((T) CorporateActionAmounts1.mmCountryNationalFederalTaxAmount);
		list.add((T) CorporateActionAmounts1.mmStampDutyAmount);
		list.add((T) CorporateActionAmounts1.mmTaxReclaimAmount);
		list.add((T) CorporateActionAmounts1.mmWithholdingOfForeignTaxAmount);
		list.add((T) CorporateActionAmounts1.mmWithholdingOfLocalTaxAmount);
		list.add((T) CorporateActionAmounts1.mmAdditionalTaxAmount);
		list.add((T) CorporateActionAmounts1.mmWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts1.mmFiscalStampAmount);
		list.add((T) CashMovement1.mmTaxAmount);
		list.add((T) TaxVoucher1.mmWithholdingTaxAmount);
		list.add((T) TaxVoucher1.mmStampDutyAmount);
		list.add((T) OtherAmounts2.mmCountryNationalFederalTax);
		ListBuilderForTax_01.addElems(list);
		return list;
	}
}