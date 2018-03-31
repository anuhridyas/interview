public class DigitCount {

    public  static  int digitCounts(int k, int n) {
        int count = 0;
        char kChar = (char) (k + '0');
        System.out.println(kChar);
        for (int i = k; i <= n; i++) {
            char[] iChars = Integer.toString(i).toCharArray();
            for (char iChar : iChars) {
                if (kChar == iChar) count++;
            }
        }

        return count;
    }

    public static  void main(String[] args){
      digitCounts(9,20);
    }
}
