package Recursion9;

public class OptimizesedPowXofN {
    public static void main(String[] args) {
        System.out.println(pow(2,10));
    }
    static int pow(int x ,int n){
        if(n==0) return 1;
        int halfPower=pow(x, n/2);
        halfPower *=halfPower;
        if(n%2 != 0){
            halfPower *=x;
        }
        return halfPower;
    }
}
