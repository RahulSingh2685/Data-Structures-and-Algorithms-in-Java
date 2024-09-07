package Hashing20.Sett;
import java.util.*;
public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            h.add(arr1[i]);

        }
        for(int i=0;i<arr2.length;i++){
            h.add(arr2[i]);
            
        }
        System.err.println(h.size());
        System.err.println(h);
        h.clear();

        for(int i=0;i<arr1.length;i++){
            h.add(arr1[i]);

        }
        int c=0;
        for(int i=0;i<arr2.length;i++){
            if(h.contains(arr2[i])){
                h.remove(arr2[i]);
                System.err.print(arr2[i]+" ");
                c++;
            }
        }
        System.err.println("");
        System.err.println(c);




    }
}
