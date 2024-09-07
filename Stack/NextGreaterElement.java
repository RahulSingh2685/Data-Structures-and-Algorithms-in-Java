package Stack15;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={5,5,5,5,5};
        Stack<Integer> s=new Stack();
        int nxtGreater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGreater[i]=-1;
            }else{
                nxtGreater[i]=arr[s.peek()];

            }
            s.push(i);
        }
        for (int i : nxtGreater) {
            System.out.print(i+" ");
        }
    }
}
