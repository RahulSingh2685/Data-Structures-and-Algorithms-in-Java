package Stack15;

import java.util.Stack;

public class MaxAreaHistograph {
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3 };
        int max=0;
        int n=arr.length;
        int nsr[]=new int[n];
        int nsl[]=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.empty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);

        }
        s=new Stack<>();

        for(int i=0;i<n;i++){
            while(!s.empty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=n;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);

        }
        for(int i=0;i<n;i++){
            int ht=arr[i];
            int width=nsr[i]-nsl[i]-1;
            max=Math.max(max, ht*width);
        }
        System.out.println(max);
    }
}
