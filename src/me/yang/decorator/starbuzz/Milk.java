package me.yang.decorator.starbuzz;

import java.util.ArrayList;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

//	public String getDescription(){ return beverage.getDescription() + ", Milk"; }

	public ArrayList<String> getDescription() {
		beverage.list = beverage.getDescription();
		beverage.list.add("Milk");
//		System.out.println(beverage.list);
		return beverage.list;

	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
