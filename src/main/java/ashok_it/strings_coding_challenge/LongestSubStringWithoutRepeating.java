package ashok_it.strings_coding_challenge;

public class LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        String str = "Comprehensive";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            String current = "";
            for (int j = i; j < str.length(); j++) {
                if (current.contains(String.valueOf(str.charAt(j)))) {
                    break;  // Stop when a duplicate character is found
                }
                current += str.charAt(j);
                if (current.length() > longest.length()) {
                    longest = current;
                }
            }
        }
        System.out.println(longest);
    }
}
