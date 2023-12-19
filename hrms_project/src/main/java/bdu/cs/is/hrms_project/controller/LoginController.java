package bdu.cs.is.hrms_project.controller;

import bdu.cs.is.hrms_project.model.Employee;
import bdu.cs.is.hrms_project.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class LoginController {

    private final EmployeeService employeeService;

    @PostMapping("/login/asmanager")
    public String loginAsManager(@RequestParam String username, @RequestParam String password) {
        if (username != null && password != null && username.equals("manager") && password.equals("manager")) {
            return "managers";
        } else {
            return "/error";
        }
    }
    @PostMapping("/login/ashr")
    public String loginAsHr(@RequestParam String username, @RequestParam String password) {
        if (username != null && password != null && username.equals("hr") && password.equals("hr")) {
            return "employees";
        } else {
            return "/error";
        }
    }

    @PostMapping("/login/asadmin")
    public String loginAsAdmin(@RequestParam String username, @RequestParam String password) {
        if (username != null && password != null && username.equals("admin") && password.equals("admin")) {
            return "jobs";
        } else {
            return "/error";
        }
    }

    @PostMapping("/login/asemployee")
    public String loginAsEmployee(@RequestParam String username, @RequestParam String password) {

        Employee exictEmployee = employeeService.findByUsernameAndPassword(username, password);

        if (exictEmployee != null && exictEmployee.getUsername().equals(username) && exictEmployee.getPassword().equals(password)) {
            return "employee";
        } else {
            return "/error";
        }
    }
}
