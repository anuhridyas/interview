public class RowMATRIX {


        /**
         * @param nums: the sorted matrix
         * @return: the number of Negative Number
         */
        public  static int countNumber(int[][] nums) {
            // Write your code here\

            int row = nums.length;
            int col = nums[0].length ;

            int i =0 ;
            int j = col -1;

            int count =0;

            while ( i< row  && j >=0){

                if(nums[i][j] >=0){
                    j--;
                    continue;
                }

                if(nums[i][j]<0){
                    count=count+j+1;
                    i++;
                }

            }

            return count;
        }


        public  static  void  main(String[] ars){

            int [][] nums ={{-5,-3,-1,0,1},{-2,-1,0,0,1},{0,11,12,12,14}};
           countNumber(nums);
        }

}
