package DivideAndConquer10;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={5,4,7,5,2,1,6};
        Mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        Mergesort(arr, si, mid);
        Mergesort(arr, mid+1, ei);
        Merge(arr,si,mid, ei);

    }
    public static void Merge(int arr[],int si,int mid,int ei){
        int i=si;
        int j=mid+1;
        int temp[]=new int[ei-si+1];
        int k=0;
        while(i<=mid && j<=ei)
        {
            if(arr[i]>arr[j]){
                temp[k]=arr[j++];
            }
            else{
                temp[k]=arr[i++];
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(int n=0;n<temp.length;n++){
            arr[n+si]=temp[n];

        }

    }
}
