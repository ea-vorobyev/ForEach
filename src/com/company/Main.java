package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	    Company company = new Company();
	    Employee[] employees = {new Employee("Mike"), new Employee("John"), new Employee("Kate")};
	    company.setEmployees(employees);

//        Employee[] comEmployees = company.getEmployees();
//        for(int k = 0; k < comEmployees.length; k++) {
//            System.out.println(comEmployees[k].getFirstName());
//        }

        Iterator<Employee> myIterator = company.iterator();
        while(myIterator.hasNext()) {
            System.out.println("Employee_1 [name = " + myIterator.next().getFirstName() + "]");
        }

        System.out.println("===================================================");

        for(Employee employee: company) {
            System.out.println("Employee_2 [name = " + employee.getFirstName() + "]");
        }
    }

}
