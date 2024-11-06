package com.braggbnb116.dao;

import java.util.List;

import com.braggbnb116.dao.GenericDAO;
import com.braggbnb116.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


