package bdu.cs.is.hrms_project.repository;

import bdu.cs.is.hrms_project.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByUsernameAndPassword(String username, String password);
}
