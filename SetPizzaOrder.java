import java.util.Scanner;
/*
 * This question extends Q1. Create a PizzaOrder class that allows up to three pizzas
 * to be saved in an order. Each pizza saved should be a Pizza object as described in Q1.
 * In addition to appropriate instance variables and constructors, add the following methods:

•	public void setNumPizzas(int numPizzas)—sets the number of pizzas in the order.
	numPizzas must be between 1 and 3.
•	public void setPizza1(Pizza pizza1)—sets the first pizza in the order.
•	public void setPizza2(Pizza pizza2)—sets the second pizza in the order.
•	public void setPizza3(Pizza pizza3)—sets the third pizza in the order.
•	public double calcTotal()—returns the total cost of the order.
•
Write a main method to test the class. The setPizza2 and setPizza3 methods will be used
only if there are two or three pizzas in the order, respectively. Sample code illustrating the
methods is shown below. Note that first three lines are incomplete.
You must complete them as part of the question.

Pizza pizza1 = // Code to create a large pizza, 1 cheese, 1 ham
Pizza pizza2 = // Code to create a medium pizza, 2 cheese, 2 pepperoni
PizzaOrder order = // Code to create an order order.setNumPizzas(2); // 2 pizzas in the order
order.setPizza1(pizza1); // Set first pizza order.setPizza2(pizza2); // Set second pizza
double total = order.calcTotal(); // Should be 18+20 = 38
 */
public class SetPizzaOrder {
	private int numberOfPizzas;
	private String size;
	private int cheeseTopping;
	private int pepperoniTopping;
	private int hamTopping;
	private int toppingCost;
	private double pizzaBaseCost;
	private double orderTotal = 0;
	/*
	 * get number of pizzas in the order
	 */
	public int getNumOfPizzas(int numPizzas)
	{
		return numPizzas;
	}
	/*
	 * sets the number of pizzas in the order.
	 */
	public void setNumPizzas(int numPizzas)
	{
		numberOfPizzas = numPizzas;
	}
	/*
	 * sets pizz1 object.
	 */
	public void setPizza1(Pizza pizza1)
	{
		orderTotal = pizza1.CalCost(pizzaBaseCost, toppingCost, cheeseTopping, pepperoniTopping, hamTopping);
	}
	/*
	 * sets pizz2 object.
	 */
	public void setPizza2(Pizza pizza2)
	{
		//pizza2.input();
		orderTotal = pizza2.CalCost(pizzaBaseCost, toppingCost, cheeseTopping, pepperoniTopping, hamTopping);
			//System.out.println("Order total: " + (orderTotal += pizza2Cost));
		
	}
	/*
	 * sets pizz3 object.
	 */
	public void setPizza3(Pizza pizza3)
	{
		//pizza3.input();
		orderTotal = pizza3.CalCost(pizzaBaseCost, toppingCost, cheeseTopping, pepperoniTopping, hamTopping);
			//System.out.println("Order total: " + (orderTotal += pizza3Cost));
		
	}
	/*
	 * calculate total
	 */
	public double calcTotal(double order, int numPizzas, double p1Cost, double p2Cost, double p3Cost)
	{
		int i;
		for(i = 0; i < numPizzas; i++)
		{
			if(numPizzas == 1)
				order = p1Cost;
		
			else if(numPizzas == 2)
				order += p1Cost + p2Cost;
			else if(numPizzas == 3)
				order += p1Cost + p2Cost + p3Cost;
		}
		
		return order;
	}
	/*
	 * calculate total.
	 */
	public void CalTotal()
	{
		System.out.println("\nOrder total: " + orderTotal);
	}
	
}
