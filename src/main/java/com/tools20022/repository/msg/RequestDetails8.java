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
import com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV03;
import com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV03;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.SettlementTransactionCondition5Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Obligation;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification20;
import com.tools20022.repository.msg.HoldIndicator4;
import com.tools20022.repository.msg.Linkages16;
import com.tools20022.repository.msg.References9;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the settlement condition modification request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails8#mmReference
 * RequestDetails8.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmAutomaticBorrowing
 * RequestDetails8.mmAutomaticBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmRetainIndicator
 * RequestDetails8.mmRetainIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails8#mmLinkage
 * RequestDetails8.mmLinkage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails8#mmPriority
 * RequestDetails8.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmOtherProcessing
 * RequestDetails8.mmOtherProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmPartialSettlementIndicator
 * RequestDetails8.mmPartialSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmSecuritiesRTGS
 * RequestDetails8.mmSecuritiesRTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmHoldIndicator
 * RequestDetails8.mmHoldIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmMatchingDenial
 * RequestDetails8.mmMatchingDenial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestDetails8#mmUnilateralSplit
 * RequestDetails8.mmUnilateralSplit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails8#mmLinkages
 * RequestDetails8.mmLinkages}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdviceV03#mmRequestDetails
 * SecuritiesSettlementConditionModificationStatusAdviceV03.mmRequestDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionsModificationRequestV03#mmRequestDetails
 * SecuritiesSettlementConditionsModificationRequestV03.mmRequestDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestDetails8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the settlement condition modification request."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintModificationRequestPresenceRule#forRequestDetails8
 * ConstraintModificationRequestPresenceRule.forRequestDetails8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherProcessingRule#forRequestDetails8
 * ConstraintOtherProcessingRule.forRequestDetails8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementConditionModificationApplicabilityRule#forRequestDetails8
 * ConstraintSettlementConditionModificationApplicabilityRule.forRequestDetails8
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RequestDetails11
 * RequestDetails11}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.RequestDetails6
 * RequestDetails6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequestDetails8", propOrder = {"reference", "automaticBorrowing", "retainIndicator", "linkage", "priority", "otherProcessing", "partialSettlementIndicator", "securitiesRTGS", "holdIndicator", "matchingDenial",
		"unilateralSplit", "linkages"})
