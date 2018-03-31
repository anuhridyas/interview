import java.util.Stack;

public class ExpressionExpand {

        /**
         * @param s: an expression includes numbers, letters and brackets
         * @return: a string
         */
        public String expressionExpand(String s) {
            // write your code here

            Stack<Object> stack = new Stack<>();
            int number =0 ;

            for(int i = 0 ; i < s.length() ; i++){
                if(Character.isDigit(s.charAt(i))){
                    number =number *10 + s.charAt(i)-'0';
                }
                else if(s.charAt(i)=='['){
                    stack.push(Integer.valueOf(number));
                    number=0;
                }else if(s.charAt(i)==']') {
                    StringBuilder sb =new StringBuilder();
                    while(!stack.isEmpty() && stack.peek() instanceof Integer ==false ){
                        sb.append(stack.peek());
                    }

                    sb.reverse();

                    int currnumber = (int)stack.pop();
                    currnumber =currnumber-1;
                    while(currnumber>0){
                        sb.append(sb);
                        currnumber--;
                    }
                    String str = sb.toString();
                    System.out.println(str);
                    for( char c :str.toCharArray()){
                        stack.push(c);
                    }


                }

                else {
                    stack.push(s.charAt(i));
                }
            }

            StringBuilder sbr=new StringBuilder();

            while(stack.isEmpty()){
                sbr.append(stack.pop());
            }

            return  sbr.reverse().toString();
        }


        public static  void main(String[] args){
            ExpressionExpand expressionExpand =new ExpressionExpand();
            expressionExpand.expressionExpand("abc3[a]");
        }
}
