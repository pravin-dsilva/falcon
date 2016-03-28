/**
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
package org.apache.falcon.persistence;
/**
 * The name of queries to be used as constants accross the packages.
 */

public final class PersistenceConstants {
    private PersistenceConstants(){

    }
    public static final String  GET_MONITERED_INSTANCE = "GET_MONITERED_INSTANCE";
    public static final String DELETE_MONITORED_INSTANCES = "DELETE_MONITORED_INSTANCES";
    public static final String GET_ALL_MONITORING_FEEDS = "GET_ALL_MONITORING_FEEDS";
    public static final String GET_PENDING_INSTANCES = "GET_PENDING_INSTANCES";
    public static final String DELETE_PENDING_NOMINAL_INSTANCES = "DELETE_PENDING_NOMINAL_INSTANCES";
    public static final String DELETE_ALL_INSTANCES_FOR_FEED = "DELETE_ALL_INSTANCES_FOR_FEED";
    public static final String GET_DATE_FOR_PENDING_INSTANCES = "GET_DATE_FOR_PENDING_INSTANCES";
    public static final String GET_ALL_PENDING_INSTANCES = "GET_ALL_PENDING_INSTANCES";
}