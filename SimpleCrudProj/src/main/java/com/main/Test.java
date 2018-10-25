package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com")
@EnableJpaRepositories("com.DaoInterface")
@EntityScan("com")
public class Test {
	public static void main(String[] args) {
		System.out.println("In main method");
		SpringApplication.run(Test.class,args);
		System.out.println("main end");
		
}
}