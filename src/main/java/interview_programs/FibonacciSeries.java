package interview_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
    // Method to generate Fibonacci series up to n terms
    public List<Integer> generateFibonacci(int n) {
        List<Integer> fibonacciList = new ArrayList<>();

        if (n <= 0) {
            return fibonacciList; // Return empty list for non-positive inputs
        }

        int n1 = 0, n2 = 1;
        fibonacciList.add(n1); // Add the first term
        if (n == 1) {
            return fibonacciList; // If n == 1, return the list with only the first term
        }

        fibonacciList.add(n2); // Add the second term
        for (int i = 2; i < n; i++) { // Generate remaining terms
            int sum = n1 + n2;
            fibonacciList.add(sum);
            n1 = n2;
            n2 = sum;
        }

        return fibonacciList;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for the Fibonacci series:");
        int n = sc.nextInt();

        FibonacciSeries fibonacciObj = new FibonacciSeries();
        List<Integer> result = fibonacciObj.generateFibonacci(n);
        System.out.println("Fibonacci series: " + result);

        sc.close();
    }
}
