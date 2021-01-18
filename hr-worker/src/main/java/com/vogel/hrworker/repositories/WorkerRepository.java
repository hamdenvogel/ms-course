package com.vogel.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vogel.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>  {

}
