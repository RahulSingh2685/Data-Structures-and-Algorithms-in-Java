package Graph22;
import java.util.*;
public class dijkstraAlgo {
    public static void main(String[] args) {
        int V=7; 
        ArrayList<Edge> graph[] =new  ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
 
        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));
        
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4,    5, 5));

        dijkstra(graph, 0);


 
         


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
    static  class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n,int path){
            this.n=n;
            this.path=path;
        }
        public int compareTo(Pair p2){
            return this.path-p2.path;
        }
    }
   public static void dijkstra(ArrayList<Edge> graph[],int src){
    int dist[]=new int[graph.length];

    for(int i=0;i<graph.length;i++){
        if(i!=src){
            dist[i]=Integer.MAX_VALUE;
        }
    }
    boolean vis[]=new boolean[graph.length];
    PriorityQueue<Pair> p=new PriorityQueue<>();

    p.add(new Pair(src,0));

    while(!p.isEmpty()){
        Pair curr=p.remove();
        if(!vis[curr.n]){
            vis[curr.n]=true;
            for(int i=0;i<graph[curr.n].size();i++){
                Edge e=graph[curr.n].get(i);
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;

                if(dist[u]+wt<dist[v]){
                    dist[v]=dist[u]+wt;
                    p.add(new Pair(v, dist[v]));
                }

            }
        }

    }
    for(int i=0;i<dist.length;i++){
        System.err.println(dist[i]+" ");
    }


   }
  
}
