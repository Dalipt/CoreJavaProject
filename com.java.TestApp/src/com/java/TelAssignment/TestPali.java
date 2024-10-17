package com.java.TelAssignment;
import java.util.Scanner;
//4.Checking Palinmdrop
import java.util.Scanner;

class Test {
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

public class TestPali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        s = s.toLowerCase();
        if (Test.isPalindrome(s))
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
        sc.close();
    }
}

