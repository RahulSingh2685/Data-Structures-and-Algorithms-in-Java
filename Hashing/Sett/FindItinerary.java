package Hashing20.Sett;
import java.util.*;
public class FindItinerary {
    public static void main(String[] args) {
        HashMap<String,String> h=new HashMap<>();
        h.put("c", "b");
        h.put("m", "d");
        h.put("g", "c");
        h.put("d", "g");
        HashMap<String,String> revh=new HashMap<>();

        Set<String> s= h.keySet();
        for(String key : s){
            revh.put(h.get(key), key);
        }

        String startingPt="";
        for(String key : s){
            if(!revh.containsKey(key)){
                startingPt=key;
            }
        }

        System.err.print(startingPt);
        for(String key : s){
            System.err.print("->"+h.get(startingPt));
            startingPt=h.get(startingPt);
        }










    }
}
