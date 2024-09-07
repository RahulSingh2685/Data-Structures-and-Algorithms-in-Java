package Stack15;
import java.util.*;
public class StockSpan {
    public static void main(String[] args) {
        int stock[]={100,80,60,70,60,85,100};
        int span[]=new int[stock.length];
        stockSpan(stock,span);
        for(int i=0;i<stock.length;i++){
            System.out.print(span[i]+ " ");
        }
    }
    public static void stockSpan(int stock[],int span[])
    {
        span[0]=1;
        Stack<Integer> s=new Stack<>();
        s.push(0);
        for(int i=1;i<stock.length;i++){
            int currPrice=stock[i];
            while(!s.isEmpty() && currPrice>stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;


            }
            s.push(i);
        }
    }
}
