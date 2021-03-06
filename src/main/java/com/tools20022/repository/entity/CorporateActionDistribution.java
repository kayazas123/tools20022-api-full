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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.DistributionInstructionTypeCode;
import com.tools20022.repository.codeset.DistributionTypeCode;
import com.tools20022.repository.codeset.RoundingDirectionCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Distribution of the proceeds of a CA event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionDistribution"
 * src="doc-files/CorporateActionDistribution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingQuantity
 * CorporateActionDistribution.mmPostingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingDateTime
 * CorporateActionDistribution.mmPostingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmMovementDate
 * CorporateActionDistribution.mmMovementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingAmount
 * CorporateActionDistribution.mmPostingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmTaxVoucher
 * CorporateActionDistribution.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmRelatedServicing
 * CorporateActionDistribution.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmOrderType
 * CorporateActionDistribution.mmOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmMovementType
 * CorporateActionDistribution.mmMovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmHighPriorityIndicator
 * CorporateActionDistribution.mmHighPriorityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmRequestedExecutionDate
 * CorporateActionDistribution.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmFractionTreatment
 * CorporateActionDistribution.mmFractionTreatment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmCreditDebitIndicator
 * CorporateActionDistribution.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmOption
 * CorporateActionDistribution.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmNetAmount
 * CorporateActionDistribution.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmGrossAmount
 * CorporateActionDistribution.mmGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmFinancialTransaction
 * CorporateActionDistribution.mmFinancialTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmCorporateActionProceedsDeliveryInstruction
 * CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionDistribution
 * SecuritiesQuantity.mmCorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmDistribution
 * CorporateActionOption.mmDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxVoucher#mmDistribution
 * TaxVoucher.mmDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionDistribution
 * CorporateActionServicing.mmCorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmRelatedDistribution
 * CorporateActionProceedsDeliveryInstruction.mmRelatedDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmCorporateActionDistribution
 * FinancialTransaction.mmCorporateActionDistribution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat1Choice
 * DistributionTypeFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat2Choice
 * DistributionTypeFormat2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat3Choice
 * DistributionTypeFormat3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionType1FormatChoice
 * DistributionType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1
 * GlobalDistributionRequest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionMovement1
 * CorporateActionMovement1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat4Choice
 * DistributionTypeFormat4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat6Choice
 * DistributionTypeFormat6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat7Choice
 * DistributionTypeFormat7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat8Choice
 * DistributionTypeFormat8Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionDistribution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Distribution of the proceeds of a CA event."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class CorporateActionDistribution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesQuantity postingQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionDistribution
	 * SecuritiesQuantity.mmCorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#mmPostingQuantity
	 * SecuritiesOption3.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#mmPostingQuantity
	 * SecuritiesOption8.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#mmPostingQuantity
	 * SecuritiesOption18.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#mmPostingQuantity
	 * SecuritiesOption20.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#mmPostingQuantity
	 * SecuritiesOption26.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#mmPostingQuantity
	 * SecuritiesOption31.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#mmPostingQuantity
	 * SecuritiesOption35.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#mmPostingQuantity
	 * SecuritiesOption36.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption5#mmPostingQuantity
	 * SecuritiesOption5.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption11#mmPostingQuantity
	 * SecuritiesOption11.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption19#mmPostingQuantity
	 * SecuritiesOption19.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption21#mmPostingQuantity
	 * SecuritiesOption21.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption27#mmPostingQuantity
	 * SecuritiesOption27.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption32#mmPostingQuantity
	 * SecuritiesOption32.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2#mmPostingQuantity
	 * CorporateActionSecuritiesMovement2.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#mmConfirmedBalanceSecuritiesQuantity
	 * CorporateActionMovement1.mmConfirmedBalanceSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesProceeds1#mmPostingQuantity
	 * SecuritiesProceeds1.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#mmPostingQuantity
	 * SecuritiesOption42.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#mmPostingQuantity
	 * SecuritiesOption48.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption53#mmPostingQuantity
	 * SecuritiesOption53.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#mmPostingQuantity
	 * SecuritiesOption50.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#mmPostingQuantity
	 * SecuritiesOption55.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption58#mmPostingQuantity
	 * SecuritiesOption58.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmPostingQuantity
	 * SecuritiesOption60.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#mmPostingQuantity
	 * SecuritiesOption63.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65#mmPostingQuantity
	 * SecuritiesOption65.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption66#mmPostingQuantity
	 * SecuritiesOption66.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption67#mmPostingQuantity
	 * SecuritiesOption67.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption69#mmPostingQuantity
	 * SecuritiesOption69.mmPostingQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities that have been posted (credit or debit) to the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionDistribution, SecuritiesQuantity> mmPostingQuantity = new MMBusinessAssociationEnd<CorporateActionDistribution, SecuritiesQuantity>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesOption3.mmPostingQuantity, SecuritiesOption8.mmPostingQuantity, SecuritiesOption18.mmPostingQuantity, SecuritiesOption20.mmPostingQuantity, SecuritiesOption26.mmPostingQuantity,
					SecuritiesOption31.mmPostingQuantity, SecuritiesOption35.mmPostingQuantity, SecuritiesOption36.mmPostingQuantity, SecuritiesOption5.mmPostingQuantity, SecuritiesOption11.mmPostingQuantity,
					SecuritiesOption19.mmPostingQuantity, SecuritiesOption21.mmPostingQuantity, SecuritiesOption27.mmPostingQuantity, SecuritiesOption32.mmPostingQuantity, CorporateActionSecuritiesMovement2.mmPostingQuantity,
					CorporateActionMovement1.mmConfirmedBalanceSecuritiesQuantity, SecuritiesProceeds1.mmPostingQuantity, SecuritiesOption42.mmPostingQuantity, SecuritiesOption48.mmPostingQuantity, SecuritiesOption53.mmPostingQuantity,
					SecuritiesOption50.mmPostingQuantity, SecuritiesOption55.mmPostingQuantity, SecuritiesOption58.mmPostingQuantity, SecuritiesOption60.mmPostingQuantity, SecuritiesOption63.mmPostingQuantity,
					SecuritiesOption65.mmPostingQuantity, SecuritiesOption66.mmPostingQuantity, SecuritiesOption67.mmPostingQuantity, SecuritiesOption69.mmPostingQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PostingQuantity";
			definition = "Quantity of securities that have been posted (credit or debit) to the account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesQuantity.mmCorporateActionDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}

		@Override
		public SecuritiesQuantity getValue(CorporateActionDistribution obj) {
			return obj.getPostingQuantity();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, SecuritiesQuantity value) {
			obj.setPostingQuantity(value);
		}
	};
	protected ISODateTime postingDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1#mmPostingDate
	 * SecurityDate1.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate7#mmPostingDate
	 * CorporateActionDate7.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate3#mmPostingDate
	 * SecurityDate3.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate6#mmPostingDate
	 * SecurityDate6.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate7#mmPostingDate
	 * SecurityDate7.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#mmPostingDate
	 * CorporateActionDate24.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption5#mmPostingDate
	 * SecuritiesOption5.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption5#mmOriginalPostingDate
	 * SecuritiesOption5.mmOriginalPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption5#mmPostingDate
	 * CashOption5.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption5#mmOriginalPostingDate
	 * CashOption5.mmOriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption11#mmPostingDate
	 * SecuritiesOption11.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption11#mmOriginalPostingDate
	 * SecuritiesOption11.mmOriginalPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption7#mmPostingDate
	 * CashOption7.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption7#mmOriginalPostingDate
	 * CashOption7.mmOriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption19#mmPostingDate
	 * SecuritiesOption19.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption19#mmOriginalPostingDate
	 * SecuritiesOption19.mmOriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption21#mmPostingDate
	 * SecuritiesOption21.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption21#mmOriginalPostingDate
	 * SecuritiesOption21.mmOriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption27#mmPostingDate
	 * SecuritiesOption27.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption27#mmOriginalPostingDate
	 * SecuritiesOption27.mmOriginalPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption19#mmPostingDate
	 * CashOption19.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption19#mmOriginalPostingDate
	 * CashOption19.mmOriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption32#mmPostingDate
	 * SecuritiesOption32.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption32#mmOriginalPostingDate
	 * SecuritiesOption32.mmOriginalPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption23#mmPostingDate
	 * CashOption23.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption23#mmOriginalPostingDate
	 * CashOption23.mmOriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#mmPostingDate
	 * FinancialInstrumentAttributes3.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#mmPostingDate
	 * FinancialInstrumentAttributes12.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#mmPostingDate
	 * FinancialInstrumentAttributes17.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#mmPostingDate
	 * FinancialInstrumentAttributes25.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#mmPostingDate
	 * FinancialInstrumentAttributes46.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#mmPostingDate
	 * FinancialInstrumentAttributes47.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement2#mmPostingDateTime
	 * CorporateActionSecuritiesMovement2.mmPostingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement1#mmPostingDateTime
	 * CorporateActionSecuritiesMovement1.mmPostingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSecuritiesMovement1#mmPostingQuantity
	 * CorporateActionSecuritiesMovement1.mmPostingQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmPostingDate
	 * FinancialInstrumentAttributes68.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption53#mmPostingDate
	 * SecuritiesOption53.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption53#mmOriginalPostingDate
	 * SecuritiesOption53.mmOriginalPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption45#mmPostingDate
	 * CashOption45.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption45#mmOriginalPostingDate
	 * CashOption45.mmOriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate11#mmPostingDate
	 * SecurityDate11.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#mmPostingDate
	 * FinancialInstrumentAttributes73.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption58#mmPostingDate
	 * SecuritiesOption58.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption58#mmOriginalPostingDate
	 * SecuritiesOption58.mmOriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate13#mmPostingDate
	 * SecurityDate13.mmPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption48#mmPostingDate
	 * CashOption48.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption48#mmOriginalPostingDate
	 * CashOption48.mmOriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate15#mmPostingDate
	 * SecurityDate15.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmPostingDate
	 * FinancialInstrumentAttributes93.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption66#mmPostingDate
	 * SecuritiesOption66.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption66#mmOriginalPostingDate
	 * SecuritiesOption66.mmOriginalPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption59#mmPostingDate
	 * CashOption59.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption59#mmOriginalPostingDate
	 * CashOption59.mmOriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate65#mmPostingDate
	 * CorporateActionDate65.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate17#mmPostingDate
	 * SecurityDate17.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption69#mmPostingDate
	 * SecuritiesOption69.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption69#mmOriginalPostingDate
	 * SecuritiesOption69.mmOriginalPostingDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption62#mmPostingDate
	 * CashOption62.mmPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption62#mmOriginalPostingDate
	 * CashOption62.mmOriginalPostingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes94#mmPostingDate
	 * FinancialInstrumentAttributes94.mmPostingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the posting (credit or debit) to the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDistribution, ISODateTime> mmPostingDateTime = new MMBusinessAttribute<CorporateActionDistribution, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityDate1.mmPostingDate, CorporateActionDate7.mmPostingDate, SecurityDate3.mmPostingDate, SecurityDate6.mmPostingDate, SecurityDate7.mmPostingDate, CorporateActionDate24.mmPostingDate,
					SecuritiesOption5.mmPostingDate, SecuritiesOption5.mmOriginalPostingDate, CashOption5.mmPostingDate, CashOption5.mmOriginalPostingDate, SecuritiesOption11.mmPostingDate, SecuritiesOption11.mmOriginalPostingDate,
					CashOption7.mmPostingDate, CashOption7.mmOriginalPostingDate, SecuritiesOption19.mmPostingDate, SecuritiesOption19.mmOriginalPostingDate, SecuritiesOption21.mmPostingDate, SecuritiesOption21.mmOriginalPostingDate,
					SecuritiesOption27.mmPostingDate, SecuritiesOption27.mmOriginalPostingDate, CashOption19.mmPostingDate, CashOption19.mmOriginalPostingDate, SecuritiesOption32.mmPostingDate, SecuritiesOption32.mmOriginalPostingDate,
					CashOption23.mmPostingDate, CashOption23.mmOriginalPostingDate, FinancialInstrumentAttributes3.mmPostingDate, FinancialInstrumentAttributes12.mmPostingDate, FinancialInstrumentAttributes17.mmPostingDate,
					FinancialInstrumentAttributes25.mmPostingDate, FinancialInstrumentAttributes46.mmPostingDate, FinancialInstrumentAttributes47.mmPostingDate, CorporateActionSecuritiesMovement2.mmPostingDateTime,
					CorporateActionSecuritiesMovement1.mmPostingDateTime, CorporateActionSecuritiesMovement1.mmPostingQuantity, FinancialInstrumentAttributes68.mmPostingDate, SecuritiesOption53.mmPostingDate,
					SecuritiesOption53.mmOriginalPostingDate, CashOption45.mmPostingDate, CashOption45.mmOriginalPostingDate, SecurityDate11.mmPostingDate, FinancialInstrumentAttributes73.mmPostingDate, SecuritiesOption58.mmPostingDate,
					SecuritiesOption58.mmOriginalPostingDate, SecurityDate13.mmPostingDate, CashOption48.mmPostingDate, CashOption48.mmOriginalPostingDate, SecurityDate15.mmPostingDate, FinancialInstrumentAttributes93.mmPostingDate,
					SecuritiesOption66.mmPostingDate, SecuritiesOption66.mmOriginalPostingDate, CashOption59.mmPostingDate, CashOption59.mmOriginalPostingDate, CorporateActionDate65.mmPostingDate, SecurityDate17.mmPostingDate,
					SecuritiesOption69.mmPostingDate, SecuritiesOption69.mmOriginalPostingDate, CashOption62.mmPostingDate, CashOption62.mmOriginalPostingDate, FinancialInstrumentAttributes94.mmPostingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PostingDateTime";
			definition = "Date of the posting (credit or debit) to the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionDistribution obj) {
			return obj.getPostingDateTime();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, ISODateTime value) {
			obj.setPostingDateTime(value);
		}
	};
	protected ISODate movementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1#mmPaymentDate
	 * SecurityDate1.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate7#mmPaymentDate
	 * CorporateActionDate7.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate3#mmPaymentDate
	 * SecurityDate3.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate6#mmPaymentDate
	 * SecurityDate6.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate7#mmPaymentDate
	 * SecurityDate7.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#mmPaymentDate
	 * CorporateActionDate24.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate2#mmPaymentDate
	 * SecurityDate2.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate9#mmPaymentDate
	 * CorporateActionDate9.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate4#mmPaymentDate
	 * SecurityDate4.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate12#mmPaymentDate
	 * CorporateActionDate12.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate5#mmPaymentDate
	 * SecurityDate5.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate17#mmPaymentDate
	 * CorporateActionDate17.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate8#mmPaymentDate
	 * SecurityDate8.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate20#mmPaymentDate
	 * CorporateActionDate20.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate23#mmPaymentDate
	 * CorporateActionDate23.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate26#mmPaymentDate
	 * CorporateActionDate26.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate9#mmPaymentDate
	 * SecurityDate9.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate10#mmPaymentDate
	 * SecurityDate10.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmPaymentDate
	 * CorporateActionDate1.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmPaymentDate
	 * CorporateActionDate13.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmPaymentDate
	 * CorporateActionDate14.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmPaymentDate
	 * CorporateActionDate21.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmPaymentDate
	 * CorporateActionDate22.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmPaymentDate
	 * CorporateActionDate25.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmPaymentDate
	 * CorporateActionDate27.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmPaymentDate
	 * CorporateActionDate28.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmPaymentDate
	 * CorporateActionDate4.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmPaymentDate
	 * CorporateActionDate3.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate5#mmPaymentDate
	 * CorporateActionDate5.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmPaymentDate
	 * EntitlementAdvice1.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmPaymentDate
	 * GlobalDistributionRequest1.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12#mmPaymentDate
	 * SecurityDate12.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate47#mmPaymentDate
	 * CorporateActionDate47.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate11#mmPaymentDate
	 * SecurityDate11.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmPaymentDate
	 * CorporateActionDate44.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate56#mmPaymentDate
	 * CorporateActionDate56.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmPaymentDate
	 * CorporateActionDate58.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate14#mmPaymentDate
	 * SecurityDate14.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate13#mmPaymentDate
	 * SecurityDate13.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate15#mmPaymentDate
	 * SecurityDate15.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmPaymentDate
	 * CorporateActionDate61.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate62#mmPaymentDate
	 * CorporateActionDate62.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate16#mmPaymentDate
	 * SecurityDate16.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate65#mmPaymentDate
	 * CorporateActionDate65.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate17#mmPaymentDate
	 * SecurityDate17.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate18#mmPaymentDate
	 * SecurityDate18.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate72#mmPaymentDate
	 * CorporateActionDate72.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmPaymentDate
	 * CorporateActionDate74.mmPaymentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the movement is due to take place (cash and/or securities)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDistribution, ISODate> mmMovementDate = new MMBusinessAttribute<CorporateActionDistribution, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityDate1.mmPaymentDate, CorporateActionDate7.mmPaymentDate, SecurityDate3.mmPaymentDate, SecurityDate6.mmPaymentDate, SecurityDate7.mmPaymentDate, CorporateActionDate24.mmPaymentDate,
					SecurityDate2.mmPaymentDate, CorporateActionDate9.mmPaymentDate, SecurityDate4.mmPaymentDate, CorporateActionDate12.mmPaymentDate, SecurityDate5.mmPaymentDate, CorporateActionDate17.mmPaymentDate,
					SecurityDate8.mmPaymentDate, CorporateActionDate20.mmPaymentDate, CorporateActionDate23.mmPaymentDate, CorporateActionDate26.mmPaymentDate, SecurityDate9.mmPaymentDate, SecurityDate10.mmPaymentDate,
					CorporateActionDate1.mmPaymentDate, CorporateActionDate13.mmPaymentDate, CorporateActionDate14.mmPaymentDate, CorporateActionDate21.mmPaymentDate, CorporateActionDate22.mmPaymentDate,
					CorporateActionDate25.mmPaymentDate, CorporateActionDate27.mmPaymentDate, CorporateActionDate28.mmPaymentDate, CorporateActionDate4.mmPaymentDate, CorporateActionDate3.mmPaymentDate, CorporateActionDate5.mmPaymentDate,
					EntitlementAdvice1.mmPaymentDate, GlobalDistributionRequest1.mmPaymentDate, SecurityDate12.mmPaymentDate, CorporateActionDate47.mmPaymentDate, SecurityDate11.mmPaymentDate, CorporateActionDate44.mmPaymentDate,
					CorporateActionDate56.mmPaymentDate, CorporateActionDate58.mmPaymentDate, SecurityDate14.mmPaymentDate, SecurityDate13.mmPaymentDate, SecurityDate15.mmPaymentDate, CorporateActionDate61.mmPaymentDate,
					CorporateActionDate62.mmPaymentDate, SecurityDate16.mmPaymentDate, CorporateActionDate65.mmPaymentDate, SecurityDate17.mmPaymentDate, SecurityDate18.mmPaymentDate, CorporateActionDate72.mmPaymentDate,
					CorporateActionDate74.mmPaymentDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MovementDate";
			definition = "Date/time at which the movement is due to take place (cash and/or securities).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CorporateActionDistribution obj) {
			return obj.getMovementDate();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, ISODate value) {
			obj.setMovementDate(value);
		}
	};
	protected CurrencyAndAmount postingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmPostingAmount
	 * CorporateActionAmounts2.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmPostingAmount
	 * CorporateActionAmounts5.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmPostingAmount
	 * CorporateActionAmounts11.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmPostingAmount
	 * CorporateActionAmounts12.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmPostingAmount
	 * CorporateActionAmounts17.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmPostingAmount
	 * CorporateActionAmounts20.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmPostingAmount
	 * CorporateActionAmounts23.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmPostingAmount
	 * CorporateActionAmounts24.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption5#mmPostingAmount
	 * CashOption5.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption7#mmPostingAmount
	 * CashOption7.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption19#mmPostingAmount
	 * CashOption19.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption23#mmPostingAmount
	 * CashOption23.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#mmAnnouncedPostingAmount
	 * AmountAndCurrencyExchange2.mmAnnouncedPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmAnnouncedPostingAmount
	 * AmountAndCurrencyExchange3.mmAnnouncedPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmPostingAmount
	 * CorporateActionAmounts29.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmPostingAmount
	 * CorporateActionAmounts35.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmPostingAmount
	 * CorporateActionAmounts37.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption45#mmPostingAmount
	 * CashOption45.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmPostingAmount
	 * CorporateActionAmounts39.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption48#mmPostingAmount
	 * CashOption48.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmPostingAmount
	 * CorporateActionAmounts44.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption59#mmPostingAmount
	 * CashOption59.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmPostingAmount
	 * CorporateActionAmounts45.mmPostingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption62#mmPostingAmount
	 * CashOption62.mmPostingAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money that is to be/was posted to the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDistribution, CurrencyAndAmount> mmPostingAmount = new MMBusinessAttribute<CorporateActionDistribution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmPostingAmount, CorporateActionAmounts5.mmPostingAmount, CorporateActionAmounts11.mmPostingAmount, CorporateActionAmounts12.mmPostingAmount,
					CorporateActionAmounts17.mmPostingAmount, CorporateActionAmounts20.mmPostingAmount, CorporateActionAmounts23.mmPostingAmount, CorporateActionAmounts24.mmPostingAmount, CashOption5.mmPostingAmount,
					CashOption7.mmPostingAmount, CashOption19.mmPostingAmount, CashOption23.mmPostingAmount, AmountAndCurrencyExchange2.mmAnnouncedPostingAmount, AmountAndCurrencyExchange3.mmAnnouncedPostingAmount,
					CorporateActionAmounts29.mmPostingAmount, CorporateActionAmounts35.mmPostingAmount, CorporateActionAmounts37.mmPostingAmount, CashOption45.mmPostingAmount, CorporateActionAmounts39.mmPostingAmount,
					CashOption48.mmPostingAmount, CorporateActionAmounts44.mmPostingAmount, CashOption59.mmPostingAmount, CorporateActionAmounts45.mmPostingAmount, CashOption62.mmPostingAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PostingAmount";
			definition = "Amount of money that is to be/was posted to the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CorporateActionDistribution obj) {
			return obj.getPostingAmount();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, CurrencyAndAmount value) {
			obj.setPostingAmount(value);
		}
	};
	protected TaxVoucher taxVoucher;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxVoucher
	 * TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmDistribution
	 * TaxVoucher.mmDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption2#mmTaxVoucherDetails
	 * CashOption2.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption9#mmTaxVoucherDetails
	 * CashOption9.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmAdditionalTax
	 * RateDetails2.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption12#mmTaxVoucherDetails
	 * CashOption12.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmAdditionalTax
	 * RateDetails4.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption13#mmTaxVoucherDetails
	 * CashOption13.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmAdditionalTax
	 * RateDetails7.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption18#mmTaxVoucherDetails
	 * CashOption18.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmAdditionalTax
	 * RateDetails9.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption22#mmTaxVoucherDetails
	 * CashOption22.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmAdditionalTax
	 * RateDetails11.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption26#mmTaxVoucherDetails
	 * CashOption26.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmAdditionalTax
	 * RateDetails12.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption27#mmTaxVoucherDetails
	 * CashOption27.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmAdditionalTax
	 * RateDetails3.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmAdditionalTax
	 * RateDetails5.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmAdditionalTax
	 * RateDetails10.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmAdditionalTax
	 * RateDetails13.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption30#mmTaxVoucherDetails
	 * CashOption30.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmAdditionalTax
	 * RateDetails15.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmAdditionalTax
	 * RateDetails14.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmAdditionalTax
	 * RateDetails18.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption38#mmTaxVoucherDetails
	 * CashOption38.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmAdditionalTax
	 * RateDetails21.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption39#mmTaxVoucherDetails
	 * CashOption39.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption41#mmTaxVoucherDetails
	 * CashOption41.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption44#mmTaxVoucherDetails
	 * CashOption44.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmAdditionalTax
	 * RateDetails23.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmAdditionalTax
	 * RateDetails22.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption46#mmTaxVoucherDetails
	 * CashOption46.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmAdditionalTax
	 * RateDetails24.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmAdditionalTax
	 * RateDetails25.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmAdditionalTax
	 * RateDetails26.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmTaxVoucherDetails
	 * CashOption52.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmAdditionalTax
	 * RateDetails27.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmAdditionalTax
	 * RateDetails28.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmAdditionalTax
	 * RateDetails30.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption55#mmTaxVoucherDetails
	 * CashOption55.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmAdditionalTax
	 * RateDetails31.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmAdditionalTax
	 * RateDetails32.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption58#mmTaxVoucherDetails
	 * CashOption58.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption60#mmTaxVoucherDetails
	 * CashOption60.mmTaxVoucherDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails33#mmAdditionalTax
	 * RateDetails33.mmAdditionalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails34#mmAdditionalTax
	 * RateDetails34.mmAdditionalTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies tax vouchers in the framework of a corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionDistribution, TaxVoucher> mmTaxVoucher = new MMBusinessAssociationEnd<CorporateActionDistribution, TaxVoucher>() {
		{
			derivation_lazy = () -> Arrays.asList(CashOption2.mmTaxVoucherDetails, CashOption9.mmTaxVoucherDetails, RateDetails2.mmAdditionalTax, CashOption12.mmTaxVoucherDetails, RateDetails4.mmAdditionalTax,
					CashOption13.mmTaxVoucherDetails, RateDetails7.mmAdditionalTax, CashOption18.mmTaxVoucherDetails, RateDetails9.mmAdditionalTax, CashOption22.mmTaxVoucherDetails, RateDetails11.mmAdditionalTax,
					CashOption26.mmTaxVoucherDetails, RateDetails12.mmAdditionalTax, CashOption27.mmTaxVoucherDetails, RateDetails3.mmAdditionalTax, RateDetails5.mmAdditionalTax, RateDetails10.mmAdditionalTax,
					RateDetails13.mmAdditionalTax, CashOption30.mmTaxVoucherDetails, RateDetails15.mmAdditionalTax, RateDetails14.mmAdditionalTax, RateDetails18.mmAdditionalTax, CashOption38.mmTaxVoucherDetails,
					RateDetails21.mmAdditionalTax, CashOption39.mmTaxVoucherDetails, CashOption41.mmTaxVoucherDetails, CashOption44.mmTaxVoucherDetails, RateDetails23.mmAdditionalTax, RateDetails22.mmAdditionalTax,
					CashOption46.mmTaxVoucherDetails, RateDetails24.mmAdditionalTax, RateDetails25.mmAdditionalTax, RateDetails26.mmAdditionalTax, CashOption52.mmTaxVoucherDetails, RateDetails27.mmAdditionalTax,
					RateDetails28.mmAdditionalTax, RateDetails30.mmAdditionalTax, CashOption55.mmTaxVoucherDetails, RateDetails31.mmAdditionalTax, RateDetails32.mmAdditionalTax, CashOption58.mmTaxVoucherDetails,
					CashOption60.mmTaxVoucherDetails, RateDetails33.mmAdditionalTax, RateDetails34.mmAdditionalTax);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Specifies tax vouchers in the framework of a corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> TaxVoucher.mmDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TaxVoucher.mmObject();
		}

		@Override
		public TaxVoucher getValue(CorporateActionDistribution obj) {
			return obj.getTaxVoucher();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, TaxVoucher value) {
			obj.setTaxVoucher(value);
		}
	};
	protected CorporateActionServicing relatedServicing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionDistribution
	 * CorporateActionServicing.mmCorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to corporate action servicing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionDistribution, Optional<CorporateActionServicing>> mmRelatedServicing = new MMBusinessAssociationEnd<CorporateActionDistribution, Optional<CorporateActionServicing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionServicing.mmCorporateActionDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionServicing.mmObject();
		}

		@Override
		public Optional<CorporateActionServicing> getValue(CorporateActionDistribution obj) {
			return obj.getRelatedServicing();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, Optional<CorporateActionServicing> value) {
			obj.setRelatedServicing(value.orElse(null));
		}
	};
	protected DistributionTypeCode orderType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionTypeCode
	 * DistributionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat1Choice#mmCode
	 * DistributionTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat1Choice#mmProprietary
	 * DistributionTypeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat2Choice#mmCode
	 * DistributionTypeFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat2Choice#mmProprietary
	 * DistributionTypeFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat3Choice#mmCode
	 * DistributionTypeFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat3Choice#mmProprietary
	 * DistributionTypeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionType1FormatChoice#mmCode
	 * DistributionType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionType1FormatChoice#mmProprietary
	 * DistributionType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat4Choice#mmCode
	 * DistributionTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat4Choice#mmProprietary
	 * DistributionTypeFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat6Choice#mmCode
	 * DistributionTypeFormat6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat6Choice#mmProprietary
	 * DistributionTypeFormat6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat7Choice#mmCode
	 * DistributionTypeFormat7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat7Choice#mmProprietary
	 * DistributionTypeFormat7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat8Choice#mmCode
	 * DistributionTypeFormat8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DistributionTypeFormat8Choice#mmProprietary
	 * DistributionTypeFormat8Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of movement instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDistribution, DistributionTypeCode> mmOrderType = new MMBusinessAttribute<CorporateActionDistribution, DistributionTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(DistributionTypeFormat1Choice.mmCode, DistributionTypeFormat1Choice.mmProprietary, DistributionTypeFormat2Choice.mmCode, DistributionTypeFormat2Choice.mmProprietary,
					DistributionTypeFormat3Choice.mmCode, DistributionTypeFormat3Choice.mmProprietary, DistributionType1FormatChoice.mmCode, DistributionType1FormatChoice.mmProprietary, DistributionTypeFormat4Choice.mmCode,
					DistributionTypeFormat4Choice.mmProprietary, DistributionTypeFormat6Choice.mmCode, DistributionTypeFormat6Choice.mmProprietary, DistributionTypeFormat7Choice.mmCode, DistributionTypeFormat7Choice.mmProprietary,
					DistributionTypeFormat8Choice.mmCode, DistributionTypeFormat8Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderType";
			definition = "Type of movement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DistributionTypeCode.mmObject();
		}

		@Override
		public DistributionTypeCode getValue(CorporateActionDistribution obj) {
			return obj.getOrderType();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, DistributionTypeCode value) {
			obj.setOrderType(value);
		}
	};
	protected DistributionInstructionTypeCode movementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionInstructionTypeCode
	 * DistributionInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#mmOrderType
	 * CorporateActionMovement1.mmOrderType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of movement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDistribution, DistributionInstructionTypeCode> mmMovementType = new MMBusinessAttribute<CorporateActionDistribution, DistributionInstructionTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionMovement1.mmOrderType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MovementType";
			definition = "Type of movement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DistributionInstructionTypeCode.mmObject();
		}

		@Override
		public DistributionInstructionTypeCode getValue(CorporateActionDistribution obj) {
			return obj.getMovementType();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, DistributionInstructionTypeCode value) {
			obj.setMovementType(value);
		}
	};
	protected YesNoIndicator highPriorityIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#mmHighPriorityIndicator
	 * CorporateActionMovement1.mmHighPriorityIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighPriorityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the movement is a high priority or not.\r\nMeaning when true: High priority\r\nMeaning when false: Standard"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDistribution, YesNoIndicator> mmHighPriorityIndicator = new MMBusinessAttribute<CorporateActionDistribution, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionMovement1.mmHighPriorityIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HighPriorityIndicator";
			definition = "Indicates whether the movement is a high priority or not.\r\nMeaning when true: High priority\r\nMeaning when false: Standard";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionDistribution obj) {
			return obj.getHighPriorityIndicator();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, YesNoIndicator value) {
			obj.setHighPriorityIndicator(value);
		}
	};
	protected ISODate requestedExecutionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1#mmRequestedExecutionDate
	 * CorporateActionMovement1.mmRequestedExecutionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the distribution movement must be executed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDistribution, ISODate> mmRequestedExecutionDate = new MMBusinessAttribute<CorporateActionDistribution, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionMovement1.mmRequestedExecutionDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the distribution movement must be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CorporateActionDistribution obj) {
			return obj.getRequestedExecutionDate();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, ISODate value) {
			obj.setRequestedExecutionDate(value);
		}
	};
	protected RoundingDirectionCode fractionTreatment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionTreatment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the rounding direction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDistribution, RoundingDirectionCode> mmFractionTreatment = new MMBusinessAttribute<CorporateActionDistribution, RoundingDirectionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FractionTreatment";
			definition = "Specifies the rounding direction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoundingDirectionCode.mmObject();
		}

		@Override
		public RoundingDirectionCode getValue(CorporateActionDistribution obj) {
			return obj.getFractionTreatment();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, RoundingDirectionCode value) {
			obj.setFractionTreatment(value);
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the posting amount is a debit or credit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDistribution, DebitCreditCode> mmCreditDebitIndicator = new MMBusinessAttribute<CorporateActionDistribution, DebitCreditCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies whether the posting amount is a debit or credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		@Override
		public DebitCreditCode getValue(CorporateActionDistribution obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, DebitCreditCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	protected List<CorporateActionOption> option;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmDistribution
	 * CorporateActionOption.mmDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option on which the distribution is based."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionDistribution, List<CorporateActionOption>> mmOption = new MMBusinessAssociationEnd<CorporateActionDistribution, List<CorporateActionOption>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option on which the distribution is based.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionOption.mmDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionOption.mmObject();
		}

		@Override
		public List<CorporateActionOption> getValue(CorporateActionDistribution obj) {
			return obj.getOption();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, List<CorporateActionOption> value) {
			obj.setOption(value);
		}
	};
	protected CurrencyAndAmount netAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmNetAmount
	 * TaxVoucher1.mmNetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount after any deductions and allowances have been made"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDistribution, CurrencyAndAmount> mmNetAmount = new MMBusinessAttribute<CorporateActionDistribution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher1.mmNetAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Cash amount after any deductions and allowances have been made";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CorporateActionDistribution obj) {
			return obj.getNetAmount();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, CurrencyAndAmount value) {
			obj.setNetAmount(value);
		}
	};
	protected CurrencyAndAmount grossAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmGrossAmount
	 * TaxVoucher1.mmGrossAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount before any deductions and allowances have been made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionDistribution, CurrencyAndAmount> mmGrossAmount = new MMBusinessAttribute<CorporateActionDistribution, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxVoucher1.mmGrossAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossAmount";
			definition = "Cash amount before any deductions and allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CorporateActionDistribution obj) {
			return obj.getGrossAmount();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, CurrencyAndAmount value) {
			obj.setGrossAmount(value);
		}
	};
	protected FinancialTransaction financialTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmCorporateActionDistribution
	 * FinancialTransaction.mmCorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial transaction to which the CA distribution belongs."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionDistribution, FinancialTransaction> mmFinancialTransaction = new MMBusinessAssociationEnd<CorporateActionDistribution, FinancialTransaction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the CA distribution belongs.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> FinancialTransaction.mmCorporateActionDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> FinancialTransaction.mmObject();
		}

		@Override
		public FinancialTransaction getValue(CorporateActionDistribution obj) {
			return obj.getFinancialTransaction();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, FinancialTransaction value) {
			obj.setFinancialTransaction(value);
		}
	};
	protected List<CorporateActionProceedsDeliveryInstruction> corporateActionProceedsDeliveryInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmRelatedDistribution
	 * CorporateActionProceedsDeliveryInstruction.mmRelatedDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8#mmDeliveryDetails
	 * CorporateActionNarrative8.mmDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13#mmDeliveryDetails
	 * CorporateActionNarrative13.mmDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmDeliveryDetails
	 * CorporateActionAdditionalInformation1.mmDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative32#mmDeliveryDetails
	 * CorporateActionNarrative32.mmDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative33#mmDeliveryDetails
	 * CorporateActionNarrative33.mmDeliveryDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionProceedsDeliveryInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionDistribution, List<CorporateActionProceedsDeliveryInstruction>> mmCorporateActionProceedsDeliveryInstruction = new MMBusinessAssociationEnd<CorporateActionDistribution, List<CorporateActionProceedsDeliveryInstruction>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative8.mmDeliveryDetails, CorporateActionNarrative13.mmDeliveryDetails, CorporateActionAdditionalInformation1.mmDeliveryDetails,
					CorporateActionNarrative32.mmDeliveryDetails, CorporateActionNarrative33.mmDeliveryDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionProceedsDeliveryInstruction";
			definition = "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process.";
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmRelatedDistribution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
		}

		@Override
		public List<CorporateActionProceedsDeliveryInstruction> getValue(CorporateActionDistribution obj) {
			return obj.getCorporateActionProceedsDeliveryInstruction();
		}

		@Override
		public void setValue(CorporateActionDistribution obj, List<CorporateActionProceedsDeliveryInstruction> value) {
			obj.setCorporateActionProceedsDeliveryInstruction(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDistribution";
				definition = "Distribution of the proceeds of a CA event.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesQuantity.mmCorporateActionDistribution, CorporateActionOption.mmDistribution, TaxVoucher.mmDistribution, CorporateActionServicing.mmCorporateActionDistribution,
						CorporateActionProceedsDeliveryInstruction.mmRelatedDistribution, FinancialTransaction.mmCorporateActionDistribution);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionDistribution.mmPostingQuantity, com.tools20022.repository.entity.CorporateActionDistribution.mmPostingDateTime,
						com.tools20022.repository.entity.CorporateActionDistribution.mmMovementDate, com.tools20022.repository.entity.CorporateActionDistribution.mmPostingAmount,
						com.tools20022.repository.entity.CorporateActionDistribution.mmTaxVoucher, com.tools20022.repository.entity.CorporateActionDistribution.mmRelatedServicing,
						com.tools20022.repository.entity.CorporateActionDistribution.mmOrderType, com.tools20022.repository.entity.CorporateActionDistribution.mmMovementType,
						com.tools20022.repository.entity.CorporateActionDistribution.mmHighPriorityIndicator, com.tools20022.repository.entity.CorporateActionDistribution.mmRequestedExecutionDate,
						com.tools20022.repository.entity.CorporateActionDistribution.mmFractionTreatment, com.tools20022.repository.entity.CorporateActionDistribution.mmCreditDebitIndicator,
						com.tools20022.repository.entity.CorporateActionDistribution.mmOption, com.tools20022.repository.entity.CorporateActionDistribution.mmNetAmount,
						com.tools20022.repository.entity.CorporateActionDistribution.mmGrossAmount, com.tools20022.repository.entity.CorporateActionDistribution.mmFinancialTransaction,
						com.tools20022.repository.entity.CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction);
				derivationComponent_lazy = () -> Arrays.asList(DistributionTypeFormat1Choice.mmObject(), DistributionTypeFormat2Choice.mmObject(), DistributionTypeFormat3Choice.mmObject(), DistributionType1FormatChoice.mmObject(),
						GlobalDistributionRequest1.mmObject(), CorporateActionMovement1.mmObject(), DistributionTypeFormat4Choice.mmObject(), DistributionTypeFormat6Choice.mmObject(), DistributionTypeFormat7Choice.mmObject(),
						DistributionTypeFormat8Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionDistribution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesQuantity getPostingQuantity() {
		return postingQuantity;
	}

	public CorporateActionDistribution setPostingQuantity(SecuritiesQuantity postingQuantity) {
		this.postingQuantity = Objects.requireNonNull(postingQuantity);
		return this;
	}

	public ISODateTime getPostingDateTime() {
		return postingDateTime;
	}

	public CorporateActionDistribution setPostingDateTime(ISODateTime postingDateTime) {
		this.postingDateTime = Objects.requireNonNull(postingDateTime);
		return this;
	}

	public ISODate getMovementDate() {
		return movementDate;
	}

	public CorporateActionDistribution setMovementDate(ISODate movementDate) {
		this.movementDate = Objects.requireNonNull(movementDate);
		return this;
	}

	public CurrencyAndAmount getPostingAmount() {
		return postingAmount;
	}

	public CorporateActionDistribution setPostingAmount(CurrencyAndAmount postingAmount) {
		this.postingAmount = Objects.requireNonNull(postingAmount);
		return this;
	}

	public TaxVoucher getTaxVoucher() {
		return taxVoucher;
	}

	public CorporateActionDistribution setTaxVoucher(TaxVoucher taxVoucher) {
		this.taxVoucher = Objects.requireNonNull(taxVoucher);
		return this;
	}

	public Optional<CorporateActionServicing> getRelatedServicing() {
		return relatedServicing == null ? Optional.empty() : Optional.of(relatedServicing);
	}

	public CorporateActionDistribution setRelatedServicing(CorporateActionServicing relatedServicing) {
		this.relatedServicing = relatedServicing;
		return this;
	}

	public DistributionTypeCode getOrderType() {
		return orderType;
	}

	public CorporateActionDistribution setOrderType(DistributionTypeCode orderType) {
		this.orderType = Objects.requireNonNull(orderType);
		return this;
	}

	public DistributionInstructionTypeCode getMovementType() {
		return movementType;
	}

	public CorporateActionDistribution setMovementType(DistributionInstructionTypeCode movementType) {
		this.movementType = Objects.requireNonNull(movementType);
		return this;
	}

	public YesNoIndicator getHighPriorityIndicator() {
		return highPriorityIndicator;
	}

	public CorporateActionDistribution setHighPriorityIndicator(YesNoIndicator highPriorityIndicator) {
		this.highPriorityIndicator = Objects.requireNonNull(highPriorityIndicator);
		return this;
	}

	public ISODate getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public CorporateActionDistribution setRequestedExecutionDate(ISODate requestedExecutionDate) {
		this.requestedExecutionDate = Objects.requireNonNull(requestedExecutionDate);
		return this;
	}

	public RoundingDirectionCode getFractionTreatment() {
		return fractionTreatment;
	}

	public CorporateActionDistribution setFractionTreatment(RoundingDirectionCode fractionTreatment) {
		this.fractionTreatment = Objects.requireNonNull(fractionTreatment);
		return this;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public CorporateActionDistribution setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public List<CorporateActionOption> getOption() {
		return option == null ? option = new ArrayList<>() : option;
	}

	public CorporateActionDistribution setOption(List<CorporateActionOption> option) {
		this.option = Objects.requireNonNull(option);
		return this;
	}

	public CurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public CorporateActionDistribution setNetAmount(CurrencyAndAmount netAmount) {
		this.netAmount = Objects.requireNonNull(netAmount);
		return this;
	}

	public CurrencyAndAmount getGrossAmount() {
		return grossAmount;
	}

	public CorporateActionDistribution setGrossAmount(CurrencyAndAmount grossAmount) {
		this.grossAmount = Objects.requireNonNull(grossAmount);
		return this;
	}

	public FinancialTransaction getFinancialTransaction() {
		return financialTransaction;
	}

	public CorporateActionDistribution setFinancialTransaction(FinancialTransaction financialTransaction) {
		this.financialTransaction = Objects.requireNonNull(financialTransaction);
		return this;
	}

	public List<CorporateActionProceedsDeliveryInstruction> getCorporateActionProceedsDeliveryInstruction() {
		return corporateActionProceedsDeliveryInstruction == null ? corporateActionProceedsDeliveryInstruction = new ArrayList<>() : corporateActionProceedsDeliveryInstruction;
	}

	public CorporateActionDistribution setCorporateActionProceedsDeliveryInstruction(List<CorporateActionProceedsDeliveryInstruction> corporateActionProceedsDeliveryInstruction) {
		this.corporateActionProceedsDeliveryInstruction = Objects.requireNonNull(corporateActionProceedsDeliveryInstruction);
		return this;
	}
}