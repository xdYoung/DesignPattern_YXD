package me.yang.decorator.starbuzz;

import java.util.ArrayList;

public abstract class Beverage {
	String description = "Unknown Beverage";
	ArrayList<String> list = new ArrayList<>();
  
//	public String getDescription() {
//		return description;
//	}

	public ArrayList<String> getDescription() {
		list.add(description);
//		System.out.println(list);
		return list;
	}
 
	public abstract double cost();
}
