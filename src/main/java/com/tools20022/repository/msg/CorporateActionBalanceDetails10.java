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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.BalanceFormat1Choice;
import com.tools20022.repository.choice.Quantity3Choice;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Eligible and not eligible balance of securities for a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmTotalEligibleBalance
 * CorporateActionBalanceDetails10.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmBlockedBalance
 * CorporateActionBalanceDetails10.mmBlockedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmBorrowedBalance
 * CorporateActionBalanceDetails10.mmBorrowedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmCollateralInBalance
 * CorporateActionBalanceDetails10.mmCollateralInBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmCollateralOutBalance
 * CorporateActionBalanceDetails10.mmCollateralOutBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmOnLoanBalance
 * CorporateActionBalanceDetails10.mmOnLoanBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmPendingDeliveryBalance
 * CorporateActionBalanceDetails10.mmPendingDeliveryBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmPendingReceiptBalance
 * CorporateActionBalanceDetails10.mmPendingReceiptBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmOutForRegistrationBalance
 * CorporateActionBalanceDetails10.mmOutForRegistrationBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmSettlementPositionBalance
 * CorporateActionBalanceDetails10.mmSettlementPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmStreetPositionBalance
 * CorporateActionBalanceDetails10.mmStreetPositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmTradeDatePositionBalance
 * CorporateActionBalanceDetails10.mmTradeDatePositionBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmInTransshipmentBalance
 * CorporateActionBalanceDetails10.mmInTransshipmentBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmRegisteredBalance
 * CorporateActionBalanceDetails10.mmRegisteredBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmObligatedBalance
 * CorporateActionBalanceDetails10.mmObligatedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmUninstructedBalance
 * CorporateActionBalanceDetails10.mmUninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmInstructedBalance
 * CorporateActionBalanceDetails10.mmInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmAffectedBalance
 * CorporateActionBalanceDetails10.mmAffectedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmUnaffectedBalance
 * CorporateActionBalanceDetails10.mmUnaffectedBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
 * CorporateActionEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionBalanceDetails10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Eligible and not eligible balance of securities for a corporate action event."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule#forCorporateActionBalanceDetails10
 * ConstraintAffectedAndUnaffectedBalanceRule.forCorporateActionBalanceDetails10
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
 * CorporateActionBalanceDetails17}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1
 * CorporateActionBalanceDetails1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionBalanceDetails10", propOrder = {"totalEligibleBalance", "blockedBalance", "borrowedBalance", "collateralInBalance", "collateralOutBalance", "onLoanBalance", "pendingDeliveryBalance", "pendingReceiptBalance",
		"outForRegistrationBalance", "settlementPositionBalance", "streetPositionBalance", "tradeDatePositionBalance", "inTransshipmentBalance", "registeredBalance", "obligatedBalance", "uninstructedBalance", "instructedBalance",
		"affectedBalance", "unaffectedBalance"})
