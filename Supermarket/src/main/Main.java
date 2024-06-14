package main;

import java.util.Scanner;
import main.java.implementation.SupermarketArray;
import main.java.implementation.Supermarket;

public class Main {
    
    private final static int SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new SupermarketArray(SIZE);
        int option;
        
        do {
            System.out.println("\nList of supermarket items:");
            System.out.println("1 - Add item");
            System.out.println("2 - Print items");
            System.out.println("3 - Delete item");
            System.out.println("0 - Exit");
            System.out.print("Select one Option : ");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.print("Item: ");
                    String item = scanner.next();
                    supermarket.add(item);
                    break;
                case 2:
                    supermarket.print();
                    break;
                case 3:
                    System.out.print("Index: ");
                    int index = scanner.nextInt();
                    supermarket.delete(index);
                    break;
                case 0:
                    System.out.println("Bye");
                    break;
                default:
                    System.err.println("Invalid option");
                    break;
            }
        } while (option != 0);

        scanner.close();
    }
}
