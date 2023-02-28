/*
 * @class: GradeCalculator
 * @author: Hugo Padilla
 * @course: ITEC 2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 27th, 2023
 * @description: This program will add together a students grades, and give them an average.
 */
package TextbookHomework4;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int gradesCount = 0;
        double gradeSum = 0;
        boolean halt = false;

        while (!halt) {
            System.out.println("Enter a grade, and or type 'stop' to stop: ");
            String gradeString = input.next();

            if (gradeString.equals("stop")) {
                halt = true;
            } else {
                double grade = Double.parseDouble(gradeString);
                gradesCount++;
                gradeSum += grade;
            }
        }
    if (gradesCount > 0) {
        double averageGrade = gradeSum / gradesCount;
        System.out.println("The average grade of inputted grades is " + averageGrade + ".");
    } else {
        System.out.println("There are no grades to average.");
    }
    input.close();
    }
}
