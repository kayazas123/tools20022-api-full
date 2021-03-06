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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountReport13;
import com.tools20022.repository.msg.ErrorHandling3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between account details or an operational error when the requested
 * data cannot be retrieved.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOrOperationalError1Choice#mmAccountReport
 * AccountOrOperationalError1Choice.mmAccountReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOrOperationalError1Choice#mmOperationalError
 * AccountOrOperationalError1Choice.mmOperationalError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountOrOperationalError1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between account details or an operational error when the requested data cannot be retrieved."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOrOperationalError2Choice
 * AccountOrOperationalError2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountOrOperationalError1Choice", propOrder = {"accountReport", "operationalError"})
public class AccountOrOperationalError1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctRpt", required = true)
	protected List<AccountReport13> accountReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountReport13
	 * AccountReport13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountOrOperationalError1Choice
	 * AccountOrOperationalError1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reports either on the account information or on a business error."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountOrOperationalError2Choice#mmAccountReport
	 * AccountOrOperationalError2Choice.mmAccountReport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountOrOperationalError1Choice, List<AccountReport13>> mmAccountReport = new MMMessageAssociationEnd<AccountOrOperationalError1Choice, List<AccountReport13>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountOrOperationalError1Choice.mmObject();
			isDerived = false;
			xmlTag = "AcctRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountReport";
			definition = "Reports either on the account information or on a business error.";
			nextVersions_lazy = () -> Arrays.asList(AccountOrOperationalError2Choice.mmAccountReport);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AccountReport13.mmObject();
		}

		@Override
		public List<AccountReport13> getValue(AccountOrOperationalError1Choice obj) {
			return obj.getAccountReport();
		}

		@Override
		public void setValue(AccountOrOperationalError1Choice obj, List<AccountReport13> value) {
			obj.setAccountReport(value);
		}
	};
	@XmlElement(name = "OprlErr", required = true)
	protected List<ErrorHandling3> operationalError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountOrOperationalError1Choice
	 * AccountOrOperationalError1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an operational error has been issued during the processing of the related request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountOrOperationalError2Choice#mmOperationalError
	 * AccountOrOperationalError2Choice.mmOperationalError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountOrOperationalError1Choice, List<ErrorHandling3>> mmOperationalError = new MMMessageAssociationEnd<AccountOrOperationalError1Choice, List<ErrorHandling3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountOrOperationalError1Choice.mmObject();
			isDerived = false;
			xmlTag = "OprlErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalError";
			definition = "Indicates that an operational error has been issued during the processing of the related request.";
			nextVersions_lazy = () -> Arrays.asList(AccountOrOperationalError2Choice.mmOperationalError);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling3.mmObject();
		}

		@Override
		public List<ErrorHandling3> getValue(AccountOrOperationalError1Choice obj) {
			return obj.getOperationalError();
		}

		@Override
		public void setValue(AccountOrOperationalError1Choice obj, List<ErrorHandling3> value) {
			obj.setOperationalError(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountOrOperationalError1Choice.mmAccountReport, com.tools20022.repository.choice.AccountOrOperationalError1Choice.mmOperationalError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountOrOperationalError1Choice";
				definition = "Choice between account details or an operational error when the requested data cannot be retrieved.";
				nextVersions_lazy = () -> Arrays.asList(AccountOrOperationalError2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<AccountReport13> getAccountReport() {
		return accountReport == null ? accountReport = new ArrayList<>() : accountReport;
	}

	public AccountOrOperationalError1Choice setAccountReport(List<AccountReport13> accountReport) {
		this.accountReport = Objects.requireNonNull(accountReport);
		return this;
	}

	public List<ErrorHandling3> getOperationalError() {
		return operationalError == null ? operationalError = new ArrayList<>() : operationalError;
	}

	public AccountOrOperationalError1Choice setOperationalError(List<ErrorHandling3> operationalError) {
		this.operationalError = Objects.requireNonNull(operationalError);
		return this;
	}
}