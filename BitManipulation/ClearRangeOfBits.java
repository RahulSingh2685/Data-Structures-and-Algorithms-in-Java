package BitManipulation7;

public class ClearRangeOfBits {
    public static void main(String[] args) {
        int n=10;
        int i=2,j=4;
        int a=~0<<j+1;
        int b=(1<<i)-1;
        int bitmask=a|b;
        System.out.println(n & bitmask );
    }
}
