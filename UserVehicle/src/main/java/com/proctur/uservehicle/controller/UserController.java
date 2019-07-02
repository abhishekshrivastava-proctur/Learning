package com.proctur.uservehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proctur.uservehicle.model.User;
import com.proctur.uservehicle.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping(method = RequestMethod.POST, value = "")
	public String addUser(User user) {
		userService.addUser(user);
		return "Added Sucessfully";
	}
	
	@GetMapping(value = "")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}
	
	@DeleteMapping(value = "/{Id}")
	public String deleteUser(@PathVariable int Id) {
		userService.deleteUser(Id);
		return "Deleted Sucessfully";
	}
	
	@PutMapping(value = "/{Id}")
	public String updateUser(User user,@PathVariable int id) {
		userService.updateUser(user, id);
		return "Updated Sucessfully";
	}
}
