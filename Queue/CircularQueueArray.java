package Queue16;

public class CircularQueueArray {
    public static void main(String[] args) {

        Queue q=new Queue(5);
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());

        q.add(5);
        System.out.println(q.remove());
        q.add(6);


        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
        System.out.println(q.remove());
        
    }
    static  class Queue{
        static  int rear;
        static  int front;
        static  int size;
        static  int arr[];

        public Queue(int n) {
            rear=-1;
            front=-1;
            size=n;
            arr=new int[n];
        }
        public static boolean isEmpty(){
            return rear==-1 && front ==-1;
        }
        public static boolean  isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is FUll");
                return;
            }
            if(front ==-1){
                front =0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;


        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1 ;
            }
            int data=arr[front];
            if(front ==rear){
                front=rear=-1; 
            }
            else{
                front=(front+1)%size;

            }
            return data;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("IS EMPTY");

            }
            return arr[front];
        }
         


    }
}
