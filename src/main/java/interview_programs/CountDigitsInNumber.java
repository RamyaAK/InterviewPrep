package interview_programs;
import java.util.Scanner;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        // This program is to count the number of digits in a given number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number with multiple digits\n");
        int number = sc.nextInt();
        int count=0;
        while(number!=0){
           number = number/10;
           count = count + 1;
        }
        System.out.println("Total number of digits in the given number is = "+count);
        sc.close();
    }
}
