package com.java.TelAssignment;
//20. Restaurant Implement using HashMap
import java.util.HashMap;
import java.util.Scanner;

class Resturant
{
	private String dishName;
	private double price;
	
	public String getDishName() 
	{
		return dishName;
	}
	public void setDishName(String dishName)
	{
		this.dishName = dishName;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public Resturant(String dishName, double price) 
	{
		super();
		this.dishName = dishName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Resturant [dishName=" + dishName + ", price=" + price + "]";
	}
	
}

public class ResturantMenuImplement 
{
	private HashMap<String ,Resturant> ResturantMap;
	
	public ResturantMenuImplement()
	{
		ResturantMap= new HashMap<>();
	}
	public void addDish(String name, Double price)
	{
		ResturantMap.put(name, new Resturant(name, price));
		 System.out.println("Dish : " + ResturantMap.get(name));
	}
	
	public void displayMenu(String dishName) 
	{
	        Resturant rs = ResturantMap.get(dishName);
	        if (rs != null)
	        {
	            System.out.println("Dish Name: " + dishName + ", " + rs);
	        }
	        else 
	        {
	            System.out.println("Dish not found with Name: " + dishName);
	        }
	    }
	
	public void removedish(String dishName) 
	{
		
       Resturant removedish = ResturantMap.remove(dishName);
        if (removedish != null) 
        {
            System.out.println("Dish removed: " + removedish);
        } 
        else
        {
            System.out.println("Dish not found with Name: " + removedish);
        }
	}

	public static void main(String[] args)
	{
		
		ResturantMenuImplement rmi= new ResturantMenuImplement();
		
		System.out.println("Please select from list of menu");
		
		rmi.addDish("Sahi Paneer", 200.00);
		rmi.addDish("Idali Samber",120.50);
		rmi.addDish("Breakfast meal", 320.99);
		rmi.addDish("Dinner meal", 499.99);
		
		System.out.println("Display Specific dish with name:");
		rmi.displayMenu("Breakfast meal");
		
		System.out.println("Removing Dish with Name Sahi Paneer:");
		rmi.removedish("Sahi Paneer");
		
		System.out.println("All dish left after removing one Item");
		
		for (String name : rmi.ResturantMap.keySet()) 
		{
            System.out.println("Dish Available: " + name);
        }
		
	}

}
