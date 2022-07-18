package com.reign.lofty.hrworker.repositories;

import com.reign.lofty.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}