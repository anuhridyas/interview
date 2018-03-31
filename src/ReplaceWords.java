import java.util.Arrays;
import java.util.List;

public class ReplaceWords {

        TrieNode root =new TrieNode();

        public String replaceWords(List<String> dict, String sentence) {

            for(String w : dict ){
                insert(w);
            }

            String[] sent = sentence.split(" ");

            StringBuilder sb =new StringBuilder();

            for(String word :sent){

                TrieNode curr =root;

                for(char c:word.toCharArray()){
                    StringBuilder sbr=new StringBuilder();
                    if(curr.children[c-'a'] ==null ){
                        sb.append(word+" ");
                        break;
                    }

                    curr = curr.children[c-'a'];

                    if(curr.isWord==true){
                        sb.append(sbr);
                        sb.append(c);
                        sb.append(" ");
                        break;
                    }else {
                        sbr.append(c);
                    }

                }
            }

            return sb.toString();
        }


        public void insert(String word ){
            TrieNode curr =root;

            for(char c :word.toCharArray()){

                if(curr.children[c-'a'] ==null){
                    curr.children[c-'a']=new TrieNode();
                    curr.children[c-'a'].val =c ;
                }

                curr= curr.children[c-'a'];

            }

            curr.isWord= true;
            return ;
        }


        class TrieNode {
            char val ;
            TrieNode[] children ;
            boolean isWord ;

            TrieNode(){
                children =new TrieNode[26];
            }

        }

        public  static  void main(String[] args){
            ReplaceWords replaceWords =new ReplaceWords();
         List<String> lists= Arrays.asList("cat", "bat", "rat");
          String s =  "the cattle was rattled by the battery";
          replaceWords.replaceWords(lists,s);
        }

}
