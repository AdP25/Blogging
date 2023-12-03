package com.milkyway.blog.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.milkyway.blog.entities.User;
import com.milkyway.blog.exceptions.ResourceNotFoundException;
import com.milkyway.blog.payloads.UserDto;
import com.milkyway.blog.repositories.UserRepository;
import com.milkyway.blog.services.UserService;

/**
 * 
 * The implements keyword is used to implement an interface . 
 * The interface keyword is used to declare a special type of class that only contains abstract methods. 
 * To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends ).
 *
 */
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDto createUser(UserDto dto) {
		User user = dtoToUser(dto);
		User saveduser = userRepo.save(user);
		return userToDto(saveduser);
	}

	@Override
	public UserDto updateUser(UserDto dto, Long userId) {
		User user = userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId.toString()));
		
		return null;
	}

	@Override
	public UserDto getUserById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub

	}
	
	//convert DTO to User
	private User dtoToUser(UserDto dtoobj) {
		User userobj = new User();
		userobj.setId(dtoobj.getId());
		userobj.setName(dtoobj.getName());
		userobj.setEmail(dtoobj.getEmail());
		userobj.setAbout(dtoobj.getAbout());
		userobj.setPassword(dtoobj.getPassword());
		return userobj;
		
	}
	
	//convert User to DTO
	private UserDto userToDto(User userobj) {
		UserDto dtoobj = new UserDto();
		dtoobj.setId(userobj.getId());
		dtoobj.setName(userobj.getName());
		dtoobj.setEmail(userobj.getEmail());
		dtoobj.setAbout(userobj.getAbout());
		dtoobj.setPassword(userobj.getPassword());
		
		return dtoobj;
	}

}
