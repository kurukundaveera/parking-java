package com.hcl.parking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.parking.dto.LoginDetailsDto;
import com.hcl.parking.dto.LoginDto;
import com.hcl.parking.dto.UserDetailsDto;
import com.hcl.parking.dto.UserDto;
import com.hcl.parking.service.UserService;


@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@PostMapping("/registration")
	public ResponseEntity<UserDetailsDto> register(@RequestBody UserDto userDto) {
		LOGGER.debug("PurchasePolicyController optPolicy()");
		UserDetailsDto userDetailsDto =userService.register(userDto);
		return new ResponseEntity<>(userDetailsDto,HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<LoginDetailsDto> login(@RequestBody LoginDto loginDto) {
		LOGGER.debug("PurchasePolicyController login()");
		LoginDetailsDto loginDetailsDto =userService.login(loginDto);
		return new ResponseEntity<>(loginDetailsDto,HttpStatus.OK);
	}
}
