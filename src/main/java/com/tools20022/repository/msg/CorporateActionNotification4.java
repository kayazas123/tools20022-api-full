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
import com.tools20022.repository.area.seev.CorporateActionNotificationV05;
import com.tools20022.repository.choice.CorporateActionProcessingStatus4Choice;
import com.tools20022.repository.codeset.CorporateActionNotificationType1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.CorporateActionNotification;
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
 * Corporate action event notification status and contents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4#mmNotificationType
 * CorporateActionNotification4.mmNotificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4#mmProcessingStatus
 * CorporateActionNotification4.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4#mmEligibleBalanceIndicator
 * CorporateActionNotification4.mmEligibleBalanceIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification
 * CorporateActionNotification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV05#mmNotificationGeneralInformation
 * CorporateActionNotificationV05.mmNotificationGeneralInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNotification4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Corporate action event notification status and contents."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline#forCorporateActionNotification4
 * ConstraintNotificationTypeGuideline.forCorporateActionNotification4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNotification5
 * CorporateActionNotification5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification3
 * CorporateActionNotification3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNotification4", propOrder = {"notificationType", "processingStatus", "eligibleBalanceIndicator"})
public class CorporateActionNotification4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtfctnTp", required = true)
	protected CorporateActionNotificationType1Code notificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationType1Code
	 * CorporateActionNotificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#mmNotificationType
	 * CorporateActionNotification.mmNotificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4
	 * CorporateActionNotification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of notification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :23G:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#mmNotificationType
	 * CorporateActionNotification5.mmNotificationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification3#mmNotificationType
	 * CorporateActionNotification3.mmNotificationType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotification4, CorporateActionNotificationType1Code> mmNotificationType = new MMMessageAttribute<CorporateActionNotification4, CorporateActionNotificationType1Code>() {
		{
			businessElementTrace_lazy = () -> CorporateActionNotification.mmNotificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotification4.mmObject();
			isDerived = false;
			xmlTag = "NtfctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":23G:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationType";
			definition = "Specifies the type of notification.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotification5.mmNotificationType);
			previousVersion_lazy = () -> CorporateActionNotification3.mmNotificationType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionNotificationType1Code.mmObject();
		}

		@Override
		public CorporateActionNotificationType1Code getValue(CorporateActionNotification4 obj) {
			return obj.getNotificationType();
		}

		@Override
		public void setValue(CorporateActionNotification4 obj, CorporateActionNotificationType1Code value) {
			obj.setNotificationType(value);
		}
	};
	@XmlElement(name = "PrcgSts", required = true)
	protected CorporateActionProcessingStatus4Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus4Choice
	 * CorporateActionProcessingStatus4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionStatus
	 * CorporateActionEvent.mmCorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4
	 * CorporateActionNotification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the details of the corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :25D::PROC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#mmProcessingStatus
	 * CorporateActionNotification5.mmProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification3#mmProcessingStatus
	 * CorporateActionNotification3.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionNotification4, CorporateActionProcessingStatus4Choice> mmProcessingStatus = new MMMessageAssociationEnd<CorporateActionNotification4, CorporateActionProcessingStatus4Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotification4.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":25D::PROC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Specifies the status of the details of the corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotification5.mmProcessingStatus);
			previousVersion_lazy = () -> CorporateActionNotification3.mmProcessingStatus;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionProcessingStatus4Choice.mmObject();
		}

		@Override
		public CorporateActionProcessingStatus4Choice getValue(CorporateActionNotification4 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(CorporateActionNotification4 obj, CorporateActionProcessingStatus4Choice value) {
			obj.setProcessingStatus(value);
		}
	};
	@XmlElement(name = "ElgblBalInd")
	protected YesNoIndicator eligibleBalanceIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalanceIndicator
	 * CorporateActionEntitlement.mmEligibleBalanceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4
	 * CorporateActionNotification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgblBalInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleBalanceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the eligible balance is final except for a voluntary corporate action event where it can represent the current eligible balance when communicated before expiration date of that event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#mmEligibleBalanceIndicator
	 * CorporateActionNotification5.mmEligibleBalanceIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification3#mmEligibleBalanceIndicator
	 * CorporateActionNotification3.mmEligibleBalanceIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionNotification4, Optional<YesNoIndicator>> mmEligibleBalanceIndicator = new MMMessageAttribute<CorporateActionNotification4, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmEligibleBalanceIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionNotification4.mmObject();
			isDerived = false;
			xmlTag = "ElgblBalInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleBalanceIndicator";
			definition = "Indicates whether the eligible balance is final except for a voluntary corporate action event where it can represent the current eligible balance when communicated before expiration date of that event.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionNotification5.mmEligibleBalanceIndicator);
			previousVersion_lazy = () -> CorporateActionNotification3.mmEligibleBalanceIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CorporateActionNotification4 obj) {
			return obj.getEligibleBalanceIndicator();
		}

		@Override
		public void setValue(CorporateActionNotification4 obj, Optional<YesNoIndicator> value) {
			obj.setEligibleBalanceIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNotification4.mmNotificationType, com.tools20022.repository.msg.CorporateActionNotification4.mmProcessingStatus,
						com.tools20022.repository.msg.CorporateActionNotification4.mmEligibleBalanceIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotificationV05.mmNotificationGeneralInformation);
				trace_lazy = () -> CorporateActionNotification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNotificationTypeGuideline.forCorporateActionNotification4);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotification4";
				definition = "Corporate action event notification status and contents.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionNotification5.mmObject());
				previousVersion_lazy = () -> CorporateActionNotification3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionNotificationType1Code getNotificationType() {
		return notificationType;
	}

	public CorporateActionNotification4 setNotificationType(CorporateActionNotificationType1Code notificationType) {
		this.notificationType = Objects.requireNonNull(notificationType);
		return this;
	}

	public CorporateActionProcessingStatus4Choice getProcessingStatus() {
		return processingStatus;
	}

	public CorporateActionNotification4 setProcessingStatus(CorporateActionProcessingStatus4Choice processingStatus) {
		this.processingStatus = Objects.requireNonNull(processingStatus);
		return this;
	}

	public Optional<YesNoIndicator> getEligibleBalanceIndicator() {
		return eligibleBalanceIndicator == null ? Optional.empty() : Optional.of(eligibleBalanceIndicator);
	}

	public CorporateActionNotification4 setEligibleBalanceIndicator(YesNoIndicator eligibleBalanceIndicator) {
		this.eligibleBalanceIndicator = eligibleBalanceIndicator;
		return this;
	}
}