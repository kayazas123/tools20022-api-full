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
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Authorisation response from the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#mmAuthorisationResult
 * CardPaymentTransaction54.mmAuthorisationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#mmTransactionVerificationResult
 * CardPaymentTransaction54.mmTransactionVerificationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#mmAllowedProductCode
 * CardPaymentTransaction54.mmAllowedProductCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#mmNotAllowedProductCode
 * CardPaymentTransaction54.mmNotAllowedProductCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#mmAdditionalAvailableProduct
 * CardPaymentTransaction54.mmAdditionalAvailableProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#mmBalance
 * CardPaymentTransaction54.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#mmProtectedBalance
 * CardPaymentTransaction54.mmProtectedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#mmAction
 * CardPaymentTransaction54.mmAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#mmCurrencyConversionEligibility
 * CardPaymentTransaction54.mmCurrencyConversionEligibility}</li>
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
 * "CardPaymentTransaction54"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Authorisation response from the acquirer."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction67
 * CardPaymentTransaction67}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction39
 * CardPaymentTransaction39}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentTransaction54", propOrder = {"authorisationResult", "transactionVerificationResult", "allowedProductCode", "notAllowedProductCode", "additionalAvailableProduct", "balance", "protectedBalance", "action",
		"currencyConversionEligibility"})
