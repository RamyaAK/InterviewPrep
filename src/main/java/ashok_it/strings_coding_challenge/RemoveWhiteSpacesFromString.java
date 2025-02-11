package ashok_it.strings_coding_challenge;

public class RemoveWhiteSpacesFromString {
    public static void main(String[] args) {
        String str ="    Ra  m  y  a   ";

        String correctedString = str.trim();
        System.out.println(correctedString);
        correctedString =str.replaceAll(" ","");
        System.out.println(correctedString);
    }
}
