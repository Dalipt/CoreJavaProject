package com.java.TelAssignment;

import java.util.*;

public class ResturantWithUserInput
{
    private HashMap<String, Double> menu;

    public ResturantWithUserInput() {
        menu = new HashMap<>();
    }

    public void addDish(String name, double price) {
        menu.put(name, price);
        System.out.println("Dish added: " + name + " - " + price);
    }

    public void updatePrice(String name, double newPrice) {
        if (menu.containsKey(name)) {
            menu.put(name, newPrice);
            System.out.println("Price updated: " + name + " - " + newPrice);
        } else {
            System.out.println("Dish not found: " + name);
        }
    }

    public void displayMenu() {
        if (menu.isEmpty()) {
            System.out.println("The menu is empty.");
        } else {
            System.out.println("Restaurant Menu:");
            for (Map.Entry<String, Double> entry : menu.entrySet()) {
                System.out.println(entry.getKey() + " - $" + entry.getValue());
            }
        }
    }

    public void removeDish(String name) {
        if (menu.containsKey(name)) {
            menu.remove(name);
            System.out.println("Dish removed: " + name);
        } else {
            System.out.println("Dish not found: " + name);
        }
    }

    public static void main(String[] args) {
    	ResturantWithUserInput restaurantMenu = new ResturantWithUserInput();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu Options:");
            System.out.println("1. Add Dish");
            System.out.println("2. Update Price");
            System.out.println("3. Display Menu");
            System.out.println("4. Remove Dish");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter dish name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter dish price: ");
                    double price = scanner.nextDouble();
                    restaurantMenu.addDish(name, price);
                    break;
                case 2:
                    System.out.print("Enter dish name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    restaurantMenu.updatePrice(name, newPrice);
                    break;
                case 3:
                    restaurantMenu.displayMenu();
                    break;
                case 4:
                    System.out.print("Enter dish name: ");
                    name = scanner.nextLine();
                    restaurantMenu.removeDish(name);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

