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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentSchedule;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies expected and due payment date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDateRange1#mmPaymentScheduleIdentification
 * PaymentDateRange1.mmPaymentScheduleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentDateRange1#mmExpectedDate
 * PaymentDateRange1.mmExpectedDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentDateRange1#mmDueDate
 * PaymentDateRange1.mmDueDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentSchedule
 * PaymentSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentDateRange1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies expected and due payment date."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange1
 * ShipmentDateRange1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentDateRange1", propOrder = {"paymentScheduleIdentification", "expectedDate", "dueDate"})
public class PaymentDateRange1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtSchdlId")
	protected Max35Text paymentScheduleIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDateRange1
	 * PaymentDateRange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtSchdlId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentScheduleIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the payment schedule."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDateRange1, Optional<Max35Text>> mmPaymentScheduleIdentification = new MMMessageAttribute<PaymentDateRange1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDateRange1.mmObject();
			isDerived = false;
			xmlTag = "PmtSchdlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentScheduleIdentification";
			definition = "Unique and unambiguous identification of the payment schedule.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentDateRange1 obj) {
			return obj.getPaymentScheduleIdentification();
		}

		@Override
		public void setValue(PaymentDateRange1 obj, Optional<Max35Text> value) {
			obj.setPaymentScheduleIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdDt")
	protected ISODate expectedDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentSchedule#mmDate
	 * PaymentSchedule.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDateRange1
	 * PaymentDateRange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expected payment date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange1#mmEarliestShipmentDate
	 * ShipmentDateRange1.mmEarliestShipmentDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDateRange1, Optional<ISODate>> mmExpectedDate = new MMMessageAttribute<PaymentDateRange1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> PaymentSchedule.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDateRange1.mmObject();
			isDerived = false;
			xmlTag = "XpctdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedDate";
			definition = "Expected payment date.";
			previousVersion_lazy = () -> ShipmentDateRange1.mmEarliestShipmentDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(PaymentDateRange1 obj) {
			return obj.getExpectedDate();
		}

		@Override
		public void setValue(PaymentDateRange1 obj, Optional<ISODate> value) {
			obj.setExpectedDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DueDt")
	protected ISODate dueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentSchedule#mmDate
	 * PaymentSchedule.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentDateRange1
	 * PaymentDateRange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DueDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Latest date whereby the amount must be paid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange1#mmLatestShipmentDate
	 * ShipmentDateRange1.mmLatestShipmentDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentDateRange1, Optional<ISODate>> mmDueDate = new MMMessageAttribute<PaymentDateRange1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> PaymentSchedule.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentDateRange1.mmObject();
			isDerived = false;
			xmlTag = "DueDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueDate";
			definition = "Latest date whereby the amount must be paid.";
			previousVersion_lazy = () -> ShipmentDateRange1.mmLatestShipmentDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(PaymentDateRange1 obj) {
			return obj.getDueDate();
		}

		@Override
		public void setValue(PaymentDateRange1 obj, Optional<ISODate> value) {
			obj.setDueDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentDateRange1.mmPaymentScheduleIdentification, com.tools20022.repository.msg.PaymentDateRange1.mmExpectedDate,
						com.tools20022.repository.msg.PaymentDateRange1.mmDueDate);
				trace_lazy = () -> PaymentSchedule.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentDateRange1";
				definition = "Specifies expected and due payment date.";
				previousVersion_lazy = () -> ShipmentDateRange1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getPaymentScheduleIdentification() {
		return paymentScheduleIdentification == null ? Optional.empty() : Optional.of(paymentScheduleIdentification);
	}

	public PaymentDateRange1 setPaymentScheduleIdentification(Max35Text paymentScheduleIdentification) {
		this.paymentScheduleIdentification = paymentScheduleIdentification;
		return this;
	}

	public Optional<ISODate> getExpectedDate() {
		return expectedDate == null ? Optional.empty() : Optional.of(expectedDate);
	}

	public PaymentDateRange1 setExpectedDate(ISODate expectedDate) {
		this.expectedDate = expectedDate;
		return this;
	}

	public Optional<ISODate> getDueDate() {
		return dueDate == null ? Optional.empty() : Optional.of(dueDate);
	}

	public PaymentDateRange1 setDueDate(ISODate dueDate) {
		this.dueDate = dueDate;
		return this;
	}
}