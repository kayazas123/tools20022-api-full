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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.catm.MaintenanceDelegationRequestV02;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification72;
import com.tools20022.repository.msg.MaintenanceDelegation3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the request of maintenance delegations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest2#mmTMIdentification
 * MaintenanceDelegationRequest2.mmTMIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest2#mmMasterTMIdentification
 * MaintenanceDelegationRequest2.mmMasterTMIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest2#mmRequestedDelegation
 * MaintenanceDelegationRequest2.mmRequestedDelegation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV02#mmMaintenanceDelegationRequest
 * MaintenanceDelegationRequestV02.mmMaintenanceDelegationRequest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MaintenanceDelegationRequest2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the request of maintenance delegations."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest3
 * MaintenanceDelegationRequest3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest1
 * MaintenanceDelegationRequest1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MaintenanceDelegationRequest2", propOrder = {"tMIdentification", "masterTMIdentification", "requestedDelegation"})
public class MaintenanceDelegationRequest2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TMId", required = true)
	protected GenericIdentification72 tMIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification72
	 * GenericIdentification72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest2
	 * MaintenanceDelegationRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terminal manager identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest3#mmTMIdentification
	 * MaintenanceDelegationRequest3.mmTMIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest1#mmTMIdentification
	 * MaintenanceDelegationRequest1.mmTMIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegationRequest2, GenericIdentification72> mmTMIdentification = new MMMessageAssociationEnd<MaintenanceDelegationRequest2, GenericIdentification72>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegationRequest2.mmObject();
			isDerived = false;
			xmlTag = "TMId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMIdentification";
			definition = "Terminal manager identification.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationRequest3.mmTMIdentification);
			previousVersion_lazy = () -> MaintenanceDelegationRequest1.mmTMIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification72.mmObject();
		}

		@Override
		public GenericIdentification72 getValue(MaintenanceDelegationRequest2 obj) {
			return obj.getTMIdentification();
		}

		@Override
		public void setValue(MaintenanceDelegationRequest2 obj, GenericIdentification72 value) {
			obj.setTMIdentification(value);
		}
	};
	@XmlElement(name = "MstrTMId")
	protected GenericIdentification72 masterTMIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification72
	 * GenericIdentification72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest2
	 * MaintenanceDelegationRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrTMId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterTMIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Master terminal manager identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest3#mmMasterTMIdentification
	 * MaintenanceDelegationRequest3.mmMasterTMIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest1#mmMasterTMIdentification
	 * MaintenanceDelegationRequest1.mmMasterTMIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegationRequest2, Optional<GenericIdentification72>> mmMasterTMIdentification = new MMMessageAssociationEnd<MaintenanceDelegationRequest2, Optional<GenericIdentification72>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegationRequest2.mmObject();
			isDerived = false;
			xmlTag = "MstrTMId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterTMIdentification";
			definition = "Master terminal manager identification.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationRequest3.mmMasterTMIdentification);
			previousVersion_lazy = () -> MaintenanceDelegationRequest1.mmMasterTMIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification72.mmObject();
		}

		@Override
		public Optional<GenericIdentification72> getValue(MaintenanceDelegationRequest2 obj) {
			return obj.getMasterTMIdentification();
		}

		@Override
		public void setValue(MaintenanceDelegationRequest2 obj, Optional<GenericIdentification72> value) {
			obj.setMasterTMIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdDlgtn", required = true)
	protected List<MaintenanceDelegation3> requestedDelegation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3
	 * MaintenanceDelegation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest2
	 * MaintenanceDelegationRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdDlgtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedDelegation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the delegation of a maintenance action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest3#mmRequestedDelegation
	 * MaintenanceDelegationRequest3.mmRequestedDelegation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest1#mmRequestedDelegation
	 * MaintenanceDelegationRequest1.mmRequestedDelegation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegationRequest2, List<MaintenanceDelegation3>> mmRequestedDelegation = new MMMessageAssociationEnd<MaintenanceDelegationRequest2, List<MaintenanceDelegation3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegationRequest2.mmObject();
			isDerived = false;
			xmlTag = "ReqdDlgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedDelegation";
			definition = "Information on the delegation of a maintenance action.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationRequest3.mmRequestedDelegation);
			previousVersion_lazy = () -> MaintenanceDelegationRequest1.mmRequestedDelegation;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MaintenanceDelegation3.mmObject();
		}

		@Override
		public List<MaintenanceDelegation3> getValue(MaintenanceDelegationRequest2 obj) {
			return obj.getRequestedDelegation();
		}

		@Override
		public void setValue(MaintenanceDelegationRequest2 obj, List<MaintenanceDelegation3> value) {
			obj.setRequestedDelegation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegationRequest2.mmTMIdentification, com.tools20022.repository.msg.MaintenanceDelegationRequest2.mmMasterTMIdentification,
						com.tools20022.repository.msg.MaintenanceDelegationRequest2.mmRequestedDelegation);
				messageBuildingBlock_lazy = () -> Arrays.asList(MaintenanceDelegationRequestV02.mmMaintenanceDelegationRequest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegationRequest2";
				definition = "Information related to the request of maintenance delegations.";
				nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationRequest3.mmObject());
				previousVersion_lazy = () -> MaintenanceDelegationRequest1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification72 getTMIdentification() {
		return tMIdentification;
	}

	public MaintenanceDelegationRequest2 setTMIdentification(GenericIdentification72 tMIdentification) {
		this.tMIdentification = Objects.requireNonNull(tMIdentification);
		return this;
	}

	public Optional<GenericIdentification72> getMasterTMIdentification() {
		return masterTMIdentification == null ? Optional.empty() : Optional.of(masterTMIdentification);
	}

	public MaintenanceDelegationRequest2 setMasterTMIdentification(GenericIdentification72 masterTMIdentification) {
		this.masterTMIdentification = masterTMIdentification;
		return this;
	}

	public List<MaintenanceDelegation3> getRequestedDelegation() {
		return requestedDelegation == null ? requestedDelegation = new ArrayList<>() : requestedDelegation;
	}

	public MaintenanceDelegationRequest2 setRequestedDelegation(List<MaintenanceDelegation3> requestedDelegation) {
		this.requestedDelegation = Objects.requireNonNull(requestedDelegation);
		return this;
	}
}