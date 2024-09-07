package Queue16;

public class QueueWithLL {
    public static void main(String[] args) {

        Queue q=new Queue();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
      System.out.println(q.remove());

        
    }
    static  class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;

        }
         
    }
    static  class Queue{
        static  Node head=null;
        static  Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int data=head.data;
            if(head==tail){
                head=tail=null;
            }else{
                head=head.next; 
            }
            return data;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return head.data;
        }

    }
}
