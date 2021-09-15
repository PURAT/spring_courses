package com.example.rest.service;

import com.example.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void addEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
