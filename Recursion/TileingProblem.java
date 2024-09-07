package Recursion9;

import javax.swing.text.html.StyleSheet;

public class TileingProblem {
    public static void main(String[] args) {
        System.out.println(ways(4));
    }
    static int ways(int n){
        if(n<=1) return 1;
        return ways(n-1)+ways(n-2);
    }
}
