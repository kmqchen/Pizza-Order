import java.util.Scanner;

import org.w3c.dom.Text;

public class AdditionTutorialProgram {
	
	public static final int TEN = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		You are asked to write a Java program which will serve as a tutorial for the addition of two whole numbers with
		at most 3-digits for primary school children. Your program is to read in two integers and show how the addition is done
		along with the carry. Assume that the numbers being added have at most 3 digits and are positive
		(so no validation of user input is required). This program is to repeat until the user says otherwise. 
		Hint: You will need to use integer division and modulo to solve this problem (% and /).
		
		Here is a recommended skeleton of the algorithm to solve this problem 
		1. Display welcome message/welcome banner 
		2. Prompt user for 2 numbers to add 
		3. 1st addition: Add the last digit of each number, extract the result of the 2-digit addition and the carry and
		show this information to the user in a clear message. 
		4. 2nd addition: Add the carry from the 1st addition to the middle digit of each number, extract the result of
		the addition of the 2 digits and the carry and show this information to the user in a clear message. 
		5. Add the carry from the 2nd addition to the 1st digit of each number and display the result in a clear message. 
		6. Finish off by showing the result of the addition 
		7. Ask the user if they want to try another addition. 
			- If yes repeat from step 2 
			- If no display a closing message
		 */
		
		/*	Steps of programming
			1.	Programming header including assignment #, written by (person) and student ID, course
			name and section
			2.	Welcome message
			3. 	Prompt user to enter 2 numbers
			4.	1st addition:
				Add the last digit of each number, extract the result of the 2-digit addition and the
				carry and show this information to the user in a clear message.
			5.	2nd addition:
				Add the carry from the 1st addition to the middle digit of each number, extract the
				result of the addition of the 2 digits and the carry and show this information to the 
				user in a clear message.
			6.	3rd addition:
				Add the carry from the 2nd addition to the 1st digit of each number and display the
				result in a clear message.
			7. 	Finish off by showing the result of the addition 
			8. 	Ask the user if they want to try another addition. 
				- If yes repeat from step 2 
				- If no display a closing message
		 */
		
		Scanner number = new Scanner(System.in);
		
		int i = 1;
		/**
		Programming header
		 */
		System.out.println("Assignment number 2");
		System.out.println("Written by: Qiao Ling Chen\nStudent ID: 0995426\nFor \"Programming Concepts I\" = Section - Summer 2021\n");
		/**
		Welcome message
		 */
		System.out.println("Welcome to Addition Tutorial Program!");
		System.out.println("-------------------------------------");
		
		while(i > 0)
		{
			/*
			Prompt user to enter 2 number
			 */
			System.out.print("\nEnter two numbers with at almost 3-digit each, separated by a space and press enter: ");
			int firstNumber = number.nextInt();
			int secondNumber = number.nextInt();
			
			int digit1 =  firstNumber % 10;
			int hundred1 = (firstNumber - ((firstNumber % 100) - (firstNumber % 10)) - firstNumber % 10) / 100;
			int ten1 = (((firstNumber % 100) - (firstNumber % 10) / 10) - digit1) / 10;
			int digit2 =  secondNumber % 10;
			int hundred2 = (secondNumber - ((secondNumber % 100) - (secondNumber % 10)) - secondNumber % 10) / 100;
			int ten2 = (((secondNumber % 100) - (secondNumber % 10) / 10) - digit2) / 10;
			
			int carryDigit = 0;
			int carryTen = 0;
			int carryHundred = 0;
			/*	1st addition:
				Add the last digit of each number, extract the result of the 2-digit addition and the
				carry and show this information to the user in a clear message.*/
			System.out.println();
			System.out.println();
			System.out.println("You requested the following operation:");
			System.out.println();
		
			System.out.printf("  num1:%15s\n", firstNumber);
			System.out.println("  num2:		 + " + secondNumber);
			System.out.println("		 ------\n");
			
			System.out.println("1st addition:");
			System.out.println("  last digit of each number");
			
			if(((digit1 + digit2) <= TEN))
				carryDigit = 0;
			else
				carryDigit = 1;
			
			System.out.println("  " + digit1 + " + " + digit2 + " = " + (digit1 + digit2) + " so answer is " + (digit1 + digit2) + " with a carry of " + carryDigit);
			/*	2nd addition:
				Add the carry from the 1st addition to the middle digit of each number, extract the
				result of the addition of the 2 digits and the carry and show this information to the
				user in a clear message.*/
			System.out.println("\n2nd addition:");
			System.out.println("  the carry from previous addition plus the middle digit of each number");
			
			if(((ten1 + ten2) <= TEN))
				carryTen = 0;
			else
				carryTen = 1;
			
			System.out.println(carryDigit + " +  " + ten1 + " + " + ten2 + " = " + (ten1 + ten2) + " so answer is " + (ten1 + ten2) + " with a carry of " + carryTen);
			/*	3rd addition:
				Add the carry from the 2nd addition to the 1st digit of each number and display the
				result in a clear message.*/
			int tenTotal = (carryDigit + ten1 + ten2) * 10;
			
			System.out.println("\n3rd addition:");
			System.out.println("  the carry from previous addition pluss the first digit of each number");
			
			System.out.println(carryTen + " +  " + hundred1 + " + " + hundred2 + " = " + (hundred1 + hundred2) + " so answer is " + (hundred1 + hundred2));
			/*
			Finish off by showing the result of the addition
			 */
			int hundredTotal = (carryTen + hundred1 + hundred2) * 100;
			
			System.out.println();
			System.out.println("Final answer:");
			System.out.printf("  num1:%15s\n", firstNumber);
			System.out.println("  num2:		 + " + secondNumber);
			System.out.println("		 ------");
			
			int total = hundredTotal + tenTotal + (digit1 + digit2);
			
			System.out.printf("  Answer:%14s", total +"\n");
			/*
			Ask the user if they want to try another addition. 
			- If yes repeat from step 2 
			- If no display a closing message
			 */
			System.out.print("\nDo you want to try another one? ");
			System.out.print("y or Y to try another one, n or N to end game ");
			String next = number.next();
			
			if(next.equals("n") || next.equals("N"))
			{
				System.out.println("Hope you are more comfortable with additions now! If not, don't hesitate to come back :-)");
				System.exit(0);
			}
			
			else
			{
				i++;
			}
		}
	}

}
