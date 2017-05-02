package com.library.controller;

import org.springframework.data.repository.CrudRepository;


import com.library.user.domain.User;


public interface UserRepository extends CrudRepository<User, Integer> {
		
		public User findById(int id);
		public User save(User userdetails);
		public User findByfname(String fname);


}
