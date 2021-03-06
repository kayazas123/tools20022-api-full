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
import com.tools20022.repository.msg.ErrorHandling3;
import com.tools20022.repository.msg.LimitJournal1;
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
 * Defines the limit business report as either a limit report or a business
 * error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitJournalReportOrError2Choice#mmLimitJournal
 * LimitJournalReportOrError2Choice.mmLimitJournal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitJournalReportOrError2Choice#mmBusinessError
 * LimitJournalReportOrError2Choice.mmBusinessError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitJournalReportOrError2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the limit business report as either a limit report or a business error."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitJournalReportOrError4Choice
 * LimitJournalReportOrError4Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LimitJournalReportOrError2Choice", propOrder = {"limitJournal", "businessError"})
public class LimitJournalReportOrError2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LmtJrnl", required = true)
	protected LimitJournal1 limitJournal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitJournal1
	 * LimitJournal1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.LimitJournalReportOrError2Choice
	 * LimitJournalReportOrError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtJrnl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitJournal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested information on the limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LimitJournalReportOrError4Choice#mmLimitJournal
	 * LimitJournalReportOrError4Choice.mmLimitJournal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LimitJournalReportOrError2Choice, LimitJournal1> mmLimitJournal = new MMMessageAssociationEnd<LimitJournalReportOrError2Choice, LimitJournal1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.LimitJournalReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "LmtJrnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitJournal";
			definition = "Requested information on the limit.";
			nextVersions_lazy = () -> Arrays.asList(LimitJournalReportOrError4Choice.mmLimitJournal);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LimitJournal1.mmObject();
		}

		@Override
		public LimitJournal1 getValue(LimitJournalReportOrError2Choice obj) {
			return obj.getLimitJournal();
		}

		@Override
		public void setValue(LimitJournalReportOrError2Choice obj, LimitJournal1 value) {
			obj.setLimitJournal(value);
		}
	};
	@XmlElement(name = "BizErr", required = true)
	protected List<ErrorHandling3> businessError;
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
	 * {@linkplain com.tools20022.repository.choice.LimitJournalReportOrError2Choice
	 * LimitJournalReportOrError2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the requested business information is not given."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.LimitJournalReportOrError4Choice#mmBusinessError
	 * LimitJournalReportOrError4Choice.mmBusinessError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LimitJournalReportOrError2Choice, List<ErrorHandling3>> mmBusinessError = new MMMessageAssociationEnd<LimitJournalReportOrError2Choice, List<ErrorHandling3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.LimitJournalReportOrError2Choice.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given.";
			nextVersions_lazy = () -> Arrays.asList(LimitJournalReportOrError4Choice.mmBusinessError);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling3.mmObject();
		}

		@Override
		public List<ErrorHandling3> getValue(LimitJournalReportOrError2Choice obj) {
			return obj.getBusinessError();
		}

		@Override
		public void setValue(LimitJournalReportOrError2Choice obj, List<ErrorHandling3> value) {
			obj.setBusinessError(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.LimitJournalReportOrError2Choice.mmLimitJournal, com.tools20022.repository.choice.LimitJournalReportOrError2Choice.mmBusinessError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LimitJournalReportOrError2Choice";
				definition = "Defines the limit business report as either a limit report or a business error.";
				nextVersions_lazy = () -> Arrays.asList(LimitJournalReportOrError4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public LimitJournal1 getLimitJournal() {
		return limitJournal;
	}

	public LimitJournalReportOrError2Choice setLimitJournal(LimitJournal1 limitJournal) {
		this.limitJournal = Objects.requireNonNull(limitJournal);
		return this;
	}

	public List<ErrorHandling3> getBusinessError() {
		return businessError == null ? businessError = new ArrayList<>() : businessError;
	}

	public LimitJournalReportOrError2Choice setBusinessError(List<ErrorHandling3> businessError) {
		this.businessError = Objects.requireNonNull(businessError);
		return this;
	}
}