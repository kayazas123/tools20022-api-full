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

package com.tools20022.repository.area.auth;

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.msg.CurrencyControlHeader1;
import com.tools20022.repository.msg.RegisteredContract2;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CrossBorderTransactionsCurrencyControlReportingISOLatestversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The ContractRegistrationClosureRequest message is sent by the reporting party
 * to the registration agent to close the registered contract subject to
 * currency control.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.020.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationClosureRequestV01#mmGroupHeader
 * ContractRegistrationClosureRequestV01.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationClosureRequestV01#mmRegisteredContractClosure
 * ContractRegistrationClosureRequestV01.mmRegisteredContractClosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationClosureRequestV01#mmSupplementaryData
 * ContractRegistrationClosureRequestV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CrossBorderTransactionsCurrencyControlReportingISOLatestversion
 * CrossBorderTransactionsCurrencyControlReportingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CtrctRegnClsrReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ContractRegistrationClosureRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ContractRegistrationClosureRequest message is sent by the reporting party to the registration agent to close the registered contract subject to currency control."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContractRegistrationClosureRequestV01", propOrder = {"groupHeader", "registeredContractClosure", "supplementaryData"})
public class ContractRegistrationClosureRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected CurrencyControlHeader1 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlHeader1
	 * CurrencyControlHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Characteristics shared by all individual items included in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ContractRegistrationClosureRequestV01, CurrencyControlHeader1> mmGroupHeader = new MMMessageBuildingBlock<ContractRegistrationClosureRequestV01, CurrencyControlHeader1>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Characteristics shared by all individual items included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CurrencyControlHeader1.mmObject();
		}

		@Override
		public CurrencyControlHeader1 getValue(ContractRegistrationClosureRequestV01 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(ContractRegistrationClosureRequestV01 obj, CurrencyControlHeader1 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "RegdCtrctClsr", required = true)
	protected List<RegisteredContract2> registeredContractClosure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegisteredContract2
	 * RegisteredContract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdCtrctClsr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredContractClosure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details on the closure of the registered contract."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=RU-CMPG, value=Deal Passport
	 * Closure</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ContractRegistrationClosureRequestV01, List<RegisteredContract2>> mmRegisteredContractClosure = new MMMessageBuildingBlock<ContractRegistrationClosureRequestV01, List<RegisteredContract2>>() {
		{
			xmlTag = "RegdCtrctClsr";
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "RU-CMPG"}, new String[]{"value", "Deal Passport Closure"}));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredContractClosure";
			definition = "Details on the closure of the registered contract.";
			minOccurs = 1;
			complexType_lazy = () -> RegisteredContract2.mmObject();
		}

		@Override
		public List<RegisteredContract2> getValue(ContractRegistrationClosureRequestV01 obj) {
			return obj.getRegisteredContractClosure();
		}

		@Override
		public void setValue(ContractRegistrationClosureRequestV01 obj, List<RegisteredContract2> value) {
			obj.setRegisteredContractClosure(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ContractRegistrationClosureRequestV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ContractRegistrationClosureRequestV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ContractRegistrationClosureRequestV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ContractRegistrationClosureRequestV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContractRegistrationClosureRequestV01";
				definition = "The ContractRegistrationClosureRequest message is sent by the reporting party to the registration agent to close the registered contract subject to currency control.";
				messageSet_lazy = () -> Arrays.asList(CrossBorderTransactionsCurrencyControlReportingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "CtrctRegnClsrReq";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.ContractRegistrationClosureRequestV01.mmGroupHeader,
						com.tools20022.repository.area.auth.ContractRegistrationClosureRequestV01.mmRegisteredContractClosure, com.tools20022.repository.area.auth.ContractRegistrationClosureRequestV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "020";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ContractRegistrationClosureRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyControlHeader1 getGroupHeader() {
		return groupHeader;
	}

	public ContractRegistrationClosureRequestV01 setGroupHeader(CurrencyControlHeader1 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<RegisteredContract2> getRegisteredContractClosure() {
		return registeredContractClosure == null ? registeredContractClosure = new ArrayList<>() : registeredContractClosure;
	}

	public ContractRegistrationClosureRequestV01 setRegisteredContractClosure(List<RegisteredContract2> registeredContractClosure) {
		this.registeredContractClosure = Objects.requireNonNull(registeredContractClosure);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ContractRegistrationClosureRequestV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.020.001.01")
	static public class Document {
		@XmlElement(name = "CtrctRegnClsrReq", required = true)
		public ContractRegistrationClosureRequestV01 messageBody;
	}
}