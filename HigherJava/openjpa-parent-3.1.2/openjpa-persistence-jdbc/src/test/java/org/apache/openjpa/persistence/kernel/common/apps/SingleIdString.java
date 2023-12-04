/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openjpa.persistence.kernel.common.apps;



import javax.persistence.Entity;

import org.apache.openjpa.util.StringId;

@Entity
public class SingleIdString implements SingleId {

    private String pk;
    private String str;

    @Override
    public boolean correctIdClass(Class c) {
        return StringId.class.equals(c);
    }

    public String getPk() {
        return pk;
    }

    @Override
    public String getPkString() {
        return pk;
    }

    public void setPk(String i) {
        pk = i;
    }

    @Override
    public String getString() {
        return str;
    }

    @Override
    public void setString(String s) {
        str = s;
    }
}
