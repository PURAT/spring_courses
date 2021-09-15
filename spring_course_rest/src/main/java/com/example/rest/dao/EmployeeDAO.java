package com.example.rest.dao;

import com.example.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    void addEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
