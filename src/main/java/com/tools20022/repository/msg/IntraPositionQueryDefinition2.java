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
import com.tools20022.repository.codeset.MovementResponseType1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IntraPositionQueryCriteria2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the information that is searched through the definition of specific
 * criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryDefinition2#mmQueryType
 * IntraPositionQueryDefinition2.mmQueryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryDefinition2#mmSearchCriteria
 * IntraPositionQueryDefinition2.mmSearchCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraPositionQueryDefinition2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the information that is searched through the definition of specific criteria."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionQueryDefinition5
 * IntraPositionQueryDefinition5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraPositionQueryDefinition2", propOrder = {"queryType", "searchCriteria"})
public class IntraPositionQueryDefinition2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QryTp", required = true)
	protected MovementResponseType1Code queryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MovementResponseType1Code
	 * MovementResponseType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryDefinition2
	 * IntraPositionQueryDefinition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the type of query."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryDefinition5#mmQueryType
	 * IntraPositionQueryDefinition5.mmQueryType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionQueryDefinition2, MovementResponseType1Code> mmQueryType = new MMMessageAttribute<IntraPositionQueryDefinition2, MovementResponseType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryDefinition2.mmObject();
			isDerived = false;
			xmlTag = "QryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryType";
			definition = "Defines the type of query.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryDefinition5.mmQueryType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MovementResponseType1Code.mmObject();
		}

		@Override
		public MovementResponseType1Code getValue(IntraPositionQueryDefinition2 obj) {
			return obj.getQueryType();
		}

		@Override
		public void setValue(IntraPositionQueryDefinition2 obj, MovementResponseType1Code value) {
			obj.setQueryType(value);
		}
	};
	@XmlElement(name = "SchCrit", required = true)
	protected IntraPositionQueryCriteria2 searchCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2
	 * IntraPositionQueryCriteria2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryDefinition2
	 * IntraPositionQueryDefinition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SearchCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the criteria to extract the cancellation instructions for intra-position movements or settlement instructions information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryDefinition5#mmSearchCriteria
	 * IntraPositionQueryDefinition5.mmSearchCriteria}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionQueryDefinition2, IntraPositionQueryCriteria2> mmSearchCriteria = new MMMessageAssociationEnd<IntraPositionQueryDefinition2, IntraPositionQueryCriteria2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryDefinition2.mmObject();
			isDerived = false;
			xmlTag = "SchCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SearchCriteria";
			definition = "Defines the criteria to extract the cancellation instructions for intra-position movements or settlement instructions information.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryDefinition5.mmSearchCriteria);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IntraPositionQueryCriteria2.mmObject();
		}

		@Override
		public IntraPositionQueryCriteria2 getValue(IntraPositionQueryDefinition2 obj) {
			return obj.getSearchCriteria();
		}

		@Override
		public void setValue(IntraPositionQueryDefinition2 obj, IntraPositionQueryCriteria2 value) {
			obj.setSearchCriteria(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraPositionQueryDefinition2.mmQueryType, com.tools20022.repository.msg.IntraPositionQueryDefinition2.mmSearchCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraPositionQueryDefinition2";
				definition = "Defines the information that is searched through the definition of specific criteria.";
				nextVersions_lazy = () -> Arrays.asList(IntraPositionQueryDefinition5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public MovementResponseType1Code getQueryType() {
		return queryType;
	}

	public IntraPositionQueryDefinition2 setQueryType(MovementResponseType1Code queryType) {
		this.queryType = Objects.requireNonNull(queryType);
		return this;
	}

	public IntraPositionQueryCriteria2 getSearchCriteria() {
		return searchCriteria;
	}

	public IntraPositionQueryDefinition2 setSearchCriteria(IntraPositionQueryCriteria2 searchCriteria) {
		this.searchCriteria = Objects.requireNonNull(searchCriteria);
		return this;
	}
}