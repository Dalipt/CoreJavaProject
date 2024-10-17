package com.java.TelAssignment;
//14.Calculator with different operation and divide by zero using try catch
import java.util.Scanner;

class Calculator
{
	int a;
	int b;
	int result;
int sum()
{ 
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter first number");
	int a=sc.nextInt();
	System.out.println("Please enter Second number");
	int b=sc.nextInt();
	result=a+b;
	
	return result;	
}
int sub()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter first number");
	int a=sc.nextInt();
	System.out.println("Please enter Second number");
	int b=sc.nextInt();
	result=a-b;
	return result;	
}
int mul()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter first number");
	int a=sc.nextInt();
	System.out.println("Please enter Second number");
	int b=sc.nextInt();
	result=a*b;
	return result;	
}
int div()
{
	try
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter numeninator for division:");
	int a=sc.nextInt();
	System.out.println("Kindly enter number for Denominator for Division:");
	int b=sc.nextInt();
	result=a/b;
	} 
	catch(ArithmeticException ex)
	{
		System.out.println("Please enter non zero number of division");
	}
	return result;
}
}



public class CalculatorException {
	public static void main(String[] args) 
	{
		Calculator cl= new Calculator();
		//int res=cl.sum();
		//System.out.println("Sum of two number is "+res);
		//System.out.println(" ");
		System.out.println("Please enter if you want div");
		int result=cl.div();
		if(result!=0)
		{
		System.out.println("div of two number is:"+result);
		}
		else
		{
			System.out.println("Divide by zero is zero result");
		}
		}
}


