package interview_programs;

import java.util.Scanner;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Convert to positive if the number is negative
        number = Math.abs(number);

        int sum = 0;

        while (number != 0) {
            sum = sum + number % 10; // Extract the last digit and add to sum
            number /= 10;       // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
        sc.close();
    }

}
