package interview_programs;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome");
        int number = sc.nextInt();

        int original_number = number;

        int rev = 0;
        while(original_number!=0){
             rev = rev*10 + original_number%10;
            original_number=original_number/10;
        }
        if(rev==number){
            System.out.println("It is a Plaindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
        sc.close();
    }
}
