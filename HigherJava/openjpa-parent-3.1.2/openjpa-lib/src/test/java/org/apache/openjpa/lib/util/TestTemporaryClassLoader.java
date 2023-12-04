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
package org.apache.openjpa.lib.util;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTemporaryClassLoader {

    @Test
    public void testTemporaryClassLoader() throws Exception {
        Set s = new HashSet();
        for (int i = 0; i < 2; i++) {
            ClassLoader loader = new TemporaryClassLoader
                (getClass().getClassLoader());
            Class cls = Class.forName("org.apache.openjpa.lib.util.TempClass",
                true, loader);
            s.add(cls);
            assertEquals(loader, cls.getClassLoader());
            assertEquals(i + 1, s.size());
        }
    }
}

class TempClass {

}
