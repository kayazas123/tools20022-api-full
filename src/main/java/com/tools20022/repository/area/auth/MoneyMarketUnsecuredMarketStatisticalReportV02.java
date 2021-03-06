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

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.choice.UnsecuredMarketReport4Choice;
import com.tools20022.repository.msg.MoneyMarketReportHeader1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.MoneyMarketStatisticalReportingISOLatestversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The MoneyMarketUnsecuredMarketStatisticalReport message is sent by the
 * reporting agents to the relevant competent authority, to report all relevant
 * unsecured money market transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.013.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV02#mmReportHeader
 * MoneyMarketUnsecuredMarketStatisticalReportV02.mmReportHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV02#mmUnsecuredMarketReport
 * MoneyMarketUnsecuredMarketStatisticalReportV02.mmUnsecuredMarketReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV02#mmSupplementaryData
 * MoneyMarketUnsecuredMarketStatisticalReportV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.MoneyMarketStatisticalReportingISOLatestversion
 * MoneyMarketStatisticalReportingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MnyMktUscrdMktSttstclRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MoneyMarketUnsecuredMarketStatisticalReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The MoneyMarketUnsecuredMarketStatisticalReport message is sent by the reporting agents to the relevant competent authority, to report all relevant unsecured money market transactions."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV01
 * MoneyMarketUnsecuredMarketStatisticalReportV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MoneyMarketUnsecuredMarketStatisticalReportV02", propOrder = {"reportHeader", "unsecuredMarketReport", "supplementaryData"})
public class MoneyMarketUnsecuredMarketStatisticalReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptHdr", required = true)
	protected MoneyMarketReportHeader1 reportHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MoneyMarketReportHeader1
	 * MoneyMarketReportHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the elements specific to the report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV01#mmReportHeader
	 * MoneyMarketUnsecuredMarketStatisticalReportV01.mmReportHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MoneyMarketUnsecuredMarketStatisticalReportV02, MoneyMarketReportHeader1> mmReportHeader = new MMMessageBuildingBlock<MoneyMarketUnsecuredMarketStatisticalReportV02, MoneyMarketReportHeader1>() {
		{
			xmlTag = "RptHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportHeader";
			definition = "Provides the elements specific to the report.";
			previousVersion_lazy = () -> MoneyMarketUnsecuredMarketStatisticalReportV01.mmReportHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MoneyMarketReportHeader1.mmObject();
		}

		@Override
		public MoneyMarketReportHeader1 getValue(MoneyMarketUnsecuredMarketStatisticalReportV02 obj) {
			return obj.getReportHeader();
		}

		@Override
		public void setValue(MoneyMarketUnsecuredMarketStatisticalReportV02 obj, MoneyMarketReportHeader1 value) {
			obj.setReportHeader(value);
		}
	};
	@XmlElement(name = "UscrdMktRpt", required = true)
	protected UnsecuredMarketReport4Choice unsecuredMarketReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnsecuredMarketReport4Choice
	 * UnsecuredMarketReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UscrdMktRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsecuredMarketReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the reason why no activity is reported or the required list of transactions for the unsecured market segment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV01#mmUnsecuredMarketReport
	 * MoneyMarketUnsecuredMarketStatisticalReportV01.mmUnsecuredMarketReport}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MoneyMarketUnsecuredMarketStatisticalReportV02, UnsecuredMarketReport4Choice> mmUnsecuredMarketReport = new MMMessageBuildingBlock<MoneyMarketUnsecuredMarketStatisticalReportV02, UnsecuredMarketReport4Choice>() {
		{
			xmlTag = "UscrdMktRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsecuredMarketReport";
			definition = "Provides the reason why no activity is reported or the required list of transactions for the unsecured market segment.";
			previousVersion_lazy = () -> MoneyMarketUnsecuredMarketStatisticalReportV01.mmUnsecuredMarketReport;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnsecuredMarketReport4Choice.mmObject();
		}

		@Override
		public UnsecuredMarketReport4Choice getValue(MoneyMarketUnsecuredMarketStatisticalReportV02 obj) {
			return obj.getUnsecuredMarketReport();
		}

		@Override
		public void setValue(MoneyMarketUnsecuredMarketStatisticalReportV02 obj, UnsecuredMarketReport4Choice value) {
			obj.setUnsecuredMarketReport(value);
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV01#mmSupplementaryData
	 * MoneyMarketUnsecuredMarketStatisticalReportV01.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MoneyMarketUnsecuredMarketStatisticalReportV02, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MoneyMarketUnsecuredMarketStatisticalReportV02, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			previousVersion_lazy = () -> MoneyMarketUnsecuredMarketStatisticalReportV01.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MoneyMarketUnsecuredMarketStatisticalReportV02 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MoneyMarketUnsecuredMarketStatisticalReportV02 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MoneyMarketUnsecuredMarketStatisticalReportV02";
				definition = "The MoneyMarketUnsecuredMarketStatisticalReport message is sent by the reporting agents to the relevant competent authority, to report all relevant unsecured money market transactions.";
				previousVersion_lazy = () -> MoneyMarketUnsecuredMarketStatisticalReportV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(MoneyMarketStatisticalReportingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "MnyMktUscrdMktSttstclRpt";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV02.mmReportHeader,
						com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV02.mmUnsecuredMarketReport, com.tools20022.repository.area.auth.MoneyMarketUnsecuredMarketStatisticalReportV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "013";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MoneyMarketUnsecuredMarketStatisticalReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MoneyMarketReportHeader1 getReportHeader() {
		return reportHeader;
	}

	public MoneyMarketUnsecuredMarketStatisticalReportV02 setReportHeader(MoneyMarketReportHeader1 reportHeader) {
		this.reportHeader = Objects.requireNonNull(reportHeader);
		return this;
	}

	public UnsecuredMarketReport4Choice getUnsecuredMarketReport() {
		return unsecuredMarketReport;
	}

	public MoneyMarketUnsecuredMarketStatisticalReportV02 setUnsecuredMarketReport(UnsecuredMarketReport4Choice unsecuredMarketReport) {
		this.unsecuredMarketReport = Objects.requireNonNull(unsecuredMarketReport);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MoneyMarketUnsecuredMarketStatisticalReportV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.013.001.02")
	static public class Document {
		@XmlElement(name = "MnyMktUscrdMktSttstclRpt", required = true)
		public MoneyMarketUnsecuredMarketStatisticalReportV02 messageBody;
	}
}