/*
 * @class: SumCalculator
 * @author: Hugo Padilla
 * @course: ITEC 2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 27th, 2023
 * @description: This program will add together an integer's digits, giving a total.
 */
package TextbookHomework4;
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any positive integer.");
        int number = input.nextInt();
        input.close();
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of the inputted integer's digits is: " + sum);
    }
}
