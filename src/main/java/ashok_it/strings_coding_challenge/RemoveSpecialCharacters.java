package ashok_it.strings_coding_challenge;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String str = "%^&*R@am^*y&a*&^";

        String replaceStr = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(replaceStr);
    }
}
