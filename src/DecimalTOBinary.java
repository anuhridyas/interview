public class DecimalTOBinary {


    public static  String decimalToBinary(int decimal){
        StringBuilder sb =new StringBuilder();

        while(decimal>0){
            int dig = decimal %2;
            sb.append(dig);

            decimal/=2;

        }
        return sb.reverse().toString();
    }


    public static  int binaryToDecimal(String binary){

        int num =0;


        int reaminder = 2%3;

        int pow = 0;
        for(int i =binary.length()-1 ; i >=0 ; i--){
            int  k =binary.charAt(i)-'0';
            num  +=Math.pow(2,pow)*k;
            pow++;
        }
        return num;
    }


    public static  void main(String[] args){
        System.out.println(decimalToBinary(4));
        System.out.println(binaryToDecimal("100"));
    }
}
