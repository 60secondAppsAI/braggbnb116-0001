package com.braggbnb116.dao;

import java.util.List;

import com.braggbnb116.dao.GenericDAO;
import com.braggbnb116.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


