package interview_programs;
import java.util.Scanner;

public class CountDigitsInNumber {
    // Method to count digits in a given number
    public int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count = count + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number with multiple digits\n");
        int number = sc.nextInt();

        CountDigitsInNumber counter = new CountDigitsInNumber();
        int count = counter.countDigits(number);

        System.out.println("Total number of digits in the given number is = " + count);
        sc.close();
    }
}
