package com.milkyway.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milkyway.blog.entities.User;

/*
 * An interface can extend another interface in the same way that a class can extend another class. 
 * The extends keyword is used to extend an interface, and the child interface inherits the methods of the parent interface
 */
public interface UserRepository extends JpaRepository<User, Long>{

	
}
