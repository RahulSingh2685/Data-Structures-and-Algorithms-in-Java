package Recursion9;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        System.out.println(f(5));

    }
    static int f(int n){
        if(n==1) return 1;
        return f(n-1)+n;
        
    }
}
