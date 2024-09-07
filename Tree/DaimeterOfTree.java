package Tree18;

public class DaimeterOfTree {
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
      Node root=  tree.buildTree(nodes);
      System.err.println(tree.daimeter(root));
 

        
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
    static class  BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
                return newNode;
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh, rh)+1;
        }
        public static int daimeter(Node root){
            if(root==null){
                return 0;
            }
            int ld=daimeter(root.left);
            int rd=daimeter(root.right);
            int lh=height(root.left);
            int rh=height(root.right);
  
            return Math.max(rh+lh+1,Math.max(rd, ld));
        }
    }
          
}
