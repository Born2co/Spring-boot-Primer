package io.pivotal.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringBootApplication {

	@Autowired
	GreetingService greetingService;
	
    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBootApplication.class, args);
    }
    
    @RequestMapping("/")
    public String hello() {
        return String.format("%s World!", greetingService.getGreeting());
    }
}
