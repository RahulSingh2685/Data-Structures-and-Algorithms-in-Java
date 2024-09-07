package DivideAndConquer10;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,-6};
        QS(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void QS(int arr[],int si ,int ei){
        if(si>=ei){
            return;
        }
      int q=  partion(arr,si,ei);
      QS(arr, si, q-1);
      QS(arr, q+1, ei);

    }
    public static int partion(int arr[],int si,int ei){
        int piviot=arr[ei];
        int i=si-1  ;
        for(int j=si;j<ei;j++){
            if(piviot>=arr[j]){
                i++;
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }

        }
        i++;
            int temp =arr[i];
            arr[i]=piviot;
            arr[ei]=temp;
            return i;
    }
}
