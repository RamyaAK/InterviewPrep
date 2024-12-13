package interview_programs;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter 3 numbers"));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b & a>c){
            System.out.println(a+" Is the Largest");
        }
        else if(b>a & b>c){
            System.out.println(b+" Is the Largest");
        }else {
            System.out.println(c+" Is the Largest");
        }
        sc.close();
    }
}
