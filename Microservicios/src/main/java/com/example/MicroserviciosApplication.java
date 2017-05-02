package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.microservicios.")
@EntityScan("com.microservicios.entidades")
@EnableJpaRepositories("com.microservicios.dao")
@EnableTransactionManagement
public class MicroserviciosApplication {

	private static final Logger log = LoggerFactory.getLogger(MicroserviciosApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosApplication.class, args);
	}
}
