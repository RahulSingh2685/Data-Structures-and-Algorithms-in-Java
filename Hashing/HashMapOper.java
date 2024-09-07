package Hashing20;
import java.util.*;
public class HashMapOper {
    public static void main(String[] args) {
        HashMap<String ,Integer> h=new HashMap<>();
        h.put("USA", 34);
        h.put("INDIA", 150);
        h.put("CHINA", 145);
        System.err.println(h);
        System.err.println(h.get("INDIA"));
        System.err.println(h.containsKey("INDIA"));
        System.err.println(h.remove("UlSA"));
        System.err.println(h);
        System.err.println(h.size());

        System.err.println(h.isEmpty());





        


    }
    
}
