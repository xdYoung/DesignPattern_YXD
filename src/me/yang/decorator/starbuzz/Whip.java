package me.yang.decorator.starbuzz;

import java.util.ArrayList;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
//	public String getDescription() {
//		return beverage.getDescription() + ", Whip";
//	}

	public ArrayList<String> getDescription() {
		beverage.list = beverage.getDescription();
		beverage.list.add("Whip");
//		System.out.println(beverage.list);
		return beverage.list;
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
