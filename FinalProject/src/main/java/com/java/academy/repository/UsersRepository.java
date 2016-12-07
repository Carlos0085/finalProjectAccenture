package com.java.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.academy.model.User;

public interface UsersRepository extends JpaRepository<User, Integer> {

}
