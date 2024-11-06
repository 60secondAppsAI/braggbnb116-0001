package com.braggbnb116.dao;

import java.util.List;

import com.braggbnb116.dao.GenericDAO;
import com.braggbnb116.domain.Host;





public interface HostDAO extends GenericDAO<Host, Integer> {
  
	List<Host> findAll();
	






}


