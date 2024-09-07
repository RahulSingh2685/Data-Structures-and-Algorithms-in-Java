package Greedy17;
import  java.util.*;
public class JobSecuncing {
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        Arrays.sort(jobInfo,Comparator.comparingDouble(o -> o[1]));

        int time=0,c=0;
        for(int i=jobInfo.length-1;i>=0;i--){
            if(jobInfo[i][0]>time){
                System.err.println(i+1+" ");
                time++;
                c++;
            }
        }
        System.err.println(c);


    }
}
