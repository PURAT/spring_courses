package com.example.rest;


import com.example.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;

    private static final String URL = "http://localhost:8080/spring_course_rest/api/employees";


    public List<Employee> getAllEmployees() {
        ResponseEntity<List<Employee>> entity = restTemplate.exchange(URL, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Employee>>() { });
        List<Employee> employees = entity.getBody();
        System.out.println(entity.getStatusCode());

        return employees;
    }

    public Employee getEmployee(int id) {

        Employee employee = null;
        try {
            ResponseEntity<Employee> entity = restTemplate.getForEntity(URL + "/" + id, Employee.class);
            employee = entity.getBody();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return employee;
    }

    public void deleteEmployee(int id) {
        restTemplate.delete(URL + "/" + id);
        System.out.println("Employee with id = " + id + " was deleted from DB.");
    }

    public void saveEmployee(Employee employee) {
        if (employee.getId() == 0) {
            ResponseEntity<Employee> entity = restTemplate.postForEntity(URL, employee, Employee.class);
            System.out.println("New employee was added to DB.");
            System.out.println(entity.getBody());
        }
        else {
            restTemplate.put(URL, employee);
            System.out.println("Employee with id = " + employee.getId() + " was updated.");
        }
    }

}
