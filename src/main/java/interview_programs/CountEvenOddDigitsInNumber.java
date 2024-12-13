package interview_programs;

import java.util.Scanner;

public class CountEvenOddDigitsInNumber {
    // Method to count even and odd digits
    public int[] countEvenOddDigits(int number) {
        int evenCount = 0;
        int oddCount = 0;
        if(number ==0){
            return new int[] {1, 0};
        }

        // Handle negative numbers
        number = Math.abs(number); // Convert to positive if number is negative

        while (number != 0) {
            int digit = number % 10; // Extract the last digit

            if (digit % 2 == 0) { // Check if the digit is even
                evenCount++;
            } else {
                oddCount++;
            }

            number /= 10; // Remove the last digit
        }

        return new int[] {evenCount, oddCount}; // Return an array of [evenCount, oddCount]
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        CountEvenOddDigitsInNumber counter = new CountEvenOddDigitsInNumber();
        int[] result = counter.countEvenOddDigits(number);

        System.out.println("Number of even digits: " + result[0]);
        System.out.println("Number of odd digits: " + result[1]);

        sc.close();
    }

}
