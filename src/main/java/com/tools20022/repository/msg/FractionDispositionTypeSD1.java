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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.FractionalSecurityRule1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action securities
 * movement fraction disposition details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FractionDispositionTypeSD1#mmPlaceAndName
 * FractionDispositionTypeSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FractionDispositionTypeSD1#mmFractionalSecurityRule
 * FractionDispositionTypeSD1.mmFractionalSecurityRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FractionDispositionTypeSD1#mmRoundingFactor
 * FractionDispositionTypeSD1.mmRoundingFactor}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FractionDispositionTypeSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action securities movement fraction disposition details."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FractionDispositionTypeSD1", propOrder = {"placeAndName", "fractionalSecurityRule", "roundingFactor"})
public class FractionDispositionTypeSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FractionDispositionTypeSD1
	 * FractionDispositionTypeSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FractionDispositionTypeSD1, Max350Text> mmPlaceAndName = new MMMessageAttribute<FractionDispositionTypeSD1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FractionDispositionTypeSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(FractionDispositionTypeSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(FractionDispositionTypeSD1 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "FrctnlSctyRule")
	protected FractionalSecurityRule1Code fractionalSecurityRule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FractionalSecurityRule1Code
	 * FractionalSecurityRule1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FractionDispositionTypeSD1
	 * FractionDispositionTypeSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrctnlSctyRule"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalSecurityRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used for the fractional rule that cannot be classified in ISO (fractional disposition) in the event that fractional disposition is calculated specific to the beneficial owner positions. Identifies a scenario where the issuer / market announced fractional security rounding at beneficial holder level. Used in conjunction with a rounding factor. For an example if rounding factor is 0.6, this means that fractional units greater than or equal to 6 will be rounded up and less than 6 will be rounded down."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Fractional Security Rule</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FractionDispositionTypeSD1, Optional<FractionalSecurityRule1Code>> mmFractionalSecurityRule = new MMMessageAttribute<FractionDispositionTypeSD1, Optional<FractionalSecurityRule1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FractionDispositionTypeSD1.mmObject();
			isDerived = false;
			xmlTag = "FrctnlSctyRule";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Fractional Security Rule"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalSecurityRule";
			definition = "Used for the fractional rule that cannot be classified in ISO (fractional disposition) in the event that fractional disposition is calculated specific to the beneficial owner positions. Identifies a scenario where the issuer / market announced fractional security rounding at beneficial holder level. Used in conjunction with a rounding factor. For an example if rounding factor is 0.6, this means that fractional units greater than or equal to 6 will be rounded up and less than 6 will be rounded down.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FractionalSecurityRule1Code.mmObject();
		}

		@Override
		public Optional<FractionalSecurityRule1Code> getValue(FractionDispositionTypeSD1 obj) {
			return obj.getFractionalSecurityRule();
		}

		@Override
		public void setValue(FractionDispositionTypeSD1 obj, Optional<FractionalSecurityRule1Code> value) {
			obj.setFractionalSecurityRule(value.orElse(null));
		}
	};
	@XmlElement(name = "RndgFctr")
	protected DecimalNumber roundingFactor;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FractionDispositionTypeSD1
	 * FractionDispositionTypeSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndgFctr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Decimal above which numbers are rounded. For an example if rounding factor is 0.6 this means that fractional units greater than or equal to 6 will be rounded up and less than 6 will be rounded down."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Rounding Factor</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FractionDispositionTypeSD1, Optional<DecimalNumber>> mmRoundingFactor = new MMMessageAttribute<FractionDispositionTypeSD1, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FractionDispositionTypeSD1.mmObject();
			isDerived = false;
			xmlTag = "RndgFctr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Rounding Factor"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingFactor";
			definition = "Decimal above which numbers are rounded. For an example if rounding factor is 0.6 this means that fractional units greater than or equal to 6 will be rounded up and less than 6 will be rounded down.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(FractionDispositionTypeSD1 obj) {
			return obj.getRoundingFactor();
		}

		@Override
		public void setValue(FractionDispositionTypeSD1 obj, Optional<DecimalNumber> value) {
			obj.setRoundingFactor(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FractionDispositionTypeSD1.mmPlaceAndName, com.tools20022.repository.msg.FractionDispositionTypeSD1.mmFractionalSecurityRule,
						com.tools20022.repository.msg.FractionDispositionTypeSD1.mmRoundingFactor);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FractionDispositionTypeSD1";
				definition = "Provides additional information regarding corporate action securities movement fraction disposition details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public FractionDispositionTypeSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<FractionalSecurityRule1Code> getFractionalSecurityRule() {
		return fractionalSecurityRule == null ? Optional.empty() : Optional.of(fractionalSecurityRule);
	}

	public FractionDispositionTypeSD1 setFractionalSecurityRule(FractionalSecurityRule1Code fractionalSecurityRule) {
		this.fractionalSecurityRule = fractionalSecurityRule;
		return this;
	}

	public Optional<DecimalNumber> getRoundingFactor() {
		return roundingFactor == null ? Optional.empty() : Optional.of(roundingFactor);
	}

	public FractionDispositionTypeSD1 setRoundingFactor(DecimalNumber roundingFactor) {
		this.roundingFactor = roundingFactor;
		return this;
	}
}