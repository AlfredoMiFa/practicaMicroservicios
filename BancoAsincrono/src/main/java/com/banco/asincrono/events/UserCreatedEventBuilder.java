package com.banco.asincrono.events;

import com.banco.asincrono.model.User;

public class UserCreatedEventBuilder {

	public static UserCreatedEvent build(User user) {
		return UserCreatedEvent.builder()
				.id(user.getId())
				.name(user.getName())
				.email(user.getEmail())
				.build();
	}
}
