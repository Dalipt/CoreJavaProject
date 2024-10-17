package com.java.TelAssignment;
//9.Employee Payroll System
import java.util.Scanner;

class Payroll
{
	public double calculatePayroll(Double payroll)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of hoursWorked:");
		int time=sc.nextInt();
		if(time!=0)
		{
			double payrol=time*1000;
			System.out.println("Total Amount for Payroll is:"+ payrol);
		}
		else 
		{
			System.out.println("No Payroll for zero hour");
		}
		double overtime=1.5*payroll;
		System.out.println("Overtime worked: "+overtime);
		return payroll;
		
	}
	public double overtime(Double payrol)
	{
		double overtime=payrol*1000*1.5; //
		System.out.println("Total amount after overtime:"+overtime);
		return overtime;
	}
}

public class EmployeePayrollSystem {

	public static void main(String[] args) 
	{
		Payroll pr= new Payroll();
		pr.calculatePayroll(10.00);
		//This method calculating payroll based on time * amount fixed for per hour
		pr.overtime(10.0);
	}

}
