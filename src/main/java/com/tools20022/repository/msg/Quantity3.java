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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.UnitOfMeasure4Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ProductQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the quantity of a product in a trade transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Quantity3#UnitOfMeasureCodeOrOtherUnitOfMeasureRule
 * Quantity3.UnitOfMeasureCodeOrOtherUnitOfMeasureRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity3#mmUnitOfMeasureCode
 * Quantity3.mmUnitOfMeasureCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity3#mmOtherUnitOfMeasure
 * Quantity3.mmOtherUnitOfMeasure}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity3#mmValue
 * Quantity3.mmValue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ProductQuantity
 * ProductQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Quantity3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the quantity of a product in a trade transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity10 Quantity10}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Quantity3", propOrder = {"unitOfMeasureCode", "otherUnitOfMeasure", "value"})
public class Quantity3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UnitOfMeasrCd", required = true)
	protected UnitOfMeasure4Code unitOfMeasureCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasure4Code
	 * UnitOfMeasure4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmUnitOfMeasure
	 * ProductQuantity.mmUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitOfMeasrCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasureCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the unit of measurement. For example, kilo, tons."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quantity3, UnitOfMeasure4Code> mmUnitOfMeasureCode = new MMMessageAttribute<Quantity3, UnitOfMeasure4Code>() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmUnitOfMeasure;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quantity3.mmObject();
			isDerived = false;
			xmlTag = "UnitOfMeasrCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitOfMeasureCode";
			definition = "Specifies the unit of measurement. For example, kilo, tons.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnitOfMeasure4Code.mmObject();
		}

		@Override
		public UnitOfMeasure4Code getValue(Quantity3 obj) {
			return obj.getUnitOfMeasureCode();
		}

		@Override
		public void setValue(Quantity3 obj, UnitOfMeasure4Code value) {
			obj.setUnitOfMeasureCode(value);
		}
	};
	@XmlElement(name = "OthrUnitOfMeasr", required = true)
	protected Max35Text otherUnitOfMeasure;
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
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmUnitOfMeasure
	 * ProductQuantity.mmUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrUnitOfMeasr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherUnitOfMeasure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the unit of measure not present in the code list."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quantity3, Max35Text> mmOtherUnitOfMeasure = new MMMessageAttribute<Quantity3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmUnitOfMeasure;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quantity3.mmObject();
			isDerived = false;
			xmlTag = "OthrUnitOfMeasr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherUnitOfMeasure";
			definition = "Identifies the unit of measure not present in the code list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Quantity3 obj) {
			return obj.getOtherUnitOfMeasure();
		}

		@Override
		public void setValue(Quantity3 obj, Max35Text value) {
			obj.setOtherUnitOfMeasure(value);
		}
	};
	@XmlElement(name = "Val", required = true)
	protected DecimalNumber value;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmValue
	 * ProductQuantity.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Val"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of a product on a line specified by a number. For example, 100 (kgs), 50 (pieces)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Quantity10#mmValue
	 * Quantity10.mmValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Quantity3, DecimalNumber> mmValue = new MMMessageAttribute<Quantity3, DecimalNumber>() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.Quantity3.mmObject();
			isDerived = false;
			xmlTag = "Val";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Quantity of a product on a line specified by a number. For example, 100 (kgs), 50 (pieces).";
			nextVersions_lazy = () -> Arrays.asList(Quantity10.mmValue);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(Quantity3 obj) {
			return obj.getValue();
		}

		@Override
		public void setValue(Quantity3 obj, DecimalNumber value) {
			obj.setValue(value);
		}
	};
	/**
	 * If UnitOfMeasureCode is present, then OtherUnitOfMeasure is not allowed.
	 * If UnitOfMeasureCode is not present, then OtherUnitOfMeasure is
	 * mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} = {@linkplain com.tools20022.repository.msg.Quantity3
	 * Quantity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity3#mmUnitOfMeasureCode
	 * Quantity3.mmUnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity3#mmOtherUnitOfMeasure
	 * Quantity3.mmOtherUnitOfMeasure}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasureCodeOrOtherUnitOfMeasureRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If UnitOfMeasureCode is present, then OtherUnitOfMeasure is not allowed. If UnitOfMeasureCode is not present, then OtherUnitOfMeasure is mandatory."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor UnitOfMeasureCodeOrOtherUnitOfMeasureRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitOfMeasureCodeOrOtherUnitOfMeasureRule";
			definition = "If UnitOfMeasureCode is present, then OtherUnitOfMeasure is not allowed. If UnitOfMeasureCode is not present, then OtherUnitOfMeasure is mandatory.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.Quantity3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quantity3.mmUnitOfMeasureCode, com.tools20022.repository.msg.Quantity3.mmOtherUnitOfMeasure);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quantity3.mmUnitOfMeasureCode, com.tools20022.repository.msg.Quantity3.mmOtherUnitOfMeasure, com.tools20022.repository.msg.Quantity3.mmValue);
				trace_lazy = () -> ProductQuantity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Quantity3";
				definition = "Specifies the quantity of a product in a trade transaction.";
				nextVersions_lazy = () -> Arrays.asList(Quantity10.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quantity3.UnitOfMeasureCodeOrOtherUnitOfMeasureRule);
			}
		});
		return mmObject_lazy.get();
	}

	public UnitOfMeasure4Code getUnitOfMeasureCode() {
		return unitOfMeasureCode;
	}

	public Quantity3 setUnitOfMeasureCode(UnitOfMeasure4Code unitOfMeasureCode) {
		this.unitOfMeasureCode = Objects.requireNonNull(unitOfMeasureCode);
		return this;
	}

	public Max35Text getOtherUnitOfMeasure() {
		return otherUnitOfMeasure;
	}

	public Quantity3 setOtherUnitOfMeasure(Max35Text otherUnitOfMeasure) {
		this.otherUnitOfMeasure = Objects.requireNonNull(otherUnitOfMeasure);
		return this;
	}

	public DecimalNumber getValue() {
		return value;
	}

	public Quantity3 setValue(DecimalNumber value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}
}