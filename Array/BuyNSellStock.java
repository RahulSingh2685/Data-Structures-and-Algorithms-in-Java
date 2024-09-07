package Array4;

public class BuyNSellStock {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int buyp=Integer.MAX_VALUE;
        int maxp=0;
        for(int i=0;i<prices.length;i++){
            if(buyp<prices[i]){
                int currp=prices[i]-buyp;
                maxp=Math.max(maxp, currp);
            }
            else{
                buyp=prices[i];
            }
        }
        System.out.println(maxp);
    }
}
