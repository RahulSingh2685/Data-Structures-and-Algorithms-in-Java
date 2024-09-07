package Tree18.Bst;
public class CreateABlancedBST {
    public static void main(String[] args) {
       int values[]={8,5,3,1,4,6,10,11,14};
       Node root=null;
       for(int i=0;i<values.length;i++){
       root= insert(root, values[i]);
       }
       int arr[]={3,5,6,8,10,11,12};
       preorder(root);
       System.err.println();
       createBST(arr, 0, arr.length-1);
       preorder(createBST(arr, 0, arr.length-1) );

     
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
    public static Node createBST(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBST(arr, st, mid-1);
        root.right=createBST(arr, mid+1, end);
        return root;

    }
 
    
  

}
