package com.company;

import java.util.Iterator;

public class Company implements Iterable<Employee> {
    private Employee[] employees = new Employee[0];

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new ArrayIterator<>(employees);
    }
}
