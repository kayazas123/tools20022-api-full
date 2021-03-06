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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.AmountRangeBoundary;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Limit for an amount range.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountRangeBoundary1#mmBoundaryAmount
 * AmountRangeBoundary1.mmBoundaryAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountRangeBoundary1#mmIncluded
 * AmountRangeBoundary1.mmIncluded}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AmountRangeBoundary
 * AmountRangeBoundary}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountRangeBoundary1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Limit for an amount range."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmountRangeBoundary1", propOrder = {"boundaryAmount", "included"})
public class AmountRangeBoundary1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BdryAmt", required = true)
	protected ImpliedCurrencyAndAmount boundaryAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#mmBoundaryAmount
	 * AmountRangeBoundary.mmBoundaryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountRangeBoundary1
	 * AmountRangeBoundary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BdryAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoundaryAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount value of the range limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountRangeBoundary1, ImpliedCurrencyAndAmount> mmBoundaryAmount = new MMMessageAttribute<AmountRangeBoundary1, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> AmountRangeBoundary.mmBoundaryAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountRangeBoundary1.mmObject();
			isDerived = false;
			xmlTag = "BdryAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoundaryAmount";
			definition = "Amount value of the range limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(AmountRangeBoundary1 obj) {
			return obj.getBoundaryAmount();
		}

		@Override
		public void setValue(AmountRangeBoundary1 obj, ImpliedCurrencyAndAmount value) {
			obj.setBoundaryAmount(value);
		}
	};
	@XmlElement(name = "Incl", required = true)
	protected YesNoIndicator included;
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
	 * {@linkplain com.tools20022.repository.entity.AmountRangeBoundary#mmIncluded
	 * AmountRangeBoundary.mmIncluded}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountRangeBoundary1
	 * AmountRangeBoundary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Incl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Included"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the boundary amount is included in the range of amount values."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountRangeBoundary1, YesNoIndicator> mmIncluded = new MMMessageAttribute<AmountRangeBoundary1, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> AmountRangeBoundary.mmIncluded;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountRangeBoundary1.mmObject();
			isDerived = false;
			xmlTag = "Incl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Included";
			definition = "Indicates whether the boundary amount is included in the range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(AmountRangeBoundary1 obj) {
			return obj.getIncluded();
		}

		@Override
		public void setValue(AmountRangeBoundary1 obj, YesNoIndicator value) {
			obj.setIncluded(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountRangeBoundary1.mmBoundaryAmount, com.tools20022.repository.msg.AmountRangeBoundary1.mmIncluded);
				trace_lazy = () -> AmountRangeBoundary.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountRangeBoundary1";
				definition = "Limit for an amount range.";
			}
		});
		return mmObject_lazy.get();
	}

	public ImpliedCurrencyAndAmount getBoundaryAmount() {
		return boundaryAmount;
	}

	public AmountRangeBoundary1 setBoundaryAmount(ImpliedCurrencyAndAmount boundaryAmount) {
		this.boundaryAmount = Objects.requireNonNull(boundaryAmount);
		return this;
	}

	public YesNoIndicator getIncluded() {
		return included;
	}

	public AmountRangeBoundary1 setIncluded(YesNoIndicator included) {
		this.included = Objects.requireNonNull(included);
		return this;
	}
}