package Backtracking11;

public class FindSubSet {
    public static void main(String[] args) {
        printSubSet("abc",0,"");
    }
    public static void printSubSet(String str,int i,String ans){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(i);
        printSubSet(str, i+1, ans+ch);
        printSubSet(str, i+1, ans);


    }
}
