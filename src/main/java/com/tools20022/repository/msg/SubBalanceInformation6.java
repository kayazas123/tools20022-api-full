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
import com.tools20022.repository.choice.SubBalanceQuantity3Choice;
import com.tools20022.repository.choice.SubBalanceType5Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AdditionalBalanceInformation6;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Net position of a segregated holding of a single security within the overall
 * position held in the securities account, eg, sub-balance per status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6#mmSubBalanceType
 * SubBalanceInformation6.mmSubBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6#mmQuantity
 * SubBalanceInformation6.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6#mmSubBalanceAdditionalDetails
 * SubBalanceInformation6.mmSubBalanceAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6#mmAdditionalBalanceBreakdownDetails
 * SubBalanceInformation6.mmAdditionalBalanceBreakdownDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubBalanceInformation6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding of a single security within the overall position held in the securities account, eg, sub-balance per status."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule#forSubBalanceInformation6
 * ConstraintSubBalanceAdditionalDetailsRule.forSubBalanceInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAvailableWithNoStatusRule#forSubBalanceInformation6
 * ConstraintAvailableWithNoStatusRule.forSubBalanceInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forSubBalanceInformation6
 * ConstraintCoexistenceQuantityRule.forSubBalanceInformation6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SubBalanceInformation14
 * SubBalanceInformation14}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubBalanceInformation6", propOrder = {"subBalanceType", "quantity", "subBalanceAdditionalDetails", "additionalBalanceBreakdownDetails"})
