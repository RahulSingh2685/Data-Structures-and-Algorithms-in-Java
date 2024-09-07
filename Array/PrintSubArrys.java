package Array4;

public class PrintSubArrys {
    public static void main(String[] args) {
        
        int num[]={2,4,6,8,10};
        int n=num.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();

                

            }
            System.out.println();



        }
    }
}
