package Queue16;

import java.util.*;


public class QueueUsingDeque {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(3);
        q.add(4);
        q.add(5);
        System.err.println(q.remove());
        System.err.println(q.remove());
        System.err.println(q.remove());
      //  System.err.println(q.remove());



        
    }

        static class Queue{
        Deque<Integer> d=new LinkedList<>();
        public void add(int data){
            d.addLast(data);
        }
        public int remove(){
            return d.removeFirst();
        }
        public int peek(){
            return d.getFirst();
        }
    }
    }

