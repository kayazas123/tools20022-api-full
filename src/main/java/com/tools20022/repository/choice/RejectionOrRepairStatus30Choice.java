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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.NoReasonCode;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RejectionOrRepairReason24;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies whether the status is provided with a reason or not.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus30Choice#mmNoSpecifiedReason
 * RejectionOrRepairStatus30Choice.mmNoSpecifiedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus30Choice#mmReason
 * RejectionOrRepairStatus30Choice.mmReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionOrRepairStatus30Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the status is provided with a reason or not."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus25Choice
 * RejectionOrRepairStatus25Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RejectionOrRepairStatus30Choice", propOrder = {"noSpecifiedReason", "reason"})
public class RejectionOrRepairStatus30Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NoSpcfdRsn", required = true)
	protected NoReasonCode noSpecifiedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmNoSpecifiedReason
	 * StatusReason.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus30Choice
	 * RejectionOrRepairStatus30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoSpcfdRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSpecifiedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that there is no reason available or to report."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B: not present</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus25Choice#mmNoSpecifiedReason
	 * RejectionOrRepairStatus25Choice.mmNoSpecifiedReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RejectionOrRepairStatus30Choice, NoReasonCode> mmNoSpecifiedReason = new MMMessageAttribute<RejectionOrRepairStatus30Choice, NoReasonCode>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmNoSpecifiedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.RejectionOrRepairStatus30Choice.mmObject();
			isDerived = false;
			xmlTag = "NoSpcfdRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B: not present"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSpecifiedReason";
			definition = "Indicates that there is no reason available or to report.";
			previousVersion_lazy = () -> RejectionOrRepairStatus25Choice.mmNoSpecifiedReason;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}

		@Override
		public NoReasonCode getValue(RejectionOrRepairStatus30Choice obj) {
			return obj.getNoSpecifiedReason();
		}

		@Override
		public void setValue(RejectionOrRepairStatus30Choice obj, NoReasonCode value) {
			obj.setNoSpecifiedReason(value);
		}
	};
	@XmlElement(name = "Rsn", required = true)
	protected List<RejectionOrRepairReason24> reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RejectionOrRepairReason24
	 * RejectionOrRepairReason24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
	 * SecuritiesTradeStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus30Choice
	 * RejectionOrRepairStatus30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.RejectionOrRepairStatus25Choice#mmReason
	 * RejectionOrRepairStatus25Choice.mmReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RejectionOrRepairStatus30Choice, List<RejectionOrRepairReason24>> mmReason = new MMMessageAssociationEnd<RejectionOrRepairStatus30Choice, List<RejectionOrRepairReason24>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.RejectionOrRepairStatus30Choice.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Specifies the reason for the status.";
			previousVersion_lazy = () -> RejectionOrRepairStatus25Choice.mmReason;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectionOrRepairReason24.mmObject();
		}

		@Override
		public List<RejectionOrRepairReason24> getValue(RejectionOrRepairStatus30Choice obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(RejectionOrRepairStatus30Choice obj, List<RejectionOrRepairReason24> value) {
			obj.setReason(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RejectionOrRepairStatus30Choice.mmNoSpecifiedReason, com.tools20022.repository.choice.RejectionOrRepairStatus30Choice.mmReason);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionOrRepairStatus30Choice";
				definition = "Specifies whether the status is provided with a reason or not.";
				previousVersion_lazy = () -> RejectionOrRepairStatus25Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public NoReasonCode getNoSpecifiedReason() {
		return noSpecifiedReason;
	}

	public RejectionOrRepairStatus30Choice setNoSpecifiedReason(NoReasonCode noSpecifiedReason) {
		this.noSpecifiedReason = Objects.requireNonNull(noSpecifiedReason);
		return this;
	}

	public List<RejectionOrRepairReason24> getReason() {
		return reason == null ? reason = new ArrayList<>() : reason;
	}

	public RejectionOrRepairStatus30Choice setReason(List<RejectionOrRepairReason24> reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}
}