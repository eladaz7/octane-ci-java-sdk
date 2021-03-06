/*
 *     Copyright 2017 Hewlett-Packard Development Company, L.P.
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.hp.octane.integrations.dto.parameters;

import com.hp.octane.integrations.dto.DTOBase;

/**
 * CI Parameter DTO
 */

public interface CIParameter extends DTOBase {

	CIParameterType getType();

	CIParameter setType(CIParameterType type);

	String getName();

	CIParameter setName(String name);

	String getDescription();

	CIParameter setDescription(String description);

	Object[] getChoices();

    /**
     * Set a list of values that this parameter can receive.
     */
	CIParameter setChoices(Object[] choices);

	Object getDefaultValue();

	CIParameter setDefaultValue(Object defaultValue);

	Object getValue();

	CIParameter setValue(Object value);
}
