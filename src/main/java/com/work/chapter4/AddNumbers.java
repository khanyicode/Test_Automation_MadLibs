import java.util.Scanner;

/*- Question

Write a Java program using a **do-while loop** that repeatedly prompts the user  
to enter two numbers and calculates their sum. The program should continue this process  
until the user decides to stop.

Task:

1. Use a **do-while loop** to ensure the program runs at least once.  
2. Prompt the user to enter the first number.  
3. Prompt the user to enter the second number.  
4. Calculate and display the sum of the two numbers.  
5. Ask the user if they would like to perform another calculation.  
6. Repeat the process until the user chooses to stop.

Example Scenarios:

    Input: 4, 6 → Output: The sum is 10.
    Input: 3.5, 2.5 → Output: The sum is 6.
    User chooses to stop → Program terminates.

*/

public class AddNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            // Prompt the user for the first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Prompt the user for the second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Calculate the sum
            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);

            // Ask if the user wants to continue
            System.out.print("Would you like to start over? (true/false): ");
            again = scanner.nextBoolean();

        } while (again); // Repeat if user enters 'true'

        System.out.println("Program terminated.");
        scanner.close();
    }
}
