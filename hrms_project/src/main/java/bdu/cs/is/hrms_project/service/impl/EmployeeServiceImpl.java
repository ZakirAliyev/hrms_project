package bdu.cs.is.hrms_project.service.impl;

import bdu.cs.is.hrms_project.model.Employee;
import bdu.cs.is.hrms_project.repository.EmployeeRepository;
import bdu.cs.is.hrms_project.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void create_employee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void delete_employee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    @Override
    public Employee findByUsernameAndPassword(String username, String password) {
        return employeeRepository.findByUsernameAndPassword(username, password);
    }
}