public class CorporateActionBalanceDetails10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlElgblBal")
	protected Quantity3Choice totalEligibleBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Quantity3Choice
	 * Quantity3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
	 * CorporateActionEntitlement.mmEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlElgblBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of financial instruments of the balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::ELIG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<Quantity3Choice>> mmTotalEligibleBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<Quantity3Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmEligibleBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::ELIG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total quantity of financial instruments of the balance.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity3Choice.mmObject();
		}

		@Override
		public Optional<Quantity3Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getTotalEligibleBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<Quantity3Choice> value) {
			obj.setTotalEligibleBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "BlckdBal")
	protected BalanceFormat1Choice blockedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of financial instruments that are blocked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::BLOK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmBlockedBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "BlckdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::BLOK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedBalance";
			definition = "Balance of financial instruments that are blocked.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getBlockedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setBlockedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "BrrwdBal")
	protected BalanceFormat1Choice borrowedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrrwdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that have been borrowed from another party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::BORR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmBorrowedBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "BrrwdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::BORR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowedBalance";
			definition = "Balance of financial instruments that have been borrowed from another party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getBorrowedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setBorrowedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "CollInBal")
	protected BalanceFormat1Choice collateralInBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollInBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralInBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to a third party and that are held for the purpose of collateralisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::COLI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmCollateralInBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "CollInBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInBalance";
			definition = "Balance of securities that belong to a third party and that are held for the purpose of collateralisation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getCollateralInBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setCollateralInBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "CollOutBal")
	protected BalanceFormat1Choice collateralOutBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollOutBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOutBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::COLO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmCollateralOutBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "CollOutBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::COLO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOutBalance";
			definition = "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getCollateralOutBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setCollateralOutBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "OnLnBal")
	protected BalanceFormat1Choice onLoanBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLnBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoanBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that have been loaned to a third party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::LOAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmOnLoanBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "OnLnBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::LOAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoanBalance";
			definition = "Balance of financial instruments that have been loaned to a third party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getOnLoanBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setOnLoanBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "PdgDlvryBal")
	protected List<BalanceFormat1Choice> pendingDeliveryBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgDlvryBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeliveryBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending delivery."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PEND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, List<BalanceFormat1Choice>> mmPendingDeliveryBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, List<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "PdgDlvryBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryBalance";
			definition = "Balance of financial instruments that are pending delivery.";
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public List<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getPendingDeliveryBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, List<BalanceFormat1Choice> value) {
			obj.setPendingDeliveryBalance(value);
		}
	};
	@XmlElement(name = "PdgRctBal")
	protected List<BalanceFormat1Choice> pendingReceiptBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgRctBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceiptBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending receipt."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::PENR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, List<BalanceFormat1Choice>> mmPendingReceiptBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, List<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "PdgRctBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::PENR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptBalance";
			definition = "Balance of financial instruments that are pending receipt.";
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public List<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getPendingReceiptBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, List<BalanceFormat1Choice> value) {
			obj.setPendingReceiptBalance(value);
		}
	};
	@XmlElement(name = "OutForRegnBal")
	protected BalanceFormat1Choice outForRegistrationBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutForRegnBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutForRegistrationBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::REGO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmOutForRegistrationBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "OutForRegnBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::REGO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistrationBalance";
			definition = "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getOutForRegistrationBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setOutForRegistrationBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmPosBal")
	protected BalanceFormat1Choice settlementPositionBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPosBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPositionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities representing only settled transactions; pending transactions not included."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmSettlementPositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "SttlmPosBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPositionBalance";
			definition = "Balance of securities representing only settled transactions; pending transactions not included.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getSettlementPositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setSettlementPositionBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "StrtPosBal")
	protected BalanceFormat1Choice streetPositionBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrtPosBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetPositionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that remain registered in the name of the prior beneficial owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::SPOS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmStreetPositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "StrtPosBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::SPOS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPositionBalance";
			definition = "Balance of financial instruments that remain registered in the name of the prior beneficial owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getStreetPositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setStreetPositionBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDtPosBal")
	protected BalanceFormat1Choice tradeDatePositionBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtPosBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDatePositionBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities based on trade date, for example, includes all pending transactions in addition to the balance of settled transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::TRAD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmTradeDatePositionBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "TradDtPosBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDatePositionBalance";
			definition = "Balance of securities based on trade date, for example, includes all pending transactions in addition to the balance of settled transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getTradeDatePositionBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setTradeDatePositionBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InTrnsShipmntBal")
	protected BalanceFormat1Choice inTransshipmentBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InTrnsShipmntBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransshipmentBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of physical securities that are in the process of being transferred from one depository/agent to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::TRAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmInTransshipmentBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "InTrnsShipmntBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::TRAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipmentBalance";
			definition = "Balance of physical securities that are in the process of being transferred from one depository/agent to another.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getInTransshipmentBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setInTransshipmentBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "RegdBal")
	protected BalanceFormat1Choice registeredBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are registered (in the name of a nominee name or of the beneficial owner)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::NOMI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmRegisteredBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "RegdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::NOMI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredBalance";
			definition = "Balance of financial instruments that are registered (in the name of a nominee name or of the beneficial owner).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getRegisteredBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setRegisteredBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "OblgtdBal")
	protected BalanceFormat1Choice obligatedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OblgtdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligatedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position that account holders should return to the account servicer to participate in the event or to fulfil their obligation for the event to be complete, for example, return of securities for late announced drawing."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a:OBAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmObligatedBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "OblgtdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a:OBAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligatedBalance";
			definition = "Position that account holders should return to the account servicer to participate in the event or to fulfil their obligation for the event to be complete, for example, return of securities for late announced drawing.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getObligatedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setObligatedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "UinstdBal")
	protected BalanceFormat1Choice uninstructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmUninstructedBalance
	 * CorporateActionEntitlement.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UinstdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of uninstructed position."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::UNBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmUninstructedBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmUninstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "UinstdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::UNBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninstructedBalance";
			definition = "Balance of uninstructed position.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getUninstructedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setUninstructedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdBal")
	protected BalanceFormat1Choice instructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of instructed position."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::INBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmInstructedBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "InstdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::INBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of instructed position.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getInstructedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setInstructedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "AfctdBal")
	protected BalanceFormat1Choice affectedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AfctdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffectedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance that has been affected by the process run through the event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::AFFB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmAffectedBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "AfctdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::AFFB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffectedBalance";
			definition = "Balance that has been affected by the process run through the event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getAffectedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setAffectedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "UafctdBal")
	protected BalanceFormat1Choice unaffectedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat1Choice
	 * BalanceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
	 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
	 * CorporateActionBalanceDetails10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UafctdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnaffectedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance that has not been affected by the process run through the event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::UNAF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>> mmUnaffectedBalance = new MMMessageAttribute<CorporateActionBalanceDetails10, Optional<BalanceFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObject();
			isDerived = false;
			xmlTag = "UafctdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::UNAF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnaffectedBalance";
			definition = "Balance that has not been affected by the process run through the event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceFormat1Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat1Choice> getValue(CorporateActionBalanceDetails10 obj) {
			return obj.getUnaffectedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceDetails10 obj, Optional<BalanceFormat1Choice> value) {
			obj.setUnaffectedBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmTotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmBlockedBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmBorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmCollateralInBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmCollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmOnLoanBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmPendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmPendingReceiptBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmOutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmSettlementPositionBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmStreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmTradeDatePositionBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmInTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmRegisteredBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmObligatedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmUninstructedBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmInstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmAffectedBalance,
						com.tools20022.repository.msg.CorporateActionBalanceDetails10.mmUnaffectedBalance);
				trace_lazy = () -> CorporateActionEntitlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAffectedAndUnaffectedBalanceRule.forCorporateActionBalanceDetails10);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionBalanceDetails10";
				definition = "Eligible and not eligible balance of securities for a corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceDetails17.mmObject());
				previousVersion_lazy = () -> CorporateActionBalanceDetails1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Quantity3Choice> getTotalEligibleBalance() {
		return totalEligibleBalance == null ? Optional.empty() : Optional.of(totalEligibleBalance);
	}

	public CorporateActionBalanceDetails10 setTotalEligibleBalance(Quantity3Choice totalEligibleBalance) {
		this.totalEligibleBalance = totalEligibleBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getBlockedBalance() {
		return blockedBalance == null ? Optional.empty() : Optional.of(blockedBalance);
	}

	public CorporateActionBalanceDetails10 setBlockedBalance(BalanceFormat1Choice blockedBalance) {
		this.blockedBalance = blockedBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getBorrowedBalance() {
		return borrowedBalance == null ? Optional.empty() : Optional.of(borrowedBalance);
	}

	public CorporateActionBalanceDetails10 setBorrowedBalance(BalanceFormat1Choice borrowedBalance) {
		this.borrowedBalance = borrowedBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getCollateralInBalance() {
		return collateralInBalance == null ? Optional.empty() : Optional.of(collateralInBalance);
	}

	public CorporateActionBalanceDetails10 setCollateralInBalance(BalanceFormat1Choice collateralInBalance) {
		this.collateralInBalance = collateralInBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getCollateralOutBalance() {
		return collateralOutBalance == null ? Optional.empty() : Optional.of(collateralOutBalance);
	}

	public CorporateActionBalanceDetails10 setCollateralOutBalance(BalanceFormat1Choice collateralOutBalance) {
		this.collateralOutBalance = collateralOutBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getOnLoanBalance() {
		return onLoanBalance == null ? Optional.empty() : Optional.of(onLoanBalance);
	}

	public CorporateActionBalanceDetails10 setOnLoanBalance(BalanceFormat1Choice onLoanBalance) {
		this.onLoanBalance = onLoanBalance;
		return this;
	}

	public List<BalanceFormat1Choice> getPendingDeliveryBalance() {
		return pendingDeliveryBalance == null ? pendingDeliveryBalance = new ArrayList<>() : pendingDeliveryBalance;
	}

	public CorporateActionBalanceDetails10 setPendingDeliveryBalance(List<BalanceFormat1Choice> pendingDeliveryBalance) {
		this.pendingDeliveryBalance = Objects.requireNonNull(pendingDeliveryBalance);
		return this;
	}

	public List<BalanceFormat1Choice> getPendingReceiptBalance() {
		return pendingReceiptBalance == null ? pendingReceiptBalance = new ArrayList<>() : pendingReceiptBalance;
	}

	public CorporateActionBalanceDetails10 setPendingReceiptBalance(List<BalanceFormat1Choice> pendingReceiptBalance) {
		this.pendingReceiptBalance = Objects.requireNonNull(pendingReceiptBalance);
		return this;
	}

	public Optional<BalanceFormat1Choice> getOutForRegistrationBalance() {
		return outForRegistrationBalance == null ? Optional.empty() : Optional.of(outForRegistrationBalance);
	}

	public CorporateActionBalanceDetails10 setOutForRegistrationBalance(BalanceFormat1Choice outForRegistrationBalance) {
		this.outForRegistrationBalance = outForRegistrationBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getSettlementPositionBalance() {
		return settlementPositionBalance == null ? Optional.empty() : Optional.of(settlementPositionBalance);
	}

	public CorporateActionBalanceDetails10 setSettlementPositionBalance(BalanceFormat1Choice settlementPositionBalance) {
		this.settlementPositionBalance = settlementPositionBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getStreetPositionBalance() {
		return streetPositionBalance == null ? Optional.empty() : Optional.of(streetPositionBalance);
	}

	public CorporateActionBalanceDetails10 setStreetPositionBalance(BalanceFormat1Choice streetPositionBalance) {
		this.streetPositionBalance = streetPositionBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getTradeDatePositionBalance() {
		return tradeDatePositionBalance == null ? Optional.empty() : Optional.of(tradeDatePositionBalance);
	}

	public CorporateActionBalanceDetails10 setTradeDatePositionBalance(BalanceFormat1Choice tradeDatePositionBalance) {
		this.tradeDatePositionBalance = tradeDatePositionBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getInTransshipmentBalance() {
		return inTransshipmentBalance == null ? Optional.empty() : Optional.of(inTransshipmentBalance);
	}

	public CorporateActionBalanceDetails10 setInTransshipmentBalance(BalanceFormat1Choice inTransshipmentBalance) {
		this.inTransshipmentBalance = inTransshipmentBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getRegisteredBalance() {
		return registeredBalance == null ? Optional.empty() : Optional.of(registeredBalance);
	}

	public CorporateActionBalanceDetails10 setRegisteredBalance(BalanceFormat1Choice registeredBalance) {
		this.registeredBalance = registeredBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getObligatedBalance() {
		return obligatedBalance == null ? Optional.empty() : Optional.of(obligatedBalance);
	}

	public CorporateActionBalanceDetails10 setObligatedBalance(BalanceFormat1Choice obligatedBalance) {
		this.obligatedBalance = obligatedBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getUninstructedBalance() {
		return uninstructedBalance == null ? Optional.empty() : Optional.of(uninstructedBalance);
	}

	public CorporateActionBalanceDetails10 setUninstructedBalance(BalanceFormat1Choice uninstructedBalance) {
		this.uninstructedBalance = uninstructedBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getInstructedBalance() {
		return instructedBalance == null ? Optional.empty() : Optional.of(instructedBalance);
	}

	public CorporateActionBalanceDetails10 setInstructedBalance(BalanceFormat1Choice instructedBalance) {
		this.instructedBalance = instructedBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getAffectedBalance() {
		return affectedBalance == null ? Optional.empty() : Optional.of(affectedBalance);
	}

	public CorporateActionBalanceDetails10 setAffectedBalance(BalanceFormat1Choice affectedBalance) {
		this.affectedBalance = affectedBalance;
		return this;
	}

	public Optional<BalanceFormat1Choice> getUnaffectedBalance() {
		return unaffectedBalance == null ? Optional.empty() : Optional.of(unaffectedBalance);
	}

	public CorporateActionBalanceDetails10 setUnaffectedBalance(BalanceFormat1Choice unaffectedBalance) {
		this.unaffectedBalance = unaffectedBalance;
		return this;
	}
}