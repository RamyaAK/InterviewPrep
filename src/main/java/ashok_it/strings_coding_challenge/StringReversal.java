package ashok_it.strings_coding_challenge;

public class StringReversal {
    public static void main(String[] args) {

        String str = "Hello";
        // 1st approach using toCharArray()
        char[] ch = str.toLowerCase().toCharArray();

        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
        // 2nd approach using charAt(index) method
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        // 3rd approach using StringBuilder method
        StringBuilder sb = new StringBuilder(str);
        System.out.print(sb.reverse());

        // 4th approach using StringBuffer method
        StringBuffer sbr = new StringBuffer(str);
        System.out.println(sbr.reverse());

    }
}
