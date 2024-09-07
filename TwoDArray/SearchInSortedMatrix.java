package TwoDArray5;

public class SearchInSortedMatrix {
public static void main(String[] args) {
    int matrix[][]={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
    int i=0;
    int j=matrix[0].length-1;
    int key=399;
    int f=0;
    while(i<matrix.length && j>=0){
        if(matrix[i][j]==key){
            f=1;
            break;
        }
        else{
            if(matrix[i][j]<key){
                i++;
            }else{
                j--; 
            }
        }
     

    }
    if( f==1){
        System.out.println("key is at index no. "+i+","+j);
    }
    else{
        System.out.println("key is not found");
    }
}
}
