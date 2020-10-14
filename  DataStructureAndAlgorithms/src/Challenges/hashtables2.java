/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author tarek
 */
public class hashtables2 {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));
        employees.forEach(e -> System.out.println(e));
        HashMap<Integer, Employee> hashTable = new HashMap<>();

        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            //if the employee is a duplicate, delete it from employees LinkedList
            if (hashTable.containsKey(e.getId())) {
                employees.remove();
            } else {
                hashTable.put(e.getId(), e);
            }

        }
        System.out.println("the new Employee");

        employees.forEach(e -> System.out.println(e));

    }

    // or
//        HashMap<Integer, Employee> hashTable = new HashMap<>();
//         List<Employee> remove = new ArrayList<>();
//
//        for(int i =0;i<employees.size();i++) {
//            Employee employee = employees.get(i);
//            if (hashTable.containsKey(employee.getId())) {
//                remove.add(employee);
//            }
//            else {
//                hashTable.put(employee.getId(), employee);
//            }
//        }
//
//        for (int i=0;i<remove.size();i++ ) {
//            employees.remove(i);
//        }
//
//        
//        System.out.println("the new Employee");
//         
//
//        employees.forEach(e -> System.out.println(e));
// 
//            
//        }
//    
//        
//    
}
