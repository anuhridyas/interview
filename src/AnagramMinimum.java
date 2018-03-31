import java.util.HashMap;
import java.util.Map;

public class AnagramMinimum {

    public  static int minimumNumberAnagram(String str1,String str2){
        Map<Character ,Integer> str1Map =new HashMap<>();
        Map<Character,Integer> str2Map =new HashMap<>();


        for(char c :str1.toCharArray()){
            str1Map.put(c,str1Map.getOrDefault(c,0)+1);
        }

        for(char c :str2.toCharArray()){
            str2Map.put(c,str2Map.getOrDefault(c,0)+1);
        }


        int count =0;
        int length1 = str1.length();
        int length2=str2.length();
        if(length1> length2){
            for(char  c:str1Map.keySet()){
                if(str2Map.containsKey(c)){
                    int val=str2Map.get(c);
                    int val2 =str1Map.get(c);
                    while(val != val2){
                        count++;
                        str1Map.put(c,val2-1);
                        val2=val2-1;
                    }
                }else {
                    count++;
                }
            }
        }


        if(length2> length1){
            for(char  c:str2Map.keySet()){
                if(str2Map.containsKey(c)){
                    int val=str1Map.get(c);
                    int val2 =str2Map.get(c);
                    while(val != val2){
                        count++;
                        str2Map.put(c,val2-1);
                    }
                }else {
                    count++;
                }
            }
        }



    return  count ;}

    public static void main (String[] args){
          System.out.println(minimumNumberAnagram("bcadeh","hea"));
          System.out.println(minimumNumberAnagram("cddgk","gcd"));
        System.out.println(minimumNumberAnagram("bca","abc"));
    }
}
