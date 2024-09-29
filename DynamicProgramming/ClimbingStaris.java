package DynamicProgramming;

public class ClimbingStaris {
    public static void main(String[] args) {
        int n=2;
    System.err.println(recMemo(n,new int[n+1]));
      System.err.println(tab(n));
    }
    public static int rec(int n){  
        if(n<=2){
            return n;
        }
        return rec(n-1)+rec(n-2);
    }
    public static int recMemo(int n,int dp[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=recMemo(n-1, dp)+recMemo(n-2, dp);
        return dp[n];
    }

    public static int tab(int n){
        int dp[] =new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
