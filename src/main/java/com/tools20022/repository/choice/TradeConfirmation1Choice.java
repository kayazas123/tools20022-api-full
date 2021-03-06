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
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TradeConfirmation2;
import com.tools20022.repository.msg.TradeNonConfirmation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information regarding the confirmation of the contract.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeConfirmation1Choice#mmConfirmed
 * TradeConfirmation1Choice.mmConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeConfirmation1Choice#mmNonConfirmed
 * TradeConfirmation1Choice.mmNonConfirmed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeConfirmation1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information regarding the confirmation of the contract."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.TradeConfirmation2Choice
 * TradeConfirmation2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeConfirmation1Choice", propOrder = {"confirmed", "nonConfirmed"})
public class TradeConfirmation1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Confd", required = true)
	protected TradeConfirmation2 confirmed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeConfirmation2
	 * TradeConfirmation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeConfirmation1Choice
	 * TradeConfirmation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Confd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of contract confirmation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeConfirmation2Choice#mmConfirmed
	 * TradeConfirmation2Choice.mmConfirmed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeConfirmation1Choice, TradeConfirmation2> mmConfirmed = new MMMessageAssociationEnd<TradeConfirmation1Choice, TradeConfirmation2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeConfirmation1Choice.mmObject();
			isDerived = false;
			xmlTag = "Confd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmed";
			definition = "Indicates the type of contract confirmation.";
			nextVersions_lazy = () -> Arrays.asList(TradeConfirmation2Choice.mmConfirmed);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeConfirmation2.mmObject();
		}

		@Override
		public TradeConfirmation2 getValue(TradeConfirmation1Choice obj) {
			return obj.getConfirmed();
		}

		@Override
		public void setValue(TradeConfirmation1Choice obj, TradeConfirmation2 value) {
			obj.setConfirmed(value);
		}
	};
	@XmlElement(name = "NonConfd", required = true)
	protected TradeNonConfirmation1 nonConfirmed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeNonConfirmation1
	 * TradeNonConfirmation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeConfirmation1Choice
	 * TradeConfirmation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonConfd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonConfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that contract was not confirmed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeConfirmation2Choice#mmNonConfirmed
	 * TradeConfirmation2Choice.mmNonConfirmed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeConfirmation1Choice, TradeNonConfirmation1> mmNonConfirmed = new MMMessageAssociationEnd<TradeConfirmation1Choice, TradeNonConfirmation1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeConfirmation1Choice.mmObject();
			isDerived = false;
			xmlTag = "NonConfd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonConfirmed";
			definition = "Indicates that contract was not confirmed.";
			nextVersions_lazy = () -> Arrays.asList(TradeConfirmation2Choice.mmNonConfirmed);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeNonConfirmation1.mmObject();
		}

		@Override
		public TradeNonConfirmation1 getValue(TradeConfirmation1Choice obj) {
			return obj.getNonConfirmed();
		}

		@Override
		public void setValue(TradeConfirmation1Choice obj, TradeNonConfirmation1 value) {
			obj.setNonConfirmed(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradeConfirmation1Choice.mmConfirmed, com.tools20022.repository.choice.TradeConfirmation1Choice.mmNonConfirmed);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeConfirmation1Choice";
				definition = "Information regarding the confirmation of the contract.";
				nextVersions_lazy = () -> Arrays.asList(TradeConfirmation2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public TradeConfirmation2 getConfirmed() {
		return confirmed;
	}

	public TradeConfirmation1Choice setConfirmed(TradeConfirmation2 confirmed) {
		this.confirmed = Objects.requireNonNull(confirmed);
		return this;
	}

	public TradeNonConfirmation1 getNonConfirmed() {
		return nonConfirmed;
	}

	public TradeConfirmation1Choice setNonConfirmed(TradeNonConfirmation1 nonConfirmed) {
		this.nonConfirmed = Objects.requireNonNull(nonConfirmed);
		return this;
	}
}