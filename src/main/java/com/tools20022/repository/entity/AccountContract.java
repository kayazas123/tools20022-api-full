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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.TransactionChannelType1Choice;
import com.tools20022.repository.codeset.TransactionChannelCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Contract;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Agreement between an account servicer and an account owner about the services
 * linked to an account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountContract" src="doc-files/AccountContract.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTargetClosingDate
 * AccountContract.mmTargetClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmUrgencyFlag
 * AccountContract.mmUrgencyFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmRemovalIndicator
 * AccountContract.mmRemovalIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTargetGoLiveDate
 * AccountContract.mmTargetGoLiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmAccountService
 * AccountContract.mmAccountService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#mmAccount
 * AccountContract.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#mmInterest
 * AccountContract.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmRequestDate
 * AccountContract.mmRequestDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmAccountAuthorisation
 * AccountContract.mmAccountAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTransactionChannel
 * AccountContract.mmTransactionChannel}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmAccountContract
 * Account.mmAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountService#mmAccountContract
 * AccountService.mmAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAccountContract
 * Interest.mmRelatedAccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmAccountContract
 * Mandate.mmAccountContract}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentAccountContract
 * InvestmentAccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccountContract
 * CashAccountContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContractDocument1
 * ContractDocument1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountContract"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement between an account servicer and an account owner about the services linked to an account."
 * </li>
 * </ul>
 */
