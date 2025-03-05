/* Question:  
Write a Java program that prompts the user to:  

    1. Enter the number of hours worked for the week.  
    2. Validate that the entered hours are between 1 and 40 (inclusive).  
    3. If the input is invalid, prompt the user to enter a valid number again.  
    4. Calculate the employee's gross pay based on an hourly rate of $15.  
    5. Display the gross pay to the user. */

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {

          int hourrate= 15;

          int maximumhours = 40;


        System.out.println("Enter the number of hours worked for the week. ");
        Scanner scanner = new Scanner(System.in);
        double employeeanswer = scanner.nextDouble();

        while( employeeanswer > maximumhours){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.\"");
            double hoursworked = scanner.nextDouble();
        }

        scanner.close();

        double gross = employeeanswer * hourrate;

        System.out.println(" you worked "+ gross);

       
    }


    
}
