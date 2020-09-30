# Spring Design Patterns

### Factory Pattern
Factory method is a creational design pattern, i.e., related to object creation. 
In Factory pattern, we create object without exposing the creation logic to client and the client use the same common interface to create new type of object.

### Builder Pattern
It is used to construct a complex object step by step and the final step will return the object. 
The process of constructing an object should be generic so that it can be used to create different representations of the same object.

### Singleton Pattern
The singleton pattern is a design pattern that restricts the instantiation of a class to one object.

### Prototype Pattern
Prototype patterns is required, when object creation is time consuming, and costly operation, so we create object with existing object itself.

### Adapter Pattern
The adapter pattern convert the interface of a class into another interface clients expect. 
Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.

### Decorator Pattern
The decorator pattern attaches additional responsibilities to an object dynamically. 
Decorators provide a flexible alternative to subclassing for extending functionality.

### Proxy Pattern
Proxy pattern is used when we need to create a wrapper to cover the main object’s complexity from the client.
* @Transactional
* @Cacheable

### Repository Pattern


### Template Pattern

* RestTemplate
* JMS
* JDBCTemplate

### MVC Pattern


### Observer Pattern
The Observer Pattern defines a one to many dependency between objects so that one object changes state, all of its dependents are notified and updated automatically.

### Command Pattern


### Mediator Pattern

* DispatcherServlet in SpringMVC

### Interpeter Pattern

* Spring Expression Language