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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.IssuerTaxability1Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateActionPrice37;
import com.tools20022.repository.msg.CorporateActionRate33;
import com.tools20022.repository.msg.FinancialInstrumentAttributes40;
import com.tools20022.repository.msg.SecurityDate8;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the corporate action security option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmSecurityDetails
 * SecuritiesOption30.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmCreditDebitIndicator
 * SecuritiesOption30.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmTemporaryFinancialInstrumentIndicator
 * SecuritiesOption30.mmTemporaryFinancialInstrumentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmNonEligibleProceedsIndicator
 * SecuritiesOption30.mmNonEligibleProceedsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmIssuerOfferorTaxabilityIndicator
 * SecuritiesOption30.mmIssuerOfferorTaxabilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmEntitledQuantity
 * SecuritiesOption30.mmEntitledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmFractionDisposition
 * SecuritiesOption30.mmFractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmCurrencyOption
 * SecuritiesOption30.mmCurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmTradingPeriod
 * SecuritiesOption30.mmTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmDateDetails
 * SecuritiesOption30.mmDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmRateDetails
 * SecuritiesOption30.mmRateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30#mmPriceDetails
 * SecuritiesOption30.mmPriceDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesOption30"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the corporate action security option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forSecuritiesOption30
 * ConstraintCoexistenceQuantityRule.forSecuritiesOption30}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption30
 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption30}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesOption30", propOrder = {"securityDetails", "creditDebitIndicator", "temporaryFinancialInstrumentIndicator", "nonEligibleProceedsIndicator", "issuerOfferorTaxabilityIndicator", "entitledQuantity",
		"fractionDisposition", "currencyOption", "tradingPeriod", "dateDetails", "rateDetails", "priceDetails"})
