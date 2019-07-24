package com.banco.asincrono.dos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.asincrono.dos.model.Account;


public interface AccountLogRepository extends JpaRepository<Account, Integer> {

}
