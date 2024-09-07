package Stack15;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
          Stack<Character> s=new Stack<>();
          String str="abcde";
          int i=0;
          while(i<str.length()){
            s.push(str.charAt(i));
            i++;
          }
          StringBuilder sb =new StringBuilder("");
          while(!s.isEmpty()){
            sb.append(s.pop());
             
        }
        System.out.println(sb.toString());
    }
}
