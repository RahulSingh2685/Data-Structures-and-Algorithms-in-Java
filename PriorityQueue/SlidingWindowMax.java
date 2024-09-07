package PriorityQueue19;


import java.util.*;
public class SlidingWindowMax {
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int n=arr.length;
        int res[]=new int[n-k+1];
        PriorityQueue<Pair> p=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            p.add(new Pair(arr[i], i));
        }
        res[0]=p.peek().val;

        

        
    }
    

   static  class Pair implements Comparable<Pair>{
    int val;
    int size;

    public Pair(int val,int size) {
        this.size=size;
        this.val=val;
    }
        public  int compareTo(Pair p){
            return p.val-this.val;

        }
    } 
}
