package ashok_it.strings_coding_challenge;

import java.util.Arrays;

public class SortAlphabeticalOrder {
    public static void main(String[] args) {
        String str = "RamyaSachiin";

        char[] ch = str.toLowerCase().toCharArray();

        //Without using Arrays sort method
        char temp;
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j< ch.length;j++){
                if(ch[i]>ch[j]){
                   temp=ch[i];
                   ch[i]=ch[j];
                   ch[j]=temp;
                }
            }
        }
        for(int i=0;i<ch.length;i++){
        System.out.print(ch[i]);}
        System.out.println();

        //Using sort method
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
