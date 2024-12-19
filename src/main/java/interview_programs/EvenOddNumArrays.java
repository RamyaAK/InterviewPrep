package interview_programs;

public class EvenOddNumArrays {
    public static void main(String[] args) {
        int[] a={10,20,3,2,7,11,9,19,4,8};

        int[] even= new int[10];
        int[] odd= new int[10];
        int even_count=0;
        int odd_count=0;
        for(int i=0;i<a.length-1;i++){
            if((a[i]%2)==0){
                even[i]=a[i];
                even_count++;
            }else{
                odd[i]=a[i];
                odd_count++;
            }
        }
        System.out.println("Even count:"+even_count);
        System.out.println("Odd count:"+odd_count);

        System.out.println("Even Array elements");
        for(int i=0;i<even.length-1;i++) {
            if (even[i] != 0) {
                System.out.print(even[i] + "  ");
            }
        }

        System.out.println();
        System.out.println("Odd Array elements");

        for(int i=0;i<odd.length-1;i++) {
            if (odd[i] != 0) {
                System.out.print(odd[i] + "  ");
            }
        }

    }
}
