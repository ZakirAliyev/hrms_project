package bdu.cs.is.hrms_project.service;

import bdu.cs.is.hrms_project.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void create_employee(Employee employee);

    void updateEmployee(Employee employee);

    void delete_employee(Long employeeId);

    Employee getEmployeeById(Long employeeId);

    Employee findByUsernameAndPassword(String username, String password);
}
