package com.suntossh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suntossh.spring.data.repositories.RentalLocationRepo;
import com.suntossh.spring.data.repositories.RentalLocationRepoImpl;


public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/application-config.xml");
		RentalLocationRepo rentalLocationRepo = applicationContext.getBean("rentalLocationRepoImpl", RentalLocationRepoImpl.class);
		System.out.println(rentalLocationRepo.getRentalLocationById(new Integer(4)));
	}
}
