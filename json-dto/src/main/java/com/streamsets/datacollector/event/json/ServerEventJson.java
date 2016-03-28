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
package com.streamsets.datacollector.event.json;

import com.streamsets.datacollector.event.dto.EventType;

public class ServerEventJson {
  private String eventId;
  private String from;
  private boolean requiresAck;
  private boolean isAckEvent;
  private EventTypeJson eventType;
  private String payload;
  private long receivedTime;

  public ServerEventJson() {
  }

  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public boolean isRequiresAck() {
    return requiresAck;
  }

  public void setRequiresAck(boolean requiresAck) {
    this.requiresAck = requiresAck;
  }

  public boolean isAckEvent() {
    return isAckEvent;
  }

  public void setAckEvent(boolean isAckEvent) {
    this.isAckEvent = isAckEvent;
  }

  public EventTypeJson getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeJson eventType) {
    this.eventType = eventType;
  }

  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public long getReceivedTime() {
    return receivedTime;
  }

  public void setReceivedTime(long receivedTime) {
    this.receivedTime = receivedTime;
  }
}
