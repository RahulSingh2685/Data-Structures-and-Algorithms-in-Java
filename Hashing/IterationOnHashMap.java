package Hashing20;

import java.util.*;

public class IterationOnHashMap {
    public static void main(String[] args) {
          HashMap<String ,Integer> h=new HashMap<>();
        h.put("USA", 34);
        h.put("INDIA", 150);
        h.put("CHINA", 145);

        Set<String> keys=h.keySet();
        for(String k: keys){
            System.err.println(k);
        }

    }
}
