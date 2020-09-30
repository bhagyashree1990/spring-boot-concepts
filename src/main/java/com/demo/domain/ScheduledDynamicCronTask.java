package com.demo.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.demo.config.DynamicCronConfiguration;

@Component
public class ScheduledDynamicCronTask {

	private final Logger logger=LoggerFactory.getLogger(ScheduledDynamicCronTask.class);
	
	@Scheduled(cron = "#{@"+DynamicCronConfiguration.BEAN_WEEKLY_REPORT+"}")
	public void runTask1() {
		logger.info("DYNAMIC TASK1");
	}
	
	@Scheduled(cron = "#{@"+DynamicCronConfiguration.BEAN_DAILY_REPORT+"}")
	public void runTask2() {
		logger.info("DYNAMIC TASK2");
	}

}
