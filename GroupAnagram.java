import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static  List<List<String>> groupAnagrams(String[] strs) {

        int n=strs.length;
        List<List<String>> ans=new ArrayList<>();
        List<String> output=new ArrayList<>();

        HashMap<String, List<String>> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int[] freq=new int[26];

            StringBuilder keyBuilder=new StringBuilder();

            for(char ch: strs[i].toCharArray()){
                freq[ch-'a']++;
            }
            for(int count:freq){
                keyBuilder.append('#').append(count);
            }

            if(!map.containsKey(keyBuilder.toString())){
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(keyBuilder.toString(),list);
            }else{
                List<String> list=map.get(keyBuilder.toString());
                list.add(strs[i]);
                map.put(keyBuilder.toString(),list);
            }
        }

        for(String key: map.keySet()){
            ans.add(map.get(key));
        }

        return ans;


    }

    public static void main(String[] args){
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> output=groupAnagrams(strs);

    }
}
