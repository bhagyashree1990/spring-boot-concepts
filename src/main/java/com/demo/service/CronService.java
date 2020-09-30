package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.domain.Cron;
import com.demo.repository.CronRepository;

@Service
public class CronService {
	
	private CronRepository cronRepository;
	
	public CronService(CronRepository cronRepository) {
		super();
		this.cronRepository = cronRepository;
	}

	/**
	 * Get cron expression by KEY
	 * If KEY does not exist then default expression is returned
	 * @param key
	 * @return
	 */
	public String getCronByKey(String key) {
		Cron cron =	cronRepository.findByCronKey(key).orElse(null);
		return cron != null ? cron.getCronValue() :	"0 15 0 * * ?";
	}
}
