package DynamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        int n=5;
        int f[]=new int[n+1];
        System.err.println(fib(n,f));
        System.err.println(fibTabulation(6)); 
    }
    public static int fib(int n,int f[]){
        if(n<=1){
            return n;
        }
        if(f[n]!=0){
            return f[n];
        }
        f[n]=fib(n-1, f) + fib(n-2, f);
        return f[n];
    }
    public static int fibTabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];

        }
        return dp[n];
    }
}
