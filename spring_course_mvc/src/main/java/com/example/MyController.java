package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askEmployee")
    public String askEmpDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details";
    }

    @RequestMapping("/showEmployee")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult result) {
        if (result.hasErrors())
            return "ask-emp-details";
        return "show-emp-details";
    }

//    @RequestMapping("/showEmployee")
//    public String showEmpDetails(@ModelAttribute("employee") Employee emp) {
//        String name = "Mr " + emp.getName();
//        emp.setName(name);
//        int salary = emp.getSalary() * 2;
//        emp.setSalary(salary);
//        return "show-emp-details";
//    }

//    @RequestMapping("/showEmployee")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("name", empName);
//        model.addAttribute("description", "java developer");
//        return "show-emp-details";
//    }

//    @RequestMapping("/showEmployee")
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
//        empName = "Mr " + empName;
//        model.addAttribute("name", empName);
//        model.addAttribute("description", "java developer");
//        return "show-emp-details";
//    }

}
