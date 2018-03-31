class Palindrome {
    public String longestPalindrome(String s) {

        if(s==null || s.length() <=2){
            return  s;
        }

        int start =0 ;
        int end =0 ;

        int length = s.length();

        boolean[][] isPalindrome= new boolean[length][length];

        for(int j =1 ; j < length ; j++){
            for( int i = 0 ; i < j ; i++){

                boolean isInnerPalindrome =  j-i <=2 || isPalindrome[i+1][j-1];

                if(s.charAt(i)== s.charAt(j)  && isInnerPalindrome){
                    isPalindrome[i][j]=true;

                    if(j-i> end- start){
                        start = i ;
                        end =j;
                    }
                }

            }
        }


        return s.substring(start,end+1);


    }


    public  static  void main (String[] args){
        Palindrome palindrome =new Palindrome();
        palindrome.longestPalindrome("babad");
    }
}