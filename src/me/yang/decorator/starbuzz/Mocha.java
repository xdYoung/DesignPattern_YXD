package me.yang.decorator.starbuzz;

import java.util.ArrayList;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

//	public String getDescription(){ return beverage.getDescription() + ", Mocha"; }

	public ArrayList<String> getDescription() {
		beverage.list = beverage.getDescription();
		beverage.list.add("Mocha");
//		System.out.println(beverage.list);
		return beverage.list;
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
