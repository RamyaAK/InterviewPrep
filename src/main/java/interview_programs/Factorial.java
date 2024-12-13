package interview_programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for finding the factorial");
        int n = sc.nextInt();
        if(n<0)
            System.out.println("Factorial is not defined for the negative numbers");
        if(n==0)
            System.out.println("Factorial of 0 is 1");

        int factorial =1;

        for(int i=1;i<=n;i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
