public class GCD {

        public int gcd(int A, int B) {
            int divisor =1;
            if(A<B){
                divisor =A/2;
            }

            for(int i =divisor; i >=1 ; i --){
                System.out.println(i);
                if( i % A ==0 && i % B ==0){

                    return i ;
                }
            }

            return 1;
        }

        public static  void main(String[] args){
            GCD gcd =new GCD();
            gcd.gcd(4,6);
        }
}
