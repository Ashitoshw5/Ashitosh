package com.example.demo.sericeImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<User> saveUser(List<User> user) {
	
		List<User> al =userRepo.saveAll(user);
		return al;
	}

	
	
	@Override
	public List<User> getUserByCity(String city) {
		
		List<User> list = userRepo.findByCity(city);
		
		return list;
	}

}
