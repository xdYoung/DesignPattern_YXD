package me.yang.decorator.starbuzz;

import java.util.ArrayList;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract ArrayList<String> getDescription();
}
