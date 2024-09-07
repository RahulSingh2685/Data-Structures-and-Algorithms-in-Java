package Recursion9;

public class FriendsPairng {
    public static void main(String[] args) {
        System.out.println(waysOfPairing(2));
    }
    public static int waysOfPairing(int n){
        if(n<=2) return n;
        return waysOfPairing(n-1)+(n-1)*waysOfPairing(n-2);
    }
}
