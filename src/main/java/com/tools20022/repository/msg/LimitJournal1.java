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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.LimitAmount1;
import com.tools20022.repository.msg.LimitJournalEntry1;
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
 * Record where all transactions are originally entered. The journal details
 * which transactions occurred and what accounts were affected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LimitJournal1#mmLimit
 * LimitJournal1.mmLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitJournal1#mmJournalActivityDate
 * LimitJournal1.mmJournalActivityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitJournal1#mmJournalEntry
 * LimitJournal1.mmJournalEntry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitJournal1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Record where all transactions are originally entered. The journal details which transactions occurred and what accounts were affected."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LimitJournal1", propOrder = {"limit", "journalActivityDate", "journalEntry"})
public class LimitJournal1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Lmt", required = true)
	protected LimitAmount1 limit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitAmount1
	 * LimitAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitJournal1 LimitJournal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum value used for risk containment in a system or towards counterparts. The limit may be a current limit or a default limit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LimitJournal1, LimitAmount1> mmLimit = new MMMessageAssociationEnd<LimitJournal1, LimitAmount1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitJournal1.mmObject();
			isDerived = false;
			xmlTag = "Lmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			definition = "Maximum value used for risk containment in a system or towards counterparts. The limit may be a current limit or a default limit.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LimitAmount1.mmObject();
		}

		@Override
		public LimitAmount1 getValue(LimitJournal1 obj) {
			return obj.getLimit();
		}

		@Override
		public void setValue(LimitJournal1 obj, LimitAmount1 value) {
			obj.setLimit(value);
		}
	};
	@XmlElement(name = "JrnlActvtyDt", required = true)
	protected ISODate journalActivityDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitJournal1 LimitJournal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "JrnlActvtyDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JournalActivityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date upon which journal activity takes place."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LimitJournal1, ISODate> mmJournalActivityDate = new MMMessageAttribute<LimitJournal1, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitJournal1.mmObject();
			isDerived = false;
			xmlTag = "JrnlActvtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JournalActivityDate";
			definition = "Date upon which journal activity takes place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(LimitJournal1 obj) {
			return obj.getJournalActivityDate();
		}

		@Override
		public void setValue(LimitJournal1 obj, ISODate value) {
			obj.setJournalActivityDate(value);
		}
	};
	@XmlElement(name = "JrnlNtry")
	protected List<LimitJournalEntry1> journalEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LimitJournalEntry1
	 * LimitJournalEntry1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitJournal1 LimitJournal1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "JrnlNtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JournalEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Recording of transaction data pertaining to a transaction in a journal."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LimitJournal1, List<LimitJournalEntry1>> mmJournalEntry = new MMMessageAssociationEnd<LimitJournal1, List<LimitJournalEntry1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitJournal1.mmObject();
			isDerived = false;
			xmlTag = "JrnlNtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JournalEntry";
			definition = "Recording of transaction data pertaining to a transaction in a journal.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LimitJournalEntry1.mmObject();
		}

		@Override
		public List<LimitJournalEntry1> getValue(LimitJournal1 obj) {
			return obj.getJournalEntry();
		}

		@Override
		public void setValue(LimitJournal1 obj, List<LimitJournalEntry1> value) {
			obj.setJournalEntry(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitJournal1.mmLimit, com.tools20022.repository.msg.LimitJournal1.mmJournalActivityDate, com.tools20022.repository.msg.LimitJournal1.mmJournalEntry);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LimitJournal1";
				definition = "Record where all transactions are originally entered. The journal details which transactions occurred and what accounts were affected.";
			}
		});
		return mmObject_lazy.get();
	}

	public LimitAmount1 getLimit() {
		return limit;
	}

	public LimitJournal1 setLimit(LimitAmount1 limit) {
		this.limit = Objects.requireNonNull(limit);
		return this;
	}

	public ISODate getJournalActivityDate() {
		return journalActivityDate;
	}

	public LimitJournal1 setJournalActivityDate(ISODate journalActivityDate) {
		this.journalActivityDate = Objects.requireNonNull(journalActivityDate);
		return this;
	}

	public List<LimitJournalEntry1> getJournalEntry() {
		return journalEntry == null ? journalEntry = new ArrayList<>() : journalEntry;
	}

	public LimitJournal1 setJournalEntry(List<LimitJournalEntry1> journalEntry) {
		this.journalEntry = Objects.requireNonNull(journalEntry);
		return this;
	}
}