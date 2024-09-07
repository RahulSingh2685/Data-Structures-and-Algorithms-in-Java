package Tree18.Bst;


import java.util.*;

public class BstToBlancedBst {
    public static void main(String[] args) {
       Node root=new Node(8);
       root.left=new Node(6);

       root. left. left = new Node ( 5);
        root. left. left.left = new Node( 3) ;
        root. right = new Node ( 10);
        root. right. right = new Node ( 11) ;
        root. right. right.right = new Node( 12) ;

       
      // preorder(createBST(new Array, 0, arr.length-1) );

     
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
    public static void preorder(Node root){
        if(root==null){
          //  System.err.print(-1+" ");
            return;
        }
        System.err.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void getInorder(Node root,ArrayList<Integer> inorder){
        if(root==null){
            return ;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
        
    }
    public static Node createBST(ArrayList<Integer> inorder,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(inorder.get(mid));
        root.left=createBST(inorder, st, mid-1);
        root.right=createBST(inorder, mid+1, end);
        return root;

    }

 
    
  

}
