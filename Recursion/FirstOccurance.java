package Recursion9;

public class FirstOccurance {
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,8,3};
        System.out.println(firstOccur(arr,0,8));

    }
    static int firstOccur(int arr[],int i,int key){
        if(arr[i]==key) return i;
        if(i==arr.length-1) return -1;
        return firstOccur(arr, i+1, key);

    }
}
