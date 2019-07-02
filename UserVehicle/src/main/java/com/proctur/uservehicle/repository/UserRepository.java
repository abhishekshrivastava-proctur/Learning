package com.proctur.uservehicle.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.proctur.uservehicle.model.User;

public interface UserRepository extends CrudRepository<User, Integer>, Serializable{
	
}