public class AccountContract extends Contract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime targetClosingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract4#mmTargetClosingDate
	 * AccountContract4.mmTargetClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract2#mmTargetClosingDate
	 * AccountContract2.mmTargetClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmTargetClosingDate
	 * AccountContract3.mmTargetClosingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related services are expected to cease to be operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTargetClosingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountContract4.mmTargetClosingDate, AccountContract2.mmTargetClosingDate, AccountContract3.mmTargetClosingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TargetClosingDate";
			definition = "Date on which the account and related services are expected to cease to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountContract.class.getMethod("getTargetClosingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TrueFalseIndicator urgencyFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract4#mmUrgencyFlag
	 * AccountContract4.mmUrgencyFlag}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract2#mmUrgencyFlag
	 * AccountContract2.mmUrgencyFlag}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmUrgencyFlag
	 * AccountContract3.mmUrgencyFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UrgencyFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator that the change to the contract needs to be treated urgently."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUrgencyFlag = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountContract4.mmUrgencyFlag, AccountContract2.mmUrgencyFlag, AccountContract3.mmUrgencyFlag);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UrgencyFlag";
			definition = "Indicator that the change to the contract needs to be treated urgently.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountContract.class.getMethod("getUrgencyFlag", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator removalIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract4#mmRemovalIndicator
	 * AccountContract4.mmRemovalIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmRemovalIndicator
	 * AccountContract3.mmRemovalIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemovalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates removal of the account. After removal, an account will not appear anymore in reports."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRemovalIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountContract4.mmRemovalIndicator, AccountContract3.mmRemovalIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemovalIndicator";
			definition = "Indicates removal of the account. After removal, an account will not appear anymore in reports.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountContract.class.getMethod("getRemovalIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime targetGoLiveDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract2#mmTargetGoLiveDate
	 * AccountContract2.mmTargetGoLiveDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountContract3#mmTargetGoLiveDate
	 * AccountContract3.mmTargetGoLiveDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetGoLiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the account and related services are expected to cease/to be operational for the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTargetGoLiveDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AccountContract2.mmTargetGoLiveDate, AccountContract3.mmTargetGoLiveDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TargetGoLiveDate";
			definition = "Date on which the account and related services are expected to cease/to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountContract.class.getMethod("getTargetGoLiveDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountService accountService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#mmAccountContract
	 * AccountService.mmAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountService
	 * AccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Operations on a bank account that are allowed as part of the services offered to the owners of a bank account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Operations on a bank account that are allowed as part of the services offered to the owners of a bank account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.mmAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Account> account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmAccountContract
	 * Account.mmAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the account which is managed by a contract."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Specifies the account which is managed by a contract.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Interest> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAccountContract
	 * Interest.mmRelatedAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest that applies to the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Interest that applies to the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmRelatedAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected ISODateTime requestDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRequestDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestDate";
			definition = "Date of the request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountContract.class.getMethod("getRequestDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Mandate> accountAuthorisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmAccountContract
	 * Mandate.mmAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the services which are assigned to another party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccountAuthorisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountAuthorisation";
			definition = "Specifies the services which are assigned to another party.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.mmAccountContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
		}
	};
	protected TransactionChannelCode transactionChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannelCode
	 * TransactionChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#mmTransactionChannelType
	 * InvestmentAccount38.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#mmTransactionChannelType
	 * InvestmentAccount37.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#mmTransactionChannelType
	 * InvestmentAccount39.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionChannelType1Choice#mmCode
	 * TransactionChannelType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TransactionChannelType1Choice#mmProprietary
	 * TransactionChannelType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmTransactionChannelType
	 * InvestmentAccount46.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#mmTransactionChannelType
	 * InvestmentAccount47.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmTransactionChannelType
	 * InvestmentAccount49.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmTransactionChannelType
	 * InvestmentAccount51.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmTransactionChannelType
	 * InvestmentAccount50.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmTransactionChannelType
	 * InvestmentAccount61.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmTransactionChannelType
	 * SwitchExecution7.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmTransactionChannelType
	 * InvestmentAccount63.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder7#mmTransactionChannelType
	 * SwitchOrder7.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmTransactionChannelType
	 * InvestmentAccount62.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder14#mmTransactionChannelType
	 * RedemptionOrder14.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmTransactionChannelType
	 * SubscriptionExecution13.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmTransactionChannelType
	 * SubscriptionExecution12.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmTransactionChannelType
	 * SubscriptionOrder15.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrder15#mmTransactionChannelType
	 * RedemptionOrder15.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmTransactionChannelType
	 * RedemptionExecution16.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmTransactionChannelType
	 * SubscriptionOrder14.mmTransactionChannelType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmTransactionChannelType
	 * RedemptionExecution15.mmTransactionChannelType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the means by which the account owner submits the open account form."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransactionChannel = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InvestmentAccount38.mmTransactionChannelType, InvestmentAccount37.mmTransactionChannelType, InvestmentAccount39.mmTransactionChannelType, TransactionChannelType1Choice.mmCode,
					TransactionChannelType1Choice.mmProprietary, InvestmentAccount46.mmTransactionChannelType, InvestmentAccount47.mmTransactionChannelType, InvestmentAccount49.mmTransactionChannelType,
					InvestmentAccount51.mmTransactionChannelType, InvestmentAccount50.mmTransactionChannelType, InvestmentAccount61.mmTransactionChannelType, SwitchExecution7.mmTransactionChannelType,
					InvestmentAccount63.mmTransactionChannelType, SwitchOrder7.mmTransactionChannelType, InvestmentAccount62.mmTransactionChannelType, RedemptionOrder14.mmTransactionChannelType,
					SubscriptionExecution13.mmTransactionChannelType, SubscriptionExecution12.mmTransactionChannelType, SubscriptionOrder15.mmTransactionChannelType, RedemptionOrder15.mmTransactionChannelType,
					RedemptionExecution16.mmTransactionChannelType, SubscriptionOrder14.mmTransactionChannelType, RedemptionExecution15.mmTransactionChannelType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransactionChannel";
			definition = "Specifies the means by which the account owner submits the open account form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionChannelCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountContract.class.getMethod("getTransactionChannel", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountContract";
				definition = "Agreement between an account servicer and an account owner about the services linked to an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmAccountContract, com.tools20022.repository.entity.AccountService.mmAccountContract,
						com.tools20022.repository.entity.Interest.mmRelatedAccountContract, com.tools20022.repository.entity.Mandate.mmAccountContract);
				subType_lazy = () -> Arrays.asList(InvestmentAccountContract.mmObject(), CashAccountContract.mmObject());
				superType_lazy = () -> Contract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountContract.mmTargetClosingDate, com.tools20022.repository.entity.AccountContract.mmUrgencyFlag,
						com.tools20022.repository.entity.AccountContract.mmRemovalIndicator, com.tools20022.repository.entity.AccountContract.mmTargetGoLiveDate, com.tools20022.repository.entity.AccountContract.mmAccountService,
						com.tools20022.repository.entity.AccountContract.mmAccount, com.tools20022.repository.entity.AccountContract.mmInterest, com.tools20022.repository.entity.AccountContract.mmRequestDate,
						com.tools20022.repository.entity.AccountContract.mmAccountAuthorisation, com.tools20022.repository.entity.AccountContract.mmTransactionChannel);
				derivationComponent_lazy = () -> Arrays.asList(ContractDocument1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountContract.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getTargetClosingDate() {
		return targetClosingDate;
	}

	public AccountContract setTargetClosingDate(ISODateTime targetClosingDate) {
		this.targetClosingDate = Objects.requireNonNull(targetClosingDate);
		return this;
	}

	public TrueFalseIndicator getUrgencyFlag() {
		return urgencyFlag;
	}

	public AccountContract setUrgencyFlag(TrueFalseIndicator urgencyFlag) {
		this.urgencyFlag = Objects.requireNonNull(urgencyFlag);
		return this;
	}

	public YesNoIndicator getRemovalIndicator() {
		return removalIndicator;
	}

	public AccountContract setRemovalIndicator(YesNoIndicator removalIndicator) {
		this.removalIndicator = Objects.requireNonNull(removalIndicator);
		return this;
	}

	public ISODateTime getTargetGoLiveDate() {
		return targetGoLiveDate;
	}

	public AccountContract setTargetGoLiveDate(ISODateTime targetGoLiveDate) {
		this.targetGoLiveDate = Objects.requireNonNull(targetGoLiveDate);
		return this;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public AccountContract setAccountService(com.tools20022.repository.entity.AccountService accountService) {
		this.accountService = Objects.requireNonNull(accountService);
		return this;
	}

	public List<Account> getAccount() {
		return account == null ? account = new ArrayList<>() : account;
	}

	public AccountContract setAccount(List<com.tools20022.repository.entity.Account> account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public List<Interest> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public AccountContract setInterest(List<com.tools20022.repository.entity.Interest> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public ISODateTime getRequestDate() {
		return requestDate;
	}

	public AccountContract setRequestDate(ISODateTime requestDate) {
		this.requestDate = Objects.requireNonNull(requestDate);
		return this;
	}

	public List<Mandate> getAccountAuthorisation() {
		return accountAuthorisation == null ? accountAuthorisation = new ArrayList<>() : accountAuthorisation;
	}

	public AccountContract setAccountAuthorisation(List<com.tools20022.repository.entity.Mandate> accountAuthorisation) {
		this.accountAuthorisation = Objects.requireNonNull(accountAuthorisation);
		return this;
	}

	public TransactionChannelCode getTransactionChannel() {
		return transactionChannel;
	}

	public AccountContract setTransactionChannel(TransactionChannelCode transactionChannel) {
		this.transactionChannel = Objects.requireNonNull(transactionChannel);
		return this;
	}
}