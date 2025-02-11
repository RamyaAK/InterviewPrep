package ashok_it.strings_coding_challenge;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindCountOfEachCharInString {
    public static void main(String[] args) {
        String str = "RamyaAKulkarniRAMYASHREERam";

        char[] ch = str.toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < ch.length; i++) {
            char currentChar = ch[i];
            if (map.containsKey(currentChar)) {
                map.put(currentChar, map.get(currentChar) + 1);
            } else {
                map.put(currentChar, 1);
            }

        }
        System.out.println(map);
    }
}
