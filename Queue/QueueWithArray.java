package Queue16;



public class QueueWithArray {
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
     //   q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
        System.out.println(q.remove());




        
    }
    public static class Queue{
        static  int arr[];
        static  int size;
        static  int rear;

         Queue(int n) {
            arr=new int[n] ;
            rear=-1;
            size=n;
        }
        public static boolean  isEmpty(){
            return rear==-1;
        }
        public static void add(int data){
            if(rear==size-1){
                System.err.println("QUEuE is full");
                return; 
            }
            rear=rear+1;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.err.println("Queue is Empty");
                return -1;
            }
            int front =arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.err.println("Queue is Empty");
                return -1;
            }
            return arr[0];


        }
        

    }
}
