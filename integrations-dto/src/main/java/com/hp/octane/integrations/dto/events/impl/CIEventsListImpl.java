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

package com.hp.octane.integrations.dto.events.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hp.octane.integrations.dto.events.CIEvent;
import com.hp.octane.integrations.dto.events.CIEventsList;
import com.hp.octane.integrations.dto.general.CIServerInfo;

import java.util.List;

/**
 * Created by gullery on 15/02/2015.
 * <p/>
 * CI Events list data object descriptor
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CIEventsListImpl implements CIEventsList {
	private CIServerInfo server;
	private List<CIEvent> events;

	public CIServerInfo getServer() {
		return server;
	}

	public CIEventsList setServer(CIServerInfo server) {
		this.server = server;
		return this;
	}

	public List<CIEvent> getEvents() {
		return events;
	}

	public CIEventsList setEvents(List<CIEvent> events) {
		this.events = events;
		return this;
	}
}