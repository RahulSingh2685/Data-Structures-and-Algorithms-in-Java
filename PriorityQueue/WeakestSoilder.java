package PriorityQueue19;
import java.util.*;
public class WeakestSoilder {
    public static void main(String[] args) {
        int army[][]={{1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}

        };
        int k=2;
        PriorityQueue<Row> p=new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int c=0;
            for(int j=0;j<army[0].length;j++)
            {
                c+=army[i][j] == 1 ?1:0;

            }
            p.add(new Row(c, i));
        }

        for(int i=0;i<k;i++){
            System.err.println(p.remove().idx+" ");
        }

        
    }
    static class Row implements Comparable<Row>{
        int solider;
        int idx;

        public Row(int solider,int idx){
            this.solider=solider;
            this.idx=idx;

        }
        public int compareTo(Row r2){
            if(this.solider==r2.solider){
                return this.idx-r2.idx;
            }
            return this.solider-r2.solider;
        }
    }
}
