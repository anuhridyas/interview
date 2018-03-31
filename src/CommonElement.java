import java.util.HashMap;
import java.util.Map;

public class CommonElement {

        /**
         * @param Matrix: the input
         * @return: the element which appears every row
         */
        public int FindElements(int[][] matrix) {
            // write your code here


            Map<Integer ,Integer> map=new HashMap<>();


            for(int i =0 ; i < matrix[0].length ; i ++){
                map.put( matrix[0][i] , 0 );
            }


            int row =matrix.length -1;
            int rowLast =row-1;

            for(int i = 1 ; i < matrix.length ; i++)
            {
                for(int j =0 ; j < matrix[0].length ; j++)
                {
                    if(map.containsKey(matrix[i][j]))
                    {
                        int val= map.get(matrix[i][j]);
                        if(val != i )
                        {
                            if(val == rowLast)
                            {
                                return matrix[i][j];
                            }
                            map.put(matrix[i][j] , i);
                        }
                    }
                }
            }

            return -1;

        }


        public  static  void main(String[] args){
            int[][] array ={{1},{1},{1}};

            CommonElement commonElement =new CommonElement();
            commonElement.FindElements(array);
        }


}
