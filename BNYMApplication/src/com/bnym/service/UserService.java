package com.bnym.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bnym.entity.UserRegistration;

@Service("userService")
public class UserService {


	private List<UserRegistration> userList = new ArrayList<>();

	public List<UserRegistration> getAllUser() {
		return userList;
	}
}
