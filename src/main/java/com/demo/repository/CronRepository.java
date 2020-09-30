package com.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.domain.Cron;

@Repository
public interface CronRepository extends JpaRepository<Cron, Long>{
	Optional<Cron> findByCronKey(String cronKey);
}
