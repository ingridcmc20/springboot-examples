package com.ingrid.miprimerspringboot.service;

import java.util.List;

import com.ingrid.miprimerspringboot.modelo.User;

public interface UserService {
	User findById(long id);
	
	User findByName(String name);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(Long id);

	List<User> findAllUsers();

	void deleteAllUsers();

	public boolean isUserExist(User user);
}
