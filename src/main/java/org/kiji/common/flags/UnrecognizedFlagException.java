/**
 * Licensed to WibiData, Inc. under one or more contributor license
 * agreements.  See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.  WibiData, Inc.
 * licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.kiji.common.flags;

/**
 * When there are multiple flags declared with the same name.
 */
public class UnrecognizedFlagException extends RuntimeException {
  /**
   * Creates a new <code>UnrecognizedFlagException</code> instance.
   *
   * @param flagName The flag name.
   */
  public UnrecognizedFlagException(String flagName) {
    super("Flag " + flagName + " was never declared");
  }
}