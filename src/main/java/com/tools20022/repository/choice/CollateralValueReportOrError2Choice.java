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
import com.tools20022.repository.msg.CollateralValuePosition1;
import com.tools20022.repository.msg.ErrorHandling3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Business Report on collateral value or on business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError2Choice#mmBusinessError
 * CollateralValueReportOrError2Choice.mmBusinessError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError2Choice#mmCollateralValue
 * CollateralValueReportOrError2Choice.mmCollateralValue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralValueReportOrError2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Business Report on collateral value or on business error."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError4Choice
 * CollateralValueReportOrError4Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralValueReportOrError2Choice", propOrder = {"businessError", "collateralValue"})
public class CollateralValueReportOrError2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BizErr", required = true)
	protected ErrorHandling3 businessError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError2Choice
	 * CollateralValueReportOrError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the requested business information is not given."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError4Choice#mmBusinessError
	 * CollateralValueReportOrError4Choice.mmBusinessError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValueReportOrError2Choice, ErrorHandling3> mmBusinessError = new MMMessageAssociationEnd<CollateralValueReportOrError2Choice, ErrorHandling3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CollateralValueReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValueReportOrError4Choice.mmBusinessError);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling3.mmObject();
		}

		@Override
		public ErrorHandling3 getValue(CollateralValueReportOrError2Choice obj) {
			return obj.getBusinessError();
		}

		@Override
		public void setValue(CollateralValueReportOrError2Choice obj, ErrorHandling3 value) {
			obj.setBusinessError(value);
		}
	};
	@XmlElement(name = "CollVal", required = true)
	protected CollateralValuePosition1 collateralValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuePosition1
	 * CollateralValuePosition1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError2Choice
	 * CollateralValueReportOrError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested information on the value of the position for collateral purposes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralValueReportOrError4Choice#mmCollateralValue
	 * CollateralValueReportOrError4Choice.mmCollateralValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralValueReportOrError2Choice, CollateralValuePosition1> mmCollateralValue = new MMMessageAssociationEnd<CollateralValueReportOrError2Choice, CollateralValuePosition1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.CollateralValueReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "CollVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValue";
			definition = "Requested information on the value of the position for collateral purposes.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValueReportOrError4Choice.mmCollateralValue);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralValuePosition1.mmObject();
		}

		@Override
		public CollateralValuePosition1 getValue(CollateralValueReportOrError2Choice obj) {
			return obj.getCollateralValue();
		}

		@Override
		public void setValue(CollateralValueReportOrError2Choice obj, CollateralValuePosition1 value) {
			obj.setCollateralValue(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CollateralValueReportOrError2Choice.mmBusinessError, com.tools20022.repository.choice.CollateralValueReportOrError2Choice.mmCollateralValue);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralValueReportOrError2Choice";
				definition = "Business Report on collateral value or on business error.";
				nextVersions_lazy = () -> Arrays.asList(CollateralValueReportOrError4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ErrorHandling3 getBusinessError() {
		return businessError;
	}

	public CollateralValueReportOrError2Choice setBusinessError(ErrorHandling3 businessError) {
		this.businessError = Objects.requireNonNull(businessError);
		return this;
	}

	public CollateralValuePosition1 getCollateralValue() {
		return collateralValue;
	}

	public CollateralValueReportOrError2Choice setCollateralValue(CollateralValuePosition1 collateralValue) {
		this.collateralValue = Objects.requireNonNull(collateralValue);
		return this;
	}
}