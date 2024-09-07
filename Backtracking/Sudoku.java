package Backtracking11;

public class Sudoku {
    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};

    }
    public static boolean sudokuSlover(int sudoku[][],int row,int col){
        if(row==9){

        }
        int nxtRow=row;
        int nxtCol=col+1;
        if(col+1==9){
            nxtCol=0;
            nxtRow=row+1;

        }
        if(sudoku[row][col]!=0){
            return sudokuSlover(sudoku, nxtRow, nxtCol);
        }
        for(int digit=1;digit<=9;digit++){
            // if(isSafe(sudoku,row,col,digit)){
            //     sudoku[row][col]=digit;
            // }
        }
        return true;
    }
}
