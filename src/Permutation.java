import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Permutation {

    public long permutationIndex(int[] A) {
        // write your code here


        List<Integer> comp =new ArrayList<>();

        for(int i =0 ; i<A.length ; i++){
            comp.add(A[i]);
        }


        Arrays.sort(A);

        int start =0 ;
        int end = A.length-1;


        List<List<Integer>> result =new ArrayList<>();





        permute(A, start , end , result);


        for(int i =0 ; i < result.size(); i++){
            if(result.get(i).equals(comp)){
                return i+1;
            }
        }

        return -1;

    }

    public void permute(int[] A, int start , int end ,   List<List<Integer>> result ){
        if(start > end){
            List<Integer> temp =new ArrayList<>();
            for(int i =0 ; i < A.length ; i++){
                temp.add(A[i]);
            }

            result.add(temp);
            return;
        }

        for(int i = start ;i <= end ; i++){
            swap(A, i , start);
            permute(A,start+1,end , result);
            swap(A, i , start);
        }

    }


    private void swap(int[] A , int start , int end){
        int temp = A[end];
        A[end]= A[start];
        A[start]=temp;
    }

    public  static  void  main(String[] args){
        Permutation permutation =new Permutation();
        int[] a= {1,2,3};
        permutation.permutationIndex(a);
    }

}
