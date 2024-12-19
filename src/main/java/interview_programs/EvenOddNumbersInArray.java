package interview_programs;

public class EvenOddNumbersInArray {
    public static void main(String[] args) {
        int[] arr ={2,3,4,8,9,10};
        int even_count =0;
        int odd_count =0;

        for(int i=0;i<=arr.length-1;i++){
            if((arr[i]%2)==0){
                even_count++;
                System.out.println("Even ="+arr[i]);
            }
            else{
                odd_count++;
                System.out.println("Odd ="+arr[i]);
            }
        }
        System.out.println("The even count is:"+even_count);
        System.out.println("The odd count is:"+odd_count);
    }
}
