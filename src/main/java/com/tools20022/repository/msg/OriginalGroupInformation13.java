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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.TransactionGroupStatus2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.StatusReasonInformation4;
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
 * Unique and unambiguous identifier of the group of transactions as assigned by
 * the original instructing party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#OriginalMessageIdentificationOrNetworkFileNameRule
 * OriginalGroupInformation13.OriginalMessageIdentificationOrNetworkFileNameRule
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#mmOriginalMessageIdentification
 * OriginalGroupInformation13.mmOriginalMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#mmNetworkFileName
 * OriginalGroupInformation13.mmNetworkFileName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#mmOriginalMessageNameIdentification
 * OriginalGroupInformation13.mmOriginalMessageNameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#mmGroupStatus
 * OriginalGroupInformation13.mmGroupStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#mmStatusReasonInformation
 * OriginalGroupInformation13.mmStatusReasonInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginalGroupInformation13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique and unambiguous identifier of the group of transactions as assigned by the original instructing party."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalGroupInformation13", propOrder = {"originalMessageIdentification", "networkFileName", "originalMessageNameIdentification", "groupStatus", "statusReasonInformation"})
public class OriginalGroupInformation13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMsgId", required = true)
	protected Max35Text originalMessageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13
	 * OriginalGroupInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference assigned by the original instructing party to unambiguously identify the original group of individual transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupInformation13, Max35Text> mmOriginalMessageIdentification = new MMMessageAttribute<OriginalGroupInformation13, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation13.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Point to point reference assigned by the original instructing party to unambiguously identify the original group of individual transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalGroupInformation13 obj) {
			return obj.getOriginalMessageIdentification();
		}

		@Override
		public void setValue(OriginalGroupInformation13 obj, Max35Text value) {
			obj.setOriginalMessageIdentification(value);
		}
	};
	@XmlElement(name = "NtwkFileNm", required = true)
	protected Max35Text networkFileName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13
	 * OriginalGroupInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtwkFileNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkFileName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name assigned by the sending party to unambiguously identify the file transmitted on the network."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupInformation13, Max35Text> mmNetworkFileName = new MMMessageAttribute<OriginalGroupInformation13, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation13.mmObject();
			isDerived = false;
			xmlTag = "NtwkFileNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkFileName";
			definition = "Name assigned by the sending party to unambiguously identify the file transmitted on the network.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalGroupInformation13 obj) {
			return obj.getNetworkFileName();
		}

		@Override
		public void setValue(OriginalGroupInformation13 obj, Max35Text value) {
			obj.setNetworkFileName(value);
		}
	};
	@XmlElement(name = "OrgnlMsgNmId", required = true)
	protected Max35Text originalMessageNameIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13
	 * OriginalGroupInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgNmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageNameIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the original message name identifier to which the message refers, eg, pacs.003.001.01 or MT103."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupInformation13, Max35Text> mmOriginalMessageNameIdentification = new MMMessageAttribute<OriginalGroupInformation13, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation13.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgNmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageNameIdentification";
			definition = "Specifies the original message name identifier to which the message refers, eg, pacs.003.001.01 or MT103.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalGroupInformation13 obj) {
			return obj.getOriginalMessageNameIdentification();
		}

		@Override
		public void setValue(OriginalGroupInformation13 obj, Max35Text value) {
			obj.setOriginalMessageNameIdentification(value);
		}
	};
	@XmlElement(name = "GrpSts")
	protected TransactionGroupStatus2Code groupStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus2Code
	 * TransactionGroupStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmStatus
	 * PaymentStatus.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13
	 * OriginalGroupInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a group of transactions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupInformation13, Optional<TransactionGroupStatus2Code>> mmGroupStatus = new MMMessageAttribute<OriginalGroupInformation13, Optional<TransactionGroupStatus2Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation13.mmObject();
			isDerived = false;
			xmlTag = "GrpSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatus";
			definition = "Specifies the status of a group of transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionGroupStatus2Code.mmObject();
		}

		@Override
		public Optional<TransactionGroupStatus2Code> getValue(OriginalGroupInformation13 obj) {
			return obj.getGroupStatus();
		}

		@Override
		public void setValue(OriginalGroupInformation13 obj, Optional<TransactionGroupStatus2Code> value) {
			obj.setGroupStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "StsRsnInf")
	protected StatusReasonInformation4 statusReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation4
	 * StatusReasonInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13
	 * OriginalGroupInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRsnInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed information on the status reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalGroupInformation13, Optional<StatusReasonInformation4>> mmStatusReasonInformation = new MMMessageAssociationEnd<OriginalGroupInformation13, Optional<StatusReasonInformation4>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation13.mmObject();
			isDerived = false;
			xmlTag = "StsRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformation";
			definition = "Detailed information on the status reason.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StatusReasonInformation4.mmObject();
		}

		@Override
		public Optional<StatusReasonInformation4> getValue(OriginalGroupInformation13 obj) {
			return obj.getStatusReasonInformation();
		}

		@Override
		public void setValue(OriginalGroupInformation13 obj, Optional<StatusReasonInformation4> value) {
			obj.setStatusReasonInformation(value.orElse(null));
		}
	};
	/**
	 * If OriginalMessageIdentification is present, then NetworkFileName is not
	 * allowed. If NetworkFileName is present, then
	 * OriginalMessageIdentification is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13
	 * OriginalGroupInformation13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#mmOriginalMessageIdentification
	 * OriginalGroupInformation13.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation13#mmNetworkFileName
	 * OriginalGroupInformation13.mmNetworkFileName}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageIdentificationOrNetworkFileNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalMessageIdentification is present, then NetworkFileName is not allowed.\nIf NetworkFileName is present, then OriginalMessageIdentification is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor OriginalMessageIdentificationOrNetworkFileNameRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentificationOrNetworkFileNameRule";
			definition = "If OriginalMessageIdentification is present, then NetworkFileName is not allowed.\nIf NetworkFileName is present, then OriginalMessageIdentification is not allowed.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation13.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupInformation13.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation13.mmNetworkFileName);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupInformation13.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation13.mmNetworkFileName,
						com.tools20022.repository.msg.OriginalGroupInformation13.mmOriginalMessageNameIdentification, com.tools20022.repository.msg.OriginalGroupInformation13.mmGroupStatus,
						com.tools20022.repository.msg.OriginalGroupInformation13.mmStatusReasonInformation);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "OriginalGroupInformation13";
				definition = "Unique and unambiguous identifier of the group of transactions as assigned by the original instructing party.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupInformation13.OriginalMessageIdentificationOrNetworkFileNameRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalMessageIdentification() {
		return originalMessageIdentification;
	}

	public OriginalGroupInformation13 setOriginalMessageIdentification(Max35Text originalMessageIdentification) {
		this.originalMessageIdentification = Objects.requireNonNull(originalMessageIdentification);
		return this;
	}

	public Max35Text getNetworkFileName() {
		return networkFileName;
	}

	public OriginalGroupInformation13 setNetworkFileName(Max35Text networkFileName) {
		this.networkFileName = Objects.requireNonNull(networkFileName);
		return this;
	}

	public Max35Text getOriginalMessageNameIdentification() {
		return originalMessageNameIdentification;
	}

	public OriginalGroupInformation13 setOriginalMessageNameIdentification(Max35Text originalMessageNameIdentification) {
		this.originalMessageNameIdentification = Objects.requireNonNull(originalMessageNameIdentification);
		return this;
	}

	public Optional<TransactionGroupStatus2Code> getGroupStatus() {
		return groupStatus == null ? Optional.empty() : Optional.of(groupStatus);
	}

	public OriginalGroupInformation13 setGroupStatus(TransactionGroupStatus2Code groupStatus) {
		this.groupStatus = groupStatus;
		return this;
	}

	public Optional<StatusReasonInformation4> getStatusReasonInformation() {
		return statusReasonInformation == null ? Optional.empty() : Optional.of(statusReasonInformation);
	}

	public OriginalGroupInformation13 setStatusReasonInformation(StatusReasonInformation4 statusReasonInformation) {
		this.statusReasonInformation = statusReasonInformation;
		return this;
	}
}