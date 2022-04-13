package me.yang.factory.pizzas;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println(" * 开始 Preparing " + name + "...");
	}

	public void bake() {
		System.out.println(" * 开始 Baking " + name + "...");
	}

	public void cut() {
		System.out.println(" * 开始 Cutting " + name + "...");
	}

	public void box() {
		System.out.println(" * 开始 Boxing " + name + " 披萨准备完成!");
	}

	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}

