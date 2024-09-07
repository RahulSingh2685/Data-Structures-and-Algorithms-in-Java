package Backtracking11;

public class ChangeArray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArr(arr,0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void changeArr(int arr[],int i)
    {
        if(i==arr.length) return;
        arr[i]=i+1;
        changeArr(arr, i+1);
        arr[i] -=2;

    }
    
}
