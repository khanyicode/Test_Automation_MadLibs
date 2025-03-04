/*Question:

Write a Java program that determines if a person qualifies for a loan based on the following conditions:

    The person must have a salary of at least $30,000.
    The person must have worked at their current job for at least 2 years.

Instructions:

    Prompt the user to enter their salary.
    Prompt the user to enter the number of years they have worked at their current job.
    Use logical operators (&&) to check if the person meets both conditions.
    Display one of the following messages based on the conditions:
        If both conditions are met, print:
        "Congrats! You qualify for the loan"
        Otherwise, print:
        "Sorry, you must earn at least $30,000 and have worked for at least 2 years to qualify for the loan."*/


        package main.java.com.work.chapter3;

        import java.util.Scanner;
        
        public class LogicalOperatorLoanQualifier {
        
            public static void main(String[] args) {
                System.out.println("Enter your salary:");
                Scanner scanner = new Scanner(System.in);
                double salary = scanner.nextDouble();  
                System.out.println("Enter the number of years you have worked for:");
                int years = scanner.nextInt();
                scanner.close();
        
                if(salary >= 30000 && years >= 2){ 
                    System.out.println("Congrats! You qualify for the loan");
                } else {
                    System.out.println("Sorry, you must earn at least $30,000 and have worked for at least 2 years to qualify for the loan.");
                }
            }
        }
        