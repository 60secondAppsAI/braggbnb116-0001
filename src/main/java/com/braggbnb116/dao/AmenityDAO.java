package com.braggbnb116.dao;

import java.util.List;

import com.braggbnb116.dao.GenericDAO;
import com.braggbnb116.domain.Amenity;





public interface AmenityDAO extends GenericDAO<Amenity, Integer> {
  
	List<Amenity> findAll();
	






}


