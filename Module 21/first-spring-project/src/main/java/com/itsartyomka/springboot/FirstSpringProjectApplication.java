package com.itsartyomka.springboot;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@RequiredArgsConstructor
public class FirstSpringProjectApplication {

	private final UserRepository userRepository;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringProjectApplication.class, args);
//		System.out.println(context.getBean("test"));
//		System.out.println(context.getBean("test"));
//		System.out.println(context.getBean("test"));
	}

	@PostConstruct // <-- Means this code will be run after Spring, after IOC Container
	public void init(){
		User user = new User("Ilya");
		User user1 = new User("Igor");

		userRepository.save(user);
		userRepository.save(user1);

		System.out.println(userRepository.findAll());
	}

//---Example of Bean Creation---
//	@Bean
//	@Scope("prototype") // 'singleton' means that it won't create the new object every time.
//	// @Scope('prototype') // 'prototype' means it create new bean every time.
//	public int test() {
//		return new Random().nextInt();
//	}

}
