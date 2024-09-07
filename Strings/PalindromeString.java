package Strings6;

public class PalindromeString {
    public static void main(String[] args) {
        String s="madam";
        int f=1;
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                f=0;
                break;
            }
        }
        if(f==1){
            System.out.println("yes! Palindrome");
        }else{
            System.out.println("Not ,Palindrome");

        }
    }
}
