package Backtracking11;

public class GridWays {
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(ways(0,0,n,m));
    }
    public static int ways(int i,int j,int m,int n){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i==n || j==m) return 0;
    
        return  ways(i+1, j, m, n)+ways(i, j+1, m, n);
    }
}
