package interview_programs.leetcode;

import java.util.Arrays;

public class ValidAnagrams {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        System.out.println(Arrays.equals(sArr, tArr));

    }
}
