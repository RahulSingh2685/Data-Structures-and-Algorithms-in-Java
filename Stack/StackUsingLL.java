package Stack15;
import java.util.*;
public class StackUsingLL {
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
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class StackB{
        static Node head=null;
        public static boolean isEmpty(){
            return head==null; 
        }
       public void push(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode; 

       }
       public static int pop(){
        if(head==null) return -1;
        int top=head.data;
        head=head.next;
        return top;
       }
       public static int peek(){
        if(head==null) return -1;
        return head.data;
       }
    }
}
