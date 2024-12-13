package interview_programs;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be checked for palindrome or not");
        String original_String = sc.nextLine();
        String reveresed_String ="";
        char[] str = original_String.toLowerCase().toCharArray();
        for(int i= str.length-1; i>=0; i--){
            reveresed_String = reveresed_String+str[i];
        }
        if(original_String.equalsIgnoreCase(reveresed_String)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
