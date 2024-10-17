package com.java.TelAssignment;
//2.Create Car object with different attribute with different objects
class car
{
	String maker;
	String model;
	Integer year;
	public car(String maker, String model, Integer year) {
		super();
		this.maker = maker;
		this.model = model;
		this.year = year;
	}
	public String getmaker() {
		return maker;
	}
	public void setmaker(String maker) {
		this.maker = maker;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return " CAR= [maker=" + maker + ", model=" + model + ", year=" + year + "]";
	}

}

public class Cars {

	public static void main(String[] args) 
	{
		car a= new car("Hyundai","Verna",2023);
		System.out.println(a);
		
		car b= new car("Maruti","Brezza",2024);
		System.out.println(b);
		
		car c= new car("Ford","Figo",2020);
		System.out.println(c);
		

	}

}
