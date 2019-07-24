package com.banco.asincrono.dos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.asincrono.dos.model.User;


public interface UserLogRepository extends JpaRepository<User, Integer> {

}
