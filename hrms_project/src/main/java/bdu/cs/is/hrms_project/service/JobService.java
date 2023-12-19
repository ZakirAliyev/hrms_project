package bdu.cs.is.hrms_project.service;

import bdu.cs.is.hrms_project.model.Job;

import java.util.List;

public interface JobService {

    List<Job> getAllJobs();

    void create_job(Job job);

    void updateJob(Job job);

    void delete_job(Long jobId);

    Job getJobById(Long jobId);
}
