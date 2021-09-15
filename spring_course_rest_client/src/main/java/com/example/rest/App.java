package com.example.rest;


import com.example.rest.configuration.MyConfig;
import com.example.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> employees = communication.getAllEmployees();
//        System.out.println(employees);

//        Employee employee = communication.getEmployee(17);
//        System.out.println(employee);

//        Employee employee = new Employee("Chulk", "Numbkoki", "Sales", 1100);
//        employee.setId(20);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(20);
    }
}
