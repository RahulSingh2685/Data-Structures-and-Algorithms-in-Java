package BasicSorting3;

public class CountingSort {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,2,1,7,8};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
          max=  Math.max(max,arr[i]);
        }
        int  count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        } 
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j]=i;
                count[i]--;
                j ++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
