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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.CorporateActionOption;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.SecuritiesProceedsDefinition;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Period5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies periods.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod9#mmPriceCalculationPeriod
 * CorporateActionPeriod9.mmPriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod9#mmActionPeriod
 * CorporateActionPeriod9.mmActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod9#mmParallelTradingPeriod
 * CorporateActionPeriod9.mmParallelTradingPeriod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPeriod9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies periods."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPeriod11
 * CorporateActionPeriod11}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPeriod9", propOrder = {"priceCalculationPeriod", "actionPeriod", "parallelTradingPeriod"})
public class CorporateActionPeriod9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PricClctnPrd")
	protected Period5 priceCalculationPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Period5 Period5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceCalculationPeriod
	 * SecuritiesPricing.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod9
	 * CorporateActionPeriod9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricClctnPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCalculationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the price of a security is determined."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a:PRIC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod11#mmPriceCalculationPeriod
	 * CorporateActionPeriod11.mmPriceCalculationPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod9, Optional<Period5>> mmPriceCalculationPeriod = new MMMessageAssociationEnd<CorporateActionPeriod9, Optional<Period5>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceCalculationPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod9.mmObject();
			isDerived = false;
			xmlTag = "PricClctnPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a:PRIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod11.mmPriceCalculationPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period5.mmObject();
		}

		@Override
		public Optional<Period5> getValue(CorporateActionPeriod9 obj) {
			return obj.getPriceCalculationPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod9 obj, Optional<Period5> value) {
			obj.setPriceCalculationPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "ActnPrd")
	protected Period5 actionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Period5 Period5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmActionPeriod
	 * CorporateActionOption.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod9
	 * CorporateActionPeriod9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the specified option, or all options of the event, remains valid, for example, offer period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::PWAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod11#mmActionPeriod
	 * CorporateActionPeriod11.mmActionPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod9, Optional<Period5>> mmActionPeriod = new MMMessageAssociationEnd<CorporateActionPeriod9, Optional<Period5>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmActionPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod9.mmObject();
			isDerived = false;
			xmlTag = "ActnPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::PWAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionPeriod";
			definition = "Period during which the specified option, or all options of the event, remains valid, for example, offer period.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod11.mmActionPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period5.mmObject();
		}

		@Override
		public Optional<Period5> getValue(CorporateActionPeriod9 obj) {
			return obj.getActionPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod9 obj, Optional<Period5> value) {
			obj.setActionPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "ParllTradgPrd")
	protected Period5 parallelTradingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Period5 Period5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmParallelTradingPeriod
	 * SecuritiesProceedsDefinition.mmParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod9
	 * CorporateActionPeriod9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ParllTradgPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParallelTradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which both old and new equity may be traded simultaneously, for example, consolidation of equity or splitting of equity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::PARL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod11#mmParallelTradingPeriod
	 * CorporateActionPeriod11.mmParallelTradingPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod9, Optional<Period5>> mmParallelTradingPeriod = new MMMessageAssociationEnd<CorporateActionPeriod9, Optional<Period5>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmParallelTradingPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod9.mmObject();
			isDerived = false;
			xmlTag = "ParllTradgPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::PARL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParallelTradingPeriod";
			definition = "Period during which both old and new equity may be traded simultaneously, for example, consolidation of equity or splitting of equity.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod11.mmParallelTradingPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period5.mmObject();
		}

		@Override
		public Optional<Period5> getValue(CorporateActionPeriod9 obj) {
			return obj.getParallelTradingPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod9 obj, Optional<Period5> value) {
			obj.setParallelTradingPeriod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod9.mmPriceCalculationPeriod, com.tools20022.repository.msg.CorporateActionPeriod9.mmActionPeriod,
						com.tools20022.repository.msg.CorporateActionPeriod9.mmParallelTradingPeriod);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPeriod9";
				definition = "Specifies periods.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionPeriod11.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Period5> getPriceCalculationPeriod() {
		return priceCalculationPeriod == null ? Optional.empty() : Optional.of(priceCalculationPeriod);
	}

	public CorporateActionPeriod9 setPriceCalculationPeriod(Period5 priceCalculationPeriod) {
		this.priceCalculationPeriod = priceCalculationPeriod;
		return this;
	}

	public Optional<Period5> getActionPeriod() {
		return actionPeriod == null ? Optional.empty() : Optional.of(actionPeriod);
	}

	public CorporateActionPeriod9 setActionPeriod(Period5 actionPeriod) {
		this.actionPeriod = actionPeriod;
		return this;
	}

	public Optional<Period5> getParallelTradingPeriod() {
		return parallelTradingPeriod == null ? Optional.empty() : Optional.of(parallelTradingPeriod);
	}

	public CorporateActionPeriod9 setParallelTradingPeriod(Period5 parallelTradingPeriod) {
		this.parallelTradingPeriod = parallelTradingPeriod;
		return this;
	}
}