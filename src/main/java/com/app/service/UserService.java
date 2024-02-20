package com.app.service;

import java.util.List;

import com.app.dto.UserDto;
import com.app.entity.UserEntity;

public interface UserService {
	 	void saveUser(UserDto userDto);

	    UserEntity findUserByEmail(String email);

	    List<UserDto> findAllUsers();
}
