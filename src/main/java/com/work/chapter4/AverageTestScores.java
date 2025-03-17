/*- Question

Write a Java program that calculates the average test scores for multiple students  
using **nested loops**. The outer loop should iterate through each student,  
and the inner loop should process the test scores for that student.

Task:

1. Assume there are **24 students** and each student takes **4 tests**.  
2. Use a **nested loop**:
   - The outer loop should iterate over all students.  
   - The inner loop should prompt for and collect each student's test scores.  
3. Calculate the average test score for each student.  
4. Display the test average for each student.*/


public class AverageTestScores{

    public static void maiin ( String[] arg);

    int students= 24;
    int test = 4;

    Scanner scanner = new Scanner(System.in);

    for(int i=0; i< students; i++){

        double total = 0;
        for(int j=0; j<test; j++){
            System.out.println("Enter the score for Test #" + (j+1));
            double score = scanner.nextDouble();
            total = total + score;
        }

        double average = total/test;
        System.out.println("The test average for student #" + (i+1) + " is " + average);
    }

    scanner.close();
}


