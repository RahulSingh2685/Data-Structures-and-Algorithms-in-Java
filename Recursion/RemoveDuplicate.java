package Recursion9;

public class RemoveDuplicate {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        boolean map[]=new boolean[26];
        String str="appnnacollege";
        remDupl(str,0,sb,map);
    }
    public static void remDupl(String str,int i,StringBuilder sb,boolean map[]){
            if(i==str.length()){
                System.out.println(sb);
                return;
            }
            if(map[str.charAt(i)-'a']==false){
                sb.append(str.charAt(i));
                map[str.charAt(i)-'a']=true;
            }
            remDupl(str, i+1, sb, map);
    }
}
