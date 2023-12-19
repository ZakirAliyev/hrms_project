package bdu.cs.is.hrms_project.repository;

import bdu.cs.is.hrms_project.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
