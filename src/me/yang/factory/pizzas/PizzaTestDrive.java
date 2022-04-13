package me.yang.factory.pizzas;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println(pizza);

		System.out.println("**********************************************************************\n");

		pizza = store.orderPizza("veggie");
		System.out.println(pizza);
	}
}
