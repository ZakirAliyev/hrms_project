package bdu.cs.is.hrms_project.controller;

import bdu.cs.is.hrms_project.model.Employee;
import bdu.cs.is.hrms_project.model.Job;
import bdu.cs.is.hrms_project.service.JobService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class JobController {
    private final JobService jobService;

    @GetMapping("/jobs")
    public String getAllJobsHtml(Model model) {
        model.addAttribute("jobs", jobService.getAllJobs());
        return "jobs";
    }

    @GetMapping("/jobs/create_job")
    public String createJobsHtml(Model model) {
        Job job = new Job();
        model.addAttribute("job", job);
        return "create_job";
    }

    @GetMapping("/jobs/edit/{id}")
    public String editJobsHtml(@PathVariable Long id, Model model) {
        model.addAttribute("job", jobService.getJobById(id));
        return "edit_job";
    }

    @PostMapping("/jobs/{id}")
    public String edit_employee(@PathVariable Long id, @ModelAttribute("job") Job job) {
        Job excitingJob = jobService.getJobById(id);

        excitingJob.setJobId(job.getJobId());
        excitingJob.setJobName(job.getJobName());

        jobService.updateJob(excitingJob);

        return "redirect:/jobs";
    }

    @PostMapping("/jobs")
    public String createJob(@ModelAttribute("job") Job job) {
        jobService.create_job(job);
        return "redirect:/jobs";
    }

    @GetMapping("/jobs/{id}")
    public String deleteJobs(@PathVariable("id") Long id) {
        jobService.delete_job(id);
        return "redirect:/jobs";
    }
}
