/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don’t, they are informed of how many sales they were short.
 */
 
 package main.java.com.work.chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {
       
        System.out.println("Input the number of sales made in a week:");

        // Create scanner object
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt(); 

        
        scanner.close();

        int quota = 10;

        if (sales >= quota) {
            System.out.println("Congrats! You did well.");
        } else {
            int salesShort = quota - sales; 
            System.out.println("You missed the quota by " + salesShort + " sales.");
        }
    }
}

