package ashok_it.strings_coding_challenge;

public class WordReversal {
    public static void main(String[] args) {
        String str = "My name is Anthony Gonsalviz";

        String[] newString = str.split(" ");
        System.out.println("Reversed order String :");
        for(int i=newString.length-1;i>=0;i--){
            System.out.print(newString[i]);
        }
        System.out.println();
        System.out.println();
        //Reverse each letter inside the word with reverse order
        System.out.println("Reverse each letter inside the word with reverse order");
        String str1 = "My name is Anthony Gonsalviz";
        char[] reverseStr = str1.toCharArray();

        for(int i=str1.length()-1;i>=0;i--){
            System.out.print(reverseStr[i]);
        }
        System.out.println();
        System.out.println();

        // Reverse each word's characters while keeping the word order
        System.out.println("Reversed each word but same order:");
        String[] words = str.split(" ");
        for (String word : words) {
            for (int j = word.length() - 1; j >= 0; j--) {
                System.out.print(word.charAt(j));
            }
            System.out.print(" "); // Add space after each reversed word
        }
        System.out.println();
    }
}
