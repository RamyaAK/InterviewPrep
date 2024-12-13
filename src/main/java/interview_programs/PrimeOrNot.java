package interview_programs;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean is_prime=true;

        if((n==0)||(n==1)){
            is_prime=false;
        }

        for(int i=2;i<n/2;i++){
            if(n%i==0){
                is_prime=false;
                break;
            }
        }

        if(is_prime){
            System.out.println(n+" The given number is prime number");
        }
        else System.out.println(n + " The given number is not a prime number");

    }
}
