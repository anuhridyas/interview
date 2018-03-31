public class Sort{
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers(int[] A) {
        // write your code here

        for(int i =0 ; i < A.length-1 ; i++){
            int min = i ;
            for(int j =i+1 ; j < A.length  ; j++){
                if(A[min] >A[j]){
                    min = j ;
                }
            }


            if(min != i){
                swap(A, i , min);
            }
        }
    }


    private void swap(int[] A , int i , int j ){

        int temp = A[j];
        A[j]=A[i];
        A[i]=temp;
        return ;

    }


    public  static  void main(String[] args){
        Sort sort=new Sort();
        int[] a ={ 3,2,1};
        sort.sortIntegers(a);
    }
}