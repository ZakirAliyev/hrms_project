package bdu.cs.is.hrms_project.service;

import bdu.cs.is.hrms_project.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void addEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(Long employeeId);

    Employee getEmployeeById(Long employeeId);
}
