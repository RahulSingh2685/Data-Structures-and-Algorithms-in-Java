package BitManipulation7;

public class CountSetBit {
    public static void main(String[] args) {
        int n=32;
        int count=0;
    while(n !=0){
        if((n&1)==1) count +=1;


       n= n>>1;




    }
    System.out.println(count);
    }

    
}
