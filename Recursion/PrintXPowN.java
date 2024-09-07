package Recursion9;

public class PrintXPowN {
    public static void main(String[] args) {
        System.out.println(pow(2,6 ));
    }
    static int pow(int x , int n){
        if(n==0) return 1;
        return pow(x, n-1)*x;
    }
}
