package com.example;

import com.example.validation.Email;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size (max = 20, min = 2, message = "incorrect name")
    @NotBlank (message = "name is required")
    private String name;
    @NotBlank (message = "surname is required")
    private String surname;
    @Positive(message = "salary must be more than zero")
    @Min(value = 500, message = "salary must be more than 499")
    @Max(value = 1500, message = "salary must be less than 1501")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languagesList;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "use pattern XXX-XX-XX")
    private String phoneNumber;
    @Email(value = "@abc.com", message = "email must ends \"@abc.com\"")
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technologies", "IT");
        departments.put("Sales", "Sales");
        departments.put("Human Resources", "HR");

        carBrands = new HashMap<>();
        carBrands.put("BMW 780i", "BMW");
        carBrands.put("Mercedes-Benz CLA", "MERCEDES");
        carBrands.put("Audi R8", "AUDI");

        languagesList = new HashMap<>();
        languagesList.put("English", "EN");
        languagesList.put("Dutch", "DE");
        languagesList.put("French", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
