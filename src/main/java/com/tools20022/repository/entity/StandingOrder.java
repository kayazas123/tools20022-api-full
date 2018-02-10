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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.StandingOrderType1Choice;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.StandingOrderTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Instruction given by an account holder to an account servicer to make regular
 * transfers on given dates to the same beneficiary.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="StandingOrder" src="doc-files/StandingOrder.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmIdentification
 * StandingOrder.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#mmType
 * StandingOrder.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmValidityPeriod
 * StandingOrder.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmLinkSetIdentification
 * StandingOrder.mmLinkSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmStandingOrderSequence
 * StandingOrder.mmStandingOrderSequence}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#mmAmount
 * StandingOrder.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmCreditAccount
 * StandingOrder.mmCreditAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmDebitAccount
 * StandingOrder.mmDebitAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#mmFrequency
 * StandingOrder.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmEventDescription
 * StandingOrder.mmEventDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#mmDay
 * StandingOrder.mmDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmTimeSpecification
 * StandingOrder.mmTimeSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmPaymentInstructionTrigger
 * StandingOrder.mmPaymentInstructionTrigger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmIncludedStandingOrder
 * StandingOrder.mmIncludedStandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#mmLinkSet
 * StandingOrder.mmLinkSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCreditStandingOrder
 * CashAccount.mmRelatedCreditStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedDebitStandingOrder
 * CashAccount.mmRelatedDebitStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedStandingOrder
 * DateTimePeriod.mmRelatedStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmStandingOrder
 * PaymentInstruction.mmStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmIncludedStandingOrder
 * StandingOrder.mmIncludedStandingOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StandingOrder#mmLinkSet
 * StandingOrder.mmLinkSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashStandingOrder
 * CashStandingOrder}</li>
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
 * "StandingOrder"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary."
 * </li>
 * </ul>
 */
