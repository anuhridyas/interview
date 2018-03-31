import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumThrreeSmaller {
    public static int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result =new ArrayList<List<Integer>>();
        for(int i =0 ; i < nums.length -2 ; i ++){
            if(i >0 && nums[i]==nums[i-1])
                continue;
            int start =i+1;
            int end =nums.length -1;
            while(start < end){
                if(nums[i]+ nums[start]+ nums[end]>target ){
                    end --;
                }else if(nums[i]+ nums[start]+ nums[end]<target ){
                    List<Integer> temp =new ArrayList<>();
                    temp.add(i);
                    temp.add(start);
                    temp.add(end);
                    result.add(temp);
                    while(start<end   && nums[start]== nums[start+1]) start++;
                    while(start<end   && nums[start]== nums[end-1]) end--;
                    start++;
                }else {
                    start++;
                }
            }
        }

        return result.size();
    }


    public  static  void  main(String[] args){
        int [] arr={3,1,0,-2};
        threeSumSmaller(arr, 4);

    }
}
