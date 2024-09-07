package Hashing20.Sett;

import java.util.*;

public class LinkedHashSett {
    public static void main(String[] args) {
         LinkedHashSet<String> h=new LinkedHashSet<>();
         h.add("AYush");
         h.add("yash");
         h.add("rahul");
         h.add("Ruhi");
         h.add("tanu");
         h.add("Shreya");

        System.err.println(h);
        System.err.println(h.contains(4));
        System.err.println(h.contains(9));
    }
}
