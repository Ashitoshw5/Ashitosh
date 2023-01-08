package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/saveUser")
	public ResponseEntity<List<User>> saveAllUser(@RequestBody List<User> user){
		
		List<User> user1= userService.saveUser(user);
		
		return ResponseEntity.ok().body(user1);
	}
	
	
	@GetMapping ("/get/{city}")
	public ResponseEntity<List<User>> getUserbyCity (@PathVariable ("city") String city){
		
		return ResponseEntity.ok().body(userService.getUserByCity(city));
		
	}

}
