package Tree18.Bst;
import java.util.*;
public class PrintRootToLeaf {
    public static void main(String[] args) {
       int values[]={8,5,3,1,4,6,10,11,14};
       Node root=null;
       for(int i=0;i<values.length;i++){
       root= insert(root, values[i]);
       }

       root2Leaf(root, new ArrayList<>  ());

        
    }
    public static void root2Leaf(Node root,ArrayList<Integer> path){
        if(root==null){
           
            return ;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
                System.err.println(path );
        }
       
       root2Leaf(root.left, path);
       root2Leaf(root.right, path);
       path.remove(path.size()-1);


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
  

}
