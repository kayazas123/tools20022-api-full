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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.msg.AdditionalReference3;
import com.tools20022.repository.msg.EstimatedFundCashForecast2;
import com.tools20022.repository.msg.Extension1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The FundDetailedEstimatedCashForecastReport message is sent by a report
 * provider, such as a transfer agent or a designated agent of the fund, to a
 * report user, such as an investment manager, a fund accountant or any other
 * interested party.<br>
 * This message is used to report estimated cash incomings and outgoings, sorted
 * by country, institution or some other criteria defined by the user. This
 * message can be used to report the estimated cash movements of one or more
 * investment funds, on one or more trade dates. These cash movements may result
 * from, for example, redemption, subscription, switch transactions or
 * dividends.<br>
 * <b>Usage</b><br>
 * The FundDetailedEstimatedCashForecastReport is used to provide definitive
 * cash movements, i.e., it is sent prior to the cutoff time and/or the price
 * valuation of the fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.042.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02#mmPoolReference
 * FundDetailedEstimatedCashForecastReportV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02#mmPreviousReference
 * FundDetailedEstimatedCashForecastReportV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02#mmRelatedReference
 * FundDetailedEstimatedCashForecastReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02#mmEstimatedFundCashForecastDetails
 * FundDetailedEstimatedCashForecastReportV02.mmEstimatedFundCashForecastDetails
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02#mmExtension
 * FundDetailedEstimatedCashForecastReportV02.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "camt.042.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "camt.042.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundDetailedEstimatedCashForecastReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FundDetailedEstimatedCashForecastReport message is sent by a report provider, such as a transfer agent or a designated agent of the fund, to a report user, such as an investment manager, a fund accountant or any other interested party.\r\nThis message is used to report estimated cash incomings and outgoings, sorted by country, institution or some other criteria defined by the user. This message can be used to report the estimated cash movements of one or more investment funds, on one or more trade dates. These cash movements may result from, for example, redemption, subscription, switch transactions or dividends.\r\nUsage\r\nThe FundDetailedEstimatedCashForecastReport is used to provide definitive cash movements, i.e., it is sent prior to the cutoff time and/or the price valuation of the fund."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV03
 * FundDetailedEstimatedCashForecastReportV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "camt.042.001.02", propOrder = {"poolReference", "previousReference", "relatedReference", "estimatedFundCashForecastDetails", "extension"})
public class FundDetailedEstimatedCashForecastReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PoolRef")
	protected AdditionalReference3 poolReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FundDetailedEstimatedCashForecastReportV02, Optional<AdditionalReference3>> mmPoolReference = new MMMessageBuildingBlock<FundDetailedEstimatedCashForecastReportV02, Optional<AdditionalReference3>>() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(FundDetailedEstimatedCashForecastReportV02 obj) {
			return obj.getPoolReference();
		}

		@Override
		public void setValue(FundDetailedEstimatedCashForecastReportV02 obj, Optional<AdditionalReference3> value) {
			obj.setPoolReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsRef")
	protected List<AdditionalReference3> previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FundDetailedEstimatedCashForecastReportV02, List<AdditionalReference3>> mmPreviousReference = new MMMessageBuildingBlock<FundDetailedEstimatedCashForecastReportV02, List<AdditionalReference3>>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public List<AdditionalReference3> getValue(FundDetailedEstimatedCashForecastReportV02 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(FundDetailedEstimatedCashForecastReportV02 obj, List<AdditionalReference3> value) {
			obj.setPreviousReference(value);
		}
	};
	@XmlElement(name = "RltdRef")
	protected List<AdditionalReference3> relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FundDetailedEstimatedCashForecastReportV02, List<AdditionalReference3>> mmRelatedReference = new MMMessageBuildingBlock<FundDetailedEstimatedCashForecastReportV02, List<AdditionalReference3>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public List<AdditionalReference3> getValue(FundDetailedEstimatedCashForecastReportV02 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(FundDetailedEstimatedCashForecastReportV02 obj, List<AdditionalReference3> value) {
			obj.setRelatedReference(value);
		}
	};
	@XmlElement(name = "EstmtdFndCshFcstDtls", required = true)
	protected List<EstimatedFundCashForecast2> estimatedFundCashForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2
	 * EstimatedFundCashForecast2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdFndCshFcstDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedFundCashForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the estimated cash-in and cash-out flows for a specific trade date as a result of investment fund transactions, for example, subscriptions, redemptions or switches to/from a specified investment fund. The information provided is sorted by pre-defined criteria such as country, institution, currency or user defined criteria.\n\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FundDetailedEstimatedCashForecastReportV02, List<EstimatedFundCashForecast2>> mmEstimatedFundCashForecastDetails = new MMMessageBuildingBlock<FundDetailedEstimatedCashForecastReportV02, List<EstimatedFundCashForecast2>>() {
		{
			xmlTag = "EstmtdFndCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedFundCashForecastDetails";
			definition = "Information related to the estimated cash-in and cash-out flows for a specific trade date as a result of investment fund transactions, for example, subscriptions, redemptions or switches to/from a specified investment fund. The information provided is sorted by pre-defined criteria such as country, institution, currency or user defined criteria.\n\n.";
			minOccurs = 1;
			complexType_lazy = () -> EstimatedFundCashForecast2.mmObject();
		}

		@Override
		public List<EstimatedFundCashForecast2> getValue(FundDetailedEstimatedCashForecastReportV02 obj) {
			return obj.getEstimatedFundCashForecastDetails();
		}

		@Override
		public void setValue(FundDetailedEstimatedCashForecastReportV02 obj, List<EstimatedFundCashForecast2> value) {
			obj.setEstimatedFundCashForecastDetails(value);
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FundDetailedEstimatedCashForecastReportV02, List<Extension1>> mmExtension = new MMMessageBuildingBlock<FundDetailedEstimatedCashForecastReportV02, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(FundDetailedEstimatedCashForecastReportV02 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(FundDetailedEstimatedCashForecastReportV02 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundDetailedEstimatedCashForecastReportV02";
				definition = "Scope\r\nThe FundDetailedEstimatedCashForecastReport message is sent by a report provider, such as a transfer agent or a designated agent of the fund, to a report user, such as an investment manager, a fund accountant or any other interested party.\r\nThis message is used to report estimated cash incomings and outgoings, sorted by country, institution or some other criteria defined by the user. This message can be used to report the estimated cash movements of one or more investment funds, on one or more trade dates. These cash movements may result from, for example, redemption, subscription, switch transactions or dividends.\r\nUsage\r\nThe FundDetailedEstimatedCashForecastReport is used to provide definitive cash movements, i.e., it is sent prior to the cutoff time and/or the price valuation of the fund.";
				nextVersions_lazy = () -> Arrays.asList(FundDetailedEstimatedCashForecastReportV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "camt.042.001.02";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				xmlName = "camt.042.001.02";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02.mmPoolReference,
						com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02.mmPreviousReference, com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02.mmRelatedReference,
						com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02.mmEstimatedFundCashForecastDetails, com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV02.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "042";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FundDetailedEstimatedCashForecastReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public FundDetailedEstimatedCashForecastReportV02 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public List<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? previousReference = new ArrayList<>() : previousReference;
	}

	public FundDetailedEstimatedCashForecastReportV02 setPreviousReference(List<AdditionalReference3> previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public List<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? relatedReference = new ArrayList<>() : relatedReference;
	}

	public FundDetailedEstimatedCashForecastReportV02 setRelatedReference(List<AdditionalReference3> relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public List<EstimatedFundCashForecast2> getEstimatedFundCashForecastDetails() {
		return estimatedFundCashForecastDetails == null ? estimatedFundCashForecastDetails = new ArrayList<>() : estimatedFundCashForecastDetails;
	}

	public FundDetailedEstimatedCashForecastReportV02 setEstimatedFundCashForecastDetails(List<EstimatedFundCashForecast2> estimatedFundCashForecastDetails) {
		this.estimatedFundCashForecastDetails = Objects.requireNonNull(estimatedFundCashForecastDetails);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public FundDetailedEstimatedCashForecastReportV02 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.042.001.02")
	static public class Document {
		@XmlElement(name = "camt.042.001.02", required = true)
		public FundDetailedEstimatedCashForecastReportV02 messageBody;
	}
}