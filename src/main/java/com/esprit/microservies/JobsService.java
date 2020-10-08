package com.esprit.microservies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class JobsService {

	@Autowired
	private JobsRepository jobRepository;
	
	public List<Job> getAllJobs()
	{
		return jobRepository.findAll();
	}
	
	public Job getByIdorName(int id,String nom) {
		
		Example<Job> example = Example.of(new Job(id, nom));
		return jobRepository.findOne(example).get();
		
	}
	public Job updateJob(int id, Job job) {
        if(jobRepository.findById(id).isPresent()){
            Job existingJob = jobRepository.findById(id).get();
            existingJob.setEtat(job.getEtat());
           
            return jobRepository.save(existingJob);
        }
        else return null;
    }
	
}
