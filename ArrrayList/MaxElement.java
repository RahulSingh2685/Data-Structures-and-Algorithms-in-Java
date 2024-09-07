package ArrrayList12;
import java.util.*;
public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(9);
        l.add(6);
        l.add(8);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<l.size();i++){
            max=Math.max(max, l.get(i));
        }
        System.out.println(max);
        System.out.println(l);

        Collections.sort(l);
        System.out.println(l);

        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);



    }
}
