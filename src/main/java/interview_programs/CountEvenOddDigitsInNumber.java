package interview_programs;

import java.util.Scanner;

public class CountEvenOddDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // This programs checks how many even and how many odd digits are present in the given number.

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        // Handle negative numbers
        number = Math.abs(number); // This will convert the negative number to positive number.

        while (number != 0) {
            int digit = number % 10; //To Extract digits:The program repeatedly extracts the last digit of the number

            if (digit % 2 == 0) { // check even or odd
                evenCount++;
            } else {
                oddCount++;
            }

            number /= 10; //To Remove the last digit: The number is divided by 10
        }

        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);
        sc.close();
    }
}
