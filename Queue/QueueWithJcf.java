package Queue16;
import  java.util.*;
public class QueueWithJcf {
    public static void main(String[] args) {
        
    
    Queue<Integer> q=new ArrayDeque<>();

     q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }

    }
}
