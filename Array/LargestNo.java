package Array4;

public class LargestNo {
    public static void main(String[] args) {
        
        int number[]={2,4,6,8,12,14,16};
        int key=10;
        int i;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for( i=0;i<number.length;i++){
            if(number[i]>max){
                max=number[i];
            }
            if(number[i]<min){
                min=number[i];
            }
        }
       System.out.println(max+" "+min);
    }
}
