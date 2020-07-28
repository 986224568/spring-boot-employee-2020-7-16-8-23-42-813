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

    private void deleteEmployee(int employeeID) {
        for (Employee employee : employeeList) {
            if (employee.getId() == employeeID) {
                employeeList.remove(employee);
            }
        }
    }

    private void updateEmployee (Employee employeeDTO) {
        for (Employee employee : this.employeeList) {
            if (employee.getId() == employeeDTO.getId()) {
                employee.setAge(employeeDTO.getAge());
                employee.setGender(employeeDTO.getGender());
                employee.setName(employeeDTO.getName());
            }
        }
    }

}
