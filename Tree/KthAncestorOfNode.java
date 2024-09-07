package Tree18;
public class KthAncestorOfNode {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        kthAncestor(root, 5, 1);


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
    
    
    public static int kthAncestor(Node root ,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=kthAncestor(root.left, n, k);
        int rightDist=kthAncestor(root.right, n, k);
        int max=Math.max(rightDist, leftDist);
        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        if(max+1==k){
            System.err.println(root.data);
        }
        return max+1;

    }
  
    
    
}
