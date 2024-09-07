package PriorityQueue19;

import java.util.PriorityQueue;

public class ConnectingNRopes {
    public static void main(String[] args) {
        int ropes[]={2,3,3,4,6};
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            p.add(ropes[i]);
        }
        int cost=0;
        while(p.size()>1){
            int min=p.remove();
            int min2=p.remove();
            cost +=min+min2;
            p.add(min+min2);
        }
        System.err.println(cost);
    }
}
