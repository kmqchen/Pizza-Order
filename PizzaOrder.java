import java.util.Scanner;
public class PizzaOrder {
	
	private int numberOfPizzas;
	private String size;
	private static int cheeseTopping;
	private static int pepperoniTopping;
	private static int hamTopping;
	private static int topping;
	private static double baseCost;
	private static double orderTotal = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub//int pizzaNumberInOrder;
			
			SetPizzaOrder order = new SetPizzaOrder();
			//order.input();
			order.setNumPizzas(2);
			Pizza pizza1 = new Pizza();
			Pizza pizza2 = new Pizza();
			pizza1.setPizza("Large", 1, 0, 1);
			pizza2.setPizza("Medium", 2, 2, 0);
			orderTotal = pizza1.CalCost(baseCost, topping, cheeseTopping, pepperoniTopping, hamTopping) + pizza2.CalCost(baseCost, topping, cheeseTopping, pepperoniTopping, hamTopping);
	}
}