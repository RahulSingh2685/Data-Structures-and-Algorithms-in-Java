package BasicSorting3;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        for(int i=0;i<arr.length-1;i++){
            int minp=i;
            for( int j=i+1;j<arr.length;j++){
                if(arr[minp]>arr[j]){
                    minp=j;
                }

            }
            int temp=arr[i];
                    arr[i]=arr[minp];
                    arr[minp]=temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
