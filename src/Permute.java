import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Permute {
    /*
     * @param :  A list of integers
     * @return: A list of unique permutations
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        // write your code here
        Map<Integer , Integer > map =new TreeMap<>();

        for(int i =0 ; i <nums.length ;i++){
            map.put( nums[i], map.getOrDefault(nums[i],0)+1);
        }


        int[] number =new int[map.size()];
        int[] count =new int[map.size()];

        int k =0 ;
        for(Integer i :map.keySet()){
            number[k]=i;
            k++;
        }

        k =0 ;

        for(Integer i :map.values()){
            count[k]=i;
            k++;
        }


        int[] result =new int[nums.length];

        List<List<Integer>>  resultList =new ArrayList<>();


        findPermuate( number , count,0,result ,resultList);


        return resultList;
    }


    public void findPermuate( int[]  number , int[] count  , int currPost , int[] result ,   List<List<Integer>> resultList){
        if(currPost == number.length){

            List<Integer> temp =new ArrayList<>();

            for(int i =0 ; i < result.length ; i++){
                temp.add(result[i]);
            }

            resultList.add(temp);

            return;
        }

        for(int i = 0 ; i < number.length ; i++){
            if(count[i]==0){
                continue;
            }

            result[currPost]= number[i];
            count[i]--;
            findPermuate(number , count , currPost+1 , result , resultList);
            count[i]++;


        }
   }



  public  static  void  main(String[] args){
        Permute permute =new Permute();
        int[] nums ={1,2,2};
        permute.permuteUnique(nums);
  }



};