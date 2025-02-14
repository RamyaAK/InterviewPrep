package interview_programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,2,3,4,5,1,3,5,8,2,1,3};
        //to find duplicate number in an array with its count

        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        //If it is not unique then it will be added into the hashset unique or else it will be added to the hashset duplicate.

        for (int i =0;i< arr.length;i++){
            if(!unique.add(arr[i])){
              duplicate.add(arr[i]);
            }
        }
        if(duplicate.isEmpty()){
            System.out.println("No duplicate elements are found in an array");
        }
        else{
            System.out.println(duplicate);
        }


    }
}
