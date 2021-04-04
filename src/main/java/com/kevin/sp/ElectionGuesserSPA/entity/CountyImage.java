package com.kevin.sp.ElectionGuesserSPA.entity;

public class CountyImage {
	
	//images are in form of Images/Map_of_State_highlighting_Name_County.svg.png
	public static String setImage(String name, String state)
	{
		String thePath = "Images/" + state
				+ "/Map_of_" + state.replace(' ', '_') + "_highlighting_" 
				+ name.replace(' ', '_') + ".svg.png";
		return thePath;
	}
}

