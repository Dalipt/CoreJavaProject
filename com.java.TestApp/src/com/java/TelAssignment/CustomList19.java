package com.java.TelAssignment;
//19.Custom list with set of operations.
import java.util.*;
class Courses
{	
	String Studentname;
	String Studentsession;
	String StudentId;
	public Courses(String studentname, String studentsession, String studentId) {
		super();
		Studentname = studentname;
		Studentsession = studentsession;
		StudentId = studentId;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public String getStudentsession() {
		return Studentsession;
	}
	public void setStudentsession(String studentsession) {
		Studentsession = studentsession;
	}
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	@Override
	public String toString() {
		return "Courses [Studentname=" + Studentname + ", Studentsession=" + Studentsession + ", StudentId=" + StudentId
				+ "]";
	}
	
}

public class CustomList19 {

	public static void main(String[] args)
	{
		Courses cc= new Courses("Devidson", "2nd", "1");
		Courses cc1= new Courses("Harley", "6nd", "2");
		Courses cc2= new Courses("Hero", "4nd", "3");
		Courses cc3= new Courses("Bajaj", "5nd", "4");
		
		ArrayList<Courses> cl= new ArrayList<>();
		//Adding element on specific index
		cl.add(0, cc);
		cl.add(1, cc1);
		cl.add(2, cc2);
		cl.add(3, cc3);
		System.out.println("Total elements store in list");
		//Retrieving list of contents
		for (Courses cs : cl)
		{
            System.out.println(cs);
		}   
		System.out.println("Getting specific index from list");
		//Getting element on specific index
		System.out.println(cl.get(2));
		
		//removing element on index
		System.out.println(cl.remove(2));
		System.out.println("After removal number of elements");
		for (Courses cs : cl)
		{
            System.out.println(cs);
		}  
	}

}
