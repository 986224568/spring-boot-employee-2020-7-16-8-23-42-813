package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;


public interface EmployeeService {
    void addEmployee(Employee employee);
    void deleteEmployee(int employeeID);
    void updateEmployee(Employee employeeDTO);
    Employee queryEmployee(int id);
}
