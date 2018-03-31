import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

public class ValidSquare {

    public static boolean  validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {


        Map<BigDecimal,Integer> map =new HashMap<>();

        BigDecimal dist1 = distance(p1,p2);
        map.put(dist1,map.getOrDefault(map.get(dist1),0)+1);

        BigDecimal dist2 = distance(p2,p3);
        map.put(dist2,map.getOrDefault(map.get(dist2),0)+1);

        BigDecimal dist3 =distance(p3,p4);
        map.put(dist3,map.getOrDefault(map.get(dist3),0)+1);

        BigDecimal dist4 =distance(p4 ,p1);
        map.put(dist4,map.getOrDefault(map.get(dist4),0)+1);

        BigDecimal dist5 = distance(p1,p3);
        map.put(dist5,map.getOrDefault(map.get(dist5),0)+1);

        BigDecimal dist6 =distance(p2,p4);
        map.put(dist6,map.getOrDefault(map.get(dist6),0)+1);





//        System.out.println(dist1);
        //      System.out.println(dist2);
        //    System.out.println(dist3);
        //  System.out.println(dist4);
        //System.out.println(dist5);
        //System.out.println(dist6);




        for(BigDecimal d :map.keySet()){
            int value =map.get(d);
            System.out.println(d);

            System.out.println(value);
            if(value !=2 || value!= 4){
                return false;
            }
        }


        return true;

    }

    private static BigDecimal distance (int [] p1 , int [] p2){
        double b =Math.sqrt(Math.pow(p2[0]-p1[0],2)+Math.pow(p2[1]-p1[1],2));
        return new BigDecimal(b, MathContext.DECIMAL64);
    }


    public  static  void main(String[] args){

       int[] p1 = {0,0};
        int[] p2 = {1,1};
        int[] p3 = {1,0};
        int[] p4 = {0,1};

        validSquare(p1,p2,p3,p4);


    }
}
