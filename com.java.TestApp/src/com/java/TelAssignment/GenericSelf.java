package com.java.TelAssignment;
//17.Usage of wildcard or type safety in collection
class Generic<T>
{
	private T reference ;
	
	public void display()
	{
		System.out.println(reference.getClass().getName());
	}

	public Generic(T reference ) 
	{
		this.reference=reference;	
	}
	public T getreference()
	{
		return reference;
	}
}


public class GenericSelf {

	public static void main(String[] args)
	{
		Generic<Integer> gt= new Generic<>(32);
		gt.display();
		System.out.println(gt.getreference());
		
		Generic<String> g2t= new Generic<>("RameshG");
		g2t.display();
		System.out.println(g2t.getreference());

	}

}
