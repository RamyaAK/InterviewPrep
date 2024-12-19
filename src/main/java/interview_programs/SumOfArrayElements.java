package interview_programs;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr ={2,3,1,4,5}; //15
        int sum =0;
        for(int i=0;i<=arr.length-1;i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum of Array elements is = "+sum);
    }
}
