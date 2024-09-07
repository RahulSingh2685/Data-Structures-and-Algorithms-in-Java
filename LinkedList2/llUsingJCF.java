package LinkedList14;
import java.util.*;
public class llUsingJCF {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(2);
        ll.add(1);
        ll.addFirst(0);
        ll.addLast(3);
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);


    }
}
