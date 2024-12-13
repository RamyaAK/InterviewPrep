package interview_programs;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args){
        //Using String Concatenation operation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be reversed");
        String str = sc.nextLine();

        String rev = "";
        for(int i= (str.length()-1); i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("The reversed String is = " +rev);

        //Using CharArray
        String str1 = "ABCD";
        char[] arr = str1.toCharArray();
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        System.out.println("\nUsing StringBuffer class");
        //Using StringBuffer Class
        String str2 = "abcd";
        StringBuffer sb = new StringBuffer(str2);
        sb.reverse();
        System.out.println(sb);
    }
}
