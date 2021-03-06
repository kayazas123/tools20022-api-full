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

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecurityAttributes2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between action to request on a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.UpdateType7Choice#mmAdd
 * UpdateType7Choice.mmAdd}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UpdateType7Choice#mmDelete
 * UpdateType7Choice.mmDelete}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UpdateType7Choice#mmModify
 * UpdateType7Choice.mmModify}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UpdateType7Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between action to request on a security."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.UpdateType24Choice
 * UpdateType24Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UpdateType7Choice", propOrder = {"add", "delete", "modify"})
public class UpdateType7Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Add", required = true)
	protected SecurityAttributes2 add;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityAttributes2
	 * SecurityAttributes2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType7Choice
	 * UpdateType7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Add"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Add"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of data requested to enrich a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UpdateType24Choice#mmAdd
	 * UpdateType24Choice.mmAdd}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UpdateType7Choice, SecurityAttributes2> mmAdd = new MMMessageAssociationEnd<UpdateType7Choice, SecurityAttributes2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UpdateType7Choice.mmObject();
			isDerived = false;
			xmlTag = "Add";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Add";
			definition = "Set of data requested to enrich a security.";
			nextVersions_lazy = () -> Arrays.asList(UpdateType24Choice.mmAdd);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityAttributes2.mmObject();
		}

		@Override
		public SecurityAttributes2 getValue(UpdateType7Choice obj) {
			return obj.getAdd();
		}

		@Override
		public void setValue(UpdateType7Choice obj, SecurityAttributes2 value) {
			obj.setAdd(value);
		}
	};
	@XmlElement(name = "Del", required = true)
	protected SecurityAttributes2 delete;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityAttributes2
	 * SecurityAttributes2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType7Choice
	 * UpdateType7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Del"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of data requested for deletion from a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UpdateType24Choice#mmDelete
	 * UpdateType24Choice.mmDelete}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UpdateType7Choice, SecurityAttributes2> mmDelete = new MMMessageAssociationEnd<UpdateType7Choice, SecurityAttributes2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UpdateType7Choice.mmObject();
			isDerived = false;
			xmlTag = "Del";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delete";
			definition = "Set of data requested for deletion from a security.";
			nextVersions_lazy = () -> Arrays.asList(UpdateType24Choice.mmDelete);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityAttributes2.mmObject();
		}

		@Override
		public SecurityAttributes2 getValue(UpdateType7Choice obj) {
			return obj.getDelete();
		}

		@Override
		public void setValue(UpdateType7Choice obj, SecurityAttributes2 value) {
			obj.setDelete(value);
		}
	};
	@XmlElement(name = "Modfy", required = true)
	protected SecurityAttributes2 modify;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityAttributes2
	 * SecurityAttributes2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType7Choice
	 * UpdateType7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Modfy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modify"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of data requested to modify a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UpdateType24Choice#mmModify
	 * UpdateType24Choice.mmModify}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UpdateType7Choice, SecurityAttributes2> mmModify = new MMMessageAssociationEnd<UpdateType7Choice, SecurityAttributes2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UpdateType7Choice.mmObject();
			isDerived = false;
			xmlTag = "Modfy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modify";
			definition = "Set of data requested to modify a security.";
			nextVersions_lazy = () -> Arrays.asList(UpdateType24Choice.mmModify);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityAttributes2.mmObject();
		}

		@Override
		public SecurityAttributes2 getValue(UpdateType7Choice obj) {
			return obj.getModify();
		}

		@Override
		public void setValue(UpdateType7Choice obj, SecurityAttributes2 value) {
			obj.setModify(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.UpdateType7Choice.mmAdd, com.tools20022.repository.choice.UpdateType7Choice.mmDelete, com.tools20022.repository.choice.UpdateType7Choice.mmModify);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UpdateType7Choice";
				definition = "Choice between action to request on a security.";
				nextVersions_lazy = () -> Arrays.asList(UpdateType24Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityAttributes2 getAdd() {
		return add;
	}

	public UpdateType7Choice setAdd(SecurityAttributes2 add) {
		this.add = Objects.requireNonNull(add);
		return this;
	}

	public SecurityAttributes2 getDelete() {
		return delete;
	}

	public UpdateType7Choice setDelete(SecurityAttributes2 delete) {
		this.delete = Objects.requireNonNull(delete);
		return this;
	}

	public SecurityAttributes2 getModify() {
		return modify;
	}

	public UpdateType7Choice setModify(SecurityAttributes2 modify) {
		this.modify = Objects.requireNonNull(modify);
		return this;
	}
}