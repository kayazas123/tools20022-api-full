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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PriceFormatSD1Choice;
import com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code;
import com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action option cash
 * movement details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD2#mmPlaceAndName
 * CashOptionSD2.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmReinvestmentIncomeClassification
 * CashOptionSD2.mmReinvestmentIncomeClassification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD2#mmDTCPayMethod
 * CashOptionSD2.mmDTCPayMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD2#mmDTCPayOrder
 * CashOptionSD2.mmDTCPayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmEntitlementCalculationMethod
 * CashOptionSD2.mmEntitlementCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmEstimatedRateFlag
 * CashOptionSD2.mmEstimatedRateFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmNRATaxReportableFlag
 * CashOptionSD2.mmNRATaxReportableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmProtectChargeFlag
 * CashOptionSD2.mmProtectChargeFlag}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD2#mmCSDCashRate
 * CashOptionSD2.mmCSDCashRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD2#mmDTCFeeRate
 * CashOptionSD2.mmDTCFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD2#mmDTCUSTaxInstructionPeriod
 * CashOptionSD2.mmDTCUSTaxInstructionPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashOptionSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option cash movement details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD7 CashOptionSD7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashOptionSD2", propOrder = {"placeAndName", "reinvestmentIncomeClassification", "dTCPayMethod", "dTCPayOrder", "entitlementCalculationMethod", "estimatedRateFlag", "nRATaxReportableFlag", "protectChargeFlag",
		"cSDCashRate", "dTCFeeRate", "dTCUSTaxInstructionPeriod"})
