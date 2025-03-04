/*- Question

A company pays its salespeople a base salary of $1000 per week. Salespeople who make more than 10 sales in a week receive an additional $250 bonus.
Task:

Write a Java program that:

    Prompts the user to enter the number of sales made in a week.
    Calculates the total salary based on the given conditions.
    Outputs the final salary.

Example Scenarios:

    Input: 8 sales → Output: Employee’s salary is $1000.
    Input: 12 sales → Output: Employee’s salary is $1250.


 */



package main.java.com.work.chapter3;

import java.util.Scanner;

/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {

    public static void main(String args[]){

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > quota){
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);

    }

}