package com.esprit.microservies;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepository extends JpaRepository<Job , Integer> {

}
