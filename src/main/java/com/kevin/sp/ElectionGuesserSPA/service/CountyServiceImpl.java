package com.kevin.sp.ElectionGuesserSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kevin.sp.ElectionGuesserSPA.dao.CountyDAO;
import com.kevin.sp.ElectionGuesserSPA.entity.County;

// make service separate from DAO for better modularity
@Service
public class CountyServiceImpl implements CountyService {
	
	private CountyDAO countyDAO;
	
	@Autowired
	public CountyServiceImpl (CountyDAO _dao)
	{
		countyDAO = _dao;
	}

	@Override
	@Transactional
	public List<County> findAll() {
		return countyDAO.findAll();
	}

	@Override
	@Transactional
	public County findById(int _id) {
		
		return countyDAO.findById(_id);
	}

	@Override
	public County getRandomCounty()
	{
		return countyDAO.getRandomCounty();
	}
	
}
