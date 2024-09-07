package Recursion9;

public class lastOccurance {
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,8,3};
        System.out.println(lastOccur(arr,arr.length-1,3));

    }
    static int lastOccur(int arr[],int i,int key){
   
        if(arr[i]==key) return i;
        if(i==0) return -1;
        return lastOccur(arr, --i, key);

    }
}
