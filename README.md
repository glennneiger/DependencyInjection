# DependencyInjection - Constructor dependency injection using Java
Constructor Dependency Injection - the dependencies are provided through a client's class constructor.
- Constructor dependency injection using java without using a third party library. 

# Advantages
* Dependency Injection decreases coupling between a class and its dependency
* Reduction of boilerplate code in the application objects, since all work to initialize or set up dependencies is handled by a provider component
* Because dependency injection doesn't require any change in code behavior it can be applied to legacy code as a refactoring. The result is clients that are more independent and that are easier to unit test in isolation using stubs or mock objects that simulate other objects not under test.
* Dependency injection allows a client to remove all knowledge of a concrete implementation that it needs to use. This helps isolate the client from the impact of design changes and defects. It promotes reusability, testability and maintainability.

# Disadvantages 
* Dependency injection can make code difficult to trace (read) because it separates behavior from construction. This means developers must refer to more files to follow how a system performs 
* Dependency injection frameworks are implemented with reflection or dynamic programming. This can hinder use of IDE automation, such as "find references", "show call hierarchy" and safe refactorings.
* Dependency injection typically requires more upfront development effort since one can not summon into being something right when and where it is needed but must ask that it be injected and then ensure that it has been injected.
* Dependency injection forces complexity to move out of classes and into the linkages between classes which might not always be desirable or easily managed.
* Dependency injection can encourage dependence on a dependency injection framework.

# To Build 
Run in the src directory
```javac *.java ```

# to Run 
```java App```

The idea here is injecting different services for each customer. 

# Other types of dependency injection (not covered here in this example)
* setter injection 
* interface injection 


