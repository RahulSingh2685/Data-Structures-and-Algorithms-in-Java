package PriorityQueue19;

public class HeapSort {
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,8,9};
        headSort(arr);
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
        
    }
    public static void headSort(int arr[]){
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }
        for(int i=n-1;i>=0;i--){

            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,0,i);
        }
    }
    public static void heapify(int arr[],int i,int n){
        int left=2*i+1;
        int right=2*i+2;
        int maxIdx=i;

        if(left<n && arr[left]>arr[maxIdx]){
            maxIdx=left;
        } 
        if(right<n && arr[right]>arr[maxIdx]){
            maxIdx=right;
        } 
        if(i!=maxIdx){

            int temp=arr[maxIdx];
            arr[maxIdx]=arr[i];
            arr[i]=temp;

        }

        
    }
}
