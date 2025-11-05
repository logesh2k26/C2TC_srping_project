package com.tnsif.di_qualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiQualifierApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(DiQualifierApplication.class, args);
		Customer c = var.getBean(Customer.class);
		c.order();
	}

}
