package BitManipulation7;

public class ClearIthBit {
    public static void main(String[] args) {
        int n=10;
        int i=1;
        int bitmask=~(1<<i);
        System.out.println(n & bitmask);

    }
}
