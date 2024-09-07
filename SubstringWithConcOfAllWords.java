import java.util.*;

public class SubstringWithConcOfAllWords {
    public static  List<Integer> findSubstring(String s, String[] words) {


        int n=words.length;
        int m=words[0].length();
        int conStringSize=n*m;
        HashMap<String ,Integer> freqMap=new HashMap<>();

        for(String word: words){
            freqMap.put(word,freqMap.getOrDefault(word,0)+1);
        }

        List<Integer> output=new ArrayList<>();

        for(int i=0;i<=s.length()-conStringSize;i++){
            int j=0;
            HashMap<String ,Integer> currMap=new HashMap<>();

            while(j<n){
                String word=s.substring(i+j*m,i+(j+1)*m);
                if(freqMap.containsKey(word)){
                    currMap.put(word,currMap.getOrDefault(word,0)+1);

                    if(currMap.get(word)>freqMap.get(word)){
                        break;
                    }
                    j++;
                } else{
                    break;
                }



            } if(j==n){
                output.add(i);
            }


        }
        return output;
    }

    public static void main(String[] args){
        String s= s = "barfoofoobarthefoobarman";
        String[] words = {"foo","bar","the"};
        findSubstring(s,words);
    }

}
