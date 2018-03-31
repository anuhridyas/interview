import java.util.HashMap;
import java.util.Map;

public class PHONE {


        /**
         * @param a: The a tuple
         * @param b: The b tuple
         * @param c: the c tuple
         * @param d: the d tuple
         * @return: The answer
         */
        public int[] withinThreeJumps(int[] a, int[] b, int[] c, int[] d) {
            // Write your code here

            Map<Integer ,Integer> map =new HashMap<>();

            int i =0 ;

            while(i< a.length){
                map.put(a[i], b[i]);
                i++;
            }


            int[] result = new int[d.length];


            for(int k =0 ; k < d.length ; k++){
                int jumps=0;
                int source = c[k];
                int destination =d[k];
                boolean flag =false ;

                while(jumps<=3){

                    if(map.containsKey(source)){


                        int value =map.get(source);
                        System.out.println(value);

                        jumps++;

                        source= value;

                        if(value == destination){
                            flag =true;
                            break;
                        }
                    }



                }

                if(flag){
                    result[k]=1;
                }

            }

            return result;


        }


        public  static  void main(String[] args){
            PHONE phone =new PHONE();
            int[] A = {1,2,3,4}, b = {2,3,4,5}, c = {1,1}, d = {4,5};
            phone.withinThreeJumps(A,b,c,d);
        }

}
