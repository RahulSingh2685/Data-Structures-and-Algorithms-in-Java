package ArrrayList12;

import java.util.ArrayList;

public class sumPair1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target=12;
        System.out.println(sumPair(list,target));

    }
    public static boolean sumPair(ArrayList<Integer> list,int target){
        int i=0;
        int j=list.size()-1;
        while(i<=j){
            if(list.get(i)+list.get(j)== target) return true;

        
        if(list.get(i)+list.get(j)<target){
            i++;
        }else{
            j--;
        }
    }
    return false;
    }
}
