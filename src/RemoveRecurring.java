public class RemoveRecurring {


    public static String removeRecurring(String s){

      StringBuilder sb =new StringBuilder();

      if(s ==null || s.length() == 0){
          return s ;
      }

      int prev = 0;


      char[] charArray =s.toCharArray();

        for(int  i = 1 ; i < s.length() ; i ++){

            if(charArray[i] == charArray[prev]){

            }else {
                prev++;

                charArray[prev]=s.charAt(i);
            }

        }

      s =String.valueOf(charArray).substring(0,prev+1);


return s;
    }

    public static  void main(String[] args){

        removeRecurring("1299888833");

    }
}
