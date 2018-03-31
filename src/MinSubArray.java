import java.util.ArrayList;
import java.util.List;

public class MinSubArray {
        /*
         * @param nums: a list of integers
         * @return: A integer indicate the sum of minimum subarray
         */
        public int minSubArray(List<Integer> nums) {
            // write your code here

            int minSum =Integer.MAX_VALUE;
            int currSum = 0;

            for(int i = 0 ; i < nums.size() ; i ++){

                currSum += nums.get(i);

                if(currSum < minSum){
                    minSum =currSum ;
                }

            }
            return minSum;
        }



        public  static  void main(String[] args){
            List<Integer> result =new ArrayList<>();

            result.add(1);
            result.add(-1);
            result.add(-2);
            result.add(1);

            MinSubArray minSubArray =new MinSubArray();
            minSubArray.minSubArray(result);



        }
}
