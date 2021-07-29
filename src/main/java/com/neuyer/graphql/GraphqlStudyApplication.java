package com.neuyer.graphql;

import com.neuyer.graphql.cars.CarRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class GraphqlStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlStudyApplication.class, args);
	}

}
