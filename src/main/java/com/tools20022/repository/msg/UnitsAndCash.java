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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrument7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Completion of a securities settlement instruction, wherein securities are
 * delivered/debited from a securities account and received/credited to the
 * designated securities account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnitsAndCash#mmInstrument
 * UnitsAndCash.mmInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitsAndCash#mmGrandTotalAmount
 * UnitsAndCash.mmGrandTotalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitsAndCash#mmGroup1Number
 * UnitsAndCash.mmGroup1Number}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitsAndCash#mmGroup2Number
 * UnitsAndCash.mmGroup2Number}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnitsAndCash#mmCompleteIndicator
 * UnitsAndCash.mmCompleteIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnitsAndCash"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnitsAndCash", propOrder = {"instrument", "grandTotalAmount", "group1Number", "group2Number", "completeIndicator"})
public class UnitsAndCash {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Instrm", required = true)
	protected FinancialInstrument7 instrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument7
	 * FinancialInstrument7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash UnitsAndCash}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Instrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of underlying assets for the PEP or ISA."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnitsAndCash, FinancialInstrument7> mmInstrument = new MMMessageAssociationEnd<UnitsAndCash, FinancialInstrument7>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitsAndCash.mmObject();
			isDerived = false;
			xmlTag = "Instrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instrument";
			definition = "Specifies the type of underlying assets for the PEP or ISA.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrument7.mmObject();
		}

		@Override
		public FinancialInstrument7 getValue(UnitsAndCash obj) {
			return obj.getInstrument();
		}

		@Override
		public void setValue(UnitsAndCash obj, FinancialInstrument7 value) {
			obj.setInstrument(value);
		}
	};
	@XmlElement(name = "GrdTtlAmt", required = true)
	protected ImpliedCurrencyAndAmount grandTotalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAmount
	 * SecuritiesQuantity.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash UnitsAndCash}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrdTtlAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrandTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as an amount, eg, in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitsAndCash, ImpliedCurrencyAndAmount> mmGrandTotalAmount = new MMMessageAttribute<UnitsAndCash, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitsAndCash.mmObject();
			isDerived = false;
			xmlTag = "GrdTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrandTotalAmount";
			definition = "Quantity expressed as an amount, eg, in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(UnitsAndCash obj) {
			return obj.getGrandTotalAmount();
		}

		@Override
		public void setValue(UnitsAndCash obj, ImpliedCurrencyAndAmount value) {
			obj.setGrandTotalAmount(value);
		}
	};
	@XmlElement(name = "Grp1Nb")
	protected DecimalNumber group1Number;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash UnitsAndCash}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grp1Nb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group1Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity expressed as a number, eg, a number of shares."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitsAndCash, Optional<DecimalNumber>> mmGroup1Number = new MMMessageAttribute<UnitsAndCash, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitsAndCash.mmObject();
			isDerived = false;
			xmlTag = "Grp1Nb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group1Number";
			definition = "Quantity expressed as a number, eg, a number of shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(UnitsAndCash obj) {
			return obj.getGroup1Number();
		}

		@Override
		public void setValue(UnitsAndCash obj, Optional<DecimalNumber> value) {
			obj.setGroup1Number(value.orElse(null));
		}
	};
	@XmlElement(name = "Grp2Nb")
	protected DecimalNumber group2Number;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash UnitsAndCash}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grp2Nb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group2Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity expressed as a number, eg, a number of shares."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitsAndCash, Optional<DecimalNumber>> mmGroup2Number = new MMMessageAttribute<UnitsAndCash, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitsAndCash.mmObject();
			isDerived = false;
			xmlTag = "Grp2Nb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group2Number";
			definition = "Quantity expressed as a number, eg, a number of shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(UnitsAndCash obj) {
			return obj.getGroup2Number();
		}

		@Override
		public void setValue(UnitsAndCash obj, Optional<DecimalNumber> value) {
			obj.setGroup2Number(value.orElse(null));
		}
	};
	@XmlElement(name = "CmpltInd")
	protected YesNoIndicator completeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnitsAndCash UnitsAndCash}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpltInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompleteIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transfer of the asset is final or not, eg whether dividends or units are still to be delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnitsAndCash, Optional<YesNoIndicator>> mmCompleteIndicator = new MMMessageAttribute<UnitsAndCash, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UnitsAndCash.mmObject();
			isDerived = false;
			xmlTag = "CmpltInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompleteIndicator";
			definition = "Specifies whether the transfer of the asset is final or not, eg whether dividends or units are still to be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(UnitsAndCash obj) {
			return obj.getCompleteIndicator();
		}

		@Override
		public void setValue(UnitsAndCash obj, Optional<YesNoIndicator> value) {
			obj.setCompleteIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitsAndCash.mmInstrument, com.tools20022.repository.msg.UnitsAndCash.mmGrandTotalAmount, com.tools20022.repository.msg.UnitsAndCash.mmGroup1Number,
						com.tools20022.repository.msg.UnitsAndCash.mmGroup2Number, com.tools20022.repository.msg.UnitsAndCash.mmCompleteIndicator);
				trace_lazy = () -> InvestmentFundOrderExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UnitsAndCash";
				definition = "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrument7 getInstrument() {
		return instrument;
	}

	public UnitsAndCash setInstrument(FinancialInstrument7 instrument) {
		this.instrument = Objects.requireNonNull(instrument);
		return this;
	}

	public ImpliedCurrencyAndAmount getGrandTotalAmount() {
		return grandTotalAmount;
	}

	public UnitsAndCash setGrandTotalAmount(ImpliedCurrencyAndAmount grandTotalAmount) {
		this.grandTotalAmount = Objects.requireNonNull(grandTotalAmount);
		return this;
	}

	public Optional<DecimalNumber> getGroup1Number() {
		return group1Number == null ? Optional.empty() : Optional.of(group1Number);
	}

	public UnitsAndCash setGroup1Number(DecimalNumber group1Number) {
		this.group1Number = group1Number;
		return this;
	}

	public Optional<DecimalNumber> getGroup2Number() {
		return group2Number == null ? Optional.empty() : Optional.of(group2Number);
	}

	public UnitsAndCash setGroup2Number(DecimalNumber group2Number) {
		this.group2Number = group2Number;
		return this;
	}

	public Optional<YesNoIndicator> getCompleteIndicator() {
		return completeIndicator == null ? Optional.empty() : Optional.of(completeIndicator);
	}

	public UnitsAndCash setCompleteIndicator(YesNoIndicator completeIndicator) {
		this.completeIndicator = completeIndicator;
		return this;
	}
}