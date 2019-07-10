package com.example.flywaydemo.api;

//import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flywaydemo.domain.User;
import com.example.flywaydemo.repository.IUserRepository;


@RestController
public class UserController {

	private IUserRepository repository;
	
	UserController(IUserRepository userRepository){
		repository = userRepository;
	}
	
	@RequestMapping("/users")
	public Iterable<User> getUsers(){
		return repository.findAll();
	}
	
}
