package interview_programs;

import java.util.Scanner;

public class MaxMinElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,3,2,5,0,4,-1};
        int min=arr[0], max=arr[0];
        int temp;

        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The min element from the array is "+min);
        System.out.println("The max element from the array is "+max);

        sc.close();
    }
}
