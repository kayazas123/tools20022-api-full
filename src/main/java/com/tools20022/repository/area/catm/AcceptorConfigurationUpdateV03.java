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

package com.tools20022.repository.area.catm;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TerminalManagementArchive;
import com.tools20022.repository.msg.AcceptorConfiguration3;
import com.tools20022.repository.msg.ContentInformationType9;
import com.tools20022.repository.msg.Header4;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * Update of the acceptor configuration to be dowloaded by the terminal
 * management system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catm.003.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TerminalManagementArchive
 * TerminalManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03#mmHeader
 * AcceptorConfigurationUpdateV03.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03#mmAcceptorConfiguration
 * AcceptorConfigurationUpdateV03.mmAcceptorConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03#mmSecurityTrailer
 * AcceptorConfigurationUpdateV03.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrCfgtnUpd"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorConfigurationUpdateV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Update of the acceptor configuration to be dowloaded by the terminal management system."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04
 * AcceptorConfigurationUpdateV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV02
 * AcceptorConfigurationUpdateV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorConfigurationUpdateV03", propOrder = {"header", "acceptorConfiguration", "securityTrailer"})
public class AcceptorConfigurationUpdateV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header4 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header4 Header4}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics related to the transfer of the acceptor parameters."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04#mmHeader
	 * AcceptorConfigurationUpdateV04.mmHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV02#mmHeader
	 * AcceptorConfigurationUpdateV02.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorConfigurationUpdateV03, Header4> mmHeader = new MMMessageBuildingBlock<AcceptorConfigurationUpdateV03, Header4>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Set of characteristics related to the transfer of the acceptor parameters.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV04.mmHeader);
			previousVersion_lazy = () -> AcceptorConfigurationUpdateV02.mmHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header4.mmObject();
		}

		@Override
		public Header4 getValue(AcceptorConfigurationUpdateV03 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(AcceptorConfigurationUpdateV03 obj, Header4 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "AccptrCfgtn", required = true)
	protected AcceptorConfiguration3 acceptorConfiguration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3
	 * AcceptorConfiguration3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptrCfgtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acceptor configuration to be downloaded from the terminal management system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04#mmAcceptorConfiguration
	 * AcceptorConfigurationUpdateV04.mmAcceptorConfiguration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV02#mmAcceptorConfiguration
	 * AcceptorConfigurationUpdateV02.mmAcceptorConfiguration}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorConfigurationUpdateV03, AcceptorConfiguration3> mmAcceptorConfiguration = new MMMessageBuildingBlock<AcceptorConfigurationUpdateV03, AcceptorConfiguration3>() {
		{
			xmlTag = "AccptrCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorConfiguration";
			definition = "Acceptor configuration to be downloaded from the terminal management system.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV04.mmAcceptorConfiguration);
			previousVersion_lazy = () -> AcceptorConfigurationUpdateV02.mmAcceptorConfiguration;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorConfiguration3.mmObject();
		}

		@Override
		public AcceptorConfiguration3 getValue(AcceptorConfigurationUpdateV03 obj) {
			return obj.getAcceptorConfiguration();
		}

		@Override
		public void setValue(AcceptorConfigurationUpdateV03 obj, AcceptorConfiguration3 value) {
			obj.setAcceptorConfiguration(value);
		}
	};
	@XmlElement(name = "SctyTrlr", required = true)
	protected ContentInformationType9 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9
	 * ContentInformationType9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trailer of the message containing a MAC or a digital signature."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04#mmSecurityTrailer
	 * AcceptorConfigurationUpdateV04.mmSecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV02#mmSecurityTrailer
	 * AcceptorConfigurationUpdateV02.mmSecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorConfigurationUpdateV03, ContentInformationType9> mmSecurityTrailer = new MMMessageBuildingBlock<AcceptorConfigurationUpdateV03, ContentInformationType9>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV04.mmSecurityTrailer);
			previousVersion_lazy = () -> AcceptorConfigurationUpdateV02.mmSecurityTrailer;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType9.mmObject();
		}

		@Override
		public ContentInformationType9 getValue(AcceptorConfigurationUpdateV03 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(AcceptorConfigurationUpdateV03 obj, ContentInformationType9 value) {
			obj.setSecurityTrailer(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfigurationUpdateV03";
				definition = "Update of the acceptor configuration to be dowloaded by the terminal management system.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV04.mmObject());
				previousVersion_lazy = () -> AcceptorConfigurationUpdateV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrCfgtnUpd";
				businessArea_lazy = () -> TerminalManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03.mmHeader, com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03.mmAcceptorConfiguration,
						com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catm";
						messageFunctionality = "003";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorConfigurationUpdateV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header4 getHeader() {
		return header;
	}

	public AcceptorConfigurationUpdateV03 setHeader(Header4 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorConfiguration3 getAcceptorConfiguration() {
		return acceptorConfiguration;
	}

	public AcceptorConfigurationUpdateV03 setAcceptorConfiguration(AcceptorConfiguration3 acceptorConfiguration) {
		this.acceptorConfiguration = Objects.requireNonNull(acceptorConfiguration);
		return this;
	}

	public ContentInformationType9 getSecurityTrailer() {
		return securityTrailer;
	}

	public AcceptorConfigurationUpdateV03 setSecurityTrailer(ContentInformationType9 securityTrailer) {
		this.securityTrailer = Objects.requireNonNull(securityTrailer);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.03")
	static public class Document {
		@XmlElement(name = "AccptrCfgtnUpd", required = true)
		public AcceptorConfigurationUpdateV03 messageBody;
	}
}