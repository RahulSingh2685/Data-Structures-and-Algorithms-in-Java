package Greedy17;

public class ASNsortedEndTime {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];


        }
        int maxAct=1;
        int idx=activities[0][0];
        System.err.print("A"+idx+" ");

        for(int i=1;i<end.length;i++){
                if(activities[idx][2]<=activities[i][1]){
                    idx=activities[i][0];
                    maxAct++;
                    System.err.print("A"+idx+" ");
                }
        }
        System.err.println(maxAct);
    }
}
