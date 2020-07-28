package com.thoughtworks.springbootemployee.entity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private List<Employee> employeeList;

    public EmployeeList() {
        this.employeeList = new ArrayList<>();
    }

    private void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }
}
