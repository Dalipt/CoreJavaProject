package com.java.TelAssignment;
//15.use of HashMap for Students details and various method implementations.
import java.util.*;

class Students
{
	private int id;
	private String name;
	private int age;
	private String grade;
	public Students(int id, String name, int age, String grade) 
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
}


public class StudentDetailsUsingHashMap 
{
	private HashMap<Integer,Students>studentsMap;
	
	public StudentDetailsUsingHashMap()
	{
		studentsMap= new HashMap<>();
	}
	 public void addStudents(int id, String name, int age, String grade) 
	 {
	        studentsMap.put(id, new Students(age, name, age, grade));
	        System.out.println("Student added: " + studentsMap.get(id));
	    }

	    public void displayStudent(int id) {
	        Students student = studentsMap.get(id);
	        if (student != null) {
	            System.out.println("Students ID: " + id + ", " + student);
	        } else {
	            System.out.println("Student not found with ID: " + id);
	        }
	    }

	    public void updateStudents(int id, String name, int age, String grade) {
	        Students student = studentsMap.get(id);
	        if (student != null) {
	            student.setName(name);
	            student.setAge(age);
	            student.setGrade(grade);
	            System.out.println("Student updated: " + student);
	        } else {
	            System.out.println("Student not found with ID: " + id);
	        }
	    }

	    public void removeStudent(int id) {
	        Students removedStudent = studentsMap.remove(id);
	        if (removedStudent != null) {
	            System.out.println("Student removed: " + removedStudent);
	        } else {
	            System.out.println("Student not found with ID: " + id);
	        }
	    }

	public static void main(String[] args) 
	{
		
		StudentDetailsUsingHashMap records = new StudentDetailsUsingHashMap();
	        records.addStudents(1, "Jayaprashad", 20, "A");
	        records.addStudents(2, "Bhupinder", 22, "B");
	        records.displayStudent(1);
	        records.updateStudents(1, "Jayaprashad", 21, "A+");
	        records.displayStudent(1);
	        records.removeStudent(1);
	        records.displayStudent(2);
	    }
		
		
		
		/*
		Students st= new Students(1,"Raman",23,"A+");
		Students st1= new Students(2,"Shayamu",33,"A");
		Students st2= new Students(3,"Mahesh",22,"B");
		Students st3= new Students(4,"Rajesh",23,"c+");
		
		Integer id=Integer.valueOf(1);
		Integer id1=Integer.valueOf(2);
		Integer id2=Integer.valueOf(3);
		Integer id3=Integer.valueOf(4);
		//adding elements on HashMap
		HashMap<Integer, Students> hm= new HashMap<>();
		hm.put(id, st);
		hm.put(id1, st1);
		hm.put(id2, st2);
		hm.put(id3, st3);
		 // Printing all elements of a Map
		  for (Map.Entry<Integer, Students> set :
	             hm.entrySet()) 
		  {
			 
	      System.out.println(set.getKey() + " = " + set.getValue());
		  }
		//removing elements on HashMap
		  System.out.println(hm.remove(id2, st2));
		  for (Map.Entry<Integer, Students> set :
	             hm.entrySet()) 
		  {
			 
	      System.out.println(set.getKey() + " = " + set.getValue());
		  }
		  //updating elements of HashMap
		  System.out.println(hm.put(id2, st2));
			for (Map.Entry<Integer, Students> set :
	             hm.entrySet()) 
		  {
			 
	      System.out.println(set.getKey() + " = " + set.getValue());
		  }
		  */
}