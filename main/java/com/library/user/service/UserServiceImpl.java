package com.library.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.controller.UserRepository;
import com.library.user.domain.User;
import com.library.user.domain.UserType;

@Service
@Transactional

public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	@Override
	public String registerUserDetails(User user) {
	
		userRepository.save(user);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserDetails(String fName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String fname) {
		// TODO Auto-generated method stub
		return userRepository.findByfname(fname);
	}


}
