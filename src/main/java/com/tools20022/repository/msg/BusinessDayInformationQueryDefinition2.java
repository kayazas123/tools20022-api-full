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
import com.tools20022.repository.choice.BusinessDayInformationCriteriaDefinitionChoice;
import com.tools20022.repository.codeset.QueryType2Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the query criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationQueryDefinition2#mmQueryType
 * BusinessDayInformationQueryDefinition2.mmQueryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationQueryDefinition2#mmBusinessDayInformationCriteria
 * BusinessDayInformationQueryDefinition2.mmBusinessDayInformationCriteria}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessDayInformationQueryDefinition2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the query criteria."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BusinessDayInformationQueryDefinition2", propOrder = {"queryType", "businessDayInformationCriteria"})
public class BusinessDayInformationQueryDefinition2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QryTp")
	protected QueryType2Code queryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QueryType2Code
	 * QueryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationQueryDefinition2
	 * BusinessDayInformationQueryDefinition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of matching items to be returned in the response to the query."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BusinessDayInformationQueryDefinition2, Optional<QueryType2Code>> mmQueryType = new MMMessageAttribute<BusinessDayInformationQueryDefinition2, Optional<QueryType2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayInformationQueryDefinition2.mmObject();
			isDerived = false;
			xmlTag = "QryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryType";
			definition = "Specifies the type of matching items to be returned in the response to the query.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> QueryType2Code.mmObject();
		}

		@Override
		public Optional<QueryType2Code> getValue(BusinessDayInformationQueryDefinition2 obj) {
			return obj.getQueryType();
		}

		@Override
		public void setValue(BusinessDayInformationQueryDefinition2 obj, Optional<QueryType2Code> value) {
			obj.setQueryType(value.orElse(null));
		}
	};
	@XmlElement(name = "BizDayInfCrit")
	protected BusinessDayInformationCriteriaDefinitionChoice businessDayInformationCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BusinessDayInformationCriteriaDefinitionChoice
	 * BusinessDayInformationCriteriaDefinitionChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDayInformationQueryDefinition2
	 * BusinessDayInformationQueryDefinition2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizDayInfCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDayInformationCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the business day information query criteria."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessDayInformationQueryDefinition2, Optional<BusinessDayInformationCriteriaDefinitionChoice>> mmBusinessDayInformationCriteria = new MMMessageAssociationEnd<BusinessDayInformationQueryDefinition2, Optional<BusinessDayInformationCriteriaDefinitionChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDayInformationQueryDefinition2.mmObject();
			isDerived = false;
			xmlTag = "BizDayInfCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessDayInformationCriteria";
			definition = "Defines the business day information query criteria.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BusinessDayInformationCriteriaDefinitionChoice.mmObject();
		}

		@Override
		public Optional<BusinessDayInformationCriteriaDefinitionChoice> getValue(BusinessDayInformationQueryDefinition2 obj) {
			return obj.getBusinessDayInformationCriteria();
		}

		@Override
		public void setValue(BusinessDayInformationQueryDefinition2 obj, Optional<BusinessDayInformationCriteriaDefinitionChoice> value) {
			obj.setBusinessDayInformationCriteria(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BusinessDayInformationQueryDefinition2.mmQueryType,
						com.tools20022.repository.msg.BusinessDayInformationQueryDefinition2.mmBusinessDayInformationCriteria);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BusinessDayInformationQueryDefinition2";
				definition = "Defines the query criteria.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<QueryType2Code> getQueryType() {
		return queryType == null ? Optional.empty() : Optional.of(queryType);
	}

	public BusinessDayInformationQueryDefinition2 setQueryType(QueryType2Code queryType) {
		this.queryType = queryType;
		return this;
	}

	public Optional<BusinessDayInformationCriteriaDefinitionChoice> getBusinessDayInformationCriteria() {
		return businessDayInformationCriteria == null ? Optional.empty() : Optional.of(businessDayInformationCriteria);
	}

	public BusinessDayInformationQueryDefinition2 setBusinessDayInformationCriteria(BusinessDayInformationCriteriaDefinitionChoice businessDayInformationCriteria) {
		this.businessDayInformationCriteria = businessDayInformationCriteria;
		return this;
	}
}