public class CashOptionSD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2 CashOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmPlaceAndName
	 * CashOptionSD7.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD7.mmPlaceAndName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "RinvstmtIncmClssfctn")
	protected ReinvestmentIncomeClassification1Code reinvestmentIncomeClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2 CashOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtIncmClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Reinvestment Income Classification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentIncomeClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Income classification of the cash proceeds for dividend reinvestment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReinvestmentIncomeClassification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtIncmClssfctn";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Reinvestment Income Classification"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentIncomeClassification";
			definition = "Income classification of the cash proceeds for dividend reinvestment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReinvestmentIncomeClassification1Code.mmObject();
		}
	};
	@XmlElement(name = "DTCPayMtd")
	protected Max3Text dTCPayMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Text
	 * Max3Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2 CashOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPayMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Pay Method</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCPayMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of payment. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmDTCPayMethod
	 * CashOptionSD7.mmDTCPayMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPayMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "DTCPayMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Pay Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayMethod";
			definition = "Indicates the type of payment. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD7.mmDTCPayMethod);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}
	};
	@XmlElement(name = "DTCPayOrdr")
	protected Max3Text dTCPayOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Text
	 * Max3Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2 CashOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPayOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Pay Order</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCPayOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmDTCPayOrder
	 * CashOptionSD7.mmDTCPayOrder}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCPayOrder = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "DTCPayOrdr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Pay Order"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayOrder";
			definition = "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD7.mmDTCPayOrder);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}
	};
	@XmlElement(name = "EntitlmntClctnMtd")
	protected DTCEntitlementCalculationMethod1Code entitlementCalculationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2 CashOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitlmntClctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Entitlement Calculation Method</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementCalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how the entitlements were calculated optional dividends."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmEntitlementCalculationMethod
	 * CashOptionSD7.mmEntitlementCalculationMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntitlementCalculationMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntClctnMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Entitlement Calculation Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementCalculationMethod";
			definition = "Indicates how the entitlements were calculated optional dividends.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD7.mmEntitlementCalculationMethod);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCEntitlementCalculationMethod1Code.mmObject();
		}
	};
	@XmlElement(name = "EstmtdRateFlg")
	protected YesNoIndicator estimatedRateFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2 CashOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdRateFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Estimated Rate Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedRateFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denotes whether the rate is approximate."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmEstimatedRateFlag
	 * CashOptionSD7.mmEstimatedRateFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEstimatedRateFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "EstmtdRateFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Estimated Rate Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedRateFlag";
			definition = "Denotes whether the rate is approximate.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD7.mmEstimatedRateFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "NRATaxRptblFlg")
	protected YesNoIndicator nRATaxReportableFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2 CashOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NRATaxRptblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: NRA Tax Reportable Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NRATaxReportableFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the income events which are subject to withholding tax if paid to a non-U.S. resident alien (NRA)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmNRATaxReportableFlag
	 * CashOptionSD7.mmNRATaxReportableFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNRATaxReportableFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "NRATaxRptblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "NRA Tax Reportable Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NRATaxReportableFlag";
			definition = "Identifies the income events which are subject to withholding tax if paid to a non-U.S. resident alien (NRA).";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD7.mmNRATaxReportableFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PrtctChrgFlg")
	protected YesNoIndicator protectChargeFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2 CashOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctChrgFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Protect Charge Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectChargeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a charge is levied on the protect instructions at the time when the protect is submitted or at the time of the cover. Applies to warrants or rights exercise scenario where the holder must put up money with rights or warrants execution. When this flag is set to yes - charges are due at the time of the protect, when it is set to \"no\" changes are due when protect is covered."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmProtectChargeFlag
	 * CashOptionSD7.mmProtectChargeFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectChargeFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "PrtctChrgFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Protect Charge Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectChargeFlag";
			definition = "Indicates whether a charge is levied on the protect instructions at the time when the protect is submitted or at the time of the cover. Applies to warrants or rights exercise scenario where the holder must put up money with rights or warrants execution. When this flag is set to yes - charges are due at the time of the protect, when it is set to \"no\" changes are due when protect is covered.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD7.mmProtectChargeFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "CSDCshRate")
	protected PriceFormatSD1Choice cSDCashRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD1Choice
	 * PriceFormatSD1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2 CashOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSDCshRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Cash Rate</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDCashRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corresponding cash rate paid by CSD."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmCSDCashRate
	 * CashOptionSD7.mmCSDCashRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCSDCashRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "CSDCshRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Cash Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDCashRate";
			definition = "Corresponding cash rate paid by CSD.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD7.mmCSDCashRate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD1Choice.mmObject();
		}
	};
	@XmlElement(name = "DTCFeeRate")
	protected PriceFormatSD1Choice dTCFeeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD1Choice
	 * PriceFormatSD1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2 CashOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Fee Rate, DTCCSynonym: Currency (DTC
	 * Fee Rate)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which a fee will be charged to a DTC (The Depository Trust Corporation) participant."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD7#mmDTCFeeRate
	 * CashOptionSD7.mmDTCFeeRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCFeeRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "DTCFeeRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Fee Rate"), new DTCCSynonym(this, "Currency (DTC Fee Rate)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCFeeRate";
			definition = "Rate at which a fee will be charged to a DTC (The Depository Trust Corporation) participant.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD7.mmDTCFeeRate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD1Choice.mmObject();
		}
	};
	@XmlElement(name = "DTCUSTaxInstrPrd")
	protected Period3 dTCUSTaxInstructionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period3 Period3}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD2 CashOptionSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCUSTaxInstrPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC NRA Tax Instruction Expiration Date,
	 * DTCCSynonym: DTC NRA Tax Instruction Start Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCUSTaxInstructionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the period during which the instructions for DTC (The Depository Trust Corporation) US Tax service will be accepted."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD7#mmDTCUSTaxInstructionPeriod
	 * CashOptionSD7.mmDTCUSTaxInstructionPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCUSTaxInstructionPeriod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD2.mmObject();
			isDerived = false;
			xmlTag = "DTCUSTaxInstrPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC NRA Tax Instruction Expiration Date"), new DTCCSynonym(this, "DTC NRA Tax Instruction Start Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCUSTaxInstructionPeriod";
			definition = "Indicates the period during which the instructions for DTC (The Depository Trust Corporation) US Tax service will be accepted.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD7.mmDTCUSTaxInstructionPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOptionSD2.mmPlaceAndName, com.tools20022.repository.msg.CashOptionSD2.mmReinvestmentIncomeClassification,
						com.tools20022.repository.msg.CashOptionSD2.mmDTCPayMethod, com.tools20022.repository.msg.CashOptionSD2.mmDTCPayOrder, com.tools20022.repository.msg.CashOptionSD2.mmEntitlementCalculationMethod,
						com.tools20022.repository.msg.CashOptionSD2.mmEstimatedRateFlag, com.tools20022.repository.msg.CashOptionSD2.mmNRATaxReportableFlag, com.tools20022.repository.msg.CashOptionSD2.mmProtectChargeFlag,
						com.tools20022.repository.msg.CashOptionSD2.mmCSDCashRate, com.tools20022.repository.msg.CashOptionSD2.mmDTCFeeRate, com.tools20022.repository.msg.CashOptionSD2.mmDTCUSTaxInstructionPeriod);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CashOptionSD2";
				definition = "Provides additional information regarding corporate action option cash movement details.";
				nextVersions_lazy = () -> Arrays.asList(CashOptionSD7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CashOptionSD2 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<ReinvestmentIncomeClassification1Code> getReinvestmentIncomeClassification() {
		return reinvestmentIncomeClassification == null ? Optional.empty() : Optional.of(reinvestmentIncomeClassification);
	}

	public CashOptionSD2 setReinvestmentIncomeClassification(ReinvestmentIncomeClassification1Code reinvestmentIncomeClassification) {
		this.reinvestmentIncomeClassification = reinvestmentIncomeClassification;
		return this;
	}

	public Optional<Max3Text> getDTCPayMethod() {
		return dTCPayMethod == null ? Optional.empty() : Optional.of(dTCPayMethod);
	}

	public CashOptionSD2 setDTCPayMethod(Max3Text dTCPayMethod) {
		this.dTCPayMethod = dTCPayMethod;
		return this;
	}

	public Optional<Max3Text> getDTCPayOrder() {
		return dTCPayOrder == null ? Optional.empty() : Optional.of(dTCPayOrder);
	}

	public CashOptionSD2 setDTCPayOrder(Max3Text dTCPayOrder) {
		this.dTCPayOrder = dTCPayOrder;
		return this;
	}

	public Optional<DTCEntitlementCalculationMethod1Code> getEntitlementCalculationMethod() {
		return entitlementCalculationMethod == null ? Optional.empty() : Optional.of(entitlementCalculationMethod);
	}

	public CashOptionSD2 setEntitlementCalculationMethod(DTCEntitlementCalculationMethod1Code entitlementCalculationMethod) {
		this.entitlementCalculationMethod = entitlementCalculationMethod;
		return this;
	}

	public Optional<YesNoIndicator> getEstimatedRateFlag() {
		return estimatedRateFlag == null ? Optional.empty() : Optional.of(estimatedRateFlag);
	}

	public CashOptionSD2 setEstimatedRateFlag(YesNoIndicator estimatedRateFlag) {
		this.estimatedRateFlag = estimatedRateFlag;
		return this;
	}

	public Optional<YesNoIndicator> getNRATaxReportableFlag() {
		return nRATaxReportableFlag == null ? Optional.empty() : Optional.of(nRATaxReportableFlag);
	}

	public CashOptionSD2 setNRATaxReportableFlag(YesNoIndicator nRATaxReportableFlag) {
		this.nRATaxReportableFlag = nRATaxReportableFlag;
		return this;
	}

	public Optional<YesNoIndicator> getProtectChargeFlag() {
		return protectChargeFlag == null ? Optional.empty() : Optional.of(protectChargeFlag);
	}

	public CashOptionSD2 setProtectChargeFlag(YesNoIndicator protectChargeFlag) {
		this.protectChargeFlag = protectChargeFlag;
		return this;
	}

	public Optional<PriceFormatSD1Choice> getCSDCashRate() {
		return cSDCashRate == null ? Optional.empty() : Optional.of(cSDCashRate);
	}

	public CashOptionSD2 setCSDCashRate(PriceFormatSD1Choice cSDCashRate) {
		this.cSDCashRate = cSDCashRate;
		return this;
	}

	public Optional<PriceFormatSD1Choice> getDTCFeeRate() {
		return dTCFeeRate == null ? Optional.empty() : Optional.of(dTCFeeRate);
	}

	public CashOptionSD2 setDTCFeeRate(PriceFormatSD1Choice dTCFeeRate) {
		this.dTCFeeRate = dTCFeeRate;
		return this;
	}

	public Optional<Period3> getDTCUSTaxInstructionPeriod() {
		return dTCUSTaxInstructionPeriod == null ? Optional.empty() : Optional.of(dTCUSTaxInstructionPeriod);
	}

	public CashOptionSD2 setDTCUSTaxInstructionPeriod(com.tools20022.repository.msg.Period3 dTCUSTaxInstructionPeriod) {
		this.dTCUSTaxInstructionPeriod = dTCUSTaxInstructionPeriod;
		return this;
	}
}