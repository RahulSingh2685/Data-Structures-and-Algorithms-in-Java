package DynamicProgramming;

public class RodCutting {
    public static void main(String[] args) {
        int length[]={1,2,3,4,5,6,7,8};
        int price[]={1,5,8,9,10,17,17,20};
        int totRod=8;
        System.out.println(rodCutting(length, price, totRod));
    }
    public static int rodCutting(int length[],int price[],int totRod){
        int n=length.length;
        int dp[][]=new int[n+1][totRod+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<totRod+1;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<totRod+1;j++){
                int p=price[i-1];
                int l=length[i-1];

                if(l<=j){
                dp[i][j]=Math.max(p+dp[i][j-l], dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][totRod];
    }
}
