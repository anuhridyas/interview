import java.util.ArrayList;
import java.util.List;

public class CommonElements {

    public static List<Integer> commonElements(int [] arr1 , int[] arr2 , int[] arr3){
        List<Integer>  result =new ArrayList<>();

        int i =0 ;
        int j =0 ;
        int k =0;
        while(i < arr1.length && j< arr2.length && k <arr3.length){

            if(arr1[i]== arr2[j] &&  arr2[j]== arr3[k]  && arr1[i]== arr3[k] ){
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            else {
                int min =Math.min(arr1[i],Math.min(arr2[j],arr3[k]));
                if(min ==arr1[i]){
                    i++;
                }
                if(min==arr2[j]){
                    j++;
                }

                if(min==arr3[k]){
                    k++;
                }


            }




        }





        return result ;

    }

    public  static  void main(String[] args ){
        int [] arr1 ={1, 5, 10, 20, 40, 80};
        int[]  arr2={6, 7, 20, 80, 100};
        int[]  arr3={3, 4, 15, 20, 30, 70, 80, 120};


       int  ar1[] = {1, 5, 5};
        int ar2[] = {3, 4, 5, 5, 10};
        int ar3[] = {5, 5, 10, 20};

        commonElements(arr1,arr2 ,arr3);
        commonElements(ar1,ar2 ,ar3);
    }


}
