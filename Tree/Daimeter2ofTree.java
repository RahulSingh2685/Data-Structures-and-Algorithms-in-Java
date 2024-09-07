package Tree18;

public class Daimeter2ofTree {
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();

      Node root=  tree.buildTree(nodes);

      Info i=daimete(root);
      System.err.println(i.daim);
 

        
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
       
    }
    public static class Info  {
        int daim;
        int ht;
        Info(int daim,int ht){
            this.daim=daim;
            this.ht=ht;
        }
    }
    public static Info daimete(Node root){
        if(root==null){
            return new Info(0, 0);
        }
        Info leftInfo=daimete(root.left);
        Info rightInfo=daimete(root.right);
        int diam=Math.max(leftInfo.daim, Math.max(rightInfo.daim, leftInfo.ht+rightInfo.ht+1));
        int ht=Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(diam, ht);

    }
          
}
