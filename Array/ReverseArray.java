package Array4;

public class ReverseArray {
    public static void main(String[] args) {
        int num[]={2,4,6,8,9};
        int n=num.length;
        for(int i=0;i<=num.length/2;i++){
            int temp=num[i];
            num[i]=num[n-i-1];
            num[n-i-1]=temp;
            
        }
        for(int i=0;i<n;i++){
            System.out.print(num[i]+ " ");
        }
    }
}
