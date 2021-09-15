package com.example.rest.exception_handling;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(NoSuchEmployeeException e) {
        EmployeeIncorrectData employee = new EmployeeIncorrectData();
        employee.setInfo(e.getMessage());

        return new ResponseEntity<>(employee, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(Exception e) {
        EmployeeIncorrectData employee = new EmployeeIncorrectData();
        employee.setInfo(e.getMessage());
        return new ResponseEntity<>(employee, HttpStatus.BAD_REQUEST);
    }
}
