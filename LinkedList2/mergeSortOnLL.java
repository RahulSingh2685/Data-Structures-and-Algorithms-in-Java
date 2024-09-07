package LinkedList14;
import java.util.*;
public class mergeSortOnLL {
    public static void main(String[] args) {
        mergeSortOnLL l=new mergeSortOnLL();
        l.addLast(2);
        l.addLast(6);
        l.addLast(4);
        l.addLast(0);
        l.addLast(1);

        l.printLL();
        l.head=l.mergeSort(head);
        l.printLL();


        
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
    public void addLast(int data){   //0(1)
        Node newNode=new Node(data);

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
    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next !=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; 
    }
    public Node mergeSort(Node head){
        if(head==null || head.next ==null){
            return head;
        }
        Node mid =getMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        return merge(newLeft,newRight);

    }
    public Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1 !=null && head2 !=null){
            if(head1.data<= head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;

            }

        }
        while(head1 !=null){
            temp.next=head1;
                head1=head1.next;
                temp=temp.next;
        }
        while(head2 !=null){
            temp.next=head2;
                head2=head2.next;
                temp=temp.next;

        }
        return mergedLL.next;
    }

}
