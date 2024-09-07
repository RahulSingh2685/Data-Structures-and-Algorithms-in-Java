package Stack15;
import java.util.*;
public class pushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushBottom(s,5);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop(); 
        }
    }
    public static void pushBottom(Stack<Integer> s,int key){
        if(s.empty()){
            s.push(key);
            return;
            
        }
        int data=s.pop();
            pushBottom(s, key);
            s.push(data);

    }
    
}
