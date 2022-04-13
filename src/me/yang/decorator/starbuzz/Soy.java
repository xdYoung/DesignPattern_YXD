package me.yang.decorator.starbuzz;

import java.util.ArrayList;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

//	public String getDescription() {
//		return beverage.getDescription() + ", Soy";
//	}
	public ArrayList<String> getDescription() {
		beverage.list = beverage.getDescription();
		beverage.list.add("Soy");
//		System.out.println(beverage.list);
		return beverage.list;
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
