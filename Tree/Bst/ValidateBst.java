package Tree18.Bst;
public class ValidateBst {
    public static void main(String[] args) {
       int values[]={1,1,1};
       Node root=null;
       for(int i=0;i<values.length;i++){
       root= insert(root, values[i]);
       }
        System.err.println(isValidBst(root, null, null));

        
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
    public static boolean isValidBst(Node root,Node min,Node max){
        if(root==null){
        return true;
        }
        if(min!=null && min.data>=root.data){
            return false;
        }
        if(max!=null && max.data<=root.data){
            return  false;
        }
        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);
    } 

  

}
