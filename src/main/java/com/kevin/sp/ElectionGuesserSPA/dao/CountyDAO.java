package com.kevin.sp.ElectionGuesserSPA.dao;

import java.util.List;

import com.kevin.sp.ElectionGuesserSPA.entity.County;

public interface CountyDAO {
	public List<County> findAll();
	
	public County findById(int _id);
	
	public County getRandomCounty();
	
}