public class SecuritiesOption30 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctyDtls", required = true)
	protected FinancialInstrumentAttributes40 securityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40
	 * FinancialInstrumentAttributes40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
	 * CorporateActionEvent.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30
	 * SecuritiesOption30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides description of the financial instrument related to securities movement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R::FIA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption30, FinancialInstrumentAttributes40> mmSecurityDetails = new MMMessageAssociationEnd<SecuritiesOption30, FinancialInstrumentAttributes40>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnderlyingSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption30.mmObject();
			isDerived = false;
			xmlTag = "SctyDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R::FIA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDetails";
			definition = "Provides description of the financial instrument related to securities movement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes40.mmObject();
		}

		@Override
		public FinancialInstrumentAttributes40 getValue(SecuritiesOption30 obj) {
			return obj.getSecurityDetails();
		}

		@Override
		public void setValue(SecuritiesOption30 obj, FinancialInstrumentAttributes40 value) {
			obj.setSecurityDetails(value);
		}
	};
	@XmlElement(name = "CdtDbtInd", required = true)
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCreditDebitIndicator
	 * ProceedsDefinition.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30
	 * SecuritiesOption30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the value is a debit or credit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::CRDB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesOption30, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<SecuritiesOption30, CreditDebitCode>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption30.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::CRDB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies whether the value is a debit or credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public CreditDebitCode getValue(SecuritiesOption30 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(SecuritiesOption30 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "TempFinInstrmInd")
	protected TemporaryFinancialInstrumentIndicator2Choice temporaryFinancialInstrumentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator2Choice
	 * TemporaryFinancialInstrumentIndicator2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTemporaryFinancialInstrumentIndicator
	 * Security.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30
	 * SecuritiesOption30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TempFinInstrmInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TemporaryFinancialInstrumentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the security identified is a temporary security identification used for processing reasons, for example, contra security used in the US."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TEMP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption30, Optional<TemporaryFinancialInstrumentIndicator2Choice>> mmTemporaryFinancialInstrumentIndicator = new MMMessageAssociationEnd<SecuritiesOption30, Optional<TemporaryFinancialInstrumentIndicator2Choice>>() {
		{
			businessElementTrace_lazy = () -> Security.mmTemporaryFinancialInstrumentIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption30.mmObject();
			isDerived = false;
			xmlTag = "TempFinInstrmInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TEMP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TemporaryFinancialInstrumentIndicator";
			definition = "Specifies that the security identified is a temporary security identification used for processing reasons, for example, contra security used in the US.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TemporaryFinancialInstrumentIndicator2Choice.mmObject();
		}

		@Override
		public Optional<TemporaryFinancialInstrumentIndicator2Choice> getValue(SecuritiesOption30 obj) {
			return obj.getTemporaryFinancialInstrumentIndicator();
		}

		@Override
		public void setValue(SecuritiesOption30 obj, Optional<TemporaryFinancialInstrumentIndicator2Choice> value) {
			obj.setTemporaryFinancialInstrumentIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NonElgblPrcdsInd")
	protected NonEligibleProceedsIndicator2Choice nonEligibleProceedsIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator2Choice
	 * NonEligibleProceedsIndicator2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmNonEligibleProceedsIndicator
	 * ProceedsDefinition.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30
	 * SecuritiesOption30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonElgblPrcdsInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEligibleProceedsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information regarding outturn resources that cannot be processed by the Central Securities Depository (CSD). Special delivery instruction is required from the account owner for the corporate action outcome to be credited."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::NELP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption30, Optional<NonEligibleProceedsIndicator2Choice>> mmNonEligibleProceedsIndicator = new MMMessageAssociationEnd<SecuritiesOption30, Optional<NonEligibleProceedsIndicator2Choice>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmNonEligibleProceedsIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption30.mmObject();
			isDerived = false;
			xmlTag = "NonElgblPrcdsInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::NELP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEligibleProceedsIndicator";
			definition = "Specifies information regarding outturn resources that cannot be processed by the Central Securities Depository (CSD). Special delivery instruction is required from the account owner for the corporate action outcome to be credited.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NonEligibleProceedsIndicator2Choice.mmObject();
		}

		@Override
		public Optional<NonEligibleProceedsIndicator2Choice> getValue(SecuritiesOption30 obj) {
			return obj.getNonEligibleProceedsIndicator();
		}

		@Override
		public void setValue(SecuritiesOption30 obj, Optional<NonEligibleProceedsIndicator2Choice> value) {
			obj.setNonEligibleProceedsIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrOfferrTaxbltyInd")
	protected IssuerTaxability1Code issuerOfferorTaxabilityIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerTaxability1Code
	 * IssuerTaxability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmIssuerOfferorTaxabilityIndicator
	 * ProceedsDefinition.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30
	 * SecuritiesOption30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrOfferrTaxbltyInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proceeds are taxable according to the information provided by the issuer / offeror."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesOption30, Optional<IssuerTaxability1Code>> mmIssuerOfferorTaxabilityIndicator = new MMMessageAttribute<SecuritiesOption30, Optional<IssuerTaxability1Code>>() {
		{
			businessElementTrace_lazy = () -> ProceedsDefinition.mmIssuerOfferorTaxabilityIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption30.mmObject();
			isDerived = false;
			xmlTag = "IssrOfferrTaxbltyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicator";
			definition = "Proceeds are taxable according to the information provided by the issuer / offeror.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IssuerTaxability1Code.mmObject();
		}

		@Override
		public Optional<IssuerTaxability1Code> getValue(SecuritiesOption30 obj) {
			return obj.getIssuerOfferorTaxabilityIndicator();
		}

		@Override
		public void setValue(SecuritiesOption30 obj, Optional<IssuerTaxability1Code> value) {
			obj.setIssuerOfferorTaxabilityIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "EntitldQty")
	protected Quantity10Choice entitledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity10Choice
	 * Quantity10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmEntitledSecuritiesQuantity
	 * CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30
	 * SecuritiesOption30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitldQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities based on the terms of the corporate action event and balance of underlying securities entitled to the account owner. (This quantity can be positive or negative)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::ENTL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption30, Optional<Quantity10Choice>> mmEntitledQuantity = new MMMessageAssociationEnd<SecuritiesOption30, Optional<Quantity10Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionSecuritiesEntitlement.mmEntitledSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption30.mmObject();
			isDerived = false;
			xmlTag = "EntitldQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::ENTL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitledQuantity";
			definition = "Quantity of securities based on the terms of the corporate action event and balance of underlying securities entitled to the account owner. (This quantity can be positive or negative).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Quantity10Choice.mmObject();
		}

		@Override
		public Optional<Quantity10Choice> getValue(SecuritiesOption30 obj) {
			return obj.getEntitledQuantity();
		}

		@Override
		public void setValue(SecuritiesOption30 obj, Optional<Quantity10Choice> value) {
			obj.setEntitledQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "FrctnDspstn")
	protected FractionDispositionType6Choice fractionDisposition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType6Choice
	 * FractionDispositionType6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmFractionDisposition
	 * CorporateActionOption.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30
	 * SecuritiesOption30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrctnDspstn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionDisposition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DISF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption30, Optional<FractionDispositionType6Choice>> mmFractionDisposition = new MMMessageAssociationEnd<SecuritiesOption30, Optional<FractionDispositionType6Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmFractionDisposition;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption30.mmObject();
			isDerived = false;
			xmlTag = "FrctnDspstn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DISF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionDisposition";
			definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FractionDispositionType6Choice.mmObject();
		}

		@Override
		public Optional<FractionDispositionType6Choice> getValue(SecuritiesOption30 obj) {
			return obj.getFractionDisposition();
		}

		@Override
		public void setValue(SecuritiesOption30 obj, Optional<FractionDispositionType6Choice> value) {
			obj.setFractionDisposition(value.orElse(null));
		}
	};
	@XmlElement(name = "CcyOptn")
	protected ActiveCurrencyCode currencyOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCurrencyOption
	 * CorporateActionOption.mmCurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30
	 * SecuritiesOption30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyOptn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the cash disbursed from an interest or dividend payment is offered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :11A::OPTN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesOption30, Optional<ActiveCurrencyCode>> mmCurrencyOption = new MMMessageAttribute<SecuritiesOption30, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmCurrencyOption;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption30.mmObject();
			isDerived = false;
			xmlTag = "CcyOptn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":11A::OPTN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyOption";
			definition = "Currency in which the cash disbursed from an interest or dividend payment is offered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(SecuritiesOption30 obj) {
			return obj.getCurrencyOption();
		}

		@Override
		public void setValue(SecuritiesOption30 obj, Optional<ActiveCurrencyCode> value) {
			obj.setCurrencyOption(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgPrd")
	protected Period3Choice tradingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period3Choice
	 * Period3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTradingPeriod
	 * CorporateActionEvent.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30
	 * SecuritiesOption30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which intermediate or outturn securities are tradable in a secondary market."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::TRDP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption30, Optional<Period3Choice>> mmTradingPeriod = new MMMessageAssociationEnd<SecuritiesOption30, Optional<Period3Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmTradingPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption30.mmObject();
			isDerived = false;
			xmlTag = "TradgPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::TRDP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which intermediate or outturn securities are tradable in a secondary market.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period3Choice.mmObject();
		}

		@Override
		public Optional<Period3Choice> getValue(SecuritiesOption30 obj) {
			return obj.getTradingPeriod();
		}

		@Override
		public void setValue(SecuritiesOption30 obj, Optional<Period3Choice> value) {
			obj.setTradingPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "DtDtls", required = true)
	protected SecurityDate8 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityDate8
	 * SecurityDate8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmUnderlyingSecurity
	 * CorporateActionEvent.mmUnderlyingSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30
	 * SecuritiesOption30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the dates related to securities movement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption30, SecurityDate8> mmDateDetails = new MMMessageAssociationEnd<SecuritiesOption30, SecurityDate8>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmUnderlyingSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption30.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to securities movement.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityDate8.mmObject();
		}

		@Override
		public SecurityDate8 getValue(SecuritiesOption30 obj) {
			return obj.getDateDetails();
		}

		@Override
		public void setValue(SecuritiesOption30 obj, SecurityDate8 value) {
			obj.setDateDetails(value);
		}
	};
	@XmlElement(name = "RateDtls")
	protected CorporateActionRate33 rateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionRate33
	 * CorporateActionRate33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30
	 * SecuritiesOption30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the rates related to securities movement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption30, Optional<CorporateActionRate33>> mmRateDetails = new MMMessageAssociationEnd<SecuritiesOption30, Optional<CorporateActionRate33>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption30.mmObject();
			isDerived = false;
			xmlTag = "RateDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateDetails";
			definition = "Provides information about the rates related to securities movement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionRate33.mmObject();
		}

		@Override
		public Optional<CorporateActionRate33> getValue(SecuritiesOption30 obj) {
			return obj.getRateDetails();
		}

		@Override
		public void setValue(SecuritiesOption30 obj, Optional<CorporateActionRate33> value) {
			obj.setRateDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected CorporateActionPrice37 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionPrice37
	 * CorporateActionPrice37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30
	 * SecuritiesOption30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the prices related to securities movement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesOption30, Optional<CorporateActionPrice37>> mmPriceDetails = new MMMessageAssociationEnd<SecuritiesOption30, Optional<CorporateActionPrice37>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesOption30.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Provides information about the prices related to securities movement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionPrice37.mmObject();
		}

		@Override
		public Optional<CorporateActionPrice37> getValue(SecuritiesOption30 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(SecuritiesOption30 obj, Optional<CorporateActionPrice37> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption30.mmSecurityDetails, com.tools20022.repository.msg.SecuritiesOption30.mmCreditDebitIndicator,
						com.tools20022.repository.msg.SecuritiesOption30.mmTemporaryFinancialInstrumentIndicator, com.tools20022.repository.msg.SecuritiesOption30.mmNonEligibleProceedsIndicator,
						com.tools20022.repository.msg.SecuritiesOption30.mmIssuerOfferorTaxabilityIndicator, com.tools20022.repository.msg.SecuritiesOption30.mmEntitledQuantity,
						com.tools20022.repository.msg.SecuritiesOption30.mmFractionDisposition, com.tools20022.repository.msg.SecuritiesOption30.mmCurrencyOption, com.tools20022.repository.msg.SecuritiesOption30.mmTradingPeriod,
						com.tools20022.repository.msg.SecuritiesOption30.mmDateDetails, com.tools20022.repository.msg.SecuritiesOption30.mmRateDetails, com.tools20022.repository.msg.SecuritiesOption30.mmPriceDetails);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forSecuritiesOption30,
						com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption30);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SecuritiesOption30";
				definition = "Provides information about the corporate action security option.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentAttributes40 getSecurityDetails() {
		return securityDetails;
	}

	public SecuritiesOption30 setSecurityDetails(FinancialInstrumentAttributes40 securityDetails) {
		this.securityDetails = Objects.requireNonNull(securityDetails);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public SecuritiesOption30 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<TemporaryFinancialInstrumentIndicator2Choice> getTemporaryFinancialInstrumentIndicator() {
		return temporaryFinancialInstrumentIndicator == null ? Optional.empty() : Optional.of(temporaryFinancialInstrumentIndicator);
	}

	public SecuritiesOption30 setTemporaryFinancialInstrumentIndicator(TemporaryFinancialInstrumentIndicator2Choice temporaryFinancialInstrumentIndicator) {
		this.temporaryFinancialInstrumentIndicator = temporaryFinancialInstrumentIndicator;
		return this;
	}

	public Optional<NonEligibleProceedsIndicator2Choice> getNonEligibleProceedsIndicator() {
		return nonEligibleProceedsIndicator == null ? Optional.empty() : Optional.of(nonEligibleProceedsIndicator);
	}

	public SecuritiesOption30 setNonEligibleProceedsIndicator(NonEligibleProceedsIndicator2Choice nonEligibleProceedsIndicator) {
		this.nonEligibleProceedsIndicator = nonEligibleProceedsIndicator;
		return this;
	}

	public Optional<IssuerTaxability1Code> getIssuerOfferorTaxabilityIndicator() {
		return issuerOfferorTaxabilityIndicator == null ? Optional.empty() : Optional.of(issuerOfferorTaxabilityIndicator);
	}

	public SecuritiesOption30 setIssuerOfferorTaxabilityIndicator(IssuerTaxability1Code issuerOfferorTaxabilityIndicator) {
		this.issuerOfferorTaxabilityIndicator = issuerOfferorTaxabilityIndicator;
		return this;
	}

	public Optional<Quantity10Choice> getEntitledQuantity() {
		return entitledQuantity == null ? Optional.empty() : Optional.of(entitledQuantity);
	}

	public SecuritiesOption30 setEntitledQuantity(Quantity10Choice entitledQuantity) {
		this.entitledQuantity = entitledQuantity;
		return this;
	}

	public Optional<FractionDispositionType6Choice> getFractionDisposition() {
		return fractionDisposition == null ? Optional.empty() : Optional.of(fractionDisposition);
	}

	public SecuritiesOption30 setFractionDisposition(FractionDispositionType6Choice fractionDisposition) {
		this.fractionDisposition = fractionDisposition;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrencyOption() {
		return currencyOption == null ? Optional.empty() : Optional.of(currencyOption);
	}

	public SecuritiesOption30 setCurrencyOption(ActiveCurrencyCode currencyOption) {
		this.currencyOption = currencyOption;
		return this;
	}

	public Optional<Period3Choice> getTradingPeriod() {
		return tradingPeriod == null ? Optional.empty() : Optional.of(tradingPeriod);
	}

	public SecuritiesOption30 setTradingPeriod(Period3Choice tradingPeriod) {
		this.tradingPeriod = tradingPeriod;
		return this;
	}

	public SecurityDate8 getDateDetails() {
		return dateDetails;
	}

	public SecuritiesOption30 setDateDetails(SecurityDate8 dateDetails) {
		this.dateDetails = Objects.requireNonNull(dateDetails);
		return this;
	}

	public Optional<CorporateActionRate33> getRateDetails() {
		return rateDetails == null ? Optional.empty() : Optional.of(rateDetails);
	}

	public SecuritiesOption30 setRateDetails(CorporateActionRate33 rateDetails) {
		this.rateDetails = rateDetails;
		return this;
	}

	public Optional<CorporateActionPrice37> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public SecuritiesOption30 setPriceDetails(CorporateActionPrice37 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}
}