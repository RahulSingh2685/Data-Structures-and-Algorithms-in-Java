package Tree18.Bst;
public class MirrorABst {
    public static void main(String[] args) {
       int values[]={8,5,3,1,4,6,10,11,14};
       Node root=null;
       for(int i=0;i<values.length;i++){
       root= insert(root, values[i]);
       }
       inorder(root);
       System.err.println();
       mirror(root);
       System.err.println();

       inorder(root);
     
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
    public static Node insert(Node root,int val){
        if(root==null){
            return root=new Node(val);
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }
        if(root.data<val){
            root.right=insert(root.right, val);
        }
        return root;

    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.err.print(root.data+" ");
        inorder(root.right);

    }
    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node leftSubTree=mirror(root.left);
        Node rightSubTree=mirror(root.right);
        root.left=rightSubTree;
        root.right=leftSubTree;
        return root;
    }
  

}
