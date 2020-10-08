package com.esprit.microservies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api/jobs")
public class JobsRestAPI {

	@Autowired
    private JobsService jobsService ;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Job>> getAllJobs(){
       return new ResponseEntity<>(jobsService.getAllJobs(), HttpStatus.OK);
    }

    @GetMapping(value ="/{id}/{nom}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Job> getJob(@PathVariable(value = "id") int id,@PathVariable(value = "nom") String nom){
       return new ResponseEntity<>(jobsService.getByIdorName(id, nom), HttpStatus.OK);
    }
    
    @PutMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Job> updateJob(@PathVariable(value = "id") int id , @RequestBody Job job){
        return new ResponseEntity<>(jobsService.updateJob(id, job), HttpStatus.OK);
    }  
	
}
