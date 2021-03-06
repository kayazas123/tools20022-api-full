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

package com.tools20022.repository.area.catp;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ATMCardTransactionLatestVersion;
import com.tools20022.repository.msg.ATMTransferRequest1;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header31;
import com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The ATMTransferRequest message is sent by an ATM to an ATM manager to request
 * the approval of a fund transfer at the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catp.016.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ATMCardTransactionLatestVersion
 * ATMCardTransactionLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01#mmHeader
 * ATMTransferRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01#mmProtectedATMTransferRequest
 * ATMTransferRequestV01.mmProtectedATMTransferRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01#mmATMTransferRequest
 * ATMTransferRequestV01.mmATMTransferRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01#mmSecurityTrailer
 * ATMTransferRequestV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion
 * ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ATMTrfReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMTransferRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ATMTransferRequest message is sent by an ATM to an ATM manager to request the approval of a fund transfer at the ATM."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMTransferRequestV01", propOrder = {"header", "protectedATMTransferRequest", "aTMTransferRequest", "securityTrailer"})
public class ATMTransferRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header31 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header31
	 * Header31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the protocol management on a segment of the path from the ATM to the acquirer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMTransferRequestV01, Header31> mmHeader = new MMMessageBuildingBlock<ATMTransferRequestV01, Header31>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management on a segment of the path from the ATM to the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header31.mmObject();
		}

		@Override
		public Header31 getValue(ATMTransferRequestV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(ATMTransferRequestV01 obj, Header31 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "PrtctdATMTrfReq")
	protected ContentInformationType10 protectedATMTransferRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdATMTrfReq"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedATMTransferRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted body of the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMTransferRequestV01, Optional<ContentInformationType10>> mmProtectedATMTransferRequest = new MMMessageBuildingBlock<ATMTransferRequestV01, Optional<ContentInformationType10>>() {
		{
			xmlTag = "PrtctdATMTrfReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedATMTransferRequest";
			definition = "Encrypted body of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMTransferRequestV01 obj) {
			return obj.getProtectedATMTransferRequest();
		}

		@Override
		public void setValue(ATMTransferRequestV01 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedATMTransferRequest(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMTrfReq")
	protected ATMTransferRequest1 aTMTransferRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransferRequest1
	 * ATMTransferRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMTrfReq"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMTransferRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the request of a fund transfer from an ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMTransferRequestV01, Optional<ATMTransferRequest1>> mmATMTransferRequest = new MMMessageBuildingBlock<ATMTransferRequestV01, Optional<ATMTransferRequest1>>() {
		{
			xmlTag = "ATMTrfReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTransferRequest";
			definition = "Information related to the request of a fund transfer from an ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ATMTransferRequest1.mmObject();
		}

		@Override
		public Optional<ATMTransferRequest1> getValue(ATMTransferRequestV01 obj) {
			return obj.getATMTransferRequest();
		}

		@Override
		public void setValue(ATMTransferRequestV01 obj, Optional<ATMTransferRequest1> value) {
			obj.setATMTransferRequest(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyTrlr")
	protected ContentInformationType15 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType15
	 * ContentInformationType15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trailer of the message containing a MAC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMTransferRequestV01, Optional<ContentInformationType15>> mmSecurityTrailer = new MMMessageBuildingBlock<ATMTransferRequestV01, Optional<ContentInformationType15>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType15.mmObject();
		}

		@Override
		public Optional<ContentInformationType15> getValue(ATMTransferRequestV01 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(ATMTransferRequestV01 obj, Optional<ContentInformationType15> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransferRequestV01";
				definition = "The ATMTransferRequest message is sent by an ATM to an ATM manager to request the approval of a fund transfer at the ATM.";
				messageSet_lazy = () -> Arrays.asList(ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "ATMTrfReq";
				businessArea_lazy = () -> ATMCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catp.ATMTransferRequestV01.mmHeader, com.tools20022.repository.area.catp.ATMTransferRequestV01.mmProtectedATMTransferRequest,
						com.tools20022.repository.area.catp.ATMTransferRequestV01.mmATMTransferRequest, com.tools20022.repository.area.catp.ATMTransferRequestV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catp";
						messageFunctionality = "016";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ATMTransferRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header31 getHeader() {
		return header;
	}

	public ATMTransferRequestV01 setHeader(Header31 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public Optional<ContentInformationType10> getProtectedATMTransferRequest() {
		return protectedATMTransferRequest == null ? Optional.empty() : Optional.of(protectedATMTransferRequest);
	}

	public ATMTransferRequestV01 setProtectedATMTransferRequest(ContentInformationType10 protectedATMTransferRequest) {
		this.protectedATMTransferRequest = protectedATMTransferRequest;
		return this;
	}

	public Optional<ATMTransferRequest1> getATMTransferRequest() {
		return aTMTransferRequest == null ? Optional.empty() : Optional.of(aTMTransferRequest);
	}

	public ATMTransferRequestV01 setATMTransferRequest(ATMTransferRequest1 aTMTransferRequest) {
		this.aTMTransferRequest = aTMTransferRequest;
		return this;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public ATMTransferRequestV01 setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.016.001.01")
	static public class Document {
		@XmlElement(name = "ATMTrfReq", required = true)
		public ATMTransferRequestV01 messageBody;
	}
}