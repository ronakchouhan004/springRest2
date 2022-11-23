package com.springRest.springRest.services;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.springRest.dao.UserDao;
import com.springRest.springRest.entities.User;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	List<User> list;
	
	public UserServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new User("naruto","naruto@gmail.com","mumbai",6546854,1234567890,"naruto"));
//		list.add(new User("baruto","baruto@gmail.com","mumbai",1324548,1876543210,"baruto"));
		
		
	}
	
	
	@Override
	public List<User> getUsers() {

		return userDao.findAll();
	}


	@Override
	public User getUser(Long account_no) {
		
		return userDao.findById(account_no).get();
		
//		User u = null;
//		for(User user:list) {
//		if(user.getAccount_no()==account_no) {
//				u = user;
//				break;
//			}
//		}
//		return u;
		
	}


	@Override
	public User addUser(User user) {
//		list.add(user);
		
		return userDao.save(user);
	}

}
