class LongestWord {

    TrieNode root ;

    String[] maxStr=new String[1];


    public LongestWord (){
        root =new TrieNode();
    }


    public String longestWord(String[] words) {

        for(String word: words){
            insertWord(word);
        }


        findLongestWord(root);

        return maxStr[0];


    }


    public String findLongestWord(TrieNode root){

        for(int i =0 ; i < 26 ; i ++){
            if(root.children[i] !=null && root.children[i].isWord){
                String temp = root.children[i].val+ findLongestWord(root.children[i]);

                System.out.println(temp);
                if(temp.length() > maxStr[0].length() || (temp.length () == maxStr[0].length() && temp.compareTo (maxStr[0]) < 0) ){
                    maxStr[0] = temp;
                }
            }
        }
        return maxStr[0];
    }



    public void insertWord(String str){
        TrieNode curr = root;

        for(char c : str.toCharArray()){

            if(curr.children[c-'a']==null ){
                curr.children[c-'a']=new TrieNode();
                curr.children[c-'a'].val =c;
            }

            curr =curr.children[c-'a'];

        }

        curr.isWord =true;

        return ;

    }


    class TrieNode {
        boolean isWord ;
        TrieNode[] children ;
        char val ;


        public TrieNode(){
            children =new TrieNode[26];
        }
    }


    public  static  void main(String[] args){

        LongestWord longestWord=new LongestWord();
        String [] words = {"w","wo","wor","worl","world"};
        longestWord.longestWord(words);
    }
}