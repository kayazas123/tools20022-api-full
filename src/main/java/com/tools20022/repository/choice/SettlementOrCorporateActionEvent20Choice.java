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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CorporateActionEventType71Choice;
import com.tools20022.repository.choice.SecuritiesTransactionType24Choice;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of transaction type, corporate action event or settlement transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice#mmSecuritiesTransactionType
 * SettlementOrCorporateActionEvent20Choice.mmSecuritiesTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice#mmCorporateActionEventType
 * SettlementOrCorporateActionEvent20Choice.mmCorporateActionEventType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementOrCorporateActionEvent20Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of transaction type, corporate action event or settlement transaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementOrCorporateActionEvent20Choice", propOrder = {"securitiesTransactionType", "corporateActionEventType"})
public class SettlementOrCorporateActionEvent20Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesTxTp", required = true)
	protected SecuritiesTransactionType24Choice securitiesTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionType24Choice
	 * SecuritiesTransactionType24Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTransactionType
	 * SecuritiesTrade.mmSecuritiesTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice
	 * SettlementOrCorporateActionEvent20Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesTxTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of securities transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementOrCorporateActionEvent20Choice, SecuritiesTransactionType24Choice> mmSecuritiesTransactionType = new MMMessageAttribute<SettlementOrCorporateActionEvent20Choice, SecuritiesTransactionType24Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecuritiesTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesTxTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesTransactionType";
			definition = "Identifies the type of securities transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTransactionType24Choice.mmObject();
		}

		@Override
		public SecuritiesTransactionType24Choice getValue(SettlementOrCorporateActionEvent20Choice obj) {
			return obj.getSecuritiesTransactionType();
		}

		@Override
		public void setValue(SettlementOrCorporateActionEvent20Choice obj, SecuritiesTransactionType24Choice value) {
			obj.setSecuritiesTransactionType(value);
		}
	};
	@XmlElement(name = "CorpActnEvtTp", required = true)
	protected CorporateActionEventType71Choice corporateActionEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType71Choice
	 * CorporateActionEventType71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmType
	 * CorporateActionEvent.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice
	 * SettlementOrCorporateActionEvent20Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of corporate event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementOrCorporateActionEvent20Choice, CorporateActionEventType71Choice> mmCorporateActionEventType = new MMMessageAttribute<SettlementOrCorporateActionEvent20Choice, CorporateActionEventType71Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmType;
			componentContext_lazy = () -> com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventType";
			definition = "Specifies the type of corporate event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionEventType71Choice.mmObject();
		}

		@Override
		public CorporateActionEventType71Choice getValue(SettlementOrCorporateActionEvent20Choice obj) {
			return obj.getCorporateActionEventType();
		}

		@Override
		public void setValue(SettlementOrCorporateActionEvent20Choice obj, CorporateActionEventType71Choice value) {
			obj.setCorporateActionEventType(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice.mmSecuritiesTransactionType,
						com.tools20022.repository.choice.SettlementOrCorporateActionEvent20Choice.mmCorporateActionEventType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementOrCorporateActionEvent20Choice";
				definition = "Choice of transaction type, corporate action event or settlement transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesTransactionType24Choice getSecuritiesTransactionType() {
		return securitiesTransactionType;
	}

	public SettlementOrCorporateActionEvent20Choice setSecuritiesTransactionType(SecuritiesTransactionType24Choice securitiesTransactionType) {
		this.securitiesTransactionType = Objects.requireNonNull(securitiesTransactionType);
		return this;
	}

	public CorporateActionEventType71Choice getCorporateActionEventType() {
		return corporateActionEventType;
	}

	public SettlementOrCorporateActionEvent20Choice setCorporateActionEventType(CorporateActionEventType71Choice corporateActionEventType) {
		this.corporateActionEventType = Objects.requireNonNull(corporateActionEventType);
		return this;
	}
}