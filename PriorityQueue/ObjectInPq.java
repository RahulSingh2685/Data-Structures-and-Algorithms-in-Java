package PriorityQueue19;
import  java.util.*;

public class ObjectInPq {
    public static void main(String[] args) {
        PriorityQueue<Students> q=new PriorityQueue<>();
        q.add(new Students(3, "A"));
        q.add(new Students(1, "B"));
        q.add(new Students(5, "C"));
        q.add(new Students(8, "D"));

       
         while(!q.isEmpty()){
             System.err.println(q.remove().rank);
         }


        
    }
    public static class Students implements Comparable<Students>{
        String name;
        int rank;

        public Students(int rank, String name) {
            this.name=name;
            this.rank=rank;
        }
        public int compareTo(Students s2){
            return this.rank-s2.rank;
        }
        
    }
    
}
