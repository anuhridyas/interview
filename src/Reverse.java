public class Reverse {

    public void reverseStringWithVariable(String str){
       int start =0 ;
       int end =str.length()-1;
       char[] strArray =str.toCharArray();
       while(start<end){
          char temp =strArray[start];
          strArray[start]=strArray[end];
          strArray[end]=temp;
         start++;
         end--;
       }

       str=String.valueOf(strArray);
       System.out.println(str);

       return ;


    }

    public  static  void main(String[] args){
        Reverse reverse =new Reverse();
       reverse.reverseStringWithVariable("anuhridya");

    }
}
