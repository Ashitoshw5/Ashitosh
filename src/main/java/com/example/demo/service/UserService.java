package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {
	
	//public List<User> saveUser(List<User> user);

	public List<User> saveUser(List<User> user);
	
	public List<User> getUserByCity(String city);

}
