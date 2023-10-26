/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcollection;

import java.util.Comparator;

/**
 *
 * @author harshalsMac
 */
public class studentCollectorAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        
        return o1.getAge() - o2.getAge();
    }
}
