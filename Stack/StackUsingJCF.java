package Stack15;
import java.util.*;
public class StackUsingJCF {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
;
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);


        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop(); 


        }


    }
}