public class SubBalanceInformation6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SubBalTp", required = true)
	protected SubBalanceType5Choice subBalanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType5Choice
	 * SubBalanceType5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
	 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6
	 * SubBalanceInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubBalTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the sub-balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14#mmSubBalanceType
	 * SubBalanceInformation14.mmSubBalanceType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubBalanceInformation6, SubBalanceType5Choice> mmSubBalanceType = new MMMessageAttribute<SubBalanceInformation6, SubBalanceType5Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubBalanceInformation6.mmObject();
			isDerived = false;
			xmlTag = "SubBalTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceType";
			definition = "Reason for the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(SubBalanceInformation14.mmSubBalanceType);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SubBalanceType5Choice.mmObject();
		}

		@Override
		public SubBalanceType5Choice getValue(SubBalanceInformation6 obj) {
			return obj.getSubBalanceType();
		}

		@Override
		public void setValue(SubBalanceInformation6 obj, SubBalanceType5Choice value) {
			obj.setSubBalanceType(value);
		}
	};
	@XmlElement(name = "Qty", required = true)
	protected SubBalanceQuantity3Choice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity3Choice
	 * SubBalanceQuantity3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSubBalanceQuantity
	 * SecuritiesBalance.mmSubBalanceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6
	 * SubBalanceInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14#mmQuantity
	 * SubBalanceInformation14.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubBalanceInformation6, SubBalanceQuantity3Choice> mmQuantity = new MMMessageAttribute<SubBalanceInformation6, SubBalanceQuantity3Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSubBalanceQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubBalanceInformation6.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of securities in the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(SubBalanceInformation14.mmQuantity);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SubBalanceQuantity3Choice.mmObject();
		}

		@Override
		public SubBalanceQuantity3Choice getValue(SubBalanceInformation6 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(SubBalanceInformation6 obj, SubBalanceQuantity3Choice value) {
			obj.setQuantity(value);
		}
	};
	@XmlElement(name = "SubBalAddtlDtls")
	protected Max140Text subBalanceAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6
	 * SubBalanceInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubBalAddtlDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional subbalance information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SUBBAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14#mmSubBalanceAdditionalDetails
	 * SubBalanceInformation14.mmSubBalanceAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubBalanceInformation6, Optional<Max140Text>> mmSubBalanceAdditionalDetails = new MMMessageAttribute<SubBalanceInformation6, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SubBalanceInformation6.mmObject();
			isDerived = false;
			xmlTag = "SubBalAddtlDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SUBBAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetails";
			definition = "Provides additional subbalance information.";
			nextVersions_lazy = () -> Arrays.asList(SubBalanceInformation14.mmSubBalanceAdditionalDetails);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(SubBalanceInformation6 obj) {
			return obj.getSubBalanceAdditionalDetails();
		}

		@Override
		public void setValue(SubBalanceInformation6 obj, Optional<Max140Text> value) {
			obj.setSubBalanceAdditionalDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlBalBrkdwnDtls")
	protected List<AdditionalBalanceInformation6> additionalBalanceBreakdownDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6
	 * AdditionalBalanceInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation6
	 * SubBalanceInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBalBrkdwnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBalanceBreakdownDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional instrument sub-balance information on all or parts of the reported financial instrument (unregistered, tax exempt, etc.)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SUBBAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubBalanceInformation14#mmAdditionalBalanceBreakdownDetails
	 * SubBalanceInformation14.mmAdditionalBalanceBreakdownDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubBalanceInformation6, List<AdditionalBalanceInformation6>> mmAdditionalBalanceBreakdownDetails = new MMMessageAssociationEnd<SubBalanceInformation6, List<AdditionalBalanceInformation6>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubBalanceInformation6.mmObject();
			isDerived = false;
			xmlTag = "AddtlBalBrkdwnDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SUBBAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBalanceBreakdownDetails";
			definition = "Provides additional instrument sub-balance information on all or parts of the reported financial instrument (unregistered, tax exempt, etc.).";
			nextVersions_lazy = () -> Arrays.asList(SubBalanceInformation14.mmAdditionalBalanceBreakdownDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalBalanceInformation6.mmObject();
		}

		@Override
		public List<AdditionalBalanceInformation6> getValue(SubBalanceInformation6 obj) {
			return obj.getAdditionalBalanceBreakdownDetails();
		}

		@Override
		public void setValue(SubBalanceInformation6 obj, List<AdditionalBalanceInformation6> value) {
			obj.setAdditionalBalanceBreakdownDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubBalanceInformation6.mmSubBalanceType, com.tools20022.repository.msg.SubBalanceInformation6.mmQuantity,
						com.tools20022.repository.msg.SubBalanceInformation6.mmSubBalanceAdditionalDetails, com.tools20022.repository.msg.SubBalanceInformation6.mmAdditionalBalanceBreakdownDetails);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule.forSubBalanceInformation6,
						com.tools20022.repository.constraints.ConstraintAvailableWithNoStatusRule.forSubBalanceInformation6, com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forSubBalanceInformation6);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SubBalanceInformation6";
				definition = "Net position of a segregated holding of a single security within the overall position held in the securities account, eg, sub-balance per status.";
				nextVersions_lazy = () -> Arrays.asList(SubBalanceInformation14.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SubBalanceType5Choice getSubBalanceType() {
		return subBalanceType;
	}

	public SubBalanceInformation6 setSubBalanceType(SubBalanceType5Choice subBalanceType) {
		this.subBalanceType = Objects.requireNonNull(subBalanceType);
		return this;
	}

	public SubBalanceQuantity3Choice getQuantity() {
		return quantity;
	}

	public SubBalanceInformation6 setQuantity(SubBalanceQuantity3Choice quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public Optional<Max140Text> getSubBalanceAdditionalDetails() {
		return subBalanceAdditionalDetails == null ? Optional.empty() : Optional.of(subBalanceAdditionalDetails);
	}

	public SubBalanceInformation6 setSubBalanceAdditionalDetails(Max140Text subBalanceAdditionalDetails) {
		this.subBalanceAdditionalDetails = subBalanceAdditionalDetails;
		return this;
	}

	public List<AdditionalBalanceInformation6> getAdditionalBalanceBreakdownDetails() {
		return additionalBalanceBreakdownDetails == null ? additionalBalanceBreakdownDetails = new ArrayList<>() : additionalBalanceBreakdownDetails;
	}

	public SubBalanceInformation6 setAdditionalBalanceBreakdownDetails(List<AdditionalBalanceInformation6> additionalBalanceBreakdownDetails) {
		this.additionalBalanceBreakdownDetails = Objects.requireNonNull(additionalBalanceBreakdownDetails);
		return this;
	}
}