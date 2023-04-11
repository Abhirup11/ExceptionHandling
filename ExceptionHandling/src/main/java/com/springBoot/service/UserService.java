package com.springBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.dto.UserRequest;
import com.springBoot.entity.User;
import com.springBoot.repository.UserRepository;

@Service
public class UserService {

	/*
	 * private int userId; private String name; private String emailId; private
	 * String mobile; private int age; private String gender; private String
	 * nationality;
	 */

	@Autowired
	private UserRepository userRepository;

	public User saveUser(UserRequest userRequest) {
		User user = User.build(0, userRequest.getName(), userRequest.getEmailId(), userRequest.getMobile(),
				userRequest.getAge(), userRequest.getGender(), userRequest.getNationality());
		return userRepository.save(user);
	}

	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	public User getUser(int id) {
		return userRepository.findByUserId(id);
	}
}
