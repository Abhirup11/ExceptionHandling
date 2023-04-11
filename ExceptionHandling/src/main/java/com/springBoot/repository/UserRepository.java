package com.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserId(int id);

}
