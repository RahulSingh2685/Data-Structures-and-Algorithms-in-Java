package Tree18;
public class TransformToSumTree {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);



    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
    
    public static void transform(Node root){
        if(root==null){
            root.data=0;
            return;
        }
        root.data=root.left.data+root.right.data;
        transform(root.left);
        transform(root.right);
    }
  
    
    
}
