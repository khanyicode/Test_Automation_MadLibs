/*Question:
Write a Java program that determines a student's letter grade based on their test score. The program should prompt the user to enter a test score (a numeric value), then use an if-else-if structure to assign a letter grade based on the following scale:

    A: 90 and above
    B: 80 - 89
    C: 70 - 79
    D: 60 - 69
    F: Below 60

Your program should display the corresponding letter grade for the entered test score.*/

package main.java.com.work.chapter3;

import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {
        System.out.println(" enter your test score ");
        Scanner scanner = new Scanner(System.in);

        scanner.close();

        double  score = scanner.nextDouble();

        char grade;

      
 
        if(score < 60){
            grade = 'F';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if(score < 80){
            grade = 'C';
        }
        else if(score < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }
}