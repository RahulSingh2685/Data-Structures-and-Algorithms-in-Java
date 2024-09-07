package Hashing20;

import java.util.*;

public class LinkedHashMapp {
    public static void main(String[] args) {
         LinkedHashMap<String ,Integer> h=new LinkedHashMap<>();
        h.put("USA", 34);
        h.put("INDIA", 150);
        h.put("CHINA", 145);
        h.put("RUSSIA", 15);

        System.out.println(h);
    }
}
