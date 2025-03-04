/*Question:
Write a Java program that determines if a person qualifies for a loan based on the following conditions:

    The person must have a salary of at least $30,000.
    The person must have worked at their current job for at least 2 years.

Instructions:

    Prompt the user to enter their salary.
    Prompt the user to enter the number of years they have worked at their current job.
    Use nested if statements to check if the person meets both conditions.
    Display one of the following messages based on the conditions:
        "Congrats! You qualify for the loan" if both conditions are met.
        "Sorry, you must have worked at your current job for at least 2 years." if they meet the salary requirement but not the work experience.
        "Sorry, you must earn at least $30,000 to qualify for the loan." if they do not meet the salary requirement.*/




package main.java.com.work.chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {
        System.out.println("Please enter your salary");
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter the number of years they have worked at their current job");
         scanner.close();
         double salary =   scanner.nextDouble();
         int years = scanner.nextInt();


         if (salary >= 30000) {
            if (years >= 2) {
                System.out.println("Congrats! You qualify for the loan");
            } else {
                System.out.println("Sorry, you must have worked at your current job for at least 2 years.");
            }
        } else {
            System.out.println("Sorry, you must earn at least $30,000 to qualify for the loan.");
        }
    }
}

        
    
    

