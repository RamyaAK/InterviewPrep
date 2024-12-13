package interview_programs;

import java.util.Scanner;

public class Swapping {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to be swapped");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The numbers before swapping are a="+a+" b="+b);
        //using third variable
        int temp = a;
        a=b;
        b=temp;

        System.out.println("The numbers after swapping are a="+a+" b="+b);

        // without using third variable or temp but using add and sub operators

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("The numbers after swapping are a="+a+" b="+b);

        //without using third variable or temp but using multiplication and division operators
        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("The numbers after swapping are a="+a+" b="+b);

        //using single line statement for swapping
        b = a+b-(a=b);
        System.out.println("The numbers after swapping are a="+a+" b="+b);


    }
}
