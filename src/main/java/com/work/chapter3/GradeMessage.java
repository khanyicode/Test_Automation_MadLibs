/*Question:
Write a Java program that prompts the user to enter their letter grade (A, B, C, D, or F). Using a switch statement, display a message based on their grade:

    "A" → "Bravo"
    "B" → "you can do better "
    "C" → "you need t improve "
    "D" → "try harder "
    "F" → "Uh oh!"
    Any other input → "Error. Invalid grade"*/

package main.java.com.work.chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        System.out.println(" Please enter your grade letter ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;


        switch(grade){
            case "A":
            message = " Bravo";
            break;

            case " B":
            message = " You can do better ";
            break;

            case " c ":
            message = " you need to work hard ";
            break;
        
            case "D":

            message = " try harder ";
            break; 


            case "F":

            message = " oh o";
            break;
            
            default :
            message = " pick a valid grade symbol";
            break;


    }

    System.out.println(message);
    }
    
}
