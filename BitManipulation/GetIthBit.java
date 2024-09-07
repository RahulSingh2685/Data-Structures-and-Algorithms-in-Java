package BitManipulation7;

public class GetIthBit {
    public static void main(String[] args) {
        int n=10;
        int i=0;
        int bitmask=1<<i;
        if((n&bitmask)==0){
            System.out.println("ith bit is zero");
        }
        else{
            System.out.println("ith bit is one");

        }
    }
}
