# firstAttempt-Spring-boot
Hello World Spring Boot Project using Maven

### Annotations used

__@SpringBootApplication__
This annotation gives a combining effect of three annotations: 
- @Configuration
- @EnableAutoConfiguration
- @ComponentScan

__@Configuration:__ class can be used by the Spring IoC container as a source of bean definitions (@Bean).

__@Bean:__ This Annotation tells Spring that a method annotated with @Bean will return an object that should be registered as a bean in the Spring application context.
An object is created to be readily available for dependency fulfilment. But we need a mechanism to pass this object easily.
For that we use @ComponentScan

 __@ComponentScan:__ Enables component-scanning so that the beans (or objects) created will be automatically discovered.
 
 __@EnableAutoConfiguration__: *I didn't quite get what it does exactly*. Every tutorial says that it automatically configures our project so that it is ready to run.
 It marks the class as a BootStrap class, which means you can run it as a normal Java class.
 
 ### SpringApplication.run()
 This method starts whole Spring Framework. Spring container gets started once `SpringApplication.run()` method is called.
 Refer:(http://learnspringboot.in/what-happens-when-we-call-springapplication-run-method/)
