package bdu.cs.is.hrms_project.service.impl;

import bdu.cs.is.hrms_project.model.Job;
import bdu.cs.is.hrms_project.repository.JobRepository;
import bdu.cs.is.hrms_project.service.JobService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;
    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public void create_job(Job job) {
        jobRepository.save(job);
    }

    @Override
    public void updateJob(Job job) {
        jobRepository.save(job);
    }

    @Override
    public void delete_job(Long jobId) {
        jobRepository.deleteById(jobId);
    }

    @Override
    public Job getJobById(Long jobId) {
        return jobRepository.findById(jobId).orElse(null);
    }
}
