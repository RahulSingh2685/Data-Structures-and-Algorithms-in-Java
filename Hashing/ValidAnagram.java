package Hashing20;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        HashMap<Character,Integer> h=new HashMap<>();
        String s="ab" ;
        String t="abb";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            h.put(c, h.getOrDefault(c, 0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(h.containsKey(c)){
                if(h.get(c)==1){
                    h.remove(c);
                }
                else{
                    h.put(c, h.get(c)-1);
                }
            }
            else{
                System.err.println("false");
                return;
            }

        }
        if(h.isEmpty()){
            System.err.println("true");
        }
        else{
            System.err.println("false");

        }
    }
}
