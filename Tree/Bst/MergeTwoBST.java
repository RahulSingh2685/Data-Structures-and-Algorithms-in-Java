package Tree18.Bst;
import java.util.*;
public class MergeTwoBST {
    public static void main(String[] args) {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
         root2.left=new Node(3);
         root2.right=new Node(12);

         inorder(mergeBST(root1, root2));
        
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
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.err.print(root.data+" ");
        inorder(root.right);

    }
    public static void getInorder(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);

    }
    public static Node createBST(ArrayList<Integer> arr,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBST(arr, st, mid-1);
        root.right=createBST(arr, mid+1, end);
        return root;

    }
 
    public static Node mergeBST(Node root1,Node root2){
        ArrayList<Integer> arr1=new ArrayList<>();
        getInorder(root1, arr1);

        ArrayList<Integer> arr2=new ArrayList<>();
        getInorder(root2, arr2);

        ArrayList<Integer> arr3=new ArrayList<>();

        for(int i=0; i<arr1.size();i++){
            arr3.add(arr1.get(i));
        }
        for(int i=0; i<arr2.size();i++){
            arr3.add(arr2.get(i));
        }
        Collections.sort(arr3);
        return createBST(arr3, 0, arr3.size()-1);




    }
}
