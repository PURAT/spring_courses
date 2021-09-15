package com.example.spring_course_jpa.service;

import com.example.spring_course_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void addEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);

    List<Employee> getAllEmployeesByName(String name);
}
