package com.banco.asincrono.dos.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	@Bean
	public Queue userCreatedLogQueue() {
		return new Queue("alfredo.usercreated.log.queue", true);
	}

	@Bean
	public Queue accountCreatedLogQueue() {
		return new Queue("alfredo.accountcreated.log.queue", true);
	}
}
