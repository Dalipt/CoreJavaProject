package com.java.TelAssignment;
//13. Implementation of Shape interface and implementation in implemented classes
interface shapes
{
	public abstract void areaCount(int lengthside);
	
	public abstract void parameterCount(int lengthside);
	
	public abstract void parameterCount(int length, int breath, int height);
	
	
}

class Square implements shapes
{

	public void areaCount(int lengthside)
	{
		int area=lengthside*lengthside;
		System.out.println("Area of Rectangel:"+area);
	}

	public void parameterCount(int lengthside)
	{
		int parameter=4*(lengthside*lengthside);
		System.out.println("Parameter of Rectangel is:"+ parameter);
	}

	@Override
	public void parameterCount(int length, int breath, int height) {
		// TODO Auto-generated method stub
		
	}

}
class Triangels implements shapes
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

	@Override
	public void areaCount(int lengthside) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parameterCount(int lengthside) {
		// TODO Auto-generated method stub
		
	}
}

public class ShapeInterface {

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
