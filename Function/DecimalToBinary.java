package Function2;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n=12;
        int pow=0;
        int bin=0;
        while(n>0){
            bin=bin+n%2*(int )Math.pow(10, pow);
            n=n/2;
            pow++;
        }
        System.out.println(bin);
    }
}