public class RequestDetails8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ref", required = true)
	protected References9 reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.References9
	 * References9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
	 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8
	 * RequestDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "References of the transaction for which the securities settlement condition modification is requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails8, References9> mmReference = new MMMessageAssociationEnd<RequestDetails8, References9>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails8.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "References of the transaction for which the securities settlement condition modification is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> References9.mmObject();
		}

		@Override
		public References9 getValue(RequestDetails8 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(RequestDetails8 obj, References9 value) {
			obj.setReference(value);
		}
	};
	@XmlElement(name = "AutomtcBrrwg")
	protected AutomaticBorrowing2Choice automaticBorrowing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AutomaticBorrowing2Choice
	 * AutomaticBorrowing2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAutomaticBorrowing
	 * SecuritiesSettlement.mmAutomaticBorrowing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8
	 * RequestDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AutomtcBrrwg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition for automatic borrowing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::BORR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails8, Optional<AutomaticBorrowing2Choice>> mmAutomaticBorrowing = new MMMessageAssociationEnd<RequestDetails8, Optional<AutomaticBorrowing2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmAutomaticBorrowing;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails8.mmObject();
			isDerived = false;
			xmlTag = "AutomtcBrrwg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::BORR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticBorrowing";
			definition = "Condition for automatic borrowing.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AutomaticBorrowing2Choice.mmObject();
		}

		@Override
		public Optional<AutomaticBorrowing2Choice> getValue(RequestDetails8 obj) {
			return obj.getAutomaticBorrowing();
		}

		@Override
		public void setValue(RequestDetails8 obj, Optional<AutomaticBorrowing2Choice> value) {
			obj.setAutomaticBorrowing(value.orElse(null));
		}
	};
	@XmlElement(name = "RtnInd")
	protected YesNoIndicator retainIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8
	 * RequestDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtnInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetainIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the instruction due to expire is confirmed for settlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CONP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestDetails8, Optional<YesNoIndicator>> mmRetainIndicator = new MMMessageAttribute<RequestDetails8, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails8.mmObject();
			isDerived = false;
			xmlTag = "RtnInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CONP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetainIndicator";
			definition = "Specifies whether the instruction due to expire is confirmed for settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(RequestDetails8 obj) {
			return obj.getRetainIndicator();
		}

		@Override
		public void setValue(RequestDetails8 obj, Optional<YesNoIndicator> value) {
			obj.setRetainIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Lkg")
	protected LinkageType1Choice linkage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.LinkageType1Choice
	 * LinkageType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8
	 * RequestDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lkg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of linkage requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LINK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails8, Optional<LinkageType1Choice>> mmLinkage = new MMMessageAssociationEnd<RequestDetails8, Optional<LinkageType1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails8.mmObject();
			isDerived = false;
			xmlTag = "Lkg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LINK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkage";
			definition = "Specifies the type of linkage requested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LinkageType1Choice.mmObject();
		}

		@Override
		public Optional<LinkageType1Choice> getValue(RequestDetails8 obj) {
			return obj.getLinkage();
		}

		@Override
		public void setValue(RequestDetails8 obj, Optional<LinkageType1Choice> value) {
			obj.setLinkage(value.orElse(null));
		}
	};
	@XmlElement(name = "Prty")
	protected PriorityNumeric1Choice priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric1Choice
	 * PriorityNumeric1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmPriority
	 * Obligation.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8
	 * RequestDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails8, Optional<PriorityNumeric1Choice>> mmPriority = new MMMessageAssociationEnd<RequestDetails8, Optional<PriorityNumeric1Choice>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails8.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriorityNumeric1Choice.mmObject();
		}

		@Override
		public Optional<PriorityNumeric1Choice> getValue(RequestDetails8 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(RequestDetails8 obj, Optional<PriorityNumeric1Choice> value) {
			obj.setPriority(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrPrcg")
	protected List<GenericIdentification20> otherProcessing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8
	 * RequestDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPrcg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies another type of processing change request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PROC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails8, List<GenericIdentification20>> mmOtherProcessing = new MMMessageAssociationEnd<RequestDetails8, List<GenericIdentification20>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails8.mmObject();
			isDerived = false;
			xmlTag = "OthrPrcg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PROC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProcessing";
			definition = "Specifies another type of processing change request.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification20.mmObject();
		}

		@Override
		public List<GenericIdentification20> getValue(RequestDetails8 obj) {
			return obj.getOtherProcessing();
		}

		@Override
		public void setValue(RequestDetails8 obj, List<GenericIdentification20> value) {
			obj.setOtherProcessing(value);
		}
	};
	@XmlElement(name = "PrtlSttlmInd")
	protected SettlementTransactionCondition5Code partialSettlementIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition5Code
	 * SettlementTransactionCondition5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
	 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8
	 * RequestDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlSttlmInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether partial settlement is allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRTL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestDetails8, Optional<SettlementTransactionCondition5Code>> mmPartialSettlementIndicator = new MMMessageAttribute<RequestDetails8, Optional<SettlementTransactionCondition5Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails8.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRTL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SettlementTransactionCondition5Code.mmObject();
		}

		@Override
		public Optional<SettlementTransactionCondition5Code> getValue(RequestDetails8 obj) {
			return obj.getPartialSettlementIndicator();
		}

		@Override
		public void setValue(RequestDetails8 obj, Optional<SettlementTransactionCondition5Code> value) {
			obj.setPartialSettlementIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesRTGS")
	protected SecuritiesRTGS1Choice securitiesRTGS;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesRTGS1Choice
	 * SecuritiesRTGS1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesRealTimeGrossSettlement
	 * SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8
	 * RequestDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRTGS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::RTGS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails8, Optional<SecuritiesRTGS1Choice>> mmSecuritiesRTGS = new MMMessageAssociationEnd<RequestDetails8, Optional<SecuritiesRTGS1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails8.mmObject();
			isDerived = false;
			xmlTag = "SctiesRTGS";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::RTGS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRTGS";
			definition = "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesRTGS1Choice.mmObject();
		}

		@Override
		public Optional<SecuritiesRTGS1Choice> getValue(RequestDetails8 obj) {
			return obj.getSecuritiesRTGS();
		}

		@Override
		public void setValue(RequestDetails8 obj, Optional<SecuritiesRTGS1Choice> value) {
			obj.setSecuritiesRTGS(value.orElse(null));
		}
	};
	@XmlElement(name = "HldInd")
	protected HoldIndicator4 holdIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.HoldIndicator4
	 * HoldIndicator4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldIndicator
	 * SecuritiesSettlement.mmHoldIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8
	 * RequestDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is on hold/blocked/frozen."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails8, Optional<HoldIndicator4>> mmHoldIndicator = new MMMessageAssociationEnd<RequestDetails8, Optional<HoldIndicator4>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmHoldIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails8.mmObject();
			isDerived = false;
			xmlTag = "HldInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold/blocked/frozen.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> HoldIndicator4.mmObject();
		}

		@Override
		public Optional<HoldIndicator4> getValue(RequestDetails8 obj) {
			return obj.getHoldIndicator();
		}

		@Override
		public void setValue(RequestDetails8 obj, Optional<HoldIndicator4> value) {
			obj.setHoldIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "MtchgDnl")
	protected MatchingDenied1Choice matchingDenial;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingDenied1Choice
	 * MatchingDenied1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeStatus
	 * SecuritiesTrade.mmSecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8
	 * RequestDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgDnl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingDenial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the matching processing change requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::MTCH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails8, Optional<MatchingDenied1Choice>> mmMatchingDenial = new MMMessageAssociationEnd<RequestDetails8, Optional<MatchingDenied1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTradeStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails8.mmObject();
			isDerived = false;
			xmlTag = "MtchgDnl";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::MTCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingDenial";
			definition = "Specifies the matching processing change requested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MatchingDenied1Choice.mmObject();
		}

		@Override
		public Optional<MatchingDenied1Choice> getValue(RequestDetails8 obj) {
			return obj.getMatchingDenial();
		}

		@Override
		public void setValue(RequestDetails8 obj, Optional<MatchingDenied1Choice> value) {
			obj.setMatchingDenial(value.orElse(null));
		}
	};
	@XmlElement(name = "UnltrlSplt")
	protected UnilateralSplit1Choice unilateralSplit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.UnilateralSplit1Choice
	 * UnilateralSplit1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8
	 * RequestDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnltrlSplt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnilateralSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the transaction is requested to be unilaterally split."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::MTCH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails8, Optional<UnilateralSplit1Choice>> mmUnilateralSplit = new MMMessageAssociationEnd<RequestDetails8, Optional<UnilateralSplit1Choice>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails8.mmObject();
			isDerived = false;
			xmlTag = "UnltrlSplt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::MTCH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnilateralSplit";
			definition = "Specifies that the transaction is requested to be unilaterally split.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnilateralSplit1Choice.mmObject();
		}

		@Override
		public Optional<UnilateralSplit1Choice> getValue(RequestDetails8 obj) {
			return obj.getUnilateralSplit();
		}

		@Override
		public void setValue(RequestDetails8 obj, Optional<UnilateralSplit1Choice> value) {
			obj.setUnilateralSplit(value.orElse(null));
		}
	};
	@XmlElement(name = "Lnkgs")
	protected List<Linkages16> linkages;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Linkages16 Linkages16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails8
	 * RequestDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lnkgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information regarding the linkage requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:LINK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequestDetails8, List<Linkages16>> mmLinkages = new MMMessageAssociationEnd<RequestDetails8, List<Linkages16>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequestDetails8.mmObject();
			isDerived = false;
			xmlTag = "Lnkgs";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:LINK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Information regarding the linkage requested.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Linkages16.mmObject();
		}

		@Override
		public List<Linkages16> getValue(RequestDetails8 obj) {
			return obj.getLinkages();
		}

		@Override
		public void setValue(RequestDetails8 obj, List<Linkages16> value) {
			obj.setLinkages(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequestDetails8.mmReference, com.tools20022.repository.msg.RequestDetails8.mmAutomaticBorrowing,
						com.tools20022.repository.msg.RequestDetails8.mmRetainIndicator, com.tools20022.repository.msg.RequestDetails8.mmLinkage, com.tools20022.repository.msg.RequestDetails8.mmPriority,
						com.tools20022.repository.msg.RequestDetails8.mmOtherProcessing, com.tools20022.repository.msg.RequestDetails8.mmPartialSettlementIndicator, com.tools20022.repository.msg.RequestDetails8.mmSecuritiesRTGS,
						com.tools20022.repository.msg.RequestDetails8.mmHoldIndicator, com.tools20022.repository.msg.RequestDetails8.mmMatchingDenial, com.tools20022.repository.msg.RequestDetails8.mmUnilateralSplit,
						com.tools20022.repository.msg.RequestDetails8.mmLinkages);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementConditionModificationStatusAdviceV03.mmRequestDetails, SecuritiesSettlementConditionsModificationRequestV03.mmRequestDetails);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintModificationRequestPresenceRule.forRequestDetails8,
						com.tools20022.repository.constraints.ConstraintOtherProcessingRule.forRequestDetails8, com.tools20022.repository.constraints.ConstraintSettlementConditionModificationApplicabilityRule.forRequestDetails8);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestDetails8";
				definition = "Details of the settlement condition modification request.";
				nextVersions_lazy = () -> Arrays.asList(RequestDetails11.mmObject());
				previousVersion_lazy = () -> RequestDetails6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public References9 getReference() {
		return reference;
	}

	public RequestDetails8 setReference(References9 reference) {
		this.reference = Objects.requireNonNull(reference);
		return this;
	}

	public Optional<AutomaticBorrowing2Choice> getAutomaticBorrowing() {
		return automaticBorrowing == null ? Optional.empty() : Optional.of(automaticBorrowing);
	}

	public RequestDetails8 setAutomaticBorrowing(AutomaticBorrowing2Choice automaticBorrowing) {
		this.automaticBorrowing = automaticBorrowing;
		return this;
	}

	public Optional<YesNoIndicator> getRetainIndicator() {
		return retainIndicator == null ? Optional.empty() : Optional.of(retainIndicator);
	}

	public RequestDetails8 setRetainIndicator(YesNoIndicator retainIndicator) {
		this.retainIndicator = retainIndicator;
		return this;
	}

	public Optional<LinkageType1Choice> getLinkage() {
		return linkage == null ? Optional.empty() : Optional.of(linkage);
	}

	public RequestDetails8 setLinkage(LinkageType1Choice linkage) {
		this.linkage = linkage;
		return this;
	}

	public Optional<PriorityNumeric1Choice> getPriority() {
		return priority == null ? Optional.empty() : Optional.of(priority);
	}

	public RequestDetails8 setPriority(PriorityNumeric1Choice priority) {
		this.priority = priority;
		return this;
	}

	public List<GenericIdentification20> getOtherProcessing() {
		return otherProcessing == null ? otherProcessing = new ArrayList<>() : otherProcessing;
	}

	public RequestDetails8 setOtherProcessing(List<GenericIdentification20> otherProcessing) {
		this.otherProcessing = Objects.requireNonNull(otherProcessing);
		return this;
	}

	public Optional<SettlementTransactionCondition5Code> getPartialSettlementIndicator() {
		return partialSettlementIndicator == null ? Optional.empty() : Optional.of(partialSettlementIndicator);
	}

	public RequestDetails8 setPartialSettlementIndicator(SettlementTransactionCondition5Code partialSettlementIndicator) {
		this.partialSettlementIndicator = partialSettlementIndicator;
		return this;
	}

	public Optional<SecuritiesRTGS1Choice> getSecuritiesRTGS() {
		return securitiesRTGS == null ? Optional.empty() : Optional.of(securitiesRTGS);
	}

	public RequestDetails8 setSecuritiesRTGS(SecuritiesRTGS1Choice securitiesRTGS) {
		this.securitiesRTGS = securitiesRTGS;
		return this;
	}

	public Optional<HoldIndicator4> getHoldIndicator() {
		return holdIndicator == null ? Optional.empty() : Optional.of(holdIndicator);
	}

	public RequestDetails8 setHoldIndicator(HoldIndicator4 holdIndicator) {
		this.holdIndicator = holdIndicator;
		return this;
	}

	public Optional<MatchingDenied1Choice> getMatchingDenial() {
		return matchingDenial == null ? Optional.empty() : Optional.of(matchingDenial);
	}

	public RequestDetails8 setMatchingDenial(MatchingDenied1Choice matchingDenial) {
		this.matchingDenial = matchingDenial;
		return this;
	}

	public Optional<UnilateralSplit1Choice> getUnilateralSplit() {
		return unilateralSplit == null ? Optional.empty() : Optional.of(unilateralSplit);
	}

	public RequestDetails8 setUnilateralSplit(UnilateralSplit1Choice unilateralSplit) {
		this.unilateralSplit = unilateralSplit;
		return this;
	}

	public List<Linkages16> getLinkages() {
		return linkages == null ? linkages = new ArrayList<>() : linkages;
	}

	public RequestDetails8 setLinkages(List<Linkages16> linkages) {
		this.linkages = Objects.requireNonNull(linkages);
		return this;
	}
}