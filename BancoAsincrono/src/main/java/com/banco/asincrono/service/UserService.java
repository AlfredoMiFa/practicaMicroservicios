package com.banco.asincrono.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.banco.asincrono.events.UserCreatedEventBuilder;
import com.banco.asincrono.model.User;
import com.banco.asincrono.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

	// Inyecte Bean ApplicationEventPublisher publisher
	@Autowired
	private ApplicationEventPublisher publisher;

	@Autowired
	private UserRepository userRepository;

	public void createUser(User user) {

		log.info("create user service start");

		userRepository.save(user);

		log.info("publishing User Created Event");
		
		// Implemente envio de evento UserCreatedEvent
		publisher.publishEvent(UserCreatedEventBuilder.build(user));
	}
}
