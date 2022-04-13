package me.yang.decorator.pizza;

public class PizzaStore {
 
	public static void main(String args[]) {
		Pizza pizza = new ThincrustPizza();
		Pizza cheesePizza = new Cheese(pizza);
		Pizza greekPizza = new Olives(cheesePizza);

		System.out.print(greekPizza.getDescription() + " $" + " ");
		System.out.printf("%.2f", greekPizza.cost());

	}
}
