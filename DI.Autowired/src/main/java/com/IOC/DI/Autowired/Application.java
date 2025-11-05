package com.IOC.DI.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.IOC.DI.Customer1;
import com.IOC.DI.Customer2;
import com.IOC.DI.Customer3;
import com.IOC.DI.DiApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(Application.class, args);
		
		Customer1 c1=var.getBean(Customer1.class);
		Customer2 c2=var.getBean(Customer2.class);
		Customer3 c3=var.getBean(Customer3.class);
		c1.show();
		c2.show();
		c3.show();
	}

}
