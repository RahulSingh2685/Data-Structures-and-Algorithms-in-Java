package Stack15;
import java.util.*;
public class StackUsingAL {
    public static void main(String[] args) {
        StackB s=new StackB();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();


        }
        System.out.println(s.pop());
        System.out.println(s.peek());





    }
    public static class StackB{
        static ArrayList<Integer> list=new ArrayList<>();
        public boolean isEmpty(){
            return list.size()==0;
        }
        public void push(int data){
            list.add(data);

        }
        public int pop(){
            if(list.size()==0) return -1;
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public int peek(){
            if(list.size()==0) return -1;

            return list.get(list.size()-1);
        }
    }
}
