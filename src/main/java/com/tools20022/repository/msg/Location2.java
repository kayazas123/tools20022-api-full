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
import com.tools20022.repository.choice.CountrySubdivision1Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.entity.Location;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Location information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Location2#mmCountry
 * Location2.mmCountry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Location2#mmCountrySubDivision
 * Location2.mmCountrySubDivision}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Location2#mmText
 * Location2.mmText}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Location2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Location information."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Location1
 * Location1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Location2", propOrder = {"country", "countrySubDivision", "text"})
public class Location2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ctry")
	protected CountryCode country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Location2
	 * Location2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of jurisdiction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Location1#mmCountry
	 * Location1.mmCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Location2, Optional<CountryCode>> mmCountry = new MMMessageAttribute<Location2, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.Location2.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country of jurisdiction.";
			previousVersion_lazy = () -> Location1.mmCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(Location2 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(Location2 obj, Optional<CountryCode> value) {
			obj.setCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrySubDvsn")
	protected CountrySubdivision1Choice countrySubDivision;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CountrySubdivision1Choice
	 * CountrySubdivision1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmCountyIdentification
	 * PostalAddress.mmCountyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Location2
	 * Location2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrySubDvsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountrySubDivision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Codified representation of the jurisdiction as published in ISO 3166-2."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Location1#mmCountrySubDivision
	 * Location1.mmCountrySubDivision}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Location2, Optional<CountrySubdivision1Choice>> mmCountrySubDivision = new MMMessageAttribute<Location2, Optional<CountrySubdivision1Choice>>() {
		{
			businessElementTrace_lazy = () -> PostalAddress.mmCountyIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Location2.mmObject();
			isDerived = false;
			xmlTag = "CtrySubDvsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountrySubDivision";
			definition = "Codified representation of the jurisdiction as published in ISO 3166-2.";
			previousVersion_lazy = () -> Location1.mmCountrySubDivision;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CountrySubdivision1Choice.mmObject();
		}

		@Override
		public Optional<CountrySubdivision1Choice> getValue(Location2 obj) {
			return obj.getCountrySubDivision();
		}

		@Override
		public void setValue(Location2 obj, Optional<CountrySubdivision1Choice> value) {
			obj.setCountrySubDivision(value.orElse(null));
		}
	};
	@XmlElement(name = "Txt")
	protected Max35Text text;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Location2
	 * Location2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Txt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Text"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of jurisdiction, for example, Frankfurt."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Location1#mmText
	 * Location1.mmText}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Location2, Optional<Max35Text>> mmText = new MMMessageAttribute<Location2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Location2.mmObject();
			isDerived = false;
			xmlTag = "Txt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Text";
			definition = "Name of jurisdiction, for example, Frankfurt.";
			previousVersion_lazy = () -> Location1.mmText;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Location2 obj) {
			return obj.getText();
		}

		@Override
		public void setValue(Location2 obj, Optional<Max35Text> value) {
			obj.setText(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Location2.mmCountry, com.tools20022.repository.msg.Location2.mmCountrySubDivision, com.tools20022.repository.msg.Location2.mmText);
				trace_lazy = () -> Location.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Location2";
				definition = "Location information.";
				previousVersion_lazy = () -> Location1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CountryCode> getCountry() {
		return country == null ? Optional.empty() : Optional.of(country);
	}

	public Location2 setCountry(CountryCode country) {
		this.country = country;
		return this;
	}

	public Optional<CountrySubdivision1Choice> getCountrySubDivision() {
		return countrySubDivision == null ? Optional.empty() : Optional.of(countrySubDivision);
	}

	public Location2 setCountrySubDivision(CountrySubdivision1Choice countrySubDivision) {
		this.countrySubDivision = countrySubDivision;
		return this;
	}

	public Optional<Max35Text> getText() {
		return text == null ? Optional.empty() : Optional.of(text);
	}

	public Location2 setText(Max35Text text) {
		this.text = text;
		return this;
	}
}