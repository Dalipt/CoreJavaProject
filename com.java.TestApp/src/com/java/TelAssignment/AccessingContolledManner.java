package com.java.TelAssignment;
//8.Accessing attribute from Person in control manner
class Person
{
	private String name;
	private int age;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
}
public class AccessingContolledManner {

	public static void main(String[] args)
	{
		Person p= new Person();
		p.setAge(19);
		p.setId(1);
		p.setName("Rajesh");
		p.getAge();
		p.getId();
		p.getName();
		System.out.println("Data Setted and Getting is: "+p);
		
		Person p1= new Person();
		p1.setAge(29);
		p1.setId(2);
		p1.setName("Ramu");
		p1.getAge();
		p1.getId();
		p1.getName();
		System.out.println("Data Setted and Getting is: "+p1);
	}

}
