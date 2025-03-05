/* Question:  
Write a Java program that prompts the user to:  

    1. Enter the number of items they would like to scan.  
    2. Use a loop to ask for the price of each item.  
    3. Calculate the total cost by summing up the prices of all items.  
    4. Display the final total cost to the user. */

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {
        
        System.out.println(" Enter the number of items they would like to scan.");
        Scanner scanner = new Scanner(System.in);
        int items = scanner.nextInt();
        
        double total = 0;

        for(int i=0; i<items; i++){

            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("Your total is $" + total);
    }

}
