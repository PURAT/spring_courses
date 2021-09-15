package com.example.springboot.spring_course_springboot.service;


import com.example.springboot.spring_course_springboot.entity.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void addEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
