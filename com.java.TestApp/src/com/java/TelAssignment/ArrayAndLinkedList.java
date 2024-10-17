package com.java.TelAssignment;

import java.util.*;
/*18.Used ARRAYLIST And LINKEDLIST Allowed user to add, remove and retrieve element from both collections.
Compare and display the time taken for these
*/
import java.util.Scanner;

public class ArrayAndLinkedList
{
    public static void main(String[] args)
    {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation: 1. Add 2. Remove 3. Retrieve");
        int choice = scanner.nextInt();

        System.out.println("Enter the number of elements to operate on:");
        int n = scanner.nextInt();

        switch (choice) {
            case 1:
                compareAddOperation(arrayList, linkedList, n);
                break;
            case 2:
                compareRemoveOperation(arrayList, linkedList, n);
                break;
            case 3:
                compareRetrieveOperation(arrayList, linkedList, n);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static void compareAddOperation(List<Integer> arrayList, List<Integer> linkedList, int n) 
    {
        long startTime, endTime;

        // Adding elements to ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to add elements to ArrayList: " + (endTime - startTime) + " ns");

        // Adding elements to LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) 
        {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to add elements to LinkedList: " + (endTime - startTime) + " ns");
    }

    private static void compareRemoveOperation(List<Integer> arrayList, List<Integer> linkedList, int n) 
    {
        // First, populate the lists
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime, endTime;

        // Removing elements from ArrayList
        startTime = System.nanoTime();
        for (int i = n - 1; i >= 0; i--)
        {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to remove elements from ArrayList: " + (endTime - startTime) + " ns");

        // Removing elements from LinkedList
        startTime = System.nanoTime();
        for (int i = n - 1; i >= 0; i--) 
        {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to remove elements from LinkedList: " + (endTime - startTime) + " ns");
    }

    private static void compareRetrieveOperation(List<Integer> arrayList, List<Integer> linkedList, int n) 
    {
        // First, populate the lists
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime, endTime;

        // Retrieving elements from ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to retrieve elements from ArrayList: " + (endTime - startTime) + " ns");

        // Retrieving elements from LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) 
        {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to retrieve elements from LinkedList: " + (endTime - startTime) + " ns");
    }
}

