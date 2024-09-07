package Queue16;
import java.util.*;

public class StackUsingQueue {
    public static void main(String[] args) {

        Stack s=new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

            System.out.println(s.peek());
            s.pop();



        System.out.println(s.pop());
        System.out.println(s.peek());

        
    }
    static class Stack{
        Deque<Integer> d=new LinkedList<>();
        public void push(int data){
            d.addLast(data);
        }
        public int pop(){
            return d.removeLast();
        }
        public int peek(){
            return d.getLast();
        }
    }
}
