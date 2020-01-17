package com.ingrid.miprimerspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.ingrid.miprimerspringboot.modelo.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String name);

}
