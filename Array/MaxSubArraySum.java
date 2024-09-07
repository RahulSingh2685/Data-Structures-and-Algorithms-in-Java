package Array4;

public class MaxSubArraySum {
    
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        int n=num.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum +=num[k];
                }
                System.out.print(sum);
                if(max<sum){
                    max=sum;
                }
                if(min>sum){
                    min=sum;
                }

                System.out.println();

                

            }
            System.out.println();
            




        }
        System.out.println("Min is "+ min);
            System.out.println("Max is "+ max);


    }
}
