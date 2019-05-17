/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.geode.connectors.util.internal;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.geode.connectors.jdbc.internal.configuration.FieldMapping;

public class DescribeMappingResult {
  private final Map<String, String> attributeMap;
  private String groupName;
  private List<FieldMapping> fieldMappings;


  public DescribeMappingResult() {
    this.attributeMap = new LinkedHashMap<>();
  }

  public DescribeMappingResult(Map<String, String> attributeMap) {
    this.attributeMap = attributeMap;
  }

  public Map<String, String> getAttributeMap() {
    return this.attributeMap;
  }

  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String group) {
    groupName = group;
  }

  public List<FieldMapping> getFieldMappings() {
    return fieldMappings;
  }

  public void setFieldMappings(List<FieldMapping> fieldMappings) {
    this.fieldMappings = fieldMappings;
  }
}