package com.proctur.uservehicle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proctur.uservehicle.model.User;
import com.proctur.uservehicle.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUser() {
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(user -> users.add(user));
		return users;
	}

	public void addUser(User user) {
		userRepository.save(user);		
	}

	public void deleteUser(int Id) {
		userRepository.deleteById(Id);
	}

	public void updateUser(User user, int id) {
		userRepository.save(user);	
	}

}
