package ashok_it.strings_coding_challenge;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "AABCDEESAB";

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            boolean is_unique = true;
            for (int j = 0; j < ch.length; j++) {
                if (i != j && ch[i] == ch[j]) {
                    is_unique = false;
                    break;
                }
            }
            if (is_unique) {
                System.out.println(ch[i]);
                break;
            }
        }

    }
}
