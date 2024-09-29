package DynamicProgramming;

import java.util.*;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int n=arr.length;
        System.err.println(mcm(arr,1,arr.length-1));

        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        System.err.println(mcmMemo(arr, dp, 1, n-1));

        
    }
    public static int mcm(int arr[],int i,int j){
        if(i==j){
            return 0;

        }
        int ans =Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int cost1=mcm(arr, i, k);
            int cost2=mcm(arr, k+1, j);
            int cost3=arr[i-1]*arr[k]*arr[j];
            ans =Math.min(ans, cost1+cost2+cost3);
        }
        return  ans;
    }
    public static int mcmMemo(int arr[],int dp[][],int i,int j){
        if(i==j){
            return 0;

        }
        if(dp[i][j]!=-1){
            return dp[i][j];

        }
        int ans =Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int cost1=mcmMemo(arr, dp, i, k);
            int cost2=mcmMemo(arr, dp, k+1, j);
            int cost3=arr[i-1]*arr[k]*arr[j];
            ans=Math.min(ans, cost1+cost2+cost3);

        }
        return dp[i][j]=ans;
    }
}
