package com.thoughtworks.springbootemployee.service.impl;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void deleteEmployee(int employeeID) {
        for (Employee employee : employeeList) {
            if (employee.getId() == employeeID) {
                employeeList.remove(employee);
            }
        }
    }

    @Override
    public void updateEmployee(Employee employeeDTO) {
        for (Employee employee : this.employeeList) {
            if (employee.getId() == employeeDTO.getId()) {
                employee.setAge(employeeDTO.getAge());
                employee.setGender(employeeDTO.getGender());
                employee.setName(employeeDTO.getName());
            }
        }
    }

    @Override
    public Employee queryEmployee(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
