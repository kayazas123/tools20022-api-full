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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CardDataReading1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of reading of the card data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReading1Code#Tag
 * CardDataReading1Code.Tag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#Physical
 * CardDataReading1Code.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#BarCode
 * CardDataReading1Code.BarCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#MagneticStripe
 * CardDataReading1Code.MagneticStripe}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReading1Code#ICC
 * CardDataReading1Code.ICC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#AccountData
 * CardDataReading1Code.AccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#ProximityReader
 * CardDataReading1Code.ProximityReader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#EMVProximityReader
 * CardDataReading1Code.EMVProximityReader}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
 * CardDataReadingCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardDataReading1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of reading of the card data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"TAGC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReading5Code
 * CardDataReading5Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardDataReading1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#Tag
	 * CardDataReading5Code.Tag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardDataReading1Code Tag = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tag";
			nextVersions_lazy = () -> Arrays.asList(CardDataReading5Code.Tag);
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject();
			codeName = CardDataReadingCode.Tag.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#Physical
	 * CardDataReading5Code.Physical}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardDataReading1Code Physical = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			nextVersions_lazy = () -> Arrays.asList(CardDataReading5Code.Physical);
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject();
			codeName = CardDataReadingCode.Physical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BarCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#BarCode
	 * CardDataReading5Code.BarCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardDataReading1Code BarCode = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BarCode";
			nextVersions_lazy = () -> Arrays.asList(CardDataReading5Code.BarCode);
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject();
			codeName = CardDataReadingCode.BarCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MagneticStripe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#MagneticStripe
	 * CardDataReading5Code.MagneticStripe}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardDataReading1Code MagneticStripe = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MagneticStripe";
			nextVersions_lazy = () -> Arrays.asList(CardDataReading5Code.MagneticStripe);
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject();
			codeName = CardDataReadingCode.MagneticStripe.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#ICC
	 * CardDataReading5Code.ICC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardDataReading1Code ICC = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICC";
			nextVersions_lazy = () -> Arrays.asList(CardDataReading5Code.ICC);
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject();
			codeName = CardDataReadingCode.ICC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#AccountData
	 * CardDataReading5Code.AccountData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardDataReading1Code AccountData = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountData";
			nextVersions_lazy = () -> Arrays.asList(CardDataReading5Code.AccountData);
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject();
			codeName = CardDataReadingCode.AccountData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProximityReader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#ProximityReader
	 * CardDataReading5Code.ProximityReader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardDataReading1Code ProximityReader = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProximityReader";
			nextVersions_lazy = () -> Arrays.asList(CardDataReading5Code.ProximityReader);
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject();
			codeName = CardDataReadingCode.ProximityReader.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVProximityReader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#EMVProximityReader
	 * CardDataReading5Code.EMVProximityReader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardDataReading1Code EMVProximityReader = new CardDataReading1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVProximityReader";
			nextVersions_lazy = () -> Arrays.asList(CardDataReading5Code.EMVProximityReader);
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.mmObject();
			codeName = CardDataReadingCode.EMVProximityReader.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardDataReading1Code> codesByName = new LinkedHashMap<>();

	protected CardDataReading1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TAGC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardDataReading1Code";
				definition = "Type of reading of the card data.";
				nextVersions_lazy = () -> Arrays.asList(CardDataReading5Code.mmObject());
				trace_lazy = () -> CardDataReadingCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardDataReading1Code.Tag, com.tools20022.repository.codeset.CardDataReading1Code.Physical, com.tools20022.repository.codeset.CardDataReading1Code.BarCode,
						com.tools20022.repository.codeset.CardDataReading1Code.MagneticStripe, com.tools20022.repository.codeset.CardDataReading1Code.ICC, com.tools20022.repository.codeset.CardDataReading1Code.AccountData,
						com.tools20022.repository.codeset.CardDataReading1Code.ProximityReader, com.tools20022.repository.codeset.CardDataReading1Code.EMVProximityReader);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Tag.getCodeName().get(), Tag);
		codesByName.put(Physical.getCodeName().get(), Physical);
		codesByName.put(BarCode.getCodeName().get(), BarCode);
		codesByName.put(MagneticStripe.getCodeName().get(), MagneticStripe);
		codesByName.put(ICC.getCodeName().get(), ICC);
		codesByName.put(AccountData.getCodeName().get(), AccountData);
		codesByName.put(ProximityReader.getCodeName().get(), ProximityReader);
		codesByName.put(EMVProximityReader.getCodeName().get(), EMVProximityReader);
	}

	public static CardDataReading1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardDataReading1Code[] values() {
		CardDataReading1Code[] values = new CardDataReading1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardDataReading1Code> {
		@Override
		public CardDataReading1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardDataReading1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}