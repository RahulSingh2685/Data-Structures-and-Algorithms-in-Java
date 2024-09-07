package Trei21;

public class Creation {
    public static void main(String[] args) {
        
    }

    public static Node root=new Node();

    static class Node{
        Node children[] =new Node[26];
        boolean eow=false;

        public Node() {
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
        

    }
}
