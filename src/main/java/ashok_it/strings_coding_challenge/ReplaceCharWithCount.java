package ashok_it.strings_coding_challenge;

public class ReplaceCharWithCount {
    public static void main(String[] args) {
        String str = "OPENTEXT";
        char key = 'T';
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count=1;
        for(int i=0;i<ch.length;i++){
          if(ch[i]==key){
              sb.append(count);
              count++;
          }
          else{
              sb.append(ch[i]);
          }
        }
        System.out.println(sb);
    }
}
