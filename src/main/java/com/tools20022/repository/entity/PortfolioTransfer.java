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
import com.tools20022.repository.codeset.ISATypeCode;
import com.tools20022.repository.codeset.PEPISACode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.InvestmentAccount;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.entity.Portfolio;
import com.tools20022.repository.entity.SecuritiesDeliveryObligation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Transfer by the delivering account servicer to the receiving account servicer
 * of a retail or institutional client portfolio. A portfolio can be any
 * grouping of investments, for example stocks, bonds, options, warrants. held
 * by an institution or an individual.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PortfolioTransfer" src="doc-files/PortfolioTransfer.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredYear
 * PortfolioTransfer.mmTransferredYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmCashComponentIndicator
 * PortfolioTransfer.mmCashComponentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountFrom
 * PortfolioTransfer.mmAccountFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountTo
 * PortfolioTransfer.mmAccountTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmPaymentObligation
 * PortfolioTransfer.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPortfolio
 * PortfolioTransfer.mmTransferredPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmSecuritiesDeliveryObligation
 * PortfolioTransfer.mmSecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredAmount
 * PortfolioTransfer.mmTransferredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPercentage
 * PortfolioTransfer.mmTransferredPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferDate
 * PortfolioTransfer.mmTransferDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmNomineeAccount
 * PortfolioTransfer.mmNomineeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmPEPOrISAPlan
 * PortfolioTransfer.mmPEPOrISAPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmCurrentYearISAType
 * PortfolioTransfer.mmCurrentYearISAType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDebitPortfolioTransfer
 * InvestmentAccount.mmDebitPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCreditPortfolioTransfer
 * InvestmentAccount.mmCreditPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmRelatedPortfolioTransfer
 * InvestmentAccount.mmRelatedPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourcePortfolioTransfer
 * PaymentObligation.mmPaymentSourcePortfolioTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmTransfer
 * Portfolio.mmTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedPortfolioTransfer
 * SecuritiesDeliveryObligation.mmRelatedPortfolioTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PreviousYearChoice#mmAllPreviousYears
 * PreviousYearChoice.mmAllPreviousYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue#mmPreviousYears
 * ISAYearsOfIssue.mmPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1#mmISA
 * PEPISATransfer1.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1#mmPEP
 * PEPISATransfer1.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreviousYear1#mmAllPreviousYears
 * PreviousYear1.mmAllPreviousYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmPreviousYears
 * ISAYearsOfIssue1.mmPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer6#mmISA
 * PEPISATransfer6.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer6#mmPEP
 * PEPISATransfer6.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PreviousYear1Choice#mmAllPreviousYears
 * PreviousYear1Choice.mmAllPreviousYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4#mmPreviousYears
 * ISAYearsOfIssue4.mmPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8#mmISA
 * PEPISATransfer8.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8#mmPEP
 * PEPISATransfer8.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#mmProductTransfer
 * PEPISATransfer7.mmProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#mmProductTransfer
 * PEPISATransfer11.mmProductTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer9#mmProductTransfer
 * ISATransfer9.mmProductTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer2#mmISA
 * PEPISATransfer2.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer2#mmPEP
 * PEPISATransfer2.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmPreviousYears
 * ISAYearsOfIssue3.mmPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmISA
 * PEPISATransfer4.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmPEP
 * PEPISATransfer4.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#mmPreviousYears
 * ISAYearsOfIssue5.mmPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer3#mmISA
 * PEPISATransfer3.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer3#mmPEP
 * PEPISATransfer3.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#mmPreviousYears
 * ISAYearsOfIssue2.mmPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer5#mmISA
 * PEPISATransfer5.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer5#mmPEP
 * PEPISATransfer5.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue6#mmPreviousYears
 * ISAYearsOfIssue6.mmPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PEPOrISAChoice#mmISA
 * PEPOrISAChoice.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PEPOrISAChoice#mmPEP
 * PEPOrISAChoice.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmProductTransferAndReference
 * ISATransfer12.mmProductTransferAndReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer17#mmProductTransfer
 * ISATransfer17.mmProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer20#mmProductTransfer
 * ISATransfer20.mmProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmProductTransferAndReference
 * ISATransfer19.mmProductTransferAndReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer25#mmProductTransfer
 * ISATransfer25.mmProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmProductTransferAndReference
 * ISATransfer24.mmProductTransferAndReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PreviousYear2Choice#mmAllPreviousYears
 * PreviousYear2Choice.mmAllPreviousYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue7#mmPreviousYears
 * ISAYearsOfIssue7.mmPreviousYears}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PreviousYearChoice
 * PreviousYearChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue
 * ISAYearsOfIssue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1
 * PEPISATransfer1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PreviousYear1 PreviousYear1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1
 * ISAYearsOfIssue1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer6
 * PEPISATransfer6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CurrentYearType1Choice
 * CurrentYearType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PreviousYear1Choice
 * PreviousYear1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PreviousYear2 PreviousYear2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4
 * ISAYearsOfIssue4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer4 ISATransfer4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer6 ISATransfer6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8
 * PEPISATransfer8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer7
 * PEPISATransfer7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer3 ISATransfer3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer11
 * PEPISATransfer11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer8 ISATransfer8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer9 ISATransfer9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer2
 * PEPISATransfer2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3
 * ISAYearsOfIssue3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4
 * PEPISATransfer4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PreviousYear3 PreviousYear3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5
 * ISAYearsOfIssue5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer2 ISATransfer2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer10 ISATransfer10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer3
 * PEPISATransfer3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer1 ISATransfer1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer7 ISATransfer7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2
 * ISAYearsOfIssue2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer5
 * PEPISATransfer5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CurrentYearType2Choice
 * CurrentYearType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue6
 * ISAYearsOfIssue6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer5 ISATransfer5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PEPOrISAChoice
 * PEPOrISAChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer1
 * PEPISACashTransfer1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer2
 * PEPISACashTransfer2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer15 ISATransfer15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer16 ISATransfer16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer13 ISATransfer13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer14 ISATransfer14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer17 ISATransfer17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer21 ISATransfer21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer18 ISATransfer18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer20 ISATransfer20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer19 ISATransfer19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer23 ISATransfer23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer26 ISATransfer26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer27 ISATransfer27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer22 ISATransfer22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer25 ISATransfer25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer30 ISATransfer30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer29 ISATransfer29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer28 ISATransfer28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer31 ISATransfer31}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PreviousYear2Choice
 * PreviousYear2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue7
 * ISAYearsOfIssue7}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PortfolioTransfer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transfer by the delivering account servicer to the receiving account servicer of a retail or institutional client portfolio. A portfolio can be any grouping of  investments, for example  stocks, bonds, options, warrants. held by an institution or an individual."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class PortfolioTransfer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISOYear transferredYear;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOYear
	 * ISOYear}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreviousYearChoice#mmSpecificPreviousYears
	 * PreviousYearChoice.mmSpecificPreviousYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear1#mmSpecificPreviousYears
	 * PreviousYear1.mmSpecificPreviousYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreviousYear1Choice#mmSpecificPreviousYears
	 * PreviousYear1Choice.mmSpecificPreviousYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear2#mmPreviousYears
	 * PreviousYear2.mmPreviousYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear3#mmPreviousYear
	 * PreviousYear3.mmPreviousYear}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmYear
	 * PEPISACashTransfer1.mmYear}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmYear
	 * PEPISACashTransfer2.mmYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreviousYear2Choice#mmSpecificPreviousYears
	 * PreviousYear2Choice.mmSpecificPreviousYears}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the year during which the investment plan to be transferred was issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PortfolioTransfer, ISOYear> mmTransferredYear = new MMBusinessAttribute<PortfolioTransfer, ISOYear>() {
		{
			derivation_lazy = () -> Arrays.asList(PreviousYearChoice.mmSpecificPreviousYears, PreviousYear1.mmSpecificPreviousYears, PreviousYear1Choice.mmSpecificPreviousYears, PreviousYear2.mmPreviousYears, PreviousYear3.mmPreviousYear,
					PEPISACashTransfer1.mmYear, PEPISACashTransfer2.mmYear, PreviousYear2Choice.mmSpecificPreviousYears);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferredYear";
			definition = "Specifies the year during which the investment plan to be transferred was issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYear.mmObject();
		}

		@Override
		public ISOYear getValue(PortfolioTransfer obj) {
			return obj.getTransferredYear();
		}

		@Override
		public void setValue(PortfolioTransfer obj, ISOYear value) {
			obj.setTransferredYear(value);
		}
	};
	protected YesNoIndicator cashComponentIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.PreviousYear1#mmCashComponentIndicator
	 * PreviousYear1.mmCashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmCashComponentIndicator
	 * ISAYearsOfIssue1.mmCashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear2#mmCashComponentIndicator
	 * PreviousYear2.mmCashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4#mmCashComponentIndicator
	 * ISAYearsOfIssue4.mmCashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmCashComponentIndicator
	 * ISAYearsOfIssue3.mmCashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear3#mmCashComponentIndicator
	 * PreviousYear3.mmCashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#mmCashComponentIndicator
	 * ISAYearsOfIssue5.mmCashComponentIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashComponentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an ISA investment plan contains a cash component asset for transfer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PortfolioTransfer, YesNoIndicator> mmCashComponentIndicator = new MMBusinessAttribute<PortfolioTransfer, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(PreviousYear1.mmCashComponentIndicator, ISAYearsOfIssue1.mmCashComponentIndicator, PreviousYear2.mmCashComponentIndicator, ISAYearsOfIssue4.mmCashComponentIndicator,
					ISAYearsOfIssue3.mmCashComponentIndicator, PreviousYear3.mmCashComponentIndicator, ISAYearsOfIssue5.mmCashComponentIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashComponentIndicator";
			definition = "Indicates whether an ISA investment plan contains a cash component asset for transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PortfolioTransfer obj) {
			return obj.getCashComponentIndicator();
		}

		@Override
		public void setValue(PortfolioTransfer obj, YesNoIndicator value) {
			obj.setCashComponentIndicator(value);
		}
	};
	protected List<InvestmentAccount> accountFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDebitPortfolioTransfer
	 * InvestmentAccount.mmDebitPortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#mmClientAccount
	 * PEPISATransfer7.mmClientAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#mmTransferorAccount
	 * PEPISATransfer11.mmTransferorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmTransferorAccount
	 * ISATransfer9.mmTransferorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmTransferorAccount
	 * ISATransfer12.mmTransferorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmTransferorAccount
	 * ISATransfer19.mmTransferorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmTransferorAccount
	 * ISATransfer24.mmTransferorAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account owned by an investor and from which the assets are transferred."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PortfolioTransfer, List<InvestmentAccount>> mmAccountFrom = new MMBusinessAssociationEnd<PortfolioTransfer, List<InvestmentAccount>>() {
		{
			derivation_lazy = () -> Arrays.asList(PEPISATransfer7.mmClientAccount, PEPISATransfer11.mmTransferorAccount, ISATransfer9.mmTransferorAccount, ISATransfer12.mmTransferorAccount, ISATransfer19.mmTransferorAccount,
					ISATransfer24.mmTransferorAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountFrom";
			definition = "Specifies the account owned by an investor and from which the assets are transferred.";
			minOccurs = 0;
			opposite_lazy = () -> InvestmentAccount.mmDebitPortfolioTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentAccount.mmObject();
		}

		@Override
		public List<InvestmentAccount> getValue(PortfolioTransfer obj) {
			return obj.getAccountFrom();
		}

		@Override
		public void setValue(PortfolioTransfer obj, List<InvestmentAccount> value) {
			obj.setAccountFrom(value);
		}
	};
	protected List<InvestmentAccount> accountTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCreditPortfolioTransfer
	 * InvestmentAccount.mmCreditPortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account owned by an investor and to which the assets are transferred."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PortfolioTransfer, List<InvestmentAccount>> mmAccountTo = new MMBusinessAssociationEnd<PortfolioTransfer, List<InvestmentAccount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountTo";
			definition = "Specifies the account owned by an investor and to which the assets are transferred.";
			minOccurs = 0;
			opposite_lazy = () -> InvestmentAccount.mmCreditPortfolioTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentAccount.mmObject();
		}

		@Override
		public List<InvestmentAccount> getValue(PortfolioTransfer obj) {
			return obj.getAccountTo();
		}

		@Override
		public void setValue(PortfolioTransfer obj, List<InvestmentAccount> value) {
			obj.setAccountTo(value);
		}
	};
	protected List<PaymentObligation> paymentObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourcePortfolioTransfer
	 * PaymentObligation.mmPaymentSourcePortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash amount to be transferred in relation with a portfolio transfer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PortfolioTransfer, List<PaymentObligation>> mmPaymentObligation = new MMBusinessAssociationEnd<PortfolioTransfer, List<PaymentObligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the cash amount to be transferred in relation with a portfolio transfer.";
			minOccurs = 0;
			opposite_lazy = () -> PaymentObligation.mmPaymentSourcePortfolioTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}

		@Override
		public List<PaymentObligation> getValue(PortfolioTransfer obj) {
			return obj.getPaymentObligation();
		}

		@Override
		public void setValue(PortfolioTransfer obj, List<PaymentObligation> value) {
			obj.setPaymentObligation(value);
		}
	};
	protected List<Portfolio> transferredPortfolio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#mmTransfer
	 * Portfolio.mmTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer6#mmPortfolio
	 * PEPISATransfer6.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer4#mmPortfolio
	 * ISATransfer4.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer6#mmPortfolio
	 * ISATransfer6.mmPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8#mmPortfolio
	 * PEPISATransfer8.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer3#mmPortfolio
	 * ISATransfer3.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer8#mmPortfolio
	 * ISATransfer8.mmPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmPortfolio
	 * PEPISATransfer4.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer2#mmPortfolio
	 * ISATransfer2.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer10#mmPortfolio
	 * ISATransfer10.mmPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer3#mmPortfolio
	 * PEPISATransfer3.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer1#mmPortfolio
	 * ISATransfer1.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer7#mmPortfolio
	 * ISATransfer7.mmPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer5#mmPortfolio
	 * PEPISATransfer5.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer5#mmPortfolio
	 * ISATransfer5.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer15#mmPortfolio
	 * ISATransfer15.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer16#mmPortfolio
	 * ISATransfer16.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer13#mmPortfolio
	 * ISATransfer13.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer14#mmPortfolio
	 * ISATransfer14.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer21#mmPortfolio
	 * ISATransfer21.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer18#mmPortfolio
	 * ISATransfer18.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer23#mmPortfolio
	 * ISATransfer23.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer26#mmPortfolio
	 * ISATransfer26.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer27#mmPortfolio
	 * ISATransfer27.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer22#mmPortfolio
	 * ISATransfer22.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer30#mmPortfolio
	 * ISATransfer30.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer29#mmPortfolio
	 * ISATransfer29.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer28#mmPortfolio
	 * ISATransfer28.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer31#mmPortfolio
	 * ISATransfer31.mmPortfolio}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredPortfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the portfolio which has to be transferred."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PortfolioTransfer, List<Portfolio>> mmTransferredPortfolio = new MMBusinessAssociationEnd<PortfolioTransfer, List<Portfolio>>() {
		{
			derivation_lazy = () -> Arrays.asList(PEPISATransfer6.mmPortfolio, ISATransfer4.mmPortfolio, ISATransfer6.mmPortfolio, PEPISATransfer8.mmPortfolio, ISATransfer3.mmPortfolio, ISATransfer8.mmPortfolio,
					PEPISATransfer4.mmPortfolio, ISATransfer2.mmPortfolio, ISATransfer10.mmPortfolio, PEPISATransfer3.mmPortfolio, ISATransfer1.mmPortfolio, ISATransfer7.mmPortfolio, PEPISATransfer5.mmPortfolio, ISATransfer5.mmPortfolio,
					ISATransfer15.mmPortfolio, ISATransfer16.mmPortfolio, ISATransfer13.mmPortfolio, ISATransfer14.mmPortfolio, ISATransfer21.mmPortfolio, ISATransfer18.mmPortfolio, ISATransfer23.mmPortfolio, ISATransfer26.mmPortfolio,
					ISATransfer27.mmPortfolio, ISATransfer22.mmPortfolio, ISATransfer30.mmPortfolio, ISATransfer29.mmPortfolio, ISATransfer28.mmPortfolio, ISATransfer31.mmPortfolio);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferredPortfolio";
			definition = "Specifies the portfolio which has to be transferred.";
			minOccurs = 0;
			opposite_lazy = () -> Portfolio.mmTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Portfolio.mmObject();
		}

		@Override
		public List<Portfolio> getValue(PortfolioTransfer obj) {
			return obj.getTransferredPortfolio();
		}

		@Override
		public void setValue(PortfolioTransfer obj, List<Portfolio> value) {
			obj.setTransferredPortfolio(value);
		}
	};
	protected List<SecuritiesDeliveryObligation> securitiesDeliveryObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedPortfolioTransfer
	 * SecuritiesDeliveryObligation.mmRelatedPortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the financial instrument to be transferred in relation with a portfolio transfer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PortfolioTransfer, List<SecuritiesDeliveryObligation>> mmSecuritiesDeliveryObligation = new MMBusinessAssociationEnd<PortfolioTransfer, List<SecuritiesDeliveryObligation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Specifies the financial instrument to be transferred in relation with a portfolio transfer.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesDeliveryObligation.mmRelatedPortfolioTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesDeliveryObligation.mmObject();
		}

		@Override
		public List<SecuritiesDeliveryObligation> getValue(PortfolioTransfer obj) {
			return obj.getSecuritiesDeliveryObligation();
		}

		@Override
		public void setValue(PortfolioTransfer obj, List<SecuritiesDeliveryObligation> value) {
			obj.setSecuritiesDeliveryObligation(value);
		}
	};
	protected CurrencyAndAmount transferredAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument to transfer expressed as an amount of money."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PortfolioTransfer, CurrencyAndAmount> mmTransferredAmount = new MMBusinessAttribute<PortfolioTransfer, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferredAmount";
			definition = "Quantity of financial instrument to transfer expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(PortfolioTransfer obj) {
			return obj.getTransferredAmount();
		}

		@Override
		public void setValue(PortfolioTransfer obj, CurrencyAndAmount value) {
			obj.setTransferredAmount(value);
		}
	};
	protected PercentageRate transferredPercentage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmPercentageToBeTransferred
	 * PEPISACashTransfer1.mmPercentageToBeTransferred}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmPercentageToBeTransferred
	 * PEPISACashTransfer2.mmPercentageToBeTransferred}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument to transfer expressed as a percentage of the investor's total holding."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PortfolioTransfer, PercentageRate> mmTransferredPercentage = new MMBusinessAttribute<PortfolioTransfer, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(PEPISACashTransfer1.mmPercentageToBeTransferred, PEPISACashTransfer2.mmPercentageToBeTransferred);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferredPercentage";
			definition = "Quantity of financial instrument to transfer expressed as a percentage of the investor's total holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(PortfolioTransfer obj) {
			return obj.getTransferredPercentage();
		}

		@Override
		public void setValue(PortfolioTransfer obj, PercentageRate value) {
			obj.setTransferredPercentage(value);
		}
	};
	protected ISODateTime transferDate;
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
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer2#mmActualTransferDate
	 * PEPISATransfer2.mmActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmActualTransferDate
	 * PEPISATransfer4.mmActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2#mmActualTransferDate
	 * ISATransfer2.mmActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10#mmActualTransferDate
	 * ISATransfer10.mmActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer1#mmRequestedTransferDate
	 * ISATransfer1.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer7#mmRequestedTransferDate
	 * ISATransfer7.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmSettlementDate
	 * PEPISACashTransfer2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer16#mmRequestedTransferDate
	 * ISATransfer16.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmActualTransferDate
	 * ISATransfer13.mmActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmActualTransferDate
	 * ISATransfer21.mmActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmRequestedTransferDate
	 * ISATransfer18.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#mmActualTransferDate
	 * ISATransfer26.mmActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmRequestedTransferDate
	 * ISATransfer22.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer29#mmRequestedTransferDate
	 * ISATransfer29.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer28#mmActualTransferDate
	 * ISATransfer28.mmActualTransferDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Execution date of the transfer instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PortfolioTransfer, ISODateTime> mmTransferDate = new MMBusinessAttribute<PortfolioTransfer, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(PEPISATransfer2.mmActualTransferDate, PEPISATransfer4.mmActualTransferDate, ISATransfer2.mmActualTransferDate, ISATransfer10.mmActualTransferDate, ISATransfer1.mmRequestedTransferDate,
					ISATransfer7.mmRequestedTransferDate, PEPISACashTransfer2.mmSettlementDate, ISATransfer16.mmRequestedTransferDate, ISATransfer13.mmActualTransferDate, ISATransfer21.mmActualTransferDate,
					ISATransfer18.mmRequestedTransferDate, ISATransfer26.mmActualTransferDate, ISATransfer22.mmRequestedTransferDate, ISATransfer29.mmRequestedTransferDate, ISATransfer28.mmActualTransferDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferDate";
			definition = "Execution date of the transfer instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(PortfolioTransfer obj) {
			return obj.getTransferDate();
		}

		@Override
		public void setValue(PortfolioTransfer obj, ISODateTime value) {
			obj.setTransferDate(value);
		}
	};
	protected InvestmentAccount nomineeAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmRelatedPortfolioTransfer
	 * InvestmentAccount.mmRelatedPortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#mmNomineeAccount
	 * PEPISATransfer7.mmNomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#mmNomineeAccount
	 * PEPISATransfer11.mmNomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmNomineeAccount
	 * ISATransfer9.mmNomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmNomineeAccount
	 * ISATransfer12.mmNomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmNomineeAccount
	 * ISATransfer19.mmNomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmNomineeAccount
	 * ISATransfer24.mmNomineeAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NomineeAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account held in the name of a party that is not the name of the beneficial owner of the shares."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PortfolioTransfer, InvestmentAccount> mmNomineeAccount = new MMBusinessAssociationEnd<PortfolioTransfer, InvestmentAccount>() {
		{
			derivation_lazy = () -> Arrays.asList(PEPISATransfer7.mmNomineeAccount, PEPISATransfer11.mmNomineeAccount, ISATransfer9.mmNomineeAccount, ISATransfer12.mmNomineeAccount, ISATransfer19.mmNomineeAccount,
					ISATransfer24.mmNomineeAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NomineeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentAccount.mmRelatedPortfolioTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentAccount.mmObject();
		}

		@Override
		public InvestmentAccount getValue(PortfolioTransfer obj) {
			return obj.getNomineeAccount();
		}

		@Override
		public void setValue(PortfolioTransfer obj, InvestmentAccount value) {
			obj.setNomineeAccount(value);
		}
	};
	protected PEPISACode pEPOrISAPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PEPISACode
	 * PEPISACode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmType
	 * PEPISACashTransfer1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmType
	 * PEPISACashTransfer2.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PEPOrISAPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investment plan is a PEP or ISA type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PortfolioTransfer, PEPISACode> mmPEPOrISAPlan = new MMBusinessAttribute<PortfolioTransfer, PEPISACode>() {
		{
			derivation_lazy = () -> Arrays.asList(PEPISACashTransfer1.mmType, PEPISACashTransfer2.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PEPOrISAPlan";
			definition = "Specifies whether the investment plan is a PEP or ISA type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PEPISACode.mmObject();
		}

		@Override
		public PEPISACode getValue(PortfolioTransfer obj) {
			return obj.getPEPOrISAPlan();
		}

		@Override
		public void setValue(PortfolioTransfer obj, PEPISACode value) {
			obj.setPEPOrISAPlan(value);
		}
	};
	protected ISATypeCode currentYearISAType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ISATypeCode
	 * ISATypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue#mmCurrentYear
	 * ISAYearsOfIssue.mmCurrentYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmCurrentYearType
	 * ISAYearsOfIssue1.mmCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmExtendedCurrentYearType
	 * ISAYearsOfIssue1.mmExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType1Choice#mmCurrentYearType
	 * CurrentYearType1Choice.mmCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType1Choice#mmExtendedCurrentYearType
	 * CurrentYearType1Choice.mmExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4#mmCurrentYear
	 * ISAYearsOfIssue4.mmCurrentYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmCurrentYearType
	 * ISAYearsOfIssue3.mmCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmExtendedCurrentYearType
	 * ISAYearsOfIssue3.mmExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#mmCurrentYear
	 * ISAYearsOfIssue5.mmCurrentYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#mmCurrentYearType
	 * ISAYearsOfIssue2.mmCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#mmExtendedCurrentYearType
	 * ISAYearsOfIssue2.mmExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType2Choice#mmCurrentYearType
	 * CurrentYearType2Choice.mmCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType2Choice#mmExtendedCurrentYearType
	 * CurrentYearType2Choice.mmExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue6#mmCurrentYear
	 * ISAYearsOfIssue6.mmCurrentYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue7#mmCurrentYear
	 * ISAYearsOfIssue7.mmCurrentYear}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearISAType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current year ISA is an ISA that was issued during the current fiscal year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PortfolioTransfer, ISATypeCode> mmCurrentYearISAType = new MMBusinessAttribute<PortfolioTransfer, ISATypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ISAYearsOfIssue.mmCurrentYear, ISAYearsOfIssue1.mmCurrentYearType, ISAYearsOfIssue1.mmExtendedCurrentYearType, CurrentYearType1Choice.mmCurrentYearType,
					CurrentYearType1Choice.mmExtendedCurrentYearType, ISAYearsOfIssue4.mmCurrentYear, ISAYearsOfIssue3.mmCurrentYearType, ISAYearsOfIssue3.mmExtendedCurrentYearType, ISAYearsOfIssue5.mmCurrentYear,
					ISAYearsOfIssue2.mmCurrentYearType, ISAYearsOfIssue2.mmExtendedCurrentYearType, CurrentYearType2Choice.mmCurrentYearType, CurrentYearType2Choice.mmExtendedCurrentYearType, ISAYearsOfIssue6.mmCurrentYear,
					ISAYearsOfIssue7.mmCurrentYear);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrentYearISAType";
			definition = "Current year ISA is an ISA that was issued during the current fiscal year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISATypeCode.mmObject();
		}

		@Override
		public ISATypeCode getValue(PortfolioTransfer obj) {
			return obj.getCurrentYearISAType();
		}

		@Override
		public void setValue(PortfolioTransfer obj, ISATypeCode value) {
			obj.setCurrentYearISAType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PortfolioTransfer";
				definition = "Transfer by the delivering account servicer to the receiving account servicer of a retail or institutional client portfolio. A portfolio can be any grouping of  investments, for example  stocks, bonds, options, warrants. held by an institution or an individual.";
				associationDomain_lazy = () -> Arrays.asList(InvestmentAccount.mmDebitPortfolioTransfer, InvestmentAccount.mmCreditPortfolioTransfer, InvestmentAccount.mmRelatedPortfolioTransfer,
						PaymentObligation.mmPaymentSourcePortfolioTransfer, Portfolio.mmTransfer, SecuritiesDeliveryObligation.mmRelatedPortfolioTransfer);
				derivationElement_lazy = () -> Arrays.asList(PreviousYearChoice.mmAllPreviousYears, ISAYearsOfIssue.mmPreviousYears, PEPISATransfer1.mmISA, PEPISATransfer1.mmPEP, PreviousYear1.mmAllPreviousYears,
						ISAYearsOfIssue1.mmPreviousYears, PEPISATransfer6.mmISA, PEPISATransfer6.mmPEP, PreviousYear1Choice.mmAllPreviousYears, ISAYearsOfIssue4.mmPreviousYears, PEPISATransfer8.mmISA, PEPISATransfer8.mmPEP,
						PEPISATransfer7.mmProductTransfer, PEPISATransfer11.mmProductTransfer, ISATransfer9.mmProductTransfer, PEPISATransfer2.mmISA, PEPISATransfer2.mmPEP, ISAYearsOfIssue3.mmPreviousYears, PEPISATransfer4.mmISA,
						PEPISATransfer4.mmPEP, ISAYearsOfIssue5.mmPreviousYears, PEPISATransfer3.mmISA, PEPISATransfer3.mmPEP, ISAYearsOfIssue2.mmPreviousYears, PEPISATransfer5.mmISA, PEPISATransfer5.mmPEP,
						ISAYearsOfIssue6.mmPreviousYears, PEPOrISAChoice.mmISA, PEPOrISAChoice.mmPEP, ISATransfer12.mmProductTransferAndReference, ISATransfer17.mmProductTransfer, ISATransfer20.mmProductTransfer,
						ISATransfer19.mmProductTransferAndReference, ISATransfer25.mmProductTransfer, ISATransfer24.mmProductTransferAndReference, PreviousYear2Choice.mmAllPreviousYears, ISAYearsOfIssue7.mmPreviousYears);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioTransfer.mmTransferredYear, com.tools20022.repository.entity.PortfolioTransfer.mmCashComponentIndicator,
						com.tools20022.repository.entity.PortfolioTransfer.mmAccountFrom, com.tools20022.repository.entity.PortfolioTransfer.mmAccountTo, com.tools20022.repository.entity.PortfolioTransfer.mmPaymentObligation,
						com.tools20022.repository.entity.PortfolioTransfer.mmTransferredPortfolio, com.tools20022.repository.entity.PortfolioTransfer.mmSecuritiesDeliveryObligation,
						com.tools20022.repository.entity.PortfolioTransfer.mmTransferredAmount, com.tools20022.repository.entity.PortfolioTransfer.mmTransferredPercentage, com.tools20022.repository.entity.PortfolioTransfer.mmTransferDate,
						com.tools20022.repository.entity.PortfolioTransfer.mmNomineeAccount, com.tools20022.repository.entity.PortfolioTransfer.mmPEPOrISAPlan, com.tools20022.repository.entity.PortfolioTransfer.mmCurrentYearISAType);
				derivationComponent_lazy = () -> Arrays.asList(PreviousYearChoice.mmObject(), ISAYearsOfIssue.mmObject(), PEPISATransfer1.mmObject(), PreviousYear1.mmObject(), ISAYearsOfIssue1.mmObject(), PEPISATransfer6.mmObject(),
						CurrentYearType1Choice.mmObject(), PreviousYear1Choice.mmObject(), PreviousYear2.mmObject(), ISAYearsOfIssue4.mmObject(), ISATransfer4.mmObject(), ISATransfer6.mmObject(), PEPISATransfer8.mmObject(),
						PEPISATransfer7.mmObject(), ISATransfer3.mmObject(), PEPISATransfer11.mmObject(), ISATransfer8.mmObject(), ISATransfer9.mmObject(), PEPISATransfer2.mmObject(), ISAYearsOfIssue3.mmObject(),
						PEPISATransfer4.mmObject(), PreviousYear3.mmObject(), ISAYearsOfIssue5.mmObject(), ISATransfer2.mmObject(), ISATransfer10.mmObject(), PEPISATransfer3.mmObject(), ISATransfer1.mmObject(), ISATransfer7.mmObject(),
						ISAYearsOfIssue2.mmObject(), PEPISATransfer5.mmObject(), CurrentYearType2Choice.mmObject(), ISAYearsOfIssue6.mmObject(), ISATransfer5.mmObject(), PEPOrISAChoice.mmObject(), PEPISACashTransfer1.mmObject(),
						PEPISACashTransfer2.mmObject(), ISATransfer15.mmObject(), ISATransfer16.mmObject(), ISATransfer13.mmObject(), ISATransfer14.mmObject(), ISATransfer12.mmObject(), ISATransfer17.mmObject(), ISATransfer21.mmObject(),
						ISATransfer18.mmObject(), ISATransfer20.mmObject(), ISATransfer19.mmObject(), ISATransfer23.mmObject(), ISATransfer26.mmObject(), ISATransfer27.mmObject(), ISATransfer22.mmObject(), ISATransfer25.mmObject(),
						ISATransfer24.mmObject(), ISATransfer30.mmObject(), ISATransfer29.mmObject(), ISATransfer28.mmObject(), ISATransfer31.mmObject(), PreviousYear2Choice.mmObject(), ISAYearsOfIssue7.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PortfolioTransfer.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISOYear getTransferredYear() {
		return transferredYear;
	}

	public PortfolioTransfer setTransferredYear(ISOYear transferredYear) {
		this.transferredYear = Objects.requireNonNull(transferredYear);
		return this;
	}

	public YesNoIndicator getCashComponentIndicator() {
		return cashComponentIndicator;
	}

	public PortfolioTransfer setCashComponentIndicator(YesNoIndicator cashComponentIndicator) {
		this.cashComponentIndicator = Objects.requireNonNull(cashComponentIndicator);
		return this;
	}

	public List<InvestmentAccount> getAccountFrom() {
		return accountFrom == null ? accountFrom = new ArrayList<>() : accountFrom;
	}

	public PortfolioTransfer setAccountFrom(List<InvestmentAccount> accountFrom) {
		this.accountFrom = Objects.requireNonNull(accountFrom);
		return this;
	}

	public List<InvestmentAccount> getAccountTo() {
		return accountTo == null ? accountTo = new ArrayList<>() : accountTo;
	}

	public PortfolioTransfer setAccountTo(List<InvestmentAccount> accountTo) {
		this.accountTo = Objects.requireNonNull(accountTo);
		return this;
	}

	public List<PaymentObligation> getPaymentObligation() {
		return paymentObligation == null ? paymentObligation = new ArrayList<>() : paymentObligation;
	}

	public PortfolioTransfer setPaymentObligation(List<PaymentObligation> paymentObligation) {
		this.paymentObligation = Objects.requireNonNull(paymentObligation);
		return this;
	}

	public List<Portfolio> getTransferredPortfolio() {
		return transferredPortfolio == null ? transferredPortfolio = new ArrayList<>() : transferredPortfolio;
	}

	public PortfolioTransfer setTransferredPortfolio(List<Portfolio> transferredPortfolio) {
		this.transferredPortfolio = Objects.requireNonNull(transferredPortfolio);
		return this;
	}

	public List<SecuritiesDeliveryObligation> getSecuritiesDeliveryObligation() {
		return securitiesDeliveryObligation == null ? securitiesDeliveryObligation = new ArrayList<>() : securitiesDeliveryObligation;
	}

	public PortfolioTransfer setSecuritiesDeliveryObligation(List<SecuritiesDeliveryObligation> securitiesDeliveryObligation) {
		this.securitiesDeliveryObligation = Objects.requireNonNull(securitiesDeliveryObligation);
		return this;
	}

	public CurrencyAndAmount getTransferredAmount() {
		return transferredAmount;
	}

	public PortfolioTransfer setTransferredAmount(CurrencyAndAmount transferredAmount) {
		this.transferredAmount = Objects.requireNonNull(transferredAmount);
		return this;
	}

	public PercentageRate getTransferredPercentage() {
		return transferredPercentage;
	}

	public PortfolioTransfer setTransferredPercentage(PercentageRate transferredPercentage) {
		this.transferredPercentage = Objects.requireNonNull(transferredPercentage);
		return this;
	}

	public ISODateTime getTransferDate() {
		return transferDate;
	}

	public PortfolioTransfer setTransferDate(ISODateTime transferDate) {
		this.transferDate = Objects.requireNonNull(transferDate);
		return this;
	}

	public InvestmentAccount getNomineeAccount() {
		return nomineeAccount;
	}

	public PortfolioTransfer setNomineeAccount(InvestmentAccount nomineeAccount) {
		this.nomineeAccount = Objects.requireNonNull(nomineeAccount);
		return this;
	}

	public PEPISACode getPEPOrISAPlan() {
		return pEPOrISAPlan;
	}

	public PortfolioTransfer setPEPOrISAPlan(PEPISACode pEPOrISAPlan) {
		this.pEPOrISAPlan = Objects.requireNonNull(pEPOrISAPlan);
		return this;
	}

	public ISATypeCode getCurrentYearISAType() {
		return currentYearISAType;
	}

	public PortfolioTransfer setCurrentYearISAType(ISATypeCode currentYearISAType) {
		this.currentYearISAType = Objects.requireNonNull(currentYearISAType);
		return this;
	}
}