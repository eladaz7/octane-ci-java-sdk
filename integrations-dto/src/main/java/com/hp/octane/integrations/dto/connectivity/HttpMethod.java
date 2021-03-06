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

package com.hp.octane.integrations.dto.connectivity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * HttpMethod enum
 */

public enum HttpMethod {
	POST("POST"),
	GET("GET"),
	PUT("PUT"),
	DELETE("DELETE");

	private String value;

	HttpMethod(String status) {
		this.value = status;
	}

	@JsonValue
	public String value() {
		return value;
	}

	@JsonCreator
	public static HttpMethod fromValue(String value) {
		if (value == null || value.isEmpty()) {
			throw new IllegalArgumentException("value MUST NOT be null nor empty");
		}

		HttpMethod result = null;
		for (HttpMethod v : values()) {
			if (v.value.equalsIgnoreCase(value)) {
				result = v;
				break;
			}
		}
		if (result == null) {
			throw new IllegalStateException("method '" + value + "' is not supported");
		} else {
			return result;
		}
	}
}