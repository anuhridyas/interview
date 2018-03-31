import java.util.*;

public class ConnectingGraph3 {

    Map<Integer ,List<Integer>> map;


    int nodes ;


    public ConnectingGraph3(int n) {
        map= new HashMap<>();

        nodes =n ;


        for(int i =1 ; i <=n ; i ++){
            List<Integer> temp =new ArrayList<>();
            map.put(i , temp);
        }

    }


    public void connect(int a, int b) {

        map.get(a).add(b);
    }

    public int query() {

        int count =0 ;

        Set<Integer> visited =new HashSet<>();

        for(int i = 1 ; i <= nodes ; i++){

            if(!visited.contains(i)){
                dfs( i ,visited);
                count++;
            }


        }

        return count ;


    }



    public void dfs(int i,Set<Integer> visited ){

        if(!visited.contains(i)){
            visited.add(i);

            for(int k : map.get(i)){
                if(!visited.contains(k)){
                    dfs(k , visited );
                }
            }
        }
    }



    public  static  void main(String[] args){
        ConnectingGraph3 connectingGraph3 =new ConnectingGraph3(6);

        connectingGraph3. query();
        connectingGraph3.query();
        connectingGraph3.query();
        connectingGraph3.connect(5, 6);
        connectingGraph3.query();
        connectingGraph3. connect(1, 4);
        connectingGraph3.query();
        connectingGraph3.connect(4, 6);
        connectingGraph3.query();
        connectingGraph3.query();
        connectingGraph3.query();
        connectingGraph3.query();
    }

}