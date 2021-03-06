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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.InvestmentAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a statement of investment fund transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#mmStatementGeneralDetails
 * StatementOfInvestmentFundTransactions2.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#mmInvestmentAccountDetails
 * StatementOfInvestmentFundTransactions2.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#mmTransactionOnAccount
 * StatementOfInvestmentFundTransactions2.mmTransactionOnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#mmSubAccountDetails
 * StatementOfInvestmentFundTransactions2.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2#mmExtension
 * StatementOfInvestmentFundTransactions2.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
 * InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.StatementOfInvestmentFundTransactionsCancellationV02#mmStatementToBeCancelled
 * StatementOfInvestmentFundTransactionsCancellationV02.mmStatementToBeCancelled
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatementOfInvestmentFundTransactions2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about a statement of investment fund transactions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionOnAccountOrSubAccountDetailsRule#forStatementOfInvestmentFundTransactions2
 * ConstraintTransactionOnAccountOrSubAccountDetailsRule.
 * forStatementOfInvestmentFundTransactions2}</li>
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
 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3
 * StatementOfInvestmentFundTransactions3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatementOfInvestmentFundTransactions2", propOrder = {"statementGeneralDetails", "investmentAccountDetails", "transactionOnAccount", "subAccountDetails", "extension"})
public class StatementOfInvestmentFundTransactions2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StmtGnlDtls")
	protected Statement8 statementGeneralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Statement8 Statement8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2
	 * StatementOfInvestmentFundTransactions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtGnlDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementGeneralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information related to the investment fund statement of transactions that is being cancelled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmStatementGeneralDetails
	 * StatementOfInvestmentFundTransactions3.mmStatementGeneralDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatementOfInvestmentFundTransactions2, Optional<Statement8>> mmStatementGeneralDetails = new MMMessageAssociationEnd<StatementOfInvestmentFundTransactions2, Optional<Statement8>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.mmObject();
			isDerived = false;
			xmlTag = "StmtGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementGeneralDetails";
			definition = "General information related to the investment fund statement of transactions that is being cancelled.";
			nextVersions_lazy = () -> Arrays.asList(StatementOfInvestmentFundTransactions3.mmStatementGeneralDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Statement8.mmObject();
		}

		@Override
		public Optional<Statement8> getValue(StatementOfInvestmentFundTransactions2 obj) {
			return obj.getStatementGeneralDetails();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactions2 obj, Optional<Statement8> value) {
			obj.setStatementGeneralDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtAcctDtls")
	protected InvestmentAccount25 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount25
	 * InvestmentAccount25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2
	 * StatementOfInvestmentFundTransactions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to an investment account of the statement that is being cancelled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmInvestmentAccountDetails
	 * StatementOfInvestmentFundTransactions3.mmInvestmentAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatementOfInvestmentFundTransactions2, Optional<InvestmentAccount25>> mmInvestmentAccountDetails = new MMMessageAssociationEnd<StatementOfInvestmentFundTransactions2, Optional<InvestmentAccount25>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Information related to an investment account of the statement that is being cancelled.";
			nextVersions_lazy = () -> Arrays.asList(StatementOfInvestmentFundTransactions3.mmInvestmentAccountDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccount25.mmObject();
		}

		@Override
		public Optional<InvestmentAccount25> getValue(StatementOfInvestmentFundTransactions2 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactions2 obj, Optional<InvestmentAccount25> value) {
			obj.setInvestmentAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TxOnAcct")
	protected List<InvestmentFundTransactionsByFund2> transactionOnAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransactionsByFund2
	 * InvestmentFundTransactionsByFund2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTransaction
	 * InvestmentAccount.mmInvestmentFundTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2
	 * StatementOfInvestmentFundTransactions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxOnAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOnAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmTransactionOnAccount
	 * StatementOfInvestmentFundTransactions3.mmTransactionOnAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatementOfInvestmentFundTransactions2, List<InvestmentFundTransactionsByFund2>> mmTransactionOnAccount = new MMMessageAssociationEnd<StatementOfInvestmentFundTransactions2, List<InvestmentFundTransactionsByFund2>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentFundTransaction;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.mmObject();
			isDerived = false;
			xmlTag = "TxOnAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOnAccount";
			definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
			nextVersions_lazy = () -> Arrays.asList(StatementOfInvestmentFundTransactions3.mmTransactionOnAccount);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentFundTransactionsByFund2.mmObject();
		}

		@Override
		public List<InvestmentFundTransactionsByFund2> getValue(StatementOfInvestmentFundTransactions2 obj) {
			return obj.getTransactionOnAccount();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactions2 obj, List<InvestmentFundTransactionsByFund2> value) {
			obj.setTransactionOnAccount(value);
		}
	};
	@XmlElement(name = "SubAcctDtls", required = true)
	protected SubAccountIdentification6 subAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification6
	 * SubAccountIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2
	 * StatementOfInvestmentFundTransactions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sub-account of the safekeeping or investment account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmSubAccountDetails
	 * StatementOfInvestmentFundTransactions3.mmSubAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatementOfInvestmentFundTransactions2, SubAccountIdentification6> mmSubAccountDetails = new MMMessageAssociationEnd<StatementOfInvestmentFundTransactions2, SubAccountIdentification6>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.mmObject();
			isDerived = false;
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Sub-account of the safekeeping or investment account.";
			nextVersions_lazy = () -> Arrays.asList(StatementOfInvestmentFundTransactions3.mmSubAccountDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SubAccountIdentification6.mmObject();
		}

		@Override
		public SubAccountIdentification6 getValue(StatementOfInvestmentFundTransactions2 obj) {
			return obj.getSubAccountDetails();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactions2 obj, SubAccountIdentification6 value) {
			obj.setSubAccountDetails(value);
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Extension1 Extension1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2
	 * StatementOfInvestmentFundTransactions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementOfInvestmentFundTransactions3#mmExtension
	 * StatementOfInvestmentFundTransactions3.mmExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<StatementOfInvestmentFundTransactions2, List<Extension1>> mmExtension = new MMMessageAssociationEnd<StatementOfInvestmentFundTransactions2, List<Extension1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(StatementOfInvestmentFundTransactions3.mmExtension);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(StatementOfInvestmentFundTransactions2 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(StatementOfInvestmentFundTransactions2 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.mmStatementGeneralDetails,
						com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.mmInvestmentAccountDetails, com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.mmTransactionOnAccount,
						com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.mmSubAccountDetails, com.tools20022.repository.msg.StatementOfInvestmentFundTransactions2.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(StatementOfInvestmentFundTransactionsCancellationV02.mmStatementToBeCancelled);
				trace_lazy = () -> InvestmentAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransactionOnAccountOrSubAccountDetailsRule.forStatementOfInvestmentFundTransactions2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatementOfInvestmentFundTransactions2";
				definition = "Information about a statement of investment fund transactions.";
				nextVersions_lazy = () -> Arrays.asList(StatementOfInvestmentFundTransactions3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Statement8> getStatementGeneralDetails() {
		return statementGeneralDetails == null ? Optional.empty() : Optional.of(statementGeneralDetails);
	}

	public StatementOfInvestmentFundTransactions2 setStatementGeneralDetails(Statement8 statementGeneralDetails) {
		this.statementGeneralDetails = statementGeneralDetails;
		return this;
	}

	public Optional<InvestmentAccount25> getInvestmentAccountDetails() {
		return investmentAccountDetails == null ? Optional.empty() : Optional.of(investmentAccountDetails);
	}

	public StatementOfInvestmentFundTransactions2 setInvestmentAccountDetails(InvestmentAccount25 investmentAccountDetails) {
		this.investmentAccountDetails = investmentAccountDetails;
		return this;
	}

	public List<InvestmentFundTransactionsByFund2> getTransactionOnAccount() {
		return transactionOnAccount == null ? transactionOnAccount = new ArrayList<>() : transactionOnAccount;
	}

	public StatementOfInvestmentFundTransactions2 setTransactionOnAccount(List<InvestmentFundTransactionsByFund2> transactionOnAccount) {
		this.transactionOnAccount = Objects.requireNonNull(transactionOnAccount);
		return this;
	}

	public SubAccountIdentification6 getSubAccountDetails() {
		return subAccountDetails;
	}

	public StatementOfInvestmentFundTransactions2 setSubAccountDetails(SubAccountIdentification6 subAccountDetails) {
		this.subAccountDetails = Objects.requireNonNull(subAccountDetails);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public StatementOfInvestmentFundTransactions2 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}
}