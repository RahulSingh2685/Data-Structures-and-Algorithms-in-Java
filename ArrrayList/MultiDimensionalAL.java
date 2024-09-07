package ArrrayList12;
import java.util.*;
public class MultiDimensionalAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainl=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(3);
        l2.add(4);
        mainl.add(l);
        mainl.add(l2);

        System.out.println(mainl);
        for(int i=0;i<mainl.size();i++)
        {
            ArrayList<Integer> currList=mainl.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }


    }
}
