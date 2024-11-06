package com.braggbnb116.dao;

import java.util.List;

import com.braggbnb116.dao.GenericDAO;
import com.braggbnb116.domain.Guest;





public interface GuestDAO extends GenericDAO<Guest, Integer> {
  
	List<Guest> findAll();
	






}


