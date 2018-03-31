import java.util.Stack;

public class BinaryTreeFromString {


    /**
     * Definition of TreeNode:
     * public class TreeNode {
     *     public int val;
     *     public TreeNode left, right;
     *     public TreeNode(int val) {
     *         this.val = val;
     *         this.left = this.right = null;
     *     }
     * }
     */

    class TreeNode {
  public int val;
 public TreeNode left, right;
 public TreeNode(int val) {
  this.val = val;
        this.left = this.right = null;
     }
  }


        /**
         * @param s: a string
         * @return: a root of this tree
         */
        public TreeNode str2tree(String s) {
            // write your code here


            if(s==null || s.isEmpty()){
                return null;
            }

            int number =findRoot(s);


            String numberStr= String.valueOf(number);


            int start =numberStr.length();



            int end = findMatchingParanathesisPosition(s.substring(start));


            System.out.println(s.substring(start+1, end+start+1 ));
            System.out.println(s.substring( end+start ));



            TreeNode root = new TreeNode(number);



            root .left = str2tree(s.substring(start, end+start ));

            root.right = str2tree(s.substring(end+start));


            return root ;
        }


        private int findRoot(String s ){

            int number =0 ;
            boolean sign =false;
            for(int  i =0 ; i < s.length() ; i++){
                if(Character.isDigit(s.charAt(i))){
                    number =number *10 + s.charAt(i) -'0';
                }
                else if(s.charAt(i)=='-' && i ==0){
                    sign =true;

                }
                else {
                    break;
                }
            }
            if(sign){

                return number *-1;
            }
            return number ;
        }


        private  int findMatchingParanathesisPosition(String str ){

            Stack <Character> stack =new Stack<>();

            for(int i =0 ; i <str.length() ;i++){

                if(i!=0 && stack.isEmpty()){
                    return i ;
                }
                if(str.charAt(i)=='('){
                    stack.push('(');
                }
                else if(str.charAt(i)==')'){
                    stack.pop();
                }

            }


            return -1;

        }

    public TreeNode str2treeNew(String s) {
        if (s.isEmpty()) return null;
        int found = s.indexOf( '(' );
        int val = (found == -1) ? Integer.parseInt(s) : Integer.parseInt(s.substring( 0 , found));
        TreeNode cur = new TreeNode(val);
        if (found == -1) return cur;
        int start = found, cnt = 0 ;
        for ( int i = start; i < s.length(); ++ i ) {
            if (s.charAt(i) == '(' ) ++ cnt;
            else  if (s.charAt(i) == ')' ) -- cnt;
            if (cnt == 0 && start == found) {
                cur.left = str2treeNew(s.substring(start + 1, i));
                start = i + 1 ;
            } else  if (cnt == 0 ) {
                cur.right = str2treeNew(s.substring(start + 1 , i ));
            }
        }
        return cur;
    }

        public  static  void  main(String[] args){
            BinaryTreeFromString binaryTreeFromString =new BinaryTreeFromString();
            binaryTreeFromString.str2treeNew("-4(2(3)(1))(6(5)(7))");
        }


}
