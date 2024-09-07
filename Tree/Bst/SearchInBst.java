package Tree18.Bst;

public class SearchInBst {
    public static void main(String[] args) {
       int values[]={5,1,3,4,2,7};
       Node root=null;
       for(int i=0;i<values.length;i++){
       root= insert(root, values[i]);
       }
System.out.println(search(root, 0));
        
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
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }

        if(root.data== key){
            return true;
        }
        
        if(root.data>key){
            return search(root.left, key);
        }else{
        
           return  search(root.right, key);
        }

        
    }

}
