public class Missing {


    public static  int findMissingNumber(int[] arr){

       int start= 0 ;
       int last = arr.length-1;

       while(start<last){
           int mid =arr[start]+ arr[last];

           if(mid+1==arr[mid]){
               start=mid+1;
           }else{
               last=mid-1;
           }
       }
       return start;
    }

    public  static  void main(String[] args){

        int [] arr ={1,2,3,4,6,7,8};

        System.out.println(findMissingNumber(arr));

    }
}
