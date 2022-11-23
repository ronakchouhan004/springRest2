package com.springRest.springRest.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springRest.springRest.entities.User;

public interface UserDao extends JpaRepository<User,Long> {

}
