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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max9NumericText;
import com.tools20022.repository.entity.TerminalManagementAction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DataSetIdentification3;
import com.tools20022.repository.msg.ManagementPlanContent3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data related to the management plan of a point of interaction (POI).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet10#mmIdentification
 * TerminalManagementDataSet10.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet10#mmSequenceCounter
 * TerminalManagementDataSet10.mmSequenceCounter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet10#mmContent
 * TerminalManagementDataSet10.mmContent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
 * TerminalManagementAction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementDataSet10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Data related to the management plan of a point of interaction (POI)."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet15
 * TerminalManagementDataSet15}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet5
 * TerminalManagementDataSet5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TerminalManagementDataSet10", propOrder = {"identification", "sequenceCounter", "content"})
public class TerminalManagementDataSet10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected DataSetIdentification3 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification3
	 * DataSetIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet10
	 * TerminalManagementDataSet10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the data set containing the management plan."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet15#mmIdentification
	 * TerminalManagementDataSet15.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet5#mmIdentification
	 * TerminalManagementDataSet5.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TerminalManagementDataSet10, DataSetIdentification3> mmIdentification = new MMMessageAssociationEnd<TerminalManagementDataSet10, DataSetIdentification3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet10.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the data set containing the management plan.";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet15.mmIdentification);
			previousVersion_lazy = () -> TerminalManagementDataSet5.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DataSetIdentification3.mmObject();
		}

		@Override
		public DataSetIdentification3 getValue(TerminalManagementDataSet10 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(TerminalManagementDataSet10 obj, DataSetIdentification3 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "SeqCntr")
	protected Max9NumericText sequenceCounter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max9NumericText
	 * Max9NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet10
	 * TerminalManagementDataSet10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqCntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceCounter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counter to identify a single data set within the whole transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet15#mmSequenceCounter
	 * TerminalManagementDataSet15.mmSequenceCounter}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet5#mmSequenceCounter
	 * TerminalManagementDataSet5.mmSequenceCounter}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TerminalManagementDataSet10, Optional<Max9NumericText>> mmSequenceCounter = new MMMessageAttribute<TerminalManagementDataSet10, Optional<Max9NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet10.mmObject();
			isDerived = false;
			xmlTag = "SeqCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceCounter";
			definition = "Counter to identify a single data set within the whole transfer.";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet15.mmSequenceCounter);
			previousVersion_lazy = () -> TerminalManagementDataSet5.mmSequenceCounter;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}

		@Override
		public Optional<Max9NumericText> getValue(TerminalManagementDataSet10 obj) {
			return obj.getSequenceCounter();
		}

		@Override
		public void setValue(TerminalManagementDataSet10 obj, Optional<Max9NumericText> value) {
			obj.setSequenceCounter(value.orElse(null));
		}
	};
	@XmlElement(name = "Cntt")
	protected ManagementPlanContent3 content;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ManagementPlanContent3
	 * ManagementPlanContent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet10
	 * TerminalManagementDataSet10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cntt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Content"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Content of the management plan."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet15#mmContent
	 * TerminalManagementDataSet15.mmContent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet5#mmContent
	 * TerminalManagementDataSet5.mmContent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TerminalManagementDataSet10, Optional<ManagementPlanContent3>> mmContent = new MMMessageAssociationEnd<TerminalManagementDataSet10, Optional<ManagementPlanContent3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet10.mmObject();
			isDerived = false;
			xmlTag = "Cntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Content";
			definition = "Content of the management plan.";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet15.mmContent);
			previousVersion_lazy = () -> TerminalManagementDataSet5.mmContent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ManagementPlanContent3.mmObject();
		}

		@Override
		public Optional<ManagementPlanContent3> getValue(TerminalManagementDataSet10 obj) {
			return obj.getContent();
		}

		@Override
		public void setValue(TerminalManagementDataSet10 obj, Optional<ManagementPlanContent3> value) {
			obj.setContent(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TerminalManagementDataSet10.mmIdentification, com.tools20022.repository.msg.TerminalManagementDataSet10.mmSequenceCounter,
						com.tools20022.repository.msg.TerminalManagementDataSet10.mmContent);
				trace_lazy = () -> TerminalManagementAction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementDataSet10";
				definition = "Data related to the management plan of a point of interaction (POI).";
				nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet15.mmObject());
				previousVersion_lazy = () -> TerminalManagementDataSet5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DataSetIdentification3 getIdentification() {
		return identification;
	}

	public TerminalManagementDataSet10 setIdentification(DataSetIdentification3 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max9NumericText> getSequenceCounter() {
		return sequenceCounter == null ? Optional.empty() : Optional.of(sequenceCounter);
	}

	public TerminalManagementDataSet10 setSequenceCounter(Max9NumericText sequenceCounter) {
		this.sequenceCounter = sequenceCounter;
		return this;
	}

	public Optional<ManagementPlanContent3> getContent() {
		return content == null ? Optional.empty() : Optional.of(content);
	}

	public TerminalManagementDataSet10 setContent(ManagementPlanContent3 content) {
		this.content = content;
		return this;
	}
}