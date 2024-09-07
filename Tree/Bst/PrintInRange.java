package Tree18.Bst;

public class PrintInRange {
    public static void main(String[] args) {
       int values[]={8,5,3,1,4,6,10,11,14};
       Node root=null;
       for(int i=0;i<values.length;i++){
       root= insert(root, values[i]);
       }

       inorder(root,5,12);

        
    }
    public static void inorder(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        inorder(root.left,k1,k2);
        if(root.data>=k1 && root.data<=k2)
        {
        System.out.print(root.data+" ");
        }
        inorder(root.right,k1,k2);

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
