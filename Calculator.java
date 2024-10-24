package calculatorapp;

import java.util.Scanner;

public class Calculator
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		try 
		{
			
			System.out.print("Enter the first number: ");
			double num1 = scanner.nextDouble();

			
			System.out.print("Enter an operator (+, -, *, /): ");
			char operator = scanner.next().charAt(0);

			
			System.out.print("Enter the second number: ");
			double num2 = scanner.nextDouble();

			double result = 0;

			
			switch (operator) 
			{
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if (num2 == 0) 
				{
					throw new ArithmeticException("Division by zero is not allowed.");
				}
				result = num1 / num2;
				break;
			default:
				System.out.println("Invalid operator.");
				return;
			}

			
			System.out.println("The result is: " + result);

		}
		catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		} 
		catch (Exception e)
		{
			System.out.println("An error occurred. Please enter valid inputs.");
		}
		finally {
			scanner.close();
		}
	}
}
