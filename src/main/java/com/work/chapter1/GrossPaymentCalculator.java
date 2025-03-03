//Gross Pay Calculator Problem

//Write a Java program that calculates an employee's gross pay based on the number of hours worked and their hourly pay rate.
//Instructions:

   // Ask the user to enter the number of hours the employee worked.
   // Ask the user to enter the employee’s hourly pay rate.
    //Multiply the number of hours worked by the hourly pay rate to calculate the gross pay.
    //Display the employee’s gross pay in a user-friendly format.

package main.java.com.work.chapter1;

import java.util.Scanner;

public class GrossPaymentCalculator {

   public static void main(String[] args) {
    System.out.println("enter the number of hours you  worked");

    Scanner scanner= new Scanner(System.in);
    int hours = scanner.nextInt();

    System.out.println("enter the employee’s hourly pay rate.");
   double rate =  scanner.nextDouble();
   scanner.close();


    double  result =  hours * rate;
    
    System.out.println(result);
   }
    
}
