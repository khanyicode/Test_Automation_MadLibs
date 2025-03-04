/*Question:
Write a Java program that prompts the user to:

    Enter a season of the year (as a string).
    Enter a whole number.
    Enter an adjective.

After collecting the inputs, the program should display a sentence in the following format:

"On a [adjective] [season] day, I drink a minimum of [number] cups of coffee."*/



package main.java.com.work.chapter2;

import java.util.Scanner;


public class MadLibs {

    public static void main(String[] args) {

        System.out.println("Enter a season of the year");

        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Enter a whole number");
        int  Number = scanner.nextInt();

        System.out.println("enter an adjective");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a" + adjective + season + "day, I drink a minimum of " + Number + " cups of coffee.");
    
    }

    }