module jug.istanbul.javamodulespringbootexample {
    requires jug.istanbul.slugifier;

    //once you go module, you never go back !
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.web;
    requires spring.core;

    requires java.sql;

    // spring's gonna spring (enable reflection)
    opens jug.istanbul.javamodulespringbootexample;
    opens jug.istanbul.javamodulespringbootexample.controller;
}