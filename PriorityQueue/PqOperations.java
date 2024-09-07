package PriorityQueue19;
import java.util.*;
public class PqOperations {
    public static void main(String[] args) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.add(5);     
       q.add(8);
        q.add(3);
        q.add(1);
        q.add(2);
        q.add(6);
        while(!q.isEmpty()){
            System.err.println(q.remove());
        }

    }
    
}
