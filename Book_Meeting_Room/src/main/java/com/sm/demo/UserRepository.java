package com.sm.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sm.demo.pojo.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}
