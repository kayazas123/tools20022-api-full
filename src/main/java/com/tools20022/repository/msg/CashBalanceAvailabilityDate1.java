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
import com.tools20022.repository.choice.CashAvailabilityDate1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max15PlusSignedNumericText;
import com.tools20022.repository.entity.CashAvailability;
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
 * Indicates when the amount of money will become available.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailabilityDate1#NumberOfDaysOrActualDate
 * CashBalanceAvailabilityDate1.NumberOfDaysOrActualDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailabilityDate1#mmNumberOfDays
 * CashBalanceAvailabilityDate1.mmNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailabilityDate1#mmActualDate
 * CashBalanceAvailabilityDate1.mmActualDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAvailability
 * CashAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashBalanceAvailabilityDate1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates when the amount of money will become available."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.CashAvailabilityDate1Choice
 * CashAvailabilityDate1Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashBalanceAvailabilityDate1", propOrder = {"numberOfDays", "actualDate"})
public class CashBalanceAvailabilityDate1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NbOfDays", required = true)
	protected Max15PlusSignedNumericText numberOfDays;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15PlusSignedNumericText
	 * Max15PlusSignedNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAvailability#mmNumberOfDays
	 * CashAvailability.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailabilityDate1
	 * CashBalanceAvailabilityDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDays"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the number of float days attached to the balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAvailabilityDate1Choice#mmNumberOfDays
	 * CashAvailabilityDate1Choice.mmNumberOfDays}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashBalanceAvailabilityDate1, Max15PlusSignedNumericText> mmNumberOfDays = new MMMessageAttribute<CashBalanceAvailabilityDate1, Max15PlusSignedNumericText>() {
		{
			businessElementTrace_lazy = () -> CashAvailability.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashBalanceAvailabilityDate1.mmObject();
			isDerived = false;
			xmlTag = "NbOfDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDays";
			definition = "Indicates the number of float days attached to the balance.";
			nextVersions_lazy = () -> Arrays.asList(CashAvailabilityDate1Choice.mmNumberOfDays);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15PlusSignedNumericText.mmObject();
		}

		@Override
		public Max15PlusSignedNumericText getValue(CashBalanceAvailabilityDate1 obj) {
			return obj.getNumberOfDays();
		}

		@Override
		public void setValue(CashBalanceAvailabilityDate1 obj, Max15PlusSignedNumericText value) {
			obj.setNumberOfDays(value);
		}
	};
	@XmlElement(name = "ActlDt", required = true)
	protected ISODate actualDate;
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
	 * {@linkplain com.tools20022.repository.entity.CashAvailability#mmDate
	 * CashAvailability.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailabilityDate1
	 * CashBalanceAvailabilityDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the actual availability date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CashAvailabilityDate1Choice#mmActualDate
	 * CashAvailabilityDate1Choice.mmActualDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashBalanceAvailabilityDate1, ISODate> mmActualDate = new MMMessageAttribute<CashBalanceAvailabilityDate1, ISODate>() {
		{
			businessElementTrace_lazy = () -> CashAvailability.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashBalanceAvailabilityDate1.mmObject();
			isDerived = false;
			xmlTag = "ActlDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualDate";
			definition = "Identifies the actual availability date.";
			nextVersions_lazy = () -> Arrays.asList(CashAvailabilityDate1Choice.mmActualDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CashBalanceAvailabilityDate1 obj) {
			return obj.getActualDate();
		}

		@Override
		public void setValue(CashBalanceAvailabilityDate1 obj, ISODate value) {
			obj.setActualDate(value);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailabilityDate1
	 * CashBalanceAvailabilityDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailabilityDate1#mmNumberOfDays
	 * CashBalanceAvailabilityDate1.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceAvailabilityDate1#mmActualDate
	 * CashBalanceAvailabilityDate1.mmActualDate}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysOrActualDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor NumberOfDaysOrActualDate = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysOrActualDate";
			messageComponent_lazy = () -> com.tools20022.repository.msg.CashBalanceAvailabilityDate1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalanceAvailabilityDate1.mmNumberOfDays, com.tools20022.repository.msg.CashBalanceAvailabilityDate1.mmActualDate);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalanceAvailabilityDate1.mmNumberOfDays, com.tools20022.repository.msg.CashBalanceAvailabilityDate1.mmActualDate);
				trace_lazy = () -> CashAvailability.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CashBalanceAvailabilityDate1";
				definition = "Indicates when the amount of money will become available.";
				nextVersions_lazy = () -> Arrays.asList(CashAvailabilityDate1Choice.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalanceAvailabilityDate1.NumberOfDaysOrActualDate);
			}
		});
		return mmObject_lazy.get();
	}

	public Max15PlusSignedNumericText getNumberOfDays() {
		return numberOfDays;
	}

	public CashBalanceAvailabilityDate1 setNumberOfDays(Max15PlusSignedNumericText numberOfDays) {
		this.numberOfDays = Objects.requireNonNull(numberOfDays);
		return this;
	}

	public ISODate getActualDate() {
		return actualDate;
	}

	public CashBalanceAvailabilityDate1 setActualDate(ISODate actualDate) {
		this.actualDate = Objects.requireNonNull(actualDate);
		return this;
	}
}