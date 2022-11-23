package com.springRest.springRest.services;

import java.util.List;

import com.springRest.springRest.entities.User;
public interface UserService {
public List<User> getUsers();
public User getUser(Long account_no);
public User addUser(User user);
		
	
}
