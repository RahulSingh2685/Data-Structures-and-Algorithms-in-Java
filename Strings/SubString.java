package Strings6;

public class SubString {
    public static void main(String[] args) {
        String s="HelloWorld";
       int si=0;
      int  ei=5;
     String substr="";
      for(int i=si;i<ei;i++){
        substr +=s.charAt(i);
      }
      System.out.println(substr);
      System.out.println(s.substring(3));


    }
}
