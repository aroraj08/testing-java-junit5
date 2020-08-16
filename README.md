# Introduction to JUnit 5 with Maven

This source code repository contains JUnit 5 test examples with Maven.

## Setup
### Requirements
* Should use Java 11 or higher. Previous versions of Java are un-tested.
* Use Maven 3.5.2 or higher

#### Tags 
Tags are used to tag a test method or class. Later on, you can configure IDE/Maven/Gradle to run tests with 
a specific tag. @Tag annotation is used for this and can be applied on Class or Methods

#### Junit Test Interfaces
Junit Test classes can implement interfaces and delegate some common functionality to interface. 
One such example is @Tag annotation which can be put on interface.

#### Nested Tests
We can have Nested Junit classes. Achieved via @Nested annotation on a nested class inside Test class.

#### Junit Default Test Methods
We can have default test methods in interface for functionality required for all Junit Test classes
implementing that interface

#### Repeated Tests
Repeated Tests can be run using @RepeatedTest annotation. 

#### Junit Test Dependency Injection
Junit 5 defines a parameter resolver API to resolve parameters at runtime. There are 3 built in resolvers :
1. TestInfo - provides info about test name, method, test class, test tags
2. RepetitionInfo - Provides info about the test repetition
3. TestReporter - Allows you to publish runtime information for test reporting

#### Parameterized Test
It is an experimental feature by Junit 5. There is a separate dependency for enabling parameterized test.
Use `@ParameterizedTest` and `@ValueSource` annotation to achieve this

#### Parameterized Test with loading of params from different sources - 
1. From external csv file
2. From another method in same Test class
3. From a custom provider

#### Hamcrest and AssertJ library





