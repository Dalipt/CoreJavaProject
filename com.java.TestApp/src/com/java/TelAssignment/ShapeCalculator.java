package com.java.TelAssignment;
//10.Shape with abstract methods and its implementation 
abstract class shape
{
	public abstract void areaCount(int length, int breath);
	
	public abstract void parameterCount(int length, int breath);
	
	public abstract void parameterCount(int length, int breath, int height);
	
	
}

class Rectangle extends shape
{

	public void areaCount(int length, int breath)
	{
		int area=length*breath;
		System.out.println("Area of Rectangel:"+area);
	}

	public void parameterCount(int length, int breath)
	{
		int parameter=2*(length*breath);
		System.out.println("Parameter of Rectangel is:"+ parameter);
	}

	@Override
	public void parameterCount(int length, int breath, int height) {
		// TODO Auto-generated method stub
		
	}

}
class Triangel extends shape
{
	public void areaCount(int length, int breath) 
	{
		//In java 1/2 result as 0 
		double area=1.0/2*(length*breath);
		System.out.println("Area of Triangle:"+ area);
	}

	@Override
	public void parameterCount(int length, int breath, int height) 
	{
		int parameter=length*breath*height;
		System.out.println("Parameter of Triangal:"+ parameter);
	}
	public void parameterCount(int length, int breath) 
	{
		
	}
}

public class ShapeCalculator {

	public static void main(String[] args)
	{
		Rectangle rg= new Rectangle();
		rg.areaCount(10, 10);
		rg.parameterCount(10, 20);
		
		Triangel tg= new Triangel();
		tg.areaCount(10, 20);
		tg.parameterCount(10, 20, 30);
		

	}

}
