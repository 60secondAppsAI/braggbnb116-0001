package com.braggbnb116.dao;

import java.util.List;

import com.braggbnb116.dao.GenericDAO;
import com.braggbnb116.domain.Property;





public interface PropertyDAO extends GenericDAO<Property, Integer> {
  
	List<Property> findAll();
	






}


