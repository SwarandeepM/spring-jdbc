package com.springboot.durgesh.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.durgesh.jpa.entity.User;

public interface UserRepo extends CrudRepository<User , Integer> {

}
