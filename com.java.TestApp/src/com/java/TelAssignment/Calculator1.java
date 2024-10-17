package com.java.TelAssignment;
//1.Implementing Calculator taking user input and do operations
import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter first Number:");
		int input=sc.nextInt();
		System.out.println("Please enter second Number:");
		input=sc.nextInt();
		System.out.println("Please select operations:+,-,*,/");
		char operation=sc.next().charAt(0);
		switch(operation)
		{
		case '+':
			input=input+input;
			System.out.println("Addition of two number:"+ input);
			break;
		case '-':
		{
			input=input-input;
			System.out.println("Sub of two number:"+ input);
			break;
		}
		case '*':
			input=input*input;
			System.out.println("mul of two number:"+ input);
			break;
			
		case '/':
		{
			input=input/input;
			System.out.println("Division of two number:"+ input);
			break;
		}
		

	}}}
