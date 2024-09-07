package Function2;
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        int pow=0;
        int dec=0;
        int n=1000;
        while(n>0){
            dec=(int)(dec+(Math.pow(2, pow)*(n%10)));
            n=n/10;
            pow++;
        }
        System.out.println(dec);

    }
}
