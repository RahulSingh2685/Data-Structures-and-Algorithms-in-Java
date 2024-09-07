package LinkedList13;

import ArrrayList12.sumPair1;

public class allOperationOfLL {
    public static void main(String[] args) {
        allOperationOfLL l=new allOperationOfLL();
        l.addFirst(2);
        l.addFirst(1);
        l.addFirst(6);



        l.addLast(2);
        l.addLast(1);
        l.addLast(6);

        l.add(3, 3);

        l.printLL();
        System.out.println(l.checkPalindrome());

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
    public void add(int idx,int data)
    {
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;

        }
        else{
            if(size ==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            Node temp=head;
            Node temp1=head.next;
            while(temp1.next !=null){
                temp=temp.next;
                temp1=temp1.next;
            }
            int val=temp1.data;
            temp.next=null;
            tail=temp;
            size--;
            return val;
        }
    }
    public int Search(int key){
        Node temp=head;
        int i=0;
        while(temp !=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;

        }
        return -1;
    }
    public int recuriseSearch(Node temp,int i,int key){
       
        if(temp==null) 
        {
            return -1;
        }
        else{
            if(temp.data==key) {
                return i;
            }
            
        }

       return recuriseSearch(temp.next, i+1, key);
    }
    public void reverse(){
        Node curr=tail=head;
        Node prev=null;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void removeNthFromEnd(int n){
        int sz=0;
        Node temp=head;
      
        while(temp !=null){
            sz++;
            temp= temp.next;
        }
        if(sz==n){
            head=head.next;
            size--;
            return;
        }
        temp=head;
        for(int i=0;i<sz-n-1;i++){
            temp=temp.next;

        }
 
        temp.next=temp.next.next;
        size--;
    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next !=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head ==null|| head.next==null ){
            return true ;
        }
        Node midNode=findMid(head);
        Node prev=null;
        Node curr=midNode;
        Node next;
        while (curr !=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        Node right=prev;
        Node left=head;
        while(right !=null){
            if(right.data != left.data){
                return false;

            }
            right=right.next;
            left=left.next;
        }
        return true;
     }
}
