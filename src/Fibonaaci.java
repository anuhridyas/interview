import java.util.HashMap;
import java.util.Map;

public class Fibonaaci {

    private Map<Integer,Integer> map =new HashMap<>();


    public int fibonacci(int n) {
        // write your code here


        if(map.containsKey(n)){
            return map.get(n);
        }


        map.put(n ,fibonacci(n-1)+fibonacci(n-2));

        return map.get(n);


    }


    private void  fillMap(Map<Integer,Integer> map){

    }

}
