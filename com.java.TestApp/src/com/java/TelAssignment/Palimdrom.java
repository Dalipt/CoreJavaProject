package com.java.TelAssignment;
//4.Java Program for checking Palimdrom
import java.util.Scanner;

class Ninja {
	 
	static boolean isPalindrome(String s)
	{
		int i = 0, j = s.length() - 1;
		while (i < j) {

			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}

		return true;
	}

public class Palimdrom {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		String s = sc.next();
				s = s.toLowerCase();
				if (isPalindrome(s))
					System.out.print(s+" "+"is palindrome");
				else
				System.out.print(s+" "+"is not palindrome");
			}
		}

}
