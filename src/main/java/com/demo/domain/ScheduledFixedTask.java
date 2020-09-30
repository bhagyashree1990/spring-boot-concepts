package com.demo.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "scheduled.fixed.enabled",havingValue = "true")
public class ScheduledFixedTask {

	private final Logger logger=LoggerFactory.getLogger(ScheduledFixedTask.class);
	
	/**
	 * The fixedRate property runs the scheduled task at every n millisecond. It doesn't check for any previous executions of the task.
	 */
	@Scheduled(fixedRate = 2000)
	public void runTask1() {
		logger.info("Fixed Task1");
	}
	
	/**
	 * The fixedDelay property makes sure that there is a delay of n millisecond between the finish time of an execution of a task and the start time of the next execution of the task.
	 */
	@Scheduled(fixedDelay = 2000)
	public void runTask2() {
		logger.info("Fixed Task2");
	}
	
	/**
	 * The task will be executed the first time after the initialDelay value, and it will continue to be executed according to the fixedDelay.
	 */
	@Scheduled(fixedDelay = 2000,initialDelay = 1000)
	public void runTask3() {
		logger.info("Fixed Task3");
	}
	
	//Parameterizing
	@Scheduled(fixedRateString = "${fixedDelay.in.milliseconds}")
	public void runTask4() {
		logger.info("Fixed Task4");
	}
	
	@Scheduled(fixedDelayString = "${fixedRate.in.milliseconds}")
	public void runTask5() {
		logger.info("Fixed Task5");
	}
	
	@Scheduled(fixedDelay = 10000,initialDelayString = "${initialDelay.in.milliseconds}")
	public void runTask6() {
		logger.info("Fixed Task6");
	}
}