public class StandingOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmStandingOrderIdentification
	 * StandingOrderSearchCriteria1.mmStandingOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmLinkSetOrderIdentification
	 * StandingOrderSearchCriteria1.mmLinkSetOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderIdentification1#mmStandingOrderReference
	 * StandingOrderIdentification1.mmStandingOrderReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderIdentification2#mmIdentification
	 * StandingOrderIdentification2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails3#mmReference
	 * StandingOrderDetails3.mmReference}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder2#mmReference
	 * StandingOrder2.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmLinkSetOrderIdentification
	 * StandingOrder2.mmLinkSetOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder3#mmStandingOrderIdentification
	 * StandingOrder3.mmStandingOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder4#mmStandingOrderIdentification
	 * StandingOrder4.mmStandingOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria2#mmStandingOrderIdentification
	 * StandingOrderSearchCriteria2.mmStandingOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria2#mmLinkSetOrderIdentification
	 * StandingOrderSearchCriteria2.mmLinkSetOrderIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for a standing order, as assigned by the account servicer or the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StandingOrderSearchCriteria1.mmStandingOrderIdentification, StandingOrderSearchCriteria1.mmLinkSetOrderIdentification, StandingOrderIdentification1.mmStandingOrderReference,
					StandingOrderIdentification2.mmIdentification, StandingOrderDetails3.mmReference, StandingOrder2.mmReference, StandingOrder2.mmLinkSetOrderIdentification, StandingOrder3.mmStandingOrderIdentification,
					StandingOrder4.mmStandingOrderIdentification, StandingOrderSearchCriteria2.mmStandingOrderIdentification, StandingOrderSearchCriteria2.mmLinkSetOrderIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for a standing order, as assigned by the account servicer or the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StandingOrderTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StandingOrderTypeCode
	 * StandingOrderTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StandingOrderType1Choice#mmCode
	 * StandingOrderType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StandingOrderType1Choice#mmProprietary
	 * StandingOrderType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmType
	 * StandingOrderSearchCriteria1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1#mmExecutionType
	 * StandingOrder1.mmExecutionType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder2#mmType
	 * StandingOrder2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmExecutionType
	 * StandingOrder2.mmExecutionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder5#mmExecutionType
	 * StandingOrder5.mmExecutionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria2#mmType
	 * StandingOrderSearchCriteria2.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the standing order."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StandingOrderType1Choice.mmCode, StandingOrderType1Choice.mmProprietary, StandingOrderSearchCriteria1.mmType, StandingOrder1.mmExecutionType, StandingOrder2.mmType,
					StandingOrder2.mmExecutionType, StandingOrder5.mmExecutionType, StandingOrderSearchCriteria2.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of the standing order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandingOrderTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedStandingOrder
	 * DateTimePeriod.mmRelatedStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmValidityPeriod
	 * StandingOrderSearchCriteria1.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails1#mmValidityPeriod
	 * StandingOrderDetails1.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder1#mmValidityPeriod
	 * StandingOrder1.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails3#mmValidityPeriod
	 * StandingOrderDetails3.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmValidityPeriod
	 * StandingOrder2.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder5#mmValidityPeriod
	 * StandingOrder5.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria2#mmValidityPeriod
	 * StandingOrderSearchCriteria2.mmValidityPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dates during which the standing order is in effect."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmValidityPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(StandingOrderSearchCriteria1.mmValidityPeriod, StandingOrderDetails1.mmValidityPeriod, StandingOrder1.mmValidityPeriod, StandingOrderDetails3.mmValidityPeriod,
					StandingOrder2.mmValidityPeriod, StandingOrder5.mmValidityPeriod, StandingOrderSearchCriteria2.mmValidityPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Dates during which the standing order is in effect.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected Max35Text linkSetIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmLinkSetIdentification
	 * StandingOrderSearchCriteria1.mmLinkSetIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmLinkSetIdentification
	 * StandingOrder2.mmLinkSetIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria2#mmLinkSetIdentification
	 * StandingOrderSearchCriteria2.mmLinkSetIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification to unambiguously identiy the link set in which the standing order is defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLinkSetIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StandingOrderSearchCriteria1.mmLinkSetIdentification, StandingOrder2.mmLinkSetIdentification, StandingOrderSearchCriteria2.mmLinkSetIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LinkSetIdentification";
			definition = "Unique identification to unambiguously identiy the link set in which the standing order is defined.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getLinkSetIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number standingOrderSequence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria1#mmLinkSetOrderSequence
	 * StandingOrderSearchCriteria1.mmLinkSetOrderSequence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmLinkSetOrderSequence
	 * StandingOrder2.mmLinkSetOrderSequence}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderSearchCriteria2#mmLinkSetOrderSequence
	 * StandingOrderSearchCriteria2.mmLinkSetOrderSequence}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrderSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the sequence in which the system will execute the liquidity transfers standing order within the link set when additional liquidity is required."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStandingOrderSequence = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StandingOrderSearchCriteria1.mmLinkSetOrderSequence, StandingOrder2.mmLinkSetOrderSequence, StandingOrderSearchCriteria2.mmLinkSetOrderSequence);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingOrderSequence";
			definition = "Specifies the sequence in which the system will execute the liquidity transfers standing order within the link set when additional liquidity is required.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getStandingOrderSequence", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails1#mmAmount
	 * StandingOrderDetails1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder1#mmAmount
	 * StandingOrder1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails3#mmAmount
	 * StandingOrderDetails3.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder2#mmAmount
	 * StandingOrder2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1#mmLastCollectionCurrencyAmount
	 * DirectDebitInstructionDetails1.mmLastCollectionCurrencyAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder5#mmAmount
	 * StandingOrder5.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency and amount of the periodical payments. When the standing order is related to a fund investment plan, this is the cash part of the invested amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StandingOrderDetails1.mmAmount, StandingOrder1.mmAmount, StandingOrderDetails3.mmAmount, StandingOrder2.mmAmount, DirectDebitInstructionDetails1.mmLastCollectionCurrencyAmount,
					StandingOrder5.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Currency and amount of the periodical payments. When the standing order is related to a fund investment plan, this is the cash part of the invested amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashAccount creditAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCreditStandingOrder
	 * CashAccount.mmRelatedCreditStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails1#mmCreditAccount
	 * StandingOrderDetails1.mmCreditAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account credited from a standing order mechanism."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCreditAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(StandingOrderDetails1.mmCreditAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAccount";
			definition = "Cash account credited from a standing order mechanism.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedCreditStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected CashAccount debitAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedDebitStandingOrder
	 * CashAccount.mmRelatedDebitStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails1#mmDebitAccount
	 * StandingOrderDetails1.mmDebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrder2#mmDebtorAccount
	 * StandingOrder2.mmDebtorAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account debited from a standing order mechanism."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDebitAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(StandingOrderDetails1.mmDebitAccount, StandingOrder2.mmDebtorAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitAccount";
			definition = "Cash account debited from a standing order mechanism.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedDebitStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected FrequencyCode frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails1#mmFrequency
	 * StandingOrderDetails1.mmFrequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder1#mmFrequency
	 * StandingOrder1.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StandingOrderDetails3#mmFrequency
	 * StandingOrderDetails3.mmFrequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder2#mmFrequency
	 * StandingOrder2.mmFrequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StandingOrder5#mmFrequency
	 * StandingOrder5.mmFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency of the investment or divestment, eg, daily, weekly, or monthly."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StandingOrderDetails1.mmFrequency, StandingOrder1.mmFrequency, StandingOrderDetails3.mmFrequency, StandingOrder2.mmFrequency, StandingOrder5.mmFrequency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Frequency of the investment or divestment, eg, daily, weekly, or monthly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max140Text eventDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the event which triggers the exercise of a standing order for instance the reception of a report or the closing of an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEventDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventDescription";
			definition = "Describes the event which triggers the exercise of a standing order for instance the reception of a report or the closing of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getEventDescription", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number day;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Day"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date in a month for instance the 30th."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDay = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Day";
			definition = "Specifies the date in a month for instance the 30th.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getDay", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text timeSpecification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeSpecification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period for the time event, for instance end of day."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTimeSpecification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeSpecification";
			definition = "Specifies the period for the time event, for instance end of day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StandingOrder.class.getMethod("getTimeSpecification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PaymentInstruction paymentInstructionTrigger;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmStandingOrder
	 * PaymentInstruction.mmStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionTrigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standing order causes a payment instruction at regular intervals, eg, as specified by its frequency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPaymentInstructionTrigger = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionTrigger";
			definition = "Standing order causes a payment instruction at regular intervals, eg, as specified by its frequency.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
		}
	};
	protected StandingOrder includedStandingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmLinkSet
	 * StandingOrder.mmLinkSet}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StandingOrder
	 * StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncludedStandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the standing order included in the linkset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIncludedStandingOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncludedStandingOrder";
			definition = "Specifies the standing order included in the linkset.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmLinkSet;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
		}
	};
	protected StandingOrder linkSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder#mmIncludedStandingOrder
	 * StandingOrder.mmIncludedStandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.StandingOrder
	 * StandingOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.StandingOrder StandingOrder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of standing orders defined in a specific sequence."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLinkSet = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSet";
			definition = "Collection of standing orders defined in a specific sequence.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmIncludedStandingOrder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StandingOrder";
				definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmRelatedCreditStandingOrder, com.tools20022.repository.entity.CashAccount.mmRelatedDebitStandingOrder,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedStandingOrder, com.tools20022.repository.entity.PaymentInstruction.mmStandingOrder, com.tools20022.repository.entity.StandingOrder.mmIncludedStandingOrder,
						com.tools20022.repository.entity.StandingOrder.mmLinkSet);
				subType_lazy = () -> Arrays.asList(CashStandingOrder.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StandingOrder.mmIdentification, com.tools20022.repository.entity.StandingOrder.mmType, com.tools20022.repository.entity.StandingOrder.mmValidityPeriod,
						com.tools20022.repository.entity.StandingOrder.mmLinkSetIdentification, com.tools20022.repository.entity.StandingOrder.mmStandingOrderSequence, com.tools20022.repository.entity.StandingOrder.mmAmount,
						com.tools20022.repository.entity.StandingOrder.mmCreditAccount, com.tools20022.repository.entity.StandingOrder.mmDebitAccount, com.tools20022.repository.entity.StandingOrder.mmFrequency,
						com.tools20022.repository.entity.StandingOrder.mmEventDescription, com.tools20022.repository.entity.StandingOrder.mmDay, com.tools20022.repository.entity.StandingOrder.mmTimeSpecification,
						com.tools20022.repository.entity.StandingOrder.mmPaymentInstructionTrigger, com.tools20022.repository.entity.StandingOrder.mmIncludedStandingOrder, com.tools20022.repository.entity.StandingOrder.mmLinkSet);
			}

			@Override
			public Class<?> getInstanceClass() {
				return StandingOrder.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public StandingOrder setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public StandingOrderTypeCode getType() {
		return type;
	}

	public StandingOrder setType(StandingOrderTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public DateTimePeriod getValidityPeriod() {
		return validityPeriod;
	}

	public StandingOrder setValidityPeriod(com.tools20022.repository.entity.DateTimePeriod validityPeriod) {
		this.validityPeriod = Objects.requireNonNull(validityPeriod);
		return this;
	}

	public Max35Text getLinkSetIdentification() {
		return linkSetIdentification;
	}

	public StandingOrder setLinkSetIdentification(Max35Text linkSetIdentification) {
		this.linkSetIdentification = Objects.requireNonNull(linkSetIdentification);
		return this;
	}

	public Number getStandingOrderSequence() {
		return standingOrderSequence;
	}

	public StandingOrder setStandingOrderSequence(Number standingOrderSequence) {
		this.standingOrderSequence = Objects.requireNonNull(standingOrderSequence);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public StandingOrder setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public CashAccount getCreditAccount() {
		return creditAccount;
	}

	public StandingOrder setCreditAccount(com.tools20022.repository.entity.CashAccount creditAccount) {
		this.creditAccount = Objects.requireNonNull(creditAccount);
		return this;
	}

	public CashAccount getDebitAccount() {
		return debitAccount;
	}

	public StandingOrder setDebitAccount(com.tools20022.repository.entity.CashAccount debitAccount) {
		this.debitAccount = Objects.requireNonNull(debitAccount);
		return this;
	}

	public FrequencyCode getFrequency() {
		return frequency;
	}

	public StandingOrder setFrequency(FrequencyCode frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public Max140Text getEventDescription() {
		return eventDescription;
	}

	public StandingOrder setEventDescription(Max140Text eventDescription) {
		this.eventDescription = Objects.requireNonNull(eventDescription);
		return this;
	}

	public Number getDay() {
		return day;
	}

	public StandingOrder setDay(Number day) {
		this.day = Objects.requireNonNull(day);
		return this;
	}

	public Max35Text getTimeSpecification() {
		return timeSpecification;
	}

	public StandingOrder setTimeSpecification(Max35Text timeSpecification) {
		this.timeSpecification = Objects.requireNonNull(timeSpecification);
		return this;
	}

	public PaymentInstruction getPaymentInstructionTrigger() {
		return paymentInstructionTrigger;
	}

	public StandingOrder setPaymentInstructionTrigger(com.tools20022.repository.entity.PaymentInstruction paymentInstructionTrigger) {
		this.paymentInstructionTrigger = Objects.requireNonNull(paymentInstructionTrigger);
		return this;
	}

	public StandingOrder getIncludedStandingOrder() {
		return includedStandingOrder;
	}

	public StandingOrder setIncludedStandingOrder(com.tools20022.repository.entity.StandingOrder includedStandingOrder) {
		this.includedStandingOrder = Objects.requireNonNull(includedStandingOrder);
		return this;
	}

	public Optional<StandingOrder> getLinkSet() {
		return linkSet == null ? Optional.empty() : Optional.of(linkSet);
	}

	public StandingOrder setLinkSet(com.tools20022.repository.entity.StandingOrder linkSet) {
		this.linkSet = linkSet;
		return this;
	}
}