package Hashing20;
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int nums[]={1,2};
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            h.put(num,h.getOrDefault(num, 0)+1);
        }
        Set<Integer> s=h.keySet();
        for(int i:s){
            if(h.get(i)>nums.length/3){
                System.err.println(i);
            }
        }
        
    }
}
