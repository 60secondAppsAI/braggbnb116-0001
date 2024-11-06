package com.braggbnb116.dao;

import java.util.List;

import com.braggbnb116.dao.GenericDAO;
import com.braggbnb116.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


