package com.springboot.durgesh.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.durgesh.jpa.dao.UserRepo;
import com.springboot.durgesh.jpa.entity.User;

@SpringBootApplication
public class JpaStarterProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(JpaStarterProjectApplication.class, args);
		UserRepo userRepo1= context.getBean(UserRepo.class);
		User user=new User();
		user.setAddress("Asansol");
		user.setName("abc");
		User user1=userRepo1.save(user);
		System.out.println(user1);
		
		
		
	}

}
