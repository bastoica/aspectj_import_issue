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

package org.apache.hadoop.hive.ql.ddl.table.lock;

import java.io.Serializable;
import java.util.Map;

import org.apache.hadoop.hive.ql.ddl.DDLDesc;
import org.apache.hadoop.hive.ql.plan.Explain;
import org.apache.hadoop.hive.ql.plan.Explain.Level;

/**
 * DDL task description for LOCK TABLE commands.
 */
@Explain(displayName = "Lock Table", explainLevels = { Level.USER, Level.DEFAULT, Level.EXTENDED })
public class LockTableDesc implements DDLDesc, Serializable {
  private static final long serialVersionUID = 1L;

  private final String tableName;
  private final String mode;
  private final Map<String, String> partSpec;
  private final String queryId;
  private final String queryStr;

  public LockTableDesc(String tableName, String mode, Map<String, String> partSpec, String queryId, String queryStr) {
    this.tableName = tableName;
    this.mode      = mode;
    this.partSpec  = partSpec;
    this.queryId   = queryId;
    this.queryStr  = queryStr;
  }

  public String getTableName() {
    return tableName;
  }

  public String getMode() {
    return mode;
  }

  public Map<String, String> getPartSpec() {
    return partSpec;
  }

  public String getQueryId() {
    return queryId;
  }

  public String getQueryStr() {
    return queryStr;
  }
}
