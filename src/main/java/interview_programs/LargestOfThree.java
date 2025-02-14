package interview_programs;

public class LargestOfThree {
    public static void main(String[] args) {
        int[] a = {2, 4, 1, 5, 3, 6};
        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
               if(a[i]<a[j]){
                   temp =a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
            }
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("The third largest number is = "+a[2]);
    }
}
