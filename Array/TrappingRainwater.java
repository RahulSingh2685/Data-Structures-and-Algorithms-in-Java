package Array4;

public class TrappingRainwater {
    public static void main(String[] args) {
        int heights[]={4,2,0,6,3,2,5};
        int n=heights.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=heights[0]   ;
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(heights[i], leftmax[i-1]);

        }
        rightmax[n-1]=heights[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(heights[i], rightmax[i+1]);
        }
        int trappedWater =0;
        for(int i=0;i<n;i++){
            int Waterlevel=Math.min(rightmax[i],leftmax[i]);
            trappedWater +=Waterlevel-heights[i];   
        }
        System.out.println(trappedWater);


    }
}
