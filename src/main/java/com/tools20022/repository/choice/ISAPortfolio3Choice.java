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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Portfolio;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ISAYearsOfIssue6;
import com.tools20022.repository.msg.Portfolio1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice to provide additional portfolio information or individual savings
 * account information (UK government scheme provided by UK based financial
 * institutions only).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ISAPortfolio3Choice#mmISA
 * ISAPortfolio3Choice.mmISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ISAPortfolio3Choice#mmPortfolio
 * ISAPortfolio3Choice.mmPortfolio}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}</li>
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
 * "ISAPortfolio3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice to provide additional portfolio information or individual savings account information (UK government scheme provided by UK based financial institutions only)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ISAPortfolio4Choice
 * ISAPortfolio4Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ISAPortfolio3Choice", propOrder = {"iSA", "portfolio"})
public class ISAPortfolio3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ISA", required = true)
	protected ISAYearsOfIssue6 iSA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue6
	 * ISAYearsOfIssue6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#mmTransfer
	 * Portfolio.mmTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ISAPortfolio3Choice
	 * ISAPortfolio3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \r\nThe Individual Savings Account (ISA) is provided only by UK based financial institutions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ISAPortfolio4Choice#mmISA
	 * ISAPortfolio4Choice.mmISA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmISA = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Portfolio.mmTransfer;
			componentContext_lazy = () -> com.tools20022.repository.choice.ISAPortfolio3Choice.mmObject();
			isDerived = false;
			xmlTag = "ISA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISA";
			definition = "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \r\nThe Individual Savings Account (ISA) is provided only by UK based financial institutions.";
			nextVersions_lazy = () -> Arrays.asList(ISAPortfolio4Choice.mmISA);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ISAYearsOfIssue6.mmObject();
		}
	};
	@XmlElement(name = "Prtfl", required = true)
	protected Portfolio1 portfolio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Portfolio1
	 * Portfolio1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ISAPortfolio3Choice
	 * ISAPortfolio3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wrapper for a specific product or a specific sub-product owned by a set of beneficial owners."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ISAPortfolio4Choice#mmPortfolio
	 * ISAPortfolio4Choice.mmPortfolio}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortfolio = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Portfolio.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ISAPortfolio3Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Portfolio";
			definition = "Wrapper for a specific product or a specific sub-product owned by a set of beneficial owners.";
			nextVersions_lazy = () -> Arrays.asList(ISAPortfolio4Choice.mmPortfolio);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Portfolio1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ISAPortfolio3Choice.mmISA, com.tools20022.repository.choice.ISAPortfolio3Choice.mmPortfolio);
				trace_lazy = () -> Portfolio.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ISAPortfolio3Choice";
				definition = "Choice to provide additional portfolio information or individual savings account information (UK government scheme provided by UK based financial institutions only).";
				nextVersions_lazy = () -> Arrays.asList(ISAPortfolio4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ISAYearsOfIssue6 getISA() {
		return iSA;
	}

	public ISAPortfolio3Choice setISA(ISAYearsOfIssue6 iSA) {
		this.iSA = Objects.requireNonNull(iSA);
		return this;
	}

	public Portfolio1 getPortfolio() {
		return portfolio;
	}

	public ISAPortfolio3Choice setPortfolio(Portfolio1 portfolio) {
		this.portfolio = Objects.requireNonNull(portfolio);
		return this;
	}
}