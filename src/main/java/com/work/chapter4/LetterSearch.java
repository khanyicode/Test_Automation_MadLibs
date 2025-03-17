
/*- Question

Write a Java program that searches a given text to determine if it contains the letter **'A'** (case insensitive).  
The program should stop searching as soon as it finds the letter.

Task:

1. Prompt the user to enter a string.  
2. Use a **for loop** to iterate through each character in the string.  
3. If the letter 'A' (uppercase or lowercase) is found, set a flag to `true` and exit the loop using `break`.  
4. Display an appropriate message indicating whether the letter 'A' was found.*/



import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {

        // Prompt user for input
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        boolean letterFound = false;

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break; // Exit loop if 'A' or 'a' is found
            }
        }

        // Output the result
        if (letterFound) {
            System.out.println("This text contains the letter 'A'.");
        } else {
            System.out.println("This text does not contain the letter 'A'.");
        }
    }
}
