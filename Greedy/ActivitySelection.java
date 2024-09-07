package Greedy17;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int maxAct=1;
        int idx=0;
        System.err.print("A"+idx+" ");

        for(int i=1;i<end.length;i++){
                if(end[idx]<=start[i]){
                    idx=i;
                    maxAct++;
                    System.err.print("A"+idx+" ");
                }
        }
        System.err.println(maxAct);
    }
}
