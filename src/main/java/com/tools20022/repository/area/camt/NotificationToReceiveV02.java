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
import com.tools20022.repository.msg.AccountNotification4;
import com.tools20022.repository.msg.GroupHeader43;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The NotificationToReceive message is sent by an account owner or by a party
 * acting on the account owner's behalf to one of the account owner's account
 * servicing institutions. It is an advance notice that the account servicing
 * institution will receive funds to be credited to the account of the account
 * owner.<br>
 * <b>Usage</b><br>
 * The NotificationToReceive message is used to advise the account servicing
 * institution of funds that the account owner expects to have credited to its
 * account. The message can be used in either a direct or a relay scenario.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.057.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveV02#mmGroupHeader
 * NotificationToReceiveV02.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NotificationToReceiveV02#mmNotification
 * NotificationToReceiveV02.mmNotification}</li>
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
 * xmlTag} = "NtfctnToRcv"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NotificationToReceiveV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe NotificationToReceive message is sent by an account owner or by a party acting on the account owner's behalf to one of the account owner's account servicing institutions. It is an advance notice that the account servicing institution will receive funds to be credited to the account of the account owner.\r\nUsage\r\nThe NotificationToReceive message is used to advise the account servicing institution of funds that the account owner expects to have credited to its account. The message can be used in either a direct or a relay scenario."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.camt.NotificationToReceiveV03
 * NotificationToReceiveV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NotificationToReceiveV02", propOrder = {"groupHeader", "notification"})
public class NotificationToReceiveV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader43 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader43
	 * GroupHeader43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide further details on the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<NotificationToReceiveV02, GroupHeader43> mmGroupHeader = new MMMessageBuildingBlock<NotificationToReceiveV02, GroupHeader43>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of elements used to provide further details on the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader43.mmObject();
		}

		@Override
		public GroupHeader43 getValue(NotificationToReceiveV02 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(NotificationToReceiveV02 obj, GroupHeader43 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "Ntfctn", required = true)
	protected AccountNotification4 notification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification4
	 * AccountNotification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntfctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide further details on the account notification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<NotificationToReceiveV02, AccountNotification4> mmNotification = new MMMessageBuildingBlock<NotificationToReceiveV02, AccountNotification4>() {
		{
			xmlTag = "Ntfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notification";
			definition = "Set of elements used to provide further details on the account notification.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountNotification4.mmObject();
		}

		@Override
		public AccountNotification4 getValue(NotificationToReceiveV02 obj) {
			return obj.getNotification();
		}

		@Override
		public void setValue(NotificationToReceiveV02 obj, AccountNotification4 value) {
			obj.setNotification(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NotificationToReceiveV02";
				definition = "Scope\r\nThe NotificationToReceive message is sent by an account owner or by a party acting on the account owner's behalf to one of the account owner's account servicing institutions. It is an advance notice that the account servicing institution will receive funds to be credited to the account of the account owner.\r\nUsage\r\nThe NotificationToReceive message is used to advise the account servicing institution of funds that the account owner expects to have credited to its account. The message can be used in either a direct or a relay scenario.";
				nextVersions_lazy = () -> Arrays.asList(NotificationToReceiveV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "NtfctnToRcv";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.NotificationToReceiveV02.mmGroupHeader, com.tools20022.repository.area.camt.NotificationToReceiveV02.mmNotification);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "057";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return NotificationToReceiveV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader43 getGroupHeader() {
		return groupHeader;
	}

	public NotificationToReceiveV02 setGroupHeader(GroupHeader43 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public AccountNotification4 getNotification() {
		return notification;
	}

	public NotificationToReceiveV02 setNotification(AccountNotification4 notification) {
		this.notification = Objects.requireNonNull(notification);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.057.001.02")
	static public class Document {
		@XmlElement(name = "NtfctnToRcv", required = true)
		public NotificationToReceiveV02 messageBody;
	}
}