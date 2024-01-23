/*
 * Licensed to the Apache Software Foundation (ASF) under one
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

package org.apache.hadoop.hive.serde2.typeinfo;

import org.apache.hadoop.hive.common.classification.InterfaceAudience;
import org.apache.hadoop.hive.common.classification.InterfaceStability;

@InterfaceAudience.Public
@InterfaceStability.Stable
public abstract class BaseCharTypeInfo extends PrimitiveTypeInfo {
  private static final long serialVersionUID = 1L;

  private int length;

  // no-arg constructor to make kyro happy.
  public BaseCharTypeInfo() {
  }

  public BaseCharTypeInfo(String typeName) {
    super(typeName);
  }

  public BaseCharTypeInfo(String typeName, int length) {
    super(typeName);
    this.length = length;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  @Override
  public String getQualifiedName() {
    return getQualifiedName(typeName, length);
  }

  /**
   * Utility method to build the fully qualified data type. For example:
   * (char,16) becomes char(16).
   *
   * @param typeName The name of the data type (char or varchar)
   * @param length The maximum length of the data type
   * @return A fully qualified field name
   */
  protected String getQualifiedName(String typeName, int length) {
    return typeName + '(' + length + ')';
  }

  @Override
  public void setTypeName(String typeName) {
    // type name should already be set by subclass
    return;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + length;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!super.equals(obj)) {
      return false;
    }
    BaseCharTypeInfo other = (BaseCharTypeInfo) obj;
    if (length != other.length) {
      return false;
    }
    return true;
  }
}