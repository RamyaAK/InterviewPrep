package interview_programs;

import java.util.*;

public class AnagramsOfEachOther {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashMap<String, List<String>> map = new HashMap<>();

        for (String words : arr) {
            char[] word = words.toCharArray();
            Arrays.sort(word);
            String sorted_arr_value = new String(word);
            if (!map.containsKey(sorted_arr_value)) {
                map.put(sorted_arr_value, new ArrayList<>());
            }
            map.get(sorted_arr_value).add(words);
        }
        System.out.println(map);

        for (List<String> result : map.values()) {
            System.out.println(result);

        }
    }
}
