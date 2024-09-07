package Array4;

public class BinarySearch {
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        int key=16;
        int low=0;
        int high=number.length-1;
        while(low<=high){
           // int mid=(low+high)/2;
           int mid=low+(high-low);
            if(number[mid]==key){
                System.out.println("Yeh! we found at index no."+mid);
                break;
            }
            else{
                if(number[mid]<key){
                    low=mid+1;

                }
                else{
                    high=mid-1;
                }
            }
        }
        
    }
}
