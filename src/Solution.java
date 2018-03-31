class Solution {
    public  static  int  constructMaximumBinaryTree(int[] nums) {

        if(nums ==null || nums.length ==0){
            return -1;
        }

        return   findMax(nums,  0 , nums.length-1);

    }


    private static  int findMax( int[] nums , int low , int high){
        if(low> high || low <0 || high >= nums.length ){
            return -1;
        }
        int max = 0;
        for(int i =low ; i < high ; i++){
            if(nums[max] < nums[i+1]){
                max=i+1;
            }
        }

        return max;
    }


    public  static  void  main (String[] args){
        int[] nums={3,2,1,6,0,5};
        findMax(nums, 0, nums.length-1);

    }


}