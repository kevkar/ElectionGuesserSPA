package com.kevin.sp.ElectionGuesserSPA.rest;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevin.sp.ElectionGuesserSPA.entity.County;
import com.kevin.sp.ElectionGuesserSPA.service.CountyService;

// takes county service and turns them into API requests
@RestController
@RequestMapping("/api")
public class CountyRC {
	
	private CountyService countyService;
	
	@Autowired
	public CountyRC(CountyService _cs)
	{
		countyService = _cs;
	}
	
	@GetMapping("/counties")
	public List<County> findAll()
	{
		return countyService.findAll();
	}
	
	@GetMapping("/random")
	public County getRandomCounty()
	{
		Random random = new Random();
		List<County> counties = countyService.findAll();
		int N = random.nextInt(counties.size()) + 1;
		
		return countyService.findById(N);
	}
	
	@GetMapping("/counties/{_id}")
	public County getCounty(@PathVariable int _id)
	{
		County county = countyService.findById(_id);
		if (county == null)
			throw new RuntimeException("Not found!!!");
		
		return county;
	}
	
	@GetMapping("/images")
	public String imager()
	{
		String res = "";
		for (County c : countyService.findAll())
			res += c.getImageURL() + "\n";
		
		return res;
	}
	
	
	
	
	
}
