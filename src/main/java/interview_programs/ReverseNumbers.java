package interview_programs;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int num = sc.nextInt();

        // Traditional algorithm way of reversing

        int rev =0;
        while(num!=0){
            rev = rev*10 + (num%10);
            num = num/10;
        }
        System.out.println("The number after reversal is="+rev);


        // Using StringBuffer class reverse() method

        System.out.println("Enter the number to be reversed");
        int number = sc.nextInt();
        StringBuffer result;
        StringBuffer strBuff = new StringBuffer(String.valueOf(number));
        result = strBuff.reverse();
        System.out.println(result);

        // Using StringBuilder class append and reverse mthds

        System.out.println("Enter the number to be reverese");
        int n = sc.nextInt();
        StringBuilder sbl = new StringBuilder();
        sbl.append(n);
        StringBuilder res = sbl.reverse();
        System.out.println("The reversed value is="+res);

    }
}
