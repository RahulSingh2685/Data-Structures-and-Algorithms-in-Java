package Array4;

public class PreFixSubArraySum {
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        int n=num.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int prefix[]=new int[n];
        prefix[0]=num[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+num[i];
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
            int sum= i==0 ?prefix[j]:prefix[j]-prefix[i-1];
            if(max<sum){
                max=sum;
            }
            if(min>sum){
                min=sum;
            }
               
            }
        }
        System.out.println("Min is "+ min);
            System.out.println("Max is "+ max);

    }
}
