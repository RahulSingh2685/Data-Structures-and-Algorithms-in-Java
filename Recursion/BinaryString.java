package Recursion9;

public class BinaryString {
    public static void main(String[] args) {
        printBinaryString(3 ,0,"");
    }
    public static void printBinaryString(int n ,int lastp,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryString(n-1, lastp, str+"0");
        if(lastp==0){
             printBinaryString(n-1, lastp, str+"1");
        }
    }
}
