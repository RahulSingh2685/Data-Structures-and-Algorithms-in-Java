package Graph22;
import java.util.*;
public class AllPathFromSrcToDest {
    public static void main(String[] args) {
        int V=7; 
        ArrayList<Edge> graph[] =new  ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 3, 1));

        
        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 1));
        
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4,    1, 1));

        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));


        graph[6].add(new Edge(6, 5, 1));
        printAllPath(graph, 5, 1, "");
         


    }
    public static  class Edge{
        int src;
        int dest;
        int wt;

         Edge(int s,int d, int w) {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
        
    }
   public static void printAllPath(ArrayList<Edge> graph[],int src,int dest,String path){
    if(src==dest){
        System.err.println(path +dest);
        return;
    }
    for(int i=0;i<graph[src].size();i++){
        Edge e=graph[src].get(i);
        printAllPath(graph, e.dest, dest, path+src);
    }
   }
  
}
