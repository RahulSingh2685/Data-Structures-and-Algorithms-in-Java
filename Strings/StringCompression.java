package Strings6;

public class StringCompression {
    public static void main(String[] args) {
        String str="aaabbcccdd",str1="";
        for(int i=0;i<str.length();i++){
            int count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i +=1;
            }
            str1 +=str.charAt(i);
            if(count>1){
                str1 +=count;

            }
        }
        System.out.println(str1);


    }
}
