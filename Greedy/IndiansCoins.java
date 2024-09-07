package Greedy17;

import java.util.Arrays;
import java.util.Comparator;

public class IndiansCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        int countOfCoins=0;
        int amount=7878;
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount)
                {
                    countOfCoins++;
                    amount -=coins[i];
                    System.err.print(coins[i]+" ");
                }
            }
        }
        System.err.println();
        System.err.println("total no. of coins is "+countOfCoins);
    }
}
