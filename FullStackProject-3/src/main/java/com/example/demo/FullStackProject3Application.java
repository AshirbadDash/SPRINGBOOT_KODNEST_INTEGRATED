package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @springBootApplication (class having @SpringBootApllication will consider as
 *                        base package)
 * 
 *                        --> annotation is used in main class (class having the
 *                        main method)
 * 
 *                        -->it does 3 works
 * 
 *                        --> @configuration 🔎 if written in any class tells
 *                        that that class will provide some configuration.
 * 
 * 
 *                        -> @configuration is used with another annotation that
 *                        is @bean
 * 
 *                        -->with bean annotation we can create bean but with
 *                        the help of function inside a class
 * 
 * 
 * 
 * 
 *                        --> @EnableAutoConfiguration 🔎 (will make the
 *                        configuration automatic) all the dependencies in
 *                        pom.xml will be auto-configured and may require some
 *                        additional things that we can provide in
 *                        application.properties
 * 
 *                        --> @ComponentScan(tells spring to scan the beans to
 *                        add it to IOC container)
 * 
 * 
 */

// 🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀//

@SpringBootApplication
public class FullStackProject3Application {

	public static void main(String[] args) {
		SpringApplication.run(FullStackProject3Application.class, args);

		/**
		 * @.............................................................
		 * 
		 * 
		 * --> we will not create object on our own object
		 * 
		 * -->creation can be externalize by using inversion of control
		 * 
		 * -->IOC is like a box {@link all the classes of our project are present here}
		 * 
		 * -->Application context is a way to achieve IOC container
		 * 
		 * -->IOC container will scan and keep the classes (only special class) which
		 * are annotated by @component (will provide information)
		 * 
		 * 
		 * @component -->class is automatically registered as spring bean
		 * 
		 * 
		 *            --> (bean object in spring is called as bean)
		 * 
		 *            -->IOC container keep only the bean whose class are
		 *            having @component annotation
		 */

		/**
		 * @RestController
		 * 
		 *                 -->acts as controller with some additional features
		 */

		/**
		 * @GetMapping
		 * 
		 *             -->API /end point is created
		 */

		/**
		 * @Autowired
		 * 
		 *            -->dependency injection
		 * 
		 *            -->written over any other object will make that a dependency to
		 *            the class
		 */

	}

}
