package com.java.TelAssignment;
//16.Using HashMap for ContractList app and do required operation as per requirements

import java.util.*;


class Users
{
	private String name;
	private int phoneNumber;
	private String email;
	
	public Users(String name,int phoneNumber, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Users [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
}

public class ContactListUsingHashMap 
{	
	private HashMap<String ,Users> UsersMap;
	
	public ContactListUsingHashMap()
	{
		UsersMap= new HashMap<>();
	}
	public void addUsers(String name, int phoneNumber, String email)
	{
		UsersMap.put(name, new Users(name,phoneNumber, email));
		 System.out.println("Users added: " + UsersMap.get(name));
	}
	
	public void displayUsers(String name) 
	{
	        Users users = UsersMap.get(name);
	        if (users != null)
	        {
	            System.out.println("Users Name: " + name + ", " + users);
	        }
	        else 
	        {
	            System.out.println("Users not found with Name: " + name);
	        }
	    }
	
	public void removeUsers(String name) 
	{
		
       Users removedUsers = UsersMap.remove(name);
        if (removedUsers != null) 
        {
            System.out.println("Users removed: " + removedUsers);
        } 
        else
        {
            System.out.println("Users not found with Name: " + name);
        }
       
    }
	
	public static void main(String[] args)
	{
		ContactListUsingHashMap csf= new ContactListUsingHashMap();
		System.out.println("All added users");
		csf.addUsers("Anil", 998877554,"Anil@gmail.com");
		csf.addUsers("Ramesh",9222754,"Ramesh@gmail.com");
		csf.addUsers("Mathur",877543354,"mathur@gmail.com");
		csf.addUsers("Abrar", 998875644,"abrar@gmail.com");
		
		System.out.println("Display Specific user with key:");
		
		csf.displayUsers("Ramesh");
		
		System.out.println("Removing user with Name as Key:");
		csf.removeUsers("Abrar");
		 
		System.out.println("All Keys after removing Users");
		
		for (String name : csf.UsersMap.keySet()) 
		{
            System.out.println("key: " + name);
        }
		System.out.println("All values left after removing Users");
		for (Users user : csf.UsersMap.values()) 
		{
            System.out.println("key: " + user);
        }
		
		
	  }
        
	}
