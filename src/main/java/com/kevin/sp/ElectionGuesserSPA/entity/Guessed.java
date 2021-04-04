package com.kevin.sp.ElectionGuesserSPA.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class Guessed {
	
	// return the random array of four values for 'guessed' buttons
	public static ArrayList<Integer> getRandomArray(double double_margin)
	{
		int margin = (int)(double_margin * 100);
		ArrayList<Integer> res = new ArrayList<>(getRandom1(margin));
		return res;
	}
	
	// choose randomly from three arrays 
	// a bit over-complicated - could improve
    public static TreeSet<Integer> getRandom1(int margin)
    {
        TreeSet<Integer> randomSet = new TreeSet<>();
        ArrayList<Integer> nums = new ArrayList<>();

        randomSet.add(margin);
        
        Random random = new Random();
        int randomLoop = random.nextInt(3) + 1;
        
        switch(randomLoop)
        {
        	case 1:
                for (int i = -33; i < 0; i+= 3)
                    nums.add(i);
                break;
                
        	case 2:
                for (int i = -15; i < 18; i+= 3)
                    nums.add(i);
                break;
                
        	case 3:
                for (int i = 0; i < 33; i+= 3)
                    nums.add(i);
                break;       
        }

        while (randomSet.size() < 4)
        {
            Collections.shuffle(nums);
            int added = margin + nums.get(0);
            if (added > -95 && added < 95)
                randomSet.add(added);
        }
        return randomSet;
    }

}
