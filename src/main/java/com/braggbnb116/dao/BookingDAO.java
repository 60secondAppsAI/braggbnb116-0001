package com.braggbnb116.dao;

import java.util.List;

import com.braggbnb116.dao.GenericDAO;
import com.braggbnb116.domain.Booking;





public interface BookingDAO extends GenericDAO<Booking, Integer> {
  
	List<Booking> findAll();
	






}


