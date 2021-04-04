package com.kevin.sp.ElectionGuesserSPA.service;

import java.util.List;

import com.kevin.sp.ElectionGuesserSPA.entity.County;

public interface CountyService {
	
	public List<County> findAll();
	
	public County findById(int _id);
	
	public County getRandomCounty();
	
}
