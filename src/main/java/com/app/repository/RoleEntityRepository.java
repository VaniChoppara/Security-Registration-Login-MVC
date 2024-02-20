package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.RoleEntity;

public interface RoleEntityRepository extends JpaRepository<RoleEntity, Long>{
	RoleEntity findByName(String name);
}
