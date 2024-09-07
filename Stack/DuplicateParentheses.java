package Stack15;
import  java.util.*;

public class DuplicateParentheses {
    public static void main(String[] args) {
        String str="((a+b))";
        String str1="(a-b)";
        System.err.println(isDuplicate(str1));
    }
    public static boolean  isDuplicate(String str){
        Stack <Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch ==')'){
                int c=0;
                while(s.peek()!='(' && !s.isEmpty() ){
                    s.pop();
                    c++;
                }
                if(c==0){
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
}
