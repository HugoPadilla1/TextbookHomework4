/*
 * @class: PrimeInteger
 * @author: Hugo Padilla
 * @course: ITEC 2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 27th, 2023
 * @description: This program checks if an inputted integer is a prime number or not.
 */
package TextbookHomework4;
import java.util.Scanner;

public class PrimeInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Integer: ");
        int number = input.nextInt();
        input.close();

        boolean isPrime = true;

        if (number == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("The number " + number + " is a prime integer.");
        } else {
            System.out.println("The number " + number + " is not a prime number.");
        }
        }
    }
