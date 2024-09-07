package LinkedList14;

import ArrrayList12.sumPair1;

public class ZigZag {
    public static void main(String[] args) {
        ZigZag list=new ZigZag();
   

        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        list.printLL();
        list.zigZag();
        list.printLL();




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
    public void zigZag(){
        Node slow=head;
        Node fast=head.next;
        while(fast !=null && fast.next != null){
            slow =slow.next;
            fast=fast.next.next;
        }
        Node mid =slow;
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left !=null && right !=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }
   
}
   