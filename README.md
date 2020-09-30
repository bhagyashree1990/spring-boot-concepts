# spring-schedulers

Use ``@EnableScheduling`` to enable support for scheduling tasks.
Use ``@Scheduled`` in Spring to configure and schedule tasks.
Follow two simple rules:
1. method should not have return type
2. method should not accept any parameters

## Scheduling Types
1. Fixed Rate
2. Fixed Delay
3. Initial Delay
4. Cron expression

## Cron Expression Format

Example: At 11:00:00am, on the 1st day, every month

|Seconds |Minutes |Hours |Day Of Month |Month |Day Of Week |
|--------|--------|------|-------------|------|------------|
|0 |0 |11 |1 |* |? |			

## Set cron values in Database

Fetch cron expressions from database 

## Overview of @Scheduled Methods

To have an overview of all scheduled jobs at runtime, spring-boot-actuator provided an endpoint, listing all scheduled methods

### Actuator

To monitor application

|  URL |  Method |
|----------|--------------|
|`http://localhost:8080/actuator/`             | GET |
|`http://localhost:8080/actuator/health`    	| GET |
|`http://localhost:8080/actuator/info`      	| GET |
|`http://localhost:8080/actuator/scheduledtasks`      	| GET |

## References

* [Expression Evaluator](https://www.freeformatter.com/cron-expression-generator-quartz.html)