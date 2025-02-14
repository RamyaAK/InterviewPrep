package interview_programs;

import java.util.Arrays;

public class CheckPalindromeArray {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,2,1};
        int[] a2 = new int[a1.length];

        int j=0;
        for(int i=a1.length-1;i>=0;i--){
            a2[j]=a1[i];
            j++;
        }
        if(Arrays.equals(a1,a2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}
