package com.kevin.sp.ElectionGuesserSPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kevin.sp.ElectionGuesserSPA.entity.County;
import com.kevin.sp.ElectionGuesserSPA.service.CountyService;

@Controller
public class ElectionController {
	
	private CountyService countyService;
	
	@Autowired
	public ElectionController(CountyService _cs)
	{
		countyService = _cs;
	}
	
	// page with my info and picture
	@GetMapping("/about")
	public String about(Model model)
	{
		return "about";
	}
	
	// shows images for every county in US - mainly for debugging but could be useful
	@GetMapping("/images")
	public String images(Model model)
	{
		
		List<County> counties = countyService.findAll();	

		model.addAttribute("counties",counties);
		
		return "images";
	}
	
	// for main SPA
	@GetMapping("/")
	public String spa(Model model)
	{		
		return "spa";
	}
}
