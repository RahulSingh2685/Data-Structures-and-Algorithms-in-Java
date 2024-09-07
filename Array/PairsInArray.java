package Array4;

public class PairsInArray {
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        int n=num.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+num[i]+","+num[j]+") ");
                

            }
            System.out.println();

        }
    }
}
