package Recursion9;

public class PrintNumDecrOrder {
    public static void main(String[] args) {
        f(10    );
    }
    static void f(int n){
        if(n==0){
            System.out.println(n);

            return;

        }
        System.out.println(n);
        f(n-1);
        System.out.println(n);

    }
}
