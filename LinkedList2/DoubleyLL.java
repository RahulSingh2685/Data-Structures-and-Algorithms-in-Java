package LinkedList14;

public class DoubleyLL {
    public static void main(String[] args) {
        DoubleyLL dl=new DoubleyLL();
        dl.addFirst(4);
        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);
      


        
        dl.printDL();
        dl.reverseDl();
        dl.printDL(); 


    }
    public class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode =new Node(data);
        size++;
        if(head== null){
            head=tail=newNode;
            return ;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }
    public void printDL(){
        if(head==null){
            System.out.println("Empty");
            return;

        }
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public void removeFirst(){
        if(head==null){
            System.out.println("Empty");
 
            return;

        }
        if(head.next==null){//size==1
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--; 

    }
    public void reverseDl(){
        if(head==null){
            System.out.println("empty");
        }

   
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


}
