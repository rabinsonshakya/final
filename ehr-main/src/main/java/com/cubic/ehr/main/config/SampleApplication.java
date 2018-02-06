package com.cubic.ehr.main.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
//@EnableJpaRepositories(basePackages = {"com.cubic.ehr.prescriber"})
@ImportResource({ "classpath*:SpringJPA.xml" })
//@EntityScan("com.cubic.ehr.prescriber.entity")
@ComponentScan({ "com.cubic.ehr" })
public class SampleApplication {

	public static void main(String[] args) throws Exception {
		
		SpringApplication.run(SampleApplication.class, args);
		
	}
}
