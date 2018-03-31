import java.util.Stack;

public class MAXDepth {



    public  int maxDepthForString(String s ){

        Stack<Character>  stack =new Stack<>();
        int length =0;
        int maxLength =0;
        for(int i = 0 ; i < s.length() ; i ++){
            if(s.charAt(i)=='('){
               stack.push('(');
               length =stack.size();

               maxLength=Math.max(length , maxLength);
            }else if(s.charAt(i)==')'){
               if(stack.isEmpty() || stack.peek() !='('){
                   return -1 ;
               }
               stack.pop();
             }
        }


    return maxLength;}

    public static void main(String[] args){
        MAXDepth maxDepth =new MAXDepth();

        System.out.println(maxDepth.maxDepthForString("(p((q))((s)t))"));
        System.out.println(maxDepth.maxDepthForString( "( ((X)) (((Y))) )"));

    }
}
