package com.java.TelAssignment;
//3.Java program to calculate SimpleInterest
import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter principle amount:");
		double p=sc.nextDouble();
		
		System.out.println("Please enter Interest rate:");
		float r=sc.nextFloat();
		
		System.out.println("Please enter Time period in years:");
		int t=sc.nextInt();
		
		double si;
		si=(p*r*t)/100;
		
		System.out.println("Total Simple interest paid is:"+ si);
		
	}

}
