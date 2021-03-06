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
import com.tools20022.repository.codeset.PINFormat3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * PIN (Personal Identification Number) format used before encryption.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat3Code#ISO0
 * PINFormat3Code.ISO0}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat3Code#ISO1
 * PINFormat3Code.ISO1}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat3Code#ISO2
 * PINFormat3Code.ISO2}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat3Code#ISO3
 * PINFormat3Code.ISO3}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat3Code#ISO4
 * PINFormat3Code.ISO4}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat3Code#ISO5
 * PINFormat3Code.ISO5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PINFormatCode PINFormatCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PINFormat3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "PIN (Personal Identification Number) format used before encryption."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ISO0"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.PINFormat2Code PINFormat2Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PINFormat3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat3Code
	 * PINFormat3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat2Code#ISO0
	 * PINFormat2Code.ISO0}</li>
	 * </ul>
	 */
	public static final PINFormat3Code ISO0 = new PINFormat3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO0";
			previousVersion_lazy = () -> PINFormat2Code.ISO0;
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat3Code.mmObject();
			codeName = PINFormatCode.ISO0.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat3Code
	 * PINFormat3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat2Code#ISO1
	 * PINFormat2Code.ISO1}</li>
	 * </ul>
	 */
	public static final PINFormat3Code ISO1 = new PINFormat3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO1";
			previousVersion_lazy = () -> PINFormat2Code.ISO1;
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat3Code.mmObject();
			codeName = PINFormatCode.ISO1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat3Code
	 * PINFormat3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat2Code#ISO2
	 * PINFormat2Code.ISO2}</li>
	 * </ul>
	 */
	public static final PINFormat3Code ISO2 = new PINFormat3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO2";
			previousVersion_lazy = () -> PINFormat2Code.ISO2;
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat3Code.mmObject();
			codeName = PINFormatCode.ISO2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat3Code
	 * PINFormat3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat2Code#ISO3
	 * PINFormat2Code.ISO3}</li>
	 * </ul>
	 */
	public static final PINFormat3Code ISO3 = new PINFormat3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO3";
			previousVersion_lazy = () -> PINFormat2Code.ISO3;
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat3Code.mmObject();
			codeName = PINFormatCode.ISO3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat3Code
	 * PINFormat3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat2Code#ISO4
	 * PINFormat2Code.ISO4}</li>
	 * </ul>
	 */
	public static final PINFormat3Code ISO4 = new PINFormat3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO4";
			previousVersion_lazy = () -> PINFormat2Code.ISO4;
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat3Code.mmObject();
			codeName = PINFormatCode.ISO4.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat3Code
	 * PINFormat3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PINFormat3Code ISO5 = new PINFormat3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO5";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat3Code.mmObject();
			codeName = PINFormatCode.ISO5.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PINFormat3Code> codesByName = new LinkedHashMap<>();

	protected PINFormat3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ISO0");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PINFormat3Code";
				definition = "PIN (Personal Identification Number) format used before encryption.";
				previousVersion_lazy = () -> PINFormat2Code.mmObject();
				trace_lazy = () -> PINFormatCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PINFormat3Code.ISO0, com.tools20022.repository.codeset.PINFormat3Code.ISO1, com.tools20022.repository.codeset.PINFormat3Code.ISO2,
						com.tools20022.repository.codeset.PINFormat3Code.ISO3, com.tools20022.repository.codeset.PINFormat3Code.ISO4, com.tools20022.repository.codeset.PINFormat3Code.ISO5);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ISO0.getCodeName().get(), ISO0);
		codesByName.put(ISO1.getCodeName().get(), ISO1);
		codesByName.put(ISO2.getCodeName().get(), ISO2);
		codesByName.put(ISO3.getCodeName().get(), ISO3);
		codesByName.put(ISO4.getCodeName().get(), ISO4);
		codesByName.put(ISO5.getCodeName().get(), ISO5);
	}

	public static PINFormat3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PINFormat3Code[] values() {
		PINFormat3Code[] values = new PINFormat3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PINFormat3Code> {
		@Override
		public PINFormat3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PINFormat3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}