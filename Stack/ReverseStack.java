package Stack15;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        s.push((1));
        s.push((2));
        s.push((3));

        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();


        }

    }
    public static void reverse( Stack<Integer> s){
        if(s.isEmpty()){
            return;

        }
        int top=s.pop();


        reverse(s);
        pushBottom(s,top);
    }
    public static void pushBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);

            return;
        }
        int top=s.pop();
        pushBottom(s,data);
        s.push(top);

    }
}
