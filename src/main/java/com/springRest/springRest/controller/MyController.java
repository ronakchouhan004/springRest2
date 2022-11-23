package com.springRest.springRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.springRest.entities.User;
import com.springRest.springRest.services.UserService;

@RestController
@CrossOrigin
public class MyController {
	
	@Autowired
	private UserService  userService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
//	get all users
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return this.userService.getUsers();
	}
	
	@GetMapping("/users/{account_no}")
	public User getUser(@PathVariable String account_no){
		return this.userService.getUser(Long.parseLong(account_no));
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user){
		return this.userService.addUser(user);
	}
	
}
