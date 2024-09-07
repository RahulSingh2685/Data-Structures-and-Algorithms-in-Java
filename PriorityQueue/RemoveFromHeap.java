package PriorityQueue19;
import java.util.*;
public class RemoveFromHeap {
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(3);
        h.add(7);
        h.add(5);
        h.add(2);
        h.add(0);

        while(!h.isEmpty()){
            System.err.println(h.remove());
        }

        
    }
    static  class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        
        public void add(int data){
            arr.add(data);
            int x=arr.size()-1;
            int par=(x-1)/2;
            while(arr.get(par)<arr.get(x)){
                int temp=arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                
                x=par;
                par=(x-1)/2;
            }

        }

        public  int peek(){
            return arr.get(0);
        }

        public void Heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;
            if(left<arr.size() && arr.get(minIdx)<arr.get(left)){
                minIdx=left;
            }
            if(right<arr.size() && arr.get(minIdx)<arr.get(right)){
                minIdx=right;
            }
            if(i != minIdx){
                int temp=arr.get(minIdx);
                arr.set(minIdx, arr.get(i));
                arr.set(i, temp);
                Heapify(minIdx);

            }

        }


        public int remove(){
            int data=arr.get(0);

            int temp=arr.get(0);
                arr.set(0, arr.get(arr.size()-1));
                arr.set(arr.size()-1, temp); 

                arr.remove(arr.size()-1);
                Heapify(0);
                return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }

    }
}
