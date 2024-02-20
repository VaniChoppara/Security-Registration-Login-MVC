package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.UserEntity;

public interface UserEntityRepository  extends JpaRepository<UserEntity, Long>{
	
	UserEntity findByEmail(String email);
}
