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

package com.hp.octane.integrations.dto.coverage.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hp.octane.integrations.dto.coverage.BuildCoverage;
import com.hp.octane.integrations.dto.coverage.TestCoverage;

/**
 * Created by gullery on 30/12/2015.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
class BuildCoverageImpl implements BuildCoverage {
	private TestCoverage[] testCoverages;

	public TestCoverage[] getTestCoverages() {
		return testCoverages;
	}

	public BuildCoverage setTestCoverages(TestCoverage[] testCoverages) {
		this.testCoverages = testCoverages;
		return this;
	}
}