package interview_programs;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbersStringsGeneration {
    public static void main(String[] args) {
        int length =8;
        String characters ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        // using the Random class
        Random random = new Random();
        int randomInteger= random.nextInt(10); // this bound is the number in btw which the random number should be generated.
        System.out.println("Generated RandomInteger: "+randomInteger);

        double randomDouble = random.nextDouble(); // this will have range from 0.0 to 0.1 always
        System.out.println("Generated RandomDouble: "+randomDouble);

        //Using StringBuilder class
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }
        System.out.println("Generated Random String: " + randomString);

    }
}
