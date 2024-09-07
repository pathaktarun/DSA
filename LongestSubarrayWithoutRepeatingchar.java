
import java.util.*;

public class LongestSubarrayWithoutRepeatingchar {

    public static int lengthOfLongestSubstring(String s) {

        int n=s.length();
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int ans=0;
        int i=0;

        for(int j=0;j<n;j++){

            Integer count=hashMap.get(s.charAt(j));

            if(count==null){
                hashMap.put(s.charAt(j),1);
                ans=Math.max(ans,j-i+1);
            }

            else
            {
                while(count!=0){
                    if(s.charAt(i)==s.charAt(j)){
                        count--;
                    }

                    hashMap.remove(s.charAt(i));
                    i++;

                }
            }

        }

        return ans;

    }

    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("pwwkew"));

    }

}
