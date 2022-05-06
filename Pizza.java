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
double total = order.calcTotal(); // Should be 18+20 = 38*/

public class Pizza {
	private String pizzaSize;
	private String smallPizza;
	private String mediumPizza;
	private String largePizza;
	private int cheeseTopping;
	private int pepperoniTopping;
	private int hamTopping;
	private int smallPrice;
	private int mediumPrice;
	private int largePrice;
	private int toppingPrice;
	private double pizzaCost;
	/*
	 * no-argument constructor to set instance variables
	 */
	public Pizza()
	{
		pizzaSize = "";
		smallPizza = "";
		mediumPizza = "";
		largePizza = "";
		cheeseTopping = 0;
		pepperoniTopping = 0;
		hamTopping = 0;
		smallPrice = 0;
		mediumPrice = 0;
		largePrice = 0;
		toppingPrice = 0;
	}
	/*
	 * constructor to set instance variables
	 */
	public Pizza(String size, int cheese, int pepperoni, int ham)
	{
		pizzaSize = size;
		cheeseTopping = cheese;
		pepperoniTopping = pepperoni;
		hamTopping = ham;
	}
	/*
	 * mutator: set pizza size
	 */
	private String setPizzaSize(String size)
	{
		return size;
	}
	/*
	 * mutator: set number of cheese topping
	 */
	private int setCheeseTopping(int cheese)
	{
		return cheese;
	}
	/*
	 * mutator: set number of pepperoni topping
	 */
	private int setPepperoniTopping(int pepperoni)
	{
		return pepperoni;
	}
	/*
	 * mutator: set number of ham topping
	 */
	private int setHamTopping(int ham)
	{
		return ham;
	}
	/*
	 * mutator: set pizza size: small
	 */
	private String setSmallPizza(String small)
	{
		return small = "Small";
	}
	/*
	 * mutator: set pizza size: medium
	 */
	private String setMediumPizza(String medium)
	{
		return medium = "Medium";
	}
	/*
	 * mutator: set pizza size: large
	 */
	private String setLargePizza(String large)
	{
		return large = "Large";
	}
	/*
	 * mutator: set topping cost
	 */
	private int setTopping(int topping)
	{
		return topping = 2;
	}
	/*
	 * mutator: set pizza cost in size small
	 */
	private int setSmallPizzaPrice(int small)
	{
		return small = 10;
	}
	/*
	 * mutator: set pizza cost in size medium
	 */
	private int setMediumPizzaPrice(int medium)
	{
		return medium = 12;
	}
	/*
	 * mutator: set pizza cost in size large
	 */
	private int setLargePizzaPrice(int large)
	{
		return large = 14;
	}
	public void setPizza(String size, int cheese, int pepperoni, int ham)
	{
		System.out.println("Pizza order:\n\nSize " + size + "\nCheese: " + cheese + "\nPepperoni: " +  pepperoni + "\nHam: " + ham);
	}
	/*
	 * pizza cost calculation based on costs in different sizes, and, different types and numbers
	 * of topping
	 */
	public double CalCost(double base, int topping, int cheese, int pepperoni, int ham)
	{
		if(setPizzaSize(pizzaSize).equalsIgnoreCase(setSmallPizza(smallPizza)))
		{
			base = (double)setSmallPizzaPrice(smallPrice);
		}
		else if(setPizzaSize(pizzaSize).equalsIgnoreCase(setMediumPizza(mediumPizza)))
		{
			base = (double)setMediumPizzaPrice(mediumPrice);
		}
		else if(setPizzaSize(pizzaSize).equalsIgnoreCase(setLargePizza(largePizza)))
		{
			base = (double)setLargePizzaPrice(largePrice);
		}
		return base + topping * (cheese + pepperoni + ham);
	}
	public void CalCost()
	{
		if(setPizzaSize(pizzaSize).equalsIgnoreCase(setSmallPizza(smallPizza)))
		{
			pizzaCost = (double)setSmallPizzaPrice(smallPrice) + setTopping(toppingPrice) * setCheeseTopping(cheeseTopping) + setTopping(toppingPrice) * setPepperoniTopping(pepperoniTopping) + setTopping(toppingPrice) * setHamTopping(hamTopping);
			System.out.println("\nPizza costs: $" + pizzaCost + "\nPizza: " + pizzaSize + "\nCheese topping: " + cheeseTopping + "\nPepperoni topping: " + pepperoniTopping + "\nHam topping: " + hamTopping);
		}
		else if(setPizzaSize(pizzaSize).equalsIgnoreCase(setMediumPizza(mediumPizza)))
		{
			pizzaCost = (double)setMediumPizzaPrice(mediumPrice) + setTopping(toppingPrice) * setCheeseTopping(cheeseTopping) + setTopping(toppingPrice) * setPepperoniTopping(pepperoniTopping) + setTopping(toppingPrice) * setHamTopping(hamTopping);
			System.out.println("\nPizza costs: $" + pizzaCost + "\nPizza: " + pizzaSize + "\nCheese topping: " + cheeseTopping + "\nPepperoni topping: " + pepperoniTopping + "\nHam topping: " + hamTopping);
		}
		else if(setPizzaSize(pizzaSize).equalsIgnoreCase(setLargePizza(largePizza)))
		{
			pizzaCost = (double)setLargePizzaPrice(largePrice) + setTopping(toppingPrice) * setCheeseTopping(cheeseTopping) + setTopping(toppingPrice) * setPepperoniTopping(pepperoniTopping) + setTopping(toppingPrice) * setHamTopping(hamTopping);
			System.out.println("\nPizza costs: $" + pizzaCost + "\nPizza: " + pizzaSize + "\nCheese topping: " + cheeseTopping + "\nPepperoni topping: " + pepperoniTopping + "\nHam topping: " + hamTopping);
		}
	//	else
			//System.out.println("\nPizza cost doesn't exist.");
	}
	/*
	 * pizza cost output format
	 */
	public String toString()
	{
		//System.out.println("\nPizza costs: $" + calcCost() + "\nCheese topping: " + cheeseTopping + "\nPepperoni topping: " + "\nHam topping: " + hamTopping);
		return "\nPizza costs: $" + pizzaCost + "Pizza: " + pizzaSize + "\nCheese topping: " + cheeseTopping + "\nPepperoni topping: " + "\nHam topping: " + hamTopping;
	}
}
