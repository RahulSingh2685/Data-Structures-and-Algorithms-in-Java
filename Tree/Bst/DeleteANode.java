package Tree18.Bst;

public class DeleteANode {
    public static void main(String[] args) {
       int values[]={8,5,3,1,4,6,10,11,14};
       Node root=null;
       for(int i=0;i<values.length;i++){
       root= insert(root, values[i]);
       }
       delete(root, 1);
       inorder(root);

        
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.err.print(root.data+" ");
        inorder(root.right);

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
    public static Node delete(Node root,int val)
    {
        if(root.data<val){
         root.right=   delete(root.right, val);
        }
        else  if(root.data>val){
            root.left=   delete(root.left, val);
           }
          else if(root.left==null && root.right==null){
            return null;
          } 

        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        Node IS=findIS(root.right);
        root.data=IS.data;
        root.right=delete(root.right, IS.data);
        return root;
    }
    public static Node findIS(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
  

}
