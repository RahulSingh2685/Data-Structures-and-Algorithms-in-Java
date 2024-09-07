package Array4;

public class Kadanes {
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        int n=num.length;
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<n;i++){
            cs=cs+num[i];
            if(cs<0){
                cs=0;

            }
            if(ms<cs){
                ms=cs;
            }
        }
        System.out.println(ms);

    }
}
