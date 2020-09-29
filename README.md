# spring-properties-precedence-demo
Spring Properties Precedence Demo
It is possible to have multiple property sources in a Spring Boot application. Therefore it is important to be aware of the property source that will take precedence over others. 


* @ConfigurationProperties
If we have a number of properties, we can group them together and map them to a POJO class. This will provides us with a structured and type-safe object that we can inject anywhere in our application. 

* Order of Precedence of Configuration Data
1. Profile-specific application properties outside of your packaged jar
2. Profile-specific application properties packaged inside your jar
3. Application properties outside of your packaged jar 
4. Application properties packaged inside your jar

* Application property files
SpringApplication loads properties from application.properties files in the following locations and adds them to the Spring Environment:
1. A /config subdirectory of the current directory
2. The current directory
3. A classpath /config package
4. The classpath root


## Built With

* 	[Gradle](https://gradle.org/) - Dependency Management
* 	[JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java Platform, Standard Edition Development Kit 
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system 

## External Tools Used

* [Postman](https://www.getpostman.com/) - API Development Environment (Testing Docmentation)

## To-Do

- [ ] Logger (Console, File, Mail)
- [x] RESTful Web Service (CRUD)


## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.demo.PrecedenceDemoApplication` class from your IDE.

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing build.gradle
- Open Eclipse 
   - File -> Import -> Existing Gradle Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

### Application URL

To test application

|  URL 																				|  Method |
|-----------------------------------------------------------------------------------|---------|
|`http://localhost:8080`  													| GET |


### Actuator

To monitor and manage application

|  URL |  Method |
|----------|--------------|
|`http://localhost:8080`  						| GET |
|`http://localhost:8080/actuator/`             | GET |
|`http://localhost:8080/actuator/health`    	| GET |
|`http://localhost:8080/actuator/info`      	| GET |


## Documentation

* [Swagger](http://localhost:8080/swagger-ui.html) - `http://localhost:8080/swagger-ui.html`- Documentation & Testing


## packages

- `model` - to hold our entities;
- `repository`- to communicate with the database;
- `resources/` - Contains all the static resources, templates and property files.
- `resources/static` - contains static resources such as css, js and images.
- `resources/templates` - contains server-side templates which are rendered by Spring.
- `resources/application.yml` - It contains application-wide properties. Spring reads the properties defined in this file to configure your application. You can define server's default port, server's context path, database URLs etc, in this file.
- `test/` - contains unit and integration tests
- `build.gradle` - contains all the project dependencies