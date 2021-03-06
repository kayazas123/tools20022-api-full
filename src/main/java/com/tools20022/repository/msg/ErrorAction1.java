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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TerminalManagementActionResult1Code;
import com.tools20022.repository.codeset.TerminalManagementErrorAction1Code;
import com.tools20022.repository.entity.TerminalManagementAction;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Action to perform in case of error on the related action in progress.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ErrorAction1#mmActionResult
 * ErrorAction1.mmActionResult}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ErrorAction1#mmActionToProcess
 * ErrorAction1.mmActionToProcess}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
 * TerminalManagementAction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ErrorAction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Action to perform in case of error on the related action in progress."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ErrorAction2 ErrorAction2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ErrorAction1", propOrder = {"actionResult", "actionToProcess"})
public class ErrorAction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActnRslt", required = true)
	protected List<TerminalManagementActionResult1Code> actionResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmActionResult
	 * TerminalManagementAction.mmActionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ErrorAction1 ErrorAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnRslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of error action result codes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ErrorAction1, List<TerminalManagementActionResult1Code>> mmActionResult = new MMMessageAttribute<ErrorAction1, List<TerminalManagementActionResult1Code>>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmActionResult;
			componentContext_lazy = () -> com.tools20022.repository.msg.ErrorAction1.mmObject();
			isDerived = false;
			xmlTag = "ActnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionResult";
			definition = "List of error action result codes.";
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionResult1Code.mmObject();
		}

		@Override
		public List<TerminalManagementActionResult1Code> getValue(ErrorAction1 obj) {
			return obj.getActionResult();
		}

		@Override
		public void setValue(ErrorAction1 obj, List<TerminalManagementActionResult1Code> value) {
			obj.setActionResult(value);
		}
	};
	@XmlElement(name = "ActnToPrc", required = true)
	protected TerminalManagementErrorAction1Code actionToProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorAction1Code
	 * TerminalManagementErrorAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmActionToProcess
	 * TerminalManagementAction.mmActionToProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ErrorAction1 ErrorAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnToPrc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionToProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Action to be processed for the related errors."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ErrorAction1, TerminalManagementErrorAction1Code> mmActionToProcess = new MMMessageAttribute<ErrorAction1, TerminalManagementErrorAction1Code>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmActionToProcess;
			componentContext_lazy = () -> com.tools20022.repository.msg.ErrorAction1.mmObject();
			isDerived = false;
			xmlTag = "ActnToPrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionToProcess";
			definition = "Action to be processed for the related errors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementErrorAction1Code.mmObject();
		}

		@Override
		public TerminalManagementErrorAction1Code getValue(ErrorAction1 obj) {
			return obj.getActionToProcess();
		}

		@Override
		public void setValue(ErrorAction1 obj, TerminalManagementErrorAction1Code value) {
			obj.setActionToProcess(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ErrorAction1.mmActionResult, com.tools20022.repository.msg.ErrorAction1.mmActionToProcess);
				trace_lazy = () -> TerminalManagementAction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ErrorAction1";
				definition = "Action to perform in case of error on the related action in progress.";
				nextVersions_lazy = () -> Arrays.asList(ErrorAction2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<TerminalManagementActionResult1Code> getActionResult() {
		return actionResult == null ? actionResult = new ArrayList<>() : actionResult;
	}

	public ErrorAction1 setActionResult(List<TerminalManagementActionResult1Code> actionResult) {
		this.actionResult = Objects.requireNonNull(actionResult);
		return this;
	}

	public TerminalManagementErrorAction1Code getActionToProcess() {
		return actionToProcess;
	}

	public ErrorAction1 setActionToProcess(TerminalManagementErrorAction1Code actionToProcess) {
		this.actionToProcess = Objects.requireNonNull(actionToProcess);
		return this;
	}
}