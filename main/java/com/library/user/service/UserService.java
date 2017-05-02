package com.library.user.service;

import com.library.user.domain.User;

public interface UserService {
	public String registerUserDetails(User user);
	public User getUserDetails(String fName);
	public User getUser(String fname);


}