public class CardPaymentTransaction54 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AuthstnRslt", required = true)
	protected AuthorisationResult10 authorisationResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthorisationResult10
	 * AuthorisationResult10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmValidation
	 * CardPaymentAcquiring.mmValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54
	 * CardPaymentTransaction54}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnRslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outcome of the authorisation, and actions to perform."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#mmAuthorisationResult
	 * CardPaymentTransaction67.mmAuthorisationResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction39#mmAuthorisationResult
	 * CardPaymentTransaction39.mmAuthorisationResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction54, AuthorisationResult10> mmAuthorisationResult = new MMMessageAssociationEnd<CardPaymentTransaction54, AuthorisationResult10>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmValidation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction54.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the authorisation, and actions to perform.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction67.mmAuthorisationResult);
			previousVersion_lazy = () -> CardPaymentTransaction39.mmAuthorisationResult;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AuthorisationResult10.mmObject();
		}

		@Override
		public AuthorisationResult10 getValue(CardPaymentTransaction54 obj) {
			return obj.getAuthorisationResult();
		}

		@Override
		public void setValue(CardPaymentTransaction54 obj, AuthorisationResult10 value) {
			obj.setAuthorisationResult(value);
		}
	};
	@XmlElement(name = "TxVrfctnRslt")
	protected List<TransactionVerificationResult4> transactionVerificationResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4
	 * TransactionVerificationResult4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54
	 * CardPaymentTransaction54}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxVrfctnRslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionVerificationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the verifications performed by the issuer to deliver or decline the authorisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#mmTransactionVerificationResult
	 * CardPaymentTransaction67.mmTransactionVerificationResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction39#mmTransactionVerificationResult
	 * CardPaymentTransaction39.mmTransactionVerificationResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction54, List<TransactionVerificationResult4>> mmTransactionVerificationResult = new MMMessageAssociationEnd<CardPaymentTransaction54, List<TransactionVerificationResult4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction54.mmObject();
			isDerived = false;
			xmlTag = "TxVrfctnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionVerificationResult";
			definition = "Result of the verifications performed by the issuer to deliver or decline the authorisation.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction67.mmTransactionVerificationResult);
			previousVersion_lazy = () -> CardPaymentTransaction39.mmTransactionVerificationResult;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionVerificationResult4.mmObject();
		}

		@Override
		public List<TransactionVerificationResult4> getValue(CardPaymentTransaction54 obj) {
			return obj.getTransactionVerificationResult();
		}

		@Override
		public void setValue(CardPaymentTransaction54 obj, List<TransactionVerificationResult4> value) {
			obj.setTransactionVerificationResult(value);
		}
	};
	@XmlElement(name = "AllwdPdctCd")
	protected List<Product4> allowedProductCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Product4 Product4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54
	 * CardPaymentTransaction54}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllwdPdctCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowedProductCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product code which are allowed by the payment card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#mmAllowedProductCode
	 * CardPaymentTransaction67.mmAllowedProductCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction39#mmDeclinedProductCode
	 * CardPaymentTransaction39.mmDeclinedProductCode}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction54, List<Product4>> mmAllowedProductCode = new MMMessageAssociationEnd<CardPaymentTransaction54, List<Product4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction54.mmObject();
			isDerived = false;
			xmlTag = "AllwdPdctCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowedProductCode";
			definition = "Product code which are allowed by the payment card.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction67.mmAllowedProductCode);
			previousVersion_lazy = () -> CardPaymentTransaction39.mmDeclinedProductCode;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Product4.mmObject();
		}

		@Override
		public List<Product4> getValue(CardPaymentTransaction54 obj) {
			return obj.getAllowedProductCode();
		}

		@Override
		public void setValue(CardPaymentTransaction54 obj, List<Product4> value) {
			obj.setAllowedProductCode(value);
		}
	};
	@XmlElement(name = "NotAllwdPdctCd")
	protected List<Product4> notAllowedProductCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Product4 Product4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54
	 * CardPaymentTransaction54}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotAllwdPdctCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAllowedProductCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product code not allowed by the payment card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#mmNotAllowedProductCode
	 * CardPaymentTransaction67.mmNotAllowedProductCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction54, List<Product4>> mmNotAllowedProductCode = new MMMessageAssociationEnd<CardPaymentTransaction54, List<Product4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction54.mmObject();
			isDerived = false;
			xmlTag = "NotAllwdPdctCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAllowedProductCode";
			definition = "Product code not allowed by the payment card.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction67.mmNotAllowedProductCode);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Product4.mmObject();
		}

		@Override
		public List<Product4> getValue(CardPaymentTransaction54 obj) {
			return obj.getNotAllowedProductCode();
		}

		@Override
		public void setValue(CardPaymentTransaction54 obj, List<Product4> value) {
			obj.setNotAllowedProductCode(value);
		}
	};
	@XmlElement(name = "AddtlAvlblPdct")
	protected List<Product5> additionalAvailableProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Product5 Product5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54
	 * CardPaymentTransaction54}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlAvlblPdct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalAvailableProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Products that may be added to the purchase after the authorisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#mmAdditionalAvailableProduct
	 * CardPaymentTransaction67.mmAdditionalAvailableProduct}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction54, List<Product5>> mmAdditionalAvailableProduct = new MMMessageAssociationEnd<CardPaymentTransaction54, List<Product5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction54.mmObject();
			isDerived = false;
			xmlTag = "AddtlAvlblPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalAvailableProduct";
			definition = "Products that may be added to the purchase after the authorisation.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction67.mmAdditionalAvailableProduct);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Product5.mmObject();
		}

		@Override
		public List<Product5> getValue(CardPaymentTransaction54 obj) {
			return obj.getAdditionalAvailableProduct();
		}

		@Override
		public void setValue(CardPaymentTransaction54 obj, List<Product5> value) {
			obj.setAdditionalAvailableProduct(value);
		}
	};
	@XmlElement(name = "Bal")
	protected AmountAndDirection41 balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection41
	 * AmountAndDirection41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmAmount
	 * CashBalance.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54
	 * CardPaymentTransaction54}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of the account, related to the payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#mmBalance
	 * CardPaymentTransaction67.mmBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction39#mmBalance
	 * CardPaymentTransaction39.mmBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction54, Optional<AmountAndDirection41>> mmBalance = new MMMessageAttribute<CardPaymentTransaction54, Optional<AmountAndDirection41>>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction54.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Balance of the account, related to the payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction67.mmBalance);
			previousVersion_lazy = () -> CardPaymentTransaction39.mmBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection41.mmObject();
		}

		@Override
		public Optional<AmountAndDirection41> getValue(CardPaymentTransaction54 obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(CardPaymentTransaction54 obj, Optional<AmountAndDirection41> value) {
			obj.setBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctdBal")
	protected ContentInformationType10 protectedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54
	 * CardPaymentTransaction54}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted balance of the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#mmProtectedBalance
	 * CardPaymentTransaction67.mmProtectedBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction39#mmProtectedBalance
	 * CardPaymentTransaction39.mmProtectedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction54, Optional<ContentInformationType10>> mmProtectedBalance = new MMMessageAssociationEnd<CardPaymentTransaction54, Optional<ContentInformationType10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction54.mmObject();
			isDerived = false;
			xmlTag = "PrtctdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedBalance";
			definition = "Encrypted balance of the account.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction67.mmProtectedBalance);
			previousVersion_lazy = () -> CardPaymentTransaction39.mmProtectedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(CardPaymentTransaction54 obj) {
			return obj.getProtectedBalance();
		}

		@Override
		public void setValue(CardPaymentTransaction54 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "Actn")
	protected List<Action6> action;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Action6 Action6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54
	 * CardPaymentTransaction54}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Actn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Action"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of actions to be performed by the POI (Point Of Interaction) system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#mmAction
	 * CardPaymentTransaction67.mmAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction39#mmAction
	 * CardPaymentTransaction39.mmAction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction54, List<Action6>> mmAction = new MMMessageAssociationEnd<CardPaymentTransaction54, List<Action6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction54.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Set of actions to be performed by the POI (Point Of Interaction) system.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction67.mmAction);
			previousVersion_lazy = () -> CardPaymentTransaction39.mmAction;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Action6.mmObject();
		}

		@Override
		public List<Action6> getValue(CardPaymentTransaction54 obj) {
			return obj.getAction();
		}

		@Override
		public void setValue(CardPaymentTransaction54 obj, List<Action6> value) {
			obj.setAction(value);
		}
	};
	@XmlElement(name = "CcyConvsElgblty")
	protected CurrencyConversion6 currencyConversionEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyConversion6
	 * CurrencyConversion6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54
	 * CardPaymentTransaction54}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvsElgblty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be proposed to the cardholder."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#mmCurrencyConversionEligibility
	 * CardPaymentTransaction67.mmCurrencyConversionEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction39#mmCurrencyConversion
	 * CardPaymentTransaction39.mmCurrencyConversion}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction54, Optional<CurrencyConversion6>> mmCurrencyConversionEligibility = new MMMessageAssociationEnd<CardPaymentTransaction54, Optional<CurrencyConversion6>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction54.mmObject();
			isDerived = false;
			xmlTag = "CcyConvsElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionEligibility";
			definition = "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be proposed to the cardholder.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction67.mmCurrencyConversionEligibility);
			previousVersion_lazy = () -> CardPaymentTransaction39.mmCurrencyConversion;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyConversion6.mmObject();
		}

		@Override
		public Optional<CurrencyConversion6> getValue(CardPaymentTransaction54 obj) {
			return obj.getCurrencyConversionEligibility();
		}

		@Override
		public void setValue(CardPaymentTransaction54 obj, Optional<CurrencyConversion6> value) {
			obj.setCurrencyConversionEligibility(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction54.mmAuthorisationResult, com.tools20022.repository.msg.CardPaymentTransaction54.mmTransactionVerificationResult,
						com.tools20022.repository.msg.CardPaymentTransaction54.mmAllowedProductCode, com.tools20022.repository.msg.CardPaymentTransaction54.mmNotAllowedProductCode,
						com.tools20022.repository.msg.CardPaymentTransaction54.mmAdditionalAvailableProduct, com.tools20022.repository.msg.CardPaymentTransaction54.mmBalance,
						com.tools20022.repository.msg.CardPaymentTransaction54.mmProtectedBalance, com.tools20022.repository.msg.CardPaymentTransaction54.mmAction,
						com.tools20022.repository.msg.CardPaymentTransaction54.mmCurrencyConversionEligibility);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentTransaction54";
				definition = "Authorisation response from the acquirer.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction67.mmObject());
				previousVersion_lazy = () -> CardPaymentTransaction39.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AuthorisationResult10 getAuthorisationResult() {
		return authorisationResult;
	}

	public CardPaymentTransaction54 setAuthorisationResult(AuthorisationResult10 authorisationResult) {
		this.authorisationResult = Objects.requireNonNull(authorisationResult);
		return this;
	}

	public List<TransactionVerificationResult4> getTransactionVerificationResult() {
		return transactionVerificationResult == null ? transactionVerificationResult = new ArrayList<>() : transactionVerificationResult;
	}

	public CardPaymentTransaction54 setTransactionVerificationResult(List<TransactionVerificationResult4> transactionVerificationResult) {
		this.transactionVerificationResult = Objects.requireNonNull(transactionVerificationResult);
		return this;
	}

	public List<Product4> getAllowedProductCode() {
		return allowedProductCode == null ? allowedProductCode = new ArrayList<>() : allowedProductCode;
	}

	public CardPaymentTransaction54 setAllowedProductCode(List<Product4> allowedProductCode) {
		this.allowedProductCode = Objects.requireNonNull(allowedProductCode);
		return this;
	}

	public List<Product4> getNotAllowedProductCode() {
		return notAllowedProductCode == null ? notAllowedProductCode = new ArrayList<>() : notAllowedProductCode;
	}

	public CardPaymentTransaction54 setNotAllowedProductCode(List<Product4> notAllowedProductCode) {
		this.notAllowedProductCode = Objects.requireNonNull(notAllowedProductCode);
		return this;
	}

	public List<Product5> getAdditionalAvailableProduct() {
		return additionalAvailableProduct == null ? additionalAvailableProduct = new ArrayList<>() : additionalAvailableProduct;
	}

	public CardPaymentTransaction54 setAdditionalAvailableProduct(List<Product5> additionalAvailableProduct) {
		this.additionalAvailableProduct = Objects.requireNonNull(additionalAvailableProduct);
		return this;
	}

	public Optional<AmountAndDirection41> getBalance() {
		return balance == null ? Optional.empty() : Optional.of(balance);
	}

	public CardPaymentTransaction54 setBalance(AmountAndDirection41 balance) {
		this.balance = balance;
		return this;
	}

	public Optional<ContentInformationType10> getProtectedBalance() {
		return protectedBalance == null ? Optional.empty() : Optional.of(protectedBalance);
	}

	public CardPaymentTransaction54 setProtectedBalance(ContentInformationType10 protectedBalance) {
		this.protectedBalance = protectedBalance;
		return this;
	}

	public List<Action6> getAction() {
		return action == null ? action = new ArrayList<>() : action;
	}

	public CardPaymentTransaction54 setAction(List<Action6> action) {
		this.action = Objects.requireNonNull(action);
		return this;
	}

	public Optional<CurrencyConversion6> getCurrencyConversionEligibility() {
		return currencyConversionEligibility == null ? Optional.empty() : Optional.of(currencyConversionEligibility);
	}

	public CardPaymentTransaction54 setCurrencyConversionEligibility(CurrencyConversion6 currencyConversionEligibility) {
		this.currencyConversionEligibility = currencyConversionEligibility;
		return this;
	}
}