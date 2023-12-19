package bdu.cs.is.hrms_project.controller;

import bdu.cs.is.hrms_project.model.Employee;
import bdu.cs.is.hrms_project.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class HrController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public String getAllUsersHtml(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employees";
    }

    @GetMapping("/employees/create_employee")
    public String createEmployeeHtml(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "create_employee";
    }

    @GetMapping("/employees/edit/{id}")
    public String editEmployeesHtml(@PathVariable Long id, Model model) {
        model.addAttribute("employee", employeeService.getEmployeeById(id));
        return "edit_employee";
    }

    @PostMapping("/employees/{id}")
    public String edit_employee(@PathVariable Long id, @ModelAttribute("employee") Employee employee) {
        Employee excitingEmployee = employeeService.getEmployeeById(id);

        excitingEmployee.setEmployeeId(employee.getEmployeeId());
        excitingEmployee.setFirstName(employee.getFirstName());
        excitingEmployee.setLastName(employee.getLastName());
        excitingEmployee.setBirthday(employee.getBirthday());
        excitingEmployee.setGender(employee.getGender());
        excitingEmployee.setEmployeeJob(employee.getEmployeeJob());
        excitingEmployee.setUsername(employee.getPassword());
        excitingEmployee.setPassword(employee.getPassword());

        employeeService.updateEmployee(excitingEmployee);

        return "redirect:/employees";
    }

    @PostMapping("/employees")
    public String createEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.create_employee(employee);
        return "redirect:/employees";
    }

    @GetMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable("id") Long id) {
        employeeService.delete_employee(id);
        return "redirect:/employees";
    }
}
