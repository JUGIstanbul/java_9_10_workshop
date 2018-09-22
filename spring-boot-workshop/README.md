# Java Modules with Spring Boot and Maven

This is a simple example on how to use Java Jigsaw modules with Spring Boot and Maven. 

The confusion in general is Java Jigsaw *seems to attempt* to replace beloved build tool friends like Maven or Gradle
 (or Ant, if you're "that" retro). Well, the idea is not replacing build tools.
 
Believe or not, the main idea is to secure and isolate your library's and/or application's inner functionality by 
not exposing everything in the JAR file, but only the ones you choose to expose (either by instance creation, and/or by 
reflection).

Well, the bad news is; once you go module, you don't go back. You'll need to declare the dependencies of your code in the 
infamous `module-info.java` file, too. This forces us to try-and-error run the libraries we use and see if their 
dependencies are set correctly. In case of a plain Spring Boot Web app, I had to add:

```    
       requires spring.boot;
       requires spring.boot.autoconfigure;
       requires spring.context;
       requires spring.web;
       requires spring.core;
   
       requires java.sql;
```

Well, it does not end here - so you know Spring uses reflection to check for your spring beans, right? And that needs to 
be explicitly declared; as in below:

```    
       opens jug.istanbul.javamodulespringbootexample;
       opens jug.istanbul.javamodulespringbootexample.controller;
```

## So, what does maven do?

Simple, it just gathers the compile and runtime dependencies, the rest is up to the configuration - in spring's case; 
spring's maven build tool creates a fatjar which includes all the classes and such, and in case of Java 9 or later, 
with each module, the `module-info.java` file is included, which in turn regulates runtime behavior of the libraries.

Maven brings the libraries together and builds them the way you want it. JVM processes `module-info.java` files (if 
any exist in a JAR) and resolves runtime dependencies and restrictions. If a JAR does not hava a `module-info.java` then 
the whole JAR is assumed to be a bloody ever-forgiving module - it has simply no isolation.

Be sure to check out the documentation at [OpenJDK WebSite](http://openjdk.java.net/projects/jigsaw/spec/sotms/).
