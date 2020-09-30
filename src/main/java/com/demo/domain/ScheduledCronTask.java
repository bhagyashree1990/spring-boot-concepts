package com.demo.domain;

import java.util.concurrent.atomic.AtomicBoolean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "scheduled.cron.enabled",havingValue = "true")
public class ScheduledCronTask {

	private final Logger log = LoggerFactory.getLogger(ScheduledCronTask.class);
	
	private AtomicBoolean atomicBoolean=new AtomicBoolean(false);
	
	//Parameterizing
	@Scheduled(cron = "${cron.expression}")
	public void runTask1(){
		if(!atomicBoolean.get()){
			atomicBoolean.set(true);
			log.info("CRON TASK1");
			atomicBoolean.set(false);
		}
	}
	
	//Every 2 minutes
	@Scheduled(cron = "0 */2 * * * ?")
	public void runTask2(){
		if(!atomicBoolean.get()){
			atomicBoolean.set(true);
			log.info("CRON TASK2");
			atomicBoolean.set(false);
		}
	}
	
	//Weekdays at noon
	@Scheduled(cron = "0 0 12 ? * MON,TUE,WED,THU,FRI")
	public void runTask3(){
		log.info("CRON TASK3");
	}
	
	//Every 10 seconds
	@Scheduled(cron = "*/10 * * * * ?")
	public void runTask4(){
		if(!atomicBoolean.get()){
			atomicBoolean.set(true);
			log.info("CRON TASK4");
			atomicBoolean.set(false);
		}
	}
	
	//At 00:15:00am every day
	@Scheduled(cron = "0 15 0 * * ?")
	public void runTask5(){
		log.info("CRON TASK5");
	}
	
	//At 11:00:00am, on the 1st day, every month
	@Scheduled(cron="0 0 11 1 * ?")
	public void runTask6() {
		
	}
}
