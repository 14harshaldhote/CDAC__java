/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day18;

/**
Write a java program to Create a collection of Employee class and sort
objects using comparable and comparator interfaces.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee other) {
        // Compare employees based on their IDs (natural order)
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}

public class q1 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(102, "Harshal"));
        employees.add(new Employee(103, "Yash"));
        employees.add(new Employee(101, "Swaraj"));

     
        Collections.sort(employees);
        System.out.println("Sorted by ID (natural order):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        
        Comparator<Employee> nameComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };

     
        Collections.sort(employees, nameComparator);
        System.out.println("\nSorted by Name (custom order):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}


