package com.banco.asincrono.tres.events;

import com.banco.asincrono.tres.model.Account;

public class AccountCreatedEventBuilder {

	public static AccountCreatedEvent build(Account account) {
		return AccountCreatedEvent.builder()
				.id(account.getId())
				.accountNumber(account.getAccountNumber())
				.userId(account.getUserId())
				.build();
	}
}
