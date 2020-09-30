package com.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.service.CronService;

@Configuration
public class DynamicCronConfiguration {
	public static final String BEAN_WEEKLY_REPORT="weeklyReport";
	public static final String BEAN_DAILY_REPORT="dailyReport";
	
	@Autowired
	private CronService cronService;
	
	@Bean(name = BEAN_WEEKLY_REPORT)
	public String getWeeklyReport() {
		return cronService.getCronByKey("cron.report.weekly");
	}
	
	@Bean(name = BEAN_DAILY_REPORT)
	public String getDailyReport() {
		return cronService.getCronByKey("cron.report.daily");
	}
}
