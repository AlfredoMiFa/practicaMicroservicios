package com.banco.asincrono.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
	
	// Define bean FanoutExchange fanoutExchange
	@Bean
	public FanoutExchange fanoutExchange() {
		return new FanoutExchange("alfredo.user.create.fanout");
	}
	
	// Define bean Queue userCreatedAccountQueue
	@Bean
	public Queue userCreatedAccountQueue() {
		return new Queue("alfredo.usercreated.account.queue", true);
	}

	// Define bean Queue userCreatedLogQueue
	@Bean
	public Queue userCreatedLogQueue() {
		return new Queue("alfredo.usercreated.log.queue", true);
	}
	
	// Define Binding binding1
	@Bean
	public Binding binding1(FanoutExchange fanoutExchange,
			Queue userCreatedAccountQueue) {
		
		return BindingBuilder
				.bind(userCreatedAccountQueue)
				.to(fanoutExchange);
	}

	// Define Binding binding2
	@Bean
	public Binding binding2(FanoutExchange fanoutExchange,
			Queue userCreatedLogQueue) {
		
		return BindingBuilder
				.bind(userCreatedLogQueue)
				.to(fanoutExchange);
	}
}
