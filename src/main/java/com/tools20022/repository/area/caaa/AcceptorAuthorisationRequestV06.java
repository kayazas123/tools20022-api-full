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

package com.tools20022.repository.area.caaa;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AcceptortoAcquirerCardTransactionPreviousVersion;
import com.tools20022.repository.msg.AcceptorAuthorisationRequest6;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header30;
import com.tools20022.repository.msgset.CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The AcceptorAuthorisationRequest message is sent by an acceptor (or its
 * agent) to the acquirer (or its agent), to check with the issuer (or its
 * agent) that the account associated to the card has the resources to fund the
 * payment. This checking will include validation of the card data and any
 * additional transaction data provided.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.001.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionPreviousVersion
 * AcceptortoAcquirerCardTransactionPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV06#mmHeader
 * AcceptorAuthorisationRequestV06.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV06#mmAuthorisationRequest
 * AcceptorAuthorisationRequestV06.mmAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV06#mmSecurityTrailer
 * AcceptorAuthorisationRequestV06.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion
 * CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrAuthstnReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorAuthorisationRequestV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorAuthorisationRequest message is sent by an acceptor (or its agent) to the acquirer (or its agent), to check with the issuer (or its agent) that the account associated to the card has the resources to fund the payment. This checking will include validation of the card data and any additional transaction data provided."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV07
 * AcceptorAuthorisationRequestV07}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV05
 * AcceptorAuthorisationRequestV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorAuthorisationRequestV06", propOrder = {"header", "authorisationRequest", "securityTrailer"})
public class AcceptorAuthorisationRequestV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header30 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header30
	 * Header30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authorisation request message management information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV07#mmHeader
	 * AcceptorAuthorisationRequestV07.mmHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV05#mmHeader
	 * AcceptorAuthorisationRequestV05.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorAuthorisationRequestV06, Header30> mmHeader = new MMMessageBuildingBlock<AcceptorAuthorisationRequestV06, Header30>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Authorisation request message management information.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorAuthorisationRequestV07.mmHeader);
			previousVersion_lazy = () -> AcceptorAuthorisationRequestV05.mmHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header30.mmObject();
		}

		@Override
		public Header30 getValue(AcceptorAuthorisationRequestV06 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(AcceptorAuthorisationRequestV06 obj, Header30 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "AuthstnReq", required = true)
	protected AcceptorAuthorisationRequest6 authorisationRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationRequest6
	 * AcceptorAuthorisationRequest6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnReq"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the authorisation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV07#mmAuthorisationRequest
	 * AcceptorAuthorisationRequestV07.mmAuthorisationRequest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV05#mmAuthorisationRequest
	 * AcceptorAuthorisationRequestV05.mmAuthorisationRequest}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorAuthorisationRequestV06, AcceptorAuthorisationRequest6> mmAuthorisationRequest = new MMMessageBuildingBlock<AcceptorAuthorisationRequestV06, AcceptorAuthorisationRequest6>() {
		{
			xmlTag = "AuthstnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationRequest";
			definition = "Information related to the authorisation request.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorAuthorisationRequestV07.mmAuthorisationRequest);
			previousVersion_lazy = () -> AcceptorAuthorisationRequestV05.mmAuthorisationRequest;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorAuthorisationRequest6.mmObject();
		}

		@Override
		public AcceptorAuthorisationRequest6 getValue(AcceptorAuthorisationRequestV06 obj) {
			return obj.getAuthorisationRequest();
		}

		@Override
		public void setValue(AcceptorAuthorisationRequestV06 obj, AcceptorAuthorisationRequest6 value) {
			obj.setAuthorisationRequest(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV07#mmSecurityTrailer
	 * AcceptorAuthorisationRequestV07.mmSecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV05#mmSecurityTrailer
	 * AcceptorAuthorisationRequestV05.mmSecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorAuthorisationRequestV06, Optional<ContentInformationType15>> mmSecurityTrailer = new MMMessageBuildingBlock<AcceptorAuthorisationRequestV06, Optional<ContentInformationType15>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorAuthorisationRequestV07.mmSecurityTrailer);
			previousVersion_lazy = () -> AcceptorAuthorisationRequestV05.mmSecurityTrailer;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType15.mmObject();
		}

		@Override
		public Optional<ContentInformationType15> getValue(AcceptorAuthorisationRequestV06 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(AcceptorAuthorisationRequestV06 obj, Optional<ContentInformationType15> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorAuthorisationRequestV06";
				definition = "The AcceptorAuthorisationRequest message is sent by an acceptor (or its agent) to the acquirer (or its agent), to check with the issuer (or its agent) that the account associated to the card has the resources to fund the payment. This checking will include validation of the card data and any additional transaction data provided.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorAuthorisationRequestV07.mmObject());
				previousVersion_lazy = () -> AcceptorAuthorisationRequestV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrAuthstnReq";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV06.mmHeader, com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV06.mmAuthorisationRequest,
						com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV06.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "001";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorAuthorisationRequestV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header30 getHeader() {
		return header;
	}

	public AcceptorAuthorisationRequestV06 setHeader(Header30 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorAuthorisationRequest6 getAuthorisationRequest() {
		return authorisationRequest;
	}

	public AcceptorAuthorisationRequestV06 setAuthorisationRequest(AcceptorAuthorisationRequest6 authorisationRequest) {
		this.authorisationRequest = Objects.requireNonNull(authorisationRequest);
		return this;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public AcceptorAuthorisationRequestV06 setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.001.001.06")
	static public class Document {
		@XmlElement(name = "AccptrAuthstnReq", required = true)
		public AcceptorAuthorisationRequestV06 messageBody;
	}
}