package com.springrest.springrest;

import com.springrest.springrest.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.springrest.springrest"})
@EnableJpaRepositories(basePackages = {"com.springrest.springrest.dao"})
@EnableWebMvc
public class SpringrestApplication{


	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}


}
