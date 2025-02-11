package ashok_it.strings_coding_challenge;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharsFromString {
    public static void main(String[] args) {
        String str ="Rammyyaaar";

        StringBuilder result = new StringBuilder();
        boolean[] is_duplicate = new boolean[256];

        char[] ch = str.toLowerCase().toCharArray();
        for(char c:ch){
                if(!is_duplicate[c]){
                    result.append(c);
                    is_duplicate[c]=true;
                }
            }
        System.out.println("String after removing duplicates is:"+result);


        //Using LinkedHashSet
        Set<Character> st = new HashSet<>();
        for(int i=0;i< ch.length;i++){
            st.add(ch[i]);
        }
        System.out.println(st);
    }
}
