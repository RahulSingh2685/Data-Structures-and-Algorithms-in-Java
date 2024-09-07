package Tree18;

public class KthLevelOfTree {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        kthLevle(root, 1, 3);

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
    public static void kthLevle(Node root,int level,int k){
        if(root==null){
            return ;
        }
        if(level==k){
            System.err.print(root.data+" ");
            return ;
        }
        kthLevle(root.left, level+1, k);
        kthLevle(root.right, level+1, k);


    }
}
