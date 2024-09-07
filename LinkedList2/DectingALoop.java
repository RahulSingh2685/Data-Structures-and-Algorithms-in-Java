package LinkedList14;

import ArrrayList12.sumPair1;

public class DectingALoop {
    public static void main(String[] args) {
        DectingALoop list=new DectingALoop();
   

        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        // Creating a cycle for testing
        list.tail.next = list.head.next;
        System.out.println(list.isCycle());
     


     //   list.printLL();


    }
    class Node{
        int data;
        Node next;
        public Node(int data){    //0(1)
             this.data=data;
             this.next=null;
        }
    }
    public static Node head=null;
    public static Node tail=null;
    public static int size; //0(1)
    public void addFirst(int data){  
        Node newNode=new Node(data);
        size++;

        if(head==null){ 
        head=newNode;
        tail=head;
        return;

        }

        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){   //0(1)
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void printLL(){  //0(n)
        if(head==null)
        {
            System.out.println("LL is empty");
        }
        Node temp=head;
        while (temp !=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
            
        }
        System.out.println("null");
    }
    
    public boolean isCycle(){
        Node slow=head;
        Node fast =head;
        while(fast!=null && fast.next!=null){
           
            fast=fast.next.next;
            slow=slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
   