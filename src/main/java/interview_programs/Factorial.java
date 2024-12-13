package interview_programs;

import java.util.Scanner;

public class Factorial {
    // Method to calculate factorial
    public String calculateFactorial(int n) {
        if (n < 0) {
            return "Factorial is not defined for negative numbers";
        }
        if (n == 0) {
            return "Factorial of 0 is 1";
        }

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return String.valueOf(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for finding the factorial");
        int n = sc.nextInt();

        Factorial factorialObj = new Factorial();
        String result = factorialObj.calculateFactorial(n);
        System.out.println(result);

        sc.close();
    }
}
