# spring-boot-logging

## Getting Started
For logging in a spring boot application:

* Logging is built-in with many starter dependencies
* Create logger instance ``LoggerFactory.getLogger()`` 
* Uses SL4J + LogBack
* Configuration using application property values
* Configuration using XML file
* [Color-coded output](https://marketplace.eclipse.org/content/ansi-escape-console)
* Spring Boot profiles in logging ``<springProfile>``

## Built With

* 	[Gradle](https://gradle.org/) - Dependency Management
* 	[JDK](https://www.oracle.com/in/java/technologies/javase-jdk15-downloads.html) - Java Platform, Standard Edition Development Kit 
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system 


## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.demo.LoggingApplication` class from your IDE.

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing build.gradle
- Open Eclipse 
   - File -> Import -> Existing Gradle Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

## References

* [SLF4J](http://www.slf4j.org/)
* [Logging in Spring Boot](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/html/spring-boot-features.html#boot-features-logging)