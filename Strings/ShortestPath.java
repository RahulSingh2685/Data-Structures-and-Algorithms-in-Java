package Strings6;

public class ShortestPath {
    public static void main(String[] args) {
        String s="WNEENESENNN";
        int x1,x;
        int y1,y;
        x1=x=0;
        y1=y=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='W'){
                x--;
            }
            if(c=='E'){
                x++;
                
            }
            if(c=='N'){
                y++;
                
            }
            if(c=='S'){
                y--;
                
            }
        }
        int x2=x,y2=y;
        int ans=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        System.out.println(Math.sqrt(ans));
        
    }
}
