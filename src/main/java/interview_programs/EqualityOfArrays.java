package interview_programs;
import java.util.Arrays;
import java.util.Scanner;

public class EqualityOfArrays {
    public static void main(String[] args) {
        int length1, length2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arr1");
        length1=sc.nextInt();
        int[] arr1 = new int[length1];
        System.out.println("Enter the array elements for arr1:");
        for(int i=0;i<=length1-1;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the length of arr2");
        length2=sc.nextInt();
        int[] arr2 = new int[length2];
        System.out.println("Enter the array elements for arr2:");
        for(int i=0;i<=length2-1;i++){
            arr2[i]=sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Checking and printing the Equality of two array elements");
        if(length1==length2){
            for(int i=0;i<=length1-1;i++){
                if((arr1[i]==arr2[i])){
                    System.out.println(arr1[i]+" and "+arr2[i]+" ");
                }
            }
            System.out.println("Array elements are equal");
        }else{
            System.out.println("The Array length is different hence not equal");
        }

    }
}
