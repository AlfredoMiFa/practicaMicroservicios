package com.banco.asincrono.tres.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	@Bean
	public Queue userCreatedAccountQueue() {
		return new Queue("alfredo.usercreated.account.queue", true);
	}

	@Bean
	public Queue accountCreatedLogQueue() {
		return new Queue("alfredo.accountcreated.log.queue", true);
	}
}
