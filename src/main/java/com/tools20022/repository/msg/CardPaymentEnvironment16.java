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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AcquirerRole;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContentInformationType5;
import com.tools20022.repository.msg.GenericIdentification32;
import com.tools20022.repository.msg.PlainCardData3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Environment of the transaction given in a response to a request in a batch.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16#mmAcquirerIdentification
 * CardPaymentEnvironment16.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16#mmMerchantIdentification
 * CardPaymentEnvironment16.mmMerchantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16#mmPOIIdentification
 * CardPaymentEnvironment16.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16#mmProtectedCardData
 * CardPaymentEnvironment16.mmProtectedCardData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16#mmPlainCardData
 * CardPaymentEnvironment16.mmPlainCardData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentEnvironment16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Environment of the transaction given in a response to a request in a batch."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28
 * CardPaymentEnvironment28}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment11
 * CardPaymentEnvironment11}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentEnvironment16", propOrder = {"acquirerIdentification", "merchantIdentification", "pOIIdentification", "protectedCardData", "plainCardData"})
public class CardPaymentEnvironment16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acqrr")
	protected GenericIdentification32 acquirerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcquirerRole AcquirerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16
	 * CardPaymentEnvironment16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acqrr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer involved in the card payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28#mmAcquirerIdentification
	 * CardPaymentEnvironment28.mmAcquirerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment16, Optional<GenericIdentification32>> mmAcquirerIdentification = new MMMessageAssociationEnd<CardPaymentEnvironment16, Optional<GenericIdentification32>>() {
		{
			businessComponentTrace_lazy = () -> AcquirerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment16.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerIdentification";
			definition = "Acquirer involved in the card payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment28.mmAcquirerIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification32.mmObject();
		}

		@Override
		public Optional<GenericIdentification32> getValue(CardPaymentEnvironment16 obj) {
			return obj.getAcquirerIdentification();
		}

		@Override
		public void setValue(CardPaymentEnvironment16 obj, Optional<GenericIdentification32> value) {
			obj.setAcquirerIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MrchntId")
	protected GenericIdentification32 merchantIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16
	 * CardPaymentEnvironment16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the merchant."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28#mmMerchantIdentification
	 * CardPaymentEnvironment28.mmMerchantIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment16, Optional<GenericIdentification32>> mmMerchantIdentification = new MMMessageAssociationEnd<CardPaymentEnvironment16, Optional<GenericIdentification32>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment16.mmObject();
			isDerived = false;
			xmlTag = "MrchntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantIdentification";
			definition = "Identification of the merchant.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment28.mmMerchantIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification32.mmObject();
		}

		@Override
		public Optional<GenericIdentification32> getValue(CardPaymentEnvironment16 obj) {
			return obj.getMerchantIdentification();
		}

		@Override
		public void setValue(CardPaymentEnvironment16 obj, Optional<GenericIdentification32> value) {
			obj.setMerchantIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "POIId")
	protected GenericIdentification32 pOIIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16
	 * CardPaymentEnvironment16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the POI performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28#mmPOIIdentification
	 * CardPaymentEnvironment28.mmPOIIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment16, Optional<GenericIdentification32>> mmPOIIdentification = new MMMessageAssociationEnd<CardPaymentEnvironment16, Optional<GenericIdentification32>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment16.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the POI performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment28.mmPOIIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification32.mmObject();
		}

		@Override
		public Optional<GenericIdentification32> getValue(CardPaymentEnvironment16 obj) {
			return obj.getPOIIdentification();
		}

		@Override
		public void setValue(CardPaymentEnvironment16 obj, Optional<GenericIdentification32> value) {
			obj.setPOIIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctdCardData")
	protected ContentInformationType5 protectedCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType5
	 * ContentInformationType5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16
	 * CardPaymentEnvironment16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdCardData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sensitive data of the card (PlainCardData1 including the envelope), encrypted with a cryptographic key."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28#mmProtectedCardData
	 * CardPaymentEnvironment28.mmProtectedCardData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment16, Optional<ContentInformationType5>> mmProtectedCardData = new MMMessageAssociationEnd<CardPaymentEnvironment16, Optional<ContentInformationType5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment16.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardData";
			definition = "Sensitive data of the card (PlainCardData1 including the envelope), encrypted with a cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment28.mmProtectedCardData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType5.mmObject();
		}

		@Override
		public Optional<ContentInformationType5> getValue(CardPaymentEnvironment16 obj) {
			return obj.getProtectedCardData();
		}

		@Override
		public void setValue(CardPaymentEnvironment16 obj, Optional<ContentInformationType5> value) {
			obj.setProtectedCardData(value.orElse(null));
		}
	};
	@XmlElement(name = "PlainCardData")
	protected PlainCardData3 plainCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PlainCardData3
	 * PlainCardData3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment16
	 * CardPaymentEnvironment16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlainCardData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlainCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment card performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment28#mmPlainCardData
	 * CardPaymentEnvironment28.mmPlainCardData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentEnvironment16, Optional<PlainCardData3>> mmPlainCardData = new MMMessageAttribute<CardPaymentEnvironment16, Optional<PlainCardData3>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmPaymentCard;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment16.mmObject();
			isDerived = false;
			xmlTag = "PlainCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlainCardData";
			definition = "Payment card performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment28.mmPlainCardData);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PlainCardData3.mmObject();
		}

		@Override
		public Optional<PlainCardData3> getValue(CardPaymentEnvironment16 obj) {
			return obj.getPlainCardData();
		}

		@Override
		public void setValue(CardPaymentEnvironment16 obj, Optional<PlainCardData3> value) {
			obj.setPlainCardData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment16.mmAcquirerIdentification, com.tools20022.repository.msg.CardPaymentEnvironment16.mmMerchantIdentification,
						com.tools20022.repository.msg.CardPaymentEnvironment16.mmPOIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment16.mmProtectedCardData,
						com.tools20022.repository.msg.CardPaymentEnvironment16.mmPlainCardData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentEnvironment16";
				definition = "Environment of the transaction given in a response to a request in a batch.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment28.mmObject());
				previousVersion_lazy = () -> CardPaymentEnvironment11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<GenericIdentification32> getAcquirerIdentification() {
		return acquirerIdentification == null ? Optional.empty() : Optional.of(acquirerIdentification);
	}

	public CardPaymentEnvironment16 setAcquirerIdentification(GenericIdentification32 acquirerIdentification) {
		this.acquirerIdentification = acquirerIdentification;
		return this;
	}

	public Optional<GenericIdentification32> getMerchantIdentification() {
		return merchantIdentification == null ? Optional.empty() : Optional.of(merchantIdentification);
	}

	public CardPaymentEnvironment16 setMerchantIdentification(GenericIdentification32 merchantIdentification) {
		this.merchantIdentification = merchantIdentification;
		return this;
	}

	public Optional<GenericIdentification32> getPOIIdentification() {
		return pOIIdentification == null ? Optional.empty() : Optional.of(pOIIdentification);
	}

	public CardPaymentEnvironment16 setPOIIdentification(GenericIdentification32 pOIIdentification) {
		this.pOIIdentification = pOIIdentification;
		return this;
	}

	public Optional<ContentInformationType5> getProtectedCardData() {
		return protectedCardData == null ? Optional.empty() : Optional.of(protectedCardData);
	}

	public CardPaymentEnvironment16 setProtectedCardData(ContentInformationType5 protectedCardData) {
		this.protectedCardData = protectedCardData;
		return this;
	}

	public Optional<PlainCardData3> getPlainCardData() {
		return plainCardData == null ? Optional.empty() : Optional.of(plainCardData);
	}

	public CardPaymentEnvironment16 setPlainCardData(PlainCardData3 plainCardData) {
		this.plainCardData = plainCardData;
		return this;
	}
}