/**
 * Copyright 2016 StreamSets Inc.
 *
 * Licensed under the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.datacollector.event.dto;

import java.util.List;

import com.streamsets.datacollector.event.dto.EventType;

public class ClientEvent {
  private String eventId;
  private List<String> destinations;
  private boolean requiresAck;
  private boolean isAckEvent;
  private EventType eventType;
  private Event event;

  public ClientEvent(String eventId,
    List<String> destinations,
    boolean requiresAck,
    boolean isAckEvent,
    EventType eventType,
    Event event) {
    this.eventId = eventId;
    this.destinations = destinations;
    this.requiresAck = requiresAck;
    this.eventType = eventType;
    this.event = event;
    this.isAckEvent = isAckEvent;
  }

  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ClientEvent() {
  }

  public boolean isAckEvent() {
    return isAckEvent;
  }

  public void setAckEvent(boolean isAckEvent) {
    this.isAckEvent = isAckEvent;
  }

  public List<String> getDestinations() {
    return destinations;
  }

  public void setDestinations(List<String> destinations) {
    this.destinations = destinations;
  }

  public boolean isRequiresAck() {
    return requiresAck;
  }

  public void setRequiresAck(boolean requiresAck) {
    this.requiresAck = requiresAck;
  }

  public EventType getEventType() {
    return eventType;
  }

  public void setEventType(EventType eventType) {
    this.eventType = eventType;
  }

  public Event getEvent() {
    return event;
  }

  public void setPayload(Event event) {
    this.event = event;
  }

}
