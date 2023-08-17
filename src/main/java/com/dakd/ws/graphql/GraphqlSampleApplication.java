package com.dakd.ws.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan("com.dakd.ws.graphql")
@EnableJpaAuditing
@EntityScan(basePackages = {"com.dakd.ws.graphql"})
@EnableJpaRepositories
public class GraphqlSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlSampleApplication.class, args);
	}

}
