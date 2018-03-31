import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PathExists {

   static class Graph{
       static public int v;
      static  public  LinkedList<Integer> adj[];

        public Graph (int v ){
            this.v =v;
            adj=new LinkedList[v];
            for(int i =0 ; i < v ; i++ ){
                adj[i]=new LinkedList<>();
            }
        }

        public void addEdge(int v , int w ){
            adj[v].add(w);
        }
   }


   public static boolean pathExists( int source , int  destination , Graph g){
       boolean[] visited =new boolean[g.v];

       Queue<Integer> q=new LinkedList<>();

       if(source == destination){
           return true;
       }

       q.add(source);
       visited[source]=true;

       while(!q.isEmpty()){
           int  s= q.poll();

           Iterator it = g.adj[s].iterator();

           while(it.hasNext()){

               int i =(int) it.next();
               if (i==destination)
                   return true;

               if(!visited[i]){

                   visited[i]=true;
                   q.add(i);
               }

           }
       }



   return false ;}







    public  static  void  main(String[] ars){
       Graph g =new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(pathExists(1,3,g));


    }

}
