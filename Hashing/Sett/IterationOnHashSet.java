package Hashing20.Sett;

import java.util.*;

public class IterationOnHashSet {
    public static void main(String[] args) {
         HashSet<String> h=new HashSet<>();
        h.add("AYush");
        h.add("yash");
        h.add("rahul");
        h.add("Ruhi");
        h.add("tanu");
        h.add("Shreya");
        
        System.err.println(h);

        Iterator i=h.iterator();
        while(i.hasNext()){
            System.err.print(i.next()+" ");
        }
        System.err.println("");
        for(String s:h){
            System.err.println(s+" ");
        }


    }
}
