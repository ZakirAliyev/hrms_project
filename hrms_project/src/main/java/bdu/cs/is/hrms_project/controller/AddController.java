package bdu.cs.is.hrms_project.controller;

import bdu.cs.is.hrms_project.model.Employee;
import bdu.cs.is.hrms_project.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class AddController {

    private final EmployeeService employeeService;

    @GetMapping("/employees/addemployee")
    public String addEmployeeHtml(Model model) {
        model.addAttribute("addEmployee", new Employee());
        return "/employees/addemployee";
    }

    @PostMapping("/employees/addemployee")
    public String addEmployee(@ModelAttribute("addEmployee") Employee employee) {
        employeeService.addEmployee(employee);
        return "/employees/addemployee";
    }
}
