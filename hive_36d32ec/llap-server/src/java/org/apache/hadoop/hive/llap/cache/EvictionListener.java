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

package org.apache.hadoop.hive.llap.cache;

public interface EvictionListener {
  /**
   * To be used for normal (reactive) eviction path where we don't expect MM to release memory right after this call
   * @param buffer
   */
  void notifyEvicted(LlapCacheableBuffer buffer);

  /**
   * To be used for proactive eviction only where we want to let MM release memory previously occupied by this buffer
   * @param buffer
   */
  void notifyProactivelyEvicted(LlapCacheableBuffer buffer);
}