import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {

        String[] words=s.split(" ");
        if(words.length!=pattern.length()){
            return false;
        }

        HashMap<String,Character> mapping=new HashMap<>();
        int[] arr=new int[26];

        for(int i=0;i<pattern.length();i++){

            String str=words[i];
            Character ch=pattern.charAt(i);
            if(mapping.containsKey(str)){
                if(!mapping.get(str).equals(pattern.charAt(i))){
                    return false;
                }
                arr[ch-'a']=1;

            }else
            {
                if(arr[ch-'a']==1){
                    return false;
                }
                arr[ch-'a']=1;
                mapping.put(str,pattern.charAt(i));
            }

        }

        return true;


    }

    public static void main(String[] args){

        String pattern="abba";
        String s= "dog cat cat fish";
        wordPattern(pattern,s);
    }
}
