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
package org.apache.openjpa.persistence.jdbc.maps.m2mmapex7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="MEx7Phone")
public class PhoneNumber {
    @Id int number;

    @ManyToMany(mappedBy="phones")
    Map<Division, Employee> emps = new HashMap<>();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Map<Division, Employee>  getEmployees() {
        return emps;
    }

    public void addEmployees(Division d, Employee employee) {
        emps.put(d, employee);
    }

    public void removeEmployee(Division d) {
        emps.remove(d);
    }

    @Override
    public boolean equals(Object o) {
        PhoneNumber p = (PhoneNumber) o;
        Map<Division, Employee> map = p.getEmployees();
        if (p.getEmployees().size() != emps.size())
            return false;
        Collection<Map.Entry<Division, Employee>> entries =
            (Collection<Map.Entry<Division, Employee>>) emps.entrySet();
        for (Map.Entry<Division, Employee> entry : entries) {
            Division key = entry.getKey();
            Employee e = map.get(key);
            Employee e0 = entry.getValue();
            if (e.getEmpId() != e0.getEmpId())
                return false;
        }
        return true;
    }
}