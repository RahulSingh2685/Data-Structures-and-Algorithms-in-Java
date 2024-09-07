package ArrrayList12;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        int i=0;int j=height.length-1;
        int max=0;
        while(i<j){
            int ht=Math.min(height[i], height[j]);
            int width =j-i;
            max=Math.max(max, width*ht);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(max);
    }
}
